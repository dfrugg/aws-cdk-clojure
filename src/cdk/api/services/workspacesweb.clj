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


(defn build-cfn-browser-settings-builder
  "The build-cfn-browser-settings-builder function updates a CfnBrowserSettings$Builder instance using the provided configuration.
  The function takes the CfnBrowserSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `browserPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:browser-policy` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBrowserSettings$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-encryption-context)]
    (. builder additionalEncryptionContext data))
  (when-let [data (lookup-entry config id :browser-policy)]
    (. builder browserPolicy data))
  (when-let [data (lookup-entry config id :customer-managed-key)]
    (. builder customerManagedKey data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-browser-settings-builder
  "Creates a  `CfnBrowserSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-browser-settings-builder (CfnBrowserSettings$Builder/create scope (name id)) id config))


(defn build-cfn-browser-settings-props-builder
  "The build-cfn-browser-settings-props-builder function updates a CfnBrowserSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnBrowserSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `browserPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:browser-policy` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBrowserSettingsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-encryption-context)]
    (. builder additionalEncryptionContext data))
  (when-let [data (lookup-entry config id :browser-policy)]
    (. builder browserPolicy data))
  (when-let [data (lookup-entry config id :customer-managed-key)]
    (. builder customerManagedKey data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-browser-settings-props-builder
  "Creates a  `CfnBrowserSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-browser-settings-props-builder (new CfnBrowserSettingsProps$Builder) id config))


(defn build-cfn-identity-provider-builder
  "The build-cfn-identity-provider-builder function updates a CfnIdentityProvider$Builder instance using the provided configuration.
  The function takes the CfnIdentityProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityProviderDetails` | java.util.Map | [[cdk.support/lookup-entry]] | `:identity-provider-details` |
| `identityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-name` |
| `identityProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-type` |
| `portalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-arn` |
"
  [^CfnIdentityProvider$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-provider-details)]
    (. builder identityProviderDetails data))
  (when-let [data (lookup-entry config id :identity-provider-name)]
    (. builder identityProviderName data))
  (when-let [data (lookup-entry config id :identity-provider-type)]
    (. builder identityProviderType data))
  (when-let [data (lookup-entry config id :portal-arn)]
    (. builder portalArn data))
  (.build builder))


(defn cfn-identity-provider-builder
  "Creates a  `CfnIdentityProvider$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-identity-provider-builder (CfnIdentityProvider$Builder/create scope (name id)) id config))


(defn build-cfn-identity-provider-props-builder
  "The build-cfn-identity-provider-props-builder function updates a CfnIdentityProviderProps$Builder instance using the provided configuration.
  The function takes the CfnIdentityProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityProviderDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:identity-provider-details` |
| `identityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-name` |
| `identityProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-type` |
| `portalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-arn` |
"
  [^CfnIdentityProviderProps$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-provider-details)]
    (. builder identityProviderDetails data))
  (when-let [data (lookup-entry config id :identity-provider-name)]
    (. builder identityProviderName data))
  (when-let [data (lookup-entry config id :identity-provider-type)]
    (. builder identityProviderType data))
  (when-let [data (lookup-entry config id :portal-arn)]
    (. builder portalArn data))
  (.build builder))


(defn cfn-identity-provider-props-builder
  "Creates a  `CfnIdentityProviderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-identity-provider-props-builder (new CfnIdentityProviderProps$Builder) id config))


(defn build-cfn-ip-access-settings-builder
  "The build-cfn-ip-access-settings-builder function updates a CfnIpAccessSettings$Builder instance using the provided configuration.
  The function takes the CfnIpAccessSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `ipRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIpAccessSettings$Builder builder id config]
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
  (.build builder))


(defn cfn-ip-access-settings-builder
  "Creates a  `CfnIpAccessSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-ip-access-settings-builder (CfnIpAccessSettings$Builder/create scope (name id)) id config))


(defn build-cfn-ip-access-settings-ip-rule-property-builder
  "The build-cfn-ip-access-settings-ip-rule-property-builder function updates a CfnIpAccessSettings$IpRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnIpAccessSettings$IpRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-range` |
"
  [^CfnIpAccessSettings$IpRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :ip-range)]
    (. builder ipRange data))
  (.build builder))


(defn cfn-ip-access-settings-ip-rule-property-builder
  "Creates a  `CfnIpAccessSettings$IpRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ip-access-settings-ip-rule-property-builder (new CfnIpAccessSettings$IpRuleProperty$Builder) id config))


(defn build-cfn-ip-access-settings-props-builder
  "The build-cfn-ip-access-settings-props-builder function updates a CfnIpAccessSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnIpAccessSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `customerManagedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-managed-key` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `ipRules` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIpAccessSettingsProps$Builder builder id config]
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
  (.build builder))


(defn cfn-ip-access-settings-props-builder
  "Creates a  `CfnIpAccessSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-ip-access-settings-props-builder (new CfnIpAccessSettingsProps$Builder) id config))


(defn build-cfn-network-settings-builder
  "The build-cfn-network-settings-builder function updates a CfnNetworkSettings$Builder instance using the provided configuration.
  The function takes the CfnNetworkSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnNetworkSettings$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-network-settings-builder
  "Creates a  `CfnNetworkSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-network-settings-builder (CfnNetworkSettings$Builder/create scope (name id)) id config))


(defn build-cfn-network-settings-props-builder
  "The build-cfn-network-settings-props-builder function updates a CfnNetworkSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnNetworkSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnNetworkSettingsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-network-settings-props-builder
  "Creates a  `CfnNetworkSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-network-settings-props-builder (new CfnNetworkSettingsProps$Builder) id config))


(defn build-cfn-portal-builder
  "The build-cfn-portal-builder function updates a CfnPortal$Builder instance using the provided configuration.
  The function takes the CfnPortal$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-settings-arn` |
"
  [^CfnPortal$Builder builder id config]
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
  (.build builder))


(defn cfn-portal-builder
  "Creates a  `CfnPortal$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-portal-builder (CfnPortal$Builder/create scope (name id)) id config))


(defn build-cfn-portal-props-builder
  "The build-cfn-portal-props-builder function updates a CfnPortalProps$Builder instance using the provided configuration.
  The function takes the CfnPortalProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userSettingsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-settings-arn` |
"
  [^CfnPortalProps$Builder builder id config]
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
  (.build builder))


(defn cfn-portal-props-builder
  "Creates a  `CfnPortalProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-portal-props-builder (new CfnPortalProps$Builder) id config))


(defn build-cfn-trust-store-builder
  "The build-cfn-trust-store-builder function updates a CfnTrustStore$Builder instance using the provided configuration.
  The function takes the CfnTrustStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateList` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrustStore$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-list)]
    (. builder certificateList data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-trust-store-builder
  "Creates a  `CfnTrustStore$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-trust-store-builder (CfnTrustStore$Builder/create scope (name id)) id config))


(defn build-cfn-trust-store-props-builder
  "The build-cfn-trust-store-props-builder function updates a CfnTrustStoreProps$Builder instance using the provided configuration.
  The function takes the CfnTrustStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateList` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrustStoreProps$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-list)]
    (. builder certificateList data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-trust-store-props-builder
  "Creates a  `CfnTrustStoreProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-trust-store-props-builder (new CfnTrustStoreProps$Builder) id config))


(defn build-cfn-user-access-logging-settings-builder
  "The build-cfn-user-access-logging-settings-builder function updates a CfnUserAccessLoggingSettings$Builder instance using the provided configuration.
  The function takes the CfnUserAccessLoggingSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kinesis-stream-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnUserAccessLoggingSettings$Builder builder id config]
  (when-let [data (lookup-entry config id :kinesis-stream-arn)]
    (. builder kinesisStreamArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-user-access-logging-settings-builder
  "Creates a  `CfnUserAccessLoggingSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-user-access-logging-settings-builder (CfnUserAccessLoggingSettings$Builder/create scope (name id)) id config))


(defn build-cfn-user-access-logging-settings-props-builder
  "The build-cfn-user-access-logging-settings-props-builder function updates a CfnUserAccessLoggingSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnUserAccessLoggingSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kinesis-stream-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnUserAccessLoggingSettingsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :kinesis-stream-arn)]
    (. builder kinesisStreamArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-user-access-logging-settings-props-builder
  "Creates a  `CfnUserAccessLoggingSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-access-logging-settings-props-builder (new CfnUserAccessLoggingSettingsProps$Builder) id config))


(defn build-cfn-user-settings-builder
  "The build-cfn-user-settings-builder function updates a CfnUserSettings$Builder instance using the provided configuration.
  The function takes the CfnUserSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `uploadAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:upload-allowed` |
"
  [^CfnUserSettings$Builder builder id config]
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
  (.build builder))


(defn cfn-user-settings-builder
  "Creates a  `CfnUserSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-user-settings-builder (CfnUserSettings$Builder/create scope (name id)) id config))


(defn build-cfn-user-settings-cookie-specification-property-builder
  "The build-cfn-user-settings-cookie-specification-property-builder function updates a CfnUserSettings$CookieSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserSettings$CookieSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnUserSettings$CookieSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-user-settings-cookie-specification-property-builder
  "Creates a  `CfnUserSettings$CookieSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-settings-cookie-specification-property-builder (new CfnUserSettings$CookieSpecificationProperty$Builder) id config))


(defn build-cfn-user-settings-cookie-synchronization-configuration-property-builder
  "The build-cfn-user-settings-cookie-synchronization-configuration-property-builder function updates a CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowlist` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowlist` |
| `blocklist` | java.util.List | [[cdk.support/lookup-entry]] | `:blocklist` |
"
  [^CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowlist)]
    (. builder allowlist data))
  (when-let [data (lookup-entry config id :blocklist)]
    (. builder blocklist data))
  (.build builder))


(defn cfn-user-settings-cookie-synchronization-configuration-property-builder
  "Creates a  `CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-settings-cookie-synchronization-configuration-property-builder (new CfnUserSettings$CookieSynchronizationConfigurationProperty$Builder) id config))


(defn build-cfn-user-settings-props-builder
  "The build-cfn-user-settings-props-builder function updates a CfnUserSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnUserSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `uploadAllowed` | java.lang.String | [[cdk.support/lookup-entry]] | `:upload-allowed` |
"
  [^CfnUserSettingsProps$Builder builder id config]
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
  (.build builder))


(defn cfn-user-settings-props-builder
  "Creates a  `CfnUserSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-settings-props-builder (new CfnUserSettingsProps$Builder) id config))