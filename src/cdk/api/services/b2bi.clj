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


(defn build-cfn-capability-builder
  "The build-cfn-capability-builder function updates a CfnCapability$Builder instance using the provided configuration.
  The function takes the CfnCapability$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.b2bi.CfnCapability$CapabilityConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `instructionsDocuments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instructions-documents` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCapability$Builder builder id config]
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
  (.build builder))


(defn cfn-capability-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-capability-builder (CfnCapability$Builder/create scope (name id)) id config))


(defn build-cfn-capability-capability-configuration-property-builder
  "The build-cfn-capability-capability-configuration-property-builder function updates a CfnCapability$CapabilityConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCapability$CapabilityConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `edi` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:edi` |
"
  [^CfnCapability$CapabilityConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :edi)]
    (. builder edi data))
  (.build builder))


(defn cfn-capability-capability-configuration-property-builder
  ""
  [id config]
  (build-cfn-capability-capability-configuration-property-builder (new CfnCapability$CapabilityConfigurationProperty$Builder) id config))


(defn build-cfn-capability-edi-configuration-property-builder
  "The build-cfn-capability-edi-configuration-property-builder function updates a CfnCapability$EdiConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCapability$EdiConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLocation` | software.amazon.awscdk.services.b2bi.CfnCapability$S3LocationProperty | [[cdk.support/lookup-entry]] | `:input-location` |
| `outputLocation` | software.amazon.awscdk.services.b2bi.CfnCapability$S3LocationProperty | [[cdk.support/lookup-entry]] | `:output-location` |
| `transformerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transformer-id` |
| `type` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCapability$EdiConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-location)]
    (. builder inputLocation data))
  (when-let [data (lookup-entry config id :output-location)]
    (. builder outputLocation data))
  (when-let [data (lookup-entry config id :transformer-id)]
    (. builder transformerId data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-capability-edi-configuration-property-builder
  ""
  [id config]
  (build-cfn-capability-edi-configuration-property-builder (new CfnCapability$EdiConfigurationProperty$Builder) id config))


(defn build-cfn-capability-edi-type-property-builder
  "The build-cfn-capability-edi-type-property-builder function updates a CfnCapability$EdiTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnCapability$EdiTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `x12Details` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:x12-details` |
"
  [^CfnCapability$EdiTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :x12-details)]
    (. builder x12Details data))
  (.build builder))


(defn cfn-capability-edi-type-property-builder
  ""
  [id config]
  (build-cfn-capability-edi-type-property-builder (new CfnCapability$EdiTypeProperty$Builder) id config))


(defn build-cfn-capability-props-builder
  "The build-cfn-capability-props-builder function updates a CfnCapabilityProps$Builder instance using the provided configuration.
  The function takes the CfnCapabilityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `instructionsDocuments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instructions-documents` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCapabilityProps$Builder builder id config]
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
  (.build builder))


(defn cfn-capability-props-builder
  ""
  [id config]
  (build-cfn-capability-props-builder (new CfnCapabilityProps$Builder) id config))


(defn build-cfn-capability-s3-location-property-builder
  "The build-cfn-capability-s3-location-property-builder function updates a CfnCapability$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnCapability$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnCapability$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-capability-s3-location-property-builder
  ""
  [id config]
  (build-cfn-capability-s3-location-property-builder (new CfnCapability$S3LocationProperty$Builder) id config))


(defn build-cfn-capability-x12-details-property-builder
  "The build-cfn-capability-x12-details-property-builder function updates a CfnCapability$X12DetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnCapability$X12DetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transactionSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:transaction-set` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnCapability$X12DetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :transaction-set)]
    (. builder transactionSet data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-capability-x12-details-property-builder
  ""
  [id config]
  (build-cfn-capability-x12-details-property-builder (new CfnCapability$X12DetailsProperty$Builder) id config))


(defn build-cfn-partnership-builder
  "The build-cfn-partnership-builder function updates a CfnPartnership$Builder instance using the provided configuration.
  The function takes the CfnPartnership$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPartnership$Builder builder id config]
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
  (.build builder))


(defn cfn-partnership-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-partnership-builder (CfnPartnership$Builder/create scope (name id)) id config))


(defn build-cfn-partnership-props-builder
  "The build-cfn-partnership-props-builder function updates a CfnPartnershipProps$Builder instance using the provided configuration.
  The function takes the CfnPartnershipProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `profileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPartnershipProps$Builder builder id config]
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
  (.build builder))


(defn cfn-partnership-props-builder
  ""
  [id config]
  (build-cfn-partnership-props-builder (new CfnPartnershipProps$Builder) id config))


(defn build-cfn-profile-builder
  "The build-cfn-profile-builder function updates a CfnProfile$Builder instance using the provided configuration.
  The function takes the CfnProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessName` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `logging` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfile$Builder builder id config]
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
  (.build builder))


(defn cfn-profile-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-profile-builder (CfnProfile$Builder/create scope (name id)) id config))


(defn build-cfn-profile-props-builder
  "The build-cfn-profile-props-builder function updates a CfnProfileProps$Builder instance using the provided configuration.
  The function takes the CfnProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessName` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `logging` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `phone` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfileProps$Builder builder id config]
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
  (.build builder))


(defn cfn-profile-props-builder
  ""
  [id config]
  (build-cfn-profile-props-builder (new CfnProfileProps$Builder) id config))


(defn build-cfn-transformer-builder
  "The build-cfn-transformer-builder function updates a CfnTransformer$Builder instance using the provided configuration.
  The function takes the CfnTransformer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ediType` | software.amazon.awscdk.services.b2bi.CfnTransformer$EdiTypeProperty | [[cdk.support/lookup-entry]] | `:edi-type` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `mappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-template` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sampleDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-document` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTransformer$Builder builder id config]
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
  (.build builder))


(defn cfn-transformer-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-transformer-builder (CfnTransformer$Builder/create scope (name id)) id config))


(defn build-cfn-transformer-edi-type-property-builder
  "The build-cfn-transformer-edi-type-property-builder function updates a CfnTransformer$EdiTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnTransformer$EdiTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `x12Details` | software.amazon.awscdk.services.b2bi.CfnTransformer$X12DetailsProperty | [[cdk.support/lookup-entry]] | `:x12-details` |
"
  [^CfnTransformer$EdiTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :x12-details)]
    (. builder x12Details data))
  (.build builder))


(defn cfn-transformer-edi-type-property-builder
  ""
  [id config]
  (build-cfn-transformer-edi-type-property-builder (new CfnTransformer$EdiTypeProperty$Builder) id config))


(defn build-cfn-transformer-props-builder
  "The build-cfn-transformer-props-builder function updates a CfnTransformerProps$Builder instance using the provided configuration.
  The function takes the CfnTransformerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ediType` | software.amazon.awscdk.services.b2bi.CfnTransformer$EdiTypeProperty | [[cdk.support/lookup-entry]] | `:edi-type` |
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `mappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-template` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sampleDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-document` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTransformerProps$Builder builder id config]
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
  (.build builder))


(defn cfn-transformer-props-builder
  ""
  [id config]
  (build-cfn-transformer-props-builder (new CfnTransformerProps$Builder) id config))


(defn build-cfn-transformer-x12-details-property-builder
  "The build-cfn-transformer-x12-details-property-builder function updates a CfnTransformer$X12DetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnTransformer$X12DetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transactionSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:transaction-set` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnTransformer$X12DetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :transaction-set)]
    (. builder transactionSet data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-transformer-x12-details-property-builder
  ""
  [id config]
  (build-cfn-transformer-x12-details-property-builder (new CfnTransformer$X12DetailsProperty$Builder) id config))