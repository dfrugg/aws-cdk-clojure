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


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-application-definition-property-builder
  "The cfn-application-definition-property-builder function buildes out new instances of 
CfnApplication$DefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (CfnApplication$DefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
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
    (.build builder)))


(defn cfn-environment-builder
  "The cfn-environment-builder function buildes out new instances of 
CfnEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironment$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-environment-efs-storage-configuration-property-builder
  "The cfn-environment-efs-storage-configuration-property-builder function buildes out new instances of 
CfnEnvironment$EfsStorageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |"
  [stack id config]
  (let [builder (CfnEnvironment$EfsStorageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :mount-point)]
      (. builder mountPoint data))
    (.build builder)))


(defn cfn-environment-fsx-storage-configuration-property-builder
  "The cfn-environment-fsx-storage-configuration-property-builder function buildes out new instances of 
CfnEnvironment$FsxStorageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |"
  [stack id config]
  (let [builder (CfnEnvironment$FsxStorageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :mount-point)]
      (. builder mountPoint data))
    (.build builder)))


(defn cfn-environment-high-availability-config-property-builder
  "The cfn-environment-high-availability-config-property-builder function buildes out new instances of 
CfnEnvironment$HighAvailabilityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |"
  [stack id config]
  (let [builder (CfnEnvironment$HighAvailabilityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (.build builder)))


(defn cfn-environment-props-builder
  "The cfn-environment-props-builder function buildes out new instances of 
CfnEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentProps$Builder.)]
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
    (.build builder)))


(defn cfn-environment-storage-configuration-property-builder
  "The cfn-environment-storage-configuration-property-builder function buildes out new instances of 
CfnEnvironment$StorageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efs` | software.amazon.awscdk.services.m2.CfnEnvironment$EfsStorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:efs` |
| `fsx` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fsx` |"
  [stack id config]
  (let [builder (CfnEnvironment$StorageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :efs)]
      (. builder efs data))
    (when-let [data (lookup-entry config id :fsx)]
      (. builder fsx data))
    (.build builder)))