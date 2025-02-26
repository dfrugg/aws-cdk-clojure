(ns cdk.api.services.sqs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sqs package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sqs CfnQueue$Builder
                                                CfnQueueInlinePolicy$Builder
                                                CfnQueueInlinePolicyProps$Builder
                                                CfnQueuePolicy$Builder
                                                CfnQueuePolicyProps$Builder
                                                CfnQueueProps$Builder
                                                DeadLetterQueue$Builder
                                                DeduplicationScope
                                                FifoThroughputLimit
                                                Queue$Builder
                                                QueueAttributes$Builder
                                                QueueEncryption
                                                QueuePolicy$Builder
                                                QueuePolicyProps$Builder
                                                QueueProps$Builder
                                                RedriveAllowPolicy$Builder
                                                RedrivePermission]))


(defn deduplication-scope
  "The `deduplication-scope` function data interprets values in the provided config data into a 
`DeduplicationScope` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DeduplicationScope` - the value is returned.
* is `:message-group` - `DeduplicationScope/MESSAGE_GROUP` is returned
* is `:queue` - `DeduplicationScope/QUEUE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DeduplicationScope data) data
      (= :message-group data) DeduplicationScope/MESSAGE_GROUP
      (= :queue data) DeduplicationScope/QUEUE)))


(defn fifo-throughput-limit
  "The `fifo-throughput-limit` function data interprets values in the provided config data into a 
`FifoThroughputLimit` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FifoThroughputLimit` - the value is returned.
* is `:per-queue` - `FifoThroughputLimit/PER_QUEUE` is returned
* is `:per-message-group-id` - `FifoThroughputLimit/PER_MESSAGE_GROUP_ID` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FifoThroughputLimit data) data
      (= :per-queue data) FifoThroughputLimit/PER_QUEUE
      (= :per-message-group-id data) FifoThroughputLimit/PER_MESSAGE_GROUP_ID)))


(defn queue-encryption
  "The `queue-encryption` function data interprets values in the provided config data into a 
`QueueEncryption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `QueueEncryption` - the value is returned.
* is `:unencrypted` - `QueueEncryption/UNENCRYPTED` is returned
* is `:kms` - `QueueEncryption/KMS` is returned
* is `:sqs-managed` - `QueueEncryption/SQS_MANAGED` is returned
* is `:kms-managed` - `QueueEncryption/KMS_MANAGED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? QueueEncryption data) data
      (= :unencrypted data) QueueEncryption/UNENCRYPTED
      (= :kms data) QueueEncryption/KMS
      (= :sqs-managed data) QueueEncryption/SQS_MANAGED
      (= :kms-managed data) QueueEncryption/KMS_MANAGED)))


(defn redrive-permission
  "The `redrive-permission` function data interprets values in the provided config data into a 
`RedrivePermission` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RedrivePermission` - the value is returned.
* is `:by-queue` - `RedrivePermission/BY_QUEUE` is returned
* is `:allow-all` - `RedrivePermission/ALLOW_ALL` is returned
* is `:deny-all` - `RedrivePermission/DENY_ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RedrivePermission data) data
      (= :by-queue data) RedrivePermission/BY_QUEUE
      (= :allow-all data) RedrivePermission/ALLOW_ALL
      (= :deny-all data) RedrivePermission/DENY_ALL)))


(defn build-cfn-queue-builder
  "The build-cfn-queue-builder function updates a CfnQueue$Builder instance using the provided configuration.
  The function takes the CfnQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `deduplicationScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:deduplication-scope` |
| `delaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delay-seconds` |
| `fifoQueue` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo-queue` |
| `fifoThroughputLimit` | java.lang.String | [[cdk.support/lookup-entry]] | `:fifo-throughput-limit` |
| `kmsDataKeyReusePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:kms-data-key-reuse-period-seconds` |
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |
| `maximumMessageSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-size` |
| `messageRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-retention-period` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `receiveMessageWaitTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:receive-message-wait-time-seconds` |
| `redriveAllowPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:redrive-allow-policy` |
| `redrivePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:redrive-policy` |
| `sqsManagedSseEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-managed-sse-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visibilityTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
"
  [^CfnQueue$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :deduplication-scope)]
    (. builder deduplicationScope data))
  (when-let [data (lookup-entry config id :delay-seconds)]
    (. builder delaySeconds data))
  (when-let [data (lookup-entry config id :fifo-queue)]
    (. builder fifoQueue data))
  (when-let [data (lookup-entry config id :fifo-throughput-limit)]
    (. builder fifoThroughputLimit data))
  (when-let [data (lookup-entry config id :kms-data-key-reuse-period-seconds)]
    (. builder kmsDataKeyReusePeriodSeconds data))
  (when-let [data (lookup-entry config id :kms-master-key-id)]
    (. builder kmsMasterKeyId data))
  (when-let [data (lookup-entry config id :maximum-message-size)]
    (. builder maximumMessageSize data))
  (when-let [data (lookup-entry config id :message-retention-period)]
    (. builder messageRetentionPeriod data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (when-let [data (lookup-entry config id :receive-message-wait-time-seconds)]
    (. builder receiveMessageWaitTimeSeconds data))
  (when-let [data (lookup-entry config id :redrive-allow-policy)]
    (. builder redriveAllowPolicy data))
  (when-let [data (lookup-entry config id :redrive-policy)]
    (. builder redrivePolicy data))
  (when-let [data (lookup-entry config id :sqs-managed-sse-enabled)]
    (. builder sqsManagedSseEnabled data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (.build builder))


(defn cfn-queue-builder
  "Creates a  `CfnQueue$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-queue-builder (CfnQueue$Builder/create scope (name id)) id config))


(defn build-cfn-queue-inline-policy-builder
  "The build-cfn-queue-inline-policy-builder function updates a CfnQueueInlinePolicy$Builder instance using the provided configuration.
  The function takes the CfnQueueInlinePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
"
  [^CfnQueueInlinePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :queue)]
    (. builder queue data))
  (.build builder))


(defn cfn-queue-inline-policy-builder
  "Creates a  `CfnQueueInlinePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-queue-inline-policy-builder (CfnQueueInlinePolicy$Builder/create scope (name id)) id config))


(defn build-cfn-queue-inline-policy-props-builder
  "The build-cfn-queue-inline-policy-props-builder function updates a CfnQueueInlinePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnQueueInlinePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
"
  [^CfnQueueInlinePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :queue)]
    (. builder queue data))
  (.build builder))


(defn cfn-queue-inline-policy-props-builder
  "Creates a  `CfnQueueInlinePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-queue-inline-policy-props-builder (new CfnQueueInlinePolicyProps$Builder) id config))


(defn build-cfn-queue-policy-builder
  "The build-cfn-queue-policy-builder function updates a CfnQueuePolicy$Builder instance using the provided configuration.
  The function takes the CfnQueuePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `queues` | java.util.List | [[cdk.support/lookup-entry]] | `:queues` |
"
  [^CfnQueuePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :queues)]
    (. builder queues data))
  (.build builder))


(defn cfn-queue-policy-builder
  "Creates a  `CfnQueuePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-queue-policy-builder (CfnQueuePolicy$Builder/create scope (name id)) id config))


(defn build-cfn-queue-policy-props-builder
  "The build-cfn-queue-policy-props-builder function updates a CfnQueuePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnQueuePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `queues` | java.util.List | [[cdk.support/lookup-entry]] | `:queues` |
"
  [^CfnQueuePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :queues)]
    (. builder queues data))
  (.build builder))


(defn cfn-queue-policy-props-builder
  "Creates a  `CfnQueuePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-queue-policy-props-builder (new CfnQueuePolicyProps$Builder) id config))


(defn build-cfn-queue-props-builder
  "The build-cfn-queue-props-builder function updates a CfnQueueProps$Builder instance using the provided configuration.
  The function takes the CfnQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `deduplicationScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:deduplication-scope` |
| `delaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delay-seconds` |
| `fifoQueue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fifo-queue` |
| `fifoThroughputLimit` | java.lang.String | [[cdk.support/lookup-entry]] | `:fifo-throughput-limit` |
| `kmsDataKeyReusePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:kms-data-key-reuse-period-seconds` |
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |
| `maximumMessageSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-size` |
| `messageRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-retention-period` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `receiveMessageWaitTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:receive-message-wait-time-seconds` |
| `redriveAllowPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:redrive-allow-policy` |
| `redrivePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:redrive-policy` |
| `sqsManagedSseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sqs-managed-sse-enabled` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visibilityTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
"
  [^CfnQueueProps$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :deduplication-scope)]
    (. builder deduplicationScope data))
  (when-let [data (lookup-entry config id :delay-seconds)]
    (. builder delaySeconds data))
  (when-let [data (lookup-entry config id :fifo-queue)]
    (. builder fifoQueue data))
  (when-let [data (lookup-entry config id :fifo-throughput-limit)]
    (. builder fifoThroughputLimit data))
  (when-let [data (lookup-entry config id :kms-data-key-reuse-period-seconds)]
    (. builder kmsDataKeyReusePeriodSeconds data))
  (when-let [data (lookup-entry config id :kms-master-key-id)]
    (. builder kmsMasterKeyId data))
  (when-let [data (lookup-entry config id :maximum-message-size)]
    (. builder maximumMessageSize data))
  (when-let [data (lookup-entry config id :message-retention-period)]
    (. builder messageRetentionPeriod data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (when-let [data (lookup-entry config id :receive-message-wait-time-seconds)]
    (. builder receiveMessageWaitTimeSeconds data))
  (when-let [data (lookup-entry config id :redrive-allow-policy)]
    (. builder redriveAllowPolicy data))
  (when-let [data (lookup-entry config id :redrive-policy)]
    (. builder redrivePolicy data))
  (when-let [data (lookup-entry config id :sqs-managed-sse-enabled)]
    (. builder sqsManagedSseEnabled data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (.build builder))


(defn cfn-queue-props-builder
  "Creates a  `CfnQueueProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-queue-props-builder (new CfnQueueProps$Builder) id config))


(defn build-dead-letter-queue-builder
  "The build-dead-letter-queue-builder function updates a DeadLetterQueue$Builder instance using the provided configuration.
  The function takes the DeadLetterQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxReceiveCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-receive-count` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
"
  [^DeadLetterQueue$Builder builder id config]
  (when-let [data (lookup-entry config id :max-receive-count)]
    (. builder maxReceiveCount data))
  (when-let [data (lookup-entry config id :queue)]
    (. builder queue data))
  (.build builder))


(defn dead-letter-queue-builder
  "Creates a  `DeadLetterQueue$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dead-letter-queue-builder (new DeadLetterQueue$Builder) id config))


(defn build-queue-attributes-builder
  "The build-queue-attributes-builder function updates a QueueAttributes$Builder instance using the provided configuration.
  The function takes the QueueAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fifo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo` |
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `queueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-arn` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
"
  [^QueueAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :fifo)]
    (. builder fifo data))
  (when-let [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-let [data (lookup-entry config id :queue-arn)]
    (. builder queueArn data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (when-let [data (lookup-entry config id :queue-url)]
    (. builder queueUrl data))
  (.build builder))


(defn queue-attributes-builder
  "Creates a  `QueueAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-queue-attributes-builder (new QueueAttributes$Builder) id config))


(defn build-queue-builder
  "The build-queue-builder function updates a Queue$Builder instance using the provided configuration.
  The function takes the Queue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `dataKeyReuse` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:data-key-reuse` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.DeadLetterQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deduplicationScope` | software.amazon.awscdk.services.sqs.DeduplicationScope | [[cdk.api.services.sqs/deduplication-scope]] | `:deduplication-scope` |
| `deliveryDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delivery-delay` |
| `encryption` | software.amazon.awscdk.services.sqs.QueueEncryption | [[cdk.api.services.sqs/queue-encryption]] | `:encryption` |
| `encryptionMasterKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-master-key` |
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `fifo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo` |
| `fifoThroughputLimit` | software.amazon.awscdk.services.sqs.FifoThroughputLimit | [[cdk.api.services.sqs/fifo-throughput-limit]] | `:fifo-throughput-limit` |
| `maxMessageSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-message-size-bytes` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `receiveMessageWaitTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:receive-message-wait-time` |
| `redriveAllowPolicy` | software.amazon.awscdk.services.sqs.RedriveAllowPolicy | [[cdk.support/lookup-entry]] | `:redrive-allow-policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
"
  [^Queue$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :data-key-reuse)]
    (. builder dataKeyReuse data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (deduplication-scope config id :deduplication-scope)]
    (. builder deduplicationScope data))
  (when-let [data (lookup-entry config id :delivery-delay)]
    (. builder deliveryDelay data))
  (when-let [data (queue-encryption config id :encryption)]
    (. builder encryption data))
  (when-let [data (lookup-entry config id :encryption-master-key)]
    (. builder encryptionMasterKey data))
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :fifo)]
    (. builder fifo data))
  (when-let [data (fifo-throughput-limit config id :fifo-throughput-limit)]
    (. builder fifoThroughputLimit data))
  (when-let [data (lookup-entry config id :max-message-size-bytes)]
    (. builder maxMessageSizeBytes data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (when-let [data (lookup-entry config id :receive-message-wait-time)]
    (. builder receiveMessageWaitTime data))
  (when-let [data (lookup-entry config id :redrive-allow-policy)]
    (. builder redriveAllowPolicy data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-let [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (.build builder))


(defn queue-builder
  "Creates a  `Queue$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-queue-builder (Queue$Builder/create scope (name id)) id config))


(defn build-queue-policy-builder
  "The build-queue-policy-builder function updates a QueuePolicy$Builder instance using the provided configuration.
  The function takes the QueuePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queues` | java.util.List | [[cdk.support/lookup-entry]] | `:queues` |
"
  [^QueuePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :queues)]
    (. builder queues data))
  (.build builder))


(defn queue-policy-builder
  "Creates a  `QueuePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-queue-policy-builder (QueuePolicy$Builder/create scope (name id)) id config))


(defn build-queue-policy-props-builder
  "The build-queue-policy-props-builder function updates a QueuePolicyProps$Builder instance using the provided configuration.
  The function takes the QueuePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queues` | java.util.List | [[cdk.support/lookup-entry]] | `:queues` |
"
  [^QueuePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :queues)]
    (. builder queues data))
  (.build builder))


(defn queue-policy-props-builder
  "Creates a  `QueuePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-queue-policy-props-builder (new QueuePolicyProps$Builder) id config))


(defn build-queue-props-builder
  "The build-queue-props-builder function updates a QueueProps$Builder instance using the provided configuration.
  The function takes the QueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `dataKeyReuse` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:data-key-reuse` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.DeadLetterQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deduplicationScope` | software.amazon.awscdk.services.sqs.DeduplicationScope | [[cdk.api.services.sqs/deduplication-scope]] | `:deduplication-scope` |
| `deliveryDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delivery-delay` |
| `encryption` | software.amazon.awscdk.services.sqs.QueueEncryption | [[cdk.api.services.sqs/queue-encryption]] | `:encryption` |
| `encryptionMasterKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-master-key` |
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `fifo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo` |
| `fifoThroughputLimit` | software.amazon.awscdk.services.sqs.FifoThroughputLimit | [[cdk.api.services.sqs/fifo-throughput-limit]] | `:fifo-throughput-limit` |
| `maxMessageSizeBytes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-message-size-bytes` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `receiveMessageWaitTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:receive-message-wait-time` |
| `redriveAllowPolicy` | software.amazon.awscdk.services.sqs.RedriveAllowPolicy | [[cdk.support/lookup-entry]] | `:redrive-allow-policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
"
  [^QueueProps$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :data-key-reuse)]
    (. builder dataKeyReuse data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (deduplication-scope config id :deduplication-scope)]
    (. builder deduplicationScope data))
  (when-let [data (lookup-entry config id :delivery-delay)]
    (. builder deliveryDelay data))
  (when-let [data (queue-encryption config id :encryption)]
    (. builder encryption data))
  (when-let [data (lookup-entry config id :encryption-master-key)]
    (. builder encryptionMasterKey data))
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :fifo)]
    (. builder fifo data))
  (when-let [data (fifo-throughput-limit config id :fifo-throughput-limit)]
    (. builder fifoThroughputLimit data))
  (when-let [data (lookup-entry config id :max-message-size-bytes)]
    (. builder maxMessageSizeBytes data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (when-let [data (lookup-entry config id :receive-message-wait-time)]
    (. builder receiveMessageWaitTime data))
  (when-let [data (lookup-entry config id :redrive-allow-policy)]
    (. builder redriveAllowPolicy data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-let [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (.build builder))


(defn queue-props-builder
  "Creates a  `QueueProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-queue-props-builder (new QueueProps$Builder) id config))


(defn build-redrive-allow-policy-builder
  "The build-redrive-allow-policy-builder function updates a RedriveAllowPolicy$Builder instance using the provided configuration.
  The function takes the RedriveAllowPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `redrivePermission` | software.amazon.awscdk.services.sqs.RedrivePermission | [[cdk.api.services.sqs/redrive-permission]] | `:redrive-permission` |
| `sourceQueues` | java.util.List | [[cdk.support/lookup-entry]] | `:source-queues` |
"
  [^RedriveAllowPolicy$Builder builder id config]
  (when-let [data (redrive-permission config id :redrive-permission)]
    (. builder redrivePermission data))
  (when-let [data (lookup-entry config id :source-queues)]
    (. builder sourceQueues data))
  (.build builder))


(defn redrive-allow-policy-builder
  "Creates a  `RedriveAllowPolicy$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-redrive-allow-policy-builder (new RedriveAllowPolicy$Builder) id config))