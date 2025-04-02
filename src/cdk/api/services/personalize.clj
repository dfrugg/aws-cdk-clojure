(ns cdk.api.services.personalize
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.personalize package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.personalize CfnDataset$Builder
                                                        CfnDataset$DataSourceProperty$Builder
                                                        CfnDataset$DatasetImportJobProperty$Builder
                                                        CfnDatasetGroup$Builder
                                                        CfnDatasetGroupProps$Builder
                                                        CfnDatasetProps$Builder
                                                        CfnSchema$Builder
                                                        CfnSchemaProps$Builder
                                                        CfnSolution$AlgorithmHyperParameterRangesProperty$Builder
                                                        CfnSolution$AutoMLConfigProperty$Builder
                                                        CfnSolution$Builder
                                                        CfnSolution$CategoricalHyperParameterRangeProperty$Builder
                                                        CfnSolution$ContinuousHyperParameterRangeProperty$Builder
                                                        CfnSolution$HpoConfigProperty$Builder
                                                        CfnSolution$HpoObjectiveProperty$Builder
                                                        CfnSolution$HpoResourceConfigProperty$Builder
                                                        CfnSolution$IntegerHyperParameterRangeProperty$Builder
                                                        CfnSolution$SolutionConfigProperty$Builder
                                                        CfnSolutionProps$Builder]))


(defn cfn-dataset-builder>
  "The cfn-dataset-builder> function updates a CfnDataset$Builder instance using the provided configuration.
  The function takes the CfnDataset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `datasetImportJob` | software.amazon.awscdk.services.personalize.CfnDataset$DatasetImportJobProperty | [[cdk.support/lookup-entry]] | `:dataset-import-job` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
"
  [^CfnDataset$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-some [data (lookup-entry config id :dataset-import-job)]
    (. builder datasetImportJob data))
  (when-some [data (lookup-entry config id :dataset-type)]
    (. builder datasetType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (.build builder))


(defn cfn-dataset-builder
  "Creates a  `CfnDataset$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-dataset-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-dataset-builder> (CfnDataset$Builder/create scope (name id)) id config))


(defn cfn-dataset-data-source-property-builder>
  "The cfn-dataset-data-source-property-builder> function updates a CfnDataset$DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location` |
"
  [^CfnDataset$DataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-location)]
    (. builder dataLocation data))
  (.build builder))


(defn cfn-dataset-data-source-property-builder
  "Creates a  `CfnDataset$DataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dataset-data-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dataset-data-source-property-builder> (new CfnDataset$DataSourceProperty$Builder) id config))


(defn cfn-dataset-dataset-import-job-property-builder>
  "The cfn-dataset-dataset-import-job-property-builder> function updates a CfnDataset$DatasetImportJobProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatasetImportJobProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-source` |
| `datasetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-arn` |
| `datasetImportJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-import-job-arn` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDataset$DatasetImportJobProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (lookup-entry config id :dataset-arn)]
    (. builder datasetArn data))
  (when-some [data (lookup-entry config id :dataset-import-job-arn)]
    (. builder datasetImportJobArn data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-dataset-dataset-import-job-property-builder
  "Creates a  `CfnDataset$DatasetImportJobProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dataset-dataset-import-job-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dataset-dataset-import-job-property-builder> (new CfnDataset$DatasetImportJobProperty$Builder) id config))


(defn cfn-dataset-group-builder>
  "The cfn-dataset-group-builder> function updates a CfnDatasetGroup$Builder instance using the provided configuration.
  The function takes the CfnDatasetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDatasetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-dataset-group-builder
  "Creates a  `CfnDatasetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-dataset-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-dataset-group-builder> (CfnDatasetGroup$Builder/create scope (name id)) id config))


(defn cfn-dataset-group-props-builder>
  "The cfn-dataset-group-props-builder> function updates a CfnDatasetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDatasetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDatasetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-dataset-group-props-builder
  "Creates a  `CfnDatasetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dataset-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dataset-group-props-builder> (new CfnDatasetGroupProps$Builder) id config))


(defn cfn-dataset-props-builder>
  "The cfn-dataset-props-builder> function updates a CfnDatasetProps$Builder instance using the provided configuration.
  The function takes the CfnDatasetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `datasetImportJob` | software.amazon.awscdk.services.personalize.CfnDataset$DatasetImportJobProperty | [[cdk.support/lookup-entry]] | `:dataset-import-job` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
"
  [^CfnDatasetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-some [data (lookup-entry config id :dataset-import-job)]
    (. builder datasetImportJob data))
  (when-some [data (lookup-entry config id :dataset-type)]
    (. builder datasetType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (.build builder))


(defn cfn-dataset-props-builder
  "Creates a  `CfnDatasetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dataset-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dataset-props-builder> (new CfnDatasetProps$Builder) id config))


(defn cfn-schema-builder>
  "The cfn-schema-builder> function updates a CfnSchema$Builder instance using the provided configuration.
  The function takes the CfnSchema$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnSchema$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn cfn-schema-builder
  "Creates a  `CfnSchema$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-schema-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-schema-builder> (CfnSchema$Builder/create scope (name id)) id config))


(defn cfn-schema-props-builder>
  "The cfn-schema-props-builder> function updates a CfnSchemaProps$Builder instance using the provided configuration.
  The function takes the CfnSchemaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnSchemaProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn cfn-schema-props-builder
  "Creates a  `CfnSchemaProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-schema-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-schema-props-builder> (new CfnSchemaProps$Builder) id config))


(defn cfn-solution-algorithm-hyper-parameter-ranges-property-builder>
  "The cfn-solution-algorithm-hyper-parameter-ranges-property-builder> function updates a CfnSolution$AlgorithmHyperParameterRangesProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$AlgorithmHyperParameterRangesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `categoricalHyperParameterRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:categorical-hyper-parameter-ranges` |
| `continuousHyperParameterRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:continuous-hyper-parameter-ranges` |
| `integerHyperParameterRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:integer-hyper-parameter-ranges` |
"
  [^CfnSolution$AlgorithmHyperParameterRangesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :categorical-hyper-parameter-ranges)]
    (. builder categoricalHyperParameterRanges data))
  (when-some [data (lookup-entry config id :continuous-hyper-parameter-ranges)]
    (. builder continuousHyperParameterRanges data))
  (when-some [data (lookup-entry config id :integer-hyper-parameter-ranges)]
    (. builder integerHyperParameterRanges data))
  (.build builder))


(defn cfn-solution-algorithm-hyper-parameter-ranges-property-builder
  "Creates a  `CfnSolution$AlgorithmHyperParameterRangesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-algorithm-hyper-parameter-ranges-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-algorithm-hyper-parameter-ranges-property-builder> (new CfnSolution$AlgorithmHyperParameterRangesProperty$Builder) id config))


(defn cfn-solution-auto-ml-config-property-builder>
  "The cfn-solution-auto-ml-config-property-builder> function updates a CfnSolution$AutoMLConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$AutoMLConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `recipeList` | java.util.List | [[cdk.support/lookup-entry]] | `:recipe-list` |
"
  [^CfnSolution$AutoMLConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :recipe-list)]
    (. builder recipeList data))
  (.build builder))


(defn cfn-solution-auto-ml-config-property-builder
  "Creates a  `CfnSolution$AutoMLConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-auto-ml-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-auto-ml-config-property-builder> (new CfnSolution$AutoMLConfigProperty$Builder) id config))


(defn cfn-solution-builder>
  "The cfn-solution-builder> function updates a CfnSolution$Builder instance using the provided configuration.
  The function takes the CfnSolution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `performAutoMl` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:perform-auto-ml` |
| `performHpo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:perform-hpo` |
| `recipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-arn` |
| `solutionConfig` | software.amazon.awscdk.services.personalize.CfnSolution$SolutionConfigProperty | [[cdk.support/lookup-entry]] | `:solution-config` |
"
  [^CfnSolution$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-some [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :perform-auto-ml)]
    (. builder performAutoMl data))
  (when-some [data (lookup-entry config id :perform-hpo)]
    (. builder performHpo data))
  (when-some [data (lookup-entry config id :recipe-arn)]
    (. builder recipeArn data))
  (when-some [data (lookup-entry config id :solution-config)]
    (. builder solutionConfig data))
  (.build builder))


(defn cfn-solution-builder
  "Creates a  `CfnSolution$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-solution-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-solution-builder> (CfnSolution$Builder/create scope (name id)) id config))


(defn cfn-solution-categorical-hyper-parameter-range-property-builder>
  "The cfn-solution-categorical-hyper-parameter-range-property-builder> function updates a CfnSolution$CategoricalHyperParameterRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$CategoricalHyperParameterRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnSolution$CategoricalHyperParameterRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-solution-categorical-hyper-parameter-range-property-builder
  "Creates a  `CfnSolution$CategoricalHyperParameterRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-categorical-hyper-parameter-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-categorical-hyper-parameter-range-property-builder> (new CfnSolution$CategoricalHyperParameterRangeProperty$Builder) id config))


(defn cfn-solution-continuous-hyper-parameter-range-property-builder>
  "The cfn-solution-continuous-hyper-parameter-range-property-builder> function updates a CfnSolution$ContinuousHyperParameterRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$ContinuousHyperParameterRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnSolution$ContinuousHyperParameterRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-solution-continuous-hyper-parameter-range-property-builder
  "Creates a  `CfnSolution$ContinuousHyperParameterRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-continuous-hyper-parameter-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-continuous-hyper-parameter-range-property-builder> (new CfnSolution$ContinuousHyperParameterRangeProperty$Builder) id config))


(defn cfn-solution-hpo-config-property-builder>
  "The cfn-solution-hpo-config-property-builder> function updates a CfnSolution$HpoConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$HpoConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmHyperParameterRanges` | software.amazon.awscdk.services.personalize.CfnSolution$AlgorithmHyperParameterRangesProperty | [[cdk.support/lookup-entry]] | `:algorithm-hyper-parameter-ranges` |
| `hpoObjective` | software.amazon.awscdk.services.personalize.CfnSolution$HpoObjectiveProperty | [[cdk.support/lookup-entry]] | `:hpo-objective` |
| `hpoResourceConfig` | software.amazon.awscdk.services.personalize.CfnSolution$HpoResourceConfigProperty | [[cdk.support/lookup-entry]] | `:hpo-resource-config` |
"
  [^CfnSolution$HpoConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm-hyper-parameter-ranges)]
    (. builder algorithmHyperParameterRanges data))
  (when-some [data (lookup-entry config id :hpo-objective)]
    (. builder hpoObjective data))
  (when-some [data (lookup-entry config id :hpo-resource-config)]
    (. builder hpoResourceConfig data))
  (.build builder))


(defn cfn-solution-hpo-config-property-builder
  "Creates a  `CfnSolution$HpoConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-hpo-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-hpo-config-property-builder> (new CfnSolution$HpoConfigProperty$Builder) id config))


(defn cfn-solution-hpo-objective-property-builder>
  "The cfn-solution-hpo-objective-property-builder> function updates a CfnSolution$HpoObjectiveProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$HpoObjectiveProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-regex` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSolution$HpoObjectiveProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-regex)]
    (. builder metricRegex data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-solution-hpo-objective-property-builder
  "Creates a  `CfnSolution$HpoObjectiveProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-hpo-objective-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-hpo-objective-property-builder> (new CfnSolution$HpoObjectiveProperty$Builder) id config))


(defn cfn-solution-hpo-resource-config-property-builder>
  "The cfn-solution-hpo-resource-config-property-builder> function updates a CfnSolution$HpoResourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$HpoResourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxNumberOfTrainingJobs` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-number-of-training-jobs` |
| `maxParallelTrainingJobs` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-parallel-training-jobs` |
"
  [^CfnSolution$HpoResourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-number-of-training-jobs)]
    (. builder maxNumberOfTrainingJobs data))
  (when-some [data (lookup-entry config id :max-parallel-training-jobs)]
    (. builder maxParallelTrainingJobs data))
  (.build builder))


(defn cfn-solution-hpo-resource-config-property-builder
  "Creates a  `CfnSolution$HpoResourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-hpo-resource-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-hpo-resource-config-property-builder> (new CfnSolution$HpoResourceConfigProperty$Builder) id config))


(defn cfn-solution-integer-hyper-parameter-range-property-builder>
  "The cfn-solution-integer-hyper-parameter-range-property-builder> function updates a CfnSolution$IntegerHyperParameterRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$IntegerHyperParameterRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnSolution$IntegerHyperParameterRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-solution-integer-hyper-parameter-range-property-builder
  "Creates a  `CfnSolution$IntegerHyperParameterRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-integer-hyper-parameter-range-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-integer-hyper-parameter-range-property-builder> (new CfnSolution$IntegerHyperParameterRangeProperty$Builder) id config))


(defn cfn-solution-props-builder>
  "The cfn-solution-props-builder> function updates a CfnSolutionProps$Builder instance using the provided configuration.
  The function takes the CfnSolutionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `performAutoMl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:perform-auto-ml` |
| `performHpo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:perform-hpo` |
| `recipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-arn` |
| `solutionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:solution-config` |
"
  [^CfnSolutionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-some [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :perform-auto-ml)]
    (. builder performAutoMl data))
  (when-some [data (lookup-entry config id :perform-hpo)]
    (. builder performHpo data))
  (when-some [data (lookup-entry config id :recipe-arn)]
    (. builder recipeArn data))
  (when-some [data (lookup-entry config id :solution-config)]
    (. builder solutionConfig data))
  (.build builder))


(defn cfn-solution-props-builder
  "Creates a  `CfnSolutionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-props-builder> (new CfnSolutionProps$Builder) id config))


(defn cfn-solution-solution-config-property-builder>
  "The cfn-solution-solution-config-property-builder> function updates a CfnSolution$SolutionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$SolutionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmHyperParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:algorithm-hyper-parameters` |
| `autoMlConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:auto-ml-config` |
| `eventValueThreshold` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-value-threshold` |
| `featureTransformationParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:feature-transformation-parameters` |
| `hpoConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:hpo-config` |
"
  [^CfnSolution$SolutionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm-hyper-parameters)]
    (. builder algorithmHyperParameters data))
  (when-some [data (lookup-entry config id :auto-ml-config)]
    (. builder autoMlConfig data))
  (when-some [data (lookup-entry config id :event-value-threshold)]
    (. builder eventValueThreshold data))
  (when-some [data (lookup-entry config id :feature-transformation-parameters)]
    (. builder featureTransformationParameters data))
  (when-some [data (lookup-entry config id :hpo-config)]
    (. builder hpoConfig data))
  (.build builder))


(defn cfn-solution-solution-config-property-builder
  "Creates a  `CfnSolution$SolutionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-solution-solution-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-solution-solution-config-property-builder> (new CfnSolution$SolutionConfigProperty$Builder) id config))