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


(defn cfn-db-cluster-builder
  "The cfn-db-cluster-builder function buildes out new instances of 
CfnDBCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnDBCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associated-roles)]
      (. builder associatedRoles data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :db-instance-parameter-group-name)]
      (. builder dbInstanceParameterGroupName data))
    (when-let [data (lookup-entry config id :db-port)]
      (. builder dbPort data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :iam-auth-enabled)]
      (. builder iamAuthEnabled data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :restore-to-time)]
      (. builder restoreToTime data))
    (when-let [data (lookup-entry config id :restore-type)]
      (. builder restoreType data))
    (when-let [data (lookup-entry config id :serverless-scaling-configuration)]
      (. builder serverlessScalingConfiguration data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-db-cluster-db-cluster-role-property-builder
  "The cfn-db-cluster-db-cluster-role-property-builder function buildes out new instances of 
CfnDBCluster$DBClusterRoleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDBCluster$DBClusterRoleProperty$Builder.)]
    (when-let [data (lookup-entry config id :feature-name)]
      (. builder featureName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-db-cluster-parameter-group-builder
  "The cfn-db-cluster-parameter-group-builder function buildes out new instances of 
CfnDBClusterParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBClusterParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-cluster-parameter-group-props-builder
  "The cfn-db-cluster-parameter-group-props-builder function buildes out new instances of 
CfnDBClusterParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBClusterParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-cluster-props-builder
  "The cfn-db-cluster-props-builder function buildes out new instances of 
CfnDBClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnDBClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :associated-roles)]
      (. builder associatedRoles data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :db-instance-parameter-group-name)]
      (. builder dbInstanceParameterGroupName data))
    (when-let [data (lookup-entry config id :db-port)]
      (. builder dbPort data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :iam-auth-enabled)]
      (. builder iamAuthEnabled data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :restore-to-time)]
      (. builder restoreToTime data))
    (when-let [data (lookup-entry config id :restore-type)]
      (. builder restoreType data))
    (when-let [data (lookup-entry config id :serverless-scaling-configuration)]
      (. builder serverlessScalingConfiguration data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-db-cluster-serverless-scaling-configuration-property-builder
  "The cfn-db-cluster-serverless-scaling-configuration-property-builder function buildes out new instances of 
CfnDBCluster$ServerlessScalingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (CfnDBCluster$ServerlessScalingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn cfn-db-instance-builder
  "The cfn-db-instance-builder function buildes out new instances of 
CfnDBInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-instance-class)]
      (. builder dbInstanceClass data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :db-parameter-group-name)]
      (. builder dbParameterGroupName data))
    (when-let [data (lookup-entry config id :db-snapshot-identifier)]
      (. builder dbSnapshotIdentifier data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-instance-props-builder
  "The cfn-db-instance-props-builder function buildes out new instances of 
CfnDBInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-instance-class)]
      (. builder dbInstanceClass data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :db-parameter-group-name)]
      (. builder dbParameterGroupName data))
    (when-let [data (lookup-entry config id :db-snapshot-identifier)]
      (. builder dbSnapshotIdentifier data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-parameter-group-builder
  "The cfn-db-parameter-group-builder function buildes out new instances of 
CfnDBParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-parameter-group-props-builder
  "The cfn-db-parameter-group-props-builder function buildes out new instances of 
CfnDBParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-subnet-group-builder
  "The cfn-db-subnet-group-builder function buildes out new instances of 
CfnDBSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBSubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-subnet-group-description)]
      (. builder dbSubnetGroupDescription data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-subnet-group-props-builder
  "The cfn-db-subnet-group-props-builder function buildes out new instances of 
CfnDBSubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBSubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :db-subnet-group-description)]
      (. builder dbSubnetGroupDescription data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-subscription-builder
  "The cfn-event-subscription-builder function buildes out new instances of 
CfnEventSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |"
  [stack id config]
  (let [builder (CfnEventSubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-categories)]
      (. builder eventCategories data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :source-ids)]
      (. builder sourceIds data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (.build builder)))


(defn cfn-event-subscription-props-builder
  "The cfn-event-subscription-props-builder function buildes out new instances of 
CfnEventSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |"
  [stack id config]
  (let [builder (CfnEventSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-categories)]
      (. builder eventCategories data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :source-ids)]
      (. builder sourceIds data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (.build builder)))