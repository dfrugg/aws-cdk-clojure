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


(defn certificate-builder>
  "The certificate-builder> function updates a Certificate$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :transparency-logging-enabled)]
    (. builder transparencyLoggingEnabled data))
  (when-some [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn certificate-builder
  "Creates a  `Certificate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (certificate-builder> (Certificate$Builder/create scope (name id)) id config))


(defn certificate-props-builder>
  "The certificate-props-builder> function updates a CertificateProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :transparency-logging-enabled)]
    (. builder transparencyLoggingEnabled data))
  (when-some [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn certificate-props-builder
  "Creates a  `CertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (certificate-props-builder> (new CertificateProps$Builder) id config))


(defn certification-validation-props-builder>
  "The certification-validation-props-builder> function updates a CertificationValidationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :hosted-zone)]
    (. builder hostedZone data))
  (when-some [data (lookup-entry config id :hosted-zones)]
    (. builder hostedZones data))
  (when-some [data (validation-method config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :validation-domains)]
    (. builder validationDomains data))
  (.build builder))


(defn certification-validation-props-builder
  "Creates a  `CertificationValidationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (certification-validation-props-builder> (new CertificationValidationProps$Builder) id config))


(defn cfn-account-builder>
  "The cfn-account-builder> function updates a CfnAccount$Builder instance using the provided configuration.
  The function takes the CfnAccount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiryEventsConfiguration` | software.amazon.awscdk.services.certificatemanager.CfnAccount$ExpiryEventsConfigurationProperty | [[cdk.support/lookup-entry]] | `:expiry-events-configuration` |
"
  [^CfnAccount$Builder builder id config]
  (when-some [data (lookup-entry config id :expiry-events-configuration)]
    (. builder expiryEventsConfiguration data))
  (.build builder))


(defn cfn-account-builder
  "Creates a  `CfnAccount$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-account-builder> (CfnAccount$Builder/create scope (name id)) id config))


(defn cfn-account-expiry-events-configuration-property-builder>
  "The cfn-account-expiry-events-configuration-property-builder> function updates a CfnAccount$ExpiryEventsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccount$ExpiryEventsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysBeforeExpiry` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-before-expiry` |
"
  [^CfnAccount$ExpiryEventsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :days-before-expiry)]
    (. builder daysBeforeExpiry data))
  (.build builder))


(defn cfn-account-expiry-events-configuration-property-builder
  "Creates a  `CfnAccount$ExpiryEventsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-expiry-events-configuration-property-builder> (new CfnAccount$ExpiryEventsConfigurationProperty$Builder) id config))


(defn cfn-account-props-builder>
  "The cfn-account-props-builder> function updates a CfnAccountProps$Builder instance using the provided configuration.
  The function takes the CfnAccountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiryEventsConfiguration` | software.amazon.awscdk.services.certificatemanager.CfnAccount$ExpiryEventsConfigurationProperty | [[cdk.support/lookup-entry]] | `:expiry-events-configuration` |
"
  [^CfnAccountProps$Builder builder id config]
  (when-some [data (lookup-entry config id :expiry-events-configuration)]
    (. builder expiryEventsConfiguration data))
  (.build builder))


(defn cfn-account-props-builder
  "Creates a  `CfnAccountProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-props-builder> (new CfnAccountProps$Builder) id config))


(defn cfn-certificate-builder>
  "The cfn-certificate-builder> function updates a CfnCertificate$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-some [data (lookup-entry config id :certificate-transparency-logging-preference)]
    (. builder certificateTransparencyLoggingPreference data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-validation-options)]
    (. builder domainValidationOptions data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :validation-method)]
    (. builder validationMethod data))
  (.build builder))


(defn cfn-certificate-builder
  "Creates a  `CfnCertificate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-certificate-builder> (CfnCertificate$Builder/create scope (name id)) id config))


(defn cfn-certificate-domain-validation-option-property-builder>
  "The cfn-certificate-domain-validation-option-property-builder> function updates a CfnCertificate$DomainValidationOptionProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-some [data (lookup-entry config id :validation-domain)]
    (. builder validationDomain data))
  (.build builder))


(defn cfn-certificate-domain-validation-option-property-builder
  "Creates a  `CfnCertificate$DomainValidationOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-certificate-domain-validation-option-property-builder> (new CfnCertificate$DomainValidationOptionProperty$Builder) id config))


(defn cfn-certificate-props-builder>
  "The cfn-certificate-props-builder> function updates a CfnCertificateProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-some [data (lookup-entry config id :certificate-transparency-logging-preference)]
    (. builder certificateTransparencyLoggingPreference data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-validation-options)]
    (. builder domainValidationOptions data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :validation-method)]
    (. builder validationMethod data))
  (.build builder))


(defn cfn-certificate-props-builder
  "Creates a  `CfnCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-certificate-props-builder> (new CfnCertificateProps$Builder) id config))


(defn dns-validated-certificate-props-builder>
  "The dns-validated-certificate-props-builder> function updates a DnsValidatedCertificateProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :cleanup-route53-records)]
    (. builder cleanupRoute53Records data))
  (when-some [data (lookup-entry config id :custom-resource-role)]
    (. builder customResourceRole data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :hosted-zone)]
    (. builder hostedZone data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :route53-endpoint)]
    (. builder route53Endpoint data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :transparency-logging-enabled)]
    (. builder transparencyLoggingEnabled data))
  (when-some [data (lookup-entry config id :validation)]
    (. builder validation data))
  (.build builder))


(defn dns-validated-certificate-props-builder
  "Creates a  `DnsValidatedCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (dns-validated-certificate-props-builder> (new DnsValidatedCertificateProps$Builder) id config))


(defn private-certificate-builder>
  "The private-certificate-builder> function updates a PrivateCertificate$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-authority)]
    (. builder certificateAuthority data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (.build builder))


(defn private-certificate-builder
  "Creates a  `PrivateCertificate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (private-certificate-builder> (PrivateCertificate$Builder/create scope (name id)) id config))


(defn private-certificate-props-builder>
  "The private-certificate-props-builder> function updates a PrivateCertificateProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :certificate-authority)]
    (. builder certificateAuthority data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (.build builder))


(defn private-certificate-props-builder
  "Creates a  `PrivateCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (private-certificate-props-builder> (new PrivateCertificateProps$Builder) id config))