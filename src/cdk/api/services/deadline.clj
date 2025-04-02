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


(defn cfn-farm-builder>
  "The cfn-farm-builder> function updates a CfnFarm$Builder instance using the provided configuration.
  The function takes the CfnFarm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnFarm$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-farm-builder
  "Creates a  `CfnFarm$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-farm-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-farm-builder> (CfnFarm$Builder/create scope (name id)) id config))


(defn cfn-farm-props-builder>
  "The cfn-farm-props-builder> function updates a CfnFarmProps$Builder instance using the provided configuration.
  The function takes the CfnFarmProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnFarmProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-farm-props-builder
  "Creates a  `CfnFarmProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-farm-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-farm-props-builder> (new CfnFarmProps$Builder) id config))


(defn cfn-fleet-accelerator-count-range-property-builder>
  "The cfn-fleet-accelerator-count-range-property-builder> function updates a CfnFleet$AcceleratorCountRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$AcceleratorCountRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
"
  [^CfnFleet$AcceleratorCountRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (.build builder))


(defn cfn-fleet-accelerator-count-range-property-builder
  "Creates a  `CfnFleet$AcceleratorCountRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-accelerator-count-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-accelerator-count-range-property-builder> (new CfnFleet$AcceleratorCountRangeProperty$Builder) id config))


(defn cfn-fleet-accelerator-total-memory-mi-b-range-property-builder>
  "The cfn-fleet-accelerator-total-memory-mi-b-range-property-builder> function updates a CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
"
  [^CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (.build builder))


(defn cfn-fleet-accelerator-total-memory-mi-b-range-property-builder
  "Creates a  `CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-accelerator-total-memory-mi-b-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-accelerator-total-memory-mi-b-range-property-builder> (new CfnFleet$AcceleratorTotalMemoryMiBRangeProperty$Builder) id config))


(defn cfn-fleet-builder>
  "The cfn-fleet-builder> function updates a CfnFleet$Builder instance using the provided configuration.
  The function takes the CfnFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.deadline.CfnFleet$FleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `maxWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-worker-count` |
| `minWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-worker-count` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnFleet$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :max-worker-count)]
    (. builder maxWorkerCount data))
  (when-some [data (lookup-entry config id :min-worker-count)]
    (. builder minWorkerCount data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-fleet-builder
  "Creates a  `CfnFleet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-fleet-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fleet-builder> (CfnFleet$Builder/create scope (name id)) id config))


(defn cfn-fleet-customer-managed-fleet-configuration-property-builder>
  "The cfn-fleet-customer-managed-fleet-configuration-property-builder> function updates a CfnFleet$CustomerManagedFleetConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$CustomerManagedFleetConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `storageProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-profile-id` |
| `workerCapabilities` | software.amazon.awscdk.services.deadline.CfnFleet$CustomerManagedWorkerCapabilitiesProperty | [[cdk.support/lookup-entry]] | `:worker-capabilities` |
"
  [^CfnFleet$CustomerManagedFleetConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :storage-profile-id)]
    (. builder storageProfileId data))
  (when-some [data (lookup-entry config id :worker-capabilities)]
    (. builder workerCapabilities data))
  (.build builder))


(defn cfn-fleet-customer-managed-fleet-configuration-property-builder
  "Creates a  `CfnFleet$CustomerManagedFleetConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-customer-managed-fleet-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-customer-managed-fleet-configuration-property-builder> (new CfnFleet$CustomerManagedFleetConfigurationProperty$Builder) id config))


(defn cfn-fleet-customer-managed-worker-capabilities-property-builder>
  "The cfn-fleet-customer-managed-worker-capabilities-property-builder> function updates a CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vCpuCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:v-cpu-count` |
"
  [^CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :accelerator-count)]
    (. builder acceleratorCount data))
  (when-some [data (lookup-entry config id :accelerator-total-memory-mi-b)]
    (. builder acceleratorTotalMemoryMiB data))
  (when-some [data (lookup-entry config id :accelerator-types)]
    (. builder acceleratorTypes data))
  (when-some [data (lookup-entry config id :cpu-architecture-type)]
    (. builder cpuArchitectureType data))
  (when-some [data (lookup-entry config id :custom-amounts)]
    (. builder customAmounts data))
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :memory-mi-b)]
    (. builder memoryMiB data))
  (when-some [data (lookup-entry config id :os-family)]
    (. builder osFamily data))
  (when-some [data (lookup-entry config id :v-cpu-count)]
    (. builder vCpuCount data))
  (.build builder))


(defn cfn-fleet-customer-managed-worker-capabilities-property-builder
  "Creates a  `CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-customer-managed-worker-capabilities-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-customer-managed-worker-capabilities-property-builder> (new CfnFleet$CustomerManagedWorkerCapabilitiesProperty$Builder) id config))


(defn cfn-fleet-ec2-ebs-volume-property-builder>
  "The cfn-fleet-ec2-ebs-volume-property-builder> function updates a CfnFleet$Ec2EbsVolumeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$Ec2EbsVolumeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `sizeGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-gi-b` |
| `throughputMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput-mi-b` |
"
  [^CfnFleet$Ec2EbsVolumeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :size-gi-b)]
    (. builder sizeGiB data))
  (when-some [data (lookup-entry config id :throughput-mi-b)]
    (. builder throughputMiB data))
  (.build builder))


(defn cfn-fleet-ec2-ebs-volume-property-builder
  "Creates a  `CfnFleet$Ec2EbsVolumeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-ec2-ebs-volume-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-ec2-ebs-volume-property-builder> (new CfnFleet$Ec2EbsVolumeProperty$Builder) id config))


(defn cfn-fleet-fleet-amount-capability-property-builder>
  "The cfn-fleet-fleet-amount-capability-property-builder> function updates a CfnFleet$FleetAmountCapabilityProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$FleetAmountCapabilityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFleet$FleetAmountCapabilityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-fleet-fleet-amount-capability-property-builder
  "Creates a  `CfnFleet$FleetAmountCapabilityProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-fleet-amount-capability-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-fleet-amount-capability-property-builder> (new CfnFleet$FleetAmountCapabilityProperty$Builder) id config))


(defn cfn-fleet-fleet-attribute-capability-property-builder>
  "The cfn-fleet-fleet-attribute-capability-property-builder> function updates a CfnFleet$FleetAttributeCapabilityProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$FleetAttributeCapabilityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnFleet$FleetAttributeCapabilityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-fleet-fleet-attribute-capability-property-builder
  "Creates a  `CfnFleet$FleetAttributeCapabilityProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-fleet-attribute-capability-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-fleet-attribute-capability-property-builder> (new CfnFleet$FleetAttributeCapabilityProperty$Builder) id config))


(defn cfn-fleet-fleet-capabilities-property-builder>
  "The cfn-fleet-fleet-capabilities-property-builder> function updates a CfnFleet$FleetCapabilitiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$FleetCapabilitiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amounts` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnFleet$FleetCapabilitiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amounts)]
    (. builder amounts data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn cfn-fleet-fleet-capabilities-property-builder
  "Creates a  `CfnFleet$FleetCapabilitiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-fleet-capabilities-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-fleet-capabilities-property-builder> (new CfnFleet$FleetCapabilitiesProperty$Builder) id config))


(defn cfn-fleet-fleet-configuration-property-builder>
  "The cfn-fleet-fleet-configuration-property-builder> function updates a CfnFleet$FleetConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$FleetConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManaged` | software.amazon.awscdk.services.deadline.CfnFleet$CustomerManagedFleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:customer-managed` |
| `serviceManagedEc2` | software.amazon.awscdk.services.deadline.CfnFleet$ServiceManagedEc2FleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:service-managed-ec2` |
"
  [^CfnFleet$FleetConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed)]
    (. builder customerManaged data))
  (when-some [data (lookup-entry config id :service-managed-ec2)]
    (. builder serviceManagedEc2 data))
  (.build builder))


(defn cfn-fleet-fleet-configuration-property-builder
  "Creates a  `CfnFleet$FleetConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-fleet-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-fleet-configuration-property-builder> (new CfnFleet$FleetConfigurationProperty$Builder) id config))


(defn cfn-fleet-memory-mi-b-range-property-builder>
  "The cfn-fleet-memory-mi-b-range-property-builder> function updates a CfnFleet$MemoryMiBRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$MemoryMiBRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
"
  [^CfnFleet$MemoryMiBRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (.build builder))


(defn cfn-fleet-memory-mi-b-range-property-builder
  "Creates a  `CfnFleet$MemoryMiBRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-memory-mi-b-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-memory-mi-b-range-property-builder> (new CfnFleet$MemoryMiBRangeProperty$Builder) id config))


(defn cfn-fleet-props-builder>
  "The cfn-fleet-props-builder> function updates a CfnFleetProps$Builder instance using the provided configuration.
  The function takes the CfnFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.deadline.CfnFleet$FleetConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `maxWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-worker-count` |
| `minWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-worker-count` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnFleetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :max-worker-count)]
    (. builder maxWorkerCount data))
  (when-some [data (lookup-entry config id :min-worker-count)]
    (. builder minWorkerCount data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-fleet-props-builder
  "Creates a  `CfnFleetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-props-builder> (new CfnFleetProps$Builder) id config))


(defn cfn-fleet-service-managed-ec2-fleet-configuration-property-builder>
  "The cfn-fleet-service-managed-ec2-fleet-configuration-property-builder> function updates a CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCapabilities` | software.amazon.awscdk.services.deadline.CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty | [[cdk.support/lookup-entry]] | `:instance-capabilities` |
| `instanceMarketOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-market-options` |
"
  [^CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-capabilities)]
    (. builder instanceCapabilities data))
  (when-some [data (lookup-entry config id :instance-market-options)]
    (. builder instanceMarketOptions data))
  (.build builder))


(defn cfn-fleet-service-managed-ec2-fleet-configuration-property-builder
  "Creates a  `CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-service-managed-ec2-fleet-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-service-managed-ec2-fleet-configuration-property-builder> (new CfnFleet$ServiceManagedEc2FleetConfigurationProperty$Builder) id config))


(defn cfn-fleet-service-managed-ec2-instance-capabilities-property-builder>
  "The cfn-fleet-service-managed-ec2-instance-capabilities-property-builder> function updates a CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vCpuCount` | software.amazon.awscdk.services.deadline.CfnFleet$VCpuCountRangeProperty | [[cdk.support/lookup-entry]] | `:v-cpu-count` |
"
  [^CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-instance-types)]
    (. builder allowedInstanceTypes data))
  (when-some [data (lookup-entry config id :cpu-architecture-type)]
    (. builder cpuArchitectureType data))
  (when-some [data (lookup-entry config id :custom-amounts)]
    (. builder customAmounts data))
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :excluded-instance-types)]
    (. builder excludedInstanceTypes data))
  (when-some [data (lookup-entry config id :memory-mi-b)]
    (. builder memoryMiB data))
  (when-some [data (lookup-entry config id :os-family)]
    (. builder osFamily data))
  (when-some [data (lookup-entry config id :root-ebs-volume)]
    (. builder rootEbsVolume data))
  (when-some [data (lookup-entry config id :v-cpu-count)]
    (. builder vCpuCount data))
  (.build builder))


(defn cfn-fleet-service-managed-ec2-instance-capabilities-property-builder
  "Creates a  `CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-service-managed-ec2-instance-capabilities-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-service-managed-ec2-instance-capabilities-property-builder> (new CfnFleet$ServiceManagedEc2InstanceCapabilitiesProperty$Builder) id config))


(defn cfn-fleet-service-managed-ec2-instance-market-options-property-builder>
  "The cfn-fleet-service-managed-ec2-instance-market-options-property-builder> function updates a CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-fleet-service-managed-ec2-instance-market-options-property-builder
  "Creates a  `CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-service-managed-ec2-instance-market-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-service-managed-ec2-instance-market-options-property-builder> (new CfnFleet$ServiceManagedEc2InstanceMarketOptionsProperty$Builder) id config))


(defn cfn-fleet-v-cpu-count-range-property-builder>
  "The cfn-fleet-v-cpu-count-range-property-builder> function updates a CfnFleet$VCpuCountRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$VCpuCountRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
"
  [^CfnFleet$VCpuCountRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (.build builder))


(defn cfn-fleet-v-cpu-count-range-property-builder
  "Creates a  `CfnFleet$VCpuCountRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fleet-v-cpu-count-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fleet-v-cpu-count-range-property-builder> (new CfnFleet$VCpuCountRangeProperty$Builder) id config))


(defn cfn-license-endpoint-builder>
  "The cfn-license-endpoint-builder> function updates a CfnLicenseEndpoint$Builder instance using the provided configuration.
  The function takes the CfnLicenseEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnLicenseEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-license-endpoint-builder
  "Creates a  `CfnLicenseEndpoint$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-license-endpoint-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-license-endpoint-builder> (CfnLicenseEndpoint$Builder/create scope (name id)) id config))


(defn cfn-license-endpoint-props-builder>
  "The cfn-license-endpoint-props-builder> function updates a CfnLicenseEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnLicenseEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnLicenseEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-license-endpoint-props-builder
  "Creates a  `CfnLicenseEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-license-endpoint-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-license-endpoint-props-builder> (new CfnLicenseEndpointProps$Builder) id config))


(defn cfn-metered-product-builder>
  "The cfn-metered-product-builder> function updates a CfnMeteredProduct$Builder instance using the provided configuration.
  The function takes the CfnMeteredProduct$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `licenseEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-endpoint-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |
"
  [^CfnMeteredProduct$Builder builder id config]
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :license-endpoint-id)]
    (. builder licenseEndpointId data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-some [data (lookup-entry config id :vendor)]
    (. builder vendor data))
  (.build builder))


(defn cfn-metered-product-builder
  "Creates a  `CfnMeteredProduct$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-metered-product-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-metered-product-builder> (CfnMeteredProduct$Builder/create scope (name id)) id config))


(defn cfn-metered-product-props-builder>
  "The cfn-metered-product-props-builder> function updates a CfnMeteredProductProps$Builder instance using the provided configuration.
  The function takes the CfnMeteredProductProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `licenseEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-endpoint-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |
"
  [^CfnMeteredProductProps$Builder builder id config]
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :license-endpoint-id)]
    (. builder licenseEndpointId data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-some [data (lookup-entry config id :vendor)]
    (. builder vendor data))
  (.build builder))


(defn cfn-metered-product-props-builder
  "Creates a  `CfnMeteredProductProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-metered-product-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-metered-product-props-builder> (new CfnMeteredProductProps$Builder) id config))


(defn cfn-queue-builder>
  "The cfn-queue-builder> function updates a CfnQueue$Builder instance using the provided configuration.
  The function takes the CfnQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnQueue$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-storage-profile-ids)]
    (. builder allowedStorageProfileIds data))
  (when-some [data (lookup-entry config id :default-budget-action)]
    (. builder defaultBudgetAction data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :job-attachment-settings)]
    (. builder jobAttachmentSettings data))
  (when-some [data (lookup-entry config id :job-run-as-user)]
    (. builder jobRunAsUser data))
  (when-some [data (lookup-entry config id :required-file-system-location-names)]
    (. builder requiredFileSystemLocationNames data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-queue-builder
  "Creates a  `CfnQueue$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-queue-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-queue-builder> (CfnQueue$Builder/create scope (name id)) id config))


(defn cfn-queue-environment-builder>
  "The cfn-queue-environment-builder> function updates a CfnQueueEnvironment$Builder instance using the provided configuration.
  The function takes the CfnQueueEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |
| `template` | java.lang.String | [[cdk.support/lookup-entry]] | `:template` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |
"
  [^CfnQueueEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :queue-id)]
    (. builder queueId data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (when-some [data (lookup-entry config id :template-type)]
    (. builder templateType data))
  (.build builder))


(defn cfn-queue-environment-builder
  "Creates a  `CfnQueueEnvironment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-queue-environment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-queue-environment-builder> (CfnQueueEnvironment$Builder/create scope (name id)) id config))


(defn cfn-queue-environment-props-builder>
  "The cfn-queue-environment-props-builder> function updates a CfnQueueEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnQueueEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |
| `template` | java.lang.String | [[cdk.support/lookup-entry]] | `:template` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |
"
  [^CfnQueueEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :queue-id)]
    (. builder queueId data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (when-some [data (lookup-entry config id :template-type)]
    (. builder templateType data))
  (.build builder))


(defn cfn-queue-environment-props-builder
  "Creates a  `CfnQueueEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-environment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-environment-props-builder> (new CfnQueueEnvironmentProps$Builder) id config))


(defn cfn-queue-fleet-association-builder>
  "The cfn-queue-fleet-association-builder> function updates a CfnQueueFleetAssociation$Builder instance using the provided configuration.
  The function takes the CfnQueueFleetAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fleetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-id` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |
"
  [^CfnQueueFleetAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :fleet-id)]
    (. builder fleetId data))
  (when-some [data (lookup-entry config id :queue-id)]
    (. builder queueId data))
  (.build builder))


(defn cfn-queue-fleet-association-builder
  "Creates a  `CfnQueueFleetAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-queue-fleet-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-queue-fleet-association-builder> (CfnQueueFleetAssociation$Builder/create scope (name id)) id config))


(defn cfn-queue-fleet-association-props-builder>
  "The cfn-queue-fleet-association-props-builder> function updates a CfnQueueFleetAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnQueueFleetAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fleetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-id` |
| `queueId` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-id` |
"
  [^CfnQueueFleetAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :fleet-id)]
    (. builder fleetId data))
  (when-some [data (lookup-entry config id :queue-id)]
    (. builder queueId data))
  (.build builder))


(defn cfn-queue-fleet-association-props-builder
  "Creates a  `CfnQueueFleetAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-fleet-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-fleet-association-props-builder> (new CfnQueueFleetAssociationProps$Builder) id config))


(defn cfn-queue-job-attachment-settings-property-builder>
  "The cfn-queue-job-attachment-settings-property-builder> function updates a CfnQueue$JobAttachmentSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnQueue$JobAttachmentSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rootPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-prefix` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
"
  [^CfnQueue$JobAttachmentSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :root-prefix)]
    (. builder rootPrefix data))
  (when-some [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (.build builder))


(defn cfn-queue-job-attachment-settings-property-builder
  "Creates a  `CfnQueue$JobAttachmentSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-job-attachment-settings-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-job-attachment-settings-property-builder> (new CfnQueue$JobAttachmentSettingsProperty$Builder) id config))


(defn cfn-queue-job-run-as-user-property-builder>
  "The cfn-queue-job-run-as-user-property-builder> function updates a CfnQueue$JobRunAsUserProperty$Builder instance using the provided configuration.
  The function takes the CfnQueue$JobRunAsUserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `posix` | software.amazon.awscdk.services.deadline.CfnQueue$PosixUserProperty | [[cdk.support/lookup-entry]] | `:posix` |
| `runAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:run-as` |
| `windows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:windows` |
"
  [^CfnQueue$JobRunAsUserProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :posix)]
    (. builder posix data))
  (when-some [data (lookup-entry config id :run-as)]
    (. builder runAs data))
  (when-some [data (lookup-entry config id :windows)]
    (. builder windows data))
  (.build builder))


(defn cfn-queue-job-run-as-user-property-builder
  "Creates a  `CfnQueue$JobRunAsUserProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-job-run-as-user-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-job-run-as-user-property-builder> (new CfnQueue$JobRunAsUserProperty$Builder) id config))


(defn cfn-queue-posix-user-property-builder>
  "The cfn-queue-posix-user-property-builder> function updates a CfnQueue$PosixUserProperty$Builder instance using the provided configuration.
  The function takes the CfnQueue$PosixUserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnQueue$PosixUserProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group)]
    (. builder group data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-queue-posix-user-property-builder
  "Creates a  `CfnQueue$PosixUserProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-posix-user-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-posix-user-property-builder> (new CfnQueue$PosixUserProperty$Builder) id config))


(defn cfn-queue-props-builder>
  "The cfn-queue-props-builder> function updates a CfnQueueProps$Builder instance using the provided configuration.
  The function takes the CfnQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnQueueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-storage-profile-ids)]
    (. builder allowedStorageProfileIds data))
  (when-some [data (lookup-entry config id :default-budget-action)]
    (. builder defaultBudgetAction data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :job-attachment-settings)]
    (. builder jobAttachmentSettings data))
  (when-some [data (lookup-entry config id :job-run-as-user)]
    (. builder jobRunAsUser data))
  (when-some [data (lookup-entry config id :required-file-system-location-names)]
    (. builder requiredFileSystemLocationNames data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-queue-props-builder
  "Creates a  `CfnQueueProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-props-builder> (new CfnQueueProps$Builder) id config))


(defn cfn-queue-windows-user-property-builder>
  "The cfn-queue-windows-user-property-builder> function updates a CfnQueue$WindowsUserProperty$Builder instance using the provided configuration.
  The function takes the CfnQueue$WindowsUserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:password-arn` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnQueue$WindowsUserProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password-arn)]
    (. builder passwordArn data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-queue-windows-user-property-builder
  "Creates a  `CfnQueue$WindowsUserProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-windows-user-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-windows-user-property-builder> (new CfnQueue$WindowsUserProperty$Builder) id config))


(defn cfn-storage-profile-builder>
  "The cfn-storage-profile-builder> function updates a CfnStorageProfile$Builder instance using the provided configuration.
  The function takes the CfnStorageProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fileSystemLocations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `osFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-family` |
"
  [^CfnStorageProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :os-family)]
    (. builder osFamily data))
  (.build builder))


(defn cfn-storage-profile-builder
  "Creates a  `CfnStorageProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-storage-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-storage-profile-builder> (CfnStorageProfile$Builder/create scope (name id)) id config))


(defn cfn-storage-profile-file-system-location-property-builder>
  "The cfn-storage-profile-file-system-location-property-builder> function updates a CfnStorageProfile$FileSystemLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageProfile$FileSystemLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStorageProfile$FileSystemLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-storage-profile-file-system-location-property-builder
  "Creates a  `CfnStorageProfile$FileSystemLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-storage-profile-file-system-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-storage-profile-file-system-location-property-builder> (new CfnStorageProfile$FileSystemLocationProperty$Builder) id config))


(defn cfn-storage-profile-props-builder>
  "The cfn-storage-profile-props-builder> function updates a CfnStorageProfileProps$Builder instance using the provided configuration.
  The function takes the CfnStorageProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `farmId` | java.lang.String | [[cdk.support/lookup-entry]] | `:farm-id` |
| `fileSystemLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-locations` |
| `osFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:os-family` |
"
  [^CfnStorageProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :farm-id)]
    (. builder farmId data))
  (when-some [data (lookup-entry config id :file-system-locations)]
    (. builder fileSystemLocations data))
  (when-some [data (lookup-entry config id :os-family)]
    (. builder osFamily data))
  (.build builder))


(defn cfn-storage-profile-props-builder
  "Creates a  `CfnStorageProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-storage-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-storage-profile-props-builder> (new CfnStorageProfileProps$Builder) id config))