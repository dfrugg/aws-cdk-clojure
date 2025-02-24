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


(defn build-certificate-builder
  "The build-certificate-builder function updates a Certificate$Builder instance using the provided configuration.
  The function takes the Certificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `transparencyLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transparency-logging-enabled` |
| `validation` | software.amazon.awscdk.services.certificatemanager.CertificateValidation | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^Certificate$Builder builder id config]
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
  (.build builder))


(defn certificate-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-certificate-builder (Certificate$Builder/create scope (name id)) id config))


(defn build-certificate-props-builder
  "The build-certificate-props-builder function updates a CertificateProps$Builder instance using the provided configuration.
  The function takes the CertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `transparencyLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transparency-logging-enabled` |
| `validation` | software.amazon.awscdk.services.certificatemanager.CertificateValidation | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^CertificateProps$Builder builder id config]
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
  (.build builder))


(defn certificate-props-builder
  ""
  [id config]
  (build-certificate-props-builder (new CertificateProps$Builder) id config))


(defn build-certification-validation-props-builder
  "The build-certification-validation-props-builder function updates a CertificationValidationProps$Builder instance using the provided configuration.
  The function takes the CertificationValidationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `hostedZones` | java.util.Map | [[cdk.support/lookup-entry]] | `:hosted-zones` |
| `method` | software.amazon.awscdk.services.certificatemanager.ValidationMethod | [[cdk.api.services.certificatemanager/validation-method]] | `:method` |
| `validationDomains` | java.util.Map | [[cdk.support/lookup-entry]] | `:validation-domains` |
"
  [^CertificationValidationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone)]
    (. builder hostedZone data))
  (when-let [data (lookup-entry config id :hosted-zones)]
    (. builder hostedZones data))
  (when-let [data (validation-method config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :validation-domains)]
    (. builder validationDomains data))
  (.build builder))


(defn certification-validation-props-builder
  ""
  [id config]
  (build-certification-validation-props-builder (new CertificationValidationProps$Builder) id config))


(defn build-cfn-account-builder
  "The build-cfn-account-builder function updates a CfnAccount$Builder instance using the provided configuration.
  The function takes the CfnAccount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiryEventsConfiguration` | software.amazon.awscdk.services.certificatemanager.CfnAccount$ExpiryEventsConfigurationProperty | [[cdk.support/lookup-entry]] | `:expiry-events-configuration` |
"
  [^CfnAccount$Builder builder id config]
  (when-let [data (lookup-entry config id :expiry-events-configuration)]
    (. builder expiryEventsConfiguration data))
  (.build builder))


(defn cfn-account-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-account-builder (CfnAccount$Builder/create scope (name id)) id config))


(defn build-cfn-account-expiry-events-configuration-property-builder
  "The build-cfn-account-expiry-events-configuration-property-builder function updates a CfnAccount$ExpiryEventsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccount$ExpiryEventsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysBeforeExpiry` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-before-expiry` |
"
  [^CfnAccount$ExpiryEventsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :days-before-expiry)]
    (. builder daysBeforeExpiry data))
  (.build builder))


(defn cfn-account-expiry-events-configuration-property-builder
  ""
  [id config]
  (build-cfn-account-expiry-events-configuration-property-builder (new CfnAccount$ExpiryEventsConfigurationProperty$Builder) id config))


(defn build-cfn-account-props-builder
  "The build-cfn-account-props-builder function updates a CfnAccountProps$Builder instance using the provided configuration.
  The function takes the CfnAccountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiryEventsConfiguration` | software.amazon.awscdk.services.certificatemanager.CfnAccount$ExpiryEventsConfigurationProperty | [[cdk.support/lookup-entry]] | `:expiry-events-configuration` |
"
  [^CfnAccountProps$Builder builder id config]
  (when-let [data (lookup-entry config id :expiry-events-configuration)]
    (. builder expiryEventsConfiguration data))
  (.build builder))


(defn cfn-account-props-builder
  ""
  [id config]
  (build-cfn-account-props-builder (new CfnAccountProps$Builder) id config))


(defn build-cfn-certificate-builder
  "The build-cfn-certificate-builder function updates a CfnCertificate$Builder instance using the provided configuration.
  The function takes the CfnCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateTransparencyLoggingPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-transparency-logging-preference` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainValidationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-validation-options` |
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `validationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-method` |
"
  [^CfnCertificate$Builder builder id config]
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
  (.build builder))


(defn cfn-certificate-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-certificate-builder (CfnCertificate$Builder/create scope (name id)) id config))


(defn build-cfn-certificate-domain-validation-option-property-builder
  "The build-cfn-certificate-domain-validation-option-property-builder function updates a CfnCertificate$DomainValidationOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnCertificate$DomainValidationOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `validationDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-domain` |
"
  [^CfnCertificate$DomainValidationOptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :validation-domain)]
    (. builder validationDomain data))
  (.build builder))


(defn cfn-certificate-domain-validation-option-property-builder
  ""
  [id config]
  (build-cfn-certificate-domain-validation-option-property-builder (new CfnCertificate$DomainValidationOptionProperty$Builder) id config))


(defn build-cfn-certificate-props-builder
  "The build-cfn-certificate-props-builder function updates a CfnCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `certificateTransparencyLoggingPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-transparency-logging-preference` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainValidationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-validation-options` |
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `validationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-method` |
"
  [^CfnCertificateProps$Builder builder id config]
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
  (.build builder))


(defn cfn-certificate-props-builder
  ""
  [id config]
  (build-cfn-certificate-props-builder (new CfnCertificateProps$Builder) id config))


(defn build-dns-validated-certificate-props-builder
  "The build-dns-validated-certificate-props-builder function updates a DnsValidatedCertificateProps$Builder instance using the provided configuration.
  The function takes the DnsValidatedCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `validation` | software.amazon.awscdk.services.certificatemanager.CertificateValidation | [[cdk.support/lookup-entry]] | `:validation` |
"
  [^DnsValidatedCertificateProps$Builder builder id config]
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
  (.build builder))


(defn dns-validated-certificate-props-builder
  ""
  [id config]
  (build-dns-validated-certificate-props-builder (new DnsValidatedCertificateProps$Builder) id config))


(defn build-private-certificate-builder
  "The build-private-certificate-builder function updates a PrivateCertificate$Builder instance using the provided configuration.
  The function takes the PrivateCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthority` | software.amazon.awscdk.services.acmpca.ICertificateAuthority | [[cdk.support/lookup-entry]] | `:certificate-authority` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
"
  [^PrivateCertificate$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-authority)]
    (. builder certificateAuthority data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (.build builder))


(defn private-certificate-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-private-certificate-builder (PrivateCertificate$Builder/create scope (name id)) id config))


(defn build-private-certificate-props-builder
  "The build-private-certificate-props-builder function updates a PrivateCertificateProps$Builder instance using the provided configuration.
  The function takes the PrivateCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthority` | software.amazon.awscdk.services.acmpca.ICertificateAuthority | [[cdk.support/lookup-entry]] | `:certificate-authority` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `keyAlgorithm` | software.amazon.awscdk.services.certificatemanager.KeyAlgorithm | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
"
  [^PrivateCertificateProps$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-authority)]
    (. builder certificateAuthority data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-let [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (.build builder))


(defn private-certificate-props-builder
  ""
  [id config]
  (build-private-certificate-props-builder (new PrivateCertificateProps$Builder) id config))