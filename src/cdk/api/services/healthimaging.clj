(ns cdk.api.services.healthimaging
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.healthimaging package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.healthimaging CfnDatastore$Builder
                                                          CfnDatastoreProps$Builder]))


(defn cfn-datastore-builder>
  "The cfn-datastore-builder> function updates a CfnDatastore$Builder instance using the provided configuration.
  The function takes the CfnDatastore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatastore$Builder builder id config]
  (when-some [data (lookup-entry config id :datastore-name)]
    (. builder datastoreName data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-datastore-builder
  "Creates a  `CfnDatastore$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-datastore-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-datastore-builder> (CfnDatastore$Builder/create scope (name id)) id config))


(defn cfn-datastore-props-builder>
  "The cfn-datastore-props-builder> function updates a CfnDatastoreProps$Builder instance using the provided configuration.
  The function takes the CfnDatastoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatastoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :datastore-name)]
    (. builder datastoreName data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-datastore-props-builder
  "Creates a  `CfnDatastoreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-datastore-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-datastore-props-builder> (new CfnDatastoreProps$Builder) id config))