(ns cdk.api.services.codestarconnections
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codestarconnections package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codestarconnections CfnConnection$Builder
                                                                CfnConnectionProps$Builder
                                                                CfnRepositoryLink$Builder
                                                                CfnRepositoryLinkProps$Builder
                                                                CfnSyncConfiguration$Builder
                                                                CfnSyncConfigurationProps$Builder]))


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


(defn cfn-repository-link-builder
  "The cfn-repository-link-builder function buildes out new instances of 
CfnRepositoryLink$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `ownerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-id` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRepositoryLink$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-repository-link-props-builder
  "The cfn-repository-link-props-builder function buildes out new instances of 
CfnRepositoryLinkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `ownerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-id` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRepositoryLinkProps$Builder.)]
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
    (.build builder)))


(defn cfn-sync-configuration-builder
  "The cfn-sync-configuration-builder function buildes out new instances of 
CfnSyncConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `configFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-file` |
| `publishDeploymentStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-deployment-status` |
| `repositoryLinkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-link-id` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `syncType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-type` |
| `triggerResourceUpdateOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-resource-update-on` |"
  [stack id config]
  (let [builder (CfnSyncConfiguration$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-sync-configuration-props-builder
  "The cfn-sync-configuration-props-builder function buildes out new instances of 
CfnSyncConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `configFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-file` |
| `publishDeploymentStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-deployment-status` |
| `repositoryLinkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-link-id` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `syncType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-type` |
| `triggerResourceUpdateOn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-resource-update-on` |"
  [stack id config]
  (let [builder (CfnSyncConfigurationProps$Builder.)]
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
    (.build builder)))