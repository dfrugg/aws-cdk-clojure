(ns cdk.api.services.databrew
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.databrew package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.databrew CfnDataset$Builder
                                                     CfnDataset$CsvOptionsProperty$Builder
                                                     CfnDataset$DataCatalogInputDefinitionProperty$Builder
                                                     CfnDataset$DatabaseInputDefinitionProperty$Builder
                                                     CfnDataset$DatasetParameterProperty$Builder
                                                     CfnDataset$DatetimeOptionsProperty$Builder
                                                     CfnDataset$ExcelOptionsProperty$Builder
                                                     CfnDataset$FilesLimitProperty$Builder
                                                     CfnDataset$FilterExpressionProperty$Builder
                                                     CfnDataset$FilterValueProperty$Builder
                                                     CfnDataset$FormatOptionsProperty$Builder
                                                     CfnDataset$InputProperty$Builder
                                                     CfnDataset$JsonOptionsProperty$Builder
                                                     CfnDataset$MetadataProperty$Builder
                                                     CfnDataset$PathOptionsProperty$Builder
                                                     CfnDataset$PathParameterProperty$Builder
                                                     CfnDataset$S3LocationProperty$Builder
                                                     CfnDatasetProps$Builder
                                                     CfnJob$AllowedStatisticsProperty$Builder
                                                     CfnJob$Builder
                                                     CfnJob$ColumnSelectorProperty$Builder
                                                     CfnJob$ColumnStatisticsConfigurationProperty$Builder
                                                     CfnJob$CsvOutputOptionsProperty$Builder
                                                     CfnJob$DataCatalogOutputProperty$Builder
                                                     CfnJob$DatabaseOutputProperty$Builder
                                                     CfnJob$DatabaseTableOutputOptionsProperty$Builder
                                                     CfnJob$EntityDetectorConfigurationProperty$Builder
                                                     CfnJob$JobSampleProperty$Builder
                                                     CfnJob$OutputFormatOptionsProperty$Builder
                                                     CfnJob$OutputLocationProperty$Builder
                                                     CfnJob$OutputProperty$Builder
                                                     CfnJob$ProfileConfigurationProperty$Builder
                                                     CfnJob$RecipeProperty$Builder
                                                     CfnJob$S3LocationProperty$Builder
                                                     CfnJob$S3TableOutputOptionsProperty$Builder
                                                     CfnJob$StatisticOverrideProperty$Builder
                                                     CfnJob$StatisticsConfigurationProperty$Builder
                                                     CfnJob$ValidationConfigurationProperty$Builder
                                                     CfnJobProps$Builder
                                                     CfnProject$Builder
                                                     CfnProject$SampleProperty$Builder
                                                     CfnProjectProps$Builder
                                                     CfnRecipe$ActionProperty$Builder
                                                     CfnRecipe$Builder
                                                     CfnRecipe$ConditionExpressionProperty$Builder
                                                     CfnRecipe$DataCatalogInputDefinitionProperty$Builder
                                                     CfnRecipe$InputProperty$Builder
                                                     CfnRecipe$RecipeParametersProperty$Builder
                                                     CfnRecipe$RecipeStepProperty$Builder
                                                     CfnRecipe$S3LocationProperty$Builder
                                                     CfnRecipe$SecondaryInputProperty$Builder
                                                     CfnRecipeProps$Builder
                                                     CfnRuleset$Builder
                                                     CfnRuleset$ColumnSelectorProperty$Builder
                                                     CfnRuleset$RuleProperty$Builder
                                                     CfnRuleset$SubstitutionValueProperty$Builder
                                                     CfnRuleset$ThresholdProperty$Builder
                                                     CfnRulesetProps$Builder
                                                     CfnSchedule$Builder
                                                     CfnScheduleProps$Builder]))


(defn cfn-dataset-builder
  "The cfn-dataset-builder function buildes out new instances of 
CfnDataset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `formatOptions` | software.amazon.awscdk.services.databrew.CfnDataset$FormatOptionsProperty | [[cdk.support/lookup-entry]] | `:format-options` |
| `input` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pathOptions` | software.amazon.awscdk.services.databrew.CfnDataset$PathOptionsProperty | [[cdk.support/lookup-entry]] | `:path-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :format-options)]
      (. builder formatOptions data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :path-options)]
      (. builder pathOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dataset-csv-options-property-builder
  "The cfn-dataset-csv-options-property-builder function buildes out new instances of 
CfnDataset$CsvOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `headerRow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header-row` |"
  [stack id config]
  (let [builder (CfnDataset$CsvOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (when-let [data (lookup-entry config id :header-row)]
      (. builder headerRow data))
    (.build builder)))


(defn cfn-dataset-data-catalog-input-definition-property-builder
  "The cfn-dataset-data-catalog-input-definition-property-builder function buildes out new instances of 
CfnDataset$DataCatalogInputDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tempDirectory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:temp-directory` |"
  [stack id config]
  (let [builder (CfnDataset$DataCatalogInputDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :temp-directory)]
      (. builder tempDirectory data))
    (.build builder)))


(defn cfn-dataset-database-input-definition-property-builder
  "The cfn-dataset-database-input-definition-property-builder function buildes out new instances of 
CfnDataset$DatabaseInputDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseTableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-table-name` |
| `glueConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-connection-name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `tempDirectory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:temp-directory` |"
  [stack id config]
  (let [builder (CfnDataset$DatabaseInputDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-table-name)]
      (. builder databaseTableName data))
    (when-let [data (lookup-entry config id :glue-connection-name)]
      (. builder glueConnectionName data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :temp-directory)]
      (. builder tempDirectory data))
    (.build builder)))


(defn cfn-dataset-dataset-parameter-property-builder
  "The cfn-dataset-dataset-parameter-property-builder function buildes out new instances of 
CfnDataset$DatasetParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createColumn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-column` |
| `datetimeOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datetime-options` |
| `filter` | software.amazon.awscdk.services.databrew.CfnDataset$FilterExpressionProperty | [[cdk.support/lookup-entry]] | `:filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataset$DatasetParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :create-column)]
      (. builder createColumn data))
    (when-let [data (lookup-entry config id :datetime-options)]
      (. builder datetimeOptions data))
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-dataset-datetime-options-property-builder
  "The cfn-dataset-datetime-options-property-builder function buildes out new instances of 
CfnDataset$DatetimeOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `localeCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-code` |
| `timezoneOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone-offset` |"
  [stack id config]
  (let [builder (CfnDataset$DatetimeOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :locale-code)]
      (. builder localeCode data))
    (when-let [data (lookup-entry config id :timezone-offset)]
      (. builder timezoneOffset data))
    (.build builder)))


(defn cfn-dataset-excel-options-property-builder
  "The cfn-dataset-excel-options-property-builder function buildes out new instances of 
CfnDataset$ExcelOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerRow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-row` |
| `sheetIndexes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sheet-indexes` |
| `sheetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:sheet-names` |"
  [stack id config]
  (let [builder (CfnDataset$ExcelOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-row)]
      (. builder headerRow data))
    (when-let [data (lookup-entry config id :sheet-indexes)]
      (. builder sheetIndexes data))
    (when-let [data (lookup-entry config id :sheet-names)]
      (. builder sheetNames data))
    (.build builder)))


(defn cfn-dataset-files-limit-property-builder
  "The cfn-dataset-files-limit-property-builder function buildes out new instances of 
CfnDataset$FilesLimitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxFiles` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-files` |
| `order` | java.lang.String | [[cdk.support/lookup-entry]] | `:order` |
| `orderedBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ordered-by` |"
  [stack id config]
  (let [builder (CfnDataset$FilesLimitProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-files)]
      (. builder maxFiles data))
    (when-let [data (lookup-entry config id :order)]
      (. builder order data))
    (when-let [data (lookup-entry config id :ordered-by)]
      (. builder orderedBy data))
    (.build builder)))


(defn cfn-dataset-filter-expression-property-builder
  "The cfn-dataset-filter-expression-property-builder function buildes out new instances of 
CfnDataset$FilterExpressionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `valuesMap` | java.util.List | [[cdk.support/lookup-entry]] | `:values-map` |"
  [stack id config]
  (let [builder (CfnDataset$FilterExpressionProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :values-map)]
      (. builder valuesMap data))
    (.build builder)))


(defn cfn-dataset-filter-value-property-builder
  "The cfn-dataset-filter-value-property-builder function buildes out new instances of 
CfnDataset$FilterValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `valueReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-reference` |"
  [stack id config]
  (let [builder (CfnDataset$FilterValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :value-reference)]
      (. builder valueReference data))
    (.build builder)))


(defn cfn-dataset-format-options-property-builder
  "The cfn-dataset-format-options-property-builder function buildes out new instances of 
CfnDataset$FormatOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `excel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excel` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |"
  [stack id config]
  (let [builder (CfnDataset$FormatOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (when-let [data (lookup-entry config id :excel)]
      (. builder excel data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (.build builder)))


(defn cfn-dataset-input-property-builder
  "The cfn-dataset-input-property-builder function buildes out new instances of 
CfnDataset$InputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogInputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-input-definition` |
| `databaseInputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-input-definition` |
| `metadata` | software.amazon.awscdk.services.databrew.CfnDataset$MetadataProperty | [[cdk.support/lookup-entry]] | `:metadata` |
| `s3InputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-input-definition` |"
  [stack id config]
  (let [builder (CfnDataset$InputProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-catalog-input-definition)]
      (. builder dataCatalogInputDefinition data))
    (when-let [data (lookup-entry config id :database-input-definition)]
      (. builder databaseInputDefinition data))
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (when-let [data (lookup-entry config id :s3-input-definition)]
      (. builder s3InputDefinition data))
    (.build builder)))


(defn cfn-dataset-json-options-property-builder
  "The cfn-dataset-json-options-property-builder function buildes out new instances of 
CfnDataset$JsonOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multiLine` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-line` |"
  [stack id config]
  (let [builder (CfnDataset$JsonOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :multi-line)]
      (. builder multiLine data))
    (.build builder)))


(defn cfn-dataset-metadata-property-builder
  "The cfn-dataset-metadata-property-builder function buildes out new instances of 
CfnDataset$MetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (CfnDataset$MetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (.build builder)))


(defn cfn-dataset-path-options-property-builder
  "The cfn-dataset-path-options-property-builder function buildes out new instances of 
CfnDataset$PathOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filesLimit` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:files-limit` |
| `lastModifiedDateCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-modified-date-condition` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnDataset$PathOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :files-limit)]
      (. builder filesLimit data))
    (when-let [data (lookup-entry config id :last-modified-date-condition)]
      (. builder lastModifiedDateCondition data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-dataset-path-parameter-property-builder
  "The cfn-dataset-path-parameter-property-builder function buildes out new instances of 
CfnDataset$PathParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetParameter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataset-parameter` |
| `pathParameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-parameter-name` |"
  [stack id config]
  (let [builder (CfnDataset$PathParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :dataset-parameter)]
      (. builder datasetParameter data))
    (when-let [data (lookup-entry config id :path-parameter-name)]
      (. builder pathParameterName data))
    (.build builder)))


(defn cfn-dataset-props-builder
  "The cfn-dataset-props-builder function buildes out new instances of 
CfnDatasetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `formatOptions` | software.amazon.awscdk.services.databrew.CfnDataset$FormatOptionsProperty | [[cdk.support/lookup-entry]] | `:format-options` |
| `input` | software.amazon.awscdk.services.databrew.CfnDataset$InputProperty | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pathOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatasetProps$Builder.)]
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :format-options)]
      (. builder formatOptions data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :path-options)]
      (. builder pathOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dataset-s3-location-property-builder
  "The cfn-dataset-s3-location-property-builder function buildes out new instances of 
CfnDataset$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnDataset$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-job-allowed-statistics-property-builder
  "The cfn-job-allowed-statistics-property-builder function buildes out new instances of 
CfnJob$AllowedStatisticsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statistics` | java.util.List | [[cdk.support/lookup-entry]] | `:statistics` |"
  [stack id config]
  (let [builder (CfnJob$AllowedStatisticsProperty$Builder.)]
    (when-let [data (lookup-entry config id :statistics)]
      (. builder statistics data))
    (.build builder)))


(defn cfn-job-builder
  "The cfn-job-builder function buildes out new instances of 
CfnJob$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-outputs` |
| `databaseOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:database-outputs` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `encryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-mode` |
| `jobSample` | software.amazon.awscdk.services.databrew.CfnJob$JobSampleProperty | [[cdk.support/lookup-entry]] | `:job-sample` |
| `logSubscription` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-subscription` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-location` |
| `outputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outputs` |
| `profileConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:profile-configuration` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `recipe` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recipe` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validationConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-configurations` |"
  [stack id config]
  (let [builder (CfnJob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-catalog-outputs)]
      (. builder dataCatalogOutputs data))
    (when-let [data (lookup-entry config id :database-outputs)]
      (. builder databaseOutputs data))
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (when-let [data (lookup-entry config id :encryption-mode)]
      (. builder encryptionMode data))
    (when-let [data (lookup-entry config id :job-sample)]
      (. builder jobSample data))
    (when-let [data (lookup-entry config id :log-subscription)]
      (. builder logSubscription data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-location)]
      (. builder outputLocation data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :profile-configuration)]
      (. builder profileConfiguration data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :recipe)]
      (. builder recipe data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validation-configurations)]
      (. builder validationConfigurations data))
    (.build builder)))


(defn cfn-job-column-selector-property-builder
  "The cfn-job-column-selector-property-builder function buildes out new instances of 
CfnJob$ColumnSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |"
  [stack id config]
  (let [builder (CfnJob$ColumnSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (.build builder)))


(defn cfn-job-column-statistics-configuration-property-builder
  "The cfn-job-column-statistics-configuration-property-builder function buildes out new instances of 
CfnJob$ColumnStatisticsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `selectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:selectors` |
| `statistics` | software.amazon.awscdk.services.databrew.CfnJob$StatisticsConfigurationProperty | [[cdk.support/lookup-entry]] | `:statistics` |"
  [stack id config]
  (let [builder (CfnJob$ColumnStatisticsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :selectors)]
      (. builder selectors data))
    (when-let [data (lookup-entry config id :statistics)]
      (. builder statistics data))
    (.build builder)))


(defn cfn-job-csv-output-options-property-builder
  "The cfn-job-csv-output-options-property-builder function buildes out new instances of 
CfnJob$CsvOutputOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |"
  [stack id config]
  (let [builder (CfnJob$CsvOutputOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (.build builder)))


(defn cfn-job-data-catalog-output-property-builder
  "The cfn-job-data-catalog-output-property-builder function buildes out new instances of 
CfnJob$DataCatalogOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databaseOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-options` |
| `overwrite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overwrite` |
| `s3Options` | software.amazon.awscdk.services.databrew.CfnJob$S3TableOutputOptionsProperty | [[cdk.support/lookup-entry]] | `:s3-options` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnJob$DataCatalogOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :database-options)]
      (. builder databaseOptions data))
    (when-let [data (lookup-entry config id :overwrite)]
      (. builder overwrite data))
    (when-let [data (lookup-entry config id :s3-options)]
      (. builder s3Options data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-job-database-output-property-builder
  "The cfn-job-database-output-property-builder function buildes out new instances of 
CfnJob$DatabaseOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseOptions` | software.amazon.awscdk.services.databrew.CfnJob$DatabaseTableOutputOptionsProperty | [[cdk.support/lookup-entry]] | `:database-options` |
| `databaseOutputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-output-mode` |
| `glueConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-connection-name` |"
  [stack id config]
  (let [builder (CfnJob$DatabaseOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-options)]
      (. builder databaseOptions data))
    (when-let [data (lookup-entry config id :database-output-mode)]
      (. builder databaseOutputMode data))
    (when-let [data (lookup-entry config id :glue-connection-name)]
      (. builder glueConnectionName data))
    (.build builder)))


(defn cfn-job-database-table-output-options-property-builder
  "The cfn-job-database-table-output-options-property-builder function buildes out new instances of 
CfnJob$DatabaseTableOutputOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tempDirectory` | software.amazon.awscdk.services.databrew.CfnJob$S3LocationProperty | [[cdk.support/lookup-entry]] | `:temp-directory` |"
  [stack id config]
  (let [builder (CfnJob$DatabaseTableOutputOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :temp-directory)]
      (. builder tempDirectory data))
    (.build builder)))


(defn cfn-job-entity-detector-configuration-property-builder
  "The cfn-job-entity-detector-configuration-property-builder function buildes out new instances of 
CfnJob$EntityDetectorConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedStatistics` | software.amazon.awscdk.services.databrew.CfnJob$AllowedStatisticsProperty | [[cdk.support/lookup-entry]] | `:allowed-statistics` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |"
  [stack id config]
  (let [builder (CfnJob$EntityDetectorConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-statistics)]
      (. builder allowedStatistics data))
    (when-let [data (lookup-entry config id :entity-types)]
      (. builder entityTypes data))
    (.build builder)))


(defn cfn-job-job-sample-property-builder
  "The cfn-job-job-sample-property-builder function buildes out new instances of 
CfnJob$JobSampleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (CfnJob$JobSampleProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn cfn-job-output-format-options-property-builder
  "The cfn-job-output-format-options-property-builder function buildes out new instances of 
CfnJob$OutputFormatOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.databrew.CfnJob$CsvOutputOptionsProperty | [[cdk.support/lookup-entry]] | `:csv` |"
  [stack id config]
  (let [builder (CfnJob$OutputFormatOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (.build builder)))


(defn cfn-job-output-location-property-builder
  "The cfn-job-output-location-property-builder function buildes out new instances of 
CfnJob$OutputLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnJob$OutputLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-owner)]
      (. builder bucketOwner data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-job-output-property-builder
  "The cfn-job-output-property-builder function buildes out new instances of 
CfnJob$OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-format` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `formatOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:format-options` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `maxOutputFiles` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-output-files` |
| `overwrite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overwrite` |
| `partitionColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:partition-columns` |"
  [stack id config]
  (let [builder (CfnJob$OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :compression-format)]
      (. builder compressionFormat data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :format-options)]
      (. builder formatOptions data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :max-output-files)]
      (. builder maxOutputFiles data))
    (when-let [data (lookup-entry config id :overwrite)]
      (. builder overwrite data))
    (when-let [data (lookup-entry config id :partition-columns)]
      (. builder partitionColumns data))
    (.build builder)))


(defn cfn-job-profile-configuration-property-builder
  "The cfn-job-profile-configuration-property-builder function buildes out new instances of 
CfnJob$ProfileConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnStatisticsConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:column-statistics-configurations` |
| `datasetStatisticsConfiguration` | software.amazon.awscdk.services.databrew.CfnJob$StatisticsConfigurationProperty | [[cdk.support/lookup-entry]] | `:dataset-statistics-configuration` |
| `entityDetectorConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entity-detector-configuration` |
| `profileColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:profile-columns` |"
  [stack id config]
  (let [builder (CfnJob$ProfileConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :column-statistics-configurations)]
      (. builder columnStatisticsConfigurations data))
    (when-let [data (lookup-entry config id :dataset-statistics-configuration)]
      (. builder datasetStatisticsConfiguration data))
    (when-let [data (lookup-entry config id :entity-detector-configuration)]
      (. builder entityDetectorConfiguration data))
    (when-let [data (lookup-entry config id :profile-columns)]
      (. builder profileColumns data))
    (.build builder)))


(defn cfn-job-props-builder
  "The cfn-job-props-builder function buildes out new instances of 
CfnJobProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-outputs` |
| `databaseOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-outputs` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `encryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-mode` |
| `jobSample` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-sample` |
| `logSubscription` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-subscription` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputLocation` | software.amazon.awscdk.services.databrew.CfnJob$OutputLocationProperty | [[cdk.support/lookup-entry]] | `:output-location` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `profileConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:profile-configuration` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `recipe` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recipe` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validationConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:validation-configurations` |"
  [stack id config]
  (let [builder (CfnJobProps$Builder.)]
    (when-let [data (lookup-entry config id :data-catalog-outputs)]
      (. builder dataCatalogOutputs data))
    (when-let [data (lookup-entry config id :database-outputs)]
      (. builder databaseOutputs data))
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (when-let [data (lookup-entry config id :encryption-mode)]
      (. builder encryptionMode data))
    (when-let [data (lookup-entry config id :job-sample)]
      (. builder jobSample data))
    (when-let [data (lookup-entry config id :log-subscription)]
      (. builder logSubscription data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-location)]
      (. builder outputLocation data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :profile-configuration)]
      (. builder profileConfiguration data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :recipe)]
      (. builder recipe data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validation-configurations)]
      (. builder validationConfigurations data))
    (.build builder)))


(defn cfn-job-recipe-property-builder
  "The cfn-job-recipe-property-builder function buildes out new instances of 
CfnJob$RecipeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnJob$RecipeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-job-s3-location-property-builder
  "The cfn-job-s3-location-property-builder function buildes out new instances of 
CfnJob$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnJob$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-owner)]
      (. builder bucketOwner data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-job-s3-table-output-options-property-builder
  "The cfn-job-s3-table-output-options-property-builder function buildes out new instances of 
CfnJob$S3TableOutputOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.databrew.CfnJob$S3LocationProperty | [[cdk.support/lookup-entry]] | `:location` |"
  [stack id config]
  (let [builder (CfnJob$S3TableOutputOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (.build builder)))


(defn cfn-job-statistic-override-property-builder
  "The cfn-job-statistic-override-property-builder function buildes out new instances of 
CfnJob$StatisticOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |"
  [stack id config]
  (let [builder (CfnJob$StatisticOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (.build builder)))


(defn cfn-job-statistics-configuration-property-builder
  "The cfn-job-statistics-configuration-property-builder function buildes out new instances of 
CfnJob$StatisticsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includedStatistics` | java.util.List | [[cdk.support/lookup-entry]] | `:included-statistics` |
| `overrides` | java.util.List | [[cdk.support/lookup-entry]] | `:overrides` |"
  [stack id config]
  (let [builder (CfnJob$StatisticsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :included-statistics)]
      (. builder includedStatistics data))
    (when-let [data (lookup-entry config id :overrides)]
      (. builder overrides data))
    (.build builder)))


(defn cfn-job-validation-configuration-property-builder
  "The cfn-job-validation-configuration-property-builder function buildes out new instances of 
CfnJob$ValidationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rulesetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ruleset-arn` |
| `validationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-mode` |"
  [stack id config]
  (let [builder (CfnJob$ValidationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ruleset-arn)]
      (. builder rulesetArn data))
    (when-let [data (lookup-entry config id :validation-mode)]
      (. builder validationMode data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recipeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sample` | software.amazon.awscdk.services.databrew.CfnProject$SampleProperty | [[cdk.support/lookup-entry]] | `:sample` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recipe-name)]
      (. builder recipeName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :sample)]
      (. builder sample data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recipeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sample` | software.amazon.awscdk.services.databrew.CfnProject$SampleProperty | [[cdk.support/lookup-entry]] | `:sample` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :dataset-name)]
      (. builder datasetName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recipe-name)]
      (. builder recipeName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :sample)]
      (. builder sample data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-project-sample-property-builder
  "The cfn-project-sample-property-builder function buildes out new instances of 
CfnProject$SampleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnProject$SampleProperty$Builder.)]
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-recipe-action-property-builder
  "The cfn-recipe-action-property-builder function buildes out new instances of 
CfnRecipe$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `operation` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnRecipe$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :operation)]
      (. builder operation data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-recipe-builder
  "The cfn-recipe-builder function buildes out new instances of 
CfnRecipe$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRecipe$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :steps)]
      (. builder steps data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-recipe-condition-expression-property-builder
  "The cfn-recipe-condition-expression-property-builder function buildes out new instances of 
CfnRecipe$ConditionExpressionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `targetColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-column` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRecipe$ConditionExpressionProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :target-column)]
      (. builder targetColumn data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-recipe-data-catalog-input-definition-property-builder
  "The cfn-recipe-data-catalog-input-definition-property-builder function buildes out new instances of 
CfnRecipe$DataCatalogInputDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tempDirectory` | software.amazon.awscdk.services.databrew.CfnRecipe$S3LocationProperty | [[cdk.support/lookup-entry]] | `:temp-directory` |"
  [stack id config]
  (let [builder (CfnRecipe$DataCatalogInputDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :temp-directory)]
      (. builder tempDirectory data))
    (.build builder)))


(defn cfn-recipe-input-property-builder
  "The cfn-recipe-input-property-builder function buildes out new instances of 
CfnRecipe$InputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogInputDefinition` | software.amazon.awscdk.services.databrew.CfnRecipe$DataCatalogInputDefinitionProperty | [[cdk.support/lookup-entry]] | `:data-catalog-input-definition` |
| `s3InputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-input-definition` |"
  [stack id config]
  (let [builder (CfnRecipe$InputProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-catalog-input-definition)]
      (. builder dataCatalogInputDefinition data))
    (when-let [data (lookup-entry config id :s3-input-definition)]
      (. builder s3InputDefinition data))
    (.build builder)))


(defn cfn-recipe-props-builder
  "The cfn-recipe-props-builder function buildes out new instances of 
CfnRecipeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRecipeProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :steps)]
      (. builder steps data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-recipe-recipe-parameters-property-builder
  "The cfn-recipe-recipe-parameters-property-builder function buildes out new instances of 
CfnRecipe$RecipeParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateFunction` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregate-function` |
| `base` | java.lang.String | [[cdk.support/lookup-entry]] | `:base` |
| `caseStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:case-statement` |
| `categoryMap` | java.lang.String | [[cdk.support/lookup-entry]] | `:category-map` |
| `charsToRemove` | java.lang.String | [[cdk.support/lookup-entry]] | `:chars-to-remove` |
| `collapseConsecutiveWhitespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:collapse-consecutive-whitespace` |
| `columnDataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-data-type` |
| `columnRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-range` |
| `count` | java.lang.String | [[cdk.support/lookup-entry]] | `:count` |
| `customCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-characters` |
| `customStopWords` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-stop-words` |
| `customValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-value` |
| `datasetsColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:datasets-columns` |
| `dateAddValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-add-value` |
| `dateTimeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-time-format` |
| `dateTimeParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:date-time-parameters` |
| `deleteOtherRows` | java.lang.String | [[cdk.support/lookup-entry]] | `:delete-other-rows` |
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `endPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-pattern` |
| `endPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-position` |
| `endValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-value` |
| `expandContractions` | java.lang.String | [[cdk.support/lookup-entry]] | `:expand-contractions` |
| `exponent` | java.lang.String | [[cdk.support/lookup-entry]] | `:exponent` |
| `falseString` | java.lang.String | [[cdk.support/lookup-entry]] | `:false-string` |
| `groupByAggFunctionOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-by-agg-function-options` |
| `groupByColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-by-columns` |
| `hiddenColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:hidden-columns` |
| `ignoreCase` | java.lang.String | [[cdk.support/lookup-entry]] | `:ignore-case` |
| `includeInSplit` | java.lang.String | [[cdk.support/lookup-entry]] | `:include-in-split` |
| `input` | java.lang.Object | [[cdk.support/lookup-entry]] | `:input` |
| `interval` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval` |
| `isText` | java.lang.String | [[cdk.support/lookup-entry]] | `:is-text` |
| `joinKeys` | java.lang.String | [[cdk.support/lookup-entry]] | `:join-keys` |
| `joinType` | java.lang.String | [[cdk.support/lookup-entry]] | `:join-type` |
| `leftColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:left-columns` |
| `limit` | java.lang.String | [[cdk.support/lookup-entry]] | `:limit` |
| `lowerBound` | java.lang.String | [[cdk.support/lookup-entry]] | `:lower-bound` |
| `mapType` | java.lang.String | [[cdk.support/lookup-entry]] | `:map-type` |
| `modeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode-type` |
| `multiLine` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-line` |
| `numRows` | java.lang.String | [[cdk.support/lookup-entry]] | `:num-rows` |
| `numRowsAfter` | java.lang.String | [[cdk.support/lookup-entry]] | `:num-rows-after` |
| `numRowsBefore` | java.lang.String | [[cdk.support/lookup-entry]] | `:num-rows-before` |
| `orderByColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:order-by-column` |
| `orderByColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:order-by-columns` |
| `other` | java.lang.String | [[cdk.support/lookup-entry]] | `:other` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `patternOption1` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-option1` |
| `patternOption2` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-option2` |
| `patternOptions` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-options` |
| `period` | java.lang.String | [[cdk.support/lookup-entry]] | `:period` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |
| `removeAllPunctuation` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-all-punctuation` |
| `removeAllQuotes` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-all-quotes` |
| `removeAllWhitespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-all-whitespace` |
| `removeCustomCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-custom-characters` |
| `removeCustomValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-custom-value` |
| `removeLeadingAndTrailingPunctuation` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-leading-and-trailing-punctuation` |
| `removeLeadingAndTrailingQuotes` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-leading-and-trailing-quotes` |
| `removeLeadingAndTrailingWhitespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-leading-and-trailing-whitespace` |
| `removeLetters` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-letters` |
| `removeNumbers` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-numbers` |
| `removeSourceColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-source-column` |
| `removeSpecialCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:remove-special-characters` |
| `rightColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:right-columns` |
| `sampleSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-size` |
| `sampleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-type` |
| `secondInput` | java.lang.String | [[cdk.support/lookup-entry]] | `:second-input` |
| `secondaryInputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-inputs` |
| `sheetIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:sheet-indexes` |
| `sheetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:sheet-names` |
| `sourceColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column` |
| `sourceColumn1` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column1` |
| `sourceColumn2` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-column2` |
| `sourceColumns` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-columns` |
| `startColumnIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-column-index` |
| `startPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-pattern` |
| `startPosition` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-position` |
| `startValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-value` |
| `stemmingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:stemming-mode` |
| `stepCount` | java.lang.String | [[cdk.support/lookup-entry]] | `:step-count` |
| `stepIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:step-index` |
| `stopWordsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:stop-words-mode` |
| `strategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:strategy` |
| `targetColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-column` |
| `targetColumnNames` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-column-names` |
| `targetDateFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-date-format` |
| `targetIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-index` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
| `tokenizerPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:tokenizer-pattern` |
| `trueString` | java.lang.String | [[cdk.support/lookup-entry]] | `:true-string` |
| `udfLang` | java.lang.String | [[cdk.support/lookup-entry]] | `:udf-lang` |
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `unpivotColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:unpivot-column` |
| `upperBound` | java.lang.String | [[cdk.support/lookup-entry]] | `:upper-bound` |
| `useNewDataFrame` | java.lang.String | [[cdk.support/lookup-entry]] | `:use-new-data-frame` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `value1` | java.lang.String | [[cdk.support/lookup-entry]] | `:value1` |
| `value2` | java.lang.String | [[cdk.support/lookup-entry]] | `:value2` |
| `valueColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-column` |
| `viewFrame` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-frame` |"
  [stack id config]
  (let [builder (CfnRecipe$RecipeParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :aggregate-function)]
      (. builder aggregateFunction data))
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :case-statement)]
      (. builder caseStatement data))
    (when-let [data (lookup-entry config id :category-map)]
      (. builder categoryMap data))
    (when-let [data (lookup-entry config id :chars-to-remove)]
      (. builder charsToRemove data))
    (when-let [data (lookup-entry config id :collapse-consecutive-whitespace)]
      (. builder collapseConsecutiveWhitespace data))
    (when-let [data (lookup-entry config id :column-data-type)]
      (. builder columnDataType data))
    (when-let [data (lookup-entry config id :column-range)]
      (. builder columnRange data))
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :custom-characters)]
      (. builder customCharacters data))
    (when-let [data (lookup-entry config id :custom-stop-words)]
      (. builder customStopWords data))
    (when-let [data (lookup-entry config id :custom-value)]
      (. builder customValue data))
    (when-let [data (lookup-entry config id :datasets-columns)]
      (. builder datasetsColumns data))
    (when-let [data (lookup-entry config id :date-add-value)]
      (. builder dateAddValue data))
    (when-let [data (lookup-entry config id :date-time-format)]
      (. builder dateTimeFormat data))
    (when-let [data (lookup-entry config id :date-time-parameters)]
      (. builder dateTimeParameters data))
    (when-let [data (lookup-entry config id :delete-other-rows)]
      (. builder deleteOtherRows data))
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (when-let [data (lookup-entry config id :end-pattern)]
      (. builder endPattern data))
    (when-let [data (lookup-entry config id :end-position)]
      (. builder endPosition data))
    (when-let [data (lookup-entry config id :end-value)]
      (. builder endValue data))
    (when-let [data (lookup-entry config id :expand-contractions)]
      (. builder expandContractions data))
    (when-let [data (lookup-entry config id :exponent)]
      (. builder exponent data))
    (when-let [data (lookup-entry config id :false-string)]
      (. builder falseString data))
    (when-let [data (lookup-entry config id :group-by-agg-function-options)]
      (. builder groupByAggFunctionOptions data))
    (when-let [data (lookup-entry config id :group-by-columns)]
      (. builder groupByColumns data))
    (when-let [data (lookup-entry config id :hidden-columns)]
      (. builder hiddenColumns data))
    (when-let [data (lookup-entry config id :ignore-case)]
      (. builder ignoreCase data))
    (when-let [data (lookup-entry config id :include-in-split)]
      (. builder includeInSplit data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :is-text)]
      (. builder isText data))
    (when-let [data (lookup-entry config id :join-keys)]
      (. builder joinKeys data))
    (when-let [data (lookup-entry config id :join-type)]
      (. builder joinType data))
    (when-let [data (lookup-entry config id :left-columns)]
      (. builder leftColumns data))
    (when-let [data (lookup-entry config id :limit)]
      (. builder limit data))
    (when-let [data (lookup-entry config id :lower-bound)]
      (. builder lowerBound data))
    (when-let [data (lookup-entry config id :map-type)]
      (. builder mapType data))
    (when-let [data (lookup-entry config id :mode-type)]
      (. builder modeType data))
    (when-let [data (lookup-entry config id :multi-line)]
      (. builder multiLine data))
    (when-let [data (lookup-entry config id :num-rows)]
      (. builder numRows data))
    (when-let [data (lookup-entry config id :num-rows-after)]
      (. builder numRowsAfter data))
    (when-let [data (lookup-entry config id :num-rows-before)]
      (. builder numRowsBefore data))
    (when-let [data (lookup-entry config id :order-by-column)]
      (. builder orderByColumn data))
    (when-let [data (lookup-entry config id :order-by-columns)]
      (. builder orderByColumns data))
    (when-let [data (lookup-entry config id :other)]
      (. builder other data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :pattern-option1)]
      (. builder patternOption1 data))
    (when-let [data (lookup-entry config id :pattern-option2)]
      (. builder patternOption2 data))
    (when-let [data (lookup-entry config id :pattern-options)]
      (. builder patternOptions data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :position)]
      (. builder position data))
    (when-let [data (lookup-entry config id :remove-all-punctuation)]
      (. builder removeAllPunctuation data))
    (when-let [data (lookup-entry config id :remove-all-quotes)]
      (. builder removeAllQuotes data))
    (when-let [data (lookup-entry config id :remove-all-whitespace)]
      (. builder removeAllWhitespace data))
    (when-let [data (lookup-entry config id :remove-custom-characters)]
      (. builder removeCustomCharacters data))
    (when-let [data (lookup-entry config id :remove-custom-value)]
      (. builder removeCustomValue data))
    (when-let [data (lookup-entry config id :remove-leading-and-trailing-punctuation)]
      (. builder removeLeadingAndTrailingPunctuation data))
    (when-let [data (lookup-entry config id :remove-leading-and-trailing-quotes)]
      (. builder removeLeadingAndTrailingQuotes data))
    (when-let [data (lookup-entry config id :remove-leading-and-trailing-whitespace)]
      (. builder removeLeadingAndTrailingWhitespace data))
    (when-let [data (lookup-entry config id :remove-letters)]
      (. builder removeLetters data))
    (when-let [data (lookup-entry config id :remove-numbers)]
      (. builder removeNumbers data))
    (when-let [data (lookup-entry config id :remove-source-column)]
      (. builder removeSourceColumn data))
    (when-let [data (lookup-entry config id :remove-special-characters)]
      (. builder removeSpecialCharacters data))
    (when-let [data (lookup-entry config id :right-columns)]
      (. builder rightColumns data))
    (when-let [data (lookup-entry config id :sample-size)]
      (. builder sampleSize data))
    (when-let [data (lookup-entry config id :sample-type)]
      (. builder sampleType data))
    (when-let [data (lookup-entry config id :second-input)]
      (. builder secondInput data))
    (when-let [data (lookup-entry config id :secondary-inputs)]
      (. builder secondaryInputs data))
    (when-let [data (lookup-entry config id :sheet-indexes)]
      (. builder sheetIndexes data))
    (when-let [data (lookup-entry config id :sheet-names)]
      (. builder sheetNames data))
    (when-let [data (lookup-entry config id :source-column)]
      (. builder sourceColumn data))
    (when-let [data (lookup-entry config id :source-column1)]
      (. builder sourceColumn1 data))
    (when-let [data (lookup-entry config id :source-column2)]
      (. builder sourceColumn2 data))
    (when-let [data (lookup-entry config id :source-columns)]
      (. builder sourceColumns data))
    (when-let [data (lookup-entry config id :start-column-index)]
      (. builder startColumnIndex data))
    (when-let [data (lookup-entry config id :start-pattern)]
      (. builder startPattern data))
    (when-let [data (lookup-entry config id :start-position)]
      (. builder startPosition data))
    (when-let [data (lookup-entry config id :start-value)]
      (. builder startValue data))
    (when-let [data (lookup-entry config id :stemming-mode)]
      (. builder stemmingMode data))
    (when-let [data (lookup-entry config id :step-count)]
      (. builder stepCount data))
    (when-let [data (lookup-entry config id :step-index)]
      (. builder stepIndex data))
    (when-let [data (lookup-entry config id :stop-words-mode)]
      (. builder stopWordsMode data))
    (when-let [data (lookup-entry config id :strategy)]
      (. builder strategy data))
    (when-let [data (lookup-entry config id :target-column)]
      (. builder targetColumn data))
    (when-let [data (lookup-entry config id :target-column-names)]
      (. builder targetColumnNames data))
    (when-let [data (lookup-entry config id :target-date-format)]
      (. builder targetDateFormat data))
    (when-let [data (lookup-entry config id :target-index)]
      (. builder targetIndex data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (when-let [data (lookup-entry config id :tokenizer-pattern)]
      (. builder tokenizerPattern data))
    (when-let [data (lookup-entry config id :true-string)]
      (. builder trueString data))
    (when-let [data (lookup-entry config id :udf-lang)]
      (. builder udfLang data))
    (when-let [data (lookup-entry config id :units)]
      (. builder units data))
    (when-let [data (lookup-entry config id :unpivot-column)]
      (. builder unpivotColumn data))
    (when-let [data (lookup-entry config id :upper-bound)]
      (. builder upperBound data))
    (when-let [data (lookup-entry config id :use-new-data-frame)]
      (. builder useNewDataFrame data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :value1)]
      (. builder value1 data))
    (when-let [data (lookup-entry config id :value2)]
      (. builder value2 data))
    (when-let [data (lookup-entry config id :value-column)]
      (. builder valueColumn data))
    (when-let [data (lookup-entry config id :view-frame)]
      (. builder viewFrame data))
    (.build builder)))


(defn cfn-recipe-recipe-step-property-builder
  "The cfn-recipe-recipe-step-property-builder function buildes out new instances of 
CfnRecipe$RecipeStepProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `conditionExpressions` | java.util.List | [[cdk.support/lookup-entry]] | `:condition-expressions` |"
  [stack id config]
  (let [builder (CfnRecipe$RecipeStepProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :condition-expressions)]
      (. builder conditionExpressions data))
    (.build builder)))


(defn cfn-recipe-s3-location-property-builder
  "The cfn-recipe-s3-location-property-builder function buildes out new instances of 
CfnRecipe$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnRecipe$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-recipe-secondary-input-property-builder
  "The cfn-recipe-secondary-input-property-builder function buildes out new instances of 
CfnRecipe$SecondaryInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogInputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-input-definition` |
| `s3InputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-input-definition` |"
  [stack id config]
  (let [builder (CfnRecipe$SecondaryInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-catalog-input-definition)]
      (. builder dataCatalogInputDefinition data))
    (when-let [data (lookup-entry config id :s3-input-definition)]
      (. builder s3InputDefinition data))
    (.build builder)))


(defn cfn-ruleset-builder
  "The cfn-ruleset-builder function buildes out new instances of 
CfnRuleset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnRuleset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-ruleset-column-selector-property-builder
  "The cfn-ruleset-column-selector-property-builder function buildes out new instances of 
CfnRuleset$ColumnSelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |"
  [stack id config]
  (let [builder (CfnRuleset$ColumnSelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (.build builder)))


(defn cfn-ruleset-props-builder
  "The cfn-ruleset-props-builder function buildes out new instances of 
CfnRulesetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnRulesetProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-ruleset-rule-property-builder
  "The cfn-ruleset-rule-property-builder function buildes out new instances of 
CfnRuleset$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:check-expression` |
| `columnSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-selectors` |
| `disabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `substitutionMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:substitution-map` |
| `threshold` | software.amazon.awscdk.services.databrew.CfnRuleset$ThresholdProperty | [[cdk.support/lookup-entry]] | `:threshold` |"
  [stack id config]
  (let [builder (CfnRuleset$RuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :check-expression)]
      (. builder checkExpression data))
    (when-let [data (lookup-entry config id :column-selectors)]
      (. builder columnSelectors data))
    (when-let [data (lookup-entry config id :disabled)]
      (. builder disabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :substitution-map)]
      (. builder substitutionMap data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (.build builder)))


(defn cfn-ruleset-substitution-value-property-builder
  "The cfn-ruleset-substitution-value-property-builder function buildes out new instances of 
CfnRuleset$SubstitutionValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `valueReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-reference` |"
  [stack id config]
  (let [builder (CfnRuleset$SubstitutionValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :value-reference)]
      (. builder valueReference data))
    (.build builder)))


(defn cfn-ruleset-threshold-property-builder
  "The cfn-ruleset-threshold-property-builder function buildes out new instances of 
CfnRuleset$ThresholdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRuleset$ThresholdProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-schedule-builder
  "The cfn-schedule-builder function buildes out new instances of 
CfnSchedule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cronExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:cron-expression` |
| `jobNames` | java.util.List | [[cdk.support/lookup-entry]] | `:job-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchedule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cron-expression)]
      (. builder cronExpression data))
    (when-let [data (lookup-entry config id :job-names)]
      (. builder jobNames data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schedule-props-builder
  "The cfn-schedule-props-builder function buildes out new instances of 
CfnScheduleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cronExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:cron-expression` |
| `jobNames` | java.util.List | [[cdk.support/lookup-entry]] | `:job-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnScheduleProps$Builder.)]
    (when-let [data (lookup-entry config id :cron-expression)]
      (. builder cronExpression data))
    (when-let [data (lookup-entry config id :job-names)]
      (. builder jobNames data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))