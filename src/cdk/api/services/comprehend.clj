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


(defn cfn-document-classifier-augmented-manifests-list-item-property-builder
  "The cfn-document-classifier-augmented-manifests-list-item-property-builder function buildes out new instances of 
CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:attribute-names` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `split` | java.lang.String | [[cdk.support/lookup-entry]] | `:split` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$AugmentedManifestsListItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-names)]
      (. builder attributeNames data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (when-let [data (lookup-entry config id :split)]
      (. builder split data))
    (.build builder)))


(defn cfn-document-classifier-builder
  "The cfn-document-classifier-builder function buildes out new instances of 
CfnDocumentClassifier$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.comprehend.CfnDocumentClassifier$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-document-classifier-document-classifier-documents-property-builder
  "The cfn-document-classifier-document-classifier-documents-property-builder function buildes out new instances of 
CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `testS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:test-s3-uri` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$DocumentClassifierDocumentsProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (when-let [data (lookup-entry config id :test-s3-uri)]
      (. builder testS3Uri data))
    (.build builder)))


(defn cfn-document-classifier-document-classifier-input-data-config-property-builder
  "The cfn-document-classifier-document-classifier-input-data-config-property-builder function buildes out new instances of 
CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `augmentedManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:augmented-manifests` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `documentReaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:document-reader-config` |
| `documentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-type` |
| `documents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:documents` |
| `labelDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-delimiter` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `testS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:test-s3-uri` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$DocumentClassifierInputDataConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-document-classifier-document-classifier-output-data-config-property-builder
  "The cfn-document-classifier-document-classifier-output-data-config-property-builder function buildes out new instances of 
CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$DocumentClassifierOutputDataConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-document-classifier-document-reader-config-property-builder
  "The cfn-document-classifier-document-reader-config-property-builder function buildes out new instances of 
CfnDocumentClassifier$DocumentReaderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentReadAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-read-action` |
| `documentReadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-read-mode` |
| `featureTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:feature-types` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$DocumentReaderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-read-action)]
      (. builder documentReadAction data))
    (when-let [data (lookup-entry config id :document-read-mode)]
      (. builder documentReadMode data))
    (when-let [data (lookup-entry config id :feature-types)]
      (. builder featureTypes data))
    (.build builder)))


(defn cfn-document-classifier-props-builder
  "The cfn-document-classifier-props-builder function buildes out new instances of 
CfnDocumentClassifierProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.comprehend.CfnDocumentClassifier$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnDocumentClassifierProps$Builder.)]
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
    (.build builder)))


(defn cfn-document-classifier-vpc-config-property-builder
  "The cfn-document-classifier-vpc-config-property-builder function buildes out new instances of 
CfnDocumentClassifier$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnDocumentClassifier$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-flywheel-builder
  "The cfn-flywheel-builder function buildes out new instances of 
CfnFlywheel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeModelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-model-arn` |
| `dataAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role-arn` |
| `dataLakeS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-s3-uri` |
| `dataSecurityConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$DataSecurityConfigProperty | [[cdk.support/lookup-entry]] | `:data-security-config` |
| `flywheelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flywheel-name` |
| `modelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$TaskConfigProperty | [[cdk.support/lookup-entry]] | `:task-config` |"
  [stack id config]
  (let [builder (CfnFlywheel$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-flywheel-data-security-config-property-builder
  "The cfn-flywheel-data-security-config-property-builder function buildes out new instances of 
CfnFlywheel$DataSecurityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-kms-key-id` |
| `modelKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-kms-key-id` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `vpcConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFlywheel$DataSecurityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-lake-kms-key-id)]
      (. builder dataLakeKmsKeyId data))
    (when-let [data (lookup-entry config id :model-kms-key-id)]
      (. builder modelKmsKeyId data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-flywheel-document-classification-config-property-builder
  "The cfn-flywheel-document-classification-config-property-builder function buildes out new instances of 
CfnFlywheel$DocumentClassificationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnFlywheel$DocumentClassificationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-flywheel-entity-recognition-config-property-builder
  "The cfn-flywheel-entity-recognition-config-property-builder function buildes out new instances of 
CfnFlywheel$EntityRecognitionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entity-types` |"
  [stack id config]
  (let [builder (CfnFlywheel$EntityRecognitionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :entity-types)]
      (. builder entityTypes data))
    (.build builder)))


(defn cfn-flywheel-entity-types-list-item-property-builder
  "The cfn-flywheel-entity-types-list-item-property-builder function buildes out new instances of 
CfnFlywheel$EntityTypesListItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnFlywheel$EntityTypesListItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-flywheel-props-builder
  "The cfn-flywheel-props-builder function buildes out new instances of 
CfnFlywheelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeModelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-model-arn` |
| `dataAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role-arn` |
| `dataLakeS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-s3-uri` |
| `dataSecurityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-security-config` |
| `flywheelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flywheel-name` |
| `modelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-config` |"
  [stack id config]
  (let [builder (CfnFlywheelProps$Builder.)]
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
    (.build builder)))


(defn cfn-flywheel-task-config-property-builder
  "The cfn-flywheel-task-config-property-builder function buildes out new instances of 
CfnFlywheel$TaskConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentClassificationConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$DocumentClassificationConfigProperty | [[cdk.support/lookup-entry]] | `:document-classification-config` |
| `entityRecognitionConfig` | software.amazon.awscdk.services.comprehend.CfnFlywheel$EntityRecognitionConfigProperty | [[cdk.support/lookup-entry]] | `:entity-recognition-config` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |"
  [stack id config]
  (let [builder (CfnFlywheel$TaskConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-classification-config)]
      (. builder documentClassificationConfig data))
    (when-let [data (lookup-entry config id :entity-recognition-config)]
      (. builder entityRecognitionConfig data))
    (when-let [data (lookup-entry config id :language-code)]
      (. builder languageCode data))
    (.build builder)))


(defn cfn-flywheel-vpc-config-property-builder
  "The cfn-flywheel-vpc-config-property-builder function buildes out new instances of 
CfnFlywheel$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnFlywheel$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))