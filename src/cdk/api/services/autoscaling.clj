(ns cdk.api.services.autoscaling
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.autoscaling package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.autoscaling AdjustmentTier$Builder
                                                        AdjustmentType
                                                        ApplyCloudFormationInitOptions$Builder
                                                        AutoScalingGroup$Builder
                                                        AutoScalingGroupProps$Builder
                                                        BaseTargetTrackingProps$Builder
                                                        BasicLifecycleHookProps$Builder
                                                        BasicScheduledActionProps$Builder
                                                        BasicStepScalingPolicyProps$Builder
                                                        BasicTargetTrackingScalingPolicyProps$Builder
                                                        BindHookTargetOptions$Builder
                                                        BlockDevice$Builder
                                                        CfnAutoScalingGroup$AcceleratorCountRequestProperty$Builder
                                                        CfnAutoScalingGroup$AcceleratorTotalMemoryMiBRequestProperty$Builder
                                                        CfnAutoScalingGroup$BaselineEbsBandwidthMbpsRequestProperty$Builder
                                                        CfnAutoScalingGroup$Builder
                                                        CfnAutoScalingGroup$InstanceMaintenancePolicyProperty$Builder
                                                        CfnAutoScalingGroup$InstanceRequirementsProperty$Builder
                                                        CfnAutoScalingGroup$InstancesDistributionProperty$Builder
                                                        CfnAutoScalingGroup$LaunchTemplateOverridesProperty$Builder
                                                        CfnAutoScalingGroup$LaunchTemplateProperty$Builder
                                                        CfnAutoScalingGroup$LaunchTemplateSpecificationProperty$Builder
                                                        CfnAutoScalingGroup$LifecycleHookSpecificationProperty$Builder
                                                        CfnAutoScalingGroup$MemoryGiBPerVCpuRequestProperty$Builder
                                                        CfnAutoScalingGroup$MemoryMiBRequestProperty$Builder
                                                        CfnAutoScalingGroup$MetricsCollectionProperty$Builder
                                                        CfnAutoScalingGroup$MixedInstancesPolicyProperty$Builder
                                                        CfnAutoScalingGroup$NetworkBandwidthGbpsRequestProperty$Builder
                                                        CfnAutoScalingGroup$NetworkInterfaceCountRequestProperty$Builder
                                                        CfnAutoScalingGroup$NotificationConfigurationProperty$Builder
                                                        CfnAutoScalingGroup$TagPropertyProperty$Builder
                                                        CfnAutoScalingGroup$TotalLocalStorageGBRequestProperty$Builder
                                                        CfnAutoScalingGroup$VCpuCountRequestProperty$Builder
                                                        CfnAutoScalingGroupProps$Builder
                                                        CfnLaunchConfiguration$BlockDeviceMappingProperty$Builder
                                                        CfnLaunchConfiguration$BlockDeviceProperty$Builder
                                                        CfnLaunchConfiguration$Builder
                                                        CfnLaunchConfiguration$MetadataOptionsProperty$Builder
                                                        CfnLaunchConfigurationProps$Builder
                                                        CfnLifecycleHook$Builder
                                                        CfnLifecycleHookProps$Builder
                                                        CfnScalingPolicy$Builder
                                                        CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder
                                                        CfnScalingPolicy$MetricDataQueryProperty$Builder
                                                        CfnScalingPolicy$MetricDimensionProperty$Builder
                                                        CfnScalingPolicy$MetricProperty$Builder
                                                        CfnScalingPolicy$MetricStatProperty$Builder
                                                        CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingConfigurationProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingCustomizedCapacityMetricProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingCustomizedLoadMetricProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingCustomizedScalingMetricProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingMetricSpecificationProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingPredefinedLoadMetricProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingPredefinedMetricPairProperty$Builder
                                                        CfnScalingPolicy$PredictiveScalingPredefinedScalingMetricProperty$Builder
                                                        CfnScalingPolicy$StepAdjustmentProperty$Builder
                                                        CfnScalingPolicy$TargetTrackingConfigurationProperty$Builder
                                                        CfnScalingPolicyProps$Builder
                                                        CfnScheduledAction$Builder
                                                        CfnScheduledActionProps$Builder
                                                        CfnWarmPool$Builder
                                                        CfnWarmPool$InstanceReusePolicyProperty$Builder
                                                        CfnWarmPoolProps$Builder
                                                        CommonAutoScalingGroupProps$Builder
                                                        CpuUtilizationScalingProps$Builder
                                                        CronOptions$Builder
                                                        DefaultResult
                                                        EbsDeviceOptions$Builder
                                                        EbsDeviceOptionsBase$Builder
                                                        EbsDeviceProps$Builder
                                                        EbsDeviceSnapshotOptions$Builder
                                                        EbsDeviceVolumeType
                                                        Ec2HealthCheckOptions$Builder
                                                        ElbHealthCheckOptions$Builder
                                                        InstancesDistribution$Builder
                                                        LaunchTemplateOverrides$Builder
                                                        LifecycleHook$Builder
                                                        LifecycleHookProps$Builder
                                                        LifecycleHookTargetConfig$Builder
                                                        LifecycleTransition
                                                        MetricAggregationType
                                                        MetricTargetTrackingProps$Builder
                                                        MixedInstancesPolicy$Builder
                                                        Monitoring
                                                        NetworkUtilizationScalingProps$Builder
                                                        NotificationConfiguration$Builder
                                                        OnDemandAllocationStrategy
                                                        PoolState
                                                        PredefinedMetric
                                                        RenderSignalsOptions$Builder
                                                        RequestCountScalingProps$Builder
                                                        RollingUpdateOptions$Builder
                                                        ScalingEvent
                                                        ScalingInterval$Builder
                                                        ScalingProcess
                                                        ScheduledAction$Builder
                                                        ScheduledActionProps$Builder
                                                        SignalsOptions$Builder
                                                        SpotAllocationStrategy
                                                        StepScalingAction$Builder
                                                        StepScalingActionProps$Builder
                                                        StepScalingPolicy$Builder
                                                        StepScalingPolicyProps$Builder
                                                        TargetTrackingScalingPolicy$Builder
                                                        TargetTrackingScalingPolicyProps$Builder
                                                        TerminationPolicy
                                                        WarmPool$Builder
                                                        WarmPoolOptions$Builder
                                                        WarmPoolProps$Builder]))


(defn adjustment-type
  "The `adjustment-type` function data interprets values in the provided config data into a 
`AdjustmentType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AdjustmentType` - the value is returned.
* is `:change-in-capacity` - `AdjustmentType/CHANGE_IN_CAPACITY` is returned
* is `:percent-change-in-capacity` - `AdjustmentType/PERCENT_CHANGE_IN_CAPACITY` is returned
* is `:exact-capacity` - `AdjustmentType/EXACT_CAPACITY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AdjustmentType data) data
      (= :change-in-capacity data) AdjustmentType/CHANGE_IN_CAPACITY
      (= :percent-change-in-capacity data) AdjustmentType/PERCENT_CHANGE_IN_CAPACITY
      (= :exact-capacity data) AdjustmentType/EXACT_CAPACITY)))


(defn default-result
  "The `default-result` function data interprets values in the provided config data into a 
`DefaultResult` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DefaultResult` - the value is returned.
* is `:continue` - `DefaultResult/CONTINUE` is returned
* is `:abandon` - `DefaultResult/ABANDON` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DefaultResult data) data
      (= :continue data) DefaultResult/CONTINUE
      (= :abandon data) DefaultResult/ABANDON)))


(defn ebs-device-volume-type
  "The `ebs-device-volume-type` function data interprets values in the provided config data into a 
`EbsDeviceVolumeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EbsDeviceVolumeType` - the value is returned.
* is `:io1` - `EbsDeviceVolumeType/IO1` is returned
* is `:gp2` - `EbsDeviceVolumeType/GP2` is returned
* is `:gp3` - `EbsDeviceVolumeType/GP3` is returned
* is `:sc1` - `EbsDeviceVolumeType/SC1` is returned
* is `:standard` - `EbsDeviceVolumeType/STANDARD` is returned
* is `:st1` - `EbsDeviceVolumeType/ST1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EbsDeviceVolumeType data) data
      (= :io1 data) EbsDeviceVolumeType/IO1
      (= :gp2 data) EbsDeviceVolumeType/GP2
      (= :gp3 data) EbsDeviceVolumeType/GP3
      (= :sc1 data) EbsDeviceVolumeType/SC1
      (= :standard data) EbsDeviceVolumeType/STANDARD
      (= :st1 data) EbsDeviceVolumeType/ST1)))


(defn lifecycle-transition
  "The `lifecycle-transition` function data interprets values in the provided config data into a 
`LifecycleTransition` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LifecycleTransition` - the value is returned.
* is `:instance-launching` - `LifecycleTransition/INSTANCE_LAUNCHING` is returned
* is `:instance-terminating` - `LifecycleTransition/INSTANCE_TERMINATING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LifecycleTransition data) data
      (= :instance-launching data) LifecycleTransition/INSTANCE_LAUNCHING
      (= :instance-terminating data) LifecycleTransition/INSTANCE_TERMINATING)))


(defn metric-aggregation-type
  "The `metric-aggregation-type` function data interprets values in the provided config data into a 
`MetricAggregationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MetricAggregationType` - the value is returned.
* is `:maximum` - `MetricAggregationType/MAXIMUM` is returned
* is `:minimum` - `MetricAggregationType/MINIMUM` is returned
* is `:average` - `MetricAggregationType/AVERAGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MetricAggregationType data) data
      (= :maximum data) MetricAggregationType/MAXIMUM
      (= :minimum data) MetricAggregationType/MINIMUM
      (= :average data) MetricAggregationType/AVERAGE)))


(defn monitoring
  "The `monitoring` function data interprets values in the provided config data into a 
`Monitoring` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Monitoring` - the value is returned.
* is `:basic` - `Monitoring/BASIC` is returned
* is `:detailed` - `Monitoring/DETAILED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Monitoring data) data
      (= :basic data) Monitoring/BASIC
      (= :detailed data) Monitoring/DETAILED)))


(defn on-demand-allocation-strategy
  "The `on-demand-allocation-strategy` function data interprets values in the provided config data into a 
`OnDemandAllocationStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OnDemandAllocationStrategy` - the value is returned.
* is `:prioritized` - `OnDemandAllocationStrategy/PRIORITIZED` is returned
* is `:lowest-price` - `OnDemandAllocationStrategy/LOWEST_PRICE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OnDemandAllocationStrategy data) data
      (= :prioritized data) OnDemandAllocationStrategy/PRIORITIZED
      (= :lowest-price data) OnDemandAllocationStrategy/LOWEST_PRICE)))


(defn pool-state
  "The `pool-state` function data interprets values in the provided config data into a 
`PoolState` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PoolState` - the value is returned.
* is `:stopped` - `PoolState/STOPPED` is returned
* is `:hibernated` - `PoolState/HIBERNATED` is returned
* is `:running` - `PoolState/RUNNING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PoolState data) data
      (= :stopped data) PoolState/STOPPED
      (= :hibernated data) PoolState/HIBERNATED
      (= :running data) PoolState/RUNNING)))


(defn predefined-metric
  "The `predefined-metric` function data interprets values in the provided config data into a 
`PredefinedMetric` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PredefinedMetric` - the value is returned.
* is `:alb-request-count-per-target` - `PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET` is returned
* is `:asg-average-network-in` - `PredefinedMetric/ASG_AVERAGE_NETWORK_IN` is returned
* is `:asg-average-network-out` - `PredefinedMetric/ASG_AVERAGE_NETWORK_OUT` is returned
* is `:asg-average-cpu-utilization` - `PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PredefinedMetric data) data
      (= :alb-request-count-per-target data) PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET
      (= :asg-average-network-in data) PredefinedMetric/ASG_AVERAGE_NETWORK_IN
      (= :asg-average-network-out data) PredefinedMetric/ASG_AVERAGE_NETWORK_OUT
      (= :asg-average-cpu-utilization data) PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION)))


(defn scaling-event
  "The `scaling-event` function data interprets values in the provided config data into a 
`ScalingEvent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ScalingEvent` - the value is returned.
* is `:instance-launch` - `ScalingEvent/INSTANCE_LAUNCH` is returned
* is `:instance-terminate-error` - `ScalingEvent/INSTANCE_TERMINATE_ERROR` is returned
* is `:test-notification` - `ScalingEvent/TEST_NOTIFICATION` is returned
* is `:instance-terminate` - `ScalingEvent/INSTANCE_TERMINATE` is returned
* is `:instance-launch-error` - `ScalingEvent/INSTANCE_LAUNCH_ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ScalingEvent data) data
      (= :instance-launch data) ScalingEvent/INSTANCE_LAUNCH
      (= :instance-terminate-error data) ScalingEvent/INSTANCE_TERMINATE_ERROR
      (= :test-notification data) ScalingEvent/TEST_NOTIFICATION
      (= :instance-terminate data) ScalingEvent/INSTANCE_TERMINATE
      (= :instance-launch-error data) ScalingEvent/INSTANCE_LAUNCH_ERROR)))


(defn scaling-process
  "The `scaling-process` function data interprets values in the provided config data into a 
`ScalingProcess` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ScalingProcess` - the value is returned.
* is `:terminate` - `ScalingProcess/TERMINATE` is returned
* is `:alarm-notification` - `ScalingProcess/ALARM_NOTIFICATION` is returned
* is `:launch` - `ScalingProcess/LAUNCH` is returned
* is `:add-to-load-balancer` - `ScalingProcess/ADD_TO_LOAD_BALANCER` is returned
* is `:scheduled-actions` - `ScalingProcess/SCHEDULED_ACTIONS` is returned
* is `:instance-refresh` - `ScalingProcess/INSTANCE_REFRESH` is returned
* is `:health-check` - `ScalingProcess/HEALTH_CHECK` is returned
* is `:az-rebalance` - `ScalingProcess/AZ_REBALANCE` is returned
* is `:replace-unhealthy` - `ScalingProcess/REPLACE_UNHEALTHY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ScalingProcess data) data
      (= :terminate data) ScalingProcess/TERMINATE
      (= :alarm-notification data) ScalingProcess/ALARM_NOTIFICATION
      (= :launch data) ScalingProcess/LAUNCH
      (= :add-to-load-balancer data) ScalingProcess/ADD_TO_LOAD_BALANCER
      (= :scheduled-actions data) ScalingProcess/SCHEDULED_ACTIONS
      (= :instance-refresh data) ScalingProcess/INSTANCE_REFRESH
      (= :health-check data) ScalingProcess/HEALTH_CHECK
      (= :az-rebalance data) ScalingProcess/AZ_REBALANCE
      (= :replace-unhealthy data) ScalingProcess/REPLACE_UNHEALTHY)))


(defn spot-allocation-strategy
  "The `spot-allocation-strategy` function data interprets values in the provided config data into a 
`SpotAllocationStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SpotAllocationStrategy` - the value is returned.
* is `:lowest-price` - `SpotAllocationStrategy/LOWEST_PRICE` is returned
* is `:capacity-optimized-prioritized` - `SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED` is returned
* is `:price-capacity-optimized` - `SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED` is returned
* is `:capacity-optimized` - `SpotAllocationStrategy/CAPACITY_OPTIMIZED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SpotAllocationStrategy data) data
      (= :lowest-price data) SpotAllocationStrategy/LOWEST_PRICE
      (= :capacity-optimized-prioritized data) SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED
      (= :price-capacity-optimized data) SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED
      (= :capacity-optimized data) SpotAllocationStrategy/CAPACITY_OPTIMIZED)))


(defn termination-policy
  "The `termination-policy` function data interprets values in the provided config data into a 
`TerminationPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TerminationPolicy` - the value is returned.
* is `:custom-lambda-function` - `TerminationPolicy/CUSTOM_LAMBDA_FUNCTION` is returned
* is `:default` - `TerminationPolicy/DEFAULT` is returned
* is `:oldest-instance` - `TerminationPolicy/OLDEST_INSTANCE` is returned
* is `:allocation-strategy` - `TerminationPolicy/ALLOCATION_STRATEGY` is returned
* is `:oldest-launch-template` - `TerminationPolicy/OLDEST_LAUNCH_TEMPLATE` is returned
* is `:newest-instance` - `TerminationPolicy/NEWEST_INSTANCE` is returned
* is `:oldest-launch-configuration` - `TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION` is returned
* is `:closest-to-next-instance-hour` - `TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TerminationPolicy data) data
      (= :custom-lambda-function data) TerminationPolicy/CUSTOM_LAMBDA_FUNCTION
      (= :default data) TerminationPolicy/DEFAULT
      (= :oldest-instance data) TerminationPolicy/OLDEST_INSTANCE
      (= :allocation-strategy data) TerminationPolicy/ALLOCATION_STRATEGY
      (= :oldest-launch-template data) TerminationPolicy/OLDEST_LAUNCH_TEMPLATE
      (= :newest-instance data) TerminationPolicy/NEWEST_INSTANCE
      (= :oldest-launch-configuration data) TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION
      (= :closest-to-next-instance-hour data) TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR)))


(defn adjustment-tier-builder
  "The adjustment-tier-builder function buildes out new instances of 
AdjustmentTier$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:adjustment` |
| `lowerBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower-bound` |
| `upperBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper-bound` |"
  [stack id config]
  (let [builder (AdjustmentTier$Builder.)]
    (when-let [data (lookup-entry config id :adjustment)]
      (. builder adjustment data))
    (when-let [data (lookup-entry config id :lower-bound)]
      (. builder lowerBound data))
    (when-let [data (lookup-entry config id :upper-bound)]
      (. builder upperBound data))
    (.build builder)))


(defn apply-cloud-formation-init-options-builder
  "The apply-cloud-formation-init-options-builder function buildes out new instances of 
ApplyCloudFormationInitOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSets` | java.util.List | [[cdk.support/lookup-entry]] | `:config-sets` |
| `embedFingerprint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:embed-fingerprint` |
| `ignoreFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-failures` |
| `includeRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-role` |
| `includeUrl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-url` |
| `printLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:print-log` |"
  [stack id config]
  (let [builder (ApplyCloudFormationInitOptions$Builder.)]
    (when-let [data (lookup-entry config id :config-sets)]
      (. builder configSets data))
    (when-let [data (lookup-entry config id :embed-fingerprint)]
      (. builder embedFingerprint data))
    (when-let [data (lookup-entry config id :ignore-failures)]
      (. builder ignoreFailures data))
    (when-let [data (lookup-entry config id :include-role)]
      (. builder includeRole data))
    (when-let [data (lookup-entry config id :include-url)]
      (. builder includeUrl data))
    (when-let [data (lookup-entry config id :print-log)]
      (. builder printLog data))
    (.build builder)))


(defn auto-scaling-group-builder
  "The auto-scaling-group-builder function buildes out new instances of 
AutoScalingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `capacityRebalance` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `defaultInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-instance-warmup` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `groupMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:group-metrics` |
| `healthCheck` | software.amazon.awscdk.services.autoscaling.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `ignoreUnmodifiedSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-size-properties` |
| `init` | software.amazon.awscdk.services.ec2.CloudFormationInit | [[cdk.support/lookup-entry]] | `:init` |
| `initOptions` | software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions | [[cdk.support/lookup-entry]] | `:init-options` |
| `instanceMonitoring` | software.amazon.awscdk.services.autoscaling.Monitoring | [[cdk.api.services.autoscaling/monitoring]] | `:instance-monitoring` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxHealthyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percentage` |
| `maxInstanceLifetime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `minHealthyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percentage` |
| `mixedInstancesPolicy` | software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy | [[cdk.support/lookup-entry]] | `:mixed-instances-policy` |
| `newInstancesProtectedFromScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notifications` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `signals` | software.amazon.awscdk.services.autoscaling.Signals | [[cdk.support/lookup-entry]] | `:signals` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `terminationPolicyCustomLambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:termination-policy-custom-lambda-function-arn` |
| `updatePolicy` | software.amazon.awscdk.services.autoscaling.UpdatePolicy | [[cdk.support/lookup-entry]] | `:update-policy` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (AutoScalingGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :default-instance-warmup)]
      (. builder defaultInstanceWarmup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :group-metrics)]
      (. builder groupMetrics data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :ignore-unmodified-size-properties)]
      (. builder ignoreUnmodifiedSizeProperties data))
    (when-let [data (lookup-entry config id :init)]
      (. builder init data))
    (when-let [data (lookup-entry config id :init-options)]
      (. builder initOptions data))
    (when-let [data (monitoring config id :instance-monitoring)]
      (. builder instanceMonitoring data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-healthy-percentage)]
      (. builder maxHealthyPercentage data))
    (when-let [data (lookup-entry config id :max-instance-lifetime)]
      (. builder maxInstanceLifetime data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :min-healthy-percentage)]
      (. builder minHealthyPercentage data))
    (when-let [data (lookup-entry config id :mixed-instances-policy)]
      (. builder mixedInstancesPolicy data))
    (when-let [data (lookup-entry config id :new-instances-protected-from-scale-in)]
      (. builder newInstancesProtectedFromScaleIn data))
    (when-let [data (lookup-entry config id :notifications)]
      (. builder notifications data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :signals)]
      (. builder signals data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :termination-policy-custom-lambda-function-arn)]
      (. builder terminationPolicyCustomLambdaFunctionArn data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn auto-scaling-group-props-builder
  "The auto-scaling-group-props-builder function buildes out new instances of 
AutoScalingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `capacityRebalance` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `defaultInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-instance-warmup` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `groupMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:group-metrics` |
| `healthCheck` | software.amazon.awscdk.services.autoscaling.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `ignoreUnmodifiedSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-size-properties` |
| `init` | software.amazon.awscdk.services.ec2.CloudFormationInit | [[cdk.support/lookup-entry]] | `:init` |
| `initOptions` | software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions | [[cdk.support/lookup-entry]] | `:init-options` |
| `instanceMonitoring` | software.amazon.awscdk.services.autoscaling.Monitoring | [[cdk.api.services.autoscaling/monitoring]] | `:instance-monitoring` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxHealthyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percentage` |
| `maxInstanceLifetime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `minHealthyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percentage` |
| `mixedInstancesPolicy` | software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy | [[cdk.support/lookup-entry]] | `:mixed-instances-policy` |
| `newInstancesProtectedFromScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notifications` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `signals` | software.amazon.awscdk.services.autoscaling.Signals | [[cdk.support/lookup-entry]] | `:signals` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `terminationPolicyCustomLambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:termination-policy-custom-lambda-function-arn` |
| `updatePolicy` | software.amazon.awscdk.services.autoscaling.UpdatePolicy | [[cdk.support/lookup-entry]] | `:update-policy` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (AutoScalingGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :default-instance-warmup)]
      (. builder defaultInstanceWarmup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :group-metrics)]
      (. builder groupMetrics data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :ignore-unmodified-size-properties)]
      (. builder ignoreUnmodifiedSizeProperties data))
    (when-let [data (lookup-entry config id :init)]
      (. builder init data))
    (when-let [data (lookup-entry config id :init-options)]
      (. builder initOptions data))
    (when-let [data (monitoring config id :instance-monitoring)]
      (. builder instanceMonitoring data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-healthy-percentage)]
      (. builder maxHealthyPercentage data))
    (when-let [data (lookup-entry config id :max-instance-lifetime)]
      (. builder maxInstanceLifetime data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :min-healthy-percentage)]
      (. builder minHealthyPercentage data))
    (when-let [data (lookup-entry config id :mixed-instances-policy)]
      (. builder mixedInstancesPolicy data))
    (when-let [data (lookup-entry config id :new-instances-protected-from-scale-in)]
      (. builder newInstancesProtectedFromScaleIn data))
    (when-let [data (lookup-entry config id :notifications)]
      (. builder notifications data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :signals)]
      (. builder signals data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :termination-policy-custom-lambda-function-arn)]
      (. builder terminationPolicyCustomLambdaFunctionArn data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn base-target-tracking-props-builder
  "The base-target-tracking-props-builder function buildes out new instances of 
BaseTargetTrackingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |"
  [stack id config]
  (let [builder (BaseTargetTrackingProps$Builder.)]
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (.build builder)))


(defn basic-lifecycle-hook-props-builder
  "The basic-lifecycle-hook-props-builder function buildes out new instances of 
BasicLifecycleHookProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResult` | software.amazon.awscdk.services.autoscaling.DefaultResult | [[cdk.api.services.autoscaling/default-result]] | `:default-result` |
| `heartbeatTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `lifecycleHookName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-hook-name` |
| `lifecycleTransition` | software.amazon.awscdk.services.autoscaling.LifecycleTransition | [[cdk.api.services.autoscaling/lifecycle-transition]] | `:lifecycle-transition` |
| `notificationMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-metadata` |
| `notificationTarget` | software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget | [[cdk.support/lookup-entry]] | `:notification-target` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (BasicLifecycleHookProps$Builder.)]
    (when-let [data (default-result config id :default-result)]
      (. builder defaultResult data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :lifecycle-hook-name)]
      (. builder lifecycleHookName data))
    (when-let [data (lifecycle-transition config id :lifecycle-transition)]
      (. builder lifecycleTransition data))
    (when-let [data (lookup-entry config id :notification-metadata)]
      (. builder notificationMetadata data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn basic-scheduled-action-props-builder
  "The basic-scheduled-action-props-builder function buildes out new instances of 
BasicScheduledActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `endTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:end-time` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `schedule` | software.amazon.awscdk.services.autoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `startTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (BasicScheduledActionProps$Builder.)]
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
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
    (.build builder)))


(defn basic-step-scaling-policy-props-builder
  "The basic-step-scaling-policy-props-builder function buildes out new instances of 
BasicStepScalingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.autoscaling.AdjustmentType | [[cdk.api.services.autoscaling/adjustment-type]] | `:adjustment-type` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `metricAggregationType` | software.amazon.awscdk.services.autoscaling.MetricAggregationType | [[cdk.api.services.autoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |"
  [stack id config]
  (let [builder (BasicStepScalingPolicyProps$Builder.)]
    (when-let [data (adjustment-type config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
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
    (.build builder)))


(defn basic-target-tracking-scaling-policy-props-builder
  "The basic-target-tracking-scaling-policy-props-builder function buildes out new instances of 
BasicTargetTrackingScalingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `customMetric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:custom-metric` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `predefinedMetric` | software.amazon.awscdk.services.autoscaling.PredefinedMetric | [[cdk.api.services.autoscaling/predefined-metric]] | `:predefined-metric` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (BasicTargetTrackingScalingPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :custom-metric)]
      (. builder customMetric data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (predefined-metric config id :predefined-metric)]
      (. builder predefinedMetric data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn bind-hook-target-options-builder
  "The bind-hook-target-options-builder function buildes out new instances of 
BindHookTargetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lifecycleHook` | software.amazon.awscdk.services.autoscaling.LifecycleHook | [[cdk.support/lookup-entry]] | `:lifecycle-hook` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (BindHookTargetOptions$Builder.)]
    (when-let [data (lookup-entry config id :lifecycle-hook)]
      (. builder lifecycleHook data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn block-device-builder
  "The block-device-builder function buildes out new instances of 
BlockDevice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `volume` | software.amazon.awscdk.services.autoscaling.BlockDeviceVolume | [[cdk.support/lookup-entry]] | `:volume` |"
  [stack id config]
  (let [builder (BlockDevice$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :volume)]
      (. builder volume data))
    (.build builder)))


(defn cfn-auto-scaling-group-accelerator-count-request-property-builder
  "The cfn-auto-scaling-group-accelerator-count-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$AcceleratorCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$AcceleratorCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-accelerator-total-memory-mi-b-request-property-builder
  "The cfn-auto-scaling-group-accelerator-total-memory-mi-b-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$AcceleratorTotalMemoryMiBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$AcceleratorTotalMemoryMiBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-baseline-ebs-bandwidth-mbps-request-property-builder
  "The cfn-auto-scaling-group-baseline-ebs-bandwidth-mbps-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$BaselineEbsBandwidthMbpsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$BaselineEbsBandwidthMbpsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-builder
  "The cfn-auto-scaling-group-builder function buildes out new instances of 
CfnAutoScalingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `capacityRebalance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `cooldown` | java.lang.String | [[cdk.support/lookup-entry]] | `:cooldown` |
| `defaultInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-instance-warmup` |
| `desiredCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `desiredCapacityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-capacity-type` |
| `healthCheckGracePeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `healthCheckType` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-type` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `instanceMaintenancePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-maintenance-policy` |
| `launchConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-configuration-name` |
| `launchTemplate` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$LaunchTemplateSpecificationProperty | [[cdk.support/lookup-entry]] | `:launch-template` |
| `lifecycleHookSpecificationList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-hook-specification-list` |
| `loadBalancerNames` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-names` |
| `maxInstanceLifetime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `maxSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-size` |
| `metricsCollection` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics-collection` |
| `minSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:min-size` |
| `mixedInstancesPolicy` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$MixedInstancesPolicyProperty | [[cdk.support/lookup-entry]] | `:mixed-instances-policy` |
| `newInstancesProtectedFromScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notificationConfiguration` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `notificationConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-configurations` |
| `placementGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group` |
| `serviceLinkedRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-linked-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-group-arns` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `vpcZoneIdentifier` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-zone-identifier` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :default-instance-warmup)]
      (. builder defaultInstanceWarmup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :desired-capacity-type)]
      (. builder desiredCapacityType data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :health-check-type)]
      (. builder healthCheckType data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :instance-maintenance-policy)]
      (. builder instanceMaintenancePolicy data))
    (when-let [data (lookup-entry config id :launch-configuration-name)]
      (. builder launchConfigurationName data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :lifecycle-hook-specification-list)]
      (. builder lifecycleHookSpecificationList data))
    (when-let [data (lookup-entry config id :load-balancer-names)]
      (. builder loadBalancerNames data))
    (when-let [data (lookup-entry config id :max-instance-lifetime)]
      (. builder maxInstanceLifetime data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :metrics-collection)]
      (. builder metricsCollection data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :mixed-instances-policy)]
      (. builder mixedInstancesPolicy data))
    (when-let [data (lookup-entry config id :new-instances-protected-from-scale-in)]
      (. builder newInstancesProtectedFromScaleIn data))
    (when-let [data (lookup-entry config id :notification-configuration)]
      (. builder notificationConfiguration data))
    (when-let [data (lookup-entry config id :notification-configurations)]
      (. builder notificationConfigurations data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :service-linked-role-arn)]
      (. builder serviceLinkedRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-group-arns)]
      (. builder targetGroupArns data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :vpc-zone-identifier)]
      (. builder vpcZoneIdentifier data))
    (.build builder)))


(defn cfn-auto-scaling-group-instance-maintenance-policy-property-builder
  "The cfn-auto-scaling-group-instance-maintenance-policy-property-builder function buildes out new instances of 
CfnAutoScalingGroup$InstanceMaintenancePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxHealthyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percentage` |
| `minHealthyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percentage` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$InstanceMaintenancePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-healthy-percentage)]
      (. builder maxHealthyPercentage data))
    (when-let [data (lookup-entry config id :min-healthy-percentage)]
      (. builder minHealthyPercentage data))
    (.build builder)))


(defn cfn-auto-scaling-group-instance-requirements-property-builder
  "The cfn-auto-scaling-group-instance-requirements-property-builder function buildes out new instances of 
CfnAutoScalingGroup$InstanceRequirementsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accelerator-count` |
| `acceleratorManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-manufacturers` |
| `acceleratorNames` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-names` |
| `acceleratorTotalMemoryMiB` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$AcceleratorTotalMemoryMiBRequestProperty | [[cdk.support/lookup-entry]] | `:accelerator-total-memory-mi-b` |
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `allowedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-instance-types` |
| `bareMetal` | java.lang.String | [[cdk.support/lookup-entry]] | `:bare-metal` |
| `baselineEbsBandwidthMbps` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$BaselineEbsBandwidthMbpsRequestProperty | [[cdk.support/lookup-entry]] | `:baseline-ebs-bandwidth-mbps` |
| `burstablePerformance` | java.lang.String | [[cdk.support/lookup-entry]] | `:burstable-performance` |
| `cpuManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:cpu-manufacturers` |
| `excludedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-instance-types` |
| `instanceGenerations` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-generations` |
| `localStorage` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-storage` |
| `localStorageTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-storage-types` |
| `maxSpotPriceAsPercentageOfOptimalOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-spot-price-as-percentage-of-optimal-on-demand-price` |
| `memoryGiBPerVCpu` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$MemoryGiBPerVCpuRequestProperty | [[cdk.support/lookup-entry]] | `:memory-gi-b-per-v-cpu` |
| `memoryMiB` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$MemoryMiBRequestProperty | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `networkBandwidthGbps` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$NetworkBandwidthGbpsRequestProperty | [[cdk.support/lookup-entry]] | `:network-bandwidth-gbps` |
| `networkInterfaceCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interface-count` |
| `onDemandMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-max-price-percentage-over-lowest-price` |
| `requireHibernateSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-hibernate-support` |
| `spotMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-max-price-percentage-over-lowest-price` |
| `totalLocalStorageGb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:total-local-storage-gb` |
| `vCpuCount` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$VCpuCountRequestProperty | [[cdk.support/lookup-entry]] | `:v-cpu-count` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$InstanceRequirementsProperty$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-count)]
      (. builder acceleratorCount data))
    (when-let [data (lookup-entry config id :accelerator-manufacturers)]
      (. builder acceleratorManufacturers data))
    (when-let [data (lookup-entry config id :accelerator-names)]
      (. builder acceleratorNames data))
    (when-let [data (lookup-entry config id :accelerator-total-memory-mi-b)]
      (. builder acceleratorTotalMemoryMiB data))
    (when-let [data (lookup-entry config id :accelerator-types)]
      (. builder acceleratorTypes data))
    (when-let [data (lookup-entry config id :allowed-instance-types)]
      (. builder allowedInstanceTypes data))
    (when-let [data (lookup-entry config id :bare-metal)]
      (. builder bareMetal data))
    (when-let [data (lookup-entry config id :baseline-ebs-bandwidth-mbps)]
      (. builder baselineEbsBandwidthMbps data))
    (when-let [data (lookup-entry config id :burstable-performance)]
      (. builder burstablePerformance data))
    (when-let [data (lookup-entry config id :cpu-manufacturers)]
      (. builder cpuManufacturers data))
    (when-let [data (lookup-entry config id :excluded-instance-types)]
      (. builder excludedInstanceTypes data))
    (when-let [data (lookup-entry config id :instance-generations)]
      (. builder instanceGenerations data))
    (when-let [data (lookup-entry config id :local-storage)]
      (. builder localStorage data))
    (when-let [data (lookup-entry config id :local-storage-types)]
      (. builder localStorageTypes data))
    (when-let [data (lookup-entry config id :max-spot-price-as-percentage-of-optimal-on-demand-price)]
      (. builder maxSpotPriceAsPercentageOfOptimalOnDemandPrice data))
    (when-let [data (lookup-entry config id :memory-gi-b-per-v-cpu)]
      (. builder memoryGiBPerVCpu data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (lookup-entry config id :network-bandwidth-gbps)]
      (. builder networkBandwidthGbps data))
    (when-let [data (lookup-entry config id :network-interface-count)]
      (. builder networkInterfaceCount data))
    (when-let [data (lookup-entry config id :on-demand-max-price-percentage-over-lowest-price)]
      (. builder onDemandMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :require-hibernate-support)]
      (. builder requireHibernateSupport data))
    (when-let [data (lookup-entry config id :spot-max-price-percentage-over-lowest-price)]
      (. builder spotMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :total-local-storage-gb)]
      (. builder totalLocalStorageGb data))
    (when-let [data (lookup-entry config id :v-cpu-count)]
      (. builder vCpuCount data))
    (.build builder)))


(defn cfn-auto-scaling-group-instances-distribution-property-builder
  "The cfn-auto-scaling-group-instances-distribution-property-builder function buildes out new instances of 
CfnAutoScalingGroup$InstancesDistributionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandAllocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-demand-allocation-strategy` |
| `onDemandBaseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-base-capacity` |
| `onDemandPercentageAboveBaseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-percentage-above-base-capacity` |
| `spotAllocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-allocation-strategy` |
| `spotInstancePools` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-instance-pools` |
| `spotMaxPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-max-price` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$InstancesDistributionProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-demand-allocation-strategy)]
      (. builder onDemandAllocationStrategy data))
    (when-let [data (lookup-entry config id :on-demand-base-capacity)]
      (. builder onDemandBaseCapacity data))
    (when-let [data (lookup-entry config id :on-demand-percentage-above-base-capacity)]
      (. builder onDemandPercentageAboveBaseCapacity data))
    (when-let [data (lookup-entry config id :spot-allocation-strategy)]
      (. builder spotAllocationStrategy data))
    (when-let [data (lookup-entry config id :spot-instance-pools)]
      (. builder spotInstancePools data))
    (when-let [data (lookup-entry config id :spot-max-price)]
      (. builder spotMaxPrice data))
    (.build builder)))


(defn cfn-auto-scaling-group-launch-template-overrides-property-builder
  "The cfn-auto-scaling-group-launch-template-overrides-property-builder function buildes out new instances of 
CfnAutoScalingGroup$LaunchTemplateOverridesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceRequirements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-requirements` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `launchTemplateSpecification` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$LaunchTemplateSpecificationProperty | [[cdk.support/lookup-entry]] | `:launch-template-specification` |
| `weightedCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$LaunchTemplateOverridesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-requirements)]
      (. builder instanceRequirements data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :launch-template-specification)]
      (. builder launchTemplateSpecification data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn cfn-auto-scaling-group-launch-template-property-builder
  "The cfn-auto-scaling-group-launch-template-property-builder function buildes out new instances of 
CfnAutoScalingGroup$LaunchTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateSpecification` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$LaunchTemplateSpecificationProperty | [[cdk.support/lookup-entry]] | `:launch-template-specification` |
| `overrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overrides` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$LaunchTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-specification)]
      (. builder launchTemplateSpecification data))
    (when-let [data (lookup-entry config id :overrides)]
      (. builder overrides data))
    (.build builder)))


(defn cfn-auto-scaling-group-launch-template-specification-property-builder
  "The cfn-auto-scaling-group-launch-template-specification-property-builder function buildes out new instances of 
CfnAutoScalingGroup$LaunchTemplateSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$LaunchTemplateSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-auto-scaling-group-lifecycle-hook-specification-property-builder
  "The cfn-auto-scaling-group-lifecycle-hook-specification-property-builder function buildes out new instances of 
CfnAutoScalingGroup$LifecycleHookSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResult` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-result` |
| `heartbeatTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `lifecycleHookName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-hook-name` |
| `lifecycleTransition` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-transition` |
| `notificationMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-metadata` |
| `notificationTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$LifecycleHookSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-result)]
      (. builder defaultResult data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :lifecycle-hook-name)]
      (. builder lifecycleHookName data))
    (when-let [data (lookup-entry config id :lifecycle-transition)]
      (. builder lifecycleTransition data))
    (when-let [data (lookup-entry config id :notification-metadata)]
      (. builder notificationMetadata data))
    (when-let [data (lookup-entry config id :notification-target-arn)]
      (. builder notificationTargetArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-auto-scaling-group-memory-gi-b-per-v-cpu-request-property-builder
  "The cfn-auto-scaling-group-memory-gi-b-per-v-cpu-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$MemoryGiBPerVCpuRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$MemoryGiBPerVCpuRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-memory-mi-b-request-property-builder
  "The cfn-auto-scaling-group-memory-mi-b-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$MemoryMiBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$MemoryMiBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-metrics-collection-property-builder
  "The cfn-auto-scaling-group-metrics-collection-property-builder function buildes out new instances of 
CfnAutoScalingGroup$MetricsCollectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `granularity` | java.lang.String | [[cdk.support/lookup-entry]] | `:granularity` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$MetricsCollectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :granularity)]
      (. builder granularity data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (.build builder)))


(defn cfn-auto-scaling-group-mixed-instances-policy-property-builder
  "The cfn-auto-scaling-group-mixed-instances-policy-property-builder function buildes out new instances of 
CfnAutoScalingGroup$MixedInstancesPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instancesDistribution` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$InstancesDistributionProperty | [[cdk.support/lookup-entry]] | `:instances-distribution` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$MixedInstancesPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :instances-distribution)]
      (. builder instancesDistribution data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (.build builder)))


(defn cfn-auto-scaling-group-network-bandwidth-gbps-request-property-builder
  "The cfn-auto-scaling-group-network-bandwidth-gbps-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$NetworkBandwidthGbpsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$NetworkBandwidthGbpsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-network-interface-count-request-property-builder
  "The cfn-auto-scaling-group-network-interface-count-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$NetworkInterfaceCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$NetworkInterfaceCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-notification-configuration-property-builder
  "The cfn-auto-scaling-group-notification-configuration-property-builder function buildes out new instances of 
CfnAutoScalingGroup$NotificationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-types` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$NotificationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :notification-types)]
      (. builder notificationTypes data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-auto-scaling-group-props-builder
  "The cfn-auto-scaling-group-props-builder function buildes out new instances of 
CfnAutoScalingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `capacityRebalance` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `cooldown` | java.lang.String | [[cdk.support/lookup-entry]] | `:cooldown` |
| `defaultInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-instance-warmup` |
| `desiredCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `desiredCapacityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-capacity-type` |
| `healthCheckGracePeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `healthCheckType` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-type` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `instanceMaintenancePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-maintenance-policy` |
| `launchConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-configuration-name` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |
| `lifecycleHookSpecificationList` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-hook-specification-list` |
| `loadBalancerNames` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-names` |
| `maxInstanceLifetime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `maxSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-size` |
| `metricsCollection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metrics-collection` |
| `minSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:min-size` |
| `mixedInstancesPolicy` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$MixedInstancesPolicyProperty | [[cdk.support/lookup-entry]] | `:mixed-instances-policy` |
| `newInstancesProtectedFromScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notificationConfiguration` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `notificationConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-configurations` |
| `placementGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group` |
| `serviceLinkedRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-linked-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-group-arns` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `vpcZoneIdentifier` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-zone-identifier` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :default-instance-warmup)]
      (. builder defaultInstanceWarmup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :desired-capacity-type)]
      (. builder desiredCapacityType data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :health-check-type)]
      (. builder healthCheckType data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :instance-maintenance-policy)]
      (. builder instanceMaintenancePolicy data))
    (when-let [data (lookup-entry config id :launch-configuration-name)]
      (. builder launchConfigurationName data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :lifecycle-hook-specification-list)]
      (. builder lifecycleHookSpecificationList data))
    (when-let [data (lookup-entry config id :load-balancer-names)]
      (. builder loadBalancerNames data))
    (when-let [data (lookup-entry config id :max-instance-lifetime)]
      (. builder maxInstanceLifetime data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :metrics-collection)]
      (. builder metricsCollection data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :mixed-instances-policy)]
      (. builder mixedInstancesPolicy data))
    (when-let [data (lookup-entry config id :new-instances-protected-from-scale-in)]
      (. builder newInstancesProtectedFromScaleIn data))
    (when-let [data (lookup-entry config id :notification-configuration)]
      (. builder notificationConfiguration data))
    (when-let [data (lookup-entry config id :notification-configurations)]
      (. builder notificationConfigurations data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :service-linked-role-arn)]
      (. builder serviceLinkedRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-group-arns)]
      (. builder targetGroupArns data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :vpc-zone-identifier)]
      (. builder vpcZoneIdentifier data))
    (.build builder)))


(defn cfn-auto-scaling-group-tag-property-property-builder
  "The cfn-auto-scaling-group-tag-property-property-builder function buildes out new instances of 
CfnAutoScalingGroup$TagPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `propagateAtLaunch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:propagate-at-launch` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$TagPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :propagate-at-launch)]
      (. builder propagateAtLaunch data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-auto-scaling-group-total-local-storage-gb-request-property-builder
  "The cfn-auto-scaling-group-total-local-storage-gb-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$TotalLocalStorageGBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$TotalLocalStorageGBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-auto-scaling-group-v-cpu-count-request-property-builder
  "The cfn-auto-scaling-group-v-cpu-count-request-property-builder function buildes out new instances of 
CfnAutoScalingGroup$VCpuCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnAutoScalingGroup$VCpuCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-configuration-block-device-mapping-property-builder
  "The cfn-launch-configuration-block-device-mapping-property-builder function buildes out new instances of 
CfnLaunchConfiguration$BlockDeviceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration$BlockDeviceProperty | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |"
  [stack id config]
  (let [builder (CfnLaunchConfiguration$BlockDeviceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :no-device)]
      (. builder noDevice data))
    (when-let [data (lookup-entry config id :virtual-name)]
      (. builder virtualName data))
    (.build builder)))


(defn cfn-launch-configuration-block-device-property-builder
  "The cfn-launch-configuration-block-device-property-builder function buildes out new instances of 
CfnLaunchConfiguration$BlockDeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnLaunchConfiguration$BlockDeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-launch-configuration-builder
  "The cfn-launch-configuration-builder function buildes out new instances of 
CfnLaunchConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `blockDeviceMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `classicLinkVpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:classic-link-vpc-id` |
| `classicLinkVpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:classic-link-vpc-security-groups` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `iamInstanceProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-instance-profile` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `instanceMonitoring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:instance-monitoring` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kernelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kernel-id` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `launchConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-configuration-name` |
| `metadataOptions` | software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration$MetadataOptionsProperty | [[cdk.support/lookup-entry]] | `:metadata-options` |
| `placementTenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-tenancy` |
| `ramDiskId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ram-disk-id` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (CfnLaunchConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :classic-link-vpc-id)]
      (. builder classicLinkVpcId data))
    (when-let [data (lookup-entry config id :classic-link-vpc-security-groups)]
      (. builder classicLinkVpcSecurityGroups data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :iam-instance-profile)]
      (. builder iamInstanceProfile data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :instance-monitoring)]
      (. builder instanceMonitoring data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :kernel-id)]
      (. builder kernelId data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :launch-configuration-name)]
      (. builder launchConfigurationName data))
    (when-let [data (lookup-entry config id :metadata-options)]
      (. builder metadataOptions data))
    (when-let [data (lookup-entry config id :placement-tenancy)]
      (. builder placementTenancy data))
    (when-let [data (lookup-entry config id :ram-disk-id)]
      (. builder ramDiskId data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn cfn-launch-configuration-metadata-options-property-builder
  "The cfn-launch-configuration-metadata-options-property-builder function buildes out new instances of 
CfnLaunchConfiguration$MetadataOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-endpoint` |
| `httpPutResponseHopLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-put-response-hop-limit` |
| `httpTokens` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-tokens` |"
  [stack id config]
  (let [builder (CfnLaunchConfiguration$MetadataOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-endpoint)]
      (. builder httpEndpoint data))
    (when-let [data (lookup-entry config id :http-put-response-hop-limit)]
      (. builder httpPutResponseHopLimit data))
    (when-let [data (lookup-entry config id :http-tokens)]
      (. builder httpTokens data))
    (.build builder)))


(defn cfn-launch-configuration-props-builder
  "The cfn-launch-configuration-props-builder function buildes out new instances of 
CfnLaunchConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `classicLinkVpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:classic-link-vpc-id` |
| `classicLinkVpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:classic-link-vpc-security-groups` |
| `ebsOptimized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `iamInstanceProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-instance-profile` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `instanceMonitoring` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-monitoring` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kernelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kernel-id` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `launchConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-configuration-name` |
| `metadataOptions` | software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration$MetadataOptionsProperty | [[cdk.support/lookup-entry]] | `:metadata-options` |
| `placementTenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-tenancy` |
| `ramDiskId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ram-disk-id` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (CfnLaunchConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :classic-link-vpc-id)]
      (. builder classicLinkVpcId data))
    (when-let [data (lookup-entry config id :classic-link-vpc-security-groups)]
      (. builder classicLinkVpcSecurityGroups data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :iam-instance-profile)]
      (. builder iamInstanceProfile data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :instance-monitoring)]
      (. builder instanceMonitoring data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :kernel-id)]
      (. builder kernelId data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :launch-configuration-name)]
      (. builder launchConfigurationName data))
    (when-let [data (lookup-entry config id :metadata-options)]
      (. builder metadataOptions data))
    (when-let [data (lookup-entry config id :placement-tenancy)]
      (. builder placementTenancy data))
    (when-let [data (lookup-entry config id :ram-disk-id)]
      (. builder ramDiskId data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn cfn-lifecycle-hook-builder
  "The cfn-lifecycle-hook-builder function buildes out new instances of 
CfnLifecycleHook$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `defaultResult` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-result` |
| `heartbeatTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `lifecycleHookName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-hook-name` |
| `lifecycleTransition` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-transition` |
| `notificationMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-metadata` |
| `notificationTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnLifecycleHook$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :default-result)]
      (. builder defaultResult data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :lifecycle-hook-name)]
      (. builder lifecycleHookName data))
    (when-let [data (lookup-entry config id :lifecycle-transition)]
      (. builder lifecycleTransition data))
    (when-let [data (lookup-entry config id :notification-metadata)]
      (. builder notificationMetadata data))
    (when-let [data (lookup-entry config id :notification-target-arn)]
      (. builder notificationTargetArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-lifecycle-hook-props-builder
  "The cfn-lifecycle-hook-props-builder function buildes out new instances of 
CfnLifecycleHookProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `defaultResult` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-result` |
| `heartbeatTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `lifecycleHookName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-hook-name` |
| `lifecycleTransition` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-transition` |
| `notificationMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-metadata` |
| `notificationTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnLifecycleHookProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :default-result)]
      (. builder defaultResult data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :lifecycle-hook-name)]
      (. builder lifecycleHookName data))
    (when-let [data (lookup-entry config id :lifecycle-transition)]
      (. builder lifecycleTransition data))
    (when-let [data (lookup-entry config id :notification-metadata)]
      (. builder notificationMetadata data))
    (when-let [data (lookup-entry config id :notification-target-arn)]
      (. builder notificationTargetArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-scaling-policy-builder
  "The cfn-scaling-policy-builder function buildes out new instances of 
CfnScalingPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `cooldown` | java.lang.String | [[cdk.support/lookup-entry]] | `:cooldown` |
| `estimatedInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `metricAggregationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `predictiveScalingConfiguration` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$PredictiveScalingConfigurationProperty | [[cdk.support/lookup-entry]] | `:predictive-scaling-configuration` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
| `stepAdjustments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-adjustments` |
| `targetTrackingConfiguration` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$TargetTrackingConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-tracking-configuration` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :metric-aggregation-type)]
      (. builder metricAggregationType data))
    (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
      (. builder minAdjustmentMagnitude data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (when-let [data (lookup-entry config id :predictive-scaling-configuration)]
      (. builder predictiveScalingConfiguration data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (when-let [data (lookup-entry config id :step-adjustments)]
      (. builder stepAdjustments data))
    (when-let [data (lookup-entry config id :target-tracking-configuration)]
      (. builder targetTrackingConfiguration data))
    (.build builder)))


(defn cfn-scaling-policy-customized-metric-specification-property-builder
  "The cfn-scaling-policy-customized-metric-specification-property-builder function buildes out new instances of 
CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$CustomizedMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-scaling-policy-metric-data-query-property-builder
  "The cfn-scaling-policy-metric-data-query-property-builder function buildes out new instances of 
CfnScalingPolicy$MetricDataQueryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `metricStat` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$MetricStatProperty | [[cdk.support/lookup-entry]] | `:metric-stat` |
| `returnData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:return-data` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$MetricDataQueryProperty$Builder.)]
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
    (.build builder)))


(defn cfn-scaling-policy-metric-dimension-property-builder
  "The cfn-scaling-policy-metric-dimension-property-builder function buildes out new instances of 
CfnScalingPolicy$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-scaling-policy-metric-property-builder
  "The cfn-scaling-policy-metric-property-builder function buildes out new instances of 
CfnScalingPolicy$MetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$MetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-scaling-policy-metric-stat-property-builder
  "The cfn-scaling-policy-metric-stat-property-builder function buildes out new instances of 
CfnScalingPolicy$MetricStatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metric` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$MetricProperty | [[cdk.support/lookup-entry]] | `:metric` |
| `stat` | java.lang.String | [[cdk.support/lookup-entry]] | `:stat` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$MetricStatProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :stat)]
      (. builder stat data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-scaling-policy-predefined-metric-specification-property-builder
  "The cfn-scaling-policy-predefined-metric-specification-property-builder function buildes out new instances of 
CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredefinedMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :predefined-metric-type)]
      (. builder predefinedMetricType data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-configuration-property-builder
  "The cfn-scaling-policy-predictive-scaling-configuration-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacityBreachBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-capacity-breach-behavior` |
| `maxCapacityBuffer` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity-buffer` |
| `metricSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-specifications` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `schedulingBufferTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-buffer-time` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity-breach-behavior)]
      (. builder maxCapacityBreachBehavior data))
    (when-let [data (lookup-entry config id :max-capacity-buffer)]
      (. builder maxCapacityBuffer data))
    (when-let [data (lookup-entry config id :metric-specifications)]
      (. builder metricSpecifications data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :scheduling-buffer-time)]
      (. builder schedulingBufferTime data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-customized-capacity-metric-property-builder
  "The cfn-scaling-policy-predictive-scaling-customized-capacity-metric-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingCustomizedCapacityMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDataQueries` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-data-queries` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingCustomizedCapacityMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-data-queries)]
      (. builder metricDataQueries data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-customized-load-metric-property-builder
  "The cfn-scaling-policy-predictive-scaling-customized-load-metric-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingCustomizedLoadMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDataQueries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-data-queries` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingCustomizedLoadMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-data-queries)]
      (. builder metricDataQueries data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-customized-scaling-metric-property-builder
  "The cfn-scaling-policy-predictive-scaling-customized-scaling-metric-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingCustomizedScalingMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricDataQueries` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-data-queries` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingCustomizedScalingMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-data-queries)]
      (. builder metricDataQueries data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-metric-specification-property-builder
  "The cfn-scaling-policy-predictive-scaling-metric-specification-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customizedCapacityMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-capacity-metric-specification` |
| `customizedLoadMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-load-metric-specification` |
| `customizedScalingMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-scaling-metric-specification` |
| `predefinedLoadMetricSpecification` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$PredictiveScalingPredefinedLoadMetricProperty | [[cdk.support/lookup-entry]] | `:predefined-load-metric-specification` |
| `predefinedMetricPairSpecification` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$PredictiveScalingPredefinedMetricPairProperty | [[cdk.support/lookup-entry]] | `:predefined-metric-pair-specification` |
| `predefinedScalingMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predefined-scaling-metric-specification` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customized-capacity-metric-specification)]
      (. builder customizedCapacityMetricSpecification data))
    (when-let [data (lookup-entry config id :customized-load-metric-specification)]
      (. builder customizedLoadMetricSpecification data))
    (when-let [data (lookup-entry config id :customized-scaling-metric-specification)]
      (. builder customizedScalingMetricSpecification data))
    (when-let [data (lookup-entry config id :predefined-load-metric-specification)]
      (. builder predefinedLoadMetricSpecification data))
    (when-let [data (lookup-entry config id :predefined-metric-pair-specification)]
      (. builder predefinedMetricPairSpecification data))
    (when-let [data (lookup-entry config id :predefined-scaling-metric-specification)]
      (. builder predefinedScalingMetricSpecification data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-predefined-load-metric-property-builder
  "The cfn-scaling-policy-predictive-scaling-predefined-load-metric-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingPredefinedLoadMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingPredefinedLoadMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :predefined-metric-type)]
      (. builder predefinedMetricType data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-predefined-metric-pair-property-builder
  "The cfn-scaling-policy-predictive-scaling-predefined-metric-pair-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingPredefinedMetricPairProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingPredefinedMetricPairProperty$Builder.)]
    (when-let [data (lookup-entry config id :predefined-metric-type)]
      (. builder predefinedMetricType data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (.build builder)))


(defn cfn-scaling-policy-predictive-scaling-predefined-scaling-metric-property-builder
  "The cfn-scaling-policy-predictive-scaling-predefined-scaling-metric-property-builder function buildes out new instances of 
CfnScalingPolicy$PredictiveScalingPredefinedScalingMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$PredictiveScalingPredefinedScalingMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :predefined-metric-type)]
      (. builder predefinedMetricType data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (.build builder)))


(defn cfn-scaling-policy-props-builder
  "The cfn-scaling-policy-props-builder function buildes out new instances of 
CfnScalingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `cooldown` | java.lang.String | [[cdk.support/lookup-entry]] | `:cooldown` |
| `estimatedInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `metricAggregationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `predictiveScalingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predictive-scaling-configuration` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
| `stepAdjustments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-adjustments` |
| `targetTrackingConfiguration` | software.amazon.awscdk.services.autoscaling.CfnScalingPolicy$TargetTrackingConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-tracking-configuration` |"
  [stack id config]
  (let [builder (CfnScalingPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :metric-aggregation-type)]
      (. builder metricAggregationType data))
    (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
      (. builder minAdjustmentMagnitude data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (when-let [data (lookup-entry config id :predictive-scaling-configuration)]
      (. builder predictiveScalingConfiguration data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (when-let [data (lookup-entry config id :step-adjustments)]
      (. builder stepAdjustments data))
    (when-let [data (lookup-entry config id :target-tracking-configuration)]
      (. builder targetTrackingConfiguration data))
    (.build builder)))


(defn cfn-scaling-policy-step-adjustment-property-builder
  "The cfn-scaling-policy-step-adjustment-property-builder function buildes out new instances of 
CfnScalingPolicy$StepAdjustmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricIntervalLowerBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:metric-interval-lower-bound` |
| `metricIntervalUpperBound` | java.lang.Number | [[cdk.support/lookup-entry]] | `:metric-interval-upper-bound` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$StepAdjustmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-interval-lower-bound)]
      (. builder metricIntervalLowerBound data))
    (when-let [data (lookup-entry config id :metric-interval-upper-bound)]
      (. builder metricIntervalUpperBound data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (.build builder)))


(defn cfn-scaling-policy-target-tracking-configuration-property-builder
  "The cfn-scaling-policy-target-tracking-configuration-property-builder function buildes out new instances of 
CfnScalingPolicy$TargetTrackingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customizedMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-metric-specification` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `predefinedMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predefined-metric-specification` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnScalingPolicy$TargetTrackingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customized-metric-specification)]
      (. builder customizedMetricSpecification data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :predefined-metric-specification)]
      (. builder predefinedMetricSpecification data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn cfn-scheduled-action-builder
  "The cfn-scheduled-action-builder function buildes out new instances of 
CfnScheduledAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `recurrence` | java.lang.String | [[cdk.support/lookup-entry]] | `:recurrence` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnScheduledAction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :recurrence)]
      (. builder recurrence data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-scheduled-action-props-builder
  "The cfn-scheduled-action-props-builder function buildes out new instances of 
CfnScheduledActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `recurrence` | java.lang.String | [[cdk.support/lookup-entry]] | `:recurrence` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnScheduledActionProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :recurrence)]
      (. builder recurrence data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-warm-pool-builder
  "The cfn-warm-pool-builder function buildes out new instances of 
CfnWarmPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `instanceReusePolicy` | software.amazon.awscdk.services.autoscaling.CfnWarmPool$InstanceReusePolicyProperty | [[cdk.support/lookup-entry]] | `:instance-reuse-policy` |
| `maxGroupPreparedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-group-prepared-capacity` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `poolState` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-state` |"
  [stack id config]
  (let [builder (CfnWarmPool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :instance-reuse-policy)]
      (. builder instanceReusePolicy data))
    (when-let [data (lookup-entry config id :max-group-prepared-capacity)]
      (. builder maxGroupPreparedCapacity data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :pool-state)]
      (. builder poolState data))
    (.build builder)))


(defn cfn-warm-pool-instance-reuse-policy-property-builder
  "The cfn-warm-pool-instance-reuse-policy-property-builder function buildes out new instances of 
CfnWarmPool$InstanceReusePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reuseOnScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reuse-on-scale-in` |"
  [stack id config]
  (let [builder (CfnWarmPool$InstanceReusePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :reuse-on-scale-in)]
      (. builder reuseOnScaleIn data))
    (.build builder)))


(defn cfn-warm-pool-props-builder
  "The cfn-warm-pool-props-builder function buildes out new instances of 
CfnWarmPoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `instanceReusePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-reuse-policy` |
| `maxGroupPreparedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-group-prepared-capacity` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `poolState` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-state` |"
  [stack id config]
  (let [builder (CfnWarmPoolProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :instance-reuse-policy)]
      (. builder instanceReusePolicy data))
    (when-let [data (lookup-entry config id :max-group-prepared-capacity)]
      (. builder maxGroupPreparedCapacity data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :pool-state)]
      (. builder poolState data))
    (.build builder)))


(defn common-auto-scaling-group-props-builder
  "The common-auto-scaling-group-props-builder function buildes out new instances of 
CommonAutoScalingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `capacityRebalance` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `defaultInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-instance-warmup` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `groupMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:group-metrics` |
| `healthCheck` | software.amazon.awscdk.services.autoscaling.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `ignoreUnmodifiedSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-size-properties` |
| `instanceMonitoring` | software.amazon.awscdk.services.autoscaling.Monitoring | [[cdk.api.services.autoscaling/monitoring]] | `:instance-monitoring` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxInstanceLifetime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `newInstancesProtectedFromScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notifications` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications` |
| `signals` | software.amazon.awscdk.services.autoscaling.Signals | [[cdk.support/lookup-entry]] | `:signals` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `terminationPolicyCustomLambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:termination-policy-custom-lambda-function-arn` |
| `updatePolicy` | software.amazon.awscdk.services.autoscaling.UpdatePolicy | [[cdk.support/lookup-entry]] | `:update-policy` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (CommonAutoScalingGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :default-instance-warmup)]
      (. builder defaultInstanceWarmup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :group-metrics)]
      (. builder groupMetrics data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :ignore-unmodified-size-properties)]
      (. builder ignoreUnmodifiedSizeProperties data))
    (when-let [data (monitoring config id :instance-monitoring)]
      (. builder instanceMonitoring data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-instance-lifetime)]
      (. builder maxInstanceLifetime data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :new-instances-protected-from-scale-in)]
      (. builder newInstancesProtectedFromScaleIn data))
    (when-let [data (lookup-entry config id :notifications)]
      (. builder notifications data))
    (when-let [data (lookup-entry config id :signals)]
      (. builder signals data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :termination-policy-custom-lambda-function-arn)]
      (. builder terminationPolicyCustomLambdaFunctionArn data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn cpu-utilization-scaling-props-builder
  "The cpu-utilization-scaling-props-builder function buildes out new instances of 
CpuUtilizationScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |"
  [stack id config]
  (let [builder (CpuUtilizationScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :target-utilization-percent)]
      (. builder targetUtilizationPercent data))
    (.build builder)))


(defn cron-options-builder
  "The cron-options-builder function buildes out new instances of 
CronOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `hour` | java.lang.String | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.String | [[cdk.support/lookup-entry]] | `:minute` |
| `month` | java.lang.String | [[cdk.support/lookup-entry]] | `:month` |
| `weekDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:week-day` |"
  [stack id config]
  (let [builder (CronOptions$Builder.)]
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
    (.build builder)))


(defn ebs-device-options-base-builder
  "The ebs-device-options-base-builder function buildes out new instances of 
EbsDeviceOptionsBase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType | [[cdk.api.services.autoscaling/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceOptionsBase$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ebs-device-options-builder
  "The ebs-device-options-builder function buildes out new instances of 
EbsDeviceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType | [[cdk.api.services.autoscaling/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceOptions$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ebs-device-props-builder
  "The ebs-device-props-builder function buildes out new instances of 
EbsDeviceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType | [[cdk.api.services.autoscaling/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ebs-device-snapshot-options-builder
  "The ebs-device-snapshot-options-builder function buildes out new instances of 
EbsDeviceSnapshotOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType | [[cdk.api.services.autoscaling/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceSnapshotOptions$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ec2-health-check-options-builder
  "The ec2-health-check-options-builder function buildes out new instances of 
Ec2HealthCheckOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grace` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:grace` |"
  [stack id config]
  (let [builder (Ec2HealthCheckOptions$Builder.)]
    (when-let [data (lookup-entry config id :grace)]
      (. builder grace data))
    (.build builder)))


(defn elb-health-check-options-builder
  "The elb-health-check-options-builder function buildes out new instances of 
ElbHealthCheckOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grace` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:grace` |"
  [stack id config]
  (let [builder (ElbHealthCheckOptions$Builder.)]
    (when-let [data (lookup-entry config id :grace)]
      (. builder grace data))
    (.build builder)))


(defn instances-distribution-builder
  "The instances-distribution-builder function buildes out new instances of 
InstancesDistribution$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandAllocationStrategy` | software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy | [[cdk.api.services.autoscaling/on-demand-allocation-strategy]] | `:on-demand-allocation-strategy` |
| `onDemandBaseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-base-capacity` |
| `onDemandPercentageAboveBaseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-percentage-above-base-capacity` |
| `spotAllocationStrategy` | software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy | [[cdk.api.services.autoscaling/spot-allocation-strategy]] | `:spot-allocation-strategy` |
| `spotInstancePools` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-instance-pools` |
| `spotMaxPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-max-price` |"
  [stack id config]
  (let [builder (InstancesDistribution$Builder.)]
    (when-let [data (on-demand-allocation-strategy config id :on-demand-allocation-strategy)]
      (. builder onDemandAllocationStrategy data))
    (when-let [data (lookup-entry config id :on-demand-base-capacity)]
      (. builder onDemandBaseCapacity data))
    (when-let [data (lookup-entry config id :on-demand-percentage-above-base-capacity)]
      (. builder onDemandPercentageAboveBaseCapacity data))
    (when-let [data (spot-allocation-strategy config id :spot-allocation-strategy)]
      (. builder spotAllocationStrategy data))
    (when-let [data (lookup-entry config id :spot-instance-pools)]
      (. builder spotInstancePools data))
    (when-let [data (lookup-entry config id :spot-max-price)]
      (. builder spotMaxPrice data))
    (.build builder)))


(defn launch-template-overrides-builder
  "The launch-template-overrides-builder function buildes out new instances of 
LaunchTemplateOverrides$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceRequirements` | software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup$InstanceRequirementsProperty | [[cdk.support/lookup-entry]] | `:instance-requirements` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (LaunchTemplateOverrides$Builder.)]
    (when-let [data (lookup-entry config id :instance-requirements)]
      (. builder instanceRequirements data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn lifecycle-hook-builder
  "The lifecycle-hook-builder function buildes out new instances of 
LifecycleHook$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `defaultResult` | software.amazon.awscdk.services.autoscaling.DefaultResult | [[cdk.api.services.autoscaling/default-result]] | `:default-result` |
| `heartbeatTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `lifecycleHookName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-hook-name` |
| `lifecycleTransition` | software.amazon.awscdk.services.autoscaling.LifecycleTransition | [[cdk.api.services.autoscaling/lifecycle-transition]] | `:lifecycle-transition` |
| `notificationMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-metadata` |
| `notificationTarget` | software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget | [[cdk.support/lookup-entry]] | `:notification-target` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LifecycleHook$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (default-result config id :default-result)]
      (. builder defaultResult data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :lifecycle-hook-name)]
      (. builder lifecycleHookName data))
    (when-let [data (lifecycle-transition config id :lifecycle-transition)]
      (. builder lifecycleTransition data))
    (when-let [data (lookup-entry config id :notification-metadata)]
      (. builder notificationMetadata data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn lifecycle-hook-props-builder
  "The lifecycle-hook-props-builder function buildes out new instances of 
LifecycleHookProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `defaultResult` | software.amazon.awscdk.services.autoscaling.DefaultResult | [[cdk.api.services.autoscaling/default-result]] | `:default-result` |
| `heartbeatTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `lifecycleHookName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-hook-name` |
| `lifecycleTransition` | software.amazon.awscdk.services.autoscaling.LifecycleTransition | [[cdk.api.services.autoscaling/lifecycle-transition]] | `:lifecycle-transition` |
| `notificationMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-metadata` |
| `notificationTarget` | software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget | [[cdk.support/lookup-entry]] | `:notification-target` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LifecycleHookProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (default-result config id :default-result)]
      (. builder defaultResult data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :lifecycle-hook-name)]
      (. builder lifecycleHookName data))
    (when-let [data (lifecycle-transition config id :lifecycle-transition)]
      (. builder lifecycleTransition data))
    (when-let [data (lookup-entry config id :notification-metadata)]
      (. builder notificationMetadata data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn lifecycle-hook-target-config-builder
  "The lifecycle-hook-target-config-builder function buildes out new instances of 
LifecycleHookTargetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:created-role` |
| `notificationTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target-arn` |"
  [stack id config]
  (let [builder (LifecycleHookTargetConfig$Builder.)]
    (when-let [data (lookup-entry config id :created-role)]
      (. builder createdRole data))
    (when-let [data (lookup-entry config id :notification-target-arn)]
      (. builder notificationTargetArn data))
    (.build builder)))


(defn metric-target-tracking-props-builder
  "The metric-target-tracking-props-builder function buildes out new instances of 
MetricTargetTrackingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (MetricTargetTrackingProps$Builder.)]
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn mixed-instances-policy-builder
  "The mixed-instances-policy-builder function buildes out new instances of 
MixedInstancesPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instancesDistribution` | software.amazon.awscdk.services.autoscaling.InstancesDistribution | [[cdk.support/lookup-entry]] | `:instances-distribution` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `launchTemplateOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:launch-template-overrides` |"
  [stack id config]
  (let [builder (MixedInstancesPolicy$Builder.)]
    (when-let [data (lookup-entry config id :instances-distribution)]
      (. builder instancesDistribution data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :launch-template-overrides)]
      (. builder launchTemplateOverrides data))
    (.build builder)))


(defn network-utilization-scaling-props-builder
  "The network-utilization-scaling-props-builder function buildes out new instances of 
NetworkUtilizationScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `targetBytesPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-bytes-per-second` |"
  [stack id config]
  (let [builder (NetworkUtilizationScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :target-bytes-per-second)]
      (. builder targetBytesPerSecond data))
    (.build builder)))


(defn notification-configuration-builder
  "The notification-configuration-builder function buildes out new instances of 
NotificationConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scalingEvents` | software.amazon.awscdk.services.autoscaling.ScalingEvents | [[cdk.support/lookup-entry]] | `:scaling-events` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (NotificationConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :scaling-events)]
      (. builder scalingEvents data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn render-signals-options-builder
  "The render-signals-options-builder function buildes out new instances of 
RenderSignalsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (RenderSignalsOptions$Builder.)]
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn request-count-scaling-props-builder
  "The request-count-scaling-props-builder function buildes out new instances of 
RequestCountScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `targetRequestsPerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-requests-per-minute` |"
  [stack id config]
  (let [builder (RequestCountScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :target-requests-per-minute)]
      (. builder targetRequestsPerMinute data))
    (.build builder)))


(defn rolling-update-options-builder
  "The rolling-update-options-builder function buildes out new instances of 
RollingUpdateOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `minInstancesInService` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-instances-in-service` |
| `minSuccessPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-success-percentage` |
| `pauseTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:pause-time` |
| `suspendProcesses` | java.util.List | [[cdk.support/lookup-entry]] | `:suspend-processes` |
| `waitOnResourceSignals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait-on-resource-signals` |"
  [stack id config]
  (let [builder (RollingUpdateOptions$Builder.)]
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :min-instances-in-service)]
      (. builder minInstancesInService data))
    (when-let [data (lookup-entry config id :min-success-percentage)]
      (. builder minSuccessPercentage data))
    (when-let [data (lookup-entry config id :pause-time)]
      (. builder pauseTime data))
    (when-let [data (lookup-entry config id :suspend-processes)]
      (. builder suspendProcesses data))
    (when-let [data (lookup-entry config id :wait-on-resource-signals)]
      (. builder waitOnResourceSignals data))
    (.build builder)))


(defn scaling-interval-builder
  "The scaling-interval-builder function buildes out new instances of 
ScalingInterval$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `change` | java.lang.Number | [[cdk.support/lookup-entry]] | `:change` |
| `lower` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lower` |
| `upper` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upper` |"
  [stack id config]
  (let [builder (ScalingInterval$Builder.)]
    (when-let [data (lookup-entry config id :change)]
      (. builder change data))
    (when-let [data (lookup-entry config id :lower)]
      (. builder lower data))
    (when-let [data (lookup-entry config id :upper)]
      (. builder upper data))
    (.build builder)))


(defn scheduled-action-builder
  "The scheduled-action-builder function buildes out new instances of 
ScheduledAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `endTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:end-time` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `schedule` | software.amazon.awscdk.services.autoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `startTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (ScheduledAction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
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
    (.build builder)))


(defn scheduled-action-props-builder
  "The scheduled-action-props-builder function buildes out new instances of 
ScheduledActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `endTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:end-time` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `schedule` | software.amazon.awscdk.services.autoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `startTime` | java.time.Instant | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (ScheduledActionProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
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
    (.build builder)))


(defn signals-options-builder
  "The signals-options-builder function buildes out new instances of 
SignalsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minSuccessPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-success-percentage` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SignalsOptions$Builder.)]
    (when-let [data (lookup-entry config id :min-success-percentage)]
      (. builder minSuccessPercentage data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn step-scaling-action-builder
  "The step-scaling-action-builder function buildes out new instances of 
StepScalingAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.autoscaling.AdjustmentType | [[cdk.api.services.autoscaling/adjustment-type]] | `:adjustment-type` |
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `metricAggregationType` | software.amazon.awscdk.services.autoscaling.MetricAggregationType | [[cdk.api.services.autoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |"
  [stack id config]
  (let [builder (StepScalingAction$Builder/create stack id)]
    (when-let [data (adjustment-type config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
      (. builder metricAggregationType data))
    (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
      (. builder minAdjustmentMagnitude data))
    (.build builder)))


(defn step-scaling-action-props-builder
  "The step-scaling-action-props-builder function buildes out new instances of 
StepScalingActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.autoscaling.AdjustmentType | [[cdk.api.services.autoscaling/adjustment-type]] | `:adjustment-type` |
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `metricAggregationType` | software.amazon.awscdk.services.autoscaling.MetricAggregationType | [[cdk.api.services.autoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |"
  [stack id config]
  (let [builder (StepScalingActionProps$Builder.)]
    (when-let [data (adjustment-type config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (metric-aggregation-type config id :metric-aggregation-type)]
      (. builder metricAggregationType data))
    (when-let [data (lookup-entry config id :min-adjustment-magnitude)]
      (. builder minAdjustmentMagnitude data))
    (.build builder)))


(defn step-scaling-policy-builder
  "The step-scaling-policy-builder function buildes out new instances of 
StepScalingPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.autoscaling.AdjustmentType | [[cdk.api.services.autoscaling/adjustment-type]] | `:adjustment-type` |
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `metricAggregationType` | software.amazon.awscdk.services.autoscaling.MetricAggregationType | [[cdk.api.services.autoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |"
  [stack id config]
  (let [builder (StepScalingPolicy$Builder/create stack id)]
    (when-let [data (adjustment-type config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
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
    (.build builder)))


(defn step-scaling-policy-props-builder
  "The step-scaling-policy-props-builder function buildes out new instances of 
StepScalingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.autoscaling.AdjustmentType | [[cdk.api.services.autoscaling/adjustment-type]] | `:adjustment-type` |
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `metricAggregationType` | software.amazon.awscdk.services.autoscaling.MetricAggregationType | [[cdk.api.services.autoscaling/metric-aggregation-type]] | `:metric-aggregation-type` |
| `minAdjustmentMagnitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-adjustment-magnitude` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |"
  [stack id config]
  (let [builder (StepScalingPolicyProps$Builder.)]
    (when-let [data (adjustment-type config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
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
    (.build builder)))


(defn target-tracking-scaling-policy-builder
  "The target-tracking-scaling-policy-builder function buildes out new instances of 
TargetTrackingScalingPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `customMetric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:custom-metric` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `predefinedMetric` | software.amazon.awscdk.services.autoscaling.PredefinedMetric | [[cdk.api.services.autoscaling/predefined-metric]] | `:predefined-metric` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (TargetTrackingScalingPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :custom-metric)]
      (. builder customMetric data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (predefined-metric config id :predefined-metric)]
      (. builder predefinedMetric data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn target-tracking-scaling-policy-props-builder
  "The target-tracking-scaling-policy-props-builder function buildes out new instances of 
TargetTrackingScalingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `customMetric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:custom-metric` |
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `predefinedMetric` | software.amazon.awscdk.services.autoscaling.PredefinedMetric | [[cdk.api.services.autoscaling/predefined-metric]] | `:predefined-metric` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (TargetTrackingScalingPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :custom-metric)]
      (. builder customMetric data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (predefined-metric config id :predefined-metric)]
      (. builder predefinedMetric data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn warm-pool-builder
  "The warm-pool-builder function buildes out new instances of 
WarmPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `maxGroupPreparedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-group-prepared-capacity` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `poolState` | software.amazon.awscdk.services.autoscaling.PoolState | [[cdk.api.services.autoscaling/pool-state]] | `:pool-state` |
| `reuseOnScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-on-scale-in` |"
  [stack id config]
  (let [builder (WarmPool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :max-group-prepared-capacity)]
      (. builder maxGroupPreparedCapacity data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (pool-state config id :pool-state)]
      (. builder poolState data))
    (when-let [data (lookup-entry config id :reuse-on-scale-in)]
      (. builder reuseOnScaleIn data))
    (.build builder)))


(defn warm-pool-options-builder
  "The warm-pool-options-builder function buildes out new instances of 
WarmPoolOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxGroupPreparedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-group-prepared-capacity` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `poolState` | software.amazon.awscdk.services.autoscaling.PoolState | [[cdk.api.services.autoscaling/pool-state]] | `:pool-state` |
| `reuseOnScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-on-scale-in` |"
  [stack id config]
  (let [builder (WarmPoolOptions$Builder.)]
    (when-let [data (lookup-entry config id :max-group-prepared-capacity)]
      (. builder maxGroupPreparedCapacity data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (pool-state config id :pool-state)]
      (. builder poolState data))
    (when-let [data (lookup-entry config id :reuse-on-scale-in)]
      (. builder reuseOnScaleIn data))
    (.build builder)))


(defn warm-pool-props-builder
  "The warm-pool-props-builder function buildes out new instances of 
WarmPoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `maxGroupPreparedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-group-prepared-capacity` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `poolState` | software.amazon.awscdk.services.autoscaling.PoolState | [[cdk.api.services.autoscaling/pool-state]] | `:pool-state` |
| `reuseOnScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reuse-on-scale-in` |"
  [stack id config]
  (let [builder (WarmPoolProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :max-group-prepared-capacity)]
      (. builder maxGroupPreparedCapacity data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (pool-state config id :pool-state)]
      (. builder poolState data))
    (when-let [data (lookup-entry config id :reuse-on-scale-in)]
      (. builder reuseOnScaleIn data))
    (.build builder)))