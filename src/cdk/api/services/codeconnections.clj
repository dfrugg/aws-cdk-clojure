(ns cdk.api.services.codeconnections
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codeconnections package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codeconnections CfnConnection$Builder
                                                            CfnConnectionProps$Builder]))


(defn build-cfn-connection-builder
  "The build-cfn-connection-builder function updates a CfnConnection$Builder instance using the provided configuration.
  The function takes the CfnConnection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `hostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-arn` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnection$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-let [data (lookup-entry config id :host-arn)]
    (. builder hostArn data))
  (when-let [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-connection-props-builder
  "The build-cfn-connection-props-builder function updates a CfnConnectionProps$Builder instance using the provided configuration.
  The function takes the CfnConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-name` |
| `hostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-arn` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-let [data (lookup-entry config id :host-arn)]
    (. builder hostArn data))
  (when-let [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))