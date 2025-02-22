(ns cdk.api.services.memorydb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.memorydb package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.memorydb CfnACL$Builder
                                                     CfnACLProps$Builder
                                                     CfnCluster$Builder
                                                     CfnCluster$EndpointProperty$Builder
                                                     CfnClusterProps$Builder
                                                     CfnParameterGroup$Builder
                                                     CfnParameterGroupProps$Builder
                                                     CfnSubnetGroup$Builder
                                                     CfnSubnetGroupProps$Builder
                                                     CfnUser$AuthenticationModeProperty$Builder
                                                     CfnUser$Builder
                                                     CfnUserProps$Builder]))


(defn build-cfn-acl-builder
  "The build-cfn-acl-builder function updates a CfnACL$Builder instance using the provided configuration.
  The function takes the CfnACL$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:acl-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userNames` | java.util.List | [[cdk.support/lookup-entry]] | `:user-names` |
"
  [^CfnACL$Builder builder id config]
  (when-let [data (lookup-entry config id :acl-name)]
    (. builder aclName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-names)]
    (. builder userNames data))
  (.build builder))


(defn build-cfn-acl-props-builder
  "The build-cfn-acl-props-builder function updates a CfnACLProps$Builder instance using the provided configuration.
  The function takes the CfnACLProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:acl-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userNames` | java.util.List | [[cdk.support/lookup-entry]] | `:user-names` |
"
  [^CfnACLProps$Builder builder id config]
  (when-let [data (lookup-entry config id :acl-name)]
    (. builder aclName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-names)]
    (. builder userNames data))
  (.build builder))


(defn build-cfn-cluster-builder
  "The build-cfn-cluster-builder function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:acl-name` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `clusterEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-endpoint` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `dataTiering` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-tiering` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `finalSnapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:final-snapshot-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `maintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-window` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `numReplicasPerShard` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-replicas-per-shard` |
| `numShards` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-shards` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `snapshotArns` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `snapshotWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-window` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `snsTopicStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-status` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls-enabled` |
"
  [^CfnCluster$Builder builder id config]
  (when-let [data (lookup-entry config id :acl-name)]
    (. builder aclName data))
  (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-let [data (lookup-entry config id :cluster-endpoint)]
    (. builder clusterEndpoint data))
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-let [data (lookup-entry config id :data-tiering)]
    (. builder dataTiering data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :final-snapshot-name)]
    (. builder finalSnapshotName data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :maintenance-window)]
    (. builder maintenanceWindow data))
  (when-let [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-let [data (lookup-entry config id :num-replicas-per-shard)]
    (. builder numReplicasPerShard data))
  (when-let [data (lookup-entry config id :num-shards)]
    (. builder numShards data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
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
  (when-let [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-let [data (lookup-entry config id :sns-topic-status)]
    (. builder snsTopicStatus data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tls-enabled)]
    (. builder tlsEnabled data))
  (.build builder))


(defn build-cfn-cluster-endpoint-property-builder
  "The build-cfn-cluster-endpoint-property-builder function updates a CfnCluster$EndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnCluster$EndpointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address)]
    (. builder address data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn build-cfn-cluster-props-builder
  "The build-cfn-cluster-props-builder function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:acl-name` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `clusterEndpoint` | software.amazon.awscdk.services.memorydb.CfnCluster$EndpointProperty | [[cdk.support/lookup-entry]] | `:cluster-endpoint` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `dataTiering` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-tiering` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `finalSnapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:final-snapshot-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `maintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-window` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `numReplicasPerShard` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-replicas-per-shard` |
| `numShards` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-shards` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `snapshotArns` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-arns` |
| `snapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-name` |
| `snapshotRetentionLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-limit` |
| `snapshotWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-window` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `snsTopicStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-status` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tls-enabled` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :acl-name)]
    (. builder aclName data))
  (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-let [data (lookup-entry config id :cluster-endpoint)]
    (. builder clusterEndpoint data))
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-let [data (lookup-entry config id :data-tiering)]
    (. builder dataTiering data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :final-snapshot-name)]
    (. builder finalSnapshotName data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :maintenance-window)]
    (. builder maintenanceWindow data))
  (when-let [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-let [data (lookup-entry config id :num-replicas-per-shard)]
    (. builder numReplicasPerShard data))
  (when-let [data (lookup-entry config id :num-shards)]
    (. builder numShards data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
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
  (when-let [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-let [data (lookup-entry config id :sns-topic-status)]
    (. builder snsTopicStatus data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tls-enabled)]
    (. builder tlsEnabled data))
  (.build builder))


(defn build-cfn-parameter-group-builder
  "The build-cfn-parameter-group-builder function updates a CfnParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnParameterGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :family)]
    (. builder family data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-parameter-group-props-builder
  "The build-cfn-parameter-group-props-builder function updates a CfnParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnParameterGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :family)]
    (. builder family data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-subnet-group-builder
  "The build-cfn-subnet-group-builder function updates a CfnSubnetGroup$Builder instance using the provided configuration.
  The function takes the CfnSubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubnetGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-subnet-group-props-builder
  "The build-cfn-subnet-group-props-builder function updates a CfnSubnetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnSubnetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubnetGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


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


(defn build-cfn-user-builder
  "The build-cfn-user-builder function updates a CfnUser$Builder instance using the provided configuration.
  The function takes the CfnUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessString` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-string` |
| `authenticationMode` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUser$Builder builder id config]
  (when-let [data (lookup-entry config id :access-string)]
    (. builder accessString data))
  (when-let [data (lookup-entry config id :authentication-mode)]
    (. builder authenticationMode data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn build-cfn-user-props-builder
  "The build-cfn-user-props-builder function updates a CfnUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessString` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-string` |
| `authenticationMode` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-string)]
    (. builder accessString data))
  (when-let [data (lookup-entry config id :authentication-mode)]
    (. builder authenticationMode data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))