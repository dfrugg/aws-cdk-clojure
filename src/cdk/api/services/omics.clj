(ns cdk.api.services.omics
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.omics package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.omics CfnAnnotationStore$Builder
                                                  CfnAnnotationStore$ReferenceItemProperty$Builder
                                                  CfnAnnotationStore$SseConfigProperty$Builder
                                                  CfnAnnotationStore$StoreOptionsProperty$Builder
                                                  CfnAnnotationStore$TsvStoreOptionsProperty$Builder
                                                  CfnAnnotationStoreProps$Builder
                                                  CfnReferenceStore$Builder
                                                  CfnReferenceStore$SseConfigProperty$Builder
                                                  CfnReferenceStoreProps$Builder
                                                  CfnRunGroup$Builder
                                                  CfnRunGroupProps$Builder
                                                  CfnSequenceStore$Builder
                                                  CfnSequenceStore$SseConfigProperty$Builder
                                                  CfnSequenceStoreProps$Builder
                                                  CfnVariantStore$Builder
                                                  CfnVariantStore$ReferenceItemProperty$Builder
                                                  CfnVariantStore$SseConfigProperty$Builder
                                                  CfnVariantStoreProps$Builder
                                                  CfnWorkflow$Builder
                                                  CfnWorkflow$WorkflowParameterProperty$Builder
                                                  CfnWorkflowProps$Builder]))


(defn cfn-annotation-store-builder
  "The cfn-annotation-store-builder function buildes out new instances of 
CfnAnnotationStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnAnnotationStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `storeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:store-format` |
| `storeOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:store-options` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAnnotationStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reference)]
      (. builder reference data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :store-format)]
      (. builder storeFormat data))
    (when-let [data (lookup-entry config id :store-options)]
      (. builder storeOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-annotation-store-props-builder
  "The cfn-annotation-store-props-builder function buildes out new instances of 
CfnAnnotationStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnAnnotationStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `storeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:store-format` |
| `storeOptions` | software.amazon.awscdk.services.omics.CfnAnnotationStore$StoreOptionsProperty | [[cdk.support/lookup-entry]] | `:store-options` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAnnotationStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reference)]
      (. builder reference data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :store-format)]
      (. builder storeFormat data))
    (when-let [data (lookup-entry config id :store-options)]
      (. builder storeOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-annotation-store-reference-item-property-builder
  "The cfn-annotation-store-reference-item-property-builder function buildes out new instances of 
CfnAnnotationStore$ReferenceItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-arn` |"
  [stack id config]
  (let [builder (CfnAnnotationStore$ReferenceItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :reference-arn)]
      (. builder referenceArn data))
    (.build builder)))


(defn cfn-annotation-store-sse-config-property-builder
  "The cfn-annotation-store-sse-config-property-builder function buildes out new instances of 
CfnAnnotationStore$SseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAnnotationStore$SseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-annotation-store-store-options-property-builder
  "The cfn-annotation-store-store-options-property-builder function buildes out new instances of 
CfnAnnotationStore$StoreOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tsvStoreOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tsv-store-options` |"
  [stack id config]
  (let [builder (CfnAnnotationStore$StoreOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :tsv-store-options)]
      (. builder tsvStoreOptions data))
    (.build builder)))


(defn cfn-annotation-store-tsv-store-options-property-builder
  "The cfn-annotation-store-tsv-store-options-property-builder function buildes out new instances of 
CfnAnnotationStore$TsvStoreOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:annotation-type` |
| `formatToHeader` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:format-to-header` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnAnnotationStore$TsvStoreOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :annotation-type)]
      (. builder annotationType data))
    (when-let [data (lookup-entry config id :format-to-header)]
      (. builder formatToHeader data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-reference-store-builder
  "The cfn-reference-store-builder function buildes out new instances of 
CfnReferenceStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnReferenceStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReferenceStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-reference-store-props-builder
  "The cfn-reference-store-props-builder function buildes out new instances of 
CfnReferenceStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnReferenceStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReferenceStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-reference-store-sse-config-property-builder
  "The cfn-reference-store-sse-config-property-builder function buildes out new instances of 
CfnReferenceStore$SseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnReferenceStore$SseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-run-group-builder
  "The cfn-run-group-builder function buildes out new instances of 
CfnRunGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-cpus` |
| `maxDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duration` |
| `maxGpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-gpus` |
| `maxRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRunGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :max-cpus)]
      (. builder maxCpus data))
    (when-let [data (lookup-entry config id :max-duration)]
      (. builder maxDuration data))
    (when-let [data (lookup-entry config id :max-gpus)]
      (. builder maxGpus data))
    (when-let [data (lookup-entry config id :max-runs)]
      (. builder maxRuns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-run-group-props-builder
  "The cfn-run-group-props-builder function buildes out new instances of 
CfnRunGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-cpus` |
| `maxDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duration` |
| `maxGpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-gpus` |
| `maxRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRunGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :max-cpus)]
      (. builder maxCpus data))
    (when-let [data (lookup-entry config id :max-duration)]
      (. builder maxDuration data))
    (when-let [data (lookup-entry config id :max-gpus)]
      (. builder maxGpus data))
    (when-let [data (lookup-entry config id :max-runs)]
      (. builder maxRuns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-sequence-store-builder
  "The cfn-sequence-store-builder function buildes out new instances of 
CfnSequenceStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fallbackLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSequenceStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fallback-location)]
      (. builder fallbackLocation data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-sequence-store-props-builder
  "The cfn-sequence-store-props-builder function buildes out new instances of 
CfnSequenceStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fallbackLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSequenceStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fallback-location)]
      (. builder fallbackLocation data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-sequence-store-sse-config-property-builder
  "The cfn-sequence-store-sse-config-property-builder function buildes out new instances of 
CfnSequenceStore$SseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSequenceStore$SseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-variant-store-builder
  "The cfn-variant-store-builder function buildes out new instances of 
CfnVariantStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnVariantStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVariantStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reference)]
      (. builder reference data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-variant-store-props-builder
  "The cfn-variant-store-props-builder function buildes out new instances of 
CfnVariantStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnVariantStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVariantStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reference)]
      (. builder reference data))
    (when-let [data (lookup-entry config id :sse-config)]
      (. builder sseConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-variant-store-reference-item-property-builder
  "The cfn-variant-store-reference-item-property-builder function buildes out new instances of 
CfnVariantStore$ReferenceItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-arn` |"
  [stack id config]
  (let [builder (CfnVariantStore$ReferenceItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :reference-arn)]
      (. builder referenceArn data))
    (.build builder)))


(defn cfn-variant-store-sse-config-property-builder
  "The cfn-variant-store-sse-config-property-builder function buildes out new instances of 
CfnVariantStore$SseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnVariantStore$SseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-workflow-builder
  "The cfn-workflow-builder function buildes out new instances of 
CfnWorkflow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerators` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerators` |
| `definitionUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `main` | java.lang.String | [[cdk.support/lookup-entry]] | `:main` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameterTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-template` |
| `storageCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accelerators)]
      (. builder accelerators data))
    (when-let [data (lookup-entry config id :definition-uri)]
      (. builder definitionUri data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :main)]
      (. builder main data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameter-template)]
      (. builder parameterTemplate data))
    (when-let [data (lookup-entry config id :storage-capacity)]
      (. builder storageCapacity data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workflow-props-builder
  "The cfn-workflow-props-builder function buildes out new instances of 
CfnWorkflowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerators` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerators` |
| `definitionUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-uri` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `main` | java.lang.String | [[cdk.support/lookup-entry]] | `:main` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameterTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameter-template` |
| `storageCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-capacity` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflowProps$Builder.)]
    (when-let [data (lookup-entry config id :accelerators)]
      (. builder accelerators data))
    (when-let [data (lookup-entry config id :definition-uri)]
      (. builder definitionUri data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :main)]
      (. builder main data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameter-template)]
      (. builder parameterTemplate data))
    (when-let [data (lookup-entry config id :storage-capacity)]
      (. builder storageCapacity data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workflow-workflow-parameter-property-builder
  "The cfn-workflow-workflow-parameter-property-builder function buildes out new instances of 
CfnWorkflow$WorkflowParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `optional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:optional` |"
  [stack id config]
  (let [builder (CfnWorkflow$WorkflowParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :optional)]
      (. builder optional data))
    (.build builder)))