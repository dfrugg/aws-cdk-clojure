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


(defn build-cfn-group-builder
  "The build-cfn-group-builder function updates a CfnGroup$Builder instance using the provided configuration.
  The function takes the CfnGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.util.List | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceQuery` | software.amazon.awscdk.services.resourcegroups.CfnGroup$ResourceQueryProperty | [[cdk.support/lookup-entry]] | `:resource-query` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroup$Builder builder id config]
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
  (.build builder))


(defn build-cfn-group-configuration-item-property-builder
  "The build-cfn-group-configuration-item-property-builder function updates a CfnGroup$ConfigurationItemProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$ConfigurationItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGroup$ConfigurationItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-group-configuration-parameter-property-builder
  "The build-cfn-group-configuration-parameter-property-builder function updates a CfnGroup$ConfigurationParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$ConfigurationParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnGroup$ConfigurationParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-group-props-builder
  "The build-cfn-group-props-builder function updates a CfnGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.util.List | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceQuery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-query` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroupProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-group-query-property-builder
  "The build-cfn-group-query-property-builder function updates a CfnGroup$QueryProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$QueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceTypeFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-filters` |
| `stackIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-identifier` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |
"
  [^CfnGroup$QueryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-type-filters)]
    (. builder resourceTypeFilters data))
  (when-let [data (lookup-entry config id :stack-identifier)]
    (. builder stackIdentifier data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn build-cfn-group-resource-query-property-builder
  "The build-cfn-group-resource-query-property-builder function updates a CfnGroup$ResourceQueryProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$ResourceQueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `query` | software.amazon.awscdk.services.resourcegroups.CfnGroup$QueryProperty | [[cdk.support/lookup-entry]] | `:query` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGroup$ResourceQueryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :query)]
    (. builder query data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-group-tag-filter-property-builder
  "The build-cfn-group-tag-filter-property-builder function updates a CfnGroup$TagFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$TagFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnGroup$TagFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))