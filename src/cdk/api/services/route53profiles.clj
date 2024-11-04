(ns cdk.api.services.route53profiles
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53profiles package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53profiles CfnProfile$Builder
                                                            CfnProfileAssociation$Builder
                                                            CfnProfileAssociationProps$Builder
                                                            CfnProfileProps$Builder
                                                            CfnProfileResourceAssociation$Builder
                                                            CfnProfileResourceAssociationProps$Builder]))


(defn cfn-profile-association-builder
  "The cfn-profile-association-builder function buildes out new instances of 
CfnProfileAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfileAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :profile-id)]
      (. builder profileId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-association-props-builder
  "The cfn-profile-association-props-builder function buildes out new instances of 
CfnProfileAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfileAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :profile-id)]
      (. builder profileId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-builder
  "The cfn-profile-builder function buildes out new instances of 
CfnProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-props-builder
  "The cfn-profile-props-builder function buildes out new instances of 
CfnProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-resource-association-builder
  "The cfn-profile-resource-association-builder function buildes out new instances of 
CfnProfileResourceAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourceProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-properties` |"
  [stack id config]
  (let [builder (CfnProfileResourceAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :profile-id)]
      (. builder profileId data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :resource-properties)]
      (. builder resourceProperties data))
    (.build builder)))


(defn cfn-profile-resource-association-props-builder
  "The cfn-profile-resource-association-props-builder function buildes out new instances of 
CfnProfileResourceAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourceProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-properties` |"
  [stack id config]
  (let [builder (CfnProfileResourceAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :profile-id)]
      (. builder profileId data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :resource-properties)]
      (. builder resourceProperties data))
    (.build builder)))