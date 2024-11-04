(ns cdk.api.services.healthimaging
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.healthimaging package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.healthimaging CfnDatastore$Builder
                                                          CfnDatastoreProps$Builder]))


(defn cfn-datastore-builder
  "The cfn-datastore-builder function buildes out new instances of 
CfnDatastore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatastore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-datastore-props-builder
  "The cfn-datastore-props-builder function buildes out new instances of 
CfnDatastoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatastoreProps$Builder.)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))