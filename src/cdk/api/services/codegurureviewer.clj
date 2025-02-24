(ns cdk.api.services.codegurureviewer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codegurureviewer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codegurureviewer CfnRepositoryAssociation$Builder
                                                             CfnRepositoryAssociationProps$Builder]))


(defn build-cfn-repository-association-builder
  "The build-cfn-repository-association-builder function updates a CfnRepositoryAssociation$Builder instance using the provided configuration.
  The function takes the CfnRepositoryAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRepositoryAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-repository-association-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-repository-association-builder (CfnRepositoryAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-repository-association-props-builder
  "The build-cfn-repository-association-props-builder function updates a CfnRepositoryAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnRepositoryAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRepositoryAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-repository-association-props-builder
  ""
  [id config]
  (build-cfn-repository-association-props-builder (new CfnRepositoryAssociationProps$Builder) id config))