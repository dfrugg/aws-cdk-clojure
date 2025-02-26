(ns cdk.api.services.codestarconnections
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codestarconnections package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codestarconnections CfnConnection$Builder
                                                                CfnConnectionProps$Builder
                                                                CfnRepositoryLink$Builder
                                                                CfnRepositoryLinkProps$Builder
                                                                CfnSyncConfiguration$Builder
                                                                CfnSyncConfigurationProps$Builder]))


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


(defn cfn-connection-builder
  "Creates a  `CfnConnection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-connection-builder (CfnConnection$Builder/create scope (name id)) id config))


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


(defn cfn-connection-props-builder
  "Creates a  `CfnConnectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connection-props-builder (new CfnConnectionProps$Builder) id config))


(defn build-cfn-repository-link-builder
  "The build-cfn-repository-link-builder function updates a CfnRepositoryLink$Builder instance using the provided configuration.
  The function takes the CfnRepositoryLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `ownerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-id` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRepositoryLink$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-let [data (lookup-entry config id :owner-id)]
    (. builder ownerId data))
  (when-let [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-repository-link-builder
  "Creates a  `CfnRepositoryLink$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-repository-link-builder (CfnRepositoryLink$Builder/create scope (name id)) id config))


(defn build-cfn-repository-link-props-builder
  "The build-cfn-repository-link-props-builder function updates a CfnRepositoryLinkProps$Builder instance using the provided configuration.
  The function takes the CfnRepositoryLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `ownerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-id` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRepositoryLinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-let [data (lookup-entry config id :owner-id)]
    (. builder ownerId data))
  (when-let [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-repository-link-props-builder
  "Creates a  `CfnRepositoryLinkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-repository-link-props-builder (new CfnRepositoryLinkProps$Builder) id config))


(defn build-cfn-sync-configuration-builder
  "The build-cfn-sync-configuration-builder function updates a CfnSyncConfiguration$Builder instance using the provided configuration.
  The function takes the CfnSyncConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `configFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-file` |
| `publishDeploymentStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-deployment-status` |
| `repositoryLinkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-link-id` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `syncType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-type` |
| `triggerResourceUpdateOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-resource-update-on` |
"
  [^CfnSyncConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-let [data (lookup-entry config id :config-file)]
    (. builder configFile data))
  (when-let [data (lookup-entry config id :publish-deployment-status)]
    (. builder publishDeploymentStatus data))
  (when-let [data (lookup-entry config id :repository-link-id)]
    (. builder repositoryLinkId data))
  (when-let [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sync-type)]
    (. builder syncType data))
  (when-let [data (lookup-entry config id :trigger-resource-update-on)]
    (. builder triggerResourceUpdateOn data))
  (.build builder))


(defn cfn-sync-configuration-builder
  "Creates a  `CfnSyncConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-sync-configuration-builder (CfnSyncConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-sync-configuration-props-builder
  "The build-cfn-sync-configuration-props-builder function updates a CfnSyncConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnSyncConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `configFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-file` |
| `publishDeploymentStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-deployment-status` |
| `repositoryLinkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-link-id` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `syncType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-type` |
| `triggerResourceUpdateOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-resource-update-on` |
"
  [^CfnSyncConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-let [data (lookup-entry config id :config-file)]
    (. builder configFile data))
  (when-let [data (lookup-entry config id :publish-deployment-status)]
    (. builder publishDeploymentStatus data))
  (when-let [data (lookup-entry config id :repository-link-id)]
    (. builder repositoryLinkId data))
  (when-let [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sync-type)]
    (. builder syncType data))
  (when-let [data (lookup-entry config id :trigger-resource-update-on)]
    (. builder triggerResourceUpdateOn data))
  (.build builder))


(defn cfn-sync-configuration-props-builder
  "Creates a  `CfnSyncConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-sync-configuration-props-builder (new CfnSyncConfigurationProps$Builder) id config))