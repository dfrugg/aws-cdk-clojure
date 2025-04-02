(ns cdk.api.services.codeconnections
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codeconnections package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codeconnections CfnConnection$Builder
                                                            CfnConnectionProps$Builder]))


(defn cfn-connection-builder>
  "The cfn-connection-builder> function updates a CfnConnection$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :host-arn)]
    (. builder hostArn data))
  (when-some [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connection-builder
  "Creates a  `CfnConnection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-connection-builder> (CfnConnection$Builder/create scope (name id)) id config))


(defn cfn-connection-props-builder>
  "The cfn-connection-props-builder> function updates a CfnConnectionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :connection-name)]
    (. builder connectionName data))
  (when-some [data (lookup-entry config id :host-arn)]
    (. builder hostArn data))
  (when-some [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connection-props-builder
  "Creates a  `CfnConnectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-connection-props-builder> (new CfnConnectionProps$Builder) id config))