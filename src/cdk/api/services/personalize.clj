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


(defn cfn-dataset-builder
  "The cfn-dataset-builder function buildes out new instances of 
CfnDataset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `datasetImportJob` | software.amazon.awscdk.services.personalize.CfnDataset$DatasetImportJobProperty | [[cdk.support/lookup-entry]] | `:dataset-import-job` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |"
  [stack id config]
  (let [builder (CfnDataset$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-dataset-data-source-property-builder
  "The cfn-dataset-data-source-property-builder function buildes out new instances of 
CfnDataset$DataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location` |"
  [stack id config]
  (let [builder (CfnDataset$DataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-location)]
      (. builder dataLocation data))
    (.build builder)))


(defn cfn-dataset-dataset-import-job-property-builder
  "The cfn-dataset-dataset-import-job-property-builder function buildes out new instances of 
CfnDataset$DatasetImportJobProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-source` |
| `datasetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-arn` |
| `datasetImportJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-import-job-arn` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDataset$DatasetImportJobProperty$Builder.)]
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
    (.build builder)))


(defn cfn-dataset-group-builder
  "The cfn-dataset-group-builder function buildes out new instances of 
CfnDatasetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDatasetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-dataset-group-props-builder
  "The cfn-dataset-group-props-builder function buildes out new instances of 
CfnDatasetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDatasetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-dataset-props-builder
  "The cfn-dataset-props-builder function buildes out new instances of 
CfnDatasetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `datasetImportJob` | software.amazon.awscdk.services.personalize.CfnDataset$DatasetImportJobProperty | [[cdk.support/lookup-entry]] | `:dataset-import-job` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |"
  [stack id config]
  (let [builder (CfnDatasetProps$Builder.)]
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
    (.build builder)))


(defn cfn-schema-builder
  "The cfn-schema-builder function buildes out new instances of 
CfnSchema$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnSchema$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-schema-props-builder
  "The cfn-schema-props-builder function buildes out new instances of 
CfnSchemaProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnSchemaProps$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-solution-algorithm-hyper-parameter-ranges-property-builder
  "The cfn-solution-algorithm-hyper-parameter-ranges-property-builder function buildes out new instances of 
CfnSolution$AlgorithmHyperParameterRangesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `categoricalHyperParameterRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:categorical-hyper-parameter-ranges` |
| `continuousHyperParameterRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:continuous-hyper-parameter-ranges` |
| `integerHyperParameterRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:integer-hyper-parameter-ranges` |"
  [stack id config]
  (let [builder (CfnSolution$AlgorithmHyperParameterRangesProperty$Builder.)]
    (when-let [data (lookup-entry config id :categorical-hyper-parameter-ranges)]
      (. builder categoricalHyperParameterRanges data))
    (when-let [data (lookup-entry config id :continuous-hyper-parameter-ranges)]
      (. builder continuousHyperParameterRanges data))
    (when-let [data (lookup-entry config id :integer-hyper-parameter-ranges)]
      (. builder integerHyperParameterRanges data))
    (.build builder)))


(defn cfn-solution-auto-ml-config-property-builder
  "The cfn-solution-auto-ml-config-property-builder function buildes out new instances of 
CfnSolution$AutoMLConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `recipeList` | java.util.List | [[cdk.support/lookup-entry]] | `:recipe-list` |"
  [stack id config]
  (let [builder (CfnSolution$AutoMLConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :recipe-list)]
      (. builder recipeList data))
    (.build builder)))


(defn cfn-solution-builder
  "The cfn-solution-builder function buildes out new instances of 
CfnSolution$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `performAutoMl` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:perform-auto-ml` |
| `performHpo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:perform-hpo` |
| `recipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-arn` |
| `solutionConfig` | software.amazon.awscdk.services.personalize.CfnSolution$SolutionConfigProperty | [[cdk.support/lookup-entry]] | `:solution-config` |"
  [stack id config]
  (let [builder (CfnSolution$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-solution-categorical-hyper-parameter-range-property-builder
  "The cfn-solution-categorical-hyper-parameter-range-property-builder function buildes out new instances of 
CfnSolution$CategoricalHyperParameterRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnSolution$CategoricalHyperParameterRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-solution-continuous-hyper-parameter-range-property-builder
  "The cfn-solution-continuous-hyper-parameter-range-property-builder function buildes out new instances of 
CfnSolution$ContinuousHyperParameterRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSolution$ContinuousHyperParameterRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-value)]
      (. builder maxValue data))
    (when-let [data (lookup-entry config id :min-value)]
      (. builder minValue data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-solution-hpo-config-property-builder
  "The cfn-solution-hpo-config-property-builder function buildes out new instances of 
CfnSolution$HpoConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmHyperParameterRanges` | software.amazon.awscdk.services.personalize.CfnSolution$AlgorithmHyperParameterRangesProperty | [[cdk.support/lookup-entry]] | `:algorithm-hyper-parameter-ranges` |
| `hpoObjective` | software.amazon.awscdk.services.personalize.CfnSolution$HpoObjectiveProperty | [[cdk.support/lookup-entry]] | `:hpo-objective` |
| `hpoResourceConfig` | software.amazon.awscdk.services.personalize.CfnSolution$HpoResourceConfigProperty | [[cdk.support/lookup-entry]] | `:hpo-resource-config` |"
  [stack id config]
  (let [builder (CfnSolution$HpoConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm-hyper-parameter-ranges)]
      (. builder algorithmHyperParameterRanges data))
    (when-let [data (lookup-entry config id :hpo-objective)]
      (. builder hpoObjective data))
    (when-let [data (lookup-entry config id :hpo-resource-config)]
      (. builder hpoResourceConfig data))
    (.build builder)))


(defn cfn-solution-hpo-objective-property-builder
  "The cfn-solution-hpo-objective-property-builder function buildes out new instances of 
CfnSolution$HpoObjectiveProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-regex` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSolution$HpoObjectiveProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-regex)]
      (. builder metricRegex data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-solution-hpo-resource-config-property-builder
  "The cfn-solution-hpo-resource-config-property-builder function buildes out new instances of 
CfnSolution$HpoResourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxNumberOfTrainingJobs` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-number-of-training-jobs` |
| `maxParallelTrainingJobs` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-parallel-training-jobs` |"
  [stack id config]
  (let [builder (CfnSolution$HpoResourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-number-of-training-jobs)]
      (. builder maxNumberOfTrainingJobs data))
    (when-let [data (lookup-entry config id :max-parallel-training-jobs)]
      (. builder maxParallelTrainingJobs data))
    (.build builder)))


(defn cfn-solution-integer-hyper-parameter-range-property-builder
  "The cfn-solution-integer-hyper-parameter-range-property-builder function buildes out new instances of 
CfnSolution$IntegerHyperParameterRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSolution$IntegerHyperParameterRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-value)]
      (. builder maxValue data))
    (when-let [data (lookup-entry config id :min-value)]
      (. builder minValue data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-solution-props-builder
  "The cfn-solution-props-builder function buildes out new instances of 
CfnSolutionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-arn` |
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `performAutoMl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:perform-auto-ml` |
| `performHpo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:perform-hpo` |
| `recipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-arn` |
| `solutionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:solution-config` |"
  [stack id config]
  (let [builder (CfnSolutionProps$Builder.)]
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
    (.build builder)))


(defn cfn-solution-solution-config-property-builder
  "The cfn-solution-solution-config-property-builder function buildes out new instances of 
CfnSolution$SolutionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmHyperParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:algorithm-hyper-parameters` |
| `autoMlConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:auto-ml-config` |
| `eventValueThreshold` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-value-threshold` |
| `featureTransformationParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:feature-transformation-parameters` |
| `hpoConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:hpo-config` |"
  [stack id config]
  (let [builder (CfnSolution$SolutionConfigProperty$Builder.)]
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
    (.build builder)))