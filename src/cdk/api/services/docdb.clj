(ns cdk.api.services.docdb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.docdb package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.docdb BackupProps$Builder
                                                  CfnDBCluster$Builder
                                                  CfnDBClusterParameterGroup$Builder
                                                  CfnDBClusterParameterGroupProps$Builder
                                                  CfnDBClusterProps$Builder
                                                  CfnDBInstance$Builder
                                                  CfnDBInstanceProps$Builder
                                                  CfnDBSubnetGroup$Builder
                                                  CfnDBSubnetGroupProps$Builder
                                                  CfnEventSubscription$Builder
                                                  CfnEventSubscriptionProps$Builder
                                                  ClusterParameterGroup$Builder
                                                  ClusterParameterGroupProps$Builder
                                                  DatabaseCluster$Builder
                                                  DatabaseClusterAttributes$Builder
                                                  DatabaseClusterProps$Builder
                                                  DatabaseInstance$Builder
                                                  DatabaseInstanceAttributes$Builder
                                                  DatabaseInstanceProps$Builder
                                                  DatabaseSecret$Builder
                                                  DatabaseSecretProps$Builder
                                                  Login$Builder
                                                  RotationMultiUserOptions$Builder]))


(defn backup-props-builder>
  "The backup-props-builder> function updates a BackupProps$Builder instance using the provided configuration.
  The function takes the BackupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-window` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
"
  [^BackupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :preferred-window)]
    (. builder preferredWindow data))
  (when-some [data (lookup-entry config id :retention)]
    (. builder retention data))
  (.build builder))


(defn backup-props-builder
  "Creates a  `BackupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[backup-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (backup-props-builder> (new BackupProps$Builder) id config))


(defn cfn-db-cluster-builder>
  "The cfn-db-cluster-builder> function updates a CfnDBCluster$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `copyTagsToSnapshot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `restoreToTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-to-time` |
| `restoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-type` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useLatestRestorableTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnDBCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :restore-to-time)]
    (. builder restoreToTime data))
  (when-some [data (lookup-entry config id :restore-type)]
    (. builder restoreType data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-db-cluster-builder
  "Creates a  `CfnDBCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-cluster-builder> (CfnDBCluster$Builder/create scope (name id)) id config))


(defn cfn-db-cluster-parameter-group-builder>
  "The cfn-db-cluster-parameter-group-builder> function updates a CfnDBClusterParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnDBClusterParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBClusterParameterGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-cluster-parameter-group-builder
  "Creates a  `CfnDBClusterParameterGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-cluster-parameter-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-cluster-parameter-group-builder> (CfnDBClusterParameterGroup$Builder/create scope (name id)) id config))


(defn cfn-db-cluster-parameter-group-props-builder>
  "The cfn-db-cluster-parameter-group-props-builder> function updates a CfnDBClusterParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBClusterParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBClusterParameterGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-cluster-parameter-group-props-builder
  "Creates a  `CfnDBClusterParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-parameter-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-parameter-group-props-builder> (new CfnDBClusterParameterGroupProps$Builder) id config))


(defn cfn-db-cluster-props-builder>
  "The cfn-db-cluster-props-builder> function updates a CfnDBClusterProps$Builder instance using the provided configuration.
  The function takes the CfnDBClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `copyTagsToSnapshot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `restoreToTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-to-time` |
| `restoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-type` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useLatestRestorableTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnDBClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :restore-to-time)]
    (. builder restoreToTime data))
  (when-some [data (lookup-entry config id :restore-type)]
    (. builder restoreType data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-db-cluster-props-builder
  "Creates a  `CfnDBClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-props-builder> (new CfnDBClusterProps$Builder) id config))


(defn cfn-db-instance-builder>
  "The cfn-db-instance-builder> function updates a CfnDBInstance$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `certificateRotationRestart` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:certificate-rotation-restart` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `enablePerformanceInsights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :ca-certificate-identifier)]
    (. builder caCertificateIdentifier data))
  (when-some [data (lookup-entry config id :certificate-rotation-restart)]
    (. builder certificateRotationRestart data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-instance-class)]
    (. builder dbInstanceClass data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-instance-builder
  "Creates a  `CfnDBInstance$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-instance-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-instance-builder> (CfnDBInstance$Builder/create scope (name id)) id config))


(defn cfn-db-instance-props-builder>
  "The cfn-db-instance-props-builder> function updates a CfnDBInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnDBInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `certificateRotationRestart` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:certificate-rotation-restart` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :ca-certificate-identifier)]
    (. builder caCertificateIdentifier data))
  (when-some [data (lookup-entry config id :certificate-rotation-restart)]
    (. builder certificateRotationRestart data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-instance-class)]
    (. builder dbInstanceClass data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-instance-props-builder
  "Creates a  `CfnDBInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-props-builder> (new CfnDBInstanceProps$Builder) id config))


(defn cfn-db-subnet-group-builder>
  "The cfn-db-subnet-group-builder> function updates a CfnDBSubnetGroup$Builder instance using the provided configuration.
  The function takes the CfnDBSubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBSubnetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :db-subnet-group-description)]
    (. builder dbSubnetGroupDescription data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-subnet-group-builder
  "Creates a  `CfnDBSubnetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-subnet-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-subnet-group-builder> (CfnDBSubnetGroup$Builder/create scope (name id)) id config))


(defn cfn-db-subnet-group-props-builder>
  "The cfn-db-subnet-group-props-builder> function updates a CfnDBSubnetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBSubnetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBSubnetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-subnet-group-description)]
    (. builder dbSubnetGroupDescription data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-subnet-group-props-builder
  "Creates a  `CfnDBSubnetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-subnet-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-subnet-group-props-builder> (new CfnDBSubnetGroupProps$Builder) id config))


(defn cfn-event-subscription-builder>
  "The cfn-event-subscription-builder> function updates a CfnEventSubscription$Builder instance using the provided configuration.
  The function takes the CfnEventSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
"
  [^CfnEventSubscription$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :event-categories)]
    (. builder eventCategories data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-some [data (lookup-entry config id :source-ids)]
    (. builder sourceIds data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (when-some [data (lookup-entry config id :subscription-name)]
    (. builder subscriptionName data))
  (.build builder))


(defn cfn-event-subscription-builder
  "Creates a  `CfnEventSubscription$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-event-subscription-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-event-subscription-builder> (CfnEventSubscription$Builder/create scope (name id)) id config))


(defn cfn-event-subscription-props-builder>
  "The cfn-event-subscription-props-builder> function updates a CfnEventSubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnEventSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
"
  [^CfnEventSubscriptionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :event-categories)]
    (. builder eventCategories data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-some [data (lookup-entry config id :source-ids)]
    (. builder sourceIds data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (when-some [data (lookup-entry config id :subscription-name)]
    (. builder subscriptionName data))
  (.build builder))


(defn cfn-event-subscription-props-builder
  "Creates a  `CfnEventSubscriptionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-event-subscription-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-event-subscription-props-builder> (new CfnEventSubscriptionProps$Builder) id config))


(defn cluster-parameter-group-builder>
  "The cluster-parameter-group-builder> function updates a ClusterParameterGroup$Builder instance using the provided configuration.
  The function takes the ClusterParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^ClusterParameterGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cluster-parameter-group-builder
  "Creates a  `ClusterParameterGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cluster-parameter-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cluster-parameter-group-builder> (ClusterParameterGroup$Builder/create scope (name id)) id config))


(defn cluster-parameter-group-props-builder>
  "The cluster-parameter-group-props-builder> function updates a ClusterParameterGroupProps$Builder instance using the provided configuration.
  The function takes the ClusterParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^ClusterParameterGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cluster-parameter-group-props-builder
  "Creates a  `ClusterParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-parameter-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-parameter-group-props-builder> (new ClusterParameterGroupProps$Builder) id config))


(defn database-cluster-attributes-builder>
  "The database-cluster-attributes-builder> function updates a DatabaseClusterAttributes$Builder instance using the provided configuration.
  The function takes the DatabaseClusterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-address` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `instanceEndpointAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-endpoint-addresses` |
| `instanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-identifiers` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `readerEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:reader-endpoint-address` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
"
  [^DatabaseClusterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-endpoint-address)]
    (. builder clusterEndpointAddress data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :instance-endpoint-addresses)]
    (. builder instanceEndpointAddresses data))
  (when-some [data (lookup-entry config id :instance-identifiers)]
    (. builder instanceIdentifiers data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :reader-endpoint-address)]
    (. builder readerEndpointAddress data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (.build builder))


(defn database-cluster-attributes-builder
  "Creates a  `DatabaseClusterAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-cluster-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-cluster-attributes-builder> (new DatabaseClusterAttributes$Builder) id config))


(defn database-cluster-builder>
  "The database-cluster-builder> function updates a DatabaseCluster$Builder instance using the provided configuration.
  The function takes the DatabaseCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backup` | software.amazon.awscdk.services.docdb.BackupProps | [[cdk.support/lookup-entry]] | `:backup` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudWatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloud-watch-logs-retention` |
| `cloudWatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `dbClusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `exportAuditLogsToCloudWatch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:export-audit-logs-to-cloud-watch` |
| `exportProfilerLogsToCloudWatch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:export-profiler-logs-to-cloud-watch` |
| `instanceIdentifierBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier-base` |
| `instanceRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:instance-removal-policy` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instances` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `masterUser` | software.amazon.awscdk.services.docdb.Login | [[cdk.support/lookup-entry]] | `:master-user` |
| `parameterGroup` | software.amazon.awscdk.services.docdb.IClusterParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `securityGroupRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:security-group-removal-policy` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :backup)]
    (. builder backup data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (retention-days config id :cloud-watch-logs-retention)]
    (. builder cloudWatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloud-watch-logs-retention-role)]
    (. builder cloudWatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :db-cluster-name)]
    (. builder dbClusterName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :export-audit-logs-to-cloud-watch)]
    (. builder exportAuditLogsToCloudWatch data))
  (when-some [data (lookup-entry config id :export-profiler-logs-to-cloud-watch)]
    (. builder exportProfilerLogsToCloudWatch data))
  (when-some [data (lookup-entry config id :instance-identifier-base)]
    (. builder instanceIdentifierBase data))
  (when-some [data (removal-policy config id :instance-removal-policy)]
    (. builder instanceRemovalPolicy data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :master-user)]
    (. builder masterUser data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (removal-policy config id :security-group-removal-policy)]
    (. builder securityGroupRemovalPolicy data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-cluster-builder
  "Creates a  `DatabaseCluster$Builder` instance using a scope and ID, applies the data configuration using the [[database-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-cluster-builder> (DatabaseCluster$Builder/create scope (name id)) id config))


(defn database-cluster-props-builder>
  "The database-cluster-props-builder> function updates a DatabaseClusterProps$Builder instance using the provided configuration.
  The function takes the DatabaseClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backup` | software.amazon.awscdk.services.docdb.BackupProps | [[cdk.support/lookup-entry]] | `:backup` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudWatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloud-watch-logs-retention` |
| `cloudWatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `dbClusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `exportAuditLogsToCloudWatch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:export-audit-logs-to-cloud-watch` |
| `exportProfilerLogsToCloudWatch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:export-profiler-logs-to-cloud-watch` |
| `instanceIdentifierBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier-base` |
| `instanceRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:instance-removal-policy` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instances` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `masterUser` | software.amazon.awscdk.services.docdb.Login | [[cdk.support/lookup-entry]] | `:master-user` |
| `parameterGroup` | software.amazon.awscdk.services.docdb.IClusterParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `securityGroupRemovalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:security-group-removal-policy` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup)]
    (. builder backup data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (retention-days config id :cloud-watch-logs-retention)]
    (. builder cloudWatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloud-watch-logs-retention-role)]
    (. builder cloudWatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :db-cluster-name)]
    (. builder dbClusterName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :export-audit-logs-to-cloud-watch)]
    (. builder exportAuditLogsToCloudWatch data))
  (when-some [data (lookup-entry config id :export-profiler-logs-to-cloud-watch)]
    (. builder exportProfilerLogsToCloudWatch data))
  (when-some [data (lookup-entry config id :instance-identifier-base)]
    (. builder instanceIdentifierBase data))
  (when-some [data (removal-policy config id :instance-removal-policy)]
    (. builder instanceRemovalPolicy data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :master-user)]
    (. builder masterUser data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (removal-policy config id :security-group-removal-policy)]
    (. builder securityGroupRemovalPolicy data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-cluster-props-builder
  "Creates a  `DatabaseClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-cluster-props-builder> (new DatabaseClusterProps$Builder) id config))


(defn database-instance-attributes-builder>
  "The database-instance-attributes-builder> function updates a DatabaseInstanceAttributes$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-endpoint-address` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^DatabaseInstanceAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-endpoint-address)]
    (. builder instanceEndpointAddress data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn database-instance-attributes-builder
  "Creates a  `DatabaseInstanceAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-attributes-builder> (new DatabaseInstanceAttributes$Builder) id config))


(defn database-instance-builder>
  "The database-instance-builder> function updates a DatabaseInstance$Builder instance using the provided configuration.
  The function takes the DatabaseInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cluster` | software.amazon.awscdk.services.docdb.IDatabaseCluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `dbInstanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-name` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^DatabaseInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :db-instance-name)]
    (. builder dbInstanceName data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn database-instance-builder
  "Creates a  `DatabaseInstance$Builder` instance using a scope and ID, applies the data configuration using the [[database-instance-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-instance-builder> (DatabaseInstance$Builder/create scope (name id)) id config))


(defn database-instance-props-builder>
  "The database-instance-props-builder> function updates a DatabaseInstanceProps$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cluster` | software.amazon.awscdk.services.docdb.IDatabaseCluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `dbInstanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-name` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^DatabaseInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :db-instance-name)]
    (. builder dbInstanceName data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn database-instance-props-builder
  "Creates a  `DatabaseInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-props-builder> (new DatabaseInstanceProps$Builder) id config))


(defn database-secret-builder>
  "The database-secret-builder> function updates a DatabaseSecret$Builder instance using the provided configuration.
  The function takes the DatabaseSecret$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^DatabaseSecret$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn database-secret-builder
  "Creates a  `DatabaseSecret$Builder` instance using a scope and ID, applies the data configuration using the [[database-secret-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-secret-builder> (DatabaseSecret$Builder/create scope (name id)) id config))


(defn database-secret-props-builder>
  "The database-secret-props-builder> function updates a DatabaseSecretProps$Builder instance using the provided configuration.
  The function takes the DatabaseSecretProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^DatabaseSecretProps$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn database-secret-props-builder
  "Creates a  `DatabaseSecretProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-secret-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-secret-props-builder> (new DatabaseSecretProps$Builder) id config))


(defn login-builder>
  "The login-builder> function updates a Login$Builder instance using the provided configuration.
  The function takes the Login$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^Login$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn login-builder
  "Creates a  `Login$Builder` instance using a no-argument constructor, applies the data configuration using the [[login-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (login-builder> (new Login$Builder) id config))


(defn rotation-multi-user-options-builder>
  "The rotation-multi-user-options-builder> function updates a RotationMultiUserOptions$Builder instance using the provided configuration.
  The function takes the RotationMultiUserOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
"
  [^RotationMultiUserOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (.build builder))


(defn rotation-multi-user-options-builder
  "Creates a  `RotationMultiUserOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[rotation-multi-user-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (rotation-multi-user-options-builder> (new RotationMultiUserOptions$Builder) id config))