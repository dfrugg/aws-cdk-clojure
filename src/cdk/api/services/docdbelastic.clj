(ns cdk.api.services.docdbelastic
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.docdbelastic package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.docdbelastic CfnCluster$Builder
                                                         CfnClusterProps$Builder]))


(defn cfn-cluster-builder>
  "The cfn-cluster-builder> function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-user-name)]
    (. builder adminUserName data))
  (when-some [data (lookup-entry config id :admin-user-password)]
    (. builder adminUserPassword data))
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :shard-capacity)]
    (. builder shardCapacity data))
  (when-some [data (lookup-entry config id :shard-count)]
    (. builder shardCount data))
  (when-some [data (lookup-entry config id :shard-instance-count)]
    (. builder shardInstanceCount data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-cluster-builder
  "Creates a  `CfnCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-builder> (CfnCluster$Builder/create scope (name id)) id config))


(defn cfn-cluster-props-builder>
  "The cfn-cluster-props-builder> function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-user-name)]
    (. builder adminUserName data))
  (when-some [data (lookup-entry config id :admin-user-password)]
    (. builder adminUserPassword data))
  (when-some [data (lookup-entry config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :shard-capacity)]
    (. builder shardCapacity data))
  (when-some [data (lookup-entry config id :shard-count)]
    (. builder shardCount data))
  (when-some [data (lookup-entry config id :shard-instance-count)]
    (. builder shardInstanceCount data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-cluster-props-builder
  "Creates a  `CfnClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-props-builder> (new CfnClusterProps$Builder) id config))