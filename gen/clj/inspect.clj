(ns inspect
  (:require [model :refer [java-class-info]]
            [util :refer [conjv
                          constant-keyword
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
                            :full-name "package.name.MyEnum"
                            :class package.name.MyEnum
                            :fn-name 'my-enum
                            :values {'SOME_ENUM :some-enum
                                     'NO_ENUM :no-enum}}]
                   :builders [{:package-name "package.name"
                               :class-name "MyBuilder$Builder"
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

(def packages
  "A map of package names that contains all the enums and builder configurations within them."
  (atom {}))


(def enums
  "Collection of enums that have been encountered."
  (atom {}))


(defn clear!
  "Clears all of the data from the caches."
  []
  (reset! packages {})
  (reset! enums {}))


(defn ignore?
  "Checks if a class has been configured to be ignored."
  [data {:keys [ignored]}]
  (let [package-name (:package-name data)
        class-name (:class-name data)
        package (get ignored package-name)]
    (if package
      (contains? package class-name)
      false)))


(defn init-package
  "Initializes a package-data with it's package name, the source namespace, and test namespace.."
  [package-name {:keys [base-package base-package-namespace]} data-type data]
  (if (= base-package package-name)
    {:package-name package-name
     :source-namespace base-package-namespace
     :test-namespace (str base-package-namespace "-test")
     data-type [data]}
    (let [package-diff (subs package-name (count base-package))
          namespace-diff (package>namespace (subs package-diff 1))]
      {:package-name package-name
       :source-namespace (str base-package-namespace "." namespace-diff)
       :test-namespace (str base-package-namespace "." namespace-diff "-test")
       data-type [data]})))


(defn register-enum
  "Registers an enum by it's full class name."
  [{:keys [package-name fn-name full-name]}]
  (let [source-namespace (-> (get @packages package-name) :source-namespace)]
    (swap! enums assoc full-name [source-namespace fn-name])))


(defn register
  "Adds a class config to the repo."
  [{:keys [package-name] :as data} data-type config]
  (cond
    ; Ignore this class
    (ignore? data config)
    (println "Ignoring" (:package-name data) (:class-name data))
    ; Add to existing package
    (contains? @packages package-name)
    (do
      (swap! packages update-in [package-name data-type] conjv data)
      (when (= data-type :enums)
        (register-enum data)))
    ; Initialize package
    :else
    (let [package-data (init-package package-name config data-type data)]
      (swap! packages assoc package-name package-data)
      (when (= data-type :enums)
        (register-enum data)))))


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


(defn add-enum
  "Adds an Enum to the registry"
  [^Class enum-class config]
  (-> (java-class-info enum-class)
      (assoc :values (enum-values enum-class))
      (register :enums config)))

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


(defn builder-methods
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
                                                                :method-key (camel->kebab-case field-name)
                                                                :method-enum (get @enums (str param))}))))
                             {}
                             methods)
                     vals
                     (sort-by :method)
                     vec)]
    (-> builder-data
        (assoc :inits inits)
        (assoc :methods methods))))


(defn add-builder
  [^Class builder-class config]
  (-> (java-class-info builder-class)
      (builder-methods config)
      (register :builders config)))
