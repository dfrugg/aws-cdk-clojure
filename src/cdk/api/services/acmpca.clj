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


(defn build-cfn-certificate-api-passthrough-property-builder
  "The build-cfn-certificate-api-passthrough-property-builder function updates a CfnCertificate$ApiPassthroughProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$ApiPassthroughProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensions` | software.amazon.awscdk.services.acmpca.CfnCertificate$ExtensionsProperty | [[cdk.support/lookup-entry]] | `:extensions` |
| `subject` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject` |
"
  [^CfnCertificate$ApiPassthroughProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :extensions)]
    (. builder extensions data))
  (when-let [data (lookup-entry config id :subject)]
    (. builder subject data))
  (.build builder))


(defn build-cfn-certificate-authority-access-description-property-builder
  "The build-cfn-certificate-authority-access-description-property-builder function updates a CfnCertificateAuthority$AccessDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$AccessDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLocation` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$GeneralNameProperty | [[cdk.support/lookup-entry]] | `:access-location` |
| `accessMethod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-method` |
"
  [^CfnCertificateAuthority$AccessDescriptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-location)]
    (. builder accessLocation data))
  (when-let [data (lookup-entry config id :access-method)]
    (. builder accessMethod data))
  (.build builder))


(defn build-cfn-certificate-authority-access-method-property-builder
  "The build-cfn-certificate-authority-access-method-property-builder function updates a CfnCertificateAuthority$AccessMethodProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$AccessMethodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessMethodType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-method-type` |
| `customObjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-object-identifier` |
"
  [^CfnCertificateAuthority$AccessMethodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-method-type)]
    (. builder accessMethodType data))
  (when-let [data (lookup-entry config id :custom-object-identifier)]
    (. builder customObjectIdentifier data))
  (.build builder))


(defn build-cfn-certificate-authority-activation-builder
  "The build-cfn-certificate-authority-activation-builder function updates a CfnCertificateAuthorityActivation$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthorityActivation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnCertificateAuthorityActivation$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-let [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-certificate-authority-activation-props-builder
  "The build-cfn-certificate-authority-activation-props-builder function updates a CfnCertificateAuthorityActivationProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthorityActivationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnCertificateAuthorityActivationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-let [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-certificate-authority-builder
  "The build-cfn-certificate-authority-builder function updates a CfnCertificateAuthority$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `usageMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-mode` |
"
  [^CfnCertificateAuthority$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-authority-crl-configuration-property-builder
  "The build-cfn-certificate-authority-crl-configuration-property-builder function updates a CfnCertificateAuthority$CrlConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$CrlConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlDistributionPointExtensionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crl-distribution-point-extension-configuration` |
| `customCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-cname` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `expirationInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-in-days` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3ObjectAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-acl` |
"
  [^CfnCertificateAuthority$CrlConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-authority-crl-distribution-point-extension-configuration-property-builder
  "The build-cfn-certificate-authority-crl-distribution-point-extension-configuration-property-builder function updates a CfnCertificateAuthority$CrlDistributionPointExtensionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$CrlDistributionPointExtensionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `omitExtension` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:omit-extension` |
"
  [^CfnCertificateAuthority$CrlDistributionPointExtensionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :omit-extension)]
    (. builder omitExtension data))
  (.build builder))


(defn build-cfn-certificate-authority-csr-extensions-property-builder
  "The build-cfn-certificate-authority-csr-extensions-property-builder function updates a CfnCertificateAuthority$CsrExtensionsProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$CsrExtensionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyUsage` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$KeyUsageProperty | [[cdk.support/lookup-entry]] | `:key-usage` |
| `subjectInformationAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-information-access` |
"
  [^CfnCertificateAuthority$CsrExtensionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (when-let [data (lookup-entry config id :subject-information-access)]
    (. builder subjectInformationAccess data))
  (.build builder))


(defn build-cfn-certificate-authority-custom-attribute-property-builder
  "The build-cfn-certificate-authority-custom-attribute-property-builder function updates a CfnCertificateAuthority$CustomAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$CustomAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-identifier` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCertificateAuthority$CustomAttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :object-identifier)]
    (. builder objectIdentifier data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-certificate-authority-edi-party-name-property-builder
  "The build-cfn-certificate-authority-edi-party-name-property-builder function updates a CfnCertificateAuthority$EdiPartyNameProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$EdiPartyNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nameAssigner` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-assigner` |
| `partyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:party-name` |
"
  [^CfnCertificateAuthority$EdiPartyNameProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name-assigner)]
    (. builder nameAssigner data))
  (when-let [data (lookup-entry config id :party-name)]
    (. builder partyName data))
  (.build builder))


(defn build-cfn-certificate-authority-general-name-property-builder
  "The build-cfn-certificate-authority-general-name-property-builder function updates a CfnCertificateAuthority$GeneralNameProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$GeneralNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$SubjectProperty | [[cdk.support/lookup-entry]] | `:directory-name` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `ediPartyName` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$EdiPartyNameProperty | [[cdk.support/lookup-entry]] | `:edi-party-name` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `otherName` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$OtherNameProperty | [[cdk.support/lookup-entry]] | `:other-name` |
| `registeredId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registered-id` |
| `rfc822Name` | java.lang.String | [[cdk.support/lookup-entry]] | `:rfc822-name` |
| `uniformResourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:uniform-resource-identifier` |
"
  [^CfnCertificateAuthority$GeneralNameProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-authority-key-usage-property-builder
  "The build-cfn-certificate-authority-key-usage-property-builder function updates a CfnCertificateAuthority$KeyUsageProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$KeyUsageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `nonRepudiation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:non-repudiation` |
"
  [^CfnCertificateAuthority$KeyUsageProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-authority-ocsp-configuration-property-builder
  "The build-cfn-certificate-authority-ocsp-configuration-property-builder function updates a CfnCertificateAuthority$OcspConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$OcspConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `ocspCustomCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:ocsp-custom-cname` |
"
  [^CfnCertificateAuthority$OcspConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :ocsp-custom-cname)]
    (. builder ocspCustomCname data))
  (.build builder))


(defn build-cfn-certificate-authority-other-name-property-builder
  "The build-cfn-certificate-authority-other-name-property-builder function updates a CfnCertificateAuthority$OtherNameProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$OtherNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCertificateAuthority$OtherNameProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type-id)]
    (. builder typeId data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-certificate-authority-props-builder
  "The build-cfn-certificate-authority-props-builder function updates a CfnCertificateAuthorityProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthorityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `usageMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-mode` |
"
  [^CfnCertificateAuthorityProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-authority-revocation-configuration-property-builder
  "The build-cfn-certificate-authority-revocation-configuration-property-builder function updates a CfnCertificateAuthority$RevocationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$RevocationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crlConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:crl-configuration` |
| `ocspConfiguration` | software.amazon.awscdk.services.acmpca.CfnCertificateAuthority$OcspConfigurationProperty | [[cdk.support/lookup-entry]] | `:ocsp-configuration` |
"
  [^CfnCertificateAuthority$RevocationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :crl-configuration)]
    (. builder crlConfiguration data))
  (when-let [data (lookup-entry config id :ocsp-configuration)]
    (. builder ocspConfiguration data))
  (.build builder))


(defn build-cfn-certificate-authority-subject-property-builder
  "The build-cfn-certificate-authority-subject-property-builder function updates a CfnCertificateAuthority$SubjectProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificateAuthority$SubjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnCertificateAuthority$SubjectProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-builder
  "The build-cfn-certificate-builder function updates a CfnCertificate$Builder instance using the provided configuration.
  The function takes the CfnCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiPassthrough` | software.amazon.awscdk.services.acmpca.CfnCertificate$ApiPassthroughProperty | [[cdk.support/lookup-entry]] | `:api-passthrough` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |
| `validity` | software.amazon.awscdk.services.acmpca.CfnCertificate$ValidityProperty | [[cdk.support/lookup-entry]] | `:validity` |
| `validityNotBefore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validity-not-before` |
"
  [^CfnCertificate$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-custom-attribute-property-builder
  "The build-cfn-certificate-custom-attribute-property-builder function updates a CfnCertificate$CustomAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$CustomAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-identifier` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCertificate$CustomAttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :object-identifier)]
    (. builder objectIdentifier data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-certificate-custom-extension-property-builder
  "The build-cfn-certificate-custom-extension-property-builder function updates a CfnCertificate$CustomExtensionProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$CustomExtensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `critical` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:critical` |
| `objectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-identifier` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCertificate$CustomExtensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :critical)]
    (. builder critical data))
  (when-let [data (lookup-entry config id :object-identifier)]
    (. builder objectIdentifier data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-certificate-edi-party-name-property-builder
  "The build-cfn-certificate-edi-party-name-property-builder function updates a CfnCertificate$EdiPartyNameProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$EdiPartyNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nameAssigner` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-assigner` |
| `partyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:party-name` |
"
  [^CfnCertificate$EdiPartyNameProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name-assigner)]
    (. builder nameAssigner data))
  (when-let [data (lookup-entry config id :party-name)]
    (. builder partyName data))
  (.build builder))


(defn build-cfn-certificate-extended-key-usage-property-builder
  "The build-cfn-certificate-extended-key-usage-property-builder function updates a CfnCertificate$ExtendedKeyUsageProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$ExtendedKeyUsageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extendedKeyUsageObjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:extended-key-usage-object-identifier` |
| `extendedKeyUsageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:extended-key-usage-type` |
"
  [^CfnCertificate$ExtendedKeyUsageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :extended-key-usage-object-identifier)]
    (. builder extendedKeyUsageObjectIdentifier data))
  (when-let [data (lookup-entry config id :extended-key-usage-type)]
    (. builder extendedKeyUsageType data))
  (.build builder))


(defn build-cfn-certificate-extensions-property-builder
  "The build-cfn-certificate-extensions-property-builder function updates a CfnCertificate$ExtensionsProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$ExtensionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificatePolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-policies` |
| `customExtensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-extensions` |
| `extendedKeyUsage` | java.util.List | [[cdk.support/lookup-entry]] | `:extended-key-usage` |
| `keyUsage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-usage` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
"
  [^CfnCertificate$ExtensionsProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-general-name-property-builder
  "The build-cfn-certificate-general-name-property-builder function updates a CfnCertificate$GeneralNameProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$GeneralNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:directory-name` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `ediPartyName` | software.amazon.awscdk.services.acmpca.CfnCertificate$EdiPartyNameProperty | [[cdk.support/lookup-entry]] | `:edi-party-name` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `otherName` | software.amazon.awscdk.services.acmpca.CfnCertificate$OtherNameProperty | [[cdk.support/lookup-entry]] | `:other-name` |
| `registeredId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registered-id` |
| `rfc822Name` | java.lang.String | [[cdk.support/lookup-entry]] | `:rfc822-name` |
| `uniformResourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:uniform-resource-identifier` |
"
  [^CfnCertificate$GeneralNameProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-key-usage-property-builder
  "The build-cfn-certificate-key-usage-property-builder function updates a CfnCertificate$KeyUsageProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$KeyUsageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `nonRepudiation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:non-repudiation` |
"
  [^CfnCertificate$KeyUsageProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-other-name-property-builder
  "The build-cfn-certificate-other-name-property-builder function updates a CfnCertificate$OtherNameProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$OtherNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-id` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCertificate$OtherNameProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type-id)]
    (. builder typeId data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-certificate-policy-information-property-builder
  "The build-cfn-certificate-policy-information-property-builder function updates a CfnCertificate$PolicyInformationProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$PolicyInformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cert-policy-id` |
| `policyQualifiers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-qualifiers` |
"
  [^CfnCertificate$PolicyInformationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cert-policy-id)]
    (. builder certPolicyId data))
  (when-let [data (lookup-entry config id :policy-qualifiers)]
    (. builder policyQualifiers data))
  (.build builder))


(defn build-cfn-certificate-policy-qualifier-info-property-builder
  "The build-cfn-certificate-policy-qualifier-info-property-builder function updates a CfnCertificate$PolicyQualifierInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$PolicyQualifierInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyQualifierId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-qualifier-id` |
| `qualifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:qualifier` |
"
  [^CfnCertificate$PolicyQualifierInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-qualifier-id)]
    (. builder policyQualifierId data))
  (when-let [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (.build builder))


(defn build-cfn-certificate-props-builder
  "The build-cfn-certificate-props-builder function updates a CfnCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiPassthrough` | software.amazon.awscdk.services.acmpca.CfnCertificate$ApiPassthroughProperty | [[cdk.support/lookup-entry]] | `:api-passthrough` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |
| `validity` | software.amazon.awscdk.services.acmpca.CfnCertificate$ValidityProperty | [[cdk.support/lookup-entry]] | `:validity` |
| `validityNotBefore` | software.amazon.awscdk.services.acmpca.CfnCertificate$ValidityProperty | [[cdk.support/lookup-entry]] | `:validity-not-before` |
"
  [^CfnCertificateProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-qualifier-property-builder
  "The build-cfn-certificate-qualifier-property-builder function updates a CfnCertificate$QualifierProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$QualifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpsUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:cps-uri` |
"
  [^CfnCertificate$QualifierProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cps-uri)]
    (. builder cpsUri data))
  (.build builder))


(defn build-cfn-certificate-subject-property-builder
  "The build-cfn-certificate-subject-property-builder function updates a CfnCertificate$SubjectProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$SubjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnCertificate$SubjectProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-certificate-validity-property-builder
  "The build-cfn-certificate-validity-property-builder function updates a CfnCertificate$ValidityProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$ValidityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCertificate$ValidityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-permission-builder
  "The build-cfn-permission-builder function updates a CfnPermission$Builder instance using the provided configuration.
  The function takes the CfnPermission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
"
  [^CfnPermission$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :source-account)]
    (. builder sourceAccount data))
  (.build builder))


(defn build-cfn-permission-props-builder
  "The build-cfn-permission-props-builder function updates a CfnPermissionProps$Builder instance using the provided configuration.
  The function takes the CfnPermissionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `sourceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-account` |
"
  [^CfnPermissionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :source-account)]
    (. builder sourceAccount data))
  (.build builder))