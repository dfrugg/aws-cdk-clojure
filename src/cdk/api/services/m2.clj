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


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-application-definition-property-builder
  "The build-cfn-application-definition-property-builder function updates a CfnApplication$DefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$DefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CfnApplication$DefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-environment-builder
  "The build-cfn-environment-builder function updates a CfnEnvironment$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :high-availability-config)]
    (. builder highAvailabilityConfig data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :storage-configurations)]
    (. builder storageConfigurations data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-environment-efs-storage-configuration-property-builder
  "The build-cfn-environment-efs-storage-configuration-property-builder function updates a CfnEnvironment$EfsStorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$EfsStorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
"
  [^CfnEnvironment$EfsStorageConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (.build builder))


(defn build-cfn-environment-fsx-storage-configuration-property-builder
  "The build-cfn-environment-fsx-storage-configuration-property-builder function updates a CfnEnvironment$FsxStorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$FsxStorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
"
  [^CfnEnvironment$FsxStorageConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (.build builder))


(defn build-cfn-environment-high-availability-config-property-builder
  "The build-cfn-environment-high-availability-config-property-builder function updates a CfnEnvironment$HighAvailabilityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$HighAvailabilityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
"
  [^CfnEnvironment$HighAvailabilityConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :desired-capacity)]
    (. builder desiredCapacity data))
  (.build builder))


(defn build-cfn-environment-props-builder
  "The build-cfn-environment-props-builder function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :high-availability-config)]
    (. builder highAvailabilityConfig data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :storage-configurations)]
    (. builder storageConfigurations data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-environment-storage-configuration-property-builder
  "The build-cfn-environment-storage-configuration-property-builder function updates a CfnEnvironment$StorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$StorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efs` | software.amazon.awscdk.services.m2.CfnEnvironment$EfsStorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:efs` |
| `fsx` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fsx` |
"
  [^CfnEnvironment$StorageConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :efs)]
    (. builder efs data))
  (when-let [data (lookup-entry config id :fsx)]
    (. builder fsx data))
  (.build builder))