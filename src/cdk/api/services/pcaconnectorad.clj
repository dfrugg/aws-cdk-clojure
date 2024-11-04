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


(defn cfn-connector-builder
  "The cfn-connector-builder function buildes out new instances of 
CfnConnector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcInformation` | software.amazon.awscdk.services.pcaconnectorad.CfnConnector$VpcInformationProperty | [[cdk.support/lookup-entry]] | `:vpc-information` |"
  [stack id config]
  (let [builder (CfnConnector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-information)]
      (. builder vpcInformation data))
    (.build builder)))


(defn cfn-connector-props-builder
  "The cfn-connector-props-builder function buildes out new instances of 
CfnConnectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcInformation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-information` |"
  [stack id config]
  (let [builder (CfnConnectorProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-information)]
      (. builder vpcInformation data))
    (.build builder)))


(defn cfn-connector-vpc-information-property-builder
  "The cfn-connector-vpc-information-property-builder function buildes out new instances of 
CfnConnector$VpcInformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |"
  [stack id config]
  (let [builder (CfnConnector$VpcInformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (.build builder)))


(defn cfn-directory-registration-builder
  "The cfn-directory-registration-builder function buildes out new instances of 
CfnDirectoryRegistration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDirectoryRegistration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-directory-registration-props-builder
  "The cfn-directory-registration-props-builder function buildes out new instances of 
CfnDirectoryRegistrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDirectoryRegistrationProps$Builder.)]
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-principal-name-builder
  "The cfn-service-principal-name-builder function buildes out new instances of 
CfnServicePrincipalName$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `directoryRegistrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-registration-arn` |"
  [stack id config]
  (let [builder (CfnServicePrincipalName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connector-arn)]
      (. builder connectorArn data))
    (when-let [data (lookup-entry config id :directory-registration-arn)]
      (. builder directoryRegistrationArn data))
    (.build builder)))


(defn cfn-service-principal-name-props-builder
  "The cfn-service-principal-name-props-builder function buildes out new instances of 
CfnServicePrincipalNameProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `directoryRegistrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-registration-arn` |"
  [stack id config]
  (let [builder (CfnServicePrincipalNameProps$Builder.)]
    (when-let [data (lookup-entry config id :connector-arn)]
      (. builder connectorArn data))
    (when-let [data (lookup-entry config id :directory-registration-arn)]
      (. builder directoryRegistrationArn data))
    (.build builder)))


(defn cfn-template-application-policies-property-builder
  "The cfn-template-application-policies-property-builder function buildes out new instances of 
CfnTemplate$ApplicationPoliciesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `critical` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:critical` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |"
  [stack id config]
  (let [builder (CfnTemplate$ApplicationPoliciesProperty$Builder.)]
    (when-let [data (lookup-entry config id :critical)]
      (. builder critical data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (.build builder)))


(defn cfn-template-application-policy-property-builder
  "The cfn-template-application-policy-property-builder function buildes out new instances of 
CfnTemplate$ApplicationPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyObjectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-object-identifier` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |"
  [stack id config]
  (let [builder (CfnTemplate$ApplicationPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-object-identifier)]
      (. builder policyObjectIdentifier data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (.build builder)))


(defn cfn-template-builder
  "The cfn-template-builder function buildes out new instances of 
CfnTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reenrollAllCertificateHolders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reenroll-all-certificate-holders` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connector-arn)]
      (. builder connectorArn data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reenroll-all-certificate-holders)]
      (. builder reenrollAllCertificateHolders data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-template-certificate-validity-property-builder
  "The cfn-template-certificate-validity-property-builder function buildes out new instances of 
CfnTemplate$CertificateValidityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `renewalPeriod` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:renewal-period` |
| `validityPeriod` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:validity-period` |"
  [stack id config]
  (let [builder (CfnTemplate$CertificateValidityProperty$Builder.)]
    (when-let [data (lookup-entry config id :renewal-period)]
      (. builder renewalPeriod data))
    (when-let [data (lookup-entry config id :validity-period)]
      (. builder validityPeriod data))
    (.build builder)))


(defn cfn-template-enrollment-flags-v2-property-builder
  "The cfn-template-enrollment-flags-v2-property-builder function buildes out new instances of 
CfnTemplate$EnrollmentFlagsV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableKeyReuseOnNtTokenKeysetStorageFull` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-reuse-on-nt-token-keyset-storage-full` |
| `includeSymmetricAlgorithms` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-symmetric-algorithms` |
| `noSecurityExtension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-security-extension` |
| `removeInvalidCertificateFromPersonalStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-invalid-certificate-from-personal-store` |
| `userInteractionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-interaction-required` |"
  [stack id config]
  (let [builder (CfnTemplate$EnrollmentFlagsV2Property$Builder.)]
    (when-let [data (lookup-entry config id :enable-key-reuse-on-nt-token-keyset-storage-full)]
      (. builder enableKeyReuseOnNtTokenKeysetStorageFull data))
    (when-let [data (lookup-entry config id :include-symmetric-algorithms)]
      (. builder includeSymmetricAlgorithms data))
    (when-let [data (lookup-entry config id :no-security-extension)]
      (. builder noSecurityExtension data))
    (when-let [data (lookup-entry config id :remove-invalid-certificate-from-personal-store)]
      (. builder removeInvalidCertificateFromPersonalStore data))
    (when-let [data (lookup-entry config id :user-interaction-required)]
      (. builder userInteractionRequired data))
    (.build builder)))


(defn cfn-template-enrollment-flags-v3-property-builder
  "The cfn-template-enrollment-flags-v3-property-builder function buildes out new instances of 
CfnTemplate$EnrollmentFlagsV3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableKeyReuseOnNtTokenKeysetStorageFull` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-reuse-on-nt-token-keyset-storage-full` |
| `includeSymmetricAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-symmetric-algorithms` |
| `noSecurityExtension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-security-extension` |
| `removeInvalidCertificateFromPersonalStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-invalid-certificate-from-personal-store` |
| `userInteractionRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-interaction-required` |"
  [stack id config]
  (let [builder (CfnTemplate$EnrollmentFlagsV3Property$Builder.)]
    (when-let [data (lookup-entry config id :enable-key-reuse-on-nt-token-keyset-storage-full)]
      (. builder enableKeyReuseOnNtTokenKeysetStorageFull data))
    (when-let [data (lookup-entry config id :include-symmetric-algorithms)]
      (. builder includeSymmetricAlgorithms data))
    (when-let [data (lookup-entry config id :no-security-extension)]
      (. builder noSecurityExtension data))
    (when-let [data (lookup-entry config id :remove-invalid-certificate-from-personal-store)]
      (. builder removeInvalidCertificateFromPersonalStore data))
    (when-let [data (lookup-entry config id :user-interaction-required)]
      (. builder userInteractionRequired data))
    (.build builder)))


(defn cfn-template-enrollment-flags-v4-property-builder
  "The cfn-template-enrollment-flags-v4-property-builder function buildes out new instances of 
CfnTemplate$EnrollmentFlagsV4Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableKeyReuseOnNtTokenKeysetStorageFull` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-reuse-on-nt-token-keyset-storage-full` |
| `includeSymmetricAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-symmetric-algorithms` |
| `noSecurityExtension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-security-extension` |
| `removeInvalidCertificateFromPersonalStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-invalid-certificate-from-personal-store` |
| `userInteractionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-interaction-required` |"
  [stack id config]
  (let [builder (CfnTemplate$EnrollmentFlagsV4Property$Builder.)]
    (when-let [data (lookup-entry config id :enable-key-reuse-on-nt-token-keyset-storage-full)]
      (. builder enableKeyReuseOnNtTokenKeysetStorageFull data))
    (when-let [data (lookup-entry config id :include-symmetric-algorithms)]
      (. builder includeSymmetricAlgorithms data))
    (when-let [data (lookup-entry config id :no-security-extension)]
      (. builder noSecurityExtension data))
    (when-let [data (lookup-entry config id :remove-invalid-certificate-from-personal-store)]
      (. builder removeInvalidCertificateFromPersonalStore data))
    (when-let [data (lookup-entry config id :user-interaction-required)]
      (. builder userInteractionRequired data))
    (.build builder)))


(defn cfn-template-extensions-v2-property-builder
  "The cfn-template-extensions-v2-property-builder function buildes out new instances of 
CfnTemplate$ExtensionsV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPolicies` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ApplicationPoliciesProperty | [[cdk.support/lookup-entry]] | `:application-policies` |
| `keyUsage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-usage` |"
  [stack id config]
  (let [builder (CfnTemplate$ExtensionsV2Property$Builder.)]
    (when-let [data (lookup-entry config id :application-policies)]
      (. builder applicationPolicies data))
    (when-let [data (lookup-entry config id :key-usage)]
      (. builder keyUsage data))
    (.build builder)))


(defn cfn-template-extensions-v3-property-builder
  "The cfn-template-extensions-v3-property-builder function buildes out new instances of 
CfnTemplate$ExtensionsV3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-policies` |
| `keyUsage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-usage` |"
  [stack id config]
  (let [builder (CfnTemplate$ExtensionsV3Property$Builder.)]
    (when-let [data (lookup-entry config id :application-policies)]
      (. builder applicationPolicies data))
    (when-let [data (lookup-entry config id :key-usage)]
      (. builder keyUsage data))
    (.build builder)))


(defn cfn-template-extensions-v4-property-builder
  "The cfn-template-extensions-v4-property-builder function buildes out new instances of 
CfnTemplate$ExtensionsV4Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-policies` |
| `keyUsage` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsageProperty | [[cdk.support/lookup-entry]] | `:key-usage` |"
  [stack id config]
  (let [builder (CfnTemplate$ExtensionsV4Property$Builder.)]
    (when-let [data (lookup-entry config id :application-policies)]
      (. builder applicationPolicies data))
    (when-let [data (lookup-entry config id :key-usage)]
      (. builder keyUsage data))
    (.build builder)))


(defn cfn-template-general-flags-v2-property-builder
  "The cfn-template-general-flags-v2-property-builder function buildes out new instances of 
CfnTemplate$GeneralFlagsV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnrollment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-enrollment` |
| `machineType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:machine-type` |"
  [stack id config]
  (let [builder (CfnTemplate$GeneralFlagsV2Property$Builder.)]
    (when-let [data (lookup-entry config id :auto-enrollment)]
      (. builder autoEnrollment data))
    (when-let [data (lookup-entry config id :machine-type)]
      (. builder machineType data))
    (.build builder)))


(defn cfn-template-general-flags-v3-property-builder
  "The cfn-template-general-flags-v3-property-builder function buildes out new instances of 
CfnTemplate$GeneralFlagsV3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnrollment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enrollment` |
| `machineType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:machine-type` |"
  [stack id config]
  (let [builder (CfnTemplate$GeneralFlagsV3Property$Builder.)]
    (when-let [data (lookup-entry config id :auto-enrollment)]
      (. builder autoEnrollment data))
    (when-let [data (lookup-entry config id :machine-type)]
      (. builder machineType data))
    (.build builder)))


(defn cfn-template-general-flags-v4-property-builder
  "The cfn-template-general-flags-v4-property-builder function buildes out new instances of 
CfnTemplate$GeneralFlagsV4Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnrollment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enrollment` |
| `machineType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:machine-type` |"
  [stack id config]
  (let [builder (CfnTemplate$GeneralFlagsV4Property$Builder.)]
    (when-let [data (lookup-entry config id :auto-enrollment)]
      (. builder autoEnrollment data))
    (when-let [data (lookup-entry config id :machine-type)]
      (. builder machineType data))
    (.build builder)))


(defn cfn-template-group-access-control-entry-access-rights-property-builder
  "The cfn-template-group-access-control-entry-access-rights-property-builder function buildes out new instances of 
CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnroll` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-enroll` |
| `enroll` | java.lang.String | [[cdk.support/lookup-entry]] | `:enroll` |"
  [stack id config]
  (let [builder (CfnTemplateGroupAccessControlEntry$AccessRightsProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-enroll)]
      (. builder autoEnroll data))
    (when-let [data (lookup-entry config id :enroll)]
      (. builder enroll data))
    (.build builder)))


(defn cfn-template-group-access-control-entry-builder
  "The cfn-template-group-access-control-entry-builder function buildes out new instances of 
CfnTemplateGroupAccessControlEntry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRights` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry$AccessRightsProperty | [[cdk.support/lookup-entry]] | `:access-rights` |
| `groupDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-display-name` |
| `groupSecurityIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-security-identifier` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |"
  [stack id config]
  (let [builder (CfnTemplateGroupAccessControlEntry$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-rights)]
      (. builder accessRights data))
    (when-let [data (lookup-entry config id :group-display-name)]
      (. builder groupDisplayName data))
    (when-let [data (lookup-entry config id :group-security-identifier)]
      (. builder groupSecurityIdentifier data))
    (when-let [data (lookup-entry config id :template-arn)]
      (. builder templateArn data))
    (.build builder)))


(defn cfn-template-group-access-control-entry-props-builder
  "The cfn-template-group-access-control-entry-props-builder function buildes out new instances of 
CfnTemplateGroupAccessControlEntryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRights` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry$AccessRightsProperty | [[cdk.support/lookup-entry]] | `:access-rights` |
| `groupDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-display-name` |
| `groupSecurityIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-security-identifier` |
| `templateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-arn` |"
  [stack id config]
  (let [builder (CfnTemplateGroupAccessControlEntryProps$Builder.)]
    (when-let [data (lookup-entry config id :access-rights)]
      (. builder accessRights data))
    (when-let [data (lookup-entry config id :group-display-name)]
      (. builder groupDisplayName data))
    (when-let [data (lookup-entry config id :group-security-identifier)]
      (. builder groupSecurityIdentifier data))
    (when-let [data (lookup-entry config id :template-arn)]
      (. builder templateArn data))
    (.build builder)))


(defn cfn-template-key-usage-flags-property-builder
  "The cfn-template-key-usage-flags-property-builder function buildes out new instances of 
CfnTemplate$KeyUsageFlagsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataEncipherment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-encipherment` |
| `digitalSignature` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:digital-signature` |
| `keyAgreement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-agreement` |
| `keyEncipherment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-encipherment` |
| `nonRepudiation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:non-repudiation` |"
  [stack id config]
  (let [builder (CfnTemplate$KeyUsageFlagsProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-encipherment)]
      (. builder dataEncipherment data))
    (when-let [data (lookup-entry config id :digital-signature)]
      (. builder digitalSignature data))
    (when-let [data (lookup-entry config id :key-agreement)]
      (. builder keyAgreement data))
    (when-let [data (lookup-entry config id :key-encipherment)]
      (. builder keyEncipherment data))
    (when-let [data (lookup-entry config id :non-repudiation)]
      (. builder nonRepudiation data))
    (.build builder)))


(defn cfn-template-key-usage-property-builder
  "The cfn-template-key-usage-property-builder function buildes out new instances of 
CfnTemplate$KeyUsageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `critical` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:critical` |
| `usageFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsageFlagsProperty | [[cdk.support/lookup-entry]] | `:usage-flags` |"
  [stack id config]
  (let [builder (CfnTemplate$KeyUsageProperty$Builder.)]
    (when-let [data (lookup-entry config id :critical)]
      (. builder critical data))
    (when-let [data (lookup-entry config id :usage-flags)]
      (. builder usageFlags data))
    (.build builder)))


(defn cfn-template-key-usage-property-flags-property-builder
  "The cfn-template-key-usage-property-flags-property-builder function buildes out new instances of 
CfnTemplate$KeyUsagePropertyFlagsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decrypt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:decrypt` |
| `keyAgreement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:key-agreement` |
| `sign` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sign` |"
  [stack id config]
  (let [builder (CfnTemplate$KeyUsagePropertyFlagsProperty$Builder.)]
    (when-let [data (lookup-entry config id :decrypt)]
      (. builder decrypt data))
    (when-let [data (lookup-entry config id :key-agreement)]
      (. builder keyAgreement data))
    (when-let [data (lookup-entry config id :sign)]
      (. builder sign data))
    (.build builder)))


(defn cfn-template-key-usage-property-property-builder
  "The cfn-template-key-usage-property-property-builder function buildes out new instances of 
CfnTemplate$KeyUsagePropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-flags` |
| `propertyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-type` |"
  [stack id config]
  (let [builder (CfnTemplate$KeyUsagePropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :property-flags)]
      (. builder propertyFlags data))
    (when-let [data (lookup-entry config id :property-type)]
      (. builder propertyType data))
    (.build builder)))


(defn cfn-template-private-key-attributes-v2-property-builder
  "The cfn-template-private-key-attributes-v2-property-builder function buildes out new instances of 
CfnTemplate$PrivateKeyAttributesV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cryptoProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:crypto-providers` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `minimalKeyLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimal-key-length` |"
  [stack id config]
  (let [builder (CfnTemplate$PrivateKeyAttributesV2Property$Builder.)]
    (when-let [data (lookup-entry config id :crypto-providers)]
      (. builder cryptoProviders data))
    (when-let [data (lookup-entry config id :key-spec)]
      (. builder keySpec data))
    (when-let [data (lookup-entry config id :minimal-key-length)]
      (. builder minimalKeyLength data))
    (.build builder)))


(defn cfn-template-private-key-attributes-v3-property-builder
  "The cfn-template-private-key-attributes-v3-property-builder function buildes out new instances of 
CfnTemplate$PrivateKeyAttributesV3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `cryptoProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:crypto-providers` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `keyUsageProperty` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsagePropertyProperty | [[cdk.support/lookup-entry]] | `:key-usage-property` |
| `minimalKeyLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimal-key-length` |"
  [stack id config]
  (let [builder (CfnTemplate$PrivateKeyAttributesV3Property$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :crypto-providers)]
      (. builder cryptoProviders data))
    (when-let [data (lookup-entry config id :key-spec)]
      (. builder keySpec data))
    (when-let [data (lookup-entry config id :key-usage-property)]
      (. builder keyUsageProperty data))
    (when-let [data (lookup-entry config id :minimal-key-length)]
      (. builder minimalKeyLength data))
    (.build builder)))


(defn cfn-template-private-key-attributes-v4-property-builder
  "The cfn-template-private-key-attributes-v4-property-builder function buildes out new instances of 
CfnTemplate$PrivateKeyAttributesV4Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `cryptoProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:crypto-providers` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `keyUsageProperty` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$KeyUsagePropertyProperty | [[cdk.support/lookup-entry]] | `:key-usage-property` |
| `minimalKeyLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimal-key-length` |"
  [stack id config]
  (let [builder (CfnTemplate$PrivateKeyAttributesV4Property$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :crypto-providers)]
      (. builder cryptoProviders data))
    (when-let [data (lookup-entry config id :key-spec)]
      (. builder keySpec data))
    (when-let [data (lookup-entry config id :key-usage-property)]
      (. builder keyUsageProperty data))
    (when-let [data (lookup-entry config id :minimal-key-length)]
      (. builder minimalKeyLength data))
    (.build builder)))


(defn cfn-template-private-key-flags-v2-property-builder
  "The cfn-template-private-key-flags-v2-property-builder function buildes out new instances of 
CfnTemplate$PrivateKeyFlagsV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-version` |
| `exportableKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable-key` |
| `strongKeyProtectionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:strong-key-protection-required` |"
  [stack id config]
  (let [builder (CfnTemplate$PrivateKeyFlagsV2Property$Builder.)]
    (when-let [data (lookup-entry config id :client-version)]
      (. builder clientVersion data))
    (when-let [data (lookup-entry config id :exportable-key)]
      (. builder exportableKey data))
    (when-let [data (lookup-entry config id :strong-key-protection-required)]
      (. builder strongKeyProtectionRequired data))
    (.build builder)))


(defn cfn-template-private-key-flags-v3-property-builder
  "The cfn-template-private-key-flags-v3-property-builder function buildes out new instances of 
CfnTemplate$PrivateKeyFlagsV3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-version` |
| `exportableKey` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exportable-key` |
| `requireAlternateSignatureAlgorithm` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-alternate-signature-algorithm` |
| `strongKeyProtectionRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:strong-key-protection-required` |"
  [stack id config]
  (let [builder (CfnTemplate$PrivateKeyFlagsV3Property$Builder.)]
    (when-let [data (lookup-entry config id :client-version)]
      (. builder clientVersion data))
    (when-let [data (lookup-entry config id :exportable-key)]
      (. builder exportableKey data))
    (when-let [data (lookup-entry config id :require-alternate-signature-algorithm)]
      (. builder requireAlternateSignatureAlgorithm data))
    (when-let [data (lookup-entry config id :strong-key-protection-required)]
      (. builder strongKeyProtectionRequired data))
    (.build builder)))


(defn cfn-template-private-key-flags-v4-property-builder
  "The cfn-template-private-key-flags-v4-property-builder function buildes out new instances of 
CfnTemplate$PrivateKeyFlagsV4Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-version` |
| `exportableKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable-key` |
| `requireAlternateSignatureAlgorithm` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-alternate-signature-algorithm` |
| `requireSameKeyRenewal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-same-key-renewal` |
| `strongKeyProtectionRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:strong-key-protection-required` |
| `useLegacyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-legacy-provider` |"
  [stack id config]
  (let [builder (CfnTemplate$PrivateKeyFlagsV4Property$Builder.)]
    (when-let [data (lookup-entry config id :client-version)]
      (. builder clientVersion data))
    (when-let [data (lookup-entry config id :exportable-key)]
      (. builder exportableKey data))
    (when-let [data (lookup-entry config id :require-alternate-signature-algorithm)]
      (. builder requireAlternateSignatureAlgorithm data))
    (when-let [data (lookup-entry config id :require-same-key-renewal)]
      (. builder requireSameKeyRenewal data))
    (when-let [data (lookup-entry config id :strong-key-protection-required)]
      (. builder strongKeyProtectionRequired data))
    (when-let [data (lookup-entry config id :use-legacy-provider)]
      (. builder useLegacyProvider data))
    (.build builder)))


(defn cfn-template-props-builder
  "The cfn-template-props-builder function buildes out new instances of 
CfnTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reenrollAllCertificateHolders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reenroll-all-certificate-holders` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :connector-arn)]
      (. builder connectorArn data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reenroll-all-certificate-holders)]
      (. builder reenrollAllCertificateHolders data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-template-subject-name-flags-v2-property-builder
  "The cfn-template-subject-name-flags-v2-property-builder function buildes out new instances of 
CfnTemplate$SubjectNameFlagsV2Property$Builder using the provided configuration.  Each field is set as follows:

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
| `sanRequireUpn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:san-require-upn` |"
  [stack id config]
  (let [builder (CfnTemplate$SubjectNameFlagsV2Property$Builder.)]
    (when-let [data (lookup-entry config id :require-common-name)]
      (. builder requireCommonName data))
    (when-let [data (lookup-entry config id :require-directory-path)]
      (. builder requireDirectoryPath data))
    (when-let [data (lookup-entry config id :require-dns-as-cn)]
      (. builder requireDnsAsCn data))
    (when-let [data (lookup-entry config id :require-email)]
      (. builder requireEmail data))
    (when-let [data (lookup-entry config id :san-require-directory-guid)]
      (. builder sanRequireDirectoryGuid data))
    (when-let [data (lookup-entry config id :san-require-dns)]
      (. builder sanRequireDns data))
    (when-let [data (lookup-entry config id :san-require-domain-dns)]
      (. builder sanRequireDomainDns data))
    (when-let [data (lookup-entry config id :san-require-email)]
      (. builder sanRequireEmail data))
    (when-let [data (lookup-entry config id :san-require-spn)]
      (. builder sanRequireSpn data))
    (when-let [data (lookup-entry config id :san-require-upn)]
      (. builder sanRequireUpn data))
    (.build builder)))


(defn cfn-template-subject-name-flags-v3-property-builder
  "The cfn-template-subject-name-flags-v3-property-builder function buildes out new instances of 
CfnTemplate$SubjectNameFlagsV3Property$Builder using the provided configuration.  Each field is set as follows:

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
| `sanRequireUpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-upn` |"
  [stack id config]
  (let [builder (CfnTemplate$SubjectNameFlagsV3Property$Builder.)]
    (when-let [data (lookup-entry config id :require-common-name)]
      (. builder requireCommonName data))
    (when-let [data (lookup-entry config id :require-directory-path)]
      (. builder requireDirectoryPath data))
    (when-let [data (lookup-entry config id :require-dns-as-cn)]
      (. builder requireDnsAsCn data))
    (when-let [data (lookup-entry config id :require-email)]
      (. builder requireEmail data))
    (when-let [data (lookup-entry config id :san-require-directory-guid)]
      (. builder sanRequireDirectoryGuid data))
    (when-let [data (lookup-entry config id :san-require-dns)]
      (. builder sanRequireDns data))
    (when-let [data (lookup-entry config id :san-require-domain-dns)]
      (. builder sanRequireDomainDns data))
    (when-let [data (lookup-entry config id :san-require-email)]
      (. builder sanRequireEmail data))
    (when-let [data (lookup-entry config id :san-require-spn)]
      (. builder sanRequireSpn data))
    (when-let [data (lookup-entry config id :san-require-upn)]
      (. builder sanRequireUpn data))
    (.build builder)))


(defn cfn-template-subject-name-flags-v4-property-builder
  "The cfn-template-subject-name-flags-v4-property-builder function buildes out new instances of 
CfnTemplate$SubjectNameFlagsV4Property$Builder using the provided configuration.  Each field is set as follows:

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
| `sanRequireUpn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:san-require-upn` |"
  [stack id config]
  (let [builder (CfnTemplate$SubjectNameFlagsV4Property$Builder.)]
    (when-let [data (lookup-entry config id :require-common-name)]
      (. builder requireCommonName data))
    (when-let [data (lookup-entry config id :require-directory-path)]
      (. builder requireDirectoryPath data))
    (when-let [data (lookup-entry config id :require-dns-as-cn)]
      (. builder requireDnsAsCn data))
    (when-let [data (lookup-entry config id :require-email)]
      (. builder requireEmail data))
    (when-let [data (lookup-entry config id :san-require-directory-guid)]
      (. builder sanRequireDirectoryGuid data))
    (when-let [data (lookup-entry config id :san-require-dns)]
      (. builder sanRequireDns data))
    (when-let [data (lookup-entry config id :san-require-domain-dns)]
      (. builder sanRequireDomainDns data))
    (when-let [data (lookup-entry config id :san-require-email)]
      (. builder sanRequireEmail data))
    (when-let [data (lookup-entry config id :san-require-spn)]
      (. builder sanRequireSpn data))
    (when-let [data (lookup-entry config id :san-require-upn)]
      (. builder sanRequireUpn data))
    (.build builder)))


(defn cfn-template-template-definition-property-builder
  "The cfn-template-template-definition-property-builder function buildes out new instances of 
CfnTemplate$TemplateDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateV2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-v2` |
| `templateV3` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$TemplateV3Property | [[cdk.support/lookup-entry]] | `:template-v3` |
| `templateV4` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-v4` |"
  [stack id config]
  (let [builder (CfnTemplate$TemplateDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :template-v2)]
      (. builder templateV2 data))
    (when-let [data (lookup-entry config id :template-v3)]
      (. builder templateV3 data))
    (when-let [data (lookup-entry config id :template-v4)]
      (. builder templateV4 data))
    (.build builder)))


(defn cfn-template-template-v2-property-builder
  "The cfn-template-template-v2-property-builder function buildes out new instances of 
CfnTemplate$TemplateV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateValidity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-validity` |
| `enrollmentFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enrollment-flags` |
| `extensions` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$ExtensionsV2Property | [[cdk.support/lookup-entry]] | `:extensions` |
| `generalFlags` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$GeneralFlagsV2Property | [[cdk.support/lookup-entry]] | `:general-flags` |
| `privateKeyAttributes` | software.amazon.awscdk.services.pcaconnectorad.CfnTemplate$PrivateKeyAttributesV2Property | [[cdk.support/lookup-entry]] | `:private-key-attributes` |
| `privateKeyFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-key-flags` |
| `subjectNameFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subject-name-flags` |
| `supersededTemplates` | java.util.List | [[cdk.support/lookup-entry]] | `:superseded-templates` |"
  [stack id config]
  (let [builder (CfnTemplate$TemplateV2Property$Builder.)]
    (when-let [data (lookup-entry config id :certificate-validity)]
      (. builder certificateValidity data))
    (when-let [data (lookup-entry config id :enrollment-flags)]
      (. builder enrollmentFlags data))
    (when-let [data (lookup-entry config id :extensions)]
      (. builder extensions data))
    (when-let [data (lookup-entry config id :general-flags)]
      (. builder generalFlags data))
    (when-let [data (lookup-entry config id :private-key-attributes)]
      (. builder privateKeyAttributes data))
    (when-let [data (lookup-entry config id :private-key-flags)]
      (. builder privateKeyFlags data))
    (when-let [data (lookup-entry config id :subject-name-flags)]
      (. builder subjectNameFlags data))
    (when-let [data (lookup-entry config id :superseded-templates)]
      (. builder supersededTemplates data))
    (.build builder)))


(defn cfn-template-template-v3-property-builder
  "The cfn-template-template-v3-property-builder function buildes out new instances of 
CfnTemplate$TemplateV3Property$Builder using the provided configuration.  Each field is set as follows:

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
| `supersededTemplates` | java.util.List | [[cdk.support/lookup-entry]] | `:superseded-templates` |"
  [stack id config]
  (let [builder (CfnTemplate$TemplateV3Property$Builder.)]
    (when-let [data (lookup-entry config id :certificate-validity)]
      (. builder certificateValidity data))
    (when-let [data (lookup-entry config id :enrollment-flags)]
      (. builder enrollmentFlags data))
    (when-let [data (lookup-entry config id :extensions)]
      (. builder extensions data))
    (when-let [data (lookup-entry config id :general-flags)]
      (. builder generalFlags data))
    (when-let [data (lookup-entry config id :hash-algorithm)]
      (. builder hashAlgorithm data))
    (when-let [data (lookup-entry config id :private-key-attributes)]
      (. builder privateKeyAttributes data))
    (when-let [data (lookup-entry config id :private-key-flags)]
      (. builder privateKeyFlags data))
    (when-let [data (lookup-entry config id :subject-name-flags)]
      (. builder subjectNameFlags data))
    (when-let [data (lookup-entry config id :superseded-templates)]
      (. builder supersededTemplates data))
    (.build builder)))


(defn cfn-template-template-v4-property-builder
  "The cfn-template-template-v4-property-builder function buildes out new instances of 
CfnTemplate$TemplateV4Property$Builder using the provided configuration.  Each field is set as follows:

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
| `supersededTemplates` | java.util.List | [[cdk.support/lookup-entry]] | `:superseded-templates` |"
  [stack id config]
  (let [builder (CfnTemplate$TemplateV4Property$Builder.)]
    (when-let [data (lookup-entry config id :certificate-validity)]
      (. builder certificateValidity data))
    (when-let [data (lookup-entry config id :enrollment-flags)]
      (. builder enrollmentFlags data))
    (when-let [data (lookup-entry config id :extensions)]
      (. builder extensions data))
    (when-let [data (lookup-entry config id :general-flags)]
      (. builder generalFlags data))
    (when-let [data (lookup-entry config id :hash-algorithm)]
      (. builder hashAlgorithm data))
    (when-let [data (lookup-entry config id :private-key-attributes)]
      (. builder privateKeyAttributes data))
    (when-let [data (lookup-entry config id :private-key-flags)]
      (. builder privateKeyFlags data))
    (when-let [data (lookup-entry config id :subject-name-flags)]
      (. builder subjectNameFlags data))
    (when-let [data (lookup-entry config id :superseded-templates)]
      (. builder supersededTemplates data))
    (.build builder)))


(defn cfn-template-validity-period-property-builder
  "The cfn-template-validity-period-property-builder function buildes out new instances of 
CfnTemplate$ValidityPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `periodType` | java.lang.String | [[cdk.support/lookup-entry]] | `:period-type` |"
  [stack id config]
  (let [builder (CfnTemplate$ValidityPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :period-type)]
      (. builder periodType data))
    (.build builder)))