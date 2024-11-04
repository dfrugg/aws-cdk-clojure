(ns template
  "Provides functions for generating content."
  (:require [clojure.set :refer [superset?]]
            [clojure.string :as str]))


(def function-spacer
  "Empty lines between functions.  We like 2 blank lines."
  "\n\n\n")

;
; Namespace Templating
;

(def template-namespace-start
  "(ns %s
  \"Functions that represent AWS CDK enums and builders in the %s package. \"")



(defn namespace-require-item
  [index [k vs]]
  (let [vs (sort vs)
        spacer (apply str (repeat (count k) " "))
        open-token (if (= 0 index)
                     (format "[%s :refer [%s" k (first vs))
                     (format "\n            [%s :refer [%s" k (first vs)))
        mid-token (->> (rest vs)
                       (mapv #(format "\n             %s         %s" spacer %))
                       str/join)
        close-token "]]"]
    (str open-token mid-token close-token)))


(defn namespace-require
  [clojure-fns]
  (when-not (empty? clojure-fns)
    (let [open-token "\n  (:require "
          item-token (-> (map-indexed namespace-require-item clojure-fns)
                         str/join)
          close-token ")"]
      (str open-token item-token close-token))))


(defn namespace-import-item
  [index [k vs]]
  (when-not (empty? vs)
    (let [vs (sort vs)
          spacer (apply str (repeat (count k) " "))
          open-token (if (= 0 index)
                       (format "[%s %s" k (first vs))
                       (format "           [%s %s" k (first vs)))
          mid-token (->> (rest vs)
                         (mapv #(format "\n            %s %s" spacer %))
                         str/join)
          close-token "]"]
      (str open-token mid-token close-token))))


(defn namespace-import
  [java-classes]
  (when-not (empty? java-classes)
    (let [open-token "\n  (:import "
          mid-token (-> (map-indexed namespace-import-item java-classes)
                        str/join)
          close-token ")"]
      (str open-token mid-token close-token))))


(def template-namespace-end ")")


(defn namespace-source-function
  [{:keys [package-name source-namespace source-clojure-fns source-java-classes]}]
  (str (format template-namespace-start source-namespace package-name)
       (namespace-require source-clojure-fns)
       (namespace-import source-java-classes)
       template-namespace-end))


(defn namespace-test-function
  [{:keys [package-name test-namespace test-clojure-fns test-java-classes]}]
  (str (format template-namespace-start test-namespace package-name)
       (namespace-require test-clojure-fns)
       (namespace-import test-java-classes)
       template-namespace-end))



;
; Enum Source Templating
;

(def template-enum-start
  "(defn %s
  \"%s\"
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? %s data) data")

(def template-enum-item
  "\n      (= %s data) %s/%s")

(def template-enum-end ")))")

(defn template-enum-docstring
  [values fn-name class-name]
  (str "The `" fn-name "` function data interprets values in the provided config data into a \n`" class-name
       "` instance.  This simplifies the use of keywords in place of actual enum values in \n"
       "the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` \n"
       "function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: \n\n"
       "* instance of `" class-name "` - the value is returned.\n"
       (->> (mapv #(str "* is `" (second %) "` - `" class-name "/" (first %) "` is returned") values)
            (str/join "\n"))
       "\n\n If a value is not found or matches the above criteria, nil is returned."))

(defn enum-source-function
  "Generates a function to handle enum resolution."
  [{:keys [values fn-name class-name]}]
  (let [docstring (template-enum-docstring values fn-name class-name)
        enum-header (format template-enum-start fn-name docstring class-name)
        enum-values (->> values
                         (mapv (fn [[v k]] (format template-enum-item (str k) class-name (str v))))
                         str/join)]
    (str enum-header enum-values template-enum-end)))


;
; Enum Test Templatint
;

(def template-enum-test-start
  "(deftest %s-test
  (testing \"Testing enum function %s\"")

(def temlate-enum-test-item
  "\n    (is (= %s (%s {:item %s} \"test\" :item)))\n    (is (= %s (%s {:test/item %s} \"test\" :item)))")

(def template-enum-test-end "))")


(defn enum-test-function
  [{:keys [values fn-name class-name]}]
  (let [enum-header (format template-enum-test-start fn-name fn-name)
        enum-values (->> values
                         (mapv (fn [[v _]]
                                 (let [ev (str class-name "/" v)]
                                   (format temlate-enum-test-item ev fn-name ev ev fn-name ev))))
                         str/join)

        enum-keywords (->> values
                           (mapv (fn [[v k]]
                                   (let [ev (str class-name "/" v)]
                                     (format temlate-enum-test-item ev fn-name (str k) ev fn-name (str k)))))
                           str/join)]
    (str enum-header enum-values enum-keywords template-enum-test-end)))

;
; Builder Source Templating
;

(def template-builder-start
  "(defn %s
  \"%s\"
  [stack id config%s]")


(def template-builder-end
  "
    (.build builder)))")

(def template-builder-docstring-method-enum
  "\n| `%s` | %s | [[%s/%s]] | `:%s` |")


(def template-builder-docstring-method-lookup
  "\n| `%s` | %s | [[cdk.support/lookup-entry]] | `:%s` |")


(defn template-builder-docstring-method
  [{:keys [method method-key method-enum method-arg]}]
  (if method-enum
    (format template-builder-docstring-method-enum method method-arg (first method-enum) (second method-enum) method-key)
    (format template-builder-docstring-method-lookup method method-arg method-key)))


(defn template-builder-docstring
  [methods fn-name class-name]
  (str "The " fn-name " function buildes out new instances of \n" class-name
       " using the provided configuration.  Each field is set as follows:\n\n"
       "| Field | DataType | Lookup Function | Data Key |\n|---|---|---|---|"
       (->> (mapv template-builder-docstring-method methods)
            str/join)))

; Builder Creates
(def template-builder-create-no-args
  "
  (let [builder (%s/create)]")


(def template-builder-create-stack-id
  "
  (let [builder (%s/create stack id)]")


(def template-builder-create-other-arg
  "
  (let [builder (%s/create%s)]")


(def template-builder-construct-no-args
  "
  (let [builder (%s.)]")


(def template-builder-construct-stack-id
  "
  (let [builder (%s. stack id)]")


(def template-builder-construct-other-arg
  "
  (let [builder (%s.%s)]")


(defn builder-source-name-args
  "Takes a vector of vectors with arg and types and turns it into a call name."
  [name-args]
  (if (empty? name-args)
    ""
    (->> (mapv #(str " ^" (second %) " " (first %))  name-args)
         str/join)))


(defn template-builder-create
  [{:keys [class-name init]} init-data]
  (cond
    ; Create No Args
    (and (= :create init) (= :no-arg (:init-type init-data)))
    (format template-builder-create-no-args class-name)

    ; Create Stack ID Args
    (and (= :create init) (= :stack-id (:init-type init-data)))
    (format template-builder-create-stack-id class-name)

    ; Create Other Args
    (and (= :create init) (= :other-arg (:init-type init-data)))
    (format template-builder-create-other-arg class-name (builder-source-name-args (:init-name-args init-data)))

    ; Construct No Args
    (and (= :construct init) (= :no-arg (:init-type init-data)))
    (format template-builder-construct-no-args class-name)

    ; Construct Stack ID Args
    (and (= :construct init) (= :stack-id (:init-type init-data)))
    (format template-builder-construct-stack-id class-name)

    ; Create Other Args
    (and (= :construct init) (= :other-arg (:init-type init-data)))
    (format template-builder-construct-other-arg class-name (builder-source-name-args (:init-name-args init-data)))))


; Builder Methods
(def template-builder-method-lookup
  "
    (when-let [data (lookup-entry config id :%s)]
      (. builder %s data))")


(def template-builder-method-enum
  "
    (when-let [data (%s config id :%s)]
      (. builder %s data))")


(defn template-builder-method
  [{:keys [method method-key method-enum]}]
  (if method-enum
    (format template-builder-method-enum (second method-enum) method-key method)
    (format template-builder-method-lookup method-key method)))


(defn builder-source-function-single-inits
  "Generates code when builders have single constructor options"
  [{:keys [methods fn-name class-name inits] :as builder-data}]
  (let [docstring (template-builder-docstring methods fn-name class-name)
        init (first inits)
        builder-args (builder-source-name-args (:builder-name-args init))
        builder-header (format template-builder-start fn-name docstring builder-args)
        builder-create (template-builder-create builder-data init)
        builder-sets (->> (mapv template-builder-method methods)
                          str/join)]
    (str builder-header builder-create builder-sets template-builder-end)))


(defn builder-source-function-multi-inits
  "Generates code when builders have multiple constructor options"
  [builder-data])


(defn builder-source-function
  "Builds out the source code for for the builders on a package"
  [{:keys [inits] :as builder-data}]
  (cond
    ; Only 1
    (= 1 (count inits))
    (builder-source-function-single-inits builder-data)
    ; Only use stack ID
    (superset? #{:no-arg :stack-id} (->> inits (mapv :init-type) set))
    (->> (filterv #(= :stack-id (:init-type %)) inits)
         (assoc builder-data :inits)
         builder-source-function-single-inits)
    ;Use Multi Inits
    :else
    (builder-source-function-multi-inits builder-data)))
