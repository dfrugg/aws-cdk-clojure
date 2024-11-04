(ns cdk.api.services.codepipeline.actions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codepipeline.actions package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.s3 :refer [bucket-access-control]])
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


(defn alexa-skill-deploy-action-builder
  "The alexa-skill-deploy-action-builder function buildes out new instances of 
AlexaSkillDeployAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (AlexaSkillDeployAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :parameter-overrides-artifact)]
      (. builder parameterOverridesArtifact data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :skill-id)]
      (. builder skillId data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn alexa-skill-deploy-action-props-builder
  "The alexa-skill-deploy-action-props-builder function buildes out new instances of 
AlexaSkillDeployActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (AlexaSkillDeployActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :parameter-overrides-artifact)]
      (. builder parameterOverridesArtifact data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :skill-id)]
      (. builder skillId data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-create-replace-change-set-action-builder
  "The cloud-formation-create-replace-change-set-action-builder function buildes out new instances of 
CloudFormationCreateReplaceChangeSetAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationCreateReplaceChangeSetAction$Builder/create)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :admin-permissions)]
      (. builder adminPermissions data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :change-set-name)]
      (. builder changeSetName data))
    (when-let [data (lookup-entry config id :deployment-role)]
      (. builder deploymentRole data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-create-replace-change-set-action-props-builder
  "The cloud-formation-create-replace-change-set-action-props-builder function buildes out new instances of 
CloudFormationCreateReplaceChangeSetActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationCreateReplaceChangeSetActionProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :admin-permissions)]
      (. builder adminPermissions data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :change-set-name)]
      (. builder changeSetName data))
    (when-let [data (lookup-entry config id :deployment-role)]
      (. builder deploymentRole data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-create-update-stack-action-builder
  "The cloud-formation-create-update-stack-action-builder function buildes out new instances of 
CloudFormationCreateUpdateStackAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationCreateUpdateStackAction$Builder/create)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :admin-permissions)]
      (. builder adminPermissions data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :deployment-role)]
      (. builder deploymentRole data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :replace-on-failure)]
      (. builder replaceOnFailure data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-create-update-stack-action-props-builder
  "The cloud-formation-create-update-stack-action-props-builder function buildes out new instances of 
CloudFormationCreateUpdateStackActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationCreateUpdateStackActionProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :admin-permissions)]
      (. builder adminPermissions data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :deployment-role)]
      (. builder deploymentRole data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :replace-on-failure)]
      (. builder replaceOnFailure data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-delete-stack-action-builder
  "The cloud-formation-delete-stack-action-builder function buildes out new instances of 
CloudFormationDeleteStackAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationDeleteStackAction$Builder/create)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :admin-permissions)]
      (. builder adminPermissions data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :deployment-role)]
      (. builder deploymentRole data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-delete-stack-action-props-builder
  "The cloud-formation-delete-stack-action-props-builder function buildes out new instances of 
CloudFormationDeleteStackActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationDeleteStackActionProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :admin-permissions)]
      (. builder adminPermissions data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :deployment-role)]
      (. builder deploymentRole data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-deploy-stack-instances-action-builder
  "The cloud-formation-deploy-stack-instances-action-builder function buildes out new instances of 
CloudFormationDeployStackInstancesAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationDeployStackInstancesAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-account-concurrency-percentage)]
      (. builder maxAccountConcurrencyPercentage data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-instances)]
      (. builder stackInstances data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :stack-set-region)]
      (. builder stackSetRegion data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-deploy-stack-instances-action-props-builder
  "The cloud-formation-deploy-stack-instances-action-props-builder function buildes out new instances of 
CloudFormationDeployStackInstancesActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationDeployStackInstancesActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-account-concurrency-percentage)]
      (. builder maxAccountConcurrencyPercentage data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-instances)]
      (. builder stackInstances data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :stack-set-region)]
      (. builder stackSetRegion data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-deploy-stack-set-action-builder
  "The cloud-formation-deploy-stack-set-action-builder function buildes out new instances of 
CloudFormationDeployStackSetAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationDeployStackSetAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :deployment-model)]
      (. builder deploymentModel data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-account-concurrency-percentage)]
      (. builder maxAccountConcurrencyPercentage data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-instances)]
      (. builder stackInstances data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :stack-set-region)]
      (. builder stackSetRegion data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-deploy-stack-set-action-props-builder
  "The cloud-formation-deploy-stack-set-action-props-builder function buildes out new instances of 
CloudFormationDeployStackSetActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationDeployStackSetActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :cfn-capabilities)]
      (. builder cfnCapabilities data))
    (when-let [data (lookup-entry config id :deployment-model)]
      (. builder deploymentModel data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-account-concurrency-percentage)]
      (. builder maxAccountConcurrencyPercentage data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-instances)]
      (. builder stackInstances data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :stack-set-region)]
      (. builder stackSetRegion data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-execute-change-set-action-builder
  "The cloud-formation-execute-change-set-action-builder function buildes out new instances of 
CloudFormationExecuteChangeSetAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationExecuteChangeSetAction$Builder/create)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :change-set-name)]
      (. builder changeSetName data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cloud-formation-execute-change-set-action-props-builder
  "The cloud-formation-execute-change-set-action-props-builder function buildes out new instances of 
CloudFormationExecuteChangeSetActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CloudFormationExecuteChangeSetActionProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :change-set-name)]
      (. builder changeSetName data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-file-name)]
      (. builder outputFileName data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-build-action-builder
  "The code-build-action-builder function buildes out new instances of 
CodeBuildAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeBuildAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :combine-batch-build-artifacts)]
      (. builder combineBatchBuildArtifacts data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :execute-batch-build)]
      (. builder executeBatchBuild data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (code-build-action-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-build-action-props-builder
  "The code-build-action-props-builder function buildes out new instances of 
CodeBuildActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeBuildActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :check-secrets-in-plain-text-env-variables)]
      (. builder checkSecretsInPlainTextEnvVariables data))
    (when-let [data (lookup-entry config id :combine-batch-build-artifacts)]
      (. builder combineBatchBuildArtifacts data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :execute-batch-build)]
      (. builder executeBatchBuild data))
    (when-let [data (lookup-entry config id :extra-inputs)]
      (. builder extraInputs data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (code-build-action-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-commit-source-action-builder
  "The code-commit-source-action-builder function buildes out new instances of 
CodeCommitSourceAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeCommitSourceAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :code-build-clone-output)]
      (. builder codeBuildCloneOutput data))
    (when-let [data (lookup-entry config id :custom-event-rule)]
      (. builder customEventRule data))
    (when-let [data (lookup-entry config id :event-role)]
      (. builder eventRole data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (code-commit-trigger config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-commit-source-action-props-builder
  "The code-commit-source-action-props-builder function buildes out new instances of 
CodeCommitSourceActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeCommitSourceActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :code-build-clone-output)]
      (. builder codeBuildCloneOutput data))
    (when-let [data (lookup-entry config id :custom-event-rule)]
      (. builder customEventRule data))
    (when-let [data (lookup-entry config id :event-role)]
      (. builder eventRole data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (code-commit-trigger config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-commit-source-variables-builder
  "The code-commit-source-variables-builder function buildes out new instances of 
CodeCommitSourceVariables$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:author-date` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `commitMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-message` |
| `committerDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:committer-date` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (CodeCommitSourceVariables$Builder.)]
    (when-let [data (lookup-entry config id :author-date)]
      (. builder authorDate data))
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :commit-id)]
      (. builder commitId data))
    (when-let [data (lookup-entry config id :commit-message)]
      (. builder commitMessage data))
    (when-let [data (lookup-entry config id :committer-date)]
      (. builder committerDate data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn code-deploy-ecs-container-image-input-builder
  "The code-deploy-ecs-container-image-input-builder function buildes out new instances of 
CodeDeployEcsContainerImageInput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `taskDefinitionPlaceholder` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-placeholder` |"
  [stack id config]
  (let [builder (CodeDeployEcsContainerImageInput$Builder.)]
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :task-definition-placeholder)]
      (. builder taskDefinitionPlaceholder data))
    (.build builder)))


(defn code-deploy-ecs-deploy-action-builder
  "The code-deploy-ecs-deploy-action-builder function buildes out new instances of 
CodeDeployEcsDeployAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeDeployEcsDeployAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :app-spec-template-file)]
      (. builder appSpecTemplateFile data))
    (when-let [data (lookup-entry config id :app-spec-template-input)]
      (. builder appSpecTemplateInput data))
    (when-let [data (lookup-entry config id :container-image-inputs)]
      (. builder containerImageInputs data))
    (when-let [data (lookup-entry config id :deployment-group)]
      (. builder deploymentGroup data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :task-definition-template-file)]
      (. builder taskDefinitionTemplateFile data))
    (when-let [data (lookup-entry config id :task-definition-template-input)]
      (. builder taskDefinitionTemplateInput data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-deploy-ecs-deploy-action-props-builder
  "The code-deploy-ecs-deploy-action-props-builder function buildes out new instances of 
CodeDeployEcsDeployActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeDeployEcsDeployActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :app-spec-template-file)]
      (. builder appSpecTemplateFile data))
    (when-let [data (lookup-entry config id :app-spec-template-input)]
      (. builder appSpecTemplateInput data))
    (when-let [data (lookup-entry config id :container-image-inputs)]
      (. builder containerImageInputs data))
    (when-let [data (lookup-entry config id :deployment-group)]
      (. builder deploymentGroup data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :task-definition-template-file)]
      (. builder taskDefinitionTemplateFile data))
    (when-let [data (lookup-entry config id :task-definition-template-input)]
      (. builder taskDefinitionTemplateInput data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-deploy-server-deploy-action-builder
  "The code-deploy-server-deploy-action-builder function buildes out new instances of 
CodeDeployServerDeployAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentGroup` | software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup | [[cdk.support/lookup-entry]] | `:deployment-group` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeDeployServerDeployAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :deployment-group)]
      (. builder deploymentGroup data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-deploy-server-deploy-action-props-builder
  "The code-deploy-server-deploy-action-props-builder function buildes out new instances of 
CodeDeployServerDeployActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentGroup` | software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup | [[cdk.support/lookup-entry]] | `:deployment-group` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeDeployServerDeployActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :deployment-group)]
      (. builder deploymentGroup data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-star-connections-source-action-builder
  "The code-star-connections-source-action-builder function buildes out new instances of 
CodeStarConnectionsSourceAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeStarConnectionsSourceAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :code-build-clone-output)]
      (. builder codeBuildCloneOutput data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :repo)]
      (. builder repo data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :trigger-on-push)]
      (. builder triggerOnPush data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-star-connections-source-action-props-builder
  "The code-star-connections-source-action-props-builder function buildes out new instances of 
CodeStarConnectionsSourceActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CodeStarConnectionsSourceActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :code-build-clone-output)]
      (. builder codeBuildCloneOutput data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :repo)]
      (. builder repo data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :trigger-on-push)]
      (. builder triggerOnPush data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn code-star-source-variables-builder
  "The code-star-source-variables-builder function buildes out new instances of 
CodeStarSourceVariables$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:author-date` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `commitMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-message` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `fullRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:full-repository-name` |"
  [stack id config]
  (let [builder (CodeStarSourceVariables$Builder.)]
    (when-let [data (lookup-entry config id :author-date)]
      (. builder authorDate data))
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :commit-id)]
      (. builder commitId data))
    (when-let [data (lookup-entry config id :commit-message)]
      (. builder commitMessage data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :full-repository-name)]
      (. builder fullRepositoryName data))
    (.build builder)))


(defn common-cloud-formation-stack-set-options-builder
  "The common-cloud-formation-stack-set-options-builder function buildes out new instances of 
CommonCloudFormationStackSetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxAccountConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-account-concurrency-percentage` |
| `stackSetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-region` |"
  [stack id config]
  (let [builder (CommonCloudFormationStackSetOptions$Builder.)]
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-account-concurrency-percentage)]
      (. builder maxAccountConcurrencyPercentage data))
    (when-let [data (lookup-entry config id :stack-set-region)]
      (. builder stackSetRegion data))
    (.build builder)))


(defn ecr-source-action-builder
  "The ecr-source-action-builder function buildes out new instances of 
EcrSourceAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `repository` | software.amazon.awscdk.services.ecr.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (EcrSourceAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :image-tag)]
      (. builder imageTag data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn ecr-source-action-props-builder
  "The ecr-source-action-props-builder function buildes out new instances of 
EcrSourceActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `repository` | software.amazon.awscdk.services.ecr.IRepository | [[cdk.support/lookup-entry]] | `:repository` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (EcrSourceActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :image-tag)]
      (. builder imageTag data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn ecr-source-variables-builder
  "The ecr-source-variables-builder function buildes out new instances of 
EcrSourceVariables$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-digest` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `registryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-id` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (EcrSourceVariables$Builder.)]
    (when-let [data (lookup-entry config id :image-digest)]
      (. builder imageDigest data))
    (when-let [data (lookup-entry config id :image-tag)]
      (. builder imageTag data))
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (when-let [data (lookup-entry config id :registry-id)]
      (. builder registryId data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn ecs-deploy-action-builder
  "The ecs-deploy-action-builder function buildes out new instances of 
EcsDeployAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-timeout` |
| `imageFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:image-file` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (EcsDeployAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :deployment-timeout)]
      (. builder deploymentTimeout data))
    (when-let [data (lookup-entry config id :image-file)]
      (. builder imageFile data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn ecs-deploy-action-props-builder
  "The ecs-deploy-action-props-builder function buildes out new instances of 
EcsDeployActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `deploymentTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-timeout` |
| `imageFile` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:image-file` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (EcsDeployActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :deployment-timeout)]
      (. builder deploymentTimeout data))
    (when-let [data (lookup-entry config id :image-file)]
      (. builder imageFile data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn elastic-beanstalk-deploy-action-builder
  "The elastic-beanstalk-deploy-action-builder function buildes out new instances of 
ElasticBeanstalkDeployAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ElasticBeanstalkDeployAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn elastic-beanstalk-deploy-action-props-builder
  "The elastic-beanstalk-deploy-action-props-builder function buildes out new instances of 
ElasticBeanstalkDeployActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `input` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:input` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ElasticBeanstalkDeployActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn git-hub-source-action-builder
  "The git-hub-source-action-builder function buildes out new instances of 
GitHubSourceAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (GitHubSourceAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :oauth-token)]
      (. builder oauthToken data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :repo)]
      (. builder repo data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (git-hub-trigger config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn git-hub-source-action-props-builder
  "The git-hub-source-action-props-builder function buildes out new instances of 
GitHubSourceActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (GitHubSourceActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :oauth-token)]
      (. builder oauthToken data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :repo)]
      (. builder repo data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (git-hub-trigger config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn git-hub-source-variables-builder
  "The git-hub-source-variables-builder function buildes out new instances of 
GitHubSourceVariables$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:author-date` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `commitMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-message` |
| `commitUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-url` |
| `committerDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:committer-date` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (GitHubSourceVariables$Builder.)]
    (when-let [data (lookup-entry config id :author-date)]
      (. builder authorDate data))
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :commit-id)]
      (. builder commitId data))
    (when-let [data (lookup-entry config id :commit-message)]
      (. builder commitMessage data))
    (when-let [data (lookup-entry config id :commit-url)]
      (. builder commitUrl data))
    (when-let [data (lookup-entry config id :committer-date)]
      (. builder committerDate data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn jenkins-action-builder
  "The jenkins-action-builder function buildes out new instances of 
JenkinsAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `jenkinsProvider` | software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider | [[cdk.support/lookup-entry]] | `:jenkins-provider` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `type` | software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType | [[cdk.api.services.codepipeline.actions/jenkins-action-type]] | `:type` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (JenkinsAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :inputs)]
      (. builder inputs data))
    (when-let [data (lookup-entry config id :jenkins-provider)]
      (. builder jenkinsProvider data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (jenkins-action-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn jenkins-action-props-builder
  "The jenkins-action-props-builder function buildes out new instances of 
JenkinsActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `jenkinsProvider` | software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider | [[cdk.support/lookup-entry]] | `:jenkins-provider` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `type` | software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType | [[cdk.api.services.codepipeline.actions/jenkins-action-type]] | `:type` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (JenkinsActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :inputs)]
      (. builder inputs data))
    (when-let [data (lookup-entry config id :jenkins-provider)]
      (. builder jenkinsProvider data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (jenkins-action-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn jenkins-provider-attributes-builder
  "The jenkins-provider-attributes-builder function buildes out new instances of 
JenkinsProviderAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (JenkinsProviderAttributes$Builder.)]
    (when-let [data (lookup-entry config id :provider-name)]
      (. builder providerName data))
    (when-let [data (lookup-entry config id :server-url)]
      (. builder serverUrl data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn jenkins-provider-builder
  "The jenkins-provider-builder function buildes out new instances of 
JenkinsProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-build` |
| `forTest` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-test` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (JenkinsProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :for-build)]
      (. builder forBuild data))
    (when-let [data (lookup-entry config id :for-test)]
      (. builder forTest data))
    (when-let [data (lookup-entry config id :provider-name)]
      (. builder providerName data))
    (when-let [data (lookup-entry config id :server-url)]
      (. builder serverUrl data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn jenkins-provider-props-builder
  "The jenkins-provider-props-builder function buildes out new instances of 
JenkinsProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-build` |
| `forTest` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-test` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-url` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (JenkinsProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :for-build)]
      (. builder forBuild data))
    (when-let [data (lookup-entry config id :for-test)]
      (. builder forTest data))
    (when-let [data (lookup-entry config id :provider-name)]
      (. builder providerName data))
    (when-let [data (lookup-entry config id :server-url)]
      (. builder serverUrl data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn lambda-invoke-action-builder
  "The lambda-invoke-action-builder function buildes out new instances of 
LambdaInvokeAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (LambdaInvokeAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :inputs)]
      (. builder inputs data))
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :user-parameters)]
      (. builder userParameters data))
    (when-let [data (lookup-entry config id :user-parameters-string)]
      (. builder userParametersString data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn lambda-invoke-action-props-builder
  "The lambda-invoke-action-props-builder function buildes out new instances of 
LambdaInvokeActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (LambdaInvokeActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :inputs)]
      (. builder inputs data))
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :user-parameters)]
      (. builder userParameters data))
    (when-let [data (lookup-entry config id :user-parameters-string)]
      (. builder userParametersString data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn manual-approval-action-builder
  "The manual-approval-action-builder function buildes out new instances of 
ManualApprovalAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `additionalInformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-information` |
| `externalEntityLink` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-entity-link` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `notifyEmails` | java.util.List | [[cdk.support/lookup-entry]] | `:notify-emails` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ManualApprovalAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :additional-information)]
      (. builder additionalInformation data))
    (when-let [data (lookup-entry config id :external-entity-link)]
      (. builder externalEntityLink data))
    (when-let [data (lookup-entry config id :notification-topic)]
      (. builder notificationTopic data))
    (when-let [data (lookup-entry config id :notify-emails)]
      (. builder notifyEmails data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn manual-approval-action-props-builder
  "The manual-approval-action-props-builder function buildes out new instances of 
ManualApprovalActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `additionalInformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-information` |
| `externalEntityLink` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-entity-link` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `notifyEmails` | java.util.List | [[cdk.support/lookup-entry]] | `:notify-emails` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ManualApprovalActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :additional-information)]
      (. builder additionalInformation data))
    (when-let [data (lookup-entry config id :external-entity-link)]
      (. builder externalEntityLink data))
    (when-let [data (lookup-entry config id :notification-topic)]
      (. builder notificationTopic data))
    (when-let [data (lookup-entry config id :notify-emails)]
      (. builder notifyEmails data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn organizations-deployment-props-builder
  "The organizations-deployment-props-builder function buildes out new instances of 
OrganizationsDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeployment` | software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment | [[cdk.api.services.codepipeline.actions/stack-set-organizations-auto-deployment]] | `:auto-deployment` |"
  [stack id config]
  (let [builder (OrganizationsDeploymentProps$Builder.)]
    (when-let [data (stack-set-organizations-auto-deployment config id :auto-deployment)]
      (. builder autoDeployment data))
    (.build builder)))


(defn s3-deploy-action-builder
  "The s3-deploy-action-builder function buildes out new instances of 
S3DeployAction$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (S3DeployAction$Builder/create)]
    (when-let [data (bucket-access-control config id :access-control)]
      (. builder accessControl data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :cache-control)]
      (. builder cacheControl data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :extract)]
      (. builder extract data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :object-key)]
      (. builder objectKey data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn s3-deploy-action-props-builder
  "The s3-deploy-action-props-builder function buildes out new instances of 
S3DeployActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (S3DeployActionProps$Builder.)]
    (when-let [data (bucket-access-control config id :access-control)]
      (. builder accessControl data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :cache-control)]
      (. builder cacheControl data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :extract)]
      (. builder extract data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :object-key)]
      (. builder objectKey data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn s3-source-action-builder
  "The s3-source-action-builder function buildes out new instances of 
S3SourceAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-key` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.S3Trigger | [[cdk.api.services.codepipeline.actions/s3-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (S3SourceAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-key)]
      (. builder bucketKey data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (s3-trigger config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn s3-source-action-props-builder
  "The s3-source-action-props-builder function buildes out new instances of 
S3SourceActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-key` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `trigger` | software.amazon.awscdk.services.codepipeline.actions.S3Trigger | [[cdk.api.services.codepipeline.actions/s3-trigger]] | `:trigger` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (S3SourceActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-key)]
      (. builder bucketKey data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (s3-trigger config id :trigger)]
      (. builder trigger data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn s3-source-variables-builder
  "The s3-source-variables-builder function buildes out new instances of 
S3SourceVariables$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (S3SourceVariables$Builder.)]
    (when-let [data (lookup-entry config id :e-tag)]
      (. builder eTag data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn self-managed-deployment-props-builder
  "The self-managed-deployment-props-builder function buildes out new instances of 
SelfManagedDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `administrationRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:administration-role` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |"
  [stack id config]
  (let [builder (SelfManagedDeploymentProps$Builder.)]
    (when-let [data (lookup-entry config id :administration-role)]
      (. builder administrationRole data))
    (when-let [data (lookup-entry config id :execution-role-name)]
      (. builder executionRoleName data))
    (.build builder)))


(defn service-catalog-deploy-action-beta1-builder
  "The service-catalog-deploy-action-beta1-builder function buildes out new instances of 
ServiceCatalogDeployActionBeta1$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `productVersionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-description` |
| `productVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ServiceCatalogDeployActionBeta1$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :product-version-description)]
      (. builder productVersionDescription data))
    (when-let [data (lookup-entry config id :product-version-name)]
      (. builder productVersionName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn service-catalog-deploy-action-beta1-props-builder
  "The service-catalog-deploy-action-beta1-props-builder function buildes out new instances of 
ServiceCatalogDeployActionBeta1Props$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `productVersionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-description` |
| `productVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `templatePath` | software.amazon.awscdk.services.codepipeline.ArtifactPath | [[cdk.support/lookup-entry]] | `:template-path` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (ServiceCatalogDeployActionBeta1Props$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :product-version-description)]
      (. builder productVersionDescription data))
    (when-let [data (lookup-entry config id :product-version-name)]
      (. builder productVersionName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :template-path)]
      (. builder templatePath data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn step-function-invoke-action-builder
  "The step-function-invoke-action-builder function buildes out new instances of 
StepFunctionInvokeAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `executionNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-name-prefix` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `stateMachineInput` | software.amazon.awscdk.services.codepipeline.actions.StateMachineInput | [[cdk.support/lookup-entry]] | `:state-machine-input` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (StepFunctionInvokeAction$Builder/create)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :execution-name-prefix)]
      (. builder executionNamePrefix data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (lookup-entry config id :state-machine-input)]
      (. builder stateMachineInput data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn step-functions-invoke-action-props-builder
  "The step-functions-invoke-action-props-builder function buildes out new instances of 
StepFunctionsInvokeActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `executionNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-name-prefix` |
| `output` | software.amazon.awscdk.services.codepipeline.Artifact | [[cdk.support/lookup-entry]] | `:output` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `stateMachineInput` | software.amazon.awscdk.services.codepipeline.actions.StateMachineInput | [[cdk.support/lookup-entry]] | `:state-machine-input` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (StepFunctionsInvokeActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :execution-name-prefix)]
      (. builder executionNamePrefix data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (lookup-entry config id :state-machine-input)]
      (. builder stateMachineInput data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))