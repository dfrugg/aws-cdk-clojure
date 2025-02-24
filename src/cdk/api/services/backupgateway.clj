(ns cdk.api.services.backupgateway
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.backupgateway package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.backupgateway CfnHypervisor$Builder
                                                          CfnHypervisorProps$Builder]))


(defn build-cfn-hypervisor-builder
  "The build-cfn-hypervisor-builder function updates a CfnHypervisor$Builder instance using the provided configuration.
  The function takes the CfnHypervisor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnHypervisor$Builder builder id config]
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
  (.build builder))


(defn cfn-hypervisor-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-hypervisor-builder (CfnHypervisor$Builder/create scope (name id)) id config))


(defn build-cfn-hypervisor-props-builder
  "The build-cfn-hypervisor-props-builder function updates a CfnHypervisorProps$Builder instance using the provided configuration.
  The function takes the CfnHypervisorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnHypervisorProps$Builder builder id config]
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
  (.build builder))


(defn cfn-hypervisor-props-builder
  ""
  [id config]
  (build-cfn-hypervisor-props-builder (new CfnHypervisorProps$Builder) id config))