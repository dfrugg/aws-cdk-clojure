(ns cdk.api.services.comprehend
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.comprehend package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.comprehend CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder
                                                       CfnDocumentClassifier$Builder
                                                       CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder
                                                       CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder
                                                       CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder
                                                       CfnDocumentClassifier$DocumentReaderConfigProperty$Builder
                                                       CfnDocumentClassifier$VpcConfigProperty$Builder
                                                       CfnDocumentClassifierProps$Builder
                                                       CfnFlywheel$Builder
                                                       CfnFlywheel$DataSecurityConfigProperty$Builder
                                                       CfnFlywheel$DocumentClassificationConfigProperty$Builder
                                                       CfnFlywheel$EntityRecognitionConfigProperty$Builder
                                                       CfnFlywheel$EntityTypesListItemProperty$Builder
                                                       CfnFlywheel$TaskConfigProperty$Builder
                                                       CfnFlywheel$VpcConfigProperty$Builder
                                                       CfnFlywheelProps$Builder]))


(defn build-cfn-document-classifier-augmented-manifests-list-item-property-builder
  "The build-cfn-document-classifier-augmented-manifests-list-item-property-builder function updates a CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:attribute-names` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `split` | java.lang.String | [[cdk.support/lookup-entry]] | `:split` |
"
  [^CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-names)]
    (. builder attributeNames data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (when-let [data (lookup-entry config id :split)]
    (. builder split data))
  (.build builder))


(defn cfn-document-classifier-augmented-manifests-list-item-property-builder
  ""
  [id config]
  (build-cfn-document-classifier-augmented-manifests-list-item-property-builder (new CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder) id config))


(defn build-cfn-document-classifier-builder
  "The build-cfn-document-classifier-builder function updates a CfnDocumentClassifier$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role-arn` |
| `documentClassifierName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-classifier-name` |
| `inputDataConfig` | software.amazon.awscdk.services.comprehend.CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty | [[cdk.support/lookup-entry]] | `:input-data-config` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `modelKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-kms-key-id` |
| `modelPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-policy` |
| `outputDataConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-data-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `vpcConfig` | software.amazon.awscdk.services.comprehend.CfnDocumentClassifier$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnDocumentClassifier$Builder builder id config]
  (when-let [data (lookup-entry config id :data-access-role-arn)]
    (. builder dataAccessRoleArn data))
  (when-let [data (lookup-entry config id :document-classifier-name)]
    (. builder documentClassifierName data))
  (when-let [data (lookup-entry config id :input-data-config)]
    (. builder inputDataConfig data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :model-kms-key-id)]
    (. builder modelKmsKeyId data))
  (when-let [data (lookup-entry config id :model-policy)]
    (. builder modelPolicy data))
  (when-let [data (lookup-entry config id :output-data-config)]
    (. builder outputDataConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-document-classifier-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-document-classifier-builder (CfnDocumentClassifier$Builder/create scope (name id)) id config))


(defn build-cfn-document-classifier-document-classifier-documents-property-builder
  "The build-cfn-document-classifier-document-classifier-documents-property-builder function updates a CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `testS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:test-s3-uri` |
"
  [^CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (when-let [data (lookup-entry config id :test-s3-uri)]
    (. builder testS3Uri data))
  (.build builder))


(defn cfn-document-classifier-document-classifier-documents-property-builder
  ""
  [id config]
  (build-cfn-document-classifier-document-classifier-documents-property-builder (new CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder) id config))


(defn build-cfn-document-classifier-document-classifier-input-data-config-property-builder
  "The build-cfn-document-classifier-document-classifier-input-data-config-property-builder function updates a CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `augmentedManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:augmented-manifests` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `documentReaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-reader-config` |
| `documentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-type` |
| `documents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:documents` |
| `labelDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-delimiter` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `testS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:test-s3-uri` |
"
  [^CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :augmented-manifests)]
    (. builder augmentedManifests data))
  (when-let [data (lookup-entry config id :data-format)]
    (. builder dataFormat data))
  (when-let [data (lookup-entry config id :document-reader-config)]
    (. builder documentReaderConfig data))
  (when-let [data (lookup-entry config id :document-type)]
    (. builder documentType data))
  (when-let [data (lookup-entry config id :documents)]
    (. builder documents data))
  (when-let [data (lookup-entry config id :label-delimiter)]
    (. builder labelDelimiter data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (when-let [data (lookup-entry config id :test-s3-uri)]
    (. builder testS3Uri data))
  (.build builder))


(defn cfn-document-classifier-document-classifier-input-data-config-property-builder
  ""
  [id config]
  (build-cfn-document-classifier-document-classifier-input-data-config-property-builder (new CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder) id config))


(defn build-cfn-document-classifier-document-classifier-output-data-config-property-builder
  "The build-cfn-document-classifier-document-classifier-output-data-config-property-builder function updates a CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-document-classifier-document-classifier-output-data-config-property-builder
  ""
  [id config]
  (build-cfn-document-classifier-document-classifier-output-data-config-property-builder (new CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder) id config))


(defn build-cfn-document-classifier-document-reader-config-property-builder
  "The build-cfn-document-classifier-document-reader-config-property-builder function updates a CfnDocumentClassifier$DocumentReaderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$DocumentReaderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentReadAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-read-action` |
| `documentReadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-read-mode` |
| `featureTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:feature-types` |
"
  [^CfnDocumentClassifier$DocumentReaderConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-read-action)]
    (. builder documentReadAction data))
  (when-let [data (lookup-entry config id :document-read-mode)]
    (. builder documentReadMode data))
  (when-let [data (lookup-entry config id :feature-types)]
    (. builder featureTypes data))
  (.build builder))


(defn cfn-document-classifier-document-reader-config-property-builder
  ""
  [id config]
  (build-cfn-document-classifier-document-reader-config-property-builder (new CfnDocumentClassifier$DocumentReaderConfigProperty$Builder) id config))


(defn build-cfn-document-classifier-props-builder
  "The build-cfn-document-classifier-props-builder function updates a CfnDocumentClassifierProps$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifierProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role-arn` |
| `documentClassifierName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-classifier-name` |
| `inputDataConfig` | software.amazon.awscdk.services.comprehend.CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty | [[cdk.support/lookup-entry]] | `:input-data-config` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `modelKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-kms-key-id` |
| `modelPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-policy` |
| `outputDataConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-data-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `vpcConfig` | software.amazon.awscdk.services.comprehend.CfnDocumentClassifier$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnDocumentClassifierProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-access-role-arn)]
    (. builder dataAccessRoleArn data))
  (when-let [data (lookup-entry config id :document-classifier-name)]
    (. builder documentClassifierName data))
  (when-let [data (lookup-entry config id :input-data-config)]
    (. builder inputDataConfig data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :model-kms-key-id)]
    (. builder modelKmsKeyId data))
  (when-let [data (lookup-entry config id :model-policy)]
    (. builder modelPolicy data))
  (when-let [data (lookup-entry config id :output-data-config)]
    (. builder outputDataConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-document-classifier-props-builder
  ""
  [id config]
  (build-cfn-document-classifier-props-builder (new CfnDocumentClassifierProps$Builder) id config))


(defn build-cfn-document-classifier-vpc-config-property-builder
  "The build-cfn-document-classifier-vpc-config-property-builder function updates a CfnDocumentClassifier$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDocumentClassifier$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnDocumentClassifier$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-document-classifier-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-document-classifier-vpc-config-property-builder (new CfnDocumentClassifier$VpcConfigProperty$Builder) id config))


(defn build-cfn-flywheel-builder
  "The build-cfn-flywheel-builder function updates a CfnFlywheel$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeModelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-model-arn` |
| `dataAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role-arn` |
| `dataLakeS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-s3-uri` |
| `dataSecurityConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$DataSecurityConfigProperty | [[cdk.support/lookup-entry]] | `:data-security-config` |
| `flywheelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flywheel-name` |
| `modelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$TaskConfigProperty | [[cdk.support/lookup-entry]] | `:task-config` |
"
  [^CfnFlywheel$Builder builder id config]
  (when-let [data (lookup-entry config id :active-model-arn)]
    (. builder activeModelArn data))
  (when-let [data (lookup-entry config id :data-access-role-arn)]
    (. builder dataAccessRoleArn data))
  (when-let [data (lookup-entry config id :data-lake-s3-uri)]
    (. builder dataLakeS3Uri data))
  (when-let [data (lookup-entry config id :data-security-config)]
    (. builder dataSecurityConfig data))
  (when-let [data (lookup-entry config id :flywheel-name)]
    (. builder flywheelName data))
  (when-let [data (lookup-entry config id :model-type)]
    (. builder modelType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task-config)]
    (. builder taskConfig data))
  (.build builder))


(defn cfn-flywheel-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-flywheel-builder (CfnFlywheel$Builder/create scope (name id)) id config))


(defn build-cfn-flywheel-data-security-config-property-builder
  "The build-cfn-flywheel-data-security-config-property-builder function updates a CfnFlywheel$DataSecurityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$DataSecurityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-kms-key-id` |
| `modelKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-kms-key-id` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `vpcConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFlywheel$DataSecurityConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-lake-kms-key-id)]
    (. builder dataLakeKmsKeyId data))
  (when-let [data (lookup-entry config id :model-kms-key-id)]
    (. builder modelKmsKeyId data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-flywheel-data-security-config-property-builder
  ""
  [id config]
  (build-cfn-flywheel-data-security-config-property-builder (new CfnFlywheel$DataSecurityConfigProperty$Builder) id config))


(defn build-cfn-flywheel-document-classification-config-property-builder
  "The build-cfn-flywheel-document-classification-config-property-builder function updates a CfnFlywheel$DocumentClassificationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$DocumentClassificationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnFlywheel$DocumentClassificationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-flywheel-document-classification-config-property-builder
  ""
  [id config]
  (build-cfn-flywheel-document-classification-config-property-builder (new CfnFlywheel$DocumentClassificationConfigProperty$Builder) id config))


(defn build-cfn-flywheel-entity-recognition-config-property-builder
  "The build-cfn-flywheel-entity-recognition-config-property-builder function updates a CfnFlywheel$EntityRecognitionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$EntityRecognitionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entity-types` |
"
  [^CfnFlywheel$EntityRecognitionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :entity-types)]
    (. builder entityTypes data))
  (.build builder))


(defn cfn-flywheel-entity-recognition-config-property-builder
  ""
  [id config]
  (build-cfn-flywheel-entity-recognition-config-property-builder (new CfnFlywheel$EntityRecognitionConfigProperty$Builder) id config))


(defn build-cfn-flywheel-entity-types-list-item-property-builder
  "The build-cfn-flywheel-entity-types-list-item-property-builder function updates a CfnFlywheel$EntityTypesListItemProperty$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$EntityTypesListItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnFlywheel$EntityTypesListItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-flywheel-entity-types-list-item-property-builder
  ""
  [id config]
  (build-cfn-flywheel-entity-types-list-item-property-builder (new CfnFlywheel$EntityTypesListItemProperty$Builder) id config))


(defn build-cfn-flywheel-props-builder
  "The build-cfn-flywheel-props-builder function updates a CfnFlywheelProps$Builder instance using the provided configuration.
  The function takes the CfnFlywheelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeModelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-model-arn` |
| `dataAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role-arn` |
| `dataLakeS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-s3-uri` |
| `dataSecurityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-security-config` |
| `flywheelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flywheel-name` |
| `modelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-config` |
"
  [^CfnFlywheelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :active-model-arn)]
    (. builder activeModelArn data))
  (when-let [data (lookup-entry config id :data-access-role-arn)]
    (. builder dataAccessRoleArn data))
  (when-let [data (lookup-entry config id :data-lake-s3-uri)]
    (. builder dataLakeS3Uri data))
  (when-let [data (lookup-entry config id :data-security-config)]
    (. builder dataSecurityConfig data))
  (when-let [data (lookup-entry config id :flywheel-name)]
    (. builder flywheelName data))
  (when-let [data (lookup-entry config id :model-type)]
    (. builder modelType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task-config)]
    (. builder taskConfig data))
  (.build builder))


(defn cfn-flywheel-props-builder
  ""
  [id config]
  (build-cfn-flywheel-props-builder (new CfnFlywheelProps$Builder) id config))


(defn build-cfn-flywheel-task-config-property-builder
  "The build-cfn-flywheel-task-config-property-builder function updates a CfnFlywheel$TaskConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$TaskConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentClassificationConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$DocumentClassificationConfigProperty | [[cdk.support/lookup-entry]] | `:document-classification-config` |
| `entityRecognitionConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$EntityRecognitionConfigProperty | [[cdk.support/lookup-entry]] | `:entity-recognition-config` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
"
  [^CfnFlywheel$TaskConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-classification-config)]
    (. builder documentClassificationConfig data))
  (when-let [data (lookup-entry config id :entity-recognition-config)]
    (. builder entityRecognitionConfig data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (.build builder))


(defn cfn-flywheel-task-config-property-builder
  ""
  [id config]
  (build-cfn-flywheel-task-config-property-builder (new CfnFlywheel$TaskConfigProperty$Builder) id config))


(defn build-cfn-flywheel-vpc-config-property-builder
  "The build-cfn-flywheel-vpc-config-property-builder function updates a CfnFlywheel$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlywheel$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnFlywheel$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-flywheel-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-flywheel-vpc-config-property-builder (new CfnFlywheel$VpcConfigProperty$Builder) id config))