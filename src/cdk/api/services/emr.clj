(ns cdk.api.services.emr
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.emr package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.emr CfnCluster$ApplicationProperty$Builder
                                                CfnCluster$AutoScalingPolicyProperty$Builder
                                                CfnCluster$AutoTerminationPolicyProperty$Builder
                                                CfnCluster$BootstrapActionConfigProperty$Builder
                                                CfnCluster$Builder
                                                CfnCluster$CloudWatchAlarmDefinitionProperty$Builder
                                                CfnCluster$ComputeLimitsProperty$Builder
                                                CfnCluster$ConfigurationProperty$Builder
                                                CfnCluster$EbsBlockDeviceConfigProperty$Builder
                                                CfnCluster$EbsConfigurationProperty$Builder
                                                CfnCluster$HadoopJarStepConfigProperty$Builder
                                                CfnCluster$InstanceFleetConfigProperty$Builder
                                                CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder
                                                CfnCluster$InstanceGroupConfigProperty$Builder
                                                CfnCluster$InstanceTypeConfigProperty$Builder
                                                CfnCluster$JobFlowInstancesConfigProperty$Builder
                                                CfnCluster$KerberosAttributesProperty$Builder
                                                CfnCluster$KeyValueProperty$Builder
                                                CfnCluster$ManagedScalingPolicyProperty$Builder
                                                CfnCluster$MetricDimensionProperty$Builder
                                                CfnCluster$OnDemandProvisioningSpecificationProperty$Builder
                                                CfnCluster$PlacementGroupConfigProperty$Builder
                                                CfnCluster$PlacementTypeProperty$Builder
                                                CfnCluster$ScalingActionProperty$Builder
                                                CfnCluster$ScalingConstraintsProperty$Builder
                                                CfnCluster$ScalingRuleProperty$Builder
                                                CfnCluster$ScalingTriggerProperty$Builder
                                                CfnCluster$ScriptBootstrapActionConfigProperty$Builder
                                                CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder
                                                CfnCluster$SpotProvisioningSpecificationProperty$Builder
                                                CfnCluster$StepConfigProperty$Builder
                                                CfnCluster$VolumeSpecificationProperty$Builder
                                                CfnClusterProps$Builder
                                                CfnInstanceFleetConfig$Builder
                                                CfnInstanceFleetConfig$ConfigurationProperty$Builder
                                                CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder
                                                CfnInstanceFleetConfig$EbsConfigurationProperty$Builder
                                                CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder
                                                CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder
                                                CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder
                                                CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder
                                                CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder
                                                CfnInstanceFleetConfigProps$Builder
                                                CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder
                                                CfnInstanceGroupConfig$Builder
                                                CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder
                                                CfnInstanceGroupConfig$ConfigurationProperty$Builder
                                                CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder
                                                CfnInstanceGroupConfig$EbsConfigurationProperty$Builder
                                                CfnInstanceGroupConfig$MetricDimensionProperty$Builder
                                                CfnInstanceGroupConfig$ScalingActionProperty$Builder
                                                CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder
                                                CfnInstanceGroupConfig$ScalingRuleProperty$Builder
                                                CfnInstanceGroupConfig$ScalingTriggerProperty$Builder
                                                CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder
                                                CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder
                                                CfnInstanceGroupConfigProps$Builder
                                                CfnSecurityConfiguration$Builder
                                                CfnSecurityConfigurationProps$Builder
                                                CfnStep$Builder
                                                CfnStep$HadoopJarStepConfigProperty$Builder
                                                CfnStep$KeyValueProperty$Builder
                                                CfnStepProps$Builder
                                                CfnStudio$Builder
                                                CfnStudioProps$Builder
                                                CfnStudioSessionMapping$Builder
                                                CfnStudioSessionMappingProps$Builder
                                                CfnWALWorkspace$Builder
                                                CfnWALWorkspaceProps$Builder]))


(defn build-cfn-cluster-application-property-builder
  "The build-cfn-cluster-application-property-builder function updates a CfnCluster$ApplicationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ApplicationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-info` |
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnCluster$ApplicationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-info)]
    (. builder additionalInfo data))
  (when-let [data (lookup-entry config id :args)]
    (. builder args data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-cluster-application-property-builder
  "Creates a  `CfnCluster$ApplicationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-application-property-builder (new CfnCluster$ApplicationProperty$Builder) id config))


(defn build-cfn-cluster-auto-scaling-policy-property-builder
  "The build-cfn-cluster-auto-scaling-policy-property-builder function updates a CfnCluster$AutoScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$AutoScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnCluster$AutoScalingPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-cluster-auto-scaling-policy-property-builder
  "Creates a  `CfnCluster$AutoScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-auto-scaling-policy-property-builder (new CfnCluster$AutoScalingPolicyProperty$Builder) id config))


(defn build-cfn-cluster-auto-termination-policy-property-builder
  "The build-cfn-cluster-auto-termination-policy-property-builder function updates a CfnCluster$AutoTerminationPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$AutoTerminationPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout` |
"
  [^CfnCluster$AutoTerminationPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (.build builder))


(defn cfn-cluster-auto-termination-policy-property-builder
  "Creates a  `CfnCluster$AutoTerminationPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-auto-termination-policy-property-builder (new CfnCluster$AutoTerminationPolicyProperty$Builder) id config))


(defn build-cfn-cluster-bootstrap-action-config-property-builder
  "The build-cfn-cluster-bootstrap-action-config-property-builder function updates a CfnCluster$BootstrapActionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$BootstrapActionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scriptBootstrapAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:script-bootstrap-action` |
"
  [^CfnCluster$BootstrapActionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :script-bootstrap-action)]
    (. builder scriptBootstrapAction data))
  (.build builder))


(defn cfn-cluster-bootstrap-action-config-property-builder
  "Creates a  `CfnCluster$BootstrapActionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-bootstrap-action-config-property-builder (new CfnCluster$BootstrapActionConfigProperty$Builder) id config))


(defn build-cfn-cluster-builder
  "The build-cfn-cluster-builder function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.lang.Object | [[cdk.support/lookup-entry]] | `:additional-info` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `autoScalingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-role` |
| `autoTerminationPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-termination-policy` |
| `bootstrapActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bootstrap-actions` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsRootVolumeIops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-root-volume-iops` |
| `ebsRootVolumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-root-volume-size` |
| `ebsRootVolumeThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-root-volume-throughput` |
| `instances` | software.amazon.awscdk.services.emr.CfnCluster$JobFlowInstancesConfigProperty | [[cdk.support/lookup-entry]] | `:instances` |
| `jobFlowRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-role` |
| `kerberosAttributes` | software.amazon.awscdk.services.emr.CfnCluster$KerberosAttributesProperty | [[cdk.support/lookup-entry]] | `:kerberos-attributes` |
| `logEncryptionKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-encryption-kms-key-id` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
| `managedScalingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-scaling-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `osReleaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-release-label` |
| `placementGroupConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-group-configs` |
| `releaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-label` |
| `scaleDownBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:scale-down-behavior` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `stepConcurrencyLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-concurrency-level` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |
"
  [^CfnCluster$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-info)]
    (. builder additionalInfo data))
  (when-let [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-let [data (lookup-entry config id :auto-scaling-role)]
    (. builder autoScalingRole data))
  (when-let [data (lookup-entry config id :auto-termination-policy)]
    (. builder autoTerminationPolicy data))
  (when-let [data (lookup-entry config id :bootstrap-actions)]
    (. builder bootstrapActions data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-root-volume-iops)]
    (. builder ebsRootVolumeIops data))
  (when-let [data (lookup-entry config id :ebs-root-volume-size)]
    (. builder ebsRootVolumeSize data))
  (when-let [data (lookup-entry config id :ebs-root-volume-throughput)]
    (. builder ebsRootVolumeThroughput data))
  (when-let [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-let [data (lookup-entry config id :job-flow-role)]
    (. builder jobFlowRole data))
  (when-let [data (lookup-entry config id :kerberos-attributes)]
    (. builder kerberosAttributes data))
  (when-let [data (lookup-entry config id :log-encryption-kms-key-id)]
    (. builder logEncryptionKmsKeyId data))
  (when-let [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (when-let [data (lookup-entry config id :managed-scaling-policy)]
    (. builder managedScalingPolicy data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :os-release-label)]
    (. builder osReleaseLabel data))
  (when-let [data (lookup-entry config id :placement-group-configs)]
    (. builder placementGroupConfigs data))
  (when-let [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-let [data (lookup-entry config id :scale-down-behavior)]
    (. builder scaleDownBehavior data))
  (when-let [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-let [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-let [data (lookup-entry config id :step-concurrency-level)]
    (. builder stepConcurrencyLevel data))
  (when-let [data (lookup-entry config id :steps)]
    (. builder steps data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visible-to-all-users)]
    (. builder visibleToAllUsers data))
  (.build builder))


(defn cfn-cluster-builder
  "Creates a  `CfnCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-cluster-builder (CfnCluster$Builder/create scope (name id)) id config))


(defn build-cfn-cluster-cloud-watch-alarm-definition-property-builder
  "The build-cfn-cluster-cloud-watch-alarm-definition-property-builder function updates a CfnCluster$CloudWatchAlarmDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$CloudWatchAlarmDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnCluster$CloudWatchAlarmDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :period)]
    (. builder period data))
  (when-let [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-let [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-cluster-cloud-watch-alarm-definition-property-builder
  "Creates a  `CfnCluster$CloudWatchAlarmDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-cloud-watch-alarm-definition-property-builder (new CfnCluster$CloudWatchAlarmDefinitionProperty$Builder) id config))


(defn build-cfn-cluster-compute-limits-property-builder
  "The build-cfn-cluster-compute-limits-property-builder function updates a CfnCluster$ComputeLimitsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ComputeLimitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-capacity-units` |
| `maximumCoreCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-core-capacity-units` |
| `maximumOnDemandCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-on-demand-capacity-units` |
| `minimumCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-capacity-units` |
| `unitType` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-type` |
"
  [^CfnCluster$ComputeLimitsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-capacity-units)]
    (. builder maximumCapacityUnits data))
  (when-let [data (lookup-entry config id :maximum-core-capacity-units)]
    (. builder maximumCoreCapacityUnits data))
  (when-let [data (lookup-entry config id :maximum-on-demand-capacity-units)]
    (. builder maximumOnDemandCapacityUnits data))
  (when-let [data (lookup-entry config id :minimum-capacity-units)]
    (. builder minimumCapacityUnits data))
  (when-let [data (lookup-entry config id :unit-type)]
    (. builder unitType data))
  (.build builder))


(defn cfn-cluster-compute-limits-property-builder
  "Creates a  `CfnCluster$ComputeLimitsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-compute-limits-property-builder (new CfnCluster$ComputeLimitsProperty$Builder) id config))


(defn build-cfn-cluster-configuration-property-builder
  "The build-cfn-cluster-configuration-property-builder function updates a CfnCluster$ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurationProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
"
  [^CfnCluster$ConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-let [data (lookup-entry config id :configuration-properties)]
    (. builder configurationProperties data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (.build builder))


(defn cfn-cluster-configuration-property-builder
  "Creates a  `CfnCluster$ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-configuration-property-builder (new CfnCluster$ConfigurationProperty$Builder) id config))


(defn build-cfn-cluster-ebs-block-device-config-property-builder
  "The build-cfn-cluster-ebs-block-device-config-property-builder function updates a CfnCluster$EbsBlockDeviceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EbsBlockDeviceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |
"
  [^CfnCluster$EbsBlockDeviceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :volume-specification)]
    (. builder volumeSpecification data))
  (when-let [data (lookup-entry config id :volumes-per-instance)]
    (. builder volumesPerInstance data))
  (.build builder))


(defn cfn-cluster-ebs-block-device-config-property-builder
  "Creates a  `CfnCluster$EbsBlockDeviceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-ebs-block-device-config-property-builder (new CfnCluster$EbsBlockDeviceConfigProperty$Builder) id config))


(defn build-cfn-cluster-ebs-configuration-property-builder
  "The build-cfn-cluster-ebs-configuration-property-builder function updates a CfnCluster$EbsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EbsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
"
  [^CfnCluster$EbsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ebs-block-device-configs)]
    (. builder ebsBlockDeviceConfigs data))
  (when-let [data (lookup-entry config id :ebs-optimized)]
    (. builder ebsOptimized data))
  (.build builder))


(defn cfn-cluster-ebs-configuration-property-builder
  "Creates a  `CfnCluster$EbsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-ebs-configuration-property-builder (new CfnCluster$EbsConfigurationProperty$Builder) id config))


(defn build-cfn-cluster-hadoop-jar-step-config-property-builder
  "The build-cfn-cluster-hadoop-jar-step-config-property-builder function updates a CfnCluster$HadoopJarStepConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$HadoopJarStepConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `jar` | java.lang.String | [[cdk.support/lookup-entry]] | `:jar` |
| `mainClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:main-class` |
| `stepProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:step-properties` |
"
  [^CfnCluster$HadoopJarStepConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :args)]
    (. builder args data))
  (when-let [data (lookup-entry config id :jar)]
    (. builder jar data))
  (when-let [data (lookup-entry config id :main-class)]
    (. builder mainClass data))
  (when-let [data (lookup-entry config id :step-properties)]
    (. builder stepProperties data))
  (.build builder))


(defn cfn-cluster-hadoop-jar-step-config-property-builder
  "Creates a  `CfnCluster$HadoopJarStepConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-hadoop-jar-step-config-property-builder (new CfnCluster$HadoopJarStepConfigProperty$Builder) id config))


(defn build-cfn-cluster-instance-fleet-config-property-builder
  "The build-cfn-cluster-instance-fleet-config-property-builder function updates a CfnCluster$InstanceFleetConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$InstanceFleetConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceTypeConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |
"
  [^CfnCluster$InstanceFleetConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-type-configs)]
    (. builder instanceTypeConfigs data))
  (when-let [data (lookup-entry config id :launch-specifications)]
    (. builder launchSpecifications data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :target-on-demand-capacity)]
    (. builder targetOnDemandCapacity data))
  (when-let [data (lookup-entry config id :target-spot-capacity)]
    (. builder targetSpotCapacity data))
  (.build builder))


(defn cfn-cluster-instance-fleet-config-property-builder
  "Creates a  `CfnCluster$InstanceFleetConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-instance-fleet-config-property-builder (new CfnCluster$InstanceFleetConfigProperty$Builder) id config))


(defn build-cfn-cluster-instance-fleet-provisioning-specifications-property-builder
  "The build-cfn-cluster-instance-fleet-provisioning-specifications-property-builder function updates a CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandSpecification` | software.amazon.awscdk.services.emr.CfnCluster$OnDemandProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:on-demand-specification` |
| `spotSpecification` | software.amazon.awscdk.services.emr.CfnCluster$SpotProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:spot-specification` |
"
  [^CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-demand-specification)]
    (. builder onDemandSpecification data))
  (when-let [data (lookup-entry config id :spot-specification)]
    (. builder spotSpecification data))
  (.build builder))


(defn cfn-cluster-instance-fleet-provisioning-specifications-property-builder
  "Creates a  `CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-instance-fleet-provisioning-specifications-property-builder (new CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder) id config))


(defn build-cfn-cluster-instance-group-config-property-builder
  "The build-cfn-cluster-instance-group-config-property-builder function updates a CfnCluster$InstanceGroupConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$InstanceGroupConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingPolicy` | software.amazon.awscdk.services.emr.CfnCluster$AutoScalingPolicyProperty | [[cdk.support/lookup-entry]] | `:auto-scaling-policy` |
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnCluster$InstanceGroupConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-policy)]
    (. builder autoScalingPolicy data))
  (when-let [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :market)]
    (. builder market data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-cluster-instance-group-config-property-builder
  "Creates a  `CfnCluster$InstanceGroupConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-instance-group-config-property-builder (new CfnCluster$InstanceGroupConfigProperty$Builder) id config))


(defn build-cfn-cluster-instance-type-config-property-builder
  "The build-cfn-cluster-instance-type-config-property-builder function updates a CfnCluster$InstanceTypeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$InstanceTypeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `bidPriceAsPercentageOfOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-price-as-percentage-of-on-demand-price` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.services.emr.CfnCluster$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |
"
  [^CfnCluster$InstanceTypeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-let [data (lookup-entry config id :bid-price-as-percentage-of-on-demand-price)]
    (. builder bidPriceAsPercentageOfOnDemandPrice data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :weighted-capacity)]
    (. builder weightedCapacity data))
  (.build builder))


(defn cfn-cluster-instance-type-config-property-builder
  "Creates a  `CfnCluster$InstanceTypeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-instance-type-config-property-builder (new CfnCluster$InstanceTypeConfigProperty$Builder) id config))


(defn build-cfn-cluster-job-flow-instances-config-property-builder
  "The build-cfn-cluster-job-flow-instances-config-property-builder function updates a CfnCluster$JobFlowInstancesConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$JobFlowInstancesConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalMasterSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-master-security-groups` |
| `additionalSlaveSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-slave-security-groups` |
| `coreInstanceFleet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:core-instance-fleet` |
| `coreInstanceGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:core-instance-group` |
| `ec2KeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-key-name` |
| `ec2SubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-subnet-id` |
| `ec2SubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-subnet-ids` |
| `emrManagedMasterSecurityGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:emr-managed-master-security-group` |
| `emrManagedSlaveSecurityGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:emr-managed-slave-security-group` |
| `hadoopVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:hadoop-version` |
| `keepJobFlowAliveWhenNoSteps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:keep-job-flow-alive-when-no-steps` |
| `masterInstanceFleet` | software.amazon.awscdk.services.emr.CfnCluster$InstanceFleetConfigProperty | [[cdk.support/lookup-entry]] | `:master-instance-fleet` |
| `masterInstanceGroup` | software.amazon.awscdk.services.emr.CfnCluster$InstanceGroupConfigProperty | [[cdk.support/lookup-entry]] | `:master-instance-group` |
| `placement` | software.amazon.awscdk.services.emr.CfnCluster$PlacementTypeProperty | [[cdk.support/lookup-entry]] | `:placement` |
| `serviceAccessSecurityGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-security-group` |
| `taskInstanceFleets` | java.util.List | [[cdk.support/lookup-entry]] | `:task-instance-fleets` |
| `taskInstanceGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:task-instance-groups` |
| `terminationProtected` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:termination-protected` |
| `unhealthyNodeReplacement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unhealthy-node-replacement` |
"
  [^CfnCluster$JobFlowInstancesConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-master-security-groups)]
    (. builder additionalMasterSecurityGroups data))
  (when-let [data (lookup-entry config id :additional-slave-security-groups)]
    (. builder additionalSlaveSecurityGroups data))
  (when-let [data (lookup-entry config id :core-instance-fleet)]
    (. builder coreInstanceFleet data))
  (when-let [data (lookup-entry config id :core-instance-group)]
    (. builder coreInstanceGroup data))
  (when-let [data (lookup-entry config id :ec2-key-name)]
    (. builder ec2KeyName data))
  (when-let [data (lookup-entry config id :ec2-subnet-id)]
    (. builder ec2SubnetId data))
  (when-let [data (lookup-entry config id :ec2-subnet-ids)]
    (. builder ec2SubnetIds data))
  (when-let [data (lookup-entry config id :emr-managed-master-security-group)]
    (. builder emrManagedMasterSecurityGroup data))
  (when-let [data (lookup-entry config id :emr-managed-slave-security-group)]
    (. builder emrManagedSlaveSecurityGroup data))
  (when-let [data (lookup-entry config id :hadoop-version)]
    (. builder hadoopVersion data))
  (when-let [data (lookup-entry config id :keep-job-flow-alive-when-no-steps)]
    (. builder keepJobFlowAliveWhenNoSteps data))
  (when-let [data (lookup-entry config id :master-instance-fleet)]
    (. builder masterInstanceFleet data))
  (when-let [data (lookup-entry config id :master-instance-group)]
    (. builder masterInstanceGroup data))
  (when-let [data (lookup-entry config id :placement)]
    (. builder placement data))
  (when-let [data (lookup-entry config id :service-access-security-group)]
    (. builder serviceAccessSecurityGroup data))
  (when-let [data (lookup-entry config id :task-instance-fleets)]
    (. builder taskInstanceFleets data))
  (when-let [data (lookup-entry config id :task-instance-groups)]
    (. builder taskInstanceGroups data))
  (when-let [data (lookup-entry config id :termination-protected)]
    (. builder terminationProtected data))
  (when-let [data (lookup-entry config id :unhealthy-node-replacement)]
    (. builder unhealthyNodeReplacement data))
  (.build builder))


(defn cfn-cluster-job-flow-instances-config-property-builder
  "Creates a  `CfnCluster$JobFlowInstancesConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-job-flow-instances-config-property-builder (new CfnCluster$JobFlowInstancesConfigProperty$Builder) id config))


(defn build-cfn-cluster-kerberos-attributes-property-builder
  "The build-cfn-cluster-kerberos-attributes-property-builder function updates a CfnCluster$KerberosAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$KerberosAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDomainJoinPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-password` |
| `adDomainJoinUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-user` |
| `crossRealmTrustPrincipalPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-realm-trust-principal-password` |
| `kdcAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:kdc-admin-password` |
| `realm` | java.lang.String | [[cdk.support/lookup-entry]] | `:realm` |
"
  [^CfnCluster$KerberosAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ad-domain-join-password)]
    (. builder adDomainJoinPassword data))
  (when-let [data (lookup-entry config id :ad-domain-join-user)]
    (. builder adDomainJoinUser data))
  (when-let [data (lookup-entry config id :cross-realm-trust-principal-password)]
    (. builder crossRealmTrustPrincipalPassword data))
  (when-let [data (lookup-entry config id :kdc-admin-password)]
    (. builder kdcAdminPassword data))
  (when-let [data (lookup-entry config id :realm)]
    (. builder realm data))
  (.build builder))


(defn cfn-cluster-kerberos-attributes-property-builder
  "Creates a  `CfnCluster$KerberosAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-kerberos-attributes-property-builder (new CfnCluster$KerberosAttributesProperty$Builder) id config))


(defn build-cfn-cluster-key-value-property-builder
  "The build-cfn-cluster-key-value-property-builder function updates a CfnCluster$KeyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$KeyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCluster$KeyValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-cluster-key-value-property-builder
  "Creates a  `CfnCluster$KeyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-key-value-property-builder (new CfnCluster$KeyValueProperty$Builder) id config))


(defn build-cfn-cluster-managed-scaling-policy-property-builder
  "The build-cfn-cluster-managed-scaling-policy-property-builder function updates a CfnCluster$ManagedScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ManagedScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeLimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-limits` |
"
  [^CfnCluster$ManagedScalingPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :compute-limits)]
    (. builder computeLimits data))
  (.build builder))


(defn cfn-cluster-managed-scaling-policy-property-builder
  "Creates a  `CfnCluster$ManagedScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-managed-scaling-policy-property-builder (new CfnCluster$ManagedScalingPolicyProperty$Builder) id config))


(defn build-cfn-cluster-metric-dimension-property-builder
  "The build-cfn-cluster-metric-dimension-property-builder function updates a CfnCluster$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCluster$MetricDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-cluster-metric-dimension-property-builder
  "Creates a  `CfnCluster$MetricDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-metric-dimension-property-builder (new CfnCluster$MetricDimensionProperty$Builder) id config))


(defn build-cfn-cluster-on-demand-provisioning-specification-property-builder
  "The build-cfn-cluster-on-demand-provisioning-specification-property-builder function updates a CfnCluster$OnDemandProvisioningSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$OnDemandProvisioningSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
"
  [^CfnCluster$OnDemandProvisioningSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (.build builder))


(defn cfn-cluster-on-demand-provisioning-specification-property-builder
  "Creates a  `CfnCluster$OnDemandProvisioningSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-on-demand-provisioning-specification-property-builder (new CfnCluster$OnDemandProvisioningSpecificationProperty$Builder) id config))


(defn build-cfn-cluster-placement-group-config-property-builder
  "The build-cfn-cluster-placement-group-config-property-builder function updates a CfnCluster$PlacementGroupConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$PlacementGroupConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role` |
| `placementStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-strategy` |
"
  [^CfnCluster$PlacementGroupConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-let [data (lookup-entry config id :placement-strategy)]
    (. builder placementStrategy data))
  (.build builder))


(defn cfn-cluster-placement-group-config-property-builder
  "Creates a  `CfnCluster$PlacementGroupConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-placement-group-config-property-builder (new CfnCluster$PlacementGroupConfigProperty$Builder) id config))


(defn build-cfn-cluster-placement-type-property-builder
  "The build-cfn-cluster-placement-type-property-builder function updates a CfnCluster$PlacementTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$PlacementTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
"
  [^CfnCluster$PlacementTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (.build builder))


(defn cfn-cluster-placement-type-property-builder
  "Creates a  `CfnCluster$PlacementTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-placement-type-property-builder (new CfnCluster$PlacementTypeProperty$Builder) id config))


(defn build-cfn-cluster-props-builder
  "The build-cfn-cluster-props-builder function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.lang.Object | [[cdk.support/lookup-entry]] | `:additional-info` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `autoScalingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-role` |
| `autoTerminationPolicy` | software.amazon.awscdk.services.emr.CfnCluster$AutoTerminationPolicyProperty | [[cdk.support/lookup-entry]] | `:auto-termination-policy` |
| `bootstrapActions` | java.util.List | [[cdk.support/lookup-entry]] | `:bootstrap-actions` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsRootVolumeIops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-root-volume-iops` |
| `ebsRootVolumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-root-volume-size` |
| `ebsRootVolumeThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-root-volume-throughput` |
| `instances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instances` |
| `jobFlowRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-role` |
| `kerberosAttributes` | software.amazon.awscdk.services.emr.CfnCluster$KerberosAttributesProperty | [[cdk.support/lookup-entry]] | `:kerberos-attributes` |
| `logEncryptionKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-encryption-kms-key-id` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
| `managedScalingPolicy` | software.amazon.awscdk.services.emr.CfnCluster$ManagedScalingPolicyProperty | [[cdk.support/lookup-entry]] | `:managed-scaling-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `osReleaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-release-label` |
| `placementGroupConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-group-configs` |
| `releaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-label` |
| `scaleDownBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:scale-down-behavior` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `stepConcurrencyLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-concurrency-level` |
| `steps` | java.util.List | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-info)]
    (. builder additionalInfo data))
  (when-let [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-let [data (lookup-entry config id :auto-scaling-role)]
    (. builder autoScalingRole data))
  (when-let [data (lookup-entry config id :auto-termination-policy)]
    (. builder autoTerminationPolicy data))
  (when-let [data (lookup-entry config id :bootstrap-actions)]
    (. builder bootstrapActions data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-root-volume-iops)]
    (. builder ebsRootVolumeIops data))
  (when-let [data (lookup-entry config id :ebs-root-volume-size)]
    (. builder ebsRootVolumeSize data))
  (when-let [data (lookup-entry config id :ebs-root-volume-throughput)]
    (. builder ebsRootVolumeThroughput data))
  (when-let [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-let [data (lookup-entry config id :job-flow-role)]
    (. builder jobFlowRole data))
  (when-let [data (lookup-entry config id :kerberos-attributes)]
    (. builder kerberosAttributes data))
  (when-let [data (lookup-entry config id :log-encryption-kms-key-id)]
    (. builder logEncryptionKmsKeyId data))
  (when-let [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (when-let [data (lookup-entry config id :managed-scaling-policy)]
    (. builder managedScalingPolicy data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :os-release-label)]
    (. builder osReleaseLabel data))
  (when-let [data (lookup-entry config id :placement-group-configs)]
    (. builder placementGroupConfigs data))
  (when-let [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-let [data (lookup-entry config id :scale-down-behavior)]
    (. builder scaleDownBehavior data))
  (when-let [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-let [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-let [data (lookup-entry config id :step-concurrency-level)]
    (. builder stepConcurrencyLevel data))
  (when-let [data (lookup-entry config id :steps)]
    (. builder steps data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visible-to-all-users)]
    (. builder visibleToAllUsers data))
  (.build builder))


(defn cfn-cluster-props-builder
  "Creates a  `CfnClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-props-builder (new CfnClusterProps$Builder) id config))


(defn build-cfn-cluster-scaling-action-property-builder
  "The build-cfn-cluster-scaling-action-property-builder function updates a CfnCluster$ScalingActionProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ScalingActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `simpleScalingPolicyConfiguration` | software.amazon.awscdk.services.emr.CfnCluster$SimpleScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:simple-scaling-policy-configuration` |
"
  [^CfnCluster$ScalingActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :market)]
    (. builder market data))
  (when-let [data (lookup-entry config id :simple-scaling-policy-configuration)]
    (. builder simpleScalingPolicyConfiguration data))
  (.build builder))


(defn cfn-cluster-scaling-action-property-builder
  "Creates a  `CfnCluster$ScalingActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-scaling-action-property-builder (new CfnCluster$ScalingActionProperty$Builder) id config))


(defn build-cfn-cluster-scaling-constraints-property-builder
  "The build-cfn-cluster-scaling-constraints-property-builder function updates a CfnCluster$ScalingConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ScalingConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^CfnCluster$ScalingConstraintsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn cfn-cluster-scaling-constraints-property-builder
  "Creates a  `CfnCluster$ScalingConstraintsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-scaling-constraints-property-builder (new CfnCluster$ScalingConstraintsProperty$Builder) id config))


(defn build-cfn-cluster-scaling-rule-property-builder
  "The build-cfn-cluster-scaling-rule-property-builder function updates a CfnCluster$ScalingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ScalingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `trigger` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger` |
"
  [^CfnCluster$ScalingRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :trigger)]
    (. builder trigger data))
  (.build builder))


(defn cfn-cluster-scaling-rule-property-builder
  "Creates a  `CfnCluster$ScalingRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-scaling-rule-property-builder (new CfnCluster$ScalingRuleProperty$Builder) id config))


(defn build-cfn-cluster-scaling-trigger-property-builder
  "The build-cfn-cluster-scaling-trigger-property-builder function updates a CfnCluster$ScalingTriggerProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ScalingTriggerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchAlarmDefinition` | software.amazon.awscdk.services.emr.CfnCluster$CloudWatchAlarmDefinitionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-alarm-definition` |
"
  [^CfnCluster$ScalingTriggerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-alarm-definition)]
    (. builder cloudWatchAlarmDefinition data))
  (.build builder))


(defn cfn-cluster-scaling-trigger-property-builder
  "Creates a  `CfnCluster$ScalingTriggerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-scaling-trigger-property-builder (new CfnCluster$ScalingTriggerProperty$Builder) id config))


(defn build-cfn-cluster-script-bootstrap-action-config-property-builder
  "The build-cfn-cluster-script-bootstrap-action-config-property-builder function updates a CfnCluster$ScriptBootstrapActionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ScriptBootstrapActionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnCluster$ScriptBootstrapActionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :args)]
    (. builder args data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-cluster-script-bootstrap-action-config-property-builder
  "Creates a  `CfnCluster$ScriptBootstrapActionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-script-bootstrap-action-config-property-builder (new CfnCluster$ScriptBootstrapActionConfigProperty$Builder) id config))


(defn build-cfn-cluster-simple-scaling-policy-configuration-property-builder
  "The build-cfn-cluster-simple-scaling-policy-configuration-property-builder function updates a CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `coolDown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cool-down` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
"
  [^CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cool-down)]
    (. builder coolDown data))
  (when-let [data (lookup-entry config id :scaling-adjustment)]
    (. builder scalingAdjustment data))
  (.build builder))


(defn cfn-cluster-simple-scaling-policy-configuration-property-builder
  "Creates a  `CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-simple-scaling-policy-configuration-property-builder (new CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder) id config))


(defn build-cfn-cluster-spot-provisioning-specification-property-builder
  "The build-cfn-cluster-spot-provisioning-specification-property-builder function updates a CfnCluster$SpotProvisioningSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$SpotProvisioningSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `timeoutAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout-action` |
| `timeoutDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-duration-minutes` |
"
  [^CfnCluster$SpotProvisioningSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-let [data (lookup-entry config id :block-duration-minutes)]
    (. builder blockDurationMinutes data))
  (when-let [data (lookup-entry config id :timeout-action)]
    (. builder timeoutAction data))
  (when-let [data (lookup-entry config id :timeout-duration-minutes)]
    (. builder timeoutDurationMinutes data))
  (.build builder))


(defn cfn-cluster-spot-provisioning-specification-property-builder
  "Creates a  `CfnCluster$SpotProvisioningSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-spot-provisioning-specification-property-builder (new CfnCluster$SpotProvisioningSpecificationProperty$Builder) id config))


(defn build-cfn-cluster-step-config-property-builder
  "The build-cfn-cluster-step-config-property-builder function updates a CfnCluster$StepConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$StepConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-failure` |
| `hadoopJarStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hadoop-jar-step` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnCluster$StepConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action-on-failure)]
    (. builder actionOnFailure data))
  (when-let [data (lookup-entry config id :hadoop-jar-step)]
    (. builder hadoopJarStep data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-cluster-step-config-property-builder
  "Creates a  `CfnCluster$StepConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-step-config-property-builder (new CfnCluster$StepConfigProperty$Builder) id config))


(defn build-cfn-cluster-volume-specification-property-builder
  "The build-cfn-cluster-volume-specification-property-builder function updates a CfnCluster$VolumeSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VolumeSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnCluster$VolumeSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-let [data (lookup-entry config id :size-in-gb)]
    (. builder sizeInGb data))
  (when-let [data (lookup-entry config id :throughput)]
    (. builder throughput data))
  (when-let [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-cluster-volume-specification-property-builder
  "Creates a  `CfnCluster$VolumeSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cluster-volume-specification-property-builder (new CfnCluster$VolumeSpecificationProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-builder
  "The build-cfn-instance-fleet-config-builder function updates a CfnInstanceFleetConfig$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `instanceFleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-fleet-type` |
| `instanceTypeConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |
"
  [^CfnInstanceFleetConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-let [data (lookup-entry config id :instance-fleet-type)]
    (. builder instanceFleetType data))
  (when-let [data (lookup-entry config id :instance-type-configs)]
    (. builder instanceTypeConfigs data))
  (when-let [data (lookup-entry config id :launch-specifications)]
    (. builder launchSpecifications data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :target-on-demand-capacity)]
    (. builder targetOnDemandCapacity data))
  (when-let [data (lookup-entry config id :target-spot-capacity)]
    (. builder targetSpotCapacity data))
  (.build builder))


(defn cfn-instance-fleet-config-builder
  "Creates a  `CfnInstanceFleetConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-instance-fleet-config-builder (CfnInstanceFleetConfig$Builder/create scope (name id)) id config))


(defn build-cfn-instance-fleet-config-configuration-property-builder
  "The build-cfn-instance-fleet-config-configuration-property-builder function updates a CfnInstanceFleetConfig$ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
"
  [^CfnInstanceFleetConfig$ConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-let [data (lookup-entry config id :configuration-properties)]
    (. builder configurationProperties data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (.build builder))


(defn cfn-instance-fleet-config-configuration-property-builder
  "Creates a  `CfnInstanceFleetConfig$ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-configuration-property-builder (new CfnInstanceFleetConfig$ConfigurationProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-ebs-block-device-config-property-builder
  "The build-cfn-instance-fleet-config-ebs-block-device-config-property-builder function updates a CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$VolumeSpecificationProperty | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |
"
  [^CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :volume-specification)]
    (. builder volumeSpecification data))
  (when-let [data (lookup-entry config id :volumes-per-instance)]
    (. builder volumesPerInstance data))
  (.build builder))


(defn cfn-instance-fleet-config-ebs-block-device-config-property-builder
  "Creates a  `CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-ebs-block-device-config-property-builder (new CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-ebs-configuration-property-builder
  "The build-cfn-instance-fleet-config-ebs-configuration-property-builder function updates a CfnInstanceFleetConfig$EbsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$EbsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
"
  [^CfnInstanceFleetConfig$EbsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ebs-block-device-configs)]
    (. builder ebsBlockDeviceConfigs data))
  (when-let [data (lookup-entry config id :ebs-optimized)]
    (. builder ebsOptimized data))
  (.build builder))


(defn cfn-instance-fleet-config-ebs-configuration-property-builder
  "Creates a  `CfnInstanceFleetConfig$EbsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-ebs-configuration-property-builder (new CfnInstanceFleetConfig$EbsConfigurationProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-instance-fleet-provisioning-specifications-property-builder
  "The build-cfn-instance-fleet-config-instance-fleet-provisioning-specifications-property-builder function updates a CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-demand-specification` |
| `spotSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spot-specification` |
"
  [^CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :on-demand-specification)]
    (. builder onDemandSpecification data))
  (when-let [data (lookup-entry config id :spot-specification)]
    (. builder spotSpecification data))
  (.build builder))


(defn cfn-instance-fleet-config-instance-fleet-provisioning-specifications-property-builder
  "Creates a  `CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-instance-fleet-provisioning-specifications-property-builder (new CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-instance-type-config-property-builder
  "The build-cfn-instance-fleet-config-instance-type-config-property-builder function updates a CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `bidPriceAsPercentageOfOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-price-as-percentage-of-on-demand-price` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |
"
  [^CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-let [data (lookup-entry config id :bid-price-as-percentage-of-on-demand-price)]
    (. builder bidPriceAsPercentageOfOnDemandPrice data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :weighted-capacity)]
    (. builder weightedCapacity data))
  (.build builder))


(defn cfn-instance-fleet-config-instance-type-config-property-builder
  "Creates a  `CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-instance-type-config-property-builder (new CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-on-demand-provisioning-specification-property-builder
  "The build-cfn-instance-fleet-config-on-demand-provisioning-specification-property-builder function updates a CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
"
  [^CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (.build builder))


(defn cfn-instance-fleet-config-on-demand-provisioning-specification-property-builder
  "Creates a  `CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-on-demand-provisioning-specification-property-builder (new CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-props-builder
  "The build-cfn-instance-fleet-config-props-builder function updates a CfnInstanceFleetConfigProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `instanceFleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-fleet-type` |
| `instanceTypeConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |
"
  [^CfnInstanceFleetConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-let [data (lookup-entry config id :instance-fleet-type)]
    (. builder instanceFleetType data))
  (when-let [data (lookup-entry config id :instance-type-configs)]
    (. builder instanceTypeConfigs data))
  (when-let [data (lookup-entry config id :launch-specifications)]
    (. builder launchSpecifications data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :target-on-demand-capacity)]
    (. builder targetOnDemandCapacity data))
  (when-let [data (lookup-entry config id :target-spot-capacity)]
    (. builder targetSpotCapacity data))
  (.build builder))


(defn cfn-instance-fleet-config-props-builder
  "Creates a  `CfnInstanceFleetConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-props-builder (new CfnInstanceFleetConfigProps$Builder) id config))


(defn build-cfn-instance-fleet-config-spot-provisioning-specification-property-builder
  "The build-cfn-instance-fleet-config-spot-provisioning-specification-property-builder function updates a CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `timeoutAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout-action` |
| `timeoutDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-duration-minutes` |
"
  [^CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-let [data (lookup-entry config id :block-duration-minutes)]
    (. builder blockDurationMinutes data))
  (when-let [data (lookup-entry config id :timeout-action)]
    (. builder timeoutAction data))
  (when-let [data (lookup-entry config id :timeout-duration-minutes)]
    (. builder timeoutDurationMinutes data))
  (.build builder))


(defn cfn-instance-fleet-config-spot-provisioning-specification-property-builder
  "Creates a  `CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-spot-provisioning-specification-property-builder (new CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder) id config))


(defn build-cfn-instance-fleet-config-volume-specification-property-builder
  "The build-cfn-instance-fleet-config-volume-specification-property-builder function updates a CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-let [data (lookup-entry config id :size-in-gb)]
    (. builder sizeInGb data))
  (when-let [data (lookup-entry config id :throughput)]
    (. builder throughput data))
  (when-let [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-instance-fleet-config-volume-specification-property-builder
  "Creates a  `CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-fleet-config-volume-specification-property-builder (new CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder) id config))


(defn build-cfn-instance-group-config-auto-scaling-policy-property-builder
  "The build-cfn-instance-group-config-auto-scaling-policy-property-builder function updates a CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$ScalingConstraintsProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-instance-group-config-auto-scaling-policy-property-builder
  "Creates a  `CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-auto-scaling-policy-property-builder (new CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder) id config))


(defn build-cfn-instance-group-config-builder
  "The build-cfn-instance-group-config-builder function updates a CfnInstanceGroupConfig$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-policy` |
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `jobFlowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-id` |
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnInstanceGroupConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-policy)]
    (. builder autoScalingPolicy data))
  (when-let [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :job-flow-id)]
    (. builder jobFlowId data))
  (when-let [data (lookup-entry config id :market)]
    (. builder market data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-instance-group-config-builder
  "Creates a  `CfnInstanceGroupConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-instance-group-config-builder (CfnInstanceGroupConfig$Builder/create scope (name id)) id config))


(defn build-cfn-instance-group-config-cloud-watch-alarm-definition-property-builder
  "The build-cfn-instance-group-config-cloud-watch-alarm-definition-property-builder function updates a CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :period)]
    (. builder period data))
  (when-let [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-let [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-instance-group-config-cloud-watch-alarm-definition-property-builder
  "Creates a  `CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-cloud-watch-alarm-definition-property-builder (new CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder) id config))


(defn build-cfn-instance-group-config-configuration-property-builder
  "The build-cfn-instance-group-config-configuration-property-builder function updates a CfnInstanceGroupConfig$ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
"
  [^CfnInstanceGroupConfig$ConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-let [data (lookup-entry config id :configuration-properties)]
    (. builder configurationProperties data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (.build builder))


(defn cfn-instance-group-config-configuration-property-builder
  "Creates a  `CfnInstanceGroupConfig$ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-configuration-property-builder (new CfnInstanceGroupConfig$ConfigurationProperty$Builder) id config))


(defn build-cfn-instance-group-config-ebs-block-device-config-property-builder
  "The build-cfn-instance-group-config-ebs-block-device-config-property-builder function updates a CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |
"
  [^CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :volume-specification)]
    (. builder volumeSpecification data))
  (when-let [data (lookup-entry config id :volumes-per-instance)]
    (. builder volumesPerInstance data))
  (.build builder))


(defn cfn-instance-group-config-ebs-block-device-config-property-builder
  "Creates a  `CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-ebs-block-device-config-property-builder (new CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder) id config))


(defn build-cfn-instance-group-config-ebs-configuration-property-builder
  "The build-cfn-instance-group-config-ebs-configuration-property-builder function updates a CfnInstanceGroupConfig$EbsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$EbsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
"
  [^CfnInstanceGroupConfig$EbsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ebs-block-device-configs)]
    (. builder ebsBlockDeviceConfigs data))
  (when-let [data (lookup-entry config id :ebs-optimized)]
    (. builder ebsOptimized data))
  (.build builder))


(defn cfn-instance-group-config-ebs-configuration-property-builder
  "Creates a  `CfnInstanceGroupConfig$EbsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-ebs-configuration-property-builder (new CfnInstanceGroupConfig$EbsConfigurationProperty$Builder) id config))


(defn build-cfn-instance-group-config-metric-dimension-property-builder
  "The build-cfn-instance-group-config-metric-dimension-property-builder function updates a CfnInstanceGroupConfig$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInstanceGroupConfig$MetricDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-instance-group-config-metric-dimension-property-builder
  "Creates a  `CfnInstanceGroupConfig$MetricDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-metric-dimension-property-builder (new CfnInstanceGroupConfig$MetricDimensionProperty$Builder) id config))


(defn build-cfn-instance-group-config-props-builder
  "The build-cfn-instance-group-config-props-builder function updates a CfnInstanceGroupConfigProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-policy` |
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `jobFlowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-id` |
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnInstanceGroupConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-policy)]
    (. builder autoScalingPolicy data))
  (when-let [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-let [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :job-flow-id)]
    (. builder jobFlowId data))
  (when-let [data (lookup-entry config id :market)]
    (. builder market data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-instance-group-config-props-builder
  "Creates a  `CfnInstanceGroupConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-props-builder (new CfnInstanceGroupConfigProps$Builder) id config))


(defn build-cfn-instance-group-config-scaling-action-property-builder
  "The build-cfn-instance-group-config-scaling-action-property-builder function updates a CfnInstanceGroupConfig$ScalingActionProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$ScalingActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `simpleScalingPolicyConfiguration` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:simple-scaling-policy-configuration` |
"
  [^CfnInstanceGroupConfig$ScalingActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :market)]
    (. builder market data))
  (when-let [data (lookup-entry config id :simple-scaling-policy-configuration)]
    (. builder simpleScalingPolicyConfiguration data))
  (.build builder))


(defn cfn-instance-group-config-scaling-action-property-builder
  "Creates a  `CfnInstanceGroupConfig$ScalingActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-scaling-action-property-builder (new CfnInstanceGroupConfig$ScalingActionProperty$Builder) id config))


(defn build-cfn-instance-group-config-scaling-constraints-property-builder
  "The build-cfn-instance-group-config-scaling-constraints-property-builder function updates a CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-let [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn cfn-instance-group-config-scaling-constraints-property-builder
  "Creates a  `CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-scaling-constraints-property-builder (new CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder) id config))


(defn build-cfn-instance-group-config-scaling-rule-property-builder
  "The build-cfn-instance-group-config-scaling-rule-property-builder function updates a CfnInstanceGroupConfig$ScalingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$ScalingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `trigger` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$ScalingTriggerProperty | [[cdk.support/lookup-entry]] | `:trigger` |
"
  [^CfnInstanceGroupConfig$ScalingRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :trigger)]
    (. builder trigger data))
  (.build builder))


(defn cfn-instance-group-config-scaling-rule-property-builder
  "Creates a  `CfnInstanceGroupConfig$ScalingRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-scaling-rule-property-builder (new CfnInstanceGroupConfig$ScalingRuleProperty$Builder) id config))


(defn build-cfn-instance-group-config-scaling-trigger-property-builder
  "The build-cfn-instance-group-config-scaling-trigger-property-builder function updates a CfnInstanceGroupConfig$ScalingTriggerProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$ScalingTriggerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchAlarmDefinition` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-alarm-definition` |
"
  [^CfnInstanceGroupConfig$ScalingTriggerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-alarm-definition)]
    (. builder cloudWatchAlarmDefinition data))
  (.build builder))


(defn cfn-instance-group-config-scaling-trigger-property-builder
  "Creates a  `CfnInstanceGroupConfig$ScalingTriggerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-scaling-trigger-property-builder (new CfnInstanceGroupConfig$ScalingTriggerProperty$Builder) id config))


(defn build-cfn-instance-group-config-simple-scaling-policy-configuration-property-builder
  "The build-cfn-instance-group-config-simple-scaling-policy-configuration-property-builder function updates a CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `coolDown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cool-down` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
"
  [^CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-let [data (lookup-entry config id :cool-down)]
    (. builder coolDown data))
  (when-let [data (lookup-entry config id :scaling-adjustment)]
    (. builder scalingAdjustment data))
  (.build builder))


(defn cfn-instance-group-config-simple-scaling-policy-configuration-property-builder
  "Creates a  `CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-simple-scaling-policy-configuration-property-builder (new CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder) id config))


(defn build-cfn-instance-group-config-volume-specification-property-builder
  "The build-cfn-instance-group-config-volume-specification-property-builder function updates a CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-let [data (lookup-entry config id :size-in-gb)]
    (. builder sizeInGb data))
  (when-let [data (lookup-entry config id :throughput)]
    (. builder throughput data))
  (when-let [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-instance-group-config-volume-specification-property-builder
  "Creates a  `CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-group-config-volume-specification-property-builder (new CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder) id config))


(defn build-cfn-security-configuration-builder
  "The build-cfn-security-configuration-builder function updates a CfnSecurityConfiguration$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:security-configuration` |
"
  [^CfnSecurityConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (.build builder))


(defn cfn-security-configuration-builder
  "Creates a  `CfnSecurityConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-security-configuration-builder (CfnSecurityConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-security-configuration-props-builder
  "The build-cfn-security-configuration-props-builder function updates a CfnSecurityConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:security-configuration` |
"
  [^CfnSecurityConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (.build builder))


(defn cfn-security-configuration-props-builder
  "Creates a  `CfnSecurityConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-security-configuration-props-builder (new CfnSecurityConfigurationProps$Builder) id config))


(defn build-cfn-step-builder
  "The build-cfn-step-builder function updates a CfnStep$Builder instance using the provided configuration.
  The function takes the CfnStep$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-failure` |
| `hadoopJarStep` | software.amazon.awscdk.services.emr.CfnStep$HadoopJarStepConfigProperty | [[cdk.support/lookup-entry]] | `:hadoop-jar-step` |
| `jobFlowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnStep$Builder builder id config]
  (when-let [data (lookup-entry config id :action-on-failure)]
    (. builder actionOnFailure data))
  (when-let [data (lookup-entry config id :hadoop-jar-step)]
    (. builder hadoopJarStep data))
  (when-let [data (lookup-entry config id :job-flow-id)]
    (. builder jobFlowId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-step-builder
  "Creates a  `CfnStep$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-step-builder (CfnStep$Builder/create scope (name id)) id config))


(defn build-cfn-step-hadoop-jar-step-config-property-builder
  "The build-cfn-step-hadoop-jar-step-config-property-builder function updates a CfnStep$HadoopJarStepConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnStep$HadoopJarStepConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `jar` | java.lang.String | [[cdk.support/lookup-entry]] | `:jar` |
| `mainClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:main-class` |
| `stepProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:step-properties` |
"
  [^CfnStep$HadoopJarStepConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :args)]
    (. builder args data))
  (when-let [data (lookup-entry config id :jar)]
    (. builder jar data))
  (when-let [data (lookup-entry config id :main-class)]
    (. builder mainClass data))
  (when-let [data (lookup-entry config id :step-properties)]
    (. builder stepProperties data))
  (.build builder))


(defn cfn-step-hadoop-jar-step-config-property-builder
  "Creates a  `CfnStep$HadoopJarStepConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-step-hadoop-jar-step-config-property-builder (new CfnStep$HadoopJarStepConfigProperty$Builder) id config))


(defn build-cfn-step-key-value-property-builder
  "The build-cfn-step-key-value-property-builder function updates a CfnStep$KeyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnStep$KeyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnStep$KeyValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-step-key-value-property-builder
  "Creates a  `CfnStep$KeyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-step-key-value-property-builder (new CfnStep$KeyValueProperty$Builder) id config))


(defn build-cfn-step-props-builder
  "The build-cfn-step-props-builder function updates a CfnStepProps$Builder instance using the provided configuration.
  The function takes the CfnStepProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-failure` |
| `hadoopJarStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hadoop-jar-step` |
| `jobFlowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnStepProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action-on-failure)]
    (. builder actionOnFailure data))
  (when-let [data (lookup-entry config id :hadoop-jar-step)]
    (. builder hadoopJarStep data))
  (when-let [data (lookup-entry config id :job-flow-id)]
    (. builder jobFlowId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-step-props-builder
  "Creates a  `CfnStepProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-step-props-builder (new CfnStepProps$Builder) id config))


(defn build-cfn-studio-builder
  "The build-cfn-studio-builder function updates a CfnStudio$Builder instance using the provided configuration.
  The function takes the CfnStudio$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-mode` |
| `defaultS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-s3-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `engineSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-security-group-id` |
| `idcInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:idc-instance-arn` |
| `idcUserAssignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:idc-user-assignment` |
| `idpAuthUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-auth-url` |
| `idpRelayStateParameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-relay-state-parameter-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustedIdentityPropagationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trusted-identity-propagation-enabled` |
| `userRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `workspaceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-security-group-id` |
"
  [^CfnStudio$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-mode)]
    (. builder authMode data))
  (when-let [data (lookup-entry config id :default-s3-location)]
    (. builder defaultS3Location data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-let [data (lookup-entry config id :engine-security-group-id)]
    (. builder engineSecurityGroupId data))
  (when-let [data (lookup-entry config id :idc-instance-arn)]
    (. builder idcInstanceArn data))
  (when-let [data (lookup-entry config id :idc-user-assignment)]
    (. builder idcUserAssignment data))
  (when-let [data (lookup-entry config id :idp-auth-url)]
    (. builder idpAuthUrl data))
  (when-let [data (lookup-entry config id :idp-relay-state-parameter-name)]
    (. builder idpRelayStateParameterName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :trusted-identity-propagation-enabled)]
    (. builder trustedIdentityPropagationEnabled data))
  (when-let [data (lookup-entry config id :user-role)]
    (. builder userRole data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (when-let [data (lookup-entry config id :workspace-security-group-id)]
    (. builder workspaceSecurityGroupId data))
  (.build builder))


(defn cfn-studio-builder
  "Creates a  `CfnStudio$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-studio-builder (CfnStudio$Builder/create scope (name id)) id config))


(defn build-cfn-studio-props-builder
  "The build-cfn-studio-props-builder function updates a CfnStudioProps$Builder instance using the provided configuration.
  The function takes the CfnStudioProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-mode` |
| `defaultS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-s3-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `engineSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-security-group-id` |
| `idcInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:idc-instance-arn` |
| `idcUserAssignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:idc-user-assignment` |
| `idpAuthUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-auth-url` |
| `idpRelayStateParameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-relay-state-parameter-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustedIdentityPropagationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trusted-identity-propagation-enabled` |
| `userRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `workspaceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-security-group-id` |
"
  [^CfnStudioProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-mode)]
    (. builder authMode data))
  (when-let [data (lookup-entry config id :default-s3-location)]
    (. builder defaultS3Location data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-let [data (lookup-entry config id :engine-security-group-id)]
    (. builder engineSecurityGroupId data))
  (when-let [data (lookup-entry config id :idc-instance-arn)]
    (. builder idcInstanceArn data))
  (when-let [data (lookup-entry config id :idc-user-assignment)]
    (. builder idcUserAssignment data))
  (when-let [data (lookup-entry config id :idp-auth-url)]
    (. builder idpAuthUrl data))
  (when-let [data (lookup-entry config id :idp-relay-state-parameter-name)]
    (. builder idpRelayStateParameterName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :trusted-identity-propagation-enabled)]
    (. builder trustedIdentityPropagationEnabled data))
  (when-let [data (lookup-entry config id :user-role)]
    (. builder userRole data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (when-let [data (lookup-entry config id :workspace-security-group-id)]
    (. builder workspaceSecurityGroupId data))
  (.build builder))


(defn cfn-studio-props-builder
  "Creates a  `CfnStudioProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-studio-props-builder (new CfnStudioProps$Builder) id config))


(defn build-cfn-studio-session-mapping-builder
  "The build-cfn-studio-session-mapping-builder function updates a CfnStudioSessionMapping$Builder instance using the provided configuration.
  The function takes the CfnStudioSessionMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-name` |
| `identityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-type` |
| `sessionPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy-arn` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
"
  [^CfnStudioSessionMapping$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-name)]
    (. builder identityName data))
  (when-let [data (lookup-entry config id :identity-type)]
    (. builder identityType data))
  (when-let [data (lookup-entry config id :session-policy-arn)]
    (. builder sessionPolicyArn data))
  (when-let [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (.build builder))


(defn cfn-studio-session-mapping-builder
  "Creates a  `CfnStudioSessionMapping$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-studio-session-mapping-builder (CfnStudioSessionMapping$Builder/create scope (name id)) id config))


(defn build-cfn-studio-session-mapping-props-builder
  "The build-cfn-studio-session-mapping-props-builder function updates a CfnStudioSessionMappingProps$Builder instance using the provided configuration.
  The function takes the CfnStudioSessionMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-name` |
| `identityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-type` |
| `sessionPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy-arn` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
"
  [^CfnStudioSessionMappingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-name)]
    (. builder identityName data))
  (when-let [data (lookup-entry config id :identity-type)]
    (. builder identityType data))
  (when-let [data (lookup-entry config id :session-policy-arn)]
    (. builder sessionPolicyArn data))
  (when-let [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (.build builder))


(defn cfn-studio-session-mapping-props-builder
  "Creates a  `CfnStudioSessionMappingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-studio-session-mapping-props-builder (new CfnStudioSessionMappingProps$Builder) id config))


(defn build-cfn-wal-workspace-builder
  "The build-cfn-wal-workspace-builder function updates a CfnWALWorkspace$Builder instance using the provided configuration.
  The function takes the CfnWALWorkspace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `walWorkspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:wal-workspace-name` |
"
  [^CfnWALWorkspace$Builder builder id config]
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :wal-workspace-name)]
    (. builder walWorkspaceName data))
  (.build builder))


(defn cfn-wal-workspace-builder
  "Creates a  `CfnWALWorkspace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-wal-workspace-builder (CfnWALWorkspace$Builder/create scope (name id)) id config))


(defn build-cfn-wal-workspace-props-builder
  "The build-cfn-wal-workspace-props-builder function updates a CfnWALWorkspaceProps$Builder instance using the provided configuration.
  The function takes the CfnWALWorkspaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `walWorkspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:wal-workspace-name` |
"
  [^CfnWALWorkspaceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :wal-workspace-name)]
    (. builder walWorkspaceName data))
  (.build builder))


(defn cfn-wal-workspace-props-builder
  "Creates a  `CfnWALWorkspaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-wal-workspace-props-builder (new CfnWALWorkspaceProps$Builder) id config))