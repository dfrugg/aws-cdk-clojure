(ns cdk.api.services.fsx
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.fsx package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.fsx CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder
                                                CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder
                                                CfnDataRepositoryAssociation$Builder
                                                CfnDataRepositoryAssociation$S3Property$Builder
                                                CfnDataRepositoryAssociationProps$Builder
                                                CfnFileSystem$AuditLogConfigurationProperty$Builder
                                                CfnFileSystem$Builder
                                                CfnFileSystem$ClientConfigurationsProperty$Builder
                                                CfnFileSystem$DiskIopsConfigurationProperty$Builder
                                                CfnFileSystem$LustreConfigurationProperty$Builder
                                                CfnFileSystem$NfsExportsProperty$Builder
                                                CfnFileSystem$OntapConfigurationProperty$Builder
                                                CfnFileSystem$OpenZFSConfigurationProperty$Builder
                                                CfnFileSystem$RootVolumeConfigurationProperty$Builder
                                                CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder
                                                CfnFileSystem$UserAndGroupQuotasProperty$Builder
                                                CfnFileSystem$WindowsConfigurationProperty$Builder
                                                CfnFileSystemProps$Builder
                                                CfnSnapshot$Builder
                                                CfnSnapshotProps$Builder
                                                CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder
                                                CfnStorageVirtualMachine$Builder
                                                CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder
                                                CfnStorageVirtualMachineProps$Builder
                                                CfnVolume$AggregateConfigurationProperty$Builder
                                                CfnVolume$AutocommitPeriodProperty$Builder
                                                CfnVolume$Builder
                                                CfnVolume$ClientConfigurationsProperty$Builder
                                                CfnVolume$NfsExportsProperty$Builder
                                                CfnVolume$OntapConfigurationProperty$Builder
                                                CfnVolume$OpenZFSConfigurationProperty$Builder
                                                CfnVolume$OriginSnapshotProperty$Builder
                                                CfnVolume$RetentionPeriodProperty$Builder
                                                CfnVolume$SnaplockConfigurationProperty$Builder
                                                CfnVolume$SnaplockRetentionPeriodProperty$Builder
                                                CfnVolume$TieringPolicyProperty$Builder
                                                CfnVolume$UserAndGroupQuotasProperty$Builder
                                                CfnVolumeProps$Builder
                                                FileSystemAttributes$Builder
                                                FileSystemProps$Builder
                                                LustreAutoImportPolicy
                                                LustreConfiguration$Builder
                                                LustreDataCompressionType
                                                LustreDeploymentType
                                                LustreFileSystem$Builder
                                                LustreFileSystemProps$Builder
                                                LustreMaintenanceTime$Builder
                                                LustreMaintenanceTimeProps$Builder
                                                Weekday]))


(defn lustre-auto-import-policy
  "The `lustre-auto-import-policy` function data interprets values in the provided config data into a 
`LustreAutoImportPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LustreAutoImportPolicy` - the value is returned.
* is `:new-changed-deleted` - `LustreAutoImportPolicy/NEW_CHANGED_DELETED` is returned
* is `:new` - `LustreAutoImportPolicy/NEW` is returned
* is `:none` - `LustreAutoImportPolicy/NONE` is returned
* is `:new-changed` - `LustreAutoImportPolicy/NEW_CHANGED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LustreAutoImportPolicy data) data
      (= :new-changed-deleted data) LustreAutoImportPolicy/NEW_CHANGED_DELETED
      (= :new data) LustreAutoImportPolicy/NEW
      (= :none data) LustreAutoImportPolicy/NONE
      (= :new-changed data) LustreAutoImportPolicy/NEW_CHANGED)))


(defn lustre-data-compression-type
  "The `lustre-data-compression-type` function data interprets values in the provided config data into a 
`LustreDataCompressionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LustreDataCompressionType` - the value is returned.
* is `:lz4` - `LustreDataCompressionType/LZ4` is returned
* is `:none` - `LustreDataCompressionType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LustreDataCompressionType data) data
      (= :lz4 data) LustreDataCompressionType/LZ4
      (= :none data) LustreDataCompressionType/NONE)))


(defn lustre-deployment-type
  "The `lustre-deployment-type` function data interprets values in the provided config data into a 
`LustreDeploymentType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LustreDeploymentType` - the value is returned.
* is `:persistent-2` - `LustreDeploymentType/PERSISTENT_2` is returned
* is `:scratch-1` - `LustreDeploymentType/SCRATCH_1` is returned
* is `:scratch-2` - `LustreDeploymentType/SCRATCH_2` is returned
* is `:persistent-1` - `LustreDeploymentType/PERSISTENT_1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LustreDeploymentType data) data
      (= :persistent-2 data) LustreDeploymentType/PERSISTENT_2
      (= :scratch-1 data) LustreDeploymentType/SCRATCH_1
      (= :scratch-2 data) LustreDeploymentType/SCRATCH_2
      (= :persistent-1 data) LustreDeploymentType/PERSISTENT_1)))


(defn weekday
  "The `weekday` function data interprets values in the provided config data into a 
`Weekday` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Weekday` - the value is returned.
* is `:sunday` - `Weekday/SUNDAY` is returned
* is `:thursday` - `Weekday/THURSDAY` is returned
* is `:tuesday` - `Weekday/TUESDAY` is returned
* is `:wednesday` - `Weekday/WEDNESDAY` is returned
* is `:monday` - `Weekday/MONDAY` is returned
* is `:friday` - `Weekday/FRIDAY` is returned
* is `:saturday` - `Weekday/SATURDAY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Weekday data) data
      (= :sunday data) Weekday/SUNDAY
      (= :thursday data) Weekday/THURSDAY
      (= :tuesday data) Weekday/TUESDAY
      (= :wednesday data) Weekday/WEDNESDAY
      (= :monday data) Weekday/MONDAY
      (= :friday data) Weekday/FRIDAY
      (= :saturday data) Weekday/SATURDAY)))


(defn build-cfn-data-repository-association-auto-export-policy-property-builder
  "The build-cfn-data-repository-association-auto-export-policy-property-builder function updates a CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (.build builder))


(defn cfn-data-repository-association-auto-export-policy-property-builder
  "Creates a  `CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-repository-association-auto-export-policy-property-builder (new CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder) id config))


(defn build-cfn-data-repository-association-auto-import-policy-property-builder
  "The build-cfn-data-repository-association-auto-import-policy-property-builder function updates a CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (.build builder))


(defn cfn-data-repository-association-auto-import-policy-property-builder
  "Creates a  `CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-repository-association-auto-import-policy-property-builder (new CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder) id config))


(defn build-cfn-data-repository-association-builder
  "The build-cfn-data-repository-association-builder function updates a CfnDataRepositoryAssociation$Builder instance using the provided configuration.
  The function takes the CfnDataRepositoryAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchImportMetaDataOnCreate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:batch-import-meta-data-on-create` |
| `dataRepositoryPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-repository-path` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |
| `importedFileChunkSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size` |
| `s3` | software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation$S3Property | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataRepositoryAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-import-meta-data-on-create)]
    (. builder batchImportMetaDataOnCreate data))
  (when-let [data (lookup-entry config id :data-repository-path)]
    (. builder dataRepositoryPath data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :file-system-path)]
    (. builder fileSystemPath data))
  (when-let [data (lookup-entry config id :imported-file-chunk-size)]
    (. builder importedFileChunkSize data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-repository-association-builder
  "Creates a  `CfnDataRepositoryAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-data-repository-association-builder (CfnDataRepositoryAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-data-repository-association-props-builder
  "The build-cfn-data-repository-association-props-builder function updates a CfnDataRepositoryAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnDataRepositoryAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchImportMetaDataOnCreate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:batch-import-meta-data-on-create` |
| `dataRepositoryPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-repository-path` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |
| `importedFileChunkSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size` |
| `s3` | software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation$S3Property | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataRepositoryAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-import-meta-data-on-create)]
    (. builder batchImportMetaDataOnCreate data))
  (when-let [data (lookup-entry config id :data-repository-path)]
    (. builder dataRepositoryPath data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :file-system-path)]
    (. builder fileSystemPath data))
  (when-let [data (lookup-entry config id :imported-file-chunk-size)]
    (. builder importedFileChunkSize data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-repository-association-props-builder
  "Creates a  `CfnDataRepositoryAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-repository-association-props-builder (new CfnDataRepositoryAssociationProps$Builder) id config))


(defn build-cfn-data-repository-association-s3-property-builder
  "The build-cfn-data-repository-association-s3-property-builder function updates a CfnDataRepositoryAssociation$S3Property$Builder instance using the provided configuration.
  The function takes the CfnDataRepositoryAssociation$S3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoExportPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-export-policy` |
| `autoImportPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-import-policy` |
"
  [^CfnDataRepositoryAssociation$S3Property$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-export-policy)]
    (. builder autoExportPolicy data))
  (when-let [data (lookup-entry config id :auto-import-policy)]
    (. builder autoImportPolicy data))
  (.build builder))


(defn cfn-data-repository-association-s3-property-builder
  "Creates a  `CfnDataRepositoryAssociation$S3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-repository-association-s3-property-builder (new CfnDataRepositoryAssociation$S3Property$Builder) id config))


(defn build-cfn-file-system-audit-log-configuration-property-builder
  "The build-cfn-file-system-audit-log-configuration-property-builder function updates a CfnFileSystem$AuditLogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$AuditLogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auditLogDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:audit-log-destination` |
| `fileAccessAuditLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-access-audit-log-level` |
| `fileShareAccessAuditLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-share-access-audit-log-level` |
"
  [^CfnFileSystem$AuditLogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audit-log-destination)]
    (. builder auditLogDestination data))
  (when-let [data (lookup-entry config id :file-access-audit-log-level)]
    (. builder fileAccessAuditLogLevel data))
  (when-let [data (lookup-entry config id :file-share-access-audit-log-level)]
    (. builder fileShareAccessAuditLogLevel data))
  (.build builder))


(defn cfn-file-system-audit-log-configuration-property-builder
  "Creates a  `CfnFileSystem$AuditLogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-audit-log-configuration-property-builder (new CfnFileSystem$AuditLogConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-builder
  "The build-cfn-file-system-builder function updates a CfnFileSystem$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `fileSystemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-type` |
| `fileSystemTypeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-type-version` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `lustreConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$LustreConfigurationProperty | [[cdk.support/lookup-entry]] | `:lustre-configuration` |
| `ontapConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$OntapConfigurationProperty | [[cdk.support/lookup-entry]] | `:ontap-configuration` |
| `openZfsConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$OpenZFSConfigurationProperty | [[cdk.support/lookup-entry]] | `:open-zfs-configuration` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `storageCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `windowsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:windows-configuration` |
"
  [^CfnFileSystem$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :file-system-type)]
    (. builder fileSystemType data))
  (when-let [data (lookup-entry config id :file-system-type-version)]
    (. builder fileSystemTypeVersion data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :lustre-configuration)]
    (. builder lustreConfiguration data))
  (when-let [data (lookup-entry config id :ontap-configuration)]
    (. builder ontapConfiguration data))
  (when-let [data (lookup-entry config id :open-zfs-configuration)]
    (. builder openZfsConfiguration data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :storage-capacity)]
    (. builder storageCapacity data))
  (when-let [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :windows-configuration)]
    (. builder windowsConfiguration data))
  (.build builder))


(defn cfn-file-system-builder
  "Creates a  `CfnFileSystem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-file-system-builder (CfnFileSystem$Builder/create scope (name id)) id config))


(defn build-cfn-file-system-client-configurations-property-builder
  "The build-cfn-file-system-client-configurations-property-builder function updates a CfnFileSystem$ClientConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$ClientConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clients` | java.lang.String | [[cdk.support/lookup-entry]] | `:clients` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |
"
  [^CfnFileSystem$ClientConfigurationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :clients)]
    (. builder clients data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (.build builder))


(defn cfn-file-system-client-configurations-property-builder
  "Creates a  `CfnFileSystem$ClientConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-client-configurations-property-builder (new CfnFileSystem$ClientConfigurationsProperty$Builder) id config))


(defn build-cfn-file-system-disk-iops-configuration-property-builder
  "The build-cfn-file-system-disk-iops-configuration-property-builder function updates a CfnFileSystem$DiskIopsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$DiskIopsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnFileSystem$DiskIopsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-file-system-disk-iops-configuration-property-builder
  "Creates a  `CfnFileSystem$DiskIopsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-disk-iops-configuration-property-builder (new CfnFileSystem$DiskIopsConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-lustre-configuration-property-builder
  "The build-cfn-file-system-lustre-configuration-property-builder function updates a CfnFileSystem$LustreConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$LustreConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoImportPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-import-policy` |
| `automaticBackupRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatic-backup-retention-days` |
| `copyTagsToBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-backups` |
| `dailyAutomaticBackupStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:daily-automatic-backup-start-time` |
| `dataCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-compression-type` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
| `driveCacheType` | java.lang.String | [[cdk.support/lookup-entry]] | `:drive-cache-type` |
| `exportPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-path` |
| `importPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:import-path` |
| `importedFileChunkSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size` |
| `perUnitStorageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:per-unit-storage-throughput` |
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |
"
  [^CfnFileSystem$LustreConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-import-policy)]
    (. builder autoImportPolicy data))
  (when-let [data (lookup-entry config id :automatic-backup-retention-days)]
    (. builder automaticBackupRetentionDays data))
  (when-let [data (lookup-entry config id :copy-tags-to-backups)]
    (. builder copyTagsToBackups data))
  (when-let [data (lookup-entry config id :daily-automatic-backup-start-time)]
    (. builder dailyAutomaticBackupStartTime data))
  (when-let [data (lookup-entry config id :data-compression-type)]
    (. builder dataCompressionType data))
  (when-let [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (when-let [data (lookup-entry config id :drive-cache-type)]
    (. builder driveCacheType data))
  (when-let [data (lookup-entry config id :export-path)]
    (. builder exportPath data))
  (when-let [data (lookup-entry config id :import-path)]
    (. builder importPath data))
  (when-let [data (lookup-entry config id :imported-file-chunk-size)]
    (. builder importedFileChunkSize data))
  (when-let [data (lookup-entry config id :per-unit-storage-throughput)]
    (. builder perUnitStorageThroughput data))
  (when-let [data (lookup-entry config id :weekly-maintenance-start-time)]
    (. builder weeklyMaintenanceStartTime data))
  (.build builder))


(defn cfn-file-system-lustre-configuration-property-builder
  "Creates a  `CfnFileSystem$LustreConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-lustre-configuration-property-builder (new CfnFileSystem$LustreConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-nfs-exports-property-builder
  "The build-cfn-file-system-nfs-exports-property-builder function updates a CfnFileSystem$NfsExportsProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$NfsExportsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:client-configurations` |
"
  [^CfnFileSystem$NfsExportsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-configurations)]
    (. builder clientConfigurations data))
  (.build builder))


(defn cfn-file-system-nfs-exports-property-builder
  "Creates a  `CfnFileSystem$NfsExportsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-nfs-exports-property-builder (new CfnFileSystem$NfsExportsProperty$Builder) id config))


(defn build-cfn-file-system-ontap-configuration-property-builder
  "The build-cfn-file-system-ontap-configuration-property-builder function updates a CfnFileSystem$OntapConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$OntapConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticBackupRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatic-backup-retention-days` |
| `dailyAutomaticBackupStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:daily-automatic-backup-start-time` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
| `diskIopsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disk-iops-configuration` |
| `endpointIpAddressRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-ip-address-range` |
| `fsxAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-admin-password` |
| `haPairs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ha-pairs` |
| `preferredSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-subnet-id` |
| `routeTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:route-table-ids` |
| `throughputCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput-capacity` |
| `throughputCapacityPerHaPair` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput-capacity-per-ha-pair` |
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |
"
  [^CfnFileSystem$OntapConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :automatic-backup-retention-days)]
    (. builder automaticBackupRetentionDays data))
  (when-let [data (lookup-entry config id :daily-automatic-backup-start-time)]
    (. builder dailyAutomaticBackupStartTime data))
  (when-let [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (when-let [data (lookup-entry config id :disk-iops-configuration)]
    (. builder diskIopsConfiguration data))
  (when-let [data (lookup-entry config id :endpoint-ip-address-range)]
    (. builder endpointIpAddressRange data))
  (when-let [data (lookup-entry config id :fsx-admin-password)]
    (. builder fsxAdminPassword data))
  (when-let [data (lookup-entry config id :ha-pairs)]
    (. builder haPairs data))
  (when-let [data (lookup-entry config id :preferred-subnet-id)]
    (. builder preferredSubnetId data))
  (when-let [data (lookup-entry config id :route-table-ids)]
    (. builder routeTableIds data))
  (when-let [data (lookup-entry config id :throughput-capacity)]
    (. builder throughputCapacity data))
  (when-let [data (lookup-entry config id :throughput-capacity-per-ha-pair)]
    (. builder throughputCapacityPerHaPair data))
  (when-let [data (lookup-entry config id :weekly-maintenance-start-time)]
    (. builder weeklyMaintenanceStartTime data))
  (.build builder))


(defn cfn-file-system-ontap-configuration-property-builder
  "Creates a  `CfnFileSystem$OntapConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-ontap-configuration-property-builder (new CfnFileSystem$OntapConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-open-zfs-configuration-property-builder
  "The build-cfn-file-system-open-zfs-configuration-property-builder function updates a CfnFileSystem$OpenZFSConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$OpenZFSConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticBackupRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatic-backup-retention-days` |
| `copyTagsToBackups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags-to-backups` |
| `copyTagsToVolumes` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-volumes` |
| `dailyAutomaticBackupStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:daily-automatic-backup-start-time` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
| `diskIopsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disk-iops-configuration` |
| `endpointIpAddressRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-ip-address-range` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |
| `preferredSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-subnet-id` |
| `rootVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:root-volume-configuration` |
| `routeTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:route-table-ids` |
| `throughputCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput-capacity` |
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |
"
  [^CfnFileSystem$OpenZFSConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :automatic-backup-retention-days)]
    (. builder automaticBackupRetentionDays data))
  (when-let [data (lookup-entry config id :copy-tags-to-backups)]
    (. builder copyTagsToBackups data))
  (when-let [data (lookup-entry config id :copy-tags-to-volumes)]
    (. builder copyTagsToVolumes data))
  (when-let [data (lookup-entry config id :daily-automatic-backup-start-time)]
    (. builder dailyAutomaticBackupStartTime data))
  (when-let [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (when-let [data (lookup-entry config id :disk-iops-configuration)]
    (. builder diskIopsConfiguration data))
  (when-let [data (lookup-entry config id :endpoint-ip-address-range)]
    (. builder endpointIpAddressRange data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :preferred-subnet-id)]
    (. builder preferredSubnetId data))
  (when-let [data (lookup-entry config id :root-volume-configuration)]
    (. builder rootVolumeConfiguration data))
  (when-let [data (lookup-entry config id :route-table-ids)]
    (. builder routeTableIds data))
  (when-let [data (lookup-entry config id :throughput-capacity)]
    (. builder throughputCapacity data))
  (when-let [data (lookup-entry config id :weekly-maintenance-start-time)]
    (. builder weeklyMaintenanceStartTime data))
  (.build builder))


(defn cfn-file-system-open-zfs-configuration-property-builder
  "Creates a  `CfnFileSystem$OpenZFSConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-open-zfs-configuration-property-builder (new CfnFileSystem$OpenZFSConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-props-builder
  "The build-cfn-file-system-props-builder function updates a CfnFileSystemProps$Builder instance using the provided configuration.
  The function takes the CfnFileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `fileSystemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-type` |
| `fileSystemTypeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-type-version` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `lustreConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$LustreConfigurationProperty | [[cdk.support/lookup-entry]] | `:lustre-configuration` |
| `ontapConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ontap-configuration` |
| `openZfsConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$OpenZFSConfigurationProperty | [[cdk.support/lookup-entry]] | `:open-zfs-configuration` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `storageCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `windowsConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$WindowsConfigurationProperty | [[cdk.support/lookup-entry]] | `:windows-configuration` |
"
  [^CfnFileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :file-system-type)]
    (. builder fileSystemType data))
  (when-let [data (lookup-entry config id :file-system-type-version)]
    (. builder fileSystemTypeVersion data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :lustre-configuration)]
    (. builder lustreConfiguration data))
  (when-let [data (lookup-entry config id :ontap-configuration)]
    (. builder ontapConfiguration data))
  (when-let [data (lookup-entry config id :open-zfs-configuration)]
    (. builder openZfsConfiguration data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :storage-capacity)]
    (. builder storageCapacity data))
  (when-let [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :windows-configuration)]
    (. builder windowsConfiguration data))
  (.build builder))


(defn cfn-file-system-props-builder
  "Creates a  `CfnFileSystemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-props-builder (new CfnFileSystemProps$Builder) id config))


(defn build-cfn-file-system-root-volume-configuration-property-builder
  "The build-cfn-file-system-root-volume-configuration-property-builder function updates a CfnFileSystem$RootVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$RootVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyTagsToSnapshots` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshots` |
| `dataCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-compression-type` |
| `nfsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:nfs-exports` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `recordSizeKiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:record-size-ki-b` |
| `userAndGroupQuotas` | java.util.List | [[cdk.support/lookup-entry]] | `:user-and-group-quotas` |
"
  [^CfnFileSystem$RootVolumeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :copy-tags-to-snapshots)]
    (. builder copyTagsToSnapshots data))
  (when-let [data (lookup-entry config id :data-compression-type)]
    (. builder dataCompressionType data))
  (when-let [data (lookup-entry config id :nfs-exports)]
    (. builder nfsExports data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :record-size-ki-b)]
    (. builder recordSizeKiB data))
  (when-let [data (lookup-entry config id :user-and-group-quotas)]
    (. builder userAndGroupQuotas data))
  (.build builder))


(defn cfn-file-system-root-volume-configuration-property-builder
  "Creates a  `CfnFileSystem$RootVolumeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-root-volume-configuration-property-builder (new CfnFileSystem$RootVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-self-managed-active-directory-configuration-property-builder
  "The build-cfn-file-system-self-managed-active-directory-configuration-property-builder function updates a CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsIps` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-ips` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `fileSystemAdministratorsGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-administrators-group` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-ips)]
    (. builder dnsIps data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :file-system-administrators-group)]
    (. builder fileSystemAdministratorsGroup data))
  (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
    (. builder organizationalUnitDistinguishedName data))
  (when-let [data (lookup-entry config id :password)]
    (. builder password data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-file-system-self-managed-active-directory-configuration-property-builder
  "Creates a  `CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-self-managed-active-directory-configuration-property-builder (new CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-user-and-group-quotas-property-builder
  "The build-cfn-file-system-user-and-group-quotas-property-builder function updates a CfnFileSystem$UserAndGroupQuotasProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$UserAndGroupQuotasProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.Number | [[cdk.support/lookup-entry]] | `:id` |
| `storageCapacityQuotaGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-quota-gi-b` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFileSystem$UserAndGroupQuotasProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :storage-capacity-quota-gi-b)]
    (. builder storageCapacityQuotaGiB data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-file-system-user-and-group-quotas-property-builder
  "Creates a  `CfnFileSystem$UserAndGroupQuotasProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-user-and-group-quotas-property-builder (new CfnFileSystem$UserAndGroupQuotasProperty$Builder) id config))


(defn build-cfn-file-system-windows-configuration-property-builder
  "The build-cfn-file-system-windows-configuration-property-builder function updates a CfnFileSystem$WindowsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$WindowsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-directory-id` |
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `auditLogConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$AuditLogConfigurationProperty | [[cdk.support/lookup-entry]] | `:audit-log-configuration` |
| `automaticBackupRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatic-backup-retention-days` |
| `copyTagsToBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-backups` |
| `dailyAutomaticBackupStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:daily-automatic-backup-start-time` |
| `deploymentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-type` |
| `diskIopsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disk-iops-configuration` |
| `preferredSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-subnet-id` |
| `selfManagedActiveDirectoryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-active-directory-configuration` |
| `throughputCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput-capacity` |
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |
"
  [^CfnFileSystem$WindowsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active-directory-id)]
    (. builder activeDirectoryId data))
  (when-let [data (lookup-entry config id :aliases)]
    (. builder aliases data))
  (when-let [data (lookup-entry config id :audit-log-configuration)]
    (. builder auditLogConfiguration data))
  (when-let [data (lookup-entry config id :automatic-backup-retention-days)]
    (. builder automaticBackupRetentionDays data))
  (when-let [data (lookup-entry config id :copy-tags-to-backups)]
    (. builder copyTagsToBackups data))
  (when-let [data (lookup-entry config id :daily-automatic-backup-start-time)]
    (. builder dailyAutomaticBackupStartTime data))
  (when-let [data (lookup-entry config id :deployment-type)]
    (. builder deploymentType data))
  (when-let [data (lookup-entry config id :disk-iops-configuration)]
    (. builder diskIopsConfiguration data))
  (when-let [data (lookup-entry config id :preferred-subnet-id)]
    (. builder preferredSubnetId data))
  (when-let [data (lookup-entry config id :self-managed-active-directory-configuration)]
    (. builder selfManagedActiveDirectoryConfiguration data))
  (when-let [data (lookup-entry config id :throughput-capacity)]
    (. builder throughputCapacity data))
  (when-let [data (lookup-entry config id :weekly-maintenance-start-time)]
    (. builder weeklyMaintenanceStartTime data))
  (.build builder))


(defn cfn-file-system-windows-configuration-property-builder
  "Creates a  `CfnFileSystem$WindowsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-file-system-windows-configuration-property-builder (new CfnFileSystem$WindowsConfigurationProperty$Builder) id config))


(defn build-cfn-snapshot-builder
  "The build-cfn-snapshot-builder function updates a CfnSnapshot$Builder instance using the provided configuration.
  The function takes the CfnSnapshot$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |
"
  [^CfnSnapshot$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :volume-id)]
    (. builder volumeId data))
  (.build builder))


(defn cfn-snapshot-builder
  "Creates a  `CfnSnapshot$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-snapshot-builder (CfnSnapshot$Builder/create scope (name id)) id config))


(defn build-cfn-snapshot-props-builder
  "The build-cfn-snapshot-props-builder function updates a CfnSnapshotProps$Builder instance using the provided configuration.
  The function takes the CfnSnapshotProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |
"
  [^CfnSnapshotProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :volume-id)]
    (. builder volumeId data))
  (.build builder))


(defn cfn-snapshot-props-builder
  "Creates a  `CfnSnapshotProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-snapshot-props-builder (new CfnSnapshotProps$Builder) id config))


(defn build-cfn-storage-virtual-machine-active-directory-configuration-property-builder
  "The build-cfn-storage-virtual-machine-active-directory-configuration-property-builder function updates a CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `netBiosName` | java.lang.String | [[cdk.support/lookup-entry]] | `:net-bios-name` |
| `selfManagedActiveDirectoryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-active-directory-configuration` |
"
  [^CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :net-bios-name)]
    (. builder netBiosName data))
  (when-let [data (lookup-entry config id :self-managed-active-directory-configuration)]
    (. builder selfManagedActiveDirectoryConfiguration data))
  (.build builder))


(defn cfn-storage-virtual-machine-active-directory-configuration-property-builder
  "Creates a  `CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-storage-virtual-machine-active-directory-configuration-property-builder (new CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder) id config))


(defn build-cfn-storage-virtual-machine-builder
  "The build-cfn-storage-virtual-machine-builder function updates a CfnStorageVirtualMachine$Builder instance using the provided configuration.
  The function takes the CfnStorageVirtualMachine$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryConfiguration` | software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty | [[cdk.support/lookup-entry]] | `:active-directory-configuration` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rootVolumeSecurityStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-volume-security-style` |
| `svmAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:svm-admin-password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageVirtualMachine$Builder builder id config]
  (when-let [data (lookup-entry config id :active-directory-configuration)]
    (. builder activeDirectoryConfiguration data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :root-volume-security-style)]
    (. builder rootVolumeSecurityStyle data))
  (when-let [data (lookup-entry config id :svm-admin-password)]
    (. builder svmAdminPassword data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-storage-virtual-machine-builder
  "Creates a  `CfnStorageVirtualMachine$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-storage-virtual-machine-builder (CfnStorageVirtualMachine$Builder/create scope (name id)) id config))


(defn build-cfn-storage-virtual-machine-props-builder
  "The build-cfn-storage-virtual-machine-props-builder function updates a CfnStorageVirtualMachineProps$Builder instance using the provided configuration.
  The function takes the CfnStorageVirtualMachineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryConfiguration` | software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty | [[cdk.support/lookup-entry]] | `:active-directory-configuration` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rootVolumeSecurityStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-volume-security-style` |
| `svmAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:svm-admin-password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageVirtualMachineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :active-directory-configuration)]
    (. builder activeDirectoryConfiguration data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :root-volume-security-style)]
    (. builder rootVolumeSecurityStyle data))
  (when-let [data (lookup-entry config id :svm-admin-password)]
    (. builder svmAdminPassword data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-storage-virtual-machine-props-builder
  "Creates a  `CfnStorageVirtualMachineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-storage-virtual-machine-props-builder (new CfnStorageVirtualMachineProps$Builder) id config))


(defn build-cfn-storage-virtual-machine-self-managed-active-directory-configuration-property-builder
  "The build-cfn-storage-virtual-machine-self-managed-active-directory-configuration-property-builder function updates a CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsIps` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-ips` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `fileSystemAdministratorsGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-administrators-group` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-ips)]
    (. builder dnsIps data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :file-system-administrators-group)]
    (. builder fileSystemAdministratorsGroup data))
  (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
    (. builder organizationalUnitDistinguishedName data))
  (when-let [data (lookup-entry config id :password)]
    (. builder password data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-storage-virtual-machine-self-managed-active-directory-configuration-property-builder
  "Creates a  `CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-storage-virtual-machine-self-managed-active-directory-configuration-property-builder (new CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder) id config))


(defn build-cfn-volume-aggregate-configuration-property-builder
  "The build-cfn-volume-aggregate-configuration-property-builder function updates a CfnVolume$AggregateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$AggregateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregates` | java.util.List | [[cdk.support/lookup-entry]] | `:aggregates` |
| `constituentsPerAggregate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:constituents-per-aggregate` |
"
  [^CfnVolume$AggregateConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregates)]
    (. builder aggregates data))
  (when-let [data (lookup-entry config id :constituents-per-aggregate)]
    (. builder constituentsPerAggregate data))
  (.build builder))


(defn cfn-volume-aggregate-configuration-property-builder
  "Creates a  `CfnVolume$AggregateConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-aggregate-configuration-property-builder (new CfnVolume$AggregateConfigurationProperty$Builder) id config))


(defn build-cfn-volume-autocommit-period-property-builder
  "The build-cfn-volume-autocommit-period-property-builder function updates a CfnVolume$AutocommitPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$AutocommitPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnVolume$AutocommitPeriodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-volume-autocommit-period-property-builder
  "Creates a  `CfnVolume$AutocommitPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-autocommit-period-property-builder (new CfnVolume$AutocommitPeriodProperty$Builder) id config))


(defn build-cfn-volume-builder
  "The build-cfn-volume-builder function updates a CfnVolume$Builder instance using the provided configuration.
  The function takes the CfnVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ontapConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ontap-configuration` |
| `openZfsConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$OpenZFSConfigurationProperty | [[cdk.support/lookup-entry]] | `:open-zfs-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnVolume$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :ontap-configuration)]
    (. builder ontapConfiguration data))
  (when-let [data (lookup-entry config id :open-zfs-configuration)]
    (. builder openZfsConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-volume-builder
  "Creates a  `CfnVolume$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-volume-builder (CfnVolume$Builder/create scope (name id)) id config))


(defn build-cfn-volume-client-configurations-property-builder
  "The build-cfn-volume-client-configurations-property-builder function updates a CfnVolume$ClientConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$ClientConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clients` | java.lang.String | [[cdk.support/lookup-entry]] | `:clients` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |
"
  [^CfnVolume$ClientConfigurationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :clients)]
    (. builder clients data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (.build builder))


(defn cfn-volume-client-configurations-property-builder
  "Creates a  `CfnVolume$ClientConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-client-configurations-property-builder (new CfnVolume$ClientConfigurationsProperty$Builder) id config))


(defn build-cfn-volume-nfs-exports-property-builder
  "The build-cfn-volume-nfs-exports-property-builder function updates a CfnVolume$NfsExportsProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$NfsExportsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:client-configurations` |
"
  [^CfnVolume$NfsExportsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-configurations)]
    (. builder clientConfigurations data))
  (.build builder))


(defn cfn-volume-nfs-exports-property-builder
  "Creates a  `CfnVolume$NfsExportsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-nfs-exports-property-builder (new CfnVolume$NfsExportsProperty$Builder) id config))


(defn build-cfn-volume-ontap-configuration-property-builder
  "The build-cfn-volume-ontap-configuration-property-builder function updates a CfnVolume$OntapConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$OntapConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$AggregateConfigurationProperty | [[cdk.support/lookup-entry]] | `:aggregate-configuration` |
| `copyTagsToBackups` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-tags-to-backups` |
| `junctionPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:junction-path` |
| `ontapVolumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ontap-volume-type` |
| `securityStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-style` |
| `sizeInBytes` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-in-bytes` |
| `sizeInMegabytes` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-in-megabytes` |
| `snaplockConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$SnaplockConfigurationProperty | [[cdk.support/lookup-entry]] | `:snaplock-configuration` |
| `snapshotPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-policy` |
| `storageEfficiencyEnabled` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-efficiency-enabled` |
| `storageVirtualMachineId` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-virtual-machine-id` |
| `tieringPolicy` | software.amazon.awscdk.services.fsx.CfnVolume$TieringPolicyProperty | [[cdk.support/lookup-entry]] | `:tiering-policy` |
| `volumeStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-style` |
"
  [^CfnVolume$OntapConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregate-configuration)]
    (. builder aggregateConfiguration data))
  (when-let [data (lookup-entry config id :copy-tags-to-backups)]
    (. builder copyTagsToBackups data))
  (when-let [data (lookup-entry config id :junction-path)]
    (. builder junctionPath data))
  (when-let [data (lookup-entry config id :ontap-volume-type)]
    (. builder ontapVolumeType data))
  (when-let [data (lookup-entry config id :security-style)]
    (. builder securityStyle data))
  (when-let [data (lookup-entry config id :size-in-bytes)]
    (. builder sizeInBytes data))
  (when-let [data (lookup-entry config id :size-in-megabytes)]
    (. builder sizeInMegabytes data))
  (when-let [data (lookup-entry config id :snaplock-configuration)]
    (. builder snaplockConfiguration data))
  (when-let [data (lookup-entry config id :snapshot-policy)]
    (. builder snapshotPolicy data))
  (when-let [data (lookup-entry config id :storage-efficiency-enabled)]
    (. builder storageEfficiencyEnabled data))
  (when-let [data (lookup-entry config id :storage-virtual-machine-id)]
    (. builder storageVirtualMachineId data))
  (when-let [data (lookup-entry config id :tiering-policy)]
    (. builder tieringPolicy data))
  (when-let [data (lookup-entry config id :volume-style)]
    (. builder volumeStyle data))
  (.build builder))


(defn cfn-volume-ontap-configuration-property-builder
  "Creates a  `CfnVolume$OntapConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-ontap-configuration-property-builder (new CfnVolume$OntapConfigurationProperty$Builder) id config))


(defn build-cfn-volume-open-zfs-configuration-property-builder
  "The build-cfn-volume-open-zfs-configuration-property-builder function updates a CfnVolume$OpenZFSConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$OpenZFSConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyTagsToSnapshots` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshots` |
| `dataCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-compression-type` |
| `nfsExports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nfs-exports` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |
| `originSnapshot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:origin-snapshot` |
| `parentVolumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-volume-id` |
| `readOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-only` |
| `recordSizeKiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:record-size-ki-b` |
| `storageCapacityQuotaGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-quota-gi-b` |
| `storageCapacityReservationGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-reservation-gi-b` |
| `userAndGroupQuotas` | java.util.List | [[cdk.support/lookup-entry]] | `:user-and-group-quotas` |
"
  [^CfnVolume$OpenZFSConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :copy-tags-to-snapshots)]
    (. builder copyTagsToSnapshots data))
  (when-let [data (lookup-entry config id :data-compression-type)]
    (. builder dataCompressionType data))
  (when-let [data (lookup-entry config id :nfs-exports)]
    (. builder nfsExports data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :origin-snapshot)]
    (. builder originSnapshot data))
  (when-let [data (lookup-entry config id :parent-volume-id)]
    (. builder parentVolumeId data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :record-size-ki-b)]
    (. builder recordSizeKiB data))
  (when-let [data (lookup-entry config id :storage-capacity-quota-gi-b)]
    (. builder storageCapacityQuotaGiB data))
  (when-let [data (lookup-entry config id :storage-capacity-reservation-gi-b)]
    (. builder storageCapacityReservationGiB data))
  (when-let [data (lookup-entry config id :user-and-group-quotas)]
    (. builder userAndGroupQuotas data))
  (.build builder))


(defn cfn-volume-open-zfs-configuration-property-builder
  "Creates a  `CfnVolume$OpenZFSConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-open-zfs-configuration-property-builder (new CfnVolume$OpenZFSConfigurationProperty$Builder) id config))


(defn build-cfn-volume-origin-snapshot-property-builder
  "The build-cfn-volume-origin-snapshot-property-builder function updates a CfnVolume$OriginSnapshotProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$OriginSnapshotProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-strategy` |
| `snapshotArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-arn` |
"
  [^CfnVolume$OriginSnapshotProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :copy-strategy)]
    (. builder copyStrategy data))
  (when-let [data (lookup-entry config id :snapshot-arn)]
    (. builder snapshotArn data))
  (.build builder))


(defn cfn-volume-origin-snapshot-property-builder
  "Creates a  `CfnVolume$OriginSnapshotProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-origin-snapshot-property-builder (new CfnVolume$OriginSnapshotProperty$Builder) id config))


(defn build-cfn-volume-props-builder
  "The build-cfn-volume-props-builder function updates a CfnVolumeProps$Builder instance using the provided configuration.
  The function takes the CfnVolumeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ontapConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$OntapConfigurationProperty | [[cdk.support/lookup-entry]] | `:ontap-configuration` |
| `openZfsConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$OpenZFSConfigurationProperty | [[cdk.support/lookup-entry]] | `:open-zfs-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnVolumeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :ontap-configuration)]
    (. builder ontapConfiguration data))
  (when-let [data (lookup-entry config id :open-zfs-configuration)]
    (. builder openZfsConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-volume-props-builder
  "Creates a  `CfnVolumeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-props-builder (new CfnVolumeProps$Builder) id config))


(defn build-cfn-volume-retention-period-property-builder
  "The build-cfn-volume-retention-period-property-builder function updates a CfnVolume$RetentionPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$RetentionPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnVolume$RetentionPeriodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-volume-retention-period-property-builder
  "Creates a  `CfnVolume$RetentionPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-retention-period-property-builder (new CfnVolume$RetentionPeriodProperty$Builder) id config))


(defn build-cfn-volume-snaplock-configuration-property-builder
  "The build-cfn-volume-snaplock-configuration-property-builder function updates a CfnVolume$SnaplockConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$SnaplockConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auditLogVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:audit-log-volume` |
| `autocommitPeriod` | software.amazon.awscdk.services.fsx.CfnVolume$AutocommitPeriodProperty | [[cdk.support/lookup-entry]] | `:autocommit-period` |
| `privilegedDelete` | java.lang.String | [[cdk.support/lookup-entry]] | `:privileged-delete` |
| `retentionPeriod` | software.amazon.awscdk.services.fsx.CfnVolume$SnaplockRetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `snaplockType` | java.lang.String | [[cdk.support/lookup-entry]] | `:snaplock-type` |
| `volumeAppendModeEnabled` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-append-mode-enabled` |
"
  [^CfnVolume$SnaplockConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audit-log-volume)]
    (. builder auditLogVolume data))
  (when-let [data (lookup-entry config id :autocommit-period)]
    (. builder autocommitPeriod data))
  (when-let [data (lookup-entry config id :privileged-delete)]
    (. builder privilegedDelete data))
  (when-let [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-let [data (lookup-entry config id :snaplock-type)]
    (. builder snaplockType data))
  (when-let [data (lookup-entry config id :volume-append-mode-enabled)]
    (. builder volumeAppendModeEnabled data))
  (.build builder))


(defn cfn-volume-snaplock-configuration-property-builder
  "Creates a  `CfnVolume$SnaplockConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-snaplock-configuration-property-builder (new CfnVolume$SnaplockConfigurationProperty$Builder) id config))


(defn build-cfn-volume-snaplock-retention-period-property-builder
  "The build-cfn-volume-snaplock-retention-period-property-builder function updates a CfnVolume$SnaplockRetentionPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$SnaplockRetentionPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRetention` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-retention` |
| `maximumRetention` | software.amazon.awscdk.services.fsx.CfnVolume$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:maximum-retention` |
| `minimumRetention` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:minimum-retention` |
"
  [^CfnVolume$SnaplockRetentionPeriodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-retention)]
    (. builder defaultRetention data))
  (when-let [data (lookup-entry config id :maximum-retention)]
    (. builder maximumRetention data))
  (when-let [data (lookup-entry config id :minimum-retention)]
    (. builder minimumRetention data))
  (.build builder))


(defn cfn-volume-snaplock-retention-period-property-builder
  "Creates a  `CfnVolume$SnaplockRetentionPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-snaplock-retention-period-property-builder (new CfnVolume$SnaplockRetentionPeriodProperty$Builder) id config))


(defn build-cfn-volume-tiering-policy-property-builder
  "The build-cfn-volume-tiering-policy-property-builder function updates a CfnVolume$TieringPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$TieringPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coolingPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cooling-period` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnVolume$TieringPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cooling-period)]
    (. builder coolingPeriod data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-volume-tiering-policy-property-builder
  "Creates a  `CfnVolume$TieringPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-tiering-policy-property-builder (new CfnVolume$TieringPolicyProperty$Builder) id config))


(defn build-cfn-volume-user-and-group-quotas-property-builder
  "The build-cfn-volume-user-and-group-quotas-property-builder function updates a CfnVolume$UserAndGroupQuotasProperty$Builder instance using the provided configuration.
  The function takes the CfnVolume$UserAndGroupQuotasProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.Number | [[cdk.support/lookup-entry]] | `:id` |
| `storageCapacityQuotaGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-quota-gi-b` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnVolume$UserAndGroupQuotasProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :storage-capacity-quota-gi-b)]
    (. builder storageCapacityQuotaGiB data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-volume-user-and-group-quotas-property-builder
  "Creates a  `CfnVolume$UserAndGroupQuotasProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-volume-user-and-group-quotas-property-builder (new CfnVolume$UserAndGroupQuotasProperty$Builder) id config))


(defn build-file-system-attributes-builder
  "The build-file-system-attributes-builder function updates a FileSystemAttributes$Builder instance using the provided configuration.
  The function takes the FileSystemAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
"
  [^FileSystemAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (.build builder))


(defn file-system-attributes-builder
  "Creates a  `FileSystemAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-file-system-attributes-builder (new FileSystemAttributes$Builder) id config))


(defn build-file-system-props-builder
  "The build-file-system-props-builder function updates a FileSystemProps$Builder instance using the provided configuration.
  The function takes the FileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `storageCapacityGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-gi-b` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^FileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (lookup-entry config id :storage-capacity-gi-b)]
    (. builder storageCapacityGiB data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn file-system-props-builder
  "Creates a  `FileSystemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-file-system-props-builder (new FileSystemProps$Builder) id config))


(defn build-lustre-configuration-builder
  "The build-lustre-configuration-builder function updates a LustreConfiguration$Builder instance using the provided configuration.
  The function takes the LustreConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoImportPolicy` | software.amazon.awscdk.services.fsx.LustreAutoImportPolicy | [[cdk.api.services.fsx/lustre-auto-import-policy]] | `:auto-import-policy` |
| `dataCompressionType` | software.amazon.awscdk.services.fsx.LustreDataCompressionType | [[cdk.api.services.fsx/lustre-data-compression-type]] | `:data-compression-type` |
| `deploymentType` | software.amazon.awscdk.services.fsx.LustreDeploymentType | [[cdk.api.services.fsx/lustre-deployment-type]] | `:deployment-type` |
| `exportPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-path` |
| `importPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:import-path` |
| `importedFileChunkSizeMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size-mi-b` |
| `perUnitStorageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:per-unit-storage-throughput` |
| `weeklyMaintenanceStartTime` | software.amazon.awscdk.services.fsx.LustreMaintenanceTime | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |
"
  [^LustreConfiguration$Builder builder id config]
  (when-let [data (lustre-auto-import-policy config id :auto-import-policy)]
    (. builder autoImportPolicy data))
  (when-let [data (lustre-data-compression-type config id :data-compression-type)]
    (. builder dataCompressionType data))
  (when-let [data (lustre-deployment-type config id :deployment-type)]
    (. builder deploymentType data))
  (when-let [data (lookup-entry config id :export-path)]
    (. builder exportPath data))
  (when-let [data (lookup-entry config id :import-path)]
    (. builder importPath data))
  (when-let [data (lookup-entry config id :imported-file-chunk-size-mi-b)]
    (. builder importedFileChunkSizeMiB data))
  (when-let [data (lookup-entry config id :per-unit-storage-throughput)]
    (. builder perUnitStorageThroughput data))
  (when-let [data (lookup-entry config id :weekly-maintenance-start-time)]
    (. builder weeklyMaintenanceStartTime data))
  (.build builder))


(defn lustre-configuration-builder
  "Creates a  `LustreConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lustre-configuration-builder (new LustreConfiguration$Builder) id config))


(defn build-lustre-file-system-builder
  "The build-lustre-file-system-builder function updates a LustreFileSystem$Builder instance using the provided configuration.
  The function takes the LustreFileSystem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `lustreConfiguration` | software.amazon.awscdk.services.fsx.LustreConfiguration | [[cdk.support/lookup-entry]] | `:lustre-configuration` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `storageCapacityGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-gi-b` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnet` | software.amazon.awscdk.services.ec2.ISubnet | [[cdk.support/lookup-entry]] | `:vpc-subnet` |
"
  [^LustreFileSystem$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :lustre-configuration)]
    (. builder lustreConfiguration data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (lookup-entry config id :storage-capacity-gi-b)]
    (. builder storageCapacityGiB data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnet)]
    (. builder vpcSubnet data))
  (.build builder))


(defn lustre-file-system-builder
  "Creates a  `LustreFileSystem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-lustre-file-system-builder (LustreFileSystem$Builder/create scope (name id)) id config))


(defn build-lustre-file-system-props-builder
  "The build-lustre-file-system-props-builder function updates a LustreFileSystemProps$Builder instance using the provided configuration.
  The function takes the LustreFileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `lustreConfiguration` | software.amazon.awscdk.services.fsx.LustreConfiguration | [[cdk.support/lookup-entry]] | `:lustre-configuration` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `storageCapacityGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-gi-b` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnet` | software.amazon.awscdk.services.ec2.ISubnet | [[cdk.support/lookup-entry]] | `:vpc-subnet` |
"
  [^LustreFileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :lustre-configuration)]
    (. builder lustreConfiguration data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (lookup-entry config id :storage-capacity-gi-b)]
    (. builder storageCapacityGiB data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnet)]
    (. builder vpcSubnet data))
  (.build builder))


(defn lustre-file-system-props-builder
  "Creates a  `LustreFileSystemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lustre-file-system-props-builder (new LustreFileSystemProps$Builder) id config))


(defn build-lustre-maintenance-time-builder
  "The build-lustre-maintenance-time-builder function updates a LustreMaintenanceTime$Builder instance using the provided configuration.
  The function takes the LustreMaintenanceTime$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | software.amazon.awscdk.services.fsx.Weekday | [[cdk.api.services.fsx/weekday]] | `:day` |
| `hour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minute` |
"
  [^LustreMaintenanceTime$Builder builder id config]
  (when-let [data (weekday config id :day)]
    (. builder day data))
  (when-let [data (lookup-entry config id :hour)]
    (. builder hour data))
  (when-let [data (lookup-entry config id :minute)]
    (. builder minute data))
  (.build builder))


(defn lustre-maintenance-time-builder
  "Creates a  `LustreMaintenanceTime$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lustre-maintenance-time-builder (LustreMaintenanceTime$Builder/create) id config))


(defn build-lustre-maintenance-time-props-builder
  "The build-lustre-maintenance-time-props-builder function updates a LustreMaintenanceTimeProps$Builder instance using the provided configuration.
  The function takes the LustreMaintenanceTimeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | software.amazon.awscdk.services.fsx.Weekday | [[cdk.api.services.fsx/weekday]] | `:day` |
| `hour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minute` |
"
  [^LustreMaintenanceTimeProps$Builder builder id config]
  (when-let [data (weekday config id :day)]
    (. builder day data))
  (when-let [data (lookup-entry config id :hour)]
    (. builder hour data))
  (when-let [data (lookup-entry config id :minute)]
    (. builder minute data))
  (.build builder))


(defn lustre-maintenance-time-props-builder
  "Creates a  `LustreMaintenanceTimeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lustre-maintenance-time-props-builder (new LustreMaintenanceTimeProps$Builder) id config))