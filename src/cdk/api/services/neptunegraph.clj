(ns cdk.api.services.neptunegraph
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.neptunegraph package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.neptunegraph CfnGraph$Builder
                                                         CfnGraph$VectorSearchConfigurationProperty$Builder
                                                         CfnGraphProps$Builder
                                                         CfnPrivateGraphEndpoint$Builder
                                                         CfnPrivateGraphEndpointProps$Builder]))


(defn cfn-graph-builder>
  "The cfn-graph-builder> function updates a CfnGraph$Builder instance using the provided configuration.
  The function takes the CfnGraph$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `graphName` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-name` |
| `provisionedMemory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-memory` |
| `publicConnectivity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-connectivity` |
| `replicaCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replica-count` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vectorSearchConfiguration` | software.amazon.awscdk.services.neptunegraph.CfnGraph$VectorSearchConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-search-configuration` |
"
  [^CfnGraph$Builder builder id config]
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :graph-name)]
    (. builder graphName data))
  (when-some [data (lookup-entry config id :provisioned-memory)]
    (. builder provisionedMemory data))
  (when-some [data (lookup-entry config id :public-connectivity)]
    (. builder publicConnectivity data))
  (when-some [data (lookup-entry config id :replica-count)]
    (. builder replicaCount data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vector-search-configuration)]
    (. builder vectorSearchConfiguration data))
  (.build builder))


(defn cfn-graph-builder
  "Creates a  `CfnGraph$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-graph-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-graph-builder> (CfnGraph$Builder/create scope (name id)) id config))


(defn cfn-graph-props-builder>
  "The cfn-graph-props-builder> function updates a CfnGraphProps$Builder instance using the provided configuration.
  The function takes the CfnGraphProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `graphName` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-name` |
| `provisionedMemory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-memory` |
| `publicConnectivity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-connectivity` |
| `replicaCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replica-count` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vectorSearchConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vector-search-configuration` |
"
  [^CfnGraphProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :graph-name)]
    (. builder graphName data))
  (when-some [data (lookup-entry config id :provisioned-memory)]
    (. builder provisionedMemory data))
  (when-some [data (lookup-entry config id :public-connectivity)]
    (. builder publicConnectivity data))
  (when-some [data (lookup-entry config id :replica-count)]
    (. builder replicaCount data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vector-search-configuration)]
    (. builder vectorSearchConfiguration data))
  (.build builder))


(defn cfn-graph-props-builder
  "Creates a  `CfnGraphProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-graph-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-graph-props-builder> (new CfnGraphProps$Builder) id config))


(defn cfn-graph-vector-search-configuration-property-builder>
  "The cfn-graph-vector-search-configuration-property-builder> function updates a CfnGraph$VectorSearchConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGraph$VectorSearchConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vectorSearchDimension` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vector-search-dimension` |
"
  [^CfnGraph$VectorSearchConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vector-search-dimension)]
    (. builder vectorSearchDimension data))
  (.build builder))


(defn cfn-graph-vector-search-configuration-property-builder
  "Creates a  `CfnGraph$VectorSearchConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-graph-vector-search-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-graph-vector-search-configuration-property-builder> (new CfnGraph$VectorSearchConfigurationProperty$Builder) id config))


(defn cfn-private-graph-endpoint-builder>
  "The cfn-private-graph-endpoint-builder> function updates a CfnPrivateGraphEndpoint$Builder instance using the provided configuration.
  The function takes the CfnPrivateGraphEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-identifier` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnPrivateGraphEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :graph-identifier)]
    (. builder graphIdentifier data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-private-graph-endpoint-builder
  "Creates a  `CfnPrivateGraphEndpoint$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-private-graph-endpoint-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-private-graph-endpoint-builder> (CfnPrivateGraphEndpoint$Builder/create scope (name id)) id config))


(defn cfn-private-graph-endpoint-props-builder>
  "The cfn-private-graph-endpoint-props-builder> function updates a CfnPrivateGraphEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnPrivateGraphEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-identifier` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnPrivateGraphEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :graph-identifier)]
    (. builder graphIdentifier data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-private-graph-endpoint-props-builder
  "Creates a  `CfnPrivateGraphEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-private-graph-endpoint-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-private-graph-endpoint-props-builder> (new CfnPrivateGraphEndpointProps$Builder) id config))