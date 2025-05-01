(ns classpath
  (:require [clojure.string :refer [ends-with?]]
            [util :refer [class-symbol
                          deep-conj]])
  (:import [org.reflections Reflections]
           [org.reflections.scanners Scanner SubTypesScanner]
           [org.reflections.util ClasspathHelper ConfigurationBuilder FilterBuilder]))


(defn not-deprecated?
  "Checks if a class is tagged as deprected."
  [^Class klass]
  (nil? (.getAnnotation klass java.lang.Deprecated)))


(def deprecated?
  "Checks that a class is not tagged as deprecated."
  (complement not-deprecated?))


(defn find-enums
  "Finds all of the Enums "
  [config]
  (let [ref (Reflections. (:base-package config) nil)]
    (->> (.getSubTypesOf ref java.lang.Enum)
         (filterv not-deprecated?)
         (into #{}))))


(defn find-objects
  "Returns all of the objects found"
  ([config] (find-objects identity config))
  ([transducer-fn config]
   (let [base-package (:base-package config)
         scanners (into-array Scanner [(SubTypesScanner. false)])
         filb (-> (FilterBuilder.)
                  (.includePackage (into-array String [base-package])))
         cb (-> (ConfigurationBuilder.)
                (.setUrls (ClasspathHelper/forPackage base-package nil))
                (.setScanners scanners)
                (.filterInputsBy filb))
         ref (Reflections. cb)]
     (transducer-fn (.getSubTypesOf ref Object)))))


(defn unprocessed
  "Adds class to the :unprocessed set"
  [cache ^Class klass]
  (deep-conj cache :unprocessed klass))


(defn interface
  "Adds interfaces to the :interfaces set"
  [cache ^Class klass]
  (deep-conj cache :interfaces klass))


(defn builder
  [cache ^Class klass]
  (let [built (.getEnclosingClass klass)]
    (-> cache
        (deep-conj :builders klass)
        (assoc-in [:built (class-symbol built)] (class-symbol klass)))))


(defn builder?
  "Checks if a class matches the builder name pattern"
  [^Class klass]
  (ends-with? (.getName klass) "$Builder"))


(defn jsii-proxy?
  "Checks if a class matches the JSII Proxy name pattern."
  [^Class klass]
  (ends-with? (.getName klass) "Jsii$Proxy"))


(defn built?
  "Checks if this is a class or interface that is built by a builder."
  [^Class klass]
  (let [nested (.getDeclaredClasses klass)]
    (or (not (empty? nested))
        (some builder? nested))))


(defn interface?
  "Checks if the class is an interface, and optionally if the name of the interface ends with a specified string."
  ([^Class klass] (.isInterface klass))
  ([^Class klass ^String ending]
   (and (.isInterface klass)
        (ends-with? (.getName klass) ending))))


(defn classify-reducer
  "Function used to reduce the set of classes into how we classification."
  [caches ^Class klass]
  (cond
    ; Ignore Deprecated Classes
    (deprecated? klass)
    caches

    ; Ignore JsiiProxy
    (jsii-proxy? klass)
    caches

    ; Ignore Built Classes - Handled By Builders
    (built? klass)
    caches

    ; Ignore compiled package-info.java files
    (interface? klass "package-info")
    caches

    ; Ignore default JSII implementations
    (interface? klass "$Jsii$Default")
    caches

    ; Capture Remaining Interfaces
    (interface? klass)
    (interface caches klass)

    ; Process Builder
    (builder? klass)
    (builder caches klass)

    ; Just capture it as unprocessed
    :else
    (unprocessed caches klass)))

(defn print-counts
  [{:keys [enums interfaces builders built unprocessed] :as data}]
  (println "Enums: " (count enums))
  (println "Interfaces: " (count interfaces))
  (println "Buiders: " (count builders))
  (println "Built: " (count built))
  (println "Unprocessed: " (count unprocessed))
  data)


(defn classify
  "Classifies all the classes that are within the package."
  [config]
  (let [enums (find-enums config)]
    (->> (find-objects config)
         (reduce classify-reducer {:enums enums :interfaces #{} :builders #{} :built {} :unprocessed #{}})
         print-counts)))
