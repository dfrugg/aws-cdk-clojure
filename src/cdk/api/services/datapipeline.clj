(ns cdk.api.services.datapipeline
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.datapipeline package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.datapipeline CfnPipeline$Builder
                                                         CfnPipeline$FieldProperty$Builder
                                                         CfnPipeline$ParameterAttributeProperty$Builder
                                                         CfnPipeline$ParameterObjectProperty$Builder
                                                         CfnPipeline$ParameterValueProperty$Builder
                                                         CfnPipeline$PipelineObjectProperty$Builder
                                                         CfnPipeline$PipelineTagProperty$Builder
                                                         CfnPipelineProps$Builder]))


(defn cfn-pipeline-builder>
  "The cfn-pipeline-builder> function updates a CfnPipeline$Builder instance using the provided configuration.
  The function takes the CfnPipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activate` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameterObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-objects` |
| `parameterValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-values` |
| `pipelineObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-objects` |
| `pipelineTags` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-tags` |
"
  [^CfnPipeline$Builder builder id config]
  (when-some [data (lookup-entry config id :activate)]
    (. builder activate data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameter-objects)]
    (. builder parameterObjects data))
  (when-some [data (lookup-entry config id :parameter-values)]
    (. builder parameterValues data))
  (when-some [data (lookup-entry config id :pipeline-objects)]
    (. builder pipelineObjects data))
  (when-some [data (lookup-entry config id :pipeline-tags)]
    (. builder pipelineTags data))
  (.build builder))


(defn cfn-pipeline-builder
  "Creates a  `CfnPipeline$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-pipeline-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-pipeline-builder> (CfnPipeline$Builder/create scope (name id)) id config))


(defn cfn-pipeline-field-property-builder>
  "The cfn-pipeline-field-property-builder> function updates a CfnPipeline$FieldProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$FieldProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `refValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnPipeline$FieldProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :ref-value)]
    (. builder refValue data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-pipeline-field-property-builder
  "Creates a  `CfnPipeline$FieldProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-field-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-field-property-builder> (new CfnPipeline$FieldProperty$Builder) id config))


(defn cfn-pipeline-parameter-attribute-property-builder>
  "The cfn-pipeline-parameter-attribute-property-builder> function updates a CfnPipeline$ParameterAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ParameterAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnPipeline$ParameterAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-pipeline-parameter-attribute-property-builder
  "Creates a  `CfnPipeline$ParameterAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-parameter-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-parameter-attribute-property-builder> (new CfnPipeline$ParameterAttributeProperty$Builder) id config))


(defn cfn-pipeline-parameter-object-property-builder>
  "The cfn-pipeline-parameter-object-property-builder> function updates a CfnPipeline$ParameterObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ParameterObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnPipeline$ParameterObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-pipeline-parameter-object-property-builder
  "Creates a  `CfnPipeline$ParameterObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-parameter-object-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-parameter-object-property-builder> (new CfnPipeline$ParameterObjectProperty$Builder) id config))


(defn cfn-pipeline-parameter-value-property-builder>
  "The cfn-pipeline-parameter-value-property-builder> function updates a CfnPipeline$ParameterValueProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ParameterValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnPipeline$ParameterValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-pipeline-parameter-value-property-builder
  "Creates a  `CfnPipeline$ParameterValueProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-parameter-value-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-parameter-value-property-builder> (new CfnPipeline$ParameterValueProperty$Builder) id config))


(defn cfn-pipeline-pipeline-object-property-builder>
  "The cfn-pipeline-pipeline-object-property-builder> function updates a CfnPipeline$PipelineObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$PipelineObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPipeline$PipelineObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-pipeline-pipeline-object-property-builder
  "Creates a  `CfnPipeline$PipelineObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-pipeline-object-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-pipeline-object-property-builder> (new CfnPipeline$PipelineObjectProperty$Builder) id config))


(defn cfn-pipeline-pipeline-tag-property-builder>
  "The cfn-pipeline-pipeline-tag-property-builder> function updates a CfnPipeline$PipelineTagProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$PipelineTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPipeline$PipelineTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-pipeline-pipeline-tag-property-builder
  "Creates a  `CfnPipeline$PipelineTagProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-pipeline-tag-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-pipeline-tag-property-builder> (new CfnPipeline$PipelineTagProperty$Builder) id config))


(defn cfn-pipeline-props-builder>
  "The cfn-pipeline-props-builder> function updates a CfnPipelineProps$Builder instance using the provided configuration.
  The function takes the CfnPipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activate` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameterObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-objects` |
| `parameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:parameter-values` |
| `pipelineObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-objects` |
| `pipelineTags` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-tags` |
"
  [^CfnPipelineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :activate)]
    (. builder activate data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameter-objects)]
    (. builder parameterObjects data))
  (when-some [data (lookup-entry config id :parameter-values)]
    (. builder parameterValues data))
  (when-some [data (lookup-entry config id :pipeline-objects)]
    (. builder pipelineObjects data))
  (when-some [data (lookup-entry config id :pipeline-tags)]
    (. builder pipelineTags data))
  (.build builder))


(defn cfn-pipeline-props-builder
  "Creates a  `CfnPipelineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pipeline-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pipeline-props-builder> (new CfnPipelineProps$Builder) id config))