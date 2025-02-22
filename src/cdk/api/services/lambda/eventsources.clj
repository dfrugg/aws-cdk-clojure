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


(defn api-event-source-builder
  "The api-event-source-builder function buildes out new instances of 
ApiEventSource$Builder using the provided configuration.  Each field is set as follows:

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
| `requestValidatorOptions` | software.amazon.awscdk.services.apigateway.RequestValidatorOptions | [[cdk.support/lookup-entry]] | `:request-validator-options` |"
  [stack id config ^java.lang.String String ^java.lang.String String]
  (let [builder (ApiEventSource$Builder/create ^java.lang.String String ^java.lang.String String)]
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
    (.build builder)))


(defn base-stream-event-source-props-builder
  "The base-stream-event-source-props-builder function buildes out new instances of 
BaseStreamEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `startingPosition` | software.amazon.awscdk.services.lambda.StartingPosition | [[cdk.api.services.lambda/starting-position]] | `:starting-position` |"
  [stack id config]
  (let [builder (BaseStreamEventSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :batch-size)]
      (. builder batchSize data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :max-batching-window)]
      (. builder maxBatchingWindow data))
    (when-let [data (starting-position config id :starting-position)]
      (. builder startingPosition data))
    (.build builder)))


(defn dynamo-event-source-builder
  "The dynamo-event-source-builder function buildes out new instances of 
DynamoEventSource$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config ^software.amazon.awscdk.services.dynamodb.ITable table]
  (let [builder (DynamoEventSource$Builder/create ^software.amazon.awscdk.services.dynamodb.ITable table)]
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
    (.build builder)))


(defn dynamo-event-source-props-builder
  "The dynamo-event-source-props-builder function buildes out new instances of 
DynamoEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config]
  (let [builder (DynamoEventSourceProps$Builder.)]
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
    (.build builder)))


(defn kafka-event-source-props-builder
  "The kafka-event-source-props-builder function buildes out new instances of 
KafkaEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (KafkaEventSourceProps$Builder.)]
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
    (.build builder)))


(defn kinesis-event-source-builder
  "The kinesis-event-source-builder function buildes out new instances of 
KinesisEventSource$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config ^software.amazon.awscdk.services.kinesis.IStream stream]
  (let [builder (KinesisEventSource$Builder/create ^software.amazon.awscdk.services.kinesis.IStream stream)]
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
    (.build builder)))


(defn kinesis-event-source-props-builder
  "The kinesis-event-source-props-builder function buildes out new instances of 
KinesisEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config]
  (let [builder (KinesisEventSourceProps$Builder.)]
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
    (.build builder)))


(defn managed-kafka-event-source-builder
  "The managed-kafka-event-source-builder function buildes out new instances of 
ManagedKafkaEventSource$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (ManagedKafkaEventSource$Builder/create)]
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
    (.build builder)))


(defn managed-kafka-event-source-props-builder
  "The managed-kafka-event-source-props-builder function buildes out new instances of 
ManagedKafkaEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (ManagedKafkaEventSourceProps$Builder.)]
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
    (.build builder)))


(defn s3-event-source-builder
  "The s3-event-source-builder function buildes out new instances of 
S3EventSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |"
  [stack id config ^software.amazon.awscdk.services.s3.Bucket bucket]
  (let [builder (S3EventSource$Builder/create ^software.amazon.awscdk.services.s3.Bucket bucket)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (.build builder)))


(defn s3-event-source-props-builder
  "The s3-event-source-props-builder function buildes out new instances of 
S3EventSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |"
  [stack id config]
  (let [builder (S3EventSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (.build builder)))


(defn s3-event-source-v2-builder
  "The s3-event-source-v2-builder function buildes out new instances of 
S3EventSourceV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |"
  [stack id config ^software.amazon.awscdk.services.s3.IBucket bucket]
  (let [builder (S3EventSourceV2$Builder/create ^software.amazon.awscdk.services.s3.IBucket bucket)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (.build builder)))


(defn self-managed-kafka-event-source-builder
  "The self-managed-kafka-event-source-builder function buildes out new instances of 
SelfManagedKafkaEventSource$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SelfManagedKafkaEventSource$Builder/create)]
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
    (.build builder)))


(defn self-managed-kafka-event-source-props-builder
  "The self-managed-kafka-event-source-props-builder function buildes out new instances of 
SelfManagedKafkaEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SelfManagedKafkaEventSourceProps$Builder.)]
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
    (.build builder)))


(defn sns-event-source-builder
  "The sns-event-source-builder function buildes out new instances of 
SnsEventSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config ^software.amazon.awscdk.services.sns.ITopic topic]
  (let [builder (SnsEventSource$Builder/create ^software.amazon.awscdk.services.sns.ITopic topic)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn sns-event-source-props-builder
  "The sns-event-source-props-builder function buildes out new instances of 
SnsEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config]
  (let [builder (SnsEventSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn sqs-event-source-builder
  "The sqs-event-source-builder function buildes out new instances of 
SqsEventSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |"
  [stack id config ^software.amazon.awscdk.services.sqs.IQueue queue]
  (let [builder (SqsEventSource$Builder/create ^software.amazon.awscdk.services.sqs.IQueue queue)]
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
    (.build builder)))


(defn sqs-event-source-props-builder
  "The sqs-event-source-props-builder function buildes out new instances of 
SqsEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `maxBatchingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-batching-window` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `reportBatchItemFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-batch-item-failures` |"
  [stack id config]
  (let [builder (SqsEventSourceProps$Builder.)]
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
    (.build builder)))


(defn stream-event-source-props-builder
  "The stream-event-source-props-builder function buildes out new instances of 
StreamEventSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tumblingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tumbling-window` |"
  [stack id config]
  (let [builder (StreamEventSourceProps$Builder.)]
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
    (.build builder)))