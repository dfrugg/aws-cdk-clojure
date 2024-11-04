(ns cdk.api.services.b2bi
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.b2bi package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.b2bi CfnCapability$Builder
                                                 CfnCapability$CapabilityConfigurationProperty$Builder
                                                 CfnCapability$EdiConfigurationProperty$Builder
                                                 CfnCapability$EdiTypeProperty$Builder
                                                 CfnCapability$S3LocationProperty$Builder
                                                 CfnCapability$X12DetailsProperty$Builder
                                                 CfnCapabilityProps$Builder
                                                 CfnPartnership$Builder
                                                 CfnPartnershipProps$Builder
                                                 CfnProfile$Builder
                                                 CfnProfileProps$Builder
                                                 CfnTransformer$Builder
                                                 CfnTransformer$EdiTypeProperty$Builder
                                                 CfnTransformer$X12DetailsProperty$Builder
                                                 CfnTransformerProps$Builder]))


(defn cfn-capability-builder
  "The cfn-capability-builder function buildes out new instances of 
CfnCapability$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.b2bi.CfnCapability$CapabilityConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `instructionsDocuments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instructions-documents` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCapability$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :instructions-documents)]
      (. builder instructionsDocuments data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-capability-capability-configuration-property-builder
  "The cfn-capability-capability-configuration-property-builder function buildes out new instances of 
CfnCapability$CapabilityConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `edi` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:edi` |"
  [stack id config]
  (let [builder (CfnCapability$CapabilityConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :edi)]
      (. builder edi data))
    (.build builder)))


(defn cfn-capability-edi-configuration-property-builder
  "The cfn-capability-edi-configuration-property-builder function buildes out new instances of 
CfnCapability$EdiConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLocation` | software.amazon.awscdk.services.b2bi.CfnCapability$S3LocationProperty | [[cdk.support/lookup-entry]] | `:input-location` |
| `outputLocation` | software.amazon.awscdk.services.b2bi.CfnCapability$S3LocationProperty | [[cdk.support/lookup-entry]] | `:output-location` |
| `transformerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transformer-id` |
| `type` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCapability$EdiConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-location)]
      (. builder inputLocation data))
    (when-let [data (lookup-entry config id :output-location)]
      (. builder outputLocation data))
    (when-let [data (lookup-entry config id :transformer-id)]
      (. builder transformerId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-capability-edi-type-property-builder
  "The cfn-capability-edi-type-property-builder function buildes out new instances of 
CfnCapability$EdiTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `x12Details` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:x12-details` |"
  [stack id config]
  (let [builder (CfnCapability$EdiTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :x12-details)]
      (. builder x12Details data))
    (.build builder)))


(defn cfn-capability-props-builder
  "The cfn-capability-props-builder function buildes out new instances of 
CfnCapabilityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `instructionsDocuments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instructions-documents` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCapabilityProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :instructions-documents)]
      (. builder instructionsDocuments data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-capability-s3-location-property-builder
  "The cfn-capability-s3-location-property-builder function buildes out new instances of 
CfnCapability$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnCapability$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-capability-x12-details-property-builder
  "The cfn-capability-x12-details-property-builder function buildes out new instances of 
CfnCapability$X12DetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transactionSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:transaction-set` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnCapability$X12DetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :transaction-set)]
      (. builder transactionSet data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-partnership-builder
  "The cfn-partnership-builder function buildes out new instances of 
CfnPartnership$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPartnership$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :phone)]
      (. builder phone data))
    (when-let [data (lookup-entry config id :profile-id)]
      (. builder profileId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-partnership-props-builder
  "The cfn-partnership-props-builder function buildes out new instances of 
CfnPartnershipProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPartnershipProps$Builder.)]
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :phone)]
      (. builder phone data))
    (when-let [data (lookup-entry config id :profile-id)]
      (. builder profileId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-builder
  "The cfn-profile-builder function buildes out new instances of 
CfnProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessName` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `logging` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :business-name)]
      (. builder businessName data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :phone)]
      (. builder phone data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-props-builder
  "The cfn-profile-props-builder function buildes out new instances of 
CfnProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessName` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `logging` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :business-name)]
      (. builder businessName data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :phone)]
      (. builder phone data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-transformer-builder
  "The cfn-transformer-builder function buildes out new instances of 
CfnTransformer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ediType` | software.amazon.awscdk.services.b2bi.CfnTransformer$EdiTypeProperty | [[cdk.support/lookup-entry]] | `:edi-type` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `mappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-template` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sampleDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-document` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTransformer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :edi-type)]
      (. builder ediType data))
    (when-let [data (lookup-entry config id :file-format)]
      (. builder fileFormat data))
    (when-let [data (lookup-entry config id :mapping-template)]
      (. builder mappingTemplate data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sample-document)]
      (. builder sampleDocument data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-transformer-edi-type-property-builder
  "The cfn-transformer-edi-type-property-builder function buildes out new instances of 
CfnTransformer$EdiTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `x12Details` | software.amazon.awscdk.services.b2bi.CfnTransformer$X12DetailsProperty | [[cdk.support/lookup-entry]] | `:x12-details` |"
  [stack id config]
  (let [builder (CfnTransformer$EdiTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :x12-details)]
      (. builder x12Details data))
    (.build builder)))


(defn cfn-transformer-props-builder
  "The cfn-transformer-props-builder function buildes out new instances of 
CfnTransformerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ediType` | software.amazon.awscdk.services.b2bi.CfnTransformer$EdiTypeProperty | [[cdk.support/lookup-entry]] | `:edi-type` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `mappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-template` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sampleDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-document` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTransformerProps$Builder.)]
    (when-let [data (lookup-entry config id :edi-type)]
      (. builder ediType data))
    (when-let [data (lookup-entry config id :file-format)]
      (. builder fileFormat data))
    (when-let [data (lookup-entry config id :mapping-template)]
      (. builder mappingTemplate data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sample-document)]
      (. builder sampleDocument data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-transformer-x12-details-property-builder
  "The cfn-transformer-x12-details-property-builder function buildes out new instances of 
CfnTransformer$X12DetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transactionSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:transaction-set` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnTransformer$X12DetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :transaction-set)]
      (. builder transactionSet data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))