(ns cdk.api.services.efs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.efs package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.efs AccessPoint$Builder
                                                AccessPointAttributes$Builder
                                                AccessPointOptions$Builder
                                                AccessPointProps$Builder
                                                Acl$Builder
                                                CfnAccessPoint$AccessPointTagProperty$Builder
                                                CfnAccessPoint$Builder
                                                CfnAccessPoint$CreationInfoProperty$Builder
                                                CfnAccessPoint$PosixUserProperty$Builder
                                                CfnAccessPoint$RootDirectoryProperty$Builder
                                                CfnAccessPointProps$Builder
                                                CfnFileSystem$BackupPolicyProperty$Builder
                                                CfnFileSystem$Builder
                                                CfnFileSystem$ElasticFileSystemTagProperty$Builder
                                                CfnFileSystem$FileSystemProtectionProperty$Builder
                                                CfnFileSystem$LifecyclePolicyProperty$Builder
                                                CfnFileSystem$ReplicationConfigurationProperty$Builder
                                                CfnFileSystem$ReplicationDestinationProperty$Builder
                                                CfnFileSystemProps$Builder
                                                CfnMountTarget$Builder
                                                CfnMountTargetProps$Builder
                                                ExistingFileSystemProps$Builder
                                                FileSystem$Builder
                                                FileSystemAttributes$Builder
                                                FileSystemProps$Builder
                                                LifecyclePolicy
                                                OneZoneFileSystemProps$Builder
                                                OutOfInfrequentAccessPolicy
                                                PerformanceMode
                                                PosixUser$Builder
                                                RegionalFileSystemProps$Builder
                                                ReplicationConfigurationProps$Builder
                                                ReplicationOverwriteProtection
                                                ThroughputMode]))


(defn lifecycle-policy
  "The `lifecycle-policy` function data interprets values in the provided config data into a 
`LifecyclePolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LifecyclePolicy` - the value is returned.
* is `:after-270-days` - `LifecyclePolicy/AFTER_270_DAYS` is returned
* is `:after-1-day` - `LifecyclePolicy/AFTER_1_DAY` is returned
* is `:after-30-days` - `LifecyclePolicy/AFTER_30_DAYS` is returned
* is `:after-180-days` - `LifecyclePolicy/AFTER_180_DAYS` is returned
* is `:after-90-days` - `LifecyclePolicy/AFTER_90_DAYS` is returned
* is `:after-14-days` - `LifecyclePolicy/AFTER_14_DAYS` is returned
* is `:after-7-days` - `LifecyclePolicy/AFTER_7_DAYS` is returned
* is `:after-365-days` - `LifecyclePolicy/AFTER_365_DAYS` is returned
* is `:after-60-days` - `LifecyclePolicy/AFTER_60_DAYS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LifecyclePolicy data) data
      (= :after-270-days data) LifecyclePolicy/AFTER_270_DAYS
      (= :after-1-day data) LifecyclePolicy/AFTER_1_DAY
      (= :after-30-days data) LifecyclePolicy/AFTER_30_DAYS
      (= :after-180-days data) LifecyclePolicy/AFTER_180_DAYS
      (= :after-90-days data) LifecyclePolicy/AFTER_90_DAYS
      (= :after-14-days data) LifecyclePolicy/AFTER_14_DAYS
      (= :after-7-days data) LifecyclePolicy/AFTER_7_DAYS
      (= :after-365-days data) LifecyclePolicy/AFTER_365_DAYS
      (= :after-60-days data) LifecyclePolicy/AFTER_60_DAYS)))


(defn out-of-infrequent-access-policy
  "The `out-of-infrequent-access-policy` function data interprets values in the provided config data into a 
`OutOfInfrequentAccessPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OutOfInfrequentAccessPolicy` - the value is returned.
* is `:after-1-access` - `OutOfInfrequentAccessPolicy/AFTER_1_ACCESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OutOfInfrequentAccessPolicy data) data
      (= :after-1-access data) OutOfInfrequentAccessPolicy/AFTER_1_ACCESS)))


(defn performance-mode
  "The `performance-mode` function data interprets values in the provided config data into a 
`PerformanceMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PerformanceMode` - the value is returned.
* is `:general-purpose` - `PerformanceMode/GENERAL_PURPOSE` is returned
* is `:max-io` - `PerformanceMode/MAX_IO` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PerformanceMode data) data
      (= :general-purpose data) PerformanceMode/GENERAL_PURPOSE
      (= :max-io data) PerformanceMode/MAX_IO)))


(defn replication-overwrite-protection
  "The `replication-overwrite-protection` function data interprets values in the provided config data into a 
`ReplicationOverwriteProtection` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ReplicationOverwriteProtection` - the value is returned.
* is `:enabled` - `ReplicationOverwriteProtection/ENABLED` is returned
* is `:disabled` - `ReplicationOverwriteProtection/DISABLED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ReplicationOverwriteProtection data) data
      (= :enabled data) ReplicationOverwriteProtection/ENABLED
      (= :disabled data) ReplicationOverwriteProtection/DISABLED)))


(defn throughput-mode
  "The `throughput-mode` function data interprets values in the provided config data into a 
`ThroughputMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ThroughputMode` - the value is returned.
* is `:elastic` - `ThroughputMode/ELASTIC` is returned
* is `:bursting` - `ThroughputMode/BURSTING` is returned
* is `:provisioned` - `ThroughputMode/PROVISIONED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ThroughputMode data) data
      (= :elastic data) ThroughputMode/ELASTIC
      (= :bursting data) ThroughputMode/BURSTING
      (= :provisioned data) ThroughputMode/PROVISIONED)))


(defn build-access-point-attributes-builder
  "The build-access-point-attributes-builder function updates a AccessPointAttributes$Builder instance using the provided configuration.
  The function takes the AccessPointAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-arn` |
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `fileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:file-system` |
"
  [^AccessPointAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :access-point-arn)]
    (. builder accessPointArn data))
  (when-let [data (lookup-entry config id :access-point-id)]
    (. builder accessPointId data))
  (when-let [data (lookup-entry config id :file-system)]
    (. builder fileSystem data))
  (.build builder))


(defn access-point-attributes-builder
  ""
  [id config]
  (build-access-point-attributes-builder (new AccessPointAttributes$Builder) id config))


(defn build-access-point-builder
  "The build-access-point-builder function updates a AccessPoint$Builder instance using the provided configuration.
  The function takes the AccessPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAcl` | software.amazon.awscdk.services.efs.Acl | [[cdk.support/lookup-entry]] | `:create-acl` |
| `fileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:file-system` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `posixUser` | software.amazon.awscdk.services.efs.PosixUser | [[cdk.support/lookup-entry]] | `:posix-user` |
"
  [^AccessPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :create-acl)]
    (. builder createAcl data))
  (when-let [data (lookup-entry config id :file-system)]
    (. builder fileSystem data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :posix-user)]
    (. builder posixUser data))
  (.build builder))


(defn access-point-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-access-point-builder (AccessPoint$Builder/create scope (name id)) id config))


(defn build-access-point-options-builder
  "The build-access-point-options-builder function updates a AccessPointOptions$Builder instance using the provided configuration.
  The function takes the AccessPointOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAcl` | software.amazon.awscdk.services.efs.Acl | [[cdk.support/lookup-entry]] | `:create-acl` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `posixUser` | software.amazon.awscdk.services.efs.PosixUser | [[cdk.support/lookup-entry]] | `:posix-user` |
"
  [^AccessPointOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :create-acl)]
    (. builder createAcl data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :posix-user)]
    (. builder posixUser data))
  (.build builder))


(defn access-point-options-builder
  ""
  [id config]
  (build-access-point-options-builder (new AccessPointOptions$Builder) id config))


(defn build-access-point-props-builder
  "The build-access-point-props-builder function updates a AccessPointProps$Builder instance using the provided configuration.
  The function takes the AccessPointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAcl` | software.amazon.awscdk.services.efs.Acl | [[cdk.support/lookup-entry]] | `:create-acl` |
| `fileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:file-system` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `posixUser` | software.amazon.awscdk.services.efs.PosixUser | [[cdk.support/lookup-entry]] | `:posix-user` |
"
  [^AccessPointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :create-acl)]
    (. builder createAcl data))
  (when-let [data (lookup-entry config id :file-system)]
    (. builder fileSystem data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :posix-user)]
    (. builder posixUser data))
  (.build builder))


(defn access-point-props-builder
  ""
  [id config]
  (build-access-point-props-builder (new AccessPointProps$Builder) id config))


(defn build-acl-builder
  "The build-acl-builder function updates a Acl$Builder instance using the provided configuration.
  The function takes the Acl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ownerGid` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-gid` |
| `ownerUid` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-uid` |
| `permissions` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions` |
"
  [^Acl$Builder builder id config]
  (when-let [data (lookup-entry config id :owner-gid)]
    (. builder ownerGid data))
  (when-let [data (lookup-entry config id :owner-uid)]
    (. builder ownerUid data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (.build builder))


(defn acl-builder
  ""
  [id config]
  (build-acl-builder (new Acl$Builder) id config))


(defn build-cfn-access-point-access-point-tag-property-builder
  "The build-cfn-access-point-access-point-tag-property-builder function updates a CfnAccessPoint$AccessPointTagProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$AccessPointTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAccessPoint$AccessPointTagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-access-point-access-point-tag-property-builder
  ""
  [id config]
  (build-cfn-access-point-access-point-tag-property-builder (new CfnAccessPoint$AccessPointTagProperty$Builder) id config))


(defn build-cfn-access-point-builder
  "The build-cfn-access-point-builder function updates a CfnAccessPoint$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointTags` | java.util.List | [[cdk.support/lookup-entry]] | `:access-point-tags` |
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `posixUser` | software.amazon.awscdk.services.efs.CfnAccessPoint$PosixUserProperty | [[cdk.support/lookup-entry]] | `:posix-user` |
| `rootDirectory` | software.amazon.awscdk.services.efs.CfnAccessPoint$RootDirectoryProperty | [[cdk.support/lookup-entry]] | `:root-directory` |
"
  [^CfnAccessPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :access-point-tags)]
    (. builder accessPointTags data))
  (when-let [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :posix-user)]
    (. builder posixUser data))
  (when-let [data (lookup-entry config id :root-directory)]
    (. builder rootDirectory data))
  (.build builder))


(defn cfn-access-point-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-access-point-builder (CfnAccessPoint$Builder/create scope (name id)) id config))


(defn build-cfn-access-point-creation-info-property-builder
  "The build-cfn-access-point-creation-info-property-builder function updates a CfnAccessPoint$CreationInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$CreationInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ownerGid` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-gid` |
| `ownerUid` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-uid` |
| `permissions` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions` |
"
  [^CfnAccessPoint$CreationInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :owner-gid)]
    (. builder ownerGid data))
  (when-let [data (lookup-entry config id :owner-uid)]
    (. builder ownerUid data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (.build builder))


(defn cfn-access-point-creation-info-property-builder
  ""
  [id config]
  (build-cfn-access-point-creation-info-property-builder (new CfnAccessPoint$CreationInfoProperty$Builder) id config))


(defn build-cfn-access-point-posix-user-property-builder
  "The build-cfn-access-point-posix-user-property-builder function updates a CfnAccessPoint$PosixUserProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$PosixUserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.String | [[cdk.support/lookup-entry]] | `:gid` |
| `secondaryGids` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-gids` |
| `uid` | java.lang.String | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^CfnAccessPoint$PosixUserProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-let [data (lookup-entry config id :secondary-gids)]
    (. builder secondaryGids data))
  (when-let [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn cfn-access-point-posix-user-property-builder
  ""
  [id config]
  (build-cfn-access-point-posix-user-property-builder (new CfnAccessPoint$PosixUserProperty$Builder) id config))


(defn build-cfn-access-point-props-builder
  "The build-cfn-access-point-props-builder function updates a CfnAccessPointProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointTags` | java.util.List | [[cdk.support/lookup-entry]] | `:access-point-tags` |
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `posixUser` | software.amazon.awscdk.services.efs.CfnAccessPoint$PosixUserProperty | [[cdk.support/lookup-entry]] | `:posix-user` |
| `rootDirectory` | software.amazon.awscdk.services.efs.CfnAccessPoint$RootDirectoryProperty | [[cdk.support/lookup-entry]] | `:root-directory` |
"
  [^CfnAccessPointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-point-tags)]
    (. builder accessPointTags data))
  (when-let [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :posix-user)]
    (. builder posixUser data))
  (when-let [data (lookup-entry config id :root-directory)]
    (. builder rootDirectory data))
  (.build builder))


(defn cfn-access-point-props-builder
  ""
  [id config]
  (build-cfn-access-point-props-builder (new CfnAccessPointProps$Builder) id config))


(defn build-cfn-access-point-root-directory-property-builder
  "The build-cfn-access-point-root-directory-property-builder function updates a CfnAccessPoint$RootDirectoryProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$RootDirectoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:creation-info` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnAccessPoint$RootDirectoryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :creation-info)]
    (. builder creationInfo data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-access-point-root-directory-property-builder
  ""
  [id config]
  (build-cfn-access-point-root-directory-property-builder (new CfnAccessPoint$RootDirectoryProperty$Builder) id config))


(defn build-cfn-file-system-backup-policy-property-builder
  "The build-cfn-file-system-backup-policy-property-builder function updates a CfnFileSystem$BackupPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$BackupPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnFileSystem$BackupPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-file-system-backup-policy-property-builder
  ""
  [id config]
  (build-cfn-file-system-backup-policy-property-builder (new CfnFileSystem$BackupPolicyProperty$Builder) id config))


(defn build-cfn-file-system-builder
  "The build-cfn-file-system-builder function updates a CfnFileSystem$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-name` |
| `backupPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-policy` |
| `bypassPolicyLockoutSafetyCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-safety-check` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `fileSystemPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:file-system-policy` |
| `fileSystemProtection` | software.amazon.awscdk.services.efs.CfnFileSystem$FileSystemProtectionProperty | [[cdk.support/lookup-entry]] | `:file-system-protection` |
| `fileSystemTags` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-tags` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `lifecyclePolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-policies` |
| `performanceMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:performance-mode` |
| `provisionedThroughputInMibps` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-throughput-in-mibps` |
| `replicationConfiguration` | software.amazon.awscdk.services.efs.CfnFileSystem$ReplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `throughputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:throughput-mode` |
"
  [^CfnFileSystem$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone-name)]
    (. builder availabilityZoneName data))
  (when-let [data (lookup-entry config id :backup-policy)]
    (. builder backupPolicy data))
  (when-let [data (lookup-entry config id :bypass-policy-lockout-safety-check)]
    (. builder bypassPolicyLockoutSafetyCheck data))
  (when-let [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-let [data (lookup-entry config id :file-system-policy)]
    (. builder fileSystemPolicy data))
  (when-let [data (lookup-entry config id :file-system-protection)]
    (. builder fileSystemProtection data))
  (when-let [data (lookup-entry config id :file-system-tags)]
    (. builder fileSystemTags data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :lifecycle-policies)]
    (. builder lifecyclePolicies data))
  (when-let [data (lookup-entry config id :performance-mode)]
    (. builder performanceMode data))
  (when-let [data (lookup-entry config id :provisioned-throughput-in-mibps)]
    (. builder provisionedThroughputInMibps data))
  (when-let [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-let [data (lookup-entry config id :throughput-mode)]
    (. builder throughputMode data))
  (.build builder))


(defn cfn-file-system-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-file-system-builder (CfnFileSystem$Builder/create scope (name id)) id config))


(defn build-cfn-file-system-elastic-file-system-tag-property-builder
  "The build-cfn-file-system-elastic-file-system-tag-property-builder function updates a CfnFileSystem$ElasticFileSystemTagProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$ElasticFileSystemTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFileSystem$ElasticFileSystemTagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-file-system-elastic-file-system-tag-property-builder
  ""
  [id config]
  (build-cfn-file-system-elastic-file-system-tag-property-builder (new CfnFileSystem$ElasticFileSystemTagProperty$Builder) id config))


(defn build-cfn-file-system-file-system-protection-property-builder
  "The build-cfn-file-system-file-system-protection-property-builder function updates a CfnFileSystem$FileSystemProtectionProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$FileSystemProtectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationOverwriteProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-overwrite-protection` |
"
  [^CfnFileSystem$FileSystemProtectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :replication-overwrite-protection)]
    (. builder replicationOverwriteProtection data))
  (.build builder))


(defn cfn-file-system-file-system-protection-property-builder
  ""
  [id config]
  (build-cfn-file-system-file-system-protection-property-builder (new CfnFileSystem$FileSystemProtectionProperty$Builder) id config))


(defn build-cfn-file-system-lifecycle-policy-property-builder
  "The build-cfn-file-system-lifecycle-policy-property-builder function updates a CfnFileSystem$LifecyclePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$LifecyclePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transitionToArchive` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-to-archive` |
| `transitionToIa` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-to-ia` |
| `transitionToPrimaryStorageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:transition-to-primary-storage-class` |
"
  [^CfnFileSystem$LifecyclePolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :transition-to-archive)]
    (. builder transitionToArchive data))
  (when-let [data (lookup-entry config id :transition-to-ia)]
    (. builder transitionToIa data))
  (when-let [data (lookup-entry config id :transition-to-primary-storage-class)]
    (. builder transitionToPrimaryStorageClass data))
  (.build builder))


(defn cfn-file-system-lifecycle-policy-property-builder
  ""
  [id config]
  (build-cfn-file-system-lifecycle-policy-property-builder (new CfnFileSystem$LifecyclePolicyProperty$Builder) id config))


(defn build-cfn-file-system-props-builder
  "The build-cfn-file-system-props-builder function updates a CfnFileSystemProps$Builder instance using the provided configuration.
  The function takes the CfnFileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-name` |
| `backupPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-policy` |
| `bypassPolicyLockoutSafetyCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-safety-check` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `fileSystemPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:file-system-policy` |
| `fileSystemProtection` | software.amazon.awscdk.services.efs.CfnFileSystem$FileSystemProtectionProperty | [[cdk.support/lookup-entry]] | `:file-system-protection` |
| `fileSystemTags` | java.util.List | [[cdk.support/lookup-entry]] | `:file-system-tags` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `lifecyclePolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-policies` |
| `performanceMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:performance-mode` |
| `provisionedThroughputInMibps` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-throughput-in-mibps` |
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `throughputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:throughput-mode` |
"
  [^CfnFileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone-name)]
    (. builder availabilityZoneName data))
  (when-let [data (lookup-entry config id :backup-policy)]
    (. builder backupPolicy data))
  (when-let [data (lookup-entry config id :bypass-policy-lockout-safety-check)]
    (. builder bypassPolicyLockoutSafetyCheck data))
  (when-let [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-let [data (lookup-entry config id :file-system-policy)]
    (. builder fileSystemPolicy data))
  (when-let [data (lookup-entry config id :file-system-protection)]
    (. builder fileSystemProtection data))
  (when-let [data (lookup-entry config id :file-system-tags)]
    (. builder fileSystemTags data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :lifecycle-policies)]
    (. builder lifecyclePolicies data))
  (when-let [data (lookup-entry config id :performance-mode)]
    (. builder performanceMode data))
  (when-let [data (lookup-entry config id :provisioned-throughput-in-mibps)]
    (. builder provisionedThroughputInMibps data))
  (when-let [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-let [data (lookup-entry config id :throughput-mode)]
    (. builder throughputMode data))
  (.build builder))


(defn cfn-file-system-props-builder
  ""
  [id config]
  (build-cfn-file-system-props-builder (new CfnFileSystemProps$Builder) id config))


(defn build-cfn-file-system-replication-configuration-property-builder
  "The build-cfn-file-system-replication-configuration-property-builder function updates a CfnFileSystem$ReplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$ReplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
"
  [^CfnFileSystem$ReplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (.build builder))


(defn cfn-file-system-replication-configuration-property-builder
  ""
  [id config]
  (build-cfn-file-system-replication-configuration-property-builder (new CfnFileSystem$ReplicationConfigurationProperty$Builder) id config))


(defn build-cfn-file-system-replication-destination-property-builder
  "The build-cfn-file-system-replication-destination-property-builder function updates a CfnFileSystem$ReplicationDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnFileSystem$ReplicationDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-name` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnFileSystem$ReplicationDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone-name)]
    (. builder availabilityZoneName data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-file-system-replication-destination-property-builder
  ""
  [id config]
  (build-cfn-file-system-replication-destination-property-builder (new CfnFileSystem$ReplicationDestinationProperty$Builder) id config))


(defn build-cfn-mount-target-builder
  "The build-cfn-mount-target-builder function updates a CfnMountTarget$Builder instance using the provided configuration.
  The function takes the CfnMountTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnMountTarget$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :ip-address)]
    (. builder ipAddress data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-mount-target-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-mount-target-builder (CfnMountTarget$Builder/create scope (name id)) id config))


(defn build-cfn-mount-target-props-builder
  "The build-cfn-mount-target-props-builder function updates a CfnMountTargetProps$Builder instance using the provided configuration.
  The function takes the CfnMountTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnMountTargetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :ip-address)]
    (. builder ipAddress data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-mount-target-props-builder
  ""
  [id config]
  (build-cfn-mount-target-props-builder (new CfnMountTargetProps$Builder) id config))


(defn build-existing-file-system-props-builder
  "The build-existing-file-system-props-builder function updates a ExistingFileSystemProps$Builder instance using the provided configuration.
  The function takes the ExistingFileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationFileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:destination-file-system` |
"
  [^ExistingFileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-file-system)]
    (. builder destinationFileSystem data))
  (.build builder))


(defn existing-file-system-props-builder
  ""
  [id config]
  (build-existing-file-system-props-builder (new ExistingFileSystemProps$Builder) id config))


(defn build-file-system-attributes-builder
  "The build-file-system-attributes-builder function updates a FileSystemAttributes$Builder instance using the provided configuration.
  The function takes the FileSystemAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-arn` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
"
  [^FileSystemAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-arn)]
    (. builder fileSystemArn data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (.build builder))


(defn file-system-attributes-builder
  ""
  [id config]
  (build-file-system-attributes-builder (new FileSystemAttributes$Builder) id config))


(defn build-file-system-builder
  "The build-file-system-builder function updates a FileSystem$Builder instance using the provided configuration.
  The function takes the FileSystem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAnonymousAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-anonymous-access` |
| `enableAutomaticBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-automatic-backups` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `fileSystemName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-name` |
| `fileSystemPolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:file-system-policy` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `lifecyclePolicy` | software.amazon.awscdk.services.efs.LifecyclePolicy | [[cdk.api.services.efs/lifecycle-policy]] | `:lifecycle-policy` |
| `oneZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:one-zone` |
| `outOfInfrequentAccessPolicy` | software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy | [[cdk.api.services.efs/out-of-infrequent-access-policy]] | `:out-of-infrequent-access-policy` |
| `performanceMode` | software.amazon.awscdk.services.efs.PerformanceMode | [[cdk.api.services.efs/performance-mode]] | `:performance-mode` |
| `provisionedThroughputPerSecond` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:provisioned-throughput-per-second` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicationConfiguration` | software.amazon.awscdk.services.efs.ReplicationConfiguration | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `replicationOverwriteProtection` | software.amazon.awscdk.services.efs.ReplicationOverwriteProtection | [[cdk.api.services.efs/replication-overwrite-protection]] | `:replication-overwrite-protection` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `throughputMode` | software.amazon.awscdk.services.efs.ThroughputMode | [[cdk.api.services.efs/throughput-mode]] | `:throughput-mode` |
| `transitionToArchivePolicy` | software.amazon.awscdk.services.efs.LifecyclePolicy | [[cdk.api.services.efs/lifecycle-policy]] | `:transition-to-archive-policy` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FileSystem$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-anonymous-access)]
    (. builder allowAnonymousAccess data))
  (when-let [data (lookup-entry config id :enable-automatic-backups)]
    (. builder enableAutomaticBackups data))
  (when-let [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-let [data (lookup-entry config id :file-system-name)]
    (. builder fileSystemName data))
  (when-let [data (lookup-entry config id :file-system-policy)]
    (. builder fileSystemPolicy data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lifecycle-policy config id :lifecycle-policy)]
    (. builder lifecyclePolicy data))
  (when-let [data (lookup-entry config id :one-zone)]
    (. builder oneZone data))
  (when-let [data (out-of-infrequent-access-policy config id :out-of-infrequent-access-policy)]
    (. builder outOfInfrequentAccessPolicy data))
  (when-let [data (performance-mode config id :performance-mode)]
    (. builder performanceMode data))
  (when-let [data (lookup-entry config id :provisioned-throughput-per-second)]
    (. builder provisionedThroughputPerSecond data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-let [data (replication-overwrite-protection config id :replication-overwrite-protection)]
    (. builder replicationOverwriteProtection data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (throughput-mode config id :throughput-mode)]
    (. builder throughputMode data))
  (when-let [data (lifecycle-policy config id :transition-to-archive-policy)]
    (. builder transitionToArchivePolicy data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn file-system-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-file-system-builder (FileSystem$Builder/create scope (name id)) id config))


(defn build-file-system-props-builder
  "The build-file-system-props-builder function updates a FileSystemProps$Builder instance using the provided configuration.
  The function takes the FileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAnonymousAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-anonymous-access` |
| `enableAutomaticBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-automatic-backups` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `fileSystemName` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-name` |
| `fileSystemPolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:file-system-policy` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `lifecyclePolicy` | software.amazon.awscdk.services.efs.LifecyclePolicy | [[cdk.api.services.efs/lifecycle-policy]] | `:lifecycle-policy` |
| `oneZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:one-zone` |
| `outOfInfrequentAccessPolicy` | software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy | [[cdk.api.services.efs/out-of-infrequent-access-policy]] | `:out-of-infrequent-access-policy` |
| `performanceMode` | software.amazon.awscdk.services.efs.PerformanceMode | [[cdk.api.services.efs/performance-mode]] | `:performance-mode` |
| `provisionedThroughputPerSecond` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:provisioned-throughput-per-second` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicationConfiguration` | software.amazon.awscdk.services.efs.ReplicationConfiguration | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `replicationOverwriteProtection` | software.amazon.awscdk.services.efs.ReplicationOverwriteProtection | [[cdk.api.services.efs/replication-overwrite-protection]] | `:replication-overwrite-protection` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `throughputMode` | software.amazon.awscdk.services.efs.ThroughputMode | [[cdk.api.services.efs/throughput-mode]] | `:throughput-mode` |
| `transitionToArchivePolicy` | software.amazon.awscdk.services.efs.LifecyclePolicy | [[cdk.api.services.efs/lifecycle-policy]] | `:transition-to-archive-policy` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-anonymous-access)]
    (. builder allowAnonymousAccess data))
  (when-let [data (lookup-entry config id :enable-automatic-backups)]
    (. builder enableAutomaticBackups data))
  (when-let [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-let [data (lookup-entry config id :file-system-name)]
    (. builder fileSystemName data))
  (when-let [data (lookup-entry config id :file-system-policy)]
    (. builder fileSystemPolicy data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lifecycle-policy config id :lifecycle-policy)]
    (. builder lifecyclePolicy data))
  (when-let [data (lookup-entry config id :one-zone)]
    (. builder oneZone data))
  (when-let [data (out-of-infrequent-access-policy config id :out-of-infrequent-access-policy)]
    (. builder outOfInfrequentAccessPolicy data))
  (when-let [data (performance-mode config id :performance-mode)]
    (. builder performanceMode data))
  (when-let [data (lookup-entry config id :provisioned-throughput-per-second)]
    (. builder provisionedThroughputPerSecond data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-let [data (replication-overwrite-protection config id :replication-overwrite-protection)]
    (. builder replicationOverwriteProtection data))
  (when-let [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-let [data (throughput-mode config id :throughput-mode)]
    (. builder throughputMode data))
  (when-let [data (lifecycle-policy config id :transition-to-archive-policy)]
    (. builder transitionToArchivePolicy data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn file-system-props-builder
  ""
  [id config]
  (build-file-system-props-builder (new FileSystemProps$Builder) id config))


(defn build-one-zone-file-system-props-builder
  "The build-one-zone-file-system-props-builder function updates a OneZoneFileSystemProps$Builder instance using the provided configuration.
  The function takes the OneZoneFileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^OneZoneFileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn one-zone-file-system-props-builder
  ""
  [id config]
  (build-one-zone-file-system-props-builder (new OneZoneFileSystemProps$Builder) id config))


(defn build-posix-user-builder
  "The build-posix-user-builder function updates a PosixUser$Builder instance using the provided configuration.
  The function takes the PosixUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.String | [[cdk.support/lookup-entry]] | `:gid` |
| `secondaryGids` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-gids` |
| `uid` | java.lang.String | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^PosixUser$Builder builder id config]
  (when-let [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-let [data (lookup-entry config id :secondary-gids)]
    (. builder secondaryGids data))
  (when-let [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn posix-user-builder
  ""
  [id config]
  (build-posix-user-builder (new PosixUser$Builder) id config))


(defn build-regional-file-system-props-builder
  "The build-regional-file-system-props-builder function updates a RegionalFileSystemProps$Builder instance using the provided configuration.
  The function takes the RegionalFileSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^RegionalFileSystemProps$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn regional-file-system-props-builder
  ""
  [id config]
  (build-regional-file-system-props-builder (new RegionalFileSystemProps$Builder) id config))


(defn build-replication-configuration-props-builder
  "The build-replication-configuration-props-builder function updates a ReplicationConfigurationProps$Builder instance using the provided configuration.
  The function takes the ReplicationConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `destinationFileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:destination-file-system` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ReplicationConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-let [data (lookup-entry config id :destination-file-system)]
    (. builder destinationFileSystem data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn replication-configuration-props-builder
  ""
  [id config]
  (build-replication-configuration-props-builder (new ReplicationConfigurationProps$Builder) id config))