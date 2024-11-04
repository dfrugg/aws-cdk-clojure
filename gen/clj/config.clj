(ns config
  (:refer-clojure :exclude [load])
  (:require [util :refer [package>path-cache
                          symbols>string]]
            [clojure.edn :as edn]
            [clojure.java.io :as io]))

(def config
  "Hold the configuration for use without passing around."
  (atom nil))


(defn load-edn
  "Loads an EDN file from the classpath"
  [path]
  (-> path io/resource slurp edn/read-string))


(defn ensure-with-value
  "Sets a key-value on the config if it is not already set."
  [config entry-key entry-value]
  (if (get config entry-key)
    config
    (assoc config entry-key entry-value)))


(defn ensure-with-function
  "Sets a key-value on the config if it is not already set, deriving the value
   through a function call."
  [config entry-key entry-fn]
  (if (get config entry-key)
    config
    (assoc config entry-key (entry-fn config))))


(defn base-path
  "Puts together the default base package path"
  [base-key namespace-key config]
  (str (base-key config) "/" (package>path-cache (namespace-key config))))

(defn base-namespace-path
  "Puts together the default base package path"
  [{:keys [source-path base-namespace]}]
  (str source-path "/" (package>path-cache base-namespace)))


(defn base-package-namespace-path
  "Puts together the default base package path"
  [{:keys [source-path base-package-namespace]}]
  (str source-path "/" (package>path-cache base-package-namespace)))


(defn load
  "Loads all the configuration and returns it in a map."
  []
  (let [data (-> (load-edn "gen.config.edn")
                 (update :ignored symbols>string)
                 (assoc :inits (-> "gen.inits.edn" load-edn symbols>string))
                 (ensure-with-value :source-path "src")
                 (ensure-with-value :test-path "test/clj")
                 (ensure-with-value :base-namespace "cdk.api")
                 (ensure-with-value :base-package "software.amazon.awscdk")
                 (ensure-with-value :base-package-namespace "cdk.api")
                 ; Base for most packages
                 (ensure-with-function :source-namespace-path (partial base-path :source-path :base-namespace))
                 (ensure-with-function :test-namespace-path (partial base-path :test-path :base-namespace))
                 ; Base for exact base package match
                 (ensure-with-function :source-package-namespace-path (partial base-path :source-path :base-package-namespace))
                 (ensure-with-function :test-package-namespace-path (partial base-path :test-path :base-package-namespace)))]
    (reset! config data)
    data))
