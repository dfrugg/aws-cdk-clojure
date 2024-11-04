(ns cdk.api.services.iotfleethub
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotfleethub package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotfleethub CfnApplication$Builder
                                                        CfnApplicationProps$Builder]))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-description)]
      (. builder applicationDescription data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-description` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-description)]
      (. builder applicationDescription data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))