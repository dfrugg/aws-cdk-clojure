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


(defn cfn-cluster-application-property-builder
  "The cfn-cluster-application-property-builder function buildes out new instances of 
CfnCluster$ApplicationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-info` |
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnCluster$ApplicationProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-info)]
      (. builder additionalInfo data))
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-cluster-auto-scaling-policy-property-builder
  "The cfn-cluster-auto-scaling-policy-property-builder function buildes out new instances of 
CfnCluster$AutoScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnCluster$AutoScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-cluster-auto-termination-policy-property-builder
  "The cfn-cluster-auto-termination-policy-property-builder function buildes out new instances of 
CfnCluster$AutoTerminationPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout` |"
  [stack id config]
  (let [builder (CfnCluster$AutoTerminationPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (.build builder)))


(defn cfn-cluster-bootstrap-action-config-property-builder
  "The cfn-cluster-bootstrap-action-config-property-builder function buildes out new instances of 
CfnCluster$BootstrapActionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scriptBootstrapAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:script-bootstrap-action` |"
  [stack id config]
  (let [builder (CfnCluster$BootstrapActionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :script-bootstrap-action)]
      (. builder scriptBootstrapAction data))
    (.build builder)))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-cluster-cloud-watch-alarm-definition-property-builder
  "The cfn-cluster-cloud-watch-alarm-definition-property-builder function buildes out new instances of 
CfnCluster$CloudWatchAlarmDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnCluster$CloudWatchAlarmDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-compute-limits-property-builder
  "The cfn-cluster-compute-limits-property-builder function buildes out new instances of 
CfnCluster$ComputeLimitsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-capacity-units` |
| `maximumCoreCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-core-capacity-units` |
| `maximumOnDemandCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-on-demand-capacity-units` |
| `minimumCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-capacity-units` |
| `unitType` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-type` |"
  [stack id config]
  (let [builder (CfnCluster$ComputeLimitsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-configuration-property-builder
  "The cfn-cluster-configuration-property-builder function buildes out new instances of 
CfnCluster$ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurationProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |"
  [stack id config]
  (let [builder (CfnCluster$ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :configuration-properties)]
      (. builder configurationProperties data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (.build builder)))


(defn cfn-cluster-ebs-block-device-config-property-builder
  "The cfn-cluster-ebs-block-device-config-property-builder function buildes out new instances of 
CfnCluster$EbsBlockDeviceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |"
  [stack id config]
  (let [builder (CfnCluster$EbsBlockDeviceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :volume-specification)]
      (. builder volumeSpecification data))
    (when-let [data (lookup-entry config id :volumes-per-instance)]
      (. builder volumesPerInstance data))
    (.build builder)))


(defn cfn-cluster-ebs-configuration-property-builder
  "The cfn-cluster-ebs-configuration-property-builder function buildes out new instances of 
CfnCluster$EbsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |"
  [stack id config]
  (let [builder (CfnCluster$EbsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-block-device-configs)]
      (. builder ebsBlockDeviceConfigs data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (.build builder)))


(defn cfn-cluster-hadoop-jar-step-config-property-builder
  "The cfn-cluster-hadoop-jar-step-config-property-builder function buildes out new instances of 
CfnCluster$HadoopJarStepConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `jar` | java.lang.String | [[cdk.support/lookup-entry]] | `:jar` |
| `mainClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:main-class` |
| `stepProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:step-properties` |"
  [stack id config]
  (let [builder (CfnCluster$HadoopJarStepConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :jar)]
      (. builder jar data))
    (when-let [data (lookup-entry config id :main-class)]
      (. builder mainClass data))
    (when-let [data (lookup-entry config id :step-properties)]
      (. builder stepProperties data))
    (.build builder)))


(defn cfn-cluster-instance-fleet-config-property-builder
  "The cfn-cluster-instance-fleet-config-property-builder function buildes out new instances of 
CfnCluster$InstanceFleetConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceTypeConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |"
  [stack id config]
  (let [builder (CfnCluster$InstanceFleetConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-instance-fleet-provisioning-specifications-property-builder
  "The cfn-cluster-instance-fleet-provisioning-specifications-property-builder function buildes out new instances of 
CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandSpecification` | software.amazon.awscdk.services.emr.CfnCluster$OnDemandProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:on-demand-specification` |
| `spotSpecification` | software.amazon.awscdk.services.emr.CfnCluster$SpotProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:spot-specification` |"
  [stack id config]
  (let [builder (CfnCluster$InstanceFleetProvisioningSpecificationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-demand-specification)]
      (. builder onDemandSpecification data))
    (when-let [data (lookup-entry config id :spot-specification)]
      (. builder spotSpecification data))
    (.build builder)))


(defn cfn-cluster-instance-group-config-property-builder
  "The cfn-cluster-instance-group-config-property-builder function buildes out new instances of 
CfnCluster$InstanceGroupConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnCluster$InstanceGroupConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-instance-type-config-property-builder
  "The cfn-cluster-instance-type-config-property-builder function buildes out new instances of 
CfnCluster$InstanceTypeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `bidPriceAsPercentageOfOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-price-as-percentage-of-on-demand-price` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.services.emr.CfnCluster$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnCluster$InstanceTypeConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-job-flow-instances-config-property-builder
  "The cfn-cluster-job-flow-instances-config-property-builder function buildes out new instances of 
CfnCluster$JobFlowInstancesConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unhealthyNodeReplacement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unhealthy-node-replacement` |"
  [stack id config]
  (let [builder (CfnCluster$JobFlowInstancesConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-kerberos-attributes-property-builder
  "The cfn-cluster-kerberos-attributes-property-builder function buildes out new instances of 
CfnCluster$KerberosAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDomainJoinPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-password` |
| `adDomainJoinUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-user` |
| `crossRealmTrustPrincipalPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-realm-trust-principal-password` |
| `kdcAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:kdc-admin-password` |
| `realm` | java.lang.String | [[cdk.support/lookup-entry]] | `:realm` |"
  [stack id config]
  (let [builder (CfnCluster$KerberosAttributesProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-key-value-property-builder
  "The cfn-cluster-key-value-property-builder function buildes out new instances of 
CfnCluster$KeyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCluster$KeyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-cluster-managed-scaling-policy-property-builder
  "The cfn-cluster-managed-scaling-policy-property-builder function buildes out new instances of 
CfnCluster$ManagedScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeLimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-limits` |"
  [stack id config]
  (let [builder (CfnCluster$ManagedScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-limits)]
      (. builder computeLimits data))
    (.build builder)))


(defn cfn-cluster-metric-dimension-property-builder
  "The cfn-cluster-metric-dimension-property-builder function buildes out new instances of 
CfnCluster$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCluster$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-cluster-on-demand-provisioning-specification-property-builder
  "The cfn-cluster-on-demand-provisioning-specification-property-builder function buildes out new instances of 
CfnCluster$OnDemandProvisioningSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |"
  [stack id config]
  (let [builder (CfnCluster$OnDemandProvisioningSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (.build builder)))


(defn cfn-cluster-placement-group-config-property-builder
  "The cfn-cluster-placement-group-config-property-builder function buildes out new instances of 
CfnCluster$PlacementGroupConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role` |
| `placementStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-strategy` |"
  [stack id config]
  (let [builder (CfnCluster$PlacementGroupConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :placement-strategy)]
      (. builder placementStrategy data))
    (.build builder)))


(defn cfn-cluster-placement-type-property-builder
  "The cfn-cluster-placement-type-property-builder function buildes out new instances of 
CfnCluster$PlacementTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |"
  [stack id config]
  (let [builder (CfnCluster$PlacementTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-scaling-action-property-builder
  "The cfn-cluster-scaling-action-property-builder function buildes out new instances of 
CfnCluster$ScalingActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `simpleScalingPolicyConfiguration` | software.amazon.awscdk.services.emr.CfnCluster$SimpleScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:simple-scaling-policy-configuration` |"
  [stack id config]
  (let [builder (CfnCluster$ScalingActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :market)]
      (. builder market data))
    (when-let [data (lookup-entry config id :simple-scaling-policy-configuration)]
      (. builder simpleScalingPolicyConfiguration data))
    (.build builder)))


(defn cfn-cluster-scaling-constraints-property-builder
  "The cfn-cluster-scaling-constraints-property-builder function buildes out new instances of 
CfnCluster$ScalingConstraintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (CfnCluster$ScalingConstraintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn cfn-cluster-scaling-rule-property-builder
  "The cfn-cluster-scaling-rule-property-builder function buildes out new instances of 
CfnCluster$ScalingRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `trigger` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger` |"
  [stack id config]
  (let [builder (CfnCluster$ScalingRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :trigger)]
      (. builder trigger data))
    (.build builder)))


(defn cfn-cluster-scaling-trigger-property-builder
  "The cfn-cluster-scaling-trigger-property-builder function buildes out new instances of 
CfnCluster$ScalingTriggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchAlarmDefinition` | software.amazon.awscdk.services.emr.CfnCluster$CloudWatchAlarmDefinitionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-alarm-definition` |"
  [stack id config]
  (let [builder (CfnCluster$ScalingTriggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-alarm-definition)]
      (. builder cloudWatchAlarmDefinition data))
    (.build builder)))


(defn cfn-cluster-script-bootstrap-action-config-property-builder
  "The cfn-cluster-script-bootstrap-action-config-property-builder function buildes out new instances of 
CfnCluster$ScriptBootstrapActionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnCluster$ScriptBootstrapActionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-cluster-simple-scaling-policy-configuration-property-builder
  "The cfn-cluster-simple-scaling-policy-configuration-property-builder function buildes out new instances of 
CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `coolDown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cool-down` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |"
  [stack id config]
  (let [builder (CfnCluster$SimpleScalingPolicyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :cool-down)]
      (. builder coolDown data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (.build builder)))


(defn cfn-cluster-spot-provisioning-specification-property-builder
  "The cfn-cluster-spot-provisioning-specification-property-builder function buildes out new instances of 
CfnCluster$SpotProvisioningSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `timeoutAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout-action` |
| `timeoutDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-duration-minutes` |"
  [stack id config]
  (let [builder (CfnCluster$SpotProvisioningSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :block-duration-minutes)]
      (. builder blockDurationMinutes data))
    (when-let [data (lookup-entry config id :timeout-action)]
      (. builder timeoutAction data))
    (when-let [data (lookup-entry config id :timeout-duration-minutes)]
      (. builder timeoutDurationMinutes data))
    (.build builder)))


(defn cfn-cluster-step-config-property-builder
  "The cfn-cluster-step-config-property-builder function buildes out new instances of 
CfnCluster$StepConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-failure` |
| `hadoopJarStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hadoop-jar-step` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnCluster$StepConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-on-failure)]
      (. builder actionOnFailure data))
    (when-let [data (lookup-entry config id :hadoop-jar-step)]
      (. builder hadoopJarStep data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-cluster-volume-specification-property-builder
  "The cfn-cluster-volume-specification-property-builder function buildes out new instances of 
CfnCluster$VolumeSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnCluster$VolumeSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :size-in-gb)]
      (. builder sizeInGb data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-instance-fleet-config-builder
  "The cfn-instance-fleet-config-builder function buildes out new instances of 
CfnInstanceFleetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `instanceFleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-fleet-type` |
| `instanceTypeConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-instance-fleet-config-configuration-property-builder
  "The cfn-instance-fleet-config-configuration-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :configuration-properties)]
      (. builder configurationProperties data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (.build builder)))


(defn cfn-instance-fleet-config-ebs-block-device-config-property-builder
  "The cfn-instance-fleet-config-ebs-block-device-config-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$VolumeSpecificationProperty | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$EbsBlockDeviceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :volume-specification)]
      (. builder volumeSpecification data))
    (when-let [data (lookup-entry config id :volumes-per-instance)]
      (. builder volumesPerInstance data))
    (.build builder)))


(defn cfn-instance-fleet-config-ebs-configuration-property-builder
  "The cfn-instance-fleet-config-ebs-configuration-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$EbsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$EbsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-block-device-configs)]
      (. builder ebsBlockDeviceConfigs data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (.build builder)))


(defn cfn-instance-fleet-config-instance-fleet-provisioning-specifications-property-builder
  "The cfn-instance-fleet-config-instance-fleet-provisioning-specifications-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-demand-specification` |
| `spotSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spot-specification` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-demand-specification)]
      (. builder onDemandSpecification data))
    (when-let [data (lookup-entry config id :spot-specification)]
      (. builder spotSpecification data))
    (.build builder)))


(defn cfn-instance-fleet-config-instance-type-config-property-builder
  "The cfn-instance-fleet-config-instance-type-config-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `bidPriceAsPercentageOfOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-price-as-percentage-of-on-demand-price` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsConfiguration` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$InstanceTypeConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-instance-fleet-config-on-demand-provisioning-specification-property-builder
  "The cfn-instance-fleet-config-on-demand-provisioning-specification-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$OnDemandProvisioningSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (.build builder)))


(defn cfn-instance-fleet-config-props-builder
  "The cfn-instance-fleet-config-props-builder function buildes out new instances of 
CfnInstanceFleetConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `instanceFleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-fleet-type` |
| `instanceTypeConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.services.emr.CfnInstanceFleetConfig$InstanceFleetProvisioningSpecificationsProperty | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfigProps$Builder.)]
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
    (.build builder)))


(defn cfn-instance-fleet-config-spot-provisioning-specification-property-builder
  "The cfn-instance-fleet-config-spot-provisioning-specification-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `timeoutAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout-action` |
| `timeoutDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-duration-minutes` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$SpotProvisioningSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :block-duration-minutes)]
      (. builder blockDurationMinutes data))
    (when-let [data (lookup-entry config id :timeout-action)]
      (. builder timeoutAction data))
    (when-let [data (lookup-entry config id :timeout-duration-minutes)]
      (. builder timeoutDurationMinutes data))
    (.build builder)))


(defn cfn-instance-fleet-config-volume-specification-property-builder
  "The cfn-instance-fleet-config-volume-specification-property-builder function buildes out new instances of 
CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnInstanceFleetConfig$VolumeSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :size-in-gb)]
      (. builder sizeInGb data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-instance-group-config-auto-scaling-policy-property-builder
  "The cfn-instance-group-config-auto-scaling-policy-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$ScalingConstraintsProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$AutoScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-instance-group-config-builder
  "The cfn-instance-group-config-builder function buildes out new instances of 
CfnInstanceGroupConfig$Builder using the provided configuration.  Each field is set as follows:

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
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-instance-group-config-cloud-watch-alarm-definition-property-builder
  "The cfn-instance-group-config-cloud-watch-alarm-definition-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-instance-group-config-configuration-property-builder
  "The cfn-instance-group-config-configuration-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-properties` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :configuration-properties)]
      (. builder configurationProperties data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (.build builder)))


(defn cfn-instance-group-config-ebs-block-device-config-property-builder
  "The cfn-instance-group-config-ebs-block-device-config-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$EbsBlockDeviceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :volume-specification)]
      (. builder volumeSpecification data))
    (when-let [data (lookup-entry config id :volumes-per-instance)]
      (. builder volumesPerInstance data))
    (.build builder)))


(defn cfn-instance-group-config-ebs-configuration-property-builder
  "The cfn-instance-group-config-ebs-configuration-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$EbsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-optimized` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$EbsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-block-device-configs)]
      (. builder ebsBlockDeviceConfigs data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (.build builder)))


(defn cfn-instance-group-config-metric-dimension-property-builder
  "The cfn-instance-group-config-metric-dimension-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-instance-group-config-props-builder
  "The cfn-instance-group-config-props-builder function buildes out new instances of 
CfnInstanceGroupConfigProps$Builder using the provided configuration.  Each field is set as follows:

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
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfigProps$Builder.)]
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
    (.build builder)))


(defn cfn-instance-group-config-scaling-action-property-builder
  "The cfn-instance-group-config-scaling-action-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$ScalingActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `market` | java.lang.String | [[cdk.support/lookup-entry]] | `:market` |
| `simpleScalingPolicyConfiguration` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:simple-scaling-policy-configuration` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$ScalingActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :market)]
      (. builder market data))
    (when-let [data (lookup-entry config id :simple-scaling-policy-configuration)]
      (. builder simpleScalingPolicyConfiguration data))
    (.build builder)))


(defn cfn-instance-group-config-scaling-constraints-property-builder
  "The cfn-instance-group-config-scaling-constraints-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$ScalingConstraintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn cfn-instance-group-config-scaling-rule-property-builder
  "The cfn-instance-group-config-scaling-rule-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$ScalingRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `trigger` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$ScalingTriggerProperty | [[cdk.support/lookup-entry]] | `:trigger` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$ScalingRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :trigger)]
      (. builder trigger data))
    (.build builder)))


(defn cfn-instance-group-config-scaling-trigger-property-builder
  "The cfn-instance-group-config-scaling-trigger-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$ScalingTriggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchAlarmDefinition` | software.amazon.awscdk.services.emr.CfnInstanceGroupConfig$CloudWatchAlarmDefinitionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-alarm-definition` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$ScalingTriggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-alarm-definition)]
      (. builder cloudWatchAlarmDefinition data))
    (.build builder)))


(defn cfn-instance-group-config-simple-scaling-policy-configuration-property-builder
  "The cfn-instance-group-config-simple-scaling-policy-configuration-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:adjustment-type` |
| `coolDown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cool-down` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$SimpleScalingPolicyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :cool-down)]
      (. builder coolDown data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (.build builder)))


(defn cfn-instance-group-config-volume-specification-property-builder
  "The cfn-instance-group-config-volume-specification-property-builder function buildes out new instances of 
CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnInstanceGroupConfig$VolumeSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :size-in-gb)]
      (. builder sizeInGb data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-security-configuration-builder
  "The cfn-security-configuration-builder function buildes out new instances of 
CfnSecurityConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:security-configuration` |"
  [stack id config]
  (let [builder (CfnSecurityConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (.build builder)))


(defn cfn-security-configuration-props-builder
  "The cfn-security-configuration-props-builder function buildes out new instances of 
CfnSecurityConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:security-configuration` |"
  [stack id config]
  (let [builder (CfnSecurityConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (.build builder)))


(defn cfn-step-builder
  "The cfn-step-builder function buildes out new instances of 
CfnStep$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-failure` |
| `hadoopJarStep` | software.amazon.awscdk.services.emr.CfnStep$HadoopJarStepConfigProperty | [[cdk.support/lookup-entry]] | `:hadoop-jar-step` |
| `jobFlowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnStep$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action-on-failure)]
      (. builder actionOnFailure data))
    (when-let [data (lookup-entry config id :hadoop-jar-step)]
      (. builder hadoopJarStep data))
    (when-let [data (lookup-entry config id :job-flow-id)]
      (. builder jobFlowId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-step-hadoop-jar-step-config-property-builder
  "The cfn-step-hadoop-jar-step-config-property-builder function buildes out new instances of 
CfnStep$HadoopJarStepConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `jar` | java.lang.String | [[cdk.support/lookup-entry]] | `:jar` |
| `mainClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:main-class` |
| `stepProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:step-properties` |"
  [stack id config]
  (let [builder (CfnStep$HadoopJarStepConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :jar)]
      (. builder jar data))
    (when-let [data (lookup-entry config id :main-class)]
      (. builder mainClass data))
    (when-let [data (lookup-entry config id :step-properties)]
      (. builder stepProperties data))
    (.build builder)))


(defn cfn-step-key-value-property-builder
  "The cfn-step-key-value-property-builder function buildes out new instances of 
CfnStep$KeyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnStep$KeyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-step-props-builder
  "The cfn-step-props-builder function buildes out new instances of 
CfnStepProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-on-failure` |
| `hadoopJarStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hadoop-jar-step` |
| `jobFlowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-flow-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnStepProps$Builder.)]
    (when-let [data (lookup-entry config id :action-on-failure)]
      (. builder actionOnFailure data))
    (when-let [data (lookup-entry config id :hadoop-jar-step)]
      (. builder hadoopJarStep data))
    (when-let [data (lookup-entry config id :job-flow-id)]
      (. builder jobFlowId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-studio-builder
  "The cfn-studio-builder function buildes out new instances of 
CfnStudio$Builder using the provided configuration.  Each field is set as follows:

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
| `workspaceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-security-group-id` |"
  [stack id config]
  (let [builder (CfnStudio$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-studio-props-builder
  "The cfn-studio-props-builder function buildes out new instances of 
CfnStudioProps$Builder using the provided configuration.  Each field is set as follows:

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
| `workspaceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-security-group-id` |"
  [stack id config]
  (let [builder (CfnStudioProps$Builder.)]
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
    (.build builder)))


(defn cfn-studio-session-mapping-builder
  "The cfn-studio-session-mapping-builder function buildes out new instances of 
CfnStudioSessionMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-name` |
| `identityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-type` |
| `sessionPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy-arn` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |"
  [stack id config]
  (let [builder (CfnStudioSessionMapping$Builder/create stack id)]
    (when-let [data (lookup-entry config id :identity-name)]
      (. builder identityName data))
    (when-let [data (lookup-entry config id :identity-type)]
      (. builder identityType data))
    (when-let [data (lookup-entry config id :session-policy-arn)]
      (. builder sessionPolicyArn data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (.build builder)))


(defn cfn-studio-session-mapping-props-builder
  "The cfn-studio-session-mapping-props-builder function buildes out new instances of 
CfnStudioSessionMappingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-name` |
| `identityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-type` |
| `sessionPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-policy-arn` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |"
  [stack id config]
  (let [builder (CfnStudioSessionMappingProps$Builder.)]
    (when-let [data (lookup-entry config id :identity-name)]
      (. builder identityName data))
    (when-let [data (lookup-entry config id :identity-type)]
      (. builder identityType data))
    (when-let [data (lookup-entry config id :session-policy-arn)]
      (. builder sessionPolicyArn data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (.build builder)))


(defn cfn-wal-workspace-builder
  "The cfn-wal-workspace-builder function buildes out new instances of 
CfnWALWorkspace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `walWorkspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:wal-workspace-name` |"
  [stack id config]
  (let [builder (CfnWALWorkspace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :wal-workspace-name)]
      (. builder walWorkspaceName data))
    (.build builder)))


(defn cfn-wal-workspace-props-builder
  "The cfn-wal-workspace-props-builder function buildes out new instances of 
CfnWALWorkspaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `walWorkspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:wal-workspace-name` |"
  [stack id config]
  (let [builder (CfnWALWorkspaceProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :wal-workspace-name)]
      (. builder walWorkspaceName data))
    (.build builder)))