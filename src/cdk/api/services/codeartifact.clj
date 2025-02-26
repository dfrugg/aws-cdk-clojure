(ns cdk.api.services.codeartifact
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codeartifact package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codeartifact CfnDomain$Builder
                                                         CfnDomainProps$Builder
                                                         CfnPackageGroup$Builder
                                                         CfnPackageGroup$OriginConfigurationProperty$Builder
                                                         CfnPackageGroup$RestrictionTypeProperty$Builder
                                                         CfnPackageGroup$RestrictionsProperty$Builder
                                                         CfnPackageGroupProps$Builder
                                                         CfnRepository$Builder
                                                         CfnRepositoryProps$Builder]))


(defn build-cfn-domain-builder
  "The build-cfn-domain-builder function updates a CfnDomain$Builder instance using the provided configuration.
  The function takes the CfnDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomain$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :permissions-policy-document)]
    (. builder permissionsPolicyDocument data))
  (when-some [data (lookup-entry config id :tags)]
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
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :permissions-policy-document)]
    (. builder permissionsPolicyDocument data))
  (when-some [data (lookup-entry config id :tags)]
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


(defn build-cfn-package-group-builder
  "The build-cfn-package-group-builder function updates a CfnPackageGroup$Builder instance using the provided configuration.
  The function takes the CfnPackageGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-info` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `originConfiguration` | software.amazon.awscdk.services.codeartifact.CfnPackageGroup$OriginConfigurationProperty | [[cdk.support/lookup-entry]] | `:origin-configuration` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackageGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-info)]
    (. builder contactInfo data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-owner)]
    (. builder domainOwner data))
  (when-some [data (lookup-entry config id :origin-configuration)]
    (. builder originConfiguration data))
  (when-some [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-package-group-builder
  "Creates a  `CfnPackageGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-package-group-builder (CfnPackageGroup$Builder/create scope (name id)) id config))


(defn build-cfn-package-group-origin-configuration-property-builder
  "The build-cfn-package-group-origin-configuration-property-builder function updates a CfnPackageGroup$OriginConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPackageGroup$OriginConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restrictions` | software.amazon.awscdk.services.codeartifact.CfnPackageGroup$RestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |
"
  [^CfnPackageGroup$OriginConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :restrictions)]
    (. builder restrictions data))
  (.build builder))


(defn cfn-package-group-origin-configuration-property-builder
  "Creates a  `CfnPackageGroup$OriginConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-package-group-origin-configuration-property-builder (new CfnPackageGroup$OriginConfigurationProperty$Builder) id config))


(defn build-cfn-package-group-props-builder
  "The build-cfn-package-group-props-builder function updates a CfnPackageGroupProps$Builder instance using the provided configuration.
  The function takes the CfnPackageGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-info` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `originConfiguration` | software.amazon.awscdk.services.codeartifact.CfnPackageGroup$OriginConfigurationProperty | [[cdk.support/lookup-entry]] | `:origin-configuration` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackageGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-info)]
    (. builder contactInfo data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-owner)]
    (. builder domainOwner data))
  (when-some [data (lookup-entry config id :origin-configuration)]
    (. builder originConfiguration data))
  (when-some [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-package-group-props-builder
  "Creates a  `CfnPackageGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-package-group-props-builder (new CfnPackageGroupProps$Builder) id config))


(defn build-cfn-package-group-restriction-type-property-builder
  "The build-cfn-package-group-restriction-type-property-builder function updates a CfnPackageGroup$RestrictionTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnPackageGroup$RestrictionTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositories` | java.util.List | [[cdk.support/lookup-entry]] | `:repositories` |
| `restrictionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:restriction-mode` |
"
  [^CfnPackageGroup$RestrictionTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :repositories)]
    (. builder repositories data))
  (when-some [data (lookup-entry config id :restriction-mode)]
    (. builder restrictionMode data))
  (.build builder))


(defn cfn-package-group-restriction-type-property-builder
  "Creates a  `CfnPackageGroup$RestrictionTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-package-group-restriction-type-property-builder (new CfnPackageGroup$RestrictionTypeProperty$Builder) id config))


(defn build-cfn-package-group-restrictions-property-builder
  "The build-cfn-package-group-restrictions-property-builder function updates a CfnPackageGroup$RestrictionsProperty$Builder instance using the provided configuration.
  The function takes the CfnPackageGroup$RestrictionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalUpstream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:external-upstream` |
| `internalUpstream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:internal-upstream` |
| `publish` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publish` |
"
  [^CfnPackageGroup$RestrictionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :external-upstream)]
    (. builder externalUpstream data))
  (when-some [data (lookup-entry config id :internal-upstream)]
    (. builder internalUpstream data))
  (when-some [data (lookup-entry config id :publish)]
    (. builder publish data))
  (.build builder))


(defn cfn-package-group-restrictions-property-builder
  "Creates a  `CfnPackageGroup$RestrictionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-package-group-restrictions-property-builder (new CfnPackageGroup$RestrictionsProperty$Builder) id config))


(defn build-cfn-repository-builder
  "The build-cfn-repository-builder function updates a CfnRepository$Builder instance using the provided configuration.
  The function takes the CfnRepository$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `externalConnections` | java.util.List | [[cdk.support/lookup-entry]] | `:external-connections` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `upstreams` | java.util.List | [[cdk.support/lookup-entry]] | `:upstreams` |
"
  [^CfnRepository$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-owner)]
    (. builder domainOwner data))
  (when-some [data (lookup-entry config id :external-connections)]
    (. builder externalConnections data))
  (when-some [data (lookup-entry config id :permissions-policy-document)]
    (. builder permissionsPolicyDocument data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :upstreams)]
    (. builder upstreams data))
  (.build builder))


(defn cfn-repository-builder
  "Creates a  `CfnRepository$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-repository-builder (CfnRepository$Builder/create scope (name id)) id config))


(defn build-cfn-repository-props-builder
  "The build-cfn-repository-props-builder function updates a CfnRepositoryProps$Builder instance using the provided configuration.
  The function takes the CfnRepositoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `externalConnections` | java.util.List | [[cdk.support/lookup-entry]] | `:external-connections` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `upstreams` | java.util.List | [[cdk.support/lookup-entry]] | `:upstreams` |
"
  [^CfnRepositoryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-owner)]
    (. builder domainOwner data))
  (when-some [data (lookup-entry config id :external-connections)]
    (. builder externalConnections data))
  (when-some [data (lookup-entry config id :permissions-policy-document)]
    (. builder permissionsPolicyDocument data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :upstreams)]
    (. builder upstreams data))
  (.build builder))


(defn cfn-repository-props-builder
  "Creates a  `CfnRepositoryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-repository-props-builder (new CfnRepositoryProps$Builder) id config))