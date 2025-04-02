(ns cdk.api.services.lambda.destinations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.destinations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lambda IFunction]
           [software.amazon.awscdk.services.lambda.destinations LambdaDestination$Builder
                                                                LambdaDestinationOptions$Builder]))


(defn lambda-destination-builder>
  "The lambda-destination-builder> function updates a LambdaDestination$Builder instance using the provided configuration.
  The function takes the LambdaDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-only` |
"
  [^LambdaDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :response-only)]
    (. builder responseOnly data))
  (.build builder))


(defn lambda-destination-builder
  "Creates a  `LambdaDestination$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.lambda.IFunction]___
| Argument | DataType | Description |
|---|---|---|
| handler | software.amazon.awscdk.services.lambda.IFunction |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IFunction handler id config]
  (lambda-destination-builder> (LambdaDestination$Builder/create handler) id config))


(defn lambda-destination-options-builder>
  "The lambda-destination-options-builder> function updates a LambdaDestinationOptions$Builder instance using the provided configuration.
  The function takes the LambdaDestinationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:response-only` |
"
  [^LambdaDestinationOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :response-only)]
    (. builder responseOnly data))
  (.build builder))


(defn lambda-destination-options-builder
  "Creates a  `LambdaDestinationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-destination-options-builder> (new LambdaDestinationOptions$Builder) id config))