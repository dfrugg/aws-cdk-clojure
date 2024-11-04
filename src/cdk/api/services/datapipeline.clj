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


(defn cfn-pipeline-builder
  "The cfn-pipeline-builder function buildes out new instances of 
CfnPipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activate` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameterObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-objects` |
| `parameterValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-values` |
| `pipelineObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-objects` |
| `pipelineTags` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-tags` |"
  [stack id config]
  (let [builder (CfnPipeline$Builder/create stack id)]
    (when-let [data (lookup-entry config id :activate)]
      (. builder activate data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameter-objects)]
      (. builder parameterObjects data))
    (when-let [data (lookup-entry config id :parameter-values)]
      (. builder parameterValues data))
    (when-let [data (lookup-entry config id :pipeline-objects)]
      (. builder pipelineObjects data))
    (when-let [data (lookup-entry config id :pipeline-tags)]
      (. builder pipelineTags data))
    (.build builder)))


(defn cfn-pipeline-field-property-builder
  "The cfn-pipeline-field-property-builder function buildes out new instances of 
CfnPipeline$FieldProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `refValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnPipeline$FieldProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :ref-value)]
      (. builder refValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-pipeline-parameter-attribute-property-builder
  "The cfn-pipeline-parameter-attribute-property-builder function buildes out new instances of 
CfnPipeline$ParameterAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnPipeline$ParameterAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-pipeline-parameter-object-property-builder
  "The cfn-pipeline-parameter-object-property-builder function buildes out new instances of 
CfnPipeline$ParameterObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnPipeline$ParameterObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-pipeline-parameter-value-property-builder
  "The cfn-pipeline-parameter-value-property-builder function buildes out new instances of 
CfnPipeline$ParameterValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnPipeline$ParameterValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-pipeline-pipeline-object-property-builder
  "The cfn-pipeline-pipeline-object-property-builder function buildes out new instances of 
CfnPipeline$PipelineObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPipeline$PipelineObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-pipeline-pipeline-tag-property-builder
  "The cfn-pipeline-pipeline-tag-property-builder function buildes out new instances of 
CfnPipeline$PipelineTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPipeline$PipelineTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-pipeline-props-builder
  "The cfn-pipeline-props-builder function buildes out new instances of 
CfnPipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:activate` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameterObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-objects` |
| `parameterValues` | java.util.List | [[cdk.support/lookup-entry]] | `:parameter-values` |
| `pipelineObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-objects` |
| `pipelineTags` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-tags` |"
  [stack id config]
  (let [builder (CfnPipelineProps$Builder.)]
    (when-let [data (lookup-entry config id :activate)]
      (. builder activate data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameter-objects)]
      (. builder parameterObjects data))
    (when-let [data (lookup-entry config id :parameter-values)]
      (. builder parameterValues data))
    (when-let [data (lookup-entry config id :pipeline-objects)]
      (. builder pipelineObjects data))
    (when-let [data (lookup-entry config id :pipeline-tags)]
      (. builder pipelineTags data))
    (.build builder)))