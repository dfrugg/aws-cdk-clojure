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


(defn cfn-stream-builder>
  "The cfn-stream-builder> function updates a CfnStream$Builder instance using the provided configuration.
  The function takes the CfnStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retentionPeriodHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period-hours` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamEncryption` | software.amazon.awscdk.services.kinesis.CfnStream$StreamEncryptionProperty | [[cdk.support/lookup-entry]] | `:stream-encryption` |
| `streamModeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-mode-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStream$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retention-period-hours)]
    (. builder retentionPeriodHours data))
  (when-some [data (lookup-entry config id :shard-count)]
    (. builder shardCount data))
  (when-some [data (lookup-entry config id :stream-encryption)]
    (. builder streamEncryption data))
  (when-some [data (lookup-entry config id :stream-mode-details)]
    (. builder streamModeDetails data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-builder
  "Creates a  `CfnStream$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stream-builder> (CfnStream$Builder/create scope (name id)) id config))


(defn cfn-stream-consumer-builder>
  "The cfn-stream-consumer-builder> function updates a CfnStreamConsumer$Builder instance using the provided configuration.
  The function takes the CfnStreamConsumer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-name` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^CfnStreamConsumer$Builder builder id config]
  (when-some [data (lookup-entry config id :consumer-name)]
    (. builder consumerName data))
  (when-some [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn cfn-stream-consumer-builder
  "Creates a  `CfnStreamConsumer$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stream-consumer-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stream-consumer-builder> (CfnStreamConsumer$Builder/create scope (name id)) id config))


(defn cfn-stream-consumer-props-builder>
  "The cfn-stream-consumer-props-builder> function updates a CfnStreamConsumerProps$Builder instance using the provided configuration.
  The function takes the CfnStreamConsumerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-name` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^CfnStreamConsumerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :consumer-name)]
    (. builder consumerName data))
  (when-some [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn cfn-stream-consumer-props-builder
  "Creates a  `CfnStreamConsumerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stream-consumer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stream-consumer-props-builder> (new CfnStreamConsumerProps$Builder) id config))


(defn cfn-stream-props-builder>
  "The cfn-stream-props-builder> function updates a CfnStreamProps$Builder instance using the provided configuration.
  The function takes the CfnStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retentionPeriodHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period-hours` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamEncryption` | software.amazon.awscdk.services.kinesis.CfnStream$StreamEncryptionProperty | [[cdk.support/lookup-entry]] | `:stream-encryption` |
| `streamModeDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-mode-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retention-period-hours)]
    (. builder retentionPeriodHours data))
  (when-some [data (lookup-entry config id :shard-count)]
    (. builder shardCount data))
  (when-some [data (lookup-entry config id :stream-encryption)]
    (. builder streamEncryption data))
  (when-some [data (lookup-entry config id :stream-mode-details)]
    (. builder streamModeDetails data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-props-builder
  "Creates a  `CfnStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stream-props-builder> (new CfnStreamProps$Builder) id config))


(defn cfn-stream-stream-encryption-property-builder>
  "The cfn-stream-stream-encryption-property-builder> function updates a CfnStream$StreamEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnStream$StreamEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
"
  [^CfnStream$StreamEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (when-some [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (.build builder))


(defn cfn-stream-stream-encryption-property-builder
  "Creates a  `CfnStream$StreamEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stream-stream-encryption-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stream-stream-encryption-property-builder> (new CfnStream$StreamEncryptionProperty$Builder) id config))


(defn cfn-stream-stream-mode-details-property-builder>
  "The cfn-stream-stream-mode-details-property-builder> function updates a CfnStream$StreamModeDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnStream$StreamModeDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-mode` |
"
  [^CfnStream$StreamModeDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :stream-mode)]
    (. builder streamMode data))
  (.build builder))


(defn cfn-stream-stream-mode-details-property-builder
  "Creates a  `CfnStream$StreamModeDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stream-stream-mode-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stream-stream-mode-details-property-builder> (new CfnStream$StreamModeDetailsProperty$Builder) id config))


(defn stream-attributes-builder>
  "The stream-attributes-builder> function updates a StreamAttributes$Builder instance using the provided configuration.
  The function takes the StreamAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^StreamAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn stream-attributes-builder
  "Creates a  `StreamAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[stream-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stream-attributes-builder> (new StreamAttributes$Builder) id config))


(defn stream-builder>
  "The stream-builder> function updates a Stream$Builder instance using the provided configuration.
  The function takes the Stream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.services.kinesis.StreamEncryption | [[cdk.api.services.kinesis/stream-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamMode` | software.amazon.awscdk.services.kinesis.StreamMode | [[cdk.api.services.kinesis/stream-mode]] | `:stream-mode` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^Stream$Builder builder id config]
  (when-some [data (stream-encryption config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :shard-count)]
    (. builder shardCount data))
  (when-some [data (stream-mode config id :stream-mode)]
    (. builder streamMode data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn stream-builder
  "Creates a  `Stream$Builder` instance using a scope and ID, applies the data configuration using the [[stream-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (stream-builder> (Stream$Builder/create scope (name id)) id config))


(defn stream-props-builder>
  "The stream-props-builder> function updates a StreamProps$Builder instance using the provided configuration.
  The function takes the StreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.services.kinesis.StreamEncryption | [[cdk.api.services.kinesis/stream-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `streamMode` | software.amazon.awscdk.services.kinesis.StreamMode | [[cdk.api.services.kinesis/stream-mode]] | `:stream-mode` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^StreamProps$Builder builder id config]
  (when-some [data (stream-encryption config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :shard-count)]
    (. builder shardCount data))
  (when-some [data (stream-mode config id :stream-mode)]
    (. builder streamMode data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn stream-props-builder
  "Creates a  `StreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stream-props-builder> (new StreamProps$Builder) id config))