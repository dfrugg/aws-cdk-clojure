(ns cdk.api.services.codegurureviewer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codegurureviewer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codegurureviewer CfnRepositoryAssociation$Builder
                                                             CfnRepositoryAssociationProps$Builder]))


(defn cfn-repository-association-builder
  "The cfn-repository-association-builder function buildes out new instances of 
CfnRepositoryAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRepositoryAssociation$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-repository-association-props-builder
  "The cfn-repository-association-props-builder function buildes out new instances of 
CfnRepositoryAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRepositoryAssociationProps$Builder.)]
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
    (.build builder)))