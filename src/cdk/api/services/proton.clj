(ns cdk.api.services.proton
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.proton package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.proton CfnEnvironmentAccountConnection$Builder
                                                   CfnEnvironmentAccountConnectionProps$Builder
                                                   CfnEnvironmentTemplate$Builder
                                                   CfnEnvironmentTemplateProps$Builder
                                                   CfnServiceTemplate$Builder
                                                   CfnServiceTemplateProps$Builder]))


(defn cfn-environment-account-connection-builder
  "The cfn-environment-account-connection-builder function buildes out new instances of 
CfnEnvironmentAccountConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codebuildRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:codebuild-role-arn` |
| `componentRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-role-arn` |
| `environmentAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-account-id` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `managementAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:management-account-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentAccountConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :codebuild-role-arn)]
      (. builder codebuildRoleArn data))
    (when-let [data (lookup-entry config id :component-role-arn)]
      (. builder componentRoleArn data))
    (when-let [data (lookup-entry config id :environment-account-id)]
      (. builder environmentAccountId data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :management-account-id)]
      (. builder managementAccountId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-account-connection-props-builder
  "The cfn-environment-account-connection-props-builder function buildes out new instances of 
CfnEnvironmentAccountConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codebuildRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:codebuild-role-arn` |
| `componentRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-role-arn` |
| `environmentAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-account-id` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `managementAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:management-account-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentAccountConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :codebuild-role-arn)]
      (. builder codebuildRoleArn data))
    (when-let [data (lookup-entry config id :component-role-arn)]
      (. builder componentRoleArn data))
    (when-let [data (lookup-entry config id :environment-account-id)]
      (. builder environmentAccountId data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :management-account-id)]
      (. builder managementAccountId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-template-builder
  "The cfn-environment-template-builder function buildes out new instances of 
CfnEnvironmentTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :provisioning)]
      (. builder provisioning data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-template-props-builder
  "The cfn-environment-template-props-builder function buildes out new instances of 
CfnEnvironmentTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :provisioning)]
      (. builder provisioning data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-template-builder
  "The cfn-service-template-builder function buildes out new instances of 
CfnServiceTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pipelineProvisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pipeline-provisioning)]
      (. builder pipelineProvisioning data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-template-props-builder
  "The cfn-service-template-props-builder function buildes out new instances of 
CfnServiceTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pipelineProvisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pipeline-provisioning)]
      (. builder pipelineProvisioning data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))