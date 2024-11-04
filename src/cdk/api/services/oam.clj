(ns cdk.api.services.oam
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.oam package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.oam CfnLink$Builder
                                                CfnLink$LinkConfigurationProperty$Builder
                                                CfnLink$LinkFilterProperty$Builder
                                                CfnLinkProps$Builder
                                                CfnSink$Builder
                                                CfnSinkProps$Builder]))


(defn cfn-link-builder
  "The cfn-link-builder function buildes out new instances of 
CfnLink$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labelTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-template` |
| `linkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:link-configuration` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
| `sinkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:sink-identifier` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLink$Builder/create stack id)]
    (when-let [data (lookup-entry config id :label-template)]
      (. builder labelTemplate data))
    (when-let [data (lookup-entry config id :link-configuration)]
      (. builder linkConfiguration data))
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (when-let [data (lookup-entry config id :sink-identifier)]
      (. builder sinkIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-link-link-configuration-property-builder
  "The cfn-link-link-configuration-property-builder function buildes out new instances of 
CfnLink$LinkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-group-configuration` |
| `metricConfiguration` | software.amazon.awscdk.services.oam.CfnLink$LinkFilterProperty | [[cdk.support/lookup-entry]] | `:metric-configuration` |"
  [stack id config]
  (let [builder (CfnLink$LinkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-configuration)]
      (. builder logGroupConfiguration data))
    (when-let [data (lookup-entry config id :metric-configuration)]
      (. builder metricConfiguration data))
    (.build builder)))


(defn cfn-link-link-filter-property-builder
  "The cfn-link-link-filter-property-builder function buildes out new instances of 
CfnLink$LinkFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |"
  [stack id config]
  (let [builder (CfnLink$LinkFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (.build builder)))


(defn cfn-link-props-builder
  "The cfn-link-props-builder function buildes out new instances of 
CfnLinkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labelTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-template` |
| `linkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:link-configuration` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
| `sinkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:sink-identifier` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLinkProps$Builder.)]
    (when-let [data (lookup-entry config id :label-template)]
      (. builder labelTemplate data))
    (when-let [data (lookup-entry config id :link-configuration)]
      (. builder linkConfiguration data))
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (when-let [data (lookup-entry config id :sink-identifier)]
      (. builder sinkIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-sink-builder
  "The cfn-sink-builder function buildes out new instances of 
CfnSink$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSink$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-sink-props-builder
  "The cfn-sink-props-builder function buildes out new instances of 
CfnSinkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSinkProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))