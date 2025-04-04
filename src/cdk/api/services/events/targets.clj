(ns cdk.api.services.events.targets
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.events.targets package. "
  (:require [cdk.api.services.ecs :refer [fargate-platform-version
                                          launch-type
                                          propagated-tag-source]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.apigateway IRestApi]
           [software.amazon.awscdk.services.appsync IGraphqlApi]
           [software.amazon.awscdk.services.codebuild IProject]
           [software.amazon.awscdk.services.codepipeline IPipeline]
           [software.amazon.awscdk.services.events IApiDestination
                                                   IEventBus]
           [software.amazon.awscdk.services.events.targets ApiDestination$Builder
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
                                                           IDeliveryStream
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
                                                           TaskEnvironmentVariable$Builder]
           [software.amazon.awscdk.services.kinesis IStream]
           [software.amazon.awscdk.services.lambda IFunction]
           [software.amazon.awscdk.services.logs ILogGroup]
           [software.amazon.awscdk.services.sns ITopic]
           [software.amazon.awscdk.services.sqs IQueue]
           [software.amazon.awscdk.services.stepfunctions IStateMachine]
           [software.constructs IConstruct]))


(defn api-destination-builder>
  "The api-destination-builder> function updates a ApiDestination$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-some [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn api-destination-builder
  "Creates a  `ApiDestination$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.events.IApiDestination]___

| Argument | DataType | Description |
|---|---|---|
| `api-destination` | software.amazon.awscdk.services.events.IApiDestination |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IApiDestination api-destination id config]
  (api-destination-builder> (ApiDestination$Builder/create api-destination) id config))


(defn api-destination-props-builder>
  "The api-destination-props-builder> function updates a ApiDestinationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-some [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn api-destination-props-builder
  "Creates a  `ApiDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[api-destination-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (api-destination-props-builder> (new ApiDestinationProps$Builder) id config))


(defn api-gateway-builder>
  "The api-gateway-builder> function updates a ApiGateway$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-some [data (lookup-entry config id :post-body)]
    (. builder postBody data))
  (when-some [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn api-gateway-builder
  "Creates a  `ApiGateway$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.apigateway.IRestApi]___

| Argument | DataType | Description |
|---|---|---|
| `rest-api` | software.amazon.awscdk.services.apigateway.IRestApi |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IRestApi rest-api id config]
  (api-gateway-builder> (ApiGateway$Builder/create rest-api) id config))


(defn api-gateway-props-builder>
  "The api-gateway-props-builder> function updates a ApiGatewayProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-some [data (lookup-entry config id :post-body)]
    (. builder postBody data))
  (when-some [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :stage)]
    (. builder stage data))
  (.build builder))


(defn api-gateway-props-builder
  "Creates a  `ApiGatewayProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[api-gateway-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (api-gateway-props-builder> (new ApiGatewayProps$Builder) id config))


(defn app-sync-builder>
  "The app-sync-builder> function updates a AppSync$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :graph-ql-operation)]
    (. builder graphQlOperation data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn app-sync-builder
  "Creates a  `AppSync$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.appsync.IGraphqlApi]___

| Argument | DataType | Description |
|---|---|---|
| `graphql-api` | software.amazon.awscdk.services.appsync.IGraphqlApi |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IGraphqlApi graphql-api id config]
  (app-sync-builder> (AppSync$Builder/create graphql-api) id config))


(defn app-sync-graph-ql-api-props-builder>
  "The app-sync-graph-ql-api-props-builder> function updates a AppSyncGraphQLApiProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :graph-ql-operation)]
    (. builder graphQlOperation data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn app-sync-graph-ql-api-props-builder
  "Creates a  `AppSyncGraphQLApiProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[app-sync-graph-ql-api-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (app-sync-graph-ql-api-props-builder> (new AppSyncGraphQLApiProps$Builder) id config))


(defn aws-api-builder>
  "The aws-api-builder> function updates a AwsApi$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :catch-error-pattern)]
    (. builder catchErrorPattern data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :policy-statement)]
    (. builder policyStatement data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn aws-api-builder
  "Creates a  `AwsApi$Builder` instance using a no-argument create, applies the data configuration using the [[aws-api-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aws-api-builder> (AwsApi$Builder/create) id config))


(defn aws-api-input-builder>
  "The aws-api-input-builder> function updates a AwsApiInput$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :catch-error-pattern)]
    (. builder catchErrorPattern data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn aws-api-input-builder
  "Creates a  `AwsApiInput$Builder` instance using a no-argument constructor, applies the data configuration using the [[aws-api-input-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aws-api-input-builder> (new AwsApiInput$Builder) id config))


(defn aws-api-props-builder>
  "The aws-api-props-builder> function updates a AwsApiProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :catch-error-pattern)]
    (. builder catchErrorPattern data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :policy-statement)]
    (. builder policyStatement data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn aws-api-props-builder
  "Creates a  `AwsApiProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[aws-api-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aws-api-props-builder> (new AwsApiProps$Builder) id config))


(defn batch-job-builder>
  "The batch-job-builder> function updates a BatchJob$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn batch-job-builder
  "Creates a  `BatchJob$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.String software.constructs.IConstruct java.lang.String software.constructs.IConstruct]___

| Argument | DataType | Description |
|---|---|---|
| `job-queue-arn` | java.lang.String |  |
| `job-queue-scope` | software.constructs.IConstruct |  |
| `job-definition-arn` | java.lang.String |  |
| `job-definition-scope` | software.constructs.IConstruct |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^String job-queue-arn ^IConstruct job-queue-scope ^String job-definition-arn ^IConstruct job-definition-scope id config]
  (batch-job-builder> (BatchJob$Builder/create job-queue-arn job-queue-scope job-definition-arn job-definition-scope) id config))


(defn batch-job-props-builder>
  "The batch-job-props-builder> function updates a BatchJobProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn batch-job-props-builder
  "Creates a  `BatchJobProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[batch-job-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (batch-job-props-builder> (new BatchJobProps$Builder) id config))


(defn cloud-watch-log-group-builder>
  "The cloud-watch-log-group-builder> function updates a CloudWatchLogGroup$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :install-latest-aws-sdk)]
    (. builder installLatestAwsSdk data))
  (when-some [data (lookup-entry config id :log-event)]
    (. builder logEvent data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn cloud-watch-log-group-builder
  "Creates a  `CloudWatchLogGroup$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.logs.ILogGroup]___

| Argument | DataType | Description |
|---|---|---|
| `log-group` | software.amazon.awscdk.services.logs.ILogGroup |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^ILogGroup log-group id config]
  (cloud-watch-log-group-builder> (CloudWatchLogGroup$Builder/create log-group) id config))


(defn code-build-project-builder>
  "The code-build-project-builder> function updates a CodeBuildProject$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn code-build-project-builder
  "Creates a  `CodeBuildProject$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.codebuild.IProject]___

| Argument | DataType | Description |
|---|---|---|
| `project` | software.amazon.awscdk.services.codebuild.IProject |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IProject project id config]
  (code-build-project-builder> (CodeBuildProject$Builder/create project) id config))


(defn code-build-project-props-builder>
  "The code-build-project-props-builder> function updates a CodeBuildProjectProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn code-build-project-props-builder
  "Creates a  `CodeBuildProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[code-build-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (code-build-project-props-builder> (new CodeBuildProjectProps$Builder) id config))


(defn code-pipeline-builder>
  "The code-pipeline-builder> function updates a CodePipeline$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn code-pipeline-builder
  "Creates a  `CodePipeline$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.codepipeline.IPipeline]___

| Argument | DataType | Description |
|---|---|---|
| `pipeline` | software.amazon.awscdk.services.codepipeline.IPipeline |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IPipeline pipeline id config]
  (code-pipeline-builder> (CodePipeline$Builder/create pipeline) id config))


(defn code-pipeline-target-options-builder>
  "The code-pipeline-target-options-builder> function updates a CodePipelineTargetOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event-role)]
    (. builder eventRole data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn code-pipeline-target-options-builder
  "Creates a  `CodePipelineTargetOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[code-pipeline-target-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (code-pipeline-target-options-builder> (new CodePipelineTargetOptions$Builder) id config))


(defn container-override-builder>
  "The container-override-builder> function updates a ContainerOverride$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-some [data (lookup-entry config id :memory-reservation)]
    (. builder memoryReservation data))
  (.build builder))


(defn container-override-builder
  "Creates a  `ContainerOverride$Builder` instance using a no-argument constructor, applies the data configuration using the [[container-override-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (container-override-builder> (new ContainerOverride$Builder) id config))


(defn ecs-task-builder>
  "The ecs-task-builder> function updates a EcsTask$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (launch-type config id :launch-type)]
    (. builder launchType data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-count)]
    (. builder taskCount data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn ecs-task-builder
  "Creates a  `EcsTask$Builder` instance using a no-argument create, applies the data configuration using the [[ecs-task-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (ecs-task-builder> (EcsTask$Builder/create) id config))


(defn ecs-task-props-builder>
  "The ecs-task-props-builder> function updates a EcsTaskProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (launch-type config id :launch-type)]
    (. builder launchType data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-count)]
    (. builder taskCount data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn ecs-task-props-builder
  "Creates a  `EcsTaskProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[ecs-task-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (ecs-task-props-builder> (new EcsTaskProps$Builder) id config))


(defn event-bus-builder>
  "The event-bus-builder> function updates a EventBus$Builder instance using the provided configuration.
  The function takes the EventBus$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^EventBus$Builder builder id config]
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn event-bus-builder
  "Creates a  `EventBus$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.events.IEventBus]___

| Argument | DataType | Description |
|---|---|---|
| `event-bus` | software.amazon.awscdk.services.events.IEventBus |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IEventBus event-bus id config]
  (event-bus-builder> (EventBus$Builder/create event-bus) id config))


(defn event-bus-props-builder>
  "The event-bus-props-builder> function updates a EventBusProps$Builder instance using the provided configuration.
  The function takes the EventBusProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^EventBusProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn event-bus-props-builder
  "Creates a  `EventBusProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[event-bus-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (event-bus-props-builder> (new EventBusProps$Builder) id config))


(defn kinesis-firehose-stream-props-builder>
  "The kinesis-firehose-stream-props-builder> function updates a KinesisFirehoseStreamProps$Builder instance using the provided configuration.
  The function takes the KinesisFirehoseStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
"
  [^KinesisFirehoseStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn kinesis-firehose-stream-props-builder
  "Creates a  `KinesisFirehoseStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kinesis-firehose-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kinesis-firehose-stream-props-builder> (new KinesisFirehoseStreamProps$Builder) id config))


(defn kinesis-firehose-stream-v2-builder>
  "The kinesis-firehose-stream-v2-builder> function updates a KinesisFirehoseStreamV2$Builder instance using the provided configuration.
  The function takes the KinesisFirehoseStreamV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
"
  [^KinesisFirehoseStreamV2$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn kinesis-firehose-stream-v2-builder
  "Creates a  `KinesisFirehoseStreamV2$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.events.targets.IDeliveryStream]___

| Argument | DataType | Description |
|---|---|---|
| `delivery-stream` | software.amazon.awscdk.services.events.targets.IDeliveryStream |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IDeliveryStream delivery-stream id config]
  (kinesis-firehose-stream-v2-builder> (KinesisFirehoseStreamV2$Builder/create delivery-stream) id config))


(defn kinesis-stream-builder>
  "The kinesis-stream-builder> function updates a KinesisStream$Builder instance using the provided configuration.
  The function takes the KinesisStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |
"
  [^KinesisStream$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :partition-key-path)]
    (. builder partitionKeyPath data))
  (.build builder))


(defn kinesis-stream-builder
  "Creates a  `KinesisStream$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.kinesis.IStream]___

| Argument | DataType | Description |
|---|---|---|
| `stream` | software.amazon.awscdk.services.kinesis.IStream |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IStream stream id config]
  (kinesis-stream-builder> (KinesisStream$Builder/create stream) id config))


(defn kinesis-stream-props-builder>
  "The kinesis-stream-props-builder> function updates a KinesisStreamProps$Builder instance using the provided configuration.
  The function takes the KinesisStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |
"
  [^KinesisStreamProps$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :partition-key-path)]
    (. builder partitionKeyPath data))
  (.build builder))


(defn kinesis-stream-props-builder
  "Creates a  `KinesisStreamProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kinesis-stream-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kinesis-stream-props-builder> (new KinesisStreamProps$Builder) id config))


(defn lambda-function-builder>
  "The lambda-function-builder> function updates a LambdaFunction$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn lambda-function-builder
  "Creates a  `LambdaFunction$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.lambda.IFunction]___

| Argument | DataType | Description |
|---|---|---|
| `handler` | software.amazon.awscdk.services.lambda.IFunction |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IFunction handler id config]
  (lambda-function-builder> (LambdaFunction$Builder/create handler) id config))


(defn lambda-function-props-builder>
  "The lambda-function-props-builder> function updates a LambdaFunctionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn lambda-function-props-builder
  "Creates a  `LambdaFunctionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[lambda-function-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (lambda-function-props-builder> (new LambdaFunctionProps$Builder) id config))


(defn log-group-props-builder>
  "The log-group-props-builder> function updates a LogGroupProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :event)]
    (. builder event data))
  (when-some [data (lookup-entry config id :install-latest-aws-sdk)]
    (. builder installLatestAwsSdk data))
  (when-some [data (lookup-entry config id :log-event)]
    (. builder logEvent data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn log-group-props-builder
  "Creates a  `LogGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-group-props-builder> (new LogGroupProps$Builder) id config))


(defn log-group-target-input-options-builder>
  "The log-group-target-input-options-builder> function updates a LogGroupTargetInputOptions$Builder instance using the provided configuration.
  The function takes the LogGroupTargetInputOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.Object | [[cdk.support/lookup-entry]] | `:message` |
| `timestamp` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timestamp` |
"
  [^LogGroupTargetInputOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (.build builder))


(defn log-group-target-input-options-builder
  "Creates a  `LogGroupTargetInputOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[log-group-target-input-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (log-group-target-input-options-builder> (new LogGroupTargetInputOptions$Builder) id config))


(defn sfn-state-machine-builder>
  "The sfn-state-machine-builder> function updates a SfnStateMachine$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn sfn-state-machine-builder
  "Creates a  `SfnStateMachine$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.stepfunctions.IStateMachine]___

| Argument | DataType | Description |
|---|---|---|
| `state-machine` | software.amazon.awscdk.services.stepfunctions.IStateMachine |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IStateMachine state-machine id config]
  (sfn-state-machine-builder> (SfnStateMachine$Builder/create state-machine) id config))


(defn sfn-state-machine-props-builder>
  "The sfn-state-machine-props-builder> function updates a SfnStateMachineProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn sfn-state-machine-props-builder
  "Creates a  `SfnStateMachineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sfn-state-machine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sfn-state-machine-props-builder> (new SfnStateMachineProps$Builder) id config))


(defn sns-topic-builder>
  "The sns-topic-builder> function updates a SnsTopic$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn sns-topic-builder
  "Creates a  `SnsTopic$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.sns.ITopic]___

| Argument | DataType | Description |
|---|---|---|
| `topic` | software.amazon.awscdk.services.sns.ITopic |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^ITopic topic id config]
  (sns-topic-builder> (SnsTopic$Builder/create topic) id config))


(defn sns-topic-props-builder>
  "The sns-topic-props-builder> function updates a SnsTopicProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn sns-topic-props-builder
  "Creates a  `SnsTopicProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sns-topic-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sns-topic-props-builder> (new SnsTopicProps$Builder) id config))


(defn sqs-queue-builder>
  "The sqs-queue-builder> function updates a SqsQueue$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn sqs-queue-builder
  "Creates a  `SqsQueue$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[software.amazon.awscdk.services.sqs.IQueue]___

| Argument | DataType | Description |
|---|---|---|
| `queue` | software.amazon.awscdk.services.sqs.IQueue |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^IQueue queue id config]
  (sqs-queue-builder> (SqsQueue$Builder/create queue) id config))


(defn sqs-queue-props-builder>
  "The sqs-queue-props-builder> function updates a SqsQueueProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn sqs-queue-props-builder
  "Creates a  `SqsQueueProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sqs-queue-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sqs-queue-props-builder> (new SqsQueueProps$Builder) id config))


(defn tag-builder>
  "The tag-builder> function updates a Tag$Builder instance using the provided configuration.
  The function takes the Tag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^Tag$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn tag-builder
  "Creates a  `Tag$Builder` instance using a no-argument constructor, applies the data configuration using the [[tag-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (tag-builder> (new Tag$Builder) id config))


(defn target-base-props-builder>
  "The target-base-props-builder> function updates a TargetBaseProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-some [data (lookup-entry config id :max-event-age)]
    (. builder maxEventAge data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (.build builder))


(defn target-base-props-builder
  "Creates a  `TargetBaseProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[target-base-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (target-base-props-builder> (new TargetBaseProps$Builder) id config))


(defn task-environment-variable-builder>
  "The task-environment-variable-builder> function updates a TaskEnvironmentVariable$Builder instance using the provided configuration.
  The function takes the TaskEnvironmentVariable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^TaskEnvironmentVariable$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn task-environment-variable-builder
  "Creates a  `TaskEnvironmentVariable$Builder` instance using a no-argument constructor, applies the data configuration using the [[task-environment-variable-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (task-environment-variable-builder> (new TaskEnvironmentVariable$Builder) id config))