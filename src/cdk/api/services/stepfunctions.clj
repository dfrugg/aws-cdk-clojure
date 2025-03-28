(ns cdk.api.services.stepfunctions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.stepfunctions package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             removal-policy
                             symlink-follow-mode]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.stepfunctions Activity$Builder
                                                          ActivityProps$Builder
                                                          AfterwardsOptions$Builder
                                                          CatchProps$Builder
                                                          CfnActivity$Builder
                                                          CfnActivity$TagsEntryProperty$Builder
                                                          CfnActivityProps$Builder
                                                          CfnStateMachine$Builder
                                                          CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder
                                                          CfnStateMachine$LogDestinationProperty$Builder
                                                          CfnStateMachine$LoggingConfigurationProperty$Builder
                                                          CfnStateMachine$S3LocationProperty$Builder
                                                          CfnStateMachine$TagsEntryProperty$Builder
                                                          CfnStateMachine$TracingConfigurationProperty$Builder
                                                          CfnStateMachineAlias$Builder
                                                          CfnStateMachineAlias$DeploymentPreferenceProperty$Builder
                                                          CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder
                                                          CfnStateMachineAliasProps$Builder
                                                          CfnStateMachineProps$Builder
                                                          CfnStateMachineVersion$Builder
                                                          CfnStateMachineVersionProps$Builder
                                                          Choice$Builder
                                                          ChoiceProps$Builder
                                                          ChoiceTransitionOptions$Builder
                                                          Credentials$Builder
                                                          CsvHeaderLocation
                                                          CustomState$Builder
                                                          CustomStateProps$Builder
                                                          DefinitionConfig$Builder
                                                          DistributedMap$Builder
                                                          DistributedMapProps$Builder
                                                          Fail$Builder
                                                          FailProps$Builder
                                                          FileDefinitionBody$Builder
                                                          FindStateOptions$Builder
                                                          InputType
                                                          IntegrationPattern
                                                          ItemBatcher$Builder
                                                          ItemBatcherProps$Builder
                                                          ItemReaderProps$Builder
                                                          JitterType
                                                          LogLevel
                                                          LogOptions$Builder
                                                          Map$Builder
                                                          MapBaseProps$Builder
                                                          MapProps$Builder
                                                          Parallel$Builder
                                                          ParallelProps$Builder
                                                          Pass$Builder
                                                          PassProps$Builder
                                                          ProcessorConfig$Builder
                                                          ProcessorMode
                                                          ProcessorType
                                                          ResultWriter$Builder
                                                          ResultWriterProps$Builder
                                                          RetryProps$Builder
                                                          S3CsvItemReader$Builder
                                                          S3CsvItemReaderProps$Builder
                                                          S3FileItemReaderProps$Builder
                                                          S3JsonItemReader$Builder
                                                          S3ManifestItemReader$Builder
                                                          S3ObjectsItemReader$Builder
                                                          S3ObjectsItemReaderProps$Builder
                                                          ServiceIntegrationPattern
                                                          SingleStateOptions$Builder
                                                          StateMachine$Builder
                                                          StateMachineProps$Builder
                                                          StateMachineType
                                                          StateProps$Builder
                                                          Succeed$Builder
                                                          SucceedProps$Builder
                                                          TaskMetricsConfig$Builder
                                                          TaskStateBaseProps$Builder
                                                          Wait$Builder
                                                          WaitProps$Builder]))


(defn csv-header-location
  "The `csv-header-location` function data interprets values in the provided config data into a 
`CsvHeaderLocation` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CsvHeaderLocation` - the value is returned.
* is `:first-row` - `CsvHeaderLocation/FIRST_ROW` is returned
* is `:given` - `CsvHeaderLocation/GIVEN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CsvHeaderLocation data) data
      (= :first-row data) CsvHeaderLocation/FIRST_ROW
      (= :given data) CsvHeaderLocation/GIVEN)))


(defn input-type
  "The `input-type` function data interprets values in the provided config data into a 
`InputType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InputType` - the value is returned.
* is `:object` - `InputType/OBJECT` is returned
* is `:text` - `InputType/TEXT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InputType data) data
      (= :object data) InputType/OBJECT
      (= :text data) InputType/TEXT)))


(defn integration-pattern
  "The `integration-pattern` function data interprets values in the provided config data into a 
`IntegrationPattern` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IntegrationPattern` - the value is returned.
* is `:run-job` - `IntegrationPattern/RUN_JOB` is returned
* is `:wait-for-task-token` - `IntegrationPattern/WAIT_FOR_TASK_TOKEN` is returned
* is `:request-response` - `IntegrationPattern/REQUEST_RESPONSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IntegrationPattern data) data
      (= :run-job data) IntegrationPattern/RUN_JOB
      (= :wait-for-task-token data) IntegrationPattern/WAIT_FOR_TASK_TOKEN
      (= :request-response data) IntegrationPattern/REQUEST_RESPONSE)))


(defn jitter-type
  "The `jitter-type` function data interprets values in the provided config data into a 
`JitterType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JitterType` - the value is returned.
* is `:full` - `JitterType/FULL` is returned
* is `:none` - `JitterType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JitterType data) data
      (= :full data) JitterType/FULL
      (= :none data) JitterType/NONE)))


(defn log-level
  "The `log-level` function data interprets values in the provided config data into a 
`LogLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LogLevel` - the value is returned.
* is `:all` - `LogLevel/ALL` is returned
* is `:fatal` - `LogLevel/FATAL` is returned
* is `:off` - `LogLevel/OFF` is returned
* is `:error` - `LogLevel/ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LogLevel data) data
      (= :all data) LogLevel/ALL
      (= :fatal data) LogLevel/FATAL
      (= :off data) LogLevel/OFF
      (= :error data) LogLevel/ERROR)))


(defn processor-mode
  "The `processor-mode` function data interprets values in the provided config data into a 
`ProcessorMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ProcessorMode` - the value is returned.
* is `:inline` - `ProcessorMode/INLINE` is returned
* is `:distributed` - `ProcessorMode/DISTRIBUTED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ProcessorMode data) data
      (= :inline data) ProcessorMode/INLINE
      (= :distributed data) ProcessorMode/DISTRIBUTED)))


(defn processor-type
  "The `processor-type` function data interprets values in the provided config data into a 
`ProcessorType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ProcessorType` - the value is returned.
* is `:standard` - `ProcessorType/STANDARD` is returned
* is `:express` - `ProcessorType/EXPRESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ProcessorType data) data
      (= :standard data) ProcessorType/STANDARD
      (= :express data) ProcessorType/EXPRESS)))


(defn service-integration-pattern
  "The `service-integration-pattern` function data interprets values in the provided config data into a 
`ServiceIntegrationPattern` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ServiceIntegrationPattern` - the value is returned.
* is `:fire-and-forget` - `ServiceIntegrationPattern/FIRE_AND_FORGET` is returned
* is `:sync` - `ServiceIntegrationPattern/SYNC` is returned
* is `:wait-for-task-token` - `ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ServiceIntegrationPattern data) data
      (= :fire-and-forget data) ServiceIntegrationPattern/FIRE_AND_FORGET
      (= :sync data) ServiceIntegrationPattern/SYNC
      (= :wait-for-task-token data) ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN)))


(defn state-machine-type
  "The `state-machine-type` function data interprets values in the provided config data into a 
`StateMachineType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StateMachineType` - the value is returned.
* is `:express` - `StateMachineType/EXPRESS` is returned
* is `:standard` - `StateMachineType/STANDARD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StateMachineType data) data
      (= :express data) StateMachineType/EXPRESS
      (= :standard data) StateMachineType/STANDARD)))


(defn build-activity-builder
  "The build-activity-builder function updates a Activity$Builder instance using the provided configuration.
  The function takes the Activity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:activity-name` |
"
  [^Activity$Builder builder id config]
  (when-some [data (lookup-entry config id :activity-name)]
    (. builder activityName data))
  (.build builder))


(defn activity-builder
  "Creates a  `Activity$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-activity-builder (Activity$Builder/create scope (name id)) id config))


(defn build-activity-props-builder
  "The build-activity-props-builder function updates a ActivityProps$Builder instance using the provided configuration.
  The function takes the ActivityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:activity-name` |
"
  [^ActivityProps$Builder builder id config]
  (when-some [data (lookup-entry config id :activity-name)]
    (. builder activityName data))
  (.build builder))


(defn activity-props-builder
  "Creates a  `ActivityProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-activity-props-builder (new ActivityProps$Builder) id config))


(defn build-afterwards-options-builder
  "The build-afterwards-options-builder function updates a AfterwardsOptions$Builder instance using the provided configuration.
  The function takes the AfterwardsOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeErrorHandlers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-error-handlers` |
| `includeOtherwise` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-otherwise` |
"
  [^AfterwardsOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :include-error-handlers)]
    (. builder includeErrorHandlers data))
  (when-some [data (lookup-entry config id :include-otherwise)]
    (. builder includeOtherwise data))
  (.build builder))


(defn afterwards-options-builder
  "Creates a  `AfterwardsOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-afterwards-options-builder (new AfterwardsOptions$Builder) id config))


(defn build-catch-props-builder
  "The build-catch-props-builder function updates a CatchProps$Builder instance using the provided configuration.
  The function takes the CatchProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errors` | java.util.List | [[cdk.support/lookup-entry]] | `:errors` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
"
  [^CatchProps$Builder builder id config]
  (when-some [data (lookup-entry config id :errors)]
    (. builder errors data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (.build builder))


(defn catch-props-builder
  "Creates a  `CatchProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-catch-props-builder (new CatchProps$Builder) id config))


(defn build-cfn-activity-builder
  "The build-cfn-activity-builder function updates a CfnActivity$Builder instance using the provided configuration.
  The function takes the CfnActivity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnActivity$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-activity-builder
  "Creates a  `CfnActivity$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-activity-builder (CfnActivity$Builder/create scope (name id)) id config))


(defn build-cfn-activity-props-builder
  "The build-cfn-activity-props-builder function updates a CfnActivityProps$Builder instance using the provided configuration.
  The function takes the CfnActivityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnActivityProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-activity-props-builder
  "Creates a  `CfnActivityProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-activity-props-builder (new CfnActivityProps$Builder) id config))


(defn build-cfn-activity-tags-entry-property-builder
  "The build-cfn-activity-tags-entry-property-builder function updates a CfnActivity$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnActivity$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnActivity$TagsEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-activity-tags-entry-property-builder
  "Creates a  `CfnActivity$TagsEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-activity-tags-entry-property-builder (new CfnActivity$TagsEntryProperty$Builder) id config))


(defn build-cfn-state-machine-alias-builder
  "The build-cfn-state-machine-alias-builder function updates a CfnStateMachineAlias$Builder instance using the provided configuration.
  The function takes the CfnStateMachineAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-configuration` |
"
  [^CfnStateMachineAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-preference)]
    (. builder deploymentPreference data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :routing-configuration)]
    (. builder routingConfiguration data))
  (.build builder))


(defn cfn-state-machine-alias-builder
  "Creates a  `CfnStateMachineAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-state-machine-alias-builder (CfnStateMachineAlias$Builder/create scope (name id)) id config))


(defn build-cfn-state-machine-alias-deployment-preference-property-builder
  "The build-cfn-state-machine-alias-deployment-preference-property-builder function updates a CfnStateMachineAlias$DeploymentPreferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachineAlias$DeploymentPreferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
| `stateMachineVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-version-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStateMachineAlias$DeploymentPreferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (when-some [data (lookup-entry config id :state-machine-version-arn)]
    (. builder stateMachineVersionArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-state-machine-alias-deployment-preference-property-builder
  "Creates a  `CfnStateMachineAlias$DeploymentPreferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-alias-deployment-preference-property-builder (new CfnStateMachineAlias$DeploymentPreferenceProperty$Builder) id config))


(defn build-cfn-state-machine-alias-props-builder
  "The build-cfn-state-machine-alias-props-builder function updates a CfnStateMachineAliasProps$Builder instance using the provided configuration.
  The function takes the CfnStateMachineAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-configuration` |
"
  [^CfnStateMachineAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-preference)]
    (. builder deploymentPreference data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :routing-configuration)]
    (. builder routingConfiguration data))
  (.build builder))


(defn cfn-state-machine-alias-props-builder
  "Creates a  `CfnStateMachineAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-alias-props-builder (new CfnStateMachineAliasProps$Builder) id config))


(defn build-cfn-state-machine-alias-routing-configuration-version-property-builder
  "The build-cfn-state-machine-alias-routing-configuration-version-property-builder function updates a CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateMachineVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-version-arn` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :state-machine-version-arn)]
    (. builder stateMachineVersionArn data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-state-machine-alias-routing-configuration-version-property-builder
  "Creates a  `CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-alias-routing-configuration-version-property-builder (new CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder) id config))


(defn build-cfn-state-machine-builder
  "The build-cfn-state-machine-builder function updates a CfnStateMachine$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$S3LocationProperty | [[cdk.support/lookup-entry]] | `:definition-s3-location` |
| `definitionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-string` |
| `definitionSubstitutions` | java.util.Map | [[cdk.support/lookup-entry]] | `:definition-substitutions` |
| `loggingConfiguration` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
| `stateMachineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tracingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-configuration` |
"
  [^CfnStateMachine$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :definition-s3-location)]
    (. builder definitionS3Location data))
  (when-some [data (lookup-entry config id :definition-string)]
    (. builder definitionString data))
  (when-some [data (lookup-entry config id :definition-substitutions)]
    (. builder definitionSubstitutions data))
  (when-some [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (when-some [data (lookup-entry config id :state-machine-type)]
    (. builder stateMachineType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tracing-configuration)]
    (. builder tracingConfiguration data))
  (.build builder))


(defn cfn-state-machine-builder
  "Creates a  `CfnStateMachine$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-state-machine-builder (CfnStateMachine$Builder/create scope (name id)) id config))


(defn build-cfn-state-machine-cloud-watch-logs-log-group-property-builder
  "The build-cfn-state-machine-cloud-watch-logs-log-group-property-builder function updates a CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
"
  [^CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-arn)]
    (. builder logGroupArn data))
  (.build builder))


(defn cfn-state-machine-cloud-watch-logs-log-group-property-builder
  "Creates a  `CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-cloud-watch-logs-log-group-property-builder (new CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder) id config))


(defn build-cfn-state-machine-log-destination-property-builder
  "The build-cfn-state-machine-log-destination-property-builder function updates a CfnStateMachine$LogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$LogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroup` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$CloudWatchLogsLogGroupProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group` |
"
  [^CfnStateMachine$LogDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logs-log-group)]
    (. builder cloudWatchLogsLogGroup data))
  (.build builder))


(defn cfn-state-machine-log-destination-property-builder
  "Creates a  `CfnStateMachine$LogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-log-destination-property-builder (new CfnStateMachine$LogDestinationProperty$Builder) id config))


(defn build-cfn-state-machine-logging-configuration-property-builder
  "The build-cfn-state-machine-logging-configuration-property-builder function updates a CfnStateMachine$LoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$LoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
"
  [^CfnStateMachine$LoggingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-some [data (lookup-entry config id :include-execution-data)]
    (. builder includeExecutionData data))
  (when-some [data (lookup-entry config id :level)]
    (. builder level data))
  (.build builder))


(defn cfn-state-machine-logging-configuration-property-builder
  "Creates a  `CfnStateMachine$LoggingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-logging-configuration-property-builder (new CfnStateMachine$LoggingConfigurationProperty$Builder) id config))


(defn build-cfn-state-machine-props-builder
  "The build-cfn-state-machine-props-builder function updates a CfnStateMachineProps$Builder instance using the provided configuration.
  The function takes the CfnStateMachineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$S3LocationProperty | [[cdk.support/lookup-entry]] | `:definition-s3-location` |
| `definitionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-string` |
| `definitionSubstitutions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition-substitutions` |
| `loggingConfiguration` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
| `stateMachineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tracingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-configuration` |
"
  [^CfnStateMachineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :definition-s3-location)]
    (. builder definitionS3Location data))
  (when-some [data (lookup-entry config id :definition-string)]
    (. builder definitionString data))
  (when-some [data (lookup-entry config id :definition-substitutions)]
    (. builder definitionSubstitutions data))
  (when-some [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (when-some [data (lookup-entry config id :state-machine-type)]
    (. builder stateMachineType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tracing-configuration)]
    (. builder tracingConfiguration data))
  (.build builder))


(defn cfn-state-machine-props-builder
  "Creates a  `CfnStateMachineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-props-builder (new CfnStateMachineProps$Builder) id config))


(defn build-cfn-state-machine-s3-location-property-builder
  "The build-cfn-state-machine-s3-location-property-builder function updates a CfnStateMachine$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnStateMachine$S3LocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-state-machine-s3-location-property-builder
  "Creates a  `CfnStateMachine$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-s3-location-property-builder (new CfnStateMachine$S3LocationProperty$Builder) id config))


(defn build-cfn-state-machine-tags-entry-property-builder
  "The build-cfn-state-machine-tags-entry-property-builder function updates a CfnStateMachine$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnStateMachine$TagsEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-state-machine-tags-entry-property-builder
  "Creates a  `CfnStateMachine$TagsEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-tags-entry-property-builder (new CfnStateMachine$TagsEntryProperty$Builder) id config))


(defn build-cfn-state-machine-tracing-configuration-property-builder
  "The build-cfn-state-machine-tracing-configuration-property-builder function updates a CfnStateMachine$TracingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStateMachine$TracingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnStateMachine$TracingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-state-machine-tracing-configuration-property-builder
  "Creates a  `CfnStateMachine$TracingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-tracing-configuration-property-builder (new CfnStateMachine$TracingConfigurationProperty$Builder) id config))


(defn build-cfn-state-machine-version-builder
  "The build-cfn-state-machine-version-builder function updates a CfnStateMachineVersion$Builder instance using the provided configuration.
  The function takes the CfnStateMachineVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `stateMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-arn` |
| `stateMachineRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-revision-id` |
"
  [^CfnStateMachineVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :state-machine-arn)]
    (. builder stateMachineArn data))
  (when-some [data (lookup-entry config id :state-machine-revision-id)]
    (. builder stateMachineRevisionId data))
  (.build builder))


(defn cfn-state-machine-version-builder
  "Creates a  `CfnStateMachineVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-state-machine-version-builder (CfnStateMachineVersion$Builder/create scope (name id)) id config))


(defn build-cfn-state-machine-version-props-builder
  "The build-cfn-state-machine-version-props-builder function updates a CfnStateMachineVersionProps$Builder instance using the provided configuration.
  The function takes the CfnStateMachineVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `stateMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-arn` |
| `stateMachineRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-revision-id` |
"
  [^CfnStateMachineVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :state-machine-arn)]
    (. builder stateMachineArn data))
  (when-some [data (lookup-entry config id :state-machine-revision-id)]
    (. builder stateMachineRevisionId data))
  (.build builder))


(defn cfn-state-machine-version-props-builder
  "Creates a  `CfnStateMachineVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-state-machine-version-props-builder (new CfnStateMachineVersionProps$Builder) id config))


(defn build-choice-builder
  "The build-choice-builder function updates a Choice$Builder instance using the provided configuration.
  The function takes the Choice$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^Choice$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn choice-builder
  "Creates a  `Choice$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-choice-builder (Choice$Builder/create scope (name id)) id config))


(defn build-choice-props-builder
  "The build-choice-props-builder function updates a ChoiceProps$Builder instance using the provided configuration.
  The function takes the ChoiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^ChoiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn choice-props-builder
  "Creates a  `ChoiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-choice-props-builder (new ChoiceProps$Builder) id config))


(defn build-choice-transition-options-builder
  "The build-choice-transition-options-builder function updates a ChoiceTransitionOptions$Builder instance using the provided configuration.
  The function takes the ChoiceTransitionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^ChoiceTransitionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn choice-transition-options-builder
  "Creates a  `ChoiceTransitionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-choice-transition-options-builder (new ChoiceTransitionOptions$Builder) id config))


(defn build-credentials-builder
  "The build-credentials-builder function updates a Credentials$Builder instance using the provided configuration.
  The function takes the Credentials$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.stepfunctions.TaskRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^Credentials$Builder builder id config]
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn credentials-builder
  "Creates a  `Credentials$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-credentials-builder (new Credentials$Builder) id config))


(defn build-custom-state-builder
  "The build-custom-state-builder function updates a CustomState$Builder instance using the provided configuration.
  The function takes the CustomState$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateJson` | java.util.Map | [[cdk.support/lookup-entry]] | `:state-json` |
"
  [^CustomState$Builder builder id config]
  (when-some [data (lookup-entry config id :state-json)]
    (. builder stateJson data))
  (.build builder))


(defn custom-state-builder
  "Creates a  `CustomState$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-custom-state-builder (CustomState$Builder/create scope (name id)) id config))


(defn build-custom-state-props-builder
  "The build-custom-state-props-builder function updates a CustomStateProps$Builder instance using the provided configuration.
  The function takes the CustomStateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateJson` | java.util.Map | [[cdk.support/lookup-entry]] | `:state-json` |
"
  [^CustomStateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :state-json)]
    (. builder stateJson data))
  (.build builder))


(defn custom-state-props-builder
  "Creates a  `CustomStateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-custom-state-props-builder (new CustomStateProps$Builder) id config))


(defn build-definition-config-builder
  "The build-definition-config-builder function updates a DefinitionConfig$Builder instance using the provided configuration.
  The function takes the DefinitionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$S3LocationProperty | [[cdk.support/lookup-entry]] | `:definition-s3-location` |
| `definitionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-string` |
"
  [^DefinitionConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :definition-s3-location)]
    (. builder definitionS3Location data))
  (when-some [data (lookup-entry config id :definition-string)]
    (. builder definitionString data))
  (.build builder))


(defn definition-config-builder
  "Creates a  `DefinitionConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-definition-config-builder (new DefinitionConfig$Builder) id config))


(defn build-distributed-map-builder
  "The build-distributed-map-builder function updates a DistributedMap$Builder instance using the provided configuration.
  The function takes the DistributedMap$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `itemBatcher` | software.amazon.awscdk.services.stepfunctions.ItemBatcher | [[cdk.support/lookup-entry]] | `:item-batcher` |
| `itemReader` | software.amazon.awscdk.services.stepfunctions.IItemReader | [[cdk.support/lookup-entry]] | `:item-reader` |
| `itemSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:item-selector` |
| `itemsPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:items-path` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `mapExecutionType` | software.amazon.awscdk.services.stepfunctions.StateMachineType | [[cdk.api.services.stepfunctions/state-machine-type]] | `:map-execution-type` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxConcurrencyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `resultWriter` | software.amazon.awscdk.services.stepfunctions.ResultWriter | [[cdk.support/lookup-entry]] | `:result-writer` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `toleratedFailureCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tolerated-failure-count` |
| `toleratedFailureCountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:tolerated-failure-count-path` |
| `toleratedFailurePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tolerated-failure-percentage` |
| `toleratedFailurePercentagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:tolerated-failure-percentage-path` |
"
  [^DistributedMap$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :item-batcher)]
    (. builder itemBatcher data))
  (when-some [data (lookup-entry config id :item-reader)]
    (. builder itemReader data))
  (when-some [data (lookup-entry config id :item-selector)]
    (. builder itemSelector data))
  (when-some [data (lookup-entry config id :items-path)]
    (. builder itemsPath data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (state-machine-type config id :map-execution-type)]
    (. builder mapExecutionType data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-concurrency-path)]
    (. builder maxConcurrencyPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :result-writer)]
    (. builder resultWriter data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tolerated-failure-count)]
    (. builder toleratedFailureCount data))
  (when-some [data (lookup-entry config id :tolerated-failure-count-path)]
    (. builder toleratedFailureCountPath data))
  (when-some [data (lookup-entry config id :tolerated-failure-percentage)]
    (. builder toleratedFailurePercentage data))
  (when-some [data (lookup-entry config id :tolerated-failure-percentage-path)]
    (. builder toleratedFailurePercentagePath data))
  (.build builder))


(defn distributed-map-builder
  "Creates a  `DistributedMap$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-distributed-map-builder (DistributedMap$Builder/create scope (name id)) id config))


(defn build-distributed-map-props-builder
  "The build-distributed-map-props-builder function updates a DistributedMapProps$Builder instance using the provided configuration.
  The function takes the DistributedMapProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `itemBatcher` | software.amazon.awscdk.services.stepfunctions.ItemBatcher | [[cdk.support/lookup-entry]] | `:item-batcher` |
| `itemReader` | software.amazon.awscdk.services.stepfunctions.IItemReader | [[cdk.support/lookup-entry]] | `:item-reader` |
| `itemSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:item-selector` |
| `itemsPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:items-path` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `mapExecutionType` | software.amazon.awscdk.services.stepfunctions.StateMachineType | [[cdk.api.services.stepfunctions/state-machine-type]] | `:map-execution-type` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxConcurrencyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `resultWriter` | software.amazon.awscdk.services.stepfunctions.ResultWriter | [[cdk.support/lookup-entry]] | `:result-writer` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `toleratedFailureCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tolerated-failure-count` |
| `toleratedFailureCountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:tolerated-failure-count-path` |
| `toleratedFailurePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tolerated-failure-percentage` |
| `toleratedFailurePercentagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:tolerated-failure-percentage-path` |
"
  [^DistributedMapProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :item-batcher)]
    (. builder itemBatcher data))
  (when-some [data (lookup-entry config id :item-reader)]
    (. builder itemReader data))
  (when-some [data (lookup-entry config id :item-selector)]
    (. builder itemSelector data))
  (when-some [data (lookup-entry config id :items-path)]
    (. builder itemsPath data))
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (when-some [data (state-machine-type config id :map-execution-type)]
    (. builder mapExecutionType data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-concurrency-path)]
    (. builder maxConcurrencyPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :result-writer)]
    (. builder resultWriter data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tolerated-failure-count)]
    (. builder toleratedFailureCount data))
  (when-some [data (lookup-entry config id :tolerated-failure-count-path)]
    (. builder toleratedFailureCountPath data))
  (when-some [data (lookup-entry config id :tolerated-failure-percentage)]
    (. builder toleratedFailurePercentage data))
  (when-some [data (lookup-entry config id :tolerated-failure-percentage-path)]
    (. builder toleratedFailurePercentagePath data))
  (.build builder))


(defn distributed-map-props-builder
  "Creates a  `DistributedMapProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-distributed-map-props-builder (new DistributedMapProps$Builder) id config))


(defn build-fail-builder
  "The build-fail-builder function updates a Fail$Builder instance using the provided configuration.
  The function takes the Fail$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cause` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause` |
| `causePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause-path` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `error` | java.lang.String | [[cdk.support/lookup-entry]] | `:error` |
| `errorPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^Fail$Builder builder id config]
  (when-some [data (lookup-entry config id :cause)]
    (. builder cause data))
  (when-some [data (lookup-entry config id :cause-path)]
    (. builder causePath data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :error)]
    (. builder error data))
  (when-some [data (lookup-entry config id :error-path)]
    (. builder errorPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn fail-builder
  "Creates a  `Fail$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-fail-builder (Fail$Builder/create scope (name id)) id config))


(defn build-fail-props-builder
  "The build-fail-props-builder function updates a FailProps$Builder instance using the provided configuration.
  The function takes the FailProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cause` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause` |
| `causePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause-path` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `error` | java.lang.String | [[cdk.support/lookup-entry]] | `:error` |
| `errorPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^FailProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cause)]
    (. builder cause data))
  (when-some [data (lookup-entry config id :cause-path)]
    (. builder causePath data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :error)]
    (. builder error data))
  (when-some [data (lookup-entry config id :error-path)]
    (. builder errorPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn fail-props-builder
  "Creates a  `FailProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-fail-props-builder (new FailProps$Builder) id config))


(defn build-file-definition-body-builder
  "The build-file-definition-body-builder function updates a FileDefinitionBody$Builder instance using the provided configuration.
  The function takes the FileDefinitionBody$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^FileDefinitionBody$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-some [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-some [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (when-some [data (lookup-entry config id :deploy-time)]
    (. builder deployTime data))
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-some [data (lookup-entry config id :readers)]
    (. builder readers data))
  (.build builder))


(defn file-definition-body-builder
  "Creates a  `FileDefinitionBody$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| path | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String path id config]
  (build-file-definition-body-builder (FileDefinitionBody$Builder/create path) id config))


(defn build-find-state-options-builder
  "The build-find-state-options-builder function updates a FindStateOptions$Builder instance using the provided configuration.
  The function takes the FindStateOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeErrorHandlers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-error-handlers` |
"
  [^FindStateOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :include-error-handlers)]
    (. builder includeErrorHandlers data))
  (.build builder))


(defn find-state-options-builder
  "Creates a  `FindStateOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-find-state-options-builder (new FindStateOptions$Builder) id config))


(defn build-item-batcher-builder
  "The build-item-batcher-builder function updates a ItemBatcher$Builder instance using the provided configuration.
  The function takes the ItemBatcher$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchInput` | com.fasterxml.jackson.databind.node.ObjectNode | [[cdk.support/lookup-entry]] | `:batch-input` |
| `maxInputBytesPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch` |
| `maxInputBytesPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch-path` |
| `maxItemsPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items-per-batch` |
| `maxItemsPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-items-per-batch-path` |
"
  [^ItemBatcher$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-input)]
    (. builder batchInput data))
  (when-some [data (lookup-entry config id :max-input-bytes-per-batch)]
    (. builder maxInputBytesPerBatch data))
  (when-some [data (lookup-entry config id :max-input-bytes-per-batch-path)]
    (. builder maxInputBytesPerBatchPath data))
  (when-some [data (lookup-entry config id :max-items-per-batch)]
    (. builder maxItemsPerBatch data))
  (when-some [data (lookup-entry config id :max-items-per-batch-path)]
    (. builder maxItemsPerBatchPath data))
  (.build builder))


(defn item-batcher-builder
  "Creates a  `ItemBatcher$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-item-batcher-builder (ItemBatcher$Builder/create) id config))


(defn build-item-batcher-props-builder
  "The build-item-batcher-props-builder function updates a ItemBatcherProps$Builder instance using the provided configuration.
  The function takes the ItemBatcherProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchInput` | com.fasterxml.jackson.databind.node.ObjectNode | [[cdk.support/lookup-entry]] | `:batch-input` |
| `maxInputBytesPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch` |
| `maxInputBytesPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch-path` |
| `maxItemsPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items-per-batch` |
| `maxItemsPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-items-per-batch-path` |
"
  [^ItemBatcherProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-input)]
    (. builder batchInput data))
  (when-some [data (lookup-entry config id :max-input-bytes-per-batch)]
    (. builder maxInputBytesPerBatch data))
  (when-some [data (lookup-entry config id :max-input-bytes-per-batch-path)]
    (. builder maxInputBytesPerBatchPath data))
  (when-some [data (lookup-entry config id :max-items-per-batch)]
    (. builder maxItemsPerBatch data))
  (when-some [data (lookup-entry config id :max-items-per-batch-path)]
    (. builder maxItemsPerBatchPath data))
  (.build builder))


(defn item-batcher-props-builder
  "Creates a  `ItemBatcherProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-item-batcher-props-builder (new ItemBatcherProps$Builder) id config))


(defn build-item-reader-props-builder
  "The build-item-reader-props-builder function updates a ItemReaderProps$Builder instance using the provided configuration.
  The function takes the ItemReaderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
"
  [^ItemReaderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (.build builder))


(defn item-reader-props-builder
  "Creates a  `ItemReaderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-item-reader-props-builder (new ItemReaderProps$Builder) id config))


(defn build-log-options-builder
  "The build-log-options-builder function updates a LogOptions$Builder instance using the provided configuration.
  The function takes the LogOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:destination` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | software.amazon.awscdk.services.stepfunctions.LogLevel | [[cdk.api.services.stepfunctions/log-level]] | `:level` |
"
  [^LogOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :include-execution-data)]
    (. builder includeExecutionData data))
  (when-some [data (log-level config id :level)]
    (. builder level data))
  (.build builder))


(defn log-options-builder
  "Creates a  `LogOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-log-options-builder (new LogOptions$Builder) id config))


(defn build-map-base-props-builder
  "The build-map-base-props-builder function updates a MapBaseProps$Builder instance using the provided configuration.
  The function takes the MapBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `itemSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:item-selector` |
| `itemsPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:items-path` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxConcurrencyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^MapBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :item-selector)]
    (. builder itemSelector data))
  (when-some [data (lookup-entry config id :items-path)]
    (. builder itemsPath data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-concurrency-path)]
    (. builder maxConcurrencyPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn map-base-props-builder
  "Creates a  `MapBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-map-base-props-builder (new MapBaseProps$Builder) id config))


(defn build-map-builder
  "The build-map-builder function updates a Map$Builder instance using the provided configuration.
  The function takes the Map$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `itemSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:item-selector` |
| `itemsPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:items-path` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxConcurrencyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^Map$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :item-selector)]
    (. builder itemSelector data))
  (when-some [data (lookup-entry config id :items-path)]
    (. builder itemsPath data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-concurrency-path)]
    (. builder maxConcurrencyPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn map-builder
  "Creates a  `Map$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-map-builder (Map$Builder/create scope (name id)) id config))


(defn build-map-props-builder
  "The build-map-props-builder function updates a MapProps$Builder instance using the provided configuration.
  The function takes the MapProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `itemSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:item-selector` |
| `itemsPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:items-path` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxConcurrencyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^MapProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :item-selector)]
    (. builder itemSelector data))
  (when-some [data (lookup-entry config id :items-path)]
    (. builder itemsPath data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-concurrency-path)]
    (. builder maxConcurrencyPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn map-props-builder
  "Creates a  `MapProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-map-props-builder (new MapProps$Builder) id config))


(defn build-parallel-builder
  "The build-parallel-builder function updates a Parallel$Builder instance using the provided configuration.
  The function takes the Parallel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^Parallel$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn parallel-builder
  "Creates a  `Parallel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-parallel-builder (Parallel$Builder/create scope (name id)) id config))


(defn build-parallel-props-builder
  "The build-parallel-props-builder function updates a ParallelProps$Builder instance using the provided configuration.
  The function takes the ParallelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^ParallelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn parallel-props-builder
  "Creates a  `ParallelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-parallel-props-builder (new ParallelProps$Builder) id config))


(defn build-pass-builder
  "The build-pass-builder function updates a Pass$Builder instance using the provided configuration.
  The function takes the Pass$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `result` | software.amazon.awscdk.services.stepfunctions.Result | [[cdk.support/lookup-entry]] | `:result` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^Pass$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result)]
    (. builder result data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn pass-builder
  "Creates a  `Pass$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-pass-builder (Pass$Builder/create scope (name id)) id config))


(defn build-pass-props-builder
  "The build-pass-props-builder function updates a PassProps$Builder instance using the provided configuration.
  The function takes the PassProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `result` | software.amazon.awscdk.services.stepfunctions.Result | [[cdk.support/lookup-entry]] | `:result` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^PassProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result)]
    (. builder result data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn pass-props-builder
  "Creates a  `PassProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-pass-props-builder (new PassProps$Builder) id config))


(defn build-processor-config-builder
  "The build-processor-config-builder function updates a ProcessorConfig$Builder instance using the provided configuration.
  The function takes the ProcessorConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionType` | software.amazon.awscdk.services.stepfunctions.ProcessorType | [[cdk.api.services.stepfunctions/processor-type]] | `:execution-type` |
| `mode` | software.amazon.awscdk.services.stepfunctions.ProcessorMode | [[cdk.api.services.stepfunctions/processor-mode]] | `:mode` |
"
  [^ProcessorConfig$Builder builder id config]
  (when-some [data (processor-type config id :execution-type)]
    (. builder executionType data))
  (when-some [data (processor-mode config id :mode)]
    (. builder mode data))
  (.build builder))


(defn processor-config-builder
  "Creates a  `ProcessorConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-processor-config-builder (new ProcessorConfig$Builder) id config))


(defn build-result-writer-builder
  "The build-result-writer-builder function updates a ResultWriter$Builder instance using the provided configuration.
  The function takes the ResultWriter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^ResultWriter$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn result-writer-builder
  "Creates a  `ResultWriter$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-result-writer-builder (ResultWriter$Builder/create) id config))


(defn build-result-writer-props-builder
  "The build-result-writer-props-builder function updates a ResultWriterProps$Builder instance using the provided configuration.
  The function takes the ResultWriterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^ResultWriterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn result-writer-props-builder
  "Creates a  `ResultWriterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-result-writer-props-builder (new ResultWriterProps$Builder) id config))


(defn build-retry-props-builder
  "The build-retry-props-builder function updates a RetryProps$Builder instance using the provided configuration.
  The function takes the RetryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backoffRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backoff-rate` |
| `errors` | java.util.List | [[cdk.support/lookup-entry]] | `:errors` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `jitterStrategy` | software.amazon.awscdk.services.stepfunctions.JitterType | [[cdk.api.services.stepfunctions/jitter-type]] | `:jitter-strategy` |
| `maxAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-attempts` |
| `maxDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-delay` |
"
  [^RetryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backoff-rate)]
    (. builder backoffRate data))
  (when-some [data (lookup-entry config id :errors)]
    (. builder errors data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (jitter-type config id :jitter-strategy)]
    (. builder jitterStrategy data))
  (when-some [data (lookup-entry config id :max-attempts)]
    (. builder maxAttempts data))
  (when-some [data (lookup-entry config id :max-delay)]
    (. builder maxDelay data))
  (.build builder))


(defn retry-props-builder
  "Creates a  `RetryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-retry-props-builder (new RetryProps$Builder) id config))


(defn build-s3-csv-item-reader-builder
  "The build-s3-csv-item-reader-builder function updates a S3CsvItemReader$Builder instance using the provided configuration.
  The function takes the S3CsvItemReader$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `csvHeaders` | software.amazon.awscdk.services.stepfunctions.CsvHeaders | [[cdk.support/lookup-entry]] | `:csv-headers` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
"
  [^S3CsvItemReader$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :csv-headers)]
    (. builder csvHeaders data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (.build builder))


(defn s3-csv-item-reader-builder
  "Creates a  `S3CsvItemReader$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-csv-item-reader-builder (S3CsvItemReader$Builder/create) id config))


(defn build-s3-csv-item-reader-props-builder
  "The build-s3-csv-item-reader-props-builder function updates a S3CsvItemReaderProps$Builder instance using the provided configuration.
  The function takes the S3CsvItemReaderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `csvHeaders` | software.amazon.awscdk.services.stepfunctions.CsvHeaders | [[cdk.support/lookup-entry]] | `:csv-headers` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
"
  [^S3CsvItemReaderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :csv-headers)]
    (. builder csvHeaders data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (.build builder))


(defn s3-csv-item-reader-props-builder
  "Creates a  `S3CsvItemReaderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-csv-item-reader-props-builder (new S3CsvItemReaderProps$Builder) id config))


(defn build-s3-file-item-reader-props-builder
  "The build-s3-file-item-reader-props-builder function updates a S3FileItemReaderProps$Builder instance using the provided configuration.
  The function takes the S3FileItemReaderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
"
  [^S3FileItemReaderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (.build builder))


(defn s3-file-item-reader-props-builder
  "Creates a  `S3FileItemReaderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-file-item-reader-props-builder (new S3FileItemReaderProps$Builder) id config))


(defn build-s3-json-item-reader-builder
  "The build-s3-json-item-reader-builder function updates a S3JsonItemReader$Builder instance using the provided configuration.
  The function takes the S3JsonItemReader$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
"
  [^S3JsonItemReader$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (.build builder))


(defn s3-json-item-reader-builder
  "Creates a  `S3JsonItemReader$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-json-item-reader-builder (S3JsonItemReader$Builder/create) id config))


(defn build-s3-manifest-item-reader-builder
  "The build-s3-manifest-item-reader-builder function updates a S3ManifestItemReader$Builder instance using the provided configuration.
  The function takes the S3ManifestItemReader$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
"
  [^S3ManifestItemReader$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (.build builder))


(defn s3-manifest-item-reader-builder
  "Creates a  `S3ManifestItemReader$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-manifest-item-reader-builder (S3ManifestItemReader$Builder/create) id config))


(defn build-s3-objects-item-reader-builder
  "The build-s3-objects-item-reader-builder function updates a S3ObjectsItemReader$Builder instance using the provided configuration.
  The function takes the S3ObjectsItemReader$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^S3ObjectsItemReader$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn s3-objects-item-reader-builder
  "Creates a  `S3ObjectsItemReader$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-objects-item-reader-builder (S3ObjectsItemReader$Builder/create) id config))


(defn build-s3-objects-item-reader-props-builder
  "The build-s3-objects-item-reader-props-builder function updates a S3ObjectsItemReaderProps$Builder instance using the provided configuration.
  The function takes the S3ObjectsItemReaderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^S3ObjectsItemReaderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :max-items)]
    (. builder maxItems data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn s3-objects-item-reader-props-builder
  "Creates a  `S3ObjectsItemReaderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-objects-item-reader-props-builder (new S3ObjectsItemReaderProps$Builder) id config))


(defn build-single-state-options-builder
  "The build-single-state-options-builder function updates a SingleStateOptions$Builder instance using the provided configuration.
  The function takes the SingleStateOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `prefixStates` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-states` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-id` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^SingleStateOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :prefix-states)]
    (. builder prefixStates data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-id)]
    (. builder stateId data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn single-state-options-builder
  "Creates a  `SingleStateOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-single-state-options-builder (new SingleStateOptions$Builder) id config))


(defn build-state-machine-builder
  "The build-state-machine-builder function updates a StateMachine$Builder instance using the provided configuration.
  The function takes the StateMachine$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `definition` | software.amazon.awscdk.services.stepfunctions.IChainable | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionBody` | software.amazon.awscdk.services.stepfunctions.DefinitionBody | [[cdk.support/lookup-entry]] | `:definition-body` |
| `definitionSubstitutions` | java.util.Map | [[cdk.support/lookup-entry]] | `:definition-substitutions` |
| `logs` | software.amazon.awscdk.services.stepfunctions.LogOptions | [[cdk.support/lookup-entry]] | `:logs` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
| `stateMachineType` | software.amazon.awscdk.services.stepfunctions.StateMachineType | [[cdk.api.services.stepfunctions/state-machine-type]] | `:state-machine-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
"
  [^StateMachine$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :definition-body)]
    (. builder definitionBody data))
  (when-some [data (lookup-entry config id :definition-substitutions)]
    (. builder definitionSubstitutions data))
  (when-some [data (lookup-entry config id :logs)]
    (. builder logs data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (when-some [data (state-machine-type config id :state-machine-type)]
    (. builder stateMachineType data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :tracing-enabled)]
    (. builder tracingEnabled data))
  (.build builder))


(defn state-machine-builder
  "Creates a  `StateMachine$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-state-machine-builder (StateMachine$Builder/create scope (name id)) id config))


(defn build-state-machine-props-builder
  "The build-state-machine-props-builder function updates a StateMachineProps$Builder instance using the provided configuration.
  The function takes the StateMachineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `definition` | software.amazon.awscdk.services.stepfunctions.IChainable | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionBody` | software.amazon.awscdk.services.stepfunctions.DefinitionBody | [[cdk.support/lookup-entry]] | `:definition-body` |
| `definitionSubstitutions` | java.util.Map | [[cdk.support/lookup-entry]] | `:definition-substitutions` |
| `logs` | software.amazon.awscdk.services.stepfunctions.LogOptions | [[cdk.support/lookup-entry]] | `:logs` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
| `stateMachineType` | software.amazon.awscdk.services.stepfunctions.StateMachineType | [[cdk.api.services.stepfunctions/state-machine-type]] | `:state-machine-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |
"
  [^StateMachineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :definition-body)]
    (. builder definitionBody data))
  (when-some [data (lookup-entry config id :definition-substitutions)]
    (. builder definitionSubstitutions data))
  (when-some [data (lookup-entry config id :logs)]
    (. builder logs data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (when-some [data (state-machine-type config id :state-machine-type)]
    (. builder stateMachineType data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :tracing-enabled)]
    (. builder tracingEnabled data))
  (.build builder))


(defn state-machine-props-builder
  "Creates a  `StateMachineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-state-machine-props-builder (new StateMachineProps$Builder) id config))


(defn build-state-props-builder
  "The build-state-props-builder function updates a StateProps$Builder instance using the provided configuration.
  The function takes the StateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^StateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn state-props-builder
  "Creates a  `StateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-state-props-builder (new StateProps$Builder) id config))


(defn build-succeed-builder
  "The build-succeed-builder function updates a Succeed$Builder instance using the provided configuration.
  The function takes the Succeed$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^Succeed$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn succeed-builder
  "Creates a  `Succeed$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-succeed-builder (Succeed$Builder/create scope (name id)) id config))


(defn build-succeed-props-builder
  "The build-succeed-props-builder function updates a SucceedProps$Builder instance using the provided configuration.
  The function takes the SucceedProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^SucceedProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn succeed-props-builder
  "Creates a  `SucceedProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-succeed-props-builder (new SucceedProps$Builder) id config))


(defn build-task-metrics-config-builder
  "The build-task-metrics-config-builder function updates a TaskMetricsConfig$Builder instance using the provided configuration.
  The function takes the TaskMetricsConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDimensions` | java.util.Map | [[cdk.support/lookup-entry]] | `:metric-dimensions` |
| `metricPrefixPlural` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-prefix-plural` |
| `metricPrefixSingular` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-prefix-singular` |
"
  [^TaskMetricsConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-dimensions)]
    (. builder metricDimensions data))
  (when-some [data (lookup-entry config id :metric-prefix-plural)]
    (. builder metricPrefixPlural data))
  (when-some [data (lookup-entry config id :metric-prefix-singular)]
    (. builder metricPrefixSingular data))
  (.build builder))


(defn task-metrics-config-builder
  "Creates a  `TaskMetricsConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-task-metrics-config-builder (new TaskMetricsConfig$Builder) id config))


(defn build-task-state-base-props-builder
  "The build-task-state-base-props-builder function updates a TaskStateBaseProps$Builder instance using the provided configuration.
  The function takes the TaskStateBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^TaskStateBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn task-state-base-props-builder
  "Creates a  `TaskStateBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-task-state-base-props-builder (new TaskStateBaseProps$Builder) id config))


(defn build-wait-builder
  "The build-wait-builder function updates a Wait$Builder instance using the provided configuration.
  The function takes the Wait$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `time` | software.amazon.awscdk.services.stepfunctions.WaitTime | [[cdk.support/lookup-entry]] | `:time` |
"
  [^Wait$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :time)]
    (. builder time data))
  (.build builder))


(defn wait-builder
  "Creates a  `Wait$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-wait-builder (Wait$Builder/create scope (name id)) id config))


(defn build-wait-props-builder
  "The build-wait-props-builder function updates a WaitProps$Builder instance using the provided configuration.
  The function takes the WaitProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `time` | software.amazon.awscdk.services.stepfunctions.WaitTime | [[cdk.support/lookup-entry]] | `:time` |
"
  [^WaitProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :time)]
    (. builder time data))
  (.build builder))


(defn wait-props-builder
  "Creates a  `WaitProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-wait-props-builder (new WaitProps$Builder) id config))