(ns cdk.api.services.codepipeline.actions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codepipeline.actions package. "
  (:require [cdk.api.services.s3 :refer [bucket-access-control]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codepipeline.actions AlexaSkillDeployAction$Builder
                                                                 AlexaSkillDeployActionProps$Builder
                                                                 CloudFormationCreateReplaceChangeSetAction$Builder
                                                                 CloudFormationCreateReplaceChangeSetActionProps$Builder
                                                                 CloudFormationCreateUpdateStackAction$Builder
                                                                 CloudFormationCreateUpdateStackActionProps$Builder
                                                                 CloudFormationDeleteStackAction$Builder
                                                                 CloudFormationDeleteStackActionProps$Builder
                                                                 CloudFormationDeployStackInstancesAction$Builder
                                                                 CloudFormationDeployStackInstancesActionProps$Builder
                                                                 CloudFormationDeployStackSetAction$Builder
                                                                 CloudFormationDeployStackSetActionProps$Builder
                                                                 CloudFormationExecuteChangeSetAction$Builder
                                                                 CloudFormationExecuteChangeSetActionProps$Builder
                                                                 CodeBuildAction$Builder
                                                                 CodeBuildActionProps$Builder
                                                                 CodeBuildActionType
                                                                 CodeCommitSourceAction$Builder
                                                                 CodeCommitSourceActionProps$Builder
                                                                 CodeCommitSourceVariables$Builder
                                                                 CodeCommitTrigger
                                                                 CodeDeployEcsContainerImageInput$Builder
                                                                 CodeDeployEcsDeployAction$Builder
                                                                 CodeDeployEcsDeployActionProps$Builder
                                                                 CodeDeployServerDeployAction$Builder
                                                                 CodeDeployServerDeployActionProps$Builder
                                                                 CodeStarConnectionsSourceAction$Builder
                                                                 CodeStarConnectionsSourceActionProps$Builder
                                                                 CodeStarSourceVariables$Builder
                                                                 CommonCloudFormationStackSetOptions$Builder
                                                                 EcrSourceAction$Builder
                                                                 EcrSourceActionProps$Builder
                                                                 EcrSourceVariables$Builder
                                                                 EcsDeployAction$Builder
                                                                 EcsDeployActionProps$Builder
                                                                 ElasticBeanstalkDeployAction$Builder
                                                                 ElasticBeanstalkDeployActionProps$Builder
                                                                 GitHubSourceAction$Builder
                                                                 GitHubSourceActionProps$Builder
                                                                 GitHubSourceVariables$Builder
                                                                 GitHubTrigger
                                                                 JenkinsAction$Builder
                                                                 JenkinsActionProps$Builder
                                                                 JenkinsActionType
                                                                 JenkinsProvider$Builder
                                                                 JenkinsProviderAttributes$Builder
                                                                 JenkinsProviderProps$Builder
                                                                 LambdaInvokeAction$Builder
                                                                 LambdaInvokeActionProps$Builder
                                                                 ManualApprovalAction$Builder
                                                                 ManualApprovalActionProps$Builder
                                                                 OrganizationsDeploymentProps$Builder
                                                                 S3DeployAction$Builder
                                                                 S3DeployActionProps$Builder
                                                                 S3SourceAction$Builder
                                                                 S3SourceActionProps$Builder
                                                                 S3SourceVariables$Builder
                                                                 S3Trigger
                                                                 SelfManagedDeploymentProps$Builder
                                                                 ServiceCatalogDeployActionBeta1$Builder
                                                                 ServiceCatalogDeployActionBeta1Props$Builder
                                                                 StackSetOrganizationsAutoDeployment
                                                                 StepFunctionInvokeAction$Builder
                                                                 StepFunctionsInvokeActionProps$Builder]))


(defn code-build-action-type
  "The `code-build-action-type` function data interprets values in the provided config data into a 
`CodeBuildActionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CodeBuildActionType` - the value is returned.
* is `:build` - `CodeBuildActionType/BUILD` is returned
* is `:test` - `CodeBuildActionType/TEST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CodeBuildActionType data) data
      (= :build data) CodeBuildActionType/BUILD
      (= :test data) CodeBuildActionType/TEST)))


(defn code-commit-trigger
  "The `code-commit-trigger` function data interprets values in the provided config data into a 
`CodeCommitTrigger` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CodeCommitTrigger` - the value is returned.
* is `:poll` - `CodeCommitTrigger/POLL` is returned
* is `:events` - `CodeCommitTrigger/EVENTS` is returned
* is `:none` - `CodeCommitTrigger/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CodeCommitTrigger data) data
      (= :poll data) CodeCommitTrigger/POLL
      (= :events data) CodeCommitTrigger/EVENTS
      (= :none data) CodeCommitTrigger/NONE)))


(defn git-hub-trigger
  "The `git-hub-trigger` function data interprets values in the provided config data into a 
`GitHubTrigger` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `GitHubTrigger` - the value is returned.
* is `:none` - `GitHubTrigger/NONE` is returned
* is `:webhook` - `GitHubTrigger/WEBHOOK` is returned
* is `:poll` - `GitHubTrigger/POLL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? GitHubTrigger data) data
      (= :none data) GitHubTrigger/NONE
      (= :webhook data) GitHubTrigger/WEBHOOK
      (= :poll data) GitHubTrigger/POLL)))


(defn jenkins-action-type
  "The `jenkins-action-type` function data interprets values in the provided config data into a 
`JenkinsActionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JenkinsActionType` - the value is returned.
* is `:test` - `JenkinsActionType/TEST` is returned
* is `:build` - `JenkinsActionType/BUILD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JenkinsActionType data) data
      (= :test data) JenkinsActionType/TEST
      (= :build data) JenkinsActionType/BUILD)))


(defn s3-trigger
  "The `s3-trigger` function data interprets values in the provided config data into a 
`S3Trigger` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `S3Trigger` - the value is returned.
* is `:events` - `S3Trigger/EVENTS` is returned
* is `:poll` - `S3Trigger/POLL` is returned
* is `:none` - `S3Trigger/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? S3Trigger data) data
      (= :events data) S3Trigger/EVENTS
      (= :poll data) S3Trigger/POLL
      (= :none data) S3Trigger/NONE)))


(defn stack-set-organizations-auto-deployment
  "The `stack-set-organizations-auto-deployment` function data interprets values in the provided config data into a 
`StackSetOrganizationsAutoDeployment` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StackSetOrganizationsAutoDeployment` - the value is returned.
* is `:enabled-with-stack-retention` - `StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION` is returned
* is `:disabled` - `StackSetOrganizationsAutoDeployment/DISABLED` is returned
* is `:enabled` - `StackSetOrganizationsAutoDeployment/ENABLED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StackSetOrganizationsAutoDeployment data) data
      (= :enabled-with-stack-retention data) StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION
      (= :disabled data) StackSetOrganizationsAutoDeployment/DISABLED
      (= :enabled data) StackSetOrganizationsAutoDeployment/ENABLED)))


(defn alexa-skill-deploy-action-builder>
  "The alexa-skill-deploy-action-builder> function updates a AlexaSkillDeployAction$Builder instance using the provided configuration.
  The function takes the AlexaSkillDeployAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `parameterOverridesArtifact` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:parameter-overrides-artifact` |
| `refreshToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:refresh-token` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `skillId` | java.lang.String | [[cdk.support/lookup-entry]] | `:skill-id` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^AlexaSkillDeployAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :parameter-overrides-artifact)]
    (. builder parameterOverridesArtifact data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :skill-id)]
    (. builder skillId data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn alexa-skill-deploy-action-builder
  "Creates a  `AlexaSkillDeployAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (alexa-skill-deploy-action-builder> (AlexaSkillDeployAction$Builder/create) id config))


(defn alexa-skill-deploy-action-props-builder>
  "The alexa-skill-deploy-action-props-builder> function updates a AlexaSkillDeployActionProps$Builder instance using the provided configuration.
  The function takes the AlexaSkillDeployActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `parameterOverridesArtifact` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:parameter-overrides-artifact` |
| `refreshToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:refresh-token` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `skillId` | java.lang.String | [[cdk.support/lookup-entry]] | `:skill-id` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^AlexaSkillDeployActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :parameter-overrides-artifact)]
    (. builder parameterOverridesArtifact data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :skill-id)]
    (. builder skillId data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn alexa-skill-deploy-action-props-builder
  "Creates a  `AlexaSkillDeployActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (alexa-skill-deploy-action-props-builder> (new AlexaSkillDeployActionProps$Builder) id config))


(defn cloud-formation-create-replace-change-set-action-builder>
  "The cloud-formation-create-replace-change-set-action-builder> function updates a CloudFormationCreateReplaceChangeSetAction$Builder instance using the provided configuration.
  The function takes the CloudFormationCreateReplaceChangeSetAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `adminPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-permissions` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `changeSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-set-name` |
| `deploymentRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:deployment-role` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `parameterOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateConfiguration` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationCreateReplaceChangeSetAction$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :admin-permissions)]
    (. builder adminPermissions data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :change-set-name)]
    (. builder changeSetName data))
  (when-some [data (lookup-entry config id :deployment-role)]
    (. builder deploymentRole data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-create-replace-change-set-action-builder
  "Creates a  `CloudFormationCreateReplaceChangeSetAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-create-replace-change-set-action-builder> (CloudFormationCreateReplaceChangeSetAction$Builder/create) id config))


(defn cloud-formation-create-replace-change-set-action-props-builder>
  "The cloud-formation-create-replace-change-set-action-props-builder> function updates a CloudFormationCreateReplaceChangeSetActionProps$Builder instance using the provided configuration.
  The function takes the CloudFormationCreateReplaceChangeSetActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `adminPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-permissions` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `changeSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-set-name` |
| `deploymentRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:deployment-role` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `parameterOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateConfiguration` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationCreateReplaceChangeSetActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :admin-permissions)]
    (. builder adminPermissions data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :change-set-name)]
    (. builder changeSetName data))
  (when-some [data (lookup-entry config id :deployment-role)]
    (. builder deploymentRole data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-create-replace-change-set-action-props-builder
  "Creates a  `CloudFormationCreateReplaceChangeSetActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-create-replace-change-set-action-props-builder> (new CloudFormationCreateReplaceChangeSetActionProps$Builder) id config))


(defn cloud-formation-create-update-stack-action-builder>
  "The cloud-formation-create-update-stack-action-builder> function updates a CloudFormationCreateUpdateStackAction$Builder instance using the provided configuration.
  The function takes the CloudFormationCreateUpdateStackAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `adminPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-permissions` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `deploymentRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:deployment-role` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `parameterOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `replaceOnFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-on-failure` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateConfiguration` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationCreateUpdateStackAction$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :admin-permissions)]
    (. builder adminPermissions data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :deployment-role)]
    (. builder deploymentRole data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :replace-on-failure)]
    (. builder replaceOnFailure data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-create-update-stack-action-builder
  "Creates a  `CloudFormationCreateUpdateStackAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-create-update-stack-action-builder> (CloudFormationCreateUpdateStackAction$Builder/create) id config))


(defn cloud-formation-create-update-stack-action-props-builder>
  "The cloud-formation-create-update-stack-action-props-builder> function updates a CloudFormationCreateUpdateStackActionProps$Builder instance using the provided configuration.
  The function takes the CloudFormationCreateUpdateStackActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `adminPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-permissions` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `deploymentRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:deployment-role` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `parameterOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `replaceOnFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-on-failure` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateConfiguration` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationCreateUpdateStackActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :admin-permissions)]
    (. builder adminPermissions data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :deployment-role)]
    (. builder deploymentRole data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :replace-on-failure)]
    (. builder replaceOnFailure data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-create-update-stack-action-props-builder
  "Creates a  `CloudFormationCreateUpdateStackActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-create-update-stack-action-props-builder> (new CloudFormationCreateUpdateStackActionProps$Builder) id config))


(defn cloud-formation-delete-stack-action-builder>
  "The cloud-formation-delete-stack-action-builder> function updates a CloudFormationDeleteStackAction$Builder instance using the provided configuration.
  The function takes the CloudFormationDeleteStackAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `adminPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-permissions` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `deploymentRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:deployment-role` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `parameterOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateConfiguration` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationDeleteStackAction$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :admin-permissions)]
    (. builder adminPermissions data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :deployment-role)]
    (. builder deploymentRole data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-delete-stack-action-builder
  "Creates a  `CloudFormationDeleteStackAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-delete-stack-action-builder> (CloudFormationDeleteStackAction$Builder/create) id config))


(defn cloud-formation-delete-stack-action-props-builder>
  "The cloud-formation-delete-stack-action-props-builder> function updates a CloudFormationDeleteStackActionProps$Builder instance using the provided configuration.
  The function takes the CloudFormationDeleteStackActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `adminPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-permissions` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `deploymentRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:deployment-role` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `parameterOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateConfiguration` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationDeleteStackActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :admin-permissions)]
    (. builder adminPermissions data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :deployment-role)]
    (. builder deploymentRole data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :template-configuration)]
    (. builder templateConfiguration data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-delete-stack-action-props-builder
  "Creates a  `CloudFormationDeleteStackActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-delete-stack-action-props-builder> (new CloudFormationDeleteStackActionProps$Builder) id config))


(defn cloud-formation-deploy-stack-instances-action-builder>
  "The cloud-formation-deploy-stack-instances-action-builder> function updates a CloudFormationDeployStackInstancesAction$Builder instance using the provided configuration.
  The function takes the CloudFormationDeployStackInstancesAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxAccountConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-account-concurrency-percentage` |
| `parameterOverrides` | software.amazon.awscdk.services.codepipeline.actions.StackSetParameters | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackInstances` | software.amazon.awscdk.services.codepipeline.actions.StackInstances | [[cdk.support/lookup-entry]] | `:stack-instances` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `stackSetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-region` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationDeployStackInstancesAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-account-concurrency-percentage)]
    (. builder maxAccountConcurrencyPercentage data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-instances)]
    (. builder stackInstances data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :stack-set-region)]
    (. builder stackSetRegion data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-deploy-stack-instances-action-builder
  "Creates a  `CloudFormationDeployStackInstancesAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-deploy-stack-instances-action-builder> (CloudFormationDeployStackInstancesAction$Builder/create) id config))


(defn cloud-formation-deploy-stack-instances-action-props-builder>
  "The cloud-formation-deploy-stack-instances-action-props-builder> function updates a CloudFormationDeployStackInstancesActionProps$Builder instance using the provided configuration.
  The function takes the CloudFormationDeployStackInstancesActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxAccountConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-account-concurrency-percentage` |
| `parameterOverrides` | software.amazon.awscdk.services.codepipeline.actions.StackSetParameters | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackInstances` | software.amazon.awscdk.services.codepipeline.actions.StackInstances | [[cdk.support/lookup-entry]] | `:stack-instances` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `stackSetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-region` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationDeployStackInstancesActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-account-concurrency-percentage)]
    (. builder maxAccountConcurrencyPercentage data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-instances)]
    (. builder stackInstances data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :stack-set-region)]
    (. builder stackSetRegion data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-deploy-stack-instances-action-props-builder
  "Creates a  `CloudFormationDeployStackInstancesActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-deploy-stack-instances-action-props-builder> (new CloudFormationDeployStackInstancesActionProps$Builder) id config))


(defn cloud-formation-deploy-stack-set-action-builder>
  "The cloud-formation-deploy-stack-set-action-builder> function updates a CloudFormationDeployStackSetAction$Builder instance using the provided configuration.
  The function takes the CloudFormationDeployStackSetAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `deploymentModel` | software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel | [[cdk.support/lookup-entry]] | `:deployment-model` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxAccountConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-account-concurrency-percentage` |
| `parameters` | software.amazon.awscdk.services.codepipeline.actions.StackSetParameters | [[cdk.support/lookup-entry]] | `:parameters` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackInstances` | software.amazon.awscdk.services.codepipeline.actions.StackInstances | [[cdk.support/lookup-entry]] | `:stack-instances` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `stackSetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-region` |
| `template` | software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate | [[cdk.support/lookup-entry]] | `:template` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationDeployStackSetAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :deployment-model)]
    (. builder deploymentModel data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-account-concurrency-percentage)]
    (. builder maxAccountConcurrencyPercentage data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-instances)]
    (. builder stackInstances data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :stack-set-region)]
    (. builder stackSetRegion data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-deploy-stack-set-action-builder
  "Creates a  `CloudFormationDeployStackSetAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-deploy-stack-set-action-builder> (CloudFormationDeployStackSetAction$Builder/create) id config))


(defn cloud-formation-deploy-stack-set-action-props-builder>
  "The cloud-formation-deploy-stack-set-action-props-builder> function updates a CloudFormationDeployStackSetActionProps$Builder instance using the provided configuration.
  The function takes the CloudFormationDeployStackSetActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `cfnCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:cfn-capabilities` |
| `deploymentModel` | software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel | [[cdk.support/lookup-entry]] | `:deployment-model` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxAccountConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-account-concurrency-percentage` |
| `parameters` | software.amazon.awscdk.services.codepipeline.actions.StackSetParameters | [[cdk.support/lookup-entry]] | `:parameters` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackInstances` | software.amazon.awscdk.services.codepipeline.actions.StackInstances | [[cdk.support/lookup-entry]] | `:stack-instances` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `stackSetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-region` |
| `template` | software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate | [[cdk.support/lookup-entry]] | `:template` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationDeployStackSetActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :cfn-capabilities)]
    (. builder cfnCapabilities data))
  (when-some [data (lookup-entry config id :deployment-model)]
    (. builder deploymentModel data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-account-concurrency-percentage)]
    (. builder maxAccountConcurrencyPercentage data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-instances)]
    (. builder stackInstances data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :stack-set-region)]
    (. builder stackSetRegion data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-deploy-stack-set-action-props-builder
  "Creates a  `CloudFormationDeployStackSetActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-deploy-stack-set-action-props-builder> (new CloudFormationDeployStackSetActionProps$Builder) id config))


(defn cloud-formation-execute-change-set-action-builder>
  "The cloud-formation-execute-change-set-action-builder> function updates a CloudFormationExecuteChangeSetAction$Builder instance using the provided configuration.
  The function takes the CloudFormationExecuteChangeSetAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `changeSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-set-name` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationExecuteChangeSetAction$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :change-set-name)]
    (. builder changeSetName data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-execute-change-set-action-builder
  "Creates a  `CloudFormationExecuteChangeSetAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-execute-change-set-action-builder> (CloudFormationExecuteChangeSetAction$Builder/create) id config))


(defn cloud-formation-execute-change-set-action-props-builder>
  "The cloud-formation-execute-change-set-action-props-builder> function updates a CloudFormationExecuteChangeSetActionProps$Builder instance using the provided configuration.
  The function takes the CloudFormationExecuteChangeSetActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `changeSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-set-name` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `outputFileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-file-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CloudFormationExecuteChangeSetActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :change-set-name)]
    (. builder changeSetName data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-file-name)]
    (. builder outputFileName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn cloud-formation-execute-change-set-action-props-builder
  "Creates a  `CloudFormationExecuteChangeSetActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-formation-execute-change-set-action-props-builder> (new CloudFormationExecuteChangeSetActionProps$Builder) id config))


(defn code-build-action-builder>
  "The code-build-action-builder> function updates a CodeBuildAction$Builder instance using the provided configuration.
  The function takes the CodeBuildAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `combineBatchBuildArtifacts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:combine-batch-build-artifacts` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `executeBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-batch-build` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `type` | software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType | [[cdk.api.services.codepipeline.actions/code-build-action-type]] | `:type` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeBuildAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :combine-batch-build-artifacts)]
    (. builder combineBatchBuildArtifacts data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :execute-batch-build)]
    (. builder executeBatchBuild data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (code-build-action-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-build-action-builder
  "Creates a  `CodeBuildAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-build-action-builder> (CodeBuildAction$Builder/create) id config))


(defn code-build-action-props-builder>
  "The code-build-action-props-builder> function updates a CodeBuildActionProps$Builder instance using the provided configuration.
  The function takes the CodeBuildActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `checkSecretsInPlainTextEnvVariables` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:check-secrets-in-plain-text-env-variables` |
| `combineBatchBuildArtifacts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:combine-batch-build-artifacts` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `executeBatchBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-batch-build` |
| `extraInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-inputs` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `type` | software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType | [[cdk.api.services.codepipeline.actions/code-build-action-type]] | `:type` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeBuildActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
    (. builder checkSecretsInPlainTextEnvVariables data))
  (when-some [data (lookup-entry config id :combine-batch-build-artifacts)]
    (. builder combineBatchBuildArtifacts data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :execute-batch-build)]
    (. builder executeBatchBuild data))
  (when-some [data (lookup-entry config id :extra-inputs)]
    (. builder extraInputs data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (code-build-action-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-build-action-props-builder
  "Creates a  `CodeBuildActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-build-action-props-builder> (new CodeBuildActionProps$Builder) id config))


(defn code-commit-source-action-builder>
  "The code-commit-source-action-builder> function updates a CodeCommitSourceAction$Builder instance using the provided configuration.
  The function takes the CodeCommitSourceAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `customEventRule` | software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule | [[cdk.support/lookup-entry]] | `:custom-event-rule` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `repository` | software.amazon.awscdk.services.codecommit.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger | [[cdk.api.services.codepipeline.actions/code-commit-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeCommitSourceAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :code-build-clone-output)]
    (. builder codeBuildCloneOutput data))
  (when-some [data (lookup-entry config id :custom-event-rule)]
    (. builder customEventRule data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (code-commit-trigger config id :trigger)]
    (. builder trigger data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-commit-source-action-builder
  "Creates a  `CodeCommitSourceAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-commit-source-action-builder> (CodeCommitSourceAction$Builder/create) id config))


(defn code-commit-source-action-props-builder>
  "The code-commit-source-action-props-builder> function updates a CodeCommitSourceActionProps$Builder instance using the provided configuration.
  The function takes the CodeCommitSourceActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `customEventRule` | software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule | [[cdk.support/lookup-entry]] | `:custom-event-rule` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `repository` | software.amazon.awscdk.services.codecommit.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger | [[cdk.api.services.codepipeline.actions/code-commit-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeCommitSourceActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :code-build-clone-output)]
    (. builder codeBuildCloneOutput data))
  (when-some [data (lookup-entry config id :custom-event-rule)]
    (. builder customEventRule data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (code-commit-trigger config id :trigger)]
    (. builder trigger data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-commit-source-action-props-builder
  "Creates a  `CodeCommitSourceActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-commit-source-action-props-builder> (new CodeCommitSourceActionProps$Builder) id config))


(defn code-commit-source-variables-builder>
  "The code-commit-source-variables-builder> function updates a CodeCommitSourceVariables$Builder instance using the provided configuration.
  The function takes the CodeCommitSourceVariables$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:author-date` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `commitMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-message` |
| `committerDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:committer-date` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^CodeCommitSourceVariables$Builder builder id config]
  (when-some [data (lookup-entry config id :author-date)]
    (. builder authorDate data))
  (when-some [data (lookup-entry config id :branch-name)]
    (. builder branchName data))
  (when-some [data (lookup-entry config id :commit-id)]
    (. builder commitId data))
  (when-some [data (lookup-entry config id :commit-message)]
    (. builder commitMessage data))
  (when-some [data (lookup-entry config id :committer-date)]
    (. builder committerDate data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn code-commit-source-variables-builder
  "Creates a  `CodeCommitSourceVariables$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-commit-source-variables-builder> (new CodeCommitSourceVariables$Builder) id config))


(defn code-deploy-ecs-container-image-input-builder>
  "The code-deploy-ecs-container-image-input-builder> function updates a CodeDeployEcsContainerImageInput$Builder instance using the provided configuration.
  The function takes the CodeDeployEcsContainerImageInput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `taskDefinitionPlaceholder` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-placeholder` |
"
  [^CodeDeployEcsContainerImageInput$Builder builder id config]
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :task-definition-placeholder)]
    (. builder taskDefinitionPlaceholder data))
  (.build builder))


(defn code-deploy-ecs-container-image-input-builder
  "Creates a  `CodeDeployEcsContainerImageInput$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-deploy-ecs-container-image-input-builder> (new CodeDeployEcsContainerImageInput$Builder) id config))


(defn code-deploy-ecs-deploy-action-builder>
  "The code-deploy-ecs-deploy-action-builder> function updates a CodeDeployEcsDeployAction$Builder instance using the provided configuration.
  The function takes the CodeDeployEcsDeployAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `appSpecTemplateFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:app-spec-template-file` |
| `appSpecTemplateInput` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:app-spec-template-input` |
| `containerImageInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:container-image-inputs` |
| `deploymentGroup` | software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup | [[cdk.support/lookup-entry]] | `:deployment-group` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `taskDefinitionTemplateFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:task-definition-template-file` |
| `taskDefinitionTemplateInput` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:task-definition-template-input` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeDeployEcsDeployAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :app-spec-template-file)]
    (. builder appSpecTemplateFile data))
  (when-some [data (lookup-entry config id :app-spec-template-input)]
    (. builder appSpecTemplateInput data))
  (when-some [data (lookup-entry config id :container-image-inputs)]
    (. builder containerImageInputs data))
  (when-some [data (lookup-entry config id :deployment-group)]
    (. builder deploymentGroup data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :task-definition-template-file)]
    (. builder taskDefinitionTemplateFile data))
  (when-some [data (lookup-entry config id :task-definition-template-input)]
    (. builder taskDefinitionTemplateInput data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-deploy-ecs-deploy-action-builder
  "Creates a  `CodeDeployEcsDeployAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-deploy-ecs-deploy-action-builder> (CodeDeployEcsDeployAction$Builder/create) id config))


(defn code-deploy-ecs-deploy-action-props-builder>
  "The code-deploy-ecs-deploy-action-props-builder> function updates a CodeDeployEcsDeployActionProps$Builder instance using the provided configuration.
  The function takes the CodeDeployEcsDeployActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `appSpecTemplateFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:app-spec-template-file` |
| `appSpecTemplateInput` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:app-spec-template-input` |
| `containerImageInputs` | java.util.List | [[cdk.support/lookup-entry]] | `:container-image-inputs` |
| `deploymentGroup` | software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup | [[cdk.support/lookup-entry]] | `:deployment-group` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `taskDefinitionTemplateFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:task-definition-template-file` |
| `taskDefinitionTemplateInput` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:task-definition-template-input` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeDeployEcsDeployActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :app-spec-template-file)]
    (. builder appSpecTemplateFile data))
  (when-some [data (lookup-entry config id :app-spec-template-input)]
    (. builder appSpecTemplateInput data))
  (when-some [data (lookup-entry config id :container-image-inputs)]
    (. builder containerImageInputs data))
  (when-some [data (lookup-entry config id :deployment-group)]
    (. builder deploymentGroup data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :task-definition-template-file)]
    (. builder taskDefinitionTemplateFile data))
  (when-some [data (lookup-entry config id :task-definition-template-input)]
    (. builder taskDefinitionTemplateInput data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-deploy-ecs-deploy-action-props-builder
  "Creates a  `CodeDeployEcsDeployActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-deploy-ecs-deploy-action-props-builder> (new CodeDeployEcsDeployActionProps$Builder) id config))


(defn code-deploy-server-deploy-action-builder>
  "The code-deploy-server-deploy-action-builder> function updates a CodeDeployServerDeployAction$Builder instance using the provided configuration.
  The function takes the CodeDeployServerDeployAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentGroup` | software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup | [[cdk.support/lookup-entry]] | `:deployment-group` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeDeployServerDeployAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :deployment-group)]
    (. builder deploymentGroup data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-deploy-server-deploy-action-builder
  "Creates a  `CodeDeployServerDeployAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-deploy-server-deploy-action-builder> (CodeDeployServerDeployAction$Builder/create) id config))


(defn code-deploy-server-deploy-action-props-builder>
  "The code-deploy-server-deploy-action-props-builder> function updates a CodeDeployServerDeployActionProps$Builder instance using the provided configuration.
  The function takes the CodeDeployServerDeployActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentGroup` | software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup | [[cdk.support/lookup-entry]] | `:deployment-group` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeDeployServerDeployActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :deployment-group)]
    (. builder deploymentGroup data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-deploy-server-deploy-action-props-builder
  "Creates a  `CodeDeployServerDeployActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-deploy-server-deploy-action-props-builder> (new CodeDeployServerDeployActionProps$Builder) id config))


(defn code-star-connections-source-action-builder>
  "The code-star-connections-source-action-builder> function updates a CodeStarConnectionsSourceAction$Builder instance using the provided configuration.
  The function takes the CodeStarConnectionsSourceAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `repo` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `triggerOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trigger-on-push` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeStarConnectionsSourceAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :code-build-clone-output)]
    (. builder codeBuildCloneOutput data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :repo)]
    (. builder repo data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :trigger-on-push)]
    (. builder triggerOnPush data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-star-connections-source-action-builder
  "Creates a  `CodeStarConnectionsSourceAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-star-connections-source-action-builder> (CodeStarConnectionsSourceAction$Builder/create) id config))


(defn code-star-connections-source-action-props-builder>
  "The code-star-connections-source-action-props-builder> function updates a CodeStarConnectionsSourceActionProps$Builder instance using the provided configuration.
  The function takes the CodeStarConnectionsSourceActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `codeBuildCloneOutput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:code-build-clone-output` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `repo` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `triggerOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trigger-on-push` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CodeStarConnectionsSourceActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :code-build-clone-output)]
    (. builder codeBuildCloneOutput data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :repo)]
    (. builder repo data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :trigger-on-push)]
    (. builder triggerOnPush data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn code-star-connections-source-action-props-builder
  "Creates a  `CodeStarConnectionsSourceActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-star-connections-source-action-props-builder> (new CodeStarConnectionsSourceActionProps$Builder) id config))


(defn code-star-source-variables-builder>
  "The code-star-source-variables-builder> function updates a CodeStarSourceVariables$Builder instance using the provided configuration.
  The function takes the CodeStarSourceVariables$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:author-date` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `commitMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-message` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `fullRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:full-repository-name` |
"
  [^CodeStarSourceVariables$Builder builder id config]
  (when-some [data (lookup-entry config id :author-date)]
    (. builder authorDate data))
  (when-some [data (lookup-entry config id :branch-name)]
    (. builder branchName data))
  (when-some [data (lookup-entry config id :commit-id)]
    (. builder commitId data))
  (when-some [data (lookup-entry config id :commit-message)]
    (. builder commitMessage data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-some [data (lookup-entry config id :full-repository-name)]
    (. builder fullRepositoryName data))
  (.build builder))


(defn code-star-source-variables-builder
  "Creates a  `CodeStarSourceVariables$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (code-star-source-variables-builder> (new CodeStarSourceVariables$Builder) id config))


(defn common-cloud-formation-stack-set-options-builder>
  "The common-cloud-formation-stack-set-options-builder> function updates a CommonCloudFormationStackSetOptions$Builder instance using the provided configuration.
  The function takes the CommonCloudFormationStackSetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxAccountConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-account-concurrency-percentage` |
| `stackSetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-region` |
"
  [^CommonCloudFormationStackSetOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-account-concurrency-percentage)]
    (. builder maxAccountConcurrencyPercentage data))
  (when-some [data (lookup-entry config id :stack-set-region)]
    (. builder stackSetRegion data))
  (.build builder))


(defn common-cloud-formation-stack-set-options-builder
  "Creates a  `CommonCloudFormationStackSetOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (common-cloud-formation-stack-set-options-builder> (new CommonCloudFormationStackSetOptions$Builder) id config))


(defn ecr-source-action-builder>
  "The ecr-source-action-builder> function updates a EcrSourceAction$Builder instance using the provided configuration.
  The function takes the EcrSourceAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `repository` | software.amazon.awscdk.services.ecr.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^EcrSourceAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn ecr-source-action-builder
  "Creates a  `EcrSourceAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecr-source-action-builder> (EcrSourceAction$Builder/create) id config))


(defn ecr-source-action-props-builder>
  "The ecr-source-action-props-builder> function updates a EcrSourceActionProps$Builder instance using the provided configuration.
  The function takes the EcrSourceActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `repository` | software.amazon.awscdk.services.ecr.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^EcrSourceActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn ecr-source-action-props-builder
  "Creates a  `EcrSourceActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecr-source-action-props-builder> (new EcrSourceActionProps$Builder) id config))


(defn ecr-source-variables-builder>
  "The ecr-source-variables-builder> function updates a EcrSourceVariables$Builder instance using the provided configuration.
  The function takes the EcrSourceVariables$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-digest` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `registryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-id` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^EcrSourceVariables$Builder builder id config]
  (when-some [data (lookup-entry config id :image-digest)]
    (. builder imageDigest data))
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-some [data (lookup-entry config id :registry-id)]
    (. builder registryId data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn ecr-source-variables-builder
  "Creates a  `EcrSourceVariables$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecr-source-variables-builder> (new EcrSourceVariables$Builder) id config))


(defn ecs-deploy-action-builder>
  "The ecs-deploy-action-builder> function updates a EcsDeployAction$Builder instance using the provided configuration.
  The function takes the EcsDeployAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-timeout` |
| `imageFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:image-file` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^EcsDeployAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :deployment-timeout)]
    (. builder deploymentTimeout data))
  (when-some [data (lookup-entry config id :image-file)]
    (. builder imageFile data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn ecs-deploy-action-builder
  "Creates a  `EcsDeployAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-deploy-action-builder> (EcsDeployAction$Builder/create) id config))


(defn ecs-deploy-action-props-builder>
  "The ecs-deploy-action-props-builder> function updates a EcsDeployActionProps$Builder instance using the provided configuration.
  The function takes the EcsDeployActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-timeout` |
| `imageFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:image-file` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^EcsDeployActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :deployment-timeout)]
    (. builder deploymentTimeout data))
  (when-some [data (lookup-entry config id :image-file)]
    (. builder imageFile data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn ecs-deploy-action-props-builder
  "Creates a  `EcsDeployActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-deploy-action-props-builder> (new EcsDeployActionProps$Builder) id config))


(defn elastic-beanstalk-deploy-action-builder>
  "The elastic-beanstalk-deploy-action-builder> function updates a ElasticBeanstalkDeployAction$Builder instance using the provided configuration.
  The function takes the ElasticBeanstalkDeployAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ElasticBeanstalkDeployAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn elastic-beanstalk-deploy-action-builder
  "Creates a  `ElasticBeanstalkDeployAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (elastic-beanstalk-deploy-action-builder> (ElasticBeanstalkDeployAction$Builder/create) id config))


(defn elastic-beanstalk-deploy-action-props-builder>
  "The elastic-beanstalk-deploy-action-props-builder> function updates a ElasticBeanstalkDeployActionProps$Builder instance using the provided configuration.
  The function takes the ElasticBeanstalkDeployActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ElasticBeanstalkDeployActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn elastic-beanstalk-deploy-action-props-builder
  "Creates a  `ElasticBeanstalkDeployActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (elastic-beanstalk-deploy-action-props-builder> (new ElasticBeanstalkDeployActionProps$Builder) id config))


(defn git-hub-source-action-builder>
  "The git-hub-source-action-builder> function updates a GitHubSourceAction$Builder instance using the provided configuration.
  The function takes the GitHubSourceAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `oauthToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:oauth-token` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `repo` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger | [[cdk.api.services.codepipeline.actions/git-hub-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^GitHubSourceAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :oauth-token)]
    (. builder oauthToken data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :repo)]
    (. builder repo data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (git-hub-trigger config id :trigger)]
    (. builder trigger data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn git-hub-source-action-builder
  "Creates a  `GitHubSourceAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (git-hub-source-action-builder> (GitHubSourceAction$Builder/create) id config))


(defn git-hub-source-action-props-builder>
  "The git-hub-source-action-props-builder> function updates a GitHubSourceActionProps$Builder instance using the provided configuration.
  The function takes the GitHubSourceActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `oauthToken` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:oauth-token` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `repo` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger | [[cdk.api.services.codepipeline.actions/git-hub-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^GitHubSourceActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :oauth-token)]
    (. builder oauthToken data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-some [data (lookup-entry config id :repo)]
    (. builder repo data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (git-hub-trigger config id :trigger)]
    (. builder trigger data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn git-hub-source-action-props-builder
  "Creates a  `GitHubSourceActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (git-hub-source-action-props-builder> (new GitHubSourceActionProps$Builder) id config))


(defn git-hub-source-variables-builder>
  "The git-hub-source-variables-builder> function updates a GitHubSourceVariables$Builder instance using the provided configuration.
  The function takes the GitHubSourceVariables$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:author-date` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `commitMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-message` |
| `commitUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-url` |
| `committerDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:committer-date` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^GitHubSourceVariables$Builder builder id config]
  (when-some [data (lookup-entry config id :author-date)]
    (. builder authorDate data))
  (when-some [data (lookup-entry config id :branch-name)]
    (. builder branchName data))
  (when-some [data (lookup-entry config id :commit-id)]
    (. builder commitId data))
  (when-some [data (lookup-entry config id :commit-message)]
    (. builder commitMessage data))
  (when-some [data (lookup-entry config id :commit-url)]
    (. builder commitUrl data))
  (when-some [data (lookup-entry config id :committer-date)]
    (. builder committerDate data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn git-hub-source-variables-builder
  "Creates a  `GitHubSourceVariables$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (git-hub-source-variables-builder> (new GitHubSourceVariables$Builder) id config))


(defn jenkins-action-builder>
  "The jenkins-action-builder> function updates a JenkinsAction$Builder instance using the provided configuration.
  The function takes the JenkinsAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `jenkinsProvider` | software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider | [[cdk.support/lookup-entry]] | `:jenkins-provider` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `type` | software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType | [[cdk.api.services.codepipeline.actions/jenkins-action-type]] | `:type` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^JenkinsAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (when-some [data (lookup-entry config id :jenkins-provider)]
    (. builder jenkinsProvider data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (jenkins-action-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn jenkins-action-builder
  "Creates a  `JenkinsAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (jenkins-action-builder> (JenkinsAction$Builder/create) id config))


(defn jenkins-action-props-builder>
  "The jenkins-action-props-builder> function updates a JenkinsActionProps$Builder instance using the provided configuration.
  The function takes the JenkinsActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `jenkinsProvider` | software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider | [[cdk.support/lookup-entry]] | `:jenkins-provider` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `type` | software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType | [[cdk.api.services.codepipeline.actions/jenkins-action-type]] | `:type` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^JenkinsActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (when-some [data (lookup-entry config id :jenkins-provider)]
    (. builder jenkinsProvider data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (jenkins-action-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn jenkins-action-props-builder
  "Creates a  `JenkinsActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (jenkins-action-props-builder> (new JenkinsActionProps$Builder) id config))


(defn jenkins-provider-attributes-builder>
  "The jenkins-provider-attributes-builder> function updates a JenkinsProviderAttributes$Builder instance using the provided configuration.
  The function takes the JenkinsProviderAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^JenkinsProviderAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-some [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn jenkins-provider-attributes-builder
  "Creates a  `JenkinsProviderAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (jenkins-provider-attributes-builder> (new JenkinsProviderAttributes$Builder) id config))


(defn jenkins-provider-builder>
  "The jenkins-provider-builder> function updates a JenkinsProvider$Builder instance using the provided configuration.
  The function takes the JenkinsProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-build` |
| `forTest` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-test` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^JenkinsProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :for-build)]
    (. builder forBuild data))
  (when-some [data (lookup-entry config id :for-test)]
    (. builder forTest data))
  (when-some [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-some [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn jenkins-provider-builder
  "Creates a  `JenkinsProvider$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (jenkins-provider-builder> (JenkinsProvider$Builder/create scope (name id)) id config))


(defn jenkins-provider-props-builder>
  "The jenkins-provider-props-builder> function updates a JenkinsProviderProps$Builder instance using the provided configuration.
  The function takes the JenkinsProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-build` |
| `forTest` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-test` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^JenkinsProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :for-build)]
    (. builder forBuild data))
  (when-some [data (lookup-entry config id :for-test)]
    (. builder forTest data))
  (when-some [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-some [data (lookup-entry config id :server-url)]
    (. builder serverUrl data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn jenkins-provider-props-builder
  "Creates a  `JenkinsProviderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (jenkins-provider-props-builder> (new JenkinsProviderProps$Builder) id config))


(defn lambda-invoke-action-builder>
  "The lambda-invoke-action-builder> function updates a LambdaInvokeAction$Builder instance using the provided configuration.
  The function takes the LambdaInvokeAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `lambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `userParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:user-parameters` |
| `userParametersString` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-parameters-string` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^LambdaInvokeAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (when-some [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :user-parameters)]
    (. builder userParameters data))
  (when-some [data (lookup-entry config id :user-parameters-string)]
    (. builder userParametersString data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn lambda-invoke-action-builder
  "Creates a  `LambdaInvokeAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-invoke-action-builder> (LambdaInvokeAction$Builder/create) id config))


(defn lambda-invoke-action-props-builder>
  "The lambda-invoke-action-props-builder> function updates a LambdaInvokeActionProps$Builder instance using the provided configuration.
  The function takes the LambdaInvokeActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `lambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `userParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:user-parameters` |
| `userParametersString` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-parameters-string` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^LambdaInvokeActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :inputs)]
    (. builder inputs data))
  (when-some [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :user-parameters)]
    (. builder userParameters data))
  (when-some [data (lookup-entry config id :user-parameters-string)]
    (. builder userParametersString data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn lambda-invoke-action-props-builder
  "Creates a  `LambdaInvokeActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-invoke-action-props-builder> (new LambdaInvokeActionProps$Builder) id config))


(defn manual-approval-action-builder>
  "The manual-approval-action-builder> function updates a ManualApprovalAction$Builder instance using the provided configuration.
  The function takes the ManualApprovalAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `additionalInformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-information` |
| `externalEntityLink` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-entity-link` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `notifyEmails` | java.util.List | [[cdk.support/lookup-entry]] | `:notify-emails` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ManualApprovalAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :additional-information)]
    (. builder additionalInformation data))
  (when-some [data (lookup-entry config id :external-entity-link)]
    (. builder externalEntityLink data))
  (when-some [data (lookup-entry config id :notification-topic)]
    (. builder notificationTopic data))
  (when-some [data (lookup-entry config id :notify-emails)]
    (. builder notifyEmails data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn manual-approval-action-builder
  "Creates a  `ManualApprovalAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (manual-approval-action-builder> (ManualApprovalAction$Builder/create) id config))


(defn manual-approval-action-props-builder>
  "The manual-approval-action-props-builder> function updates a ManualApprovalActionProps$Builder instance using the provided configuration.
  The function takes the ManualApprovalActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `additionalInformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-information` |
| `externalEntityLink` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-entity-link` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `notifyEmails` | java.util.List | [[cdk.support/lookup-entry]] | `:notify-emails` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ManualApprovalActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :additional-information)]
    (. builder additionalInformation data))
  (when-some [data (lookup-entry config id :external-entity-link)]
    (. builder externalEntityLink data))
  (when-some [data (lookup-entry config id :notification-topic)]
    (. builder notificationTopic data))
  (when-some [data (lookup-entry config id :notify-emails)]
    (. builder notifyEmails data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn manual-approval-action-props-builder
  "Creates a  `ManualApprovalActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (manual-approval-action-props-builder> (new ManualApprovalActionProps$Builder) id config))


(defn organizations-deployment-props-builder>
  "The organizations-deployment-props-builder> function updates a OrganizationsDeploymentProps$Builder instance using the provided configuration.
  The function takes the OrganizationsDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeployment` | software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment | [[cdk.api.services.codepipeline.actions/stack-set-organizations-auto-deployment]] | `:auto-deployment` |
"
  [^OrganizationsDeploymentProps$Builder builder id config]
  (when-some [data (stack-set-organizations-auto-deployment config id :auto-deployment)]
    (. builder autoDeployment data))
  (.build builder))


(defn organizations-deployment-props-builder
  "Creates a  `OrganizationsDeploymentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (organizations-deployment-props-builder> (new OrganizationsDeploymentProps$Builder) id config))


(defn s3-deploy-action-builder>
  "The s3-deploy-action-builder> function updates a S3DeployAction$Builder instance using the provided configuration.
  The function takes the S3DeployAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControl` | software.amazon.awscdk.services.s3.BucketAccessControl | [[cdk.api.services.s3/bucket-access-control]] | `:access-control` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `cacheControl` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-control` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `extract` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extract` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^S3DeployAction$Builder builder id config]
  (when-some [data (bucket-access-control config id :access-control)]
    (. builder accessControl data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :cache-control)]
    (. builder cacheControl data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :extract)]
    (. builder extract data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn s3-deploy-action-builder
  "Creates a  `S3DeployAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (s3-deploy-action-builder> (S3DeployAction$Builder/create) id config))


(defn s3-deploy-action-props-builder>
  "The s3-deploy-action-props-builder> function updates a S3DeployActionProps$Builder instance using the provided configuration.
  The function takes the S3DeployActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControl` | software.amazon.awscdk.services.s3.BucketAccessControl | [[cdk.api.services.s3/bucket-access-control]] | `:access-control` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `cacheControl` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-control` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `extract` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extract` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^S3DeployActionProps$Builder builder id config]
  (when-some [data (bucket-access-control config id :access-control)]
    (. builder accessControl data))
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :cache-control)]
    (. builder cacheControl data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :extract)]
    (. builder extract data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn s3-deploy-action-props-builder
  "Creates a  `S3DeployActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (s3-deploy-action-props-builder> (new S3DeployActionProps$Builder) id config))


(defn s3-source-action-builder>
  "The s3-source-action-builder> function updates a S3SourceAction$Builder instance using the provided configuration.
  The function takes the S3SourceAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-key` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.S3Trigger | [[cdk.api.services.codepipeline.actions/s3-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^S3SourceAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :bucket-key)]
    (. builder bucketKey data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (s3-trigger config id :trigger)]
    (. builder trigger data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn s3-source-action-builder
  "Creates a  `S3SourceAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (s3-source-action-builder> (S3SourceAction$Builder/create) id config))


(defn s3-source-action-props-builder>
  "The s3-source-action-props-builder> function updates a S3SourceActionProps$Builder instance using the provided configuration.
  The function takes the S3SourceActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-key` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.S3Trigger | [[cdk.api.services.codepipeline.actions/s3-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^S3SourceActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :bucket-key)]
    (. builder bucketKey data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (s3-trigger config id :trigger)]
    (. builder trigger data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn s3-source-action-props-builder
  "Creates a  `S3SourceActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (s3-source-action-props-builder> (new S3SourceActionProps$Builder) id config))


(defn s3-source-variables-builder>
  "The s3-source-variables-builder> function updates a S3SourceVariables$Builder instance using the provided configuration.
  The function takes the S3SourceVariables$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^S3SourceVariables$Builder builder id config]
  (when-some [data (lookup-entry config id :e-tag)]
    (. builder eTag data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn s3-source-variables-builder
  "Creates a  `S3SourceVariables$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (s3-source-variables-builder> (new S3SourceVariables$Builder) id config))


(defn self-managed-deployment-props-builder>
  "The self-managed-deployment-props-builder> function updates a SelfManagedDeploymentProps$Builder instance using the provided configuration.
  The function takes the SelfManagedDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `administrationRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:administration-role` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
"
  [^SelfManagedDeploymentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :administration-role)]
    (. builder administrationRole data))
  (when-some [data (lookup-entry config id :execution-role-name)]
    (. builder executionRoleName data))
  (.build builder))


(defn self-managed-deployment-props-builder
  "Creates a  `SelfManagedDeploymentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (self-managed-deployment-props-builder> (new SelfManagedDeploymentProps$Builder) id config))


(defn service-catalog-deploy-action-beta1-builder>
  "The service-catalog-deploy-action-beta1-builder> function updates a ServiceCatalogDeployActionBeta1$Builder instance using the provided configuration.
  The function takes the ServiceCatalogDeployActionBeta1$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `productVersionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-description` |
| `productVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ServiceCatalogDeployActionBeta1$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-some [data (lookup-entry config id :product-version-description)]
    (. builder productVersionDescription data))
  (when-some [data (lookup-entry config id :product-version-name)]
    (. builder productVersionName data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn service-catalog-deploy-action-beta1-builder
  "Creates a  `ServiceCatalogDeployActionBeta1$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (service-catalog-deploy-action-beta1-builder> (ServiceCatalogDeployActionBeta1$Builder/create) id config))


(defn service-catalog-deploy-action-beta1-props-builder>
  "The service-catalog-deploy-action-beta1-props-builder> function updates a ServiceCatalogDeployActionBeta1Props$Builder instance using the provided configuration.
  The function takes the ServiceCatalogDeployActionBeta1Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `productVersionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-description` |
| `productVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^ServiceCatalogDeployActionBeta1Props$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-some [data (lookup-entry config id :product-version-description)]
    (. builder productVersionDescription data))
  (when-some [data (lookup-entry config id :product-version-name)]
    (. builder productVersionName data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :template-path)]
    (. builder templatePath data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn service-catalog-deploy-action-beta1-props-builder
  "Creates a  `ServiceCatalogDeployActionBeta1Props$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (service-catalog-deploy-action-beta1-props-builder> (new ServiceCatalogDeployActionBeta1Props$Builder) id config))


(defn step-function-invoke-action-builder>
  "The step-function-invoke-action-builder> function updates a StepFunctionInvokeAction$Builder instance using the provided configuration.
  The function takes the StepFunctionInvokeAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `executionNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-name-prefix` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `stateMachineInput` | software.amazon.awscdk.services.codepipeline.actions.StateMachineInput | [[cdk.support/lookup-entry]] | `:state-machine-input` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^StepFunctionInvokeAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :execution-name-prefix)]
    (. builder executionNamePrefix data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :state-machine)]
    (. builder stateMachine data))
  (when-some [data (lookup-entry config id :state-machine-input)]
    (. builder stateMachineInput data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn step-function-invoke-action-builder
  "Creates a  `StepFunctionInvokeAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (step-function-invoke-action-builder> (StepFunctionInvokeAction$Builder/create) id config))


(defn step-functions-invoke-action-props-builder>
  "The step-functions-invoke-action-props-builder> function updates a StepFunctionsInvokeActionProps$Builder instance using the provided configuration.
  The function takes the StepFunctionsInvokeActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `executionNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-name-prefix` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `stateMachineInput` | software.amazon.awscdk.services.codepipeline.actions.StateMachineInput | [[cdk.support/lookup-entry]] | `:state-machine-input` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^StepFunctionsInvokeActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :execution-name-prefix)]
    (. builder executionNamePrefix data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-some [data (lookup-entry config id :state-machine)]
    (. builder stateMachine data))
  (when-some [data (lookup-entry config id :state-machine-input)]
    (. builder stateMachineInput data))
  (when-some [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn step-functions-invoke-action-props-builder
  "Creates a  `StepFunctionsInvokeActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (step-functions-invoke-action-props-builder> (new StepFunctionsInvokeActionProps$Builder) id config))