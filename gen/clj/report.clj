(ns report
  "Provides ability to analyze the information discovered and generated by the library in order
   to make evolution simpler."
  (:require [inspect :refer [packages]]
            [util :refer [edn>file-pretty]]))



(defn publish
  "Outputs the current packages state to a file."
  [path]
  (edn>file-pretty path @packages))


(defn print-summary
  "Prints out the counts."
  []
  (doseq [[package-name package] @packages]
    (println package-name "-" (count (:enums package)) " , " (count (:builders package)))))



(def known-init-types #{:stack-id :construct :no-arg})


(defn analyze-inits
  "Checks for any initializations discovered in the classes that don't conform to expectations
   so we can create expectations in the gen.inits.edn file."
  [config]
  (let [known-inits (:inits config)]
    (doseq [[package-name package] @packages]
      (doseq [builder (:builders package)]
        (let [known-init (get-in known-inits [(:package-name builder) (:class-name builder)])
              remove-known (if (empty? known-init)
                             identity
                             (let [counts (cond
                                            (string? (first known-init)) #{(count known-init)}
                                            (vector? (first known-init)) (set (map count known-init))
                                            ; known -init is malformed
                                            :else #{})]
                               #(counts (-> % :init-args count))))
              unknown-inits (->> (:inits builder)
                                 (remove #(contains? known-init-types (:init-type %)))
                                 (remove remove-known))]
          (when-not (empty? unknown-inits)
            (println package-name (:class-name builder) (:init-type builder) (pr-str unknown-inits))))))))
