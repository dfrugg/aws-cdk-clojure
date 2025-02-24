(ns cdk.api.services.pipes
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.pipes package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.pipes CfnPipe$AwsVpcConfigurationProperty$Builder
                                                  CfnPipe$BatchArrayPropertiesProperty$Builder
                                                  CfnPipe$BatchContainerOverridesProperty$Builder
                                                  CfnPipe$BatchEnvironmentVariableProperty$Builder
                                                  CfnPipe$BatchJobDependencyProperty$Builder
                                                  CfnPipe$BatchResourceRequirementProperty$Builder
                                                  CfnPipe$BatchRetryStrategyProperty$Builder
                                                  CfnPipe$Builder
                                                  CfnPipe$CapacityProviderStrategyItemProperty$Builder
                                                  CfnPipe$CloudwatchLogsLogDestinationProperty$Builder
                                                  CfnPipe$DeadLetterConfigProperty$Builder
                                                  CfnPipe$EcsContainerOverrideProperty$Builder
                                                  CfnPipe$EcsEnvironmentFileProperty$Builder
                                                  CfnPipe$EcsEnvironmentVariableProperty$Builder
                                                  CfnPipe$EcsEphemeralStorageProperty$Builder
                                                  CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder
                                                  CfnPipe$EcsResourceRequirementProperty$Builder
                                                  CfnPipe$EcsTaskOverrideProperty$Builder
                                                  CfnPipe$FilterCriteriaProperty$Builder
                                                  CfnPipe$FilterProperty$Builder
                                                  CfnPipe$FirehoseLogDestinationProperty$Builder
                                                  CfnPipe$MQBrokerAccessCredentialsProperty$Builder
                                                  CfnPipe$MSKAccessCredentialsProperty$Builder
                                                  CfnPipe$NetworkConfigurationProperty$Builder
                                                  CfnPipe$PipeEnrichmentHttpParametersProperty$Builder
                                                  CfnPipe$PipeEnrichmentParametersProperty$Builder
                                                  CfnPipe$PipeLogConfigurationProperty$Builder
                                                  CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder
                                                  CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder
                                                  CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder
                                                  CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder
                                                  CfnPipe$PipeSourceParametersProperty$Builder
                                                  CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder
                                                  CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder
                                                  CfnPipe$PipeSourceSqsQueueParametersProperty$Builder
                                                  CfnPipe$PipeTargetBatchJobParametersProperty$Builder
                                                  CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder
                                                  CfnPipe$PipeTargetEcsTaskParametersProperty$Builder
                                                  CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder
                                                  CfnPipe$PipeTargetHttpParametersProperty$Builder
                                                  CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder
                                                  CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder
                                                  CfnPipe$PipeTargetParametersProperty$Builder
                                                  CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder
                                                  CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder
                                                  CfnPipe$PipeTargetSqsQueueParametersProperty$Builder
                                                  CfnPipe$PipeTargetStateMachineParametersProperty$Builder
                                                  CfnPipe$PlacementConstraintProperty$Builder
                                                  CfnPipe$PlacementStrategyProperty$Builder
                                                  CfnPipe$S3LogDestinationProperty$Builder
                                                  CfnPipe$SageMakerPipelineParameterProperty$Builder
                                                  CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder
                                                  CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder
                                                  CfnPipeProps$Builder]))


(defn build-cfn-pipe-aws-vpc-configuration-property-builder
  "The build-cfn-pipe-aws-vpc-configuration-property-builder function updates a CfnPipe$AwsVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$AwsVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnPipe$AwsVpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-pipe-aws-vpc-configuration-property-builder
  ""
  [id config]
  (build-cfn-pipe-aws-vpc-configuration-property-builder (new CfnPipe$AwsVpcConfigurationProperty$Builder) id config))


(defn build-cfn-pipe-batch-array-properties-property-builder
  "The build-cfn-pipe-batch-array-properties-property-builder function updates a CfnPipe$BatchArrayPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$BatchArrayPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^CfnPipe$BatchArrayPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn cfn-pipe-batch-array-properties-property-builder
  ""
  [id config]
  (build-cfn-pipe-batch-array-properties-property-builder (new CfnPipe$BatchArrayPropertiesProperty$Builder) id config))


(defn build-cfn-pipe-batch-container-overrides-property-builder
  "The build-cfn-pipe-batch-container-overrides-property-builder function updates a CfnPipe$BatchContainerOverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$BatchContainerOverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `resourceRequirements` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-requirements` |
"
  [^CfnPipe$BatchContainerOverridesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :command)]
    (. builder command data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :resource-requirements)]
    (. builder resourceRequirements data))
  (.build builder))


(defn cfn-pipe-batch-container-overrides-property-builder
  ""
  [id config]
  (build-cfn-pipe-batch-container-overrides-property-builder (new CfnPipe$BatchContainerOverridesProperty$Builder) id config))


(defn build-cfn-pipe-batch-environment-variable-property-builder
  "The build-cfn-pipe-batch-environment-variable-property-builder function updates a CfnPipe$BatchEnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$BatchEnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipe$BatchEnvironmentVariableProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipe-batch-environment-variable-property-builder
  ""
  [id config]
  (build-cfn-pipe-batch-environment-variable-property-builder (new CfnPipe$BatchEnvironmentVariableProperty$Builder) id config))


(defn build-cfn-pipe-batch-job-dependency-property-builder
  "The build-cfn-pipe-batch-job-dependency-property-builder function updates a CfnPipe$BatchJobDependencyProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$BatchJobDependencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPipe$BatchJobDependencyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :job-id)]
    (. builder jobId data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-pipe-batch-job-dependency-property-builder
  ""
  [id config]
  (build-cfn-pipe-batch-job-dependency-property-builder (new CfnPipe$BatchJobDependencyProperty$Builder) id config))


(defn build-cfn-pipe-batch-resource-requirement-property-builder
  "The build-cfn-pipe-batch-resource-requirement-property-builder function updates a CfnPipe$BatchResourceRequirementProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$BatchResourceRequirementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipe$BatchResourceRequirementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipe-batch-resource-requirement-property-builder
  ""
  [id config]
  (build-cfn-pipe-batch-resource-requirement-property-builder (new CfnPipe$BatchResourceRequirementProperty$Builder) id config))


(defn build-cfn-pipe-batch-retry-strategy-property-builder
  "The build-cfn-pipe-batch-retry-strategy-property-builder function updates a CfnPipe$BatchRetryStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$BatchRetryStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
"
  [^CfnPipe$BatchRetryStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (.build builder))


(defn cfn-pipe-batch-retry-strategy-property-builder
  ""
  [id config]
  (build-cfn-pipe-batch-retry-strategy-property-builder (new CfnPipe$BatchRetryStrategyProperty$Builder) id config))


(defn build-cfn-pipe-builder
  "The build-cfn-pipe-builder function updates a CfnPipe$Builder instance using the provided configuration.
  The function takes the CfnPipe$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `enrichment` | java.lang.String | [[cdk.support/lookup-entry]] | `:enrichment` |
| `enrichmentParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeEnrichmentParametersProperty | [[cdk.support/lookup-entry]] | `:enrichment-parameters` |
| `logConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourceParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-parameters` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `targetParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-parameters` |
"
  [^CfnPipe$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :desired-state)]
    (. builder desiredState data))
  (when-let [data (lookup-entry config id :enrichment)]
    (. builder enrichment data))
  (when-let [data (lookup-entry config id :enrichment-parameters)]
    (. builder enrichmentParameters data))
  (when-let [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :source-parameters)]
    (. builder sourceParameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :target-parameters)]
    (. builder targetParameters data))
  (.build builder))


(defn cfn-pipe-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-pipe-builder (CfnPipe$Builder/create scope (name id)) id config))


(defn build-cfn-pipe-capacity-provider-strategy-item-property-builder
  "The build-cfn-pipe-capacity-provider-strategy-item-property-builder function updates a CfnPipe$CapacityProviderStrategyItemProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$CapacityProviderStrategyItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnPipe$CapacityProviderStrategyItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-pipe-capacity-provider-strategy-item-property-builder
  ""
  [id config]
  (build-cfn-pipe-capacity-provider-strategy-item-property-builder (new CfnPipe$CapacityProviderStrategyItemProperty$Builder) id config))


(defn build-cfn-pipe-cloudwatch-logs-log-destination-property-builder
  "The build-cfn-pipe-cloudwatch-logs-log-destination-property-builder function updates a CfnPipe$CloudwatchLogsLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$CloudwatchLogsLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
"
  [^CfnPipe$CloudwatchLogsLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-arn)]
    (. builder logGroupArn data))
  (.build builder))


(defn cfn-pipe-cloudwatch-logs-log-destination-property-builder
  ""
  [id config]
  (build-cfn-pipe-cloudwatch-logs-log-destination-property-builder (new CfnPipe$CloudwatchLogsLogDestinationProperty$Builder) id config))


(defn build-cfn-pipe-dead-letter-config-property-builder
  "The build-cfn-pipe-dead-letter-config-property-builder function updates a CfnPipe$DeadLetterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$DeadLetterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnPipe$DeadLetterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-pipe-dead-letter-config-property-builder
  ""
  [id config]
  (build-cfn-pipe-dead-letter-config-property-builder (new CfnPipe$DeadLetterConfigProperty$Builder) id config))


(defn build-cfn-pipe-ecs-container-override-property-builder
  "The build-cfn-pipe-ecs-container-override-property-builder function updates a CfnPipe$EcsContainerOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsContainerOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-files` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceRequirements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-requirements` |
"
  [^CfnPipe$EcsContainerOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :command)]
    (. builder command data))
  (when-let [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-files)]
    (. builder environmentFiles data))
  (when-let [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-let [data (lookup-entry config id :memory-reservation)]
    (. builder memoryReservation data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resource-requirements)]
    (. builder resourceRequirements data))
  (.build builder))


(defn cfn-pipe-ecs-container-override-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-container-override-property-builder (new CfnPipe$EcsContainerOverrideProperty$Builder) id config))


(defn build-cfn-pipe-ecs-environment-file-property-builder
  "The build-cfn-pipe-ecs-environment-file-property-builder function updates a CfnPipe$EcsEnvironmentFileProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsEnvironmentFileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipe$EcsEnvironmentFileProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipe-ecs-environment-file-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-environment-file-property-builder (new CfnPipe$EcsEnvironmentFileProperty$Builder) id config))


(defn build-cfn-pipe-ecs-environment-variable-property-builder
  "The build-cfn-pipe-ecs-environment-variable-property-builder function updates a CfnPipe$EcsEnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsEnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipe$EcsEnvironmentVariableProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipe-ecs-environment-variable-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-environment-variable-property-builder (new CfnPipe$EcsEnvironmentVariableProperty$Builder) id config))


(defn build-cfn-pipe-ecs-ephemeral-storage-property-builder
  "The build-cfn-pipe-ecs-ephemeral-storage-property-builder function updates a CfnPipe$EcsEphemeralStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsEphemeralStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |
"
  [^CfnPipe$EcsEphemeralStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :size-in-gi-b)]
    (. builder sizeInGiB data))
  (.build builder))


(defn cfn-pipe-ecs-ephemeral-storage-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-ephemeral-storage-property-builder (new CfnPipe$EcsEphemeralStorageProperty$Builder) id config))


(defn build-cfn-pipe-ecs-inference-accelerator-override-property-builder
  "The build-cfn-pipe-ecs-inference-accelerator-override-property-builder function updates a CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |
"
  [^CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-let [data (lookup-entry config id :device-type)]
    (. builder deviceType data))
  (.build builder))


(defn cfn-pipe-ecs-inference-accelerator-override-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-inference-accelerator-override-property-builder (new CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder) id config))


(defn build-cfn-pipe-ecs-resource-requirement-property-builder
  "The build-cfn-pipe-ecs-resource-requirement-property-builder function updates a CfnPipe$EcsResourceRequirementProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsResourceRequirementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipe$EcsResourceRequirementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipe-ecs-resource-requirement-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-resource-requirement-property-builder (new CfnPipe$EcsResourceRequirementProperty$Builder) id config))


(defn build-cfn-pipe-ecs-task-override-property-builder
  "The build-cfn-pipe-ecs-task-override-property-builder function updates a CfnPipe$EcsTaskOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$EcsTaskOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `inferenceAcceleratorOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-overrides` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
| `taskRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-role-arn` |
"
  [^CfnPipe$EcsTaskOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-let [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-let [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :inference-accelerator-overrides)]
    (. builder inferenceAcceleratorOverrides data))
  (when-let [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-let [data (lookup-entry config id :task-role-arn)]
    (. builder taskRoleArn data))
  (.build builder))


(defn cfn-pipe-ecs-task-override-property-builder
  ""
  [id config]
  (build-cfn-pipe-ecs-task-override-property-builder (new CfnPipe$EcsTaskOverrideProperty$Builder) id config))


(defn build-cfn-pipe-filter-criteria-property-builder
  "The build-cfn-pipe-filter-criteria-property-builder function updates a CfnPipe$FilterCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$FilterCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^CfnPipe$FilterCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn cfn-pipe-filter-criteria-property-builder
  ""
  [id config]
  (build-cfn-pipe-filter-criteria-property-builder (new CfnPipe$FilterCriteriaProperty$Builder) id config))


(defn build-cfn-pipe-filter-property-builder
  "The build-cfn-pipe-filter-property-builder function updates a CfnPipe$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnPipe$FilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-pipe-filter-property-builder
  ""
  [id config]
  (build-cfn-pipe-filter-property-builder (new CfnPipe$FilterProperty$Builder) id config))


(defn build-cfn-pipe-firehose-log-destination-property-builder
  "The build-cfn-pipe-firehose-log-destination-property-builder function updates a CfnPipe$FirehoseLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$FirehoseLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-arn` |
"
  [^CfnPipe$FirehoseLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream-arn)]
    (. builder deliveryStreamArn data))
  (.build builder))


(defn cfn-pipe-firehose-log-destination-property-builder
  ""
  [id config]
  (build-cfn-pipe-firehose-log-destination-property-builder (new CfnPipe$FirehoseLogDestinationProperty$Builder) id config))


(defn build-cfn-pipe-mq-broker-access-credentials-property-builder
  "The build-cfn-pipe-mq-broker-access-credentials-property-builder function updates a CfnPipe$MQBrokerAccessCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$MQBrokerAccessCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:basic-auth` |
"
  [^CfnPipe$MQBrokerAccessCredentialsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :basic-auth)]
    (. builder basicAuth data))
  (.build builder))


(defn cfn-pipe-mq-broker-access-credentials-property-builder
  ""
  [id config]
  (build-cfn-pipe-mq-broker-access-credentials-property-builder (new CfnPipe$MQBrokerAccessCredentialsProperty$Builder) id config))


(defn build-cfn-pipe-msk-access-credentials-property-builder
  "The build-cfn-pipe-msk-access-credentials-property-builder function updates a CfnPipe$MSKAccessCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$MSKAccessCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientCertificateTlsAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-tls-auth` |
| `saslScram512Auth` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-scram512-auth` |
"
  [^CfnPipe$MSKAccessCredentialsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-certificate-tls-auth)]
    (. builder clientCertificateTlsAuth data))
  (when-let [data (lookup-entry config id :sasl-scram512-auth)]
    (. builder saslScram512Auth data))
  (.build builder))


(defn cfn-pipe-msk-access-credentials-property-builder
  ""
  [id config]
  (build-cfn-pipe-msk-access-credentials-property-builder (new CfnPipe$MSKAccessCredentialsProperty$Builder) id config))


(defn build-cfn-pipe-network-configuration-property-builder
  "The build-cfn-pipe-network-configuration-property-builder function updates a CfnPipe$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsvpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:awsvpc-configuration` |
"
  [^CfnPipe$NetworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :awsvpc-configuration)]
    (. builder awsvpcConfiguration data))
  (.build builder))


(defn cfn-pipe-network-configuration-property-builder
  ""
  [id config]
  (build-cfn-pipe-network-configuration-property-builder (new CfnPipe$NetworkConfigurationProperty$Builder) id config))


(defn build-cfn-pipe-pipe-enrichment-http-parameters-property-builder
  "The build-cfn-pipe-pipe-enrichment-http-parameters-property-builder function updates a CfnPipe$PipeEnrichmentHttpParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeEnrichmentHttpParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^CfnPipe$PipeEnrichmentHttpParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (.build builder))


(defn cfn-pipe-pipe-enrichment-http-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-enrichment-http-parameters-property-builder (new CfnPipe$PipeEnrichmentHttpParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-enrichment-parameters-property-builder
  "The build-cfn-pipe-pipe-enrichment-parameters-property-builder function updates a CfnPipe$PipeEnrichmentParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeEnrichmentParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeEnrichmentHttpParametersProperty | [[cdk.support/lookup-entry]] | `:http-parameters` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |
"
  [^CfnPipe$PipeEnrichmentParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :http-parameters)]
    (. builder httpParameters data))
  (when-let [data (lookup-entry config id :input-template)]
    (. builder inputTemplate data))
  (.build builder))


(defn cfn-pipe-pipe-enrichment-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-enrichment-parameters-property-builder (new CfnPipe$PipeEnrichmentParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-log-configuration-property-builder
  "The build-cfn-pipe-pipe-log-configuration-property-builder function updates a CfnPipe$PipeLogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeLogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudwatchLogsLogDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-log-destination` |
| `firehoseLogDestination` | software.amazon.awscdk.services.pipes.CfnPipe$FirehoseLogDestinationProperty | [[cdk.support/lookup-entry]] | `:firehose-log-destination` |
| `includeExecutionData` | java.util.List | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `s3LogDestination` | software.amazon.awscdk.services.pipes.CfnPipe$S3LogDestinationProperty | [[cdk.support/lookup-entry]] | `:s3-log-destination` |
"
  [^CfnPipe$PipeLogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloudwatch-logs-log-destination)]
    (. builder cloudwatchLogsLogDestination data))
  (when-let [data (lookup-entry config id :firehose-log-destination)]
    (. builder firehoseLogDestination data))
  (when-let [data (lookup-entry config id :include-execution-data)]
    (. builder includeExecutionData data))
  (when-let [data (lookup-entry config id :level)]
    (. builder level data))
  (when-let [data (lookup-entry config id :s3-log-destination)]
    (. builder s3LogDestination data))
  (.build builder))


(defn cfn-pipe-pipe-log-configuration-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-log-configuration-property-builder (new CfnPipe$PipeLogConfigurationProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-active-mq-broker-parameters-property-builder
  "The build-cfn-pipe-pipe-source-active-mq-broker-parameters-property-builder function updates a CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `credentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
"
  [^CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (.build builder))


(defn cfn-pipe-pipe-source-active-mq-broker-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-active-mq-broker-parameters-property-builder (new CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-dynamo-db-stream-parameters-property-builder
  "The build-cfn-pipe-pipe-source-dynamo-db-stream-parameters-property-builder function updates a CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `deadLetterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `maximumRecordAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-record-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `onPartialBatchItemFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-partial-batch-item-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
"
  [^CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :dead-letter-config)]
    (. builder deadLetterConfig data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :maximum-record-age-in-seconds)]
    (. builder maximumRecordAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :on-partial-batch-item-failure)]
    (. builder onPartialBatchItemFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (.build builder))


(defn cfn-pipe-pipe-source-dynamo-db-stream-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-dynamo-db-stream-parameters-property-builder (new CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-kinesis-stream-parameters-property-builder
  "The build-cfn-pipe-pipe-source-kinesis-stream-parameters-property-builder function updates a CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `deadLetterConfig` | software.amazon.awscdk.services.pipes.CfnPipe$DeadLetterConfigProperty | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `maximumRecordAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-record-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `onPartialBatchItemFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-partial-batch-item-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `startingPositionTimestamp` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |
"
  [^CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :dead-letter-config)]
    (. builder deadLetterConfig data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :maximum-record-age-in-seconds)]
    (. builder maximumRecordAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (when-let [data (lookup-entry config id :on-partial-batch-item-failure)]
    (. builder onPartialBatchItemFailure data))
  (when-let [data (lookup-entry config id :parallelization-factor)]
    (. builder parallelizationFactor data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :starting-position-timestamp)]
    (. builder startingPositionTimestamp data))
  (.build builder))


(defn cfn-pipe-pipe-source-kinesis-stream-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-kinesis-stream-parameters-property-builder (new CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-managed-streaming-kafka-parameters-property-builder
  "The build-cfn-pipe-pipe-source-managed-streaming-kafka-parameters-property-builder function updates a CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `credentials` | software.amazon.awscdk.services.pipes.CfnPipe$MSKAccessCredentialsProperty | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
"
  [^CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (.build builder))


(defn cfn-pipe-pipe-source-managed-streaming-kafka-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-managed-streaming-kafka-parameters-property-builder (new CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-parameters-property-builder
  "The build-cfn-pipe-pipe-source-parameters-property-builder function updates a CfnPipe$PipeSourceParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeMqBrokerParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active-mq-broker-parameters` |
| `dynamoDbStreamParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceDynamoDBStreamParametersProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-stream-parameters` |
| `filterCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `kinesisStreamParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceKinesisStreamParametersProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-parameters` |
| `managedStreamingKafkaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-streaming-kafka-parameters` |
| `rabbitMqBrokerParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceRabbitMQBrokerParametersProperty | [[cdk.support/lookup-entry]] | `:rabbit-mq-broker-parameters` |
| `selfManagedKafkaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-kafka-parameters` |
| `sqsQueueParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-queue-parameters` |
"
  [^CfnPipe$PipeSourceParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active-mq-broker-parameters)]
    (. builder activeMqBrokerParameters data))
  (when-let [data (lookup-entry config id :dynamo-db-stream-parameters)]
    (. builder dynamoDbStreamParameters data))
  (when-let [data (lookup-entry config id :filter-criteria)]
    (. builder filterCriteria data))
  (when-let [data (lookup-entry config id :kinesis-stream-parameters)]
    (. builder kinesisStreamParameters data))
  (when-let [data (lookup-entry config id :managed-streaming-kafka-parameters)]
    (. builder managedStreamingKafkaParameters data))
  (when-let [data (lookup-entry config id :rabbit-mq-broker-parameters)]
    (. builder rabbitMqBrokerParameters data))
  (when-let [data (lookup-entry config id :self-managed-kafka-parameters)]
    (. builder selfManagedKafkaParameters data))
  (when-let [data (lookup-entry config id :sqs-queue-parameters)]
    (. builder sqsQueueParameters data))
  (.build builder))


(defn cfn-pipe-pipe-source-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-parameters-property-builder (new CfnPipe$PipeSourceParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-rabbit-mq-broker-parameters-property-builder
  "The build-cfn-pipe-pipe-source-rabbit-mq-broker-parameters-property-builder function updates a CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `credentials` | software.amazon.awscdk.services.pipes.CfnPipe$MQBrokerAccessCredentialsProperty | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `virtualHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-host` |
"
  [^CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :queue-name)]
    (. builder queueName data))
  (when-let [data (lookup-entry config id :virtual-host)]
    (. builder virtualHost data))
  (.build builder))


(defn cfn-pipe-pipe-source-rabbit-mq-broker-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-rabbit-mq-broker-parameters-property-builder (new CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-self-managed-kafka-parameters-property-builder
  "The build-cfn-pipe-pipe-source-self-managed-kafka-parameters-property-builder function updates a CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalBootstrapServers` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-bootstrap-servers` |
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `credentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `serverRootCaCertificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-root-ca-certificate` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-bootstrap-servers)]
    (. builder additionalBootstrapServers data))
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :consumer-group-id)]
    (. builder consumerGroupId data))
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (when-let [data (lookup-entry config id :server-root-ca-certificate)]
    (. builder serverRootCaCertificate data))
  (when-let [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn cfn-pipe-pipe-source-self-managed-kafka-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-self-managed-kafka-parameters-property-builder (new CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-source-sqs-queue-parameters-property-builder
  "The build-cfn-pipe-pipe-source-sqs-queue-parameters-property-builder function updates a CfnPipe$PipeSourceSqsQueueParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeSourceSqsQueueParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
"
  [^CfnPipe$PipeSourceSqsQueueParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-size)]
    (. builder batchSize data))
  (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
    (. builder maximumBatchingWindowInSeconds data))
  (.build builder))


(defn cfn-pipe-pipe-source-sqs-queue-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-source-sqs-queue-parameters-property-builder (new CfnPipe$PipeSourceSqsQueueParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-batch-job-parameters-property-builder
  "The build-cfn-pipe-pipe-target-batch-job-parameters-property-builder function updates a CfnPipe$PipeTargetBatchJobParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetBatchJobParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arrayProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:array-properties` |
| `containerOverrides` | software.amazon.awscdk.services.pipes.CfnPipe$BatchContainerOverridesProperty | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `dependsOn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:depends-on` |
| `jobDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `retryStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-strategy` |
"
  [^CfnPipe$PipeTargetBatchJobParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :array-properties)]
    (. builder arrayProperties data))
  (when-let [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-let [data (lookup-entry config id :depends-on)]
    (. builder dependsOn data))
  (when-let [data (lookup-entry config id :job-definition)]
    (. builder jobDefinition data))
  (when-let [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :retry-strategy)]
    (. builder retryStrategy data))
  (.build builder))


(defn cfn-pipe-pipe-target-batch-job-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-batch-job-parameters-property-builder (new CfnPipe$PipeTargetBatchJobParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-cloud-watch-logs-parameters-property-builder
  "The build-cfn-pipe-pipe-target-cloud-watch-logs-parameters-property-builder function updates a CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
| `timestamp` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp` |
"
  [^CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-stream-name)]
    (. builder logStreamName data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (.build builder))


(defn cfn-pipe-pipe-target-cloud-watch-logs-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-cloud-watch-logs-parameters-property-builder (new CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-ecs-task-parameters-property-builder
  "The build-cfn-pipe-pipe-target-ecs-task-parameters-property-builder function updates a CfnPipe$PipeTargetEcsTaskParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetEcsTaskParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategy` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `networkConfiguration` | software.amazon.awscdk.services.pipes.CfnPipe$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `overrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overrides` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-strategy` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `referenceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:task-count` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
"
  [^CfnPipe$PipeTargetEcsTaskParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-provider-strategy)]
    (. builder capacityProviderStrategy data))
  (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-let [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-let [data (lookup-entry config id :group)]
    (. builder group data))
  (when-let [data (lookup-entry config id :launch-type)]
    (. builder launchType data))
  (when-let [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-let [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-let [data (lookup-entry config id :placement-strategy)]
    (. builder placementStrategy data))
  (when-let [data (lookup-entry config id :platform-version)]
    (. builder platformVersion data))
  (when-let [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-let [data (lookup-entry config id :reference-id)]
    (. builder referenceId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task-count)]
    (. builder taskCount data))
  (when-let [data (lookup-entry config id :task-definition-arn)]
    (. builder taskDefinitionArn data))
  (.build builder))


(defn cfn-pipe-pipe-target-ecs-task-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-ecs-task-parameters-property-builder (new CfnPipe$PipeTargetEcsTaskParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-event-bridge-event-bus-parameters-property-builder
  "The build-cfn-pipe-pipe-target-event-bridge-event-bus-parameters-property-builder function updates a CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `time` | java.lang.String | [[cdk.support/lookup-entry]] | `:time` |
"
  [^CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :detail-type)]
    (. builder detailType data))
  (when-let [data (lookup-entry config id :endpoint-id)]
    (. builder endpointId data))
  (when-let [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :time)]
    (. builder time data))
  (.build builder))


(defn cfn-pipe-pipe-target-event-bridge-event-bus-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-event-bridge-event-bus-parameters-property-builder (new CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-http-parameters-property-builder
  "The build-cfn-pipe-pipe-target-http-parameters-property-builder function updates a CfnPipe$PipeTargetHttpParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetHttpParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
"
  [^CfnPipe$PipeTargetHttpParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header-parameters)]
    (. builder headerParameters data))
  (when-let [data (lookup-entry config id :path-parameter-values)]
    (. builder pathParameterValues data))
  (when-let [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (.build builder))


(defn cfn-pipe-pipe-target-http-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-http-parameters-property-builder (new CfnPipe$PipeTargetHttpParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-kinesis-stream-parameters-property-builder
  "The build-cfn-pipe-pipe-target-kinesis-stream-parameters-property-builder function updates a CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key` |
"
  [^CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :partition-key)]
    (. builder partitionKey data))
  (.build builder))


(defn cfn-pipe-pipe-target-kinesis-stream-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-kinesis-stream-parameters-property-builder (new CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-lambda-function-parameters-property-builder
  "The build-cfn-pipe-pipe-target-lambda-function-parameters-property-builder function updates a CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |
"
  [^CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invocation-type)]
    (. builder invocationType data))
  (.build builder))


(defn cfn-pipe-pipe-target-lambda-function-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-lambda-function-parameters-property-builder (new CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-parameters-property-builder
  "The build-cfn-pipe-pipe-target-parameters-property-builder function updates a CfnPipe$PipeTargetParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchJobParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetBatchJobParametersProperty | [[cdk.support/lookup-entry]] | `:batch-job-parameters` |
| `cloudWatchLogsParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetCloudWatchLogsParametersProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-parameters` |
| `ecsTaskParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecs-task-parameters` |
| `eventBridgeEventBusParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetEventBridgeEventBusParametersProperty | [[cdk.support/lookup-entry]] | `:event-bridge-event-bus-parameters` |
| `httpParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetHttpParametersProperty | [[cdk.support/lookup-entry]] | `:http-parameters` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |
| `kinesisStreamParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetKinesisStreamParametersProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-parameters` |
| `lambdaFunctionParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetLambdaFunctionParametersProperty | [[cdk.support/lookup-entry]] | `:lambda-function-parameters` |
| `redshiftDataParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redshift-data-parameters` |
| `sageMakerPipelineParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sage-maker-pipeline-parameters` |
| `sqsQueueParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-queue-parameters` |
| `stepFunctionStateMachineParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-function-state-machine-parameters` |
"
  [^CfnPipe$PipeTargetParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-job-parameters)]
    (. builder batchJobParameters data))
  (when-let [data (lookup-entry config id :cloud-watch-logs-parameters)]
    (. builder cloudWatchLogsParameters data))
  (when-let [data (lookup-entry config id :ecs-task-parameters)]
    (. builder ecsTaskParameters data))
  (when-let [data (lookup-entry config id :event-bridge-event-bus-parameters)]
    (. builder eventBridgeEventBusParameters data))
  (when-let [data (lookup-entry config id :http-parameters)]
    (. builder httpParameters data))
  (when-let [data (lookup-entry config id :input-template)]
    (. builder inputTemplate data))
  (when-let [data (lookup-entry config id :kinesis-stream-parameters)]
    (. builder kinesisStreamParameters data))
  (when-let [data (lookup-entry config id :lambda-function-parameters)]
    (. builder lambdaFunctionParameters data))
  (when-let [data (lookup-entry config id :redshift-data-parameters)]
    (. builder redshiftDataParameters data))
  (when-let [data (lookup-entry config id :sage-maker-pipeline-parameters)]
    (. builder sageMakerPipelineParameters data))
  (when-let [data (lookup-entry config id :sqs-queue-parameters)]
    (. builder sqsQueueParameters data))
  (when-let [data (lookup-entry config id :step-function-state-machine-parameters)]
    (. builder stepFunctionStateMachineParameters data))
  (.build builder))


(defn cfn-pipe-pipe-target-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-parameters-property-builder (new CfnPipe$PipeTargetParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-redshift-data-parameters-property-builder
  "The build-cfn-pipe-pipe-target-redshift-data-parameters-property-builder function updates a CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `dbUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-user` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `sqls` | java.util.List | [[cdk.support/lookup-entry]] | `:sqls` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `withEvent` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:with-event` |
"
  [^CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database)]
    (. builder database data))
  (when-let [data (lookup-entry config id :db-user)]
    (. builder dbUser data))
  (when-let [data (lookup-entry config id :secret-manager-arn)]
    (. builder secretManagerArn data))
  (when-let [data (lookup-entry config id :sqls)]
    (. builder sqls data))
  (when-let [data (lookup-entry config id :statement-name)]
    (. builder statementName data))
  (when-let [data (lookup-entry config id :with-event)]
    (. builder withEvent data))
  (.build builder))


(defn cfn-pipe-pipe-target-redshift-data-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-redshift-data-parameters-property-builder (new CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-sage-maker-pipeline-parameters-property-builder
  "The build-cfn-pipe-pipe-target-sage-maker-pipeline-parameters-property-builder function updates a CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineParameterList` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-parameter-list` |
"
  [^CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pipeline-parameter-list)]
    (. builder pipelineParameterList data))
  (.build builder))


(defn cfn-pipe-pipe-target-sage-maker-pipeline-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-sage-maker-pipeline-parameters-property-builder (new CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-sqs-queue-parameters-property-builder
  "The build-cfn-pipe-pipe-target-sqs-queue-parameters-property-builder function updates a CfnPipe$PipeTargetSqsQueueParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetSqsQueueParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageDeduplicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-deduplication-id` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
"
  [^CfnPipe$PipeTargetSqsQueueParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :message-deduplication-id)]
    (. builder messageDeduplicationId data))
  (when-let [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (.build builder))


(defn cfn-pipe-pipe-target-sqs-queue-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-sqs-queue-parameters-property-builder (new CfnPipe$PipeTargetSqsQueueParametersProperty$Builder) id config))


(defn build-cfn-pipe-pipe-target-state-machine-parameters-property-builder
  "The build-cfn-pipe-pipe-target-state-machine-parameters-property-builder function updates a CfnPipe$PipeTargetStateMachineParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PipeTargetStateMachineParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |
"
  [^CfnPipe$PipeTargetStateMachineParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invocation-type)]
    (. builder invocationType data))
  (.build builder))


(defn cfn-pipe-pipe-target-state-machine-parameters-property-builder
  ""
  [id config]
  (build-cfn-pipe-pipe-target-state-machine-parameters-property-builder (new CfnPipe$PipeTargetStateMachineParametersProperty$Builder) id config))


(defn build-cfn-pipe-placement-constraint-property-builder
  "The build-cfn-pipe-placement-constraint-property-builder function updates a CfnPipe$PlacementConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PlacementConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPipe$PlacementConstraintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-pipe-placement-constraint-property-builder
  ""
  [id config]
  (build-cfn-pipe-placement-constraint-property-builder (new CfnPipe$PlacementConstraintProperty$Builder) id config))


(defn build-cfn-pipe-placement-strategy-property-builder
  "The build-cfn-pipe-placement-strategy-property-builder function updates a CfnPipe$PlacementStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$PlacementStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPipe$PlacementStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-pipe-placement-strategy-property-builder
  ""
  [id config]
  (build-cfn-pipe-placement-strategy-property-builder (new CfnPipe$PlacementStrategyProperty$Builder) id config))


(defn build-cfn-pipe-props-builder
  "The build-cfn-pipe-props-builder function updates a CfnPipeProps$Builder instance using the provided configuration.
  The function takes the CfnPipeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `enrichment` | java.lang.String | [[cdk.support/lookup-entry]] | `:enrichment` |
| `enrichmentParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeEnrichmentParametersProperty | [[cdk.support/lookup-entry]] | `:enrichment-parameters` |
| `logConfiguration` | software.amazon.awscdk.services.pipes.CfnPipe$PipeLogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourceParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceParametersProperty | [[cdk.support/lookup-entry]] | `:source-parameters` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `targetParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetParametersProperty | [[cdk.support/lookup-entry]] | `:target-parameters` |
"
  [^CfnPipeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :desired-state)]
    (. builder desiredState data))
  (when-let [data (lookup-entry config id :enrichment)]
    (. builder enrichment data))
  (when-let [data (lookup-entry config id :enrichment-parameters)]
    (. builder enrichmentParameters data))
  (when-let [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :source-parameters)]
    (. builder sourceParameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :target-parameters)]
    (. builder targetParameters data))
  (.build builder))


(defn cfn-pipe-props-builder
  ""
  [id config]
  (build-cfn-pipe-props-builder (new CfnPipeProps$Builder) id config))


(defn build-cfn-pipe-s3-log-destination-property-builder
  "The build-cfn-pipe-s3-log-destination-property-builder function updates a CfnPipe$S3LogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$S3LogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `outputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-format` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnPipe$S3LogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :bucket-owner)]
    (. builder bucketOwner data))
  (when-let [data (lookup-entry config id :output-format)]
    (. builder outputFormat data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-pipe-s3-log-destination-property-builder
  ""
  [id config]
  (build-cfn-pipe-s3-log-destination-property-builder (new CfnPipe$S3LogDestinationProperty$Builder) id config))


(defn build-cfn-pipe-sage-maker-pipeline-parameter-property-builder
  "The build-cfn-pipe-sage-maker-pipeline-parameter-property-builder function updates a CfnPipe$SageMakerPipelineParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$SageMakerPipelineParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipe$SageMakerPipelineParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipe-sage-maker-pipeline-parameter-property-builder
  ""
  [id config]
  (build-cfn-pipe-sage-maker-pipeline-parameter-property-builder (new CfnPipe$SageMakerPipelineParameterProperty$Builder) id config))


(defn build-cfn-pipe-self-managed-kafka-access-configuration-credentials-property-builder
  "The build-cfn-pipe-self-managed-kafka-access-configuration-credentials-property-builder function updates a CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:basic-auth` |
| `clientCertificateTlsAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-tls-auth` |
| `saslScram256Auth` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-scram256-auth` |
| `saslScram512Auth` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-scram512-auth` |
"
  [^CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :basic-auth)]
    (. builder basicAuth data))
  (when-let [data (lookup-entry config id :client-certificate-tls-auth)]
    (. builder clientCertificateTlsAuth data))
  (when-let [data (lookup-entry config id :sasl-scram256-auth)]
    (. builder saslScram256Auth data))
  (when-let [data (lookup-entry config id :sasl-scram512-auth)]
    (. builder saslScram512Auth data))
  (.build builder))


(defn cfn-pipe-self-managed-kafka-access-configuration-credentials-property-builder
  ""
  [id config]
  (build-cfn-pipe-self-managed-kafka-access-configuration-credentials-property-builder (new CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder) id config))


(defn build-cfn-pipe-self-managed-kafka-access-configuration-vpc-property-builder
  "The build-cfn-pipe-self-managed-kafka-access-configuration-vpc-property-builder function updates a CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder instance using the provided configuration.
  The function takes the CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroup` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-pipe-self-managed-kafka-access-configuration-vpc-property-builder
  ""
  [id config]
  (build-cfn-pipe-self-managed-kafka-access-configuration-vpc-property-builder (new CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder) id config))