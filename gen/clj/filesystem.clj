(ns filesystem
  "Provides functional wrappers for dealing with files and folders."
  (:require [util :refer [split-at-last]]
            [clojure.java.io :as io]))


(defn ensure-directory
  "Ensures that a path exists, creating it if it does not, and that it is a directory."
  [path]
  (let [file (io/file path)]
    (cond
      (not (.exists file))
      (.mkdirs file)

      (not (.isDirectory file))
      (throw (ex-info (str "Path " path " exists but is not a directory.") {})))
    file))


(defn as-directory-and-file
  "Given a path that represents a directory and file name without an extensions
   a returns a java.io.File representation of the directory and file with the provided
   extension within a vector."
  [path ext]
  (let [[d _] (split-at-last "/" path)
        _ (println "Path " path " Ensures Directory " d)
        directory (ensure-directory d)
        file (io/file (str path ext))]
    [directory file]))


(defn write-file
  "Writes the contents to a file."
  [file ^String content]
  (with-open [writer (io/writer file)]
    (.write writer content)))
