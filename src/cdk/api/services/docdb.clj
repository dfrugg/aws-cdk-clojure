(ns cdk.api.services.docdb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.docdb package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api :refer [removal-policy]]
            [cdk.api.services.logs :refer [retention-days]])
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


(defn backup-props-builder
  "The backup-props-builder function buildes out new instances of 
BackupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-window` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |"
  [stack id config]
  (let [builder (BackupProps$Builder.)]
    (when-let [data (lookup-entry config id :preferred-window)]
      (. builder preferredWindow data))
    (when-let [data (lookup-entry config id :retention)]
      (. builder retention data))
    (.build builder)))


(defn cfn-db-cluster-builder
  "The cfn-db-cluster-builder function buildes out new instances of 
CfnDBCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnDBCluster$Builder/create stack id)]
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
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :restore-to-time)]
      (. builder restoreToTime data))
    (when-let [data (lookup-entry config id :restore-type)]
      (. builder restoreType data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnDBClusterProps$Builder.)]
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
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :restore-to-time)]
      (. builder restoreToTime data))
    (when-let [data (lookup-entry config id :restore-type)]
      (. builder restoreType data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-db-instance-builder
  "The cfn-db-instance-builder function buildes out new instances of 
CfnDBInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ca-certificate-identifier)]
      (. builder caCertificateIdentifier data))
    (when-let [data (lookup-entry config id :certificate-rotation-restart)]
      (. builder certificateRotationRestart data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-instance-class)]
      (. builder dbInstanceClass data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
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
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `certificateRotationRestart` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:certificate-rotation-restart` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ca-certificate-identifier)]
      (. builder caCertificateIdentifier data))
    (when-let [data (lookup-entry config id :certificate-rotation-restart)]
      (. builder certificateRotationRestart data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-instance-class)]
      (. builder dbInstanceClass data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
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
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |"
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
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
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
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |"
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
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (.build builder)))


(defn cluster-parameter-group-builder
  "The cluster-parameter-group-builder function buildes out new instances of 
ClusterParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (ClusterParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cluster-parameter-group-props-builder
  "The cluster-parameter-group-props-builder function buildes out new instances of 
ClusterParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (ClusterParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn database-cluster-attributes-builder
  "The database-cluster-attributes-builder function buildes out new instances of 
DatabaseClusterAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-address` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `instanceEndpointAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-endpoint-addresses` |
| `instanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-identifiers` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `readerEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:reader-endpoint-address` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |"
  [stack id config]
  (let [builder (DatabaseClusterAttributes$Builder.)]
    (when-let [data (lookup-entry config id :cluster-endpoint-address)]
      (. builder clusterEndpointAddress data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :instance-endpoint-addresses)]
      (. builder instanceEndpointAddresses data))
    (when-let [data (lookup-entry config id :instance-identifiers)]
      (. builder instanceIdentifiers data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :reader-endpoint-address)]
      (. builder readerEndpointAddress data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (.build builder)))


(defn database-cluster-builder
  "The database-cluster-builder function buildes out new instances of 
DatabaseCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backup)]
      (. builder backup data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (retention-days config id :cloud-watch-logs-retention)]
      (. builder cloudWatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloud-watch-logs-retention-role)]
      (. builder cloudWatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :db-cluster-name)]
      (. builder dbClusterName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :export-audit-logs-to-cloud-watch)]
      (. builder exportAuditLogsToCloudWatch data))
    (when-let [data (lookup-entry config id :export-profiler-logs-to-cloud-watch)]
      (. builder exportProfilerLogsToCloudWatch data))
    (when-let [data (lookup-entry config id :instance-identifier-base)]
      (. builder instanceIdentifierBase data))
    (when-let [data (removal-policy config id :instance-removal-policy)]
      (. builder instanceRemovalPolicy data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :master-user)]
      (. builder masterUser data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (removal-policy config id :security-group-removal-policy)]
      (. builder securityGroupRemovalPolicy data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-cluster-props-builder
  "The database-cluster-props-builder function buildes out new instances of 
DatabaseClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :backup)]
      (. builder backup data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (retention-days config id :cloud-watch-logs-retention)]
      (. builder cloudWatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloud-watch-logs-retention-role)]
      (. builder cloudWatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :db-cluster-name)]
      (. builder dbClusterName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :export-audit-logs-to-cloud-watch)]
      (. builder exportAuditLogsToCloudWatch data))
    (when-let [data (lookup-entry config id :export-profiler-logs-to-cloud-watch)]
      (. builder exportProfilerLogsToCloudWatch data))
    (when-let [data (lookup-entry config id :instance-identifier-base)]
      (. builder instanceIdentifierBase data))
    (when-let [data (removal-policy config id :instance-removal-policy)]
      (. builder instanceRemovalPolicy data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :master-user)]
      (. builder masterUser data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (removal-policy config id :security-group-removal-policy)]
      (. builder securityGroupRemovalPolicy data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-attributes-builder
  "The database-instance-attributes-builder function buildes out new instances of 
DatabaseInstanceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-endpoint-address` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (DatabaseInstanceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :instance-endpoint-address)]
      (. builder instanceEndpointAddress data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn database-instance-builder
  "The database-instance-builder function buildes out new instances of 
DatabaseInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (DatabaseInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :db-instance-name)]
      (. builder dbInstanceName data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn database-instance-props-builder
  "The database-instance-props-builder function buildes out new instances of 
DatabaseInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (DatabaseInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :db-instance-name)]
      (. builder dbInstanceName data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn database-secret-builder
  "The database-secret-builder function buildes out new instances of 
DatabaseSecret$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (DatabaseSecret$Builder/create stack id)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn database-secret-props-builder
  "The database-secret-props-builder function buildes out new instances of 
DatabaseSecretProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (DatabaseSecretProps$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn login-builder
  "The login-builder function buildes out new instances of 
Login$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (Login$Builder.)]
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn rotation-multi-user-options-builder
  "The rotation-multi-user-options-builder function buildes out new instances of 
RotationMultiUserOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |"
  [stack id config]
  (let [builder (RotationMultiUserOptions$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (.build builder)))