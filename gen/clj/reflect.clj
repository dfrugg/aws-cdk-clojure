(ns reflect
  "Reflects on classes in a way that works this project."
  (:refer-clojure :exclude [methods])
  (:require [util :refer [constant-keyword
                          deep-conj]]
            [clojure.string :as str])
  (:import [java.lang.reflect Constructor
            GenericArrayType
            Method
            Modifier
            ParameterizedType
            TypeVariable
            WildcardType]))


(defprotocol TypeConverter
  "Provides an interface to convert a Type to a data structure we care about."
  (as-data [t]))


(defn map-as-data
  "Converts a collection of types to the structures we care about."
  [type-coll]
  (mapv as-data type-coll))


(extend java.lang.Class
  TypeConverter
  {:as-data identity})


(extend java.lang.Class
  TypeConverter
  {:as-data identity})


(extend ParameterizedType
  TypeConverter
  {:as-data (fn [^ParameterizedType t]
              (comment {:type (.getRawType t)
                        :of (map-as-data (.getActualTypeArguments t))})
              (.getRawType t))})

(extend GenericArrayType
  TypeConverter
  {:as-data (fn [^GenericArrayType t]
              {:type :array
               :of ((.getGenericComponentType t))})})

(extend TypeVariable
  TypeConverter
  {:as-data (fn [^TypeVariable t]
              {:type :variable
               :type-name (.getTypeName t)
               :actual (.getBounds t)
               :owner (.getGenericDeclaration t)
               :raw (.getAnnotatedBounds t)})})

(extend WildcardType
  TypeConverter
  {:as-data (fn [^WildcardType t]
              (first (map-as-data (.getUpperBounds t))))})


(defn map-keyword
  [datums]
  (mapv keyword datums))

(defn public?
  "Checks if the modifier value includes public"
  [^long modifiers]
  (Modifier/isPublic modifiers))


(defn static?
  "Checks if the modifier value includes public"
  [^long modifiers]
  (Modifier/isStatic modifiers))


(defn modifiers
  [^long modifier]
  (-> (Modifier/toString modifier)
      (str/split #" ")
      map-keyword
      set))


(defn constructor
  "Converts a constructor to the data structure we need."
  [^Constructor c]
  {:flags (modifiers (.getModifiers c))})


(defn constructor-reducer
  "Examines the constructor to see if we want it.  If we do it's converted to
   our data structure and added to the collection, else the existing
   collection is returned."
  [v ^Constructor c]
  (cond
    (not (public? (.getModifiers c))) v
    :else
    (conj v (constructor c))))


(defn constructors
  "Finds all the constructors we care about."
  [^Class klass]
  (reduce constructor-reducer [] (.getDeclaredConstructors klass)))


(defn method
  "Converts a java reflect method to our useable data structure."
  [^Method m]
  {:name (.getName m)
   :flags (modifiers (.getModifiers m))
   :parameter-types (map-as-data (.getGenericParameterTypes m))})


(defn method-reducer
  "Examines the method to see if we want it.  If we do it's converted to
   our data structure and added to the collection, else the existing
   collection is returned."
  [c ^Method m]
  (let [modifiers (.getModifiers m)
        method-name (.getName m)]
    (cond
      ; Start elimitating things
      (not (public? modifiers)) c
      (= "build" method-name) c

      ; Add Creates
      (and (static? modifiers) (= "create" method-name))
      (deep-conj c :methods (method m))
      :else
      (deep-conj c :methods (method m)))))


(defn methods
  "Finds all fo the public methods we care about."
  [^Class klass]
  (reduce method-reducer {:creates [] :method []} (.getDeclaredMethods klass)))


(defn reflect-builder
  "Provides specific reflection capabilities that we need that is not provided by the Clojure reflection.
   Specifically we want to know the generic type when dealing with collections."
  [^Class klass]
  (merge {:constructors (constructors klass)} (methods klass)))


(defn reflect-enum
  "Extracts the important infomration from an enum class"
  [^Class klass]
  (->> (.getEnumConstants klass)
       (mapv #(.name %))
       sort
       (mapv (juxt identity constant-keyword))))
