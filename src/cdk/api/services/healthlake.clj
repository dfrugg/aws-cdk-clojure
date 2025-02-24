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


(defn build-cfn-fhir-datastore-builder
  "The build-cfn-fhir-datastore-builder function updates a CfnFHIRDatastore$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastoreTypeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-type-version` |
| `identityProviderConfiguration` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$IdentityProviderConfigurationProperty | [[cdk.support/lookup-entry]] | `:identity-provider-configuration` |
| `preloadDataConfig` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$PreloadDataConfigProperty | [[cdk.support/lookup-entry]] | `:preload-data-config` |
| `sseConfiguration` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$SseConfigurationProperty | [[cdk.support/lookup-entry]] | `:sse-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFHIRDatastore$Builder builder id config]
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
  (.build builder))


(defn cfn-fhir-datastore-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-fhir-datastore-builder (CfnFHIRDatastore$Builder/create scope (name id)) id config))


(defn build-cfn-fhir-datastore-created-at-property-builder
  "The build-cfn-fhir-datastore-created-at-property-builder function updates a CfnFHIRDatastore$CreatedAtProperty$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastore$CreatedAtProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nanos` | java.lang.Number | [[cdk.support/lookup-entry]] | `:nanos` |
| `seconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:seconds` |
"
  [^CfnFHIRDatastore$CreatedAtProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :nanos)]
    (. builder nanos data))
  (when-let [data (lookup-entry config id :seconds)]
    (. builder seconds data))
  (.build builder))


(defn cfn-fhir-datastore-created-at-property-builder
  ""
  [id config]
  (build-cfn-fhir-datastore-created-at-property-builder (new CfnFHIRDatastore$CreatedAtProperty$Builder) id config))


(defn build-cfn-fhir-datastore-identity-provider-configuration-property-builder
  "The build-cfn-fhir-datastore-identity-provider-configuration-property-builder function updates a CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-strategy` |
| `fineGrainedAuthorizationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fine-grained-authorization-enabled` |
| `idpLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-lambda-arn` |
| `metadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata` |
"
  [^CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-strategy)]
    (. builder authorizationStrategy data))
  (when-let [data (lookup-entry config id :fine-grained-authorization-enabled)]
    (. builder fineGrainedAuthorizationEnabled data))
  (when-let [data (lookup-entry config id :idp-lambda-arn)]
    (. builder idpLambdaArn data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (.build builder))


(defn cfn-fhir-datastore-identity-provider-configuration-property-builder
  ""
  [id config]
  (build-cfn-fhir-datastore-identity-provider-configuration-property-builder (new CfnFHIRDatastore$IdentityProviderConfigurationProperty$Builder) id config))


(defn build-cfn-fhir-datastore-kms-encryption-config-property-builder
  "The build-cfn-fhir-datastore-kms-encryption-config-property-builder function updates a CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmk-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cmk-type)]
    (. builder cmkType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-fhir-datastore-kms-encryption-config-property-builder
  ""
  [id config]
  (build-cfn-fhir-datastore-kms-encryption-config-property-builder (new CfnFHIRDatastore$KmsEncryptionConfigProperty$Builder) id config))


(defn build-cfn-fhir-datastore-preload-data-config-property-builder
  "The build-cfn-fhir-datastore-preload-data-config-property-builder function updates a CfnFHIRDatastore$PreloadDataConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastore$PreloadDataConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preloadDataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preload-data-type` |
"
  [^CfnFHIRDatastore$PreloadDataConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :preload-data-type)]
    (. builder preloadDataType data))
  (.build builder))


(defn cfn-fhir-datastore-preload-data-config-property-builder
  ""
  [id config]
  (build-cfn-fhir-datastore-preload-data-config-property-builder (new CfnFHIRDatastore$PreloadDataConfigProperty$Builder) id config))


(defn build-cfn-fhir-datastore-props-builder
  "The build-cfn-fhir-datastore-props-builder function updates a CfnFHIRDatastoreProps$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datastoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-name` |
| `datastoreTypeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:datastore-type-version` |
| `identityProviderConfiguration` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$IdentityProviderConfigurationProperty | [[cdk.support/lookup-entry]] | `:identity-provider-configuration` |
| `preloadDataConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preload-data-config` |
| `sseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFHIRDatastoreProps$Builder builder id config]
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
  (.build builder))


(defn cfn-fhir-datastore-props-builder
  ""
  [id config]
  (build-cfn-fhir-datastore-props-builder (new CfnFHIRDatastoreProps$Builder) id config))


(defn build-cfn-fhir-datastore-sse-configuration-property-builder
  "The build-cfn-fhir-datastore-sse-configuration-property-builder function updates a CfnFHIRDatastore$SseConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFHIRDatastore$SseConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsEncryptionConfig` | software.amazon.awscdk.services.healthlake.CfnFHIRDatastore$KmsEncryptionConfigProperty | [[cdk.support/lookup-entry]] | `:kms-encryption-config` |
"
  [^CfnFHIRDatastore$SseConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-encryption-config)]
    (. builder kmsEncryptionConfig data))
  (.build builder))


(defn cfn-fhir-datastore-sse-configuration-property-builder
  ""
  [id config]
  (build-cfn-fhir-datastore-sse-configuration-property-builder (new CfnFHIRDatastore$SseConfigurationProperty$Builder) id config))