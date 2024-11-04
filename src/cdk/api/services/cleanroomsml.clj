(ns cdk.api.services.cleanroomsml
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cleanroomsml package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cleanroomsml CfnTrainingDataset$Builder
                                                         CfnTrainingDataset$ColumnSchemaProperty$Builder
                                                         CfnTrainingDataset$DataSourceProperty$Builder
                                                         CfnTrainingDataset$DatasetInputConfigProperty$Builder
                                                         CfnTrainingDataset$DatasetProperty$Builder
                                                         CfnTrainingDataset$GlueDataSourceProperty$Builder
                                                         CfnTrainingDatasetProps$Builder]))


(defn cfn-training-dataset-builder
  "The cfn-training-dataset-builder function buildes out new instances of 
CfnTrainingDataset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trainingData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:training-data` |"
  [stack id config]
  (let [builder (CfnTrainingDataset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :training-data)]
      (. builder trainingData data))
    (.build builder)))


(defn cfn-training-dataset-column-schema-property-builder
  "The cfn-training-dataset-column-schema-property-builder function buildes out new instances of 
CfnTrainingDataset$ColumnSchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
| `columnTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:column-types` |"
  [stack id config]
  (let [builder (CfnTrainingDataset$ColumnSchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :column-name)]
      (. builder columnName data))
    (when-let [data (lookup-entry config id :column-types)]
      (. builder columnTypes data))
    (.build builder)))


(defn cfn-training-dataset-data-source-property-builder
  "The cfn-training-dataset-data-source-property-builder function buildes out new instances of 
CfnTrainingDataset$DataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataSource` | software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset$GlueDataSourceProperty | [[cdk.support/lookup-entry]] | `:glue-data-source` |"
  [stack id config]
  (let [builder (CfnTrainingDataset$DataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :glue-data-source)]
      (. builder glueDataSource data))
    (.build builder)))


(defn cfn-training-dataset-dataset-input-config-property-builder
  "The cfn-training-dataset-dataset-input-config-property-builder function buildes out new instances of 
CfnTrainingDataset$DatasetInputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-source` |
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnTrainingDataset$DatasetInputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-training-dataset-dataset-property-builder
  "The cfn-training-dataset-dataset-property-builder function buildes out new instances of 
CfnTrainingDataset$DatasetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTrainingDataset$DatasetProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-config)]
      (. builder inputConfig data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-training-dataset-glue-data-source-property-builder
  "The cfn-training-dataset-glue-data-source-property-builder function buildes out new instances of 
CfnTrainingDataset$GlueDataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnTrainingDataset$GlueDataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-training-dataset-props-builder
  "The cfn-training-dataset-props-builder function buildes out new instances of 
CfnTrainingDatasetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trainingData` | java.util.List | [[cdk.support/lookup-entry]] | `:training-data` |"
  [stack id config]
  (let [builder (CfnTrainingDatasetProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :training-data)]
      (. builder trainingData data))
    (.build builder)))