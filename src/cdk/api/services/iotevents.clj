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


(defn cfn-alarm-model-acknowledge-flow-property-builder
  "The cfn-alarm-model-acknowledge-flow-property-builder function buildes out new instances of 
CfnAlarmModel$AcknowledgeFlowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AcknowledgeFlowProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-alarm-model-alarm-action-property-builder
  "The cfn-alarm-model-alarm-action-property-builder function buildes out new instances of 
CfnAlarmModel$AlarmActionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `sqs` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$SqsProperty | [[cdk.support/lookup-entry]] | `:sqs` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AlarmActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-alarm-model-alarm-capabilities-property-builder
  "The cfn-alarm-model-alarm-capabilities-property-builder function buildes out new instances of 
CfnAlarmModel$AlarmCapabilitiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acknowledgeFlow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acknowledge-flow` |
| `initializationConfiguration` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$InitializationConfigurationProperty | [[cdk.support/lookup-entry]] | `:initialization-configuration` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AlarmCapabilitiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :acknowledge-flow)]
      (. builder acknowledgeFlow data))
    (when-let [data (lookup-entry config id :initialization-configuration)]
      (. builder initializationConfiguration data))
    (.build builder)))


(defn cfn-alarm-model-alarm-event-actions-property-builder
  "The cfn-alarm-model-alarm-event-actions-property-builder function buildes out new instances of 
CfnAlarmModel$AlarmEventActionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmActions` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-actions` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AlarmEventActionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-actions)]
      (. builder alarmActions data))
    (.build builder)))


(defn cfn-alarm-model-alarm-rule-property-builder
  "The cfn-alarm-model-alarm-rule-property-builder function buildes out new instances of 
CfnAlarmModel$AlarmRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `simpleRule` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$SimpleRuleProperty | [[cdk.support/lookup-entry]] | `:simple-rule` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AlarmRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :simple-rule)]
      (. builder simpleRule data))
    (.build builder)))


(defn cfn-alarm-model-asset-property-timestamp-property-builder
  "The cfn-alarm-model-asset-property-timestamp-property-builder function buildes out new instances of 
CfnAlarmModel$AssetPropertyTimestampProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AssetPropertyTimestampProperty$Builder.)]
    (when-let [data (lookup-entry config id :offset-in-nanos)]
      (. builder offsetInNanos data))
    (when-let [data (lookup-entry config id :time-in-seconds)]
      (. builder timeInSeconds data))
    (.build builder)))


(defn cfn-alarm-model-asset-property-value-property-builder
  "The cfn-alarm-model-asset-property-value-property-builder function buildes out new instances of 
CfnAlarmModel$AssetPropertyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `quality` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
| `value` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$AssetPropertyVariantProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AssetPropertyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :quality)]
      (. builder quality data))
    (when-let [data (lookup-entry config id :timestamp)]
      (. builder timestamp data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-alarm-model-asset-property-variant-property-builder
  "The cfn-alarm-model-asset-property-variant-property-builder function buildes out new instances of 
CfnAlarmModel$AssetPropertyVariantProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:double-value` |
| `integerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:integer-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnAlarmModel$AssetPropertyVariantProperty$Builder.)]
    (when-let [data (lookup-entry config id :boolean-value)]
      (. builder booleanValue data))
    (when-let [data (lookup-entry config id :double-value)]
      (. builder doubleValue data))
    (when-let [data (lookup-entry config id :integer-value)]
      (. builder integerValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-alarm-model-builder
  "The cfn-alarm-model-builder function buildes out new instances of 
CfnAlarmModel$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAlarmModel$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-alarm-model-dynamo-d-bv2-property-builder
  "The cfn-alarm-model-dynamo-d-bv2-property-builder function buildes out new instances of 
CfnAlarmModel$DynamoDBv2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnAlarmModel$DynamoDBv2Property$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-alarm-model-dynamo-db-property-builder
  "The cfn-alarm-model-dynamo-db-property-builder function buildes out new instances of 
CfnAlarmModel$DynamoDBProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnAlarmModel$DynamoDBProperty$Builder.)]
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
    (.build builder)))


(defn cfn-alarm-model-firehose-property-builder
  "The cfn-alarm-model-firehose-property-builder function buildes out new instances of 
CfnAlarmModel$FirehoseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |"
  [stack id config]
  (let [builder (CfnAlarmModel$FirehoseProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-name)]
      (. builder deliveryStreamName data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :separator)]
      (. builder separator data))
    (.build builder)))


(defn cfn-alarm-model-initialization-configuration-property-builder
  "The cfn-alarm-model-initialization-configuration-property-builder function buildes out new instances of 
CfnAlarmModel$InitializationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disabledOnInitialization` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disabled-on-initialization` |"
  [stack id config]
  (let [builder (CfnAlarmModel$InitializationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :disabled-on-initialization)]
      (. builder disabledOnInitialization data))
    (.build builder)))


(defn cfn-alarm-model-iot-events-property-builder
  "The cfn-alarm-model-iot-events-property-builder function buildes out new instances of 
CfnAlarmModel$IotEventsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |"
  [stack id config]
  (let [builder (CfnAlarmModel$IotEventsProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-name)]
      (. builder inputName data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (.build builder)))


(defn cfn-alarm-model-iot-site-wise-property-builder
  "The cfn-alarm-model-iot-site-wise-property-builder function buildes out new instances of 
CfnAlarmModel$IotSiteWiseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `entryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-id` |
| `propertyAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-alias` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-value` |"
  [stack id config]
  (let [builder (CfnAlarmModel$IotSiteWiseProperty$Builder.)]
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
    (.build builder)))


(defn cfn-alarm-model-iot-topic-publish-property-builder
  "The cfn-alarm-model-iot-topic-publish-property-builder function buildes out new instances of 
CfnAlarmModel$IotTopicPublishProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |"
  [stack id config]
  (let [builder (CfnAlarmModel$IotTopicPublishProperty$Builder.)]
    (when-let [data (lookup-entry config id :mqtt-topic)]
      (. builder mqttTopic data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (.build builder)))


(defn cfn-alarm-model-lambda-property-builder
  "The cfn-alarm-model-lambda-property-builder function buildes out new instances of 
CfnAlarmModel$LambdaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnAlarmModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |"
  [stack id config]
  (let [builder (CfnAlarmModel$LambdaProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (.build builder)))


(defn cfn-alarm-model-payload-property-builder
  "The cfn-alarm-model-payload-property-builder function buildes out new instances of 
CfnAlarmModel$PayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAlarmModel$PayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-expression)]
      (. builder contentExpression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-alarm-model-props-builder
  "The cfn-alarm-model-props-builder function buildes out new instances of 
CfnAlarmModelProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAlarmModelProps$Builder.)]
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
    (.build builder)))


(defn cfn-alarm-model-simple-rule-property-builder
  "The cfn-alarm-model-simple-rule-property-builder function buildes out new instances of 
CfnAlarmModel$SimpleRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `inputProperty` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-property` |
| `threshold` | java.lang.String | [[cdk.support/lookup-entry]] | `:threshold` |"
  [stack id config]
  (let [builder (CfnAlarmModel$SimpleRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :input-property)]
      (. builder inputProperty data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (.build builder)))


(defn cfn-alarm-model-sns-property-builder
  "The cfn-alarm-model-sns-property-builder function buildes out new instances of 
CfnAlarmModel$SnsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnAlarmModel$SnsProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-alarm-model-sqs-property-builder
  "The cfn-alarm-model-sqs-property-builder function buildes out new instances of 
CfnAlarmModel$SqsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
| `useBase64` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-base64` |"
  [stack id config]
  (let [builder (CfnAlarmModel$SqsProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :queue-url)]
      (. builder queueUrl data))
    (when-let [data (lookup-entry config id :use-base64)]
      (. builder useBase64 data))
    (.build builder)))


(defn cfn-detector-model-action-property-builder
  "The cfn-detector-model-action-property-builder function buildes out new instances of 
CfnDetectorModel$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `sqs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs` |"
  [stack id config]
  (let [builder (CfnDetectorModel$ActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-model-asset-property-timestamp-property-builder
  "The cfn-detector-model-asset-property-timestamp-property-builder function buildes out new instances of 
CfnDetectorModel$AssetPropertyTimestampProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |"
  [stack id config]
  (let [builder (CfnDetectorModel$AssetPropertyTimestampProperty$Builder.)]
    (when-let [data (lookup-entry config id :offset-in-nanos)]
      (. builder offsetInNanos data))
    (when-let [data (lookup-entry config id :time-in-seconds)]
      (. builder timeInSeconds data))
    (.build builder)))


(defn cfn-detector-model-asset-property-value-property-builder
  "The cfn-detector-model-asset-property-value-property-builder function buildes out new instances of 
CfnDetectorModel$AssetPropertyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `quality` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDetectorModel$AssetPropertyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :quality)]
      (. builder quality data))
    (when-let [data (lookup-entry config id :timestamp)]
      (. builder timestamp data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-detector-model-asset-property-variant-property-builder
  "The cfn-detector-model-asset-property-variant-property-builder function buildes out new instances of 
CfnDetectorModel$AssetPropertyVariantProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:double-value` |
| `integerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:integer-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnDetectorModel$AssetPropertyVariantProperty$Builder.)]
    (when-let [data (lookup-entry config id :boolean-value)]
      (. builder booleanValue data))
    (when-let [data (lookup-entry config id :double-value)]
      (. builder doubleValue data))
    (when-let [data (lookup-entry config id :integer-value)]
      (. builder integerValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-detector-model-builder
  "The cfn-detector-model-builder function buildes out new instances of 
CfnDetectorModel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorModelDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detector-model-definition` |
| `detectorModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-description` |
| `detectorModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-name` |
| `evaluationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-method` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetectorModel$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-detector-model-clear-timer-property-builder
  "The cfn-detector-model-clear-timer-property-builder function buildes out new instances of 
CfnDetectorModel$ClearTimerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timer-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$ClearTimerProperty$Builder.)]
    (when-let [data (lookup-entry config id :timer-name)]
      (. builder timerName data))
    (.build builder)))


(defn cfn-detector-model-detector-model-definition-property-builder
  "The cfn-detector-model-detector-model-definition-property-builder function buildes out new instances of 
CfnDetectorModel$DetectorModelDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialStateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:initial-state-name` |
| `states` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:states` |"
  [stack id config]
  (let [builder (CfnDetectorModel$DetectorModelDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :initial-state-name)]
      (. builder initialStateName data))
    (when-let [data (lookup-entry config id :states)]
      (. builder states data))
    (.build builder)))


(defn cfn-detector-model-dynamo-d-bv2-property-builder
  "The cfn-detector-model-dynamo-d-bv2-property-builder function buildes out new instances of 
CfnDetectorModel$DynamoDBv2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$DynamoDBv2Property$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-detector-model-dynamo-db-property-builder
  "The cfn-detector-model-dynamo-db-property-builder function buildes out new instances of 
CfnDetectorModel$DynamoDBProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$DynamoDBProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-model-event-property-builder
  "The cfn-detector-model-event-property-builder function buildes out new instances of 
CfnDetectorModel$EventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `eventName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$EventProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :event-name)]
      (. builder eventName data))
    (.build builder)))


(defn cfn-detector-model-firehose-property-builder
  "The cfn-detector-model-firehose-property-builder function buildes out new instances of 
CfnDetectorModel$FirehoseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |"
  [stack id config]
  (let [builder (CfnDetectorModel$FirehoseProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-name)]
      (. builder deliveryStreamName data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :separator)]
      (. builder separator data))
    (.build builder)))


(defn cfn-detector-model-iot-events-property-builder
  "The cfn-detector-model-iot-events-property-builder function buildes out new instances of 
CfnDetectorModel$IotEventsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |"
  [stack id config]
  (let [builder (CfnDetectorModel$IotEventsProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-name)]
      (. builder inputName data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (.build builder)))


(defn cfn-detector-model-iot-site-wise-property-builder
  "The cfn-detector-model-iot-site-wise-property-builder function buildes out new instances of 
CfnDetectorModel$IotSiteWiseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `entryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-id` |
| `propertyAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-alias` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-value` |"
  [stack id config]
  (let [builder (CfnDetectorModel$IotSiteWiseProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-model-iot-topic-publish-property-builder
  "The cfn-detector-model-iot-topic-publish-property-builder function buildes out new instances of 
CfnDetectorModel$IotTopicPublishProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |"
  [stack id config]
  (let [builder (CfnDetectorModel$IotTopicPublishProperty$Builder.)]
    (when-let [data (lookup-entry config id :mqtt-topic)]
      (. builder mqttTopic data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (.build builder)))


(defn cfn-detector-model-lambda-property-builder
  "The cfn-detector-model-lambda-property-builder function buildes out new instances of 
CfnDetectorModel$LambdaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |"
  [stack id config]
  (let [builder (CfnDetectorModel$LambdaProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (.build builder)))


(defn cfn-detector-model-on-enter-property-builder
  "The cfn-detector-model-on-enter-property-builder function buildes out new instances of 
CfnDetectorModel$OnEnterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (CfnDetectorModel$OnEnterProperty$Builder.)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn cfn-detector-model-on-exit-property-builder
  "The cfn-detector-model-on-exit-property-builder function buildes out new instances of 
CfnDetectorModel$OnExitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (CfnDetectorModel$OnExitProperty$Builder.)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn cfn-detector-model-on-input-property-builder
  "The cfn-detector-model-on-input-property-builder function buildes out new instances of 
CfnDetectorModel$OnInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `transitionEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transition-events` |"
  [stack id config]
  (let [builder (CfnDetectorModel$OnInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :transition-events)]
      (. builder transitionEvents data))
    (.build builder)))


(defn cfn-detector-model-payload-property-builder
  "The cfn-detector-model-payload-property-builder function buildes out new instances of 
CfnDetectorModel$PayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDetectorModel$PayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-expression)]
      (. builder contentExpression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-detector-model-props-builder
  "The cfn-detector-model-props-builder function buildes out new instances of 
CfnDetectorModelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectorModelDefinition` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$DetectorModelDefinitionProperty | [[cdk.support/lookup-entry]] | `:detector-model-definition` |
| `detectorModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-description` |
| `detectorModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-model-name` |
| `evaluationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-method` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetectorModelProps$Builder.)]
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
    (.build builder)))


(defn cfn-detector-model-reset-timer-property-builder
  "The cfn-detector-model-reset-timer-property-builder function buildes out new instances of 
CfnDetectorModel$ResetTimerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timer-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$ResetTimerProperty$Builder.)]
    (when-let [data (lookup-entry config id :timer-name)]
      (. builder timerName data))
    (.build builder)))


(defn cfn-detector-model-set-timer-property-builder
  "The cfn-detector-model-set-timer-property-builder function buildes out new instances of 
CfnDetectorModel$SetTimerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration-expression` |
| `seconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seconds` |
| `timerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:timer-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$SetTimerProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-expression)]
      (. builder durationExpression data))
    (when-let [data (lookup-entry config id :seconds)]
      (. builder seconds data))
    (when-let [data (lookup-entry config id :timer-name)]
      (. builder timerName data))
    (.build builder)))


(defn cfn-detector-model-set-variable-property-builder
  "The cfn-detector-model-set-variable-property-builder function buildes out new instances of 
CfnDetectorModel$SetVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `variableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$SetVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :variable-name)]
      (. builder variableName data))
    (.build builder)))


(defn cfn-detector-model-sns-property-builder
  "The cfn-detector-model-sns-property-builder function buildes out new instances of 
CfnDetectorModel$SnsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$PayloadProperty | [[cdk.support/lookup-entry]] | `:payload` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnDetectorModel$SnsProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-detector-model-sqs-property-builder
  "The cfn-detector-model-sqs-property-builder function buildes out new instances of 
CfnDetectorModel$SqsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:payload` |
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
| `useBase64` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-base64` |"
  [stack id config]
  (let [builder (CfnDetectorModel$SqsProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :queue-url)]
      (. builder queueUrl data))
    (when-let [data (lookup-entry config id :use-base64)]
      (. builder useBase64 data))
    (.build builder)))


(defn cfn-detector-model-state-property-builder
  "The cfn-detector-model-state-property-builder function buildes out new instances of 
CfnDetectorModel$StateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onEnter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-enter` |
| `onExit` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$OnExitProperty | [[cdk.support/lookup-entry]] | `:on-exit` |
| `onInput` | software.amazon.awscdk.services.iotevents.CfnDetectorModel$OnInputProperty | [[cdk.support/lookup-entry]] | `:on-input` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |"
  [stack id config]
  (let [builder (CfnDetectorModel$StateProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-enter)]
      (. builder onEnter data))
    (when-let [data (lookup-entry config id :on-exit)]
      (. builder onExit data))
    (when-let [data (lookup-entry config id :on-input)]
      (. builder onInput data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (.build builder)))


(defn cfn-detector-model-transition-event-property-builder
  "The cfn-detector-model-transition-event-property-builder function buildes out new instances of 
CfnDetectorModel$TransitionEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `eventName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-name` |
| `nextState` | java.lang.String | [[cdk.support/lookup-entry]] | `:next-state` |"
  [stack id config]
  (let [builder (CfnDetectorModel$TransitionEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :event-name)]
      (. builder eventName data))
    (when-let [data (lookup-entry config id :next-state)]
      (. builder nextState data))
    (.build builder)))


(defn cfn-input-attribute-property-builder
  "The cfn-input-attribute-property-builder function buildes out new instances of 
CfnInput$AttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |"
  [stack id config]
  (let [builder (CfnInput$AttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :json-path)]
      (. builder jsonPath data))
    (.build builder)))


(defn cfn-input-builder
  "The cfn-input-builder function buildes out new instances of 
CfnInput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-definition` |
| `inputDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-description` |
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInput$Builder/create stack id)]
    (when-let [data (lookup-entry config id :input-definition)]
      (. builder inputDefinition data))
    (when-let [data (lookup-entry config id :input-description)]
      (. builder inputDescription data))
    (when-let [data (lookup-entry config id :input-name)]
      (. builder inputName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-input-input-definition-property-builder
  "The cfn-input-input-definition-property-builder function buildes out new instances of 
CfnInput$InputDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |"
  [stack id config]
  (let [builder (CfnInput$InputDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (.build builder)))


(defn cfn-input-props-builder
  "The cfn-input-props-builder function buildes out new instances of 
CfnInputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-definition` |
| `inputDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-description` |
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInputProps$Builder.)]
    (when-let [data (lookup-entry config id :input-definition)]
      (. builder inputDefinition data))
    (when-let [data (lookup-entry config id :input-description)]
      (. builder inputDescription data))
    (when-let [data (lookup-entry config id :input-name)]
      (. builder inputName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))