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


(defn build-action-artifact-bounds-builder
  "The build-action-artifact-bounds-builder function updates a ActionArtifactBounds$Builder instance using the provided configuration.
  The function takes the ActionArtifactBounds$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxInputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-inputs` |
| `maxOutputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-outputs` |
| `minInputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-inputs` |
| `minOutputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-outputs` |
"
  [^ActionArtifactBounds$Builder builder id config]
  (when-let [data (lookup-entry config id :max-inputs)]
    (. builder maxInputs data))
  (when-let [data (lookup-entry config id :max-outputs)]
    (. builder maxOutputs data))
  (when-let [data (lookup-entry config id :min-inputs)]
    (. builder minInputs data))
  (when-let [data (lookup-entry config id :min-outputs)]
    (. builder minOutputs data))
  (.build builder))


(defn action-artifact-bounds-builder
  "Creates a  `ActionArtifactBounds$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-action-artifact-bounds-builder (new ActionArtifactBounds$Builder) id config))


(defn build-action-bind-options-builder
  "The build-action-bind-options-builder function updates a ActionBindOptions$Builder instance using the provided configuration.
  The function takes the ActionBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^ActionBindOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn action-bind-options-builder
  "Creates a  `ActionBindOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-action-bind-options-builder (new ActionBindOptions$Builder) id config))


(defn build-action-config-builder
  "The build-action-config-builder function updates a ActionConfig$Builder instance using the provided configuration.
  The function takes the ActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:configuration` |
"
  [^ActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (.build builder))


(defn action-config-builder
  "Creates a  `ActionConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-action-config-builder (new ActionConfig$Builder) id config))


(defn build-action-properties-builder
  "The build-action-properties-builder function updates a ActionProperties$Builder instance using the provided configuration.
  The function takes the ActionProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^ActionProperties$Builder builder id config]
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
  (.build builder))


(defn action-properties-builder
  "Creates a  `ActionProperties$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-action-properties-builder (new ActionProperties$Builder) id config))


(defn build-cfn-custom-action-type-artifact-details-property-builder
  "The build-cfn-custom-action-type-artifact-details-property-builder function updates a CfnCustomActionType$ArtifactDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomActionType$ArtifactDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-count` |
| `minimumCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-count` |
"
  [^CfnCustomActionType$ArtifactDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-count)]
    (. builder maximumCount data))
  (when-let [data (lookup-entry config id :minimum-count)]
    (. builder minimumCount data))
  (.build builder))


(defn cfn-custom-action-type-artifact-details-property-builder
  "Creates a  `CfnCustomActionType$ArtifactDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-custom-action-type-artifact-details-property-builder (new CfnCustomActionType$ArtifactDetailsProperty$Builder) id config))


(defn build-cfn-custom-action-type-builder
  "The build-cfn-custom-action-type-builder function updates a CfnCustomActionType$Builder instance using the provided configuration.
  The function takes the CfnCustomActionType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `configurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `inputArtifactDetails` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$ArtifactDetailsProperty | [[cdk.support/lookup-entry]] | `:input-artifact-details` |
| `outputArtifactDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-artifact-details` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `settings` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$SettingsProperty | [[cdk.support/lookup-entry]] | `:settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnCustomActionType$Builder builder id config]
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
  (.build builder))


(defn cfn-custom-action-type-builder
  "Creates a  `CfnCustomActionType$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-custom-action-type-builder (CfnCustomActionType$Builder/create scope (name id)) id config))


(defn build-cfn-custom-action-type-configuration-properties-property-builder
  "The build-cfn-custom-action-type-configuration-properties-property-builder function updates a CfnCustomActionType$ConfigurationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomActionType$ConfigurationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `key` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:queryable` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `secret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:secret` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCustomActionType$ConfigurationPropertiesProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-custom-action-type-configuration-properties-property-builder
  "Creates a  `CfnCustomActionType$ConfigurationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-custom-action-type-configuration-properties-property-builder (new CfnCustomActionType$ConfigurationPropertiesProperty$Builder) id config))


(defn build-cfn-custom-action-type-props-builder
  "The build-cfn-custom-action-type-props-builder function updates a CfnCustomActionTypeProps$Builder instance using the provided configuration.
  The function takes the CfnCustomActionTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `configurationProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `inputArtifactDetails` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$ArtifactDetailsProperty | [[cdk.support/lookup-entry]] | `:input-artifact-details` |
| `outputArtifactDetails` | software.amazon.awscdk.services.codepipeline.CfnCustomActionType$ArtifactDetailsProperty | [[cdk.support/lookup-entry]] | `:output-artifact-details` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnCustomActionTypeProps$Builder builder id config]
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
  (.build builder))


(defn cfn-custom-action-type-props-builder
  "Creates a  `CfnCustomActionTypeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-custom-action-type-props-builder (new CfnCustomActionTypeProps$Builder) id config))


(defn build-cfn-custom-action-type-settings-property-builder
  "The build-cfn-custom-action-type-settings-property-builder function updates a CfnCustomActionType$SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomActionType$SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityUrlTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-url-template` |
| `executionUrlTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-url-template` |
| `revisionUrlTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-url-template` |
| `thirdPartyConfigurationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:third-party-configuration-url` |
"
  [^CfnCustomActionType$SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :entity-url-template)]
    (. builder entityUrlTemplate data))
  (when-let [data (lookup-entry config id :execution-url-template)]
    (. builder executionUrlTemplate data))
  (when-let [data (lookup-entry config id :revision-url-template)]
    (. builder revisionUrlTemplate data))
  (when-let [data (lookup-entry config id :third-party-configuration-url)]
    (. builder thirdPartyConfigurationUrl data))
  (.build builder))


(defn cfn-custom-action-type-settings-property-builder
  "Creates a  `CfnCustomActionType$SettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-custom-action-type-settings-property-builder (new CfnCustomActionType$SettingsProperty$Builder) id config))


(defn build-cfn-pipeline-action-declaration-property-builder
  "The build-cfn-pipeline-action-declaration-property-builder function updates a CfnPipeline$ActionDeclarationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ActionDeclarationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnPipeline$ActionDeclarationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-pipeline-action-declaration-property-builder
  "Creates a  `CfnPipeline$ActionDeclarationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-action-declaration-property-builder (new CfnPipeline$ActionDeclarationProperty$Builder) id config))


(defn build-cfn-pipeline-action-type-id-property-builder
  "The build-cfn-pipeline-action-type-id-property-builder function updates a CfnPipeline$ActionTypeIdProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ActionTypeIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnPipeline$ActionTypeIdProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :category)]
    (. builder category data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :provider)]
    (. builder provider data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-pipeline-action-type-id-property-builder
  "Creates a  `CfnPipeline$ActionTypeIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-action-type-id-property-builder (new CfnPipeline$ActionTypeIdProperty$Builder) id config))


(defn build-cfn-pipeline-artifact-store-map-property-builder
  "The build-cfn-pipeline-artifact-store-map-property-builder function updates a CfnPipeline$ArtifactStoreMapProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ArtifactStoreMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactStore` | software.amazon.awscdk.services.codepipeline.CfnPipeline$ArtifactStoreProperty | [[cdk.support/lookup-entry]] | `:artifact-store` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnPipeline$ArtifactStoreMapProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-store)]
    (. builder artifactStore data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-pipeline-artifact-store-map-property-builder
  "Creates a  `CfnPipeline$ArtifactStoreMapProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-artifact-store-map-property-builder (new CfnPipeline$ArtifactStoreMapProperty$Builder) id config))


(defn build-cfn-pipeline-artifact-store-property-builder
  "The build-cfn-pipeline-artifact-store-property-builder function updates a CfnPipeline$ArtifactStoreProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ArtifactStoreProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPipeline$ArtifactStoreProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-pipeline-artifact-store-property-builder
  "Creates a  `CfnPipeline$ArtifactStoreProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-artifact-store-property-builder (new CfnPipeline$ArtifactStoreProperty$Builder) id config))


(defn build-cfn-pipeline-blocker-declaration-property-builder
  "The build-cfn-pipeline-blocker-declaration-property-builder function updates a CfnPipeline$BlockerDeclarationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$BlockerDeclarationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPipeline$BlockerDeclarationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-pipeline-blocker-declaration-property-builder
  "Creates a  `CfnPipeline$BlockerDeclarationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-blocker-declaration-property-builder (new CfnPipeline$BlockerDeclarationProperty$Builder) id config))


(defn build-cfn-pipeline-builder
  "The build-cfn-pipeline-builder function updates a CfnPipeline$Builder instance using the provided configuration.
  The function takes the CfnPipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnPipeline$Builder builder id config]
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
  (.build builder))


(defn cfn-pipeline-builder
  "Creates a  `CfnPipeline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-pipeline-builder (CfnPipeline$Builder/create scope (name id)) id config))


(defn build-cfn-pipeline-encryption-key-property-builder
  "The build-cfn-pipeline-encryption-key-property-builder function updates a CfnPipeline$EncryptionKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$EncryptionKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPipeline$EncryptionKeyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-pipeline-encryption-key-property-builder
  "Creates a  `CfnPipeline$EncryptionKeyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-encryption-key-property-builder (new CfnPipeline$EncryptionKeyProperty$Builder) id config))


(defn build-cfn-pipeline-failure-conditions-property-builder
  "The build-cfn-pipeline-failure-conditions-property-builder function updates a CfnPipeline$FailureConditionsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$FailureConditionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `result` | java.lang.String | [[cdk.support/lookup-entry]] | `:result` |
"
  [^CfnPipeline$FailureConditionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :result)]
    (. builder result data))
  (.build builder))


(defn cfn-pipeline-failure-conditions-property-builder
  "Creates a  `CfnPipeline$FailureConditionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-failure-conditions-property-builder (new CfnPipeline$FailureConditionsProperty$Builder) id config))


(defn build-cfn-pipeline-git-branch-filter-criteria-property-builder
  "The build-cfn-pipeline-git-branch-filter-criteria-property-builder function updates a CfnPipeline$GitBranchFilterCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$GitBranchFilterCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |
"
  [^CfnPipeline$GitBranchFilterCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excludes)]
    (. builder excludes data))
  (when-let [data (lookup-entry config id :includes)]
    (. builder includes data))
  (.build builder))


(defn cfn-pipeline-git-branch-filter-criteria-property-builder
  "Creates a  `CfnPipeline$GitBranchFilterCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-git-branch-filter-criteria-property-builder (new CfnPipeline$GitBranchFilterCriteriaProperty$Builder) id config))


(defn build-cfn-pipeline-git-configuration-property-builder
  "The build-cfn-pipeline-git-configuration-property-builder function updates a CfnPipeline$GitConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$GitConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pullRequest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pull-request` |
| `push` | java.util.List | [[cdk.support/lookup-entry]] | `:push` |
| `sourceActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-action-name` |
"
  [^CfnPipeline$GitConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pull-request)]
    (. builder pullRequest data))
  (when-let [data (lookup-entry config id :push)]
    (. builder push data))
  (when-let [data (lookup-entry config id :source-action-name)]
    (. builder sourceActionName data))
  (.build builder))


(defn cfn-pipeline-git-configuration-property-builder
  "Creates a  `CfnPipeline$GitConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-git-configuration-property-builder (new CfnPipeline$GitConfigurationProperty$Builder) id config))


(defn build-cfn-pipeline-git-file-path-filter-criteria-property-builder
  "The build-cfn-pipeline-git-file-path-filter-criteria-property-builder function updates a CfnPipeline$GitFilePathFilterCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$GitFilePathFilterCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |
"
  [^CfnPipeline$GitFilePathFilterCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excludes)]
    (. builder excludes data))
  (when-let [data (lookup-entry config id :includes)]
    (. builder includes data))
  (.build builder))


(defn cfn-pipeline-git-file-path-filter-criteria-property-builder
  "Creates a  `CfnPipeline$GitFilePathFilterCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-git-file-path-filter-criteria-property-builder (new CfnPipeline$GitFilePathFilterCriteriaProperty$Builder) id config))


(defn build-cfn-pipeline-git-pull-request-filter-property-builder
  "The build-cfn-pipeline-git-pull-request-filter-property-builder function updates a CfnPipeline$GitPullRequestFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$GitPullRequestFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:branches` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filePaths` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitFilePathFilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:file-paths` |
"
  [^CfnPipeline$GitPullRequestFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :branches)]
    (. builder branches data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :file-paths)]
    (. builder filePaths data))
  (.build builder))


(defn cfn-pipeline-git-pull-request-filter-property-builder
  "Creates a  `CfnPipeline$GitPullRequestFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-git-pull-request-filter-property-builder (new CfnPipeline$GitPullRequestFilterProperty$Builder) id config))


(defn build-cfn-pipeline-git-push-filter-property-builder
  "The build-cfn-pipeline-git-push-filter-property-builder function updates a CfnPipeline$GitPushFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$GitPushFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:branches` |
| `filePaths` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitFilePathFilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:file-paths` |
| `tags` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitTagFilterCriteriaProperty | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPipeline$GitPushFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :branches)]
    (. builder branches data))
  (when-let [data (lookup-entry config id :file-paths)]
    (. builder filePaths data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pipeline-git-push-filter-property-builder
  "Creates a  `CfnPipeline$GitPushFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-git-push-filter-property-builder (new CfnPipeline$GitPushFilterProperty$Builder) id config))


(defn build-cfn-pipeline-git-tag-filter-criteria-property-builder
  "The build-cfn-pipeline-git-tag-filter-criteria-property-builder function updates a CfnPipeline$GitTagFilterCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$GitTagFilterCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |
"
  [^CfnPipeline$GitTagFilterCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excludes)]
    (. builder excludes data))
  (when-let [data (lookup-entry config id :includes)]
    (. builder includes data))
  (.build builder))


(defn cfn-pipeline-git-tag-filter-criteria-property-builder
  "Creates a  `CfnPipeline$GitTagFilterCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-git-tag-filter-criteria-property-builder (new CfnPipeline$GitTagFilterCriteriaProperty$Builder) id config))


(defn build-cfn-pipeline-input-artifact-property-builder
  "The build-cfn-pipeline-input-artifact-property-builder function updates a CfnPipeline$InputArtifactProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$InputArtifactProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPipeline$InputArtifactProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-pipeline-input-artifact-property-builder
  "Creates a  `CfnPipeline$InputArtifactProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-input-artifact-property-builder (new CfnPipeline$InputArtifactProperty$Builder) id config))


(defn build-cfn-pipeline-output-artifact-property-builder
  "The build-cfn-pipeline-output-artifact-property-builder function updates a CfnPipeline$OutputArtifactProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$OutputArtifactProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPipeline$OutputArtifactProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-pipeline-output-artifact-property-builder
  "Creates a  `CfnPipeline$OutputArtifactProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-output-artifact-property-builder (new CfnPipeline$OutputArtifactProperty$Builder) id config))


(defn build-cfn-pipeline-pipeline-trigger-declaration-property-builder
  "The build-cfn-pipeline-pipeline-trigger-declaration-property-builder function updates a CfnPipeline$PipelineTriggerDeclarationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$PipelineTriggerDeclarationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitConfiguration` | software.amazon.awscdk.services.codepipeline.CfnPipeline$GitConfigurationProperty | [[cdk.support/lookup-entry]] | `:git-configuration` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
"
  [^CfnPipeline$PipelineTriggerDeclarationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :git-configuration)]
    (. builder gitConfiguration data))
  (when-let [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (.build builder))


(defn cfn-pipeline-pipeline-trigger-declaration-property-builder
  "Creates a  `CfnPipeline$PipelineTriggerDeclarationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-pipeline-trigger-declaration-property-builder (new CfnPipeline$PipelineTriggerDeclarationProperty$Builder) id config))


(defn build-cfn-pipeline-props-builder
  "The build-cfn-pipeline-props-builder function updates a CfnPipelineProps$Builder instance using the provided configuration.
  The function takes the CfnPipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnPipelineProps$Builder builder id config]
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
  (.build builder))


(defn cfn-pipeline-props-builder
  "Creates a  `CfnPipelineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-props-builder (new CfnPipelineProps$Builder) id config))


(defn build-cfn-pipeline-stage-declaration-property-builder
  "The build-cfn-pipeline-stage-declaration-property-builder function updates a CfnPipeline$StageDeclarationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$StageDeclarationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `blockers` | java.util.List | [[cdk.support/lookup-entry]] | `:blockers` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `onFailure` | software.amazon.awscdk.services.codepipeline.CfnPipeline$FailureConditionsProperty | [[cdk.support/lookup-entry]] | `:on-failure` |
"
  [^CfnPipeline$StageDeclarationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :blockers)]
    (. builder blockers data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (.build builder))


(defn cfn-pipeline-stage-declaration-property-builder
  "Creates a  `CfnPipeline$StageDeclarationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-stage-declaration-property-builder (new CfnPipeline$StageDeclarationProperty$Builder) id config))


(defn build-cfn-pipeline-stage-transition-property-builder
  "The build-cfn-pipeline-stage-transition-property-builder function updates a CfnPipeline$StageTransitionProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$StageTransitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnPipeline$StageTransitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :reason)]
    (. builder reason data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn cfn-pipeline-stage-transition-property-builder
  "Creates a  `CfnPipeline$StageTransitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-stage-transition-property-builder (new CfnPipeline$StageTransitionProperty$Builder) id config))


(defn build-cfn-pipeline-variable-declaration-property-builder
  "The build-cfn-pipeline-variable-declaration-property-builder function updates a CfnPipeline$VariableDeclarationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$VariableDeclarationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPipeline$VariableDeclarationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-pipeline-variable-declaration-property-builder
  "Creates a  `CfnPipeline$VariableDeclarationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-variable-declaration-property-builder (new CfnPipeline$VariableDeclarationProperty$Builder) id config))


(defn build-cfn-webhook-builder
  "The build-cfn-webhook-builder function updates a CfnWebhook$Builder instance using the provided configuration.
  The function takes the CfnWebhook$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `authenticationConfiguration` | software.amazon.awscdk.services.codepipeline.CfnWebhook$WebhookAuthConfigurationProperty | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registerWithThirdParty` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:register-with-third-party` |
| `targetAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-action` |
| `targetPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-pipeline` |
| `targetPipelineVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-pipeline-version` |
"
  [^CfnWebhook$Builder builder id config]
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
  (.build builder))


(defn cfn-webhook-builder
  "Creates a  `CfnWebhook$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-webhook-builder (CfnWebhook$Builder/create scope (name id)) id config))


(defn build-cfn-webhook-props-builder
  "The build-cfn-webhook-props-builder function updates a CfnWebhookProps$Builder instance using the provided configuration.
  The function takes the CfnWebhookProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `authenticationConfiguration` | software.amazon.awscdk.services.codepipeline.CfnWebhook$WebhookAuthConfigurationProperty | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `registerWithThirdParty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:register-with-third-party` |
| `targetAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-action` |
| `targetPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-pipeline` |
| `targetPipelineVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-pipeline-version` |
"
  [^CfnWebhookProps$Builder builder id config]
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
  (.build builder))


(defn cfn-webhook-props-builder
  "Creates a  `CfnWebhookProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-webhook-props-builder (new CfnWebhookProps$Builder) id config))


(defn build-cfn-webhook-webhook-auth-configuration-property-builder
  "The build-cfn-webhook-webhook-auth-configuration-property-builder function updates a CfnWebhook$WebhookAuthConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWebhook$WebhookAuthConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedIpRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-ip-range` |
| `secretToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-token` |
"
  [^CfnWebhook$WebhookAuthConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-ip-range)]
    (. builder allowedIpRange data))
  (when-let [data (lookup-entry config id :secret-token)]
    (. builder secretToken data))
  (.build builder))


(defn cfn-webhook-webhook-auth-configuration-property-builder
  "Creates a  `CfnWebhook$WebhookAuthConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-webhook-webhook-auth-configuration-property-builder (new CfnWebhook$WebhookAuthConfigurationProperty$Builder) id config))


(defn build-cfn-webhook-webhook-filter-rule-property-builder
  "The build-cfn-webhook-webhook-filter-rule-property-builder function updates a CfnWebhook$WebhookFilterRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnWebhook$WebhookFilterRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `matchEquals` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-equals` |
"
  [^CfnWebhook$WebhookFilterRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :json-path)]
    (. builder jsonPath data))
  (when-let [data (lookup-entry config id :match-equals)]
    (. builder matchEquals data))
  (.build builder))


(defn cfn-webhook-webhook-filter-rule-property-builder
  "Creates a  `CfnWebhook$WebhookFilterRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-webhook-webhook-filter-rule-property-builder (new CfnWebhook$WebhookFilterRuleProperty$Builder) id config))


(defn build-common-action-props-builder
  "The build-common-action-props-builder function updates a CommonActionProps$Builder instance using the provided configuration.
  The function takes the CommonActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CommonActionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-let [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn common-action-props-builder
  "Creates a  `CommonActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-common-action-props-builder (new CommonActionProps$Builder) id config))


(defn build-common-aws-action-props-builder
  "The build-common-aws-action-props-builder function updates a CommonAwsActionProps$Builder instance using the provided configuration.
  The function takes the CommonAwsActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-order` |
| `variablesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:variables-namespace` |
"
  [^CommonAwsActionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :run-order)]
    (. builder runOrder data))
  (when-let [data (lookup-entry config id :variables-namespace)]
    (. builder variablesNamespace data))
  (.build builder))


(defn common-aws-action-props-builder
  "Creates a  `CommonAwsActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-common-aws-action-props-builder (new CommonAwsActionProps$Builder) id config))


(defn build-cross-region-support-builder
  "The build-cross-region-support-builder function updates a CrossRegionSupport$Builder instance using the provided configuration.
  The function takes the CrossRegionSupport$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:replication-bucket` |
| `stack` | software.amazon.awscdk.Stack | [[cdk.support/lookup-entry]] | `:stack` |
"
  [^CrossRegionSupport$Builder builder id config]
  (when-let [data (lookup-entry config id :replication-bucket)]
    (. builder replicationBucket data))
  (when-let [data (lookup-entry config id :stack)]
    (. builder stack data))
  (.build builder))


(defn cross-region-support-builder
  "Creates a  `CrossRegionSupport$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cross-region-support-builder (new CrossRegionSupport$Builder) id config))


(defn build-custom-action-property-builder
  "The build-custom-action-property-builder function updates a CustomActionProperty$Builder instance using the provided configuration.
  The function takes the CustomActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `key` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:queryable` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `secret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:secret` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CustomActionProperty$Builder builder id config]
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
  (.build builder))


(defn custom-action-property-builder
  "Creates a  `CustomActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-custom-action-property-builder (new CustomActionProperty$Builder) id config))


(defn build-custom-action-registration-builder
  "The build-custom-action-registration-builder function updates a CustomActionRegistration$Builder instance using the provided configuration.
  The function takes the CustomActionRegistration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:action-properties` |
| `artifactBounds` | software.amazon.awscdk.services.codepipeline.ActionArtifactBounds | [[cdk.support/lookup-entry]] | `:artifact-bounds` |
| `category` | software.amazon.awscdk.services.codepipeline.ActionCategory | [[cdk.api.services.codepipeline/action-category]] | `:category` |
| `entityUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-url` |
| `executionUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-url` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CustomActionRegistration$Builder builder id config]
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
  (.build builder))


(defn custom-action-registration-builder
  "Creates a  `CustomActionRegistration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-custom-action-registration-builder (CustomActionRegistration$Builder/create scope (name id)) id config))


(defn build-custom-action-registration-props-builder
  "The build-custom-action-registration-props-builder function updates a CustomActionRegistrationProps$Builder instance using the provided configuration.
  The function takes the CustomActionRegistrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:action-properties` |
| `artifactBounds` | software.amazon.awscdk.services.codepipeline.ActionArtifactBounds | [[cdk.support/lookup-entry]] | `:artifact-bounds` |
| `category` | software.amazon.awscdk.services.codepipeline.ActionCategory | [[cdk.api.services.codepipeline/action-category]] | `:category` |
| `entityUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-url` |
| `executionUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-url` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CustomActionRegistrationProps$Builder builder id config]
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
  (.build builder))


(defn custom-action-registration-props-builder
  "Creates a  `CustomActionRegistrationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-custom-action-registration-props-builder (new CustomActionRegistrationProps$Builder) id config))


(defn build-git-configuration-builder
  "The build-git-configuration-builder function updates a GitConfiguration$Builder instance using the provided configuration.
  The function takes the GitConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pullRequestFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:pull-request-filter` |
| `pushFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:push-filter` |
| `sourceAction` | software.amazon.awscdk.services.codepipeline.IAction | [[cdk.support/lookup-entry]] | `:source-action` |
"
  [^GitConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :pull-request-filter)]
    (. builder pullRequestFilter data))
  (when-let [data (lookup-entry config id :push-filter)]
    (. builder pushFilter data))
  (when-let [data (lookup-entry config id :source-action)]
    (. builder sourceAction data))
  (.build builder))


(defn git-configuration-builder
  "Creates a  `GitConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-git-configuration-builder (new GitConfiguration$Builder) id config))


(defn build-git-pull-request-filter-builder
  "The build-git-pull-request-filter-builder function updates a GitPullRequestFilter$Builder instance using the provided configuration.
  The function takes the GitPullRequestFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchesExcludes` | java.util.List | [[cdk.support/lookup-entry]] | `:branches-excludes` |
| `branchesIncludes` | java.util.List | [[cdk.support/lookup-entry]] | `:branches-includes` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filePathsExcludes` | java.util.List | [[cdk.support/lookup-entry]] | `:file-paths-excludes` |
| `filePathsIncludes` | java.util.List | [[cdk.support/lookup-entry]] | `:file-paths-includes` |
"
  [^GitPullRequestFilter$Builder builder id config]
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
  (.build builder))


(defn git-pull-request-filter-builder
  "Creates a  `GitPullRequestFilter$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-git-pull-request-filter-builder (new GitPullRequestFilter$Builder) id config))


(defn build-git-push-filter-builder
  "The build-git-push-filter-builder function updates a GitPushFilter$Builder instance using the provided configuration.
  The function takes the GitPushFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagsExcludes` | java.util.List | [[cdk.support/lookup-entry]] | `:tags-excludes` |
| `tagsIncludes` | java.util.List | [[cdk.support/lookup-entry]] | `:tags-includes` |
"
  [^GitPushFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :tags-excludes)]
    (. builder tagsExcludes data))
  (when-let [data (lookup-entry config id :tags-includes)]
    (. builder tagsIncludes data))
  (.build builder))


(defn git-push-filter-builder
  "Creates a  `GitPushFilter$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-git-push-filter-builder (new GitPushFilter$Builder) id config))


(defn build-pipeline-builder
  "The build-pipeline-builder function updates a Pipeline$Builder instance using the provided configuration.
  The function takes the Pipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^Pipeline$Builder builder id config]
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
  (.build builder))


(defn pipeline-builder
  "Creates a  `Pipeline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-pipeline-builder (Pipeline$Builder/create scope (name id)) id config))


(defn build-pipeline-notify-on-options-builder
  "The build-pipeline-notify-on-options-builder function updates a PipelineNotifyOnOptions$Builder instance using the provided configuration.
  The function takes the PipelineNotifyOnOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
"
  [^PipelineNotifyOnOptions$Builder builder id config]
  (when-let [data (detail-type config id :detail-type)]
    (. builder detailType data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :notification-rule-name)]
    (. builder notificationRuleName data))
  (.build builder))


(defn pipeline-notify-on-options-builder
  "Creates a  `PipelineNotifyOnOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-pipeline-notify-on-options-builder (new PipelineNotifyOnOptions$Builder) id config))


(defn build-pipeline-props-builder
  "The build-pipeline-props-builder function updates a PipelineProps$Builder instance using the provided configuration.
  The function takes the PipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^PipelineProps$Builder builder id config]
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
  (.build builder))


(defn pipeline-props-builder
  "Creates a  `PipelineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-pipeline-props-builder (new PipelineProps$Builder) id config))


(defn build-stage-options-builder
  "The build-stage-options-builder function updates a StageOptions$Builder instance using the provided configuration.
  The function takes the StageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `placement` | software.amazon.awscdk.services.codepipeline.StagePlacement | [[cdk.support/lookup-entry]] | `:placement` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `transitionDisabledReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-disabled-reason` |
| `transitionToEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transition-to-enabled` |
"
  [^StageOptions$Builder builder id config]
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
  (.build builder))


(defn stage-options-builder
  "Creates a  `StageOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-stage-options-builder (new StageOptions$Builder) id config))


(defn build-stage-placement-builder
  "The build-stage-placement-builder function updates a StagePlacement$Builder instance using the provided configuration.
  The function takes the StagePlacement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `justAfter` | software.amazon.awscdk.services.codepipeline.IStage | [[cdk.support/lookup-entry]] | `:just-after` |
| `rightBefore` | software.amazon.awscdk.services.codepipeline.IStage | [[cdk.support/lookup-entry]] | `:right-before` |
"
  [^StagePlacement$Builder builder id config]
  (when-let [data (lookup-entry config id :just-after)]
    (. builder justAfter data))
  (when-let [data (lookup-entry config id :right-before)]
    (. builder rightBefore data))
  (.build builder))


(defn stage-placement-builder
  "Creates a  `StagePlacement$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-stage-placement-builder (new StagePlacement$Builder) id config))


(defn build-stage-props-builder
  "The build-stage-props-builder function updates a StageProps$Builder instance using the provided configuration.
  The function takes the StageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `transitionDisabledReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-disabled-reason` |
| `transitionToEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transition-to-enabled` |
"
  [^StageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-let [data (lookup-entry config id :transition-disabled-reason)]
    (. builder transitionDisabledReason data))
  (when-let [data (lookup-entry config id :transition-to-enabled)]
    (. builder transitionToEnabled data))
  (.build builder))


(defn stage-props-builder
  "Creates a  `StageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-stage-props-builder (new StageProps$Builder) id config))


(defn build-trigger-builder
  "The build-trigger-builder function updates a Trigger$Builder instance using the provided configuration.
  The function takes the Trigger$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitConfiguration` | software.amazon.awscdk.services.codepipeline.GitConfiguration | [[cdk.support/lookup-entry]] | `:git-configuration` |
| `providerType` | software.amazon.awscdk.services.codepipeline.ProviderType | [[cdk.api.services.codepipeline/provider-type]] | `:provider-type` |
"
  [^Trigger$Builder builder id config]
  (when-let [data (lookup-entry config id :git-configuration)]
    (. builder gitConfiguration data))
  (when-let [data (provider-type config id :provider-type)]
    (. builder providerType data))
  (.build builder))


(defn trigger-builder
  "Creates a  `Trigger$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-trigger-builder (Trigger$Builder/create) id config))


(defn build-trigger-props-builder
  "The build-trigger-props-builder function updates a TriggerProps$Builder instance using the provided configuration.
  The function takes the TriggerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitConfiguration` | software.amazon.awscdk.services.codepipeline.GitConfiguration | [[cdk.support/lookup-entry]] | `:git-configuration` |
| `providerType` | software.amazon.awscdk.services.codepipeline.ProviderType | [[cdk.api.services.codepipeline/provider-type]] | `:provider-type` |
"
  [^TriggerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :git-configuration)]
    (. builder gitConfiguration data))
  (when-let [data (provider-type config id :provider-type)]
    (. builder providerType data))
  (.build builder))


(defn trigger-props-builder
  "Creates a  `TriggerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-trigger-props-builder (new TriggerProps$Builder) id config))


(defn build-variable-builder
  "The build-variable-builder function updates a Variable$Builder instance using the provided configuration.
  The function takes the Variable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |
"
  [^Variable$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :variable-name)]
    (. builder variableName data))
  (.build builder))


(defn variable-builder
  "Creates a  `Variable$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-variable-builder (Variable$Builder/create) id config))


(defn build-variable-props-builder
  "The build-variable-props-builder function updates a VariableProps$Builder instance using the provided configuration.
  The function takes the VariableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |
"
  [^VariableProps$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :variable-name)]
    (. builder variableName data))
  (.build builder))


(defn variable-props-builder
  "Creates a  `VariableProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-variable-props-builder (new VariableProps$Builder) id config))