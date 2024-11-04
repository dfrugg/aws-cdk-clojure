(ns cdk.api.services.acmpca
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.acmpca package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.acmpca CfnCertificate$ApiPassthroughProperty$Builder
                                                   CfnCertificate$Builder
                                                   CfnCertificate$CustomAttributeProperty$Builder
                                                   CfnCertificate$CustomExtensionProperty$Builder
                                                   CfnCertificate$EdiPartyNameProperty$Builder
                                                   CfnCertificate$ExtendedKeyUsageProperty$Builder
                                                   CfnCertificate$ExtensionsProperty$Builder
                                                   CfnCertificate$GeneralNameProperty$Builder
                                                   CfnCertificate$KeyUsageProperty$Builder
                                                   CfnCertificate$OtherNameProperty$Builder
                                                   CfnCertificate$PolicyInformationProperty$Builder
                                                   CfnCertificate$PolicyQualifierInfoProperty$Builder
                                                   CfnCertificate$QualifierProperty$Builder
                                                   CfnCertificate$SubjectProperty$Builder
                                                   CfnCertificate$ValidityProperty$Builder
                                                   CfnCertificateAuthority$AccessDescriptionProperty$Builder
                                                   CfnCertificateAuthority$AccessMethodProperty$Builder
                                                   CfnCertificateAuthority$Builder
                                                   CfnCertificateAuthority$CrlConfigurationProperty$Builder
                                                   CfnCertificateAuthority$CrlDistributionPointExtensionConfigurationProperty$Builder
                                                   CfnCertificateAuthority$CsrExtensionsProperty$Builder
                                                   CfnCertificateAuthority$CustomAttributeProperty$Builder
                                                   CfnCertificateAuthority$EdiPartyNameProperty$Builder
                                                   CfnCertificateAuthority$GeneralNameProperty$Builder
                                                   CfnCertificateAuthority$KeyUsageProperty$Builder
                                                   CfnCertificateAuthority$OcspConfigurationProperty$Builder
                                                   CfnCertificateAuthority$OtherNameProperty$Builder
                                                   CfnCertificateAuthority$RevocationConfigurationProperty$Builder
                                                   CfnCertificateAuthority$SubjectProperty$Builder
                                                   CfnCertificateAuthorityActivation$Builder
                                                   CfnCertificateAuthorityActivationProps$Builder
                                                   CfnCertificateAuthorityProps$Builder
                                                   CfnCertificateProps$Builder
                                                   CfnPermission$Builder
                                                   CfnPermissionProps$Builder]))


(defn cfn-certificate-api-passthrough-property-builder
  "The cfn-certificate-api-passthrough-property-builder function buildes out new instances of 
CfnCertificate$ApiPassthroughProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensions` | software.amazon.awscdk.services.acmpca.CfnCertificate$ExtensionsProperty | [[cdk.support/lookup-entry]] | `:extensions` |
| `subject` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject` |"
  [stack id config]
  (let [builder (CfnCertificate$ApiPassthroughProperty$Builder.)]
    (when-let [data (lookup-entry config id :extensions)]
      (. builder extensions data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (.build builder)))


(defn cfn-certificate-authority-access-description-property-builder
  "The cfn-certificate-authority-access-description-property-builder function buildes out new instances of 
CfnCertificateAuthority$AccessDescriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLocation` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$GeneralNameProperty | [[cdk.support/lookup-entry]] | `:access-location` |
| `accessMethod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-method` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$AccessDescriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-location)]
      (. builder accessLocation data))
    (when-let [data (lookup-entry config id :access-method)]
      (. builder accessMethod data))
    (.build builder)))


(defn cfn-certificate-authority-access-method-property-builder
  "The cfn-certificate-authority-access-method-property-builder function buildes out new instances of 
CfnCertificateAuthority$AccessMethodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessMethodType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-method-type` |
| `customObjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-object-identifier` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$AccessMethodProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-method-type)]
      (. builder accessMethodType data))
    (when-let [data (lookup-entry config id :custom-object-identifier)]
      (. builder customObjectIdentifier data))
    (.build builder)))


(defn cfn-certificate-authority-activation-builder
  "The cfn-certificate-authority-activation-builder function buildes out new instances of 
CfnCertificateAuthorityActivation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnCertificateAuthorityActivation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-certificate-authority-activation-props-builder
  "The cfn-certificate-authority-activation-props-builder function buildes out new instances of 
CfnCertificateAuthorityActivationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnCertificateAuthorityActivationProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-certificate-authority-builder
  "The cfn-certificate-authority-builder function buildes out new instances of 
CfnCertificateAuthority$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csrExtensions` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$CsrExtensionsProperty | [[cdk.support/lookup-entry]] | `:csr-extensions` |
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `keyStorageSecurityStandard` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-storage-security-standard` |
| `revocationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:revocation-configuration` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
| `subject` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$SubjectProperty | [[cdk.support/lookup-entry]] | `:subject` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `usageMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-mode` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$Builder/create stack id)]
    (when-let [data (lookup-entry config id :csr-extensions)]
      (. builder csrExtensions data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :key-storage-security-standard)]
      (. builder keyStorageSecurityStandard data))
    (when-let [data (lookup-entry config id :revocation-configuration)]
      (. builder revocationConfiguration data))
    (when-let [data (lookup-entry config id :signing-algorithm)]
      (. builder signingAlgorithm data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :usage-mode)]
      (. builder usageMode data))
    (.build builder)))


(defn cfn-certificate-authority-crl-configuration-property-builder
  "The cfn-certificate-authority-crl-configuration-property-builder function buildes out new instances of 
CfnCertificateAuthority$CrlConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlDistributionPointExtensionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crl-distribution-point-extension-configuration` |
| `customCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-cname` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `expirationInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-in-days` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3ObjectAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-acl` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$CrlConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :crl-distribution-point-extension-configuration)]
      (. builder crlDistributionPointExtensionConfiguration data))
    (when-let [data (lookup-entry config id :custom-cname)]
      (. builder customCname data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :expiration-in-days)]
      (. builder expirationInDays data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-object-acl)]
      (. builder s3ObjectAcl data))
    (.build builder)))


(defn cfn-certificate-authority-crl-distribution-point-extension-configuration-property-builder
  "The cfn-certificate-authority-crl-distribution-point-extension-configuration-property-builder function buildes out new instances of 
CfnCertificateAuthority$CrlDistributionPointExtensionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `omitExtension` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-extension` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$CrlDistributionPointExtensionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :omit-extension)]
      (. builder omitExtension data))
    (.build builder)))


(defn cfn-certificate-authority-csr-extensions-property-builder
  "The cfn-certificate-authority-csr-extensions-property-builder function buildes out new instances of 
CfnCertificateAuthority$CsrExtensionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyUsage` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$KeyUsageProperty | [[cdk.support/lookup-entry]] | `:key-usage` |
| `subjectInformationAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-information-access` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$CsrExtensionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-usage)]
      (. builder keyUsage data))
    (when-let [data (lookup-entry config id :subject-information-access)]
      (. builder subjectInformationAccess data))
    (.build builder)))


(defn cfn-certificate-authority-custom-attribute-property-builder
  "The cfn-certificate-authority-custom-attribute-property-builder function buildes out new instances of 
CfnCertificateAuthority$CustomAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-identifier` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$CustomAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :object-identifier)]
      (. builder objectIdentifier data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-certificate-authority-edi-party-name-property-builder
  "The cfn-certificate-authority-edi-party-name-property-builder function buildes out new instances of 
CfnCertificateAuthority$EdiPartyNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nameAssigner` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-assigner` |
| `partyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:party-name` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$EdiPartyNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :name-assigner)]
      (. builder nameAssigner data))
    (when-let [data (lookup-entry config id :party-name)]
      (. builder partyName data))
    (.build builder)))


(defn cfn-certificate-authority-general-name-property-builder
  "The cfn-certificate-authority-general-name-property-builder function buildes out new instances of 
CfnCertificateAuthority$GeneralNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$SubjectProperty | [[cdk.support/lookup-entry]] | `:directory-name` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `ediPartyName` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$EdiPartyNameProperty | [[cdk.support/lookup-entry]] | `:edi-party-name` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `otherName` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$OtherNameProperty | [[cdk.support/lookup-entry]] | `:other-name` |
| `registeredId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registered-id` |
| `rfc822Name` | java.lang.String | [[cdk.support/lookup-entry]] | `:rfc822-name` |
| `uniformResourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:uniform-resource-identifier` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$GeneralNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :edi-party-name)]
      (. builder ediPartyName data))
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (when-let [data (lookup-entry config id :other-name)]
      (. builder otherName data))
    (when-let [data (lookup-entry config id :registered-id)]
      (. builder registeredId data))
    (when-let [data (lookup-entry config id :rfc822-name)]
      (. builder rfc822Name data))
    (when-let [data (lookup-entry config id :uniform-resource-identifier)]
      (. builder uniformResourceIdentifier data))
    (.build builder)))


(defn cfn-certificate-authority-key-usage-property-builder
  "The cfn-certificate-authority-key-usage-property-builder function buildes out new instances of 
CfnCertificateAuthority$KeyUsageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlSign` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crl-sign` |
| `dataEncipherment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-encipherment` |
| `decipherOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:decipher-only` |
| `digitalSignature` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:digital-signature` |
| `encipherOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encipher-only` |
| `keyAgreement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-agreement` |
| `keyCertSign` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-cert-sign` |
| `keyEncipherment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-encipherment` |
| `nonRepudiation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:non-repudiation` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$KeyUsageProperty$Builder.)]
    (when-let [data (lookup-entry config id :crl-sign)]
      (. builder crlSign data))
    (when-let [data (lookup-entry config id :data-encipherment)]
      (. builder dataEncipherment data))
    (when-let [data (lookup-entry config id :decipher-only)]
      (. builder decipherOnly data))
    (when-let [data (lookup-entry config id :digital-signature)]
      (. builder digitalSignature data))
    (when-let [data (lookup-entry config id :encipher-only)]
      (. builder encipherOnly data))
    (when-let [data (lookup-entry config id :key-agreement)]
      (. builder keyAgreement data))
    (when-let [data (lookup-entry config id :key-cert-sign)]
      (. builder keyCertSign data))
    (when-let [data (lookup-entry config id :key-encipherment)]
      (. builder keyEncipherment data))
    (when-let [data (lookup-entry config id :non-repudiation)]
      (. builder nonRepudiation data))
    (.build builder)))


(defn cfn-certificate-authority-ocsp-configuration-property-builder
  "The cfn-certificate-authority-ocsp-configuration-property-builder function buildes out new instances of 
CfnCertificateAuthority$OcspConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `ocspCustomCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:ocsp-custom-cname` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$OcspConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :ocsp-custom-cname)]
      (. builder ocspCustomCname data))
    (.build builder)))


(defn cfn-certificate-authority-other-name-property-builder
  "The cfn-certificate-authority-other-name-property-builder function buildes out new instances of 
CfnCertificateAuthority$OtherNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$OtherNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :type-id)]
      (. builder typeId data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-certificate-authority-props-builder
  "The cfn-certificate-authority-props-builder function buildes out new instances of 
CfnCertificateAuthorityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csrExtensions` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$CsrExtensionsProperty | [[cdk.support/lookup-entry]] | `:csr-extensions` |
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `keyStorageSecurityStandard` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-storage-security-standard` |
| `revocationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:revocation-configuration` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
| `subject` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `usageMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-mode` |"
  [stack id config]
  (let [builder (CfnCertificateAuthorityProps$Builder.)]
    (when-let [data (lookup-entry config id :csr-extensions)]
      (. builder csrExtensions data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :key-storage-security-standard)]
      (. builder keyStorageSecurityStandard data))
    (when-let [data (lookup-entry config id :revocation-configuration)]
      (. builder revocationConfiguration data))
    (when-let [data (lookup-entry config id :signing-algorithm)]
      (. builder signingAlgorithm data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :usage-mode)]
      (. builder usageMode data))
    (.build builder)))


(defn cfn-certificate-authority-revocation-configuration-property-builder
  "The cfn-certificate-authority-revocation-configuration-property-builder function buildes out new instances of 
CfnCertificateAuthority$RevocationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crl-configuration` |
| `ocspConfiguration` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$OcspConfigurationProperty | [[cdk.support/lookup-entry]] | `:ocsp-configuration` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$RevocationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :crl-configuration)]
      (. builder crlConfiguration data))
    (when-let [data (lookup-entry config id :ocsp-configuration)]
      (. builder ocspConfiguration data))
    (.build builder)))


(defn cfn-certificate-authority-subject-property-builder
  "The cfn-certificate-authority-subject-property-builder function buildes out new instances of 
CfnCertificateAuthority$SubjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:common-name` |
| `country` | java.lang.String | [[cdk.support/lookup-entry]] | `:country` |
| `customAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `distinguishedNameQualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:distinguished-name-qualifier` |
| `generationQualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:generation-qualifier` |
| `givenName` | java.lang.String | [[cdk.support/lookup-entry]] | `:given-name` |
| `initials` | java.lang.String | [[cdk.support/lookup-entry]] | `:initials` |
| `locality` | java.lang.String | [[cdk.support/lookup-entry]] | `:locality` |
| `organization` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization` |
| `organizationalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit` |
| `pseudonym` | java.lang.String | [[cdk.support/lookup-entry]] | `:pseudonym` |
| `serialNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:serial-number` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `surname` | java.lang.String | [[cdk.support/lookup-entry]] | `:surname` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |"
  [stack id config]
  (let [builder (CfnCertificateAuthority$SubjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :common-name)]
      (. builder commonName data))
    (when-let [data (lookup-entry config id :country)]
      (. builder country data))
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :distinguished-name-qualifier)]
      (. builder distinguishedNameQualifier data))
    (when-let [data (lookup-entry config id :generation-qualifier)]
      (. builder generationQualifier data))
    (when-let [data (lookup-entry config id :given-name)]
      (. builder givenName data))
    (when-let [data (lookup-entry config id :initials)]
      (. builder initials data))
    (when-let [data (lookup-entry config id :locality)]
      (. builder locality data))
    (when-let [data (lookup-entry config id :organization)]
      (. builder organization data))
    (when-let [data (lookup-entry config id :organizational-unit)]
      (. builder organizationalUnit data))
    (when-let [data (lookup-entry config id :pseudonym)]
      (. builder pseudonym data))
    (when-let [data (lookup-entry config id :serial-number)]
      (. builder serialNumber data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :surname)]
      (. builder surname data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (.build builder)))


(defn cfn-certificate-builder
  "The cfn-certificate-builder function buildes out new instances of 
CfnCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiPassthrough` | software.amazon.awscdk.services.acmpca.CfnCertificate$ApiPassthroughProperty | [[cdk.support/lookup-entry]] | `:api-passthrough` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |
| `validity` | software.amazon.awscdk.services.acmpca.CfnCertificate$ValidityProperty | [[cdk.support/lookup-entry]] | `:validity` |
| `validityNotBefore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validity-not-before` |"
  [stack id config]
  (let [builder (CfnCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-passthrough)]
      (. builder apiPassthrough data))
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :certificate-signing-request)]
      (. builder certificateSigningRequest data))
    (when-let [data (lookup-entry config id :signing-algorithm)]
      (. builder signingAlgorithm data))
    (when-let [data (lookup-entry config id :template-arn)]
      (. builder templateArn data))
    (when-let [data (lookup-entry config id :validity)]
      (. builder validity data))
    (when-let [data (lookup-entry config id :validity-not-before)]
      (. builder validityNotBefore data))
    (.build builder)))


(defn cfn-certificate-custom-attribute-property-builder
  "The cfn-certificate-custom-attribute-property-builder function buildes out new instances of 
CfnCertificate$CustomAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-identifier` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCertificate$CustomAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :object-identifier)]
      (. builder objectIdentifier data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-certificate-custom-extension-property-builder
  "The cfn-certificate-custom-extension-property-builder function buildes out new instances of 
CfnCertificate$CustomExtensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `critical` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:critical` |
| `objectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-identifier` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCertificate$CustomExtensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :critical)]
      (. builder critical data))
    (when-let [data (lookup-entry config id :object-identifier)]
      (. builder objectIdentifier data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-certificate-edi-party-name-property-builder
  "The cfn-certificate-edi-party-name-property-builder function buildes out new instances of 
CfnCertificate$EdiPartyNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nameAssigner` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-assigner` |
| `partyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:party-name` |"
  [stack id config]
  (let [builder (CfnCertificate$EdiPartyNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :name-assigner)]
      (. builder nameAssigner data))
    (when-let [data (lookup-entry config id :party-name)]
      (. builder partyName data))
    (.build builder)))


(defn cfn-certificate-extended-key-usage-property-builder
  "The cfn-certificate-extended-key-usage-property-builder function buildes out new instances of 
CfnCertificate$ExtendedKeyUsageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extendedKeyUsageObjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:extended-key-usage-object-identifier` |
| `extendedKeyUsageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:extended-key-usage-type` |"
  [stack id config]
  (let [builder (CfnCertificate$ExtendedKeyUsageProperty$Builder.)]
    (when-let [data (lookup-entry config id :extended-key-usage-object-identifier)]
      (. builder extendedKeyUsageObjectIdentifier data))
    (when-let [data (lookup-entry config id :extended-key-usage-type)]
      (. builder extendedKeyUsageType data))
    (.build builder)))


(defn cfn-certificate-extensions-property-builder
  "The cfn-certificate-extensions-property-builder function buildes out new instances of 
CfnCertificate$ExtensionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificatePolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-policies` |
| `customExtensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-extensions` |
| `extendedKeyUsage` | java.util.List | [[cdk.support/lookup-entry]] | `:extended-key-usage` |
| `keyUsage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-usage` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |"
  [stack id config]
  (let [builder (CfnCertificate$ExtensionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-policies)]
      (. builder certificatePolicies data))
    (when-let [data (lookup-entry config id :custom-extensions)]
      (. builder customExtensions data))
    (when-let [data (lookup-entry config id :extended-key-usage)]
      (. builder extendedKeyUsage data))
    (when-let [data (lookup-entry config id :key-usage)]
      (. builder keyUsage data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (.build builder)))


(defn cfn-certificate-general-name-property-builder
  "The cfn-certificate-general-name-property-builder function buildes out new instances of 
CfnCertificate$GeneralNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:directory-name` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `ediPartyName` | software.amazon.awscdk.services.acmpca.CfnCertificate$EdiPartyNameProperty | [[cdk.support/lookup-entry]] | `:edi-party-name` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `otherName` | software.amazon.awscdk.services.acmpca.CfnCertificate$OtherNameProperty | [[cdk.support/lookup-entry]] | `:other-name` |
| `registeredId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registered-id` |
| `rfc822Name` | java.lang.String | [[cdk.support/lookup-entry]] | `:rfc822-name` |
| `uniformResourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:uniform-resource-identifier` |"
  [stack id config]
  (let [builder (CfnCertificate$GeneralNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :edi-party-name)]
      (. builder ediPartyName data))
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (when-let [data (lookup-entry config id :other-name)]
      (. builder otherName data))
    (when-let [data (lookup-entry config id :registered-id)]
      (. builder registeredId data))
    (when-let [data (lookup-entry config id :rfc822-name)]
      (. builder rfc822Name data))
    (when-let [data (lookup-entry config id :uniform-resource-identifier)]
      (. builder uniformResourceIdentifier data))
    (.build builder)))


(defn cfn-certificate-key-usage-property-builder
  "The cfn-certificate-key-usage-property-builder function buildes out new instances of 
CfnCertificate$KeyUsageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlSign` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:crl-sign` |
| `dataEncipherment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-encipherment` |
| `decipherOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:decipher-only` |
| `digitalSignature` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:digital-signature` |
| `encipherOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encipher-only` |
| `keyAgreement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-agreement` |
| `keyCertSign` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-cert-sign` |
| `keyEncipherment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-encipherment` |
| `nonRepudiation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:non-repudiation` |"
  [stack id config]
  (let [builder (CfnCertificate$KeyUsageProperty$Builder.)]
    (when-let [data (lookup-entry config id :crl-sign)]
      (. builder crlSign data))
    (when-let [data (lookup-entry config id :data-encipherment)]
      (. builder dataEncipherment data))
    (when-let [data (lookup-entry config id :decipher-only)]
      (. builder decipherOnly data))
    (when-let [data (lookup-entry config id :digital-signature)]
      (. builder digitalSignature data))
    (when-let [data (lookup-entry config id :encipher-only)]
      (. builder encipherOnly data))
    (when-let [data (lookup-entry config id :key-agreement)]
      (. builder keyAgreement data))
    (when-let [data (lookup-entry config id :key-cert-sign)]
      (. builder keyCertSign data))
    (when-let [data (lookup-entry config id :key-encipherment)]
      (. builder keyEncipherment data))
    (when-let [data (lookup-entry config id :non-repudiation)]
      (. builder nonRepudiation data))
    (.build builder)))


(defn cfn-certificate-other-name-property-builder
  "The cfn-certificate-other-name-property-builder function buildes out new instances of 
CfnCertificate$OtherNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCertificate$OtherNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :type-id)]
      (. builder typeId data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-certificate-policy-information-property-builder
  "The cfn-certificate-policy-information-property-builder function buildes out new instances of 
CfnCertificate$PolicyInformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cert-policy-id` |
| `policyQualifiers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-qualifiers` |"
  [stack id config]
  (let [builder (CfnCertificate$PolicyInformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cert-policy-id)]
      (. builder certPolicyId data))
    (when-let [data (lookup-entry config id :policy-qualifiers)]
      (. builder policyQualifiers data))
    (.build builder)))


(defn cfn-certificate-policy-qualifier-info-property-builder
  "The cfn-certificate-policy-qualifier-info-property-builder function buildes out new instances of 
CfnCertificate$PolicyQualifierInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyQualifierId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-qualifier-id` |
| `qualifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:qualifier` |"
  [stack id config]
  (let [builder (CfnCertificate$PolicyQualifierInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-qualifier-id)]
      (. builder policyQualifierId data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (.build builder)))


(defn cfn-certificate-props-builder
  "The cfn-certificate-props-builder function buildes out new instances of 
CfnCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiPassthrough` | software.amazon.awscdk.services.acmpca.CfnCertificate$ApiPassthroughProperty | [[cdk.support/lookup-entry]] | `:api-passthrough` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |
| `validity` | software.amazon.awscdk.services.acmpca.CfnCertificate$ValidityProperty | [[cdk.support/lookup-entry]] | `:validity` |
| `validityNotBefore` | software.amazon.awscdk.services.acmpca.CfnCertificate$ValidityProperty | [[cdk.support/lookup-entry]] | `:validity-not-before` |"
  [stack id config]
  (let [builder (CfnCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :api-passthrough)]
      (. builder apiPassthrough data))
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :certificate-signing-request)]
      (. builder certificateSigningRequest data))
    (when-let [data (lookup-entry config id :signing-algorithm)]
      (. builder signingAlgorithm data))
    (when-let [data (lookup-entry config id :template-arn)]
      (. builder templateArn data))
    (when-let [data (lookup-entry config id :validity)]
      (. builder validity data))
    (when-let [data (lookup-entry config id :validity-not-before)]
      (. builder validityNotBefore data))
    (.build builder)))


(defn cfn-certificate-qualifier-property-builder
  "The cfn-certificate-qualifier-property-builder function buildes out new instances of 
CfnCertificate$QualifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpsUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:cps-uri` |"
  [stack id config]
  (let [builder (CfnCertificate$QualifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :cps-uri)]
      (. builder cpsUri data))
    (.build builder)))


(defn cfn-certificate-subject-property-builder
  "The cfn-certificate-subject-property-builder function buildes out new instances of 
CfnCertificate$SubjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:common-name` |
| `country` | java.lang.String | [[cdk.support/lookup-entry]] | `:country` |
| `customAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `distinguishedNameQualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:distinguished-name-qualifier` |
| `generationQualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:generation-qualifier` |
| `givenName` | java.lang.String | [[cdk.support/lookup-entry]] | `:given-name` |
| `initials` | java.lang.String | [[cdk.support/lookup-entry]] | `:initials` |
| `locality` | java.lang.String | [[cdk.support/lookup-entry]] | `:locality` |
| `organization` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization` |
| `organizationalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit` |
| `pseudonym` | java.lang.String | [[cdk.support/lookup-entry]] | `:pseudonym` |
| `serialNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:serial-number` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `surname` | java.lang.String | [[cdk.support/lookup-entry]] | `:surname` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |"
  [stack id config]
  (let [builder (CfnCertificate$SubjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :common-name)]
      (. builder commonName data))
    (when-let [data (lookup-entry config id :country)]
      (. builder country data))
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :distinguished-name-qualifier)]
      (. builder distinguishedNameQualifier data))
    (when-let [data (lookup-entry config id :generation-qualifier)]
      (. builder generationQualifier data))
    (when-let [data (lookup-entry config id :given-name)]
      (. builder givenName data))
    (when-let [data (lookup-entry config id :initials)]
      (. builder initials data))
    (when-let [data (lookup-entry config id :locality)]
      (. builder locality data))
    (when-let [data (lookup-entry config id :organization)]
      (. builder organization data))
    (when-let [data (lookup-entry config id :organizational-unit)]
      (. builder organizationalUnit data))
    (when-let [data (lookup-entry config id :pseudonym)]
      (. builder pseudonym data))
    (when-let [data (lookup-entry config id :serial-number)]
      (. builder serialNumber data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :surname)]
      (. builder surname data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (.build builder)))


(defn cfn-certificate-validity-property-builder
  "The cfn-certificate-validity-property-builder function buildes out new instances of 
CfnCertificate$ValidityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCertificate$ValidityProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-permission-builder
  "The cfn-permission-builder function buildes out new instances of 
CfnPermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |"
  [stack id config]
  (let [builder (CfnPermission$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :source-account)]
      (. builder sourceAccount data))
    (.build builder)))


(defn cfn-permission-props-builder
  "The cfn-permission-props-builder function buildes out new instances of 
CfnPermissionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |"
  [stack id config]
  (let [builder (CfnPermissionProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :source-account)]
      (. builder sourceAccount data))
    (.build builder)))