(ns cdk.api.services.events.targets
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.events.targets package. "
  (:require [cdk.api.services.ecs :refer [fargate-platform-version
                                          launch-type
                                          propagated-tag-source]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.events.targets ApiDestination$Builder
                                                           ApiDestinationProps$Builder
                                                           ApiGateway$Builder
                                                           ApiGatewayProps$Builder
                                                           AppSync$Builder
                                                           AppSyncGraphQLApiProps$Builder
                                                           AwsApi$Builder
                                                           AwsApiInput$Builder
                                                           AwsApiProps$Builder
                                                           BatchJob$Builder
                                                           BatchJobProps$Builder
                                                           CloudWatchLogGroup$Builder
                                                           CodeBuildProject$Builder
                                                           CodeBuildProjectProps$Builder
                                                           CodePipeline$Builder
                                                           CodePipelineTargetOptions$Builder
                                                           ContainerOverride$Builder
                                                           EcsTask$Builder
                                                           EcsTaskProps$Builder
                                                           EventBus$Builder
                                                           EventBusProps$Builder
                                                           KinesisFirehoseStreamProps$Builder
                                                           KinesisFirehoseStreamV2$Builder
                                                           KinesisStream$Builder
                                                           KinesisStreamProps$Builder
                                                           LambdaFunction$Builder
                                                           LambdaFunctionProps$Builder
                                                           LogGroupProps$Builder
                                                           LogGroupTargetInputOptions$Builder
                                                           SfnStateMachine$Builder
                                                           SfnStateMachineProps$Builder
                                                           SnsTopic$Builder
                                                           SnsTopicProps$Builder
                                                           SqsQueue$Builder
                                                           SqsQueueProps$Builder
                                                           Tag$Builder
                                                           TargetBaseProps$Builder
                                                           TaskEnvironmentVariable$Builder]))


(defn build-api-destination-builder
  "The build-api-destination-builder function updates a ApiDestination$Builder instance using the provided configuration.
  The function takes the ApiDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^ApiDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-api-destination-props-builder
  "The build-api-destination-props-builder function updates a ApiDestinationProps$Builder instance using the provided configuration.
  The function takes the ApiDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^ApiDestinationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-api-gateway-builder
  "The build-api-gateway-builder function updates a ApiGateway$Builder instance using the provided configuration.
  The function takes the ApiGateway$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `postBody` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:post-body` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^ApiGateway$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :post-body)]
    (. builder postBody data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-api-gateway-props-builder
  "The build-api-gateway-props-builder function updates a ApiGatewayProps$Builder instance using the provided configuration.
  The function takes the ApiGatewayProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `method` | java.lang.String | [[cdk.support/lookup-entry]] | `:method` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `postBody` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:post-body` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
"
  [^ApiGatewayProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :post-body)]
    (. builder postBody data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn build-app-sync-builder
  "The build-app-sync-builder function updates a AppSync$Builder instance using the provided configuration.
  The function takes the AppSync$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `graphQlOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-operation` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `variables` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^AppSync$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :graph-ql-operation)]
    (. builder graphQlOperation data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn build-app-sync-graph-ql-api-props-builder
  "The build-app-sync-graph-ql-api-props-builder function updates a AppSyncGraphQLApiProps$Builder instance using the provided configuration.
  The function takes the AppSyncGraphQLApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `graphQlOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-operation` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `variables` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^AppSyncGraphQLApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :graph-ql-operation)]
    (. builder graphQlOperation data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn build-aws-api-builder
  "The build-aws-api-builder function updates a AwsApi$Builder instance using the provided configuration.
  The function takes the AwsApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `catchErrorPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:catch-error-pattern` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `policyStatement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:policy-statement` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AwsApi$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-let [data (lookup-entry config id :catch-error-pattern)]
    (. builder catchErrorPattern data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :policy-statement)]
    (. builder policyStatement data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn build-aws-api-input-builder
  "The build-aws-api-input-builder function updates a AwsApiInput$Builder instance using the provided configuration.
  The function takes the AwsApiInput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `catchErrorPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:catch-error-pattern` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AwsApiInput$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-let [data (lookup-entry config id :catch-error-pattern)]
    (. builder catchErrorPattern data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn build-aws-api-props-builder
  "The build-aws-api-props-builder function updates a AwsApiProps$Builder instance using the provided configuration.
  The function takes the AwsApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `catchErrorPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:catch-error-pattern` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `policyStatement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:policy-statement` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AwsApiProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-let [data (lookup-entry config id :catch-error-pattern)]
    (. builder catchErrorPattern data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :policy-statement)]
    (. builder policyStatement data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn build-batch-job-builder
  "The build-batch-job-builder function updates a BatchJob$Builder instance using the provided configuration.
  The function takes the BatchJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^BatchJob$Builder builder id config]
  (when-let [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn build-batch-job-props-builder
  "The build-batch-job-props-builder function updates a BatchJobProps$Builder instance using the provided configuration.
  The function takes the BatchJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^BatchJobProps$Builder builder id config]
  (when-let [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn build-cloud-watch-log-group-builder
  "The build-cloud-watch-log-group-builder function updates a CloudWatchLogGroup$Builder instance using the provided configuration.
  The function takes the CloudWatchLogGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `installLatestAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-latest-aws-sdk` |
| `logEvent` | software.amazon.awscdk.services.events.targets.LogGroupTargetInput | [[cdk.support/lookup-entry]] | `:log-event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^CloudWatchLogGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :install-latest-aws-sdk)]
    (. builder installLatestAwsSdk data))
  (when-let [data (lookup-entry config id :log-event)]
    (. builder logEvent data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-code-build-project-builder
  "The build-code-build-project-builder function updates a CodeBuildProject$Builder instance using the provided configuration.
  The function takes the CodeBuildProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^CodeBuildProject$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-code-build-project-props-builder
  "The build-code-build-project-props-builder function updates a CodeBuildProjectProps$Builder instance using the provided configuration.
  The function takes the CodeBuildProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^CodeBuildProjectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-code-pipeline-builder
  "The build-code-pipeline-builder function updates a CodePipeline$Builder instance using the provided configuration.
  The function takes the CodePipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^CodePipeline$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-code-pipeline-target-options-builder
  "The build-code-pipeline-target-options-builder function updates a CodePipelineTargetOptions$Builder instance using the provided configuration.
  The function takes the CodePipelineTargetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^CodePipelineTargetOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-container-override-builder
  "The build-container-override-builder function updates a ContainerOverride$Builder instance using the provided configuration.
  The function takes the ContainerOverride$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |
"
  [^ContainerOverride$Builder builder id config]
  (when-let [data (lookup-entry config id :command)]
    (. builder command data))
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-let [data (lookup-entry config id :memory-reservation)]
    (. builder memoryReservation data))
  (.build builder))


(defn build-ecs-task-builder
  "The build-ecs-task-builder function updates a EcsTask$Builder instance using the provided configuration.
  The function takes the EcsTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `containerOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `launchType` | software.amazon.awscdk.services.ecs.LaunchType | [[cdk.api.services.ecs/launch-type]] | `:launch-type` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:task-count` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.ITaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^EcsTask$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-let [data (launch-type config id :launch-type)]
    (. builder launchType data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-let [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task-count)]
    (. builder taskCount data))
  (when-let [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn build-ecs-task-props-builder
  "The build-ecs-task-props-builder function updates a EcsTaskProps$Builder instance using the provided configuration.
  The function takes the EcsTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `containerOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `launchType` | software.amazon.awscdk.services.ecs.LaunchType | [[cdk.api.services.ecs/launch-type]] | `:launch-type` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:task-count` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.ITaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^EcsTaskProps$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-let [data (launch-type config id :launch-type)]
    (. builder launchType data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-let [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task-count)]
    (. builder taskCount data))
  (when-let [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn build-event-bus-builder
  "The build-event-bus-builder function updates a EventBus$Builder instance using the provided configuration.
  The function takes the EventBus$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^EventBus$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn build-event-bus-props-builder
  "The build-event-bus-props-builder function updates a EventBusProps$Builder instance using the provided configuration.
  The function takes the EventBusProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^EventBusProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn build-kinesis-firehose-stream-props-builder
  "The build-kinesis-firehose-stream-props-builder function updates a KinesisFirehoseStreamProps$Builder instance using the provided configuration.
  The function takes the KinesisFirehoseStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
"
  [^KinesisFirehoseStreamProps$Builder builder id config]
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn build-kinesis-firehose-stream-v2-builder
  "The build-kinesis-firehose-stream-v2-builder function updates a KinesisFirehoseStreamV2$Builder instance using the provided configuration.
  The function takes the KinesisFirehoseStreamV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
"
  [^KinesisFirehoseStreamV2$Builder builder id config]
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn build-kinesis-stream-builder
  "The build-kinesis-stream-builder function updates a KinesisStream$Builder instance using the provided configuration.
  The function takes the KinesisStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |
"
  [^KinesisStream$Builder builder id config]
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :partition-key-path)]
    (. builder partitionKeyPath data))
  (.build builder))


(defn build-kinesis-stream-props-builder
  "The build-kinesis-stream-props-builder function updates a KinesisStreamProps$Builder instance using the provided configuration.
  The function takes the KinesisStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |
"
  [^KinesisStreamProps$Builder builder id config]
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :partition-key-path)]
    (. builder partitionKeyPath data))
  (.build builder))


(defn build-lambda-function-builder
  "The build-lambda-function-builder function updates a LambdaFunction$Builder instance using the provided configuration.
  The function takes the LambdaFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^LambdaFunction$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-lambda-function-props-builder
  "The build-lambda-function-props-builder function updates a LambdaFunctionProps$Builder instance using the provided configuration.
  The function takes the LambdaFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^LambdaFunctionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-log-group-props-builder
  "The build-log-group-props-builder function updates a LogGroupProps$Builder instance using the provided configuration.
  The function takes the LogGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `installLatestAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-latest-aws-sdk` |
| `logEvent` | software.amazon.awscdk.services.events.targets.LogGroupTargetInput | [[cdk.support/lookup-entry]] | `:log-event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^LogGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :install-latest-aws-sdk)]
    (. builder installLatestAwsSdk data))
  (when-let [data (lookup-entry config id :log-event)]
    (. builder logEvent data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-log-group-target-input-options-builder
  "The build-log-group-target-input-options-builder function updates a LogGroupTargetInputOptions$Builder instance using the provided configuration.
  The function takes the LogGroupTargetInputOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.Object | [[cdk.support/lookup-entry]] | `:message` |
| `timestamp` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timestamp` |
"
  [^LogGroupTargetInputOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (.build builder))


(defn build-sfn-state-machine-builder
  "The build-sfn-state-machine-builder function updates a SfnStateMachine$Builder instance using the provided configuration.
  The function takes the SfnStateMachine$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `input` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:input` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^SfnStateMachine$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn build-sfn-state-machine-props-builder
  "The build-sfn-state-machine-props-builder function updates a SfnStateMachineProps$Builder instance using the provided configuration.
  The function takes the SfnStateMachineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `input` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:input` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^SfnStateMachineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :input)]
    (. builder input data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn build-sns-topic-builder
  "The build-sns-topic-builder function updates a SnsTopic$Builder instance using the provided configuration.
  The function takes the SnsTopic$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^SnsTopic$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-sns-topic-props-builder
  "The build-sns-topic-props-builder function updates a SnsTopicProps$Builder instance using the provided configuration.
  The function takes the SnsTopicProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^SnsTopicProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-sqs-queue-builder
  "The build-sqs-queue-builder function updates a SqsQueue$Builder instance using the provided configuration.
  The function takes the SqsQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^SqsQueue$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-sqs-queue-props-builder
  "The build-sqs-queue-props-builder function updates a SqsQueueProps$Builder instance using the provided configuration.
  The function takes the SqsQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^SqsQueueProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-tag-builder
  "The build-tag-builder function updates a Tag$Builder instance using the provided configuration.
  The function takes the Tag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^Tag$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-target-base-props-builder
  "The build-target-base-props-builder function updates a TargetBaseProps$Builder instance using the provided configuration.
  The function takes the TargetBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
"
  [^TargetBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-let [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn build-task-environment-variable-builder
  "The build-task-environment-variable-builder function updates a TaskEnvironmentVariable$Builder instance using the provided configuration.
  The function takes the TaskEnvironmentVariable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^TaskEnvironmentVariable$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))