(ns cdk.api.services.voiceid
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.voiceid package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.voiceid CfnDomain$Builder
                                                    CfnDomain$ServerSideEncryptionConfigurationProperty$Builder
                                                    CfnDomainProps$Builder]))


(defn build-cfn-domain-builder
  "The build-cfn-domain-builder function updates a CfnDomain$Builder instance using the provided configuration.
  The function takes the CfnDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomain$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-domain-builder
  "Creates a  `CfnDomain$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-builder (CfnDomain$Builder/create scope (name id)) id config))


(defn build-cfn-domain-props-builder
  "The build-cfn-domain-props-builder function updates a CfnDomainProps$Builder instance using the provided configuration.
  The function takes the CfnDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.voiceid.CfnDomain$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-domain-props-builder
  "Creates a  `CfnDomainProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-domain-props-builder (new CfnDomainProps$Builder) id config))


(defn build-cfn-domain-server-side-encryption-configuration-property-builder
  "The build-cfn-domain-server-side-encryption-configuration-property-builder function updates a CfnDomain$ServerSideEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ServerSideEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnDomain$ServerSideEncryptionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-domain-server-side-encryption-configuration-property-builder
  "Creates a  `CfnDomain$ServerSideEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-domain-server-side-encryption-configuration-property-builder (new CfnDomain$ServerSideEncryptionConfigurationProperty$Builder) id config))