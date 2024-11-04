(ns cdk.api.services.deadline
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.deadline package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.deadline CfnFarm$Builder
                                                     CfnFarmProps$Builder
                                                     CfnFleet$AcceleratorCountRangeProperty$Builder
                                                     CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder
                                                     CfnFleet$Builder
                                                     CfnFleet$CustomerManagedFleetConfigurationProperty$Builder
                                                     CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder
                                                     CfnFleet$Ec2EbsVolumeProperty$Builder
                                                     CfnFleet$FleetAmountCapabilityProperty$Builder
                                                     CfnFleet$FleetAttributeCapabilityProperty$Builder
                                                     CfnFleet$FleetCapabilitiesProperty$Builder
                                                     CfnFleet$FleetConfigurationProperty$Builder
                                                     CfnFleet$MemoryMiBRangeProperty$Builder
                                                     CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder
                                                     CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder
                                                     CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder
                                                     CfnFleet$VCpuCountRangeProperty$Builder
                                                     CfnFleetProps$Builder
                                                     CfnLicenseEndpoint$Builder
                                                     CfnLicenseEndpointProps$Builder
                                                     CfnMeteredProduct$Builder
                                                     CfnMeteredProductProps$Builder
                                                     CfnQueue$Builder
                                                     CfnQueue$JobAttachmentSettingsProperty$Builder
                                                     CfnQueue$JobRunAsUserProperty$Builder
                                                     CfnQueue$PosixUserProperty$Builder
                                                     CfnQueue$WindowsUserProperty$Builder
                                                     CfnQueueEnvironment$Builder
                                                     CfnQueueEnvironmentProps$Builder
                                                     CfnQueueFleetAssociation$Builder
                                                     CfnQueueFleetAssociationProps$Builder
                                                     CfnQueueProps$Builder
                                                     CfnStorageProfile$Builder
                                                     CfnStorageProfile$FileSystemLocationProperty$Builder
                                                     CfnStorageProfileProps$Builder]))


(defn cfn-farm-builder
  "The cfn-farm-builder function buildes out new instances of 
CfnFarm$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnFarm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-farm-props-builder
  "The cfn-farm-props-builder function buildes out new instances of 
CfnFarmProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnFarmProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-fleet-accelerator-count-range-property-builder
  "The cfn-fleet-accelerator-count-range-property-builder function buildes out new instances of 
CfnFleet$AcceleratorCountRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnFleet$AcceleratorCountRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-fleet-accelerator-total-memory-mi-b-range-property-builder
  "The cfn-fleet-accelerator-total-memory-mi-b-range-property-builder function buildes out new instances of 
CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-fleet-builder
  "The cfn-fleet-builder function buildes out new instances of 
CfnFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.deadline.CfnFleet$FleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `maxWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-worker-count` |
| `minWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-worker-count` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :max-worker-count)]
      (. builder maxWorkerCount data))
    (when-let [data (lookup-entry config id :min-worker-count)]
      (. builder minWorkerCount data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-fleet-customer-managed-fleet-configuration-property-builder
  "The cfn-fleet-customer-managed-fleet-configuration-property-builder function buildes out new instances of 
CfnFleet$CustomerManagedFleetConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `storageProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-profile-id` |
| `workerCapabilities` | software.amazon.awscdk.services.deadline.CfnFleet$CustomerManagedWorkerCapabilitiesProperty | [[cdk.support/lookup-entry]] | `:worker-capabilities` |"
  [stack id config]
  (let [builder (CfnFleet$CustomerManagedFleetConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :storage-profile-id)]
      (. builder storageProfileId data))
    (when-let [data (lookup-entry config id :worker-capabilities)]
      (. builder workerCapabilities data))
    (.build builder)))


(defn cfn-fleet-customer-managed-worker-capabilities-property-builder
  "The cfn-fleet-customer-managed-worker-capabilities-property-builder function buildes out new instances of 
CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accelerator-count` |
| `acceleratorTotalMemoryMiB` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accelerator-total-memory-mi-b` |
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `cpuArchitectureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-architecture-type` |
| `customAmounts` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-amounts` |
| `customAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `memoryMiB` | software.amazon.awscdk.services.deadline.CfnFleet$MemoryMiBRangeProperty | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `osFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-family` |
| `vCpuCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:v-cpu-count` |"
  [stack id config]
  (let [builder (CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-count)]
      (. builder acceleratorCount data))
    (when-let [data (lookup-entry config id :accelerator-total-memory-mi-b)]
      (. builder acceleratorTotalMemoryMiB data))
    (when-let [data (lookup-entry config id :accelerator-types)]
      (. builder acceleratorTypes data))
    (when-let [data (lookup-entry config id :cpu-architecture-type)]
      (. builder cpuArchitectureType data))
    (when-let [data (lookup-entry config id :custom-amounts)]
      (. builder customAmounts data))
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (lookup-entry config id :os-family)]
      (. builder osFamily data))
    (when-let [data (lookup-entry config id :v-cpu-count)]
      (. builder vCpuCount data))
    (.build builder)))


(defn cfn-fleet-ec2-ebs-volume-property-builder
  "The cfn-fleet-ec2-ebs-volume-property-builder function buildes out new instances of 
CfnFleet$Ec2EbsVolumeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-gi-b` |
| `throughputMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput-mi-b` |"
  [stack id config]
  (let [builder (CfnFleet$Ec2EbsVolumeProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :size-gi-b)]
      (. builder sizeGiB data))
    (when-let [data (lookup-entry config id :throughput-mi-b)]
      (. builder throughputMiB data))
    (.build builder)))


(defn cfn-fleet-fleet-amount-capability-property-builder
  "The cfn-fleet-fleet-amount-capability-property-builder function buildes out new instances of 
CfnFleet$FleetAmountCapabilityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFleet$FleetAmountCapabilityProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-fleet-fleet-attribute-capability-property-builder
  "The cfn-fleet-fleet-attribute-capability-property-builder function buildes out new instances of 
CfnFleet$FleetAttributeCapabilityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnFleet$FleetAttributeCapabilityProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-fleet-fleet-capabilities-property-builder
  "The cfn-fleet-fleet-capabilities-property-builder function buildes out new instances of 
CfnFleet$FleetCapabilitiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amounts` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |"
  [stack id config]
  (let [builder (CfnFleet$FleetCapabilitiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :amounts)]
      (. builder amounts data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (.build builder)))


(defn cfn-fleet-fleet-configuration-property-builder
  "The cfn-fleet-fleet-configuration-property-builder function buildes out new instances of 
CfnFleet$FleetConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManaged` | software.amazon.awscdk.services.deadline.CfnFleet$CustomerManagedFleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:customer-managed` |
| `serviceManagedEc2` | software.amazon.awscdk.services.deadline.CfnFleet$ServiceManagedEc2FleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:service-managed-ec2` |"
  [stack id config]
  (let [builder (CfnFleet$FleetConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed)]
      (. builder customerManaged data))
    (when-let [data (lookup-entry config id :service-managed-ec2)]
      (. builder serviceManagedEc2 data))
    (.build builder)))


(defn cfn-fleet-memory-mi-b-range-property-builder
  "The cfn-fleet-memory-mi-b-range-property-builder function buildes out new instances of 
CfnFleet$MemoryMiBRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnFleet$MemoryMiBRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-fleet-props-builder
  "The cfn-fleet-props-builder function buildes out new instances of 
CfnFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.deadline.CfnFleet$FleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `maxWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-worker-count` |
| `minWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-worker-count` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :max-worker-count)]
      (. builder maxWorkerCount data))
    (when-let [data (lookup-entry config id :min-worker-count)]
      (. builder minWorkerCount data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-fleet-service-managed-ec2-fleet-configuration-property-builder
  "The cfn-fleet-service-managed-ec2-fleet-configuration-property-builder function buildes out new instances of 
CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCapabilities` | software.amazon.awscdk.services.deadline.CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty | [[cdk.support/lookup-entry]] | `:instance-capabilities` |
| `instanceMarketOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-market-options` |"
  [stack id config]
  (let [builder (CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-capabilities)]
      (. builder instanceCapabilities data))
    (when-let [data (lookup-entry config id :instance-market-options)]
      (. builder instanceMarketOptions data))
    (.build builder)))


(defn cfn-fleet-service-managed-ec2-instance-capabilities-property-builder
  "The cfn-fleet-service-managed-ec2-instance-capabilities-property-builder function buildes out new instances of 
CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-instance-types` |
| `cpuArchitectureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-architecture-type` |
| `customAmounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-amounts` |
| `customAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `excludedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-instance-types` |
| `memoryMiB` | software.amazon.awscdk.services.deadline.CfnFleet$MemoryMiBRangeProperty | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `osFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-family` |
| `rootEbsVolume` | software.amazon.awscdk.services.deadline.CfnFleet$Ec2EbsVolumeProperty | [[cdk.support/lookup-entry]] | `:root-ebs-volume` |
| `vCpuCount` | software.amazon.awscdk.services.deadline.CfnFleet$VCpuCountRangeProperty | [[cdk.support/lookup-entry]] | `:v-cpu-count` |"
  [stack id config]
  (let [builder (CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-instance-types)]
      (. builder allowedInstanceTypes data))
    (when-let [data (lookup-entry config id :cpu-architecture-type)]
      (. builder cpuArchitectureType data))
    (when-let [data (lookup-entry config id :custom-amounts)]
      (. builder customAmounts data))
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :excluded-instance-types)]
      (. builder excludedInstanceTypes data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (lookup-entry config id :os-family)]
      (. builder osFamily data))
    (when-let [data (lookup-entry config id :root-ebs-volume)]
      (. builder rootEbsVolume data))
    (when-let [data (lookup-entry config id :v-cpu-count)]
      (. builder vCpuCount data))
    (.build builder)))


(defn cfn-fleet-service-managed-ec2-instance-market-options-property-builder
  "The cfn-fleet-service-managed-ec2-instance-market-options-property-builder function buildes out new instances of 
CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-fleet-v-cpu-count-range-property-builder
  "The cfn-fleet-v-cpu-count-range-property-builder function buildes out new instances of 
CfnFleet$VCpuCountRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnFleet$VCpuCountRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-license-endpoint-builder
  "The cfn-license-endpoint-builder function buildes out new instances of 
CfnLicenseEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnLicenseEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-license-endpoint-props-builder
  "The cfn-license-endpoint-props-builder function buildes out new instances of 
CfnLicenseEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnLicenseEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-metered-product-builder
  "The cfn-metered-product-builder function buildes out new instances of 
CfnMeteredProduct$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `licenseEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-endpoint-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |"
  [stack id config]
  (let [builder (CfnMeteredProduct$Builder/create stack id)]
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :license-endpoint-id)]
      (. builder licenseEndpointId data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :vendor)]
      (. builder vendor data))
    (.build builder)))


(defn cfn-metered-product-props-builder
  "The cfn-metered-product-props-builder function buildes out new instances of 
CfnMeteredProductProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `licenseEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-endpoint-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |"
  [stack id config]
  (let [builder (CfnMeteredProductProps$Builder.)]
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :license-endpoint-id)]
      (. builder licenseEndpointId data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :vendor)]
      (. builder vendor data))
    (.build builder)))


(defn cfn-queue-builder
  "The cfn-queue-builder function buildes out new instances of 
CfnQueue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedStorageProfileIds` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-storage-profile-ids` |
| `defaultBudgetAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-budget-action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `jobAttachmentSettings` | software.amazon.awscdk.services.deadline.CfnQueue$JobAttachmentSettingsProperty | [[cdk.support/lookup-entry]] | `:job-attachment-settings` |
| `jobRunAsUser` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-run-as-user` |
| `requiredFileSystemLocationNames` | java.util.List | [[cdk.support/lookup-entry]] | `:required-file-system-location-names` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnQueue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-storage-profile-ids)]
      (. builder allowedStorageProfileIds data))
    (when-let [data (lookup-entry config id :default-budget-action)]
      (. builder defaultBudgetAction data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :job-attachment-settings)]
      (. builder jobAttachmentSettings data))
    (when-let [data (lookup-entry config id :job-run-as-user)]
      (. builder jobRunAsUser data))
    (when-let [data (lookup-entry config id :required-file-system-location-names)]
      (. builder requiredFileSystemLocationNames data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-queue-environment-builder
  "The cfn-queue-environment-builder function buildes out new instances of 
CfnQueueEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |
| `template` | java.lang.String | [[cdk.support/lookup-entry]] | `:template` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |"
  [stack id config]
  (let [builder (CfnQueueEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :queue-id)]
      (. builder queueId data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (when-let [data (lookup-entry config id :template-type)]
      (. builder templateType data))
    (.build builder)))


(defn cfn-queue-environment-props-builder
  "The cfn-queue-environment-props-builder function buildes out new instances of 
CfnQueueEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |
| `template` | java.lang.String | [[cdk.support/lookup-entry]] | `:template` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |"
  [stack id config]
  (let [builder (CfnQueueEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :queue-id)]
      (. builder queueId data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (when-let [data (lookup-entry config id :template-type)]
      (. builder templateType data))
    (.build builder)))


(defn cfn-queue-fleet-association-builder
  "The cfn-queue-fleet-association-builder function buildes out new instances of 
CfnQueueFleetAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fleetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-id` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |"
  [stack id config]
  (let [builder (CfnQueueFleetAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :fleet-id)]
      (. builder fleetId data))
    (when-let [data (lookup-entry config id :queue-id)]
      (. builder queueId data))
    (.build builder)))


(defn cfn-queue-fleet-association-props-builder
  "The cfn-queue-fleet-association-props-builder function buildes out new instances of 
CfnQueueFleetAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fleetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-id` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |"
  [stack id config]
  (let [builder (CfnQueueFleetAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :fleet-id)]
      (. builder fleetId data))
    (when-let [data (lookup-entry config id :queue-id)]
      (. builder queueId data))
    (.build builder)))


(defn cfn-queue-job-attachment-settings-property-builder
  "The cfn-queue-job-attachment-settings-property-builder function buildes out new instances of 
CfnQueue$JobAttachmentSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rootPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-prefix` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |"
  [stack id config]
  (let [builder (CfnQueue$JobAttachmentSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :root-prefix)]
      (. builder rootPrefix data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (.build builder)))


(defn cfn-queue-job-run-as-user-property-builder
  "The cfn-queue-job-run-as-user-property-builder function buildes out new instances of 
CfnQueue$JobRunAsUserProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `posix` | software.amazon.awscdk.services.deadline.CfnQueue$PosixUserProperty | [[cdk.support/lookup-entry]] | `:posix` |
| `runAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:run-as` |
| `windows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:windows` |"
  [stack id config]
  (let [builder (CfnQueue$JobRunAsUserProperty$Builder.)]
    (when-let [data (lookup-entry config id :posix)]
      (. builder posix data))
    (when-let [data (lookup-entry config id :run-as)]
      (. builder runAs data))
    (when-let [data (lookup-entry config id :windows)]
      (. builder windows data))
    (.build builder)))


(defn cfn-queue-posix-user-property-builder
  "The cfn-queue-posix-user-property-builder function buildes out new instances of 
CfnQueue$PosixUserProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnQueue$PosixUserProperty$Builder.)]
    (when-let [data (lookup-entry config id :group)]
      (. builder group data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-queue-props-builder
  "The cfn-queue-props-builder function buildes out new instances of 
CfnQueueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedStorageProfileIds` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-storage-profile-ids` |
| `defaultBudgetAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-budget-action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `jobAttachmentSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-attachment-settings` |
| `jobRunAsUser` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-run-as-user` |
| `requiredFileSystemLocationNames` | java.util.List | [[cdk.support/lookup-entry]] | `:required-file-system-location-names` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnQueueProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-storage-profile-ids)]
      (. builder allowedStorageProfileIds data))
    (when-let [data (lookup-entry config id :default-budget-action)]
      (. builder defaultBudgetAction data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :job-attachment-settings)]
      (. builder jobAttachmentSettings data))
    (when-let [data (lookup-entry config id :job-run-as-user)]
      (. builder jobRunAsUser data))
    (when-let [data (lookup-entry config id :required-file-system-location-names)]
      (. builder requiredFileSystemLocationNames data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-queue-windows-user-property-builder
  "The cfn-queue-windows-user-property-builder function buildes out new instances of 
CfnQueue$WindowsUserProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:password-arn` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnQueue$WindowsUserProperty$Builder.)]
    (when-let [data (lookup-entry config id :password-arn)]
      (. builder passwordArn data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-storage-profile-builder
  "The cfn-storage-profile-builder function buildes out new instances of 
CfnStorageProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fileSystemLocations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `osFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-family` |"
  [stack id config]
  (let [builder (CfnStorageProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :os-family)]
      (. builder osFamily data))
    (.build builder)))


(defn cfn-storage-profile-file-system-location-property-builder
  "The cfn-storage-profile-file-system-location-property-builder function buildes out new instances of 
CfnStorageProfile$FileSystemLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStorageProfile$FileSystemLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-storage-profile-props-builder
  "The cfn-storage-profile-props-builder function buildes out new instances of 
CfnStorageProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `osFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-family` |"
  [stack id config]
  (let [builder (CfnStorageProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :farm-id)]
      (. builder farmId data))
    (when-let [data (lookup-entry config id :file-system-locations)]
      (. builder fileSystemLocations data))
    (when-let [data (lookup-entry config id :os-family)]
      (. builder osFamily data))
    (.build builder)))