(ns cdk.api.services.lambda.destinations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.destinations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lambda.destinations LambdaDestination$Builder
                                                                LambdaDestinationOptions$Builder]))


(defn build-lambda-destination-builder
  "The build-lambda-destination-builder function updates a LambdaDestination$Builder instance using the provided configuration.
  The function takes the LambdaDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-only` |
"
  [^LambdaDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :response-only)]
    (. builder responseOnly data))
  (.build builder))


(defn build-lambda-destination-options-builder
  "The build-lambda-destination-options-builder function updates a LambdaDestinationOptions$Builder instance using the provided configuration.
  The function takes the LambdaDestinationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-only` |
"
  [^LambdaDestinationOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :response-only)]
    (. builder responseOnly data))
  (.build builder))


(defn lambda-destination-options-builder
  ""
  [id config]
  (build-lambda-destination-options-builder (new LambdaDestinationOptions$Builder) id config))