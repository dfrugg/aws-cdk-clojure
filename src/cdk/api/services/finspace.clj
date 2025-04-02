(ns cdk.api.services.finspace
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.finspace package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.finspace CfnEnvironment$AttributeMapItemsProperty$Builder
                                                     CfnEnvironment$Builder
                                                     CfnEnvironment$FederationParametersProperty$Builder
                                                     CfnEnvironment$SuperuserParametersProperty$Builder
                                                     CfnEnvironmentProps$Builder]))


(defn cfn-environment-attribute-map-items-property-builder>
  "The cfn-environment-attribute-map-items-property-builder> function updates a CfnEnvironment$AttributeMapItemsProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$AttributeMapItemsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEnvironment$AttributeMapItemsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-environment-attribute-map-items-property-builder
  "Creates a  `CfnEnvironment$AttributeMapItemsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-attribute-map-items-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-attribute-map-items-property-builder> (new CfnEnvironment$AttributeMapItemsProperty$Builder) id config))


(defn cfn-environment-builder>
  "The cfn-environment-builder> function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataBundles` | java.util.List | [[cdk.support/lookup-entry]] | `:data-bundles` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `federationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:federation-mode` |
| `federationParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federation-parameters` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `superuserParameters` | software.amazon.awscdk.services.finspace.CfnEnvironment$SuperuserParametersProperty | [[cdk.support/lookup-entry]] | `:superuser-parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :data-bundles)]
    (. builder dataBundles data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :federation-mode)]
    (. builder federationMode data))
  (when-some [data (lookup-entry config id :federation-parameters)]
    (. builder federationParameters data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :superuser-parameters)]
    (. builder superuserParameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-builder
  "Creates a  `CfnEnvironment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-environment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-environment-builder> (CfnEnvironment$Builder/create scope (name id)) id config))


(defn cfn-environment-federation-parameters-property-builder>
  "The cfn-environment-federation-parameters-property-builder> function updates a CfnEnvironment$FederationParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$FederationParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationCallBackUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-call-back-url` |
| `attributeMap` | java.util.List | [[cdk.support/lookup-entry]] | `:attribute-map` |
| `federationProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:federation-provider-name` |
| `federationUrn` | java.lang.String | [[cdk.support/lookup-entry]] | `:federation-urn` |
| `samlMetadataDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-metadata-document` |
| `samlMetadataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-metadata-url` |
"
  [^CfnEnvironment$FederationParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-call-back-url)]
    (. builder applicationCallBackUrl data))
  (when-some [data (lookup-entry config id :attribute-map)]
    (. builder attributeMap data))
  (when-some [data (lookup-entry config id :federation-provider-name)]
    (. builder federationProviderName data))
  (when-some [data (lookup-entry config id :federation-urn)]
    (. builder federationUrn data))
  (when-some [data (lookup-entry config id :saml-metadata-document)]
    (. builder samlMetadataDocument data))
  (when-some [data (lookup-entry config id :saml-metadata-url)]
    (. builder samlMetadataUrl data))
  (.build builder))


(defn cfn-environment-federation-parameters-property-builder
  "Creates a  `CfnEnvironment$FederationParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-federation-parameters-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-federation-parameters-property-builder> (new CfnEnvironment$FederationParametersProperty$Builder) id config))


(defn cfn-environment-props-builder>
  "The cfn-environment-props-builder> function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataBundles` | java.util.List | [[cdk.support/lookup-entry]] | `:data-bundles` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `federationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:federation-mode` |
| `federationParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federation-parameters` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `superuserParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:superuser-parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-bundles)]
    (. builder dataBundles data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :federation-mode)]
    (. builder federationMode data))
  (when-some [data (lookup-entry config id :federation-parameters)]
    (. builder federationParameters data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :superuser-parameters)]
    (. builder superuserParameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-props-builder
  "Creates a  `CfnEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-props-builder> (new CfnEnvironmentProps$Builder) id config))


(defn cfn-environment-superuser-parameters-property-builder>
  "The cfn-environment-superuser-parameters-property-builder> function updates a CfnEnvironment$SuperuserParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$SuperuserParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-address` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
"
  [^CfnEnvironment$SuperuserParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :email-address)]
    (. builder emailAddress data))
  (when-some [data (lookup-entry config id :first-name)]
    (. builder firstName data))
  (when-some [data (lookup-entry config id :last-name)]
    (. builder lastName data))
  (.build builder))


(defn cfn-environment-superuser-parameters-property-builder
  "Creates a  `CfnEnvironment$SuperuserParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-superuser-parameters-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-superuser-parameters-property-builder> (new CfnEnvironment$SuperuserParametersProperty$Builder) id config))