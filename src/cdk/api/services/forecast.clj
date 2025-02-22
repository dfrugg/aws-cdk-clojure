(ns cdk.api.services.forecast
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.forecast package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.forecast CfnDataset$AttributesItemsProperty$Builder
                                                     CfnDataset$Builder
                                                     CfnDataset$EncryptionConfigProperty$Builder
                                                     CfnDataset$SchemaProperty$Builder
                                                     CfnDataset$TagsItemsProperty$Builder
                                                     CfnDatasetGroup$Builder
                                                     CfnDatasetGroupProps$Builder
                                                     CfnDatasetProps$Builder]))


(defn build-cfn-dataset-attributes-items-property-builder
  "The build-cfn-dataset-attributes-items-property-builder function updates a CfnDataset$AttributesItemsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$AttributesItemsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |
"
  [^CfnDataset$AttributesItemsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-name)]
    (. builder attributeName data))
  (when-let [data (lookup-entry config id :attribute-type)]
    (. builder attributeType data))
  (.build builder))


(defn build-cfn-dataset-builder
  "The build-cfn-dataset-builder function updates a CfnDataset$Builder instance using the provided configuration.
  The function takes the CfnDataset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-frequency` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `encryptionConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataset$Builder builder id config]
  (when-let [data (lookup-entry config id :data-frequency)]
    (. builder dataFrequency data))
  (when-let [data (lookup-entry config id :dataset-name)]
    (. builder datasetName data))
  (when-let [data (lookup-entry config id :dataset-type)]
    (. builder datasetType data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :encryption-config)]
    (. builder encryptionConfig data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-dataset-encryption-config-property-builder
  "The build-cfn-dataset-encryption-config-property-builder function updates a CfnDataset$EncryptionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$EncryptionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDataset$EncryptionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
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
| `datasetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:dataset-arns` |
| `datasetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-name` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatasetGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :dataset-arns)]
    (. builder datasetArns data))
  (when-let [data (lookup-entry config id :dataset-group-name)]
    (. builder datasetGroupName data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-dataset-group-props-builder
  "The build-cfn-dataset-group-props-builder function updates a CfnDatasetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDatasetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:dataset-arns` |
| `datasetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-name` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatasetGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dataset-arns)]
    (. builder datasetArns data))
  (when-let [data (lookup-entry config id :dataset-group-name)]
    (. builder datasetGroupName data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-dataset-props-builder
  "The build-cfn-dataset-props-builder function updates a CfnDatasetProps$Builder instance using the provided configuration.
  The function takes the CfnDatasetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-frequency` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `encryptionConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatasetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-frequency)]
    (. builder dataFrequency data))
  (when-let [data (lookup-entry config id :dataset-name)]
    (. builder datasetName data))
  (when-let [data (lookup-entry config id :dataset-type)]
    (. builder datasetType data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :encryption-config)]
    (. builder encryptionConfig data))
  (when-let [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-dataset-schema-property-builder
  "The build-cfn-dataset-schema-property-builder function updates a CfnDataset$SchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$SchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnDataset$SchemaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn build-cfn-dataset-tags-items-property-builder
  "The build-cfn-dataset-tags-items-property-builder function updates a CfnDataset$TagsItemsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataset$TagsItemsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDataset$TagsItemsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))