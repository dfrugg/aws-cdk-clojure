(ns cdk.api.services.iotevents
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotevents package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotevents CfnAlarmModel$AcknowledgeFlowProperty$Builder
                                                      CfnAlarmModel$AlarmActionProperty$Builder
                                                      CfnAlarmModel$AlarmCapabilitiesProperty$Builder
                                                      CfnAlarmModel$AlarmEventActionsProperty$Builder
                                                      CfnAlarmModel$AlarmRuleProperty$Builder
                                                      CfnAlarmModel$AssetPropertyTimestampProperty$Builder
                                                      CfnAlarmModel$AssetPropertyValueProperty$Builder
                                                      CfnAlarmModel$AssetPropertyVariantProperty$Builder
                                                      CfnAlarmModel$Builder
                                                      CfnAlarmModel$DynamoDBProperty$Builder
                                                      CfnAlarmModel$DynamoDBv2Property$Builder
                                                      CfnAlarmModel$FirehoseProperty$Builder
                                                      CfnAlarmModel$InitializationConfigurationProperty$Builder
                                                      CfnAlarmModel$IotEventsProperty$Builder
                                                      CfnAlarmModel$IotSiteWiseProperty$Builder
                                                      CfnAlarmModel$IotTopicPublishProperty$Builder
                                                      CfnAlarmModel$LambdaProperty$Builder
                                                      CfnAlarmModel$PayloadProperty$Builder
                                                      CfnAlarmModel$SimpleRuleProperty$Builder
                                                      CfnAlarmModel$SnsProperty$Builder
                                                      CfnAlarmModel$SqsProperty$Builder
                                                      CfnAlarmModelProps$Builder
                                                      CfnDetectorModel$ActionProperty$Builder
                                                      CfnDetectorModel$AssetPropertyTimestampProperty$Builder
                                                      CfnDetectorModel$AssetPropertyValueProperty$Builder
                                                      CfnDetectorModel$AssetPropertyVariantProperty$Builder
                                                      CfnDetectorModel$Builder
                                                      CfnDetectorModel$ClearTimerProperty$Builder
                                                      CfnDetectorModel$DetectorModelDefinitionProperty$Builder
                                                      CfnDetectorModel$DynamoDBProperty$Builder
                                                      CfnDetectorModel$DynamoDBv2Property$Builder
                                                      CfnDetectorModel$EventProperty$Builder
                                                      CfnDetectorModel$FirehoseProperty$Builder
                                                      CfnDetectorModel$IotEventsProperty$Builder
                                                      CfnDetectorModel$IotSiteWiseProperty$Builder
                                                      CfnDetectorModel$IotTopicPublishProperty$Builder
                                                      CfnDetectorModel$LambdaProperty$Builder
                                                      CfnDetectorModel$OnEnterProperty$Builder
                                                      CfnDetectorModel$OnExitProperty$Builder
                                                      CfnDetectorModel$OnInputProperty$Builder
                                                      CfnDetectorModel$PayloadProperty$Builder
                                                      CfnDetectorModel$ResetTimerProperty$Builder
                                                      CfnDetectorModel$SetTimerProperty$Builder
                                                      CfnDetectorModel$SetVariableProperty$Builder
                                                      CfnDetectorModel$SnsProperty$Builder
                                                      CfnDetectorModel$SqsProperty$Builder
                                                      CfnDetectorModel$StateProperty$Builder
                                                      CfnDetectorModel$TransitionEventProperty$Builder
                                                      CfnDetectorModelProps$Builder
                                                      CfnInput$AttributeProperty$Builder
                                                      CfnInput$Builder
                                                      CfnInput$InputDefinitionProperty$Builder
                                                      CfnInputProps$Builder]))


(defn build-cfn-alarm-model-acknowledge-flow-property-builder
  "The build-cfn-alarm-model-acknowledge-flow-property-builder function updates a CfnAlarmModel$AcknowledgeFlowProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AcknowledgeFlowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnAlarmModel$AcknowledgeFlowProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-alarm-model-acknowledge-flow-property-builder
  "Creates a  `CfnAlarmModel$AcknowledgeFlowProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-acknowledge-flow-property-builder (new CfnAlarmModel$AcknowledgeFlowProperty$Builder) id config))


(defn build-cfn-alarm-model-alarm-action-property-builder
  "The build-cfn-alarm-model-alarm-action-property-builder function updates a CfnAlarmModel$AlarmActionProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AlarmActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dynamoDBv2` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$DynamoDBv2Property | [[cdk.support/lookup-entry]] | `:dynamo-d-bv2` |
| `dynamoDb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db` |
| `firehose` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firehose` |
| `iotEvents` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$IotEventsProperty | [[cdk.support/lookup-entry]] | `:iot-events` |
| `iotSiteWise` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-site-wise` |
| `iotTopicPublish` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$IotTopicPublishProperty | [[cdk.support/lookup-entry]] | `:iot-topic-publish` |
| `lambda` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$LambdaProperty | [[cdk.support/lookup-entry]] | `:lambda` |
| `sns` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$SnsProperty | [[cdk.support/lookup-entry]] | `:sns` |
| `sqs` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$SqsProperty | [[cdk.support/lookup-entry]] | `:sqs` |
"
  [^CfnAlarmModel$AlarmActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dynamo-d-bv2)]
    (. builder dynamoDBv2 data))
  (when-let [data (lookup-entry config id :dynamo-db)]
    (. builder dynamoDb data))
  (when-let [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-let [data (lookup-entry config id :iot-events)]
    (. builder iotEvents data))
  (when-let [data (lookup-entry config id :iot-site-wise)]
    (. builder iotSiteWise data))
  (when-let [data (lookup-entry config id :iot-topic-publish)]
    (. builder iotTopicPublish data))
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-let [data (lookup-entry config id :sns)]
    (. builder sns data))
  (when-let [data (lookup-entry config id :sqs)]
    (. builder sqs data))
  (.build builder))


(defn cfn-alarm-model-alarm-action-property-builder
  "Creates a  `CfnAlarmModel$AlarmActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-alarm-action-property-builder (new CfnAlarmModel$AlarmActionProperty$Builder) id config))


(defn build-cfn-alarm-model-alarm-capabilities-property-builder
  "The build-cfn-alarm-model-alarm-capabilities-property-builder function updates a CfnAlarmModel$AlarmCapabilitiesProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AlarmCapabilitiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acknowledgeFlow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acknowledge-flow` |
| `initializationConfiguration` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$InitializationConfigurationProperty | [[cdk.support/lookup-entry]] | `:initialization-configuration` |
"
  [^CfnAlarmModel$AlarmCapabilitiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acknowledge-flow)]
    (. builder acknowledgeFlow data))
  (when-let [data (lookup-entry config id :initialization-configuration)]
    (. builder initializationConfiguration data))
  (.build builder))


(defn cfn-alarm-model-alarm-capabilities-property-builder
  "Creates a  `CfnAlarmModel$AlarmCapabilitiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-alarm-capabilities-property-builder (new CfnAlarmModel$AlarmCapabilitiesProperty$Builder) id config))


(defn build-cfn-alarm-model-alarm-event-actions-property-builder
  "The build-cfn-alarm-model-alarm-event-actions-property-builder function updates a CfnAlarmModel$AlarmEventActionsProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AlarmEventActionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmActions` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-actions` |
"
  [^CfnAlarmModel$AlarmEventActionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-actions)]
    (. builder alarmActions data))
  (.build builder))


(defn cfn-alarm-model-alarm-event-actions-property-builder
  "Creates a  `CfnAlarmModel$AlarmEventActionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-alarm-event-actions-property-builder (new CfnAlarmModel$AlarmEventActionsProperty$Builder) id config))


(defn build-cfn-alarm-model-alarm-rule-property-builder
  "The build-cfn-alarm-model-alarm-rule-property-builder function updates a CfnAlarmModel$AlarmRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AlarmRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `simpleRule` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$SimpleRuleProperty | [[cdk.support/lookup-entry]] | `:simple-rule` |
"
  [^CfnAlarmModel$AlarmRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :simple-rule)]
    (. builder simpleRule data))
  (.build builder))


(defn cfn-alarm-model-alarm-rule-property-builder
  "Creates a  `CfnAlarmModel$AlarmRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-alarm-rule-property-builder (new CfnAlarmModel$AlarmRuleProperty$Builder) id config))


(defn build-cfn-alarm-model-asset-property-timestamp-property-builder
  "The build-cfn-alarm-model-asset-property-timestamp-property-builder function updates a CfnAlarmModel$AssetPropertyTimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AssetPropertyTimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |
"
  [^CfnAlarmModel$AssetPropertyTimestampProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :offset-in-nanos)]
    (. builder offsetInNanos data))
  (when-let [data (lookup-entry config id :time-in-seconds)]
    (. builder timeInSeconds data))
  (.build builder))


(defn cfn-alarm-model-asset-property-timestamp-property-builder
  "Creates a  `CfnAlarmModel$AssetPropertyTimestampProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-asset-property-timestamp-property-builder (new CfnAlarmModel$AssetPropertyTimestampProperty$Builder) id config))


(defn build-cfn-alarm-model-asset-property-value-property-builder
  "The build-cfn-alarm-model-asset-property-value-property-builder function updates a CfnAlarmModel$AssetPropertyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AssetPropertyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `quality` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
| `value` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$AssetPropertyVariantProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAlarmModel$AssetPropertyValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :quality)]
    (. builder quality data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-alarm-model-asset-property-value-property-builder
  "Creates a  `CfnAlarmModel$AssetPropertyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-asset-property-value-property-builder (new CfnAlarmModel$AssetPropertyValueProperty$Builder) id config))


(defn build-cfn-alarm-model-asset-property-variant-property-builder
  "The build-cfn-alarm-model-asset-property-variant-property-builder function updates a CfnAlarmModel$AssetPropertyVariantProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$AssetPropertyVariantProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:double-value` |
| `integerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:integer-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnAlarmModel$AssetPropertyVariantProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-let [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-let [data (lookup-entry config id :integer-value)]
    (. builder integerValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-alarm-model-asset-property-variant-property-builder
  "Creates a  `CfnAlarmModel$AssetPropertyVariantProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-asset-property-variant-property-builder (new CfnAlarmModel$AssetPropertyVariantProperty$Builder) id config))


(defn build-cfn-alarm-model-builder
  "The build-cfn-alarm-model-builder function updates a CfnAlarmModel$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmCapabilities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-capabilities` |
| `alarmEventActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-event-actions` |
| `alarmModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-model-description` |
| `alarmModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-model-name` |
| `alarmRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `severity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:severity` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAlarmModel$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-capabilities)]
    (. builder alarmCapabilities data))
  (when-let [data (lookup-entry config id :alarm-event-actions)]
    (. builder alarmEventActions data))
  (when-let [data (lookup-entry config id :alarm-model-description)]
    (. builder alarmModelDescription data))
  (when-let [data (lookup-entry config id :alarm-model-name)]
    (. builder alarmModelName data))
  (when-let [data (lookup-entry config id :alarm-rule)]
    (. builder alarmRule data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :severity)]
    (. builder severity data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-alarm-model-builder
  "Creates a  `CfnAlarmModel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-alarm-model-builder (CfnAlarmModel$Builder/create scope (name id)) id config))


(defn build-cfn-alarm-model-dynamo-d-bv2-property-builder
  "The build-cfn-alarm-model-dynamo-d-bv2-property-builder function updates a CfnAlarmModel$DynamoDBv2Property$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$DynamoDBv2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnAlarmModel$DynamoDBv2Property$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-alarm-model-dynamo-d-bv2-property-builder
  "Creates a  `CfnAlarmModel$DynamoDBv2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-dynamo-d-bv2-property-builder (new CfnAlarmModel$DynamoDBv2Property$Builder) id config))


(defn build-cfn-alarm-model-dynamo-db-property-builder
  "The build-cfn-alarm-model-dynamo-db-property-builder function updates a CfnAlarmModel$DynamoDBProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$DynamoDBProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hashKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-field` |
| `hashKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-type` |
| `hashKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-value` |
| `operation` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation` |
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `payloadField` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-field` |
| `rangeKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-field` |
| `rangeKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-type` |
| `rangeKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-value` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnAlarmModel$DynamoDBProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hash-key-field)]
    (. builder hashKeyField data))
  (when-let [data (lookup-entry config id :hash-key-type)]
    (. builder hashKeyType data))
  (when-let [data (lookup-entry config id :hash-key-value)]
    (. builder hashKeyValue data))
  (when-let [data (lookup-entry config id :operation)]
    (. builder operation data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :payload-field)]
    (. builder payloadField data))
  (when-let [data (lookup-entry config id :range-key-field)]
    (. builder rangeKeyField data))
  (when-let [data (lookup-entry config id :range-key-type)]
    (. builder rangeKeyType data))
  (when-let [data (lookup-entry config id :range-key-value)]
    (. builder rangeKeyValue data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-alarm-model-dynamo-db-property-builder
  "Creates a  `CfnAlarmModel$DynamoDBProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-dynamo-db-property-builder (new CfnAlarmModel$DynamoDBProperty$Builder) id config))


(defn build-cfn-alarm-model-firehose-property-builder
  "The build-cfn-alarm-model-firehose-property-builder function updates a CfnAlarmModel$FirehoseProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$FirehoseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |
"
  [^CfnAlarmModel$FirehoseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :separator)]
    (. builder separator data))
  (.build builder))


(defn cfn-alarm-model-firehose-property-builder
  "Creates a  `CfnAlarmModel$FirehoseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-firehose-property-builder (new CfnAlarmModel$FirehoseProperty$Builder) id config))


(defn build-cfn-alarm-model-initialization-configuration-property-builder
  "The build-cfn-alarm-model-initialization-configuration-property-builder function updates a CfnAlarmModel$InitializationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$InitializationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disabledOnInitialization` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disabled-on-initialization` |
"
  [^CfnAlarmModel$InitializationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :disabled-on-initialization)]
    (. builder disabledOnInitialization data))
  (.build builder))


(defn cfn-alarm-model-initialization-configuration-property-builder
  "Creates a  `CfnAlarmModel$InitializationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-initialization-configuration-property-builder (new CfnAlarmModel$InitializationConfigurationProperty$Builder) id config))


(defn build-cfn-alarm-model-iot-events-property-builder
  "The build-cfn-alarm-model-iot-events-property-builder function updates a CfnAlarmModel$IotEventsProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$IotEventsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
"
  [^CfnAlarmModel$IotEventsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (.build builder))


(defn cfn-alarm-model-iot-events-property-builder
  "Creates a  `CfnAlarmModel$IotEventsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-iot-events-property-builder (new CfnAlarmModel$IotEventsProperty$Builder) id config))


(defn build-cfn-alarm-model-iot-site-wise-property-builder
  "The build-cfn-alarm-model-iot-site-wise-property-builder function updates a CfnAlarmModel$IotSiteWiseProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$IotSiteWiseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `entryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-id` |
| `propertyAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-alias` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-value` |
"
  [^CfnAlarmModel$IotSiteWiseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-id)]
    (. builder assetId data))
  (when-let [data (lookup-entry config id :entry-id)]
    (. builder entryId data))
  (when-let [data (lookup-entry config id :property-alias)]
    (. builder propertyAlias data))
  (when-let [data (lookup-entry config id :property-id)]
    (. builder propertyId data))
  (when-let [data (lookup-entry config id :property-value)]
    (. builder propertyValue data))
  (.build builder))


(defn cfn-alarm-model-iot-site-wise-property-builder
  "Creates a  `CfnAlarmModel$IotSiteWiseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-iot-site-wise-property-builder (new CfnAlarmModel$IotSiteWiseProperty$Builder) id config))


(defn build-cfn-alarm-model-iot-topic-publish-property-builder
  "The build-cfn-alarm-model-iot-topic-publish-property-builder function updates a CfnAlarmModel$IotTopicPublishProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$IotTopicPublishProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
"
  [^CfnAlarmModel$IotTopicPublishProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mqtt-topic)]
    (. builder mqttTopic data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (.build builder))


(defn cfn-alarm-model-iot-topic-publish-property-builder
  "Creates a  `CfnAlarmModel$IotTopicPublishProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-iot-topic-publish-property-builder (new CfnAlarmModel$IotTopicPublishProperty$Builder) id config))


(defn build-cfn-alarm-model-lambda-property-builder
  "The build-cfn-alarm-model-lambda-property-builder function updates a CfnAlarmModel$LambdaProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$LambdaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
"
  [^CfnAlarmModel$LambdaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (.build builder))


(defn cfn-alarm-model-lambda-property-builder
  "Creates a  `CfnAlarmModel$LambdaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-lambda-property-builder (new CfnAlarmModel$LambdaProperty$Builder) id config))


(defn build-cfn-alarm-model-payload-property-builder
  "The build-cfn-alarm-model-payload-property-builder function updates a CfnAlarmModel$PayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$PayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAlarmModel$PayloadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content-expression)]
    (. builder contentExpression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-alarm-model-payload-property-builder
  "Creates a  `CfnAlarmModel$PayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-payload-property-builder (new CfnAlarmModel$PayloadProperty$Builder) id config))


(defn build-cfn-alarm-model-props-builder
  "The build-cfn-alarm-model-props-builder function updates a CfnAlarmModelProps$Builder instance using the provided configuration.
  The function takes the CfnAlarmModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmCapabilities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-capabilities` |
| `alarmEventActions` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$AlarmEventActionsProperty | [[cdk.support/lookup-entry]] | `:alarm-event-actions` |
| `alarmModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-model-description` |
| `alarmModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-model-name` |
| `alarmRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-rule` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `severity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:severity` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAlarmModelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-capabilities)]
    (. builder alarmCapabilities data))
  (when-let [data (lookup-entry config id :alarm-event-actions)]
    (. builder alarmEventActions data))
  (when-let [data (lookup-entry config id :alarm-model-description)]
    (. builder alarmModelDescription data))
  (when-let [data (lookup-entry config id :alarm-model-name)]
    (. builder alarmModelName data))
  (when-let [data (lookup-entry config id :alarm-rule)]
    (. builder alarmRule data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :severity)]
    (. builder severity data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-alarm-model-props-builder
  "Creates a  `CfnAlarmModelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-props-builder (new CfnAlarmModelProps$Builder) id config))


(defn build-cfn-alarm-model-simple-rule-property-builder
  "The build-cfn-alarm-model-simple-rule-property-builder function updates a CfnAlarmModel$SimpleRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$SimpleRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `inputProperty` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-property` |
| `threshold` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold` |
"
  [^CfnAlarmModel$SimpleRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :input-property)]
    (. builder inputProperty data))
  (when-let [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (.build builder))


(defn cfn-alarm-model-simple-rule-property-builder
  "Creates a  `CfnAlarmModel$SimpleRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-simple-rule-property-builder (new CfnAlarmModel$SimpleRuleProperty$Builder) id config))


(defn build-cfn-alarm-model-sns-property-builder
  "The build-cfn-alarm-model-sns-property-builder function updates a CfnAlarmModel$SnsProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$SnsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnAlarmModel$SnsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-alarm-model-sns-property-builder
  "Creates a  `CfnAlarmModel$SnsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-sns-property-builder (new CfnAlarmModel$SnsProperty$Builder) id config))


(defn build-cfn-alarm-model-sqs-property-builder
  "The build-cfn-alarm-model-sqs-property-builder function updates a CfnAlarmModel$SqsProperty$Builder instance using the provided configuration.
  The function takes the CfnAlarmModel$SqsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
| `useBase64` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-base64` |
"
  [^CfnAlarmModel$SqsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :queue-url)]
    (. builder queueUrl data))
  (when-let [data (lookup-entry config id :use-base64)]
    (. builder useBase64 data))
  (.build builder))


(defn cfn-alarm-model-sqs-property-builder
  "Creates a  `CfnAlarmModel$SqsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alarm-model-sqs-property-builder (new CfnAlarmModel$SqsProperty$Builder) id config))


(defn build-cfn-detector-model-action-property-builder
  "The build-cfn-detector-model-action-property-builder function updates a CfnDetectorModel$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clearTimer` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$ClearTimerProperty | [[cdk.support/lookup-entry]] | `:clear-timer` |
| `dynamoDBv2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-d-bv2` |
| `dynamoDb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db` |
| `firehose` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$FirehoseProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `iotEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-events` |
| `iotSiteWise` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$IotSiteWiseProperty | [[cdk.support/lookup-entry]] | `:iot-site-wise` |
| `iotTopicPublish` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$IotTopicPublishProperty | [[cdk.support/lookup-entry]] | `:iot-topic-publish` |
| `lambda` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$LambdaProperty | [[cdk.support/lookup-entry]] | `:lambda` |
| `resetTimer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reset-timer` |
| `setTimer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:set-timer` |
| `setVariable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:set-variable` |
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |
| `sqs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs` |
"
  [^CfnDetectorModel$ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :clear-timer)]
    (. builder clearTimer data))
  (when-let [data (lookup-entry config id :dynamo-d-bv2)]
    (. builder dynamoDBv2 data))
  (when-let [data (lookup-entry config id :dynamo-db)]
    (. builder dynamoDb data))
  (when-let [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-let [data (lookup-entry config id :iot-events)]
    (. builder iotEvents data))
  (when-let [data (lookup-entry config id :iot-site-wise)]
    (. builder iotSiteWise data))
  (when-let [data (lookup-entry config id :iot-topic-publish)]
    (. builder iotTopicPublish data))
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-let [data (lookup-entry config id :reset-timer)]
    (. builder resetTimer data))
  (when-let [data (lookup-entry config id :set-timer)]
    (. builder setTimer data))
  (when-let [data (lookup-entry config id :set-variable)]
    (. builder setVariable data))
  (when-let [data (lookup-entry config id :sns)]
    (. builder sns data))
  (when-let [data (lookup-entry config id :sqs)]
    (. builder sqs data))
  (.build builder))


(defn cfn-detector-model-action-property-builder
  "Creates a  `CfnDetectorModel$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-action-property-builder (new CfnDetectorModel$ActionProperty$Builder) id config))


(defn build-cfn-detector-model-asset-property-timestamp-property-builder
  "The build-cfn-detector-model-asset-property-timestamp-property-builder function updates a CfnDetectorModel$AssetPropertyTimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$AssetPropertyTimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |
"
  [^CfnDetectorModel$AssetPropertyTimestampProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :offset-in-nanos)]
    (. builder offsetInNanos data))
  (when-let [data (lookup-entry config id :time-in-seconds)]
    (. builder timeInSeconds data))
  (.build builder))


(defn cfn-detector-model-asset-property-timestamp-property-builder
  "Creates a  `CfnDetectorModel$AssetPropertyTimestampProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-asset-property-timestamp-property-builder (new CfnDetectorModel$AssetPropertyTimestampProperty$Builder) id config))


(defn build-cfn-detector-model-asset-property-value-property-builder
  "The build-cfn-detector-model-asset-property-value-property-builder function updates a CfnDetectorModel$AssetPropertyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$AssetPropertyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `quality` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDetectorModel$AssetPropertyValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :quality)]
    (. builder quality data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-detector-model-asset-property-value-property-builder
  "Creates a  `CfnDetectorModel$AssetPropertyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-asset-property-value-property-builder (new CfnDetectorModel$AssetPropertyValueProperty$Builder) id config))


(defn build-cfn-detector-model-asset-property-variant-property-builder
  "The build-cfn-detector-model-asset-property-variant-property-builder function updates a CfnDetectorModel$AssetPropertyVariantProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$AssetPropertyVariantProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:double-value` |
| `integerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:integer-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnDetectorModel$AssetPropertyVariantProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-let [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-let [data (lookup-entry config id :integer-value)]
    (. builder integerValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-detector-model-asset-property-variant-property-builder
  "Creates a  `CfnDetectorModel$AssetPropertyVariantProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-asset-property-variant-property-builder (new CfnDetectorModel$AssetPropertyVariantProperty$Builder) id config))


(defn build-cfn-detector-model-builder
  "The build-cfn-detector-model-builder function updates a CfnDetectorModel$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorModelDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detector-model-definition` |
| `detectorModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-description` |
| `detectorModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-name` |
| `evaluationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-method` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetectorModel$Builder builder id config]
  (when-let [data (lookup-entry config id :detector-model-definition)]
    (. builder detectorModelDefinition data))
  (when-let [data (lookup-entry config id :detector-model-description)]
    (. builder detectorModelDescription data))
  (when-let [data (lookup-entry config id :detector-model-name)]
    (. builder detectorModelName data))
  (when-let [data (lookup-entry config id :evaluation-method)]
    (. builder evaluationMethod data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-model-builder
  "Creates a  `CfnDetectorModel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-detector-model-builder (CfnDetectorModel$Builder/create scope (name id)) id config))


(defn build-cfn-detector-model-clear-timer-property-builder
  "The build-cfn-detector-model-clear-timer-property-builder function updates a CfnDetectorModel$ClearTimerProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$ClearTimerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timer-name` |
"
  [^CfnDetectorModel$ClearTimerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :timer-name)]
    (. builder timerName data))
  (.build builder))


(defn cfn-detector-model-clear-timer-property-builder
  "Creates a  `CfnDetectorModel$ClearTimerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-clear-timer-property-builder (new CfnDetectorModel$ClearTimerProperty$Builder) id config))


(defn build-cfn-detector-model-detector-model-definition-property-builder
  "The build-cfn-detector-model-detector-model-definition-property-builder function updates a CfnDetectorModel$DetectorModelDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$DetectorModelDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialStateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:initial-state-name` |
| `states` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:states` |
"
  [^CfnDetectorModel$DetectorModelDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :initial-state-name)]
    (. builder initialStateName data))
  (when-let [data (lookup-entry config id :states)]
    (. builder states data))
  (.build builder))


(defn cfn-detector-model-detector-model-definition-property-builder
  "Creates a  `CfnDetectorModel$DetectorModelDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-detector-model-definition-property-builder (new CfnDetectorModel$DetectorModelDefinitionProperty$Builder) id config))


(defn build-cfn-detector-model-dynamo-d-bv2-property-builder
  "The build-cfn-detector-model-dynamo-d-bv2-property-builder function updates a CfnDetectorModel$DynamoDBv2Property$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$DynamoDBv2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDetectorModel$DynamoDBv2Property$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-detector-model-dynamo-d-bv2-property-builder
  "Creates a  `CfnDetectorModel$DynamoDBv2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-dynamo-d-bv2-property-builder (new CfnDetectorModel$DynamoDBv2Property$Builder) id config))


(defn build-cfn-detector-model-dynamo-db-property-builder
  "The build-cfn-detector-model-dynamo-db-property-builder function updates a CfnDetectorModel$DynamoDBProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$DynamoDBProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hashKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-field` |
| `hashKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-type` |
| `hashKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-value` |
| `operation` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation` |
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `payloadField` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-field` |
| `rangeKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-field` |
| `rangeKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-type` |
| `rangeKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-value` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDetectorModel$DynamoDBProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hash-key-field)]
    (. builder hashKeyField data))
  (when-let [data (lookup-entry config id :hash-key-type)]
    (. builder hashKeyType data))
  (when-let [data (lookup-entry config id :hash-key-value)]
    (. builder hashKeyValue data))
  (when-let [data (lookup-entry config id :operation)]
    (. builder operation data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :payload-field)]
    (. builder payloadField data))
  (when-let [data (lookup-entry config id :range-key-field)]
    (. builder rangeKeyField data))
  (when-let [data (lookup-entry config id :range-key-type)]
    (. builder rangeKeyType data))
  (when-let [data (lookup-entry config id :range-key-value)]
    (. builder rangeKeyValue data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-detector-model-dynamo-db-property-builder
  "Creates a  `CfnDetectorModel$DynamoDBProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-dynamo-db-property-builder (new CfnDetectorModel$DynamoDBProperty$Builder) id config))


(defn build-cfn-detector-model-event-property-builder
  "The build-cfn-detector-model-event-property-builder function updates a CfnDetectorModel$EventProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$EventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `eventName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-name` |
"
  [^CfnDetectorModel$EventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :event-name)]
    (. builder eventName data))
  (.build builder))


(defn cfn-detector-model-event-property-builder
  "Creates a  `CfnDetectorModel$EventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-event-property-builder (new CfnDetectorModel$EventProperty$Builder) id config))


(defn build-cfn-detector-model-firehose-property-builder
  "The build-cfn-detector-model-firehose-property-builder function updates a CfnDetectorModel$FirehoseProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$FirehoseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |
"
  [^CfnDetectorModel$FirehoseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :separator)]
    (. builder separator data))
  (.build builder))


(defn cfn-detector-model-firehose-property-builder
  "Creates a  `CfnDetectorModel$FirehoseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-firehose-property-builder (new CfnDetectorModel$FirehoseProperty$Builder) id config))


(defn build-cfn-detector-model-iot-events-property-builder
  "The build-cfn-detector-model-iot-events-property-builder function updates a CfnDetectorModel$IotEventsProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$IotEventsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
"
  [^CfnDetectorModel$IotEventsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (.build builder))


(defn cfn-detector-model-iot-events-property-builder
  "Creates a  `CfnDetectorModel$IotEventsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-iot-events-property-builder (new CfnDetectorModel$IotEventsProperty$Builder) id config))


(defn build-cfn-detector-model-iot-site-wise-property-builder
  "The build-cfn-detector-model-iot-site-wise-property-builder function updates a CfnDetectorModel$IotSiteWiseProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$IotSiteWiseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `entryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-id` |
| `propertyAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-alias` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-value` |
"
  [^CfnDetectorModel$IotSiteWiseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-id)]
    (. builder assetId data))
  (when-let [data (lookup-entry config id :entry-id)]
    (. builder entryId data))
  (when-let [data (lookup-entry config id :property-alias)]
    (. builder propertyAlias data))
  (when-let [data (lookup-entry config id :property-id)]
    (. builder propertyId data))
  (when-let [data (lookup-entry config id :property-value)]
    (. builder propertyValue data))
  (.build builder))


(defn cfn-detector-model-iot-site-wise-property-builder
  "Creates a  `CfnDetectorModel$IotSiteWiseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-iot-site-wise-property-builder (new CfnDetectorModel$IotSiteWiseProperty$Builder) id config))


(defn build-cfn-detector-model-iot-topic-publish-property-builder
  "The build-cfn-detector-model-iot-topic-publish-property-builder function updates a CfnDetectorModel$IotTopicPublishProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$IotTopicPublishProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
"
  [^CfnDetectorModel$IotTopicPublishProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mqtt-topic)]
    (. builder mqttTopic data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (.build builder))


(defn cfn-detector-model-iot-topic-publish-property-builder
  "Creates a  `CfnDetectorModel$IotTopicPublishProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-iot-topic-publish-property-builder (new CfnDetectorModel$IotTopicPublishProperty$Builder) id config))


(defn build-cfn-detector-model-lambda-property-builder
  "The build-cfn-detector-model-lambda-property-builder function updates a CfnDetectorModel$LambdaProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$LambdaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
"
  [^CfnDetectorModel$LambdaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (.build builder))


(defn cfn-detector-model-lambda-property-builder
  "Creates a  `CfnDetectorModel$LambdaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-lambda-property-builder (new CfnDetectorModel$LambdaProperty$Builder) id config))


(defn build-cfn-detector-model-on-enter-property-builder
  "The build-cfn-detector-model-on-enter-property-builder function updates a CfnDetectorModel$OnEnterProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$OnEnterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |
"
  [^CfnDetectorModel$OnEnterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (.build builder))


(defn cfn-detector-model-on-enter-property-builder
  "Creates a  `CfnDetectorModel$OnEnterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-on-enter-property-builder (new CfnDetectorModel$OnEnterProperty$Builder) id config))


(defn build-cfn-detector-model-on-exit-property-builder
  "The build-cfn-detector-model-on-exit-property-builder function updates a CfnDetectorModel$OnExitProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$OnExitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^CfnDetectorModel$OnExitProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (.build builder))


(defn cfn-detector-model-on-exit-property-builder
  "Creates a  `CfnDetectorModel$OnExitProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-on-exit-property-builder (new CfnDetectorModel$OnExitProperty$Builder) id config))


(defn build-cfn-detector-model-on-input-property-builder
  "The build-cfn-detector-model-on-input-property-builder function updates a CfnDetectorModel$OnInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$OnInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `transitionEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transition-events` |
"
  [^CfnDetectorModel$OnInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :transition-events)]
    (. builder transitionEvents data))
  (.build builder))


(defn cfn-detector-model-on-input-property-builder
  "Creates a  `CfnDetectorModel$OnInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-on-input-property-builder (new CfnDetectorModel$OnInputProperty$Builder) id config))


(defn build-cfn-detector-model-payload-property-builder
  "The build-cfn-detector-model-payload-property-builder function updates a CfnDetectorModel$PayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$PayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDetectorModel$PayloadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content-expression)]
    (. builder contentExpression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-detector-model-payload-property-builder
  "Creates a  `CfnDetectorModel$PayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-payload-property-builder (new CfnDetectorModel$PayloadProperty$Builder) id config))


(defn build-cfn-detector-model-props-builder
  "The build-cfn-detector-model-props-builder function updates a CfnDetectorModelProps$Builder instance using the provided configuration.
  The function takes the CfnDetectorModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorModelDefinition` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$DetectorModelDefinitionProperty | [[cdk.support/lookup-entry]] | `:detector-model-definition` |
| `detectorModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-description` |
| `detectorModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-name` |
| `evaluationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-method` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetectorModelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :detector-model-definition)]
    (. builder detectorModelDefinition data))
  (when-let [data (lookup-entry config id :detector-model-description)]
    (. builder detectorModelDescription data))
  (when-let [data (lookup-entry config id :detector-model-name)]
    (. builder detectorModelName data))
  (when-let [data (lookup-entry config id :evaluation-method)]
    (. builder evaluationMethod data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-model-props-builder
  "Creates a  `CfnDetectorModelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-props-builder (new CfnDetectorModelProps$Builder) id config))


(defn build-cfn-detector-model-reset-timer-property-builder
  "The build-cfn-detector-model-reset-timer-property-builder function updates a CfnDetectorModel$ResetTimerProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$ResetTimerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timer-name` |
"
  [^CfnDetectorModel$ResetTimerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :timer-name)]
    (. builder timerName data))
  (.build builder))


(defn cfn-detector-model-reset-timer-property-builder
  "Creates a  `CfnDetectorModel$ResetTimerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-reset-timer-property-builder (new CfnDetectorModel$ResetTimerProperty$Builder) id config))


(defn build-cfn-detector-model-set-timer-property-builder
  "The build-cfn-detector-model-set-timer-property-builder function updates a CfnDetectorModel$SetTimerProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$SetTimerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration-expression` |
| `seconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seconds` |
| `timerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timer-name` |
"
  [^CfnDetectorModel$SetTimerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration-expression)]
    (. builder durationExpression data))
  (when-let [data (lookup-entry config id :seconds)]
    (. builder seconds data))
  (when-let [data (lookup-entry config id :timer-name)]
    (. builder timerName data))
  (.build builder))


(defn cfn-detector-model-set-timer-property-builder
  "Creates a  `CfnDetectorModel$SetTimerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-set-timer-property-builder (new CfnDetectorModel$SetTimerProperty$Builder) id config))


(defn build-cfn-detector-model-set-variable-property-builder
  "The build-cfn-detector-model-set-variable-property-builder function updates a CfnDetectorModel$SetVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$SetVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |
"
  [^CfnDetectorModel$SetVariableProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :variable-name)]
    (. builder variableName data))
  (.build builder))


(defn cfn-detector-model-set-variable-property-builder
  "Creates a  `CfnDetectorModel$SetVariableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-set-variable-property-builder (new CfnDetectorModel$SetVariableProperty$Builder) id config))


(defn build-cfn-detector-model-sns-property-builder
  "The build-cfn-detector-model-sns-property-builder function updates a CfnDetectorModel$SnsProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$SnsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnDetectorModel$SnsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-detector-model-sns-property-builder
  "Creates a  `CfnDetectorModel$SnsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-sns-property-builder (new CfnDetectorModel$SnsProperty$Builder) id config))


(defn build-cfn-detector-model-sqs-property-builder
  "The build-cfn-detector-model-sqs-property-builder function updates a CfnDetectorModel$SqsProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$SqsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
| `useBase64` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-base64` |
"
  [^CfnDetectorModel$SqsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-let [data (lookup-entry config id :queue-url)]
    (. builder queueUrl data))
  (when-let [data (lookup-entry config id :use-base64)]
    (. builder useBase64 data))
  (.build builder))


(defn cfn-detector-model-sqs-property-builder
  "Creates a  `CfnDetectorModel$SqsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-sqs-property-builder (new CfnDetectorModel$SqsProperty$Builder) id config))


(defn build-cfn-detector-model-state-property-builder
  "The build-cfn-detector-model-state-property-builder function updates a CfnDetectorModel$StateProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$StateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onEnter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-enter` |
| `onExit` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$OnExitProperty | [[cdk.support/lookup-entry]] | `:on-exit` |
| `onInput` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$OnInputProperty | [[cdk.support/lookup-entry]] | `:on-input` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
"
  [^CfnDetectorModel$StateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-enter)]
    (. builder onEnter data))
  (when-let [data (lookup-entry config id :on-exit)]
    (. builder onExit data))
  (when-let [data (lookup-entry config id :on-input)]
    (. builder onInput data))
  (when-let [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (.build builder))


(defn cfn-detector-model-state-property-builder
  "Creates a  `CfnDetectorModel$StateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-state-property-builder (new CfnDetectorModel$StateProperty$Builder) id config))


(defn build-cfn-detector-model-transition-event-property-builder
  "The build-cfn-detector-model-transition-event-property-builder function updates a CfnDetectorModel$TransitionEventProperty$Builder instance using the provided configuration.
  The function takes the CfnDetectorModel$TransitionEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `eventName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-name` |
| `nextState` | java.lang.String | [[cdk.support/lookup-entry]] | `:next-state` |
"
  [^CfnDetectorModel$TransitionEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :event-name)]
    (. builder eventName data))
  (when-let [data (lookup-entry config id :next-state)]
    (. builder nextState data))
  (.build builder))


(defn cfn-detector-model-transition-event-property-builder
  "Creates a  `CfnDetectorModel$TransitionEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-detector-model-transition-event-property-builder (new CfnDetectorModel$TransitionEventProperty$Builder) id config))


(defn build-cfn-input-attribute-property-builder
  "The build-cfn-input-attribute-property-builder function updates a CfnInput$AttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$AttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
"
  [^CfnInput$AttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :json-path)]
    (. builder jsonPath data))
  (.build builder))


(defn cfn-input-attribute-property-builder
  "Creates a  `CfnInput$AttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-input-attribute-property-builder (new CfnInput$AttributeProperty$Builder) id config))


(defn build-cfn-input-builder
  "The build-cfn-input-builder function updates a CfnInput$Builder instance using the provided configuration.
  The function takes the CfnInput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-definition` |
| `inputDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-description` |
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInput$Builder builder id config]
  (when-let [data (lookup-entry config id :input-definition)]
    (. builder inputDefinition data))
  (when-let [data (lookup-entry config id :input-description)]
    (. builder inputDescription data))
  (when-let [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-input-builder
  "Creates a  `CfnInput$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-input-builder (CfnInput$Builder/create scope (name id)) id config))


(defn build-cfn-input-input-definition-property-builder
  "The build-cfn-input-input-definition-property-builder function updates a CfnInput$InputDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$InputDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnInput$InputDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn cfn-input-input-definition-property-builder
  "Creates a  `CfnInput$InputDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-input-input-definition-property-builder (new CfnInput$InputDefinitionProperty$Builder) id config))


(defn build-cfn-input-props-builder
  "The build-cfn-input-props-builder function updates a CfnInputProps$Builder instance using the provided configuration.
  The function takes the CfnInputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-definition` |
| `inputDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-description` |
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInputProps$Builder builder id config]
  (when-let [data (lookup-entry config id :input-definition)]
    (. builder inputDefinition data))
  (when-let [data (lookup-entry config id :input-description)]
    (. builder inputDescription data))
  (when-let [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-input-props-builder
  "Creates a  `CfnInputProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-input-props-builder (new CfnInputProps$Builder) id config))