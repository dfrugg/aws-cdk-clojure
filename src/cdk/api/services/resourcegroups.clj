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


(defn cfn-group-builder>
  "The cfn-group-builder> function updates a CfnGroup$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-query)]
    (. builder resourceQuery data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-builder
  "Creates a  `CfnGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-group-builder> (CfnGroup$Builder/create scope (name id)) id config))


(defn cfn-group-configuration-item-property-builder>
  "The cfn-group-configuration-item-property-builder> function updates a CfnGroup$ConfigurationItemProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$ConfigurationItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGroup$ConfigurationItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-group-configuration-item-property-builder
  "Creates a  `CfnGroup$ConfigurationItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-configuration-item-property-builder> (new CfnGroup$ConfigurationItemProperty$Builder) id config))


(defn cfn-group-configuration-parameter-property-builder>
  "The cfn-group-configuration-parameter-property-builder> function updates a CfnGroup$ConfigurationParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$ConfigurationParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnGroup$ConfigurationParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-group-configuration-parameter-property-builder
  "Creates a  `CfnGroup$ConfigurationParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-configuration-parameter-property-builder> (new CfnGroup$ConfigurationParameterProperty$Builder) id config))


(defn cfn-group-props-builder>
  "The cfn-group-props-builder> function updates a CfnGroupProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-query)]
    (. builder resourceQuery data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-props-builder
  "Creates a  `CfnGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-props-builder> (new CfnGroupProps$Builder) id config))


(defn cfn-group-query-property-builder>
  "The cfn-group-query-property-builder> function updates a CfnGroup$QueryProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :resource-type-filters)]
    (. builder resourceTypeFilters data))
  (when-some [data (lookup-entry config id :stack-identifier)]
    (. builder stackIdentifier data))
  (when-some [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn cfn-group-query-property-builder
  "Creates a  `CfnGroup$QueryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-query-property-builder> (new CfnGroup$QueryProperty$Builder) id config))


(defn cfn-group-resource-query-property-builder>
  "The cfn-group-resource-query-property-builder> function updates a CfnGroup$ResourceQueryProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$ResourceQueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `query` | software.amazon.awscdk.services.resourcegroups.CfnGroup$QueryProperty | [[cdk.support/lookup-entry]] | `:query` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGroup$ResourceQueryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :query)]
    (. builder query data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-group-resource-query-property-builder
  "Creates a  `CfnGroup$ResourceQueryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-resource-query-property-builder> (new CfnGroup$ResourceQueryProperty$Builder) id config))


(defn cfn-group-tag-filter-property-builder>
  "The cfn-group-tag-filter-property-builder> function updates a CfnGroup$TagFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$TagFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnGroup$TagFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-group-tag-filter-property-builder
  "Creates a  `CfnGroup$TagFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-tag-filter-property-builder> (new CfnGroup$TagFilterProperty$Builder) id config))