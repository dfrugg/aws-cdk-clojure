(ns cdk.api.services.proton
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.proton package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.proton CfnEnvironmentAccountConnection$Builder
                                                   CfnEnvironmentAccountConnectionProps$Builder
                                                   CfnEnvironmentTemplate$Builder
                                                   CfnEnvironmentTemplateProps$Builder
                                                   CfnServiceTemplate$Builder
                                                   CfnServiceTemplateProps$Builder]))


(defn build-cfn-environment-account-connection-builder
  "The build-cfn-environment-account-connection-builder function updates a CfnEnvironmentAccountConnection$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentAccountConnection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codebuildRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:codebuild-role-arn` |
| `componentRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-role-arn` |
| `environmentAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-account-id` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `managementAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:management-account-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentAccountConnection$Builder builder id config]
  (when-some [data (lookup-entry config id :codebuild-role-arn)]
    (. builder codebuildRoleArn data))
  (when-some [data (lookup-entry config id :component-role-arn)]
    (. builder componentRoleArn data))
  (when-some [data (lookup-entry config id :environment-account-id)]
    (. builder environmentAccountId data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :management-account-id)]
    (. builder managementAccountId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-account-connection-builder
  "Creates a  `CfnEnvironmentAccountConnection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-account-connection-builder (CfnEnvironmentAccountConnection$Builder/create scope (name id)) id config))


(defn build-cfn-environment-account-connection-props-builder
  "The build-cfn-environment-account-connection-props-builder function updates a CfnEnvironmentAccountConnectionProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentAccountConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codebuildRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:codebuild-role-arn` |
| `componentRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-role-arn` |
| `environmentAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-account-id` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `managementAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:management-account-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentAccountConnectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :codebuild-role-arn)]
    (. builder codebuildRoleArn data))
  (when-some [data (lookup-entry config id :component-role-arn)]
    (. builder componentRoleArn data))
  (when-some [data (lookup-entry config id :environment-account-id)]
    (. builder environmentAccountId data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :management-account-id)]
    (. builder managementAccountId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-account-connection-props-builder
  "Creates a  `CfnEnvironmentAccountConnectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-environment-account-connection-props-builder (new CfnEnvironmentAccountConnectionProps$Builder) id config))


(defn build-cfn-environment-template-builder
  "The build-cfn-environment-template-builder function updates a CfnEnvironmentTemplate$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :provisioning)]
    (. builder provisioning data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-template-builder
  "Creates a  `CfnEnvironmentTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-template-builder (CfnEnvironmentTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-environment-template-props-builder
  "The build-cfn-environment-template-props-builder function updates a CfnEnvironmentTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :provisioning)]
    (. builder provisioning data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-template-props-builder
  "Creates a  `CfnEnvironmentTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-environment-template-props-builder (new CfnEnvironmentTemplateProps$Builder) id config))


(defn build-cfn-service-template-builder
  "The build-cfn-service-template-builder function updates a CfnServiceTemplate$Builder instance using the provided configuration.
  The function takes the CfnServiceTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pipelineProvisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pipeline-provisioning)]
    (. builder pipelineProvisioning data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-template-builder
  "Creates a  `CfnServiceTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-service-template-builder (CfnServiceTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-service-template-props-builder
  "The build-cfn-service-template-props-builder function updates a CfnServiceTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnServiceTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pipelineProvisioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-provisioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pipeline-provisioning)]
    (. builder pipelineProvisioning data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-template-props-builder
  "Creates a  `CfnServiceTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-template-props-builder (new CfnServiceTemplateProps$Builder) id config))