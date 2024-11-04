(ns cdk.api.services.events.targets
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.events.targets package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.ecs :refer [fargate-platform-version
                                          launch-type
                                          propagated-tag-source]])
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


(defn api-destination-builder
  "The api-destination-builder function buildes out new instances of 
ApiDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.events.IApiDestination api-destination]
  (let [builder (ApiDestination$Builder/create ^software.amazon.awscdk.services.events.IApiDestination api-destination)]
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
    (.build builder)))


(defn api-destination-props-builder
  "The api-destination-props-builder function buildes out new instances of 
ApiDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (ApiDestinationProps$Builder.)]
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
    (.build builder)))


(defn api-gateway-builder
  "The api-gateway-builder function buildes out new instances of 
ApiGateway$Builder using the provided configuration.  Each field is set as follows:

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
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config ^software.amazon.awscdk.services.apigateway.IRestApi rest-api]
  (let [builder (ApiGateway$Builder/create ^software.amazon.awscdk.services.apigateway.IRestApi rest-api)]
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
    (.build builder)))


(defn api-gateway-props-builder
  "The api-gateway-props-builder function buildes out new instances of 
ApiGatewayProps$Builder using the provided configuration.  Each field is set as follows:

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
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (ApiGatewayProps$Builder.)]
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
    (.build builder)))


(defn app-sync-builder
  "The app-sync-builder function buildes out new instances of 
AppSync$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `graphQlOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-operation` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `variables` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config ^software.amazon.awscdk.services.appsync.IGraphqlApi graphql-api]
  (let [builder (AppSync$Builder/create ^software.amazon.awscdk.services.appsync.IGraphqlApi graphql-api)]
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
    (.build builder)))


(defn app-sync-graph-ql-api-props-builder
  "The app-sync-graph-ql-api-props-builder function buildes out new instances of 
AppSyncGraphQLApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `graphQlOperation` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-operation` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `variables` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (AppSyncGraphQLApiProps$Builder.)]
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
    (.build builder)))


(defn aws-api-builder
  "The aws-api-builder function buildes out new instances of 
AwsApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `catchErrorPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:catch-error-pattern` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `policyStatement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:policy-statement` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (AwsApi$Builder/create)]
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
    (.build builder)))


(defn aws-api-input-builder
  "The aws-api-input-builder function buildes out new instances of 
AwsApiInput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `catchErrorPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:catch-error-pattern` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (AwsApiInput$Builder.)]
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
    (.build builder)))


(defn aws-api-props-builder
  "The aws-api-props-builder function buildes out new instances of 
AwsApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `catchErrorPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:catch-error-pattern` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `policyStatement` | software.amazon.awscdk.services.iam.PolicyStatement | [[cdk.support/lookup-entry]] | `:policy-statement` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (AwsApiProps$Builder.)]
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
    (.build builder)))


(defn batch-job-builder
  "The batch-job-builder function buildes out new instances of 
BatchJob$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config ^java.lang.String job-queue-arn ^software.constructs.IConstruct job-queue-scope ^java.lang.String job-definition-arn ^software.constructs.IConstruct job-definition-scope]
  (let [builder (BatchJob$Builder/create ^java.lang.String job-queue-arn ^software.constructs.IConstruct job-queue-scope ^java.lang.String job-definition-arn ^software.constructs.IConstruct job-definition-scope)]
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
    (.build builder)))


(defn batch-job-props-builder
  "The batch-job-props-builder function buildes out new instances of 
BatchJobProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (BatchJobProps$Builder.)]
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
    (.build builder)))


(defn cloud-watch-log-group-builder
  "The cloud-watch-log-group-builder function buildes out new instances of 
CloudWatchLogGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `installLatestAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-latest-aws-sdk` |
| `logEvent` | software.amazon.awscdk.services.events.targets.LogGroupTargetInput | [[cdk.support/lookup-entry]] | `:log-event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.logs.ILogGroup log-group]
  (let [builder (CloudWatchLogGroup$Builder/create ^software.amazon.awscdk.services.logs.ILogGroup log-group)]
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
    (.build builder)))


(defn code-build-project-builder
  "The code-build-project-builder function buildes out new instances of 
CodeBuildProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.codebuild.IProject project]
  (let [builder (CodeBuildProject$Builder/create ^software.amazon.awscdk.services.codebuild.IProject project)]
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
    (.build builder)))


(defn code-build-project-props-builder
  "The code-build-project-props-builder function buildes out new instances of 
CodeBuildProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (CodeBuildProjectProps$Builder.)]
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
    (.build builder)))


(defn code-pipeline-builder
  "The code-pipeline-builder function buildes out new instances of 
CodePipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.codepipeline.IPipeline pipeline]
  (let [builder (CodePipeline$Builder/create ^software.amazon.awscdk.services.codepipeline.IPipeline pipeline)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :event-role)]
      (. builder eventRole data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn code-pipeline-target-options-builder
  "The code-pipeline-target-options-builder function buildes out new instances of 
CodePipelineTargetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `eventRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:event-role` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (CodePipelineTargetOptions$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :event-role)]
      (. builder eventRole data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn container-override-builder
  "The container-override-builder function buildes out new instances of 
ContainerOverride$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |"
  [stack id config]
  (let [builder (ContainerOverride$Builder.)]
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
    (.build builder)))


(defn ecs-task-builder
  "The ecs-task-builder function buildes out new instances of 
EcsTask$Builder using the provided configuration.  Each field is set as follows:

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
| `taskDefinition` | software.amazon.awscdk.services.ecs.ITaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (EcsTask$Builder/create)]
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
    (.build builder)))


(defn ecs-task-props-builder
  "The ecs-task-props-builder function buildes out new instances of 
EcsTaskProps$Builder using the provided configuration.  Each field is set as follows:

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
| `taskDefinition` | software.amazon.awscdk.services.ecs.ITaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (EcsTaskProps$Builder.)]
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
    (.build builder)))


(defn event-bus-builder
  "The event-bus-builder function buildes out new instances of 
EventBus$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config ^software.amazon.awscdk.services.events.IEventBus event-bus]
  (let [builder (EventBus$Builder/create ^software.amazon.awscdk.services.events.IEventBus event-bus)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn event-bus-props-builder
  "The event-bus-props-builder function buildes out new instances of 
EventBusProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (EventBusProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn kinesis-firehose-stream-props-builder
  "The kinesis-firehose-stream-props-builder function buildes out new instances of 
KinesisFirehoseStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (KinesisFirehoseStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (.build builder)))


(defn kinesis-firehose-stream-v2-builder
  "The kinesis-firehose-stream-v2-builder function buildes out new instances of 
KinesisFirehoseStreamV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config ^software.amazon.awscdk.services.events.targets.IDeliveryStream delivery-stream]
  (let [builder (KinesisFirehoseStreamV2$Builder/create ^software.amazon.awscdk.services.events.targets.IDeliveryStream delivery-stream)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (.build builder)))


(defn kinesis-stream-builder
  "The kinesis-stream-builder function buildes out new instances of 
KinesisStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |"
  [stack id config ^software.amazon.awscdk.services.kinesis.IStream stream]
  (let [builder (KinesisStream$Builder/create ^software.amazon.awscdk.services.kinesis.IStream stream)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :partition-key-path)]
      (. builder partitionKeyPath data))
    (.build builder)))


(defn kinesis-stream-props-builder
  "The kinesis-stream-props-builder function buildes out new instances of 
KinesisStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `partitionKeyPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key-path` |"
  [stack id config]
  (let [builder (KinesisStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :partition-key-path)]
      (. builder partitionKeyPath data))
    (.build builder)))


(defn lambda-function-builder
  "The lambda-function-builder function buildes out new instances of 
LambdaFunction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (LambdaFunction$Builder/create ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :event)]
      (. builder event data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn lambda-function-props-builder
  "The lambda-function-props-builder function buildes out new instances of 
LambdaFunctionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (LambdaFunctionProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :event)]
      (. builder event data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn log-group-props-builder
  "The log-group-props-builder function buildes out new instances of 
LogGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `event` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:event` |
| `installLatestAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-latest-aws-sdk` |
| `logEvent` | software.amazon.awscdk.services.events.targets.LogGroupTargetInput | [[cdk.support/lookup-entry]] | `:log-event` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (LogGroupProps$Builder.)]
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
    (.build builder)))


(defn log-group-target-input-options-builder
  "The log-group-target-input-options-builder function buildes out new instances of 
LogGroupTargetInputOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.Object | [[cdk.support/lookup-entry]] | `:message` |
| `timestamp` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timestamp` |"
  [stack id config]
  (let [builder (LogGroupTargetInputOptions$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :timestamp)]
      (. builder timestamp data))
    (.build builder)))


(defn sfn-state-machine-builder
  "The sfn-state-machine-builder function buildes out new instances of 
SfnStateMachine$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `input` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:input` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config ^software.amazon.awscdk.services.stepfunctions.IStateMachine state-machine]
  (let [builder (SfnStateMachine$Builder/create ^software.amazon.awscdk.services.stepfunctions.IStateMachine state-machine)]
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
    (.build builder)))


(defn sfn-state-machine-props-builder
  "The sfn-state-machine-props-builder function buildes out new instances of 
SfnStateMachineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `input` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:input` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (SfnStateMachineProps$Builder.)]
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
    (.build builder)))


(defn sns-topic-builder
  "The sns-topic-builder function buildes out new instances of 
SnsTopic$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.sns.ITopic topic]
  (let [builder (SnsTopic$Builder/create ^software.amazon.awscdk.services.sns.ITopic topic)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn sns-topic-props-builder
  "The sns-topic-props-builder function buildes out new instances of 
SnsTopicProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (SnsTopicProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn sqs-queue-builder
  "The sqs-queue-builder function buildes out new instances of 
SqsQueue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config ^software.amazon.awscdk.services.sqs.IQueue queue]
  (let [builder (SqsQueue$Builder/create ^software.amazon.awscdk.services.sqs.IQueue queue)]
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
    (.build builder)))


(defn sqs-queue-props-builder
  "The sqs-queue-props-builder function buildes out new instances of 
SqsQueueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `message` | software.amazon.awscdk.services.events.RuleTargetInput | [[cdk.support/lookup-entry]] | `:message` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (SqsQueueProps$Builder.)]
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
    (.build builder)))


(defn tag-builder
  "The tag-builder function buildes out new instances of 
Tag$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (Tag$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn target-base-props-builder
  "The target-base-props-builder function buildes out new instances of 
TargetBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |"
  [stack id config]
  (let [builder (TargetBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (.build builder)))


(defn task-environment-variable-builder
  "The task-environment-variable-builder function buildes out new instances of 
TaskEnvironmentVariable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (TaskEnvironmentVariable$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))