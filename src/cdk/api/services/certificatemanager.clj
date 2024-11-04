(ns cdk.api.services.certificatemanager
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.certificatemanager package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.certificatemanager Certificate$Builder
                                                               CertificateProps$Builder
                                                               CertificationValidationProps$Builder
                                                               CfnAccount$Builder
                                                               CfnAccount$ExpiryEventsConfigurationProperty$Builder
                                                               CfnAccountProps$Builder
                                                               CfnCertificate$Builder
                                                               CfnCertificate$DomainValidationOptionProperty$Builder
                                                               CfnCertificateProps$Builder
                                                               DnsValidatedCertificateProps$Builder
                                                               PrivateCertificate$Builder
                                                               PrivateCertificateProps$Builder
                                                               ValidationMethod]))


(defn validation-method
  "The `validation-method` function data interprets values in the provided config data into a 
`ValidationMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ValidationMethod` - the value is returned.
* is `:email` - `ValidationMethod/EMAIL` is returned
* is `:dns` - `ValidationMethod/DNS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ValidationMethod data) data
      (= :email data) ValidationMethod/EMAIL
      (= :dns data) ValidationMethod/DNS)))


(defn certificate-builder
  "The certificate-builder function buildes out new instances of 
Certificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `transparencyLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transparency-logging-enabled` |
| `validation` | software.amazon.awscdk.services.certificatemanager.CertificateValidation | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (Certificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :transparency-logging-enabled)]
      (. builder transparencyLoggingEnabled data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn certificate-props-builder
  "The certificate-props-builder function buildes out new instances of 
CertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `transparencyLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transparency-logging-enabled` |
| `validation` | software.amazon.awscdk.services.certificatemanager.CertificateValidation | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (CertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :transparency-logging-enabled)]
      (. builder transparencyLoggingEnabled data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn certification-validation-props-builder
  "The certification-validation-props-builder function buildes out new instances of 
CertificationValidationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `hostedZones` | java.util.Map | [[cdk.support/lookup-entry]] | `:hosted-zones` |
| `method` | software.amazon.awscdk.services.certificatemanager.ValidationMethod | [[cdk.api.services.certificatemanager/validation-method]] | `:method` |
| `validationDomains` | java.util.Map | [[cdk.support/lookup-entry]] | `:validation-domains` |"
  [stack id config]
  (let [builder (CertificationValidationProps$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone)]
      (. builder hostedZone data))
    (when-let [data (lookup-entry config id :hosted-zones)]
      (. builder hostedZones data))
    (when-let [data (validation-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :validation-domains)]
      (. builder validationDomains data))
    (.build builder)))


(defn cfn-account-builder
  "The cfn-account-builder function buildes out new instances of 
CfnAccount$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiryEventsConfiguration` | software.amazon.awscdk.services.certificatemanager.CfnAccount$ExpiryEventsConfigurationProperty | [[cdk.support/lookup-entry]] | `:expiry-events-configuration` |"
  [stack id config]
  (let [builder (CfnAccount$Builder/create stack id)]
    (when-let [data (lookup-entry config id :expiry-events-configuration)]
      (. builder expiryEventsConfiguration data))
    (.build builder)))


(defn cfn-account-expiry-events-configuration-property-builder
  "The cfn-account-expiry-events-configuration-property-builder function buildes out new instances of 
CfnAccount$ExpiryEventsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysBeforeExpiry` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-before-expiry` |"
  [stack id config]
  (let [builder (CfnAccount$ExpiryEventsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :days-before-expiry)]
      (. builder daysBeforeExpiry data))
    (.build builder)))


(defn cfn-account-props-builder
  "The cfn-account-props-builder function buildes out new instances of 
CfnAccountProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiryEventsConfiguration` | software.amazon.awscdk.services.certificatemanager.CfnAccount$ExpiryEventsConfigurationProperty | [[cdk.support/lookup-entry]] | `:expiry-events-configuration` |"
  [stack id config]
  (let [builder (CfnAccountProps$Builder.)]
    (when-let [data (lookup-entry config id :expiry-events-configuration)]
      (. builder expiryEventsConfiguration data))
    (.build builder)))


(defn cfn-certificate-builder
  "The cfn-certificate-builder function buildes out new instances of 
CfnCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateTransparencyLoggingPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-transparency-logging-preference` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainValidationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-validation-options` |
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `validationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-method` |"
  [stack id config]
  (let [builder (CfnCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :certificate-transparency-logging-preference)]
      (. builder certificateTransparencyLoggingPreference data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-validation-options)]
      (. builder domainValidationOptions data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :validation-method)]
      (. builder validationMethod data))
    (.build builder)))


(defn cfn-certificate-domain-validation-option-property-builder
  "The cfn-certificate-domain-validation-option-property-builder function buildes out new instances of 
CfnCertificate$DomainValidationOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `validationDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-domain` |"
  [stack id config]
  (let [builder (CfnCertificate$DomainValidationOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :validation-domain)]
      (. builder validationDomain data))
    (.build builder)))


(defn cfn-certificate-props-builder
  "The cfn-certificate-props-builder function buildes out new instances of 
CfnCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateTransparencyLoggingPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-transparency-logging-preference` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainValidationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-validation-options` |
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `validationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-method` |"
  [stack id config]
  (let [builder (CfnCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :certificate-transparency-logging-preference)]
      (. builder certificateTransparencyLoggingPreference data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-validation-options)]
      (. builder domainValidationOptions data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :validation-method)]
      (. builder validationMethod data))
    (.build builder)))


(defn dns-validated-certificate-props-builder
  "The dns-validated-certificate-props-builder function buildes out new instances of 
DnsValidatedCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `cleanupRoute53Records` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cleanup-route53-records` |
| `customResourceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:custom-resource-role` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `route53Endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:route53-endpoint` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `transparencyLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transparency-logging-enabled` |
| `validation` | software.amazon.awscdk.services.certificatemanager.CertificateValidation | [[cdk.support/lookup-entry]] | `:validation` |"
  [stack id config]
  (let [builder (DnsValidatedCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :cleanup-route53-records)]
      (. builder cleanupRoute53Records data))
    (when-let [data (lookup-entry config id :custom-resource-role)]
      (. builder customResourceRole data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :hosted-zone)]
      (. builder hostedZone data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :route53-endpoint)]
      (. builder route53Endpoint data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :transparency-logging-enabled)]
      (. builder transparencyLoggingEnabled data))
    (when-let [data (lookup-entry config id :validation)]
      (. builder validation data))
    (.build builder)))


(defn private-certificate-builder
  "The private-certificate-builder function buildes out new instances of 
PrivateCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthority` | software.amazon.awscdk.services.acmpca.ICertificateAuthority | [[cdk.support/lookup-entry]] | `:certificate-authority` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |"
  [stack id config]
  (let [builder (PrivateCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-authority)]
      (. builder certificateAuthority data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (.build builder)))


(defn private-certificate-props-builder
  "The private-certificate-props-builder function buildes out new instances of 
PrivateCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthority` | software.amazon.awscdk.services.acmpca.ICertificateAuthority | [[cdk.support/lookup-entry]] | `:certificate-authority` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |"
  [stack id config]
  (let [builder (PrivateCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority)]
      (. builder certificateAuthority data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (.build builder)))