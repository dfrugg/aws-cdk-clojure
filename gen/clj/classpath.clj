(ns classpath
  (:require [clojure.string :refer [ends-with?]]
            [util :refer [print-count>>]])
  (:import [org.reflections Reflections]
           [org.reflections.scanners Scanner SubTypesScanner]
           [org.reflections.util ClasspathHelper ConfigurationBuilder FilterBuilder]))


(defn not-deprecated
  "Ensures that the class is not deprecated, as we are not going to propagate old dead stuff."
  [^Class target-class]
  (nil? (.getAnnotation target-class java.lang.Deprecated)))


(defn find-enums
  "Finds all of the Enums "
  [config]
  (let [ref (Reflections. (:base-package config) nil)]
    (->> (.getSubTypesOf ref java.lang.Enum)
         (filterv not-deprecated)
         (print-count>> "Total Enums Found: "))))


(defn find-builders
  [config]
  (let [base-package (:base-package config)
        scanners (into-array Scanner [(SubTypesScanner. false)])
        filb (-> (FilterBuilder.)
                 (.includePackage (into-array String [base-package])))
        cb (-> (ConfigurationBuilder.)
               (.setUrls (ClasspathHelper/forPackage base-package nil))
               (.setScanners scanners)
               (.filterInputsBy filb))
        ref (Reflections. cb)]
    (->> (.getSubTypesOf ref Object)
         (filterv #(ends-with? (.getName %) "$Builder"))
         (filterv not-deprecated)
         (print-count>> "Total Builders Found: "))))


(comment
  (find-enums {:base-package "software.amazon.awscdk"})
  (find-builders {:base-package "software.amazon.awscdk"})
  (require '[clojure.reflect :as ref])
  (require '[clojure.pprint :refer [pprint]])
  (pprint (ref/reflect FilterBuilder))
  )
