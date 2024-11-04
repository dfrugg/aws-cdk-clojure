(ns cdk.api.services.emrcontainers
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.emrcontainers package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.emrcontainers CfnVirtualCluster$Builder
                                                          CfnVirtualCluster$ContainerInfoProperty$Builder
                                                          CfnVirtualCluster$ContainerProviderProperty$Builder
                                                          CfnVirtualCluster$EksInfoProperty$Builder
                                                          CfnVirtualClusterProps$Builder]))


(defn cfn-virtual-cluster-builder
  "The cfn-virtual-cluster-builder function buildes out new instances of 
CfnVirtualCluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerProvider` | software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster$ContainerProviderProperty | [[cdk.support/lookup-entry]] | `:container-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVirtualCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-provider)]
      (. builder containerProvider data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-virtual-cluster-container-info-property-builder
  "The cfn-virtual-cluster-container-info-property-builder function buildes out new instances of 
CfnVirtualCluster$ContainerInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eks-info` |"
  [stack id config]
  (let [builder (CfnVirtualCluster$ContainerInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :eks-info)]
      (. builder eksInfo data))
    (.build builder)))


(defn cfn-virtual-cluster-container-provider-property-builder
  "The cfn-virtual-cluster-container-provider-property-builder function buildes out new instances of 
CfnVirtualCluster$ContainerProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `info` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:info` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnVirtualCluster$ContainerProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :info)]
      (. builder info data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-virtual-cluster-eks-info-property-builder
  "The cfn-virtual-cluster-eks-info-property-builder function buildes out new instances of 
CfnVirtualCluster$EksInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnVirtualCluster$EksInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-virtual-cluster-props-builder
  "The cfn-virtual-cluster-props-builder function buildes out new instances of 
CfnVirtualClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVirtualClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :container-provider)]
      (. builder containerProvider data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))