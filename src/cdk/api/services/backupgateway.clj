(ns cdk.api.services.backupgateway
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.backupgateway package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.backupgateway CfnHypervisor$Builder
                                                          CfnHypervisorProps$Builder]))


(defn cfn-hypervisor-builder
  "The cfn-hypervisor-builder function buildes out new instances of 
CfnHypervisor$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnHypervisor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :log-group-arn)]
      (. builder logGroupArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-hypervisor-props-builder
  "The cfn-hypervisor-props-builder function buildes out new instances of 
CfnHypervisorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnHypervisorProps$Builder.)]
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :log-group-arn)]
      (. builder logGroupArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))