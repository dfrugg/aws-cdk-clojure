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


(defn cfn-pipe-aws-vpc-configuration-property-builder
  "The cfn-pipe-aws-vpc-configuration-property-builder function buildes out new instances of 
CfnPipe$AwsVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnPipe$AwsVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-pipe-batch-array-properties-property-builder
  "The cfn-pipe-batch-array-properties-property-builder function buildes out new instances of 
CfnPipe$BatchArrayPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (CfnPipe$BatchArrayPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn cfn-pipe-batch-container-overrides-property-builder
  "The cfn-pipe-batch-container-overrides-property-builder function buildes out new instances of 
CfnPipe$BatchContainerOverridesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `resourceRequirements` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-requirements` |"
  [stack id config]
  (let [builder (CfnPipe$BatchContainerOverridesProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :resource-requirements)]
      (. builder resourceRequirements data))
    (.build builder)))


(defn cfn-pipe-batch-environment-variable-property-builder
  "The cfn-pipe-batch-environment-variable-property-builder function buildes out new instances of 
CfnPipe$BatchEnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipe$BatchEnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipe-batch-job-dependency-property-builder
  "The cfn-pipe-batch-job-dependency-property-builder function buildes out new instances of 
CfnPipe$BatchJobDependencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPipe$BatchJobDependencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :job-id)]
      (. builder jobId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-pipe-batch-resource-requirement-property-builder
  "The cfn-pipe-batch-resource-requirement-property-builder function buildes out new instances of 
CfnPipe$BatchResourceRequirementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipe$BatchResourceRequirementProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipe-batch-retry-strategy-property-builder
  "The cfn-pipe-batch-retry-strategy-property-builder function buildes out new instances of 
CfnPipe$BatchRetryStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |"
  [stack id config]
  (let [builder (CfnPipe$BatchRetryStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :attempts)]
      (. builder attempts data))
    (.build builder)))


(defn cfn-pipe-builder
  "The cfn-pipe-builder function buildes out new instances of 
CfnPipe$Builder using the provided configuration.  Each field is set as follows:

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
| `targetParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-parameters` |"
  [stack id config]
  (let [builder (CfnPipe$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-pipe-capacity-provider-strategy-item-property-builder
  "The cfn-pipe-capacity-provider-strategy-item-property-builder function buildes out new instances of 
CfnPipe$CapacityProviderStrategyItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnPipe$CapacityProviderStrategyItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-pipe-cloudwatch-logs-log-destination-property-builder
  "The cfn-pipe-cloudwatch-logs-log-destination-property-builder function buildes out new instances of 
CfnPipe$CloudwatchLogsLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |"
  [stack id config]
  (let [builder (CfnPipe$CloudwatchLogsLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-arn)]
      (. builder logGroupArn data))
    (.build builder)))


(defn cfn-pipe-dead-letter-config-property-builder
  "The cfn-pipe-dead-letter-config-property-builder function buildes out new instances of 
CfnPipe$DeadLetterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnPipe$DeadLetterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-pipe-ecs-container-override-property-builder
  "The cfn-pipe-ecs-container-override-property-builder function buildes out new instances of 
CfnPipe$EcsContainerOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-files` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceRequirements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-requirements` |"
  [stack id config]
  (let [builder (CfnPipe$EcsContainerOverrideProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-ecs-environment-file-property-builder
  "The cfn-pipe-ecs-environment-file-property-builder function buildes out new instances of 
CfnPipe$EcsEnvironmentFileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipe$EcsEnvironmentFileProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipe-ecs-environment-variable-property-builder
  "The cfn-pipe-ecs-environment-variable-property-builder function buildes out new instances of 
CfnPipe$EcsEnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipe$EcsEnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipe-ecs-ephemeral-storage-property-builder
  "The cfn-pipe-ecs-ephemeral-storage-property-builder function buildes out new instances of 
CfnPipe$EcsEphemeralStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |"
  [stack id config]
  (let [builder (CfnPipe$EcsEphemeralStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :size-in-gi-b)]
      (. builder sizeInGiB data))
    (.build builder)))


(defn cfn-pipe-ecs-inference-accelerator-override-property-builder
  "The cfn-pipe-ecs-inference-accelerator-override-property-builder function buildes out new instances of 
CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |"
  [stack id config]
  (let [builder (CfnPipe$EcsInferenceAcceleratorOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :device-type)]
      (. builder deviceType data))
    (.build builder)))


(defn cfn-pipe-ecs-resource-requirement-property-builder
  "The cfn-pipe-ecs-resource-requirement-property-builder function buildes out new instances of 
CfnPipe$EcsResourceRequirementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipe$EcsResourceRequirementProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipe-ecs-task-override-property-builder
  "The cfn-pipe-ecs-task-override-property-builder function buildes out new instances of 
CfnPipe$EcsTaskOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `inferenceAcceleratorOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-overrides` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
| `taskRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-role-arn` |"
  [stack id config]
  (let [builder (CfnPipe$EcsTaskOverrideProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-filter-criteria-property-builder
  "The cfn-pipe-filter-criteria-property-builder function buildes out new instances of 
CfnPipe$FilterCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |"
  [stack id config]
  (let [builder (CfnPipe$FilterCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (.build builder)))


(defn cfn-pipe-filter-property-builder
  "The cfn-pipe-filter-property-builder function buildes out new instances of 
CfnPipe$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnPipe$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-pipe-firehose-log-destination-property-builder
  "The cfn-pipe-firehose-log-destination-property-builder function buildes out new instances of 
CfnPipe$FirehoseLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-arn` |"
  [stack id config]
  (let [builder (CfnPipe$FirehoseLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-arn)]
      (. builder deliveryStreamArn data))
    (.build builder)))


(defn cfn-pipe-mq-broker-access-credentials-property-builder
  "The cfn-pipe-mq-broker-access-credentials-property-builder function buildes out new instances of 
CfnPipe$MQBrokerAccessCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:basic-auth` |"
  [stack id config]
  (let [builder (CfnPipe$MQBrokerAccessCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :basic-auth)]
      (. builder basicAuth data))
    (.build builder)))


(defn cfn-pipe-msk-access-credentials-property-builder
  "The cfn-pipe-msk-access-credentials-property-builder function buildes out new instances of 
CfnPipe$MSKAccessCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientCertificateTlsAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-tls-auth` |
| `saslScram512Auth` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-scram512-auth` |"
  [stack id config]
  (let [builder (CfnPipe$MSKAccessCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-certificate-tls-auth)]
      (. builder clientCertificateTlsAuth data))
    (when-let [data (lookup-entry config id :sasl-scram512-auth)]
      (. builder saslScram512Auth data))
    (.build builder)))


(defn cfn-pipe-network-configuration-property-builder
  "The cfn-pipe-network-configuration-property-builder function buildes out new instances of 
CfnPipe$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsvpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:awsvpc-configuration` |"
  [stack id config]
  (let [builder (CfnPipe$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :awsvpc-configuration)]
      (. builder awsvpcConfiguration data))
    (.build builder)))


(defn cfn-pipe-pipe-enrichment-http-parameters-property-builder
  "The cfn-pipe-pipe-enrichment-http-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeEnrichmentHttpParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (CfnPipe$PipeEnrichmentHttpParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (lookup-entry config id :path-parameter-values)]
      (. builder pathParameterValues data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn cfn-pipe-pipe-enrichment-parameters-property-builder
  "The cfn-pipe-pipe-enrichment-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeEnrichmentParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeEnrichmentHttpParametersProperty | [[cdk.support/lookup-entry]] | `:http-parameters` |
| `inputTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-template` |"
  [stack id config]
  (let [builder (CfnPipe$PipeEnrichmentParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-parameters)]
      (. builder httpParameters data))
    (when-let [data (lookup-entry config id :input-template)]
      (. builder inputTemplate data))
    (.build builder)))


(defn cfn-pipe-pipe-log-configuration-property-builder
  "The cfn-pipe-pipe-log-configuration-property-builder function buildes out new instances of 
CfnPipe$PipeLogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudwatchLogsLogDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-log-destination` |
| `firehoseLogDestination` | software.amazon.awscdk.services.pipes.CfnPipe$FirehoseLogDestinationProperty | [[cdk.support/lookup-entry]] | `:firehose-log-destination` |
| `includeExecutionData` | java.util.List | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `s3LogDestination` | software.amazon.awscdk.services.pipes.CfnPipe$S3LogDestinationProperty | [[cdk.support/lookup-entry]] | `:s3-log-destination` |"
  [stack id config]
  (let [builder (CfnPipe$PipeLogConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-active-mq-broker-parameters-property-builder
  "The cfn-pipe-pipe-source-active-mq-broker-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `credentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceActiveMQBrokerParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-size)]
      (. builder batchSize data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
      (. builder maximumBatchingWindowInSeconds data))
    (when-let [data (lookup-entry config id :queue-name)]
      (. builder queueName data))
    (.build builder)))


(defn cfn-pipe-pipe-source-dynamo-db-stream-parameters-property-builder
  "The cfn-pipe-pipe-source-dynamo-db-stream-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `deadLetterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `maximumRecordAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-record-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
| `onPartialBatchItemFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-partial-batch-item-failure` |
| `parallelizationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:parallelization-factor` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceDynamoDBStreamParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-kinesis-stream-parameters-property-builder
  "The cfn-pipe-pipe-source-kinesis-stream-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `startingPositionTimestamp` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position-timestamp` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceKinesisStreamParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-managed-streaming-kafka-parameters-property-builder
  "The cfn-pipe-pipe-source-managed-streaming-kafka-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `consumerGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-group-id` |
| `credentials` | software.amazon.awscdk.services.pipes.CfnPipe$MSKAccessCredentialsProperty | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `startingPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:starting-position` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceManagedStreamingKafkaParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-parameters-property-builder
  "The cfn-pipe-pipe-source-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeMqBrokerParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active-mq-broker-parameters` |
| `dynamoDbStreamParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceDynamoDBStreamParametersProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-stream-parameters` |
| `filterCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-criteria` |
| `kinesisStreamParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceKinesisStreamParametersProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-parameters` |
| `managedStreamingKafkaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-streaming-kafka-parameters` |
| `rabbitMqBrokerParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeSourceRabbitMQBrokerParametersProperty | [[cdk.support/lookup-entry]] | `:rabbit-mq-broker-parameters` |
| `selfManagedKafkaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-kafka-parameters` |
| `sqsQueueParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-queue-parameters` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-rabbit-mq-broker-parameters-property-builder
  "The cfn-pipe-pipe-source-rabbit-mq-broker-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `credentials` | software.amazon.awscdk.services.pipes.CfnPipe$MQBrokerAccessCredentialsProperty | [[cdk.support/lookup-entry]] | `:credentials` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |
| `queueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-name` |
| `virtualHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-host` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceRabbitMQBrokerParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-self-managed-kafka-parameters-property-builder
  "The cfn-pipe-pipe-source-self-managed-kafka-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceSelfManagedKafkaParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-source-sqs-queue-parameters-property-builder
  "The cfn-pipe-pipe-source-sqs-queue-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeSourceSqsQueueParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:batch-size` |
| `maximumBatchingWindowInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-batching-window-in-seconds` |"
  [stack id config]
  (let [builder (CfnPipe$PipeSourceSqsQueueParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-size)]
      (. builder batchSize data))
    (when-let [data (lookup-entry config id :maximum-batching-window-in-seconds)]
      (. builder maximumBatchingWindowInSeconds data))
    (.build builder)))


(defn cfn-pipe-pipe-target-batch-job-parameters-property-builder
  "The cfn-pipe-pipe-target-batch-job-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetBatchJobParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arrayProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:array-properties` |
| `containerOverrides` | software.amazon.awscdk.services.pipes.CfnPipe$BatchContainerOverridesProperty | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `dependsOn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:depends-on` |
| `jobDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `retryStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-strategy` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetBatchJobParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-target-cloud-watch-logs-parameters-property-builder
  "The cfn-pipe-pipe-target-cloud-watch-logs-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name` |
| `timestamp` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetCloudWatchLogsParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-stream-name)]
      (. builder logStreamName data))
    (when-let [data (lookup-entry config id :timestamp)]
      (. builder timestamp data))
    (.build builder)))


(defn cfn-pipe-pipe-target-ecs-task-parameters-property-builder
  "The cfn-pipe-pipe-target-ecs-task-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetEcsTaskParametersProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetEcsTaskParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-target-event-bridge-event-bus-parameters-property-builder
  "The cfn-pipe-pipe-target-event-bridge-event-bus-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `time` | java.lang.String | [[cdk.support/lookup-entry]] | `:time` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetEventBridgeEventBusParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-target-http-parameters-property-builder
  "The cfn-pipe-pipe-target-http-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetHttpParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:header-parameters` |
| `pathParameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:path-parameter-values` |
| `queryStringParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-string-parameters` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetHttpParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-parameters)]
      (. builder headerParameters data))
    (when-let [data (lookup-entry config id :path-parameter-values)]
      (. builder pathParameterValues data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (.build builder)))


(defn cfn-pipe-pipe-target-kinesis-stream-parameters-property-builder
  "The cfn-pipe-pipe-target-kinesis-stream-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetKinesisStreamParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (.build builder)))


(defn cfn-pipe-pipe-target-lambda-function-parameters-property-builder
  "The cfn-pipe-pipe-target-lambda-function-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetLambdaFunctionParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :invocation-type)]
      (. builder invocationType data))
    (.build builder)))


(defn cfn-pipe-pipe-target-parameters-property-builder
  "The cfn-pipe-pipe-target-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetParametersProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `stepFunctionStateMachineParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-function-state-machine-parameters` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-target-redshift-data-parameters-property-builder
  "The cfn-pipe-pipe-target-redshift-data-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `dbUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-user` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `sqls` | java.util.List | [[cdk.support/lookup-entry]] | `:sqls` |
| `statementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-name` |
| `withEvent` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:with-event` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetRedshiftDataParametersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-pipe-target-sage-maker-pipeline-parameters-property-builder
  "The cfn-pipe-pipe-target-sage-maker-pipeline-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineParameterList` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-parameter-list` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetSageMakerPipelineParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :pipeline-parameter-list)]
      (. builder pipelineParameterList data))
    (.build builder)))


(defn cfn-pipe-pipe-target-sqs-queue-parameters-property-builder
  "The cfn-pipe-pipe-target-sqs-queue-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetSqsQueueParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageDeduplicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-deduplication-id` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetSqsQueueParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :message-deduplication-id)]
      (. builder messageDeduplicationId data))
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (.build builder)))


(defn cfn-pipe-pipe-target-state-machine-parameters-property-builder
  "The cfn-pipe-pipe-target-state-machine-parameters-property-builder function buildes out new instances of 
CfnPipe$PipeTargetStateMachineParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |"
  [stack id config]
  (let [builder (CfnPipe$PipeTargetStateMachineParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :invocation-type)]
      (. builder invocationType data))
    (.build builder)))


(defn cfn-pipe-placement-constraint-property-builder
  "The cfn-pipe-placement-constraint-property-builder function buildes out new instances of 
CfnPipe$PlacementConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPipe$PlacementConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-pipe-placement-strategy-property-builder
  "The cfn-pipe-placement-strategy-property-builder function buildes out new instances of 
CfnPipe$PlacementStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPipe$PlacementStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-pipe-props-builder
  "The cfn-pipe-props-builder function buildes out new instances of 
CfnPipeProps$Builder using the provided configuration.  Each field is set as follows:

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
| `targetParameters` | software.amazon.awscdk.services.pipes.CfnPipe$PipeTargetParametersProperty | [[cdk.support/lookup-entry]] | `:target-parameters` |"
  [stack id config]
  (let [builder (CfnPipeProps$Builder.)]
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
    (.build builder)))


(defn cfn-pipe-s3-log-destination-property-builder
  "The cfn-pipe-s3-log-destination-property-builder function buildes out new instances of 
CfnPipe$S3LogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `outputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-format` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnPipe$S3LogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-owner)]
      (. builder bucketOwner data))
    (when-let [data (lookup-entry config id :output-format)]
      (. builder outputFormat data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-pipe-sage-maker-pipeline-parameter-property-builder
  "The cfn-pipe-sage-maker-pipeline-parameter-property-builder function buildes out new instances of 
CfnPipe$SageMakerPipelineParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipe$SageMakerPipelineParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipe-self-managed-kafka-access-configuration-credentials-property-builder
  "The cfn-pipe-self-managed-kafka-access-configuration-credentials-property-builder function buildes out new instances of 
CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:basic-auth` |
| `clientCertificateTlsAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-tls-auth` |
| `saslScram256Auth` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-scram256-auth` |
| `saslScram512Auth` | java.lang.String | [[cdk.support/lookup-entry]] | `:sasl-scram512-auth` |"
  [stack id config]
  (let [builder (CfnPipe$SelfManagedKafkaAccessConfigurationCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :basic-auth)]
      (. builder basicAuth data))
    (when-let [data (lookup-entry config id :client-certificate-tls-auth)]
      (. builder clientCertificateTlsAuth data))
    (when-let [data (lookup-entry config id :sasl-scram256-auth)]
      (. builder saslScram256Auth data))
    (when-let [data (lookup-entry config id :sasl-scram512-auth)]
      (. builder saslScram512Auth data))
    (.build builder)))


(defn cfn-pipe-self-managed-kafka-access-configuration-vpc-property-builder
  "The cfn-pipe-self-managed-kafka-access-configuration-vpc-property-builder function buildes out new instances of 
CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroup` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnPipe$SelfManagedKafkaAccessConfigurationVpcProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))