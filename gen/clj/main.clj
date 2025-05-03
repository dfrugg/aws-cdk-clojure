(ns main
  "Provides a starting point for the code generation."
  (:require [classpath :as cp]
            [config :as co]
            [engine :as e]
            [inspect :as in]
            [reflect :refer [reflect-builder]]
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


(defn check-method-multi-arity
  []
  (let [config (co/load)
        builders (:builders (cp/classify config))]
    (doseq [builder builders]
      (let [multis (->> (reflect-builder builder)
                        :methods
                        (group-by :name)
                        (filterv #(< 1 (-> % second count))))]
        (doseq [[k v] multis]
          (let [params (->> (map :parameter-types v)
                            concat
                            flatten)]
            (when (< 2 (count params))
              (println builder " - " k " - " params))))))))
