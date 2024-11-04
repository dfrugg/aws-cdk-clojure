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


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
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
    (.build builder)))


(defn cfn-cluster-sse-specification-property-builder
  "The cfn-cluster-sse-specification-property-builder function buildes out new instances of 
CfnCluster$SSESpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sse-enabled` |"
  [stack id config]
  (let [builder (CfnCluster$SSESpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sse-enabled)]
      (. builder sseEnabled data))
    (.build builder)))


(defn cfn-parameter-group-builder
  "The cfn-parameter-group-builder function buildes out new instances of 
CfnParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameterNameValues` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameter-name-values` |"
  [stack id config]
  (let [builder (CfnParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :parameter-group-name)]
      (. builder parameterGroupName data))
    (when-let [data (lookup-entry config id :parameter-name-values)]
      (. builder parameterNameValues data))
    (.build builder)))


(defn cfn-parameter-group-props-builder
  "The cfn-parameter-group-props-builder function buildes out new instances of 
CfnParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameterNameValues` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameter-name-values` |"
  [stack id config]
  (let [builder (CfnParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :parameter-group-name)]
      (. builder parameterGroupName data))
    (when-let [data (lookup-entry config id :parameter-name-values)]
      (. builder parameterNameValues data))
    (.build builder)))


(defn cfn-subnet-group-builder
  "The cfn-subnet-group-builder function buildes out new instances of 
CfnSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnSubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-subnet-group-props-builder
  "The cfn-subnet-group-props-builder function buildes out new instances of 
CfnSubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnSubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))