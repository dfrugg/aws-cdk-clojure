(ns cdk.api.services.transfer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.transfer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.transfer CfnAgreement$Builder
                                                     CfnAgreementProps$Builder
                                                     CfnCertificate$Builder
                                                     CfnCertificateProps$Builder
                                                     CfnConnector$As2ConfigProperty$Builder
                                                     CfnConnector$Builder
                                                     CfnConnector$SftpConfigProperty$Builder
                                                     CfnConnectorProps$Builder
                                                     CfnProfile$Builder
                                                     CfnProfileProps$Builder
                                                     CfnServer$Builder
                                                     CfnServer$EndpointDetailsProperty$Builder
                                                     CfnServer$IdentityProviderDetailsProperty$Builder
                                                     CfnServer$ProtocolDetailsProperty$Builder
                                                     CfnServer$S3StorageOptionsProperty$Builder
                                                     CfnServer$WorkflowDetailProperty$Builder
                                                     CfnServer$WorkflowDetailsProperty$Builder
                                                     CfnServerProps$Builder
                                                     CfnUser$Builder
                                                     CfnUser$HomeDirectoryMapEntryProperty$Builder
                                                     CfnUser$PosixProfileProperty$Builder
                                                     CfnUserProps$Builder
                                                     CfnWorkflow$Builder
                                                     CfnWorkflow$CopyStepDetailsProperty$Builder
                                                     CfnWorkflow$CustomStepDetailsProperty$Builder
                                                     CfnWorkflow$DecryptStepDetailsProperty$Builder
                                                     CfnWorkflow$DeleteStepDetailsProperty$Builder
                                                     CfnWorkflow$EfsInputFileLocationProperty$Builder
                                                     CfnWorkflow$InputFileLocationProperty$Builder
                                                     CfnWorkflow$S3FileLocationProperty$Builder
                                                     CfnWorkflow$S3InputFileLocationProperty$Builder
                                                     CfnWorkflow$S3TagProperty$Builder
                                                     CfnWorkflow$TagStepDetailsProperty$Builder
                                                     CfnWorkflow$WorkflowStepProperty$Builder
                                                     CfnWorkflowProps$Builder]))


(defn cfn-agreement-builder
  "The cfn-agreement-builder function buildes out new instances of 
CfnAgreement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `baseDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-profile-id` |
| `partnerProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-profile-id` |
| `serverId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-id` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAgreement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-role)]
      (. builder accessRole data))
    (when-let [data (lookup-entry config id :base-directory)]
      (. builder baseDirectory data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :local-profile-id)]
      (. builder localProfileId data))
    (when-let [data (lookup-entry config id :partner-profile-id)]
      (. builder partnerProfileId data))
    (when-let [data (lookup-entry config id :server-id)]
      (. builder serverId data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-agreement-props-builder
  "The cfn-agreement-props-builder function buildes out new instances of 
CfnAgreementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `baseDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-profile-id` |
| `partnerProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-profile-id` |
| `serverId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-id` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAgreementProps$Builder.)]
    (when-let [data (lookup-entry config id :access-role)]
      (. builder accessRole data))
    (when-let [data (lookup-entry config id :base-directory)]
      (. builder baseDirectory data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :local-profile-id)]
      (. builder localProfileId data))
    (when-let [data (lookup-entry config id :partner-profile-id)]
      (. builder partnerProfileId data))
    (when-let [data (lookup-entry config id :server-id)]
      (. builder serverId data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-certificate-builder
  "The cfn-certificate-builder function buildes out new instances of 
CfnCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-date` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inactiveDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:inactive-date` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `usage` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage` |"
  [stack id config]
  (let [builder (CfnCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :active-date)]
      (. builder activeDate data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :inactive-date)]
      (. builder inactiveDate data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :usage)]
      (. builder usage data))
    (.build builder)))


(defn cfn-certificate-props-builder
  "The cfn-certificate-props-builder function buildes out new instances of 
CfnCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-date` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inactiveDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:inactive-date` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `usage` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage` |"
  [stack id config]
  (let [builder (CfnCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :active-date)]
      (. builder activeDate data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :inactive-date)]
      (. builder inactiveDate data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :usage)]
      (. builder usage data))
    (.build builder)))


(defn cfn-connector-as2-config-property-builder
  "The cfn-connector-as2-config-property-builder function buildes out new instances of 
CfnConnector$As2ConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basicAuthSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:basic-auth-secret-id` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `encryptionAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-algorithm` |
| `localProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-profile-id` |
| `mdnResponse` | java.lang.String | [[cdk.support/lookup-entry]] | `:mdn-response` |
| `mdnSigningAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:mdn-signing-algorithm` |
| `messageSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-subject` |
| `partnerProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-profile-id` |
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |"
  [stack id config]
  (let [builder (CfnConnector$As2ConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :basic-auth-secret-id)]
      (. builder basicAuthSecretId data))
    (when-let [data (lookup-entry config id :compression)]
      (. builder compression data))
    (when-let [data (lookup-entry config id :encryption-algorithm)]
      (. builder encryptionAlgorithm data))
    (when-let [data (lookup-entry config id :local-profile-id)]
      (. builder localProfileId data))
    (when-let [data (lookup-entry config id :mdn-response)]
      (. builder mdnResponse data))
    (when-let [data (lookup-entry config id :mdn-signing-algorithm)]
      (. builder mdnSigningAlgorithm data))
    (when-let [data (lookup-entry config id :message-subject)]
      (. builder messageSubject data))
    (when-let [data (lookup-entry config id :partner-profile-id)]
      (. builder partnerProfileId data))
    (when-let [data (lookup-entry config id :signing-algorithm)]
      (. builder signingAlgorithm data))
    (.build builder)))


(defn cfn-connector-builder
  "The cfn-connector-builder function buildes out new instances of 
CfnConnector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `as2Config` | java.lang.Object | [[cdk.support/lookup-entry]] | `:as2-config` |
| `loggingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-role` |
| `securityPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy-name` |
| `sftpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sftp-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnConnector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-role)]
      (. builder accessRole data))
    (when-let [data (lookup-entry config id :as2-config)]
      (. builder as2Config data))
    (when-let [data (lookup-entry config id :logging-role)]
      (. builder loggingRole data))
    (when-let [data (lookup-entry config id :security-policy-name)]
      (. builder securityPolicyName data))
    (when-let [data (lookup-entry config id :sftp-config)]
      (. builder sftpConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-connector-props-builder
  "The cfn-connector-props-builder function buildes out new instances of 
CfnConnectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `as2Config` | java.lang.Object | [[cdk.support/lookup-entry]] | `:as2-config` |
| `loggingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-role` |
| `securityPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy-name` |
| `sftpConfig` | software.amazon.awscdk.services.transfer.CfnConnector$SftpConfigProperty | [[cdk.support/lookup-entry]] | `:sftp-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnConnectorProps$Builder.)]
    (when-let [data (lookup-entry config id :access-role)]
      (. builder accessRole data))
    (when-let [data (lookup-entry config id :as2-config)]
      (. builder as2Config data))
    (when-let [data (lookup-entry config id :logging-role)]
      (. builder loggingRole data))
    (when-let [data (lookup-entry config id :security-policy-name)]
      (. builder securityPolicyName data))
    (when-let [data (lookup-entry config id :sftp-config)]
      (. builder sftpConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-connector-sftp-config-property-builder
  "The cfn-connector-sftp-config-property-builder function buildes out new instances of 
CfnConnector$SftpConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `trustedHostKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-host-keys` |
| `userSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-secret-id` |"
  [stack id config]
  (let [builder (CfnConnector$SftpConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :trusted-host-keys)]
      (. builder trustedHostKeys data))
    (when-let [data (lookup-entry config id :user-secret-id)]
      (. builder userSecretId data))
    (.build builder)))


(defn cfn-profile-builder
  "The cfn-profile-builder function buildes out new instances of 
CfnProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `as2Id` | java.lang.String | [[cdk.support/lookup-entry]] | `:as2-id` |
| `certificateIds` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-ids` |
| `profileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :as2-id)]
      (. builder as2Id data))
    (when-let [data (lookup-entry config id :certificate-ids)]
      (. builder certificateIds data))
    (when-let [data (lookup-entry config id :profile-type)]
      (. builder profileType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-profile-props-builder
  "The cfn-profile-props-builder function buildes out new instances of 
CfnProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `as2Id` | java.lang.String | [[cdk.support/lookup-entry]] | `:as2-id` |
| `certificateIds` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-ids` |
| `profileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :as2-id)]
      (. builder as2Id data))
    (when-let [data (lookup-entry config id :certificate-ids)]
      (. builder certificateIds data))
    (when-let [data (lookup-entry config id :profile-type)]
      (. builder profileType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-server-builder
  "The cfn-server-builder function buildes out new instances of 
CfnServer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `endpointDetails` | software.amazon.awscdk.services.transfer.CfnServer$EndpointDetailsProperty | [[cdk.support/lookup-entry]] | `:endpoint-details` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `identityProviderDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:identity-provider-details` |
| `identityProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-type` |
| `loggingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-role` |
| `postAuthenticationLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-authentication-login-banner` |
| `preAuthenticationLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-authentication-login-banner` |
| `protocolDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocol-details` |
| `protocols` | java.util.List | [[cdk.support/lookup-entry]] | `:protocols` |
| `s3StorageOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-storage-options` |
| `securityPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy-name` |
| `structuredLogDestinations` | java.util.List | [[cdk.support/lookup-entry]] | `:structured-log-destinations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow-details` |"
  [stack id config]
  (let [builder (CfnServer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :endpoint-details)]
      (. builder endpointDetails data))
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :identity-provider-details)]
      (. builder identityProviderDetails data))
    (when-let [data (lookup-entry config id :identity-provider-type)]
      (. builder identityProviderType data))
    (when-let [data (lookup-entry config id :logging-role)]
      (. builder loggingRole data))
    (when-let [data (lookup-entry config id :post-authentication-login-banner)]
      (. builder postAuthenticationLoginBanner data))
    (when-let [data (lookup-entry config id :pre-authentication-login-banner)]
      (. builder preAuthenticationLoginBanner data))
    (when-let [data (lookup-entry config id :protocol-details)]
      (. builder protocolDetails data))
    (when-let [data (lookup-entry config id :protocols)]
      (. builder protocols data))
    (when-let [data (lookup-entry config id :s3-storage-options)]
      (. builder s3StorageOptions data))
    (when-let [data (lookup-entry config id :security-policy-name)]
      (. builder securityPolicyName data))
    (when-let [data (lookup-entry config id :structured-log-destinations)]
      (. builder structuredLogDestinations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflow-details)]
      (. builder workflowDetails data))
    (.build builder)))


(defn cfn-server-endpoint-details-property-builder
  "The cfn-server-endpoint-details-property-builder function buildes out new instances of 
CfnServer$EndpointDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressAllocationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:address-allocation-ids` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnServer$EndpointDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :address-allocation-ids)]
      (. builder addressAllocationIds data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-server-identity-provider-details-property-builder
  "The cfn-server-identity-provider-details-property-builder function buildes out new instances of 
CfnServer$IdentityProviderDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
| `invocationRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-role` |
| `sftpAuthenticationMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:sftp-authentication-methods` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnServer$IdentityProviderDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (lookup-entry config id :invocation-role)]
      (. builder invocationRole data))
    (when-let [data (lookup-entry config id :sftp-authentication-methods)]
      (. builder sftpAuthenticationMethods data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-server-props-builder
  "The cfn-server-props-builder function buildes out new instances of 
CfnServerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `endpointDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-details` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `identityProviderDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:identity-provider-details` |
| `identityProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-type` |
| `loggingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-role` |
| `postAuthenticationLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-authentication-login-banner` |
| `preAuthenticationLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-authentication-login-banner` |
| `protocolDetails` | software.amazon.awscdk.services.transfer.CfnServer$ProtocolDetailsProperty | [[cdk.support/lookup-entry]] | `:protocol-details` |
| `protocols` | java.util.List | [[cdk.support/lookup-entry]] | `:protocols` |
| `s3StorageOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-storage-options` |
| `securityPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy-name` |
| `structuredLogDestinations` | java.util.List | [[cdk.support/lookup-entry]] | `:structured-log-destinations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow-details` |"
  [stack id config]
  (let [builder (CfnServerProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :endpoint-details)]
      (. builder endpointDetails data))
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :identity-provider-details)]
      (. builder identityProviderDetails data))
    (when-let [data (lookup-entry config id :identity-provider-type)]
      (. builder identityProviderType data))
    (when-let [data (lookup-entry config id :logging-role)]
      (. builder loggingRole data))
    (when-let [data (lookup-entry config id :post-authentication-login-banner)]
      (. builder postAuthenticationLoginBanner data))
    (when-let [data (lookup-entry config id :pre-authentication-login-banner)]
      (. builder preAuthenticationLoginBanner data))
    (when-let [data (lookup-entry config id :protocol-details)]
      (. builder protocolDetails data))
    (when-let [data (lookup-entry config id :protocols)]
      (. builder protocols data))
    (when-let [data (lookup-entry config id :s3-storage-options)]
      (. builder s3StorageOptions data))
    (when-let [data (lookup-entry config id :security-policy-name)]
      (. builder securityPolicyName data))
    (when-let [data (lookup-entry config id :structured-log-destinations)]
      (. builder structuredLogDestinations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflow-details)]
      (. builder workflowDetails data))
    (.build builder)))


(defn cfn-server-protocol-details-property-builder
  "The cfn-server-protocol-details-property-builder function buildes out new instances of 
CfnServer$ProtocolDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `as2Transports` | java.util.List | [[cdk.support/lookup-entry]] | `:as2-transports` |
| `passiveIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:passive-ip` |
| `setStatOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-stat-option` |
| `tlsSessionResumptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-session-resumption-mode` |"
  [stack id config]
  (let [builder (CfnServer$ProtocolDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :as2-transports)]
      (. builder as2Transports data))
    (when-let [data (lookup-entry config id :passive-ip)]
      (. builder passiveIp data))
    (when-let [data (lookup-entry config id :set-stat-option)]
      (. builder setStatOption data))
    (when-let [data (lookup-entry config id :tls-session-resumption-mode)]
      (. builder tlsSessionResumptionMode data))
    (.build builder)))


(defn cfn-server-s3-storage-options-property-builder
  "The cfn-server-s3-storage-options-property-builder function buildes out new instances of 
CfnServer$S3StorageOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryListingOptimization` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-listing-optimization` |"
  [stack id config]
  (let [builder (CfnServer$S3StorageOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-listing-optimization)]
      (. builder directoryListingOptimization data))
    (.build builder)))


(defn cfn-server-workflow-detail-property-builder
  "The cfn-server-workflow-detail-property-builder function buildes out new instances of 
CfnServer$WorkflowDetailProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `workflowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-id` |"
  [stack id config]
  (let [builder (CfnServer$WorkflowDetailProperty$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :workflow-id)]
      (. builder workflowId data))
    (.build builder)))


(defn cfn-server-workflow-details-property-builder
  "The cfn-server-workflow-details-property-builder function buildes out new instances of 
CfnServer$WorkflowDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onPartialUpload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-partial-upload` |
| `onUpload` | java.util.List | [[cdk.support/lookup-entry]] | `:on-upload` |"
  [stack id config]
  (let [builder (CfnServer$WorkflowDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-partial-upload)]
      (. builder onPartialUpload data))
    (when-let [data (lookup-entry config id :on-upload)]
      (. builder onUpload data))
    (.build builder)))


(defn cfn-user-builder
  "The cfn-user-builder function buildes out new instances of 
CfnUser$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `homeDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-directory` |
| `homeDirectoryMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:home-directory-mappings` |
| `homeDirectoryType` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-directory-type` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `posixProfile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:posix-profile` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `serverId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-id` |
| `sshPublicKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:ssh-public-keys` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUser$Builder/create stack id)]
    (when-let [data (lookup-entry config id :home-directory)]
      (. builder homeDirectory data))
    (when-let [data (lookup-entry config id :home-directory-mappings)]
      (. builder homeDirectoryMappings data))
    (when-let [data (lookup-entry config id :home-directory-type)]
      (. builder homeDirectoryType data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :posix-profile)]
      (. builder posixProfile data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :server-id)]
      (. builder serverId data))
    (when-let [data (lookup-entry config id :ssh-public-keys)]
      (. builder sshPublicKeys data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-home-directory-map-entry-property-builder
  "The cfn-user-home-directory-map-entry-property-builder function buildes out new instances of 
CfnUser$HomeDirectoryMapEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entry` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnUser$HomeDirectoryMapEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :entry)]
      (. builder entry data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-user-posix-profile-property-builder
  "The cfn-user-posix-profile-property-builder function buildes out new instances of 
CfnUser$PosixProfileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `secondaryGids` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-gids` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |"
  [stack id config]
  (let [builder (CfnUser$PosixProfileProperty$Builder.)]
    (when-let [data (lookup-entry config id :gid)]
      (. builder gid data))
    (when-let [data (lookup-entry config id :secondary-gids)]
      (. builder secondaryGids data))
    (when-let [data (lookup-entry config id :uid)]
      (. builder uid data))
    (.build builder)))


(defn cfn-user-props-builder
  "The cfn-user-props-builder function buildes out new instances of 
CfnUserProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `homeDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-directory` |
| `homeDirectoryMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:home-directory-mappings` |
| `homeDirectoryType` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-directory-type` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `posixProfile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:posix-profile` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `serverId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-id` |
| `sshPublicKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:ssh-public-keys` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUserProps$Builder.)]
    (when-let [data (lookup-entry config id :home-directory)]
      (. builder homeDirectory data))
    (when-let [data (lookup-entry config id :home-directory-mappings)]
      (. builder homeDirectoryMappings data))
    (when-let [data (lookup-entry config id :home-directory-type)]
      (. builder homeDirectoryType data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :posix-profile)]
      (. builder posixProfile data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :server-id)]
      (. builder serverId data))
    (when-let [data (lookup-entry config id :ssh-public-keys)]
      (. builder sshPublicKeys data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-workflow-builder
  "The cfn-workflow-builder function buildes out new instances of 
CfnWorkflow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `onExceptionSteps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-exception-steps` |
| `steps` | java.util.List | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :on-exception-steps)]
      (. builder onExceptionSteps data))
    (when-let [data (lookup-entry config id :steps)]
      (. builder steps data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workflow-copy-step-details-property-builder
  "The cfn-workflow-copy-step-details-property-builder function buildes out new instances of 
CfnWorkflow$CopyStepDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationFileLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-file-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overwriteExisting` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite-existing` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |"
  [stack id config]
  (let [builder (CfnWorkflow$CopyStepDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-file-location)]
      (. builder destinationFileLocation data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :overwrite-existing)]
      (. builder overwriteExisting data))
    (when-let [data (lookup-entry config id :source-file-location)]
      (. builder sourceFileLocation data))
    (.build builder)))


(defn cfn-workflow-custom-step-details-property-builder
  "The cfn-workflow-custom-step-details-property-builder function buildes out new instances of 
CfnWorkflow$CustomStepDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `timeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-seconds` |"
  [stack id config]
  (let [builder (CfnWorkflow$CustomStepDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source-file-location)]
      (. builder sourceFileLocation data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (when-let [data (lookup-entry config id :timeout-seconds)]
      (. builder timeoutSeconds data))
    (.build builder)))


(defn cfn-workflow-decrypt-step-details-property-builder
  "The cfn-workflow-decrypt-step-details-property-builder function buildes out new instances of 
CfnWorkflow$DecryptStepDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationFileLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-file-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overwriteExisting` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite-existing` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnWorkflow$DecryptStepDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-file-location)]
      (. builder destinationFileLocation data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :overwrite-existing)]
      (. builder overwriteExisting data))
    (when-let [data (lookup-entry config id :source-file-location)]
      (. builder sourceFileLocation data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-workflow-delete-step-details-property-builder
  "The cfn-workflow-delete-step-details-property-builder function buildes out new instances of 
CfnWorkflow$DeleteStepDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |"
  [stack id config]
  (let [builder (CfnWorkflow$DeleteStepDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source-file-location)]
      (. builder sourceFileLocation data))
    (.build builder)))


(defn cfn-workflow-efs-input-file-location-property-builder
  "The cfn-workflow-efs-input-file-location-property-builder function buildes out new instances of 
CfnWorkflow$EfsInputFileLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnWorkflow$EfsInputFileLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-workflow-input-file-location-property-builder
  "The cfn-workflow-input-file-location-property-builder function buildes out new instances of 
CfnWorkflow$InputFileLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileLocation` | software.amazon.awscdk.services.transfer.CfnWorkflow$EfsInputFileLocationProperty | [[cdk.support/lookup-entry]] | `:efs-file-location` |
| `s3FileLocation` | software.amazon.awscdk.services.transfer.CfnWorkflow$S3InputFileLocationProperty | [[cdk.support/lookup-entry]] | `:s3-file-location` |"
  [stack id config]
  (let [builder (CfnWorkflow$InputFileLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :efs-file-location)]
      (. builder efsFileLocation data))
    (when-let [data (lookup-entry config id :s3-file-location)]
      (. builder s3FileLocation data))
    (.build builder)))


(defn cfn-workflow-props-builder
  "The cfn-workflow-props-builder function buildes out new instances of 
CfnWorkflowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `onExceptionSteps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-exception-steps` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflowProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :on-exception-steps)]
      (. builder onExceptionSteps data))
    (when-let [data (lookup-entry config id :steps)]
      (. builder steps data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workflow-s3-file-location-property-builder
  "The cfn-workflow-s3-file-location-property-builder function buildes out new instances of 
CfnWorkflow$S3FileLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3FileLocation` | software.amazon.awscdk.services.transfer.CfnWorkflow$S3InputFileLocationProperty | [[cdk.support/lookup-entry]] | `:s3-file-location` |"
  [stack id config]
  (let [builder (CfnWorkflow$S3FileLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-file-location)]
      (. builder s3FileLocation data))
    (.build builder)))


(defn cfn-workflow-s3-input-file-location-property-builder
  "The cfn-workflow-s3-input-file-location-property-builder function buildes out new instances of 
CfnWorkflow$S3InputFileLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnWorkflow$S3InputFileLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-workflow-s3-tag-property-builder
  "The cfn-workflow-s3-tag-property-builder function buildes out new instances of 
CfnWorkflow$S3TagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnWorkflow$S3TagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-workflow-tag-step-details-property-builder
  "The cfn-workflow-tag-step-details-property-builder function buildes out new instances of 
CfnWorkflow$TagStepDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkflow$TagStepDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source-file-location)]
      (. builder sourceFileLocation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-workflow-workflow-step-property-builder
  "The cfn-workflow-workflow-step-property-builder function buildes out new instances of 
CfnWorkflow$WorkflowStepProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:copy-step-details` |
| `customStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-step-details` |
| `decryptStepDetails` | software.amazon.awscdk.services.transfer.CfnWorkflow$DecryptStepDetailsProperty | [[cdk.support/lookup-entry]] | `:decrypt-step-details` |
| `deleteStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delete-step-details` |
| `tagStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tag-step-details` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnWorkflow$WorkflowStepProperty$Builder.)]
    (when-let [data (lookup-entry config id :copy-step-details)]
      (. builder copyStepDetails data))
    (when-let [data (lookup-entry config id :custom-step-details)]
      (. builder customStepDetails data))
    (when-let [data (lookup-entry config id :decrypt-step-details)]
      (. builder decryptStepDetails data))
    (when-let [data (lookup-entry config id :delete-step-details)]
      (. builder deleteStepDetails data))
    (when-let [data (lookup-entry config id :tag-step-details)]
      (. builder tagStepDetails data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))