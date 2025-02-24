(ns cdk.api.services.lambda.eventsources
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.eventsources package. "
  (:require [cdk.api.services.apigateway :refer [authorization-type]]
            [cdk.api.services.lambda :refer [starting-position]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lambda.eventsources ApiEventSource$Builder
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
                                                                StreamEventSourceProps$Builder]))


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


(defn build-api-event-source-builder
  "The build-api-event-source-builder function updates a ApiEventSource$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :api-key-required)]
    (. builder apiKeyRequired data))
  (when-let [data (lookup-entry config id :authorization-scopes)]
    (. builder authorizationScopes data))
  (when-let [data (authorization-type config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :authorizer)]
    (. builder authorizer data))
  (when-let [data (lookup-entry config id :method-responses)]
    (. builder methodResponses data))
  (when-let [data (lookup-entry config id :operation-name)]
    (. builder operationName data))
  (when-let [data (lookup-entry config id :request-models)]
    (. builder requestModels data))
  (when-let [data (lookup-entry config id :request-parameters)]
    (. builder requestParameters data))
  (when-let [data (lookup-entry config id :request-validator)]
    (. builder requestValidator data))
  (when-let [data (lookup-entry config id :request-validator-options)]
    (. builder requestValidatorOptions data))
  (.build builder))


(defn build-base-stream-event-source-props-builder
  "The build-base-stream-event-source-props-builder function updates a BaseStreamEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (.build builder))


(defn base-stream-event-source-props-builder
  ""
  [id config]
  (build-base-stream-event-source-props-builder (new BaseStreamEventSourceProps$Builder) id config))


(defn build-dynamo-event-source-builder
  "The build-dynamo-event-source-builder function updates a DynamoEventSource$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn build-dynamo-event-source-props-builder
  "The build-dynamo-event-source-props-builder function updates a DynamoEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn dynamo-event-source-props-builder
  ""
  [id config]
  (build-dynamo-event-source-props-builder (new DynamoEventSourceProps$Builder) id config))


(defn build-kafka-event-source-props-builder
  "The build-kafka-event-source-props-builder function updates a KafkaEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn kafka-event-source-props-builder
  ""
  [id config]
  (build-kafka-event-source-props-builder (new KafkaEventSourceProps$Builder) id config))


(defn build-kinesis-event-source-builder
  "The build-kinesis-event-source-builder function updates a KinesisEventSource$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn build-kinesis-event-source-props-builder
  "The build-kinesis-event-source-props-builder function updates a KinesisEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn kinesis-event-source-props-builder
  ""
  [id config]
  (build-kinesis-event-source-props-builder (new KinesisEventSourceProps$Builder) id config))


(defn build-managed-kafka-event-source-builder
  "The build-managed-kafka-event-source-builder function updates a ManagedKafkaEventSource$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn managed-kafka-event-source-builder
  ""
  [id config]
  (build-managed-kafka-event-source-builder (ManagedKafkaEventSource$Builder/create) id config))


(defn build-managed-kafka-event-source-props-builder
  "The build-managed-kafka-event-source-props-builder function updates a ManagedKafkaEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn managed-kafka-event-source-props-builder
  ""
  [id config]
  (build-managed-kafka-event-source-props-builder (new ManagedKafkaEventSourceProps$Builder) id config))


(defn build-s3-event-source-builder
  "The build-s3-event-source-builder function updates a S3EventSource$Builder instance using the provided configuration.
  The function takes the S3EventSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^S3EventSource$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn build-s3-event-source-props-builder
  "The build-s3-event-source-props-builder function updates a S3EventSourceProps$Builder instance using the provided configuration.
  The function takes the S3EventSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^S3EventSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn s3-event-source-props-builder
  ""
  [id config]
  (build-s3-event-source-props-builder (new S3EventSourceProps$Builder) id config))


(defn build-s3-event-source-v2-builder
  "The build-s3-event-source-v2-builder function updates a S3EventSourceV2$Builder instance using the provided configuration.
  The function takes the S3EventSourceV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^S3EventSourceV2$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn build-self-managed-kafka-event-source-builder
  "The build-self-managed-kafka-event-source-builder function updates a SelfManagedKafkaEventSource$Builder instance using the provided configuration.
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
  (when-let [data (authentication-method config id :authentication-method)]
    (. builder authenticationMethod data))
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bootstrap-servers)]
    (. builder bootstrapServers data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :root-ca-certificate)]
    (. builder rootCaCertificate data))
  (when-let [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn self-managed-kafka-event-source-builder
  ""
  [id config]
  (build-self-managed-kafka-event-source-builder (SelfManagedKafkaEventSource$Builder/create) id config))


(defn build-self-managed-kafka-event-source-props-builder
  "The build-self-managed-kafka-event-source-props-builder function updates a SelfManagedKafkaEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (authentication-method config id :authentication-method)]
    (. builder authenticationMethod data))
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bootstrap-servers)]
    (. builder bootstrapServers data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :root-ca-certificate)]
    (. builder rootCaCertificate data))
  (when-let [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn self-managed-kafka-event-source-props-builder
  ""
  [id config]
  (build-self-managed-kafka-event-source-props-builder (new SelfManagedKafkaEventSourceProps$Builder) id config))


(defn build-sns-event-source-builder
  "The build-sns-event-source-builder function updates a SnsEventSource$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn build-sns-event-source-props-builder
  "The build-sns-event-source-props-builder function updates a SnsEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn sns-event-source-props-builder
  ""
  [id config]
  (build-sns-event-source-props-builder (new SnsEventSourceProps$Builder) id config))


(defn build-sqs-event-source-builder
  "The build-sqs-event-source-builder function updates a SqsEventSource$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (.build builder))


(defn build-sqs-event-source-props-builder
  "The build-sqs-event-source-props-builder function updates a SqsEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (.build builder))


(defn sqs-event-source-props-builder
  ""
  [id config]
  (build-sqs-event-source-props-builder (new SqsEventSourceProps$Builder) id config))


(defn build-stream-event-source-props-builder
  "The build-stream-event-source-props-builder function updates a StreamEventSourceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :bisect-batch-on-error)]
    (. builder bisectBatchOnError data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :max-batching-window)]
    (. builder maxBatchingWindow data))
  (when-let [data (lookup-entry config id :max-record-age)]
    (. builder maxRecordAge data))
  (when-let [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :report-batch-item-failures)]
    (. builder reportBatchItemFailures data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (starting-position config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :tumbling-window)]
    (. builder tumblingWindow data))
  (.build builder))


(defn stream-event-source-props-builder
  ""
  [id config]
  (build-stream-event-source-props-builder (new StreamEventSourceProps$Builder) id config))