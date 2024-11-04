(ns cdk.api.services.workspacesweb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.workspacesweb package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.workspacesweb CfnBrowserSettings$Builder
                                                          CfnBrowserSettingsProps$Builder
                                                          CfnIdentityProvider$Builder
                                                          CfnIdentityProviderProps$Builder
                                                          CfnIpAccessSettings$Builder
                                                          CfnIpAccessSettings$IpRuleProperty$Builder
                                                          CfnIpAccessSettingsProps$Builder
                                                          CfnNetworkSettings$Builder
                                                          CfnNetworkSettingsProps$Builder
                                                          CfnPortal$Builder
                                                          CfnPortalProps$Builder
                                                          CfnTrustStore$Builder
                                                          CfnTrustStoreProps$Builder
                                                          CfnUserAccessLoggingSettings$Builder
                                                          CfnUserAccessLoggingSettingsProps$Builder
                                                          CfnUserSettings$Builder
                                                          CfnUserSettings$CookieSpecificationProperty$Builder
                                                          CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder
                                                          CfnUserSettingsProps$Builder]))


(defn cfn-browser-settings-builder
  "The cfn-browser-settings-builder function buildes out new instances of 
CfnBrowserSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `browserPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:browser-policy` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBrowserSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :browser-policy)]
      (. builder browserPolicy data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-browser-settings-props-builder
  "The cfn-browser-settings-props-builder function buildes out new instances of 
CfnBrowserSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `browserPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:browser-policy` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBrowserSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :browser-policy)]
      (. builder browserPolicy data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-identity-provider-builder
  "The cfn-identity-provider-builder function buildes out new instances of 
CfnIdentityProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityProviderDetails` | java.util.Map | [[cdk.support/lookup-entry]] | `:identity-provider-details` |
| `identityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-name` |
| `identityProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-type` |
| `portalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-arn` |"
  [stack id config]
  (let [builder (CfnIdentityProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :identity-provider-details)]
      (. builder identityProviderDetails data))
    (when-let [data (lookup-entry config id :identity-provider-name)]
      (. builder identityProviderName data))
    (when-let [data (lookup-entry config id :identity-provider-type)]
      (. builder identityProviderType data))
    (when-let [data (lookup-entry config id :portal-arn)]
      (. builder portalArn data))
    (.build builder)))


(defn cfn-identity-provider-props-builder
  "The cfn-identity-provider-props-builder function buildes out new instances of 
CfnIdentityProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityProviderDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:identity-provider-details` |
| `identityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-name` |
| `identityProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-type` |
| `portalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-arn` |"
  [stack id config]
  (let [builder (CfnIdentityProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :identity-provider-details)]
      (. builder identityProviderDetails data))
    (when-let [data (lookup-entry config id :identity-provider-name)]
      (. builder identityProviderName data))
    (when-let [data (lookup-entry config id :identity-provider-type)]
      (. builder identityProviderType data))
    (when-let [data (lookup-entry config id :portal-arn)]
      (. builder portalArn data))
    (.build builder)))


(defn cfn-ip-access-settings-builder
  "The cfn-ip-access-settings-builder function buildes out new instances of 
CfnIpAccessSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `ipRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIpAccessSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :ip-rules)]
      (. builder ipRules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ip-access-settings-ip-rule-property-builder
  "The cfn-ip-access-settings-ip-rule-property-builder function buildes out new instances of 
CfnIpAccessSettings$IpRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-range` |"
  [stack id config]
  (let [builder (CfnIpAccessSettings$IpRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ip-range)]
      (. builder ipRange data))
    (.build builder)))


(defn cfn-ip-access-settings-props-builder
  "The cfn-ip-access-settings-props-builder function buildes out new instances of 
CfnIpAccessSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `ipRules` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIpAccessSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :ip-rules)]
      (. builder ipRules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-settings-builder
  "The cfn-network-settings-builder function buildes out new instances of 
CfnNetworkSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnNetworkSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-network-settings-props-builder
  "The cfn-network-settings-props-builder function buildes out new instances of 
CfnNetworkSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnNetworkSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-portal-builder
  "The cfn-portal-builder function buildes out new instances of 
CfnPortal$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `browserSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:browser-settings-arn` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `ipAccessSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-access-settings-arn` |
| `maxConcurrentSessions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-sessions` |
| `networkSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-settings-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |
| `userAccessLoggingSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-access-logging-settings-arn` |
| `userSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-settings-arn` |"
  [stack id config]
  (let [builder (CfnPortal$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :browser-settings-arn)]
      (. builder browserSettingsArn data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :ip-access-settings-arn)]
      (. builder ipAccessSettingsArn data))
    (when-let [data (lookup-entry config id :max-concurrent-sessions)]
      (. builder maxConcurrentSessions data))
    (when-let [data (lookup-entry config id :network-settings-arn)]
      (. builder networkSettingsArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trust-store-arn)]
      (. builder trustStoreArn data))
    (when-let [data (lookup-entry config id :user-access-logging-settings-arn)]
      (. builder userAccessLoggingSettingsArn data))
    (when-let [data (lookup-entry config id :user-settings-arn)]
      (. builder userSettingsArn data))
    (.build builder)))


(defn cfn-portal-props-builder
  "The cfn-portal-props-builder function buildes out new instances of 
CfnPortalProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `browserSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:browser-settings-arn` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `ipAccessSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-access-settings-arn` |
| `maxConcurrentSessions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-sessions` |
| `networkSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-settings-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-store-arn` |
| `userAccessLoggingSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-access-logging-settings-arn` |
| `userSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-settings-arn` |"
  [stack id config]
  (let [builder (CfnPortalProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :browser-settings-arn)]
      (. builder browserSettingsArn data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :ip-access-settings-arn)]
      (. builder ipAccessSettingsArn data))
    (when-let [data (lookup-entry config id :max-concurrent-sessions)]
      (. builder maxConcurrentSessions data))
    (when-let [data (lookup-entry config id :network-settings-arn)]
      (. builder networkSettingsArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trust-store-arn)]
      (. builder trustStoreArn data))
    (when-let [data (lookup-entry config id :user-access-logging-settings-arn)]
      (. builder userAccessLoggingSettingsArn data))
    (when-let [data (lookup-entry config id :user-settings-arn)]
      (. builder userSettingsArn data))
    (.build builder)))


(defn cfn-trust-store-builder
  "The cfn-trust-store-builder function buildes out new instances of 
CfnTrustStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateList` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrustStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-list)]
      (. builder certificateList data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-trust-store-props-builder
  "The cfn-trust-store-props-builder function buildes out new instances of 
CfnTrustStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateList` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrustStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-list)]
      (. builder certificateList data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-access-logging-settings-builder
  "The cfn-user-access-logging-settings-builder function buildes out new instances of 
CfnUserAccessLoggingSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kinesis-stream-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnUserAccessLoggingSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :kinesis-stream-arn)]
      (. builder kinesisStreamArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-access-logging-settings-props-builder
  "The cfn-user-access-logging-settings-props-builder function buildes out new instances of 
CfnUserAccessLoggingSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kinesis-stream-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnUserAccessLoggingSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :kinesis-stream-arn)]
      (. builder kinesisStreamArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-settings-builder
  "The cfn-user-settings-builder function buildes out new instances of 
CfnUserSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `cookieSynchronizationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookie-synchronization-configuration` |
| `copyAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-allowed` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `disconnectTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disconnect-timeout-in-minutes` |
| `downloadAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:download-allowed` |
| `idleDisconnectTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-disconnect-timeout-in-minutes` |
| `pasteAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:paste-allowed` |
| `printAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:print-allowed` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uploadAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:upload-allowed` |"
  [stack id config]
  (let [builder (CfnUserSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :cookie-synchronization-configuration)]
      (. builder cookieSynchronizationConfiguration data))
    (when-let [data (lookup-entry config id :copy-allowed)]
      (. builder copyAllowed data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :disconnect-timeout-in-minutes)]
      (. builder disconnectTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :download-allowed)]
      (. builder downloadAllowed data))
    (when-let [data (lookup-entry config id :idle-disconnect-timeout-in-minutes)]
      (. builder idleDisconnectTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :paste-allowed)]
      (. builder pasteAllowed data))
    (when-let [data (lookup-entry config id :print-allowed)]
      (. builder printAllowed data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :upload-allowed)]
      (. builder uploadAllowed data))
    (.build builder)))


(defn cfn-user-settings-cookie-specification-property-builder
  "The cfn-user-settings-cookie-specification-property-builder function buildes out new instances of 
CfnUserSettings$CookieSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnUserSettings$CookieSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-user-settings-cookie-synchronization-configuration-property-builder
  "The cfn-user-settings-cookie-synchronization-configuration-property-builder function buildes out new instances of 
CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowlist` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowlist` |
| `blocklist` | java.util.List | [[cdk.support/lookup-entry]] | `:blocklist` |"
  [stack id config]
  (let [builder (CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowlist)]
      (. builder allowlist data))
    (when-let [data (lookup-entry config id :blocklist)]
      (. builder blocklist data))
    (.build builder)))


(defn cfn-user-settings-props-builder
  "The cfn-user-settings-props-builder function buildes out new instances of 
CfnUserSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `cookieSynchronizationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookie-synchronization-configuration` |
| `copyAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:copy-allowed` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `disconnectTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disconnect-timeout-in-minutes` |
| `downloadAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:download-allowed` |
| `idleDisconnectTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-disconnect-timeout-in-minutes` |
| `pasteAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:paste-allowed` |
| `printAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:print-allowed` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uploadAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:upload-allowed` |"
  [stack id config]
  (let [builder (CfnUserSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :cookie-synchronization-configuration)]
      (. builder cookieSynchronizationConfiguration data))
    (when-let [data (lookup-entry config id :copy-allowed)]
      (. builder copyAllowed data))
    (when-let [data (lookup-entry config id :customer-managed-key)]
      (. builder customerManagedKey data))
    (when-let [data (lookup-entry config id :disconnect-timeout-in-minutes)]
      (. builder disconnectTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :download-allowed)]
      (. builder downloadAllowed data))
    (when-let [data (lookup-entry config id :idle-disconnect-timeout-in-minutes)]
      (. builder idleDisconnectTimeoutInMinutes data))
    (when-let [data (lookup-entry config id :paste-allowed)]
      (. builder pasteAllowed data))
    (when-let [data (lookup-entry config id :print-allowed)]
      (. builder printAllowed data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :upload-allowed)]
      (. builder uploadAllowed data))
    (.build builder)))