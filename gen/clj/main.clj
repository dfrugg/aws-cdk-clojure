(ns main
  "Provides a starting point for the code generation."
  (:require [classpath :as cp]
            [config :as co]
            [engine :as e]
            [inspect :as in]
            [state :as st]))


(comment
  ; Use directly in REPL
  (require '[config :as co] :reload)
  (def config (co/load))
  (require '[classpath :as cp] :reload)
  (def classified (cp/classify config))
  (require '[inspect :as in] :reload)
  (def inspected (in/describe-classpath classified config)))


(defn save-state
  "Generates all the files."
  []
  (let [config (co/load)
        schema  (-> (cp/classify config)
                    (in/describe-classpath config))]
    (st/save schema)))


(defn gen
  "Generates all the files."
  []
  (let [config (co/load)
        schema  (-> (cp/classify config)
                    (in/describe-classpath config))]
    (e/build schema config)))
