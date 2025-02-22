(ns cdk.api.services.codepipeline
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codepipeline package. "
  (:require [cdk.api.services.codestarnotifications :refer [detail-type]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codepipeline ActionArtifactBounds$Builder
                                                         ActionBindOptions$Builder
                                                         ActionCategory
                                                         ActionConfig$Builder
                                                         ActionProperties$Builder
                                                         CfnCustomActionType$ArtifactDetailsProperty$Builder
                                                         CfnCustomActionType$Builder
                                                         CfnCustomActionType$ConfigurationPropertiesProperty$Builder
                                                         CfnCustomActionType$SettingsProperty$Builder
                                                         CfnCustomActionTypeProps$Builder
                                                         CfnPipeline$ActionDeclarationProperty$Builder
                                                         CfnPipeline$ActionTypeIdProperty$Builder
                                                         CfnPipeline$ArtifactStoreMapProperty$Builder
                                                         CfnPipeline$ArtifactStoreProperty$Builder
                                                         CfnPipeline$BlockerDeclarationProperty$Builder
                                                         CfnPipeline$Builder
                                                         CfnPipeline$EncryptionKeyProperty$Builder
                                                         CfnPipeline$FailureConditionsProperty$Builder
                                                         CfnPipeline$GitBranchFilterCriteriaProperty$Builder
                                                         CfnPipeline$GitConfigurationProperty$Builder
                                                         CfnPipeline$GitFilePathFilterCriteriaProperty$Builder
                                                         CfnPipeline$GitPullRequestFilterProperty$Builder
                                                         CfnPipeline$GitPushFilterProperty$Builder
                                                         CfnPipeline$GitTagFilterCriteriaProperty$Builder
                                                         CfnPipeline$InputArtifactProperty$Builder
                                                         CfnPipeline$OutputArtifactProperty$Builder
                                                         CfnPipeline$PipelineTriggerDeclarationProperty$Builder
                                                         CfnPipeline$StageDeclarationProperty$Builder
                                                         CfnPipeline$StageTransitionProperty$Builder
                                                         CfnPipeline$VariableDeclarationProperty$Builder
                                                         CfnPipelineProps$Builder
                                                         CfnWebhook$Builder
                                                         CfnWebhook$WebhookAuthConfigurationProperty$Builder
                                                         CfnWebhook$WebhookFilterRuleProperty$Builder
                                                         CfnWebhookProps$Builder
                                                         CommonActionProps$Builder
                                                         CommonAwsActionProps$Builder
                                                         CrossRegionSupport$Builder
                                                         CustomActionProperty$Builder
                                                         CustomActionRegistration$Builder
                                                         CustomActionRegistrationProps$Builder
                                                         ExecutionMode
                                                         GitConfiguration$Builder
                                                         GitPullRequestEvent
                                                         GitPullRequestFilter$Builder
                                                         GitPushFilter$Builder
                                                         Pipeline$Builder
                                                         PipelineNotificationEvents
                                                         PipelineNotifyOnOptions$Builder
                                                         PipelineProps$Builder
                                                         PipelineType
                                                         ProviderType
                                                         StageOptions$Builder
                                                         StagePlacement$Builder
                                                         StageProps$Builder
                                                         Trigger$Builder
                                                         TriggerProps$Builder
                                                         Variable$Builder
                                                         VariableProps$Builder]))


(defn action-category
  "The `action-category` function data interprets values in the provided config data into a 
`ActionCategory` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ActionCategory` - the value is returned.
* is `:deploy` - `ActionCategory/DEPLOY` is returned
* is `:approval` - `ActionCategory/APPROVAL` is returned
* is `:test` - `ActionCategory/TEST` is returned
* is `:invoke` - `ActionCategory/INVOKE` is returned
* is `:build` - `ActionCategory/BUILD` is returned
* is `:source` - `ActionCategory/SOURCE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ActionCategory data) data
      (= :deploy data) ActionCategory/DEPLOY
      (= :approval data) ActionCategory/APPROVAL
      (= :test data) ActionCategory/TEST
      (= :invoke data) ActionCategory/INVOKE
      (= :build data) ActionCategory/BUILD
      (= :source data) ActionCategory/SOURCE)))


(defn execution-mode
  "The `execution-mode` function data interprets values in the provided config data into a 
`ExecutionMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ExecutionMode` - the value is returned.
* is `:superseded` - `ExecutionMode/SUPERSEDED` is returned
* is `:parallel` - `ExecutionMode/PARALLEL` is returned
* is `:queued` - `ExecutionMode/QUEUED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ExecutionMode data) data
      (= :superseded data) ExecutionMode/SUPERSEDED
      (= :parallel data) ExecutionMode/PARALLEL
      (= :queued data) ExecutionMode/QUEUED)))


(defn git-pull-request-event
  "The `git-pull-request-event` function data interprets values in the provided config data into a 
`GitPullRequestEvent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `GitPullRequestEvent` - the value is returned.
* is `:updated` - `GitPullRequestEvent/UPDATED` is returned
* is `:open` - `GitPullRequestEvent/OPEN` is returned
* is `:closed` - `GitPullRequestEvent/CLOSED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? GitPullRequestEvent data) data
      (= :updated data) GitPullRequestEvent/UPDATED
      (= :open data) GitPullRequestEvent/OPEN
      (= :closed data) GitPullRequestEvent/CLOSED)))


(defn pipeline-notification-events
  "The `pipeline-notification-events` function data interprets values in the provided config data into a 
`PipelineNotificationEvents` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PipelineNotificationEvents` - the value is returned.
* is `:pipeline-execution-started` - `PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED` is returned
* is `:stage-execution-started` - `PipelineNotificationEvents/STAGE_EXECUTION_STARTED` is returned
* is `:pipeline-execution-superseded` - `PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED` is returned
* is `:manual-approval-failed` - `PipelineNotificationEvents/MANUAL_APPROVAL_FAILED` is returned
* is `:action-execution-started` - `PipelineNotificationEvents/ACTION_EXECUTION_STARTED` is returned
* is `:pipeline-execution-canceled` - `PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED` is returned
* is `:stage-execution-succeeded` - `PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED` is returned
* is `:stage-execution-failed` - `PipelineNotificationEvents/STAGE_EXECUTION_FAILED` is returned
* is `:stage-execution-canceled` - `PipelineNotificationEvents/STAGE_EXECUTION_CANCELED` is returned
* is `:pipeline-execution-succeeded` - `PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED` is returned
* is `:manual-approval-needed` - `PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED` is returned
* is `:pipeline-execution-failed` - `PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED` is returned
* is `:action-execution-failed` - `PipelineNotificationEvents/ACTION_EXECUTION_FAILED` is returned
* is `:stage-execution-resumed` - `PipelineNotificationEvents/STAGE_EXECUTION_RESUMED` is returned
* is `:manual-approval-succeeded` - `PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED` is returned
* is `:action-execution-succeeded` - `PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED` is returned
* is `:action-execution-canceled` - `PipelineNotificationEvents/ACTION_EXECUTION_CANCELED` is returned
* is `:pipeline-execution-resumed` - `PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PipelineNotificationEvents data) data
      (= :pipeline-execution-started data) PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED
      (= :stage-execution-started data) PipelineNotificationEvents/STAGE_EXECUTION_STARTED
      (= :pipeline-execution-superseded data) PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED
      (= :manual-approval-failed data) PipelineNotificationEvents/MANUAL_APPROVAL_FAILED
      (= :action-execution-started data) PipelineNotificationEvents/ACTION_EXECUTION_STARTED
      (= :pipeline-execution-canceled data) PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED
      (= :stage-execution-succeeded data) PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED
      (= :stage-execution-failed data) PipelineNotificationEvents/STAGE_EXECUTION_FAILED
      (= :stage-execution-canceled data) PipelineNotificationEvents/STAGE_EXECUTION_CANCELED
      (= :pipeline-execution-succeeded data) PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED
      (= :manual-approval-needed data) PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED
      (= :pipeline-execution-failed data) PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED
      (= :action-execution-failed data) PipelineNotificationEvents/ACTION_EXECUTION_FAILED
      (= :stage-execution-resumed data) PipelineNotificationEvents/STAGE_EXECUTION_RESUMED
      (= :manual-approval-succeeded data) PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED
      (= :action-execution-succeeded data) PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED
      (= :action-execution-canceled data) PipelineNotificationEvents/ACTION_EXECUTION_CANCELED
      (= :pipeline-execution-resumed data) PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED)))


(defn pipeline-type
  "The `pipeline-type` function data interprets values in the provided config data into a 
`PipelineType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PipelineType` - the value is returned.
* is `:v2` - `PipelineType/V2` is returned
* is `:v1` - `PipelineType/V1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PipelineType data) data
      (= :v2 data) PipelineType/V2
      (= :v1 data) PipelineType/V1)))


(defn provider-type
  "The `provider-type` function data interprets values in the provided config data into a 
`ProviderType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ProviderType` - the value is returned.
* is `:code-star-source-connection` - `ProviderType/CODE_STAR_SOURCE_CONNECTION` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ProviderType data) data
      (= :code-star-source-connection data) ProviderType/CODE_STAR_SOURCE_CONNECTION)))


(defn action-artifact-bounds-builder
  "The action-artifact-bounds-builder function buildes out new instances of 
ActionArtifactBounds$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxInputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-inputs` |
| `maxOutputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-outputs` |
| `minInputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-inputs` |
| `minOutputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-outputs` |"
  [stack id config]
  (let [builder (ActionArtifactBounds$Builder.)]
    (when-let [data (lookup-entry config id :max-inputs)]
      (. builder maxInputs data))
    (when-let [data (lookup-entry config id :max-outputs)]
      (. builder maxOutputs data))
    (when-let [data (lookup-entry config id :min-inputs)]
      (. builder minInputs data))
    (when-let [data (lookup-entry config id :min-outputs)]
      (. builder minOutputs data))
    (.build builder)))


(defn action-bind-options-builder
  "The action-bind-options-builder function buildes out new instances of 
ActionBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (ActionBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn action-config-builder
  "The action-config-builder function buildes out new instances of 
ActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:configuration` |"
  [stack id config]
  (let [builder (ActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (.build builder)))


(defn action-properties-builder
  "The action-properties-builder function buildes out new instances of 
ActionProperties$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `artifactBounds` | software.amazon.awscdk.services.codepipeline.ActionArtifactBounds | [[cdk.support/lookup-entry]] | `:artifact-bounds` |
| `category` | software.amazon.awscdk.services.codepipeline.ActionCategory | [[cdk.api.services.codepipeline/action-category]] | `:category` |
| `inputs` | java.util.List | [[cdk.support/lookup-entry]] | `:inputs` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resource` | software.amazon.awscdk.IResource | [[cdk.support/lookup-entry]] | `:resource` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (ActionProperties$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :artifact-bounds)]
      (. builder artifactBounds data))
    (when-let [data (action-category config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :inputs)]
      (. builder inputs data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-custom-action-type-artifact-details-property-builder
  "The cfn-custom-action-type-artifact-details-property-builder function buildes out new instances of 
CfnCustomActionType$ArtifactDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-count` |
| `minimumCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-count` |"
  [stack id config]
  (let [builder (CfnCustomActionType$ArtifactDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-count)]
      (. builder maximumCount data))
    (when-let [data (lookup-entry config id :minimum-count)]
      (. builder minimumCount data))
    (.build builder)))


(defn cfn-custom-action-type-builder
  "The cfn-custom-action-type-builder function buildes out new instances of 
CfnCustomActionType$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `configurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `inputArtifactDetails` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$ArtifactDetailsProperty | [[cdk.support/lookup-entry]] | `:input-artifact-details` |
| `outputArtifactDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-artifact-details` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `settings` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$SettingsProperty | [[cdk.support/lookup-entry]] | `:settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnCustomActionType$Builder/create stack id)]
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :configuration-properties)]
      (. builder configurationProperties data))
    (when-let [data (lookup-entry config id :input-artifact-details)]
      (. builder inputArtifactDetails data))
    (when-let [data (lookup-entry config id :output-artifact-details)]
      (. builder outputArtifactDetails data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :settings)]
      (. builder settings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-custom-action-type-configuration-properties-property-builder
  "The cfn-custom-action-type-configuration-properties-property-builder function buildes out new instances of 
CfnCustomActionType$ConfigurationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `key` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:queryable` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `secret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:secret` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCustomActionType$ConfigurationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :queryable)]
      (. builder queryable data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-custom-action-type-props-builder
  "The cfn-custom-action-type-props-builder function buildes out new instances of 
CfnCustomActionTypeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `configurationProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `inputArtifactDetails` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$ArtifactDetailsProperty | [[cdk.support/lookup-entry]] | `:input-artifact-details` |
| `outputArtifactDetails` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$ArtifactDetailsProperty | [[cdk.support/lookup-entry]] | `:output-artifact-details` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnCustomActionTypeProps$Builder.)]
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :configuration-properties)]
      (. builder configurationProperties data))
    (when-let [data (lookup-entry config id :input-artifact-details)]
      (. builder inputArtifactDetails data))
    (when-let [data (lookup-entry config id :output-artifact-details)]
      (. builder outputArtifactDetails data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :settings)]
      (. builder settings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-custom-action-type-settings-property-builder
  "The cfn-custom-action-type-settings-property-builder function buildes out new instances of 
CfnCustomActionType$SettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityUrlTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-url-template` |
| `executionUrlTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-url-template` |
| `revisionUrlTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-url-template` |
| `thirdPartyConfigurationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:third-party-configuration-url` |"
  [stack id config]
  (let [builder (CfnCustomActionType$SettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :entity-url-template)]
      (. builder entityUrlTemplate data))
    (when-let [data (lookup-entry config id :execution-url-template)]
      (. builder executionUrlTemplate data))
    (when-let [data (lookup-entry config id :revision-url-template)]
      (. builder revisionUrlTemplate data))
    (when-let [data (lookup-entry config id :third-party-configuration-url)]
      (. builder thirdPartyConfigurationUrl data))
    (.build builder)))


(defn cfn-pipeline-action-declaration-property-builder
  "The cfn-pipeline-action-declaration-property-builder function buildes out new instances of 
CfnPipeline$ActionDeclarationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionTypeId` | software.amazon.awscdk.services.codepipeline.CfnPipeline$ActionTypeIdProperty | [[cdk.support/lookup-entry]] | `:action-type-id` |
| `configuration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:configuration` |
| `inputArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:input-artifacts` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `outputArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:output-artifacts` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnPipeline$ActionDeclarationProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-type-id)]
      (. builder actionTypeId data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :input-artifacts)]
      (. builder inputArtifacts data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :output-artifacts)]
      (. builder outputArtifacts data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (.build builder)))


(defn cfn-pipeline-action-type-id-property-builder
  "The cfn-pipeline-action-type-id-property-builder function buildes out new instances of 
CfnPipeline$ActionTypeIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnPipeline$ActionTypeIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-pipeline-artifact-store-map-property-builder
  "The cfn-pipeline-artifact-store-map-property-builder function buildes out new instances of 
CfnPipeline$ArtifactStoreMapProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactStore` | software.amazon.awscdk.services.codepipeline.CfnPipeline$ArtifactStoreProperty | [[cdk.support/lookup-entry]] | `:artifact-store` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnPipeline$ArtifactStoreMapProperty$Builder.)]
    (when-let [data (lookup-entry config id :artifact-store)]
      (. builder artifactStore data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-pipeline-artifact-store-property-builder
  "The cfn-pipeline-artifact-store-property-builder function buildes out new instances of 
CfnPipeline$ArtifactStoreProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPipeline$ArtifactStoreProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-pipeline-blocker-declaration-property-builder
  "The cfn-pipeline-blocker-declaration-property-builder function buildes out new instances of 
CfnPipeline$BlockerDeclarationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPipeline$BlockerDeclarationProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-pipeline-builder
  "The cfn-pipeline-builder function buildes out new instances of 
CfnPipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactStore` | software.amazon.awscdk.services.codepipeline.CfnPipeline$ArtifactStoreProperty | [[cdk.support/lookup-entry]] | `:artifact-store` |
| `artifactStores` | java.util.List | [[cdk.support/lookup-entry]] | `:artifact-stores` |
| `disableInboundStageTransitions` | java.util.List | [[cdk.support/lookup-entry]] | `:disable-inbound-stage-transitions` |
| `executionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pipelineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-type` |
| `restartExecutionOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restart-execution-on-update` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggers` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnPipeline$Builder/create stack id)]
    (when-let [data (lookup-entry config id :artifact-store)]
      (. builder artifactStore data))
    (when-let [data (lookup-entry config id :artifact-stores)]
      (. builder artifactStores data))
    (when-let [data (lookup-entry config id :disable-inbound-stage-transitions)]
      (. builder disableInboundStageTransitions data))
    (when-let [data (lookup-entry config id :execution-mode)]
      (. builder executionMode data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pipeline-type)]
      (. builder pipelineType data))
    (when-let [data (lookup-entry config id :restart-execution-on-update)]
      (. builder restartExecutionOnUpdate data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-pipeline-encryption-key-property-builder
  "The cfn-pipeline-encryption-key-property-builder function buildes out new instances of 
CfnPipeline$EncryptionKeyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPipeline$EncryptionKeyProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-pipeline-failure-conditions-property-builder
  "The cfn-pipeline-failure-conditions-property-builder function buildes out new instances of 
CfnPipeline$FailureConditionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `result` | java.lang.String | [[cdk.support/lookup-entry]] | `:result` |"
  [stack id config]
  (let [builder (CfnPipeline$FailureConditionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :result)]
      (. builder result data))
    (.build builder)))


(defn cfn-pipeline-git-branch-filter-criteria-property-builder
  "The cfn-pipeline-git-branch-filter-criteria-property-builder function buildes out new instances of 
CfnPipeline$GitBranchFilterCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |"
  [stack id config]
  (let [builder (CfnPipeline$GitBranchFilterCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :excludes)]
      (. builder excludes data))
    (when-let [data (lookup-entry config id :includes)]
      (. builder includes data))
    (.build builder)))


(defn cfn-pipeline-git-configuration-property-builder
  "The cfn-pipeline-git-configuration-property-builder function buildes out new instances of 
CfnPipeline$GitConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pullRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pull-request` |
| `push` | java.util.List | [[cdk.support/lookup-entry]] | `:push` |
| `sourceActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-action-name` |"
  [stack id config]
  (let [builder (CfnPipeline$GitConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :pull-request)]
      (. builder pullRequest data))
    (when-let [data (lookup-entry config id :push)]
      (. builder push data))
    (when-let [data (lookup-entry config id :source-action-name)]
      (. builder sourceActionName data))
    (.build builder)))


(defn cfn-pipeline-git-file-path-filter-criteria-property-builder
  "The cfn-pipeline-git-file-path-filter-criteria-property-builder function buildes out new instances of 
CfnPipeline$GitFilePathFilterCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |"
  [stack id config]
  (let [builder (CfnPipeline$GitFilePathFilterCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :excludes)]
      (. builder excludes data))
    (when-let [data (lookup-entry config id :includes)]
      (. builder includes data))
    (.build builder)))


(defn cfn-pipeline-git-pull-request-filter-property-builder
  "The cfn-pipeline-git-pull-request-filter-property-builder function buildes out new instances of 
CfnPipeline$GitPullRequestFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:branches` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filePaths` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitFilePathFilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:file-paths` |"
  [stack id config]
  (let [builder (CfnPipeline$GitPullRequestFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :branches)]
      (. builder branches data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :file-paths)]
      (. builder filePaths data))
    (.build builder)))


(defn cfn-pipeline-git-push-filter-property-builder
  "The cfn-pipeline-git-push-filter-property-builder function buildes out new instances of 
CfnPipeline$GitPushFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:branches` |
| `filePaths` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitFilePathFilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:file-paths` |
| `tags` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitTagFilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPipeline$GitPushFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :branches)]
      (. builder branches data))
    (when-let [data (lookup-entry config id :file-paths)]
      (. builder filePaths data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pipeline-git-tag-filter-criteria-property-builder
  "The cfn-pipeline-git-tag-filter-criteria-property-builder function buildes out new instances of 
CfnPipeline$GitTagFilterCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |"
  [stack id config]
  (let [builder (CfnPipeline$GitTagFilterCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :excludes)]
      (. builder excludes data))
    (when-let [data (lookup-entry config id :includes)]
      (. builder includes data))
    (.build builder)))


(defn cfn-pipeline-input-artifact-property-builder
  "The cfn-pipeline-input-artifact-property-builder function buildes out new instances of 
CfnPipeline$InputArtifactProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPipeline$InputArtifactProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-pipeline-output-artifact-property-builder
  "The cfn-pipeline-output-artifact-property-builder function buildes out new instances of 
CfnPipeline$OutputArtifactProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPipeline$OutputArtifactProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-pipeline-pipeline-trigger-declaration-property-builder
  "The cfn-pipeline-pipeline-trigger-declaration-property-builder function buildes out new instances of 
CfnPipeline$PipelineTriggerDeclarationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitConfiguration` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitConfigurationProperty | [[cdk.support/lookup-entry]] | `:git-configuration` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |"
  [stack id config]
  (let [builder (CfnPipeline$PipelineTriggerDeclarationProperty$Builder.)]
    (when-let [data (lookup-entry config id :git-configuration)]
      (. builder gitConfiguration data))
    (when-let [data (lookup-entry config id :provider-type)]
      (. builder providerType data))
    (.build builder)))


(defn cfn-pipeline-props-builder
  "The cfn-pipeline-props-builder function buildes out new instances of 
CfnPipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:artifact-store` |
| `artifactStores` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:artifact-stores` |
| `disableInboundStageTransitions` | java.util.List | [[cdk.support/lookup-entry]] | `:disable-inbound-stage-transitions` |
| `executionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pipelineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-type` |
| `restartExecutionOnUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restart-execution-on-update` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stages` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggers` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnPipelineProps$Builder.)]
    (when-let [data (lookup-entry config id :artifact-store)]
      (. builder artifactStore data))
    (when-let [data (lookup-entry config id :artifact-stores)]
      (. builder artifactStores data))
    (when-let [data (lookup-entry config id :disable-inbound-stage-transitions)]
      (. builder disableInboundStageTransitions data))
    (when-let [data (lookup-entry config id :execution-mode)]
      (. builder executionMode data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pipeline-type)]
      (. builder pipelineType data))
    (when-let [data (lookup-entry config id :restart-execution-on-update)]
      (. builder restartExecutionOnUpdate data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-pipeline-stage-declaration-property-builder
  "The cfn-pipeline-stage-declaration-property-builder function buildes out new instances of 
CfnPipeline$StageDeclarationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `blockers` | java.util.List | [[cdk.support/lookup-entry]] | `:blockers` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `onFailure` | software.amazon.awscdk.services.codepipeline.CfnPipeline$FailureConditionsProperty | [[cdk.support/lookup-entry]] | `:on-failure` |"
  [stack id config]
  (let [builder (CfnPipeline$StageDeclarationProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :blockers)]
      (. builder blockers data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (.build builder)))


(defn cfn-pipeline-stage-transition-property-builder
  "The cfn-pipeline-stage-transition-property-builder function buildes out new instances of 
CfnPipeline$StageTransitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (CfnPipeline$StageTransitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :reason)]
      (. builder reason data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn cfn-pipeline-variable-declaration-property-builder
  "The cfn-pipeline-variable-declaration-property-builder function buildes out new instances of 
CfnPipeline$VariableDeclarationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPipeline$VariableDeclarationProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-webhook-builder
  "The cfn-webhook-builder function buildes out new instances of 
CfnWebhook$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `authenticationConfiguration` | software.amazon.awscdk.services.codepipeline.CfnWebhook$WebhookAuthConfigurationProperty | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registerWithThirdParty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:register-with-third-party` |
| `targetAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-action` |
| `targetPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-pipeline` |
| `targetPipelineVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-pipeline-version` |"
  [stack id config]
  (let [builder (CfnWebhook$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication)]
      (. builder authentication data))
    (when-let [data (lookup-entry config id :authentication-configuration)]
      (. builder authenticationConfiguration data))
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :register-with-third-party)]
      (. builder registerWithThirdParty data))
    (when-let [data (lookup-entry config id :target-action)]
      (. builder targetAction data))
    (when-let [data (lookup-entry config id :target-pipeline)]
      (. builder targetPipeline data))
    (when-let [data (lookup-entry config id :target-pipeline-version)]
      (. builder targetPipelineVersion data))
    (.build builder)))


(defn cfn-webhook-props-builder
  "The cfn-webhook-props-builder function buildes out new instances of 
CfnWebhookProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `authenticationConfiguration` | software.amazon.awscdk.services.codepipeline.CfnWebhook$WebhookAuthConfigurationProperty | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registerWithThirdParty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:register-with-third-party` |
| `targetAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-action` |
| `targetPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-pipeline` |
| `targetPipelineVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-pipeline-version` |"
  [stack id config]
  (let [builder (CfnWebhookProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication)]
      (. builder authentication data))
    (when-let [data (lookup-entry config id :authentication-configuration)]
      (. builder authenticationConfiguration data))
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :register-with-third-party)]
      (. builder registerWithThirdParty data))
    (when-let [data (lookup-entry config id :target-action)]
      (. builder targetAction data))
    (when-let [data (lookup-entry config id :target-pipeline)]
      (. builder targetPipeline data))
    (when-let [data (lookup-entry config id :target-pipeline-version)]
      (. builder targetPipelineVersion data))
    (.build builder)))


(defn cfn-webhook-webhook-auth-configuration-property-builder
  "The cfn-webhook-webhook-auth-configuration-property-builder function buildes out new instances of 
CfnWebhook$WebhookAuthConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedIpRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-ip-range` |
| `secretToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-token` |"
  [stack id config]
  (let [builder (CfnWebhook$WebhookAuthConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-ip-range)]
      (. builder allowedIpRange data))
    (when-let [data (lookup-entry config id :secret-token)]
      (. builder secretToken data))
    (.build builder)))


(defn cfn-webhook-webhook-filter-rule-property-builder
  "The cfn-webhook-webhook-filter-rule-property-builder function buildes out new instances of 
CfnWebhook$WebhookFilterRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `matchEquals` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-equals` |"
  [stack id config]
  (let [builder (CfnWebhook$WebhookFilterRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :json-path)]
      (. builder jsonPath data))
    (when-let [data (lookup-entry config id :match-equals)]
      (. builder matchEquals data))
    (.build builder)))


(defn common-action-props-builder
  "The common-action-props-builder function buildes out new instances of 
CommonActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CommonActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn common-aws-action-props-builder
  "The common-aws-action-props-builder function buildes out new instances of 
CommonAwsActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |"
  [stack id config]
  (let [builder (CommonAwsActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :run-order)]
      (. builder runOrder data))
    (when-let [data (lookup-entry config id :variables-namespace)]
      (. builder variablesNamespace data))
    (.build builder)))


(defn cross-region-support-builder
  "The cross-region-support-builder function buildes out new instances of 
CrossRegionSupport$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:replication-bucket` |
| `stack` | software.amazon.awscdk.Stack | [[cdk.support/lookup-entry]] | `:stack` |"
  [stack id config]
  (let [builder (CrossRegionSupport$Builder.)]
    (when-let [data (lookup-entry config id :replication-bucket)]
      (. builder replicationBucket data))
    (when-let [data (lookup-entry config id :stack)]
      (. builder stack data))
    (.build builder)))


(defn custom-action-property-builder
  "The custom-action-property-builder function buildes out new instances of 
CustomActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `key` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:queryable` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `secret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:secret` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CustomActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :queryable)]
      (. builder queryable data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn custom-action-registration-builder
  "The custom-action-registration-builder function buildes out new instances of 
CustomActionRegistration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:action-properties` |
| `artifactBounds` | software.amazon.awscdk.services.codepipeline.ActionArtifactBounds | [[cdk.support/lookup-entry]] | `:artifact-bounds` |
| `category` | software.amazon.awscdk.services.codepipeline.ActionCategory | [[cdk.api.services.codepipeline/action-category]] | `:category` |
| `entityUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-url` |
| `executionUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-url` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CustomActionRegistration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action-properties)]
      (. builder actionProperties data))
    (when-let [data (lookup-entry config id :artifact-bounds)]
      (. builder artifactBounds data))
    (when-let [data (action-category config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :entity-url)]
      (. builder entityUrl data))
    (when-let [data (lookup-entry config id :execution-url)]
      (. builder executionUrl data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn custom-action-registration-props-builder
  "The custom-action-registration-props-builder function buildes out new instances of 
CustomActionRegistrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:action-properties` |
| `artifactBounds` | software.amazon.awscdk.services.codepipeline.ActionArtifactBounds | [[cdk.support/lookup-entry]] | `:artifact-bounds` |
| `category` | software.amazon.awscdk.services.codepipeline.ActionCategory | [[cdk.api.services.codepipeline/action-category]] | `:category` |
| `entityUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-url` |
| `executionUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-url` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CustomActionRegistrationProps$Builder.)]
    (when-let [data (lookup-entry config id :action-properties)]
      (. builder actionProperties data))
    (when-let [data (lookup-entry config id :artifact-bounds)]
      (. builder artifactBounds data))
    (when-let [data (action-category config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :entity-url)]
      (. builder entityUrl data))
    (when-let [data (lookup-entry config id :execution-url)]
      (. builder executionUrl data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn git-configuration-builder
  "The git-configuration-builder function buildes out new instances of 
GitConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pullRequestFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:pull-request-filter` |
| `pushFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:push-filter` |
| `sourceAction` | software.amazon.awscdk.services.codepipeline.IAction | [[cdk.support/lookup-entry]] | `:source-action` |"
  [stack id config]
  (let [builder (GitConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :pull-request-filter)]
      (. builder pullRequestFilter data))
    (when-let [data (lookup-entry config id :push-filter)]
      (. builder pushFilter data))
    (when-let [data (lookup-entry config id :source-action)]
      (. builder sourceAction data))
    (.build builder)))


(defn git-pull-request-filter-builder
  "The git-pull-request-filter-builder function buildes out new instances of 
GitPullRequestFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchesExcludes` | java.util.List | [[cdk.support/lookup-entry]] | `:branches-excludes` |
| `branchesIncludes` | java.util.List | [[cdk.support/lookup-entry]] | `:branches-includes` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filePathsExcludes` | java.util.List | [[cdk.support/lookup-entry]] | `:file-paths-excludes` |
| `filePathsIncludes` | java.util.List | [[cdk.support/lookup-entry]] | `:file-paths-includes` |"
  [stack id config]
  (let [builder (GitPullRequestFilter$Builder.)]
    (when-let [data (lookup-entry config id :branches-excludes)]
      (. builder branchesExcludes data))
    (when-let [data (lookup-entry config id :branches-includes)]
      (. builder branchesIncludes data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :file-paths-excludes)]
      (. builder filePathsExcludes data))
    (when-let [data (lookup-entry config id :file-paths-includes)]
      (. builder filePathsIncludes data))
    (.build builder)))


(defn git-push-filter-builder
  "The git-push-filter-builder function buildes out new instances of 
GitPushFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagsExcludes` | java.util.List | [[cdk.support/lookup-entry]] | `:tags-excludes` |
| `tagsIncludes` | java.util.List | [[cdk.support/lookup-entry]] | `:tags-includes` |"
  [stack id config]
  (let [builder (GitPushFilter$Builder.)]
    (when-let [data (lookup-entry config id :tags-excludes)]
      (. builder tagsExcludes data))
    (when-let [data (lookup-entry config id :tags-includes)]
      (. builder tagsIncludes data))
    (.build builder)))


(defn pipeline-builder
  "The pipeline-builder function buildes out new instances of 
Pipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:artifact-bucket` |
| `crossAccountKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account-keys` |
| `crossRegionReplicationBuckets` | java.util.Map | [[cdk.support/lookup-entry]] | `:cross-region-replication-buckets` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `executionMode` | software.amazon.awscdk.services.codepipeline.ExecutionMode | [[cdk.api.services.codepipeline/execution-mode]] | `:execution-mode` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `pipelineType` | software.amazon.awscdk.services.codepipeline.PipelineType | [[cdk.api.services.codepipeline/pipeline-type]] | `:pipeline-type` |
| `restartExecutionOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restart-execution-on-update` |
| `reuseCrossRegionSupportStacks` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-cross-region-support-stacks` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `triggers` | java.util.List | [[cdk.support/lookup-entry]] | `:triggers` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (Pipeline$Builder/create stack id)]
    (when-let [data (lookup-entry config id :artifact-bucket)]
      (. builder artifactBucket data))
    (when-let [data (lookup-entry config id :cross-account-keys)]
      (. builder crossAccountKeys data))
    (when-let [data (lookup-entry config id :cross-region-replication-buckets)]
      (. builder crossRegionReplicationBuckets data))
    (when-let [data (lookup-entry config id :enable-key-rotation)]
      (. builder enableKeyRotation data))
    (when-let [data (execution-mode config id :execution-mode)]
      (. builder executionMode data))
    (when-let [data (lookup-entry config id :pipeline-name)]
      (. builder pipelineName data))
    (when-let [data (pipeline-type config id :pipeline-type)]
      (. builder pipelineType data))
    (when-let [data (lookup-entry config id :restart-execution-on-update)]
      (. builder restartExecutionOnUpdate data))
    (when-let [data (lookup-entry config id :reuse-cross-region-support-stacks)]
      (. builder reuseCrossRegionSupportStacks data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn pipeline-notify-on-options-builder
  "The pipeline-notify-on-options-builder function buildes out new instances of 
PipelineNotifyOnOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |"
  [stack id config]
  (let [builder (PipelineNotifyOnOptions$Builder.)]
    (when-let [data (detail-type config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :notification-rule-name)]
      (. builder notificationRuleName data))
    (.build builder)))


(defn pipeline-props-builder
  "The pipeline-props-builder function buildes out new instances of 
PipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:artifact-bucket` |
| `crossAccountKeys` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account-keys` |
| `crossRegionReplicationBuckets` | java.util.Map | [[cdk.support/lookup-entry]] | `:cross-region-replication-buckets` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `executionMode` | software.amazon.awscdk.services.codepipeline.ExecutionMode | [[cdk.api.services.codepipeline/execution-mode]] | `:execution-mode` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `pipelineType` | software.amazon.awscdk.services.codepipeline.PipelineType | [[cdk.api.services.codepipeline/pipeline-type]] | `:pipeline-type` |
| `restartExecutionOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restart-execution-on-update` |
| `reuseCrossRegionSupportStacks` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-cross-region-support-stacks` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
| `triggers` | java.util.List | [[cdk.support/lookup-entry]] | `:triggers` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (PipelineProps$Builder.)]
    (when-let [data (lookup-entry config id :artifact-bucket)]
      (. builder artifactBucket data))
    (when-let [data (lookup-entry config id :cross-account-keys)]
      (. builder crossAccountKeys data))
    (when-let [data (lookup-entry config id :cross-region-replication-buckets)]
      (. builder crossRegionReplicationBuckets data))
    (when-let [data (lookup-entry config id :enable-key-rotation)]
      (. builder enableKeyRotation data))
    (when-let [data (execution-mode config id :execution-mode)]
      (. builder executionMode data))
    (when-let [data (lookup-entry config id :pipeline-name)]
      (. builder pipelineName data))
    (when-let [data (pipeline-type config id :pipeline-type)]
      (. builder pipelineType data))
    (when-let [data (lookup-entry config id :restart-execution-on-update)]
      (. builder restartExecutionOnUpdate data))
    (when-let [data (lookup-entry config id :reuse-cross-region-support-stacks)]
      (. builder reuseCrossRegionSupportStacks data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn stage-options-builder
  "The stage-options-builder function buildes out new instances of 
StageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `placement` | software.amazon.awscdk.services.codepipeline.StagePlacement | [[cdk.support/lookup-entry]] | `:placement` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `transitionDisabledReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-disabled-reason` |
| `transitionToEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transition-to-enabled` |"
  [stack id config]
  (let [builder (StageOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :placement)]
      (. builder placement data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :transition-disabled-reason)]
      (. builder transitionDisabledReason data))
    (when-let [data (lookup-entry config id :transition-to-enabled)]
      (. builder transitionToEnabled data))
    (.build builder)))


(defn stage-placement-builder
  "The stage-placement-builder function buildes out new instances of 
StagePlacement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `justAfter` | software.amazon.awscdk.services.codepipeline.IStage | [[cdk.support/lookup-entry]] | `:just-after` |
| `rightBefore` | software.amazon.awscdk.services.codepipeline.IStage | [[cdk.support/lookup-entry]] | `:right-before` |"
  [stack id config]
  (let [builder (StagePlacement$Builder.)]
    (when-let [data (lookup-entry config id :just-after)]
      (. builder justAfter data))
    (when-let [data (lookup-entry config id :right-before)]
      (. builder rightBefore data))
    (.build builder)))


(defn stage-props-builder
  "The stage-props-builder function buildes out new instances of 
StageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `transitionDisabledReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-disabled-reason` |
| `transitionToEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transition-to-enabled` |"
  [stack id config]
  (let [builder (StageProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :transition-disabled-reason)]
      (. builder transitionDisabledReason data))
    (when-let [data (lookup-entry config id :transition-to-enabled)]
      (. builder transitionToEnabled data))
    (.build builder)))


(defn trigger-builder
  "The trigger-builder function buildes out new instances of 
Trigger$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitConfiguration` | software.amazon.awscdk.services.codepipeline.GitConfiguration | [[cdk.support/lookup-entry]] | `:git-configuration` |
| `providerType` | software.amazon.awscdk.services.codepipeline.ProviderType | [[cdk.api.services.codepipeline/provider-type]] | `:provider-type` |"
  [stack id config]
  (let [builder (Trigger$Builder/create)]
    (when-let [data (lookup-entry config id :git-configuration)]
      (. builder gitConfiguration data))
    (when-let [data (provider-type config id :provider-type)]
      (. builder providerType data))
    (.build builder)))


(defn trigger-props-builder
  "The trigger-props-builder function buildes out new instances of 
TriggerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitConfiguration` | software.amazon.awscdk.services.codepipeline.GitConfiguration | [[cdk.support/lookup-entry]] | `:git-configuration` |
| `providerType` | software.amazon.awscdk.services.codepipeline.ProviderType | [[cdk.api.services.codepipeline/provider-type]] | `:provider-type` |"
  [stack id config]
  (let [builder (TriggerProps$Builder.)]
    (when-let [data (lookup-entry config id :git-configuration)]
      (. builder gitConfiguration data))
    (when-let [data (provider-type config id :provider-type)]
      (. builder providerType data))
    (.build builder)))


(defn variable-builder
  "The variable-builder function buildes out new instances of 
Variable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |"
  [stack id config]
  (let [builder (Variable$Builder/create)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :variable-name)]
      (. builder variableName data))
    (.build builder)))


(defn variable-props-builder
  "The variable-props-builder function buildes out new instances of 
VariableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |"
  [stack id config]
  (let [builder (VariableProps$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :variable-name)]
      (. builder variableName data))
    (.build builder)))