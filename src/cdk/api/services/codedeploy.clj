(ns cdk.api.services.codedeploy
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codedeploy package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codedeploy AutoRollbackConfig$Builder
                                                       BaseDeploymentConfigOptions$Builder
                                                       BaseDeploymentConfigProps$Builder
                                                       BaseTrafficShiftingConfigProps$Builder
                                                       CanaryTrafficRoutingConfig$Builder
                                                       CfnApplication$Builder
                                                       CfnApplicationProps$Builder
                                                       CfnDeploymentConfig$Builder
                                                       CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder
                                                       CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder
                                                       CfnDeploymentConfig$TimeBasedCanaryProperty$Builder
                                                       CfnDeploymentConfig$TimeBasedLinearProperty$Builder
                                                       CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder
                                                       CfnDeploymentConfig$ZonalConfigProperty$Builder
                                                       CfnDeploymentConfigProps$Builder
                                                       CfnDeploymentGroup$AlarmConfigurationProperty$Builder
                                                       CfnDeploymentGroup$AlarmProperty$Builder
                                                       CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder
                                                       CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder
                                                       CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder
                                                       CfnDeploymentGroup$Builder
                                                       CfnDeploymentGroup$DeploymentProperty$Builder
                                                       CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder
                                                       CfnDeploymentGroup$DeploymentStyleProperty$Builder
                                                       CfnDeploymentGroup$EC2TagFilterProperty$Builder
                                                       CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder
                                                       CfnDeploymentGroup$EC2TagSetProperty$Builder
                                                       CfnDeploymentGroup$ECSServiceProperty$Builder
                                                       CfnDeploymentGroup$ELBInfoProperty$Builder
                                                       CfnDeploymentGroup$GitHubLocationProperty$Builder
                                                       CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder
                                                       CfnDeploymentGroup$LoadBalancerInfoProperty$Builder
                                                       CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder
                                                       CfnDeploymentGroup$OnPremisesTagSetProperty$Builder
                                                       CfnDeploymentGroup$RevisionLocationProperty$Builder
                                                       CfnDeploymentGroup$S3LocationProperty$Builder
                                                       CfnDeploymentGroup$TagFilterProperty$Builder
                                                       CfnDeploymentGroup$TargetGroupInfoProperty$Builder
                                                       CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder
                                                       CfnDeploymentGroup$TrafficRouteProperty$Builder
                                                       CfnDeploymentGroup$TriggerConfigProperty$Builder
                                                       CfnDeploymentGroupProps$Builder
                                                       ComputePlatform
                                                       EcsApplication$Builder
                                                       EcsApplicationProps$Builder
                                                       EcsBlueGreenDeploymentConfig$Builder
                                                       EcsDeploymentConfig$Builder
                                                       EcsDeploymentConfigProps$Builder
                                                       EcsDeploymentGroup$Builder
                                                       EcsDeploymentGroupAttributes$Builder
                                                       EcsDeploymentGroupProps$Builder
                                                       LambdaApplication$Builder
                                                       LambdaApplicationProps$Builder
                                                       LambdaDeploymentConfig$Builder
                                                       LambdaDeploymentConfigImportProps$Builder
                                                       LambdaDeploymentConfigProps$Builder
                                                       LambdaDeploymentGroup$Builder
                                                       LambdaDeploymentGroupAttributes$Builder
                                                       LambdaDeploymentGroupProps$Builder
                                                       LinearTrafficRoutingConfig$Builder
                                                       LoadBalancerGeneration
                                                       ServerApplication$Builder
                                                       ServerApplicationProps$Builder
                                                       ServerDeploymentConfig$Builder
                                                       ServerDeploymentConfigProps$Builder
                                                       ServerDeploymentGroup$Builder
                                                       ServerDeploymentGroupAttributes$Builder
                                                       ServerDeploymentGroupProps$Builder
                                                       TimeBasedCanaryTrafficRouting$Builder
                                                       TimeBasedCanaryTrafficRoutingProps$Builder
                                                       TimeBasedLinearTrafficRouting$Builder
                                                       TimeBasedLinearTrafficRoutingProps$Builder
                                                       TrafficRoutingConfig$Builder]))


(defn compute-platform
  "The `compute-platform` function data interprets values in the provided config data into a 
`ComputePlatform` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ComputePlatform` - the value is returned.
* is `:lambda` - `ComputePlatform/LAMBDA` is returned
* is `:server` - `ComputePlatform/SERVER` is returned
* is `:ecs` - `ComputePlatform/ECS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ComputePlatform data) data
      (= :lambda data) ComputePlatform/LAMBDA
      (= :server data) ComputePlatform/SERVER
      (= :ecs data) ComputePlatform/ECS)))


(defn load-balancer-generation
  "The `load-balancer-generation` function data interprets values in the provided config data into a 
`LoadBalancerGeneration` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoadBalancerGeneration` - the value is returned.
* is `:second` - `LoadBalancerGeneration/SECOND` is returned
* is `:first` - `LoadBalancerGeneration/FIRST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoadBalancerGeneration data) data
      (= :second data) LoadBalancerGeneration/SECOND
      (= :first data) LoadBalancerGeneration/FIRST)))


(defn auto-rollback-config-builder
  "The auto-rollback-config-builder function buildes out new instances of 
AutoRollbackConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentInAlarm` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deployment-in-alarm` |
| `failedDeployment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:failed-deployment` |
| `stoppedDeployment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stopped-deployment` |"
  [stack id config]
  (let [builder (AutoRollbackConfig$Builder.)]
    (when-let [data (lookup-entry config id :deployment-in-alarm)]
      (. builder deploymentInAlarm data))
    (when-let [data (lookup-entry config id :failed-deployment)]
      (. builder failedDeployment data))
    (when-let [data (lookup-entry config id :stopped-deployment)]
      (. builder stoppedDeployment data))
    (.build builder)))


(defn base-deployment-config-options-builder
  "The base-deployment-config-options-builder function buildes out new instances of 
BaseDeploymentConfigOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |"
  [stack id config]
  (let [builder (BaseDeploymentConfigOptions$Builder.)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (.build builder)))


(defn base-deployment-config-props-builder
  "The base-deployment-config-props-builder function buildes out new instances of 
BaseDeploymentConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codedeploy.ComputePlatform | [[cdk.api.services.codedeploy/compute-platform]] | `:compute-platform` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |"
  [stack id config]
  (let [builder (BaseDeploymentConfigProps$Builder.)]
    (when-let [data (compute-platform config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :minimum-healthy-hosts)]
      (. builder minimumHealthyHosts data))
    (when-let [data (lookup-entry config id :traffic-routing)]
      (. builder trafficRouting data))
    (.build builder)))


(defn base-traffic-shifting-config-props-builder
  "The base-traffic-shifting-config-props-builder function buildes out new instances of 
BaseTrafficShiftingConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |"
  [stack id config]
  (let [builder (BaseTrafficShiftingConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (.build builder)))


(defn canary-traffic-routing-config-builder
  "The canary-traffic-routing-config-builder function buildes out new instances of 
CanaryTrafficRoutingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canaryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-interval` |
| `canaryPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-percentage` |"
  [stack id config]
  (let [builder (CanaryTrafficRoutingConfig$Builder.)]
    (when-let [data (lookup-entry config id :canary-interval)]
      (. builder canaryInterval data))
    (when-let [data (lookup-entry config id :canary-percentage)]
      (. builder canaryPercentage data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-deployment-config-builder
  "The cfn-deployment-config-builder function buildes out new instances of 
CfnDeploymentConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
| `trafficRoutingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |
| `zonalConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zonal-config` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :minimum-healthy-hosts)]
      (. builder minimumHealthyHosts data))
    (when-let [data (lookup-entry config id :traffic-routing-config)]
      (. builder trafficRoutingConfig data))
    (when-let [data (lookup-entry config id :zonal-config)]
      (. builder zonalConfig data))
    (.build builder)))


(defn cfn-deployment-config-minimum-healthy-hosts-per-zone-property-builder
  "The cfn-deployment-config-minimum-healthy-hosts-per-zone-property-builder function buildes out new instances of 
CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-deployment-config-minimum-healthy-hosts-property-builder
  "The cfn-deployment-config-minimum-healthy-hosts-property-builder function buildes out new instances of 
CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-deployment-config-props-builder
  "The cfn-deployment-config-props-builder function buildes out new instances of 
CfnDeploymentConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
| `trafficRoutingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |
| `zonalConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zonal-config` |"
  [stack id config]
  (let [builder (CfnDeploymentConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :minimum-healthy-hosts)]
      (. builder minimumHealthyHosts data))
    (when-let [data (lookup-entry config id :traffic-routing-config)]
      (. builder trafficRoutingConfig data))
    (when-let [data (lookup-entry config id :zonal-config)]
      (. builder zonalConfig data))
    (.build builder)))


(defn cfn-deployment-config-time-based-canary-property-builder
  "The cfn-deployment-config-time-based-canary-property-builder function buildes out new instances of 
CfnDeploymentConfig$TimeBasedCanaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canaryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-interval` |
| `canaryPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-percentage` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$TimeBasedCanaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :canary-interval)]
      (. builder canaryInterval data))
    (when-let [data (lookup-entry config id :canary-percentage)]
      (. builder canaryPercentage data))
    (.build builder)))


(defn cfn-deployment-config-time-based-linear-property-builder
  "The cfn-deployment-config-time-based-linear-property-builder function buildes out new instances of 
CfnDeploymentConfig$TimeBasedLinearProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `linearInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-interval` |
| `linearPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-percentage` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$TimeBasedLinearProperty$Builder.)]
    (when-let [data (lookup-entry config id :linear-interval)]
      (. builder linearInterval data))
    (when-let [data (lookup-entry config id :linear-percentage)]
      (. builder linearPercentage data))
    (.build builder)))


(defn cfn-deployment-config-traffic-routing-config-property-builder
  "The cfn-deployment-config-traffic-routing-config-property-builder function buildes out new instances of 
CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeBasedCanary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-based-canary` |
| `timeBasedLinear` | software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig$TimeBasedLinearProperty | [[cdk.support/lookup-entry]] | `:time-based-linear` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :time-based-canary)]
      (. builder timeBasedCanary data))
    (when-let [data (lookup-entry config id :time-based-linear)]
      (. builder timeBasedLinear data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-deployment-config-zonal-config-property-builder
  "The cfn-deployment-config-zonal-config-property-builder function buildes out new instances of 
CfnDeploymentConfig$ZonalConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firstZoneMonitorDurationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:first-zone-monitor-duration-in-seconds` |
| `minimumHealthyHostsPerZone` | software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts-per-zone` |
| `monitorDurationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:monitor-duration-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeploymentConfig$ZonalConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :first-zone-monitor-duration-in-seconds)]
      (. builder firstZoneMonitorDurationInSeconds data))
    (when-let [data (lookup-entry config id :minimum-healthy-hosts-per-zone)]
      (. builder minimumHealthyHostsPerZone data))
    (when-let [data (lookup-entry config id :monitor-duration-in-seconds)]
      (. builder monitorDurationInSeconds data))
    (.build builder)))


(defn cfn-deployment-group-alarm-configuration-property-builder
  "The cfn-deployment-group-alarm-configuration-property-builder function buildes out new instances of 
CfnDeploymentGroup$AlarmConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `ignorePollAlarmFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarm-failure` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$AlarmConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :ignore-poll-alarm-failure)]
      (. builder ignorePollAlarmFailure data))
    (.build builder)))


(defn cfn-deployment-group-alarm-property-builder
  "The cfn-deployment-group-alarm-property-builder function buildes out new instances of 
CfnDeploymentGroup$AlarmProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$AlarmProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-deployment-group-auto-rollback-configuration-property-builder
  "The cfn-deployment-group-auto-rollback-configuration-property-builder function buildes out new instances of 
CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn cfn-deployment-group-blue-green-deployment-configuration-property-builder
  "The cfn-deployment-group-blue-green-deployment-configuration-property-builder function buildes out new instances of 
CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentReadyOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-ready-option` |
| `greenFleetProvisioningOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:green-fleet-provisioning-option` |
| `terminateBlueInstancesOnDeploymentSuccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:terminate-blue-instances-on-deployment-success` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :deployment-ready-option)]
      (. builder deploymentReadyOption data))
    (when-let [data (lookup-entry config id :green-fleet-provisioning-option)]
      (. builder greenFleetProvisioningOption data))
    (when-let [data (lookup-entry config id :terminate-blue-instances-on-deployment-success)]
      (. builder terminateBlueInstancesOnDeploymentSuccess data))
    (.build builder)))


(defn cfn-deployment-group-blue-instance-termination-option-property-builder
  "The cfn-deployment-group-blue-instance-termination-option-property-builder function buildes out new instances of 
CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `terminationWaitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-time-in-minutes` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :termination-wait-time-in-minutes)]
      (. builder terminationWaitTimeInMinutes data))
    (.build builder)))


(defn cfn-deployment-group-builder
  "The cfn-deployment-group-builder function buildes out new instances of 
CfnDeploymentGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-configuration` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `autoRollbackConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-rollback-configuration` |
| `autoScalingGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-scaling-groups` |
| `blueGreenDeploymentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blue-green-deployment-configuration` |
| `deployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `deploymentStyle` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$DeploymentStyleProperty | [[cdk.support/lookup-entry]] | `:deployment-style` |
| `ec2TagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-tag-filters` |
| `ec2TagSet` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$EC2TagSetProperty | [[cdk.support/lookup-entry]] | `:ec2-tag-set` |
| `ecsServices` | java.util.List | [[cdk.support/lookup-entry]] | `:ecs-services` |
| `loadBalancerInfo` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$LoadBalancerInfoProperty | [[cdk.support/lookup-entry]] | `:load-balancer-info` |
| `onPremisesInstanceTagFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-premises-instance-tag-filters` |
| `onPremisesTagSet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-premises-tag-set` |
| `outdatedInstancesStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdated-instances-strategy` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `terminationHookEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:termination-hook-enabled` |
| `triggerConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:trigger-configurations` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alarm-configuration)]
      (. builder alarmConfiguration data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :auto-rollback-configuration)]
      (. builder autoRollbackConfiguration data))
    (when-let [data (lookup-entry config id :auto-scaling-groups)]
      (. builder autoScalingGroups data))
    (when-let [data (lookup-entry config id :blue-green-deployment-configuration)]
      (. builder blueGreenDeploymentConfiguration data))
    (when-let [data (lookup-entry config id :deployment)]
      (. builder deployment data))
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :deployment-style)]
      (. builder deploymentStyle data))
    (when-let [data (lookup-entry config id :ec2-tag-filters)]
      (. builder ec2TagFilters data))
    (when-let [data (lookup-entry config id :ec2-tag-set)]
      (. builder ec2TagSet data))
    (when-let [data (lookup-entry config id :ecs-services)]
      (. builder ecsServices data))
    (when-let [data (lookup-entry config id :load-balancer-info)]
      (. builder loadBalancerInfo data))
    (when-let [data (lookup-entry config id :on-premises-instance-tag-filters)]
      (. builder onPremisesInstanceTagFilters data))
    (when-let [data (lookup-entry config id :on-premises-tag-set)]
      (. builder onPremisesTagSet data))
    (when-let [data (lookup-entry config id :outdated-instances-strategy)]
      (. builder outdatedInstancesStrategy data))
    (when-let [data (lookup-entry config id :service-role-arn)]
      (. builder serviceRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :termination-hook-enabled)]
      (. builder terminationHookEnabled data))
    (when-let [data (lookup-entry config id :trigger-configurations)]
      (. builder triggerConfigurations data))
    (.build builder)))


(defn cfn-deployment-group-deployment-property-builder
  "The cfn-deployment-group-deployment-property-builder function buildes out new instances of 
CfnDeploymentGroup$DeploymentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ignoreApplicationStopFailures` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-application-stop-failures` |
| `revision` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$RevisionLocationProperty | [[cdk.support/lookup-entry]] | `:revision` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$DeploymentProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ignore-application-stop-failures)]
      (. builder ignoreApplicationStopFailures data))
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (.build builder)))


(defn cfn-deployment-group-deployment-ready-option-property-builder
  "The cfn-deployment-group-deployment-ready-option-property-builder function buildes out new instances of 
CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnTimeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-timeout` |
| `waitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-time-in-minutes` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-on-timeout)]
      (. builder actionOnTimeout data))
    (when-let [data (lookup-entry config id :wait-time-in-minutes)]
      (. builder waitTimeInMinutes data))
    (.build builder)))


(defn cfn-deployment-group-deployment-style-property-builder
  "The cfn-deployment-group-deployment-style-property-builder function buildes out new instances of 
CfnDeploymentGroup$DeploymentStyleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-option` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$DeploymentStyleProperty$Builder.)]
    (when-let [data (lookup-entry config id :deployment-option)]
      (. builder deploymentOption data))
    (when-let [data (lookup-entry config id :deployment-type)]
      (. builder deploymentType data))
    (.build builder)))


(defn cfn-deployment-group-ec2-tag-filter-property-builder
  "The cfn-deployment-group-ec2-tag-filter-property-builder function buildes out new instances of 
CfnDeploymentGroup$EC2TagFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$EC2TagFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-deployment-group-ec2-tag-set-list-object-property-builder
  "The cfn-deployment-group-ec2-tag-set-list-object-property-builder function buildes out new instances of 
CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2TagGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-tag-group` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :ec2-tag-group)]
      (. builder ec2TagGroup data))
    (.build builder)))


(defn cfn-deployment-group-ec2-tag-set-property-builder
  "The cfn-deployment-group-ec2-tag-set-property-builder function buildes out new instances of 
CfnDeploymentGroup$EC2TagSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2TagSetList` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-tag-set-list` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$EC2TagSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :ec2-tag-set-list)]
      (. builder ec2TagSetList data))
    (.build builder)))


(defn cfn-deployment-group-ecs-service-property-builder
  "The cfn-deployment-group-ecs-service-property-builder function buildes out new instances of 
CfnDeploymentGroup$ECSServiceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$ECSServiceProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn cfn-deployment-group-elb-info-property-builder
  "The cfn-deployment-group-elb-info-property-builder function buildes out new instances of 
CfnDeploymentGroup$ELBInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$ELBInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-deployment-group-git-hub-location-property-builder
  "The cfn-deployment-group-git-hub-location-property-builder function buildes out new instances of 
CfnDeploymentGroup$GitHubLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$GitHubLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :commit-id)]
      (. builder commitId data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (.build builder)))


(defn cfn-deployment-group-green-fleet-provisioning-option-property-builder
  "The cfn-deployment-group-green-fleet-provisioning-option-property-builder function buildes out new instances of 
CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (.build builder)))


(defn cfn-deployment-group-load-balancer-info-property-builder
  "The cfn-deployment-group-load-balancer-info-property-builder function buildes out new instances of 
CfnDeploymentGroup$LoadBalancerInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `elbInfoList` | java.util.List | [[cdk.support/lookup-entry]] | `:elb-info-list` |
| `targetGroupInfoList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-group-info-list` |
| `targetGroupPairInfoList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-group-pair-info-list` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$LoadBalancerInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :elb-info-list)]
      (. builder elbInfoList data))
    (when-let [data (lookup-entry config id :target-group-info-list)]
      (. builder targetGroupInfoList data))
    (when-let [data (lookup-entry config id :target-group-pair-info-list)]
      (. builder targetGroupPairInfoList data))
    (.build builder)))


(defn cfn-deployment-group-on-premises-tag-set-list-object-property-builder
  "The cfn-deployment-group-on-premises-tag-set-list-object-property-builder function buildes out new instances of 
CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onPremisesTagGroup` | java.util.List | [[cdk.support/lookup-entry]] | `:on-premises-tag-group` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-premises-tag-group)]
      (. builder onPremisesTagGroup data))
    (.build builder)))


(defn cfn-deployment-group-on-premises-tag-set-property-builder
  "The cfn-deployment-group-on-premises-tag-set-property-builder function buildes out new instances of 
CfnDeploymentGroup$OnPremisesTagSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onPremisesTagSetList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-premises-tag-set-list` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$OnPremisesTagSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-premises-tag-set-list)]
      (. builder onPremisesTagSetList data))
    (.build builder)))


(defn cfn-deployment-group-props-builder
  "The cfn-deployment-group-props-builder function buildes out new instances of 
CfnDeploymentGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-configuration` |
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `autoRollbackConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-rollback-configuration` |
| `autoScalingGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-scaling-groups` |
| `blueGreenDeploymentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blue-green-deployment-configuration` |
| `deployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `deploymentStyle` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$DeploymentStyleProperty | [[cdk.support/lookup-entry]] | `:deployment-style` |
| `ec2TagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-tag-filters` |
| `ec2TagSet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-tag-set` |
| `ecsServices` | java.util.List | [[cdk.support/lookup-entry]] | `:ecs-services` |
| `loadBalancerInfo` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$LoadBalancerInfoProperty | [[cdk.support/lookup-entry]] | `:load-balancer-info` |
| `onPremisesInstanceTagFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-premises-instance-tag-filters` |
| `onPremisesTagSet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-premises-tag-set` |
| `outdatedInstancesStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:outdated-instances-strategy` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `terminationHookEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-hook-enabled` |
| `triggerConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-configurations` |"
  [stack id config]
  (let [builder (CfnDeploymentGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :alarm-configuration)]
      (. builder alarmConfiguration data))
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :auto-rollback-configuration)]
      (. builder autoRollbackConfiguration data))
    (when-let [data (lookup-entry config id :auto-scaling-groups)]
      (. builder autoScalingGroups data))
    (when-let [data (lookup-entry config id :blue-green-deployment-configuration)]
      (. builder blueGreenDeploymentConfiguration data))
    (when-let [data (lookup-entry config id :deployment)]
      (. builder deployment data))
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :deployment-style)]
      (. builder deploymentStyle data))
    (when-let [data (lookup-entry config id :ec2-tag-filters)]
      (. builder ec2TagFilters data))
    (when-let [data (lookup-entry config id :ec2-tag-set)]
      (. builder ec2TagSet data))
    (when-let [data (lookup-entry config id :ecs-services)]
      (. builder ecsServices data))
    (when-let [data (lookup-entry config id :load-balancer-info)]
      (. builder loadBalancerInfo data))
    (when-let [data (lookup-entry config id :on-premises-instance-tag-filters)]
      (. builder onPremisesInstanceTagFilters data))
    (when-let [data (lookup-entry config id :on-premises-tag-set)]
      (. builder onPremisesTagSet data))
    (when-let [data (lookup-entry config id :outdated-instances-strategy)]
      (. builder outdatedInstancesStrategy data))
    (when-let [data (lookup-entry config id :service-role-arn)]
      (. builder serviceRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :termination-hook-enabled)]
      (. builder terminationHookEnabled data))
    (when-let [data (lookup-entry config id :trigger-configurations)]
      (. builder triggerConfigurations data))
    (.build builder)))


(defn cfn-deployment-group-revision-location-property-builder
  "The cfn-deployment-group-revision-location-property-builder function buildes out new instances of 
CfnDeploymentGroup$RevisionLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitHubLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:git-hub-location` |
| `revisionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-type` |
| `s3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$RevisionLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :git-hub-location)]
      (. builder gitHubLocation data))
    (when-let [data (lookup-entry config id :revision-type)]
      (. builder revisionType data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn cfn-deployment-group-s3-location-property-builder
  "The cfn-deployment-group-s3-location-property-builder function buildes out new instances of 
CfnDeploymentGroup$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bundleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-type` |
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bundle-type)]
      (. builder bundleType data))
    (when-let [data (lookup-entry config id :e-tag)]
      (. builder eTag data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-deployment-group-tag-filter-property-builder
  "The cfn-deployment-group-tag-filter-property-builder function buildes out new instances of 
CfnDeploymentGroup$TagFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$TagFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-deployment-group-target-group-info-property-builder
  "The cfn-deployment-group-target-group-info-property-builder function buildes out new instances of 
CfnDeploymentGroup$TargetGroupInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$TargetGroupInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-deployment-group-target-group-pair-info-property-builder
  "The cfn-deployment-group-target-group-pair-info-property-builder function buildes out new instances of 
CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prodTrafficRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prod-traffic-route` |
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |
| `testTrafficRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:test-traffic-route` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :prod-traffic-route)]
      (. builder prodTrafficRoute data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :test-traffic-route)]
      (. builder testTrafficRoute data))
    (.build builder)))


(defn cfn-deployment-group-traffic-route-property-builder
  "The cfn-deployment-group-traffic-route-property-builder function buildes out new instances of 
CfnDeploymentGroup$TrafficRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:listener-arns` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$TrafficRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :listener-arns)]
      (. builder listenerArns data))
    (.build builder)))


(defn cfn-deployment-group-trigger-config-property-builder
  "The cfn-deployment-group-trigger-config-property-builder function buildes out new instances of 
CfnDeploymentGroup$TriggerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `triggerEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:trigger-events` |
| `triggerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-name` |
| `triggerTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-target-arn` |"
  [stack id config]
  (let [builder (CfnDeploymentGroup$TriggerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :trigger-events)]
      (. builder triggerEvents data))
    (when-let [data (lookup-entry config id :trigger-name)]
      (. builder triggerName data))
    (when-let [data (lookup-entry config id :trigger-target-arn)]
      (. builder triggerTargetArn data))
    (.build builder)))


(defn ecs-application-builder
  "The ecs-application-builder function buildes out new instances of 
EcsApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |"
  [stack id config]
  (let [builder (EcsApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (.build builder)))


(defn ecs-application-props-builder
  "The ecs-application-props-builder function buildes out new instances of 
EcsApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |"
  [stack id config]
  (let [builder (EcsApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (.build builder)))


(defn ecs-blue-green-deployment-config-builder
  "The ecs-blue-green-deployment-config-builder function buildes out new instances of 
EcsBlueGreenDeploymentConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blueTargetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup | [[cdk.support/lookup-entry]] | `:blue-target-group` |
| `deploymentApprovalWaitTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-approval-wait-time` |
| `greenTargetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup | [[cdk.support/lookup-entry]] | `:green-target-group` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IListener | [[cdk.support/lookup-entry]] | `:listener` |
| `terminationWaitTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:termination-wait-time` |
| `testListener` | software.amazon.awscdk.services.elasticloadbalancingv2.IListener | [[cdk.support/lookup-entry]] | `:test-listener` |"
  [stack id config]
  (let [builder (EcsBlueGreenDeploymentConfig$Builder.)]
    (when-let [data (lookup-entry config id :blue-target-group)]
      (. builder blueTargetGroup data))
    (when-let [data (lookup-entry config id :deployment-approval-wait-time)]
      (. builder deploymentApprovalWaitTime data))
    (when-let [data (lookup-entry config id :green-target-group)]
      (. builder greenTargetGroup data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (when-let [data (lookup-entry config id :termination-wait-time)]
      (. builder terminationWaitTime data))
    (when-let [data (lookup-entry config id :test-listener)]
      (. builder testListener data))
    (.build builder)))


(defn ecs-deployment-config-builder
  "The ecs-deployment-config-builder function buildes out new instances of 
EcsDeploymentConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |"
  [stack id config]
  (let [builder (EcsDeploymentConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :traffic-routing)]
      (. builder trafficRouting data))
    (.build builder)))


(defn ecs-deployment-config-props-builder
  "The ecs-deployment-config-props-builder function buildes out new instances of 
EcsDeploymentConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |"
  [stack id config]
  (let [builder (EcsDeploymentConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :traffic-routing)]
      (. builder trafficRouting data))
    (.build builder)))


(defn ecs-deployment-group-attributes-builder
  "The ecs-deployment-group-attributes-builder function buildes out new instances of 
EcsDeploymentGroupAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.codedeploy.IEcsApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |"
  [stack id config]
  (let [builder (EcsDeploymentGroupAttributes$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (.build builder)))


(defn ecs-deployment-group-builder
  "The ecs-deployment-group-builder function buildes out new instances of 
EcsDeploymentGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `application` | software.amazon.awscdk.services.codedeploy.IEcsApplication | [[cdk.support/lookup-entry]] | `:application` |
| `autoRollback` | software.amazon.awscdk.services.codedeploy.AutoRollbackConfig | [[cdk.support/lookup-entry]] | `:auto-rollback` |
| `blueGreenDeploymentConfig` | software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig | [[cdk.support/lookup-entry]] | `:blue-green-deployment-config` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `ignoreAlarmConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-alarm-configuration` |
| `ignorePollAlarmsFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarms-failure` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (EcsDeploymentGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :auto-rollback)]
      (. builder autoRollback data))
    (when-let [data (lookup-entry config id :blue-green-deployment-config)]
      (. builder blueGreenDeploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :ignore-alarm-configuration)]
      (. builder ignoreAlarmConfiguration data))
    (when-let [data (lookup-entry config id :ignore-poll-alarms-failure)]
      (. builder ignorePollAlarmsFailure data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn ecs-deployment-group-props-builder
  "The ecs-deployment-group-props-builder function buildes out new instances of 
EcsDeploymentGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `application` | software.amazon.awscdk.services.codedeploy.IEcsApplication | [[cdk.support/lookup-entry]] | `:application` |
| `autoRollback` | software.amazon.awscdk.services.codedeploy.AutoRollbackConfig | [[cdk.support/lookup-entry]] | `:auto-rollback` |
| `blueGreenDeploymentConfig` | software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig | [[cdk.support/lookup-entry]] | `:blue-green-deployment-config` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `ignoreAlarmConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-alarm-configuration` |
| `ignorePollAlarmsFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarms-failure` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (EcsDeploymentGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :auto-rollback)]
      (. builder autoRollback data))
    (when-let [data (lookup-entry config id :blue-green-deployment-config)]
      (. builder blueGreenDeploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :ignore-alarm-configuration)]
      (. builder ignoreAlarmConfiguration data))
    (when-let [data (lookup-entry config id :ignore-poll-alarms-failure)]
      (. builder ignorePollAlarmsFailure data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn lambda-application-builder
  "The lambda-application-builder function buildes out new instances of 
LambdaApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |"
  [stack id config]
  (let [builder (LambdaApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (.build builder)))


(defn lambda-application-props-builder
  "The lambda-application-props-builder function buildes out new instances of 
LambdaApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |"
  [stack id config]
  (let [builder (LambdaApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (.build builder)))


(defn lambda-deployment-config-builder
  "The lambda-deployment-config-builder function buildes out new instances of 
LambdaDeploymentConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |"
  [stack id config]
  (let [builder (LambdaDeploymentConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :traffic-routing)]
      (. builder trafficRouting data))
    (.build builder)))


(defn lambda-deployment-config-import-props-builder
  "The lambda-deployment-config-import-props-builder function buildes out new instances of 
LambdaDeploymentConfigImportProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |"
  [stack id config]
  (let [builder (LambdaDeploymentConfigImportProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (.build builder)))


(defn lambda-deployment-config-props-builder
  "The lambda-deployment-config-props-builder function buildes out new instances of 
LambdaDeploymentConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |"
  [stack id config]
  (let [builder (LambdaDeploymentConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :traffic-routing)]
      (. builder trafficRouting data))
    (.build builder)))


(defn lambda-deployment-group-attributes-builder
  "The lambda-deployment-group-attributes-builder function buildes out new instances of 
LambdaDeploymentGroupAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.codedeploy.ILambdaApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |"
  [stack id config]
  (let [builder (LambdaDeploymentGroupAttributes$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (.build builder)))


(defn lambda-deployment-group-builder
  "The lambda-deployment-group-builder function buildes out new instances of 
LambdaDeploymentGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `alias` | software.amazon.awscdk.services.lambda.Alias | [[cdk.support/lookup-entry]] | `:alias` |
| `application` | software.amazon.awscdk.services.codedeploy.ILambdaApplication | [[cdk.support/lookup-entry]] | `:application` |
| `autoRollback` | software.amazon.awscdk.services.codedeploy.AutoRollbackConfig | [[cdk.support/lookup-entry]] | `:auto-rollback` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `ignoreAlarmConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-alarm-configuration` |
| `ignorePollAlarmsFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarms-failure` |
| `postHook` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:post-hook` |
| `preHook` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:pre-hook` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LambdaDeploymentGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :auto-rollback)]
      (. builder autoRollback data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :ignore-alarm-configuration)]
      (. builder ignoreAlarmConfiguration data))
    (when-let [data (lookup-entry config id :ignore-poll-alarms-failure)]
      (. builder ignorePollAlarmsFailure data))
    (when-let [data (lookup-entry config id :post-hook)]
      (. builder postHook data))
    (when-let [data (lookup-entry config id :pre-hook)]
      (. builder preHook data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn lambda-deployment-group-props-builder
  "The lambda-deployment-group-props-builder function buildes out new instances of 
LambdaDeploymentGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `alias` | software.amazon.awscdk.services.lambda.Alias | [[cdk.support/lookup-entry]] | `:alias` |
| `application` | software.amazon.awscdk.services.codedeploy.ILambdaApplication | [[cdk.support/lookup-entry]] | `:application` |
| `autoRollback` | software.amazon.awscdk.services.codedeploy.AutoRollbackConfig | [[cdk.support/lookup-entry]] | `:auto-rollback` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `ignoreAlarmConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-alarm-configuration` |
| `ignorePollAlarmsFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarms-failure` |
| `postHook` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:post-hook` |
| `preHook` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:pre-hook` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LambdaDeploymentGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :auto-rollback)]
      (. builder autoRollback data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :ignore-alarm-configuration)]
      (. builder ignoreAlarmConfiguration data))
    (when-let [data (lookup-entry config id :ignore-poll-alarms-failure)]
      (. builder ignorePollAlarmsFailure data))
    (when-let [data (lookup-entry config id :post-hook)]
      (. builder postHook data))
    (when-let [data (lookup-entry config id :pre-hook)]
      (. builder preHook data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn linear-traffic-routing-config-builder
  "The linear-traffic-routing-config-builder function buildes out new instances of 
LinearTrafficRoutingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `linearInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-interval` |
| `linearPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-percentage` |"
  [stack id config]
  (let [builder (LinearTrafficRoutingConfig$Builder.)]
    (when-let [data (lookup-entry config id :linear-interval)]
      (. builder linearInterval data))
    (when-let [data (lookup-entry config id :linear-percentage)]
      (. builder linearPercentage data))
    (.build builder)))


(defn server-application-builder
  "The server-application-builder function buildes out new instances of 
ServerApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |"
  [stack id config]
  (let [builder (ServerApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (.build builder)))


(defn server-application-props-builder
  "The server-application-props-builder function buildes out new instances of 
ServerApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |"
  [stack id config]
  (let [builder (ServerApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (.build builder)))


(defn server-deployment-config-builder
  "The server-deployment-config-builder function buildes out new instances of 
ServerDeploymentConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |"
  [stack id config]
  (let [builder (ServerDeploymentConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :minimum-healthy-hosts)]
      (. builder minimumHealthyHosts data))
    (.build builder)))


(defn server-deployment-config-props-builder
  "The server-deployment-config-props-builder function buildes out new instances of 
ServerDeploymentConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |"
  [stack id config]
  (let [builder (ServerDeploymentConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-config-name)]
      (. builder deploymentConfigName data))
    (when-let [data (lookup-entry config id :minimum-healthy-hosts)]
      (. builder minimumHealthyHosts data))
    (.build builder)))


(defn server-deployment-group-attributes-builder
  "The server-deployment-group-attributes-builder function buildes out new instances of 
ServerDeploymentGroupAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.codedeploy.IServerApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |"
  [stack id config]
  (let [builder (ServerDeploymentGroupAttributes$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (.build builder)))


(defn server-deployment-group-builder
  "The server-deployment-group-builder function buildes out new instances of 
ServerDeploymentGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `application` | software.amazon.awscdk.services.codedeploy.IServerApplication | [[cdk.support/lookup-entry]] | `:application` |
| `autoRollback` | software.amazon.awscdk.services.codedeploy.AutoRollbackConfig | [[cdk.support/lookup-entry]] | `:auto-rollback` |
| `autoScalingGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-scaling-groups` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `ec2InstanceTags` | software.amazon.awscdk.services.codedeploy.InstanceTagSet | [[cdk.support/lookup-entry]] | `:ec2-instance-tags` |
| `ignoreAlarmConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-alarm-configuration` |
| `ignorePollAlarmsFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarms-failure` |
| `installAgent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-agent` |
| `loadBalancer` | software.amazon.awscdk.services.codedeploy.LoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `onPremiseInstanceTags` | software.amazon.awscdk.services.codedeploy.InstanceTagSet | [[cdk.support/lookup-entry]] | `:on-premise-instance-tags` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (ServerDeploymentGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :auto-rollback)]
      (. builder autoRollback data))
    (when-let [data (lookup-entry config id :auto-scaling-groups)]
      (. builder autoScalingGroups data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :ec2-instance-tags)]
      (. builder ec2InstanceTags data))
    (when-let [data (lookup-entry config id :ignore-alarm-configuration)]
      (. builder ignoreAlarmConfiguration data))
    (when-let [data (lookup-entry config id :ignore-poll-alarms-failure)]
      (. builder ignorePollAlarmsFailure data))
    (when-let [data (lookup-entry config id :install-agent)]
      (. builder installAgent data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :on-premise-instance-tags)]
      (. builder onPremiseInstanceTags data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn server-deployment-group-props-builder
  "The server-deployment-group-props-builder function buildes out new instances of 
ServerDeploymentGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `application` | software.amazon.awscdk.services.codedeploy.IServerApplication | [[cdk.support/lookup-entry]] | `:application` |
| `autoRollback` | software.amazon.awscdk.services.codedeploy.AutoRollbackConfig | [[cdk.support/lookup-entry]] | `:auto-rollback` |
| `autoScalingGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-scaling-groups` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
| `ec2InstanceTags` | software.amazon.awscdk.services.codedeploy.InstanceTagSet | [[cdk.support/lookup-entry]] | `:ec2-instance-tags` |
| `ignoreAlarmConfiguration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-alarm-configuration` |
| `ignorePollAlarmsFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarms-failure` |
| `installAgent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-agent` |
| `loadBalancer` | software.amazon.awscdk.services.codedeploy.LoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `onPremiseInstanceTags` | software.amazon.awscdk.services.codedeploy.InstanceTagSet | [[cdk.support/lookup-entry]] | `:on-premise-instance-tags` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (ServerDeploymentGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :auto-rollback)]
      (. builder autoRollback data))
    (when-let [data (lookup-entry config id :auto-scaling-groups)]
      (. builder autoScalingGroups data))
    (when-let [data (lookup-entry config id :deployment-config)]
      (. builder deploymentConfig data))
    (when-let [data (lookup-entry config id :deployment-group-name)]
      (. builder deploymentGroupName data))
    (when-let [data (lookup-entry config id :ec2-instance-tags)]
      (. builder ec2InstanceTags data))
    (when-let [data (lookup-entry config id :ignore-alarm-configuration)]
      (. builder ignoreAlarmConfiguration data))
    (when-let [data (lookup-entry config id :ignore-poll-alarms-failure)]
      (. builder ignorePollAlarmsFailure data))
    (when-let [data (lookup-entry config id :install-agent)]
      (. builder installAgent data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :on-premise-instance-tags)]
      (. builder onPremiseInstanceTags data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn time-based-canary-traffic-routing-builder
  "The time-based-canary-traffic-routing-builder function buildes out new instances of 
TimeBasedCanaryTrafficRouting$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |"
  [stack id config]
  (let [builder (TimeBasedCanaryTrafficRouting$Builder/create)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (.build builder)))


(defn time-based-canary-traffic-routing-props-builder
  "The time-based-canary-traffic-routing-props-builder function buildes out new instances of 
TimeBasedCanaryTrafficRoutingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |"
  [stack id config]
  (let [builder (TimeBasedCanaryTrafficRoutingProps$Builder.)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (.build builder)))


(defn time-based-linear-traffic-routing-builder
  "The time-based-linear-traffic-routing-builder function buildes out new instances of 
TimeBasedLinearTrafficRouting$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |"
  [stack id config]
  (let [builder (TimeBasedLinearTrafficRouting$Builder/create)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (.build builder)))


(defn time-based-linear-traffic-routing-props-builder
  "The time-based-linear-traffic-routing-props-builder function buildes out new instances of 
TimeBasedLinearTrafficRoutingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |"
  [stack id config]
  (let [builder (TimeBasedLinearTrafficRoutingProps$Builder.)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :percentage)]
      (. builder percentage data))
    (.build builder)))


(defn traffic-routing-config-builder
  "The traffic-routing-config-builder function buildes out new instances of 
TrafficRoutingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeBasedCanary` | software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:time-based-canary` |
| `timeBasedLinear` | software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:time-based-linear` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (TrafficRoutingConfig$Builder.)]
    (when-let [data (lookup-entry config id :time-based-canary)]
      (. builder timeBasedCanary data))
    (when-let [data (lookup-entry config id :time-based-linear)]
      (. builder timeBasedLinear data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))