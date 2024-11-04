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


(defn cfn-acl-builder
  "The cfn-acl-builder function buildes out new instances of 
CfnACL$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:acl-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userNames` | java.util.List | [[cdk.support/lookup-entry]] | `:user-names` |"
  [stack id config]
  (let [builder (CfnACL$Builder/create stack id)]
    (when-let [data (lookup-entry config id :acl-name)]
      (. builder aclName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-names)]
      (. builder userNames data))
    (.build builder)))


(defn cfn-acl-props-builder
  "The cfn-acl-props-builder function buildes out new instances of 
CfnACLProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:acl-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userNames` | java.util.List | [[cdk.support/lookup-entry]] | `:user-names` |"
  [stack id config]
  (let [builder (CfnACLProps$Builder.)]
    (when-let [data (lookup-entry config id :acl-name)]
      (. builder aclName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-names)]
      (. builder userNames data))
    (.build builder)))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `tlsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls-enabled` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-cluster-endpoint-property-builder
  "The cfn-cluster-endpoint-property-builder function buildes out new instances of 
CfnCluster$EndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnCluster$EndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tlsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tls-enabled` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
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
    (.build builder)))


(defn cfn-parameter-group-builder
  "The cfn-parameter-group-builder function buildes out new instances of 
CfnParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnParameterGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-parameter-group-props-builder
  "The cfn-parameter-group-props-builder function buildes out new instances of 
CfnParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnParameterGroupProps$Builder.)]
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
    (.build builder)))


(defn cfn-subnet-group-builder
  "The cfn-subnet-group-builder function buildes out new instances of 
CfnSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-subnet-group-props-builder
  "The cfn-subnet-group-props-builder function buildes out new instances of 
CfnSubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-authentication-mode-property-builder
  "The cfn-user-authentication-mode-property-builder function buildes out new instances of 
CfnUser$AuthenticationModeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwords` | java.util.List | [[cdk.support/lookup-entry]] | `:passwords` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnUser$AuthenticationModeProperty$Builder.)]
    (when-let [data (lookup-entry config id :passwords)]
      (. builder passwords data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-user-builder
  "The cfn-user-builder function buildes out new instances of 
CfnUser$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessString` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-string` |
| `authenticationMode` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUser$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-string)]
      (. builder accessString data))
    (when-let [data (lookup-entry config id :authentication-mode)]
      (. builder authenticationMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-props-builder
  "The cfn-user-props-builder function buildes out new instances of 
CfnUserProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessString` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-string` |
| `authenticationMode` | java.lang.Object | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUserProps$Builder.)]
    (when-let [data (lookup-entry config id :access-string)]
      (. builder accessString data))
    (when-let [data (lookup-entry config id :authentication-mode)]
      (. builder authenticationMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))