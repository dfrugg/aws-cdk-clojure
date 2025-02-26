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


(defn build-cfn-training-dataset-builder
  "The build-cfn-training-dataset-builder function updates a CfnTrainingDataset$Builder instance using the provided configuration.
  The function takes the CfnTrainingDataset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trainingData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:training-data` |
"
  [^CfnTrainingDataset$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :training-data)]
    (. builder trainingData data))
  (.build builder))


(defn cfn-training-dataset-builder
  "Creates a  `CfnTrainingDataset$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-training-dataset-builder (CfnTrainingDataset$Builder/create scope (name id)) id config))


(defn build-cfn-training-dataset-column-schema-property-builder
  "The build-cfn-training-dataset-column-schema-property-builder function updates a CfnTrainingDataset$ColumnSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnTrainingDataset$ColumnSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
| `columnTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:column-types` |
"
  [^CfnTrainingDataset$ColumnSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column-name)]
    (. builder columnName data))
  (when-some [data (lookup-entry config id :column-types)]
    (. builder columnTypes data))
  (.build builder))


(defn cfn-training-dataset-column-schema-property-builder
  "Creates a  `CfnTrainingDataset$ColumnSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-training-dataset-column-schema-property-builder (new CfnTrainingDataset$ColumnSchemaProperty$Builder) id config))


(defn build-cfn-training-dataset-data-source-property-builder
  "The build-cfn-training-dataset-data-source-property-builder function updates a CfnTrainingDataset$DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTrainingDataset$DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueDataSource` | software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset$GlueDataSourceProperty | [[cdk.support/lookup-entry]] | `:glue-data-source` |
"
  [^CfnTrainingDataset$DataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :glue-data-source)]
    (. builder glueDataSource data))
  (.build builder))


(defn cfn-training-dataset-data-source-property-builder
  "Creates a  `CfnTrainingDataset$DataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-training-dataset-data-source-property-builder (new CfnTrainingDataset$DataSourceProperty$Builder) id config))


(defn build-cfn-training-dataset-dataset-input-config-property-builder
  "The build-cfn-training-dataset-dataset-input-config-property-builder function updates a CfnTrainingDataset$DatasetInputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTrainingDataset$DatasetInputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-source` |
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnTrainingDataset$DatasetInputConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (.build builder))


(defn cfn-training-dataset-dataset-input-config-property-builder
  "Creates a  `CfnTrainingDataset$DatasetInputConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-training-dataset-dataset-input-config-property-builder (new CfnTrainingDataset$DatasetInputConfigProperty$Builder) id config))


(defn build-cfn-training-dataset-dataset-property-builder
  "The build-cfn-training-dataset-dataset-property-builder function updates a CfnTrainingDataset$DatasetProperty$Builder instance using the provided configuration.
  The function takes the CfnTrainingDataset$DatasetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTrainingDataset$DatasetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-config)]
    (. builder inputConfig data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-training-dataset-dataset-property-builder
  "Creates a  `CfnTrainingDataset$DatasetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-training-dataset-dataset-property-builder (new CfnTrainingDataset$DatasetProperty$Builder) id config))


(defn build-cfn-training-dataset-glue-data-source-property-builder
  "The build-cfn-training-dataset-glue-data-source-property-builder function updates a CfnTrainingDataset$GlueDataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTrainingDataset$GlueDataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnTrainingDataset$GlueDataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-training-dataset-glue-data-source-property-builder
  "Creates a  `CfnTrainingDataset$GlueDataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-training-dataset-glue-data-source-property-builder (new CfnTrainingDataset$GlueDataSourceProperty$Builder) id config))


(defn build-cfn-training-dataset-props-builder
  "The build-cfn-training-dataset-props-builder function updates a CfnTrainingDatasetProps$Builder instance using the provided configuration.
  The function takes the CfnTrainingDatasetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trainingData` | java.util.List | [[cdk.support/lookup-entry]] | `:training-data` |
"
  [^CfnTrainingDatasetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :training-data)]
    (. builder trainingData data))
  (.build builder))


(defn cfn-training-dataset-props-builder
  "Creates a  `CfnTrainingDatasetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-training-dataset-props-builder (new CfnTrainingDatasetProps$Builder) id config))