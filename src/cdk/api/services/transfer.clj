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


(defn cfn-agreement-builder>
  "The cfn-agreement-builder> function updates a CfnAgreement$Builder instance using the provided configuration.
  The function takes the CfnAgreement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `baseDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-profile-id` |
| `partnerProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-profile-id` |
| `serverId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-id` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAgreement$Builder builder id config]
  (when-some [data (lookup-entry config id :access-role)]
    (. builder accessRole data))
  (when-some [data (lookup-entry config id :base-directory)]
    (. builder baseDirectory data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :local-profile-id)]
    (. builder localProfileId data))
  (when-some [data (lookup-entry config id :partner-profile-id)]
    (. builder partnerProfileId data))
  (when-some [data (lookup-entry config id :server-id)]
    (. builder serverId data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-agreement-builder
  "Creates a  `CfnAgreement$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-agreement-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-agreement-builder> (CfnAgreement$Builder/create scope (name id)) id config))


(defn cfn-agreement-props-builder>
  "The cfn-agreement-props-builder> function updates a CfnAgreementProps$Builder instance using the provided configuration.
  The function takes the CfnAgreementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `baseDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-directory` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-profile-id` |
| `partnerProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-profile-id` |
| `serverId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-id` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAgreementProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-role)]
    (. builder accessRole data))
  (when-some [data (lookup-entry config id :base-directory)]
    (. builder baseDirectory data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :local-profile-id)]
    (. builder localProfileId data))
  (when-some [data (lookup-entry config id :partner-profile-id)]
    (. builder partnerProfileId data))
  (when-some [data (lookup-entry config id :server-id)]
    (. builder serverId data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-agreement-props-builder
  "Creates a  `CfnAgreementProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-agreement-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-agreement-props-builder> (new CfnAgreementProps$Builder) id config))


(defn cfn-certificate-builder>
  "The cfn-certificate-builder> function updates a CfnCertificate$Builder instance using the provided configuration.
  The function takes the CfnCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-date` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inactiveDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:inactive-date` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `usage` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage` |
"
  [^CfnCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :active-date)]
    (. builder activeDate data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :inactive-date)]
    (. builder inactiveDate data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :usage)]
    (. builder usage data))
  (.build builder))


(defn cfn-certificate-builder
  "Creates a  `CfnCertificate$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-certificate-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-certificate-builder> (CfnCertificate$Builder/create scope (name id)) id config))


(defn cfn-certificate-props-builder>
  "The cfn-certificate-props-builder> function updates a CfnCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-date` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inactiveDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:inactive-date` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `usage` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage` |
"
  [^CfnCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :active-date)]
    (. builder activeDate data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :inactive-date)]
    (. builder inactiveDate data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :usage)]
    (. builder usage data))
  (.build builder))


(defn cfn-certificate-props-builder
  "Creates a  `CfnCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-certificate-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-certificate-props-builder> (new CfnCertificateProps$Builder) id config))


(defn cfn-connector-as2-config-property-builder>
  "The cfn-connector-as2-config-property-builder> function updates a CfnConnector$As2ConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$As2ConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `signingAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-algorithm` |
"
  [^CfnConnector$As2ConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :basic-auth-secret-id)]
    (. builder basicAuthSecretId data))
  (when-some [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-some [data (lookup-entry config id :encryption-algorithm)]
    (. builder encryptionAlgorithm data))
  (when-some [data (lookup-entry config id :local-profile-id)]
    (. builder localProfileId data))
  (when-some [data (lookup-entry config id :mdn-response)]
    (. builder mdnResponse data))
  (when-some [data (lookup-entry config id :mdn-signing-algorithm)]
    (. builder mdnSigningAlgorithm data))
  (when-some [data (lookup-entry config id :message-subject)]
    (. builder messageSubject data))
  (when-some [data (lookup-entry config id :partner-profile-id)]
    (. builder partnerProfileId data))
  (when-some [data (lookup-entry config id :signing-algorithm)]
    (. builder signingAlgorithm data))
  (.build builder))


(defn cfn-connector-as2-config-property-builder
  "Creates a  `CfnConnector$As2ConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-as2-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-as2-config-property-builder> (new CfnConnector$As2ConfigProperty$Builder) id config))


(defn cfn-connector-builder>
  "The cfn-connector-builder> function updates a CfnConnector$Builder instance using the provided configuration.
  The function takes the CfnConnector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `as2Config` | java.lang.Object | [[cdk.support/lookup-entry]] | `:as2-config` |
| `loggingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-role` |
| `securityPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy-name` |
| `sftpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sftp-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnConnector$Builder builder id config]
  (when-some [data (lookup-entry config id :access-role)]
    (. builder accessRole data))
  (when-some [data (lookup-entry config id :as2-config)]
    (. builder as2Config data))
  (when-some [data (lookup-entry config id :logging-role)]
    (. builder loggingRole data))
  (when-some [data (lookup-entry config id :security-policy-name)]
    (. builder securityPolicyName data))
  (when-some [data (lookup-entry config id :sftp-config)]
    (. builder sftpConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-connector-builder
  "Creates a  `CfnConnector$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-connector-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-connector-builder> (CfnConnector$Builder/create scope (name id)) id config))


(defn cfn-connector-props-builder>
  "The cfn-connector-props-builder> function updates a CfnConnectorProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role` |
| `as2Config` | java.lang.Object | [[cdk.support/lookup-entry]] | `:as2-config` |
| `loggingRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-role` |
| `securityPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy-name` |
| `sftpConfig` | software.amazon.awscdk.services.transfer.CfnConnector$SftpConfigProperty | [[cdk.support/lookup-entry]] | `:sftp-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnConnectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-role)]
    (. builder accessRole data))
  (when-some [data (lookup-entry config id :as2-config)]
    (. builder as2Config data))
  (when-some [data (lookup-entry config id :logging-role)]
    (. builder loggingRole data))
  (when-some [data (lookup-entry config id :security-policy-name)]
    (. builder securityPolicyName data))
  (when-some [data (lookup-entry config id :sftp-config)]
    (. builder sftpConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-connector-props-builder
  "Creates a  `CfnConnectorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-props-builder> (new CfnConnectorProps$Builder) id config))


(defn cfn-connector-sftp-config-property-builder>
  "The cfn-connector-sftp-config-property-builder> function updates a CfnConnector$SftpConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$SftpConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `trustedHostKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-host-keys` |
| `userSecretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-secret-id` |
"
  [^CfnConnector$SftpConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :trusted-host-keys)]
    (. builder trustedHostKeys data))
  (when-some [data (lookup-entry config id :user-secret-id)]
    (. builder userSecretId data))
  (.build builder))


(defn cfn-connector-sftp-config-property-builder
  "Creates a  `CfnConnector$SftpConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-connector-sftp-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-connector-sftp-config-property-builder> (new CfnConnector$SftpConfigProperty$Builder) id config))


(defn cfn-profile-builder>
  "The cfn-profile-builder> function updates a CfnProfile$Builder instance using the provided configuration.
  The function takes the CfnProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `as2Id` | java.lang.String | [[cdk.support/lookup-entry]] | `:as2-id` |
| `certificateIds` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-ids` |
| `profileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :as2-id)]
    (. builder as2Id data))
  (when-some [data (lookup-entry config id :certificate-ids)]
    (. builder certificateIds data))
  (when-some [data (lookup-entry config id :profile-type)]
    (. builder profileType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-builder
  "Creates a  `CfnProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-profile-builder> (CfnProfile$Builder/create scope (name id)) id config))


(defn cfn-profile-props-builder>
  "The cfn-profile-props-builder> function updates a CfnProfileProps$Builder instance using the provided configuration.
  The function takes the CfnProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `as2Id` | java.lang.String | [[cdk.support/lookup-entry]] | `:as2-id` |
| `certificateIds` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-ids` |
| `profileType` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :as2-id)]
    (. builder as2Id data))
  (when-some [data (lookup-entry config id :certificate-ids)]
    (. builder certificateIds data))
  (when-some [data (lookup-entry config id :profile-type)]
    (. builder profileType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profile-props-builder
  "Creates a  `CfnProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profile-props-builder> (new CfnProfileProps$Builder) id config))


(defn cfn-server-builder>
  "The cfn-server-builder> function updates a CfnServer$Builder instance using the provided configuration.
  The function takes the CfnServer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflowDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow-details` |
"
  [^CfnServer$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :endpoint-details)]
    (. builder endpointDetails data))
  (when-some [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-some [data (lookup-entry config id :identity-provider-details)]
    (. builder identityProviderDetails data))
  (when-some [data (lookup-entry config id :identity-provider-type)]
    (. builder identityProviderType data))
  (when-some [data (lookup-entry config id :logging-role)]
    (. builder loggingRole data))
  (when-some [data (lookup-entry config id :post-authentication-login-banner)]
    (. builder postAuthenticationLoginBanner data))
  (when-some [data (lookup-entry config id :pre-authentication-login-banner)]
    (. builder preAuthenticationLoginBanner data))
  (when-some [data (lookup-entry config id :protocol-details)]
    (. builder protocolDetails data))
  (when-some [data (lookup-entry config id :protocols)]
    (. builder protocols data))
  (when-some [data (lookup-entry config id :s3-storage-options)]
    (. builder s3StorageOptions data))
  (when-some [data (lookup-entry config id :security-policy-name)]
    (. builder securityPolicyName data))
  (when-some [data (lookup-entry config id :structured-log-destinations)]
    (. builder structuredLogDestinations data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflow-details)]
    (. builder workflowDetails data))
  (.build builder))


(defn cfn-server-builder
  "Creates a  `CfnServer$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-server-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-server-builder> (CfnServer$Builder/create scope (name id)) id config))


(defn cfn-server-endpoint-details-property-builder>
  "The cfn-server-endpoint-details-property-builder> function updates a CfnServer$EndpointDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$EndpointDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressAllocationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:address-allocation-ids` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnServer$EndpointDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address-allocation-ids)]
    (. builder addressAllocationIds data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-server-endpoint-details-property-builder
  "Creates a  `CfnServer$EndpointDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-endpoint-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-endpoint-details-property-builder> (new CfnServer$EndpointDetailsProperty$Builder) id config))


(defn cfn-server-identity-provider-details-property-builder>
  "The cfn-server-identity-provider-details-property-builder> function updates a CfnServer$IdentityProviderDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$IdentityProviderDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
| `invocationRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-role` |
| `sftpAuthenticationMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:sftp-authentication-methods` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnServer$IdentityProviderDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (when-some [data (lookup-entry config id :invocation-role)]
    (. builder invocationRole data))
  (when-some [data (lookup-entry config id :sftp-authentication-methods)]
    (. builder sftpAuthenticationMethods data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-server-identity-provider-details-property-builder
  "Creates a  `CfnServer$IdentityProviderDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-identity-provider-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-identity-provider-details-property-builder> (new CfnServer$IdentityProviderDetailsProperty$Builder) id config))


(defn cfn-server-props-builder>
  "The cfn-server-props-builder> function updates a CfnServerProps$Builder instance using the provided configuration.
  The function takes the CfnServerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflowDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflow-details` |
"
  [^CfnServerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :endpoint-details)]
    (. builder endpointDetails data))
  (when-some [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-some [data (lookup-entry config id :identity-provider-details)]
    (. builder identityProviderDetails data))
  (when-some [data (lookup-entry config id :identity-provider-type)]
    (. builder identityProviderType data))
  (when-some [data (lookup-entry config id :logging-role)]
    (. builder loggingRole data))
  (when-some [data (lookup-entry config id :post-authentication-login-banner)]
    (. builder postAuthenticationLoginBanner data))
  (when-some [data (lookup-entry config id :pre-authentication-login-banner)]
    (. builder preAuthenticationLoginBanner data))
  (when-some [data (lookup-entry config id :protocol-details)]
    (. builder protocolDetails data))
  (when-some [data (lookup-entry config id :protocols)]
    (. builder protocols data))
  (when-some [data (lookup-entry config id :s3-storage-options)]
    (. builder s3StorageOptions data))
  (when-some [data (lookup-entry config id :security-policy-name)]
    (. builder securityPolicyName data))
  (when-some [data (lookup-entry config id :structured-log-destinations)]
    (. builder structuredLogDestinations data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflow-details)]
    (. builder workflowDetails data))
  (.build builder))


(defn cfn-server-props-builder
  "Creates a  `CfnServerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-props-builder> (new CfnServerProps$Builder) id config))


(defn cfn-server-protocol-details-property-builder>
  "The cfn-server-protocol-details-property-builder> function updates a CfnServer$ProtocolDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$ProtocolDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `as2Transports` | java.util.List | [[cdk.support/lookup-entry]] | `:as2-transports` |
| `passiveIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:passive-ip` |
| `setStatOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-stat-option` |
| `tlsSessionResumptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-session-resumption-mode` |
"
  [^CfnServer$ProtocolDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :as2-transports)]
    (. builder as2Transports data))
  (when-some [data (lookup-entry config id :passive-ip)]
    (. builder passiveIp data))
  (when-some [data (lookup-entry config id :set-stat-option)]
    (. builder setStatOption data))
  (when-some [data (lookup-entry config id :tls-session-resumption-mode)]
    (. builder tlsSessionResumptionMode data))
  (.build builder))


(defn cfn-server-protocol-details-property-builder
  "Creates a  `CfnServer$ProtocolDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-protocol-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-protocol-details-property-builder> (new CfnServer$ProtocolDetailsProperty$Builder) id config))


(defn cfn-server-s3-storage-options-property-builder>
  "The cfn-server-s3-storage-options-property-builder> function updates a CfnServer$S3StorageOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$S3StorageOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryListingOptimization` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-listing-optimization` |
"
  [^CfnServer$S3StorageOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-listing-optimization)]
    (. builder directoryListingOptimization data))
  (.build builder))


(defn cfn-server-s3-storage-options-property-builder
  "Creates a  `CfnServer$S3StorageOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-s3-storage-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-s3-storage-options-property-builder> (new CfnServer$S3StorageOptionsProperty$Builder) id config))


(defn cfn-server-workflow-detail-property-builder>
  "The cfn-server-workflow-detail-property-builder> function updates a CfnServer$WorkflowDetailProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$WorkflowDetailProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `workflowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-id` |
"
  [^CfnServer$WorkflowDetailProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :workflow-id)]
    (. builder workflowId data))
  (.build builder))


(defn cfn-server-workflow-detail-property-builder
  "Creates a  `CfnServer$WorkflowDetailProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-workflow-detail-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-workflow-detail-property-builder> (new CfnServer$WorkflowDetailProperty$Builder) id config))


(defn cfn-server-workflow-details-property-builder>
  "The cfn-server-workflow-details-property-builder> function updates a CfnServer$WorkflowDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$WorkflowDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onPartialUpload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-partial-upload` |
| `onUpload` | java.util.List | [[cdk.support/lookup-entry]] | `:on-upload` |
"
  [^CfnServer$WorkflowDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :on-partial-upload)]
    (. builder onPartialUpload data))
  (when-some [data (lookup-entry config id :on-upload)]
    (. builder onUpload data))
  (.build builder))


(defn cfn-server-workflow-details-property-builder
  "Creates a  `CfnServer$WorkflowDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-workflow-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-workflow-details-property-builder> (new CfnServer$WorkflowDetailsProperty$Builder) id config))


(defn cfn-user-builder>
  "The cfn-user-builder> function updates a CfnUser$Builder instance using the provided configuration.
  The function takes the CfnUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUser$Builder builder id config]
  (when-some [data (lookup-entry config id :home-directory)]
    (. builder homeDirectory data))
  (when-some [data (lookup-entry config id :home-directory-mappings)]
    (. builder homeDirectoryMappings data))
  (when-some [data (lookup-entry config id :home-directory-type)]
    (. builder homeDirectoryType data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :posix-profile)]
    (. builder posixProfile data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :server-id)]
    (. builder serverId data))
  (when-some [data (lookup-entry config id :ssh-public-keys)]
    (. builder sshPublicKeys data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-builder
  "Creates a  `CfnUser$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-user-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-builder> (CfnUser$Builder/create scope (name id)) id config))


(defn cfn-user-home-directory-map-entry-property-builder>
  "The cfn-user-home-directory-map-entry-property-builder> function updates a CfnUser$HomeDirectoryMapEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$HomeDirectoryMapEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entry` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnUser$HomeDirectoryMapEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :entry)]
    (. builder entry data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-user-home-directory-map-entry-property-builder
  "Creates a  `CfnUser$HomeDirectoryMapEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-home-directory-map-entry-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-home-directory-map-entry-property-builder> (new CfnUser$HomeDirectoryMapEntryProperty$Builder) id config))


(defn cfn-user-posix-profile-property-builder>
  "The cfn-user-posix-profile-property-builder> function updates a CfnUser$PosixProfileProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$PosixProfileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `secondaryGids` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-gids` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^CfnUser$PosixProfileProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-some [data (lookup-entry config id :secondary-gids)]
    (. builder secondaryGids data))
  (when-some [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn cfn-user-posix-profile-property-builder
  "Creates a  `CfnUser$PosixProfileProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-posix-profile-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-posix-profile-property-builder> (new CfnUser$PosixProfileProperty$Builder) id config))


(defn cfn-user-props-builder>
  "The cfn-user-props-builder> function updates a CfnUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserProps$Builder builder id config]
  (when-some [data (lookup-entry config id :home-directory)]
    (. builder homeDirectory data))
  (when-some [data (lookup-entry config id :home-directory-mappings)]
    (. builder homeDirectoryMappings data))
  (when-some [data (lookup-entry config id :home-directory-type)]
    (. builder homeDirectoryType data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :posix-profile)]
    (. builder posixProfile data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :server-id)]
    (. builder serverId data))
  (when-some [data (lookup-entry config id :ssh-public-keys)]
    (. builder sshPublicKeys data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-props-builder
  "Creates a  `CfnUserProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-props-builder> (new CfnUserProps$Builder) id config))


(defn cfn-workflow-builder>
  "The cfn-workflow-builder> function updates a CfnWorkflow$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `onExceptionSteps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-exception-steps` |
| `steps` | java.util.List | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflow$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :on-exception-steps)]
    (. builder onExceptionSteps data))
  (when-some [data (lookup-entry config id :steps)]
    (. builder steps data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-builder
  "Creates a  `CfnWorkflow$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-workflow-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workflow-builder> (CfnWorkflow$Builder/create scope (name id)) id config))


(defn cfn-workflow-copy-step-details-property-builder>
  "The cfn-workflow-copy-step-details-property-builder> function updates a CfnWorkflow$CopyStepDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$CopyStepDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationFileLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-file-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overwriteExisting` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite-existing` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
"
  [^CfnWorkflow$CopyStepDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-file-location)]
    (. builder destinationFileLocation data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :overwrite-existing)]
    (. builder overwriteExisting data))
  (when-some [data (lookup-entry config id :source-file-location)]
    (. builder sourceFileLocation data))
  (.build builder))


(defn cfn-workflow-copy-step-details-property-builder
  "Creates a  `CfnWorkflow$CopyStepDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-copy-step-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-copy-step-details-property-builder> (new CfnWorkflow$CopyStepDetailsProperty$Builder) id config))


(defn cfn-workflow-custom-step-details-property-builder>
  "The cfn-workflow-custom-step-details-property-builder> function updates a CfnWorkflow$CustomStepDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$CustomStepDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `timeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-seconds` |
"
  [^CfnWorkflow$CustomStepDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source-file-location)]
    (. builder sourceFileLocation data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (when-some [data (lookup-entry config id :timeout-seconds)]
    (. builder timeoutSeconds data))
  (.build builder))


(defn cfn-workflow-custom-step-details-property-builder
  "Creates a  `CfnWorkflow$CustomStepDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-custom-step-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-custom-step-details-property-builder> (new CfnWorkflow$CustomStepDetailsProperty$Builder) id config))


(defn cfn-workflow-decrypt-step-details-property-builder>
  "The cfn-workflow-decrypt-step-details-property-builder> function updates a CfnWorkflow$DecryptStepDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$DecryptStepDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationFileLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-file-location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overwriteExisting` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite-existing` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWorkflow$DecryptStepDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-file-location)]
    (. builder destinationFileLocation data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :overwrite-existing)]
    (. builder overwriteExisting data))
  (when-some [data (lookup-entry config id :source-file-location)]
    (. builder sourceFileLocation data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-workflow-decrypt-step-details-property-builder
  "Creates a  `CfnWorkflow$DecryptStepDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-decrypt-step-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-decrypt-step-details-property-builder> (new CfnWorkflow$DecryptStepDetailsProperty$Builder) id config))


(defn cfn-workflow-delete-step-details-property-builder>
  "The cfn-workflow-delete-step-details-property-builder> function updates a CfnWorkflow$DeleteStepDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$DeleteStepDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
"
  [^CfnWorkflow$DeleteStepDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source-file-location)]
    (. builder sourceFileLocation data))
  (.build builder))


(defn cfn-workflow-delete-step-details-property-builder
  "Creates a  `CfnWorkflow$DeleteStepDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-delete-step-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-delete-step-details-property-builder> (new CfnWorkflow$DeleteStepDetailsProperty$Builder) id config))


(defn cfn-workflow-efs-input-file-location-property-builder>
  "The cfn-workflow-efs-input-file-location-property-builder> function updates a CfnWorkflow$EfsInputFileLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$EfsInputFileLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnWorkflow$EfsInputFileLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-workflow-efs-input-file-location-property-builder
  "Creates a  `CfnWorkflow$EfsInputFileLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-efs-input-file-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-efs-input-file-location-property-builder> (new CfnWorkflow$EfsInputFileLocationProperty$Builder) id config))


(defn cfn-workflow-input-file-location-property-builder>
  "The cfn-workflow-input-file-location-property-builder> function updates a CfnWorkflow$InputFileLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$InputFileLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileLocation` | software.amazon.awscdk.services.transfer.CfnWorkflow$EfsInputFileLocationProperty | [[cdk.support/lookup-entry]] | `:efs-file-location` |
| `s3FileLocation` | software.amazon.awscdk.services.transfer.CfnWorkflow$S3InputFileLocationProperty | [[cdk.support/lookup-entry]] | `:s3-file-location` |
"
  [^CfnWorkflow$InputFileLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :efs-file-location)]
    (. builder efsFileLocation data))
  (when-some [data (lookup-entry config id :s3-file-location)]
    (. builder s3FileLocation data))
  (.build builder))


(defn cfn-workflow-input-file-location-property-builder
  "Creates a  `CfnWorkflow$InputFileLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-input-file-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-input-file-location-property-builder> (new CfnWorkflow$InputFileLocationProperty$Builder) id config))


(defn cfn-workflow-props-builder>
  "The cfn-workflow-props-builder> function updates a CfnWorkflowProps$Builder instance using the provided configuration.
  The function takes the CfnWorkflowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `onExceptionSteps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-exception-steps` |
| `steps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:steps` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :on-exception-steps)]
    (. builder onExceptionSteps data))
  (when-some [data (lookup-entry config id :steps)]
    (. builder steps data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-props-builder
  "Creates a  `CfnWorkflowProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-props-builder> (new CfnWorkflowProps$Builder) id config))


(defn cfn-workflow-s3-file-location-property-builder>
  "The cfn-workflow-s3-file-location-property-builder> function updates a CfnWorkflow$S3FileLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$S3FileLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3FileLocation` | software.amazon.awscdk.services.transfer.CfnWorkflow$S3InputFileLocationProperty | [[cdk.support/lookup-entry]] | `:s3-file-location` |
"
  [^CfnWorkflow$S3FileLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-file-location)]
    (. builder s3FileLocation data))
  (.build builder))


(defn cfn-workflow-s3-file-location-property-builder
  "Creates a  `CfnWorkflow$S3FileLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-s3-file-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-s3-file-location-property-builder> (new CfnWorkflow$S3FileLocationProperty$Builder) id config))


(defn cfn-workflow-s3-input-file-location-property-builder>
  "The cfn-workflow-s3-input-file-location-property-builder> function updates a CfnWorkflow$S3InputFileLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$S3InputFileLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnWorkflow$S3InputFileLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-workflow-s3-input-file-location-property-builder
  "Creates a  `CfnWorkflow$S3InputFileLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-s3-input-file-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-s3-input-file-location-property-builder> (new CfnWorkflow$S3InputFileLocationProperty$Builder) id config))


(defn cfn-workflow-s3-tag-property-builder>
  "The cfn-workflow-s3-tag-property-builder> function updates a CfnWorkflow$S3TagProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$S3TagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnWorkflow$S3TagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-workflow-s3-tag-property-builder
  "Creates a  `CfnWorkflow$S3TagProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-s3-tag-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-s3-tag-property-builder> (new CfnWorkflow$S3TagProperty$Builder) id config))


(defn cfn-workflow-tag-step-details-property-builder>
  "The cfn-workflow-tag-step-details-property-builder> function updates a CfnWorkflow$TagStepDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$TagStepDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sourceFileLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-file-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkflow$TagStepDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source-file-location)]
    (. builder sourceFileLocation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-workflow-tag-step-details-property-builder
  "Creates a  `CfnWorkflow$TagStepDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-tag-step-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-tag-step-details-property-builder> (new CfnWorkflow$TagStepDetailsProperty$Builder) id config))


(defn cfn-workflow-workflow-step-property-builder>
  "The cfn-workflow-workflow-step-property-builder> function updates a CfnWorkflow$WorkflowStepProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$WorkflowStepProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:copy-step-details` |
| `customStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-step-details` |
| `decryptStepDetails` | software.amazon.awscdk.services.transfer.CfnWorkflow$DecryptStepDetailsProperty | [[cdk.support/lookup-entry]] | `:decrypt-step-details` |
| `deleteStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delete-step-details` |
| `tagStepDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tag-step-details` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWorkflow$WorkflowStepProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :copy-step-details)]
    (. builder copyStepDetails data))
  (when-some [data (lookup-entry config id :custom-step-details)]
    (. builder customStepDetails data))
  (when-some [data (lookup-entry config id :decrypt-step-details)]
    (. builder decryptStepDetails data))
  (when-some [data (lookup-entry config id :delete-step-details)]
    (. builder deleteStepDetails data))
  (when-some [data (lookup-entry config id :tag-step-details)]
    (. builder tagStepDetails data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-workflow-workflow-step-property-builder
  "Creates a  `CfnWorkflow$WorkflowStepProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workflow-workflow-step-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workflow-workflow-step-property-builder> (new CfnWorkflow$WorkflowStepProperty$Builder) id config))