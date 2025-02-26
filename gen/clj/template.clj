(ns template
  "Provides functions for generating content."
  (:require [util :refer [construct-sym
                          pad-left
                          pad-right
                          scope-id?
                          tokenize]]
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
          item-token (-> (map-indexed namespace-require-item (sort clojure-fns))
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
                       (format "\n           [%s %s" k (first vs)))
          mid-token (->> (rest vs)
                         (mapv #(format "\n            %s %s" spacer %))
                         str/join)
          close-token "]"]
      (str open-token mid-token close-token))))


(defn namespace-import
  [java-classes]
  (when-not (empty? java-classes)
    (let [open-token "\n  (:import "
          mid-token (->> (into (sorted-map) java-classes)
                         (map-indexed namespace-import-item)
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

(def template-build-builder-start
  "(defn build-%s
  \"%s\"
  [^%s builder id config]")


(def template-builder-start
  "(defn %s
  \"%s\"
  [stack id config%s]")


(def template-builder-end
  "
  (.build builder))")

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
  (str "The build-" fn-name " function updates a " class-name
       " instance using the provided configuration.\n  The function takes the " class-name
       " instance, an optional namespace to use when looking up a value in the configuration,\n  and the configuration itself."
       "\n\n  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:\n\n"
       "| Field | DataType | Lookup Function | Data Key |\n|---|---|---|---|"
       (->> (mapv template-builder-docstring-method methods)
            str/join)
       "\n"))


; Builder Creates
; Builder Methods
(def template-builder-method-lookup
  "
  (when-some [data (lookup-entry config id :%s)]
    (. builder %s data))")


(def template-builder-method-enum
  "
  (when-some [data (%s config id :%s)]
    (. builder %s data))")


(defn template-builder-method
  [{:keys [method method-key method-enum]}]
  (if method-enum
    (format template-builder-method-enum (second method-enum) method-key method)
    (format template-builder-method-lookup method-key method)))


(defn build-builder-source-function
  "Generates code when builders have single constructor options"
  [{:keys [methods fn-name class-name]}]
  (let [docstring (template-builder-docstring methods fn-name class-name)
        builder-header (format template-build-builder-start fn-name docstring class-name)
        builder-sets (->> (mapv template-builder-method methods)
                          str/join)]
    (str builder-header builder-sets template-builder-end)))


; init defn docstrings

(def arg-header "| Argument | DataType | Description |\n|---|---|---|")
(def arg-id "| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |")
(def arg-id-of-scope "| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |")
(def arg-scope (str "| scope | " construct-sym " | The parent scope construct of the object being built. |"))
(def arg-config "| config | map | Data configuration |")


(defn template-init-docstring-no-arg
  [{:keys [class-name]} type]
  (str "Creates a  `" class-name "` instance using a no-argument " (name type) ", applies the data configuration, then builds it.  "
       "Takes the following arguments: \n\n"
       arg-header "\n" arg-id "\n" arg-config))


(defn template-init-docstring-no-arg-no-config
  [{:keys [class-name]} type]
  (str "Creates a  `" class-name "` instance using a no-argument " (name type) ",then builds it."))


(defn template-init-docstring-scope-arg-no-config
  [{:keys [class-name]}]
  (str "Creates a  `" class-name "` instance using a parent scope, then builds it.  Takes the following arguments: \n\n"
       arg-header "\n" arg-scope))


(defn template-init-docstring-scope-id-arg-no-config
  [{:keys [class-name]}]
  (str "Creates a  `" class-name "` instance using a parent scope and ID, then builds it.  Takes the following arguments: \n\n"
       arg-header "\n" arg-scope "\n" arg-id-of-scope))


(defn template-init-docstring-scope-id
  [{:keys [class-name]}]
  (str "Creates a  `" class-name "` instance using a scope and ID, applies the data configuration, then builds it.  "
       "Takes the following arguments: \n"
       arg-header "\n" arg-scope "\n" arg-id-of-scope "\n" arg-config))


(defn template-init-docstring-hint-block
  [{:keys [parameter-types hint]}]
  (let [hint-block (->> (map #(str "| " %1 " | " %2 " |  |") (-> hint :init-args tokenize) parameter-types)
                        (remove #(str/includes? % "(name id)"))
                        (str/join "\n"))]
    (str "\n\n__Create Form:__ ____" parameter-types "___\n" arg-header "\n" hint-block (when hint-block "\n") arg-id "\n" arg-config)))


(defn template-init-docstring-hint
  [{:keys [class-name inits]}]
  (->> inits
       (filterv :hint)
       (mapv template-init-docstring-hint-block)
       (str/join "\n")
       (str "Creates a  `" class-name "` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: \n")))


; init defn templates
(def template-init-no-arg-create
  "(defn %s
  \"%s\"
  [id config]
  (build-%s (%s/create) id config))")


(def template-init-no-arg-construct
  "(defn %s
  \"%s\"
  [id config]
  (build-%s (new %s) id config))")


(def template-init-no-arg-construct-no-config
  "(defn %s
  \"%s\"
  []
  (.build (new %s)))")


(def template-init-scope-arg-create-no-config
  "(defn %s
  \"%s\"
  [^software.constructs.Construct scope]
  (.build (%s/create scope)))")


(def template-init-scope-id-arg-create-no-config
  "(defn %s
  \"%s\"
  [^software.constructs.Construct scope id]
  (.build (%s/create scope (name id))))")


(def template-init-scope-id-create
  "(defn %s
  \"%s\"
  [^software.constructs.Construct scope id config]
  (build-%s (%s/create scope (name id)) id config))")


(def template-init-hint
  "(defn %s
  \"%s\"
  [%sid config]
  (build-%s (%s/create%s) id config))")


(def template-init-multi-defn
  "(defn %s
  \"%s\"%s)")


(def template-init-multi-arity
  "
  ([%sid config]
   (build-%s (%s/create%s) id config))")


(defn builder-source-multi-init
  [{:keys [inits fn-name class-name] :as builder-data}]
  (->> inits
       (filterv :hint)
       (mapv #(let [{:keys [fn-args init-args]} (:hint %)]
                (format template-init-multi-arity (pad-right fn-args) fn-name class-name (pad-left init-args))))
       str/join
       (format template-init-multi-defn fn-name (template-init-docstring-hint builder-data))))


(defn single? [inits] (= 1 (count inits)))
(defn multi? [inits] (< 1 (count inits)))
(defn create? [inits] (= :create (-> inits first :init-type)))
(defn construct? [inits] (= :construct (-> inits first :init-type)))
(defn no-args? [inits] (= 0 (-> inits first :parameter-types count)))
(defn scope-id-args? [inits] (-> inits first scope-id?))
(defn scope-args? [inits] (= [construct-sym] (-> inits first :parameter-types)))
(defn hinted? [inits] (every? :hint inits))

(def single-no-args-create? (every-pred single? no-args? create?))
(def single-no-args-construct? (every-pred single? no-args? construct?))
(def single-hinted-create? (every-pred single? hinted? create?))
(def multi-hinted-create? (every-pred multi? hinted? create?))
(def single-scope-id-args-create? (every-pred single? scope-id-args? create?))
(def single-scope-args-create? (every-pred single? scope-args? create?))


(defn record-unknown-builder
  [{:keys [inits fn-name class-name]}]
  (spit "INITS_UNKNOWN.txt" (str "fn-name: " fn-name "\nclass-name: " class-name "\ninits: " (pr-str inits) "\n\n") :append true))


(defn record-no-config-builder
  [{:keys [inits fn-name class-name methods] :as builder-data}]
  (spit "NO_CONFIG.txt" (str "fn-name: " fn-name "\nclass-name: " class-name "\ninits: " (pr-str inits) "\n\n") :append true))



(defn builder-source-no-config-function
  "Generates the function to build when no configuration is needed."
  [{:keys [inits fn-name class-name] :as builder-data}]
  (cond
    ; No arg constructors.  These are probably flags.
    (single-no-args-construct? inits)
    (format template-init-no-arg-construct-no-config fn-name (template-init-docstring-no-arg-no-config builder-data :construct) class-name)

    (single-scope-args-create? inits)
    (format template-init-scope-arg-create-no-config fn-name (template-init-docstring-scope-arg-no-config builder-data) class-name)

    (single-scope-id-args-create? inits)
    (format template-init-scope-id-arg-create-no-config fn-name (template-init-docstring-scope-id-arg-no-config builder-data) class-name)

    :else
    (do
      (record-no-config-builder builder-data)
      nil)))



(defn builder-source-function
  "Builds out the source code for for the builders on a package"
  [{:keys [inits fn-name class-name methods] :as builder-data}]
  (let [builder? (some? (seq methods))
        build  (if builder?
                 (build-builder-source-function builder-data)
                 (builder-source-no-config-function builder-data))]
    (cond
      ; Return just the builder
      (not builder?) [build]

      ; The rare no arg creates, like the
      (single-no-args-create? inits)
      [build (format template-init-no-arg-create fn-name (template-init-docstring-no-arg builder-data :create) fn-name class-name)]

      ; Process A Single Hinted Creator
      (single-hinted-create? inits)
      (let [{:keys [fn-args init-args]} (-> inits first :hint)]
        [build (format template-init-hint fn-name (template-init-docstring-hint builder-data) (pad-right fn-args) fn-name class-name (pad-left init-args))])

      ; The rare no arg construct, like the
      (single-no-args-construct? inits)
      [build (format template-init-no-arg-construct fn-name (template-init-docstring-no-arg builder-data :constructor) fn-name class-name)]

      ; The very common scope ID combination
      (single-scope-id-args-create? inits)
      [build (format template-init-scope-id-create fn-name (template-init-docstring-scope-id builder-data) fn-name class-name)]

      ; Process Multi Inits
      (multi-hinted-create? inits)
      [build (builder-source-multi-init builder-data)]

      ; Begin Catch All
      :else
      (do
        (record-unknown-builder builder-data)
        [build]))))
