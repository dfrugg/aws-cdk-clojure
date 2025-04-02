(ns cdk.api.services.workspaces
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.workspaces package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.workspaces CfnConnectionAlias$Builder
                                                       CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder
                                                       CfnConnectionAliasProps$Builder
                                                       CfnWorkspace$Builder
                                                       CfnWorkspace$WorkspacePropertiesProperty$Builder
                                                       CfnWorkspaceProps$Builder]))


(defn cfn-connection-alias-builder>
  "The cfn-connection-alias-builder> function updates a CfnConnectionAlias$Builder instance using the provided configuration.
  The function takes the CfnConnectionAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectionAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-string)]
    (. builder connectionString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connection-alias-builder
  "Creates a  `CfnConnectionAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-connection-alias-builder> (CfnConnectionAlias$Builder/create scope (name id)) id config))


(defn cfn-connection-alias-connection-alias-association-property-builder>
  "The cfn-connection-alias-connection-alias-association-property-builder> function updates a CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:associated-account-id` |
| `associationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-status` |
| `connectionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-identifier` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :associated-account-id)]
    (. builder associatedAccountId data))
  (when-some [data (lookup-entry config id :association-status)]
    (. builder associationStatus data))
  (when-some [data (lookup-entry config id :connection-identifier)]
    (. builder connectionIdentifier data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-connection-alias-connection-alias-association-property-builder
  "Creates a  `CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-connection-alias-connection-alias-association-property-builder> (new CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder) id config))


(defn cfn-connection-alias-props-builder>
  "The cfn-connection-alias-props-builder> function updates a CfnConnectionAliasProps$Builder instance using the provided configuration.
  The function takes the CfnConnectionAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectionAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-string)]
    (. builder connectionString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connection-alias-props-builder
  "Creates a  `CfnConnectionAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-connection-alias-props-builder> (new CfnConnectionAliasProps$Builder) id config))


(defn cfn-workspace-builder>
  "The cfn-workspace-builder> function updates a CfnWorkspace$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `rootVolumeEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:root-volume-encryption-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
| `userVolumeEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-volume-encryption-enabled` |
| `volumeEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
| `workspaceProperties` | software.amazon.awscdk.services.workspaces.CfnWorkspace$WorkspacePropertiesProperty | [[cdk.support/lookup-entry]] | `:workspace-properties` |
"
  [^CfnWorkspace$Builder builder id config]
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :root-volume-encryption-enabled)]
    (. builder rootVolumeEncryptionEnabled data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (when-some [data (lookup-entry config id :user-volume-encryption-enabled)]
    (. builder userVolumeEncryptionEnabled data))
  (when-some [data (lookup-entry config id :volume-encryption-key)]
    (. builder volumeEncryptionKey data))
  (when-some [data (lookup-entry config id :workspace-properties)]
    (. builder workspaceProperties data))
  (.build builder))


(defn cfn-workspace-builder
  "Creates a  `CfnWorkspace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workspace-builder> (CfnWorkspace$Builder/create scope (name id)) id config))


(defn cfn-workspace-props-builder>
  "The cfn-workspace-props-builder> function updates a CfnWorkspaceProps$Builder instance using the provided configuration.
  The function takes the CfnWorkspaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `rootVolumeEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:root-volume-encryption-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
| `userVolumeEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-volume-encryption-enabled` |
| `volumeEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
| `workspaceProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workspace-properties` |
"
  [^CfnWorkspaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :root-volume-encryption-enabled)]
    (. builder rootVolumeEncryptionEnabled data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (when-some [data (lookup-entry config id :user-volume-encryption-enabled)]
    (. builder userVolumeEncryptionEnabled data))
  (when-some [data (lookup-entry config id :volume-encryption-key)]
    (. builder volumeEncryptionKey data))
  (when-some [data (lookup-entry config id :workspace-properties)]
    (. builder workspaceProperties data))
  (.build builder))


(defn cfn-workspace-props-builder
  "Creates a  `CfnWorkspaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-workspace-props-builder> (new CfnWorkspaceProps$Builder) id config))


(defn cfn-workspace-workspace-properties-property-builder>
  "The cfn-workspace-workspace-properties-property-builder> function updates a CfnWorkspace$WorkspacePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$WorkspacePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type-name` |
| `rootVolumeSizeGib` | java.lang.Number | [[cdk.support/lookup-entry]] | `:root-volume-size-gib` |
| `runningMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:running-mode` |
| `runningModeAutoStopTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:running-mode-auto-stop-timeout-in-minutes` |
| `userVolumeSizeGib` | java.lang.Number | [[cdk.support/lookup-entry]] | `:user-volume-size-gib` |
"
  [^CfnWorkspace$WorkspacePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-type-name)]
    (. builder computeTypeName data))
  (when-some [data (lookup-entry config id :root-volume-size-gib)]
    (. builder rootVolumeSizeGib data))
  (when-some [data (lookup-entry config id :running-mode)]
    (. builder runningMode data))
  (when-some [data (lookup-entry config id :running-mode-auto-stop-timeout-in-minutes)]
    (. builder runningModeAutoStopTimeoutInMinutes data))
  (when-some [data (lookup-entry config id :user-volume-size-gib)]
    (. builder userVolumeSizeGib data))
  (.build builder))


(defn cfn-workspace-workspace-properties-property-builder
  "Creates a  `CfnWorkspace$WorkspacePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-workspace-workspace-properties-property-builder> (new CfnWorkspace$WorkspacePropertiesProperty$Builder) id config))