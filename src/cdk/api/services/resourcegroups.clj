(ns cdk.api.services.resourcegroups
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.resourcegroups package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.resourcegroups CfnGroup$Builder
                                                           CfnGroup$ConfigurationItemProperty$Builder
                                                           CfnGroup$ConfigurationParameterProperty$Builder
                                                           CfnGroup$QueryProperty$Builder
                                                           CfnGroup$ResourceQueryProperty$Builder
                                                           CfnGroup$TagFilterProperty$Builder
                                                           CfnGroupProps$Builder]))


(defn cfn-group-builder
  "The cfn-group-builder function buildes out new instances of 
CfnGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.util.List | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceQuery` | software.amazon.awscdk.services.resourcegroups.CfnGroup$ResourceQueryProperty | [[cdk.support/lookup-entry]] | `:resource-query` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-query)]
      (. builder resourceQuery data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-group-configuration-item-property-builder
  "The cfn-group-configuration-item-property-builder function buildes out new instances of 
CfnGroup$ConfigurationItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnGroup$ConfigurationItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-group-configuration-parameter-property-builder
  "The cfn-group-configuration-parameter-property-builder function buildes out new instances of 
CfnGroup$ConfigurationParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnGroup$ConfigurationParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-group-props-builder
  "The cfn-group-props-builder function buildes out new instances of 
CfnGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.util.List | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceQuery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-query` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-query)]
      (. builder resourceQuery data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-group-query-property-builder
  "The cfn-group-query-property-builder function buildes out new instances of 
CfnGroup$QueryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceTypeFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-filters` |
| `stackIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-identifier` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |"
  [stack id config]
  (let [builder (CfnGroup$QueryProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type-filters)]
      (. builder resourceTypeFilters data))
    (when-let [data (lookup-entry config id :stack-identifier)]
      (. builder stackIdentifier data))
    (when-let [data (lookup-entry config id :tag-filters)]
      (. builder tagFilters data))
    (.build builder)))


(defn cfn-group-resource-query-property-builder
  "The cfn-group-resource-query-property-builder function buildes out new instances of 
CfnGroup$ResourceQueryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `query` | software.amazon.awscdk.services.resourcegroups.CfnGroup$QueryProperty | [[cdk.support/lookup-entry]] | `:query` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnGroup$ResourceQueryProperty$Builder.)]
    (when-let [data (lookup-entry config id :query)]
      (. builder query data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-group-tag-filter-property-builder
  "The cfn-group-tag-filter-property-builder function buildes out new instances of 
CfnGroup$TagFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnGroup$TagFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))