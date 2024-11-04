(ns cdk.api.services.codeconnections
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codeconnections package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codeconnections CfnConnection$Builder
                                                            CfnConnectionProps$Builder]))


(defn cfn-connection-builder
  "The cfn-connection-builder function buildes out new instances of 
CfnConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `hostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-arn` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :host-arn)]
      (. builder hostArn data))
    (when-let [data (lookup-entry config id :provider-type)]
      (. builder providerType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-connection-props-builder
  "The cfn-connection-props-builder function buildes out new instances of 
CfnConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `hostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-arn` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-name)]
      (. builder connectionName data))
    (when-let [data (lookup-entry config id :host-arn)]
      (. builder hostArn data))
    (when-let [data (lookup-entry config id :provider-type)]
      (. builder providerType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))