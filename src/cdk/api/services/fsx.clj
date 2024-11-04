(ns cdk.api.services.fsx
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.fsx package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api :refer [removal-policy]])
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


(defn cfn-data-repository-association-auto-export-policy-property-builder
  "The cfn-data-repository-association-auto-export-policy-property-builder function buildes out new instances of 
CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (CfnDataRepositoryAssociation$AutoExportPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn cfn-data-repository-association-auto-import-policy-property-builder
  "The cfn-data-repository-association-auto-import-policy-property-builder function buildes out new instances of 
CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (CfnDataRepositoryAssociation$AutoImportPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn cfn-data-repository-association-builder
  "The cfn-data-repository-association-builder function buildes out new instances of 
CfnDataRepositoryAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchImportMetaDataOnCreate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:batch-import-meta-data-on-create` |
| `dataRepositoryPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-repository-path` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |
| `importedFileChunkSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size` |
| `s3` | software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation$S3Property | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataRepositoryAssociation$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-data-repository-association-props-builder
  "The cfn-data-repository-association-props-builder function buildes out new instances of 
CfnDataRepositoryAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchImportMetaDataOnCreate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:batch-import-meta-data-on-create` |
| `dataRepositoryPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-repository-path` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |
| `importedFileChunkSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size` |
| `s3` | software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation$S3Property | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataRepositoryAssociationProps$Builder.)]
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
    (.build builder)))


(defn cfn-data-repository-association-s3-property-builder
  "The cfn-data-repository-association-s3-property-builder function buildes out new instances of 
CfnDataRepositoryAssociation$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoExportPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-export-policy` |
| `autoImportPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-import-policy` |"
  [stack id config]
  (let [builder (CfnDataRepositoryAssociation$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :auto-export-policy)]
      (. builder autoExportPolicy data))
    (when-let [data (lookup-entry config id :auto-import-policy)]
      (. builder autoImportPolicy data))
    (.build builder)))


(defn cfn-file-system-audit-log-configuration-property-builder
  "The cfn-file-system-audit-log-configuration-property-builder function buildes out new instances of 
CfnFileSystem$AuditLogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auditLogDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:audit-log-destination` |
| `fileAccessAuditLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-access-audit-log-level` |
| `fileShareAccessAuditLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-share-access-audit-log-level` |"
  [stack id config]
  (let [builder (CfnFileSystem$AuditLogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :audit-log-destination)]
      (. builder auditLogDestination data))
    (when-let [data (lookup-entry config id :file-access-audit-log-level)]
      (. builder fileAccessAuditLogLevel data))
    (when-let [data (lookup-entry config id :file-share-access-audit-log-level)]
      (. builder fileShareAccessAuditLogLevel data))
    (.build builder)))


(defn cfn-file-system-builder
  "The cfn-file-system-builder function buildes out new instances of 
CfnFileSystem$Builder using the provided configuration.  Each field is set as follows:

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
| `windowsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:windows-configuration` |"
  [stack id config]
  (let [builder (CfnFileSystem$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-file-system-client-configurations-property-builder
  "The cfn-file-system-client-configurations-property-builder function buildes out new instances of 
CfnFileSystem$ClientConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clients` | java.lang.String | [[cdk.support/lookup-entry]] | `:clients` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |"
  [stack id config]
  (let [builder (CfnFileSystem$ClientConfigurationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :clients)]
      (. builder clients data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (.build builder)))


(defn cfn-file-system-disk-iops-configuration-property-builder
  "The cfn-file-system-disk-iops-configuration-property-builder function buildes out new instances of 
CfnFileSystem$DiskIopsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnFileSystem$DiskIopsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-file-system-lustre-configuration-property-builder
  "The cfn-file-system-lustre-configuration-property-builder function buildes out new instances of 
CfnFileSystem$LustreConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |"
  [stack id config]
  (let [builder (CfnFileSystem$LustreConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-file-system-nfs-exports-property-builder
  "The cfn-file-system-nfs-exports-property-builder function buildes out new instances of 
CfnFileSystem$NfsExportsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:client-configurations` |"
  [stack id config]
  (let [builder (CfnFileSystem$NfsExportsProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-configurations)]
      (. builder clientConfigurations data))
    (.build builder)))


(defn cfn-file-system-ontap-configuration-property-builder
  "The cfn-file-system-ontap-configuration-property-builder function buildes out new instances of 
CfnFileSystem$OntapConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |"
  [stack id config]
  (let [builder (CfnFileSystem$OntapConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-file-system-open-zfs-configuration-property-builder
  "The cfn-file-system-open-zfs-configuration-property-builder function buildes out new instances of 
CfnFileSystem$OpenZFSConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |"
  [stack id config]
  (let [builder (CfnFileSystem$OpenZFSConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-file-system-props-builder
  "The cfn-file-system-props-builder function buildes out new instances of 
CfnFileSystemProps$Builder using the provided configuration.  Each field is set as follows:

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
| `windowsConfiguration` | software.amazon.awscdk.services.fsx.CfnFileSystem$WindowsConfigurationProperty | [[cdk.support/lookup-entry]] | `:windows-configuration` |"
  [stack id config]
  (let [builder (CfnFileSystemProps$Builder.)]
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
    (.build builder)))


(defn cfn-file-system-root-volume-configuration-property-builder
  "The cfn-file-system-root-volume-configuration-property-builder function buildes out new instances of 
CfnFileSystem$RootVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyTagsToSnapshots` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshots` |
| `dataCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-compression-type` |
| `nfsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:nfs-exports` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `recordSizeKiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:record-size-ki-b` |
| `userAndGroupQuotas` | java.util.List | [[cdk.support/lookup-entry]] | `:user-and-group-quotas` |"
  [stack id config]
  (let [builder (CfnFileSystem$RootVolumeConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-file-system-self-managed-active-directory-configuration-property-builder
  "The cfn-file-system-self-managed-active-directory-configuration-property-builder function buildes out new instances of 
CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsIps` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-ips` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `fileSystemAdministratorsGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-administrators-group` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnFileSystem$SelfManagedActiveDirectoryConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-file-system-user-and-group-quotas-property-builder
  "The cfn-file-system-user-and-group-quotas-property-builder function buildes out new instances of 
CfnFileSystem$UserAndGroupQuotasProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.Number | [[cdk.support/lookup-entry]] | `:id` |
| `storageCapacityQuotaGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-quota-gi-b` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFileSystem$UserAndGroupQuotasProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :storage-capacity-quota-gi-b)]
      (. builder storageCapacityQuotaGiB data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-file-system-windows-configuration-property-builder
  "The cfn-file-system-windows-configuration-property-builder function buildes out new instances of 
CfnFileSystem$WindowsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `weeklyMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |"
  [stack id config]
  (let [builder (CfnFileSystem$WindowsConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-snapshot-builder
  "The cfn-snapshot-builder function buildes out new instances of 
CfnSnapshot$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |"
  [stack id config]
  (let [builder (CfnSnapshot$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :volume-id)]
      (. builder volumeId data))
    (.build builder)))


(defn cfn-snapshot-props-builder
  "The cfn-snapshot-props-builder function buildes out new instances of 
CfnSnapshotProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |"
  [stack id config]
  (let [builder (CfnSnapshotProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :volume-id)]
      (. builder volumeId data))
    (.build builder)))


(defn cfn-storage-virtual-machine-active-directory-configuration-property-builder
  "The cfn-storage-virtual-machine-active-directory-configuration-property-builder function buildes out new instances of 
CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `netBiosName` | java.lang.String | [[cdk.support/lookup-entry]] | `:net-bios-name` |
| `selfManagedActiveDirectoryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:self-managed-active-directory-configuration` |"
  [stack id config]
  (let [builder (CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :net-bios-name)]
      (. builder netBiosName data))
    (when-let [data (lookup-entry config id :self-managed-active-directory-configuration)]
      (. builder selfManagedActiveDirectoryConfiguration data))
    (.build builder)))


(defn cfn-storage-virtual-machine-builder
  "The cfn-storage-virtual-machine-builder function buildes out new instances of 
CfnStorageVirtualMachine$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryConfiguration` | software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty | [[cdk.support/lookup-entry]] | `:active-directory-configuration` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rootVolumeSecurityStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-volume-security-style` |
| `svmAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:svm-admin-password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStorageVirtualMachine$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-storage-virtual-machine-props-builder
  "The cfn-storage-virtual-machine-props-builder function buildes out new instances of 
CfnStorageVirtualMachineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryConfiguration` | software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine$ActiveDirectoryConfigurationProperty | [[cdk.support/lookup-entry]] | `:active-directory-configuration` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rootVolumeSecurityStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-volume-security-style` |
| `svmAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:svm-admin-password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStorageVirtualMachineProps$Builder.)]
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
    (.build builder)))


(defn cfn-storage-virtual-machine-self-managed-active-directory-configuration-property-builder
  "The cfn-storage-virtual-machine-self-managed-active-directory-configuration-property-builder function buildes out new instances of 
CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsIps` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-ips` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `fileSystemAdministratorsGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-administrators-group` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnStorageVirtualMachine$SelfManagedActiveDirectoryConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-volume-aggregate-configuration-property-builder
  "The cfn-volume-aggregate-configuration-property-builder function buildes out new instances of 
CfnVolume$AggregateConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregates` | java.util.List | [[cdk.support/lookup-entry]] | `:aggregates` |
| `constituentsPerAggregate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:constituents-per-aggregate` |"
  [stack id config]
  (let [builder (CfnVolume$AggregateConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregates)]
      (. builder aggregates data))
    (when-let [data (lookup-entry config id :constituents-per-aggregate)]
      (. builder constituentsPerAggregate data))
    (.build builder)))


(defn cfn-volume-autocommit-period-property-builder
  "The cfn-volume-autocommit-period-property-builder function buildes out new instances of 
CfnVolume$AutocommitPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnVolume$AutocommitPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-volume-builder
  "The cfn-volume-builder function buildes out new instances of 
CfnVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ontapConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ontap-configuration` |
| `openZfsConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$OpenZFSConfigurationProperty | [[cdk.support/lookup-entry]] | `:open-zfs-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnVolume$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-volume-client-configurations-property-builder
  "The cfn-volume-client-configurations-property-builder function buildes out new instances of 
CfnVolume$ClientConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clients` | java.lang.String | [[cdk.support/lookup-entry]] | `:clients` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |"
  [stack id config]
  (let [builder (CfnVolume$ClientConfigurationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :clients)]
      (. builder clients data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (.build builder)))


(defn cfn-volume-nfs-exports-property-builder
  "The cfn-volume-nfs-exports-property-builder function buildes out new instances of 
CfnVolume$NfsExportsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:client-configurations` |"
  [stack id config]
  (let [builder (CfnVolume$NfsExportsProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-configurations)]
      (. builder clientConfigurations data))
    (.build builder)))


(defn cfn-volume-ontap-configuration-property-builder
  "The cfn-volume-ontap-configuration-property-builder function buildes out new instances of 
CfnVolume$OntapConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `volumeStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-style` |"
  [stack id config]
  (let [builder (CfnVolume$OntapConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-volume-open-zfs-configuration-property-builder
  "The cfn-volume-open-zfs-configuration-property-builder function buildes out new instances of 
CfnVolume$OpenZFSConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `userAndGroupQuotas` | java.util.List | [[cdk.support/lookup-entry]] | `:user-and-group-quotas` |"
  [stack id config]
  (let [builder (CfnVolume$OpenZFSConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-volume-origin-snapshot-property-builder
  "The cfn-volume-origin-snapshot-property-builder function buildes out new instances of 
CfnVolume$OriginSnapshotProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-strategy` |
| `snapshotArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-arn` |"
  [stack id config]
  (let [builder (CfnVolume$OriginSnapshotProperty$Builder.)]
    (when-let [data (lookup-entry config id :copy-strategy)]
      (. builder copyStrategy data))
    (when-let [data (lookup-entry config id :snapshot-arn)]
      (. builder snapshotArn data))
    (.build builder)))


(defn cfn-volume-props-builder
  "The cfn-volume-props-builder function buildes out new instances of 
CfnVolumeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ontapConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$OntapConfigurationProperty | [[cdk.support/lookup-entry]] | `:ontap-configuration` |
| `openZfsConfiguration` | software.amazon.awscdk.services.fsx.CfnVolume$OpenZFSConfigurationProperty | [[cdk.support/lookup-entry]] | `:open-zfs-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnVolumeProps$Builder.)]
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
    (.build builder)))


(defn cfn-volume-retention-period-property-builder
  "The cfn-volume-retention-period-property-builder function buildes out new instances of 
CfnVolume$RetentionPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnVolume$RetentionPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-volume-snaplock-configuration-property-builder
  "The cfn-volume-snaplock-configuration-property-builder function buildes out new instances of 
CfnVolume$SnaplockConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auditLogVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:audit-log-volume` |
| `autocommitPeriod` | software.amazon.awscdk.services.fsx.CfnVolume$AutocommitPeriodProperty | [[cdk.support/lookup-entry]] | `:autocommit-period` |
| `privilegedDelete` | java.lang.String | [[cdk.support/lookup-entry]] | `:privileged-delete` |
| `retentionPeriod` | software.amazon.awscdk.services.fsx.CfnVolume$SnaplockRetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:retention-period` |
| `snaplockType` | java.lang.String | [[cdk.support/lookup-entry]] | `:snaplock-type` |
| `volumeAppendModeEnabled` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-append-mode-enabled` |"
  [stack id config]
  (let [builder (CfnVolume$SnaplockConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-volume-snaplock-retention-period-property-builder
  "The cfn-volume-snaplock-retention-period-property-builder function buildes out new instances of 
CfnVolume$SnaplockRetentionPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRetention` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-retention` |
| `maximumRetention` | software.amazon.awscdk.services.fsx.CfnVolume$RetentionPeriodProperty | [[cdk.support/lookup-entry]] | `:maximum-retention` |
| `minimumRetention` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:minimum-retention` |"
  [stack id config]
  (let [builder (CfnVolume$SnaplockRetentionPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-retention)]
      (. builder defaultRetention data))
    (when-let [data (lookup-entry config id :maximum-retention)]
      (. builder maximumRetention data))
    (when-let [data (lookup-entry config id :minimum-retention)]
      (. builder minimumRetention data))
    (.build builder)))


(defn cfn-volume-tiering-policy-property-builder
  "The cfn-volume-tiering-policy-property-builder function buildes out new instances of 
CfnVolume$TieringPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coolingPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cooling-period` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnVolume$TieringPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :cooling-period)]
      (. builder coolingPeriod data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-volume-user-and-group-quotas-property-builder
  "The cfn-volume-user-and-group-quotas-property-builder function buildes out new instances of 
CfnVolume$UserAndGroupQuotasProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.Number | [[cdk.support/lookup-entry]] | `:id` |
| `storageCapacityQuotaGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-quota-gi-b` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnVolume$UserAndGroupQuotasProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :storage-capacity-quota-gi-b)]
      (. builder storageCapacityQuotaGiB data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn file-system-attributes-builder
  "The file-system-attributes-builder function buildes out new instances of 
FileSystemAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |"
  [stack id config]
  (let [builder (FileSystemAttributes$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (.build builder)))


(defn file-system-props-builder
  "The file-system-props-builder function buildes out new instances of 
FileSystemProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `storageCapacityGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-gi-b` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (FileSystemProps$Builder.)]
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
    (.build builder)))


(defn lustre-configuration-builder
  "The lustre-configuration-builder function buildes out new instances of 
LustreConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoImportPolicy` | software.amazon.awscdk.services.fsx.LustreAutoImportPolicy | [[cdk.api.services.fsx/lustre-auto-import-policy]] | `:auto-import-policy` |
| `dataCompressionType` | software.amazon.awscdk.services.fsx.LustreDataCompressionType | [[cdk.api.services.fsx/lustre-data-compression-type]] | `:data-compression-type` |
| `deploymentType` | software.amazon.awscdk.services.fsx.LustreDeploymentType | [[cdk.api.services.fsx/lustre-deployment-type]] | `:deployment-type` |
| `exportPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-path` |
| `importPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:import-path` |
| `importedFileChunkSizeMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:imported-file-chunk-size-mi-b` |
| `perUnitStorageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:per-unit-storage-throughput` |
| `weeklyMaintenanceStartTime` | software.amazon.awscdk.services.fsx.LustreMaintenanceTime | [[cdk.support/lookup-entry]] | `:weekly-maintenance-start-time` |"
  [stack id config]
  (let [builder (LustreConfiguration$Builder.)]
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
    (.build builder)))


(defn lustre-file-system-builder
  "The lustre-file-system-builder function buildes out new instances of 
LustreFileSystem$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `lustreConfiguration` | software.amazon.awscdk.services.fsx.LustreConfiguration | [[cdk.support/lookup-entry]] | `:lustre-configuration` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `storageCapacityGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-gi-b` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnet` | software.amazon.awscdk.services.ec2.ISubnet | [[cdk.support/lookup-entry]] | `:vpc-subnet` |"
  [stack id config]
  (let [builder (LustreFileSystem$Builder/create stack id)]
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
    (.build builder)))


(defn lustre-file-system-props-builder
  "The lustre-file-system-props-builder function buildes out new instances of 
LustreFileSystemProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `lustreConfiguration` | software.amazon.awscdk.services.fsx.LustreConfiguration | [[cdk.support/lookup-entry]] | `:lustre-configuration` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `storageCapacityGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity-gi-b` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnet` | software.amazon.awscdk.services.ec2.ISubnet | [[cdk.support/lookup-entry]] | `:vpc-subnet` |"
  [stack id config]
  (let [builder (LustreFileSystemProps$Builder.)]
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
    (.build builder)))


(defn lustre-maintenance-time-builder
  "The lustre-maintenance-time-builder function buildes out new instances of 
LustreMaintenanceTime$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | software.amazon.awscdk.services.fsx.Weekday | [[cdk.api.services.fsx/weekday]] | `:day` |
| `hour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minute` |"
  [stack id config]
  (let [builder (LustreMaintenanceTime$Builder/create)]
    (when-let [data (weekday config id :day)]
      (. builder day data))
    (when-let [data (lookup-entry config id :hour)]
      (. builder hour data))
    (when-let [data (lookup-entry config id :minute)]
      (. builder minute data))
    (.build builder)))


(defn lustre-maintenance-time-props-builder
  "The lustre-maintenance-time-props-builder function buildes out new instances of 
LustreMaintenanceTimeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | software.amazon.awscdk.services.fsx.Weekday | [[cdk.api.services.fsx/weekday]] | `:day` |
| `hour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minute` |"
  [stack id config]
  (let [builder (LustreMaintenanceTimeProps$Builder.)]
    (when-let [data (weekday config id :day)]
      (. builder day data))
    (when-let [data (lookup-entry config id :hour)]
      (. builder hour data))
    (when-let [data (lookup-entry config id :minute)]
      (. builder minute data))
    (.build builder)))