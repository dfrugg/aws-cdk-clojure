(ns cdk.api.services.lambda.eventsources
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.eventsources package. "
  (:require [cdk.api.services.apigateway :refer [authorization-type]]
            [cdk.api.services.lambda :refer [starting-position]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.dynamodb ITable]
           [software.amazon.awscdk.services.kinesis IStream]
           [software.amazon.awscdk.services.lambda.eventsources ApiEventSource$Builder
                                                                AuthenticationMethod
                                                                BaseStreamEventSourceProps$Builder
                                                                DynamoEventSource$Builder
                                                                DynamoEventSourceProps$Builder
                                                                KafkaEventSourceProps$Builder
                                                                KinesisEventSource$Builder
                                                                KinesisEventSourceProps$Builder
                                                                ManagedKafkaEventSource$Builder
                                                                ManagedKafkaEventSourceProps$Builder
                                                                S3EventSource$Builder
                                                                S3EventSourceProps$Builder
                                                                S3EventSourceV2$Builder
                                                                SelfManagedKafkaEventSource$Builder
                                                                SelfManagedKafkaEventSourceProps$Builder
                                                                SnsEventSource$Builder
                                                                SnsEventSourceProps$Builder
                                                                SqsEventSource$Builder
                                                                SqsEventSourceProps$Builder
                                                                StreamEventSourceProps$Builder]
           [software.amazon.awscdk.services.s3 Bucket
                                               IBucket]
           [software.amazon.awscdk.services.sns ITopic]
           [software.amazon.awscdk.services.sqs IQueue]))


(defn authentication-method
  "The `authentication-method` function data interprets values in the provided config data into a 
`AuthenticationMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AuthenticationMethod` - the value is returned.
* is `:client-certificate-tls-auth` - `AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH` is returned
* is `:sasl-scram-512-auth` - `AuthenticationMethod/SASL_SCRAM_512_AUTH` is returned
* is `:basic-auth` - `AuthenticationMethod/BASIC_AUTH` is returned
* is `:sasl-scram-256-auth` - `AuthenticationMethod/SASL_SCRAM_256_AUTH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AuthenticationMethod data) data
      (= :client-certificate-tls-auth data) AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH
      (= :sasl-scram-512-auth data) AuthenticationMethod/SASL_SCRAM_512_AUTH
      (= :basic-auth data) AuthenticationMethod/BASIC_AUTH
      (= :sasl-scram-256-auth data) AuthenticationMethod/SASL_SCRAM_256_AUTH)))


(defn api-event-source-builder>
  "The api-event-source-builder> function updates a ApiEventSource$Builder instance using the provided configuration.
  The function takes the ApiEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:api-key-required` |
| `authorizationScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:authorization-scopes` |
| `authorizationType` | software.amazon.awscdk.services.apigateway.AuthorizationType | [[cdk.api.services.apigateway/authorization-type]] | `:authorization-type` |
| `authorizer` | software.amazon.awscdk.services.apigateway.IAuthorizer | [[cdk.support/lookup-entry]] | `:authorizer` |
| `methodResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:method-responses` |
| `operationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-name` |
| `requestModels` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-models` |
| `requestParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:request-parameters` |
| `requestValidator` | software.amazon.awscdk.services.apigateway.IRequestValidator | [[cdk.support/lookup-entry]] | `:request-validator` |
| `requestValidatorOptions` | software.amazon.awscdk.services.apigateway.RequestValidatorOptions | [[cdk.support/lookup-entry]] | `:request-validator-options` |
"
  [^ApiEventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-some [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-some [data (authorization-type config id :authorization-type)]
    (. builder authorizationType data))
  (when-some [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-some [data (lookup-entry config id :method-responses)]
    (. builder methodResponses data))
  (when-some [data (lookup-entry config id :operation-name)]
    (. builder operationName data))
  (when-some [data (lookup-entry config id :request-models)]
    (. builder requestModels data))
  (when-some [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-some [data (lookup-entry config id :request-validator)]
    (. builder requestValidator data))
  (when-some [data (lookup-entry config id :request-validator-options)]
    (. builder requestValidatorOptions data))
  (.build builder))


(defn api-event-source-builder
  "Creates a  `ApiEventSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.String java.lang.String]___

| Argument | DataType | Description |
|---|---|---|
| `method` | java.lang.String |  |
| `path` | java.lang.String |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^String method ^String path id config]
  (api-event-source-builder> (ApiEventSource$Builder/create method path) id config))


(defn base-stream-event-source-props-builder>
  "The base-stream-event-source-props-builder> function updates a BaseStreamEventSourceProps$Builder instance using the provided configuration.
  The function takes the BaseStreamEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
"
  [^BaseStreamEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (.build builder))


(defn base-stream-event-source-props-builder
  "Creates a  `BaseStreamEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[base-stream-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (base-stream-event-source-props-builder> (new BaseStreamEventSourceProps$Builder) id config))


(defn dynamo-event-source-builder>
  "The dynamo-event-source-builder> function updates a DynamoEventSource$Builder instance using the provided configuration.
  The function takes the DynamoEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^DynamoEventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn dynamo-event-source-builder
  "Creates a  `DynamoEventSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.dynamodb.ITable]___

| Argument | DataType | Description |
|---|---|---|
| `table` | software.amazon.awscdk.services.dynamodb.ITable |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^ITable table id config]
  (dynamo-event-source-builder> (DynamoEventSource$Builder/create table) id config))


(defn dynamo-event-source-props-builder>
  "The dynamo-event-source-props-builder> function updates a DynamoEventSourceProps$Builder instance using the provided configuration.
  The function takes the DynamoEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^DynamoEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn dynamo-event-source-props-builder
  "Creates a  `DynamoEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[dynamo-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (dynamo-event-source-props-builder> (new DynamoEventSourceProps$Builder) id config))


(defn kafka-event-source-props-builder>
  "The kafka-event-source-props-builder> function updates a KafkaEventSourceProps$Builder instance using the provided configuration.
  The function takes the KafkaEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^KafkaEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn kafka-event-source-props-builder
  "Creates a  `KafkaEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kafka-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kafka-event-source-props-builder> (new KafkaEventSourceProps$Builder) id config))


(defn kinesis-event-source-builder>
  "The kinesis-event-source-builder> function updates a KinesisEventSource$Builder instance using the provided configuration.
  The function takes the KinesisEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^KinesisEventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-some [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn kinesis-event-source-builder
  "Creates a  `KinesisEventSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.kinesis.IStream]___

| Argument | DataType | Description |
|---|---|---|
| `stream` | software.amazon.awscdk.services.kinesis.IStream |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IStream stream id config]
  (kinesis-event-source-builder> (KinesisEventSource$Builder/create stream) id config))


(defn kinesis-event-source-props-builder>
  "The kinesis-event-source-props-builder> function updates a KinesisEventSourceProps$Builder instance using the provided configuration.
  The function takes the KinesisEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^KinesisEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-some [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn kinesis-event-source-props-builder
  "Creates a  `KinesisEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kinesis-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kinesis-event-source-props-builder> (new KinesisEventSourceProps$Builder) id config))


(defn managed-kafka-event-source-builder>
  "The managed-kafka-event-source-builder> function updates a ManagedKafkaEventSource$Builder instance using the provided configuration.
  The function takes the ManagedKafkaEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^ManagedKafkaEventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn managed-kafka-event-source-builder
  "Creates a  `ManagedKafkaEventSource$Builder` instance using a no-argument create, applies the data configuration using the [[managed-kafka-event-source-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (managed-kafka-event-source-builder> (ManagedKafkaEventSource$Builder/create) id config))


(defn managed-kafka-event-source-props-builder>
  "The managed-kafka-event-source-props-builder> function updates a ManagedKafkaEventSourceProps$Builder instance using the provided configuration.
  The function takes the ManagedKafkaEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^ManagedKafkaEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn managed-kafka-event-source-props-builder
  "Creates a  `ManagedKafkaEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[managed-kafka-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (managed-kafka-event-source-props-builder> (new ManagedKafkaEventSourceProps$Builder) id config))


(defn s3-event-source-builder>
  "The s3-event-source-builder> function updates a S3EventSource$Builder instance using the provided configuration.
  The function takes the S3EventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^S3EventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn s3-event-source-builder
  "Creates a  `S3EventSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.s3.Bucket]___

| Argument | DataType | Description |
|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.Bucket |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^Bucket bucket id config]
  (s3-event-source-builder> (S3EventSource$Builder/create bucket) id config))


(defn s3-event-source-props-builder>
  "The s3-event-source-props-builder> function updates a S3EventSourceProps$Builder instance using the provided configuration.
  The function takes the S3EventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^S3EventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn s3-event-source-props-builder
  "Creates a  `S3EventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[s3-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (s3-event-source-props-builder> (new S3EventSourceProps$Builder) id config))


(defn s3-event-source-v2-builder>
  "The s3-event-source-v2-builder> function updates a S3EventSourceV2$Builder instance using the provided configuration.
  The function takes the S3EventSourceV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^S3EventSourceV2$Builder builder id config]
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn s3-event-source-v2-builder
  "Creates a  `S3EventSourceV2$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.s3.IBucket]___

| Argument | DataType | Description |
|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IBucket bucket id config]
  (s3-event-source-v2-builder> (S3EventSourceV2$Builder/create bucket) id config))


(defn self-managed-kafka-event-source-builder>
  "The self-managed-kafka-event-source-builder> function updates a SelfManagedKafkaEventSource$Builder instance using the provided configuration.
  The function takes the SelfManagedKafkaEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationMethod` | software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod | [[cdk.api.services.lambda.eventsources/authentication-method]] | `:authentication-method` |
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:bootstrap-servers` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `rootCaCertificate` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:root-ca-certificate` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SelfManagedKafkaEventSource$Builder builder id config]
  (when-some [data (authentication-method config id :authentication-method)]
    (. builder authenticationMethod data))
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bootstrap-servers)]
    (. builder bootstrapServers data))
  (when-some [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :root-ca-certificate)]
    (. builder rootCaCertificate data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn self-managed-kafka-event-source-builder
  "Creates a  `SelfManagedKafkaEventSource$Builder` instance using a no-argument create, applies the data configuration using the [[self-managed-kafka-event-source-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (self-managed-kafka-event-source-builder> (SelfManagedKafkaEventSource$Builder/create) id config))


(defn self-managed-kafka-event-source-props-builder>
  "The self-managed-kafka-event-source-props-builder> function updates a SelfManagedKafkaEventSourceProps$Builder instance using the provided configuration.
  The function takes the SelfManagedKafkaEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationMethod` | software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod | [[cdk.api.services.lambda.eventsources/authentication-method]] | `:authentication-method` |
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:bootstrap-servers` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `rootCaCertificate` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:root-ca-certificate` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SelfManagedKafkaEventSourceProps$Builder builder id config]
  (when-some [data (authentication-method config id :authentication-method)]
    (. builder authenticationMethod data))
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bootstrap-servers)]
    (. builder bootstrapServers data))
  (when-some [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :root-ca-certificate)]
    (. builder rootCaCertificate data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn self-managed-kafka-event-source-props-builder
  "Creates a  `SelfManagedKafkaEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[self-managed-kafka-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (self-managed-kafka-event-source-props-builder> (new SelfManagedKafkaEventSourceProps$Builder) id config))


(defn sns-event-source-builder>
  "The sns-event-source-builder> function updates a SnsEventSource$Builder instance using the provided configuration.
  The function takes the SnsEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^SnsEventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-some [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn sns-event-source-builder
  "Creates a  `SnsEventSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.sns.ITopic]___

| Argument | DataType | Description |
|---|---|---|
| `topic` | software.amazon.awscdk.services.sns.ITopic |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^ITopic topic id config]
  (sns-event-source-builder> (SnsEventSource$Builder/create topic) id config))


(defn sns-event-source-props-builder>
  "The sns-event-source-props-builder> function updates a SnsEventSourceProps$Builder instance using the provided configuration.
  The function takes the SnsEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^SnsEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-some [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn sns-event-source-props-builder
  "Creates a  `SnsEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sns-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sns-event-source-props-builder> (new SnsEventSourceProps$Builder) id config))


(defn sqs-event-source-builder>
  "The sqs-event-source-builder> function updates a SqsEventSource$Builder instance using the provided configuration.
  The function takes the SqsEventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
"
  [^SqsEventSource$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (.build builder))


(defn sqs-event-source-builder
  "Creates a  `SqsEventSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.sqs.IQueue]___

| Argument | DataType | Description |
|---|---|---|
| `queue` | software.amazon.awscdk.services.sqs.IQueue |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IQueue queue id config]
  (sqs-event-source-builder> (SqsEventSource$Builder/create queue) id config))


(defn sqs-event-source-props-builder>
  "The sqs-event-source-props-builder> function updates a SqsEventSourceProps$Builder instance using the provided configuration.
  The function takes the SqsEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
"
  [^SqsEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (.build builder))


(defn sqs-event-source-props-builder
  "Creates a  `SqsEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sqs-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sqs-event-source-props-builder> (new SqsEventSourceProps$Builder) id config))


(defn stream-event-source-props-builder>
  "The stream-event-source-props-builder> function updates a StreamEventSourceProps$Builder instance using the provided configuration.
  The function takes the StreamEventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `bisectBatchOnError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bisect-batch-on-error` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxRecordAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-record-age` |
| `onFailure` | software.amazon.awscdk.services.lambda.IEventSourceDlq | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |
"
  [^StreamEventSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-some [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-some [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-some [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn stream-event-source-props-builder
  "Creates a  `StreamEventSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[stream-event-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (stream-event-source-props-builder> (new StreamEventSourceProps$Builder) id config))