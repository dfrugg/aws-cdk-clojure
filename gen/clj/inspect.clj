(ns inspect
  (:require [model :refer [construct-sym
                           string-sym
                           names]]
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
                               :init :create
                               :inits [{:init-type :no-arg
                                        :init-args ["String" "paramter.Types"]
                                        :init-name-args [["id" "String"]
                                                         ["types" "parameter.Types"]]
                                        :builder-name-args [["types" "parameter.Types"]]}]
                               :methods [{:method 'methodSymbol
                                          :method-arg my.method.symbol.Type
                                          :method-key :method-symbol}]}]}}
  )

(def packages
  "A map of package names that contains all the enums and builder configurations within them."
  (atom {}))


(def enums
  "Collection of enums that have been encountered."
  (atom {}))


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
  (-> (names enum-class)
      (assoc :values (enum-values enum-class))
      (register :enums config)))


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
  "Extracts all the public constructor and methods from a class or class symbol"
  [^Class target-class]
  (->> target-class
       ref/reflect
       :members
       (filterv (comp :public :flags))
       (filter :parameter-types)))


(defn no-arg?
  "Checks if "
  [{:keys [parameter-types] :as data}]
  (and data (empty? parameter-types)))


(defn stack-id?
  [{:keys [parameter-types]}]
  (and (= 2 (count parameter-types))
       (= construct-sym (first parameter-types))
       (= string-sym (second parameter-types))))


(defn two-arg?
  "Checks if the create is 2 args but not what we know."
  [{:keys [parameter-types]}]
  (= 2 (count parameter-types)))


(defn one-arg?
  "Checks if the create is 1 args but not what we know."
  [{:keys [parameter-types]}]
  (= 1 (count parameter-types)))


(defn classify-create
  [data]
  (cond
    (no-arg? data) {:init-type :no-arg}
    (stack-id? data) {:init-type :stack-id :init-args (:parameter-types data)}
    (some? data) {:init-type :other-arg :init-args (:parameter-types data)}))


(defn classify-construct
  [data]
  (cond
    (no-arg? data) {:init-type :no-arg :init-args (:parameter-types data)}
    (stack-id? data) {:init-type :stack-id :init-args (:parameter-types data)}
    (some? data) {:init-type :other-arg :init-args (:parameter-types data)}))


(defn classify-init-args
  "Inspects how a builder should be initialized and determine if extra args are needed."
  [inits {:keys [package-name class-name]} config]
  (let [init-args (get-in config [:inits package-name class-name])
        init-counts (if (vector? (first init-args))
                      (into {} (mapv (juxt count identity) init-args))
                      {(count init-args) init-args})]
    (if init-args
      (reduce (fn [inits {args :init-args :as init}]
                (let [names (get init-counts (count args))
                      param-names (when names (map vector names args))
                      builder-names (when names (remove (comp #{"stack" "id" "config"} first) param-names))]
                  (if names
                    (conj inits (assoc init :init-name-args param-names :builder-name-args builder-names))
                    (conj inits init))))
              []
              inits)
      inits)))


(defn classify-init
  "Determines what type of create to use."
  [methods builder-data config]
  ; TODO - Add arg mapping and multi create/constructs
  (let [creates (->> methods
                     (filter #(= create-method (:name %)))
                     (mapv classify-create))
        constructs (when-not (seq creates)
                     (->> methods
                          (filter #(= (:declaring-class %) (:name %)))
                          (mapv classify-construct)))]
    (cond
      (seq creates)    {:init :create :inits (classify-init-args creates builder-data config)}
      (seq constructs) {:init :construct :inits (classify-init-args constructs builder-data config)}
      :else            {:init :no-init})))


(defn builder-methods
  [{^Class builder-class :class :as builder-data} config]
  (let [base-fields (public-methods builder-class)
        init-classifier (classify-init base-fields builder-data config)
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
                             base-fields)
                     vals
                     (sort-by :method)
                     vec)]
    (-> builder-data
        (merge init-classifier)
        (assoc :methods methods))))


(defn add-builder
  [^Class builder-class config]
  (-> (names builder-class)
      (builder-methods config)
      (register :builders config)))
