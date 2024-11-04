(ns cdk.api.services.healthlake
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.healthlake package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.healthlake CfnFHIRDatastore$Builder
                                                       CfnFHIRDatastore$CreatedAtProperty$Builder
                                                       CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder
                                                       CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder
                                                       CfnFHIRDatastore$PreloadDataConfigProperty$Builder
                                                       CfnFHIRDatastore$SseConfigurationProperty$Builder
                                                       CfnFHIRDatastoreProps$Builder]))


(defn cfn-fhir-datastore-builder
  "The cfn-fhir-datastore-builder function buildes out new instances of 
CfnFHIRDatastore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastoreTypeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-type-version` |
| `identityProviderConfiguration` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$IdentityProviderConfigurationProperty | [[cdk.support/lookup-entry]] | `:identity-provider-configuration` |
| `preloadDataConfig` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$PreloadDataConfigProperty | [[cdk.support/lookup-entry]] | `:preload-data-config` |
| `sseConfiguration` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$SseConfigurationProperty | [[cdk.support/lookup-entry]] | `:sse-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFHIRDatastore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :datastore-type-version)]
      (. builder datastoreTypeVersion data))
    (when-let [data (lookup-entry config id :identity-provider-configuration)]
      (. builder identityProviderConfiguration data))
    (when-let [data (lookup-entry config id :preload-data-config)]
      (. builder preloadDataConfig data))
    (when-let [data (lookup-entry config id :sse-configuration)]
      (. builder sseConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fhir-datastore-created-at-property-builder
  "The cfn-fhir-datastore-created-at-property-builder function buildes out new instances of 
CfnFHIRDatastore$CreatedAtProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nanos` | java.lang.Number | [[cdk.support/lookup-entry]] | `:nanos` |
| `seconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:seconds` |"
  [stack id config]
  (let [builder (CfnFHIRDatastore$CreatedAtProperty$Builder.)]
    (when-let [data (lookup-entry config id :nanos)]
      (. builder nanos data))
    (when-let [data (lookup-entry config id :seconds)]
      (. builder seconds data))
    (.build builder)))


(defn cfn-fhir-datastore-identity-provider-configuration-property-builder
  "The cfn-fhir-datastore-identity-provider-configuration-property-builder function buildes out new instances of 
CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-strategy` |
| `fineGrainedAuthorizationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fine-grained-authorization-enabled` |
| `idpLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-lambda-arn` |
| `metadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata` |"
  [stack id config]
  (let [builder (CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-strategy)]
      (. builder authorizationStrategy data))
    (when-let [data (lookup-entry config id :fine-grained-authorization-enabled)]
      (. builder fineGrainedAuthorizationEnabled data))
    (when-let [data (lookup-entry config id :idp-lambda-arn)]
      (. builder idpLambdaArn data))
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (.build builder)))


(defn cfn-fhir-datastore-kms-encryption-config-property-builder
  "The cfn-fhir-datastore-kms-encryption-config-property-builder function buildes out new instances of 
CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmk-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cmk-type)]
      (. builder cmkType data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-fhir-datastore-preload-data-config-property-builder
  "The cfn-fhir-datastore-preload-data-config-property-builder function buildes out new instances of 
CfnFHIRDatastore$PreloadDataConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preloadDataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preload-data-type` |"
  [stack id config]
  (let [builder (CfnFHIRDatastore$PreloadDataConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :preload-data-type)]
      (. builder preloadDataType data))
    (.build builder)))


(defn cfn-fhir-datastore-props-builder
  "The cfn-fhir-datastore-props-builder function buildes out new instances of 
CfnFHIRDatastoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastoreTypeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-type-version` |
| `identityProviderConfiguration` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$IdentityProviderConfigurationProperty | [[cdk.support/lookup-entry]] | `:identity-provider-configuration` |
| `preloadDataConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preload-data-config` |
| `sseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFHIRDatastoreProps$Builder.)]
    (when-let [data (lookup-entry config id :datastore-name)]
      (. builder datastoreName data))
    (when-let [data (lookup-entry config id :datastore-type-version)]
      (. builder datastoreTypeVersion data))
    (when-let [data (lookup-entry config id :identity-provider-configuration)]
      (. builder identityProviderConfiguration data))
    (when-let [data (lookup-entry config id :preload-data-config)]
      (. builder preloadDataConfig data))
    (when-let [data (lookup-entry config id :sse-configuration)]
      (. builder sseConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fhir-datastore-sse-configuration-property-builder
  "The cfn-fhir-datastore-sse-configuration-property-builder function buildes out new instances of 
CfnFHIRDatastore$SseConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsEncryptionConfig` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$KmsEncryptionConfigProperty | [[cdk.support/lookup-entry]] | `:kms-encryption-config` |"
  [stack id config]
  (let [builder (CfnFHIRDatastore$SseConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-encryption-config)]
      (. builder kmsEncryptionConfig data))
    (.build builder)))