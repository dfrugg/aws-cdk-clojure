(ns cdk.api.services.docdbelastic
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.docdbelastic package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.docdbelastic CfnCluster$Builder
                                                         CfnClusterProps$Builder]))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-user-name` |
| `adminUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-user-password` |
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `shardCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-capacity` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `shardInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-instance-count` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :admin-user-name)]
      (. builder adminUserName data))
    (when-let [data (lookup-entry config id :admin-user-password)]
      (. builder adminUserPassword data))
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :shard-capacity)]
      (. builder shardCapacity data))
    (when-let [data (lookup-entry config id :shard-count)]
      (. builder shardCount data))
    (when-let [data (lookup-entry config id :shard-instance-count)]
      (. builder shardInstanceCount data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-user-name` |
| `adminUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-user-password` |
| `authType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-type` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `shardCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-capacity` |
| `shardCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-count` |
| `shardInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shard-instance-count` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :admin-user-name)]
      (. builder adminUserName data))
    (when-let [data (lookup-entry config id :admin-user-password)]
      (. builder adminUserPassword data))
    (when-let [data (lookup-entry config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :shard-capacity)]
      (. builder shardCapacity data))
    (when-let [data (lookup-entry config id :shard-count)]
      (. builder shardCount data))
    (when-let [data (lookup-entry config id :shard-instance-count)]
      (. builder shardInstanceCount data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))