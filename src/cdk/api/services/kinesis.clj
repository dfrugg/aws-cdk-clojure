(ns cdk.api.services.kinesis
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesis package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesis CfnStream$Builder
                                                    CfnStream$StreamEncryptionProperty$Builder
                                                    CfnStream$StreamModeDetailsProperty$Builder
                                                    CfnStreamConsumer$Builder
                                                    CfnStreamConsumerProps$Builder
                                                    CfnStreamProps$Builder
                                                    Stream$Builder
                                                    StreamAttributes$Builder
                                                    StreamEncryption
                                                    StreamMode
                                                    StreamProps$Builder]))


(defn stream-encryption
  "The `stream-encryption` function data interprets values in the provided config data into a 
`StreamEncryption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StreamEncryption` - the value is returned.
* is `:kms` - `StreamEncryption/KMS` is returned
* is `:unencrypted` - `StreamEncryption/UNENCRYPTED` is returned
* is `:managed` - `StreamEncryption/MANAGED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StreamEncryption data) data
      (= :kms data) StreamEncryption/KMS
      (= :unencrypted data) StreamEncryption/UNENCRYPTED
      (= :managed data) StreamEncryption/MANAGED)))


(defn stream-mode
  "The `stream-mode` function data interprets values in the provided config data into a 
`StreamMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StreamMode` - the value is returned.
* is `:provisioned` - `StreamMode/PROVISIONED` is returned
* is `:on-demand` - `StreamMode/ON_DEMAND` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StreamMode data) data
      (= :provisioned data) StreamMode/PROVISIONED
      (= :on-demand data) StreamMode/ON_DEMAND)))


(defn cfn-stream-builder
  "The cfn-stream-builder function buildes out new instances of 
CfnStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retentionPeriodHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period-hours` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamEncryption` | software.amazon.awscdk.services.kinesis.CfnStream$StreamEncryptionProperty | [[cdk.support/lookup-entry]] | `:stream-encryption` |
| `streamModeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-mode-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retention-period-hours)]
      (. builder retentionPeriodHours data))
    (when-let [data (lookup-entry config id :shard-count)]
      (. builder shardCount data))
    (when-let [data (lookup-entry config id :stream-encryption)]
      (. builder streamEncryption data))
    (when-let [data (lookup-entry config id :stream-mode-details)]
      (. builder streamModeDetails data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-consumer-builder
  "The cfn-stream-consumer-builder function buildes out new instances of 
CfnStreamConsumer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-name` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnStreamConsumer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :consumer-name)]
      (. builder consumerName data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-stream-consumer-props-builder
  "The cfn-stream-consumer-props-builder function buildes out new instances of 
CfnStreamConsumerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-name` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnStreamConsumerProps$Builder.)]
    (when-let [data (lookup-entry config id :consumer-name)]
      (. builder consumerName data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-stream-props-builder
  "The cfn-stream-props-builder function buildes out new instances of 
CfnStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retentionPeriodHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period-hours` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamEncryption` | software.amazon.awscdk.services.kinesis.CfnStream$StreamEncryptionProperty | [[cdk.support/lookup-entry]] | `:stream-encryption` |
| `streamModeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-mode-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retention-period-hours)]
      (. builder retentionPeriodHours data))
    (when-let [data (lookup-entry config id :shard-count)]
      (. builder shardCount data))
    (when-let [data (lookup-entry config id :stream-encryption)]
      (. builder streamEncryption data))
    (when-let [data (lookup-entry config id :stream-mode-details)]
      (. builder streamModeDetails data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-stream-encryption-property-builder
  "The cfn-stream-stream-encryption-property-builder function buildes out new instances of 
CfnStream$StreamEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |"
  [stack id config]
  (let [builder (CfnStream$StreamEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-type)]
      (. builder encryptionType data))
    (when-let [data (lookup-entry config id :key-id)]
      (. builder keyId data))
    (.build builder)))


(defn cfn-stream-stream-mode-details-property-builder
  "The cfn-stream-stream-mode-details-property-builder function buildes out new instances of 
CfnStream$StreamModeDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-mode` |"
  [stack id config]
  (let [builder (CfnStream$StreamModeDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :stream-mode)]
      (. builder streamMode data))
    (.build builder)))


(defn stream-attributes-builder
  "The stream-attributes-builder function buildes out new instances of 
StreamAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (StreamAttributes$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn stream-builder
  "The stream-builder function buildes out new instances of 
Stream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.services.kinesis.StreamEncryption | [[cdk.api.services.kinesis/stream-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamMode` | software.amazon.awscdk.services.kinesis.StreamMode | [[cdk.api.services.kinesis/stream-mode]] | `:stream-mode` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |"
  [stack id config]
  (let [builder (Stream$Builder/create stack id)]
    (when-let [data (stream-encryption config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :shard-count)]
      (. builder shardCount data))
    (when-let [data (stream-mode config id :stream-mode)]
      (. builder streamMode data))
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (.build builder)))


(defn stream-props-builder
  "The stream-props-builder function buildes out new instances of 
StreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.services.kinesis.StreamEncryption | [[cdk.api.services.kinesis/stream-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamMode` | software.amazon.awscdk.services.kinesis.StreamMode | [[cdk.api.services.kinesis/stream-mode]] | `:stream-mode` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |"
  [stack id config]
  (let [builder (StreamProps$Builder.)]
    (when-let [data (stream-encryption config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :shard-count)]
      (. builder shardCount data))
    (when-let [data (stream-mode config id :stream-mode)]
      (. builder streamMode data))
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (.build builder)))