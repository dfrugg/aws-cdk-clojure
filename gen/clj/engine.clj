(ns engine
  "Generates the clojure files from the configuration."
  (:require [filesystem :refer [as-directory-and-file
                                ensure-directory
                                write-file]]
            [model :refer [add-source-function
                           add-source-java-class
                           package-code
                           process-namespace
                           process-enums
                           process-builders]]
            [inspect :refer [packages]]
            [template :refer [function-spacer]]
            [util :refer [log
                          package>path
                          split-at-last]]
            [clojure.string :as str]))



(defn build-code
  "Builds the source file contents"
  [package-data]
  (log "Building Package Code - " (:package-name package-data))
  (let [package-coded (-> package-data
                          process-namespace
                          process-enums
                          process-builders)
        source (->> [(:source-namespace-code package-coded)
                     (sort (:source-enums-code package-coded))
                     (:source-builders-code package-coded)]
                    flatten
                    (str/join function-spacer))

        test (when-not (empty? (:enums package-data))
               (->> [(:test-namespace-code package-coded)
                     (sort (:test-enums-code package-coded))]
                    flatten
                    (str/join function-spacer)))]
    (assoc package-coded :source-code source :test-code test)))


(defn write-code
  "Writes the code to the files"
  [{:keys [source-file source-code test-file test-code package-name]}]
  (log "Writing Package - " package-name)
  (write-file source-file source-code)
  (when-not (str/blank? test-code)
    (write-file test-file test-code)))



(defn package-options
  "Generates the package specific options, such as the file path to create
and the namespace to use, etc.  Should have the following fields added to the package data:

* source-file - java.io.File for the souce file code.
* test-file - java.io.File for the test file code.
* source-namespace - Namespace of the generated source file.
* test-namespace - Namespace of the generated test file."
  [{:keys [package-name] :as package-data}
   {:keys [base-package source-namespace-path test-namespace-path
           source-package-namespace-path test-package-namespace-path]}]
  (if (= base-package package-name)
    (let [[_ source-file] (as-directory-and-file source-package-namespace-path ".clj")
          [_ test-file] (as-directory-and-file test-package-namespace-path "_test.clj")]
      (log "Package Source Namespace - " source-package-namespace-path)
      (merge package-data
             {:source-file source-file
              :test-file test-file}))
    (let [package-diff (subs package-name (count base-package))
          package-path (package>path package-diff)
          [_ source-file] (as-directory-and-file (str source-namespace-path package-path) ".clj")
          [_ test-file] (as-directory-and-file (str test-namespace-path package-path) "_test.clj")]
      (log "Package Source Namespace - " (str source-namespace-path package-path))
      (merge package-data
             {:source-file source-file
              :test-file test-file}))))


(defn prepare-builder-requires
  "Adds any clojure requires that are need to generate builders."
  [{:keys [builders source-namespace] :as package-data}]
  (let [enums (->> (mapv :methods builders)
                   flatten
                   (mapv :method-enum)
                   (filterv some?))]
    (reduce (fn [pd [n f]]
              (if (= n source-namespace)
                pd
                (add-source-function pd n f)))
            package-data
            enums)))


(defn >importable
  "Checks that a class is not part of the java.lang default package."
  [class-symbol]
  (let [parts (some->> class-symbol name (split-at-last "."))]
    (when-not (= "java.lang" (first parts))
      parts)))


(defn prepare-builders-imports
  "Adds any java imports that are need to generate builders."
  [{:keys [builders] :as package-data}]
  (reduce (fn [pd {:keys [package-name class-name inits]}]
            (let [hinted (->> inits
                              (filterv :hint)
                              (filterv (complement :skip-import?))
                              (mapv :parameter-types)
                              flatten
                              (mapv >importable)
                              (filterv some?)
                              seq)]
              (if hinted
                (reduce (fn [d [p c]]
                          (add-source-java-class d p c))
                        pd
                        (conj hinted [package-name class-name]))
                (add-source-java-class pd package-name class-name))))
          package-data
          builders))


(defn prepare-builders
  "Performs preparation for generating builders.."
  [package-data]
  (-> package-data
      prepare-builder-requires
      prepare-builders-imports))


(defn prepare-package
  "Prepares each package for building."
  [config package-data]
  (log "Preparing Package: " (:package-name package-data))
  (->> (package-options package-data config)
       (merge package-code)
       (prepare-builders)))


(defn build-package
  "Builds the clojure namespace file for a specific package."
  [{:keys [package-name] :as package-data}]
  (log "Building Package - " package-name)
  (-> (build-code package-data)
      write-code))


(defn build
  "Builds everthing."
  ([config] (build @packages config))
  ([packages config]
   (ensure-directory (:source-namespace-path config))
   (ensure-directory (:test-namespace-path config))
   (let [packages (->> (vals packages)
                       (mapv (partial prepare-package config)))]
     (doseq [package packages]
       (build-package package)))))
