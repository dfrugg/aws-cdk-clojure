(ns util
  (:require [clojure.java.io :as io]
            [clojure.pprint :refer [pprint]]
            [clojure.string :as str]
            [clojure.walk :refer [postwalk]]))


(defn conjv
  "conj that ensures we are dealing with a vector."
  [coll value]
  (cond
    (nil? coll) [value]
    (vector? coll) (conj coll value)
    :else (conj (vec coll) value)))


(defn concatv
  "concat that returns a vector."
  [& colls]
  (vec (apply concat colls)))


(defn under>dash
  "Replaces underscores with dashes in a string."
  [^String data]
  (str/replace data "_" "-"))


(defn constant-keyword
  "Converts constant names to keywords.  This is a simplified kebab-case, as constants should be all SNAKE_CASE."
  [^String enum-name]
  (-> (str/lower-case enum-name)
      under>dash
      keyword))


(defn classify-char [c]
  (case c
    (\0 \1 \2 \3 \4 \5 \6 \7 \8 \9) :number
    (\- \_ \space \tab \newline \o013 \formfeed \return) :whitespace
    (\a \b \c \d \e \f \g \h \i \j \k \l \m \n \o \p \q \r \s \t \u \v \w \x \y \z) :lower
    (\A \B \C \D \E \F \G \H \I \J \K \L \M \N \O \P \Q \R \S \T \U \V \W \X \Y \Z) :upper
    :other))


(defn camel->kebab-case
  "Converts a nameable to kebab-case with the following rules:

1. Multiple uppercase characters are treated as a single token that includes all but the last
uppercase charaacter, which belongs to the next token.
2. Numbers to not cause separation when at the end or middle of a word.
"
  [value]
  (loop [results []
         last-classifier nil
         [c & cs] (seq (name value))]
    (if
     (nil? c) (-> (apply str results) (str/lower-case))
     (let [char-classifier (classify-char c)]
       (cond
         ; First char
         (empty? results)
         (recur (conj results c) char-classifier cs)

         ; Repeating chars types that don't change
         (and (= last-classifier char-classifier) (char-classifier #{:lower :number}))
         (recur (conj results c) char-classifier cs)

         ; Multiple whitespace/other chars act as 1
         (and (= last-classifier char-classifier) (char-classifier #{:whitespace :other}))
         (recur results char-classifier cs)

         ; Repeating upper that end in separation
         (and (= last-classifier char-classifier) (= char-classifier :upper) (= :lower (classify-char (first cs))))
         (recur (conj results \- c) char-classifier cs)

         ; Repeating upper that does not separate
         (and (= last-classifier char-classifier) (= char-classifier :upper))
         (recur (conj results c) char-classifier cs)

         (and (= \- (last results)) (char-classifier #{:upper}))
         (recur (conj results c) char-classifier cs)

         (char-classifier #{:upper})
         (recur (conj results \- c) char-classifier cs)

         (char-classifier #{:whitespace :other})
         (recur (conj results \-) char-classifier cs)

         :else
         (recur (conj results c) char-classifier cs))))))


(defn edn>file-pretty
  "Outputs an EDN data structure to a file with pretty formatting."
  [path data]
  (with-open [writer (io/writer (io/as-file path))]
    (pprint data writer)))


(defn log
  "Provides a simple logger to the console."
  [& items]
  (->> (mapv str items)
       (str/join)
       (println)))


(defn print-count>>
  "Prints out the number of items in a collection and returns that collection."
  [message items]
  (println message (count items))
  items)


(defn print-data>>
  "Prints out the number of items in a collection and returns that collection."
  [message data]
  (println message)
  (pprint data)
  data)


(defn print-data>
  "Prints out the number of items in a collection and returns that collection."
  [data message & data-keys]
  (println message)
  (if (empty? data-keys)
    (pprint data)
    (doseq [data-key data-keys]
      (println data-key " -> ")
      (pprint (get data data-key))))
  data)


(defn symbol>string
  "Converts symbol to strings.  Reserved handling with and without namespaces differently, tbd later."
  [value]
  (cond
    (simple-symbol? value) (name value)
    (symbol? value) (str value)
    :else value))


(defn symbols>string
  "Given a data structure, will convert all symbols within it to strings."
  [data]
  (postwalk symbol>string data))


(defn package>path
  "Will convert a string with dot separators to one with file separators."
  [^String package-name]
  (when package-name
    (str/replace package-name #"\." "/")))


(def package>path-cache
  "Cache of packages that have been turned into paths."
  (memoize package>path))


(defn package>namespace
  "Will convert a java package name to a clojure namespace name."
  ([^String package-name]
   (when package-name
     (->> (str/split package-name #"\.")
          (mapv under>dash)
          (str/join ".")))))


(def package>namespace-cache
  "Cache of packages that have been turned into namespaces."
  (memoize package>namespace))


(defn split-at-last
  "Splits a string at the last index of a character.  Used for separating
   java class names from packages and file names from paths."
  [^String match ^String source]
  (let [index (.lastIndexOf source match)]
    (case index
      -1 ["" source]
      0 ["" (subs source 1)]
      [(subs source 0 index) (subs source (inc index))])))


; Reflection Inspection

(def construct-sym 'software.constructs.Construct)
(def string-sym 'java.lang.String)

(defn no-arg?
  "Checks if a "
  [{:keys [parameter-types] :as data}]
  (and data (empty? parameter-types)))


(defn scope-id?
  [{:keys [parameter-types]}]
  (and (= 2 (count parameter-types))
       (= construct-sym (first parameter-types))
       (= string-sym (second parameter-types))))


(defn two-arg?
  "Checks if the create is 2 args but not what we know."
  [{:keys [parameter-types]}]
  (= 2 (count parameter-types)))


(defn one-arg?
  "Checks if the create is 1 args but not what we know."
  [{:keys [parameter-types]}]
  (= 1 (count parameter-types)))
