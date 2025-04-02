(ns cdk.api.services.emrcontainers
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.emrcontainers package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.emrcontainers CfnVirtualCluster$Builder
                                                          CfnVirtualCluster$ContainerInfoProperty$Builder
                                                          CfnVirtualCluster$ContainerProviderProperty$Builder
                                                          CfnVirtualCluster$EksInfoProperty$Builder
                                                          CfnVirtualClusterProps$Builder]))


(defn cfn-virtual-cluster-builder>
  "The cfn-virtual-cluster-builder> function updates a CfnVirtualCluster$Builder instance using the provided configuration.
  The function takes the CfnVirtualCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerProvider` | software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster$ContainerProviderProperty | [[cdk.support/lookup-entry]] | `:container-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVirtualCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :container-provider)]
    (. builder containerProvider data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-virtual-cluster-builder
  "Creates a  `CfnVirtualCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-virtual-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-virtual-cluster-builder> (CfnVirtualCluster$Builder/create scope (name id)) id config))


(defn cfn-virtual-cluster-container-info-property-builder>
  "The cfn-virtual-cluster-container-info-property-builder> function updates a CfnVirtualCluster$ContainerInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualCluster$ContainerInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eks-info` |
"
  [^CfnVirtualCluster$ContainerInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :eks-info)]
    (. builder eksInfo data))
  (.build builder))


(defn cfn-virtual-cluster-container-info-property-builder
  "Creates a  `CfnVirtualCluster$ContainerInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-virtual-cluster-container-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-virtual-cluster-container-info-property-builder> (new CfnVirtualCluster$ContainerInfoProperty$Builder) id config))


(defn cfn-virtual-cluster-container-provider-property-builder>
  "The cfn-virtual-cluster-container-provider-property-builder> function updates a CfnVirtualCluster$ContainerProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualCluster$ContainerProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `info` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:info` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnVirtualCluster$ContainerProviderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :info)]
    (. builder info data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-virtual-cluster-container-provider-property-builder
  "Creates a  `CfnVirtualCluster$ContainerProviderProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-virtual-cluster-container-provider-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-virtual-cluster-container-provider-property-builder> (new CfnVirtualCluster$ContainerProviderProperty$Builder) id config))


(defn cfn-virtual-cluster-eks-info-property-builder>
  "The cfn-virtual-cluster-eks-info-property-builder> function updates a CfnVirtualCluster$EksInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnVirtualCluster$EksInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnVirtualCluster$EksInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-virtual-cluster-eks-info-property-builder
  "Creates a  `CfnVirtualCluster$EksInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-virtual-cluster-eks-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-virtual-cluster-eks-info-property-builder> (new CfnVirtualCluster$EksInfoProperty$Builder) id config))


(defn cfn-virtual-cluster-props-builder>
  "The cfn-virtual-cluster-props-builder> function updates a CfnVirtualClusterProps$Builder instance using the provided configuration.
  The function takes the CfnVirtualClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVirtualClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-provider)]
    (. builder containerProvider data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-virtual-cluster-props-builder
  "Creates a  `CfnVirtualClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-virtual-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-virtual-cluster-props-builder> (new CfnVirtualClusterProps$Builder) id config))