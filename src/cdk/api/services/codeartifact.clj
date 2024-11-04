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


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :permissions-policy-document)]
      (. builder permissionsPolicyDocument data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `encryptionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :permissions-policy-document)]
      (. builder permissionsPolicyDocument data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-package-group-builder
  "The cfn-package-group-builder function buildes out new instances of 
CfnPackageGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-info` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `originConfiguration` | software.amazon.awscdk.services.codeartifact.CfnPackageGroup$OriginConfigurationProperty | [[cdk.support/lookup-entry]] | `:origin-configuration` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackageGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :contact-info)]
      (. builder contactInfo data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-owner)]
      (. builder domainOwner data))
    (when-let [data (lookup-entry config id :origin-configuration)]
      (. builder originConfiguration data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-package-group-origin-configuration-property-builder
  "The cfn-package-group-origin-configuration-property-builder function buildes out new instances of 
CfnPackageGroup$OriginConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `restrictions` | software.amazon.awscdk.services.codeartifact.CfnPackageGroup$RestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |"
  [stack id config]
  (let [builder (CfnPackageGroup$OriginConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :restrictions)]
      (. builder restrictions data))
    (.build builder)))


(defn cfn-package-group-props-builder
  "The cfn-package-group-props-builder function buildes out new instances of 
CfnPackageGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-info` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `originConfiguration` | software.amazon.awscdk.services.codeartifact.CfnPackageGroup$OriginConfigurationProperty | [[cdk.support/lookup-entry]] | `:origin-configuration` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackageGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :contact-info)]
      (. builder contactInfo data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-owner)]
      (. builder domainOwner data))
    (when-let [data (lookup-entry config id :origin-configuration)]
      (. builder originConfiguration data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-package-group-restriction-type-property-builder
  "The cfn-package-group-restriction-type-property-builder function buildes out new instances of 
CfnPackageGroup$RestrictionTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositories` | java.util.List | [[cdk.support/lookup-entry]] | `:repositories` |
| `restrictionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:restriction-mode` |"
  [stack id config]
  (let [builder (CfnPackageGroup$RestrictionTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :repositories)]
      (. builder repositories data))
    (when-let [data (lookup-entry config id :restriction-mode)]
      (. builder restrictionMode data))
    (.build builder)))


(defn cfn-package-group-restrictions-property-builder
  "The cfn-package-group-restrictions-property-builder function buildes out new instances of 
CfnPackageGroup$RestrictionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalUpstream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:external-upstream` |
| `internalUpstream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:internal-upstream` |
| `publish` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publish` |"
  [stack id config]
  (let [builder (CfnPackageGroup$RestrictionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :external-upstream)]
      (. builder externalUpstream data))
    (when-let [data (lookup-entry config id :internal-upstream)]
      (. builder internalUpstream data))
    (when-let [data (lookup-entry config id :publish)]
      (. builder publish data))
    (.build builder)))


(defn cfn-repository-builder
  "The cfn-repository-builder function buildes out new instances of 
CfnRepository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `externalConnections` | java.util.List | [[cdk.support/lookup-entry]] | `:external-connections` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `upstreams` | java.util.List | [[cdk.support/lookup-entry]] | `:upstreams` |"
  [stack id config]
  (let [builder (CfnRepository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-owner)]
      (. builder domainOwner data))
    (when-let [data (lookup-entry config id :external-connections)]
      (. builder externalConnections data))
    (when-let [data (lookup-entry config id :permissions-policy-document)]
      (. builder permissionsPolicyDocument data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :upstreams)]
      (. builder upstreams data))
    (.build builder)))


(defn cfn-repository-props-builder
  "The cfn-repository-props-builder function buildes out new instances of 
CfnRepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-owner` |
| `externalConnections` | java.util.List | [[cdk.support/lookup-entry]] | `:external-connections` |
| `permissionsPolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:permissions-policy-document` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `upstreams` | java.util.List | [[cdk.support/lookup-entry]] | `:upstreams` |"
  [stack id config]
  (let [builder (CfnRepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-owner)]
      (. builder domainOwner data))
    (when-let [data (lookup-entry config id :external-connections)]
      (. builder externalConnections data))
    (when-let [data (lookup-entry config id :permissions-policy-document)]
      (. builder permissionsPolicyDocument data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :upstreams)]
      (. builder upstreams data))
    (.build builder)))