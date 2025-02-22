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


(defn build-cfn-dataset-builder
  "The build-cfn-dataset-builder function updates a CfnDataset$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-let [data (lookup-entry config id :dataset-import-job)]
    (. builder datasetImportJob data))
  (when-let [data (lookup-entry config id :dataset-type)]
    (. builder datasetType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (.build builder))


(defn build-cfn-dataset-data-source-property-builder
  "The build-cfn-dataset-data-source-property-builder function updates a CfnDataset$DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location` |
"
  [^CfnDataset$DataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-location)]
    (. builder dataLocation data))
  (.build builder))


(defn build-cfn-dataset-dataset-import-job-property-builder
  "The build-cfn-dataset-dataset-import-job-property-builder function updates a CfnDataset$DatasetImportJobProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-let [data (lookup-entry config id :dataset-arn)]
    (. builder datasetArn data))
  (when-let [data (lookup-entry config id :dataset-import-job-arn)]
    (. builder datasetImportJobArn data))
  (when-let [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-dataset-group-builder
  "The build-cfn-dataset-group-builder function updates a CfnDatasetGroup$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-dataset-group-props-builder
  "The build-cfn-dataset-group-props-builder function updates a CfnDatasetGroupProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-dataset-props-builder
  "The build-cfn-dataset-props-builder function updates a CfnDatasetProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-let [data (lookup-entry config id :dataset-import-job)]
    (. builder datasetImportJob data))
  (when-let [data (lookup-entry config id :dataset-type)]
    (. builder datasetType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (.build builder))


(defn build-cfn-schema-builder
  "The build-cfn-schema-builder function updates a CfnSchema$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn build-cfn-schema-props-builder
  "The build-cfn-schema-props-builder function updates a CfnSchemaProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn build-cfn-solution-algorithm-hyper-parameter-ranges-property-builder
  "The build-cfn-solution-algorithm-hyper-parameter-ranges-property-builder function updates a CfnSolution$AlgorithmHyperParameterRangesProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :categorical-hyper-parameter-ranges)]
    (. builder categoricalHyperParameterRanges data))
  (when-let [data (lookup-entry config id :continuous-hyper-parameter-ranges)]
    (. builder continuousHyperParameterRanges data))
  (when-let [data (lookup-entry config id :integer-hyper-parameter-ranges)]
    (. builder integerHyperParameterRanges data))
  (.build builder))


(defn build-cfn-solution-auto-ml-config-property-builder
  "The build-cfn-solution-auto-ml-config-property-builder function updates a CfnSolution$AutoMLConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$AutoMLConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `recipeList` | java.util.List | [[cdk.support/lookup-entry]] | `:recipe-list` |
"
  [^CfnSolution$AutoMLConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :recipe-list)]
    (. builder recipeList data))
  (.build builder))


(defn build-cfn-solution-builder
  "The build-cfn-solution-builder function updates a CfnSolution$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-let [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :perform-auto-ml)]
    (. builder performAutoMl data))
  (when-let [data (lookup-entry config id :perform-hpo)]
    (. builder performHpo data))
  (when-let [data (lookup-entry config id :recipe-arn)]
    (. builder recipeArn data))
  (when-let [data (lookup-entry config id :solution-config)]
    (. builder solutionConfig data))
  (.build builder))


(defn build-cfn-solution-categorical-hyper-parameter-range-property-builder
  "The build-cfn-solution-categorical-hyper-parameter-range-property-builder function updates a CfnSolution$CategoricalHyperParameterRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$CategoricalHyperParameterRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnSolution$CategoricalHyperParameterRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-solution-continuous-hyper-parameter-range-property-builder
  "The build-cfn-solution-continuous-hyper-parameter-range-property-builder function updates a CfnSolution$ContinuousHyperParameterRangeProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-let [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-solution-hpo-config-property-builder
  "The build-cfn-solution-hpo-config-property-builder function updates a CfnSolution$HpoConfigProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :algorithm-hyper-parameter-ranges)]
    (. builder algorithmHyperParameterRanges data))
  (when-let [data (lookup-entry config id :hpo-objective)]
    (. builder hpoObjective data))
  (when-let [data (lookup-entry config id :hpo-resource-config)]
    (. builder hpoResourceConfig data))
  (.build builder))


(defn build-cfn-solution-hpo-objective-property-builder
  "The build-cfn-solution-hpo-objective-property-builder function updates a CfnSolution$HpoObjectiveProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :metric-regex)]
    (. builder metricRegex data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-solution-hpo-resource-config-property-builder
  "The build-cfn-solution-hpo-resource-config-property-builder function updates a CfnSolution$HpoResourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSolution$HpoResourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxNumberOfTrainingJobs` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-number-of-training-jobs` |
| `maxParallelTrainingJobs` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-parallel-training-jobs` |
"
  [^CfnSolution$HpoResourceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-number-of-training-jobs)]
    (. builder maxNumberOfTrainingJobs data))
  (when-let [data (lookup-entry config id :max-parallel-training-jobs)]
    (. builder maxParallelTrainingJobs data))
  (.build builder))


(defn build-cfn-solution-integer-hyper-parameter-range-property-builder
  "The build-cfn-solution-integer-hyper-parameter-range-property-builder function updates a CfnSolution$IntegerHyperParameterRangeProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-let [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-solution-props-builder
  "The build-cfn-solution-props-builder function updates a CfnSolutionProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :dataset-group-arn)]
    (. builder datasetGroupArn data))
  (when-let [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :perform-auto-ml)]
    (. builder performAutoMl data))
  (when-let [data (lookup-entry config id :perform-hpo)]
    (. builder performHpo data))
  (when-let [data (lookup-entry config id :recipe-arn)]
    (. builder recipeArn data))
  (when-let [data (lookup-entry config id :solution-config)]
    (. builder solutionConfig data))
  (.build builder))


(defn build-cfn-solution-solution-config-property-builder
  "The build-cfn-solution-solution-config-property-builder function updates a CfnSolution$SolutionConfigProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :algorithm-hyper-parameters)]
    (. builder algorithmHyperParameters data))
  (when-let [data (lookup-entry config id :auto-ml-config)]
    (. builder autoMlConfig data))
  (when-let [data (lookup-entry config id :event-value-threshold)]
    (. builder eventValueThreshold data))
  (when-let [data (lookup-entry config id :feature-transformation-parameters)]
    (. builder featureTransformationParameters data))
  (when-let [data (lookup-entry config id :hpo-config)]
    (. builder hpoConfig data))
  (.build builder))