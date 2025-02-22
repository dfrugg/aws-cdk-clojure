(ns cdk.api.services.dax
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.dax package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.dax CfnCluster$Builder
                                                CfnCluster$SSESpecificationProperty$Builder
                                                CfnClusterProps$Builder
                                                CfnParameterGroup$Builder
                                                CfnParameterGroupProps$Builder
                                                CfnSubnetGroup$Builder
                                                CfnSubnetGroupProps$Builder]))


(defn build-cfn-cluster-builder
  "The build-cfn-cluster-builder function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `clusterEndpointEncryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-encryption-type` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `replicationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replication-factor` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCluster$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-let [data (lookup-entry config id :cluster-endpoint-encryption-type)]
    (. builder clusterEndpointEncryptionType data))
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-let [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :replication-factor)]
    (. builder replicationFactor data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :sse-specification)]
    (. builder sseSpecification data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-cluster-props-builder
  "The build-cfn-cluster-props-builder function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `clusterEndpointEncryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-encryption-type` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `replicationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replication-factor` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `sseSpecification` | software.amazon.awscdk.services.dax.CfnCluster$SSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-let [data (lookup-entry config id :cluster-endpoint-encryption-type)]
    (. builder clusterEndpointEncryptionType data))
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-let [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :replication-factor)]
    (. builder replicationFactor data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :sse-specification)]
    (. builder sseSpecification data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-cluster-sse-specification-property-builder
  "The build-cfn-cluster-sse-specification-property-builder function updates a CfnCluster$SSESpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$SSESpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sse-enabled` |
"
  [^CfnCluster$SSESpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sse-enabled)]
    (. builder sseEnabled data))
  (.build builder))


(defn build-cfn-parameter-group-builder
  "The build-cfn-parameter-group-builder function updates a CfnParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameterNameValues` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameter-name-values` |
"
  [^CfnParameterGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :parameter-name-values)]
    (. builder parameterNameValues data))
  (.build builder))


(defn build-cfn-parameter-group-props-builder
  "The build-cfn-parameter-group-props-builder function updates a CfnParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameterNameValues` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameter-name-values` |
"
  [^CfnParameterGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-let [data (lookup-entry config id :parameter-name-values)]
    (. builder parameterNameValues data))
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
"
  [^CfnSubnetGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
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
"
  [^CfnSubnetGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))