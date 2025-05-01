(ns state
  "Provides functional wrappers for dealing with files and folders."
  (:require [filesystem :as fs]
            [clojure.edn :as edn]
            [clojure.pprint :refer [pprint]]))


(def CURRENT_VERSION
  (->> (slurp "project.clj")
       (edn/read-string)
       (drop-while #(not= % :dependencies))
       rest
       first
       (filterv #(= `software.amazon.awscdk/aws-cdk-lib (first %)))
       first
       second))


(defn save
  "Saves the current state to the local file system.  This is used compare library upgrades."
  ([state] (save state CURRENT_VERSION))
  ([state id]
   (fs/ensure-directory "state")
   (fs/write-file (str "state/" id ".edn")
                  (with-out-str (pprint (select-keys state [:enums :builders]))))))
