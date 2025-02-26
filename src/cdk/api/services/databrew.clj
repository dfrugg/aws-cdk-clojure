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


(defn build-cfn-dataset-builder
  "The build-cfn-dataset-builder function updates a CfnDataset$Builder instance using the provided configuration.
  The function takes the CfnDataset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `formatOptions` | software.amazon.awscdk.services.databrew.CfnDataset$FormatOptionsProperty | [[cdk.support/lookup-entry]] | `:format-options` |
| `input` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pathOptions` | software.amazon.awscdk.services.databrew.CfnDataset$PathOptionsProperty | [[cdk.support/lookup-entry]] | `:path-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataset$Builder builder id config]
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
  (.build builder))


(defn cfn-dataset-builder
  "Creates a  `CfnDataset$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-dataset-builder (CfnDataset$Builder/create scope (name id)) id config))


(defn build-cfn-dataset-csv-options-property-builder
  "The build-cfn-dataset-csv-options-property-builder function updates a CfnDataset$CsvOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$CsvOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `headerRow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header-row` |
"
  [^CfnDataset$CsvOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delimiter)]
    (. builder delimiter data))
  (when-let [data (lookup-entry config id :header-row)]
    (. builder headerRow data))
  (.build builder))


(defn cfn-dataset-csv-options-property-builder
  "Creates a  `CfnDataset$CsvOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-csv-options-property-builder (new CfnDataset$CsvOptionsProperty$Builder) id config))


(defn build-cfn-dataset-data-catalog-input-definition-property-builder
  "The build-cfn-dataset-data-catalog-input-definition-property-builder function updates a CfnDataset$DataCatalogInputDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DataCatalogInputDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tempDirectory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:temp-directory` |
"
  [^CfnDataset$DataCatalogInputDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-let [data (lookup-entry config id :temp-directory)]
    (. builder tempDirectory data))
  (.build builder))


(defn cfn-dataset-data-catalog-input-definition-property-builder
  "Creates a  `CfnDataset$DataCatalogInputDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-data-catalog-input-definition-property-builder (new CfnDataset$DataCatalogInputDefinitionProperty$Builder) id config))


(defn build-cfn-dataset-database-input-definition-property-builder
  "The build-cfn-dataset-database-input-definition-property-builder function updates a CfnDataset$DatabaseInputDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatabaseInputDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseTableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-table-name` |
| `glueConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-connection-name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `tempDirectory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:temp-directory` |
"
  [^CfnDataset$DatabaseInputDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database-table-name)]
    (. builder databaseTableName data))
  (when-let [data (lookup-entry config id :glue-connection-name)]
    (. builder glueConnectionName data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :temp-directory)]
    (. builder tempDirectory data))
  (.build builder))


(defn cfn-dataset-database-input-definition-property-builder
  "Creates a  `CfnDataset$DatabaseInputDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-database-input-definition-property-builder (new CfnDataset$DatabaseInputDefinitionProperty$Builder) id config))


(defn build-cfn-dataset-dataset-parameter-property-builder
  "The build-cfn-dataset-dataset-parameter-property-builder function updates a CfnDataset$DatasetParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatasetParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createColumn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-column` |
| `datetimeOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:datetime-options` |
| `filter` | software.amazon.awscdk.services.databrew.CfnDataset$FilterExpressionProperty | [[cdk.support/lookup-entry]] | `:filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataset$DatasetParameterProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-dataset-dataset-parameter-property-builder
  "Creates a  `CfnDataset$DatasetParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-dataset-parameter-property-builder (new CfnDataset$DatasetParameterProperty$Builder) id config))


(defn build-cfn-dataset-datetime-options-property-builder
  "The build-cfn-dataset-datetime-options-property-builder function updates a CfnDataset$DatetimeOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$DatetimeOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `localeCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-code` |
| `timezoneOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone-offset` |
"
  [^CfnDataset$DatetimeOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :locale-code)]
    (. builder localeCode data))
  (when-let [data (lookup-entry config id :timezone-offset)]
    (. builder timezoneOffset data))
  (.build builder))


(defn cfn-dataset-datetime-options-property-builder
  "Creates a  `CfnDataset$DatetimeOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-datetime-options-property-builder (new CfnDataset$DatetimeOptionsProperty$Builder) id config))


(defn build-cfn-dataset-excel-options-property-builder
  "The build-cfn-dataset-excel-options-property-builder function updates a CfnDataset$ExcelOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$ExcelOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerRow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header-row` |
| `sheetIndexes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sheet-indexes` |
| `sheetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:sheet-names` |
"
  [^CfnDataset$ExcelOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header-row)]
    (. builder headerRow data))
  (when-let [data (lookup-entry config id :sheet-indexes)]
    (. builder sheetIndexes data))
  (when-let [data (lookup-entry config id :sheet-names)]
    (. builder sheetNames data))
  (.build builder))


(defn cfn-dataset-excel-options-property-builder
  "Creates a  `CfnDataset$ExcelOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-excel-options-property-builder (new CfnDataset$ExcelOptionsProperty$Builder) id config))


(defn build-cfn-dataset-files-limit-property-builder
  "The build-cfn-dataset-files-limit-property-builder function updates a CfnDataset$FilesLimitProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$FilesLimitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxFiles` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-files` |
| `order` | java.lang.String | [[cdk.support/lookup-entry]] | `:order` |
| `orderedBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ordered-by` |
"
  [^CfnDataset$FilesLimitProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-files)]
    (. builder maxFiles data))
  (when-let [data (lookup-entry config id :order)]
    (. builder order data))
  (when-let [data (lookup-entry config id :ordered-by)]
    (. builder orderedBy data))
  (.build builder))


(defn cfn-dataset-files-limit-property-builder
  "Creates a  `CfnDataset$FilesLimitProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-files-limit-property-builder (new CfnDataset$FilesLimitProperty$Builder) id config))


(defn build-cfn-dataset-filter-expression-property-builder
  "The build-cfn-dataset-filter-expression-property-builder function updates a CfnDataset$FilterExpressionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$FilterExpressionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `valuesMap` | java.util.List | [[cdk.support/lookup-entry]] | `:values-map` |
"
  [^CfnDataset$FilterExpressionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :values-map)]
    (. builder valuesMap data))
  (.build builder))


(defn cfn-dataset-filter-expression-property-builder
  "Creates a  `CfnDataset$FilterExpressionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-filter-expression-property-builder (new CfnDataset$FilterExpressionProperty$Builder) id config))


(defn build-cfn-dataset-filter-value-property-builder
  "The build-cfn-dataset-filter-value-property-builder function updates a CfnDataset$FilterValueProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$FilterValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `valueReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-reference` |
"
  [^CfnDataset$FilterValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :value-reference)]
    (. builder valueReference data))
  (.build builder))


(defn cfn-dataset-filter-value-property-builder
  "Creates a  `CfnDataset$FilterValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-filter-value-property-builder (new CfnDataset$FilterValueProperty$Builder) id config))


(defn build-cfn-dataset-format-options-property-builder
  "The build-cfn-dataset-format-options-property-builder function updates a CfnDataset$FormatOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$FormatOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `excel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excel` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
"
  [^CfnDataset$FormatOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (when-let [data (lookup-entry config id :excel)]
    (. builder excel data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (.build builder))


(defn cfn-dataset-format-options-property-builder
  "Creates a  `CfnDataset$FormatOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-format-options-property-builder (new CfnDataset$FormatOptionsProperty$Builder) id config))


(defn build-cfn-dataset-input-property-builder
  "The build-cfn-dataset-input-property-builder function updates a CfnDataset$InputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogInputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-input-definition` |
| `databaseInputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-input-definition` |
| `metadata` | software.amazon.awscdk.services.databrew.CfnDataset$MetadataProperty | [[cdk.support/lookup-entry]] | `:metadata` |
| `s3InputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-input-definition` |
"
  [^CfnDataset$InputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-catalog-input-definition)]
    (. builder dataCatalogInputDefinition data))
  (when-let [data (lookup-entry config id :database-input-definition)]
    (. builder databaseInputDefinition data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :s3-input-definition)]
    (. builder s3InputDefinition data))
  (.build builder))


(defn cfn-dataset-input-property-builder
  "Creates a  `CfnDataset$InputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-input-property-builder (new CfnDataset$InputProperty$Builder) id config))


(defn build-cfn-dataset-json-options-property-builder
  "The build-cfn-dataset-json-options-property-builder function updates a CfnDataset$JsonOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$JsonOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multiLine` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-line` |
"
  [^CfnDataset$JsonOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :multi-line)]
    (. builder multiLine data))
  (.build builder))


(defn cfn-dataset-json-options-property-builder
  "Creates a  `CfnDataset$JsonOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-json-options-property-builder (new CfnDataset$JsonOptionsProperty$Builder) id config))


(defn build-cfn-dataset-metadata-property-builder
  "The build-cfn-dataset-metadata-property-builder function updates a CfnDataset$MetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$MetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnDataset$MetadataProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn cfn-dataset-metadata-property-builder
  "Creates a  `CfnDataset$MetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-metadata-property-builder (new CfnDataset$MetadataProperty$Builder) id config))


(defn build-cfn-dataset-path-options-property-builder
  "The build-cfn-dataset-path-options-property-builder function updates a CfnDataset$PathOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$PathOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filesLimit` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:files-limit` |
| `lastModifiedDateCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-modified-date-condition` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnDataset$PathOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :files-limit)]
    (. builder filesLimit data))
  (when-let [data (lookup-entry config id :last-modified-date-condition)]
    (. builder lastModifiedDateCondition data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-dataset-path-options-property-builder
  "Creates a  `CfnDataset$PathOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-path-options-property-builder (new CfnDataset$PathOptionsProperty$Builder) id config))


(defn build-cfn-dataset-path-parameter-property-builder
  "The build-cfn-dataset-path-parameter-property-builder function updates a CfnDataset$PathParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$PathParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetParameter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataset-parameter` |
| `pathParameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-parameter-name` |
"
  [^CfnDataset$PathParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dataset-parameter)]
    (. builder datasetParameter data))
  (when-let [data (lookup-entry config id :path-parameter-name)]
    (. builder pathParameterName data))
  (.build builder))


(defn cfn-dataset-path-parameter-property-builder
  "Creates a  `CfnDataset$PathParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-path-parameter-property-builder (new CfnDataset$PathParameterProperty$Builder) id config))


(defn build-cfn-dataset-props-builder
  "The build-cfn-dataset-props-builder function updates a CfnDatasetProps$Builder instance using the provided configuration.
  The function takes the CfnDatasetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `formatOptions` | software.amazon.awscdk.services.databrew.CfnDataset$FormatOptionsProperty | [[cdk.support/lookup-entry]] | `:format-options` |
| `input` | software.amazon.awscdk.services.databrew.CfnDataset$InputProperty | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pathOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:path-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatasetProps$Builder builder id config]
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
  (.build builder))


(defn cfn-dataset-props-builder
  "Creates a  `CfnDatasetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-props-builder (new CfnDatasetProps$Builder) id config))


(defn build-cfn-dataset-s3-location-property-builder
  "The build-cfn-dataset-s3-location-property-builder function updates a CfnDataset$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnDataset$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-dataset-s3-location-property-builder
  "Creates a  `CfnDataset$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataset-s3-location-property-builder (new CfnDataset$S3LocationProperty$Builder) id config))


(defn build-cfn-job-allowed-statistics-property-builder
  "The build-cfn-job-allowed-statistics-property-builder function updates a CfnJob$AllowedStatisticsProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$AllowedStatisticsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statistics` | java.util.List | [[cdk.support/lookup-entry]] | `:statistics` |
"
  [^CfnJob$AllowedStatisticsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statistics)]
    (. builder statistics data))
  (.build builder))


(defn cfn-job-allowed-statistics-property-builder
  "Creates a  `CfnJob$AllowedStatisticsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-allowed-statistics-property-builder (new CfnJob$AllowedStatisticsProperty$Builder) id config))


(defn build-cfn-job-builder
  "The build-cfn-job-builder function updates a CfnJob$Builder instance using the provided configuration.
  The function takes the CfnJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `validationConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-configurations` |
"
  [^CfnJob$Builder builder id config]
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
  (.build builder))


(defn cfn-job-builder
  "Creates a  `CfnJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-job-builder (CfnJob$Builder/create scope (name id)) id config))


(defn build-cfn-job-column-selector-property-builder
  "The build-cfn-job-column-selector-property-builder function updates a CfnJob$ColumnSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$ColumnSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
"
  [^CfnJob$ColumnSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (.build builder))


(defn cfn-job-column-selector-property-builder
  "Creates a  `CfnJob$ColumnSelectorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-column-selector-property-builder (new CfnJob$ColumnSelectorProperty$Builder) id config))


(defn build-cfn-job-column-statistics-configuration-property-builder
  "The build-cfn-job-column-statistics-configuration-property-builder function updates a CfnJob$ColumnStatisticsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$ColumnStatisticsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `selectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:selectors` |
| `statistics` | software.amazon.awscdk.services.databrew.CfnJob$StatisticsConfigurationProperty | [[cdk.support/lookup-entry]] | `:statistics` |
"
  [^CfnJob$ColumnStatisticsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :selectors)]
    (. builder selectors data))
  (when-let [data (lookup-entry config id :statistics)]
    (. builder statistics data))
  (.build builder))


(defn cfn-job-column-statistics-configuration-property-builder
  "Creates a  `CfnJob$ColumnStatisticsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-column-statistics-configuration-property-builder (new CfnJob$ColumnStatisticsConfigurationProperty$Builder) id config))


(defn build-cfn-job-csv-output-options-property-builder
  "The build-cfn-job-csv-output-options-property-builder function updates a CfnJob$CsvOutputOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$CsvOutputOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
"
  [^CfnJob$CsvOutputOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delimiter)]
    (. builder delimiter data))
  (.build builder))


(defn cfn-job-csv-output-options-property-builder
  "Creates a  `CfnJob$CsvOutputOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-csv-output-options-property-builder (new CfnJob$CsvOutputOptionsProperty$Builder) id config))


(defn build-cfn-job-data-catalog-output-property-builder
  "The build-cfn-job-data-catalog-output-property-builder function updates a CfnJob$DataCatalogOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$DataCatalogOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databaseOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-options` |
| `overwrite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overwrite` |
| `s3Options` | software.amazon.awscdk.services.databrew.CfnJob$S3TableOutputOptionsProperty | [[cdk.support/lookup-entry]] | `:s3-options` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnJob$DataCatalogOutputProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-job-data-catalog-output-property-builder
  "Creates a  `CfnJob$DataCatalogOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-data-catalog-output-property-builder (new CfnJob$DataCatalogOutputProperty$Builder) id config))


(defn build-cfn-job-database-output-property-builder
  "The build-cfn-job-database-output-property-builder function updates a CfnJob$DatabaseOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$DatabaseOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseOptions` | software.amazon.awscdk.services.databrew.CfnJob$DatabaseTableOutputOptionsProperty | [[cdk.support/lookup-entry]] | `:database-options` |
| `databaseOutputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-output-mode` |
| `glueConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-connection-name` |
"
  [^CfnJob$DatabaseOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database-options)]
    (. builder databaseOptions data))
  (when-let [data (lookup-entry config id :database-output-mode)]
    (. builder databaseOutputMode data))
  (when-let [data (lookup-entry config id :glue-connection-name)]
    (. builder glueConnectionName data))
  (.build builder))


(defn cfn-job-database-output-property-builder
  "Creates a  `CfnJob$DatabaseOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-database-output-property-builder (new CfnJob$DatabaseOutputProperty$Builder) id config))


(defn build-cfn-job-database-table-output-options-property-builder
  "The build-cfn-job-database-table-output-options-property-builder function updates a CfnJob$DatabaseTableOutputOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$DatabaseTableOutputOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tempDirectory` | software.amazon.awscdk.services.databrew.CfnJob$S3LocationProperty | [[cdk.support/lookup-entry]] | `:temp-directory` |
"
  [^CfnJob$DatabaseTableOutputOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-let [data (lookup-entry config id :temp-directory)]
    (. builder tempDirectory data))
  (.build builder))


(defn cfn-job-database-table-output-options-property-builder
  "Creates a  `CfnJob$DatabaseTableOutputOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-database-table-output-options-property-builder (new CfnJob$DatabaseTableOutputOptionsProperty$Builder) id config))


(defn build-cfn-job-entity-detector-configuration-property-builder
  "The build-cfn-job-entity-detector-configuration-property-builder function updates a CfnJob$EntityDetectorConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$EntityDetectorConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedStatistics` | software.amazon.awscdk.services.databrew.CfnJob$AllowedStatisticsProperty | [[cdk.support/lookup-entry]] | `:allowed-statistics` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |
"
  [^CfnJob$EntityDetectorConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-statistics)]
    (. builder allowedStatistics data))
  (when-let [data (lookup-entry config id :entity-types)]
    (. builder entityTypes data))
  (.build builder))


(defn cfn-job-entity-detector-configuration-property-builder
  "Creates a  `CfnJob$EntityDetectorConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-entity-detector-configuration-property-builder (new CfnJob$EntityDetectorConfigurationProperty$Builder) id config))


(defn build-cfn-job-job-sample-property-builder
  "The build-cfn-job-job-sample-property-builder function updates a CfnJob$JobSampleProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$JobSampleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^CfnJob$JobSampleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn cfn-job-job-sample-property-builder
  "Creates a  `CfnJob$JobSampleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-job-sample-property-builder (new CfnJob$JobSampleProperty$Builder) id config))


(defn build-cfn-job-output-format-options-property-builder
  "The build-cfn-job-output-format-options-property-builder function updates a CfnJob$OutputFormatOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$OutputFormatOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.databrew.CfnJob$CsvOutputOptionsProperty | [[cdk.support/lookup-entry]] | `:csv` |
"
  [^CfnJob$OutputFormatOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (.build builder))


(defn cfn-job-output-format-options-property-builder
  "Creates a  `CfnJob$OutputFormatOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-output-format-options-property-builder (new CfnJob$OutputFormatOptionsProperty$Builder) id config))


(defn build-cfn-job-output-location-property-builder
  "The build-cfn-job-output-location-property-builder function updates a CfnJob$OutputLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$OutputLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnJob$OutputLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :bucket-owner)]
    (. builder bucketOwner data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-job-output-location-property-builder
  "Creates a  `CfnJob$OutputLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-output-location-property-builder (new CfnJob$OutputLocationProperty$Builder) id config))


(defn build-cfn-job-output-property-builder
  "The build-cfn-job-output-property-builder function updates a CfnJob$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-format` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `formatOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:format-options` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `maxOutputFiles` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-output-files` |
| `overwrite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overwrite` |
| `partitionColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:partition-columns` |
"
  [^CfnJob$OutputProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-job-output-property-builder
  "Creates a  `CfnJob$OutputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-output-property-builder (new CfnJob$OutputProperty$Builder) id config))


(defn build-cfn-job-profile-configuration-property-builder
  "The build-cfn-job-profile-configuration-property-builder function updates a CfnJob$ProfileConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$ProfileConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnStatisticsConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:column-statistics-configurations` |
| `datasetStatisticsConfiguration` | software.amazon.awscdk.services.databrew.CfnJob$StatisticsConfigurationProperty | [[cdk.support/lookup-entry]] | `:dataset-statistics-configuration` |
| `entityDetectorConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entity-detector-configuration` |
| `profileColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:profile-columns` |
"
  [^CfnJob$ProfileConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :column-statistics-configurations)]
    (. builder columnStatisticsConfigurations data))
  (when-let [data (lookup-entry config id :dataset-statistics-configuration)]
    (. builder datasetStatisticsConfiguration data))
  (when-let [data (lookup-entry config id :entity-detector-configuration)]
    (. builder entityDetectorConfiguration data))
  (when-let [data (lookup-entry config id :profile-columns)]
    (. builder profileColumns data))
  (.build builder))


(defn cfn-job-profile-configuration-property-builder
  "Creates a  `CfnJob$ProfileConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-profile-configuration-property-builder (new CfnJob$ProfileConfigurationProperty$Builder) id config))


(defn build-cfn-job-props-builder
  "The build-cfn-job-props-builder function updates a CfnJobProps$Builder instance using the provided configuration.
  The function takes the CfnJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `validationConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:validation-configurations` |
"
  [^CfnJobProps$Builder builder id config]
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
  (.build builder))


(defn cfn-job-props-builder
  "Creates a  `CfnJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-props-builder (new CfnJobProps$Builder) id config))


(defn build-cfn-job-recipe-property-builder
  "The build-cfn-job-recipe-property-builder function updates a CfnJob$RecipeProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$RecipeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnJob$RecipeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-job-recipe-property-builder
  "Creates a  `CfnJob$RecipeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-recipe-property-builder (new CfnJob$RecipeProperty$Builder) id config))


(defn build-cfn-job-s3-location-property-builder
  "The build-cfn-job-s3-location-property-builder function updates a CfnJob$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnJob$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :bucket-owner)]
    (. builder bucketOwner data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-job-s3-location-property-builder
  "Creates a  `CfnJob$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-s3-location-property-builder (new CfnJob$S3LocationProperty$Builder) id config))


(defn build-cfn-job-s3-table-output-options-property-builder
  "The build-cfn-job-s3-table-output-options-property-builder function updates a CfnJob$S3TableOutputOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$S3TableOutputOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | software.amazon.awscdk.services.databrew.CfnJob$S3LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
"
  [^CfnJob$S3TableOutputOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (.build builder))


(defn cfn-job-s3-table-output-options-property-builder
  "Creates a  `CfnJob$S3TableOutputOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-s3-table-output-options-property-builder (new CfnJob$S3TableOutputOptionsProperty$Builder) id config))


(defn build-cfn-job-statistic-override-property-builder
  "The build-cfn-job-statistic-override-property-builder function updates a CfnJob$StatisticOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$StatisticOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
"
  [^CfnJob$StatisticOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (.build builder))


(defn cfn-job-statistic-override-property-builder
  "Creates a  `CfnJob$StatisticOverrideProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-statistic-override-property-builder (new CfnJob$StatisticOverrideProperty$Builder) id config))


(defn build-cfn-job-statistics-configuration-property-builder
  "The build-cfn-job-statistics-configuration-property-builder function updates a CfnJob$StatisticsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$StatisticsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includedStatistics` | java.util.List | [[cdk.support/lookup-entry]] | `:included-statistics` |
| `overrides` | java.util.List | [[cdk.support/lookup-entry]] | `:overrides` |
"
  [^CfnJob$StatisticsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :included-statistics)]
    (. builder includedStatistics data))
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (.build builder))


(defn cfn-job-statistics-configuration-property-builder
  "Creates a  `CfnJob$StatisticsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-statistics-configuration-property-builder (new CfnJob$StatisticsConfigurationProperty$Builder) id config))


(defn build-cfn-job-validation-configuration-property-builder
  "The build-cfn-job-validation-configuration-property-builder function updates a CfnJob$ValidationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJob$ValidationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rulesetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ruleset-arn` |
| `validationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-mode` |
"
  [^CfnJob$ValidationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ruleset-arn)]
    (. builder rulesetArn data))
  (when-let [data (lookup-entry config id :validation-mode)]
    (. builder validationMode data))
  (.build builder))


(defn cfn-job-validation-configuration-property-builder
  "Creates a  `CfnJob$ValidationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-validation-configuration-property-builder (new CfnJob$ValidationConfigurationProperty$Builder) id config))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recipeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sample` | software.amazon.awscdk.services.databrew.CfnProject$SampleProperty | [[cdk.support/lookup-entry]] | `:sample` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProject$Builder builder id config]
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
  (.build builder))


(defn cfn-project-builder
  "Creates a  `CfnProject$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recipeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:recipe-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sample` | software.amazon.awscdk.services.databrew.CfnProject$SampleProperty | [[cdk.support/lookup-entry]] | `:sample` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProjectProps$Builder builder id config]
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
  (.build builder))


(defn cfn-project-props-builder
  "Creates a  `CfnProjectProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))


(defn build-cfn-project-sample-property-builder
  "The build-cfn-project-sample-property-builder function updates a CfnProject$SampleProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$SampleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnProject$SampleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-project-sample-property-builder
  "Creates a  `CfnProject$SampleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-project-sample-property-builder (new CfnProject$SampleProperty$Builder) id config))


(defn build-cfn-recipe-action-property-builder
  "The build-cfn-recipe-action-property-builder function updates a CfnRecipe$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `operation` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnRecipe$ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :operation)]
    (. builder operation data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-recipe-action-property-builder
  "Creates a  `CfnRecipe$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-action-property-builder (new CfnRecipe$ActionProperty$Builder) id config))


(defn build-cfn-recipe-builder
  "The build-cfn-recipe-builder function updates a CfnRecipe$Builder instance using the provided configuration.
  The function takes the CfnRecipe$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRecipe$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :steps)]
    (. builder steps data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-recipe-builder
  "Creates a  `CfnRecipe$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-recipe-builder (CfnRecipe$Builder/create scope (name id)) id config))


(defn build-cfn-recipe-condition-expression-property-builder
  "The build-cfn-recipe-condition-expression-property-builder function updates a CfnRecipe$ConditionExpressionProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$ConditionExpressionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `targetColumn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-column` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRecipe$ConditionExpressionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :target-column)]
    (. builder targetColumn data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-recipe-condition-expression-property-builder
  "Creates a  `CfnRecipe$ConditionExpressionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-condition-expression-property-builder (new CfnRecipe$ConditionExpressionProperty$Builder) id config))


(defn build-cfn-recipe-data-catalog-input-definition-property-builder
  "The build-cfn-recipe-data-catalog-input-definition-property-builder function updates a CfnRecipe$DataCatalogInputDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$DataCatalogInputDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tempDirectory` | software.amazon.awscdk.services.databrew.CfnRecipe$S3LocationProperty | [[cdk.support/lookup-entry]] | `:temp-directory` |
"
  [^CfnRecipe$DataCatalogInputDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-let [data (lookup-entry config id :temp-directory)]
    (. builder tempDirectory data))
  (.build builder))


(defn cfn-recipe-data-catalog-input-definition-property-builder
  "Creates a  `CfnRecipe$DataCatalogInputDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-data-catalog-input-definition-property-builder (new CfnRecipe$DataCatalogInputDefinitionProperty$Builder) id config))


(defn build-cfn-recipe-input-property-builder
  "The build-cfn-recipe-input-property-builder function updates a CfnRecipe$InputProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogInputDefinition` | software.amazon.awscdk.services.databrew.CfnRecipe$DataCatalogInputDefinitionProperty | [[cdk.support/lookup-entry]] | `:data-catalog-input-definition` |
| `s3InputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-input-definition` |
"
  [^CfnRecipe$InputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-catalog-input-definition)]
    (. builder dataCatalogInputDefinition data))
  (when-let [data (lookup-entry config id :s3-input-definition)]
    (. builder s3InputDefinition data))
  (.build builder))


(defn cfn-recipe-input-property-builder
  "Creates a  `CfnRecipe$InputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-input-property-builder (new CfnRecipe$InputProperty$Builder) id config))


(defn build-cfn-recipe-props-builder
  "The build-cfn-recipe-props-builder function updates a CfnRecipeProps$Builder instance using the provided configuration.
  The function takes the CfnRecipeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRecipeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :steps)]
    (. builder steps data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-recipe-props-builder
  "Creates a  `CfnRecipeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-props-builder (new CfnRecipeProps$Builder) id config))


(defn build-cfn-recipe-recipe-parameters-property-builder
  "The build-cfn-recipe-recipe-parameters-property-builder function updates a CfnRecipe$RecipeParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$RecipeParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewFrame` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-frame` |
"
  [^CfnRecipe$RecipeParametersProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-recipe-recipe-parameters-property-builder
  "Creates a  `CfnRecipe$RecipeParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-recipe-parameters-property-builder (new CfnRecipe$RecipeParametersProperty$Builder) id config))


(defn build-cfn-recipe-recipe-step-property-builder
  "The build-cfn-recipe-recipe-step-property-builder function updates a CfnRecipe$RecipeStepProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$RecipeStepProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `conditionExpressions` | java.util.List | [[cdk.support/lookup-entry]] | `:condition-expressions` |
"
  [^CfnRecipe$RecipeStepProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :condition-expressions)]
    (. builder conditionExpressions data))
  (.build builder))


(defn cfn-recipe-recipe-step-property-builder
  "Creates a  `CfnRecipe$RecipeStepProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-recipe-step-property-builder (new CfnRecipe$RecipeStepProperty$Builder) id config))


(defn build-cfn-recipe-s3-location-property-builder
  "The build-cfn-recipe-s3-location-property-builder function updates a CfnRecipe$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnRecipe$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-recipe-s3-location-property-builder
  "Creates a  `CfnRecipe$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-s3-location-property-builder (new CfnRecipe$S3LocationProperty$Builder) id config))


(defn build-cfn-recipe-secondary-input-property-builder
  "The build-cfn-recipe-secondary-input-property-builder function updates a CfnRecipe$SecondaryInputProperty$Builder instance using the provided configuration.
  The function takes the CfnRecipe$SecondaryInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogInputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-catalog-input-definition` |
| `s3InputDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-input-definition` |
"
  [^CfnRecipe$SecondaryInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-catalog-input-definition)]
    (. builder dataCatalogInputDefinition data))
  (when-let [data (lookup-entry config id :s3-input-definition)]
    (. builder s3InputDefinition data))
  (.build builder))


(defn cfn-recipe-secondary-input-property-builder
  "Creates a  `CfnRecipe$SecondaryInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-recipe-secondary-input-property-builder (new CfnRecipe$SecondaryInputProperty$Builder) id config))


(defn build-cfn-ruleset-builder
  "The build-cfn-ruleset-builder function updates a CfnRuleset$Builder instance using the provided configuration.
  The function takes the CfnRuleset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnRuleset$Builder builder id config]
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
  (.build builder))


(defn cfn-ruleset-builder
  "Creates a  `CfnRuleset$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-ruleset-builder (CfnRuleset$Builder/create scope (name id)) id config))


(defn build-cfn-ruleset-column-selector-property-builder
  "The build-cfn-ruleset-column-selector-property-builder function updates a CfnRuleset$ColumnSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleset$ColumnSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
"
  [^CfnRuleset$ColumnSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :regex)]
    (. builder regex data))
  (.build builder))


(defn cfn-ruleset-column-selector-property-builder
  "Creates a  `CfnRuleset$ColumnSelectorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ruleset-column-selector-property-builder (new CfnRuleset$ColumnSelectorProperty$Builder) id config))


(defn build-cfn-ruleset-props-builder
  "The build-cfn-ruleset-props-builder function updates a CfnRulesetProps$Builder instance using the provided configuration.
  The function takes the CfnRulesetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnRulesetProps$Builder builder id config]
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
  (.build builder))


(defn cfn-ruleset-props-builder
  "Creates a  `CfnRulesetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ruleset-props-builder (new CfnRulesetProps$Builder) id config))


(defn build-cfn-ruleset-rule-property-builder
  "The build-cfn-ruleset-rule-property-builder function updates a CfnRuleset$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleset$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:check-expression` |
| `columnSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-selectors` |
| `disabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `substitutionMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:substitution-map` |
| `threshold` | software.amazon.awscdk.services.databrew.CfnRuleset$ThresholdProperty | [[cdk.support/lookup-entry]] | `:threshold` |
"
  [^CfnRuleset$RuleProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-ruleset-rule-property-builder
  "Creates a  `CfnRuleset$RuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ruleset-rule-property-builder (new CfnRuleset$RuleProperty$Builder) id config))


(defn build-cfn-ruleset-substitution-value-property-builder
  "The build-cfn-ruleset-substitution-value-property-builder function updates a CfnRuleset$SubstitutionValueProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleset$SubstitutionValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `valueReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-reference` |
"
  [^CfnRuleset$SubstitutionValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :value-reference)]
    (. builder valueReference data))
  (.build builder))


(defn cfn-ruleset-substitution-value-property-builder
  "Creates a  `CfnRuleset$SubstitutionValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ruleset-substitution-value-property-builder (new CfnRuleset$SubstitutionValueProperty$Builder) id config))


(defn build-cfn-ruleset-threshold-property-builder
  "The build-cfn-ruleset-threshold-property-builder function updates a CfnRuleset$ThresholdProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleset$ThresholdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRuleset$ThresholdProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-ruleset-threshold-property-builder
  "Creates a  `CfnRuleset$ThresholdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ruleset-threshold-property-builder (new CfnRuleset$ThresholdProperty$Builder) id config))


(defn build-cfn-schedule-builder
  "The build-cfn-schedule-builder function updates a CfnSchedule$Builder instance using the provided configuration.
  The function takes the CfnSchedule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cronExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:cron-expression` |
| `jobNames` | java.util.List | [[cdk.support/lookup-entry]] | `:job-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchedule$Builder builder id config]
  (when-let [data (lookup-entry config id :cron-expression)]
    (. builder cronExpression data))
  (when-let [data (lookup-entry config id :job-names)]
    (. builder jobNames data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schedule-builder
  "Creates a  `CfnSchedule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-schedule-builder (CfnSchedule$Builder/create scope (name id)) id config))


(defn build-cfn-schedule-props-builder
  "The build-cfn-schedule-props-builder function updates a CfnScheduleProps$Builder instance using the provided configuration.
  The function takes the CfnScheduleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cronExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:cron-expression` |
| `jobNames` | java.util.List | [[cdk.support/lookup-entry]] | `:job-names` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnScheduleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cron-expression)]
    (. builder cronExpression data))
  (when-let [data (lookup-entry config id :job-names)]
    (. builder jobNames data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schedule-props-builder
  "Creates a  `CfnScheduleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-schedule-props-builder (new CfnScheduleProps$Builder) id config))