(ns cdk.api.services.oam
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.oam package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.oam CfnLink$Builder
                                                CfnLink$LinkConfigurationProperty$Builder
                                                CfnLink$LinkFilterProperty$Builder
                                                CfnLinkProps$Builder
                                                CfnSink$Builder
                                                CfnSinkProps$Builder]))


(defn build-cfn-link-builder
  "The build-cfn-link-builder function updates a CfnLink$Builder instance using the provided configuration.
  The function takes the CfnLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labelTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-template` |
| `linkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:link-configuration` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
| `sinkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:sink-identifier` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLink$Builder builder id config]
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
  (.build builder))


(defn cfn-link-builder
  "Creates a  `CfnLink$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-link-builder (CfnLink$Builder/create scope (name id)) id config))


(defn build-cfn-link-link-configuration-property-builder
  "The build-cfn-link-link-configuration-property-builder function updates a CfnLink$LinkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLink$LinkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-group-configuration` |
| `metricConfiguration` | software.amazon.awscdk.services.oam.CfnLink$LinkFilterProperty | [[cdk.support/lookup-entry]] | `:metric-configuration` |
"
  [^CfnLink$LinkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-configuration)]
    (. builder logGroupConfiguration data))
  (when-let [data (lookup-entry config id :metric-configuration)]
    (. builder metricConfiguration data))
  (.build builder))


(defn cfn-link-link-configuration-property-builder
  "Creates a  `CfnLink$LinkConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-link-link-configuration-property-builder (new CfnLink$LinkConfigurationProperty$Builder) id config))


(defn build-cfn-link-link-filter-property-builder
  "The build-cfn-link-link-filter-property-builder function updates a CfnLink$LinkFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnLink$LinkFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
"
  [^CfnLink$LinkFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (.build builder))


(defn cfn-link-link-filter-property-builder
  "Creates a  `CfnLink$LinkFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-link-link-filter-property-builder (new CfnLink$LinkFilterProperty$Builder) id config))


(defn build-cfn-link-props-builder
  "The build-cfn-link-props-builder function updates a CfnLinkProps$Builder instance using the provided configuration.
  The function takes the CfnLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labelTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-template` |
| `linkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:link-configuration` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
| `sinkIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:sink-identifier` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLinkProps$Builder builder id config]
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
  (.build builder))


(defn cfn-link-props-builder
  "Creates a  `CfnLinkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-link-props-builder (new CfnLinkProps$Builder) id config))


(defn build-cfn-sink-builder
  "The build-cfn-sink-builder function updates a CfnSink$Builder instance using the provided configuration.
  The function takes the CfnSink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSink$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-sink-builder
  "Creates a  `CfnSink$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-sink-builder (CfnSink$Builder/create scope (name id)) id config))


(defn build-cfn-sink-props-builder
  "The build-cfn-sink-props-builder function updates a CfnSinkProps$Builder instance using the provided configuration.
  The function takes the CfnSinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-sink-props-builder
  "Creates a  `CfnSinkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-sink-props-builder (new CfnSinkProps$Builder) id config))