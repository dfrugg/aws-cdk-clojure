(ns cdk.api.services.elasticache
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticache package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticache CfnCacheCluster$Builder
                                                        CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty$Builder
                                                        CfnCacheCluster$DestinationDetailsProperty$Builder
                                                        CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty$Builder
                                                        CfnCacheCluster$LogDeliveryConfigurationRequestProperty$Builder
                                                        CfnCacheClusterProps$Builder
                                                        CfnGlobalReplicationGroup$Builder
                                                        CfnGlobalReplicationGroup$GlobalReplicationGroupMemberProperty$Builder
                                                        CfnGlobalReplicationGroup$RegionalConfigurationProperty$Builder
                                                        CfnGlobalReplicationGroup$ReshardingConfigurationProperty$Builder
                                                        CfnGlobalReplicationGroupProps$Builder
                                                        CfnParameterGroup$Builder
                                                        CfnParameterGroupProps$Builder
                                                        CfnReplicationGroup$Builder
                                                        CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty$Builder
                                                        CfnReplicationGroup$DestinationDetailsProperty$Builder
                                                        CfnReplicationGroup$KinesisFirehoseDestinationDetailsProperty$Builder
                                                        CfnReplicationGroup$LogDeliveryConfigurationRequestProperty$Builder
                                                        CfnReplicationGroup$NodeGroupConfigurationProperty$Builder
                                                        CfnReplicationGroupProps$Builder
                                                        CfnSecurityGroup$Builder
                                                        CfnSecurityGroupIngress$Builder
                                                        CfnSecurityGroupIngressProps$Builder
                                                        CfnSecurityGroupProps$Builder
                                                        CfnServerlessCache$Builder
                                                        CfnServerlessCache$CacheUsageLimitsProperty$Builder
                                                        CfnServerlessCache$DataStorageProperty$Builder
                                                        CfnServerlessCache$ECPUPerSecondProperty$Builder
                                                        CfnServerlessCache$EndpointProperty$Builder
                                                        CfnServerlessCacheProps$Builder
                                                        CfnSubnetGroup$Builder
                                                        CfnSubnetGroupProps$Builder
                                                        CfnUser$AuthenticationModeProperty$Builder
                                                        CfnUser$Builder
                                                        CfnUserGroup$Builder
                                                        CfnUserGroupProps$Builder
                                                        CfnUserProps$Builder]))


(defn build-cfn-cache-cluster-builder
  "The build-cfn-cache-cluster-builder function updates a CfnCacheCluster$Builder instance using the provided configuration.
  The function takes the CfnCacheCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `azMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:az-mode` |
| `cacheNodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-node-type` |
| `cacheParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-name` |
| `cacheSecurityGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-security-group-names` |
| `cacheSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-subnet-group-name` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `ipDiscovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-discovery` |
| `logDeliveryConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-delivery-configurations` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
| `numCacheNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-cache-nodes` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredAvailabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-availability-zone` |
| `preferredAvailabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:preferred-availability-zones` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `snapshotArns` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `snapshotWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnCacheCluster$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-let [data (lookup-entry config id :az-mode)]
    (. builder azMode data))
  (when-let [data (lookup-entry config id :cache-node-type)]
    (. builder cacheNodeType data))
  (when-let [data (lookup-entry config id :cache-parameter-group-name)]
    (. builder cacheParameterGroupName data))
  (when-let [data (lookup-entry config id :cache-security-group-names)]
    (. builder cacheSecurityGroupNames data))
  (when-let [data (lookup-entry config id :cache-subnet-group-name)]
    (. builder cacheSubnetGroupName data))
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :ip-discovery)]
    (. builder ipDiscovery data))
  (when-let [data (lookup-entry config id :log-delivery-configurations)]
    (. builder logDeliveryConfigurations data))
  (when-let [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (when-let [data (lookup-entry config id :num-cache-nodes)]
    (. builder numCacheNodes data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :preferred-availability-zone)]
    (. builder preferredAvailabilityZone data))
  (when-let [data (lookup-entry config id :preferred-availability-zones)]
    (. builder preferredAvailabilityZones data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :snapshot-arns)]
    (. builder snapshotArns data))
  (when-let [data (lookup-entry config id :snapshot-name)]
    (. builder snapshotName data))
  (when-let [data (lookup-entry config id :snapshot-retention-limit)]
    (. builder snapshotRetentionLimit data))
  (when-let [data (lookup-entry config id :snapshot-window)]
    (. builder snapshotWindow data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-encryption-enabled)]
    (. builder transitEncryptionEnabled data))
  (when-let [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-cache-cluster-builder
  "Creates a  `CfnCacheCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-cache-cluster-builder (CfnCacheCluster$Builder/create scope (name id)) id config))


(defn build-cfn-cache-cluster-cloud-watch-logs-destination-details-property-builder
  "The build-cfn-cache-cluster-cloud-watch-logs-destination-details-property-builder function updates a CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn cfn-cache-cluster-cloud-watch-logs-destination-details-property-builder
  "Creates a  `CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cache-cluster-cloud-watch-logs-destination-details-property-builder (new CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty$Builder) id config))


(defn build-cfn-cache-cluster-destination-details-property-builder
  "The build-cfn-cache-cluster-destination-details-property-builder function updates a CfnCacheCluster$DestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCacheCluster$DestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsDetails` | software.amazon.awscdk.services.elasticache.CfnCacheCluster$CloudWatchLogsDestinationDetailsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-details` |
| `kinesisFirehoseDetails` | software.amazon.awscdk.services.elasticache.CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-details` |
"
  [^CfnCacheCluster$DestinationDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs-details)]
    (. builder cloudWatchLogsDetails data))
  (when-let [data (lookup-entry config id :kinesis-firehose-details)]
    (. builder kinesisFirehoseDetails data))
  (.build builder))


(defn cfn-cache-cluster-destination-details-property-builder
  "Creates a  `CfnCacheCluster$DestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cache-cluster-destination-details-property-builder (new CfnCacheCluster$DestinationDetailsProperty$Builder) id config))


(defn build-cfn-cache-cluster-kinesis-firehose-destination-details-property-builder
  "The build-cfn-cache-cluster-kinesis-firehose-destination-details-property-builder function updates a CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
"
  [^CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream)]
    (. builder deliveryStream data))
  (.build builder))


(defn cfn-cache-cluster-kinesis-firehose-destination-details-property-builder
  "Creates a  `CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cache-cluster-kinesis-firehose-destination-details-property-builder (new CfnCacheCluster$KinesisFirehoseDestinationDetailsProperty$Builder) id config))


(defn build-cfn-cache-cluster-log-delivery-configuration-request-property-builder
  "The build-cfn-cache-cluster-log-delivery-configuration-request-property-builder function updates a CfnCacheCluster$LogDeliveryConfigurationRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnCacheCluster$LogDeliveryConfigurationRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationDetails` | software.amazon.awscdk.services.elasticache.CfnCacheCluster$DestinationDetailsProperty | [[cdk.support/lookup-entry]] | `:destination-details` |
| `destinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-type` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
"
  [^CfnCacheCluster$LogDeliveryConfigurationRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-details)]
    (. builder destinationDetails data))
  (when-let [data (lookup-entry config id :destination-type)]
    (. builder destinationType data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-type)]
    (. builder logType data))
  (.build builder))


(defn cfn-cache-cluster-log-delivery-configuration-request-property-builder
  "Creates a  `CfnCacheCluster$LogDeliveryConfigurationRequestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cache-cluster-log-delivery-configuration-request-property-builder (new CfnCacheCluster$LogDeliveryConfigurationRequestProperty$Builder) id config))


(defn build-cfn-cache-cluster-props-builder
  "The build-cfn-cache-cluster-props-builder function updates a CfnCacheClusterProps$Builder instance using the provided configuration.
  The function takes the CfnCacheClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `azMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:az-mode` |
| `cacheNodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-node-type` |
| `cacheParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-name` |
| `cacheSecurityGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-security-group-names` |
| `cacheSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-subnet-group-name` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `ipDiscovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-discovery` |
| `logDeliveryConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-delivery-configurations` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
| `numCacheNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-cache-nodes` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredAvailabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-availability-zone` |
| `preferredAvailabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:preferred-availability-zones` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `snapshotArns` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `snapshotWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-window` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnCacheClusterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-let [data (lookup-entry config id :az-mode)]
    (. builder azMode data))
  (when-let [data (lookup-entry config id :cache-node-type)]
    (. builder cacheNodeType data))
  (when-let [data (lookup-entry config id :cache-parameter-group-name)]
    (. builder cacheParameterGroupName data))
  (when-let [data (lookup-entry config id :cache-security-group-names)]
    (. builder cacheSecurityGroupNames data))
  (when-let [data (lookup-entry config id :cache-subnet-group-name)]
    (. builder cacheSubnetGroupName data))
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :ip-discovery)]
    (. builder ipDiscovery data))
  (when-let [data (lookup-entry config id :log-delivery-configurations)]
    (. builder logDeliveryConfigurations data))
  (when-let [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (when-let [data (lookup-entry config id :num-cache-nodes)]
    (. builder numCacheNodes data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :preferred-availability-zone)]
    (. builder preferredAvailabilityZone data))
  (when-let [data (lookup-entry config id :preferred-availability-zones)]
    (. builder preferredAvailabilityZones data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :snapshot-arns)]
    (. builder snapshotArns data))
  (when-let [data (lookup-entry config id :snapshot-name)]
    (. builder snapshotName data))
  (when-let [data (lookup-entry config id :snapshot-retention-limit)]
    (. builder snapshotRetentionLimit data))
  (when-let [data (lookup-entry config id :snapshot-window)]
    (. builder snapshotWindow data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-encryption-enabled)]
    (. builder transitEncryptionEnabled data))
  (when-let [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-cache-cluster-props-builder
  "Creates a  `CfnCacheClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cache-cluster-props-builder (new CfnCacheClusterProps$Builder) id config))


(defn build-cfn-global-replication-group-builder
  "The build-cfn-global-replication-group-builder function updates a CfnGlobalReplicationGroup$Builder instance using the provided configuration.
  The function takes the CfnGlobalReplicationGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticFailoverEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:automatic-failover-enabled` |
| `cacheNodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-node-type` |
| `cacheParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-name` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalNodeGroupCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:global-node-group-count` |
| `globalReplicationGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-replication-group-description` |
| `globalReplicationGroupIdSuffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-replication-group-id-suffix` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `regionalConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regional-configurations` |
"
  [^CfnGlobalReplicationGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :automatic-failover-enabled)]
    (. builder automaticFailoverEnabled data))
  (when-let [data (lookup-entry config id :cache-node-type)]
    (. builder cacheNodeType data))
  (when-let [data (lookup-entry config id :cache-parameter-group-name)]
    (. builder cacheParameterGroupName data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :global-node-group-count)]
    (. builder globalNodeGroupCount data))
  (when-let [data (lookup-entry config id :global-replication-group-description)]
    (. builder globalReplicationGroupDescription data))
  (when-let [data (lookup-entry config id :global-replication-group-id-suffix)]
    (. builder globalReplicationGroupIdSuffix data))
  (when-let [data (lookup-entry config id :members)]
    (. builder members data))
  (when-let [data (lookup-entry config id :regional-configurations)]
    (. builder regionalConfigurations data))
  (.build builder))


(defn cfn-global-replication-group-builder
  "Creates a  `CfnGlobalReplicationGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-global-replication-group-builder (CfnGlobalReplicationGroup$Builder/create scope (name id)) id config))


(defn build-cfn-global-replication-group-global-replication-group-member-property-builder
  "The build-cfn-global-replication-group-global-replication-group-member-property-builder function updates a CfnGlobalReplicationGroup$GlobalReplicationGroupMemberProperty$Builder instance using the provided configuration.
  The function takes the CfnGlobalReplicationGroup$GlobalReplicationGroupMemberProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-id` |
| `replicationGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-region` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
"
  [^CfnGlobalReplicationGroup$GlobalReplicationGroupMemberProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :replication-group-id)]
    (. builder replicationGroupId data))
  (when-let [data (lookup-entry config id :replication-group-region)]
    (. builder replicationGroupRegion data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn cfn-global-replication-group-global-replication-group-member-property-builder
  "Creates a  `CfnGlobalReplicationGroup$GlobalReplicationGroupMemberProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-global-replication-group-global-replication-group-member-property-builder (new CfnGlobalReplicationGroup$GlobalReplicationGroupMemberProperty$Builder) id config))


(defn build-cfn-global-replication-group-props-builder
  "The build-cfn-global-replication-group-props-builder function updates a CfnGlobalReplicationGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGlobalReplicationGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticFailoverEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic-failover-enabled` |
| `cacheNodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-node-type` |
| `cacheParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-name` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalNodeGroupCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:global-node-group-count` |
| `globalReplicationGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-replication-group-description` |
| `globalReplicationGroupIdSuffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-replication-group-id-suffix` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `regionalConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regional-configurations` |
"
  [^CfnGlobalReplicationGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :automatic-failover-enabled)]
    (. builder automaticFailoverEnabled data))
  (when-let [data (lookup-entry config id :cache-node-type)]
    (. builder cacheNodeType data))
  (when-let [data (lookup-entry config id :cache-parameter-group-name)]
    (. builder cacheParameterGroupName data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :global-node-group-count)]
    (. builder globalNodeGroupCount data))
  (when-let [data (lookup-entry config id :global-replication-group-description)]
    (. builder globalReplicationGroupDescription data))
  (when-let [data (lookup-entry config id :global-replication-group-id-suffix)]
    (. builder globalReplicationGroupIdSuffix data))
  (when-let [data (lookup-entry config id :members)]
    (. builder members data))
  (when-let [data (lookup-entry config id :regional-configurations)]
    (. builder regionalConfigurations data))
  (.build builder))


(defn cfn-global-replication-group-props-builder
  "Creates a  `CfnGlobalReplicationGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-global-replication-group-props-builder (new CfnGlobalReplicationGroupProps$Builder) id config))


(defn build-cfn-global-replication-group-regional-configuration-property-builder
  "The build-cfn-global-replication-group-regional-configuration-property-builder function updates a CfnGlobalReplicationGroup$RegionalConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGlobalReplicationGroup$RegionalConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-id` |
| `replicationGroupRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-region` |
| `reshardingConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resharding-configurations` |
"
  [^CfnGlobalReplicationGroup$RegionalConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :replication-group-id)]
    (. builder replicationGroupId data))
  (when-let [data (lookup-entry config id :replication-group-region)]
    (. builder replicationGroupRegion data))
  (when-let [data (lookup-entry config id :resharding-configurations)]
    (. builder reshardingConfigurations data))
  (.build builder))


(defn cfn-global-replication-group-regional-configuration-property-builder
  "Creates a  `CfnGlobalReplicationGroup$RegionalConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-global-replication-group-regional-configuration-property-builder (new CfnGlobalReplicationGroup$RegionalConfigurationProperty$Builder) id config))


(defn build-cfn-global-replication-group-resharding-configuration-property-builder
  "The build-cfn-global-replication-group-resharding-configuration-property-builder function updates a CfnGlobalReplicationGroup$ReshardingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGlobalReplicationGroup$ReshardingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nodeGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-group-id` |
| `preferredAvailabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:preferred-availability-zones` |
"
  [^CfnGlobalReplicationGroup$ReshardingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :node-group-id)]
    (. builder nodeGroupId data))
  (when-let [data (lookup-entry config id :preferred-availability-zones)]
    (. builder preferredAvailabilityZones data))
  (.build builder))


(defn cfn-global-replication-group-resharding-configuration-property-builder
  "Creates a  `CfnGlobalReplicationGroup$ReshardingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-global-replication-group-resharding-configuration-property-builder (new CfnGlobalReplicationGroup$ReshardingConfigurationProperty$Builder) id config))


(defn build-cfn-parameter-group-builder
  "The build-cfn-parameter-group-builder function updates a CfnParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheParameterGroupFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-family` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnParameterGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-parameter-group-family)]
    (. builder cacheParameterGroupFamily data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-parameter-group-builder
  "Creates a  `CfnParameterGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-parameter-group-builder (CfnParameterGroup$Builder/create scope (name id)) id config))


(defn build-cfn-parameter-group-props-builder
  "The build-cfn-parameter-group-props-builder function updates a CfnParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheParameterGroupFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-family` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnParameterGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-parameter-group-family)]
    (. builder cacheParameterGroupFamily data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-parameter-group-props-builder
  "Creates a  `CfnParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-parameter-group-props-builder (new CfnParameterGroupProps$Builder) id config))


(defn build-cfn-replication-group-builder
  "The build-cfn-replication-group-builder function updates a CfnReplicationGroup$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `atRestEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:at-rest-encryption-enabled` |
| `authToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-token` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `automaticFailoverEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic-failover-enabled` |
| `cacheNodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-node-type` |
| `cacheParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-name` |
| `cacheSecurityGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-security-group-names` |
| `cacheSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-subnet-group-name` |
| `clusterMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-mode` |
| `dataTieringEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-tiering-enabled` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalReplicationGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-replication-group-id` |
| `ipDiscovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-discovery` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logDeliveryConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-delivery-configurations` |
| `multiAzEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az-enabled` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `nodeGroupConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:node-group-configuration` |
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
| `numCacheClusters` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-cache-clusters` |
| `numNodeGroups` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-node-groups` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredCacheClusterAZs` | java.util.List | [[cdk.support/lookup-entry]] | `:preferred-cache-cluster-a-zs` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `primaryClusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-cluster-id` |
| `replicasPerNodeGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replicas-per-node-group` |
| `replicationGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-description` |
| `replicationGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-id` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `snapshotArns` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `snapshotWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-window` |
| `snapshottingClusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshotting-cluster-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `transitEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption-mode` |
| `userGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:user-group-ids` |
"
  [^CfnReplicationGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :at-rest-encryption-enabled)]
    (. builder atRestEncryptionEnabled data))
  (when-let [data (lookup-entry config id :auth-token)]
    (. builder authToken data))
  (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-let [data (lookup-entry config id :automatic-failover-enabled)]
    (. builder automaticFailoverEnabled data))
  (when-let [data (lookup-entry config id :cache-node-type)]
    (. builder cacheNodeType data))
  (when-let [data (lookup-entry config id :cache-parameter-group-name)]
    (. builder cacheParameterGroupName data))
  (when-let [data (lookup-entry config id :cache-security-group-names)]
    (. builder cacheSecurityGroupNames data))
  (when-let [data (lookup-entry config id :cache-subnet-group-name)]
    (. builder cacheSubnetGroupName data))
  (when-let [data (lookup-entry config id :cluster-mode)]
    (. builder clusterMode data))
  (when-let [data (lookup-entry config id :data-tiering-enabled)]
    (. builder dataTieringEnabled data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :global-replication-group-id)]
    (. builder globalReplicationGroupId data))
  (when-let [data (lookup-entry config id :ip-discovery)]
    (. builder ipDiscovery data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :log-delivery-configurations)]
    (. builder logDeliveryConfigurations data))
  (when-let [data (lookup-entry config id :multi-az-enabled)]
    (. builder multiAzEnabled data))
  (when-let [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-let [data (lookup-entry config id :node-group-configuration)]
    (. builder nodeGroupConfiguration data))
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (when-let [data (lookup-entry config id :num-cache-clusters)]
    (. builder numCacheClusters data))
  (when-let [data (lookup-entry config id :num-node-groups)]
    (. builder numNodeGroups data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :preferred-cache-cluster-a-zs)]
    (. builder preferredCacheClusterAZs data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :primary-cluster-id)]
    (. builder primaryClusterId data))
  (when-let [data (lookup-entry config id :replicas-per-node-group)]
    (. builder replicasPerNodeGroup data))
  (when-let [data (lookup-entry config id :replication-group-description)]
    (. builder replicationGroupDescription data))
  (when-let [data (lookup-entry config id :replication-group-id)]
    (. builder replicationGroupId data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :snapshot-arns)]
    (. builder snapshotArns data))
  (when-let [data (lookup-entry config id :snapshot-name)]
    (. builder snapshotName data))
  (when-let [data (lookup-entry config id :snapshot-retention-limit)]
    (. builder snapshotRetentionLimit data))
  (when-let [data (lookup-entry config id :snapshot-window)]
    (. builder snapshotWindow data))
  (when-let [data (lookup-entry config id :snapshotting-cluster-id)]
    (. builder snapshottingClusterId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-encryption-enabled)]
    (. builder transitEncryptionEnabled data))
  (when-let [data (lookup-entry config id :transit-encryption-mode)]
    (. builder transitEncryptionMode data))
  (when-let [data (lookup-entry config id :user-group-ids)]
    (. builder userGroupIds data))
  (.build builder))


(defn cfn-replication-group-builder
  "Creates a  `CfnReplicationGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-replication-group-builder (CfnReplicationGroup$Builder/create scope (name id)) id config))


(defn build-cfn-replication-group-cloud-watch-logs-destination-details-property-builder
  "The build-cfn-replication-group-cloud-watch-logs-destination-details-property-builder function updates a CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn cfn-replication-group-cloud-watch-logs-destination-details-property-builder
  "Creates a  `CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-replication-group-cloud-watch-logs-destination-details-property-builder (new CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty$Builder) id config))


(defn build-cfn-replication-group-destination-details-property-builder
  "The build-cfn-replication-group-destination-details-property-builder function updates a CfnReplicationGroup$DestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroup$DestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsDetails` | software.amazon.awscdk.services.elasticache.CfnReplicationGroup$CloudWatchLogsDestinationDetailsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-details` |
| `kinesisFirehoseDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-details` |
"
  [^CfnReplicationGroup$DestinationDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs-details)]
    (. builder cloudWatchLogsDetails data))
  (when-let [data (lookup-entry config id :kinesis-firehose-details)]
    (. builder kinesisFirehoseDetails data))
  (.build builder))


(defn cfn-replication-group-destination-details-property-builder
  "Creates a  `CfnReplicationGroup$DestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-replication-group-destination-details-property-builder (new CfnReplicationGroup$DestinationDetailsProperty$Builder) id config))


(defn build-cfn-replication-group-kinesis-firehose-destination-details-property-builder
  "The build-cfn-replication-group-kinesis-firehose-destination-details-property-builder function updates a CfnReplicationGroup$KinesisFirehoseDestinationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroup$KinesisFirehoseDestinationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
"
  [^CfnReplicationGroup$KinesisFirehoseDestinationDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream)]
    (. builder deliveryStream data))
  (.build builder))


(defn cfn-replication-group-kinesis-firehose-destination-details-property-builder
  "Creates a  `CfnReplicationGroup$KinesisFirehoseDestinationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-replication-group-kinesis-firehose-destination-details-property-builder (new CfnReplicationGroup$KinesisFirehoseDestinationDetailsProperty$Builder) id config))


(defn build-cfn-replication-group-log-delivery-configuration-request-property-builder
  "The build-cfn-replication-group-log-delivery-configuration-request-property-builder function updates a CfnReplicationGroup$LogDeliveryConfigurationRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroup$LogDeliveryConfigurationRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-details` |
| `destinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-type` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
"
  [^CfnReplicationGroup$LogDeliveryConfigurationRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-details)]
    (. builder destinationDetails data))
  (when-let [data (lookup-entry config id :destination-type)]
    (. builder destinationType data))
  (when-let [data (lookup-entry config id :log-format)]
    (. builder logFormat data))
  (when-let [data (lookup-entry config id :log-type)]
    (. builder logType data))
  (.build builder))


(defn cfn-replication-group-log-delivery-configuration-request-property-builder
  "Creates a  `CfnReplicationGroup$LogDeliveryConfigurationRequestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-replication-group-log-delivery-configuration-request-property-builder (new CfnReplicationGroup$LogDeliveryConfigurationRequestProperty$Builder) id config))


(defn build-cfn-replication-group-node-group-configuration-property-builder
  "The build-cfn-replication-group-node-group-configuration-property-builder function updates a CfnReplicationGroup$NodeGroupConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroup$NodeGroupConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nodeGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-group-id` |
| `primaryAvailabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-availability-zone` |
| `replicaAvailabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-availability-zones` |
| `replicaCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replica-count` |
| `slots` | java.lang.String | [[cdk.support/lookup-entry]] | `:slots` |
"
  [^CfnReplicationGroup$NodeGroupConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :node-group-id)]
    (. builder nodeGroupId data))
  (when-let [data (lookup-entry config id :primary-availability-zone)]
    (. builder primaryAvailabilityZone data))
  (when-let [data (lookup-entry config id :replica-availability-zones)]
    (. builder replicaAvailabilityZones data))
  (when-let [data (lookup-entry config id :replica-count)]
    (. builder replicaCount data))
  (when-let [data (lookup-entry config id :slots)]
    (. builder slots data))
  (.build builder))


(defn cfn-replication-group-node-group-configuration-property-builder
  "Creates a  `CfnReplicationGroup$NodeGroupConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-replication-group-node-group-configuration-property-builder (new CfnReplicationGroup$NodeGroupConfigurationProperty$Builder) id config))


(defn build-cfn-replication-group-props-builder
  "The build-cfn-replication-group-props-builder function updates a CfnReplicationGroupProps$Builder instance using the provided configuration.
  The function takes the CfnReplicationGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `atRestEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:at-rest-encryption-enabled` |
| `authToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-token` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `automaticFailoverEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:automatic-failover-enabled` |
| `cacheNodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-node-type` |
| `cacheParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-parameter-group-name` |
| `cacheSecurityGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-security-group-names` |
| `cacheSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-subnet-group-name` |
| `clusterMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-mode` |
| `dataTieringEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:data-tiering-enabled` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalReplicationGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-replication-group-id` |
| `ipDiscovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-discovery` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logDeliveryConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:log-delivery-configurations` |
| `multiAzEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az-enabled` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `nodeGroupConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:node-group-configuration` |
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
| `numCacheClusters` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-cache-clusters` |
| `numNodeGroups` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-node-groups` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredCacheClusterAZs` | java.util.List | [[cdk.support/lookup-entry]] | `:preferred-cache-cluster-a-zs` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `primaryClusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-cluster-id` |
| `replicasPerNodeGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replicas-per-node-group` |
| `replicationGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-description` |
| `replicationGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-group-id` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `snapshotArns` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `snapshotWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-window` |
| `snapshottingClusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshotting-cluster-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `transitEncryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption-mode` |
| `userGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:user-group-ids` |
"
  [^CfnReplicationGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :at-rest-encryption-enabled)]
    (. builder atRestEncryptionEnabled data))
  (when-let [data (lookup-entry config id :auth-token)]
    (. builder authToken data))
  (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-let [data (lookup-entry config id :automatic-failover-enabled)]
    (. builder automaticFailoverEnabled data))
  (when-let [data (lookup-entry config id :cache-node-type)]
    (. builder cacheNodeType data))
  (when-let [data (lookup-entry config id :cache-parameter-group-name)]
    (. builder cacheParameterGroupName data))
  (when-let [data (lookup-entry config id :cache-security-group-names)]
    (. builder cacheSecurityGroupNames data))
  (when-let [data (lookup-entry config id :cache-subnet-group-name)]
    (. builder cacheSubnetGroupName data))
  (when-let [data (lookup-entry config id :cluster-mode)]
    (. builder clusterMode data))
  (when-let [data (lookup-entry config id :data-tiering-enabled)]
    (. builder dataTieringEnabled data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :global-replication-group-id)]
    (. builder globalReplicationGroupId data))
  (when-let [data (lookup-entry config id :ip-discovery)]
    (. builder ipDiscovery data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :log-delivery-configurations)]
    (. builder logDeliveryConfigurations data))
  (when-let [data (lookup-entry config id :multi-az-enabled)]
    (. builder multiAzEnabled data))
  (when-let [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-let [data (lookup-entry config id :node-group-configuration)]
    (. builder nodeGroupConfiguration data))
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (when-let [data (lookup-entry config id :num-cache-clusters)]
    (. builder numCacheClusters data))
  (when-let [data (lookup-entry config id :num-node-groups)]
    (. builder numNodeGroups data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :preferred-cache-cluster-a-zs)]
    (. builder preferredCacheClusterAZs data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :primary-cluster-id)]
    (. builder primaryClusterId data))
  (when-let [data (lookup-entry config id :replicas-per-node-group)]
    (. builder replicasPerNodeGroup data))
  (when-let [data (lookup-entry config id :replication-group-description)]
    (. builder replicationGroupDescription data))
  (when-let [data (lookup-entry config id :replication-group-id)]
    (. builder replicationGroupId data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :snapshot-arns)]
    (. builder snapshotArns data))
  (when-let [data (lookup-entry config id :snapshot-name)]
    (. builder snapshotName data))
  (when-let [data (lookup-entry config id :snapshot-retention-limit)]
    (. builder snapshotRetentionLimit data))
  (when-let [data (lookup-entry config id :snapshot-window)]
    (. builder snapshotWindow data))
  (when-let [data (lookup-entry config id :snapshotting-cluster-id)]
    (. builder snapshottingClusterId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-encryption-enabled)]
    (. builder transitEncryptionEnabled data))
  (when-let [data (lookup-entry config id :transit-encryption-mode)]
    (. builder transitEncryptionMode data))
  (when-let [data (lookup-entry config id :user-group-ids)]
    (. builder userGroupIds data))
  (.build builder))


(defn cfn-replication-group-props-builder
  "Creates a  `CfnReplicationGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-replication-group-props-builder (new CfnReplicationGroupProps$Builder) id config))


(defn build-cfn-security-group-builder
  "The build-cfn-security-group-builder function updates a CfnSecurityGroup$Builder instance using the provided configuration.
  The function takes the CfnSecurityGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSecurityGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-security-group-builder
  "Creates a  `CfnSecurityGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-security-group-builder (CfnSecurityGroup$Builder/create scope (name id)) id config))


(defn build-cfn-security-group-ingress-builder
  "The build-cfn-security-group-ingress-builder function updates a CfnSecurityGroupIngress$Builder instance using the provided configuration.
  The function takes the CfnSecurityGroupIngress$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-security-group-name` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnSecurityGroupIngress$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-security-group-name)]
    (. builder cacheSecurityGroupName data))
  (when-let [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-security-group-ingress-builder
  "Creates a  `CfnSecurityGroupIngress$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-security-group-ingress-builder (CfnSecurityGroupIngress$Builder/create scope (name id)) id config))


(defn build-cfn-security-group-ingress-props-builder
  "The build-cfn-security-group-ingress-props-builder function updates a CfnSecurityGroupIngressProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityGroupIngressProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-security-group-name` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnSecurityGroupIngressProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-security-group-name)]
    (. builder cacheSecurityGroupName data))
  (when-let [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-security-group-ingress-props-builder
  "Creates a  `CfnSecurityGroupIngressProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-security-group-ingress-props-builder (new CfnSecurityGroupIngressProps$Builder) id config))


(defn build-cfn-security-group-props-builder
  "The build-cfn-security-group-props-builder function updates a CfnSecurityGroupProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSecurityGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-security-group-props-builder
  "Creates a  `CfnSecurityGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-security-group-props-builder (new CfnSecurityGroupProps$Builder) id config))


(defn build-cfn-serverless-cache-builder
  "The build-cfn-serverless-cache-builder function updates a CfnServerlessCache$Builder instance using the provided configuration.
  The function takes the CfnServerlessCache$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheUsageLimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-usage-limits` |
| `dailySnapshotTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:daily-snapshot-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | software.amazon.awscdk.services.elasticache.CfnServerlessCache$EndpointProperty | [[cdk.support/lookup-entry]] | `:endpoint` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `finalSnapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:final-snapshot-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `majorEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-engine-version` |
| `readerEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reader-endpoint` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serverlessCacheName` | java.lang.String | [[cdk.support/lookup-entry]] | `:serverless-cache-name` |
| `snapshotArnsToRestore` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns-to-restore` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group-id` |
"
  [^CfnServerlessCache$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-usage-limits)]
    (. builder cacheUsageLimits data))
  (when-let [data (lookup-entry config id :daily-snapshot-time)]
    (. builder dailySnapshotTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :final-snapshot-name)]
    (. builder finalSnapshotName data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :major-engine-version)]
    (. builder majorEngineVersion data))
  (when-let [data (lookup-entry config id :reader-endpoint)]
    (. builder readerEndpoint data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :serverless-cache-name)]
    (. builder serverlessCacheName data))
  (when-let [data (lookup-entry config id :snapshot-arns-to-restore)]
    (. builder snapshotArnsToRestore data))
  (when-let [data (lookup-entry config id :snapshot-retention-limit)]
    (. builder snapshotRetentionLimit data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-group-id)]
    (. builder userGroupId data))
  (.build builder))


(defn cfn-serverless-cache-builder
  "Creates a  `CfnServerlessCache$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-serverless-cache-builder (CfnServerlessCache$Builder/create scope (name id)) id config))


(defn build-cfn-serverless-cache-cache-usage-limits-property-builder
  "The build-cfn-serverless-cache-cache-usage-limits-property-builder function updates a CfnServerlessCache$CacheUsageLimitsProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCache$CacheUsageLimitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-storage` |
| `ecpuPerSecond` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ecpu-per-second` |
"
  [^CfnServerlessCache$CacheUsageLimitsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-storage)]
    (. builder dataStorage data))
  (when-let [data (lookup-entry config id :ecpu-per-second)]
    (. builder ecpuPerSecond data))
  (.build builder))


(defn cfn-serverless-cache-cache-usage-limits-property-builder
  "Creates a  `CfnServerlessCache$CacheUsageLimitsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-serverless-cache-cache-usage-limits-property-builder (new CfnServerlessCache$CacheUsageLimitsProperty$Builder) id config))


(defn build-cfn-serverless-cache-data-storage-property-builder
  "The build-cfn-serverless-cache-data-storage-property-builder function updates a CfnServerlessCache$DataStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCache$DataStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnServerlessCache$DataStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum)]
    (. builder maximum data))
  (when-let [data (lookup-entry config id :minimum)]
    (. builder minimum data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-serverless-cache-data-storage-property-builder
  "Creates a  `CfnServerlessCache$DataStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-serverless-cache-data-storage-property-builder (new CfnServerlessCache$DataStorageProperty$Builder) id config))


(defn build-cfn-serverless-cache-ecpu-per-second-property-builder
  "The build-cfn-serverless-cache-ecpu-per-second-property-builder function updates a CfnServerlessCache$ECPUPerSecondProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCache$ECPUPerSecondProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |
"
  [^CfnServerlessCache$ECPUPerSecondProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum)]
    (. builder maximum data))
  (when-let [data (lookup-entry config id :minimum)]
    (. builder minimum data))
  (.build builder))


(defn cfn-serverless-cache-ecpu-per-second-property-builder
  "Creates a  `CfnServerlessCache$ECPUPerSecondProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-serverless-cache-ecpu-per-second-property-builder (new CfnServerlessCache$ECPUPerSecondProperty$Builder) id config))


(defn build-cfn-serverless-cache-endpoint-property-builder
  "The build-cfn-serverless-cache-endpoint-property-builder function updates a CfnServerlessCache$EndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCache$EndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnServerlessCache$EndpointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address)]
    (. builder address data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-serverless-cache-endpoint-property-builder
  "Creates a  `CfnServerlessCache$EndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-serverless-cache-endpoint-property-builder (new CfnServerlessCache$EndpointProperty$Builder) id config))


(defn build-cfn-serverless-cache-props-builder
  "The build-cfn-serverless-cache-props-builder function updates a CfnServerlessCacheProps$Builder instance using the provided configuration.
  The function takes the CfnServerlessCacheProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheUsageLimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-usage-limits` |
| `dailySnapshotTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:daily-snapshot-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `finalSnapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:final-snapshot-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `majorEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-engine-version` |
| `readerEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reader-endpoint` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serverlessCacheName` | java.lang.String | [[cdk.support/lookup-entry]] | `:serverless-cache-name` |
| `snapshotArnsToRestore` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns-to-restore` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group-id` |
"
  [^CfnServerlessCacheProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-usage-limits)]
    (. builder cacheUsageLimits data))
  (when-let [data (lookup-entry config id :daily-snapshot-time)]
    (. builder dailySnapshotTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :final-snapshot-name)]
    (. builder finalSnapshotName data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :major-engine-version)]
    (. builder majorEngineVersion data))
  (when-let [data (lookup-entry config id :reader-endpoint)]
    (. builder readerEndpoint data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :serverless-cache-name)]
    (. builder serverlessCacheName data))
  (when-let [data (lookup-entry config id :snapshot-arns-to-restore)]
    (. builder snapshotArnsToRestore data))
  (when-let [data (lookup-entry config id :snapshot-retention-limit)]
    (. builder snapshotRetentionLimit data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-group-id)]
    (. builder userGroupId data))
  (.build builder))


(defn cfn-serverless-cache-props-builder
  "Creates a  `CfnServerlessCacheProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-serverless-cache-props-builder (new CfnServerlessCacheProps$Builder) id config))


(defn build-cfn-subnet-group-builder
  "The build-cfn-subnet-group-builder function updates a CfnSubnetGroup$Builder instance using the provided configuration.
  The function takes the CfnSubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-subnet-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubnetGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-subnet-group-name)]
    (. builder cacheSubnetGroupName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-subnet-group-builder
  "Creates a  `CfnSubnetGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-subnet-group-builder (CfnSubnetGroup$Builder/create scope (name id)) id config))


(defn build-cfn-subnet-group-props-builder
  "The build-cfn-subnet-group-props-builder function updates a CfnSubnetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnSubnetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-subnet-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubnetGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cache-subnet-group-name)]
    (. builder cacheSubnetGroupName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-subnet-group-props-builder
  "Creates a  `CfnSubnetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subnet-group-props-builder (new CfnSubnetGroupProps$Builder) id config))


(defn build-cfn-user-authentication-mode-property-builder
  "The build-cfn-user-authentication-mode-property-builder function updates a CfnUser$AuthenticationModeProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$AuthenticationModeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwords` | java.util.List | [[cdk.support/lookup-entry]] | `:passwords` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnUser$AuthenticationModeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :passwords)]
    (. builder passwords data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-user-authentication-mode-property-builder
  "Creates a  `CfnUser$AuthenticationModeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-authentication-mode-property-builder (new CfnUser$AuthenticationModeProperty$Builder) id config))


(defn build-cfn-user-builder
  "The build-cfn-user-builder function updates a CfnUser$Builder instance using the provided configuration.
  The function takes the CfnUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessString` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-string` |
| `authenticationMode` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `noPasswordRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-password-required` |
| `passwords` | java.util.List | [[cdk.support/lookup-entry]] | `:passwords` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUser$Builder builder id config]
  (when-let [data (lookup-entry config id :access-string)]
    (. builder accessString data))
  (when-let [data (lookup-entry config id :authentication-mode)]
    (. builder authenticationMode data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :no-password-required)]
    (. builder noPasswordRequired data))
  (when-let [data (lookup-entry config id :passwords)]
    (. builder passwords data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-id)]
    (. builder userId data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-builder
  "Creates a  `CfnUser$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-user-builder (CfnUser$Builder/create scope (name id)) id config))


(defn build-cfn-user-group-builder
  "The build-cfn-user-group-builder function updates a CfnUserGroup$Builder instance using the provided configuration.
  The function takes the CfnUserGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group-id` |
| `userIds` | java.util.List | [[cdk.support/lookup-entry]] | `:user-ids` |
"
  [^CfnUserGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-group-id)]
    (. builder userGroupId data))
  (when-let [data (lookup-entry config id :user-ids)]
    (. builder userIds data))
  (.build builder))


(defn cfn-user-group-builder
  "Creates a  `CfnUserGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-user-group-builder (CfnUserGroup$Builder/create scope (name id)) id config))


(defn build-cfn-user-group-props-builder
  "The build-cfn-user-group-props-builder function updates a CfnUserGroupProps$Builder instance using the provided configuration.
  The function takes the CfnUserGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group-id` |
| `userIds` | java.util.List | [[cdk.support/lookup-entry]] | `:user-ids` |
"
  [^CfnUserGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-group-id)]
    (. builder userGroupId data))
  (when-let [data (lookup-entry config id :user-ids)]
    (. builder userIds data))
  (.build builder))


(defn cfn-user-group-props-builder
  "Creates a  `CfnUserGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-group-props-builder (new CfnUserGroupProps$Builder) id config))


(defn build-cfn-user-props-builder
  "The build-cfn-user-props-builder function updates a CfnUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessString` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-string` |
| `authenticationMode` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `noPasswordRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-password-required` |
| `passwords` | java.util.List | [[cdk.support/lookup-entry]] | `:passwords` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-string)]
    (. builder accessString data))
  (when-let [data (lookup-entry config id :authentication-mode)]
    (. builder authenticationMode data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :no-password-required)]
    (. builder noPasswordRequired data))
  (when-let [data (lookup-entry config id :passwords)]
    (. builder passwords data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-id)]
    (. builder userId data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-props-builder
  "Creates a  `CfnUserProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-props-builder (new CfnUserProps$Builder) id config))