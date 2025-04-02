(ns cdk.api.services.route53profiles
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53profiles package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53profiles CfnProfile$Builder
                                                            CfnProfileAssociation$Builder
                                                            CfnProfileAssociationProps$Builder
                                                            CfnProfileProps$Builder
                                                            CfnProfileResourceAssociation$Builder
                                                            CfnProfileResourceAssociationProps$Builder]))


(defn cfn-profile-association-builder>
  "The cfn-profile-association-builder> function updates a CfnProfileAssociation$Builder instance using the provided configuration.
  The function takes the CfnProfileAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfileAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :profile-id)]
    (. builder profileId data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-association-builder
  "Creates a  `CfnProfileAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-profile-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-profile-association-builder> (CfnProfileAssociation$Builder/create scope (name id)) id config))


(defn cfn-profile-association-props-builder>
  "The cfn-profile-association-props-builder> function updates a CfnProfileAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnProfileAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfileAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :profile-id)]
    (. builder profileId data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-association-props-builder
  "Creates a  `CfnProfileAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profile-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profile-association-props-builder> (new CfnProfileAssociationProps$Builder) id config))


(defn cfn-profile-builder>
  "The cfn-profile-builder> function updates a CfnProfile$Builder instance using the provided configuration.
  The function takes the CfnProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-builder
  "Creates a  `CfnProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-profile-builder> (CfnProfile$Builder/create scope (name id)) id config))


(defn cfn-profile-props-builder>
  "The cfn-profile-props-builder> function updates a CfnProfileProps$Builder instance using the provided configuration.
  The function takes the CfnProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-props-builder
  "Creates a  `CfnProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profile-props-builder> (new CfnProfileProps$Builder) id config))


(defn cfn-profile-resource-association-builder>
  "The cfn-profile-resource-association-builder> function updates a CfnProfileResourceAssociation$Builder instance using the provided configuration.
  The function takes the CfnProfileResourceAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourceProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-properties` |
"
  [^CfnProfileResourceAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :profile-id)]
    (. builder profileId data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :resource-properties)]
    (. builder resourceProperties data))
  (.build builder))


(defn cfn-profile-resource-association-builder
  "Creates a  `CfnProfileResourceAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-profile-resource-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-profile-resource-association-builder> (CfnProfileResourceAssociation$Builder/create scope (name id)) id config))


(defn cfn-profile-resource-association-props-builder>
  "The cfn-profile-resource-association-props-builder> function updates a CfnProfileResourceAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnProfileResourceAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `resourceProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-properties` |
"
  [^CfnProfileResourceAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :profile-id)]
    (. builder profileId data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :resource-properties)]
    (. builder resourceProperties data))
  (.build builder))


(defn cfn-profile-resource-association-props-builder
  "Creates a  `CfnProfileResourceAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profile-resource-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profile-resource-association-props-builder> (new CfnProfileResourceAssociationProps$Builder) id config))