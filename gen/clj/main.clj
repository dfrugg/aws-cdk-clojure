(ns main
  "Provides a starting point for the code generation."
  (:require [classpath :as cp]
            [config :as co]
            [engine :as e]
            [inspect :as in]
            [report :as rep]))


(defn gen
  "Generates all the files."
  []
  (let [config (co/load)]
    (mapv #(in/add-enum % config) (cp/find-enums config))
    (mapv #(in/add-builder % config) (cp/find-builders config))
    (rep/print-summary)
    (e/build)))
