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


(defn cfn-dataset-attributes-items-property-builder
  "The cfn-dataset-attributes-items-property-builder function buildes out new instances of 
CfnDataset$AttributesItemsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |"
  [stack id config]
  (let [builder (CfnDataset$AttributesItemsProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :attribute-type)]
      (. builder attributeType data))
    (.build builder)))


(defn cfn-dataset-builder
  "The cfn-dataset-builder function buildes out new instances of 
CfnDataset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-frequency` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `encryptionConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataset$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-dataset-encryption-config-property-builder
  "The cfn-dataset-encryption-config-property-builder function buildes out new instances of 
CfnDataset$EncryptionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDataset$EncryptionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-dataset-group-builder
  "The cfn-dataset-group-builder function buildes out new instances of 
CfnDatasetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:dataset-arns` |
| `datasetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-name` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatasetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dataset-arns)]
      (. builder datasetArns data))
    (when-let [data (lookup-entry config id :dataset-group-name)]
      (. builder datasetGroupName data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dataset-group-props-builder
  "The cfn-dataset-group-props-builder function buildes out new instances of 
CfnDatasetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:dataset-arns` |
| `datasetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-group-name` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatasetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :dataset-arns)]
      (. builder datasetArns data))
    (when-let [data (lookup-entry config id :dataset-group-name)]
      (. builder datasetGroupName data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dataset-props-builder
  "The cfn-dataset-props-builder function buildes out new instances of 
CfnDatasetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-frequency` |
| `datasetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-name` |
| `datasetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataset-type` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `encryptionConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `schema` | java.lang.Object | [[cdk.support/lookup-entry]] | `:schema` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatasetProps$Builder.)]
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
    (.build builder)))


(defn cfn-dataset-schema-property-builder
  "The cfn-dataset-schema-property-builder function buildes out new instances of 
CfnDataset$SchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |"
  [stack id config]
  (let [builder (CfnDataset$SchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (.build builder)))


(defn cfn-dataset-tags-items-property-builder
  "The cfn-dataset-tags-items-property-builder function buildes out new instances of 
CfnDataset$TagsItemsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDataset$TagsItemsProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))