(ns cdk.api.services.neptune
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.neptune package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.neptune CfnDBCluster$Builder
                                                    CfnDBCluster$DBClusterRoleProperty$Builder
                                                    CfnDBCluster$ServerlessScalingConfigurationProperty$Builder
                                                    CfnDBClusterParameterGroup$Builder
                                                    CfnDBClusterParameterGroupProps$Builder
                                                    CfnDBClusterProps$Builder
                                                    CfnDBInstance$Builder
                                                    CfnDBInstanceProps$Builder
                                                    CfnDBParameterGroup$Builder
                                                    CfnDBParameterGroupProps$Builder
                                                    CfnDBSubnetGroup$Builder
                                                    CfnDBSubnetGroupProps$Builder
                                                    CfnEventSubscription$Builder
                                                    CfnEventSubscriptionProps$Builder]))


(defn cfn-db-cluster-builder>
  "The cfn-db-cluster-builder> function updates a CfnDBCluster$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:associated-roles` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `dbInstanceParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-parameter-group-name` |
| `dbPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:db-port` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `iamAuthEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-auth-enabled` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `restoreToTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-to-time` |
| `restoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-type` |
| `serverlessScalingConfiguration` | software.amazon.awscdk.services.neptune.CfnDBCluster$ServerlessScalingConfigurationProperty | [[cdk.support/lookup-entry]] | `:serverless-scaling-configuration` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useLatestRestorableTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnDBCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :associated-roles)]
    (. builder associatedRoles data))
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
  (when-some [data (lookup-entry config id :db-instance-parameter-group-name)]
    (. builder dbInstanceParameterGroupName data))
  (when-some [data (lookup-entry config id :db-port)]
    (. builder dbPort data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :iam-auth-enabled)]
    (. builder iamAuthEnabled data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :restore-to-time)]
    (. builder restoreToTime data))
  (when-some [data (lookup-entry config id :restore-type)]
    (. builder restoreType data))
  (when-some [data (lookup-entry config id :serverless-scaling-configuration)]
    (. builder serverlessScalingConfiguration data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-db-cluster-builder
  "Creates a  `CfnDBCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-cluster-builder> (CfnDBCluster$Builder/create scope (name id)) id config))


(defn cfn-db-cluster-db-cluster-role-property-builder>
  "The cfn-db-cluster-db-cluster-role-property-builder> function updates a CfnDBCluster$DBClusterRoleProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$DBClusterRoleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDBCluster$DBClusterRoleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :feature-name)]
    (. builder featureName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-db-cluster-db-cluster-role-property-builder
  "Creates a  `CfnDBCluster$DBClusterRoleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-db-cluster-db-cluster-role-property-builder> (new CfnDBCluster$DBClusterRoleProperty$Builder) id config))


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
  "Creates a  `CfnDBClusterParameterGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  "Creates a  `CfnDBClusterParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-db-cluster-parameter-group-props-builder> (new CfnDBClusterParameterGroupProps$Builder) id config))


(defn cfn-db-cluster-props-builder>
  "The cfn-db-cluster-props-builder> function updates a CfnDBClusterProps$Builder instance using the provided configuration.
  The function takes the CfnDBClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedRoles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associated-roles` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `dbInstanceParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-parameter-group-name` |
| `dbPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:db-port` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `iamAuthEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-auth-enabled` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `restoreToTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-to-time` |
| `restoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-type` |
| `serverlessScalingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:serverless-scaling-configuration` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useLatestRestorableTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnDBClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :associated-roles)]
    (. builder associatedRoles data))
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
  (when-some [data (lookup-entry config id :db-instance-parameter-group-name)]
    (. builder dbInstanceParameterGroupName data))
  (when-some [data (lookup-entry config id :db-port)]
    (. builder dbPort data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :iam-auth-enabled)]
    (. builder iamAuthEnabled data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :restore-to-time)]
    (. builder restoreToTime data))
  (when-some [data (lookup-entry config id :restore-type)]
    (. builder restoreType data))
  (when-some [data (lookup-entry config id :serverless-scaling-configuration)]
    (. builder serverlessScalingConfiguration data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-db-cluster-props-builder
  "Creates a  `CfnDBClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-db-cluster-props-builder> (new CfnDBClusterProps$Builder) id config))


(defn cfn-db-cluster-serverless-scaling-configuration-property-builder>
  "The cfn-db-cluster-serverless-scaling-configuration-property-builder> function updates a CfnDBCluster$ServerlessScalingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$ServerlessScalingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^CfnDBCluster$ServerlessScalingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn cfn-db-cluster-serverless-scaling-configuration-property-builder
  "Creates a  `CfnDBCluster$ServerlessScalingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-db-cluster-serverless-scaling-configuration-property-builder> (new CfnDBCluster$ServerlessScalingConfigurationProperty$Builder) id config))


(defn cfn-db-instance-builder>
  "The cfn-db-instance-builder> function updates a CfnDBInstance$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `dbSnapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-snapshot-identifier` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-instance-class)]
    (. builder dbInstanceClass data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :db-parameter-group-name)]
    (. builder dbParameterGroupName data))
  (when-some [data (lookup-entry config id :db-snapshot-identifier)]
    (. builder dbSnapshotIdentifier data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-instance-builder
  "Creates a  `CfnDBInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-instance-builder> (CfnDBInstance$Builder/create scope (name id)) id config))


(defn cfn-db-instance-props-builder>
  "The cfn-db-instance-props-builder> function updates a CfnDBInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnDBInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `dbSnapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-snapshot-identifier` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-instance-class)]
    (. builder dbInstanceClass data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :db-parameter-group-name)]
    (. builder dbParameterGroupName data))
  (when-some [data (lookup-entry config id :db-snapshot-identifier)]
    (. builder dbSnapshotIdentifier data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-instance-props-builder
  "Creates a  `CfnDBInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-db-instance-props-builder> (new CfnDBInstanceProps$Builder) id config))


(defn cfn-db-parameter-group-builder>
  "The cfn-db-parameter-group-builder> function updates a CfnDBParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnDBParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
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
  [^CfnDBParameterGroup$Builder builder id config]
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


(defn cfn-db-parameter-group-builder
  "Creates a  `CfnDBParameterGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-parameter-group-builder> (CfnDBParameterGroup$Builder/create scope (name id)) id config))


(defn cfn-db-parameter-group-props-builder>
  "The cfn-db-parameter-group-props-builder> function updates a CfnDBParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
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
  [^CfnDBParameterGroupProps$Builder builder id config]
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


(defn cfn-db-parameter-group-props-builder
  "Creates a  `CfnDBParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-db-parameter-group-props-builder> (new CfnDBParameterGroupProps$Builder) id config))


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
  "Creates a  `CfnDBSubnetGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  "Creates a  `CfnDBSubnetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (.build builder))


(defn cfn-event-subscription-builder
  "Creates a  `CfnEventSubscription$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
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
  (.build builder))


(defn cfn-event-subscription-props-builder
  "Creates a  `CfnEventSubscriptionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-event-subscription-props-builder> (new CfnEventSubscriptionProps$Builder) id config))