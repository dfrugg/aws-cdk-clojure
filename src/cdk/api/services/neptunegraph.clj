(ns cdk.api.services.neptunegraph
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.neptunegraph package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.neptunegraph CfnGraph$Builder
                                                         CfnGraph$VectorSearchConfigurationProperty$Builder
                                                         CfnGraphProps$Builder
                                                         CfnPrivateGraphEndpoint$Builder
                                                         CfnPrivateGraphEndpointProps$Builder]))


(defn cfn-graph-builder
  "The cfn-graph-builder function buildes out new instances of 
CfnGraph$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `graphName` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-name` |
| `provisionedMemory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-memory` |
| `publicConnectivity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-connectivity` |
| `replicaCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replica-count` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vectorSearchConfiguration` | software.amazon.awscdk.services.neptunegraph.CfnGraph$VectorSearchConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-search-configuration` |"
  [stack id config]
  (let [builder (CfnGraph$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :graph-name)]
      (. builder graphName data))
    (when-let [data (lookup-entry config id :provisioned-memory)]
      (. builder provisionedMemory data))
    (when-let [data (lookup-entry config id :public-connectivity)]
      (. builder publicConnectivity data))
    (when-let [data (lookup-entry config id :replica-count)]
      (. builder replicaCount data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vector-search-configuration)]
      (. builder vectorSearchConfiguration data))
    (.build builder)))


(defn cfn-graph-props-builder
  "The cfn-graph-props-builder function buildes out new instances of 
CfnGraphProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `graphName` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-name` |
| `provisionedMemory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-memory` |
| `publicConnectivity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-connectivity` |
| `replicaCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replica-count` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vectorSearchConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vector-search-configuration` |"
  [stack id config]
  (let [builder (CfnGraphProps$Builder.)]
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :graph-name)]
      (. builder graphName data))
    (when-let [data (lookup-entry config id :provisioned-memory)]
      (. builder provisionedMemory data))
    (when-let [data (lookup-entry config id :public-connectivity)]
      (. builder publicConnectivity data))
    (when-let [data (lookup-entry config id :replica-count)]
      (. builder replicaCount data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vector-search-configuration)]
      (. builder vectorSearchConfiguration data))
    (.build builder)))


(defn cfn-graph-vector-search-configuration-property-builder
  "The cfn-graph-vector-search-configuration-property-builder function buildes out new instances of 
CfnGraph$VectorSearchConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vectorSearchDimension` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vector-search-dimension` |"
  [stack id config]
  (let [builder (CfnGraph$VectorSearchConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :vector-search-dimension)]
      (. builder vectorSearchDimension data))
    (.build builder)))


(defn cfn-private-graph-endpoint-builder
  "The cfn-private-graph-endpoint-builder function buildes out new instances of 
CfnPrivateGraphEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-identifier` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnPrivateGraphEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :graph-identifier)]
      (. builder graphIdentifier data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-private-graph-endpoint-props-builder
  "The cfn-private-graph-endpoint-props-builder function buildes out new instances of 
CfnPrivateGraphEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-identifier` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnPrivateGraphEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :graph-identifier)]
      (. builder graphIdentifier data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))