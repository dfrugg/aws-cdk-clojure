(ns cdk.config
  "Provides functions for building the configuration that the CDK project will use."
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [environ.core :refer [env]]))


(defn env!
  "Gets a variable from the environment.  Throws an exception if the value is not set."
  [field]
  (or (get env field)
      (throw (ex-info (str "Environment variable '" field "' is not set.") {}))))


(defn load-resource-edn
  "Loads an EDN file from java classpath.  Returns `nil` if the resource does not exist.  Throws an exception if the resource is malformed."
  [path]
  (some-> path io/resource slurp edn/read-string))


(defn load-resource-edn!
  "Loads an EDN file from java classpath.  Throws an exception if the resource does not exist or is malformed."
  [path]
  (or (load-resource-edn path)
      (throw (ex-info (str "Failed to load resource at " path) {}))))


(defn load-file-edn
  "Loads an EDN file from OS file system.  Returns `nil` if the resource does not exist.  Throws an exception if the resource is malformed."
  [path]
  (some-> path slurp edn/read-string))


(defn load-file-edn!
  "Loads an EDN file from OS file system.  Throws an exception if the resource does not exists or is malformed."
  [path]
  (or (load-file-edn path)
      (throw (ex-info (str "Failed to load filesystem resource at " path) {}))))


(def load-env-path-resource-edn
  "Looks up a resource path from an environment variable, then loads the content of the resource from the classpath as EDN.
  Returns `nil` if the resource does not exist.  Throws an exception if the resource is malformed."
  (comp load-resource-edn env))


(def load-env-path-resource-edn!
  "Looks up a resource path from an environment variable, then loads the content of the resource from the classpath as EDN.
  Throws an exception if the resource does not exist or is malformed."
  (comp load-resource-edn! env))


(def load-env-path-file-edn
  "Looks up a file system path from an environment variable, then loads the content of the file from the file system as EDN.
  Returns `nil` if the file does not exist.  Throws an exception if the content is malformed."
  (comp load-file-edn env))


(def load-env-path-file-edn!
  "Looks up a file system path from an environment variable, then loads the content of the file from the file system as EDN.
  Throws an exception if the file does not exist or is malformed."
  (comp load-file-edn! env))


(defn load-env-edn
  "Loads EDN configuration value that is stored in an environment variable.  Returns `nil` if the environment variable does not exist.
  Throws an exception if the content is malformed."
  [env-var]
  (some-> (get env env-var) edn/read-string))


(defn load-env-edn!
  "Loads EDN configuration value that is stored in an environment variable.   Throws an exception if the environment variable
  does not exist or the content is malformed."
  [env-var]
  (or (load-env-edn env-var)
       (throw (ex-info (str "Failed to load environment variable " env-var) {}))))


(defn simple
  "Builds a simple configuration to use in the CDK process.  Loads configuration data in the following order, with later loading taking
   precedence.

. Classpath resource @ `cdk.config.edn`
. File @ `cdk.config.edn`
. Classpath resource found at location found in environment variable `CDK_CONFIG_RESOUCE_PATH`
. File found at location found in environment variable `CDK_CONFIG_FILE_PATH`
. EDN found in environment variable `CDK_CONFIG_EDN`
"
  []
  (merge (load-resource-edn "cdk.config.edn")
         (load-file-edn "cdk.config.edn")
         (load-env-path-resource-edn :cdk-config-resource-path)
         (load-env-path-file-edn :cdk-config-file-path)
         (load-env-edn :cdk-config-edn)))
