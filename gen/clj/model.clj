(ns model
  "Provides functions that manage the data model"
  (:require [template :refer [builder-source-function
                              enum-source-function
                              enum-test-function
                              namespace-source-function
                              namespace-test-function]]
            [util :refer [camel->kebab-case
                          conjv]]))



(def construct-sym 'software.constructs.Construct)
(def string-sym 'java.lang.String)


(defn java-class-info
  "Gets the info on a java class that is needed, such as the different name forms used."
  [^Class target-class]
  (let [package-name (.getPackageName target-class)
        class-name (.getName target-class)
        simple-name (subs class-name (inc (count package-name)))]
    {:package-name package-name
     :class-name simple-name
     :full-name class-name
     :fn-name (camel->kebab-case simple-name)
     :class target-class}))


(def package-code
  "The core properties used to gather generated code"
  {:source-clojure-fns {"cdk.support" #{"lookup-entry"}}
   :source-java-classes {}
   :source-enums-code []
   :source-builders-code []
   :test-clojure-fns {"clojure.test" #{"deftest" "testing" "is"}}
   :test-java-classes {}
   :test-enums-code []
   :test-builders-code []})


(defn add-source-function
  "Adds a function to package state."
  [state namespace fn-name]
  (if (get-in state [:source-clojure-fns namespace])
    (update-in state [:source-clojure-fns namespace] conj fn-name)
    (assoc-in state [:source-clojure-fns namespace] #{fn-name})))


(defn add-source-java-class
  "Adds a Java class to packate state"
  [package-data package-name class-name]
  (if (get-in package-data [:source-java-classes package-name])
    (update-in package-data [:source-java-classes package-name] conj class-name)
    (assoc-in package-data [:source-java-classes package-name] #{class-name})))


(defn add-test-function
  "Adds a function to package state."
  [package-data namespace fn-name]
  (if (get-in package-data [:test-clojure-fns namespace])
    (update-in package-data [:test-clojure-fns namespace] conj fn-name)
    (assoc-in package-data [:test-clojure-fns namespace] #{fn-name})))


(defn add-test-java-class
  "Adds a Java class to packate state"
  [package-data package-name class-name]
  (if (get-in package-data [:test-java-classes package-name])
    (update-in package-data [:test-java-classes package-name] conj class-name)
    (assoc-in package-data [:test-java-classes package-name] #{class-name})))


(defn process-namespace
  "Generates the "
  [package-data]
  (let [package-data (reduce (fn [package-data enum]
                               (-> package-data
                                   (add-source-java-class (:package-name enum) (:class-name enum))
                                   (add-test-function (:source-namespace package-data) (:fn-name enum))
                                   (add-test-java-class (:package-name enum) (:class-name enum))))
                             package-data
                             (:enums package-data))]
    (-> package-data
        (assoc :source-namespace-code (namespace-source-function package-data))
        (assoc :test-namespace-code (namespace-test-function package-data)))))


(defn process-enum
  "Processes a single enum on a package."
  [package-data enum-data]
  (-> package-data
      (update :source-enums-code conjv (enum-source-function enum-data))
      (update :test-enums-code conjv (enum-test-function enum-data))))


(defn process-enums
  "Processes all of the enums on a package"
  [package-data]
  (reduce process-enum package-data (:enums package-data)))


(defn process-builder
  "Processes a single builder on a package."
  [package-data builder-data]
  (-> package-data
      (update :source-builders-code conjv (builder-source-function builder-data))))


(defn process-builders
  "Processes all of the builder definitions on a package."
  [package-data]
  (reduce process-builder package-data (:builders package-data)))
