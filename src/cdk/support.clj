(ns cdk.support)


(defn lookup-entry
  "Attempts to find a value in a data map that can be stored under a key with our without a namespace."
  ([data namespace base-key default-value]
   (or (lookup-entry data namespace base-key) default-value))
  ([data namespace base-key]
   (or (when namespace
         (get data (keyword (name namespace) (name base-key))))
       (get data base-key))))


(defn require-entry
  "Attempts to find a value in a data map that can be stored under a key with our without a namespace. If
   a value could not be found an exception is thrown."
  [data namespace base-key]
  (or (lookup-entry data namespace base-key)
      (throw (ex-info (format "Unable to find required configuration for key '%s' in namespace '%s'"
                              base-key
                              namespace)
                      {:data data :namespace namespace :base-key base-key}))))


(defn execute-builder
  "Attempts to use a builder to generate a field value for another builder when the "
  [builder-fn property-config global-config]
  (let [args (:builder/args property-config)]
    (when-not (vector? args)
      (throw (ex-info "Configuration for builder is missing the :builder/args vector" property-config)))
    (apply builder-fn (conj args (merge global-config property-config)))))
