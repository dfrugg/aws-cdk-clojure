(ns cdk.api.services.scheduler
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.scheduler package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.scheduler CfnSchedule$AwsVpcConfigurationProperty$Builder
                                                      CfnSchedule$Builder
                                                      CfnSchedule$CapacityProviderStrategyItemProperty$Builder
                                                      CfnSchedule$DeadLetterConfigProperty$Builder
                                                      CfnSchedule$EcsParametersProperty$Builder
                                                      CfnSchedule$EventBridgeParametersProperty$Builder
                                                      CfnSchedule$FlexibleTimeWindowProperty$Builder
                                                      CfnSchedule$KinesisParametersProperty$Builder
                                                      CfnSchedule$NetworkConfigurationProperty$Builder
                                                      CfnSchedule$PlacementConstraintProperty$Builder
                                                      CfnSchedule$PlacementStrategyProperty$Builder
                                                      CfnSchedule$RetryPolicyProperty$Builder
                                                      CfnSchedule$SageMakerPipelineParameterProperty$Builder
                                                      CfnSchedule$SageMakerPipelineParametersProperty$Builder
                                                      CfnSchedule$SqsParametersProperty$Builder
                                                      CfnSchedule$TargetProperty$Builder
                                                      CfnScheduleGroup$Builder
                                                      CfnScheduleGroupProps$Builder
                                                      CfnScheduleProps$Builder]))


(defn cfn-schedule-aws-vpc-configuration-property-builder
  "The cfn-schedule-aws-vpc-configuration-property-builder function buildes out new instances of 
CfnSchedule$AwsVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnSchedule$AwsVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-schedule-builder
  "The cfn-schedule-builder function buildes out new instances of 
CfnSchedule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `flexibleTimeWindow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flexible-time-window` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-date` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnSchedule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :flexible-time-window)]
      (. builder flexibleTimeWindow data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-expression-timezone)]
      (. builder scheduleExpressionTimezone data))
    (when-let [data (lookup-entry config id :start-date)]
      (. builder startDate data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-schedule-capacity-provider-strategy-item-property-builder
  "The cfn-schedule-capacity-provider-strategy-item-property-builder function buildes out new instances of 
CfnSchedule$CapacityProviderStrategyItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnSchedule$CapacityProviderStrategyItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-schedule-dead-letter-config-property-builder
  "The cfn-schedule-dead-letter-config-property-builder function buildes out new instances of 
CfnSchedule$DeadLetterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnSchedule$DeadLetterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-schedule-ecs-parameters-property-builder
  "The cfn-schedule-ecs-parameters-property-builder function buildes out new instances of 
CfnSchedule$EcsParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategy` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `placementConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-strategy` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `referenceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-id` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `taskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:task-count` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |"
  [stack id config]
  (let [builder (CfnSchedule$EcsParametersProperty$Builder.)]
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


(defn cfn-schedule-event-bridge-parameters-property-builder
  "The cfn-schedule-event-bridge-parameters-property-builder function buildes out new instances of 
CfnSchedule$EventBridgeParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnSchedule$EventBridgeParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-schedule-flexible-time-window-property-builder
  "The cfn-schedule-flexible-time-window-property-builder function buildes out new instances of 
CfnSchedule$FlexibleTimeWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumWindowInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-window-in-minutes` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnSchedule$FlexibleTimeWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-window-in-minutes)]
      (. builder maximumWindowInMinutes data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-schedule-group-builder
  "The cfn-schedule-group-builder function buildes out new instances of 
CfnScheduleGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnScheduleGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schedule-group-props-builder
  "The cfn-schedule-group-props-builder function buildes out new instances of 
CfnScheduleGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnScheduleGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schedule-kinesis-parameters-property-builder
  "The cfn-schedule-kinesis-parameters-property-builder function buildes out new instances of 
CfnSchedule$KinesisParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key` |"
  [stack id config]
  (let [builder (CfnSchedule$KinesisParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (.build builder)))


(defn cfn-schedule-network-configuration-property-builder
  "The cfn-schedule-network-configuration-property-builder function buildes out new instances of 
CfnSchedule$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsvpcConfiguration` | software.amazon.awscdk.services.scheduler.CfnSchedule$AwsVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:awsvpc-configuration` |"
  [stack id config]
  (let [builder (CfnSchedule$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :awsvpc-configuration)]
      (. builder awsvpcConfiguration data))
    (.build builder)))


(defn cfn-schedule-placement-constraint-property-builder
  "The cfn-schedule-placement-constraint-property-builder function buildes out new instances of 
CfnSchedule$PlacementConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSchedule$PlacementConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-schedule-placement-strategy-property-builder
  "The cfn-schedule-placement-strategy-property-builder function buildes out new instances of 
CfnSchedule$PlacementStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSchedule$PlacementStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-schedule-props-builder
  "The cfn-schedule-props-builder function buildes out new instances of 
CfnScheduleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `flexibleTimeWindow` | software.amazon.awscdk.services.scheduler.CfnSchedule$FlexibleTimeWindowProperty | [[cdk.support/lookup-entry]] | `:flexible-time-window` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-date` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `target` | software.amazon.awscdk.services.scheduler.CfnSchedule$TargetProperty | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnScheduleProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :flexible-time-window)]
      (. builder flexibleTimeWindow data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-expression-timezone)]
      (. builder scheduleExpressionTimezone data))
    (when-let [data (lookup-entry config id :start-date)]
      (. builder startDate data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-schedule-retry-policy-property-builder
  "The cfn-schedule-retry-policy-property-builder function buildes out new instances of 
CfnSchedule$RetryPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |"
  [stack id config]
  (let [builder (CfnSchedule$RetryPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
      (. builder maximumEventAgeInSeconds data))
    (when-let [data (lookup-entry config id :maximum-retry-attempts)]
      (. builder maximumRetryAttempts data))
    (.build builder)))


(defn cfn-schedule-sage-maker-pipeline-parameter-property-builder
  "The cfn-schedule-sage-maker-pipeline-parameter-property-builder function buildes out new instances of 
CfnSchedule$SageMakerPipelineParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnSchedule$SageMakerPipelineParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-schedule-sage-maker-pipeline-parameters-property-builder
  "The cfn-schedule-sage-maker-pipeline-parameters-property-builder function buildes out new instances of 
CfnSchedule$SageMakerPipelineParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineParameterList` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-parameter-list` |"
  [stack id config]
  (let [builder (CfnSchedule$SageMakerPipelineParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :pipeline-parameter-list)]
      (. builder pipelineParameterList data))
    (.build builder)))


(defn cfn-schedule-sqs-parameters-property-builder
  "The cfn-schedule-sqs-parameters-property-builder function buildes out new instances of 
CfnSchedule$SqsParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |"
  [stack id config]
  (let [builder (CfnSchedule$SqsParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (.build builder)))


(defn cfn-schedule-target-property-builder
  "The cfn-schedule-target-property-builder function buildes out new instances of 
CfnSchedule$TargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `deadLetterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dead-letter-config` |
| `ecsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecs-parameters` |
| `eventBridgeParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-parameters` |
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `kinesisParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-parameters` |
| `retryPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-policy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sageMakerPipelineParameters` | software.amazon.awscdk.services.scheduler.CfnSchedule$SageMakerPipelineParametersProperty | [[cdk.support/lookup-entry]] | `:sage-maker-pipeline-parameters` |
| `sqsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-parameters` |"
  [stack id config]
  (let [builder (CfnSchedule$TargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :dead-letter-config)]
      (. builder deadLetterConfig data))
    (when-let [data (lookup-entry config id :ecs-parameters)]
      (. builder ecsParameters data))
    (when-let [data (lookup-entry config id :event-bridge-parameters)]
      (. builder eventBridgeParameters data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :kinesis-parameters)]
      (. builder kinesisParameters data))
    (when-let [data (lookup-entry config id :retry-policy)]
      (. builder retryPolicy data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :sage-maker-pipeline-parameters)]
      (. builder sageMakerPipelineParameters data))
    (when-let [data (lookup-entry config id :sqs-parameters)]
      (. builder sqsParameters data))
    (.build builder)))