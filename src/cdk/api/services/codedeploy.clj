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


(defn auto-rollback-config-builder>
  "The auto-rollback-config-builder> function updates a AutoRollbackConfig$Builder instance using the provided configuration.
  The function takes the AutoRollbackConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentInAlarm` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deployment-in-alarm` |
| `failedDeployment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:failed-deployment` |
| `stoppedDeployment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stopped-deployment` |
"
  [^AutoRollbackConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-in-alarm)]
    (. builder deploymentInAlarm data))
  (when-some [data (lookup-entry config id :failed-deployment)]
    (. builder failedDeployment data))
  (when-some [data (lookup-entry config id :stopped-deployment)]
    (. builder stoppedDeployment data))
  (.build builder))


(defn auto-rollback-config-builder
  "Creates a  `AutoRollbackConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (auto-rollback-config-builder> (new AutoRollbackConfig$Builder) id config))


(defn base-deployment-config-options-builder>
  "The base-deployment-config-options-builder> function updates a BaseDeploymentConfigOptions$Builder instance using the provided configuration.
  The function takes the BaseDeploymentConfigOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
"
  [^BaseDeploymentConfigOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (.build builder))


(defn base-deployment-config-options-builder
  "Creates a  `BaseDeploymentConfigOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (base-deployment-config-options-builder> (new BaseDeploymentConfigOptions$Builder) id config))


(defn base-deployment-config-props-builder>
  "The base-deployment-config-props-builder> function updates a BaseDeploymentConfigProps$Builder instance using the provided configuration.
  The function takes the BaseDeploymentConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codedeploy.ComputePlatform | [[cdk.api.services.codedeploy/compute-platform]] | `:compute-platform` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |
"
  [^BaseDeploymentConfigProps$Builder builder id config]
  (when-some [data (compute-platform config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :minimum-healthy-hosts)]
    (. builder minimumHealthyHosts data))
  (when-some [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn base-deployment-config-props-builder
  "Creates a  `BaseDeploymentConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (base-deployment-config-props-builder> (new BaseDeploymentConfigProps$Builder) id config))


(defn base-traffic-shifting-config-props-builder>
  "The base-traffic-shifting-config-props-builder> function updates a BaseTrafficShiftingConfigProps$Builder instance using the provided configuration.
  The function takes the BaseTrafficShiftingConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
"
  [^BaseTrafficShiftingConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (.build builder))


(defn base-traffic-shifting-config-props-builder
  "Creates a  `BaseTrafficShiftingConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (base-traffic-shifting-config-props-builder> (new BaseTrafficShiftingConfigProps$Builder) id config))


(defn canary-traffic-routing-config-builder>
  "The canary-traffic-routing-config-builder> function updates a CanaryTrafficRoutingConfig$Builder instance using the provided configuration.
  The function takes the CanaryTrafficRoutingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canaryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-interval` |
| `canaryPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-percentage` |
"
  [^CanaryTrafficRoutingConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :canary-interval)]
    (. builder canaryInterval data))
  (when-some [data (lookup-entry config id :canary-percentage)]
    (. builder canaryPercentage data))
  (.build builder))


(defn canary-traffic-routing-config-builder
  "Creates a  `CanaryTrafficRoutingConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (canary-traffic-routing-config-builder> (new CanaryTrafficRoutingConfig$Builder) id config))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-deployment-config-builder>
  "The cfn-deployment-config-builder> function updates a CfnDeploymentConfig$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
| `trafficRoutingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |
| `zonalConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zonal-config` |
"
  [^CfnDeploymentConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :minimum-healthy-hosts)]
    (. builder minimumHealthyHosts data))
  (when-some [data (lookup-entry config id :traffic-routing-config)]
    (. builder trafficRoutingConfig data))
  (when-some [data (lookup-entry config id :zonal-config)]
    (. builder zonalConfig data))
  (.build builder))


(defn cfn-deployment-config-builder
  "Creates a  `CfnDeploymentConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-deployment-config-builder> (CfnDeploymentConfig$Builder/create scope (name id)) id config))


(defn cfn-deployment-config-minimum-healthy-hosts-per-zone-property-builder>
  "The cfn-deployment-config-minimum-healthy-hosts-per-zone-property-builder> function updates a CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-deployment-config-minimum-healthy-hosts-per-zone-property-builder
  "Creates a  `CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-minimum-healthy-hosts-per-zone-property-builder> (new CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty$Builder) id config))


(defn cfn-deployment-config-minimum-healthy-hosts-property-builder>
  "The cfn-deployment-config-minimum-healthy-hosts-property-builder> function updates a CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-deployment-config-minimum-healthy-hosts-property-builder
  "Creates a  `CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-minimum-healthy-hosts-property-builder> (new CfnDeploymentConfig$MinimumHealthyHostsProperty$Builder) id config))


(defn cfn-deployment-config-props-builder>
  "The cfn-deployment-config-props-builder> function updates a CfnDeploymentConfigProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
| `trafficRoutingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:traffic-routing-config` |
| `zonalConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zonal-config` |
"
  [^CfnDeploymentConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :minimum-healthy-hosts)]
    (. builder minimumHealthyHosts data))
  (when-some [data (lookup-entry config id :traffic-routing-config)]
    (. builder trafficRoutingConfig data))
  (when-some [data (lookup-entry config id :zonal-config)]
    (. builder zonalConfig data))
  (.build builder))


(defn cfn-deployment-config-props-builder
  "Creates a  `CfnDeploymentConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-props-builder> (new CfnDeploymentConfigProps$Builder) id config))


(defn cfn-deployment-config-time-based-canary-property-builder>
  "The cfn-deployment-config-time-based-canary-property-builder> function updates a CfnDeploymentConfig$TimeBasedCanaryProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$TimeBasedCanaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canaryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-interval` |
| `canaryPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:canary-percentage` |
"
  [^CfnDeploymentConfig$TimeBasedCanaryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :canary-interval)]
    (. builder canaryInterval data))
  (when-some [data (lookup-entry config id :canary-percentage)]
    (. builder canaryPercentage data))
  (.build builder))


(defn cfn-deployment-config-time-based-canary-property-builder
  "Creates a  `CfnDeploymentConfig$TimeBasedCanaryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-time-based-canary-property-builder> (new CfnDeploymentConfig$TimeBasedCanaryProperty$Builder) id config))


(defn cfn-deployment-config-time-based-linear-property-builder>
  "The cfn-deployment-config-time-based-linear-property-builder> function updates a CfnDeploymentConfig$TimeBasedLinearProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$TimeBasedLinearProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `linearInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-interval` |
| `linearPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-percentage` |
"
  [^CfnDeploymentConfig$TimeBasedLinearProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :linear-interval)]
    (. builder linearInterval data))
  (when-some [data (lookup-entry config id :linear-percentage)]
    (. builder linearPercentage data))
  (.build builder))


(defn cfn-deployment-config-time-based-linear-property-builder
  "Creates a  `CfnDeploymentConfig$TimeBasedLinearProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-time-based-linear-property-builder> (new CfnDeploymentConfig$TimeBasedLinearProperty$Builder) id config))


(defn cfn-deployment-config-traffic-routing-config-property-builder>
  "The cfn-deployment-config-traffic-routing-config-property-builder> function updates a CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeBasedCanary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-based-canary` |
| `timeBasedLinear` | software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig$TimeBasedLinearProperty | [[cdk.support/lookup-entry]] | `:time-based-linear` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :time-based-canary)]
    (. builder timeBasedCanary data))
  (when-some [data (lookup-entry config id :time-based-linear)]
    (. builder timeBasedLinear data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-deployment-config-traffic-routing-config-property-builder
  "Creates a  `CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-traffic-routing-config-property-builder> (new CfnDeploymentConfig$TrafficRoutingConfigProperty$Builder) id config))


(defn cfn-deployment-config-zonal-config-property-builder>
  "The cfn-deployment-config-zonal-config-property-builder> function updates a CfnDeploymentConfig$ZonalConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentConfig$ZonalConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firstZoneMonitorDurationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:first-zone-monitor-duration-in-seconds` |
| `minimumHealthyHostsPerZone` | software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig$MinimumHealthyHostsPerZoneProperty | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts-per-zone` |
| `monitorDurationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:monitor-duration-in-seconds` |
"
  [^CfnDeploymentConfig$ZonalConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :first-zone-monitor-duration-in-seconds)]
    (. builder firstZoneMonitorDurationInSeconds data))
  (when-some [data (lookup-entry config id :minimum-healthy-hosts-per-zone)]
    (. builder minimumHealthyHostsPerZone data))
  (when-some [data (lookup-entry config id :monitor-duration-in-seconds)]
    (. builder monitorDurationInSeconds data))
  (.build builder))


(defn cfn-deployment-config-zonal-config-property-builder
  "Creates a  `CfnDeploymentConfig$ZonalConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-config-zonal-config-property-builder> (new CfnDeploymentConfig$ZonalConfigProperty$Builder) id config))


(defn cfn-deployment-group-alarm-configuration-property-builder>
  "The cfn-deployment-group-alarm-configuration-property-builder> function updates a CfnDeploymentGroup$AlarmConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$AlarmConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `ignorePollAlarmFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-poll-alarm-failure` |
"
  [^CfnDeploymentGroup$AlarmConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :ignore-poll-alarm-failure)]
    (. builder ignorePollAlarmFailure data))
  (.build builder))


(defn cfn-deployment-group-alarm-configuration-property-builder
  "Creates a  `CfnDeploymentGroup$AlarmConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-alarm-configuration-property-builder> (new CfnDeploymentGroup$AlarmConfigurationProperty$Builder) id config))


(defn cfn-deployment-group-alarm-property-builder>
  "The cfn-deployment-group-alarm-property-builder> function updates a CfnDeploymentGroup$AlarmProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$AlarmProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDeploymentGroup$AlarmProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-deployment-group-alarm-property-builder
  "Creates a  `CfnDeploymentGroup$AlarmProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-alarm-property-builder> (new CfnDeploymentGroup$AlarmProperty$Builder) id config))


(defn cfn-deployment-group-auto-rollback-configuration-property-builder>
  "The cfn-deployment-group-auto-rollback-configuration-property-builder> function updates a CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (.build builder))


(defn cfn-deployment-group-auto-rollback-configuration-property-builder
  "Creates a  `CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-auto-rollback-configuration-property-builder> (new CfnDeploymentGroup$AutoRollbackConfigurationProperty$Builder) id config))


(defn cfn-deployment-group-blue-green-deployment-configuration-property-builder>
  "The cfn-deployment-group-blue-green-deployment-configuration-property-builder> function updates a CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentReadyOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-ready-option` |
| `greenFleetProvisioningOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:green-fleet-provisioning-option` |
| `terminateBlueInstancesOnDeploymentSuccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:terminate-blue-instances-on-deployment-success` |
"
  [^CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-ready-option)]
    (. builder deploymentReadyOption data))
  (when-some [data (lookup-entry config id :green-fleet-provisioning-option)]
    (. builder greenFleetProvisioningOption data))
  (when-some [data (lookup-entry config id :terminate-blue-instances-on-deployment-success)]
    (. builder terminateBlueInstancesOnDeploymentSuccess data))
  (.build builder))


(defn cfn-deployment-group-blue-green-deployment-configuration-property-builder
  "Creates a  `CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-blue-green-deployment-configuration-property-builder> (new CfnDeploymentGroup$BlueGreenDeploymentConfigurationProperty$Builder) id config))


(defn cfn-deployment-group-blue-instance-termination-option-property-builder>
  "The cfn-deployment-group-blue-instance-termination-option-property-builder> function updates a CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `terminationWaitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-time-in-minutes` |
"
  [^CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :termination-wait-time-in-minutes)]
    (. builder terminationWaitTimeInMinutes data))
  (.build builder))


(defn cfn-deployment-group-blue-instance-termination-option-property-builder
  "Creates a  `CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-blue-instance-termination-option-property-builder> (new CfnDeploymentGroup$BlueInstanceTerminationOptionProperty$Builder) id config))


(defn cfn-deployment-group-builder>
  "The cfn-deployment-group-builder> function updates a CfnDeploymentGroup$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `triggerConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:trigger-configurations` |
"
  [^CfnDeploymentGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-configuration)]
    (. builder alarmConfiguration data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :auto-rollback-configuration)]
    (. builder autoRollbackConfiguration data))
  (when-some [data (lookup-entry config id :auto-scaling-groups)]
    (. builder autoScalingGroups data))
  (when-some [data (lookup-entry config id :blue-green-deployment-configuration)]
    (. builder blueGreenDeploymentConfiguration data))
  (when-some [data (lookup-entry config id :deployment)]
    (. builder deployment data))
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :deployment-style)]
    (. builder deploymentStyle data))
  (when-some [data (lookup-entry config id :ec2-tag-filters)]
    (. builder ec2TagFilters data))
  (when-some [data (lookup-entry config id :ec2-tag-set)]
    (. builder ec2TagSet data))
  (when-some [data (lookup-entry config id :ecs-services)]
    (. builder ecsServices data))
  (when-some [data (lookup-entry config id :load-balancer-info)]
    (. builder loadBalancerInfo data))
  (when-some [data (lookup-entry config id :on-premises-instance-tag-filters)]
    (. builder onPremisesInstanceTagFilters data))
  (when-some [data (lookup-entry config id :on-premises-tag-set)]
    (. builder onPremisesTagSet data))
  (when-some [data (lookup-entry config id :outdated-instances-strategy)]
    (. builder outdatedInstancesStrategy data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :termination-hook-enabled)]
    (. builder terminationHookEnabled data))
  (when-some [data (lookup-entry config id :trigger-configurations)]
    (. builder triggerConfigurations data))
  (.build builder))


(defn cfn-deployment-group-builder
  "Creates a  `CfnDeploymentGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-deployment-group-builder> (CfnDeploymentGroup$Builder/create scope (name id)) id config))


(defn cfn-deployment-group-deployment-property-builder>
  "The cfn-deployment-group-deployment-property-builder> function updates a CfnDeploymentGroup$DeploymentProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$DeploymentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ignoreApplicationStopFailures` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-application-stop-failures` |
| `revision` | software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup$RevisionLocationProperty | [[cdk.support/lookup-entry]] | `:revision` |
"
  [^CfnDeploymentGroup$DeploymentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ignore-application-stop-failures)]
    (. builder ignoreApplicationStopFailures data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (.build builder))


(defn cfn-deployment-group-deployment-property-builder
  "Creates a  `CfnDeploymentGroup$DeploymentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-deployment-property-builder> (new CfnDeploymentGroup$DeploymentProperty$Builder) id config))


(defn cfn-deployment-group-deployment-ready-option-property-builder>
  "The cfn-deployment-group-deployment-ready-option-property-builder> function updates a CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnTimeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-timeout` |
| `waitTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-time-in-minutes` |
"
  [^CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action-on-timeout)]
    (. builder actionOnTimeout data))
  (when-some [data (lookup-entry config id :wait-time-in-minutes)]
    (. builder waitTimeInMinutes data))
  (.build builder))


(defn cfn-deployment-group-deployment-ready-option-property-builder
  "Creates a  `CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-deployment-ready-option-property-builder> (new CfnDeploymentGroup$DeploymentReadyOptionProperty$Builder) id config))


(defn cfn-deployment-group-deployment-style-property-builder>
  "The cfn-deployment-group-deployment-style-property-builder> function updates a CfnDeploymentGroup$DeploymentStyleProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$DeploymentStyleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-option` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
"
  [^CfnDeploymentGroup$DeploymentStyleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-option)]
    (. builder deploymentOption data))
  (when-some [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (.build builder))


(defn cfn-deployment-group-deployment-style-property-builder
  "Creates a  `CfnDeploymentGroup$DeploymentStyleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-deployment-style-property-builder> (new CfnDeploymentGroup$DeploymentStyleProperty$Builder) id config))


(defn cfn-deployment-group-ec2-tag-filter-property-builder>
  "The cfn-deployment-group-ec2-tag-filter-property-builder> function updates a CfnDeploymentGroup$EC2TagFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$EC2TagFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDeploymentGroup$EC2TagFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-deployment-group-ec2-tag-filter-property-builder
  "Creates a  `CfnDeploymentGroup$EC2TagFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-ec2-tag-filter-property-builder> (new CfnDeploymentGroup$EC2TagFilterProperty$Builder) id config))


(defn cfn-deployment-group-ec2-tag-set-list-object-property-builder>
  "The cfn-deployment-group-ec2-tag-set-list-object-property-builder> function updates a CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2TagGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-tag-group` |
"
  [^CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ec2-tag-group)]
    (. builder ec2TagGroup data))
  (.build builder))


(defn cfn-deployment-group-ec2-tag-set-list-object-property-builder
  "Creates a  `CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-ec2-tag-set-list-object-property-builder> (new CfnDeploymentGroup$EC2TagSetListObjectProperty$Builder) id config))


(defn cfn-deployment-group-ec2-tag-set-property-builder>
  "The cfn-deployment-group-ec2-tag-set-property-builder> function updates a CfnDeploymentGroup$EC2TagSetProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$EC2TagSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2TagSetList` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-tag-set-list` |
"
  [^CfnDeploymentGroup$EC2TagSetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ec2-tag-set-list)]
    (. builder ec2TagSetList data))
  (.build builder))


(defn cfn-deployment-group-ec2-tag-set-property-builder
  "Creates a  `CfnDeploymentGroup$EC2TagSetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-ec2-tag-set-property-builder> (new CfnDeploymentGroup$EC2TagSetProperty$Builder) id config))


(defn cfn-deployment-group-ecs-service-property-builder>
  "The cfn-deployment-group-ecs-service-property-builder> function updates a CfnDeploymentGroup$ECSServiceProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$ECSServiceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^CfnDeploymentGroup$ECSServiceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn cfn-deployment-group-ecs-service-property-builder
  "Creates a  `CfnDeploymentGroup$ECSServiceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-ecs-service-property-builder> (new CfnDeploymentGroup$ECSServiceProperty$Builder) id config))


(defn cfn-deployment-group-elb-info-property-builder>
  "The cfn-deployment-group-elb-info-property-builder> function updates a CfnDeploymentGroup$ELBInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$ELBInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDeploymentGroup$ELBInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-deployment-group-elb-info-property-builder
  "Creates a  `CfnDeploymentGroup$ELBInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-elb-info-property-builder> (new CfnDeploymentGroup$ELBInfoProperty$Builder) id config))


(defn cfn-deployment-group-git-hub-location-property-builder>
  "The cfn-deployment-group-git-hub-location-property-builder> function updates a CfnDeploymentGroup$GitHubLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$GitHubLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
"
  [^CfnDeploymentGroup$GitHubLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :commit-id)]
    (. builder commitId data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (.build builder))


(defn cfn-deployment-group-git-hub-location-property-builder
  "Creates a  `CfnDeploymentGroup$GitHubLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-git-hub-location-property-builder> (new CfnDeploymentGroup$GitHubLocationProperty$Builder) id config))


(defn cfn-deployment-group-green-fleet-provisioning-option-property-builder>
  "The cfn-deployment-group-green-fleet-provisioning-option-property-builder> function updates a CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn cfn-deployment-group-green-fleet-provisioning-option-property-builder
  "Creates a  `CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-green-fleet-provisioning-option-property-builder> (new CfnDeploymentGroup$GreenFleetProvisioningOptionProperty$Builder) id config))


(defn cfn-deployment-group-load-balancer-info-property-builder>
  "The cfn-deployment-group-load-balancer-info-property-builder> function updates a CfnDeploymentGroup$LoadBalancerInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$LoadBalancerInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `elbInfoList` | java.util.List | [[cdk.support/lookup-entry]] | `:elb-info-list` |
| `targetGroupInfoList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-group-info-list` |
| `targetGroupPairInfoList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-group-pair-info-list` |
"
  [^CfnDeploymentGroup$LoadBalancerInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :elb-info-list)]
    (. builder elbInfoList data))
  (when-some [data (lookup-entry config id :target-group-info-list)]
    (. builder targetGroupInfoList data))
  (when-some [data (lookup-entry config id :target-group-pair-info-list)]
    (. builder targetGroupPairInfoList data))
  (.build builder))


(defn cfn-deployment-group-load-balancer-info-property-builder
  "Creates a  `CfnDeploymentGroup$LoadBalancerInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-load-balancer-info-property-builder> (new CfnDeploymentGroup$LoadBalancerInfoProperty$Builder) id config))


(defn cfn-deployment-group-on-premises-tag-set-list-object-property-builder>
  "The cfn-deployment-group-on-premises-tag-set-list-object-property-builder> function updates a CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onPremisesTagGroup` | java.util.List | [[cdk.support/lookup-entry]] | `:on-premises-tag-group` |
"
  [^CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :on-premises-tag-group)]
    (. builder onPremisesTagGroup data))
  (.build builder))


(defn cfn-deployment-group-on-premises-tag-set-list-object-property-builder
  "Creates a  `CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-on-premises-tag-set-list-object-property-builder> (new CfnDeploymentGroup$OnPremisesTagSetListObjectProperty$Builder) id config))


(defn cfn-deployment-group-on-premises-tag-set-property-builder>
  "The cfn-deployment-group-on-premises-tag-set-property-builder> function updates a CfnDeploymentGroup$OnPremisesTagSetProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$OnPremisesTagSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onPremisesTagSetList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-premises-tag-set-list` |
"
  [^CfnDeploymentGroup$OnPremisesTagSetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :on-premises-tag-set-list)]
    (. builder onPremisesTagSetList data))
  (.build builder))


(defn cfn-deployment-group-on-premises-tag-set-property-builder
  "Creates a  `CfnDeploymentGroup$OnPremisesTagSetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-on-premises-tag-set-property-builder> (new CfnDeploymentGroup$OnPremisesTagSetProperty$Builder) id config))


(defn cfn-deployment-group-props-builder>
  "The cfn-deployment-group-props-builder> function updates a CfnDeploymentGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `triggerConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-configurations` |
"
  [^CfnDeploymentGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-configuration)]
    (. builder alarmConfiguration data))
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :auto-rollback-configuration)]
    (. builder autoRollbackConfiguration data))
  (when-some [data (lookup-entry config id :auto-scaling-groups)]
    (. builder autoScalingGroups data))
  (when-some [data (lookup-entry config id :blue-green-deployment-configuration)]
    (. builder blueGreenDeploymentConfiguration data))
  (when-some [data (lookup-entry config id :deployment)]
    (. builder deployment data))
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :deployment-style)]
    (. builder deploymentStyle data))
  (when-some [data (lookup-entry config id :ec2-tag-filters)]
    (. builder ec2TagFilters data))
  (when-some [data (lookup-entry config id :ec2-tag-set)]
    (. builder ec2TagSet data))
  (when-some [data (lookup-entry config id :ecs-services)]
    (. builder ecsServices data))
  (when-some [data (lookup-entry config id :load-balancer-info)]
    (. builder loadBalancerInfo data))
  (when-some [data (lookup-entry config id :on-premises-instance-tag-filters)]
    (. builder onPremisesInstanceTagFilters data))
  (when-some [data (lookup-entry config id :on-premises-tag-set)]
    (. builder onPremisesTagSet data))
  (when-some [data (lookup-entry config id :outdated-instances-strategy)]
    (. builder outdatedInstancesStrategy data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :termination-hook-enabled)]
    (. builder terminationHookEnabled data))
  (when-some [data (lookup-entry config id :trigger-configurations)]
    (. builder triggerConfigurations data))
  (.build builder))


(defn cfn-deployment-group-props-builder
  "Creates a  `CfnDeploymentGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-props-builder> (new CfnDeploymentGroupProps$Builder) id config))


(defn cfn-deployment-group-revision-location-property-builder>
  "The cfn-deployment-group-revision-location-property-builder> function updates a CfnDeploymentGroup$RevisionLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$RevisionLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gitHubLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:git-hub-location` |
| `revisionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-type` |
| `s3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CfnDeploymentGroup$RevisionLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :git-hub-location)]
    (. builder gitHubLocation data))
  (when-some [data (lookup-entry config id :revision-type)]
    (. builder revisionType data))
  (when-some [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn cfn-deployment-group-revision-location-property-builder
  "Creates a  `CfnDeploymentGroup$RevisionLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-revision-location-property-builder> (new CfnDeploymentGroup$RevisionLocationProperty$Builder) id config))


(defn cfn-deployment-group-s3-location-property-builder>
  "The cfn-deployment-group-s3-location-property-builder> function updates a CfnDeploymentGroup$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bundleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-type` |
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnDeploymentGroup$S3LocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :bundle-type)]
    (. builder bundleType data))
  (when-some [data (lookup-entry config id :e-tag)]
    (. builder eTag data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-deployment-group-s3-location-property-builder
  "Creates a  `CfnDeploymentGroup$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-s3-location-property-builder> (new CfnDeploymentGroup$S3LocationProperty$Builder) id config))


(defn cfn-deployment-group-tag-filter-property-builder>
  "The cfn-deployment-group-tag-filter-property-builder> function updates a CfnDeploymentGroup$TagFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$TagFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDeploymentGroup$TagFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-deployment-group-tag-filter-property-builder
  "Creates a  `CfnDeploymentGroup$TagFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-tag-filter-property-builder> (new CfnDeploymentGroup$TagFilterProperty$Builder) id config))


(defn cfn-deployment-group-target-group-info-property-builder>
  "The cfn-deployment-group-target-group-info-property-builder> function updates a CfnDeploymentGroup$TargetGroupInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$TargetGroupInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDeploymentGroup$TargetGroupInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-deployment-group-target-group-info-property-builder
  "Creates a  `CfnDeploymentGroup$TargetGroupInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-target-group-info-property-builder> (new CfnDeploymentGroup$TargetGroupInfoProperty$Builder) id config))


(defn cfn-deployment-group-target-group-pair-info-property-builder>
  "The cfn-deployment-group-target-group-pair-info-property-builder> function updates a CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prodTrafficRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prod-traffic-route` |
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |
| `testTrafficRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:test-traffic-route` |
"
  [^CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :prod-traffic-route)]
    (. builder prodTrafficRoute data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :test-traffic-route)]
    (. builder testTrafficRoute data))
  (.build builder))


(defn cfn-deployment-group-target-group-pair-info-property-builder
  "Creates a  `CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-target-group-pair-info-property-builder> (new CfnDeploymentGroup$TargetGroupPairInfoProperty$Builder) id config))


(defn cfn-deployment-group-traffic-route-property-builder>
  "The cfn-deployment-group-traffic-route-property-builder> function updates a CfnDeploymentGroup$TrafficRouteProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$TrafficRouteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:listener-arns` |
"
  [^CfnDeploymentGroup$TrafficRouteProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :listener-arns)]
    (. builder listenerArns data))
  (.build builder))


(defn cfn-deployment-group-traffic-route-property-builder
  "Creates a  `CfnDeploymentGroup$TrafficRouteProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-traffic-route-property-builder> (new CfnDeploymentGroup$TrafficRouteProperty$Builder) id config))


(defn cfn-deployment-group-trigger-config-property-builder>
  "The cfn-deployment-group-trigger-config-property-builder> function updates a CfnDeploymentGroup$TriggerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeploymentGroup$TriggerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `triggerEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:trigger-events` |
| `triggerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-name` |
| `triggerTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-target-arn` |
"
  [^CfnDeploymentGroup$TriggerConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :trigger-events)]
    (. builder triggerEvents data))
  (when-some [data (lookup-entry config id :trigger-name)]
    (. builder triggerName data))
  (when-some [data (lookup-entry config id :trigger-target-arn)]
    (. builder triggerTargetArn data))
  (.build builder))


(defn cfn-deployment-group-trigger-config-property-builder
  "Creates a  `CfnDeploymentGroup$TriggerConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-deployment-group-trigger-config-property-builder> (new CfnDeploymentGroup$TriggerConfigProperty$Builder) id config))


(defn ecs-application-builder>
  "The ecs-application-builder> function updates a EcsApplication$Builder instance using the provided configuration.
  The function takes the EcsApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
"
  [^EcsApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (.build builder))


(defn ecs-application-builder
  "Creates a  `EcsApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (ecs-application-builder> (EcsApplication$Builder/create scope (name id)) id config))


(defn ecs-application-props-builder>
  "The ecs-application-props-builder> function updates a EcsApplicationProps$Builder instance using the provided configuration.
  The function takes the EcsApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
"
  [^EcsApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (.build builder))


(defn ecs-application-props-builder
  "Creates a  `EcsApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-application-props-builder> (new EcsApplicationProps$Builder) id config))


(defn ecs-blue-green-deployment-config-builder>
  "The ecs-blue-green-deployment-config-builder> function updates a EcsBlueGreenDeploymentConfig$Builder instance using the provided configuration.
  The function takes the EcsBlueGreenDeploymentConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blueTargetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup | [[cdk.support/lookup-entry]] | `:blue-target-group` |
| `deploymentApprovalWaitTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-approval-wait-time` |
| `greenTargetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup | [[cdk.support/lookup-entry]] | `:green-target-group` |
| `listener` | software.amazon.awscdk.services.elasticloadbalancingv2.IListener | [[cdk.support/lookup-entry]] | `:listener` |
| `terminationWaitTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:termination-wait-time` |
| `testListener` | software.amazon.awscdk.services.elasticloadbalancingv2.IListener | [[cdk.support/lookup-entry]] | `:test-listener` |
"
  [^EcsBlueGreenDeploymentConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :blue-target-group)]
    (. builder blueTargetGroup data))
  (when-some [data (lookup-entry config id :deployment-approval-wait-time)]
    (. builder deploymentApprovalWaitTime data))
  (when-some [data (lookup-entry config id :green-target-group)]
    (. builder greenTargetGroup data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (when-some [data (lookup-entry config id :termination-wait-time)]
    (. builder terminationWaitTime data))
  (when-some [data (lookup-entry config id :test-listener)]
    (. builder testListener data))
  (.build builder))


(defn ecs-blue-green-deployment-config-builder
  "Creates a  `EcsBlueGreenDeploymentConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-blue-green-deployment-config-builder> (new EcsBlueGreenDeploymentConfig$Builder) id config))


(defn ecs-deployment-config-builder>
  "The ecs-deployment-config-builder> function updates a EcsDeploymentConfig$Builder instance using the provided configuration.
  The function takes the EcsDeploymentConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |
"
  [^EcsDeploymentConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn ecs-deployment-config-builder
  "Creates a  `EcsDeploymentConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (ecs-deployment-config-builder> (EcsDeploymentConfig$Builder/create scope (name id)) id config))


(defn ecs-deployment-config-props-builder>
  "The ecs-deployment-config-props-builder> function updates a EcsDeploymentConfigProps$Builder instance using the provided configuration.
  The function takes the EcsDeploymentConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |
"
  [^EcsDeploymentConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn ecs-deployment-config-props-builder
  "Creates a  `EcsDeploymentConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-deployment-config-props-builder> (new EcsDeploymentConfigProps$Builder) id config))


(defn ecs-deployment-group-attributes-builder>
  "The ecs-deployment-group-attributes-builder> function updates a EcsDeploymentGroupAttributes$Builder instance using the provided configuration.
  The function takes the EcsDeploymentGroupAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.codedeploy.IEcsApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
"
  [^EcsDeploymentGroupAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (.build builder))


(defn ecs-deployment-group-attributes-builder
  "Creates a  `EcsDeploymentGroupAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-deployment-group-attributes-builder> (new EcsDeploymentGroupAttributes$Builder) id config))


(defn ecs-deployment-group-builder>
  "The ecs-deployment-group-builder> function updates a EcsDeploymentGroup$Builder instance using the provided configuration.
  The function takes the EcsDeploymentGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^EcsDeploymentGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :auto-rollback)]
    (. builder autoRollback data))
  (when-some [data (lookup-entry config id :blue-green-deployment-config)]
    (. builder blueGreenDeploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :ignore-alarm-configuration)]
    (. builder ignoreAlarmConfiguration data))
  (when-some [data (lookup-entry config id :ignore-poll-alarms-failure)]
    (. builder ignorePollAlarmsFailure data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn ecs-deployment-group-builder
  "Creates a  `EcsDeploymentGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (ecs-deployment-group-builder> (EcsDeploymentGroup$Builder/create scope (name id)) id config))


(defn ecs-deployment-group-props-builder>
  "The ecs-deployment-group-props-builder> function updates a EcsDeploymentGroupProps$Builder instance using the provided configuration.
  The function takes the EcsDeploymentGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `service` | software.amazon.awscdk.services.ecs.IBaseService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^EcsDeploymentGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :auto-rollback)]
    (. builder autoRollback data))
  (when-some [data (lookup-entry config id :blue-green-deployment-config)]
    (. builder blueGreenDeploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :ignore-alarm-configuration)]
    (. builder ignoreAlarmConfiguration data))
  (when-some [data (lookup-entry config id :ignore-poll-alarms-failure)]
    (. builder ignorePollAlarmsFailure data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn ecs-deployment-group-props-builder
  "Creates a  `EcsDeploymentGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ecs-deployment-group-props-builder> (new EcsDeploymentGroupProps$Builder) id config))


(defn lambda-application-builder>
  "The lambda-application-builder> function updates a LambdaApplication$Builder instance using the provided configuration.
  The function takes the LambdaApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
"
  [^LambdaApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (.build builder))


(defn lambda-application-builder
  "Creates a  `LambdaApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (lambda-application-builder> (LambdaApplication$Builder/create scope (name id)) id config))


(defn lambda-application-props-builder>
  "The lambda-application-props-builder> function updates a LambdaApplicationProps$Builder instance using the provided configuration.
  The function takes the LambdaApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
"
  [^LambdaApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (.build builder))


(defn lambda-application-props-builder
  "Creates a  `LambdaApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-application-props-builder> (new LambdaApplicationProps$Builder) id config))


(defn lambda-deployment-config-builder>
  "The lambda-deployment-config-builder> function updates a LambdaDeploymentConfig$Builder instance using the provided configuration.
  The function takes the LambdaDeploymentConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |
"
  [^LambdaDeploymentConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn lambda-deployment-config-builder
  "Creates a  `LambdaDeploymentConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (lambda-deployment-config-builder> (LambdaDeploymentConfig$Builder/create scope (name id)) id config))


(defn lambda-deployment-config-import-props-builder>
  "The lambda-deployment-config-import-props-builder> function updates a LambdaDeploymentConfigImportProps$Builder instance using the provided configuration.
  The function takes the LambdaDeploymentConfigImportProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
"
  [^LambdaDeploymentConfigImportProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (.build builder))


(defn lambda-deployment-config-import-props-builder
  "Creates a  `LambdaDeploymentConfigImportProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-deployment-config-import-props-builder> (new LambdaDeploymentConfigImportProps$Builder) id config))


(defn lambda-deployment-config-props-builder>
  "The lambda-deployment-config-props-builder> function updates a LambdaDeploymentConfigProps$Builder instance using the provided configuration.
  The function takes the LambdaDeploymentConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `trafficRouting` | software.amazon.awscdk.services.codedeploy.TrafficRouting | [[cdk.support/lookup-entry]] | `:traffic-routing` |
"
  [^LambdaDeploymentConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :traffic-routing)]
    (. builder trafficRouting data))
  (.build builder))


(defn lambda-deployment-config-props-builder
  "Creates a  `LambdaDeploymentConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-deployment-config-props-builder> (new LambdaDeploymentConfigProps$Builder) id config))


(defn lambda-deployment-group-attributes-builder>
  "The lambda-deployment-group-attributes-builder> function updates a LambdaDeploymentGroupAttributes$Builder instance using the provided configuration.
  The function takes the LambdaDeploymentGroupAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.codedeploy.ILambdaApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
"
  [^LambdaDeploymentGroupAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (.build builder))


(defn lambda-deployment-group-attributes-builder
  "Creates a  `LambdaDeploymentGroupAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-deployment-group-attributes-builder> (new LambdaDeploymentGroupAttributes$Builder) id config))


(defn lambda-deployment-group-builder>
  "The lambda-deployment-group-builder> function updates a LambdaDeploymentGroup$Builder instance using the provided configuration.
  The function takes the LambdaDeploymentGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^LambdaDeploymentGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :auto-rollback)]
    (. builder autoRollback data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :ignore-alarm-configuration)]
    (. builder ignoreAlarmConfiguration data))
  (when-some [data (lookup-entry config id :ignore-poll-alarms-failure)]
    (. builder ignorePollAlarmsFailure data))
  (when-some [data (lookup-entry config id :post-hook)]
    (. builder postHook data))
  (when-some [data (lookup-entry config id :pre-hook)]
    (. builder preHook data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn lambda-deployment-group-builder
  "Creates a  `LambdaDeploymentGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (lambda-deployment-group-builder> (LambdaDeploymentGroup$Builder/create scope (name id)) id config))


(defn lambda-deployment-group-props-builder>
  "The lambda-deployment-group-props-builder> function updates a LambdaDeploymentGroupProps$Builder instance using the provided configuration.
  The function takes the LambdaDeploymentGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^LambdaDeploymentGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :auto-rollback)]
    (. builder autoRollback data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :ignore-alarm-configuration)]
    (. builder ignoreAlarmConfiguration data))
  (when-some [data (lookup-entry config id :ignore-poll-alarms-failure)]
    (. builder ignorePollAlarmsFailure data))
  (when-some [data (lookup-entry config id :post-hook)]
    (. builder postHook data))
  (when-some [data (lookup-entry config id :pre-hook)]
    (. builder preHook data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn lambda-deployment-group-props-builder
  "Creates a  `LambdaDeploymentGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-deployment-group-props-builder> (new LambdaDeploymentGroupProps$Builder) id config))


(defn linear-traffic-routing-config-builder>
  "The linear-traffic-routing-config-builder> function updates a LinearTrafficRoutingConfig$Builder instance using the provided configuration.
  The function takes the LinearTrafficRoutingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `linearInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-interval` |
| `linearPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:linear-percentage` |
"
  [^LinearTrafficRoutingConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :linear-interval)]
    (. builder linearInterval data))
  (when-some [data (lookup-entry config id :linear-percentage)]
    (. builder linearPercentage data))
  (.build builder))


(defn linear-traffic-routing-config-builder
  "Creates a  `LinearTrafficRoutingConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (linear-traffic-routing-config-builder> (new LinearTrafficRoutingConfig$Builder) id config))


(defn server-application-builder>
  "The server-application-builder> function updates a ServerApplication$Builder instance using the provided configuration.
  The function takes the ServerApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
"
  [^ServerApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (.build builder))


(defn server-application-builder
  "Creates a  `ServerApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (server-application-builder> (ServerApplication$Builder/create scope (name id)) id config))


(defn server-application-props-builder>
  "The server-application-props-builder> function updates a ServerApplicationProps$Builder instance using the provided configuration.
  The function takes the ServerApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
"
  [^ServerApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (.build builder))


(defn server-application-props-builder
  "Creates a  `ServerApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (server-application-props-builder> (new ServerApplicationProps$Builder) id config))


(defn server-deployment-config-builder>
  "The server-deployment-config-builder> function updates a ServerDeploymentConfig$Builder instance using the provided configuration.
  The function takes the ServerDeploymentConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
"
  [^ServerDeploymentConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :minimum-healthy-hosts)]
    (. builder minimumHealthyHosts data))
  (.build builder))


(defn server-deployment-config-builder
  "Creates a  `ServerDeploymentConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (server-deployment-config-builder> (ServerDeploymentConfig$Builder/create scope (name id)) id config))


(defn server-deployment-config-props-builder>
  "The server-deployment-config-props-builder> function updates a ServerDeploymentConfigProps$Builder instance using the provided configuration.
  The function takes the ServerDeploymentConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-config-name` |
| `minimumHealthyHosts` | software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts | [[cdk.support/lookup-entry]] | `:minimum-healthy-hosts` |
"
  [^ServerDeploymentConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deployment-config-name)]
    (. builder deploymentConfigName data))
  (when-some [data (lookup-entry config id :minimum-healthy-hosts)]
    (. builder minimumHealthyHosts data))
  (.build builder))


(defn server-deployment-config-props-builder
  "Creates a  `ServerDeploymentConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (server-deployment-config-props-builder> (new ServerDeploymentConfigProps$Builder) id config))


(defn server-deployment-group-attributes-builder>
  "The server-deployment-group-attributes-builder> function updates a ServerDeploymentGroupAttributes$Builder instance using the provided configuration.
  The function takes the ServerDeploymentGroupAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.codedeploy.IServerApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deploymentConfig` | software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `deploymentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-group-name` |
"
  [^ServerDeploymentGroupAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (.build builder))


(defn server-deployment-group-attributes-builder
  "Creates a  `ServerDeploymentGroupAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (server-deployment-group-attributes-builder> (new ServerDeploymentGroupAttributes$Builder) id config))


(defn server-deployment-group-builder>
  "The server-deployment-group-builder> function updates a ServerDeploymentGroup$Builder instance using the provided configuration.
  The function takes the ServerDeploymentGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^ServerDeploymentGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :auto-rollback)]
    (. builder autoRollback data))
  (when-some [data (lookup-entry config id :auto-scaling-groups)]
    (. builder autoScalingGroups data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :ec2-instance-tags)]
    (. builder ec2InstanceTags data))
  (when-some [data (lookup-entry config id :ignore-alarm-configuration)]
    (. builder ignoreAlarmConfiguration data))
  (when-some [data (lookup-entry config id :ignore-poll-alarms-failure)]
    (. builder ignorePollAlarmsFailure data))
  (when-some [data (lookup-entry config id :install-agent)]
    (. builder installAgent data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :on-premise-instance-tags)]
    (. builder onPremiseInstanceTags data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn server-deployment-group-builder
  "Creates a  `ServerDeploymentGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (server-deployment-group-builder> (ServerDeploymentGroup$Builder/create scope (name id)) id config))


(defn server-deployment-group-props-builder>
  "The server-deployment-group-props-builder> function updates a ServerDeploymentGroupProps$Builder instance using the provided configuration.
  The function takes the ServerDeploymentGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^ServerDeploymentGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :auto-rollback)]
    (. builder autoRollback data))
  (when-some [data (lookup-entry config id :auto-scaling-groups)]
    (. builder autoScalingGroups data))
  (when-some [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-some [data (lookup-entry config id :deployment-group-name)]
    (. builder deploymentGroupName data))
  (when-some [data (lookup-entry config id :ec2-instance-tags)]
    (. builder ec2InstanceTags data))
  (when-some [data (lookup-entry config id :ignore-alarm-configuration)]
    (. builder ignoreAlarmConfiguration data))
  (when-some [data (lookup-entry config id :ignore-poll-alarms-failure)]
    (. builder ignorePollAlarmsFailure data))
  (when-some [data (lookup-entry config id :install-agent)]
    (. builder installAgent data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :on-premise-instance-tags)]
    (. builder onPremiseInstanceTags data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn server-deployment-group-props-builder
  "Creates a  `ServerDeploymentGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (server-deployment-group-props-builder> (new ServerDeploymentGroupProps$Builder) id config))


(defn time-based-canary-traffic-routing-builder>
  "The time-based-canary-traffic-routing-builder> function updates a TimeBasedCanaryTrafficRouting$Builder instance using the provided configuration.
  The function takes the TimeBasedCanaryTrafficRouting$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
"
  [^TimeBasedCanaryTrafficRouting$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (.build builder))


(defn time-based-canary-traffic-routing-builder
  "Creates a  `TimeBasedCanaryTrafficRouting$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (time-based-canary-traffic-routing-builder> (TimeBasedCanaryTrafficRouting$Builder/create) id config))


(defn time-based-canary-traffic-routing-props-builder>
  "The time-based-canary-traffic-routing-props-builder> function updates a TimeBasedCanaryTrafficRoutingProps$Builder instance using the provided configuration.
  The function takes the TimeBasedCanaryTrafficRoutingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
"
  [^TimeBasedCanaryTrafficRoutingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (.build builder))


(defn time-based-canary-traffic-routing-props-builder
  "Creates a  `TimeBasedCanaryTrafficRoutingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (time-based-canary-traffic-routing-props-builder> (new TimeBasedCanaryTrafficRoutingProps$Builder) id config))


(defn time-based-linear-traffic-routing-builder>
  "The time-based-linear-traffic-routing-builder> function updates a TimeBasedLinearTrafficRouting$Builder instance using the provided configuration.
  The function takes the TimeBasedLinearTrafficRouting$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
"
  [^TimeBasedLinearTrafficRouting$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (.build builder))


(defn time-based-linear-traffic-routing-builder
  "Creates a  `TimeBasedLinearTrafficRouting$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (time-based-linear-traffic-routing-builder> (TimeBasedLinearTrafficRouting$Builder/create) id config))


(defn time-based-linear-traffic-routing-props-builder>
  "The time-based-linear-traffic-routing-props-builder> function updates a TimeBasedLinearTrafficRoutingProps$Builder instance using the provided configuration.
  The function takes the TimeBasedLinearTrafficRoutingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `percentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:percentage` |
"
  [^TimeBasedLinearTrafficRoutingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :percentage)]
    (. builder percentage data))
  (.build builder))


(defn time-based-linear-traffic-routing-props-builder
  "Creates a  `TimeBasedLinearTrafficRoutingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (time-based-linear-traffic-routing-props-builder> (new TimeBasedLinearTrafficRoutingProps$Builder) id config))


(defn traffic-routing-config-builder>
  "The traffic-routing-config-builder> function updates a TrafficRoutingConfig$Builder instance using the provided configuration.
  The function takes the TrafficRoutingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeBasedCanary` | software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:time-based-canary` |
| `timeBasedLinear` | software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig | [[cdk.support/lookup-entry]] | `:time-based-linear` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^TrafficRoutingConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :time-based-canary)]
    (. builder timeBasedCanary data))
  (when-some [data (lookup-entry config id :time-based-linear)]
    (. builder timeBasedLinear data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn traffic-routing-config-builder
  "Creates a  `TrafficRoutingConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (traffic-routing-config-builder> (new TrafficRoutingConfig$Builder) id config))