(ns cdk.api.services.workspaces
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.workspaces package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.workspaces CfnConnectionAlias$Builder
                                                       CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder
                                                       CfnConnectionAliasProps$Builder
                                                       CfnWorkspace$Builder
                                                       CfnWorkspace$WorkspacePropertiesProperty$Builder
                                                       CfnWorkspaceProps$Builder]))


(defn cfn-connection-alias-builder
  "The cfn-connection-alias-builder function buildes out new instances of 
CfnConnectionAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectionAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-string)]
      (. builder connectionString data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-connection-alias-connection-alias-association-property-builder
  "The cfn-connection-alias-connection-alias-association-property-builder function buildes out new instances of 
CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:associated-account-id` |
| `associationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-status` |
| `connectionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-identifier` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnConnectionAlias$ConnectionAliasAssociationProperty$Builder.)]
    (when-let [data (lookup-entry config id :associated-account-id)]
      (. builder associatedAccountId data))
    (when-let [data (lookup-entry config id :association-status)]
      (. builder associationStatus data))
    (when-let [data (lookup-entry config id :connection-identifier)]
      (. builder connectionIdentifier data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-connection-alias-props-builder
  "The cfn-connection-alias-props-builder function buildes out new instances of 
CfnConnectionAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectionAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-string)]
      (. builder connectionString data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workspace-builder
  "The cfn-workspace-builder function buildes out new instances of 
CfnWorkspace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `rootVolumeEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:root-volume-encryption-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
| `userVolumeEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-volume-encryption-enabled` |
| `volumeEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
| `workspaceProperties` | software.amazon.awscdk.services.workspaces.CfnWorkspace$WorkspacePropertiesProperty | [[cdk.support/lookup-entry]] | `:workspace-properties` |"
  [stack id config]
  (let [builder (CfnWorkspace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :root-volume-encryption-enabled)]
      (. builder rootVolumeEncryptionEnabled data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (when-let [data (lookup-entry config id :user-volume-encryption-enabled)]
      (. builder userVolumeEncryptionEnabled data))
    (when-let [data (lookup-entry config id :volume-encryption-key)]
      (. builder volumeEncryptionKey data))
    (when-let [data (lookup-entry config id :workspace-properties)]
      (. builder workspaceProperties data))
    (.build builder)))


(defn cfn-workspace-props-builder
  "The cfn-workspace-props-builder function buildes out new instances of 
CfnWorkspaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `rootVolumeEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:root-volume-encryption-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
| `userVolumeEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-volume-encryption-enabled` |
| `volumeEncryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
| `workspaceProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workspace-properties` |"
  [stack id config]
  (let [builder (CfnWorkspaceProps$Builder.)]
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :root-volume-encryption-enabled)]
      (. builder rootVolumeEncryptionEnabled data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (when-let [data (lookup-entry config id :user-volume-encryption-enabled)]
      (. builder userVolumeEncryptionEnabled data))
    (when-let [data (lookup-entry config id :volume-encryption-key)]
      (. builder volumeEncryptionKey data))
    (when-let [data (lookup-entry config id :workspace-properties)]
      (. builder workspaceProperties data))
    (.build builder)))


(defn cfn-workspace-workspace-properties-property-builder
  "The cfn-workspace-workspace-properties-property-builder function buildes out new instances of 
CfnWorkspace$WorkspacePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type-name` |
| `rootVolumeSizeGib` | java.lang.Number | [[cdk.support/lookup-entry]] | `:root-volume-size-gib` |
| `runningMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:running-mode` |
| `runningModeAutoStopTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:running-mode-auto-stop-timeout-in-minutes` |
| `userVolumeSizeGib` | java.lang.Number | [[cdk.support/lookup-entry]] | `:user-volume-size-gib` |"
  [stack id config]
  (let [builder (CfnWorkspace$WorkspacePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-type-name)]
      (. builder computeTypeName data))
    (when-let [data (lookup-entry config id :root-volume-size-gib)]
      (. builder rootVolumeSizeGib data))
    (when-let [data (lookup-entry config id :running-mode)]
      (. builder runningMode data))
    (when-let [data (lookup-entry config id :running-mode-auto-stop-timeout-in-minutes)]
      (. builder runningModeAutoStopTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :user-volume-size-gib)]
      (. builder userVolumeSizeGib data))
    (.build builder)))