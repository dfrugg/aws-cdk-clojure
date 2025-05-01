(ns inspect
  "Responsible for inspecting found Java classes to analyze and save in context."
  (:require [model :refer [java-class-info]]
            [util :refer [constant-keyword
                          camel->kebab-case
                          package>namespace]]
            [clojure.reflect :as ref]))

(comment
  ;The packages atom should be a map that has the following shape
  {"package.name" {:package-name "package.name"
                   :source-namespace "package.name"
                   :test-namespace "package.name-test"
                   :enums [{:package-name "package.name"
                            :class-name "MyEnum"
                            :class-symbol 'package.name.MyEnum
                            :full-name "package.name.MyEnum"
                            :class package.name.MyEnum
                            :fn-name 'my-enum
                            :values {'SOME_ENUM :some-enum
                                     'NO_ENUM :no-enum}}]
                   :builders [{:package-name "package.name"
                               :class-name "MyBuilder$Builder"
                               :class-symbol 'package.name.MyBuilder$Builder
                               :full-name "package.name.MyBuilder$Builder"
                               :class package.name.MyBuilder$Builder
                               :fn-name 'my-builder
                               :inits [{:init-type :create
                                        :init-args ["String" "paramter.Types"]
                                        :init-name-args [["id" "String"]
                                                         ["types" "parameter.Types"]]
                                        :builder-name-args [["types" "parameter.Types"]]}]
                               :methods [{:method 'methodSymbol
                                          :method-arg my.method.symbol.Type
                                          :method-key :method-symbol}]}]}})


; Begin Enum Specific Processing

(defn enum-values
  "Extracts a map of Enum values and there key value."
  [^Enum enum]
  (->> (ref/reflect enum)
       :members
       (filterv (comp :public :flags))
       (filterv (comp :enum :flags))
       (mapv :name)
       (mapv (juxt identity constant-keyword))
       (into {})))


; Begin Builder Specific Processing
(def create-method
  "The form that matches the value of the create method when reflected."
  (symbol "create"))


(def build-method
  "The form that matches the value of the build method when reflected."
  (symbol "build"))


(def ignored-builder-methods
  "Set of builder name symbols to ignore when defining builders"
  #{create-method build-method})


(defn public-methods
  "Extracts all the public constructors and methods from a class or class symbol."
  [^Class target-class]
  (->> target-class
       ref/reflect
       :members
       (filterv (comp :public :flags))
       (filter :parameter-types)))


(defn decorate-inits
  [{:keys [package-name class-name]} {:keys [inits]} methods]
  (if-let [hints (and (seq methods) (get-in inits [package-name class-name]))]
    (reduce (fn [v m]
              (let [hint (get hints (:parameter-types m))]
                (cond
                  (nil? hint) (conj v m)
                  (:discard? hint) v
                  :else (conj v (assoc m :hint hint)))))
            []
            methods)
    methods))


(defn determine-inits
  [builder-data config methods]
  (let [creates (->> methods
                     (filterv #(= create-method (:name %)))
                     (filterv (comp :static :flags))
                     (mapv #(assoc % :init-type :create))
                     (decorate-inits builder-data config))]
    (if (seq creates)
      creates
      (->> methods
           (filter #(= (:declaring-class %) (:name %)))
           (mapv #(assoc % :init-type :construct))))))



;; Start New Stuff

(defn describe-package
  "Initializes a package-data with it's package name, the source namespace, and test namespace.."
  [package-name {:keys [base-package base-package-namespace]}]
  (if (= base-package package-name)
    {:package-name package-name
     :source-namespace base-package-namespace
     :test-namespace (str base-package-namespace "-test")
     :enums []
     :builders []}
    (let [package-diff (subs package-name (count base-package))
          namespace-diff (package>namespace (subs package-diff 1))]
      {:package-name package-name
       :source-namespace (str base-package-namespace "." namespace-diff)
       :test-namespace (str base-package-namespace "." namespace-diff "-test")
       :enums []
       :builders []})))


(defn add-package-descriptions
  "Adds a java class description to it's package description."
  [classpath-info {:keys [package-name] :as java-info} data-type config]
  (let [package-info (or (get-in classpath-info [:packages package-name])
                         (describe-package package-name config))
        java-info (assoc java-info :namespace (:source-namespace package-info))]
    (-> classpath-info
        (assoc-in [data-type (:class-symbol java-info)] java-info)
        (assoc-in [:packages package-name] package-info)
        (update-in [:packages package-name data-type] conj java-info))))


(defn describe-enum
  "Create the attribute definition for enums"
  [^Class klass]
  (-> (java-class-info klass)
      (assoc :values (enum-values klass))))


(defn describe-enums
  "Converts a set of Enum classes into a map of the classes with their description."
  [enums-set]
  (->> enums-set
       (mapv #(vector (.getName ^Class %) (describe-enum %)))
       (into {})))


(defn add-enum-descriptions
  "Updates the classpath info enums to a map of it's descriptions."
  [classpath-info config]
  (reduce (fn [info enum]
            (add-package-descriptions info (describe-enum enum) :enums config))
          (update classpath-info :enums describe-enums)
          (:enums classpath-info)))


(defn describe-methods
  "Describes the constructors and methods on the builder class"
  [{^Class builder-class :class :as builder-data} config]
  (let [methods (public-methods builder-class)
        inits (determine-inits builder-data config methods)
        methods (->> (reduce (fn [field-map {field-name :name :as field}]
                               (if (or (get field-map field-name)
                                       (ignored-builder-methods field-name)
                                       (not= 1 (count (:parameter-types field))))
                                 field-map
                                 (let [param (first (:parameter-types field))]
                                   (assoc field-map field-name {:method field-name
                                                                :method-arg param
                                                                :method-key (camel->kebab-case field-name)}))))
                             {}
                             methods)
                     vals
                     (sort-by :method)
                     vec)]
    (-> builder-data
        (assoc :inits inits)
        (assoc :methods methods))))


(defn describe-builder
  "Generates the description of a builder."
  [^Class klass config]
  (-> (java-class-info klass)
      (describe-methods config)))


(defn add-builder-descriptions
  "Updates the builders to be mapped to their descriptions."
  [classpath-info config]
  (reduce (fn [info builder]
            (add-package-descriptions info (describe-builder builder config) :builders config))
          (assoc classpath-info :builders {})
          (:builders classpath-info)))


(defn describe-classpath
  "Looks at the classpath and updates the found items with their descriptions."
  [classpath-info config]
  (-> classpath-info
      (assoc :packages {})
      (add-enum-descriptions config)
      (add-builder-descriptions config)))
