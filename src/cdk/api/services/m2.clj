(ns cdk.api.services.m2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.m2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.m2 CfnApplication$Builder
                                               CfnApplication$DefinitionProperty$Builder
                                               CfnApplicationProps$Builder
                                               CfnEnvironment$Builder
                                               CfnEnvironment$EfsStorageConfigurationProperty$Builder
                                               CfnEnvironment$FsxStorageConfigurationProperty$Builder
                                               CfnEnvironment$HighAvailabilityConfigProperty$Builder
                                               CfnEnvironment$StorageConfigurationProperty$Builder
                                               CfnEnvironmentProps$Builder]))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-application-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-definition-property-builder>
  "The cfn-application-definition-property-builder> function updates a CfnApplication$DefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$DefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CfnApplication$DefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn cfn-application-definition-property-builder
  "Creates a  `CfnApplication$DefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-definition-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-definition-property-builder> (new CfnApplication$DefinitionProperty$Builder) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-environment-builder>
  "The cfn-environment-builder> function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `highAvailabilityConfig` | software.amazon.awscdk.services.m2.CfnEnvironment$HighAvailabilityConfigProperty | [[cdk.support/lookup-entry]] | `:high-availability-config` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `storageConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-configurations` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :high-availability-config)]
    (. builder highAvailabilityConfig data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :storage-configurations)]
    (. builder storageConfigurations data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-builder
  "Creates a  `CfnEnvironment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-environment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-environment-builder> (CfnEnvironment$Builder/create scope (name id)) id config))


(defn cfn-environment-efs-storage-configuration-property-builder>
  "The cfn-environment-efs-storage-configuration-property-builder> function updates a CfnEnvironment$EfsStorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$EfsStorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
"
  [^CfnEnvironment$EfsStorageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (.build builder))


(defn cfn-environment-efs-storage-configuration-property-builder
  "Creates a  `CfnEnvironment$EfsStorageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-efs-storage-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-efs-storage-configuration-property-builder> (new CfnEnvironment$EfsStorageConfigurationProperty$Builder) id config))


(defn cfn-environment-fsx-storage-configuration-property-builder>
  "The cfn-environment-fsx-storage-configuration-property-builder> function updates a CfnEnvironment$FsxStorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$FsxStorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
"
  [^CfnEnvironment$FsxStorageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (.build builder))


(defn cfn-environment-fsx-storage-configuration-property-builder
  "Creates a  `CfnEnvironment$FsxStorageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-fsx-storage-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-fsx-storage-configuration-property-builder> (new CfnEnvironment$FsxStorageConfigurationProperty$Builder) id config))


(defn cfn-environment-high-availability-config-property-builder>
  "The cfn-environment-high-availability-config-property-builder> function updates a CfnEnvironment$HighAvailabilityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$HighAvailabilityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
"
  [^CfnEnvironment$HighAvailabilityConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :desired-capacity)]
    (. builder desiredCapacity data))
  (.build builder))


(defn cfn-environment-high-availability-config-property-builder
  "Creates a  `CfnEnvironment$HighAvailabilityConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-high-availability-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-high-availability-config-property-builder> (new CfnEnvironment$HighAvailabilityConfigProperty$Builder) id config))


(defn cfn-environment-props-builder>
  "The cfn-environment-props-builder> function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `highAvailabilityConfig` | software.amazon.awscdk.services.m2.CfnEnvironment$HighAvailabilityConfigProperty | [[cdk.support/lookup-entry]] | `:high-availability-config` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `storageConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:storage-configurations` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :high-availability-config)]
    (. builder highAvailabilityConfig data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :storage-configurations)]
    (. builder storageConfigurations data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-props-builder
  "Creates a  `CfnEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-props-builder> (new CfnEnvironmentProps$Builder) id config))


(defn cfn-environment-storage-configuration-property-builder>
  "The cfn-environment-storage-configuration-property-builder> function updates a CfnEnvironment$StorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$StorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efs` | software.amazon.awscdk.services.m2.CfnEnvironment$EfsStorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:efs` |
| `fsx` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fsx` |
"
  [^CfnEnvironment$StorageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :efs)]
    (. builder efs data))
  (when-some [data (lookup-entry config id :fsx)]
    (. builder fsx data))
  (.build builder))


(defn cfn-environment-storage-configuration-property-builder
  "Creates a  `CfnEnvironment$StorageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-storage-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-storage-configuration-property-builder> (new CfnEnvironment$StorageConfigurationProperty$Builder) id config))