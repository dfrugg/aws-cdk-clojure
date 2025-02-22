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


(defn activity-builder
  "The activity-builder function buildes out new instances of 
Activity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:activity-name` |"
  [stack id config]
  (let [builder (Activity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :activity-name)]
      (. builder activityName data))
    (.build builder)))


(defn activity-props-builder
  "The activity-props-builder function buildes out new instances of 
ActivityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:activity-name` |"
  [stack id config]
  (let [builder (ActivityProps$Builder.)]
    (when-let [data (lookup-entry config id :activity-name)]
      (. builder activityName data))
    (.build builder)))


(defn afterwards-options-builder
  "The afterwards-options-builder function buildes out new instances of 
AfterwardsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeErrorHandlers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-error-handlers` |
| `includeOtherwise` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-otherwise` |"
  [stack id config]
  (let [builder (AfterwardsOptions$Builder.)]
    (when-let [data (lookup-entry config id :include-error-handlers)]
      (. builder includeErrorHandlers data))
    (when-let [data (lookup-entry config id :include-otherwise)]
      (. builder includeOtherwise data))
    (.build builder)))


(defn catch-props-builder
  "The catch-props-builder function buildes out new instances of 
CatchProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errors` | java.util.List | [[cdk.support/lookup-entry]] | `:errors` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |"
  [stack id config]
  (let [builder (CatchProps$Builder.)]
    (when-let [data (lookup-entry config id :errors)]
      (. builder errors data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (.build builder)))


(defn cfn-activity-builder
  "The cfn-activity-builder function buildes out new instances of 
CfnActivity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnActivity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-activity-props-builder
  "The cfn-activity-props-builder function buildes out new instances of 
CfnActivityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnActivityProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-activity-tags-entry-property-builder
  "The cfn-activity-tags-entry-property-builder function buildes out new instances of 
CfnActivity$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnActivity$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-state-machine-alias-builder
  "The cfn-state-machine-alias-builder function buildes out new instances of 
CfnStateMachineAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-configuration` |"
  [stack id config]
  (let [builder (CfnStateMachineAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-preference)]
      (. builder deploymentPreference data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :routing-configuration)]
      (. builder routingConfiguration data))
    (.build builder)))


(defn cfn-state-machine-alias-deployment-preference-property-builder
  "The cfn-state-machine-alias-deployment-preference-property-builder function buildes out new instances of 
CfnStateMachineAlias$DeploymentPreferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
| `stateMachineVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-version-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStateMachineAlias$DeploymentPreferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (when-let [data (lookup-entry config id :state-machine-version-arn)]
      (. builder stateMachineVersionArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-state-machine-alias-props-builder
  "The cfn-state-machine-alias-props-builder function buildes out new instances of 
CfnStateMachineAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentPreference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-preference` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-configuration` |"
  [stack id config]
  (let [builder (CfnStateMachineAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-preference)]
      (. builder deploymentPreference data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :routing-configuration)]
      (. builder routingConfiguration data))
    (.build builder)))


(defn cfn-state-machine-alias-routing-configuration-version-property-builder
  "The cfn-state-machine-alias-routing-configuration-version-property-builder function buildes out new instances of 
CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateMachineVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-version-arn` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnStateMachineAlias$RoutingConfigurationVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :state-machine-version-arn)]
      (. builder stateMachineVersionArn data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-state-machine-builder
  "The cfn-state-machine-builder function buildes out new instances of 
CfnStateMachine$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-configuration` |"
  [stack id config]
  (let [builder (CfnStateMachine$Builder/create stack id)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-s3-location)]
      (. builder definitionS3Location data))
    (when-let [data (lookup-entry config id :definition-string)]
      (. builder definitionString data))
    (when-let [data (lookup-entry config id :definition-substitutions)]
      (. builder definitionSubstitutions data))
    (when-let [data (lookup-entry config id :logging-configuration)]
      (. builder loggingConfiguration data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (when-let [data (lookup-entry config id :state-machine-type)]
      (. builder stateMachineType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracing-configuration)]
      (. builder tracingConfiguration data))
    (.build builder)))


(defn cfn-state-machine-cloud-watch-logs-log-group-property-builder
  "The cfn-state-machine-cloud-watch-logs-log-group-property-builder function buildes out new instances of 
CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |"
  [stack id config]
  (let [builder (CfnStateMachine$CloudWatchLogsLogGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-arn)]
      (. builder logGroupArn data))
    (.build builder)))


(defn cfn-state-machine-log-destination-property-builder
  "The cfn-state-machine-log-destination-property-builder function buildes out new instances of 
CfnStateMachine$LogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroup` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$CloudWatchLogsLogGroupProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group` |"
  [stack id config]
  (let [builder (CfnStateMachine$LogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs-log-group)]
      (. builder cloudWatchLogsLogGroup data))
    (.build builder)))


(defn cfn-state-machine-logging-configuration-property-builder
  "The cfn-state-machine-logging-configuration-property-builder function buildes out new instances of 
CfnStateMachine$LoggingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |"
  [stack id config]
  (let [builder (CfnStateMachine$LoggingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :include-execution-data)]
      (. builder includeExecutionData data))
    (when-let [data (lookup-entry config id :level)]
      (. builder level data))
    (.build builder)))


(defn cfn-state-machine-props-builder
  "The cfn-state-machine-props-builder function buildes out new instances of 
CfnStateMachineProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracing-configuration` |"
  [stack id config]
  (let [builder (CfnStateMachineProps$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-s3-location)]
      (. builder definitionS3Location data))
    (when-let [data (lookup-entry config id :definition-string)]
      (. builder definitionString data))
    (when-let [data (lookup-entry config id :definition-substitutions)]
      (. builder definitionSubstitutions data))
    (when-let [data (lookup-entry config id :logging-configuration)]
      (. builder loggingConfiguration data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (when-let [data (lookup-entry config id :state-machine-type)]
      (. builder stateMachineType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracing-configuration)]
      (. builder tracingConfiguration data))
    (.build builder)))


(defn cfn-state-machine-s3-location-property-builder
  "The cfn-state-machine-s3-location-property-builder function buildes out new instances of 
CfnStateMachine$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnStateMachine$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-state-machine-tags-entry-property-builder
  "The cfn-state-machine-tags-entry-property-builder function buildes out new instances of 
CfnStateMachine$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnStateMachine$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-state-machine-tracing-configuration-property-builder
  "The cfn-state-machine-tracing-configuration-property-builder function buildes out new instances of 
CfnStateMachine$TracingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnStateMachine$TracingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-state-machine-version-builder
  "The cfn-state-machine-version-builder function buildes out new instances of 
CfnStateMachineVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `stateMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-arn` |
| `stateMachineRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-revision-id` |"
  [stack id config]
  (let [builder (CfnStateMachineVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :state-machine-arn)]
      (. builder stateMachineArn data))
    (when-let [data (lookup-entry config id :state-machine-revision-id)]
      (. builder stateMachineRevisionId data))
    (.build builder)))


(defn cfn-state-machine-version-props-builder
  "The cfn-state-machine-version-props-builder function buildes out new instances of 
CfnStateMachineVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `stateMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-arn` |
| `stateMachineRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-revision-id` |"
  [stack id config]
  (let [builder (CfnStateMachineVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :state-machine-arn)]
      (. builder stateMachineArn data))
    (when-let [data (lookup-entry config id :state-machine-revision-id)]
      (. builder stateMachineRevisionId data))
    (.build builder)))


(defn choice-builder
  "The choice-builder function buildes out new instances of 
Choice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (Choice$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn choice-props-builder
  "The choice-props-builder function buildes out new instances of 
ChoiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (ChoiceProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn choice-transition-options-builder
  "The choice-transition-options-builder function buildes out new instances of 
ChoiceTransitionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (ChoiceTransitionOptions$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn credentials-builder
  "The credentials-builder function buildes out new instances of 
Credentials$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | software.amazon.awscdk.services.stepfunctions.TaskRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (Credentials$Builder.)]
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn custom-state-builder
  "The custom-state-builder function buildes out new instances of 
CustomState$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateJson` | java.util.Map | [[cdk.support/lookup-entry]] | `:state-json` |"
  [stack id config]
  (let [builder (CustomState$Builder/create stack id)]
    (when-let [data (lookup-entry config id :state-json)]
      (. builder stateJson data))
    (.build builder)))


(defn custom-state-props-builder
  "The custom-state-props-builder function buildes out new instances of 
CustomStateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stateJson` | java.util.Map | [[cdk.support/lookup-entry]] | `:state-json` |"
  [stack id config]
  (let [builder (CustomStateProps$Builder.)]
    (when-let [data (lookup-entry config id :state-json)]
      (. builder stateJson data))
    (.build builder)))


(defn definition-config-builder
  "The definition-config-builder function buildes out new instances of 
DefinitionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | software.amazon.awscdk.services.stepfunctions.CfnStateMachine$S3LocationProperty | [[cdk.support/lookup-entry]] | `:definition-s3-location` |
| `definitionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-string` |"
  [stack id config]
  (let [builder (DefinitionConfig$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-s3-location)]
      (. builder definitionS3Location data))
    (when-let [data (lookup-entry config id :definition-string)]
      (. builder definitionString data))
    (.build builder)))


(defn distributed-map-builder
  "The distributed-map-builder function buildes out new instances of 
DistributedMap$Builder using the provided configuration.  Each field is set as follows:

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
| `toleratedFailurePercentagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:tolerated-failure-percentage-path` |"
  [stack id config]
  (let [builder (DistributedMap$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :item-batcher)]
      (. builder itemBatcher data))
    (when-let [data (lookup-entry config id :item-reader)]
      (. builder itemReader data))
    (when-let [data (lookup-entry config id :item-selector)]
      (. builder itemSelector data))
    (when-let [data (lookup-entry config id :items-path)]
      (. builder itemsPath data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (state-machine-type config id :map-execution-type)]
      (. builder mapExecutionType data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-concurrency-path)]
      (. builder maxConcurrencyPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :result-writer)]
      (. builder resultWriter data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tolerated-failure-count)]
      (. builder toleratedFailureCount data))
    (when-let [data (lookup-entry config id :tolerated-failure-count-path)]
      (. builder toleratedFailureCountPath data))
    (when-let [data (lookup-entry config id :tolerated-failure-percentage)]
      (. builder toleratedFailurePercentage data))
    (when-let [data (lookup-entry config id :tolerated-failure-percentage-path)]
      (. builder toleratedFailurePercentagePath data))
    (.build builder)))


(defn distributed-map-props-builder
  "The distributed-map-props-builder function buildes out new instances of 
DistributedMapProps$Builder using the provided configuration.  Each field is set as follows:

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
| `toleratedFailurePercentagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:tolerated-failure-percentage-path` |"
  [stack id config]
  (let [builder (DistributedMapProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :item-batcher)]
      (. builder itemBatcher data))
    (when-let [data (lookup-entry config id :item-reader)]
      (. builder itemReader data))
    (when-let [data (lookup-entry config id :item-selector)]
      (. builder itemSelector data))
    (when-let [data (lookup-entry config id :items-path)]
      (. builder itemsPath data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (state-machine-type config id :map-execution-type)]
      (. builder mapExecutionType data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-concurrency-path)]
      (. builder maxConcurrencyPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :result-writer)]
      (. builder resultWriter data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tolerated-failure-count)]
      (. builder toleratedFailureCount data))
    (when-let [data (lookup-entry config id :tolerated-failure-count-path)]
      (. builder toleratedFailureCountPath data))
    (when-let [data (lookup-entry config id :tolerated-failure-percentage)]
      (. builder toleratedFailurePercentage data))
    (when-let [data (lookup-entry config id :tolerated-failure-percentage-path)]
      (. builder toleratedFailurePercentagePath data))
    (.build builder)))


(defn fail-builder
  "The fail-builder function buildes out new instances of 
Fail$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cause` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause` |
| `causePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause-path` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `error` | java.lang.String | [[cdk.support/lookup-entry]] | `:error` |
| `errorPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (Fail$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cause)]
      (. builder cause data))
    (when-let [data (lookup-entry config id :cause-path)]
      (. builder causePath data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :error)]
      (. builder error data))
    (when-let [data (lookup-entry config id :error-path)]
      (. builder errorPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn fail-props-builder
  "The fail-props-builder function buildes out new instances of 
FailProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cause` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause` |
| `causePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:cause-path` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `error` | java.lang.String | [[cdk.support/lookup-entry]] | `:error` |
| `errorPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (FailProps$Builder.)]
    (when-let [data (lookup-entry config id :cause)]
      (. builder cause data))
    (when-let [data (lookup-entry config id :cause-path)]
      (. builder causePath data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :error)]
      (. builder error data))
    (when-let [data (lookup-entry config id :error-path)]
      (. builder errorPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn file-definition-body-builder
  "The file-definition-body-builder function buildes out new instances of 
FileDefinitionBody$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |"
  [stack id config ^java.lang.String path]
  (let [builder (FileDefinitionBody$Builder/create ^java.lang.String path)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (.build builder)))


(defn find-state-options-builder
  "The find-state-options-builder function buildes out new instances of 
FindStateOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeErrorHandlers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-error-handlers` |"
  [stack id config]
  (let [builder (FindStateOptions$Builder.)]
    (when-let [data (lookup-entry config id :include-error-handlers)]
      (. builder includeErrorHandlers data))
    (.build builder)))


(defn item-batcher-builder
  "The item-batcher-builder function buildes out new instances of 
ItemBatcher$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchInput` | com.fasterxml.jackson.databind.node.ObjectNode | [[cdk.support/lookup-entry]] | `:batch-input` |
| `maxInputBytesPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch` |
| `maxInputBytesPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch-path` |
| `maxItemsPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items-per-batch` |
| `maxItemsPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-items-per-batch-path` |"
  [stack id config]
  (let [builder (ItemBatcher$Builder/create)]
    (when-let [data (lookup-entry config id :batch-input)]
      (. builder batchInput data))
    (when-let [data (lookup-entry config id :max-input-bytes-per-batch)]
      (. builder maxInputBytesPerBatch data))
    (when-let [data (lookup-entry config id :max-input-bytes-per-batch-path)]
      (. builder maxInputBytesPerBatchPath data))
    (when-let [data (lookup-entry config id :max-items-per-batch)]
      (. builder maxItemsPerBatch data))
    (when-let [data (lookup-entry config id :max-items-per-batch-path)]
      (. builder maxItemsPerBatchPath data))
    (.build builder)))


(defn item-batcher-props-builder
  "The item-batcher-props-builder function buildes out new instances of 
ItemBatcherProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchInput` | com.fasterxml.jackson.databind.node.ObjectNode | [[cdk.support/lookup-entry]] | `:batch-input` |
| `maxInputBytesPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch` |
| `maxInputBytesPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-input-bytes-per-batch-path` |
| `maxItemsPerBatch` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items-per-batch` |
| `maxItemsPerBatchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-items-per-batch-path` |"
  [stack id config]
  (let [builder (ItemBatcherProps$Builder.)]
    (when-let [data (lookup-entry config id :batch-input)]
      (. builder batchInput data))
    (when-let [data (lookup-entry config id :max-input-bytes-per-batch)]
      (. builder maxInputBytesPerBatch data))
    (when-let [data (lookup-entry config id :max-input-bytes-per-batch-path)]
      (. builder maxInputBytesPerBatchPath data))
    (when-let [data (lookup-entry config id :max-items-per-batch)]
      (. builder maxItemsPerBatch data))
    (when-let [data (lookup-entry config id :max-items-per-batch-path)]
      (. builder maxItemsPerBatchPath data))
    (.build builder)))


(defn item-reader-props-builder
  "The item-reader-props-builder function buildes out new instances of 
ItemReaderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |"
  [stack id config]
  (let [builder (ItemReaderProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (.build builder)))


(defn log-options-builder
  "The log-options-builder function buildes out new instances of 
LogOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:destination` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | software.amazon.awscdk.services.stepfunctions.LogLevel | [[cdk.api.services.stepfunctions/log-level]] | `:level` |"
  [stack id config]
  (let [builder (LogOptions$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :include-execution-data)]
      (. builder includeExecutionData data))
    (when-let [data (log-level config id :level)]
      (. builder level data))
    (.build builder)))


(defn map-base-props-builder
  "The map-base-props-builder function buildes out new instances of 
MapBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (MapBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :item-selector)]
      (. builder itemSelector data))
    (when-let [data (lookup-entry config id :items-path)]
      (. builder itemsPath data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-concurrency-path)]
      (. builder maxConcurrencyPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn map-builder
  "The map-builder function buildes out new instances of 
Map$Builder using the provided configuration.  Each field is set as follows:

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
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (Map$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :item-selector)]
      (. builder itemSelector data))
    (when-let [data (lookup-entry config id :items-path)]
      (. builder itemsPath data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-concurrency-path)]
      (. builder maxConcurrencyPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn map-props-builder
  "The map-props-builder function buildes out new instances of 
MapProps$Builder using the provided configuration.  Each field is set as follows:

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
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (MapProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :item-selector)]
      (. builder itemSelector data))
    (when-let [data (lookup-entry config id :items-path)]
      (. builder itemsPath data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-concurrency-path)]
      (. builder maxConcurrencyPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn parallel-builder
  "The parallel-builder function buildes out new instances of 
Parallel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (Parallel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn parallel-props-builder
  "The parallel-props-builder function buildes out new instances of 
ParallelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (ParallelProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn pass-builder
  "The pass-builder function buildes out new instances of 
Pass$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `result` | software.amazon.awscdk.services.stepfunctions.Result | [[cdk.support/lookup-entry]] | `:result` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (Pass$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result)]
      (. builder result data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn pass-props-builder
  "The pass-props-builder function buildes out new instances of 
PassProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `result` | software.amazon.awscdk.services.stepfunctions.Result | [[cdk.support/lookup-entry]] | `:result` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (PassProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result)]
      (. builder result data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn processor-config-builder
  "The processor-config-builder function buildes out new instances of 
ProcessorConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionType` | software.amazon.awscdk.services.stepfunctions.ProcessorType | [[cdk.api.services.stepfunctions/processor-type]] | `:execution-type` |
| `mode` | software.amazon.awscdk.services.stepfunctions.ProcessorMode | [[cdk.api.services.stepfunctions/processor-mode]] | `:mode` |"
  [stack id config]
  (let [builder (ProcessorConfig$Builder.)]
    (when-let [data (processor-type config id :execution-type)]
      (. builder executionType data))
    (when-let [data (processor-mode config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn result-writer-builder
  "The result-writer-builder function buildes out new instances of 
ResultWriter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (ResultWriter$Builder/create)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn result-writer-props-builder
  "The result-writer-props-builder function buildes out new instances of 
ResultWriterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (ResultWriterProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn retry-props-builder
  "The retry-props-builder function buildes out new instances of 
RetryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backoffRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backoff-rate` |
| `errors` | java.util.List | [[cdk.support/lookup-entry]] | `:errors` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `jitterStrategy` | software.amazon.awscdk.services.stepfunctions.JitterType | [[cdk.api.services.stepfunctions/jitter-type]] | `:jitter-strategy` |
| `maxAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-attempts` |
| `maxDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-delay` |"
  [stack id config]
  (let [builder (RetryProps$Builder.)]
    (when-let [data (lookup-entry config id :backoff-rate)]
      (. builder backoffRate data))
    (when-let [data (lookup-entry config id :errors)]
      (. builder errors data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (jitter-type config id :jitter-strategy)]
      (. builder jitterStrategy data))
    (when-let [data (lookup-entry config id :max-attempts)]
      (. builder maxAttempts data))
    (when-let [data (lookup-entry config id :max-delay)]
      (. builder maxDelay data))
    (.build builder)))


(defn s3-csv-item-reader-builder
  "The s3-csv-item-reader-builder function buildes out new instances of 
S3CsvItemReader$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `csvHeaders` | software.amazon.awscdk.services.stepfunctions.CsvHeaders | [[cdk.support/lookup-entry]] | `:csv-headers` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |"
  [stack id config]
  (let [builder (S3CsvItemReader$Builder/create)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :csv-headers)]
      (. builder csvHeaders data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (.build builder)))


(defn s3-csv-item-reader-props-builder
  "The s3-csv-item-reader-props-builder function buildes out new instances of 
S3CsvItemReaderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `csvHeaders` | software.amazon.awscdk.services.stepfunctions.CsvHeaders | [[cdk.support/lookup-entry]] | `:csv-headers` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |"
  [stack id config]
  (let [builder (S3CsvItemReaderProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :csv-headers)]
      (. builder csvHeaders data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (.build builder)))


(defn s3-file-item-reader-props-builder
  "The s3-file-item-reader-props-builder function buildes out new instances of 
S3FileItemReaderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |"
  [stack id config]
  (let [builder (S3FileItemReaderProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (.build builder)))


(defn s3-json-item-reader-builder
  "The s3-json-item-reader-builder function buildes out new instances of 
S3JsonItemReader$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |"
  [stack id config]
  (let [builder (S3JsonItemReader$Builder/create)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (.build builder)))


(defn s3-manifest-item-reader-builder
  "The s3-manifest-item-reader-builder function buildes out new instances of 
S3ManifestItemReader$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |"
  [stack id config]
  (let [builder (S3ManifestItemReader$Builder/create)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (.build builder)))


(defn s3-objects-item-reader-builder
  "The s3-objects-item-reader-builder function buildes out new instances of 
S3ObjectsItemReader$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (S3ObjectsItemReader$Builder/create)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn s3-objects-item-reader-props-builder
  "The s3-objects-item-reader-props-builder function buildes out new instances of 
S3ObjectsItemReaderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `maxItems` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-items` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (S3ObjectsItemReaderProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :max-items)]
      (. builder maxItems data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn single-state-options-builder
  "The single-state-options-builder function buildes out new instances of 
SingleStateOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `prefixStates` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-states` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-id` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (SingleStateOptions$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :prefix-states)]
      (. builder prefixStates data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-id)]
      (. builder stateId data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn state-machine-builder
  "The state-machine-builder function buildes out new instances of 
StateMachine$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |"
  [stack id config]
  (let [builder (StateMachine$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-body)]
      (. builder definitionBody data))
    (when-let [data (lookup-entry config id :definition-substitutions)]
      (. builder definitionSubstitutions data))
    (when-let [data (lookup-entry config id :logs)]
      (. builder logs data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (when-let [data (state-machine-type config id :state-machine-type)]
      (. builder stateMachineType data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (.build builder)))


(defn state-machine-props-builder
  "The state-machine-props-builder function buildes out new instances of 
StateMachineProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tracing-enabled` |"
  [stack id config]
  (let [builder (StateMachineProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-body)]
      (. builder definitionBody data))
    (when-let [data (lookup-entry config id :definition-substitutions)]
      (. builder definitionSubstitutions data))
    (when-let [data (lookup-entry config id :logs)]
      (. builder logs data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (when-let [data (state-machine-type config id :state-machine-type)]
      (. builder stateMachineType data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :tracing-enabled)]
      (. builder tracingEnabled data))
    (.build builder)))


(defn state-props-builder
  "The state-props-builder function buildes out new instances of 
StateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (StateProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn succeed-builder
  "The succeed-builder function buildes out new instances of 
Succeed$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (Succeed$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn succeed-props-builder
  "The succeed-props-builder function buildes out new instances of 
SucceedProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (SucceedProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn task-metrics-config-builder
  "The task-metrics-config-builder function buildes out new instances of 
TaskMetricsConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDimensions` | java.util.Map | [[cdk.support/lookup-entry]] | `:metric-dimensions` |
| `metricPrefixPlural` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-prefix-plural` |
| `metricPrefixSingular` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-prefix-singular` |"
  [stack id config]
  (let [builder (TaskMetricsConfig$Builder.)]
    (when-let [data (lookup-entry config id :metric-dimensions)]
      (. builder metricDimensions data))
    (when-let [data (lookup-entry config id :metric-prefix-plural)]
      (. builder metricPrefixPlural data))
    (when-let [data (lookup-entry config id :metric-prefix-singular)]
      (. builder metricPrefixSingular data))
    (.build builder)))


(defn task-state-base-props-builder
  "The task-state-base-props-builder function buildes out new instances of 
TaskStateBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (TaskStateBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn wait-builder
  "The wait-builder function buildes out new instances of 
Wait$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `time` | software.amazon.awscdk.services.stepfunctions.WaitTime | [[cdk.support/lookup-entry]] | `:time` |"
  [stack id config]
  (let [builder (Wait$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :time)]
      (. builder time data))
    (.build builder)))


(defn wait-props-builder
  "The wait-props-builder function buildes out new instances of 
WaitProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `time` | software.amazon.awscdk.services.stepfunctions.WaitTime | [[cdk.support/lookup-entry]] | `:time` |"
  [stack id config]
  (let [builder (WaitProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :time)]
      (. builder time data))
    (.build builder)))