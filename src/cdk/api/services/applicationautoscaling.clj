(ns cdk.api.services.applicationautoscaling
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.applicationautoscaling package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.applicationautoscaling AdjustmentTier$Builder
                                                                   AdjustmentType
                                                                   BaseScalableAttributeProps$Builder
                                                                   BaseTargetTrackingProps$Builder
                                                                   BasicStepScalingPolicyProps$Builder
                                                                   BasicTargetTrackingScalingPolicyProps$Builder
                                                                   CfnScalableTarget$Builder
                                                                   CfnScalableTarget$ScalableTargetActionProperty$Builder
                                                                   CfnScalableTarget$ScheduledActionProperty$Builder
                                                                   CfnScalableTarget$SuspendedStateProperty$Builder
                                                                   CfnScalableTargetProps$Builder
                                                                   CfnScalingPolicy$Builder
                                                                   CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder
                                                                   CfnScalingPolicy$MetricDimensionProperty$Builder
                                                                   CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder
                                                                   CfnScalingPolicy$StepAdjustmentProperty$Builder
                                                                   CfnScalingPolicy$StepScalingPolicyConfigurationProperty$Builder
                                                                   CfnScalingPolicy$TargetTrackingMetricDataQueryProperty$Builder
                                                                   CfnScalingPolicy$TargetTrackingMetricDimensionProperty$Builder
                                                                   CfnScalingPolicy$TargetTrackingMetricProperty$Builder
                                                                   CfnScalingPolicy$TargetTrackingMetricStatProperty$Builder
                                                                   CfnScalingPolicy$TargetTrackingScalingPolicyConfigurationProperty$Builder
                                                                   CfnScalingPolicyProps$Builder
                                                                   CronOptions$Builder
                                                                   EnableScalingProps$Builder
                                                                   MetricAggregationType
                                                                   PredefinedMetric
                                                                   ScalableTarget$Builder
                                                                   ScalableTargetProps$Builder
                                                                   ScalingInterval$Builder
                                                                   ScalingSchedule$Builder
                                                                   ServiceNamespace
                                                                   StepScalingAction$Builder
                                                                   StepScalingActionProps$Builder
                                                                   StepScalingPolicy$Builder
                                                                   StepScalingPolicyProps$Builder
                                                                   TargetTrackingScalingPolicy$Builder
                                                                   TargetTrackingScalingPolicyProps$Builder]))


(defn adjustment-type
  "The `adjustment-type` function data interprets values in the provided config data into a 
`AdjustmentType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AdjustmentType` - the value is returned.
* is `:exact-capacity` - `AdjustmentType/EXACT_CAPACITY` is returned
* is `:percent-change-in-capacity` - `AdjustmentType/PERCENT_CHANGE_IN_CAPACITY` is returned
* is `:change-in-capacity` - `AdjustmentType/CHANGE_IN_CAPACITY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AdjustmentType data) data
      (= :exact-capacity data) AdjustmentType/EXACT_CAPACITY
      (= :percent-change-in-capacity data) AdjustmentType/PERCENT_CHANGE_IN_CAPACITY
      (= :change-in-capacity data) AdjustmentType/CHANGE_IN_CAPACITY)))


(defn metric-aggregation-type
  "The `metric-aggregation-type` function data interprets values in the provided config data into a 
`MetricAggregationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MetricAggregationType` - the value is returned.
* is `:maximum` - `MetricAggregationType/MAXIMUM` is returned
* is `:average` - `MetricAggregationType/AVERAGE` is returned
* is `:minimum` - `MetricAggregationType/MINIMUM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MetricAggregationType data) data
      (= :maximum data) MetricAggregationType/MAXIMUM
      (= :average data) MetricAggregationType/AVERAGE
      (= :minimum data) MetricAggregationType/MINIMUM)))


(defn predefined-metric
  "The `predefined-metric` function data interprets values in the provided config data into a 
`PredefinedMetric` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PredefinedMetric` - the value is returned.
* is `:alb-request-count-per-target` - `PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET` is returned
* is `:dyanmodb-write-capacity-utilization` - `PredefinedMetric/DYANMODB_WRITE_CAPACITY_UTILIZATION` is returned
* is `:ecs-service-average-memory-utilization` - `PredefinedMetric/ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION` is returned
* is `:sagemaker-variant-provisioned-concurrency-utilization` - `PredefinedMetric/SAGEMAKER_VARIANT_PROVISIONED_CONCURRENCY_UTILIZATION` is returned
* is `:comprehend-inference-utilization` - `PredefinedMetric/COMPREHEND_INFERENCE_UTILIZATION` is returned
* is `:ecs-service-average-cpu-utilization` - `PredefinedMetric/ECS_SERVICE_AVERAGE_CPU_UTILIZATION` is returned
* is `:elasticache-database-capacity-usage-counted-for-evict-percentage` - `PredefinedMetric/ELASTICACHE_DATABASE_CAPACITY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE` is returned
* is `:cassandra-write-capacity-utilization` - `PredefinedMetric/CASSANDRA_WRITE_CAPACITY_UTILIZATION` is returned
* is `:rds-reader-average-cpu-utilization` - `PredefinedMetric/RDS_READER_AVERAGE_CPU_UTILIZATION` is returned
* is `:elasticache-database-memory-usage-counted-for-evict-percentage` - `PredefinedMetric/ELASTICACHE_DATABASE_MEMORY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE` is returned
* is `:sagemaker-variant-invocations-per-instance` - `PredefinedMetric/SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE` is returned
* is `:ec2-spot-fleet-request-average-cpu-utilization` - `PredefinedMetric/EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION` is returned
* is `:lambda-provisioned-concurrency-utilization` - `PredefinedMetric/LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION` is returned
* is `:nepture-reader-average-cpu-utilization` - `PredefinedMetric/NEPTURE_READER_AVERAGE_CPU_UTILIZATION` is returned
* is `:ec2-spot-fleet-request-average-network-out` - `PredefinedMetric/EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT` is returned
* is `:sagemaker-inference-component-invocations-per-copy` - `PredefinedMetric/SAGEMAKER_INFERENCE_COMPONENT_INVOCATIONS_PER_COPY` is returned
* is `:cassandra-read-capacity-utilization` - `PredefinedMetric/CASSANDRA_READ_CAPACITY_UTILIZATION` is returned
* is `:rds-reader-average-database-connections` - `PredefinedMetric/RDS_READER_AVERAGE_DATABASE_CONNECTIONS` is returned
* is `:elasticache-replica-engine-cpu-utilization` - `PredefinedMetric/ELASTICACHE_REPLICA_ENGINE_CPU_UTILIZATION` is returned
* is `:appstream-average-capacity-utilization` - `PredefinedMetric/APPSTREAM_AVERAGE_CAPACITY_UTILIZATION` is returned
* is `:elasticache-primary-engine-cpu-utilization` - `PredefinedMetric/ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION` is returned
* is `:dynamodb-write-capacity-utilization` - `PredefinedMetric/DYNAMODB_WRITE_CAPACITY_UTILIZATION` is returned
* is `:dynamodb-read-capacity-utilization` - `PredefinedMetric/DYNAMODB_READ_CAPACITY_UTILIZATION` is returned
* is `:kafka-broker-storage-utilization` - `PredefinedMetric/KAFKA_BROKER_STORAGE_UTILIZATION` is returned
* is `:ec2-spot-fleet-request-average-network-in` - `PredefinedMetric/EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PredefinedMetric data) data
      (= :alb-request-count-per-target data) PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET
      (= :dyanmodb-write-capacity-utilization data) PredefinedMetric/DYANMODB_WRITE_CAPACITY_UTILIZATION
      (= :ecs-service-average-memory-utilization data) PredefinedMetric/ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION
      (= :sagemaker-variant-provisioned-concurrency-utilization data) PredefinedMetric/SAGEMAKER_VARIANT_PROVISIONED_CONCURRENCY_UTILIZATION
      (= :comprehend-inference-utilization data) PredefinedMetric/COMPREHEND_INFERENCE_UTILIZATION
      (= :ecs-service-average-cpu-utilization data) PredefinedMetric/ECS_SERVICE_AVERAGE_CPU_UTILIZATION
      (= :elasticache-database-capacity-usage-counted-for-evict-percentage data) PredefinedMetric/ELASTICACHE_DATABASE_CAPACITY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE
      (= :cassandra-write-capacity-utilization data) PredefinedMetric/CASSANDRA_WRITE_CAPACITY_UTILIZATION
      (= :rds-reader-average-cpu-utilization data) PredefinedMetric/RDS_READER_AVERAGE_CPU_UTILIZATION
      (= :elasticache-database-memory-usage-counted-for-evict-percentage data) PredefinedMetric/ELASTICACHE_DATABASE_MEMORY_USAGE_COUNTED_FOR_EVICT_PERCENTAGE
      (= :sagemaker-variant-invocations-per-instance data) PredefinedMetric/SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE
      (= :ec2-spot-fleet-request-average-cpu-utilization data) PredefinedMetric/EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION
      (= :lambda-provisioned-concurrency-utilization data) PredefinedMetric/LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION
      (= :nepture-reader-average-cpu-utilization data) PredefinedMetric/NEPTURE_READER_AVERAGE_CPU_UTILIZATION
      (= :ec2-spot-fleet-request-average-network-out data) PredefinedMetric/EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT
      (= :sagemaker-inference-component-invocations-per-copy data) PredefinedMetric/SAGEMAKER_INFERENCE_COMPONENT_INVOCATIONS_PER_COPY
      (= :cassandra-read-capacity-utilization data) PredefinedMetric/CASSANDRA_READ_CAPACITY_UTILIZATION
      (= :rds-reader-average-database-connections data) PredefinedMetric/RDS_READER_AVERAGE_DATABASE_CONNECTIONS
      (= :elasticache-replica-engine-cpu-utilization data) PredefinedMetric/ELASTICACHE_REPLICA_ENGINE_CPU_UTILIZATION
      (= :appstream-average-capacity-utilization data) PredefinedMetric/APPSTREAM_AVERAGE_CAPACITY_UTILIZATION
      (= :elasticache-primary-engine-cpu-utilization data) PredefinedMetric/ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION
      (= :dynamodb-write-capacity-utilization data) PredefinedMetric/DYNAMODB_WRITE_CAPACITY_UTILIZATION
      (= :dynamodb-read-capacity-utilization data) PredefinedMetric/DYNAMODB_READ_CAPACITY_UTILIZATION
      (= :kafka-broker-storage-utilization data) PredefinedMetric/KAFKA_BROKER_STORAGE_UTILIZATION
      (= :ec2-spot-fleet-request-average-network-in data) PredefinedMetric/EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN)))


(defn service-namespace
  "The `service-namespace` function data interprets values in the provided config data into a 
`ServiceNamespace` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ServiceNamespace` - the value is returned.
* is `:neptune` - `ServiceNamespace/NEPTUNE` is returned
* is `:elastic-map-reduce` - `ServiceNamespace/ELASTIC_MAP_REDUCE` is returned
* is `:rds` - `ServiceNamespace/RDS` is returned
* is `:ec2` - `ServiceNamespace/EC2` is returned
* is `:elasticache` - `ServiceNamespace/ELASTICACHE` is returned
* is `:dynamodb` - `ServiceNamespace/DYNAMODB` is returned
* is `:kafka` - `ServiceNamespace/KAFKA` is returned
* is `:comprehend` - `ServiceNamespace/COMPREHEND` is returned
* is `:appstream` - `ServiceNamespace/APPSTREAM` is returned
* is `:sagemaker` - `ServiceNamespace/SAGEMAKER` is returned
* is `:ecs` - `ServiceNamespace/ECS` is returned
* is `:lambda` - `ServiceNamespace/LAMBDA` is returned
* is `:custom-resource` - `ServiceNamespace/CUSTOM_RESOURCE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ServiceNamespace data) data
      (= :neptune data) ServiceNamespace/NEPTUNE
      (= :elastic-map-reduce data) ServiceNamespace/ELASTIC_MAP_REDUCE
      (= :rds data) ServiceNamespace/RDS
      (= :ec2 data) ServiceNamespace/EC2
      (= :elasticache data) ServiceNamespace/ELASTICACHE
      (= :dynamodb data) ServiceNamespace/DYNAMODB
      (= :kafka data) ServiceNamespace/KAFKA
      (= :comprehend data) ServiceNamespace/COMPREHEND
      (= :appstream data) ServiceNamespace/APPSTREAM
      (= :sagemaker data) ServiceNamespace/SAGEMAKER
      (= :ecs data) ServiceNamespace/ECS
      (= :lambda data) ServiceNamespace/LAMBDA
      (= :custom-resource data) ServiceNamespace/CUSTOM_RESOURCE)))


(defn build-adjustment-tier-builder
  "The build-adjustment-tier-builder function updates a AdjustmentTier$Builder instance using the provided configuration.
  The function takes the AdjustmentTier$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:adjustment` |
| `lowerBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower-bound` |
| `upperBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper-bound` |
"
  [^AdjustmentTier$Builder builder id config]
  (when-let [data (lookup-entry config id :adjustment)]
    (. builder adjustment data))
  (when-let [data (lookup-entry config id :lower-bound)]
    (. builder lowerBound data))
  (when-let [data (lookup-entry config id :upper-bound)]
    (. builder upperBound data))
  (.build builder))


(defn build-base-scalable-attribute-props-builder
  "The build-base-scalable-attribute-props-builder function updates a BaseScalableAttributeProps$Builder instance using the provided configuration.
  The function takes the BaseScalableAttributeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |
"
  [^BaseScalableAttributeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dimension)]
    (. builder dimension data))
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (service-namespace config id :service-namespace)]
    (. builder serviceNamespace data))
  (.build builder))


(defn build-base-target-tracking-props-builder
  "The build-base-target-tracking-props-builder function updates a BaseTargetTrackingProps$Builder instance using the provided configuration.
  The function takes the BaseTargetTrackingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
"
  [^BaseTargetTrackingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-let [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (.build builder))


(defn build-basic-step-scaling-policy-props-builder
  "The build-basic-step-scaling-policy-props-builder function updates a BasicStepScalingPolicyProps$Builder instance using the provided configuration.
  The function takes the BasicStepScalingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.applicationautoscaling.AdjustmentType | [[cdk.api.services.applicationautoscaling/adjustment-type]] | `:adjustment-type` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `metricAggregationType` | software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType | [[cdk.api.services.applicationautoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
"
  [^BasicStepScalingPolicyProps$Builder builder id config]
  (when-let [data (adjustment-type config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-let [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-let [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-let [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
    (. builder metricAggregationType data))
  (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
    (. builder minAdjustmentMagnitude data))
  (when-let [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (.build builder))


(defn build-basic-target-tracking-scaling-policy-props-builder
  "The build-basic-target-tracking-scaling-policy-props-builder function updates a BasicTargetTrackingScalingPolicyProps$Builder instance using the provided configuration.
  The function takes the BasicTargetTrackingScalingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customMetric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:custom-metric` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `predefinedMetric` | software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric | [[cdk.api.services.applicationautoscaling/predefined-metric]] | `:predefined-metric` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^BasicTargetTrackingScalingPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-metric)]
    (. builder customMetric data))
  (when-let [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (predefined-metric config id :predefined-metric)]
    (. builder predefinedMetric data))
  (when-let [data (lookup-entry config id :resource-label)]
    (. builder resourceLabel data))
  (when-let [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-let [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-let [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn build-cfn-scalable-target-builder
  "The build-cfn-scalable-target-builder function updates a CfnScalableTarget$Builder instance using the provided configuration.
  The function takes the CfnScalableTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `scheduledActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scheduled-actions` |
| `serviceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-namespace` |
| `suspendedState` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:suspended-state` |
"
  [^CfnScalableTarget$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-let [data (lookup-entry config id :scheduled-actions)]
    (. builder scheduledActions data))
  (when-let [data (lookup-entry config id :service-namespace)]
    (. builder serviceNamespace data))
  (when-let [data (lookup-entry config id :suspended-state)]
    (. builder suspendedState data))
  (.build builder))


(defn build-cfn-scalable-target-props-builder
  "The build-cfn-scalable-target-props-builder function updates a CfnScalableTargetProps$Builder instance using the provided configuration.
  The function takes the CfnScalableTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `scheduledActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scheduled-actions` |
| `serviceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-namespace` |
| `suspendedState` | software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget$SuspendedStateProperty | [[cdk.support/lookup-entry]] | `:suspended-state` |
"
  [^CfnScalableTargetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-let [data (lookup-entry config id :scheduled-actions)]
    (. builder scheduledActions data))
  (when-let [data (lookup-entry config id :service-namespace)]
    (. builder serviceNamespace data))
  (when-let [data (lookup-entry config id :suspended-state)]
    (. builder suspendedState data))
  (.build builder))


(defn build-cfn-scalable-target-scalable-target-action-property-builder
  "The build-cfn-scalable-target-scalable-target-action-property-builder function updates a CfnScalableTarget$ScalableTargetActionProperty$Builder instance using the provided configuration.
  The function takes the CfnScalableTarget$ScalableTargetActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^CfnScalableTarget$ScalableTargetActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn build-cfn-scalable-target-scheduled-action-property-builder
  "The build-cfn-scalable-target-scheduled-action-property-builder function updates a CfnScalableTarget$ScheduledActionProperty$Builder instance using the provided configuration.
  The function takes the CfnScalableTarget$ScheduledActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:end-time` |
| `scalableTargetAction` | software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget$ScalableTargetActionProperty | [[cdk.support/lookup-entry]] | `:scalable-target-action` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-name` |
| `startTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:start-time` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
"
  [^CfnScalableTarget$ScheduledActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-let [data (lookup-entry config id :scalable-target-action)]
    (. builder scalableTargetAction data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :scheduled-action-name)]
    (. builder scheduledActionName data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (when-let [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (.build builder))


(defn build-cfn-scalable-target-suspended-state-property-builder
  "The build-cfn-scalable-target-suspended-state-property-builder function updates a CfnScalableTarget$SuspendedStateProperty$Builder instance using the provided configuration.
  The function takes the CfnScalableTarget$SuspendedStateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dynamicScalingInSuspended` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamic-scaling-in-suspended` |
| `dynamicScalingOutSuspended` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dynamic-scaling-out-suspended` |
| `scheduledScalingSuspended` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scheduled-scaling-suspended` |
"
  [^CfnScalableTarget$SuspendedStateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dynamic-scaling-in-suspended)]
    (. builder dynamicScalingInSuspended data))
  (when-let [data (lookup-entry config id :dynamic-scaling-out-suspended)]
    (. builder dynamicScalingOutSuspended data))
  (when-let [data (lookup-entry config id :scheduled-scaling-suspended)]
    (. builder scheduledScalingSuspended data))
  (.build builder))


(defn build-cfn-scaling-policy-builder
  "The build-cfn-scaling-policy-builder function updates a CfnScalingPolicy$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `scalingTargetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-target-id` |
| `serviceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-namespace` |
| `stepScalingPolicyConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-scaling-policy-configuration` |
| `targetTrackingScalingPolicyConfiguration` | software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy$TargetTrackingScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-tracking-scaling-policy-configuration` |
"
  [^CfnScalingPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-let [data (lookup-entry config id :scaling-target-id)]
    (. builder scalingTargetId data))
  (when-let [data (lookup-entry config id :service-namespace)]
    (. builder serviceNamespace data))
  (when-let [data (lookup-entry config id :step-scaling-policy-configuration)]
    (. builder stepScalingPolicyConfiguration data))
  (when-let [data (lookup-entry config id :target-tracking-scaling-policy-configuration)]
    (. builder targetTrackingScalingPolicyConfiguration data))
  (.build builder))


(defn build-cfn-scaling-policy-customized-metric-specification-property-builder
  "The build-cfn-scaling-policy-customized-metric-specification-property-builder function updates a CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metrics` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn build-cfn-scaling-policy-metric-dimension-property-builder
  "The build-cfn-scaling-policy-metric-dimension-property-builder function updates a CfnScalingPolicy$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnScalingPolicy$MetricDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-scaling-policy-predefined-metric-specification-property-builder
  "The build-cfn-scaling-policy-predefined-metric-specification-property-builder function updates a CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
"
  [^CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :predefined-metric-type)]
    (. builder predefinedMetricType data))
  (when-let [data (lookup-entry config id :resource-label)]
    (. builder resourceLabel data))
  (.build builder))


(defn build-cfn-scaling-policy-props-builder
  "The build-cfn-scaling-policy-props-builder function updates a CfnScalingPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `scalingTargetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-target-id` |
| `serviceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-namespace` |
| `stepScalingPolicyConfiguration` | software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy$StepScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:step-scaling-policy-configuration` |
| `targetTrackingScalingPolicyConfiguration` | software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy$TargetTrackingScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-tracking-scaling-policy-configuration` |
"
  [^CfnScalingPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-let [data (lookup-entry config id :scaling-target-id)]
    (. builder scalingTargetId data))
  (when-let [data (lookup-entry config id :service-namespace)]
    (. builder serviceNamespace data))
  (when-let [data (lookup-entry config id :step-scaling-policy-configuration)]
    (. builder stepScalingPolicyConfiguration data))
  (when-let [data (lookup-entry config id :target-tracking-scaling-policy-configuration)]
    (. builder targetTrackingScalingPolicyConfiguration data))
  (.build builder))


(defn build-cfn-scaling-policy-step-adjustment-property-builder
  "The build-cfn-scaling-policy-step-adjustment-property-builder function updates a CfnScalingPolicy$StepAdjustmentProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$StepAdjustmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricIntervalLowerBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:metric-interval-lower-bound` |
| `metricIntervalUpperBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:metric-interval-upper-bound` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
"
  [^CfnScalingPolicy$StepAdjustmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :metric-interval-lower-bound)]
    (. builder metricIntervalLowerBound data))
  (when-let [data (lookup-entry config id :metric-interval-upper-bound)]
    (. builder metricIntervalUpperBound data))
  (when-let [data (lookup-entry config id :scaling-adjustment)]
    (. builder scalingAdjustment data))
  (.build builder))


(defn build-cfn-scaling-policy-step-scaling-policy-configuration-property-builder
  "The build-cfn-scaling-policy-step-scaling-policy-configuration-property-builder function updates a CfnScalingPolicy$StepScalingPolicyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$StepScalingPolicyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `cooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cooldown` |
| `metricAggregationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `stepAdjustments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-adjustments` |
"
  [^CfnScalingPolicy$StepScalingPolicyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-let [data (lookup-entry config id :metric-aggregation-type)]
    (. builder metricAggregationType data))
  (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
    (. builder minAdjustmentMagnitude data))
  (when-let [data (lookup-entry config id :step-adjustments)]
    (. builder stepAdjustments data))
  (.build builder))


(defn build-cfn-scaling-policy-target-tracking-metric-data-query-property-builder
  "The build-cfn-scaling-policy-target-tracking-metric-data-query-property-builder function updates a CfnScalingPolicy$TargetTrackingMetricDataQueryProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$TargetTrackingMetricDataQueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricStat` | software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy$TargetTrackingMetricStatProperty | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `returnData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-data` |
"
  [^CfnScalingPolicy$TargetTrackingMetricDataQueryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :label)]
    (. builder label data))
  (when-let [data (lookup-entry config id :metric-stat)]
    (. builder metricStat data))
  (when-let [data (lookup-entry config id :return-data)]
    (. builder returnData data))
  (.build builder))


(defn build-cfn-scaling-policy-target-tracking-metric-dimension-property-builder
  "The build-cfn-scaling-policy-target-tracking-metric-dimension-property-builder function updates a CfnScalingPolicy$TargetTrackingMetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$TargetTrackingMetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnScalingPolicy$TargetTrackingMetricDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-scaling-policy-target-tracking-metric-property-builder
  "The build-cfn-scaling-policy-target-tracking-metric-property-builder function updates a CfnScalingPolicy$TargetTrackingMetricProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$TargetTrackingMetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnScalingPolicy$TargetTrackingMetricProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn build-cfn-scaling-policy-target-tracking-metric-stat-property-builder
  "The build-cfn-scaling-policy-target-tracking-metric-stat-property-builder function updates a CfnScalingPolicy$TargetTrackingMetricStatProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$TargetTrackingMetricStatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnScalingPolicy$TargetTrackingMetricStatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-let [data (lookup-entry config id :stat)]
    (. builder stat data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn build-cfn-scaling-policy-target-tracking-scaling-policy-configuration-property-builder
  "The build-cfn-scaling-policy-target-tracking-scaling-policy-configuration-property-builder function updates a CfnScalingPolicy$TargetTrackingScalingPolicyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPolicy$TargetTrackingScalingPolicyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customizedMetricSpecification` | software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy$CustomizedMetricSpecificationProperty | [[cdk.support/lookup-entry]] | `:customized-metric-specification` |
| `disableScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `predefinedMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predefined-metric-specification` |
| `scaleInCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^CfnScalingPolicy$TargetTrackingScalingPolicyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :customized-metric-specification)]
    (. builder customizedMetricSpecification data))
  (when-let [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-let [data (lookup-entry config id :predefined-metric-specification)]
    (. builder predefinedMetricSpecification data))
  (when-let [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-let [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-let [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn build-cron-options-builder
  "The build-cron-options-builder function updates a CronOptions$Builder instance using the provided configuration.
  The function takes the CronOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `hour` | java.lang.String | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.String | [[cdk.support/lookup-entry]] | `:minute` |
| `month` | java.lang.String | [[cdk.support/lookup-entry]] | `:month` |
| `weekDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:week-day` |
| `year` | java.lang.String | [[cdk.support/lookup-entry]] | `:year` |
"
  [^CronOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :day)]
    (. builder day data))
  (when-let [data (lookup-entry config id :hour)]
    (. builder hour data))
  (when-let [data (lookup-entry config id :minute)]
    (. builder minute data))
  (when-let [data (lookup-entry config id :month)]
    (. builder month data))
  (when-let [data (lookup-entry config id :week-day)]
    (. builder weekDay data))
  (when-let [data (lookup-entry config id :year)]
    (. builder year data))
  (.build builder))


(defn build-enable-scaling-props-builder
  "The build-enable-scaling-props-builder function updates a EnableScalingProps$Builder instance using the provided configuration.
  The function takes the EnableScalingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^EnableScalingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn build-scalable-target-builder
  "The build-scalable-target-builder function updates a ScalableTarget$Builder instance using the provided configuration.
  The function takes the ScalableTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |
"
  [^ScalableTarget$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-let [data (service-namespace config id :service-namespace)]
    (. builder serviceNamespace data))
  (.build builder))


(defn build-scalable-target-props-builder
  "The build-scalable-target-props-builder function updates a ScalableTargetProps$Builder instance using the provided configuration.
  The function takes the ScalableTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |
"
  [^ScalableTargetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-let [data (service-namespace config id :service-namespace)]
    (. builder serviceNamespace data))
  (.build builder))


(defn build-scaling-interval-builder
  "The build-scaling-interval-builder function updates a ScalingInterval$Builder instance using the provided configuration.
  The function takes the ScalingInterval$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `change` | java.lang.Number | [[cdk.support/lookup-entry]] | `:change` |
| `lower` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower` |
| `upper` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper` |
"
  [^ScalingInterval$Builder builder id config]
  (when-let [data (lookup-entry config id :change)]
    (. builder change data))
  (when-let [data (lookup-entry config id :lower)]
    (. builder lower data))
  (when-let [data (lookup-entry config id :upper)]
    (. builder upper data))
  (.build builder))


(defn build-scaling-schedule-builder
  "The build-scaling-schedule-builder function updates a ScalingSchedule$Builder instance using the provided configuration.
  The function takes the ScalingSchedule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:end-time` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `schedule` | software.amazon.awscdk.services.applicationautoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `startTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | software.amazon.awscdk.TimeZone | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^ScalingSchedule$Builder builder id config]
  (when-let [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (when-let [data (lookup-entry config id :time-zone)]
    (. builder timeZone data))
  (.build builder))


(defn build-step-scaling-action-builder
  "The build-step-scaling-action-builder function updates a StepScalingAction$Builder instance using the provided configuration.
  The function takes the StepScalingAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.applicationautoscaling.AdjustmentType | [[cdk.api.services.applicationautoscaling/adjustment-type]] | `:adjustment-type` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `metricAggregationType` | software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType | [[cdk.api.services.applicationautoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scalingTarget` | software.amazon.awscdk.services.applicationautoscaling.IScalableTarget | [[cdk.support/lookup-entry]] | `:scaling-target` |
"
  [^StepScalingAction$Builder builder id config]
  (when-let [data (adjustment-type config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
    (. builder metricAggregationType data))
  (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
    (. builder minAdjustmentMagnitude data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :scaling-target)]
    (. builder scalingTarget data))
  (.build builder))


(defn build-step-scaling-action-props-builder
  "The build-step-scaling-action-props-builder function updates a StepScalingActionProps$Builder instance using the provided configuration.
  The function takes the StepScalingActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.applicationautoscaling.AdjustmentType | [[cdk.api.services.applicationautoscaling/adjustment-type]] | `:adjustment-type` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `metricAggregationType` | software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType | [[cdk.api.services.applicationautoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scalingTarget` | software.amazon.awscdk.services.applicationautoscaling.IScalableTarget | [[cdk.support/lookup-entry]] | `:scaling-target` |
"
  [^StepScalingActionProps$Builder builder id config]
  (when-let [data (adjustment-type config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
    (. builder metricAggregationType data))
  (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
    (. builder minAdjustmentMagnitude data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :scaling-target)]
    (. builder scalingTarget data))
  (.build builder))


(defn build-step-scaling-policy-builder
  "The build-step-scaling-policy-builder function updates a StepScalingPolicy$Builder instance using the provided configuration.
  The function takes the StepScalingPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.applicationautoscaling.AdjustmentType | [[cdk.api.services.applicationautoscaling/adjustment-type]] | `:adjustment-type` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `metricAggregationType` | software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType | [[cdk.api.services.applicationautoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `scalingTarget` | software.amazon.awscdk.services.applicationautoscaling.IScalableTarget | [[cdk.support/lookup-entry]] | `:scaling-target` |
"
  [^StepScalingPolicy$Builder builder id config]
  (when-let [data (adjustment-type config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-let [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-let [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-let [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
    (. builder metricAggregationType data))
  (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
    (. builder minAdjustmentMagnitude data))
  (when-let [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-let [data (lookup-entry config id :scaling-target)]
    (. builder scalingTarget data))
  (.build builder))


(defn build-step-scaling-policy-props-builder
  "The build-step-scaling-policy-props-builder function updates a StepScalingPolicyProps$Builder instance using the provided configuration.
  The function takes the StepScalingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.applicationautoscaling.AdjustmentType | [[cdk.api.services.applicationautoscaling/adjustment-type]] | `:adjustment-type` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `metricAggregationType` | software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType | [[cdk.api.services.applicationautoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `scalingTarget` | software.amazon.awscdk.services.applicationautoscaling.IScalableTarget | [[cdk.support/lookup-entry]] | `:scaling-target` |
"
  [^StepScalingPolicyProps$Builder builder id config]
  (when-let [data (adjustment-type config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-let [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-let [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-let [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
    (. builder metricAggregationType data))
  (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
    (. builder minAdjustmentMagnitude data))
  (when-let [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-let [data (lookup-entry config id :scaling-target)]
    (. builder scalingTarget data))
  (.build builder))


(defn build-target-tracking-scaling-policy-builder
  "The build-target-tracking-scaling-policy-builder function updates a TargetTrackingScalingPolicy$Builder instance using the provided configuration.
  The function takes the TargetTrackingScalingPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customMetric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:custom-metric` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `predefinedMetric` | software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric | [[cdk.api.services.applicationautoscaling/predefined-metric]] | `:predefined-metric` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `scalingTarget` | software.amazon.awscdk.services.applicationautoscaling.IScalableTarget | [[cdk.support/lookup-entry]] | `:scaling-target` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^TargetTrackingScalingPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-metric)]
    (. builder customMetric data))
  (when-let [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (predefined-metric config id :predefined-metric)]
    (. builder predefinedMetric data))
  (when-let [data (lookup-entry config id :resource-label)]
    (. builder resourceLabel data))
  (when-let [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-let [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-let [data (lookup-entry config id :scaling-target)]
    (. builder scalingTarget data))
  (when-let [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn build-target-tracking-scaling-policy-props-builder
  "The build-target-tracking-scaling-policy-props-builder function updates a TargetTrackingScalingPolicyProps$Builder instance using the provided configuration.
  The function takes the TargetTrackingScalingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customMetric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:custom-metric` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `predefinedMetric` | software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric | [[cdk.api.services.applicationautoscaling/predefined-metric]] | `:predefined-metric` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `scalingTarget` | software.amazon.awscdk.services.applicationautoscaling.IScalableTarget | [[cdk.support/lookup-entry]] | `:scaling-target` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^TargetTrackingScalingPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-metric)]
    (. builder customMetric data))
  (when-let [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (predefined-metric config id :predefined-metric)]
    (. builder predefinedMetric data))
  (when-let [data (lookup-entry config id :resource-label)]
    (. builder resourceLabel data))
  (when-let [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-let [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-let [data (lookup-entry config id :scaling-target)]
    (. builder scalingTarget data))
  (when-let [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))