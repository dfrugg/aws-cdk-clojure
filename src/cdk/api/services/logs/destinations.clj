(ns cdk.api.services.logs.destinations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.logs.destinations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesis IStream]
           [software.amazon.awscdk.services.lambda IFunction]
           [software.amazon.awscdk.services.logs.destinations KinesisDestination$Builder
                                                              KinesisDestinationProps$Builder
                                                              LambdaDestination$Builder
                                                              LambdaDestinationOptions$Builder]))


(defn build-kinesis-destination-builder
  "The build-kinesis-destination-builder function updates a KinesisDestination$Builder instance using the provided configuration.
  The function takes the KinesisDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^KinesisDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn kinesis-destination-builder
  "Creates a  `KinesisDestination$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.kinesis.IStream]___
| Argument | DataType | Description |
|---|---|---|
| stream | software.amazon.awscdk.services.kinesis.IStream |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IStream stream id config]
  (build-kinesis-destination-builder (KinesisDestination$Builder/create stream) id config))


(defn build-kinesis-destination-props-builder
  "The build-kinesis-destination-props-builder function updates a KinesisDestinationProps$Builder instance using the provided configuration.
  The function takes the KinesisDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^KinesisDestinationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn kinesis-destination-props-builder
  "Creates a  `KinesisDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-kinesis-destination-props-builder (new KinesisDestinationProps$Builder) id config))


(defn build-lambda-destination-builder
  "The build-lambda-destination-builder function updates a LambdaDestination$Builder instance using the provided configuration.
  The function takes the LambdaDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-permissions` |
"
  [^LambdaDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :add-permissions)]
    (. builder addPermissions data))
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
  (build-lambda-destination-builder (LambdaDestination$Builder/create handler) id config))


(defn build-lambda-destination-options-builder
  "The build-lambda-destination-options-builder function updates a LambdaDestinationOptions$Builder instance using the provided configuration.
  The function takes the LambdaDestinationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-permissions` |
"
  [^LambdaDestinationOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :add-permissions)]
    (. builder addPermissions data))
  (.build builder))


(defn lambda-destination-options-builder
  "Creates a  `LambdaDestinationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lambda-destination-options-builder (new LambdaDestinationOptions$Builder) id config))