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


(defn cfn-annotation-store-builder>
  "The cfn-annotation-store-builder> function updates a CfnAnnotationStore$Builder instance using the provided configuration.
  The function takes the CfnAnnotationStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnAnnotationStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `storeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:store-format` |
| `storeOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:store-options` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAnnotationStore$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :reference)]
    (. builder reference data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :store-format)]
    (. builder storeFormat data))
  (when-some [data (lookup-entry config id :store-options)]
    (. builder storeOptions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-annotation-store-builder
  "Creates a  `CfnAnnotationStore$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-annotation-store-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-annotation-store-builder> (CfnAnnotationStore$Builder/create scope (name id)) id config))


(defn cfn-annotation-store-props-builder>
  "The cfn-annotation-store-props-builder> function updates a CfnAnnotationStoreProps$Builder instance using the provided configuration.
  The function takes the CfnAnnotationStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnAnnotationStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `storeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:store-format` |
| `storeOptions` | software.amazon.awscdk.services.omics.CfnAnnotationStore$StoreOptionsProperty | [[cdk.support/lookup-entry]] | `:store-options` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAnnotationStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :reference)]
    (. builder reference data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :store-format)]
    (. builder storeFormat data))
  (when-some [data (lookup-entry config id :store-options)]
    (. builder storeOptions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-annotation-store-props-builder
  "Creates a  `CfnAnnotationStoreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-annotation-store-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-annotation-store-props-builder> (new CfnAnnotationStoreProps$Builder) id config))


(defn cfn-annotation-store-reference-item-property-builder>
  "The cfn-annotation-store-reference-item-property-builder> function updates a CfnAnnotationStore$ReferenceItemProperty$Builder instance using the provided configuration.
  The function takes the CfnAnnotationStore$ReferenceItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-arn` |
"
  [^CfnAnnotationStore$ReferenceItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :reference-arn)]
    (. builder referenceArn data))
  (.build builder))


(defn cfn-annotation-store-reference-item-property-builder
  "Creates a  `CfnAnnotationStore$ReferenceItemProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-annotation-store-reference-item-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-annotation-store-reference-item-property-builder> (new CfnAnnotationStore$ReferenceItemProperty$Builder) id config))


(defn cfn-annotation-store-sse-config-property-builder>
  "The cfn-annotation-store-sse-config-property-builder> function updates a CfnAnnotationStore$SseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnnotationStore$SseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAnnotationStore$SseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-annotation-store-sse-config-property-builder
  "Creates a  `CfnAnnotationStore$SseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-annotation-store-sse-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-annotation-store-sse-config-property-builder> (new CfnAnnotationStore$SseConfigProperty$Builder) id config))


(defn cfn-annotation-store-store-options-property-builder>
  "The cfn-annotation-store-store-options-property-builder> function updates a CfnAnnotationStore$StoreOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnAnnotationStore$StoreOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tsvStoreOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tsv-store-options` |
"
  [^CfnAnnotationStore$StoreOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :tsv-store-options)]
    (. builder tsvStoreOptions data))
  (.build builder))


(defn cfn-annotation-store-store-options-property-builder
  "Creates a  `CfnAnnotationStore$StoreOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-annotation-store-store-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-annotation-store-store-options-property-builder> (new CfnAnnotationStore$StoreOptionsProperty$Builder) id config))


(defn cfn-annotation-store-tsv-store-options-property-builder>
  "The cfn-annotation-store-tsv-store-options-property-builder> function updates a CfnAnnotationStore$TsvStoreOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnAnnotationStore$TsvStoreOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:annotation-type` |
| `formatToHeader` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:format-to-header` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnAnnotationStore$TsvStoreOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :annotation-type)]
    (. builder annotationType data))
  (when-some [data (lookup-entry config id :format-to-header)]
    (. builder formatToHeader data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn cfn-annotation-store-tsv-store-options-property-builder
  "Creates a  `CfnAnnotationStore$TsvStoreOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-annotation-store-tsv-store-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-annotation-store-tsv-store-options-property-builder> (new CfnAnnotationStore$TsvStoreOptionsProperty$Builder) id config))


(defn cfn-reference-store-builder>
  "The cfn-reference-store-builder> function updates a CfnReferenceStore$Builder instance using the provided configuration.
  The function takes the CfnReferenceStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnReferenceStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReferenceStore$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-reference-store-builder
  "Creates a  `CfnReferenceStore$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-reference-store-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-reference-store-builder> (CfnReferenceStore$Builder/create scope (name id)) id config))


(defn cfn-reference-store-props-builder>
  "The cfn-reference-store-props-builder> function updates a CfnReferenceStoreProps$Builder instance using the provided configuration.
  The function takes the CfnReferenceStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnReferenceStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReferenceStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-reference-store-props-builder
  "Creates a  `CfnReferenceStoreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-reference-store-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-reference-store-props-builder> (new CfnReferenceStoreProps$Builder) id config))


(defn cfn-reference-store-sse-config-property-builder>
  "The cfn-reference-store-sse-config-property-builder> function updates a CfnReferenceStore$SseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnReferenceStore$SseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnReferenceStore$SseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-reference-store-sse-config-property-builder
  "Creates a  `CfnReferenceStore$SseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-reference-store-sse-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-reference-store-sse-config-property-builder> (new CfnReferenceStore$SseConfigProperty$Builder) id config))


(defn cfn-run-group-builder>
  "The cfn-run-group-builder> function updates a CfnRunGroup$Builder instance using the provided configuration.
  The function takes the CfnRunGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-cpus` |
| `maxDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duration` |
| `maxGpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-gpus` |
| `maxRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRunGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :max-cpus)]
    (. builder maxCpus data))
  (when-some [data (lookup-entry config id :max-duration)]
    (. builder maxDuration data))
  (when-some [data (lookup-entry config id :max-gpus)]
    (. builder maxGpus data))
  (when-some [data (lookup-entry config id :max-runs)]
    (. builder maxRuns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-run-group-builder
  "Creates a  `CfnRunGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-run-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-run-group-builder> (CfnRunGroup$Builder/create scope (name id)) id config))


(defn cfn-run-group-props-builder>
  "The cfn-run-group-props-builder> function updates a CfnRunGroupProps$Builder instance using the provided configuration.
  The function takes the CfnRunGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-cpus` |
| `maxDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duration` |
| `maxGpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-gpus` |
| `maxRuns` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRunGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :max-cpus)]
    (. builder maxCpus data))
  (when-some [data (lookup-entry config id :max-duration)]
    (. builder maxDuration data))
  (when-some [data (lookup-entry config id :max-gpus)]
    (. builder maxGpus data))
  (when-some [data (lookup-entry config id :max-runs)]
    (. builder maxRuns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-run-group-props-builder
  "Creates a  `CfnRunGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-run-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-run-group-props-builder> (new CfnRunGroupProps$Builder) id config))


(defn cfn-sequence-store-builder>
  "The cfn-sequence-store-builder> function updates a CfnSequenceStore$Builder instance using the provided configuration.
  The function takes the CfnSequenceStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fallbackLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSequenceStore$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fallback-location)]
    (. builder fallbackLocation data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-sequence-store-builder
  "Creates a  `CfnSequenceStore$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-sequence-store-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-sequence-store-builder> (CfnSequenceStore$Builder/create scope (name id)) id config))


(defn cfn-sequence-store-props-builder>
  "The cfn-sequence-store-props-builder> function updates a CfnSequenceStoreProps$Builder instance using the provided configuration.
  The function takes the CfnSequenceStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fallbackLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSequenceStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fallback-location)]
    (. builder fallbackLocation data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-sequence-store-props-builder
  "Creates a  `CfnSequenceStoreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-sequence-store-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-sequence-store-props-builder> (new CfnSequenceStoreProps$Builder) id config))


(defn cfn-sequence-store-sse-config-property-builder>
  "The cfn-sequence-store-sse-config-property-builder> function updates a CfnSequenceStore$SseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSequenceStore$SseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSequenceStore$SseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-sequence-store-sse-config-property-builder
  "Creates a  `CfnSequenceStore$SseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-sequence-store-sse-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-sequence-store-sse-config-property-builder> (new CfnSequenceStore$SseConfigProperty$Builder) id config))


(defn cfn-variant-store-builder>
  "The cfn-variant-store-builder> function updates a CfnVariantStore$Builder instance using the provided configuration.
  The function takes the CfnVariantStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnVariantStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVariantStore$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :reference)]
    (. builder reference data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-variant-store-builder
  "Creates a  `CfnVariantStore$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-variant-store-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-variant-store-builder> (CfnVariantStore$Builder/create scope (name id)) id config))


(defn cfn-variant-store-props-builder>
  "The cfn-variant-store-props-builder> function updates a CfnVariantStoreProps$Builder instance using the provided configuration.
  The function takes the CfnVariantStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference` |
| `sseConfig` | software.amazon.awscdk.services.omics.CfnVariantStore$SseConfigProperty | [[cdk.support/lookup-entry]] | `:sse-config` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVariantStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :reference)]
    (. builder reference data))
  (when-some [data (lookup-entry config id :sse-config)]
    (. builder sseConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-variant-store-props-builder
  "Creates a  `CfnVariantStoreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-variant-store-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-variant-store-props-builder> (new CfnVariantStoreProps$Builder) id config))


(defn cfn-variant-store-reference-item-property-builder>
  "The cfn-variant-store-reference-item-property-builder> function updates a CfnVariantStore$ReferenceItemProperty$Builder instance using the provided configuration.
  The function takes the CfnVariantStore$ReferenceItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-arn` |
"
  [^CfnVariantStore$ReferenceItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :reference-arn)]
    (. builder referenceArn data))
  (.build builder))


(defn cfn-variant-store-reference-item-property-builder
  "Creates a  `CfnVariantStore$ReferenceItemProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-variant-store-reference-item-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-variant-store-reference-item-property-builder> (new CfnVariantStore$ReferenceItemProperty$Builder) id config))


(defn cfn-variant-store-sse-config-property-builder>
  "The cfn-variant-store-sse-config-property-builder> function updates a CfnVariantStore$SseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnVariantStore$SseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnVariantStore$SseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-variant-store-sse-config-property-builder
  "Creates a  `CfnVariantStore$SseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-variant-store-sse-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-variant-store-sse-config-property-builder> (new CfnVariantStore$SseConfigProperty$Builder) id config))


(defn cfn-workflow-builder>
  "The cfn-workflow-builder> function updates a CfnWorkflow$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflow$Builder builder id config]
  (when-some [data (lookup-entry config id :accelerators)]
    (. builder accelerators data))
  (when-some [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :main)]
    (. builder main data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameter-template)]
    (. builder parameterTemplate data))
  (when-some [data (lookup-entry config id :storage-capacity)]
    (. builder storageCapacity data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-builder
  "Creates a  `CfnWorkflow$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-workflow-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workflow-builder> (CfnWorkflow$Builder/create scope (name id)) id config))


(defn cfn-workflow-props-builder>
  "The cfn-workflow-props-builder> function updates a CfnWorkflowProps$Builder instance using the provided configuration.
  The function takes the CfnWorkflowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :accelerators)]
    (. builder accelerators data))
  (when-some [data (lookup-entry config id :definition-uri)]
    (. builder definitionUri data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :main)]
    (. builder main data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameter-template)]
    (. builder parameterTemplate data))
  (when-some [data (lookup-entry config id :storage-capacity)]
    (. builder storageCapacity data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-props-builder
  "Creates a  `CfnWorkflowProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-props-builder> (new CfnWorkflowProps$Builder) id config))


(defn cfn-workflow-workflow-parameter-property-builder>
  "The cfn-workflow-workflow-parameter-property-builder> function updates a CfnWorkflow$WorkflowParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$WorkflowParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `optional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:optional` |
"
  [^CfnWorkflow$WorkflowParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :optional)]
    (. builder optional data))
  (.build builder))


(defn cfn-workflow-workflow-parameter-property-builder
  "Creates a  `CfnWorkflow$WorkflowParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-workflow-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-workflow-parameter-property-builder> (new CfnWorkflow$WorkflowParameterProperty$Builder) id config))