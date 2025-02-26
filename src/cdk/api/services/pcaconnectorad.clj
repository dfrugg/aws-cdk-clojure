(ns cdk.api.services.pcaconnectorad
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.pcaconnectorad package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.pcaconnectorad CfnConnector$Builder
                                                           CfnConnector$VpcInformationProperty$Builder
                                                           CfnConnectorProps$Builder
                                                           CfnDirectoryRegistration$Builder
                                                           CfnDirectoryRegistrationProps$Builder
                                                           CfnServicePrincipalName$Builder
                                                           CfnServicePrincipalNameProps$Builder
                                                           CfnTemplate$ApplicationPoliciesProperty$Builder
                                                           CfnTemplate$ApplicationPolicyProperty$Builder
                                                           CfnTemplate$Builder
                                                           CfnTemplate$CertificateValidityProperty$Builder
                                                           CfnTemplate$EnrollmentFlagsV2Property$Builder
                                                           CfnTemplate$EnrollmentFlagsV3Property$Builder
                                                           CfnTemplate$EnrollmentFlagsV4Property$Builder
                                                           CfnTemplate$ExtensionsV2Property$Builder
                                                           CfnTemplate$ExtensionsV3Property$Builder
                                                           CfnTemplate$ExtensionsV4Property$Builder
                                                           CfnTemplate$GeneralFlagsV2Property$Builder
                                                           CfnTemplate$GeneralFlagsV3Property$Builder
                                                           CfnTemplate$GeneralFlagsV4Property$Builder
                                                           CfnTemplate$KeyUsageFlagsProperty$Builder
                                                           CfnTemplate$KeyUsageProperty$Builder
                                                           CfnTemplate$KeyUsagePropertyFlagsProperty$Builder
                                                           CfnTemplate$KeyUsagePropertyProperty$Builder
                                                           CfnTemplate$PrivateKeyAttributesV2Property$Builder
                                                           CfnTemplate$PrivateKeyAttributesV3Property$Builder
                                                           CfnTemplate$PrivateKeyAttributesV4Property$Builder
                                                           CfnTemplate$PrivateKeyFlagsV2Property$Builder
                                                           CfnTemplate$PrivateKeyFlagsV3Property$Builder
                                                           CfnTemplate$PrivateKeyFlagsV4Property$Builder
                                                           CfnTemplate$SubjectNameFlagsV2Property$Builder
                                                           CfnTemplate$SubjectNameFlagsV3Property$Builder
                                                           CfnTemplate$SubjectNameFlagsV4Property$Builder
                                                           CfnTemplate$TemplateDefinitionProperty$Builder
                                                           CfnTemplate$TemplateV2Property$Builder
                                                           CfnTemplate$TemplateV3Property$Builder
                                                           CfnTemplate$TemplateV4Property$Builder
                                                           CfnTemplate$ValidityPeriodProperty$Builder
                                                           CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder
                                                           CfnTemplateGroupAccessControlEntry$Builder
                                                           CfnTemplateGroupAccessControlEntryProps$Builder
                                                           CfnTemplateProps$Builder]))


(defn build-cfn-connector-builder
  "The build-cfn-connector-builder function updates a CfnConnector$Builder instance using the provided configuration.
  The function takes the CfnConnector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcInformation` | software.amazon.awscdk.services.pcaconnectorad.CfnConnector$VpcInformationProperty | [[cdk.support/lookup-entry]] | `:vpc-information` |
"
  [^CfnConnector$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-information)]
    (. builder vpcInformation data))
  (.build builder))


(defn cfn-connector-builder
  "Creates a  `CfnConnector$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-connector-builder (CfnConnector$Builder/create scope (name id)) id config))


(defn build-cfn-connector-props-builder
  "The build-cfn-connector-props-builder function updates a CfnConnectorProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcInformation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-information` |
"
  [^CfnConnectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-information)]
    (. builder vpcInformation data))
  (.build builder))


(defn cfn-connector-props-builder
  "Creates a  `CfnConnectorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-props-builder (new CfnConnectorProps$Builder) id config))


(defn build-cfn-connector-vpc-information-property-builder
  "The build-cfn-connector-vpc-information-property-builder function updates a CfnConnector$VpcInformationProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$VpcInformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
"
  [^CfnConnector$VpcInformationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (.build builder))


(defn cfn-connector-vpc-information-property-builder
  "Creates a  `CfnConnector$VpcInformationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-vpc-information-property-builder (new CfnConnector$VpcInformationProperty$Builder) id config))


(defn build-cfn-directory-registration-builder
  "The build-cfn-directory-registration-builder function updates a CfnDirectoryRegistration$Builder instance using the provided configuration.
  The function takes the CfnDirectoryRegistration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDirectoryRegistration$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-directory-registration-builder
  "Creates a  `CfnDirectoryRegistration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-directory-registration-builder (CfnDirectoryRegistration$Builder/create scope (name id)) id config))


(defn build-cfn-directory-registration-props-builder
  "The build-cfn-directory-registration-props-builder function updates a CfnDirectoryRegistrationProps$Builder instance using the provided configuration.
  The function takes the CfnDirectoryRegistrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDirectoryRegistrationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-directory-registration-props-builder
  "Creates a  `CfnDirectoryRegistrationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-directory-registration-props-builder (new CfnDirectoryRegistrationProps$Builder) id config))


(defn build-cfn-service-principal-name-builder
  "The build-cfn-service-principal-name-builder function updates a CfnServicePrincipalName$Builder instance using the provided configuration.
  The function takes the CfnServicePrincipalName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `directoryRegistrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-registration-arn` |
"
  [^CfnServicePrincipalName$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-arn)]
    (. builder connectorArn data))
  (when-some [data (lookup-entry config id :directory-registration-arn)]
    (. builder directoryRegistrationArn data))
  (.build builder))


(defn cfn-service-principal-name-builder
  "Creates a  `CfnServicePrincipalName$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-service-principal-name-builder (CfnServicePrincipalName$Builder/create scope (name id)) id config))


(defn build-cfn-service-principal-name-props-builder
  "The build-cfn-service-principal-name-props-builder function updates a CfnServicePrincipalNameProps$Builder instance using the provided configuration.
  The function takes the CfnServicePrincipalNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `directoryRegistrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-registration-arn` |
"
  [^CfnServicePrincipalNameProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-arn)]
    (. builder connectorArn data))
  (when-some [data (lookup-entry config id :directory-registration-arn)]
    (. builder directoryRegistrationArn data))
  (.build builder))


(defn cfn-service-principal-name-props-builder
  "Creates a  `CfnServicePrincipalNameProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-principal-name-props-builder (new CfnServicePrincipalNameProps$Builder) id config))


(defn build-cfn-template-application-policies-property-builder
  "The build-cfn-template-application-policies-property-builder function updates a CfnTemplate$ApplicationPoliciesProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$ApplicationPoliciesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `critical` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:critical` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
"
  [^CfnTemplate$ApplicationPoliciesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :critical)]
    (. builder critical data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (.build builder))


(defn cfn-template-application-policies-property-builder
  "Creates a  `CfnTemplate$ApplicationPoliciesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-application-policies-property-builder (new CfnTemplate$ApplicationPoliciesProperty$Builder) id config))


(defn build-cfn-template-application-policy-property-builder
  "The build-cfn-template-application-policy-property-builder function updates a CfnTemplate$ApplicationPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$ApplicationPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyObjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-object-identifier` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
"
  [^CfnTemplate$ApplicationPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-object-identifier)]
    (. builder policyObjectIdentifier data))
  (when-some [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (.build builder))


(defn cfn-template-application-policy-property-builder
  "Creates a  `CfnTemplate$ApplicationPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-application-policy-property-builder (new CfnTemplate$ApplicationPolicyProperty$Builder) id config))


(defn build-cfn-template-builder
  "The build-cfn-template-builder function updates a CfnTemplate$Builder instance using the provided configuration.
  The function takes the CfnTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reenrollAllCertificateHolders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reenroll-all-certificate-holders` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-arn)]
    (. builder connectorArn data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :reenroll-all-certificate-holders)]
    (. builder reenrollAllCertificateHolders data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-template-builder
  "Creates a  `CfnTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-template-builder (CfnTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-template-certificate-validity-property-builder
  "The build-cfn-template-certificate-validity-property-builder function updates a CfnTemplate$CertificateValidityProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$CertificateValidityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `renewalPeriod` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:renewal-period` |
| `validityPeriod` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:validity-period` |
"
  [^CfnTemplate$CertificateValidityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :renewal-period)]
    (. builder renewalPeriod data))
  (when-some [data (lookup-entry config id :validity-period)]
    (. builder validityPeriod data))
  (.build builder))


(defn cfn-template-certificate-validity-property-builder
  "Creates a  `CfnTemplate$CertificateValidityProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-certificate-validity-property-builder (new CfnTemplate$CertificateValidityProperty$Builder) id config))


(defn build-cfn-template-enrollment-flags-v2-property-builder
  "The build-cfn-template-enrollment-flags-v2-property-builder function updates a CfnTemplate$EnrollmentFlagsV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$EnrollmentFlagsV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableKeyReuseOnNtTokenKeysetStorageFull` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-reuse-on-nt-token-keyset-storage-full` |
| `includeSymmetricAlgorithms` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-symmetric-algorithms` |
| `noSecurityExtension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-security-extension` |
| `removeInvalidCertificateFromPersonalStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-invalid-certificate-from-personal-store` |
| `userInteractionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-interaction-required` |
"
  [^CfnTemplate$EnrollmentFlagsV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-key-reuse-on-nt-token-keyset-storage-full)]
    (. builder enableKeyReuseOnNtTokenKeysetStorageFull data))
  (when-some [data (lookup-entry config id :include-symmetric-algorithms)]
    (. builder includeSymmetricAlgorithms data))
  (when-some [data (lookup-entry config id :no-security-extension)]
    (. builder noSecurityExtension data))
  (when-some [data (lookup-entry config id :remove-invalid-certificate-from-personal-store)]
    (. builder removeInvalidCertificateFromPersonalStore data))
  (when-some [data (lookup-entry config id :user-interaction-required)]
    (. builder userInteractionRequired data))
  (.build builder))


(defn cfn-template-enrollment-flags-v2-property-builder
  "Creates a  `CfnTemplate$EnrollmentFlagsV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-enrollment-flags-v2-property-builder (new CfnTemplate$EnrollmentFlagsV2Property$Builder) id config))


(defn build-cfn-template-enrollment-flags-v3-property-builder
  "The build-cfn-template-enrollment-flags-v3-property-builder function updates a CfnTemplate$EnrollmentFlagsV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$EnrollmentFlagsV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableKeyReuseOnNtTokenKeysetStorageFull` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-reuse-on-nt-token-keyset-storage-full` |
| `includeSymmetricAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-symmetric-algorithms` |
| `noSecurityExtension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-security-extension` |
| `removeInvalidCertificateFromPersonalStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-invalid-certificate-from-personal-store` |
| `userInteractionRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-interaction-required` |
"
  [^CfnTemplate$EnrollmentFlagsV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-key-reuse-on-nt-token-keyset-storage-full)]
    (. builder enableKeyReuseOnNtTokenKeysetStorageFull data))
  (when-some [data (lookup-entry config id :include-symmetric-algorithms)]
    (. builder includeSymmetricAlgorithms data))
  (when-some [data (lookup-entry config id :no-security-extension)]
    (. builder noSecurityExtension data))
  (when-some [data (lookup-entry config id :remove-invalid-certificate-from-personal-store)]
    (. builder removeInvalidCertificateFromPersonalStore data))
  (when-some [data (lookup-entry config id :user-interaction-required)]
    (. builder userInteractionRequired data))
  (.build builder))


(defn cfn-template-enrollment-flags-v3-property-builder
  "Creates a  `CfnTemplate$EnrollmentFlagsV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-enrollment-flags-v3-property-builder (new CfnTemplate$EnrollmentFlagsV3Property$Builder) id config))


(defn build-cfn-template-enrollment-flags-v4-property-builder
  "The build-cfn-template-enrollment-flags-v4-property-builder function updates a CfnTemplate$EnrollmentFlagsV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$EnrollmentFlagsV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableKeyReuseOnNtTokenKeysetStorageFull` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-reuse-on-nt-token-keyset-storage-full` |
| `includeSymmetricAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-symmetric-algorithms` |
| `noSecurityExtension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-security-extension` |
| `removeInvalidCertificateFromPersonalStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-invalid-certificate-from-personal-store` |
| `userInteractionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-interaction-required` |
"
  [^CfnTemplate$EnrollmentFlagsV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-key-reuse-on-nt-token-keyset-storage-full)]
    (. builder enableKeyReuseOnNtTokenKeysetStorageFull data))
  (when-some [data (lookup-entry config id :include-symmetric-algorithms)]
    (. builder includeSymmetricAlgorithms data))
  (when-some [data (lookup-entry config id :no-security-extension)]
    (. builder noSecurityExtension data))
  (when-some [data (lookup-entry config id :remove-invalid-certificate-from-personal-store)]
    (. builder removeInvalidCertificateFromPersonalStore data))
  (when-some [data (lookup-entry config id :user-interaction-required)]
    (. builder userInteractionRequired data))
  (.build builder))


(defn cfn-template-enrollment-flags-v4-property-builder
  "Creates a  `CfnTemplate$EnrollmentFlagsV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-enrollment-flags-v4-property-builder (new CfnTemplate$EnrollmentFlagsV4Property$Builder) id config))


(defn build-cfn-template-extensions-v2-property-builder
  "The build-cfn-template-extensions-v2-property-builder function updates a CfnTemplate$ExtensionsV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$ExtensionsV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPolicies` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ApplicationPoliciesProperty | [[cdk.support/lookup-entry]] | `:application-policies` |
| `keyUsage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-usage` |
"
  [^CfnTemplate$ExtensionsV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :application-policies)]
    (. builder applicationPolicies data))
  (when-some [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (.build builder))


(defn cfn-template-extensions-v2-property-builder
  "Creates a  `CfnTemplate$ExtensionsV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-extensions-v2-property-builder (new CfnTemplate$ExtensionsV2Property$Builder) id config))


(defn build-cfn-template-extensions-v3-property-builder
  "The build-cfn-template-extensions-v3-property-builder function updates a CfnTemplate$ExtensionsV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$ExtensionsV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-policies` |
| `keyUsage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-usage` |
"
  [^CfnTemplate$ExtensionsV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :application-policies)]
    (. builder applicationPolicies data))
  (when-some [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (.build builder))


(defn cfn-template-extensions-v3-property-builder
  "Creates a  `CfnTemplate$ExtensionsV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-extensions-v3-property-builder (new CfnTemplate$ExtensionsV3Property$Builder) id config))


(defn build-cfn-template-extensions-v4-property-builder
  "The build-cfn-template-extensions-v4-property-builder function updates a CfnTemplate$ExtensionsV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$ExtensionsV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-policies` |
| `keyUsage` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsageProperty | [[cdk.support/lookup-entry]] | `:key-usage` |
"
  [^CfnTemplate$ExtensionsV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :application-policies)]
    (. builder applicationPolicies data))
  (when-some [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (.build builder))


(defn cfn-template-extensions-v4-property-builder
  "Creates a  `CfnTemplate$ExtensionsV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-extensions-v4-property-builder (new CfnTemplate$ExtensionsV4Property$Builder) id config))


(defn build-cfn-template-general-flags-v2-property-builder
  "The build-cfn-template-general-flags-v2-property-builder function updates a CfnTemplate$GeneralFlagsV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$GeneralFlagsV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnrollment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-enrollment` |
| `machineType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:machine-type` |
"
  [^CfnTemplate$GeneralFlagsV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-enrollment)]
    (. builder autoEnrollment data))
  (when-some [data (lookup-entry config id :machine-type)]
    (. builder machineType data))
  (.build builder))


(defn cfn-template-general-flags-v2-property-builder
  "Creates a  `CfnTemplate$GeneralFlagsV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-general-flags-v2-property-builder (new CfnTemplate$GeneralFlagsV2Property$Builder) id config))


(defn build-cfn-template-general-flags-v3-property-builder
  "The build-cfn-template-general-flags-v3-property-builder function updates a CfnTemplate$GeneralFlagsV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$GeneralFlagsV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnrollment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enrollment` |
| `machineType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:machine-type` |
"
  [^CfnTemplate$GeneralFlagsV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-enrollment)]
    (. builder autoEnrollment data))
  (when-some [data (lookup-entry config id :machine-type)]
    (. builder machineType data))
  (.build builder))


(defn cfn-template-general-flags-v3-property-builder
  "Creates a  `CfnTemplate$GeneralFlagsV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-general-flags-v3-property-builder (new CfnTemplate$GeneralFlagsV3Property$Builder) id config))


(defn build-cfn-template-general-flags-v4-property-builder
  "The build-cfn-template-general-flags-v4-property-builder function updates a CfnTemplate$GeneralFlagsV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$GeneralFlagsV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnrollment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enrollment` |
| `machineType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:machine-type` |
"
  [^CfnTemplate$GeneralFlagsV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-enrollment)]
    (. builder autoEnrollment data))
  (when-some [data (lookup-entry config id :machine-type)]
    (. builder machineType data))
  (.build builder))


(defn cfn-template-general-flags-v4-property-builder
  "Creates a  `CfnTemplate$GeneralFlagsV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-general-flags-v4-property-builder (new CfnTemplate$GeneralFlagsV4Property$Builder) id config))


(defn build-cfn-template-group-access-control-entry-access-rights-property-builder
  "The build-cfn-template-group-access-control-entry-access-rights-property-builder function updates a CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnroll` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-enroll` |
| `enroll` | java.lang.String | [[cdk.support/lookup-entry]] | `:enroll` |
"
  [^CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-enroll)]
    (. builder autoEnroll data))
  (when-some [data (lookup-entry config id :enroll)]
    (. builder enroll data))
  (.build builder))


(defn cfn-template-group-access-control-entry-access-rights-property-builder
  "Creates a  `CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-group-access-control-entry-access-rights-property-builder (new CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder) id config))


(defn build-cfn-template-group-access-control-entry-builder
  "The build-cfn-template-group-access-control-entry-builder function updates a CfnTemplateGroupAccessControlEntry$Builder instance using the provided configuration.
  The function takes the CfnTemplateGroupAccessControlEntry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRights` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry$AccessRightsProperty | [[cdk.support/lookup-entry]] | `:access-rights` |
| `groupDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-display-name` |
| `groupSecurityIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-security-identifier` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |
"
  [^CfnTemplateGroupAccessControlEntry$Builder builder id config]
  (when-some [data (lookup-entry config id :access-rights)]
    (. builder accessRights data))
  (when-some [data (lookup-entry config id :group-display-name)]
    (. builder groupDisplayName data))
  (when-some [data (lookup-entry config id :group-security-identifier)]
    (. builder groupSecurityIdentifier data))
  (when-some [data (lookup-entry config id :template-arn)]
    (. builder templateArn data))
  (.build builder))


(defn cfn-template-group-access-control-entry-builder
  "Creates a  `CfnTemplateGroupAccessControlEntry$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-template-group-access-control-entry-builder (CfnTemplateGroupAccessControlEntry$Builder/create scope (name id)) id config))


(defn build-cfn-template-group-access-control-entry-props-builder
  "The build-cfn-template-group-access-control-entry-props-builder function updates a CfnTemplateGroupAccessControlEntryProps$Builder instance using the provided configuration.
  The function takes the CfnTemplateGroupAccessControlEntryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRights` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry$AccessRightsProperty | [[cdk.support/lookup-entry]] | `:access-rights` |
| `groupDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-display-name` |
| `groupSecurityIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-security-identifier` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |
"
  [^CfnTemplateGroupAccessControlEntryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-rights)]
    (. builder accessRights data))
  (when-some [data (lookup-entry config id :group-display-name)]
    (. builder groupDisplayName data))
  (when-some [data (lookup-entry config id :group-security-identifier)]
    (. builder groupSecurityIdentifier data))
  (when-some [data (lookup-entry config id :template-arn)]
    (. builder templateArn data))
  (.build builder))


(defn cfn-template-group-access-control-entry-props-builder
  "Creates a  `CfnTemplateGroupAccessControlEntryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-group-access-control-entry-props-builder (new CfnTemplateGroupAccessControlEntryProps$Builder) id config))


(defn build-cfn-template-key-usage-flags-property-builder
  "The build-cfn-template-key-usage-flags-property-builder function updates a CfnTemplate$KeyUsageFlagsProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$KeyUsageFlagsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataEncipherment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-encipherment` |
| `digitalSignature` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:digital-signature` |
| `keyAgreement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-agreement` |
| `keyEncipherment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-encipherment` |
| `nonRepudiation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:non-repudiation` |
"
  [^CfnTemplate$KeyUsageFlagsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-encipherment)]
    (. builder dataEncipherment data))
  (when-some [data (lookup-entry config id :digital-signature)]
    (. builder digitalSignature data))
  (when-some [data (lookup-entry config id :key-agreement)]
    (. builder keyAgreement data))
  (when-some [data (lookup-entry config id :key-encipherment)]
    (. builder keyEncipherment data))
  (when-some [data (lookup-entry config id :non-repudiation)]
    (. builder nonRepudiation data))
  (.build builder))


(defn cfn-template-key-usage-flags-property-builder
  "Creates a  `CfnTemplate$KeyUsageFlagsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-key-usage-flags-property-builder (new CfnTemplate$KeyUsageFlagsProperty$Builder) id config))


(defn build-cfn-template-key-usage-property-builder
  "The build-cfn-template-key-usage-property-builder function updates a CfnTemplate$KeyUsageProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$KeyUsageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `critical` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:critical` |
| `usageFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsageFlagsProperty | [[cdk.support/lookup-entry]] | `:usage-flags` |
"
  [^CfnTemplate$KeyUsageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :critical)]
    (. builder critical data))
  (when-some [data (lookup-entry config id :usage-flags)]
    (. builder usageFlags data))
  (.build builder))


(defn cfn-template-key-usage-property-builder
  "Creates a  `CfnTemplate$KeyUsageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-key-usage-property-builder (new CfnTemplate$KeyUsageProperty$Builder) id config))


(defn build-cfn-template-key-usage-property-flags-property-builder
  "The build-cfn-template-key-usage-property-flags-property-builder function updates a CfnTemplate$KeyUsagePropertyFlagsProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$KeyUsagePropertyFlagsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decrypt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:decrypt` |
| `keyAgreement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-agreement` |
| `sign` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sign` |
"
  [^CfnTemplate$KeyUsagePropertyFlagsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :decrypt)]
    (. builder decrypt data))
  (when-some [data (lookup-entry config id :key-agreement)]
    (. builder keyAgreement data))
  (when-some [data (lookup-entry config id :sign)]
    (. builder sign data))
  (.build builder))


(defn cfn-template-key-usage-property-flags-property-builder
  "Creates a  `CfnTemplate$KeyUsagePropertyFlagsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-key-usage-property-flags-property-builder (new CfnTemplate$KeyUsagePropertyFlagsProperty$Builder) id config))


(defn build-cfn-template-key-usage-property-property-builder
  "The build-cfn-template-key-usage-property-property-builder function updates a CfnTemplate$KeyUsagePropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$KeyUsagePropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-flags` |
| `propertyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-type` |
"
  [^CfnTemplate$KeyUsagePropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :property-flags)]
    (. builder propertyFlags data))
  (when-some [data (lookup-entry config id :property-type)]
    (. builder propertyType data))
  (.build builder))


(defn cfn-template-key-usage-property-property-builder
  "Creates a  `CfnTemplate$KeyUsagePropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-key-usage-property-property-builder (new CfnTemplate$KeyUsagePropertyProperty$Builder) id config))


(defn build-cfn-template-private-key-attributes-v2-property-builder
  "The build-cfn-template-private-key-attributes-v2-property-builder function updates a CfnTemplate$PrivateKeyAttributesV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$PrivateKeyAttributesV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cryptoProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:crypto-providers` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `minimalKeyLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimal-key-length` |
"
  [^CfnTemplate$PrivateKeyAttributesV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :crypto-providers)]
    (. builder cryptoProviders data))
  (when-some [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (lookup-entry config id :minimal-key-length)]
    (. builder minimalKeyLength data))
  (.build builder))


(defn cfn-template-private-key-attributes-v2-property-builder
  "Creates a  `CfnTemplate$PrivateKeyAttributesV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-private-key-attributes-v2-property-builder (new CfnTemplate$PrivateKeyAttributesV2Property$Builder) id config))


(defn build-cfn-template-private-key-attributes-v3-property-builder
  "The build-cfn-template-private-key-attributes-v3-property-builder function updates a CfnTemplate$PrivateKeyAttributesV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$PrivateKeyAttributesV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `cryptoProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:crypto-providers` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `keyUsageProperty` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsagePropertyProperty | [[cdk.support/lookup-entry]] | `:key-usage-property` |
| `minimalKeyLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimal-key-length` |
"
  [^CfnTemplate$PrivateKeyAttributesV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :crypto-providers)]
    (. builder cryptoProviders data))
  (when-some [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (lookup-entry config id :key-usage-property)]
    (. builder keyUsageProperty data))
  (when-some [data (lookup-entry config id :minimal-key-length)]
    (. builder minimalKeyLength data))
  (.build builder))


(defn cfn-template-private-key-attributes-v3-property-builder
  "Creates a  `CfnTemplate$PrivateKeyAttributesV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-private-key-attributes-v3-property-builder (new CfnTemplate$PrivateKeyAttributesV3Property$Builder) id config))


(defn build-cfn-template-private-key-attributes-v4-property-builder
  "The build-cfn-template-private-key-attributes-v4-property-builder function updates a CfnTemplate$PrivateKeyAttributesV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$PrivateKeyAttributesV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `cryptoProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:crypto-providers` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `keyUsageProperty` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsagePropertyProperty | [[cdk.support/lookup-entry]] | `:key-usage-property` |
| `minimalKeyLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimal-key-length` |
"
  [^CfnTemplate$PrivateKeyAttributesV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :crypto-providers)]
    (. builder cryptoProviders data))
  (when-some [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (lookup-entry config id :key-usage-property)]
    (. builder keyUsageProperty data))
  (when-some [data (lookup-entry config id :minimal-key-length)]
    (. builder minimalKeyLength data))
  (.build builder))


(defn cfn-template-private-key-attributes-v4-property-builder
  "Creates a  `CfnTemplate$PrivateKeyAttributesV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-private-key-attributes-v4-property-builder (new CfnTemplate$PrivateKeyAttributesV4Property$Builder) id config))


(defn build-cfn-template-private-key-flags-v2-property-builder
  "The build-cfn-template-private-key-flags-v2-property-builder function updates a CfnTemplate$PrivateKeyFlagsV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$PrivateKeyFlagsV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-version` |
| `exportableKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable-key` |
| `strongKeyProtectionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:strong-key-protection-required` |
"
  [^CfnTemplate$PrivateKeyFlagsV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :client-version)]
    (. builder clientVersion data))
  (when-some [data (lookup-entry config id :exportable-key)]
    (. builder exportableKey data))
  (when-some [data (lookup-entry config id :strong-key-protection-required)]
    (. builder strongKeyProtectionRequired data))
  (.build builder))


(defn cfn-template-private-key-flags-v2-property-builder
  "Creates a  `CfnTemplate$PrivateKeyFlagsV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-private-key-flags-v2-property-builder (new CfnTemplate$PrivateKeyFlagsV2Property$Builder) id config))


(defn build-cfn-template-private-key-flags-v3-property-builder
  "The build-cfn-template-private-key-flags-v3-property-builder function updates a CfnTemplate$PrivateKeyFlagsV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$PrivateKeyFlagsV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-version` |
| `exportableKey` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exportable-key` |
| `requireAlternateSignatureAlgorithm` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-alternate-signature-algorithm` |
| `strongKeyProtectionRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:strong-key-protection-required` |
"
  [^CfnTemplate$PrivateKeyFlagsV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :client-version)]
    (. builder clientVersion data))
  (when-some [data (lookup-entry config id :exportable-key)]
    (. builder exportableKey data))
  (when-some [data (lookup-entry config id :require-alternate-signature-algorithm)]
    (. builder requireAlternateSignatureAlgorithm data))
  (when-some [data (lookup-entry config id :strong-key-protection-required)]
    (. builder strongKeyProtectionRequired data))
  (.build builder))


(defn cfn-template-private-key-flags-v3-property-builder
  "Creates a  `CfnTemplate$PrivateKeyFlagsV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-private-key-flags-v3-property-builder (new CfnTemplate$PrivateKeyFlagsV3Property$Builder) id config))


(defn build-cfn-template-private-key-flags-v4-property-builder
  "The build-cfn-template-private-key-flags-v4-property-builder function updates a CfnTemplate$PrivateKeyFlagsV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$PrivateKeyFlagsV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-version` |
| `exportableKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable-key` |
| `requireAlternateSignatureAlgorithm` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-alternate-signature-algorithm` |
| `requireSameKeyRenewal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-same-key-renewal` |
| `strongKeyProtectionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:strong-key-protection-required` |
| `useLegacyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-legacy-provider` |
"
  [^CfnTemplate$PrivateKeyFlagsV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :client-version)]
    (. builder clientVersion data))
  (when-some [data (lookup-entry config id :exportable-key)]
    (. builder exportableKey data))
  (when-some [data (lookup-entry config id :require-alternate-signature-algorithm)]
    (. builder requireAlternateSignatureAlgorithm data))
  (when-some [data (lookup-entry config id :require-same-key-renewal)]
    (. builder requireSameKeyRenewal data))
  (when-some [data (lookup-entry config id :strong-key-protection-required)]
    (. builder strongKeyProtectionRequired data))
  (when-some [data (lookup-entry config id :use-legacy-provider)]
    (. builder useLegacyProvider data))
  (.build builder))


(defn cfn-template-private-key-flags-v4-property-builder
  "Creates a  `CfnTemplate$PrivateKeyFlagsV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-private-key-flags-v4-property-builder (new CfnTemplate$PrivateKeyFlagsV4Property$Builder) id config))


(defn build-cfn-template-props-builder
  "The build-cfn-template-props-builder function updates a CfnTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reenrollAllCertificateHolders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reenroll-all-certificate-holders` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-arn)]
    (. builder connectorArn data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :reenroll-all-certificate-holders)]
    (. builder reenrollAllCertificateHolders data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-template-props-builder
  "Creates a  `CfnTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-props-builder (new CfnTemplateProps$Builder) id config))


(defn build-cfn-template-subject-name-flags-v2-property-builder
  "The build-cfn-template-subject-name-flags-v2-property-builder function updates a CfnTemplate$SubjectNameFlagsV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$SubjectNameFlagsV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requireCommonName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-common-name` |
| `requireDirectoryPath` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-directory-path` |
| `requireDnsAsCn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-dns-as-cn` |
| `requireEmail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-email` |
| `sanRequireDirectoryGuid` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-directory-guid` |
| `sanRequireDns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-dns` |
| `sanRequireDomainDns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-domain-dns` |
| `sanRequireEmail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-email` |
| `sanRequireSpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-spn` |
| `sanRequireUpn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-upn` |
"
  [^CfnTemplate$SubjectNameFlagsV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :require-common-name)]
    (. builder requireCommonName data))
  (when-some [data (lookup-entry config id :require-directory-path)]
    (. builder requireDirectoryPath data))
  (when-some [data (lookup-entry config id :require-dns-as-cn)]
    (. builder requireDnsAsCn data))
  (when-some [data (lookup-entry config id :require-email)]
    (. builder requireEmail data))
  (when-some [data (lookup-entry config id :san-require-directory-guid)]
    (. builder sanRequireDirectoryGuid data))
  (when-some [data (lookup-entry config id :san-require-dns)]
    (. builder sanRequireDns data))
  (when-some [data (lookup-entry config id :san-require-domain-dns)]
    (. builder sanRequireDomainDns data))
  (when-some [data (lookup-entry config id :san-require-email)]
    (. builder sanRequireEmail data))
  (when-some [data (lookup-entry config id :san-require-spn)]
    (. builder sanRequireSpn data))
  (when-some [data (lookup-entry config id :san-require-upn)]
    (. builder sanRequireUpn data))
  (.build builder))


(defn cfn-template-subject-name-flags-v2-property-builder
  "Creates a  `CfnTemplate$SubjectNameFlagsV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-subject-name-flags-v2-property-builder (new CfnTemplate$SubjectNameFlagsV2Property$Builder) id config))


(defn build-cfn-template-subject-name-flags-v3-property-builder
  "The build-cfn-template-subject-name-flags-v3-property-builder function updates a CfnTemplate$SubjectNameFlagsV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$SubjectNameFlagsV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requireCommonName` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-common-name` |
| `requireDirectoryPath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-directory-path` |
| `requireDnsAsCn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-dns-as-cn` |
| `requireEmail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-email` |
| `sanRequireDirectoryGuid` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-directory-guid` |
| `sanRequireDns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-dns` |
| `sanRequireDomainDns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-domain-dns` |
| `sanRequireEmail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-email` |
| `sanRequireSpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-spn` |
| `sanRequireUpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-upn` |
"
  [^CfnTemplate$SubjectNameFlagsV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :require-common-name)]
    (. builder requireCommonName data))
  (when-some [data (lookup-entry config id :require-directory-path)]
    (. builder requireDirectoryPath data))
  (when-some [data (lookup-entry config id :require-dns-as-cn)]
    (. builder requireDnsAsCn data))
  (when-some [data (lookup-entry config id :require-email)]
    (. builder requireEmail data))
  (when-some [data (lookup-entry config id :san-require-directory-guid)]
    (. builder sanRequireDirectoryGuid data))
  (when-some [data (lookup-entry config id :san-require-dns)]
    (. builder sanRequireDns data))
  (when-some [data (lookup-entry config id :san-require-domain-dns)]
    (. builder sanRequireDomainDns data))
  (when-some [data (lookup-entry config id :san-require-email)]
    (. builder sanRequireEmail data))
  (when-some [data (lookup-entry config id :san-require-spn)]
    (. builder sanRequireSpn data))
  (when-some [data (lookup-entry config id :san-require-upn)]
    (. builder sanRequireUpn data))
  (.build builder))


(defn cfn-template-subject-name-flags-v3-property-builder
  "Creates a  `CfnTemplate$SubjectNameFlagsV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-subject-name-flags-v3-property-builder (new CfnTemplate$SubjectNameFlagsV3Property$Builder) id config))


(defn build-cfn-template-subject-name-flags-v4-property-builder
  "The build-cfn-template-subject-name-flags-v4-property-builder function updates a CfnTemplate$SubjectNameFlagsV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$SubjectNameFlagsV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requireCommonName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-common-name` |
| `requireDirectoryPath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-directory-path` |
| `requireDnsAsCn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-dns-as-cn` |
| `requireEmail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-email` |
| `sanRequireDirectoryGuid` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-directory-guid` |
| `sanRequireDns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-dns` |
| `sanRequireDomainDns` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-domain-dns` |
| `sanRequireEmail` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-email` |
| `sanRequireSpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-spn` |
| `sanRequireUpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-upn` |
"
  [^CfnTemplate$SubjectNameFlagsV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :require-common-name)]
    (. builder requireCommonName data))
  (when-some [data (lookup-entry config id :require-directory-path)]
    (. builder requireDirectoryPath data))
  (when-some [data (lookup-entry config id :require-dns-as-cn)]
    (. builder requireDnsAsCn data))
  (when-some [data (lookup-entry config id :require-email)]
    (. builder requireEmail data))
  (when-some [data (lookup-entry config id :san-require-directory-guid)]
    (. builder sanRequireDirectoryGuid data))
  (when-some [data (lookup-entry config id :san-require-dns)]
    (. builder sanRequireDns data))
  (when-some [data (lookup-entry config id :san-require-domain-dns)]
    (. builder sanRequireDomainDns data))
  (when-some [data (lookup-entry config id :san-require-email)]
    (. builder sanRequireEmail data))
  (when-some [data (lookup-entry config id :san-require-spn)]
    (. builder sanRequireSpn data))
  (when-some [data (lookup-entry config id :san-require-upn)]
    (. builder sanRequireUpn data))
  (.build builder))


(defn cfn-template-subject-name-flags-v4-property-builder
  "Creates a  `CfnTemplate$SubjectNameFlagsV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-subject-name-flags-v4-property-builder (new CfnTemplate$SubjectNameFlagsV4Property$Builder) id config))


(defn build-cfn-template-template-definition-property-builder
  "The build-cfn-template-template-definition-property-builder function updates a CfnTemplate$TemplateDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$TemplateDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateV2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-v2` |
| `templateV3` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$TemplateV3Property | [[cdk.support/lookup-entry]] | `:template-v3` |
| `templateV4` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-v4` |
"
  [^CfnTemplate$TemplateDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :template-v2)]
    (. builder templateV2 data))
  (when-some [data (lookup-entry config id :template-v3)]
    (. builder templateV3 data))
  (when-some [data (lookup-entry config id :template-v4)]
    (. builder templateV4 data))
  (.build builder))


(defn cfn-template-template-definition-property-builder
  "Creates a  `CfnTemplate$TemplateDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-template-definition-property-builder (new CfnTemplate$TemplateDefinitionProperty$Builder) id config))


(defn build-cfn-template-template-v2-property-builder
  "The build-cfn-template-template-v2-property-builder function updates a CfnTemplate$TemplateV2Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$TemplateV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateValidity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-validity` |
| `enrollmentFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enrollment-flags` |
| `extensions` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ExtensionsV2Property | [[cdk.support/lookup-entry]] | `:extensions` |
| `generalFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$GeneralFlagsV2Property | [[cdk.support/lookup-entry]] | `:general-flags` |
| `privateKeyAttributes` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$PrivateKeyAttributesV2Property | [[cdk.support/lookup-entry]] | `:private-key-attributes` |
| `privateKeyFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-key-flags` |
| `subjectNameFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-name-flags` |
| `supersededTemplates` | java.util.List | [[cdk.support/lookup-entry]] | `:superseded-templates` |
"
  [^CfnTemplate$TemplateV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-validity)]
    (. builder certificateValidity data))
  (when-some [data (lookup-entry config id :enrollment-flags)]
    (. builder enrollmentFlags data))
  (when-some [data (lookup-entry config id :extensions)]
    (. builder extensions data))
  (when-some [data (lookup-entry config id :general-flags)]
    (. builder generalFlags data))
  (when-some [data (lookup-entry config id :private-key-attributes)]
    (. builder privateKeyAttributes data))
  (when-some [data (lookup-entry config id :private-key-flags)]
    (. builder privateKeyFlags data))
  (when-some [data (lookup-entry config id :subject-name-flags)]
    (. builder subjectNameFlags data))
  (when-some [data (lookup-entry config id :superseded-templates)]
    (. builder supersededTemplates data))
  (.build builder))


(defn cfn-template-template-v2-property-builder
  "Creates a  `CfnTemplate$TemplateV2Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-template-v2-property-builder (new CfnTemplate$TemplateV2Property$Builder) id config))


(defn build-cfn-template-template-v3-property-builder
  "The build-cfn-template-template-v3-property-builder function updates a CfnTemplate$TemplateV3Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$TemplateV3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateValidity` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$CertificateValidityProperty | [[cdk.support/lookup-entry]] | `:certificate-validity` |
| `enrollmentFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$EnrollmentFlagsV3Property | [[cdk.support/lookup-entry]] | `:enrollment-flags` |
| `extensions` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ExtensionsV3Property | [[cdk.support/lookup-entry]] | `:extensions` |
| `generalFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$GeneralFlagsV3Property | [[cdk.support/lookup-entry]] | `:general-flags` |
| `hashAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-algorithm` |
| `privateKeyAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-key-attributes` |
| `privateKeyFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-key-flags` |
| `subjectNameFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-name-flags` |
| `supersededTemplates` | java.util.List | [[cdk.support/lookup-entry]] | `:superseded-templates` |
"
  [^CfnTemplate$TemplateV3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-validity)]
    (. builder certificateValidity data))
  (when-some [data (lookup-entry config id :enrollment-flags)]
    (. builder enrollmentFlags data))
  (when-some [data (lookup-entry config id :extensions)]
    (. builder extensions data))
  (when-some [data (lookup-entry config id :general-flags)]
    (. builder generalFlags data))
  (when-some [data (lookup-entry config id :hash-algorithm)]
    (. builder hashAlgorithm data))
  (when-some [data (lookup-entry config id :private-key-attributes)]
    (. builder privateKeyAttributes data))
  (when-some [data (lookup-entry config id :private-key-flags)]
    (. builder privateKeyFlags data))
  (when-some [data (lookup-entry config id :subject-name-flags)]
    (. builder subjectNameFlags data))
  (when-some [data (lookup-entry config id :superseded-templates)]
    (. builder supersededTemplates data))
  (.build builder))


(defn cfn-template-template-v3-property-builder
  "Creates a  `CfnTemplate$TemplateV3Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-template-v3-property-builder (new CfnTemplate$TemplateV3Property$Builder) id config))


(defn build-cfn-template-template-v4-property-builder
  "The build-cfn-template-template-v4-property-builder function updates a CfnTemplate$TemplateV4Property$Builder instance using the provided configuration.
  The function takes the CfnTemplate$TemplateV4Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateValidity` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$CertificateValidityProperty | [[cdk.support/lookup-entry]] | `:certificate-validity` |
| `enrollmentFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$EnrollmentFlagsV4Property | [[cdk.support/lookup-entry]] | `:enrollment-flags` |
| `extensions` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ExtensionsV4Property | [[cdk.support/lookup-entry]] | `:extensions` |
| `generalFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$GeneralFlagsV4Property | [[cdk.support/lookup-entry]] | `:general-flags` |
| `hashAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-algorithm` |
| `privateKeyAttributes` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$PrivateKeyAttributesV4Property | [[cdk.support/lookup-entry]] | `:private-key-attributes` |
| `privateKeyFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-key-flags` |
| `subjectNameFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$SubjectNameFlagsV4Property | [[cdk.support/lookup-entry]] | `:subject-name-flags` |
| `supersededTemplates` | java.util.List | [[cdk.support/lookup-entry]] | `:superseded-templates` |
"
  [^CfnTemplate$TemplateV4Property$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-validity)]
    (. builder certificateValidity data))
  (when-some [data (lookup-entry config id :enrollment-flags)]
    (. builder enrollmentFlags data))
  (when-some [data (lookup-entry config id :extensions)]
    (. builder extensions data))
  (when-some [data (lookup-entry config id :general-flags)]
    (. builder generalFlags data))
  (when-some [data (lookup-entry config id :hash-algorithm)]
    (. builder hashAlgorithm data))
  (when-some [data (lookup-entry config id :private-key-attributes)]
    (. builder privateKeyAttributes data))
  (when-some [data (lookup-entry config id :private-key-flags)]
    (. builder privateKeyFlags data))
  (when-some [data (lookup-entry config id :subject-name-flags)]
    (. builder subjectNameFlags data))
  (when-some [data (lookup-entry config id :superseded-templates)]
    (. builder supersededTemplates data))
  (.build builder))


(defn cfn-template-template-v4-property-builder
  "Creates a  `CfnTemplate$TemplateV4Property$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-template-v4-property-builder (new CfnTemplate$TemplateV4Property$Builder) id config))


(defn build-cfn-template-validity-period-property-builder
  "The build-cfn-template-validity-period-property-builder function updates a CfnTemplate$ValidityPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$ValidityPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `periodType` | java.lang.String | [[cdk.support/lookup-entry]] | `:period-type` |
"
  [^CfnTemplate$ValidityPeriodProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :period-type)]
    (. builder periodType data))
  (.build builder))


(defn cfn-template-validity-period-property-builder
  "Creates a  `CfnTemplate$ValidityPeriodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-template-validity-period-property-builder (new CfnTemplate$ValidityPeriodProperty$Builder) id config))