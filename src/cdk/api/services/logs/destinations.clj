(ns cdk.api.services.logs.destinations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.logs.destinations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.logs.destinations KinesisDestination$Builder
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
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


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
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


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
  (when-let [data (lookup-entry config id :add-permissions)]
    (. builder addPermissions data))
  (.build builder))


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
  (when-let [data (lookup-entry config id :add-permissions)]
    (. builder addPermissions data))
  (.build builder))