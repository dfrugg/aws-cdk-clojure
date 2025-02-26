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


(defn build-cfn-schedule-aws-vpc-configuration-property-builder
  "The build-cfn-schedule-aws-vpc-configuration-property-builder function updates a CfnSchedule$AwsVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$AwsVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnSchedule$AwsVpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-schedule-aws-vpc-configuration-property-builder
  "Creates a  `CfnSchedule$AwsVpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-aws-vpc-configuration-property-builder (new CfnSchedule$AwsVpcConfigurationProperty$Builder) id config))


(defn build-cfn-schedule-builder
  "The build-cfn-schedule-builder function updates a CfnSchedule$Builder instance using the provided configuration.
  The function takes the CfnSchedule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnSchedule$Builder builder id config]
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
  (.build builder))


(defn cfn-schedule-builder
  "Creates a  `CfnSchedule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-schedule-builder (CfnSchedule$Builder/create scope (name id)) id config))


(defn build-cfn-schedule-capacity-provider-strategy-item-property-builder
  "The build-cfn-schedule-capacity-provider-strategy-item-property-builder function updates a CfnSchedule$CapacityProviderStrategyItemProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$CapacityProviderStrategyItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnSchedule$CapacityProviderStrategyItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-schedule-capacity-provider-strategy-item-property-builder
  "Creates a  `CfnSchedule$CapacityProviderStrategyItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-capacity-provider-strategy-item-property-builder (new CfnSchedule$CapacityProviderStrategyItemProperty$Builder) id config))


(defn build-cfn-schedule-dead-letter-config-property-builder
  "The build-cfn-schedule-dead-letter-config-property-builder function updates a CfnSchedule$DeadLetterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$DeadLetterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnSchedule$DeadLetterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-schedule-dead-letter-config-property-builder
  "Creates a  `CfnSchedule$DeadLetterConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-dead-letter-config-property-builder (new CfnSchedule$DeadLetterConfigProperty$Builder) id config))


(defn build-cfn-schedule-ecs-parameters-property-builder
  "The build-cfn-schedule-ecs-parameters-property-builder function updates a CfnSchedule$EcsParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$EcsParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
"
  [^CfnSchedule$EcsParametersProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-schedule-ecs-parameters-property-builder
  "Creates a  `CfnSchedule$EcsParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-ecs-parameters-property-builder (new CfnSchedule$EcsParametersProperty$Builder) id config))


(defn build-cfn-schedule-event-bridge-parameters-property-builder
  "The build-cfn-schedule-event-bridge-parameters-property-builder function updates a CfnSchedule$EventBridgeParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$EventBridgeParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnSchedule$EventBridgeParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :detail-type)]
    (. builder detailType data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn cfn-schedule-event-bridge-parameters-property-builder
  "Creates a  `CfnSchedule$EventBridgeParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-event-bridge-parameters-property-builder (new CfnSchedule$EventBridgeParametersProperty$Builder) id config))


(defn build-cfn-schedule-flexible-time-window-property-builder
  "The build-cfn-schedule-flexible-time-window-property-builder function updates a CfnSchedule$FlexibleTimeWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$FlexibleTimeWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumWindowInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-window-in-minutes` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnSchedule$FlexibleTimeWindowProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-window-in-minutes)]
    (. builder maximumWindowInMinutes data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-schedule-flexible-time-window-property-builder
  "Creates a  `CfnSchedule$FlexibleTimeWindowProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-flexible-time-window-property-builder (new CfnSchedule$FlexibleTimeWindowProperty$Builder) id config))


(defn build-cfn-schedule-group-builder
  "The build-cfn-schedule-group-builder function updates a CfnScheduleGroup$Builder instance using the provided configuration.
  The function takes the CfnScheduleGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnScheduleGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schedule-group-builder
  "Creates a  `CfnScheduleGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-schedule-group-builder (CfnScheduleGroup$Builder/create scope (name id)) id config))


(defn build-cfn-schedule-group-props-builder
  "The build-cfn-schedule-group-props-builder function updates a CfnScheduleGroupProps$Builder instance using the provided configuration.
  The function takes the CfnScheduleGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnScheduleGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schedule-group-props-builder
  "Creates a  `CfnScheduleGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-group-props-builder (new CfnScheduleGroupProps$Builder) id config))


(defn build-cfn-schedule-kinesis-parameters-property-builder
  "The build-cfn-schedule-kinesis-parameters-property-builder function updates a CfnSchedule$KinesisParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$KinesisParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key` |
"
  [^CfnSchedule$KinesisParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :partition-key)]
    (. builder partitionKey data))
  (.build builder))


(defn cfn-schedule-kinesis-parameters-property-builder
  "Creates a  `CfnSchedule$KinesisParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-kinesis-parameters-property-builder (new CfnSchedule$KinesisParametersProperty$Builder) id config))


(defn build-cfn-schedule-network-configuration-property-builder
  "The build-cfn-schedule-network-configuration-property-builder function updates a CfnSchedule$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsvpcConfiguration` | software.amazon.awscdk.services.scheduler.CfnSchedule$AwsVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:awsvpc-configuration` |
"
  [^CfnSchedule$NetworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :awsvpc-configuration)]
    (. builder awsvpcConfiguration data))
  (.build builder))


(defn cfn-schedule-network-configuration-property-builder
  "Creates a  `CfnSchedule$NetworkConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-network-configuration-property-builder (new CfnSchedule$NetworkConfigurationProperty$Builder) id config))


(defn build-cfn-schedule-placement-constraint-property-builder
  "The build-cfn-schedule-placement-constraint-property-builder function updates a CfnSchedule$PlacementConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$PlacementConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSchedule$PlacementConstraintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-schedule-placement-constraint-property-builder
  "Creates a  `CfnSchedule$PlacementConstraintProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-placement-constraint-property-builder (new CfnSchedule$PlacementConstraintProperty$Builder) id config))


(defn build-cfn-schedule-placement-strategy-property-builder
  "The build-cfn-schedule-placement-strategy-property-builder function updates a CfnSchedule$PlacementStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$PlacementStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSchedule$PlacementStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-schedule-placement-strategy-property-builder
  "Creates a  `CfnSchedule$PlacementStrategyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-placement-strategy-property-builder (new CfnSchedule$PlacementStrategyProperty$Builder) id config))


(defn build-cfn-schedule-props-builder
  "The build-cfn-schedule-props-builder function updates a CfnScheduleProps$Builder instance using the provided configuration.
  The function takes the CfnScheduleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | software.amazon.awscdk.services.scheduler.CfnSchedule$TargetProperty | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnScheduleProps$Builder builder id config]
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
  (.build builder))


(defn cfn-schedule-props-builder
  "Creates a  `CfnScheduleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-props-builder (new CfnScheduleProps$Builder) id config))


(defn build-cfn-schedule-retry-policy-property-builder
  "The build-cfn-schedule-retry-policy-property-builder function updates a CfnSchedule$RetryPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$RetryPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumEventAgeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-event-age-in-seconds` |
| `maximumRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-attempts` |
"
  [^CfnSchedule$RetryPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-event-age-in-seconds)]
    (. builder maximumEventAgeInSeconds data))
  (when-let [data (lookup-entry config id :maximum-retry-attempts)]
    (. builder maximumRetryAttempts data))
  (.build builder))


(defn cfn-schedule-retry-policy-property-builder
  "Creates a  `CfnSchedule$RetryPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-retry-policy-property-builder (new CfnSchedule$RetryPolicyProperty$Builder) id config))


(defn build-cfn-schedule-sage-maker-pipeline-parameter-property-builder
  "The build-cfn-schedule-sage-maker-pipeline-parameter-property-builder function updates a CfnSchedule$SageMakerPipelineParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$SageMakerPipelineParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnSchedule$SageMakerPipelineParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-schedule-sage-maker-pipeline-parameter-property-builder
  "Creates a  `CfnSchedule$SageMakerPipelineParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-sage-maker-pipeline-parameter-property-builder (new CfnSchedule$SageMakerPipelineParameterProperty$Builder) id config))


(defn build-cfn-schedule-sage-maker-pipeline-parameters-property-builder
  "The build-cfn-schedule-sage-maker-pipeline-parameters-property-builder function updates a CfnSchedule$SageMakerPipelineParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$SageMakerPipelineParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineParameterList` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-parameter-list` |
"
  [^CfnSchedule$SageMakerPipelineParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pipeline-parameter-list)]
    (. builder pipelineParameterList data))
  (.build builder))


(defn cfn-schedule-sage-maker-pipeline-parameters-property-builder
  "Creates a  `CfnSchedule$SageMakerPipelineParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-sage-maker-pipeline-parameters-property-builder (new CfnSchedule$SageMakerPipelineParametersProperty$Builder) id config))


(defn build-cfn-schedule-sqs-parameters-property-builder
  "The build-cfn-schedule-sqs-parameters-property-builder function updates a CfnSchedule$SqsParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$SqsParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
"
  [^CfnSchedule$SqsParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (.build builder))


(defn cfn-schedule-sqs-parameters-property-builder
  "Creates a  `CfnSchedule$SqsParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-sqs-parameters-property-builder (new CfnSchedule$SqsParametersProperty$Builder) id config))


(defn build-cfn-schedule-target-property-builder
  "The build-cfn-schedule-target-property-builder function updates a CfnSchedule$TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedule$TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `sqsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqs-parameters` |
"
  [^CfnSchedule$TargetProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-schedule-target-property-builder
  "Creates a  `CfnSchedule$TargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-target-property-builder (new CfnSchedule$TargetProperty$Builder) id config))