(ns cdk.api.services.resourceexplorer2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.resourceexplorer2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.resourceexplorer2 CfnDefaultViewAssociation$Builder
                                                              CfnDefaultViewAssociationProps$Builder
                                                              CfnIndex$Builder
                                                              CfnIndexProps$Builder
                                                              CfnView$Builder
                                                              CfnView$FiltersProperty$Builder
                                                              CfnView$IncludedPropertyProperty$Builder
                                                              CfnView$SearchFilterProperty$Builder
                                                              CfnViewProps$Builder]))


(defn cfn-default-view-association-builder>
  "The cfn-default-view-association-builder> function updates a CfnDefaultViewAssociation$Builder instance using the provided configuration.
  The function takes the CfnDefaultViewAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |
"
  [^CfnDefaultViewAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :view-arn)]
    (. builder viewArn data))
  (.build builder))


(defn cfn-default-view-association-builder
  "Creates a  `CfnDefaultViewAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-default-view-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-default-view-association-builder> (CfnDefaultViewAssociation$Builder/create scope (name id)) id config))


(defn cfn-default-view-association-props-builder>
  "The cfn-default-view-association-props-builder> function updates a CfnDefaultViewAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnDefaultViewAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |
"
  [^CfnDefaultViewAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :view-arn)]
    (. builder viewArn data))
  (.build builder))


(defn cfn-default-view-association-props-builder
  "Creates a  `CfnDefaultViewAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-default-view-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-default-view-association-props-builder> (new CfnDefaultViewAssociationProps$Builder) id config))


(defn cfn-index-builder>
  "The cfn-index-builder> function updates a CfnIndex$Builder instance using the provided configuration.
  The function takes the CfnIndex$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIndex$Builder builder id config]
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-index-builder
  "Creates a  `CfnIndex$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-index-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-index-builder> (CfnIndex$Builder/create scope (name id)) id config))


(defn cfn-index-props-builder>
  "The cfn-index-props-builder> function updates a CfnIndexProps$Builder instance using the provided configuration.
  The function takes the CfnIndexProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIndexProps$Builder builder id config]
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-index-props-builder
  "Creates a  `CfnIndexProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-index-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-index-props-builder> (new CfnIndexProps$Builder) id config))


(defn cfn-view-builder>
  "The cfn-view-builder> function updates a CfnView$Builder instance using the provided configuration.
  The function takes the CfnView$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `includedProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:included-properties` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `viewName` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-name` |
"
  [^CfnView$Builder builder id config]
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :included-properties)]
    (. builder includedProperties data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :view-name)]
    (. builder viewName data))
  (.build builder))


(defn cfn-view-builder
  "Creates a  `CfnView$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-view-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-view-builder> (CfnView$Builder/create scope (name id)) id config))


(defn cfn-view-filters-property-builder>
  "The cfn-view-filters-property-builder> function updates a CfnView$FiltersProperty$Builder instance using the provided configuration.
  The function takes the CfnView$FiltersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterString` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-string` |
"
  [^CfnView$FiltersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filter-string)]
    (. builder filterString data))
  (.build builder))


(defn cfn-view-filters-property-builder
  "Creates a  `CfnView$FiltersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-view-filters-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-view-filters-property-builder> (new CfnView$FiltersProperty$Builder) id config))


(defn cfn-view-included-property-property-builder>
  "The cfn-view-included-property-property-builder> function updates a CfnView$IncludedPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnView$IncludedPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnView$IncludedPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-view-included-property-property-builder
  "Creates a  `CfnView$IncludedPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-view-included-property-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-view-included-property-property-builder> (new CfnView$IncludedPropertyProperty$Builder) id config))


(defn cfn-view-props-builder>
  "The cfn-view-props-builder> function updates a CfnViewProps$Builder instance using the provided configuration.
  The function takes the CfnViewProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `includedProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:included-properties` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `viewName` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-name` |
"
  [^CfnViewProps$Builder builder id config]
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :included-properties)]
    (. builder includedProperties data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :view-name)]
    (. builder viewName data))
  (.build builder))


(defn cfn-view-props-builder
  "Creates a  `CfnViewProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-view-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-view-props-builder> (new CfnViewProps$Builder) id config))


(defn cfn-view-search-filter-property-builder>
  "The cfn-view-search-filter-property-builder> function updates a CfnView$SearchFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnView$SearchFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterString` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-string` |
"
  [^CfnView$SearchFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filter-string)]
    (. builder filterString data))
  (.build builder))


(defn cfn-view-search-filter-property-builder
  "Creates a  `CfnView$SearchFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-view-search-filter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-view-search-filter-property-builder> (new CfnView$SearchFilterProperty$Builder) id config))