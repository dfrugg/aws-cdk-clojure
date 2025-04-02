(ns cdk.api.services.cognito
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cognito package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cognito AccountRecovery
                                                    AdvancedSecurityMode
                                                    AttributeMapping$Builder
                                                    AuthFlow$Builder
                                                    AutoVerifiedAttrs$Builder
                                                    BaseUrlOptions$Builder
                                                    BooleanAttribute$Builder
                                                    CfnIdentityPool$Builder
                                                    CfnIdentityPool$CognitoIdentityProviderProperty$Builder
                                                    CfnIdentityPool$CognitoStreamsProperty$Builder
                                                    CfnIdentityPool$PushSyncProperty$Builder
                                                    CfnIdentityPoolPrincipalTag$Builder
                                                    CfnIdentityPoolPrincipalTagProps$Builder
                                                    CfnIdentityPoolProps$Builder
                                                    CfnIdentityPoolRoleAttachment$Builder
                                                    CfnIdentityPoolRoleAttachment$MappingRuleProperty$Builder
                                                    CfnIdentityPoolRoleAttachment$RoleMappingProperty$Builder
                                                    CfnIdentityPoolRoleAttachment$RulesConfigurationTypeProperty$Builder
                                                    CfnIdentityPoolRoleAttachmentProps$Builder
                                                    CfnLogDeliveryConfiguration$Builder
                                                    CfnLogDeliveryConfiguration$CloudWatchLogsConfigurationProperty$Builder
                                                    CfnLogDeliveryConfiguration$LogConfigurationProperty$Builder
                                                    CfnLogDeliveryConfigurationProps$Builder
                                                    CfnUserPool$AccountRecoverySettingProperty$Builder
                                                    CfnUserPool$AdminCreateUserConfigProperty$Builder
                                                    CfnUserPool$Builder
                                                    CfnUserPool$CustomEmailSenderProperty$Builder
                                                    CfnUserPool$CustomSMSSenderProperty$Builder
                                                    CfnUserPool$DeviceConfigurationProperty$Builder
                                                    CfnUserPool$EmailConfigurationProperty$Builder
                                                    CfnUserPool$InviteMessageTemplateProperty$Builder
                                                    CfnUserPool$LambdaConfigProperty$Builder
                                                    CfnUserPool$NumberAttributeConstraintsProperty$Builder
                                                    CfnUserPool$PasswordPolicyProperty$Builder
                                                    CfnUserPool$PoliciesProperty$Builder
                                                    CfnUserPool$PreTokenGenerationConfigProperty$Builder
                                                    CfnUserPool$RecoveryOptionProperty$Builder
                                                    CfnUserPool$SchemaAttributeProperty$Builder
                                                    CfnUserPool$SmsConfigurationProperty$Builder
                                                    CfnUserPool$StringAttributeConstraintsProperty$Builder
                                                    CfnUserPool$UserAttributeUpdateSettingsProperty$Builder
                                                    CfnUserPool$UserPoolAddOnsProperty$Builder
                                                    CfnUserPool$UsernameConfigurationProperty$Builder
                                                    CfnUserPool$VerificationMessageTemplateProperty$Builder
                                                    CfnUserPoolClient$AnalyticsConfigurationProperty$Builder
                                                    CfnUserPoolClient$Builder
                                                    CfnUserPoolClient$TokenValidityUnitsProperty$Builder
                                                    CfnUserPoolClientProps$Builder
                                                    CfnUserPoolDomain$Builder
                                                    CfnUserPoolDomain$CustomDomainConfigTypeProperty$Builder
                                                    CfnUserPoolDomainProps$Builder
                                                    CfnUserPoolGroup$Builder
                                                    CfnUserPoolGroupProps$Builder
                                                    CfnUserPoolIdentityProvider$Builder
                                                    CfnUserPoolIdentityProviderProps$Builder
                                                    CfnUserPoolProps$Builder
                                                    CfnUserPoolResourceServer$Builder
                                                    CfnUserPoolResourceServer$ResourceServerScopeTypeProperty$Builder
                                                    CfnUserPoolResourceServerProps$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionsTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsActionsTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsRiskConfigurationTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$NotifyEmailTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty$Builder
                                                    CfnUserPoolRiskConfigurationAttachmentProps$Builder
                                                    CfnUserPoolUICustomizationAttachment$Builder
                                                    CfnUserPoolUICustomizationAttachmentProps$Builder
                                                    CfnUserPoolUser$AttributeTypeProperty$Builder
                                                    CfnUserPoolUser$Builder
                                                    CfnUserPoolUserProps$Builder
                                                    CfnUserPoolUserToGroupAttachment$Builder
                                                    CfnUserPoolUserToGroupAttachmentProps$Builder
                                                    CognitoDomainOptions$Builder
                                                    CustomAttributeConfig$Builder
                                                    CustomAttributeProps$Builder
                                                    CustomDomainOptions$Builder
                                                    DateTimeAttribute$Builder
                                                    DeviceTracking$Builder
                                                    EmailSettings$Builder
                                                    KeepOriginalAttrs$Builder
                                                    LambdaVersion
                                                    Mfa
                                                    MfaSecondFactor$Builder
                                                    NumberAttribute$Builder
                                                    NumberAttributeConstraints$Builder
                                                    NumberAttributeProps$Builder
                                                    OAuthFlows$Builder
                                                    OAuthSettings$Builder
                                                    OidcAttributeRequestMethod
                                                    OidcEndpoints$Builder
                                                    PasswordPolicy$Builder
                                                    ResourceServerScope$Builder
                                                    ResourceServerScopeProps$Builder
                                                    SignInAliases$Builder
                                                    SignInUrlOptions$Builder
                                                    SigningAlgorithm
                                                    StandardAttribute$Builder
                                                    StandardAttributes$Builder
                                                    StandardAttributesMask$Builder
                                                    StringAttribute$Builder
                                                    StringAttributeConstraints$Builder
                                                    StringAttributeProps$Builder
                                                    UserInvitationConfig$Builder
                                                    UserPool$Builder
                                                    UserPoolClient$Builder
                                                    UserPoolClientOptions$Builder
                                                    UserPoolClientProps$Builder
                                                    UserPoolDomain$Builder
                                                    UserPoolDomainOptions$Builder
                                                    UserPoolDomainProps$Builder
                                                    UserPoolIdentityProviderAmazon$Builder
                                                    UserPoolIdentityProviderAmazonProps$Builder
                                                    UserPoolIdentityProviderApple$Builder
                                                    UserPoolIdentityProviderAppleProps$Builder
                                                    UserPoolIdentityProviderFacebook$Builder
                                                    UserPoolIdentityProviderFacebookProps$Builder
                                                    UserPoolIdentityProviderGoogle$Builder
                                                    UserPoolIdentityProviderGoogleProps$Builder
                                                    UserPoolIdentityProviderOidc$Builder
                                                    UserPoolIdentityProviderOidcProps$Builder
                                                    UserPoolIdentityProviderProps$Builder
                                                    UserPoolIdentityProviderSaml$Builder
                                                    UserPoolIdentityProviderSamlMetadataType
                                                    UserPoolIdentityProviderSamlProps$Builder
                                                    UserPoolProps$Builder
                                                    UserPoolResourceServer$Builder
                                                    UserPoolResourceServerOptions$Builder
                                                    UserPoolResourceServerProps$Builder
                                                    UserPoolSESOptions$Builder
                                                    UserPoolTriggers$Builder
                                                    UserVerificationConfig$Builder
                                                    VerificationEmailStyle]))


(defn account-recovery
  "The `account-recovery` function data interprets values in the provided config data into a 
`AccountRecovery` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AccountRecovery` - the value is returned.
* is `:none` - `AccountRecovery/NONE` is returned
* is `:email-only` - `AccountRecovery/EMAIL_ONLY` is returned
* is `:phone-only-without-mfa` - `AccountRecovery/PHONE_ONLY_WITHOUT_MFA` is returned
* is `:phone-without-mfa-and-email` - `AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL` is returned
* is `:phone-and-email` - `AccountRecovery/PHONE_AND_EMAIL` is returned
* is `:email-and-phone-without-mfa` - `AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AccountRecovery data) data
      (= :none data) AccountRecovery/NONE
      (= :email-only data) AccountRecovery/EMAIL_ONLY
      (= :phone-only-without-mfa data) AccountRecovery/PHONE_ONLY_WITHOUT_MFA
      (= :phone-without-mfa-and-email data) AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL
      (= :phone-and-email data) AccountRecovery/PHONE_AND_EMAIL
      (= :email-and-phone-without-mfa data) AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA)))


(defn advanced-security-mode
  "The `advanced-security-mode` function data interprets values in the provided config data into a 
`AdvancedSecurityMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AdvancedSecurityMode` - the value is returned.
* is `:off` - `AdvancedSecurityMode/OFF` is returned
* is `:audit` - `AdvancedSecurityMode/AUDIT` is returned
* is `:enforced` - `AdvancedSecurityMode/ENFORCED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AdvancedSecurityMode data) data
      (= :off data) AdvancedSecurityMode/OFF
      (= :audit data) AdvancedSecurityMode/AUDIT
      (= :enforced data) AdvancedSecurityMode/ENFORCED)))


(defn lambda-version
  "The `lambda-version` function data interprets values in the provided config data into a 
`LambdaVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LambdaVersion` - the value is returned.
* is `:v1-0` - `LambdaVersion/V1_0` is returned
* is `:v2-0` - `LambdaVersion/V2_0` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LambdaVersion data) data
      (= :v1-0 data) LambdaVersion/V1_0
      (= :v2-0 data) LambdaVersion/V2_0)))


(defn mfa
  "The `mfa` function data interprets values in the provided config data into a 
`Mfa` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Mfa` - the value is returned.
* is `:off` - `Mfa/OFF` is returned
* is `:optional` - `Mfa/OPTIONAL` is returned
* is `:required` - `Mfa/REQUIRED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Mfa data) data
      (= :off data) Mfa/OFF
      (= :optional data) Mfa/OPTIONAL
      (= :required data) Mfa/REQUIRED)))


(defn oidc-attribute-request-method
  "The `oidc-attribute-request-method` function data interprets values in the provided config data into a 
`OidcAttributeRequestMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OidcAttributeRequestMethod` - the value is returned.
* is `:get` - `OidcAttributeRequestMethod/GET` is returned
* is `:post` - `OidcAttributeRequestMethod/POST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OidcAttributeRequestMethod data) data
      (= :get data) OidcAttributeRequestMethod/GET
      (= :post data) OidcAttributeRequestMethod/POST)))


(defn signing-algorithm
  "The `signing-algorithm` function data interprets values in the provided config data into a 
`SigningAlgorithm` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SigningAlgorithm` - the value is returned.
* is `:rsa-sha256` - `SigningAlgorithm/RSA_SHA256` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SigningAlgorithm data) data
      (= :rsa-sha256 data) SigningAlgorithm/RSA_SHA256)))


(defn user-pool-identity-provider-saml-metadata-type
  "The `user-pool-identity-provider-saml-metadata-type` function data interprets values in the provided config data into a 
`UserPoolIdentityProviderSamlMetadataType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `UserPoolIdentityProviderSamlMetadataType` - the value is returned.
* is `:file` - `UserPoolIdentityProviderSamlMetadataType/FILE` is returned
* is `:url` - `UserPoolIdentityProviderSamlMetadataType/URL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? UserPoolIdentityProviderSamlMetadataType data) data
      (= :file data) UserPoolIdentityProviderSamlMetadataType/FILE
      (= :url data) UserPoolIdentityProviderSamlMetadataType/URL)))


(defn verification-email-style
  "The `verification-email-style` function data interprets values in the provided config data into a 
`VerificationEmailStyle` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VerificationEmailStyle` - the value is returned.
* is `:code` - `VerificationEmailStyle/CODE` is returned
* is `:link` - `VerificationEmailStyle/LINK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VerificationEmailStyle data) data
      (= :code data) VerificationEmailStyle/CODE
      (= :link data) VerificationEmailStyle/LINK)))


(defn attribute-mapping-builder>
  "The attribute-mapping-builder> function updates a AttributeMapping$Builder instance using the provided configuration.
  The function takes the AttributeMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:address` |
| `birthdate` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:birthdate` |
| `custom` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom` |
| `email` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:email` |
| `familyName` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:family-name` |
| `fullname` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:fullname` |
| `gender` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:gender` |
| `givenName` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:given-name` |
| `lastUpdateTime` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:last-update-time` |
| `locale` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:locale` |
| `middleName` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:middle-name` |
| `nickname` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:nickname` |
| `phoneNumber` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:phone-number` |
| `preferredUsername` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:preferred-username` |
| `profilePage` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:profile-page` |
| `profilePicture` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:profile-picture` |
| `timezone` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:timezone` |
| `website` | software.amazon.awscdk.services.cognito.ProviderAttribute | [[cdk.support/lookup-entry]] | `:website` |
"
  [^AttributeMapping$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :birthdate)]
    (. builder birthdate data))
  (when-some [data (lookup-entry config id :custom)]
    (. builder custom data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :family-name)]
    (. builder familyName data))
  (when-some [data (lookup-entry config id :fullname)]
    (. builder fullname data))
  (when-some [data (lookup-entry config id :gender)]
    (. builder gender data))
  (when-some [data (lookup-entry config id :given-name)]
    (. builder givenName data))
  (when-some [data (lookup-entry config id :last-update-time)]
    (. builder lastUpdateTime data))
  (when-some [data (lookup-entry config id :locale)]
    (. builder locale data))
  (when-some [data (lookup-entry config id :middle-name)]
    (. builder middleName data))
  (when-some [data (lookup-entry config id :nickname)]
    (. builder nickname data))
  (when-some [data (lookup-entry config id :phone-number)]
    (. builder phoneNumber data))
  (when-some [data (lookup-entry config id :preferred-username)]
    (. builder preferredUsername data))
  (when-some [data (lookup-entry config id :profile-page)]
    (. builder profilePage data))
  (when-some [data (lookup-entry config id :profile-picture)]
    (. builder profilePicture data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :website)]
    (. builder website data))
  (.build builder))


(defn attribute-mapping-builder
  "Creates a  `AttributeMapping$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (attribute-mapping-builder> (new AttributeMapping$Builder) id config))


(defn auth-flow-builder>
  "The auth-flow-builder> function updates a AuthFlow$Builder instance using the provided configuration.
  The function takes the AuthFlow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminUserPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:admin-user-password` |
| `custom` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:custom` |
| `userPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-password` |
| `userSrp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-srp` |
"
  [^AuthFlow$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-user-password)]
    (. builder adminUserPassword data))
  (when-some [data (lookup-entry config id :custom)]
    (. builder custom data))
  (when-some [data (lookup-entry config id :user-password)]
    (. builder userPassword data))
  (when-some [data (lookup-entry config id :user-srp)]
    (. builder userSrp data))
  (.build builder))


(defn auth-flow-builder
  "Creates a  `AuthFlow$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (auth-flow-builder> (new AuthFlow$Builder) id config))


(defn auto-verified-attrs-builder>
  "The auto-verified-attrs-builder> function updates a AutoVerifiedAttrs$Builder instance using the provided configuration.
  The function takes the AutoVerifiedAttrs$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email` |
| `phone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:phone` |
"
  [^AutoVerifiedAttrs$Builder builder id config]
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :phone)]
    (. builder phone data))
  (.build builder))


(defn auto-verified-attrs-builder
  "Creates a  `AutoVerifiedAttrs$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (auto-verified-attrs-builder> (new AutoVerifiedAttrs$Builder) id config))


(defn base-url-options-builder>
  "The base-url-options-builder> function updates a BaseUrlOptions$Builder instance using the provided configuration.
  The function takes the BaseUrlOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fips` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fips` |
"
  [^BaseUrlOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :fips)]
    (. builder fips data))
  (.build builder))


(defn base-url-options-builder
  "Creates a  `BaseUrlOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (base-url-options-builder> (new BaseUrlOptions$Builder) id config))


(defn boolean-attribute-builder>
  "The boolean-attribute-builder> function updates a BooleanAttribute$Builder instance using the provided configuration.
  The function takes the BooleanAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^BooleanAttribute$Builder builder id config]
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn boolean-attribute-builder
  "Creates a  `BooleanAttribute$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (boolean-attribute-builder> (BooleanAttribute$Builder/create) id config))


(defn cfn-identity-pool-builder>
  "The cfn-identity-pool-builder> function updates a CfnIdentityPool$Builder instance using the provided configuration.
  The function takes the CfnIdentityPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowClassicFlow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-classic-flow` |
| `allowUnauthenticatedIdentities` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-unauthenticated-identities` |
| `cognitoEvents` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cognito-events` |
| `cognitoIdentityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:cognito-identity-providers` |
| `cognitoStreams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-streams` |
| `developerProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:developer-provider-name` |
| `identityPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-name` |
| `openIdConnectProviderArns` | java.util.List | [[cdk.support/lookup-entry]] | `:open-id-connect-provider-arns` |
| `pushSync` | software.amazon.awscdk.services.cognito.CfnIdentityPool$PushSyncProperty | [[cdk.support/lookup-entry]] | `:push-sync` |
| `samlProviderArns` | java.util.List | [[cdk.support/lookup-entry]] | `:saml-provider-arns` |
| `supportedLoginProviders` | java.lang.Object | [[cdk.support/lookup-entry]] | `:supported-login-providers` |
"
  [^CfnIdentityPool$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-classic-flow)]
    (. builder allowClassicFlow data))
  (when-some [data (lookup-entry config id :allow-unauthenticated-identities)]
    (. builder allowUnauthenticatedIdentities data))
  (when-some [data (lookup-entry config id :cognito-events)]
    (. builder cognitoEvents data))
  (when-some [data (lookup-entry config id :cognito-identity-providers)]
    (. builder cognitoIdentityProviders data))
  (when-some [data (lookup-entry config id :cognito-streams)]
    (. builder cognitoStreams data))
  (when-some [data (lookup-entry config id :developer-provider-name)]
    (. builder developerProviderName data))
  (when-some [data (lookup-entry config id :identity-pool-name)]
    (. builder identityPoolName data))
  (when-some [data (lookup-entry config id :open-id-connect-provider-arns)]
    (. builder openIdConnectProviderArns data))
  (when-some [data (lookup-entry config id :push-sync)]
    (. builder pushSync data))
  (when-some [data (lookup-entry config id :saml-provider-arns)]
    (. builder samlProviderArns data))
  (when-some [data (lookup-entry config id :supported-login-providers)]
    (. builder supportedLoginProviders data))
  (.build builder))


(defn cfn-identity-pool-builder
  "Creates a  `CfnIdentityPool$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-identity-pool-builder> (CfnIdentityPool$Builder/create scope (name id)) id config))


(defn cfn-identity-pool-cognito-identity-provider-property-builder>
  "The cfn-identity-pool-cognito-identity-provider-property-builder> function updates a CfnIdentityPool$CognitoIdentityProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityPool$CognitoIdentityProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serverSideTokenCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-token-check` |
"
  [^CfnIdentityPool$CognitoIdentityProviderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-some [data (lookup-entry config id :server-side-token-check)]
    (. builder serverSideTokenCheck data))
  (.build builder))


(defn cfn-identity-pool-cognito-identity-provider-property-builder
  "Creates a  `CfnIdentityPool$CognitoIdentityProviderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-cognito-identity-provider-property-builder> (new CfnIdentityPool$CognitoIdentityProviderProperty$Builder) id config))


(defn cfn-identity-pool-cognito-streams-property-builder>
  "The cfn-identity-pool-cognito-streams-property-builder> function updates a CfnIdentityPool$CognitoStreamsProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityPool$CognitoStreamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `streamingStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:streaming-status` |
"
  [^CfnIdentityPool$CognitoStreamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (when-some [data (lookup-entry config id :streaming-status)]
    (. builder streamingStatus data))
  (.build builder))


(defn cfn-identity-pool-cognito-streams-property-builder
  "Creates a  `CfnIdentityPool$CognitoStreamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-cognito-streams-property-builder> (new CfnIdentityPool$CognitoStreamsProperty$Builder) id config))


(defn cfn-identity-pool-principal-tag-builder>
  "The cfn-identity-pool-principal-tag-builder> function updates a CfnIdentityPoolPrincipalTag$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolPrincipalTag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `identityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-name` |
| `principalTags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:principal-tags` |
| `useDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-defaults` |
"
  [^CfnIdentityPoolPrincipalTag$Builder builder id config]
  (when-some [data (lookup-entry config id :identity-pool-id)]
    (. builder identityPoolId data))
  (when-some [data (lookup-entry config id :identity-provider-name)]
    (. builder identityProviderName data))
  (when-some [data (lookup-entry config id :principal-tags)]
    (. builder principalTags data))
  (when-some [data (lookup-entry config id :use-defaults)]
    (. builder useDefaults data))
  (.build builder))


(defn cfn-identity-pool-principal-tag-builder
  "Creates a  `CfnIdentityPoolPrincipalTag$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-identity-pool-principal-tag-builder> (CfnIdentityPoolPrincipalTag$Builder/create scope (name id)) id config))


(defn cfn-identity-pool-principal-tag-props-builder>
  "The cfn-identity-pool-principal-tag-props-builder> function updates a CfnIdentityPoolPrincipalTagProps$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolPrincipalTagProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `identityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-name` |
| `principalTags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:principal-tags` |
| `useDefaults` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-defaults` |
"
  [^CfnIdentityPoolPrincipalTagProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identity-pool-id)]
    (. builder identityPoolId data))
  (when-some [data (lookup-entry config id :identity-provider-name)]
    (. builder identityProviderName data))
  (when-some [data (lookup-entry config id :principal-tags)]
    (. builder principalTags data))
  (when-some [data (lookup-entry config id :use-defaults)]
    (. builder useDefaults data))
  (.build builder))


(defn cfn-identity-pool-principal-tag-props-builder
  "Creates a  `CfnIdentityPoolPrincipalTagProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-principal-tag-props-builder> (new CfnIdentityPoolPrincipalTagProps$Builder) id config))


(defn cfn-identity-pool-props-builder>
  "The cfn-identity-pool-props-builder> function updates a CfnIdentityPoolProps$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowClassicFlow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-classic-flow` |
| `allowUnauthenticatedIdentities` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-unauthenticated-identities` |
| `cognitoEvents` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cognito-events` |
| `cognitoIdentityProviders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-identity-providers` |
| `cognitoStreams` | software.amazon.awscdk.services.cognito.CfnIdentityPool$CognitoStreamsProperty | [[cdk.support/lookup-entry]] | `:cognito-streams` |
| `developerProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:developer-provider-name` |
| `identityPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-name` |
| `openIdConnectProviderArns` | java.util.List | [[cdk.support/lookup-entry]] | `:open-id-connect-provider-arns` |
| `pushSync` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:push-sync` |
| `samlProviderArns` | java.util.List | [[cdk.support/lookup-entry]] | `:saml-provider-arns` |
| `supportedLoginProviders` | java.lang.Object | [[cdk.support/lookup-entry]] | `:supported-login-providers` |
"
  [^CfnIdentityPoolProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-classic-flow)]
    (. builder allowClassicFlow data))
  (when-some [data (lookup-entry config id :allow-unauthenticated-identities)]
    (. builder allowUnauthenticatedIdentities data))
  (when-some [data (lookup-entry config id :cognito-events)]
    (. builder cognitoEvents data))
  (when-some [data (lookup-entry config id :cognito-identity-providers)]
    (. builder cognitoIdentityProviders data))
  (when-some [data (lookup-entry config id :cognito-streams)]
    (. builder cognitoStreams data))
  (when-some [data (lookup-entry config id :developer-provider-name)]
    (. builder developerProviderName data))
  (when-some [data (lookup-entry config id :identity-pool-name)]
    (. builder identityPoolName data))
  (when-some [data (lookup-entry config id :open-id-connect-provider-arns)]
    (. builder openIdConnectProviderArns data))
  (when-some [data (lookup-entry config id :push-sync)]
    (. builder pushSync data))
  (when-some [data (lookup-entry config id :saml-provider-arns)]
    (. builder samlProviderArns data))
  (when-some [data (lookup-entry config id :supported-login-providers)]
    (. builder supportedLoginProviders data))
  (.build builder))


(defn cfn-identity-pool-props-builder
  "Creates a  `CfnIdentityPoolProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-props-builder> (new CfnIdentityPoolProps$Builder) id config))


(defn cfn-identity-pool-push-sync-property-builder>
  "The cfn-identity-pool-push-sync-property-builder> function updates a CfnIdentityPool$PushSyncProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityPool$PushSyncProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:application-arns` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnIdentityPool$PushSyncProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-arns)]
    (. builder applicationArns data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-identity-pool-push-sync-property-builder
  "Creates a  `CfnIdentityPool$PushSyncProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-push-sync-property-builder> (new CfnIdentityPool$PushSyncProperty$Builder) id config))


(defn cfn-identity-pool-role-attachment-builder>
  "The cfn-identity-pool-role-attachment-builder> function updates a CfnIdentityPoolRoleAttachment$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolRoleAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `roleMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:role-mappings` |
| `roles` | java.lang.Object | [[cdk.support/lookup-entry]] | `:roles` |
"
  [^CfnIdentityPoolRoleAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :identity-pool-id)]
    (. builder identityPoolId data))
  (when-some [data (lookup-entry config id :role-mappings)]
    (. builder roleMappings data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (.build builder))


(defn cfn-identity-pool-role-attachment-builder
  "Creates a  `CfnIdentityPoolRoleAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-identity-pool-role-attachment-builder> (CfnIdentityPoolRoleAttachment$Builder/create scope (name id)) id config))


(defn cfn-identity-pool-role-attachment-mapping-rule-property-builder>
  "The cfn-identity-pool-role-attachment-mapping-rule-property-builder> function updates a CfnIdentityPoolRoleAttachment$MappingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolRoleAttachment$MappingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `claim` | java.lang.String | [[cdk.support/lookup-entry]] | `:claim` |
| `matchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-type` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnIdentityPoolRoleAttachment$MappingRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :claim)]
    (. builder claim data))
  (when-some [data (lookup-entry config id :match-type)]
    (. builder matchType data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-identity-pool-role-attachment-mapping-rule-property-builder
  "Creates a  `CfnIdentityPoolRoleAttachment$MappingRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-role-attachment-mapping-rule-property-builder> (new CfnIdentityPoolRoleAttachment$MappingRuleProperty$Builder) id config))


(defn cfn-identity-pool-role-attachment-props-builder>
  "The cfn-identity-pool-role-attachment-props-builder> function updates a CfnIdentityPoolRoleAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolRoleAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `roleMappings` | java.util.Map | [[cdk.support/lookup-entry]] | `:role-mappings` |
| `roles` | java.lang.Object | [[cdk.support/lookup-entry]] | `:roles` |
"
  [^CfnIdentityPoolRoleAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identity-pool-id)]
    (. builder identityPoolId data))
  (when-some [data (lookup-entry config id :role-mappings)]
    (. builder roleMappings data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (.build builder))


(defn cfn-identity-pool-role-attachment-props-builder
  "Creates a  `CfnIdentityPoolRoleAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-role-attachment-props-builder> (new CfnIdentityPoolRoleAttachmentProps$Builder) id config))


(defn cfn-identity-pool-role-attachment-role-mapping-property-builder>
  "The cfn-identity-pool-role-attachment-role-mapping-property-builder> function updates a CfnIdentityPoolRoleAttachment$RoleMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolRoleAttachment$RoleMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ambiguousRoleResolution` | java.lang.String | [[cdk.support/lookup-entry]] | `:ambiguous-role-resolution` |
| `identityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider` |
| `rulesConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIdentityPoolRoleAttachment$RoleMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ambiguous-role-resolution)]
    (. builder ambiguousRoleResolution data))
  (when-some [data (lookup-entry config id :identity-provider)]
    (. builder identityProvider data))
  (when-some [data (lookup-entry config id :rules-configuration)]
    (. builder rulesConfiguration data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-identity-pool-role-attachment-role-mapping-property-builder
  "Creates a  `CfnIdentityPoolRoleAttachment$RoleMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-role-attachment-role-mapping-property-builder> (new CfnIdentityPoolRoleAttachment$RoleMappingProperty$Builder) id config))


(defn cfn-identity-pool-role-attachment-rules-configuration-type-property-builder>
  "The cfn-identity-pool-role-attachment-rules-configuration-type-property-builder> function updates a CfnIdentityPoolRoleAttachment$RulesConfigurationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityPoolRoleAttachment$RulesConfigurationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnIdentityPoolRoleAttachment$RulesConfigurationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-identity-pool-role-attachment-rules-configuration-type-property-builder
  "Creates a  `CfnIdentityPoolRoleAttachment$RulesConfigurationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-pool-role-attachment-rules-configuration-type-property-builder> (new CfnIdentityPoolRoleAttachment$RulesConfigurationTypeProperty$Builder) id config))


(defn cfn-log-delivery-configuration-builder>
  "The cfn-log-delivery-configuration-builder> function updates a CfnLogDeliveryConfiguration$Builder instance using the provided configuration.
  The function takes the CfnLogDeliveryConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:log-configurations` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnLogDeliveryConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :log-configurations)]
    (. builder logConfigurations data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-log-delivery-configuration-builder
  "Creates a  `CfnLogDeliveryConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-log-delivery-configuration-builder> (CfnLogDeliveryConfiguration$Builder/create scope (name id)) id config))


(defn cfn-log-delivery-configuration-cloud-watch-logs-configuration-property-builder>
  "The cfn-log-delivery-configuration-cloud-watch-logs-configuration-property-builder> function updates a CfnLogDeliveryConfiguration$CloudWatchLogsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLogDeliveryConfiguration$CloudWatchLogsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
"
  [^CfnLogDeliveryConfiguration$CloudWatchLogsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-arn)]
    (. builder logGroupArn data))
  (.build builder))


(defn cfn-log-delivery-configuration-cloud-watch-logs-configuration-property-builder
  "Creates a  `CfnLogDeliveryConfiguration$CloudWatchLogsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-log-delivery-configuration-cloud-watch-logs-configuration-property-builder> (new CfnLogDeliveryConfiguration$CloudWatchLogsConfigurationProperty$Builder) id config))


(defn cfn-log-delivery-configuration-log-configuration-property-builder>
  "The cfn-log-delivery-configuration-log-configuration-property-builder> function updates a CfnLogDeliveryConfiguration$LogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLogDeliveryConfiguration$LogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-configuration` |
| `eventSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
"
  [^CfnLogDeliveryConfiguration$LogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logs-configuration)]
    (. builder cloudWatchLogsConfiguration data))
  (when-some [data (lookup-entry config id :event-source)]
    (. builder eventSource data))
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (.build builder))


(defn cfn-log-delivery-configuration-log-configuration-property-builder
  "Creates a  `CfnLogDeliveryConfiguration$LogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-log-delivery-configuration-log-configuration-property-builder> (new CfnLogDeliveryConfiguration$LogConfigurationProperty$Builder) id config))


(defn cfn-log-delivery-configuration-props-builder>
  "The cfn-log-delivery-configuration-props-builder> function updates a CfnLogDeliveryConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnLogDeliveryConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-configurations` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnLogDeliveryConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-configurations)]
    (. builder logConfigurations data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-log-delivery-configuration-props-builder
  "Creates a  `CfnLogDeliveryConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-log-delivery-configuration-props-builder> (new CfnLogDeliveryConfigurationProps$Builder) id config))


(defn cfn-user-pool-account-recovery-setting-property-builder>
  "The cfn-user-pool-account-recovery-setting-property-builder> function updates a CfnUserPool$AccountRecoverySettingProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$AccountRecoverySettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recoveryMechanisms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recovery-mechanisms` |
"
  [^CfnUserPool$AccountRecoverySettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :recovery-mechanisms)]
    (. builder recoveryMechanisms data))
  (.build builder))


(defn cfn-user-pool-account-recovery-setting-property-builder
  "Creates a  `CfnUserPool$AccountRecoverySettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-account-recovery-setting-property-builder> (new CfnUserPool$AccountRecoverySettingProperty$Builder) id config))


(defn cfn-user-pool-admin-create-user-config-property-builder>
  "The cfn-user-pool-admin-create-user-config-property-builder> function updates a CfnUserPool$AdminCreateUserConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$AdminCreateUserConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAdminCreateUserOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-admin-create-user-only` |
| `inviteMessageTemplate` | software.amazon.awscdk.services.cognito.CfnUserPool$InviteMessageTemplateProperty | [[cdk.support/lookup-entry]] | `:invite-message-template` |
| `unusedAccountValidityDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unused-account-validity-days` |
"
  [^CfnUserPool$AdminCreateUserConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-admin-create-user-only)]
    (. builder allowAdminCreateUserOnly data))
  (when-some [data (lookup-entry config id :invite-message-template)]
    (. builder inviteMessageTemplate data))
  (when-some [data (lookup-entry config id :unused-account-validity-days)]
    (. builder unusedAccountValidityDays data))
  (.build builder))


(defn cfn-user-pool-admin-create-user-config-property-builder
  "Creates a  `CfnUserPool$AdminCreateUserConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-admin-create-user-config-property-builder> (new CfnUserPool$AdminCreateUserConfigProperty$Builder) id config))


(defn cfn-user-pool-builder>
  "The cfn-user-pool-builder> function updates a CfnUserPool$Builder instance using the provided configuration.
  The function takes the CfnUserPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountRecoverySetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-recovery-setting` |
| `adminCreateUserConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:admin-create-user-config` |
| `aliasAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:alias-attributes` |
| `autoVerifiedAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-verified-attributes` |
| `deletionProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `deviceConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPool$DeviceConfigurationProperty | [[cdk.support/lookup-entry]] | `:device-configuration` |
| `emailConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:email-configuration` |
| `emailVerificationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-verification-message` |
| `emailVerificationSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-verification-subject` |
| `enabledMfas` | java.util.List | [[cdk.support/lookup-entry]] | `:enabled-mfas` |
| `lambdaConfig` | software.amazon.awscdk.services.cognito.CfnUserPool$LambdaConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-config` |
| `mfaConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:mfa-configuration` |
| `policies` | software.amazon.awscdk.services.cognito.CfnUserPool$PoliciesProperty | [[cdk.support/lookup-entry]] | `:policies` |
| `schema` | java.util.List | [[cdk.support/lookup-entry]] | `:schema` |
| `smsAuthenticationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-authentication-message` |
| `smsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sms-configuration` |
| `smsVerificationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-verification-message` |
| `userAttributeUpdateSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-attribute-update-settings` |
| `userPoolAddOns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-pool-add-ons` |
| `userPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-name` |
| `userPoolTags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:user-pool-tags` |
| `usernameAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:username-attributes` |
| `usernameConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPool$UsernameConfigurationProperty | [[cdk.support/lookup-entry]] | `:username-configuration` |
| `verificationMessageTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:verification-message-template` |
"
  [^CfnUserPool$Builder builder id config]
  (when-some [data (lookup-entry config id :account-recovery-setting)]
    (. builder accountRecoverySetting data))
  (when-some [data (lookup-entry config id :admin-create-user-config)]
    (. builder adminCreateUserConfig data))
  (when-some [data (lookup-entry config id :alias-attributes)]
    (. builder aliasAttributes data))
  (when-some [data (lookup-entry config id :auto-verified-attributes)]
    (. builder autoVerifiedAttributes data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :device-configuration)]
    (. builder deviceConfiguration data))
  (when-some [data (lookup-entry config id :email-configuration)]
    (. builder emailConfiguration data))
  (when-some [data (lookup-entry config id :email-verification-message)]
    (. builder emailVerificationMessage data))
  (when-some [data (lookup-entry config id :email-verification-subject)]
    (. builder emailVerificationSubject data))
  (when-some [data (lookup-entry config id :enabled-mfas)]
    (. builder enabledMfas data))
  (when-some [data (lookup-entry config id :lambda-config)]
    (. builder lambdaConfig data))
  (when-some [data (lookup-entry config id :mfa-configuration)]
    (. builder mfaConfiguration data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :sms-authentication-message)]
    (. builder smsAuthenticationMessage data))
  (when-some [data (lookup-entry config id :sms-configuration)]
    (. builder smsConfiguration data))
  (when-some [data (lookup-entry config id :sms-verification-message)]
    (. builder smsVerificationMessage data))
  (when-some [data (lookup-entry config id :user-attribute-update-settings)]
    (. builder userAttributeUpdateSettings data))
  (when-some [data (lookup-entry config id :user-pool-add-ons)]
    (. builder userPoolAddOns data))
  (when-some [data (lookup-entry config id :user-pool-name)]
    (. builder userPoolName data))
  (when-some [data (lookup-entry config id :user-pool-tags)]
    (. builder userPoolTags data))
  (when-some [data (lookup-entry config id :username-attributes)]
    (. builder usernameAttributes data))
  (when-some [data (lookup-entry config id :username-configuration)]
    (. builder usernameConfiguration data))
  (when-some [data (lookup-entry config id :verification-message-template)]
    (. builder verificationMessageTemplate data))
  (.build builder))


(defn cfn-user-pool-builder
  "Creates a  `CfnUserPool$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-builder> (CfnUserPool$Builder/create scope (name id)) id config))


(defn cfn-user-pool-client-analytics-configuration-property-builder>
  "The cfn-user-pool-client-analytics-configuration-property-builder> function updates a CfnUserPoolClient$AnalyticsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolClient$AnalyticsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `userDataShared` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-data-shared` |
"
  [^CfnUserPoolClient$AnalyticsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :user-data-shared)]
    (. builder userDataShared data))
  (.build builder))


(defn cfn-user-pool-client-analytics-configuration-property-builder
  "Creates a  `CfnUserPoolClient$AnalyticsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-client-analytics-configuration-property-builder> (new CfnUserPoolClient$AnalyticsConfigurationProperty$Builder) id config))


(defn cfn-user-pool-client-builder>
  "The cfn-user-pool-client-builder> function updates a CfnUserPoolClient$Builder instance using the provided configuration.
  The function takes the CfnUserPoolClient$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTokenValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:access-token-validity` |
| `allowedOAuthFlows` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-o-auth-flows` |
| `allowedOAuthFlowsUserPoolClient` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allowed-o-auth-flows-user-pool-client` |
| `allowedOAuthScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-o-auth-scopes` |
| `analyticsConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPoolClient$AnalyticsConfigurationProperty | [[cdk.support/lookup-entry]] | `:analytics-configuration` |
| `authSessionValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:auth-session-validity` |
| `callbackUrLs` | java.util.List | [[cdk.support/lookup-entry]] | `:callback-ur-ls` |
| `clientName` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-name` |
| `defaultRedirectUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-redirect-uri` |
| `enablePropagateAdditionalUserContextData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-propagate-additional-user-context-data` |
| `enableTokenRevocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-token-revocation` |
| `explicitAuthFlows` | java.util.List | [[cdk.support/lookup-entry]] | `:explicit-auth-flows` |
| `generateSecret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-secret` |
| `idTokenValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:id-token-validity` |
| `logoutUrLs` | java.util.List | [[cdk.support/lookup-entry]] | `:logout-ur-ls` |
| `preventUserExistenceErrors` | java.lang.String | [[cdk.support/lookup-entry]] | `:prevent-user-existence-errors` |
| `readAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:read-attributes` |
| `refreshTokenValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:refresh-token-validity` |
| `supportedIdentityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-identity-providers` |
| `tokenValidityUnits` | software.amazon.awscdk.services.cognito.CfnUserPoolClient$TokenValidityUnitsProperty | [[cdk.support/lookup-entry]] | `:token-validity-units` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
| `writeAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:write-attributes` |
"
  [^CfnUserPoolClient$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token-validity)]
    (. builder accessTokenValidity data))
  (when-some [data (lookup-entry config id :allowed-o-auth-flows)]
    (. builder allowedOAuthFlows data))
  (when-some [data (lookup-entry config id :allowed-o-auth-flows-user-pool-client)]
    (. builder allowedOAuthFlowsUserPoolClient data))
  (when-some [data (lookup-entry config id :allowed-o-auth-scopes)]
    (. builder allowedOAuthScopes data))
  (when-some [data (lookup-entry config id :analytics-configuration)]
    (. builder analyticsConfiguration data))
  (when-some [data (lookup-entry config id :auth-session-validity)]
    (. builder authSessionValidity data))
  (when-some [data (lookup-entry config id :callback-ur-ls)]
    (. builder callbackUrLs data))
  (when-some [data (lookup-entry config id :client-name)]
    (. builder clientName data))
  (when-some [data (lookup-entry config id :default-redirect-uri)]
    (. builder defaultRedirectUri data))
  (when-some [data (lookup-entry config id :enable-propagate-additional-user-context-data)]
    (. builder enablePropagateAdditionalUserContextData data))
  (when-some [data (lookup-entry config id :enable-token-revocation)]
    (. builder enableTokenRevocation data))
  (when-some [data (lookup-entry config id :explicit-auth-flows)]
    (. builder explicitAuthFlows data))
  (when-some [data (lookup-entry config id :generate-secret)]
    (. builder generateSecret data))
  (when-some [data (lookup-entry config id :id-token-validity)]
    (. builder idTokenValidity data))
  (when-some [data (lookup-entry config id :logout-ur-ls)]
    (. builder logoutUrLs data))
  (when-some [data (lookup-entry config id :prevent-user-existence-errors)]
    (. builder preventUserExistenceErrors data))
  (when-some [data (lookup-entry config id :read-attributes)]
    (. builder readAttributes data))
  (when-some [data (lookup-entry config id :refresh-token-validity)]
    (. builder refreshTokenValidity data))
  (when-some [data (lookup-entry config id :supported-identity-providers)]
    (. builder supportedIdentityProviders data))
  (when-some [data (lookup-entry config id :token-validity-units)]
    (. builder tokenValidityUnits data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (when-some [data (lookup-entry config id :write-attributes)]
    (. builder writeAttributes data))
  (.build builder))


(defn cfn-user-pool-client-builder
  "Creates a  `CfnUserPoolClient$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-client-builder> (CfnUserPoolClient$Builder/create scope (name id)) id config))


(defn cfn-user-pool-client-props-builder>
  "The cfn-user-pool-client-props-builder> function updates a CfnUserPoolClientProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolClientProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTokenValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:access-token-validity` |
| `allowedOAuthFlows` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-o-auth-flows` |
| `allowedOAuthFlowsUserPoolClient` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allowed-o-auth-flows-user-pool-client` |
| `allowedOAuthScopes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-o-auth-scopes` |
| `analyticsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analytics-configuration` |
| `authSessionValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:auth-session-validity` |
| `callbackUrLs` | java.util.List | [[cdk.support/lookup-entry]] | `:callback-ur-ls` |
| `clientName` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-name` |
| `defaultRedirectUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-redirect-uri` |
| `enablePropagateAdditionalUserContextData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-propagate-additional-user-context-data` |
| `enableTokenRevocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-token-revocation` |
| `explicitAuthFlows` | java.util.List | [[cdk.support/lookup-entry]] | `:explicit-auth-flows` |
| `generateSecret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-secret` |
| `idTokenValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:id-token-validity` |
| `logoutUrLs` | java.util.List | [[cdk.support/lookup-entry]] | `:logout-ur-ls` |
| `preventUserExistenceErrors` | java.lang.String | [[cdk.support/lookup-entry]] | `:prevent-user-existence-errors` |
| `readAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:read-attributes` |
| `refreshTokenValidity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:refresh-token-validity` |
| `supportedIdentityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-identity-providers` |
| `tokenValidityUnits` | software.amazon.awscdk.services.cognito.CfnUserPoolClient$TokenValidityUnitsProperty | [[cdk.support/lookup-entry]] | `:token-validity-units` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
| `writeAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:write-attributes` |
"
  [^CfnUserPoolClientProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token-validity)]
    (. builder accessTokenValidity data))
  (when-some [data (lookup-entry config id :allowed-o-auth-flows)]
    (. builder allowedOAuthFlows data))
  (when-some [data (lookup-entry config id :allowed-o-auth-flows-user-pool-client)]
    (. builder allowedOAuthFlowsUserPoolClient data))
  (when-some [data (lookup-entry config id :allowed-o-auth-scopes)]
    (. builder allowedOAuthScopes data))
  (when-some [data (lookup-entry config id :analytics-configuration)]
    (. builder analyticsConfiguration data))
  (when-some [data (lookup-entry config id :auth-session-validity)]
    (. builder authSessionValidity data))
  (when-some [data (lookup-entry config id :callback-ur-ls)]
    (. builder callbackUrLs data))
  (when-some [data (lookup-entry config id :client-name)]
    (. builder clientName data))
  (when-some [data (lookup-entry config id :default-redirect-uri)]
    (. builder defaultRedirectUri data))
  (when-some [data (lookup-entry config id :enable-propagate-additional-user-context-data)]
    (. builder enablePropagateAdditionalUserContextData data))
  (when-some [data (lookup-entry config id :enable-token-revocation)]
    (. builder enableTokenRevocation data))
  (when-some [data (lookup-entry config id :explicit-auth-flows)]
    (. builder explicitAuthFlows data))
  (when-some [data (lookup-entry config id :generate-secret)]
    (. builder generateSecret data))
  (when-some [data (lookup-entry config id :id-token-validity)]
    (. builder idTokenValidity data))
  (when-some [data (lookup-entry config id :logout-ur-ls)]
    (. builder logoutUrLs data))
  (when-some [data (lookup-entry config id :prevent-user-existence-errors)]
    (. builder preventUserExistenceErrors data))
  (when-some [data (lookup-entry config id :read-attributes)]
    (. builder readAttributes data))
  (when-some [data (lookup-entry config id :refresh-token-validity)]
    (. builder refreshTokenValidity data))
  (when-some [data (lookup-entry config id :supported-identity-providers)]
    (. builder supportedIdentityProviders data))
  (when-some [data (lookup-entry config id :token-validity-units)]
    (. builder tokenValidityUnits data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (when-some [data (lookup-entry config id :write-attributes)]
    (. builder writeAttributes data))
  (.build builder))


(defn cfn-user-pool-client-props-builder
  "Creates a  `CfnUserPoolClientProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-client-props-builder> (new CfnUserPoolClientProps$Builder) id config))


(defn cfn-user-pool-client-token-validity-units-property-builder>
  "The cfn-user-pool-client-token-validity-units-property-builder> function updates a CfnUserPoolClient$TokenValidityUnitsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolClient$TokenValidityUnitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `idToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-token` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnUserPoolClient$TokenValidityUnitsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token)]
    (. builder accessToken data))
  (when-some [data (lookup-entry config id :id-token)]
    (. builder idToken data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-user-pool-client-token-validity-units-property-builder
  "Creates a  `CfnUserPoolClient$TokenValidityUnitsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-client-token-validity-units-property-builder> (new CfnUserPoolClient$TokenValidityUnitsProperty$Builder) id config))


(defn cfn-user-pool-custom-email-sender-property-builder>
  "The cfn-user-pool-custom-email-sender-property-builder> function updates a CfnUserPool$CustomEmailSenderProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$CustomEmailSenderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `lambdaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-version` |
"
  [^CfnUserPool$CustomEmailSenderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (when-some [data (lookup-entry config id :lambda-version)]
    (. builder lambdaVersion data))
  (.build builder))


(defn cfn-user-pool-custom-email-sender-property-builder
  "Creates a  `CfnUserPool$CustomEmailSenderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-custom-email-sender-property-builder> (new CfnUserPool$CustomEmailSenderProperty$Builder) id config))


(defn cfn-user-pool-custom-sms-sender-property-builder>
  "The cfn-user-pool-custom-sms-sender-property-builder> function updates a CfnUserPool$CustomSMSSenderProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$CustomSMSSenderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `lambdaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-version` |
"
  [^CfnUserPool$CustomSMSSenderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (when-some [data (lookup-entry config id :lambda-version)]
    (. builder lambdaVersion data))
  (.build builder))


(defn cfn-user-pool-custom-sms-sender-property-builder
  "Creates a  `CfnUserPool$CustomSMSSenderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-custom-sms-sender-property-builder> (new CfnUserPool$CustomSMSSenderProperty$Builder) id config))


(defn cfn-user-pool-device-configuration-property-builder>
  "The cfn-user-pool-device-configuration-property-builder> function updates a CfnUserPool$DeviceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$DeviceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `challengeRequiredOnNewDevice` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:challenge-required-on-new-device` |
| `deviceOnlyRememberedOnUserPrompt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:device-only-remembered-on-user-prompt` |
"
  [^CfnUserPool$DeviceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :challenge-required-on-new-device)]
    (. builder challengeRequiredOnNewDevice data))
  (when-some [data (lookup-entry config id :device-only-remembered-on-user-prompt)]
    (. builder deviceOnlyRememberedOnUserPrompt data))
  (.build builder))


(defn cfn-user-pool-device-configuration-property-builder
  "Creates a  `CfnUserPool$DeviceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-device-configuration-property-builder> (new CfnUserPool$DeviceConfigurationProperty$Builder) id config))


(defn cfn-user-pool-domain-builder>
  "The cfn-user-pool-domain-builder> function updates a CfnUserPoolDomain$Builder instance using the provided configuration.
  The function takes the CfnUserPoolDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customDomainConfig` | software.amazon.awscdk.services.cognito.CfnUserPoolDomain$CustomDomainConfigTypeProperty | [[cdk.support/lookup-entry]] | `:custom-domain-config` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolDomain$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-domain-config)]
    (. builder customDomainConfig data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-domain-builder
  "Creates a  `CfnUserPoolDomain$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-domain-builder> (CfnUserPoolDomain$Builder/create scope (name id)) id config))


(defn cfn-user-pool-domain-custom-domain-config-type-property-builder>
  "The cfn-user-pool-domain-custom-domain-config-type-property-builder> function updates a CfnUserPoolDomain$CustomDomainConfigTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolDomain$CustomDomainConfigTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
"
  [^CfnUserPoolDomain$CustomDomainConfigTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (.build builder))


(defn cfn-user-pool-domain-custom-domain-config-type-property-builder
  "Creates a  `CfnUserPoolDomain$CustomDomainConfigTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-domain-custom-domain-config-type-property-builder> (new CfnUserPoolDomain$CustomDomainConfigTypeProperty$Builder) id config))


(defn cfn-user-pool-domain-props-builder>
  "The cfn-user-pool-domain-props-builder> function updates a CfnUserPoolDomainProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customDomainConfig` | software.amazon.awscdk.services.cognito.CfnUserPoolDomain$CustomDomainConfigTypeProperty | [[cdk.support/lookup-entry]] | `:custom-domain-config` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolDomainProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-domain-config)]
    (. builder customDomainConfig data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-domain-props-builder
  "Creates a  `CfnUserPoolDomainProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-domain-props-builder> (new CfnUserPoolDomainProps$Builder) id config))


(defn cfn-user-pool-email-configuration-property-builder>
  "The cfn-user-pool-email-configuration-property-builder> function updates a CfnUserPool$EmailConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$EmailConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `emailSendingAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-sending-account` |
| `from` | java.lang.String | [[cdk.support/lookup-entry]] | `:from` |
| `replyToEmailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:reply-to-email-address` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnUserPool$EmailConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-set)]
    (. builder configurationSet data))
  (when-some [data (lookup-entry config id :email-sending-account)]
    (. builder emailSendingAccount data))
  (when-some [data (lookup-entry config id :from)]
    (. builder from data))
  (when-some [data (lookup-entry config id :reply-to-email-address)]
    (. builder replyToEmailAddress data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn cfn-user-pool-email-configuration-property-builder
  "Creates a  `CfnUserPool$EmailConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-email-configuration-property-builder> (new CfnUserPool$EmailConfigurationProperty$Builder) id config))


(defn cfn-user-pool-group-builder>
  "The cfn-user-pool-group-builder> function updates a CfnUserPoolGroup$Builder instance using the provided configuration.
  The function takes the CfnUserPoolGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `precedence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:precedence` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :precedence)]
    (. builder precedence data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-group-builder
  "Creates a  `CfnUserPoolGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-group-builder> (CfnUserPoolGroup$Builder/create scope (name id)) id config))


(defn cfn-user-pool-group-props-builder>
  "The cfn-user-pool-group-props-builder> function updates a CfnUserPoolGroupProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `precedence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:precedence` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :precedence)]
    (. builder precedence data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-group-props-builder
  "Creates a  `CfnUserPoolGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-group-props-builder> (new CfnUserPoolGroupProps$Builder) id config))


(defn cfn-user-pool-identity-provider-builder>
  "The cfn-user-pool-identity-provider-builder> function updates a CfnUserPoolIdentityProvider$Builder instance using the provided configuration.
  The function takes the CfnUserPoolIdentityProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `idpIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:idp-identifiers` |
| `providerDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:provider-details` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolIdentityProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :idp-identifiers)]
    (. builder idpIdentifiers data))
  (when-some [data (lookup-entry config id :provider-details)]
    (. builder providerDetails data))
  (when-some [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-some [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-identity-provider-builder
  "Creates a  `CfnUserPoolIdentityProvider$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-identity-provider-builder> (CfnUserPoolIdentityProvider$Builder/create scope (name id)) id config))


(defn cfn-user-pool-identity-provider-props-builder>
  "The cfn-user-pool-identity-provider-props-builder> function updates a CfnUserPoolIdentityProviderProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolIdentityProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `idpIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:idp-identifiers` |
| `providerDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:provider-details` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `providerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-type` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolIdentityProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :idp-identifiers)]
    (. builder idpIdentifiers data))
  (when-some [data (lookup-entry config id :provider-details)]
    (. builder providerDetails data))
  (when-some [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-some [data (lookup-entry config id :provider-type)]
    (. builder providerType data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-identity-provider-props-builder
  "Creates a  `CfnUserPoolIdentityProviderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-identity-provider-props-builder> (new CfnUserPoolIdentityProviderProps$Builder) id config))


(defn cfn-user-pool-invite-message-template-property-builder>
  "The cfn-user-pool-invite-message-template-property-builder> function updates a CfnUserPool$InviteMessageTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$InviteMessageTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-message` |
| `emailSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-subject` |
| `smsMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-message` |
"
  [^CfnUserPool$InviteMessageTemplateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :email-message)]
    (. builder emailMessage data))
  (when-some [data (lookup-entry config id :email-subject)]
    (. builder emailSubject data))
  (when-some [data (lookup-entry config id :sms-message)]
    (. builder smsMessage data))
  (.build builder))


(defn cfn-user-pool-invite-message-template-property-builder
  "Creates a  `CfnUserPool$InviteMessageTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-invite-message-template-property-builder> (new CfnUserPool$InviteMessageTemplateProperty$Builder) id config))


(defn cfn-user-pool-lambda-config-property-builder>
  "The cfn-user-pool-lambda-config-property-builder> function updates a CfnUserPool$LambdaConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$LambdaConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAuthChallenge` | java.lang.String | [[cdk.support/lookup-entry]] | `:create-auth-challenge` |
| `customEmailSender` | software.amazon.awscdk.services.cognito.CfnUserPool$CustomEmailSenderProperty | [[cdk.support/lookup-entry]] | `:custom-email-sender` |
| `customMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-message` |
| `customSmsSender` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-sms-sender` |
| `defineAuthChallenge` | java.lang.String | [[cdk.support/lookup-entry]] | `:define-auth-challenge` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `postAuthentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-authentication` |
| `postConfirmation` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-confirmation` |
| `preAuthentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-authentication` |
| `preSignUp` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-sign-up` |
| `preTokenGeneration` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-token-generation` |
| `preTokenGenerationConfig` | software.amazon.awscdk.services.cognito.CfnUserPool$PreTokenGenerationConfigProperty | [[cdk.support/lookup-entry]] | `:pre-token-generation-config` |
| `userMigration` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-migration` |
| `verifyAuthChallengeResponse` | java.lang.String | [[cdk.support/lookup-entry]] | `:verify-auth-challenge-response` |
"
  [^CfnUserPool$LambdaConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :create-auth-challenge)]
    (. builder createAuthChallenge data))
  (when-some [data (lookup-entry config id :custom-email-sender)]
    (. builder customEmailSender data))
  (when-some [data (lookup-entry config id :custom-message)]
    (. builder customMessage data))
  (when-some [data (lookup-entry config id :custom-sms-sender)]
    (. builder customSmsSender data))
  (when-some [data (lookup-entry config id :define-auth-challenge)]
    (. builder defineAuthChallenge data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :post-authentication)]
    (. builder postAuthentication data))
  (when-some [data (lookup-entry config id :post-confirmation)]
    (. builder postConfirmation data))
  (when-some [data (lookup-entry config id :pre-authentication)]
    (. builder preAuthentication data))
  (when-some [data (lookup-entry config id :pre-sign-up)]
    (. builder preSignUp data))
  (when-some [data (lookup-entry config id :pre-token-generation)]
    (. builder preTokenGeneration data))
  (when-some [data (lookup-entry config id :pre-token-generation-config)]
    (. builder preTokenGenerationConfig data))
  (when-some [data (lookup-entry config id :user-migration)]
    (. builder userMigration data))
  (when-some [data (lookup-entry config id :verify-auth-challenge-response)]
    (. builder verifyAuthChallengeResponse data))
  (.build builder))


(defn cfn-user-pool-lambda-config-property-builder
  "Creates a  `CfnUserPool$LambdaConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-lambda-config-property-builder> (new CfnUserPool$LambdaConfigProperty$Builder) id config))


(defn cfn-user-pool-number-attribute-constraints-property-builder>
  "The cfn-user-pool-number-attribute-constraints-property-builder> function updates a CfnUserPool$NumberAttributeConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$NumberAttributeConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:min-value` |
"
  [^CfnUserPool$NumberAttributeConstraintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (.build builder))


(defn cfn-user-pool-number-attribute-constraints-property-builder
  "Creates a  `CfnUserPool$NumberAttributeConstraintsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-number-attribute-constraints-property-builder> (new CfnUserPool$NumberAttributeConstraintsProperty$Builder) id config))


(defn cfn-user-pool-password-policy-property-builder>
  "The cfn-user-pool-password-policy-property-builder> function updates a CfnUserPool$PasswordPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$PasswordPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minimumLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-length` |
| `requireLowercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-lowercase` |
| `requireNumbers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-numbers` |
| `requireSymbols` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-symbols` |
| `requireUppercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-uppercase` |
| `temporaryPasswordValidityDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:temporary-password-validity-days` |
"
  [^CfnUserPool$PasswordPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :minimum-length)]
    (. builder minimumLength data))
  (when-some [data (lookup-entry config id :require-lowercase)]
    (. builder requireLowercase data))
  (when-some [data (lookup-entry config id :require-numbers)]
    (. builder requireNumbers data))
  (when-some [data (lookup-entry config id :require-symbols)]
    (. builder requireSymbols data))
  (when-some [data (lookup-entry config id :require-uppercase)]
    (. builder requireUppercase data))
  (when-some [data (lookup-entry config id :temporary-password-validity-days)]
    (. builder temporaryPasswordValidityDays data))
  (.build builder))


(defn cfn-user-pool-password-policy-property-builder
  "Creates a  `CfnUserPool$PasswordPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-password-policy-property-builder> (new CfnUserPool$PasswordPolicyProperty$Builder) id config))


(defn cfn-user-pool-policies-property-builder>
  "The cfn-user-pool-policies-property-builder> function updates a CfnUserPool$PoliciesProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$PoliciesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordPolicy` | software.amazon.awscdk.services.cognito.CfnUserPool$PasswordPolicyProperty | [[cdk.support/lookup-entry]] | `:password-policy` |
"
  [^CfnUserPool$PoliciesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password-policy)]
    (. builder passwordPolicy data))
  (.build builder))


(defn cfn-user-pool-policies-property-builder
  "Creates a  `CfnUserPool$PoliciesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-policies-property-builder> (new CfnUserPool$PoliciesProperty$Builder) id config))


(defn cfn-user-pool-pre-token-generation-config-property-builder>
  "The cfn-user-pool-pre-token-generation-config-property-builder> function updates a CfnUserPool$PreTokenGenerationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$PreTokenGenerationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `lambdaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-version` |
"
  [^CfnUserPool$PreTokenGenerationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (when-some [data (lookup-entry config id :lambda-version)]
    (. builder lambdaVersion data))
  (.build builder))


(defn cfn-user-pool-pre-token-generation-config-property-builder
  "Creates a  `CfnUserPool$PreTokenGenerationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-pre-token-generation-config-property-builder> (new CfnUserPool$PreTokenGenerationConfigProperty$Builder) id config))


(defn cfn-user-pool-props-builder>
  "The cfn-user-pool-props-builder> function updates a CfnUserPoolProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountRecoverySetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-recovery-setting` |
| `adminCreateUserConfig` | software.amazon.awscdk.services.cognito.CfnUserPool$AdminCreateUserConfigProperty | [[cdk.support/lookup-entry]] | `:admin-create-user-config` |
| `aliasAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:alias-attributes` |
| `autoVerifiedAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-verified-attributes` |
| `deletionProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `deviceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:device-configuration` |
| `emailConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPool$EmailConfigurationProperty | [[cdk.support/lookup-entry]] | `:email-configuration` |
| `emailVerificationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-verification-message` |
| `emailVerificationSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-verification-subject` |
| `enabledMfas` | java.util.List | [[cdk.support/lookup-entry]] | `:enabled-mfas` |
| `lambdaConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-config` |
| `mfaConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:mfa-configuration` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
| `schema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema` |
| `smsAuthenticationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-authentication-message` |
| `smsConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPool$SmsConfigurationProperty | [[cdk.support/lookup-entry]] | `:sms-configuration` |
| `smsVerificationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-verification-message` |
| `userAttributeUpdateSettings` | software.amazon.awscdk.services.cognito.CfnUserPool$UserAttributeUpdateSettingsProperty | [[cdk.support/lookup-entry]] | `:user-attribute-update-settings` |
| `userPoolAddOns` | software.amazon.awscdk.services.cognito.CfnUserPool$UserPoolAddOnsProperty | [[cdk.support/lookup-entry]] | `:user-pool-add-ons` |
| `userPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-name` |
| `userPoolTags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:user-pool-tags` |
| `usernameAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:username-attributes` |
| `usernameConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPool$UsernameConfigurationProperty | [[cdk.support/lookup-entry]] | `:username-configuration` |
| `verificationMessageTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:verification-message-template` |
"
  [^CfnUserPoolProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-recovery-setting)]
    (. builder accountRecoverySetting data))
  (when-some [data (lookup-entry config id :admin-create-user-config)]
    (. builder adminCreateUserConfig data))
  (when-some [data (lookup-entry config id :alias-attributes)]
    (. builder aliasAttributes data))
  (when-some [data (lookup-entry config id :auto-verified-attributes)]
    (. builder autoVerifiedAttributes data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :device-configuration)]
    (. builder deviceConfiguration data))
  (when-some [data (lookup-entry config id :email-configuration)]
    (. builder emailConfiguration data))
  (when-some [data (lookup-entry config id :email-verification-message)]
    (. builder emailVerificationMessage data))
  (when-some [data (lookup-entry config id :email-verification-subject)]
    (. builder emailVerificationSubject data))
  (when-some [data (lookup-entry config id :enabled-mfas)]
    (. builder enabledMfas data))
  (when-some [data (lookup-entry config id :lambda-config)]
    (. builder lambdaConfig data))
  (when-some [data (lookup-entry config id :mfa-configuration)]
    (. builder mfaConfiguration data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :sms-authentication-message)]
    (. builder smsAuthenticationMessage data))
  (when-some [data (lookup-entry config id :sms-configuration)]
    (. builder smsConfiguration data))
  (when-some [data (lookup-entry config id :sms-verification-message)]
    (. builder smsVerificationMessage data))
  (when-some [data (lookup-entry config id :user-attribute-update-settings)]
    (. builder userAttributeUpdateSettings data))
  (when-some [data (lookup-entry config id :user-pool-add-ons)]
    (. builder userPoolAddOns data))
  (when-some [data (lookup-entry config id :user-pool-name)]
    (. builder userPoolName data))
  (when-some [data (lookup-entry config id :user-pool-tags)]
    (. builder userPoolTags data))
  (when-some [data (lookup-entry config id :username-attributes)]
    (. builder usernameAttributes data))
  (when-some [data (lookup-entry config id :username-configuration)]
    (. builder usernameConfiguration data))
  (when-some [data (lookup-entry config id :verification-message-template)]
    (. builder verificationMessageTemplate data))
  (.build builder))


(defn cfn-user-pool-props-builder
  "Creates a  `CfnUserPoolProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-props-builder> (new CfnUserPoolProps$Builder) id config))


(defn cfn-user-pool-recovery-option-property-builder>
  "The cfn-user-pool-recovery-option-property-builder> function updates a CfnUserPool$RecoveryOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$RecoveryOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^CfnUserPool$RecoveryOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn cfn-user-pool-recovery-option-property-builder
  "Creates a  `CfnUserPool$RecoveryOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-recovery-option-property-builder> (new CfnUserPool$RecoveryOptionProperty$Builder) id config))


(defn cfn-user-pool-resource-server-builder>
  "The cfn-user-pool-resource-server-builder> function updates a CfnUserPoolResourceServer$Builder instance using the provided configuration.
  The function takes the CfnUserPoolResourceServer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scopes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolResourceServer$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-resource-server-builder
  "Creates a  `CfnUserPoolResourceServer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-resource-server-builder> (CfnUserPoolResourceServer$Builder/create scope (name id)) id config))


(defn cfn-user-pool-resource-server-props-builder>
  "The cfn-user-pool-resource-server-props-builder> function updates a CfnUserPoolResourceServerProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolResourceServerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolResourceServerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-resource-server-props-builder
  "Creates a  `CfnUserPoolResourceServerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-resource-server-props-builder> (new CfnUserPoolResourceServerProps$Builder) id config))


(defn cfn-user-pool-resource-server-resource-server-scope-type-property-builder>
  "The cfn-user-pool-resource-server-resource-server-scope-type-property-builder> function updates a CfnUserPoolResourceServer$ResourceServerScopeTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolResourceServer$ResourceServerScopeTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scopeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope-description` |
| `scopeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope-name` |
"
  [^CfnUserPoolResourceServer$ResourceServerScopeTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :scope-description)]
    (. builder scopeDescription data))
  (when-some [data (lookup-entry config id :scope-name)]
    (. builder scopeName data))
  (.build builder))


(defn cfn-user-pool-resource-server-resource-server-scope-type-property-builder
  "Creates a  `CfnUserPoolResourceServer$ResourceServerScopeTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-resource-server-resource-server-scope-type-property-builder> (new CfnUserPoolResourceServer$ResourceServerScopeTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-account-takeover-action-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-account-takeover-action-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-action` |
| `notify` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify` |
"
  [^CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-action)]
    (. builder eventAction data))
  (when-some [data (lookup-entry config id :notify)]
    (. builder notify data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-account-takeover-action-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-account-takeover-action-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-account-takeover-actions-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-account-takeover-actions-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionsTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionsTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `highAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:high-action` |
| `lowAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:low-action` |
| `mediumAction` | software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionTypeProperty | [[cdk.support/lookup-entry]] | `:medium-action` |
"
  [^CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionsTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :high-action)]
    (. builder highAction data))
  (when-some [data (lookup-entry config id :low-action)]
    (. builder lowAction data))
  (when-some [data (lookup-entry config id :medium-action)]
    (. builder mediumAction data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-account-takeover-actions-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionsTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-account-takeover-actions-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$AccountTakeoverActionsTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-account-takeover-risk-configuration-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-account-takeover-risk-configuration-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `notifyConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty | [[cdk.support/lookup-entry]] | `:notify-configuration` |
"
  [^CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :notify-configuration)]
    (. builder notifyConfiguration data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-account-takeover-risk-configuration-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-account-takeover-risk-configuration-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-builder>
  "The cfn-user-pool-risk-configuration-attachment-builder> function updates a CfnUserPoolRiskConfigurationAttachment$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountTakeoverRiskConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-takeover-risk-configuration` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `compromisedCredentialsRiskConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compromised-credentials-risk-configuration` |
| `riskExceptionConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty | [[cdk.support/lookup-entry]] | `:risk-exception-configuration` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolRiskConfigurationAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :account-takeover-risk-configuration)]
    (. builder accountTakeoverRiskConfiguration data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :compromised-credentials-risk-configuration)]
    (. builder compromisedCredentialsRiskConfiguration data))
  (when-some [data (lookup-entry config id :risk-exception-configuration)]
    (. builder riskExceptionConfiguration data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-risk-configuration-attachment-builder> (CfnUserPoolRiskConfigurationAttachment$Builder/create scope (name id)) id config))


(defn cfn-user-pool-risk-configuration-attachment-compromised-credentials-actions-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-compromised-credentials-actions-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsActionsTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsActionsTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-action` |
"
  [^CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsActionsTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-action)]
    (. builder eventAction data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-compromised-credentials-actions-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsActionsTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-compromised-credentials-actions-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsActionsTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-compromised-credentials-risk-configuration-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-compromised-credentials-risk-configuration-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsRiskConfigurationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsRiskConfigurationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `eventFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:event-filter` |
"
  [^CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsRiskConfigurationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :event-filter)]
    (. builder eventFilter data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-compromised-credentials-risk-configuration-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsRiskConfigurationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-compromised-credentials-risk-configuration-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$CompromisedCredentialsRiskConfigurationTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-notify-configuration-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-notify-configuration-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockEmail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-email` |
| `from` | java.lang.String | [[cdk.support/lookup-entry]] | `:from` |
| `mfaEmail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mfa-email` |
| `noActionEmail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-action-email` |
| `replyTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:reply-to` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :block-email)]
    (. builder blockEmail data))
  (when-some [data (lookup-entry config id :from)]
    (. builder from data))
  (when-some [data (lookup-entry config id :mfa-email)]
    (. builder mfaEmail data))
  (when-some [data (lookup-entry config id :no-action-email)]
    (. builder noActionEmail data))
  (when-some [data (lookup-entry config id :reply-to)]
    (. builder replyTo data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-notify-configuration-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-notify-configuration-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$NotifyConfigurationTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-notify-email-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-notify-email-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$NotifyEmailTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$NotifyEmailTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `htmlBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-body` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `textBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-body` |
"
  [^CfnUserPoolRiskConfigurationAttachment$NotifyEmailTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :html-body)]
    (. builder htmlBody data))
  (when-some [data (lookup-entry config id :subject)]
    (. builder subject data))
  (when-some [data (lookup-entry config id :text-body)]
    (. builder textBody data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-notify-email-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$NotifyEmailTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-notify-email-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$NotifyEmailTypeProperty$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-props-builder>
  "The cfn-user-pool-risk-configuration-attachment-props-builder> function updates a CfnUserPoolRiskConfigurationAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountTakeoverRiskConfiguration` | software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment$AccountTakeoverRiskConfigurationTypeProperty | [[cdk.support/lookup-entry]] | `:account-takeover-risk-configuration` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `compromisedCredentialsRiskConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compromised-credentials-risk-configuration` |
| `riskExceptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:risk-exception-configuration` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolRiskConfigurationAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-takeover-risk-configuration)]
    (. builder accountTakeoverRiskConfiguration data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :compromised-credentials-risk-configuration)]
    (. builder compromisedCredentialsRiskConfiguration data))
  (when-some [data (lookup-entry config id :risk-exception-configuration)]
    (. builder riskExceptionConfiguration data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-props-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-props-builder> (new CfnUserPoolRiskConfigurationAttachmentProps$Builder) id config))


(defn cfn-user-pool-risk-configuration-attachment-risk-exception-configuration-type-property-builder>
  "The cfn-user-pool-risk-configuration-attachment-risk-exception-configuration-type-property-builder> function updates a CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockedIpRangeList` | java.util.List | [[cdk.support/lookup-entry]] | `:blocked-ip-range-list` |
| `skippedIpRangeList` | java.util.List | [[cdk.support/lookup-entry]] | `:skipped-ip-range-list` |
"
  [^CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :blocked-ip-range-list)]
    (. builder blockedIpRangeList data))
  (when-some [data (lookup-entry config id :skipped-ip-range-list)]
    (. builder skippedIpRangeList data))
  (.build builder))


(defn cfn-user-pool-risk-configuration-attachment-risk-exception-configuration-type-property-builder
  "Creates a  `CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-risk-configuration-attachment-risk-exception-configuration-type-property-builder> (new CfnUserPoolRiskConfigurationAttachment$RiskExceptionConfigurationTypeProperty$Builder) id config))


(defn cfn-user-pool-schema-attribute-property-builder>
  "The cfn-user-pool-schema-attribute-property-builder> function updates a CfnUserPool$SchemaAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$SchemaAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-data-type` |
| `developerOnlyAttribute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:developer-only-attribute` |
| `mutable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutable` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `numberAttributeConstraints` | software.amazon.awscdk.services.cognito.CfnUserPool$NumberAttributeConstraintsProperty | [[cdk.support/lookup-entry]] | `:number-attribute-constraints` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `stringAttributeConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-attribute-constraints` |
"
  [^CfnUserPool$SchemaAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-data-type)]
    (. builder attributeDataType data))
  (when-some [data (lookup-entry config id :developer-only-attribute)]
    (. builder developerOnlyAttribute data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :number-attribute-constraints)]
    (. builder numberAttributeConstraints data))
  (when-some [data (lookup-entry config id :required)]
    (. builder required data))
  (when-some [data (lookup-entry config id :string-attribute-constraints)]
    (. builder stringAttributeConstraints data))
  (.build builder))


(defn cfn-user-pool-schema-attribute-property-builder
  "Creates a  `CfnUserPool$SchemaAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-schema-attribute-property-builder> (new CfnUserPool$SchemaAttributeProperty$Builder) id config))


(defn cfn-user-pool-sms-configuration-property-builder>
  "The cfn-user-pool-sms-configuration-property-builder> function updates a CfnUserPool$SmsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$SmsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `snsCallerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-caller-arn` |
| `snsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-region` |
"
  [^CfnUserPool$SmsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :sns-caller-arn)]
    (. builder snsCallerArn data))
  (when-some [data (lookup-entry config id :sns-region)]
    (. builder snsRegion data))
  (.build builder))


(defn cfn-user-pool-sms-configuration-property-builder
  "Creates a  `CfnUserPool$SmsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-sms-configuration-property-builder> (new CfnUserPool$SmsConfigurationProperty$Builder) id config))


(defn cfn-user-pool-string-attribute-constraints-property-builder>
  "The cfn-user-pool-string-attribute-constraints-property-builder> function updates a CfnUserPool$StringAttributeConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$StringAttributeConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-length` |
| `minLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:min-length` |
"
  [^CfnUserPool$StringAttributeConstraintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-length)]
    (. builder maxLength data))
  (when-some [data (lookup-entry config id :min-length)]
    (. builder minLength data))
  (.build builder))


(defn cfn-user-pool-string-attribute-constraints-property-builder
  "Creates a  `CfnUserPool$StringAttributeConstraintsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-string-attribute-constraints-property-builder> (new CfnUserPool$StringAttributeConstraintsProperty$Builder) id config))


(defn cfn-user-pool-ui-customization-attachment-builder>
  "The cfn-user-pool-ui-customization-attachment-builder> function updates a CfnUserPoolUICustomizationAttachment$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUICustomizationAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `css` | java.lang.String | [[cdk.support/lookup-entry]] | `:css` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolUICustomizationAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :css)]
    (. builder css data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-ui-customization-attachment-builder
  "Creates a  `CfnUserPoolUICustomizationAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-ui-customization-attachment-builder> (CfnUserPoolUICustomizationAttachment$Builder/create scope (name id)) id config))


(defn cfn-user-pool-ui-customization-attachment-props-builder>
  "The cfn-user-pool-ui-customization-attachment-props-builder> function updates a CfnUserPoolUICustomizationAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUICustomizationAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `css` | java.lang.String | [[cdk.support/lookup-entry]] | `:css` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnUserPoolUICustomizationAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :css)]
    (. builder css data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-user-pool-ui-customization-attachment-props-builder
  "Creates a  `CfnUserPoolUICustomizationAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-ui-customization-attachment-props-builder> (new CfnUserPoolUICustomizationAttachmentProps$Builder) id config))


(defn cfn-user-pool-user-attribute-type-property-builder>
  "The cfn-user-pool-user-attribute-type-property-builder> function updates a CfnUserPoolUser$AttributeTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUser$AttributeTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnUserPoolUser$AttributeTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-user-pool-user-attribute-type-property-builder
  "Creates a  `CfnUserPoolUser$AttributeTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-user-attribute-type-property-builder> (new CfnUserPoolUser$AttributeTypeProperty$Builder) id config))


(defn cfn-user-pool-user-attribute-update-settings-property-builder>
  "The cfn-user-pool-user-attribute-update-settings-property-builder> function updates a CfnUserPool$UserAttributeUpdateSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$UserAttributeUpdateSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributesRequireVerificationBeforeUpdate` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes-require-verification-before-update` |
"
  [^CfnUserPool$UserAttributeUpdateSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes-require-verification-before-update)]
    (. builder attributesRequireVerificationBeforeUpdate data))
  (.build builder))


(defn cfn-user-pool-user-attribute-update-settings-property-builder
  "Creates a  `CfnUserPool$UserAttributeUpdateSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-user-attribute-update-settings-property-builder> (new CfnUserPool$UserAttributeUpdateSettingsProperty$Builder) id config))


(defn cfn-user-pool-user-builder>
  "The cfn-user-pool-user-builder> function updates a CfnUserPoolUser$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientMetadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:client-metadata` |
| `desiredDeliveryMediums` | java.util.List | [[cdk.support/lookup-entry]] | `:desired-delivery-mediums` |
| `forceAliasCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force-alias-creation` |
| `messageAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-action` |
| `userAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:user-attributes` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
| `validationData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-data` |
"
  [^CfnUserPoolUser$Builder builder id config]
  (when-some [data (lookup-entry config id :client-metadata)]
    (. builder clientMetadata data))
  (when-some [data (lookup-entry config id :desired-delivery-mediums)]
    (. builder desiredDeliveryMediums data))
  (when-some [data (lookup-entry config id :force-alias-creation)]
    (. builder forceAliasCreation data))
  (when-some [data (lookup-entry config id :message-action)]
    (. builder messageAction data))
  (when-some [data (lookup-entry config id :user-attributes)]
    (. builder userAttributes data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (when-some [data (lookup-entry config id :validation-data)]
    (. builder validationData data))
  (.build builder))


(defn cfn-user-pool-user-builder
  "Creates a  `CfnUserPoolUser$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-user-builder> (CfnUserPoolUser$Builder/create scope (name id)) id config))


(defn cfn-user-pool-user-pool-add-ons-property-builder>
  "The cfn-user-pool-user-pool-add-ons-property-builder> function updates a CfnUserPool$UserPoolAddOnsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$UserPoolAddOnsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedSecurityMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:advanced-security-mode` |
"
  [^CfnUserPool$UserPoolAddOnsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :advanced-security-mode)]
    (. builder advancedSecurityMode data))
  (.build builder))


(defn cfn-user-pool-user-pool-add-ons-property-builder
  "Creates a  `CfnUserPool$UserPoolAddOnsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-user-pool-add-ons-property-builder> (new CfnUserPool$UserPoolAddOnsProperty$Builder) id config))


(defn cfn-user-pool-user-props-builder>
  "The cfn-user-pool-user-props-builder> function updates a CfnUserPoolUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-metadata` |
| `desiredDeliveryMediums` | java.util.List | [[cdk.support/lookup-entry]] | `:desired-delivery-mediums` |
| `forceAliasCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force-alias-creation` |
| `messageAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-action` |
| `userAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-attributes` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
| `validationData` | java.util.List | [[cdk.support/lookup-entry]] | `:validation-data` |
"
  [^CfnUserPoolUserProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-metadata)]
    (. builder clientMetadata data))
  (when-some [data (lookup-entry config id :desired-delivery-mediums)]
    (. builder desiredDeliveryMediums data))
  (when-some [data (lookup-entry config id :force-alias-creation)]
    (. builder forceAliasCreation data))
  (when-some [data (lookup-entry config id :message-action)]
    (. builder messageAction data))
  (when-some [data (lookup-entry config id :user-attributes)]
    (. builder userAttributes data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (when-some [data (lookup-entry config id :validation-data)]
    (. builder validationData data))
  (.build builder))


(defn cfn-user-pool-user-props-builder
  "Creates a  `CfnUserPoolUserProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-user-props-builder> (new CfnUserPoolUserProps$Builder) id config))


(defn cfn-user-pool-user-to-group-attachment-builder>
  "The cfn-user-pool-user-to-group-attachment-builder> function updates a CfnUserPoolUserToGroupAttachment$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUserToGroupAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnUserPoolUserToGroupAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-user-pool-user-to-group-attachment-builder
  "Creates a  `CfnUserPoolUserToGroupAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-pool-user-to-group-attachment-builder> (CfnUserPoolUserToGroupAttachment$Builder/create scope (name id)) id config))


(defn cfn-user-pool-user-to-group-attachment-props-builder>
  "The cfn-user-pool-user-to-group-attachment-props-builder> function updates a CfnUserPoolUserToGroupAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnUserPoolUserToGroupAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnUserPoolUserToGroupAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-user-pool-user-to-group-attachment-props-builder
  "Creates a  `CfnUserPoolUserToGroupAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-user-to-group-attachment-props-builder> (new CfnUserPoolUserToGroupAttachmentProps$Builder) id config))


(defn cfn-user-pool-username-configuration-property-builder>
  "The cfn-user-pool-username-configuration-property-builder> function updates a CfnUserPool$UsernameConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$UsernameConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:case-sensitive` |
"
  [^CfnUserPool$UsernameConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :case-sensitive)]
    (. builder caseSensitive data))
  (.build builder))


(defn cfn-user-pool-username-configuration-property-builder
  "Creates a  `CfnUserPool$UsernameConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-username-configuration-property-builder> (new CfnUserPool$UsernameConfigurationProperty$Builder) id config))


(defn cfn-user-pool-verification-message-template-property-builder>
  "The cfn-user-pool-verification-message-template-property-builder> function updates a CfnUserPool$VerificationMessageTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnUserPool$VerificationMessageTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEmailOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-email-option` |
| `emailMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-message` |
| `emailMessageByLink` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-message-by-link` |
| `emailSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-subject` |
| `emailSubjectByLink` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-subject-by-link` |
| `smsMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-message` |
"
  [^CfnUserPool$VerificationMessageTemplateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-email-option)]
    (. builder defaultEmailOption data))
  (when-some [data (lookup-entry config id :email-message)]
    (. builder emailMessage data))
  (when-some [data (lookup-entry config id :email-message-by-link)]
    (. builder emailMessageByLink data))
  (when-some [data (lookup-entry config id :email-subject)]
    (. builder emailSubject data))
  (when-some [data (lookup-entry config id :email-subject-by-link)]
    (. builder emailSubjectByLink data))
  (when-some [data (lookup-entry config id :sms-message)]
    (. builder smsMessage data))
  (.build builder))


(defn cfn-user-pool-verification-message-template-property-builder
  "Creates a  `CfnUserPool$VerificationMessageTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-user-pool-verification-message-template-property-builder> (new CfnUserPool$VerificationMessageTemplateProperty$Builder) id config))


(defn cognito-domain-options-builder>
  "The cognito-domain-options-builder> function updates a CognitoDomainOptions$Builder instance using the provided configuration.
  The function takes the CognitoDomainOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-prefix` |
"
  [^CognitoDomainOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-prefix)]
    (. builder domainPrefix data))
  (.build builder))


(defn cognito-domain-options-builder
  "Creates a  `CognitoDomainOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cognito-domain-options-builder> (new CognitoDomainOptions$Builder) id config))


(defn custom-attribute-config-builder>
  "The custom-attribute-config-builder> function updates a CustomAttributeConfig$Builder instance using the provided configuration.
  The function takes the CustomAttributeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
| `numberConstraints` | software.amazon.awscdk.services.cognito.NumberAttributeConstraints | [[cdk.support/lookup-entry]] | `:number-constraints` |
| `stringConstraints` | software.amazon.awscdk.services.cognito.StringAttributeConstraints | [[cdk.support/lookup-entry]] | `:string-constraints` |
"
  [^CustomAttributeConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (when-some [data (lookup-entry config id :number-constraints)]
    (. builder numberConstraints data))
  (when-some [data (lookup-entry config id :string-constraints)]
    (. builder stringConstraints data))
  (.build builder))


(defn custom-attribute-config-builder
  "Creates a  `CustomAttributeConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (custom-attribute-config-builder> (new CustomAttributeConfig$Builder) id config))


(defn custom-attribute-props-builder>
  "The custom-attribute-props-builder> function updates a CustomAttributeProps$Builder instance using the provided configuration.
  The function takes the CustomAttributeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^CustomAttributeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn custom-attribute-props-builder
  "Creates a  `CustomAttributeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (custom-attribute-props-builder> (new CustomAttributeProps$Builder) id config))


(defn custom-domain-options-builder>
  "The custom-domain-options-builder> function updates a CustomDomainOptions$Builder instance using the provided configuration.
  The function takes the CustomDomainOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CustomDomainOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn custom-domain-options-builder
  "Creates a  `CustomDomainOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (custom-domain-options-builder> (new CustomDomainOptions$Builder) id config))


(defn date-time-attribute-builder>
  "The date-time-attribute-builder> function updates a DateTimeAttribute$Builder instance using the provided configuration.
  The function takes the DateTimeAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^DateTimeAttribute$Builder builder id config]
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn date-time-attribute-builder
  "Creates a  `DateTimeAttribute$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (date-time-attribute-builder> (DateTimeAttribute$Builder/create) id config))


(defn device-tracking-builder>
  "The device-tracking-builder> function updates a DeviceTracking$Builder instance using the provided configuration.
  The function takes the DeviceTracking$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `challengeRequiredOnNewDevice` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:challenge-required-on-new-device` |
| `deviceOnlyRememberedOnUserPrompt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:device-only-remembered-on-user-prompt` |
"
  [^DeviceTracking$Builder builder id config]
  (when-some [data (lookup-entry config id :challenge-required-on-new-device)]
    (. builder challengeRequiredOnNewDevice data))
  (when-some [data (lookup-entry config id :device-only-remembered-on-user-prompt)]
    (. builder deviceOnlyRememberedOnUserPrompt data))
  (.build builder))


(defn device-tracking-builder
  "Creates a  `DeviceTracking$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (device-tracking-builder> (new DeviceTracking$Builder) id config))


(defn email-settings-builder>
  "The email-settings-builder> function updates a EmailSettings$Builder instance using the provided configuration.
  The function takes the EmailSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `from` | java.lang.String | [[cdk.support/lookup-entry]] | `:from` |
| `replyTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:reply-to` |
"
  [^EmailSettings$Builder builder id config]
  (when-some [data (lookup-entry config id :from)]
    (. builder from data))
  (when-some [data (lookup-entry config id :reply-to)]
    (. builder replyTo data))
  (.build builder))


(defn email-settings-builder
  "Creates a  `EmailSettings$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (email-settings-builder> (new EmailSettings$Builder) id config))


(defn keep-original-attrs-builder>
  "The keep-original-attrs-builder> function updates a KeepOriginalAttrs$Builder instance using the provided configuration.
  The function takes the KeepOriginalAttrs$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email` |
| `phone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:phone` |
"
  [^KeepOriginalAttrs$Builder builder id config]
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :phone)]
    (. builder phone data))
  (.build builder))


(defn keep-original-attrs-builder
  "Creates a  `KeepOriginalAttrs$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (keep-original-attrs-builder> (new KeepOriginalAttrs$Builder) id config))


(defn mfa-second-factor-builder>
  "The mfa-second-factor-builder> function updates a MfaSecondFactor$Builder instance using the provided configuration.
  The function takes the MfaSecondFactor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `otp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:otp` |
| `sms` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sms` |
"
  [^MfaSecondFactor$Builder builder id config]
  (when-some [data (lookup-entry config id :otp)]
    (. builder otp data))
  (when-some [data (lookup-entry config id :sms)]
    (. builder sms data))
  (.build builder))


(defn mfa-second-factor-builder
  "Creates a  `MfaSecondFactor$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (mfa-second-factor-builder> (new MfaSecondFactor$Builder) id config))


(defn number-attribute-builder>
  "The number-attribute-builder> function updates a NumberAttribute$Builder instance using the provided configuration.
  The function takes the NumberAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^NumberAttribute$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn number-attribute-builder
  "Creates a  `NumberAttribute$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (number-attribute-builder> (NumberAttribute$Builder/create) id config))


(defn number-attribute-constraints-builder>
  "The number-attribute-constraints-builder> function updates a NumberAttributeConstraints$Builder instance using the provided configuration.
  The function takes the NumberAttributeConstraints$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
"
  [^NumberAttributeConstraints$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (.build builder))


(defn number-attribute-constraints-builder
  "Creates a  `NumberAttributeConstraints$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (number-attribute-constraints-builder> (new NumberAttributeConstraints$Builder) id config))


(defn number-attribute-props-builder>
  "The number-attribute-props-builder> function updates a NumberAttributeProps$Builder instance using the provided configuration.
  The function takes the NumberAttributeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^NumberAttributeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn number-attribute-props-builder
  "Creates a  `NumberAttributeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (number-attribute-props-builder> (new NumberAttributeProps$Builder) id config))


(defn o-auth-flows-builder>
  "The o-auth-flows-builder> function updates a OAuthFlows$Builder instance using the provided configuration.
  The function takes the OAuthFlows$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationCodeGrant` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorization-code-grant` |
| `clientCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:client-credentials` |
| `implicitCodeGrant` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:implicit-code-grant` |
"
  [^OAuthFlows$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization-code-grant)]
    (. builder authorizationCodeGrant data))
  (when-some [data (lookup-entry config id :client-credentials)]
    (. builder clientCredentials data))
  (when-some [data (lookup-entry config id :implicit-code-grant)]
    (. builder implicitCodeGrant data))
  (.build builder))


(defn o-auth-flows-builder
  "Creates a  `OAuthFlows$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (o-auth-flows-builder> (new OAuthFlows$Builder) id config))


(defn o-auth-settings-builder>
  "The o-auth-settings-builder> function updates a OAuthSettings$Builder instance using the provided configuration.
  The function takes the OAuthSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `callbackUrls` | java.util.List | [[cdk.support/lookup-entry]] | `:callback-urls` |
| `flows` | software.amazon.awscdk.services.cognito.OAuthFlows | [[cdk.support/lookup-entry]] | `:flows` |
| `logoutUrls` | java.util.List | [[cdk.support/lookup-entry]] | `:logout-urls` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
"
  [^OAuthSettings$Builder builder id config]
  (when-some [data (lookup-entry config id :callback-urls)]
    (. builder callbackUrls data))
  (when-some [data (lookup-entry config id :flows)]
    (. builder flows data))
  (when-some [data (lookup-entry config id :logout-urls)]
    (. builder logoutUrls data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (.build builder))


(defn o-auth-settings-builder
  "Creates a  `OAuthSettings$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (o-auth-settings-builder> (new OAuthSettings$Builder) id config))


(defn oidc-endpoints-builder>
  "The oidc-endpoints-builder> function updates a OidcEndpoints$Builder instance using the provided configuration.
  The function takes the OidcEndpoints$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization` |
| `jwksUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:jwks-uri` |
| `token` | java.lang.String | [[cdk.support/lookup-entry]] | `:token` |
| `userInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info` |
"
  [^OidcEndpoints$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization)]
    (. builder authorization data))
  (when-some [data (lookup-entry config id :jwks-uri)]
    (. builder jwksUri data))
  (when-some [data (lookup-entry config id :token)]
    (. builder token data))
  (when-some [data (lookup-entry config id :user-info)]
    (. builder userInfo data))
  (.build builder))


(defn oidc-endpoints-builder
  "Creates a  `OidcEndpoints$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (oidc-endpoints-builder> (new OidcEndpoints$Builder) id config))


(defn password-policy-builder>
  "The password-policy-builder> function updates a PasswordPolicy$Builder instance using the provided configuration.
  The function takes the PasswordPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-length` |
| `requireDigits` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-digits` |
| `requireLowercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-lowercase` |
| `requireSymbols` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-symbols` |
| `requireUppercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-uppercase` |
| `tempPasswordValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:temp-password-validity` |
"
  [^PasswordPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :min-length)]
    (. builder minLength data))
  (when-some [data (lookup-entry config id :require-digits)]
    (. builder requireDigits data))
  (when-some [data (lookup-entry config id :require-lowercase)]
    (. builder requireLowercase data))
  (when-some [data (lookup-entry config id :require-symbols)]
    (. builder requireSymbols data))
  (when-some [data (lookup-entry config id :require-uppercase)]
    (. builder requireUppercase data))
  (when-some [data (lookup-entry config id :temp-password-validity)]
    (. builder tempPasswordValidity data))
  (.build builder))


(defn password-policy-builder
  "Creates a  `PasswordPolicy$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (password-policy-builder> (new PasswordPolicy$Builder) id config))


(defn resource-server-scope-builder>
  "The resource-server-scope-builder> function updates a ResourceServerScope$Builder instance using the provided configuration.
  The function takes the ResourceServerScope$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scopeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope-description` |
| `scopeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope-name` |
"
  [^ResourceServerScope$Builder builder id config]
  (when-some [data (lookup-entry config id :scope-description)]
    (. builder scopeDescription data))
  (when-some [data (lookup-entry config id :scope-name)]
    (. builder scopeName data))
  (.build builder))


(defn resource-server-scope-builder
  "Creates a  `ResourceServerScope$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (resource-server-scope-builder> (ResourceServerScope$Builder/create) id config))


(defn resource-server-scope-props-builder>
  "The resource-server-scope-props-builder> function updates a ResourceServerScopeProps$Builder instance using the provided configuration.
  The function takes the ResourceServerScopeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scopeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope-description` |
| `scopeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope-name` |
"
  [^ResourceServerScopeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :scope-description)]
    (. builder scopeDescription data))
  (when-some [data (lookup-entry config id :scope-name)]
    (. builder scopeName data))
  (.build builder))


(defn resource-server-scope-props-builder
  "Creates a  `ResourceServerScopeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (resource-server-scope-props-builder> (new ResourceServerScopeProps$Builder) id config))


(defn sign-in-aliases-builder>
  "The sign-in-aliases-builder> function updates a SignInAliases$Builder instance using the provided configuration.
  The function takes the SignInAliases$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email` |
| `phone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:phone` |
| `preferredUsername` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preferred-username` |
| `username` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:username` |
"
  [^SignInAliases$Builder builder id config]
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :phone)]
    (. builder phone data))
  (when-some [data (lookup-entry config id :preferred-username)]
    (. builder preferredUsername data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn sign-in-aliases-builder
  "Creates a  `SignInAliases$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (sign-in-aliases-builder> (new SignInAliases$Builder) id config))


(defn sign-in-url-options-builder>
  "The sign-in-url-options-builder> function updates a SignInUrlOptions$Builder instance using the provided configuration.
  The function takes the SignInUrlOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fips` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fips` |
| `redirectUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:redirect-uri` |
| `signInPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:sign-in-path` |
"
  [^SignInUrlOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :fips)]
    (. builder fips data))
  (when-some [data (lookup-entry config id :redirect-uri)]
    (. builder redirectUri data))
  (when-some [data (lookup-entry config id :sign-in-path)]
    (. builder signInPath data))
  (.build builder))


(defn sign-in-url-options-builder
  "Creates a  `SignInUrlOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (sign-in-url-options-builder> (new SignInUrlOptions$Builder) id config))


(defn standard-attribute-builder>
  "The standard-attribute-builder> function updates a StandardAttribute$Builder instance using the provided configuration.
  The function takes the StandardAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
"
  [^StandardAttribute$Builder builder id config]
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (when-some [data (lookup-entry config id :required)]
    (. builder required data))
  (.build builder))


(defn standard-attribute-builder
  "Creates a  `StandardAttribute$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (standard-attribute-builder> (new StandardAttribute$Builder) id config))


(defn standard-attributes-builder>
  "The standard-attributes-builder> function updates a StandardAttributes$Builder instance using the provided configuration.
  The function takes the StandardAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:address` |
| `birthdate` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:birthdate` |
| `email` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:email` |
| `familyName` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:family-name` |
| `fullname` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:fullname` |
| `gender` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:gender` |
| `givenName` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:given-name` |
| `lastUpdateTime` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:last-update-time` |
| `locale` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:locale` |
| `middleName` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:middle-name` |
| `nickname` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:nickname` |
| `phoneNumber` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:phone-number` |
| `preferredUsername` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:preferred-username` |
| `profilePage` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:profile-page` |
| `profilePicture` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:profile-picture` |
| `timezone` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:timezone` |
| `website` | software.amazon.awscdk.services.cognito.StandardAttribute | [[cdk.support/lookup-entry]] | `:website` |
"
  [^StandardAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :birthdate)]
    (. builder birthdate data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :family-name)]
    (. builder familyName data))
  (when-some [data (lookup-entry config id :fullname)]
    (. builder fullname data))
  (when-some [data (lookup-entry config id :gender)]
    (. builder gender data))
  (when-some [data (lookup-entry config id :given-name)]
    (. builder givenName data))
  (when-some [data (lookup-entry config id :last-update-time)]
    (. builder lastUpdateTime data))
  (when-some [data (lookup-entry config id :locale)]
    (. builder locale data))
  (when-some [data (lookup-entry config id :middle-name)]
    (. builder middleName data))
  (when-some [data (lookup-entry config id :nickname)]
    (. builder nickname data))
  (when-some [data (lookup-entry config id :phone-number)]
    (. builder phoneNumber data))
  (when-some [data (lookup-entry config id :preferred-username)]
    (. builder preferredUsername data))
  (when-some [data (lookup-entry config id :profile-page)]
    (. builder profilePage data))
  (when-some [data (lookup-entry config id :profile-picture)]
    (. builder profilePicture data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :website)]
    (. builder website data))
  (.build builder))


(defn standard-attributes-builder
  "Creates a  `StandardAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (standard-attributes-builder> (new StandardAttributes$Builder) id config))


(defn standard-attributes-mask-builder>
  "The standard-attributes-mask-builder> function updates a StandardAttributesMask$Builder instance using the provided configuration.
  The function takes the StandardAttributesMask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:address` |
| `birthdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:birthdate` |
| `email` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email` |
| `emailVerified` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email-verified` |
| `familyName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:family-name` |
| `fullname` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fullname` |
| `gender` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:gender` |
| `givenName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:given-name` |
| `lastUpdateTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:last-update-time` |
| `locale` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:locale` |
| `middleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:middle-name` |
| `nickname` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:nickname` |
| `phoneNumber` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:phone-number` |
| `phoneNumberVerified` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:phone-number-verified` |
| `preferredUsername` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preferred-username` |
| `profilePage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profile-page` |
| `profilePicture` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profile-picture` |
| `timezone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:timezone` |
| `website` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:website` |
"
  [^StandardAttributesMask$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :birthdate)]
    (. builder birthdate data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :email-verified)]
    (. builder emailVerified data))
  (when-some [data (lookup-entry config id :family-name)]
    (. builder familyName data))
  (when-some [data (lookup-entry config id :fullname)]
    (. builder fullname data))
  (when-some [data (lookup-entry config id :gender)]
    (. builder gender data))
  (when-some [data (lookup-entry config id :given-name)]
    (. builder givenName data))
  (when-some [data (lookup-entry config id :last-update-time)]
    (. builder lastUpdateTime data))
  (when-some [data (lookup-entry config id :locale)]
    (. builder locale data))
  (when-some [data (lookup-entry config id :middle-name)]
    (. builder middleName data))
  (when-some [data (lookup-entry config id :nickname)]
    (. builder nickname data))
  (when-some [data (lookup-entry config id :phone-number)]
    (. builder phoneNumber data))
  (when-some [data (lookup-entry config id :phone-number-verified)]
    (. builder phoneNumberVerified data))
  (when-some [data (lookup-entry config id :preferred-username)]
    (. builder preferredUsername data))
  (when-some [data (lookup-entry config id :profile-page)]
    (. builder profilePage data))
  (when-some [data (lookup-entry config id :profile-picture)]
    (. builder profilePicture data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :website)]
    (. builder website data))
  (.build builder))


(defn standard-attributes-mask-builder
  "Creates a  `StandardAttributesMask$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (standard-attributes-mask-builder> (new StandardAttributesMask$Builder) id config))


(defn string-attribute-builder>
  "The string-attribute-builder> function updates a StringAttribute$Builder instance using the provided configuration.
  The function takes the StringAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxLen` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-len` |
| `minLen` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-len` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^StringAttribute$Builder builder id config]
  (when-some [data (lookup-entry config id :max-len)]
    (. builder maxLen data))
  (when-some [data (lookup-entry config id :min-len)]
    (. builder minLen data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn string-attribute-builder
  "Creates a  `StringAttribute$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (string-attribute-builder> (StringAttribute$Builder/create) id config))


(defn string-attribute-constraints-builder>
  "The string-attribute-constraints-builder> function updates a StringAttributeConstraints$Builder instance using the provided configuration.
  The function takes the StringAttributeConstraints$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxLen` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-len` |
| `minLen` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-len` |
"
  [^StringAttributeConstraints$Builder builder id config]
  (when-some [data (lookup-entry config id :max-len)]
    (. builder maxLen data))
  (when-some [data (lookup-entry config id :min-len)]
    (. builder minLen data))
  (.build builder))


(defn string-attribute-constraints-builder
  "Creates a  `StringAttributeConstraints$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (string-attribute-constraints-builder> (new StringAttributeConstraints$Builder) id config))


(defn string-attribute-props-builder>
  "The string-attribute-props-builder> function updates a StringAttributeProps$Builder instance using the provided configuration.
  The function takes the StringAttributeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxLen` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-len` |
| `minLen` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-len` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^StringAttributeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :max-len)]
    (. builder maxLen data))
  (when-some [data (lookup-entry config id :min-len)]
    (. builder minLen data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn string-attribute-props-builder
  "Creates a  `StringAttributeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (string-attribute-props-builder> (new StringAttributeProps$Builder) id config))


(defn user-invitation-config-builder>
  "The user-invitation-config-builder> function updates a UserInvitationConfig$Builder instance using the provided configuration.
  The function takes the UserInvitationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-body` |
| `emailSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-subject` |
| `smsMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-message` |
"
  [^UserInvitationConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :email-body)]
    (. builder emailBody data))
  (when-some [data (lookup-entry config id :email-subject)]
    (. builder emailSubject data))
  (when-some [data (lookup-entry config id :sms-message)]
    (. builder smsMessage data))
  (.build builder))


(defn user-invitation-config-builder
  "Creates a  `UserInvitationConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-invitation-config-builder> (new UserInvitationConfig$Builder) id config))


(defn user-pool-builder>
  "The user-pool-builder> function updates a UserPool$Builder instance using the provided configuration.
  The function takes the UserPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountRecovery` | software.amazon.awscdk.services.cognito.AccountRecovery | [[cdk.api.services.cognito/account-recovery]] | `:account-recovery` |
| `advancedSecurityMode` | software.amazon.awscdk.services.cognito.AdvancedSecurityMode | [[cdk.api.services.cognito/advanced-security-mode]] | `:advanced-security-mode` |
| `autoVerify` | software.amazon.awscdk.services.cognito.AutoVerifiedAttrs | [[cdk.support/lookup-entry]] | `:auto-verify` |
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `customSenderKmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:custom-sender-kms-key` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `deviceTracking` | software.amazon.awscdk.services.cognito.DeviceTracking | [[cdk.support/lookup-entry]] | `:device-tracking` |
| `email` | software.amazon.awscdk.services.cognito.UserPoolEmail | [[cdk.support/lookup-entry]] | `:email` |
| `enableSmsRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sms-role` |
| `keepOriginal` | software.amazon.awscdk.services.cognito.KeepOriginalAttrs | [[cdk.support/lookup-entry]] | `:keep-original` |
| `lambdaTriggers` | software.amazon.awscdk.services.cognito.UserPoolTriggers | [[cdk.support/lookup-entry]] | `:lambda-triggers` |
| `mfa` | software.amazon.awscdk.services.cognito.Mfa | [[cdk.api.services.cognito/mfa]] | `:mfa` |
| `mfaMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:mfa-message` |
| `mfaSecondFactor` | software.amazon.awscdk.services.cognito.MfaSecondFactor | [[cdk.support/lookup-entry]] | `:mfa-second-factor` |
| `passwordPolicy` | software.amazon.awscdk.services.cognito.PasswordPolicy | [[cdk.support/lookup-entry]] | `:password-policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `selfSignUpEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-sign-up-enabled` |
| `signInAliases` | software.amazon.awscdk.services.cognito.SignInAliases | [[cdk.support/lookup-entry]] | `:sign-in-aliases` |
| `signInCaseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sign-in-case-sensitive` |
| `smsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:sms-role` |
| `smsRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-role-external-id` |
| `snsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-region` |
| `standardAttributes` | software.amazon.awscdk.services.cognito.StandardAttributes | [[cdk.support/lookup-entry]] | `:standard-attributes` |
| `userInvitation` | software.amazon.awscdk.services.cognito.UserInvitationConfig | [[cdk.support/lookup-entry]] | `:user-invitation` |
| `userPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-name` |
| `userVerification` | software.amazon.awscdk.services.cognito.UserVerificationConfig | [[cdk.support/lookup-entry]] | `:user-verification` |
"
  [^UserPool$Builder builder id config]
  (when-some [data (account-recovery config id :account-recovery)]
    (. builder accountRecovery data))
  (when-some [data (advanced-security-mode config id :advanced-security-mode)]
    (. builder advancedSecurityMode data))
  (when-some [data (lookup-entry config id :auto-verify)]
    (. builder autoVerify data))
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :custom-sender-kms-key)]
    (. builder customSenderKmsKey data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :device-tracking)]
    (. builder deviceTracking data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :enable-sms-role)]
    (. builder enableSmsRole data))
  (when-some [data (lookup-entry config id :keep-original)]
    (. builder keepOriginal data))
  (when-some [data (lookup-entry config id :lambda-triggers)]
    (. builder lambdaTriggers data))
  (when-some [data (mfa config id :mfa)]
    (. builder mfa data))
  (when-some [data (lookup-entry config id :mfa-message)]
    (. builder mfaMessage data))
  (when-some [data (lookup-entry config id :mfa-second-factor)]
    (. builder mfaSecondFactor data))
  (when-some [data (lookup-entry config id :password-policy)]
    (. builder passwordPolicy data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :self-sign-up-enabled)]
    (. builder selfSignUpEnabled data))
  (when-some [data (lookup-entry config id :sign-in-aliases)]
    (. builder signInAliases data))
  (when-some [data (lookup-entry config id :sign-in-case-sensitive)]
    (. builder signInCaseSensitive data))
  (when-some [data (lookup-entry config id :sms-role)]
    (. builder smsRole data))
  (when-some [data (lookup-entry config id :sms-role-external-id)]
    (. builder smsRoleExternalId data))
  (when-some [data (lookup-entry config id :sns-region)]
    (. builder snsRegion data))
  (when-some [data (lookup-entry config id :standard-attributes)]
    (. builder standardAttributes data))
  (when-some [data (lookup-entry config id :user-invitation)]
    (. builder userInvitation data))
  (when-some [data (lookup-entry config id :user-pool-name)]
    (. builder userPoolName data))
  (when-some [data (lookup-entry config id :user-verification)]
    (. builder userVerification data))
  (.build builder))


(defn user-pool-builder
  "Creates a  `UserPool$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-builder> (UserPool$Builder/create scope (name id)) id config))


(defn user-pool-client-builder>
  "The user-pool-client-builder> function updates a UserPoolClient$Builder instance using the provided configuration.
  The function takes the UserPoolClient$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-token-validity` |
| `authFlows` | software.amazon.awscdk.services.cognito.AuthFlow | [[cdk.support/lookup-entry]] | `:auth-flows` |
| `authSessionValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:auth-session-validity` |
| `disableOAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-o-auth` |
| `enablePropagateAdditionalUserContextData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-propagate-additional-user-context-data` |
| `enableTokenRevocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-token-revocation` |
| `generateSecret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-secret` |
| `idTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:id-token-validity` |
| `oAuth` | software.amazon.awscdk.services.cognito.OAuthSettings | [[cdk.support/lookup-entry]] | `:o-auth` |
| `preventUserExistenceErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prevent-user-existence-errors` |
| `readAttributes` | software.amazon.awscdk.services.cognito.ClientAttributes | [[cdk.support/lookup-entry]] | `:read-attributes` |
| `refreshTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:refresh-token-validity` |
| `supportedIdentityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-identity-providers` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
| `userPoolClientName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-name` |
| `writeAttributes` | software.amazon.awscdk.services.cognito.ClientAttributes | [[cdk.support/lookup-entry]] | `:write-attributes` |
"
  [^UserPoolClient$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token-validity)]
    (. builder accessTokenValidity data))
  (when-some [data (lookup-entry config id :auth-flows)]
    (. builder authFlows data))
  (when-some [data (lookup-entry config id :auth-session-validity)]
    (. builder authSessionValidity data))
  (when-some [data (lookup-entry config id :disable-o-auth)]
    (. builder disableOAuth data))
  (when-some [data (lookup-entry config id :enable-propagate-additional-user-context-data)]
    (. builder enablePropagateAdditionalUserContextData data))
  (when-some [data (lookup-entry config id :enable-token-revocation)]
    (. builder enableTokenRevocation data))
  (when-some [data (lookup-entry config id :generate-secret)]
    (. builder generateSecret data))
  (when-some [data (lookup-entry config id :id-token-validity)]
    (. builder idTokenValidity data))
  (when-some [data (lookup-entry config id :o-auth)]
    (. builder oAuth data))
  (when-some [data (lookup-entry config id :prevent-user-existence-errors)]
    (. builder preventUserExistenceErrors data))
  (when-some [data (lookup-entry config id :read-attributes)]
    (. builder readAttributes data))
  (when-some [data (lookup-entry config id :refresh-token-validity)]
    (. builder refreshTokenValidity data))
  (when-some [data (lookup-entry config id :supported-identity-providers)]
    (. builder supportedIdentityProviders data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (when-some [data (lookup-entry config id :user-pool-client-name)]
    (. builder userPoolClientName data))
  (when-some [data (lookup-entry config id :write-attributes)]
    (. builder writeAttributes data))
  (.build builder))


(defn user-pool-client-builder
  "Creates a  `UserPoolClient$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-client-builder> (UserPoolClient$Builder/create scope (name id)) id config))


(defn user-pool-client-options-builder>
  "The user-pool-client-options-builder> function updates a UserPoolClientOptions$Builder instance using the provided configuration.
  The function takes the UserPoolClientOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-token-validity` |
| `authFlows` | software.amazon.awscdk.services.cognito.AuthFlow | [[cdk.support/lookup-entry]] | `:auth-flows` |
| `authSessionValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:auth-session-validity` |
| `disableOAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-o-auth` |
| `enablePropagateAdditionalUserContextData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-propagate-additional-user-context-data` |
| `enableTokenRevocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-token-revocation` |
| `generateSecret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-secret` |
| `idTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:id-token-validity` |
| `oAuth` | software.amazon.awscdk.services.cognito.OAuthSettings | [[cdk.support/lookup-entry]] | `:o-auth` |
| `preventUserExistenceErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prevent-user-existence-errors` |
| `readAttributes` | software.amazon.awscdk.services.cognito.ClientAttributes | [[cdk.support/lookup-entry]] | `:read-attributes` |
| `refreshTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:refresh-token-validity` |
| `supportedIdentityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-identity-providers` |
| `userPoolClientName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-name` |
| `writeAttributes` | software.amazon.awscdk.services.cognito.ClientAttributes | [[cdk.support/lookup-entry]] | `:write-attributes` |
"
  [^UserPoolClientOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token-validity)]
    (. builder accessTokenValidity data))
  (when-some [data (lookup-entry config id :auth-flows)]
    (. builder authFlows data))
  (when-some [data (lookup-entry config id :auth-session-validity)]
    (. builder authSessionValidity data))
  (when-some [data (lookup-entry config id :disable-o-auth)]
    (. builder disableOAuth data))
  (when-some [data (lookup-entry config id :enable-propagate-additional-user-context-data)]
    (. builder enablePropagateAdditionalUserContextData data))
  (when-some [data (lookup-entry config id :enable-token-revocation)]
    (. builder enableTokenRevocation data))
  (when-some [data (lookup-entry config id :generate-secret)]
    (. builder generateSecret data))
  (when-some [data (lookup-entry config id :id-token-validity)]
    (. builder idTokenValidity data))
  (when-some [data (lookup-entry config id :o-auth)]
    (. builder oAuth data))
  (when-some [data (lookup-entry config id :prevent-user-existence-errors)]
    (. builder preventUserExistenceErrors data))
  (when-some [data (lookup-entry config id :read-attributes)]
    (. builder readAttributes data))
  (when-some [data (lookup-entry config id :refresh-token-validity)]
    (. builder refreshTokenValidity data))
  (when-some [data (lookup-entry config id :supported-identity-providers)]
    (. builder supportedIdentityProviders data))
  (when-some [data (lookup-entry config id :user-pool-client-name)]
    (. builder userPoolClientName data))
  (when-some [data (lookup-entry config id :write-attributes)]
    (. builder writeAttributes data))
  (.build builder))


(defn user-pool-client-options-builder
  "Creates a  `UserPoolClientOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-client-options-builder> (new UserPoolClientOptions$Builder) id config))


(defn user-pool-client-props-builder>
  "The user-pool-client-props-builder> function updates a UserPoolClientProps$Builder instance using the provided configuration.
  The function takes the UserPoolClientProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-token-validity` |
| `authFlows` | software.amazon.awscdk.services.cognito.AuthFlow | [[cdk.support/lookup-entry]] | `:auth-flows` |
| `authSessionValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:auth-session-validity` |
| `disableOAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-o-auth` |
| `enablePropagateAdditionalUserContextData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-propagate-additional-user-context-data` |
| `enableTokenRevocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-token-revocation` |
| `generateSecret` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate-secret` |
| `idTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:id-token-validity` |
| `oAuth` | software.amazon.awscdk.services.cognito.OAuthSettings | [[cdk.support/lookup-entry]] | `:o-auth` |
| `preventUserExistenceErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prevent-user-existence-errors` |
| `readAttributes` | software.amazon.awscdk.services.cognito.ClientAttributes | [[cdk.support/lookup-entry]] | `:read-attributes` |
| `refreshTokenValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:refresh-token-validity` |
| `supportedIdentityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-identity-providers` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
| `userPoolClientName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-client-name` |
| `writeAttributes` | software.amazon.awscdk.services.cognito.ClientAttributes | [[cdk.support/lookup-entry]] | `:write-attributes` |
"
  [^UserPoolClientProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-token-validity)]
    (. builder accessTokenValidity data))
  (when-some [data (lookup-entry config id :auth-flows)]
    (. builder authFlows data))
  (when-some [data (lookup-entry config id :auth-session-validity)]
    (. builder authSessionValidity data))
  (when-some [data (lookup-entry config id :disable-o-auth)]
    (. builder disableOAuth data))
  (when-some [data (lookup-entry config id :enable-propagate-additional-user-context-data)]
    (. builder enablePropagateAdditionalUserContextData data))
  (when-some [data (lookup-entry config id :enable-token-revocation)]
    (. builder enableTokenRevocation data))
  (when-some [data (lookup-entry config id :generate-secret)]
    (. builder generateSecret data))
  (when-some [data (lookup-entry config id :id-token-validity)]
    (. builder idTokenValidity data))
  (when-some [data (lookup-entry config id :o-auth)]
    (. builder oAuth data))
  (when-some [data (lookup-entry config id :prevent-user-existence-errors)]
    (. builder preventUserExistenceErrors data))
  (when-some [data (lookup-entry config id :read-attributes)]
    (. builder readAttributes data))
  (when-some [data (lookup-entry config id :refresh-token-validity)]
    (. builder refreshTokenValidity data))
  (when-some [data (lookup-entry config id :supported-identity-providers)]
    (. builder supportedIdentityProviders data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (when-some [data (lookup-entry config id :user-pool-client-name)]
    (. builder userPoolClientName data))
  (when-some [data (lookup-entry config id :write-attributes)]
    (. builder writeAttributes data))
  (.build builder))


(defn user-pool-client-props-builder
  "Creates a  `UserPoolClientProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-client-props-builder> (new UserPoolClientProps$Builder) id config))


(defn user-pool-domain-builder>
  "The user-pool-domain-builder> function updates a UserPoolDomain$Builder instance using the provided configuration.
  The function takes the UserPoolDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoDomain` | software.amazon.awscdk.services.cognito.CognitoDomainOptions | [[cdk.support/lookup-entry]] | `:cognito-domain` |
| `customDomain` | software.amazon.awscdk.services.cognito.CustomDomainOptions | [[cdk.support/lookup-entry]] | `:custom-domain` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolDomain$Builder builder id config]
  (when-some [data (lookup-entry config id :cognito-domain)]
    (. builder cognitoDomain data))
  (when-some [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-domain-builder
  "Creates a  `UserPoolDomain$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-domain-builder> (UserPoolDomain$Builder/create scope (name id)) id config))


(defn user-pool-domain-options-builder>
  "The user-pool-domain-options-builder> function updates a UserPoolDomainOptions$Builder instance using the provided configuration.
  The function takes the UserPoolDomainOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoDomain` | software.amazon.awscdk.services.cognito.CognitoDomainOptions | [[cdk.support/lookup-entry]] | `:cognito-domain` |
| `customDomain` | software.amazon.awscdk.services.cognito.CustomDomainOptions | [[cdk.support/lookup-entry]] | `:custom-domain` |
"
  [^UserPoolDomainOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :cognito-domain)]
    (. builder cognitoDomain data))
  (when-some [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (.build builder))


(defn user-pool-domain-options-builder
  "Creates a  `UserPoolDomainOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-domain-options-builder> (new UserPoolDomainOptions$Builder) id config))


(defn user-pool-domain-props-builder>
  "The user-pool-domain-props-builder> function updates a UserPoolDomainProps$Builder instance using the provided configuration.
  The function takes the UserPoolDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoDomain` | software.amazon.awscdk.services.cognito.CognitoDomainOptions | [[cdk.support/lookup-entry]] | `:cognito-domain` |
| `customDomain` | software.amazon.awscdk.services.cognito.CustomDomainOptions | [[cdk.support/lookup-entry]] | `:custom-domain` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolDomainProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cognito-domain)]
    (. builder cognitoDomain data))
  (when-some [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-domain-props-builder
  "Creates a  `UserPoolDomainProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-domain-props-builder> (new UserPoolDomainProps$Builder) id config))


(defn user-pool-identity-provider-amazon-builder>
  "The user-pool-identity-provider-amazon-builder> function updates a UserPoolIdentityProviderAmazon$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderAmazon$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderAmazon$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-amazon-builder
  "Creates a  `UserPoolIdentityProviderAmazon$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-identity-provider-amazon-builder> (UserPoolIdentityProviderAmazon$Builder/create scope (name id)) id config))


(defn user-pool-identity-provider-amazon-props-builder>
  "The user-pool-identity-provider-amazon-props-builder> function updates a UserPoolIdentityProviderAmazonProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderAmazonProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderAmazonProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-amazon-props-builder
  "Creates a  `UserPoolIdentityProviderAmazonProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-amazon-props-builder> (new UserPoolIdentityProviderAmazonProps$Builder) id config))


(defn user-pool-identity-provider-apple-builder>
  "The user-pool-identity-provider-apple-builder> function updates a UserPoolIdentityProviderApple$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderApple$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderApple$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-apple-builder
  "Creates a  `UserPoolIdentityProviderApple$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-identity-provider-apple-builder> (UserPoolIdentityProviderApple$Builder/create scope (name id)) id config))


(defn user-pool-identity-provider-apple-props-builder>
  "The user-pool-identity-provider-apple-props-builder> function updates a UserPoolIdentityProviderAppleProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderAppleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderAppleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-apple-props-builder
  "Creates a  `UserPoolIdentityProviderAppleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-apple-props-builder> (new UserPoolIdentityProviderAppleProps$Builder) id config))


(defn user-pool-identity-provider-facebook-builder>
  "The user-pool-identity-provider-facebook-builder> function updates a UserPoolIdentityProviderFacebook$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderFacebook$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderFacebook$Builder builder id config]
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-facebook-builder
  "Creates a  `UserPoolIdentityProviderFacebook$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-identity-provider-facebook-builder> (UserPoolIdentityProviderFacebook$Builder/create scope (name id)) id config))


(defn user-pool-identity-provider-facebook-props-builder>
  "The user-pool-identity-provider-facebook-props-builder> function updates a UserPoolIdentityProviderFacebookProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderFacebookProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderFacebookProps$Builder builder id config]
  (when-some [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-facebook-props-builder
  "Creates a  `UserPoolIdentityProviderFacebookProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-facebook-props-builder> (new UserPoolIdentityProviderFacebookProps$Builder) id config))


(defn user-pool-identity-provider-google-builder>
  "The user-pool-identity-provider-google-builder> function updates a UserPoolIdentityProviderGoogle$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderGoogle$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `clientSecretValue` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret-value` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderGoogle$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :client-secret-value)]
    (. builder clientSecretValue data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-google-builder
  "Creates a  `UserPoolIdentityProviderGoogle$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-identity-provider-google-builder> (UserPoolIdentityProviderGoogle$Builder/create scope (name id)) id config))


(defn user-pool-identity-provider-google-props-builder>
  "The user-pool-identity-provider-google-props-builder> function updates a UserPoolIdentityProviderGoogleProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderGoogleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `clientSecretValue` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:client-secret-value` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderGoogleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :client-secret-value)]
    (. builder clientSecretValue data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-google-props-builder
  "Creates a  `UserPoolIdentityProviderGoogleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-google-props-builder> (new UserPoolIdentityProviderGoogleProps$Builder) id config))


(defn user-pool-identity-provider-oidc-builder>
  "The user-pool-identity-provider-oidc-builder> function updates a UserPoolIdentityProviderOidc$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderOidc$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `attributeRequestMethod` | software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod | [[cdk.api.services.cognito/oidc-attribute-request-method]] | `:attribute-request-method` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `endpoints` | software.amazon.awscdk.services.cognito.OidcEndpoints | [[cdk.support/lookup-entry]] | `:endpoints` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `issuerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer-url` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderOidc$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (oidc-attribute-request-method config id :attribute-request-method)]
    (. builder attributeRequestMethod data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :endpoints)]
    (. builder endpoints data))
  (when-some [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-some [data (lookup-entry config id :issuer-url)]
    (. builder issuerUrl data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-oidc-builder
  "Creates a  `UserPoolIdentityProviderOidc$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-identity-provider-oidc-builder> (UserPoolIdentityProviderOidc$Builder/create scope (name id)) id config))


(defn user-pool-identity-provider-oidc-props-builder>
  "The user-pool-identity-provider-oidc-props-builder> function updates a UserPoolIdentityProviderOidcProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderOidcProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `attributeRequestMethod` | software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod | [[cdk.api.services.cognito/oidc-attribute-request-method]] | `:attribute-request-method` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `endpoints` | software.amazon.awscdk.services.cognito.OidcEndpoints | [[cdk.support/lookup-entry]] | `:endpoints` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `issuerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer-url` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderOidcProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (oidc-attribute-request-method config id :attribute-request-method)]
    (. builder attributeRequestMethod data))
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :endpoints)]
    (. builder endpoints data))
  (when-some [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-some [data (lookup-entry config id :issuer-url)]
    (. builder issuerUrl data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-oidc-props-builder
  "Creates a  `UserPoolIdentityProviderOidcProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-oidc-props-builder> (new UserPoolIdentityProviderOidcProps$Builder) id config))


(defn user-pool-identity-provider-props-builder>
  "The user-pool-identity-provider-props-builder> function updates a UserPoolIdentityProviderProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-props-builder
  "Creates a  `UserPoolIdentityProviderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-props-builder> (new UserPoolIdentityProviderProps$Builder) id config))


(defn user-pool-identity-provider-saml-builder>
  "The user-pool-identity-provider-saml-builder> function updates a UserPoolIdentityProviderSaml$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderSaml$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `encryptedResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted-responses` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `idpInitiated` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:idp-initiated` |
| `idpSignout` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:idp-signout` |
| `metadata` | software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata | [[cdk.support/lookup-entry]] | `:metadata` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestSigningAlgorithm` | software.amazon.awscdk.services.cognito.SigningAlgorithm | [[cdk.api.services.cognito/signing-algorithm]] | `:request-signing-algorithm` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderSaml$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :encrypted-responses)]
    (. builder encryptedResponses data))
  (when-some [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-some [data (lookup-entry config id :idp-initiated)]
    (. builder idpInitiated data))
  (when-some [data (lookup-entry config id :idp-signout)]
    (. builder idpSignout data))
  (when-some [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (signing-algorithm config id :request-signing-algorithm)]
    (. builder requestSigningAlgorithm data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-saml-builder
  "Creates a  `UserPoolIdentityProviderSaml$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-identity-provider-saml-builder> (UserPoolIdentityProviderSaml$Builder/create scope (name id)) id config))


(defn user-pool-identity-provider-saml-props-builder>
  "The user-pool-identity-provider-saml-props-builder> function updates a UserPoolIdentityProviderSamlProps$Builder instance using the provided configuration.
  The function takes the UserPoolIdentityProviderSamlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMapping` | software.amazon.awscdk.services.cognito.AttributeMapping | [[cdk.support/lookup-entry]] | `:attribute-mapping` |
| `encryptedResponses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted-responses` |
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `idpInitiated` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:idp-initiated` |
| `idpSignout` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:idp-signout` |
| `metadata` | software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlMetadata | [[cdk.support/lookup-entry]] | `:metadata` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestSigningAlgorithm` | software.amazon.awscdk.services.cognito.SigningAlgorithm | [[cdk.api.services.cognito/signing-algorithm]] | `:request-signing-algorithm` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolIdentityProviderSamlProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-mapping)]
    (. builder attributeMapping data))
  (when-some [data (lookup-entry config id :encrypted-responses)]
    (. builder encryptedResponses data))
  (when-some [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-some [data (lookup-entry config id :idp-initiated)]
    (. builder idpInitiated data))
  (when-some [data (lookup-entry config id :idp-signout)]
    (. builder idpSignout data))
  (when-some [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (signing-algorithm config id :request-signing-algorithm)]
    (. builder requestSigningAlgorithm data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-identity-provider-saml-props-builder
  "Creates a  `UserPoolIdentityProviderSamlProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-identity-provider-saml-props-builder> (new UserPoolIdentityProviderSamlProps$Builder) id config))


(defn user-pool-props-builder>
  "The user-pool-props-builder> function updates a UserPoolProps$Builder instance using the provided configuration.
  The function takes the UserPoolProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountRecovery` | software.amazon.awscdk.services.cognito.AccountRecovery | [[cdk.api.services.cognito/account-recovery]] | `:account-recovery` |
| `advancedSecurityMode` | software.amazon.awscdk.services.cognito.AdvancedSecurityMode | [[cdk.api.services.cognito/advanced-security-mode]] | `:advanced-security-mode` |
| `autoVerify` | software.amazon.awscdk.services.cognito.AutoVerifiedAttrs | [[cdk.support/lookup-entry]] | `:auto-verify` |
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `customSenderKmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:custom-sender-kms-key` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `deviceTracking` | software.amazon.awscdk.services.cognito.DeviceTracking | [[cdk.support/lookup-entry]] | `:device-tracking` |
| `email` | software.amazon.awscdk.services.cognito.UserPoolEmail | [[cdk.support/lookup-entry]] | `:email` |
| `enableSmsRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sms-role` |
| `keepOriginal` | software.amazon.awscdk.services.cognito.KeepOriginalAttrs | [[cdk.support/lookup-entry]] | `:keep-original` |
| `lambdaTriggers` | software.amazon.awscdk.services.cognito.UserPoolTriggers | [[cdk.support/lookup-entry]] | `:lambda-triggers` |
| `mfa` | software.amazon.awscdk.services.cognito.Mfa | [[cdk.api.services.cognito/mfa]] | `:mfa` |
| `mfaMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:mfa-message` |
| `mfaSecondFactor` | software.amazon.awscdk.services.cognito.MfaSecondFactor | [[cdk.support/lookup-entry]] | `:mfa-second-factor` |
| `passwordPolicy` | software.amazon.awscdk.services.cognito.PasswordPolicy | [[cdk.support/lookup-entry]] | `:password-policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `selfSignUpEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-sign-up-enabled` |
| `signInAliases` | software.amazon.awscdk.services.cognito.SignInAliases | [[cdk.support/lookup-entry]] | `:sign-in-aliases` |
| `signInCaseSensitive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sign-in-case-sensitive` |
| `smsRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:sms-role` |
| `smsRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-role-external-id` |
| `snsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-region` |
| `standardAttributes` | software.amazon.awscdk.services.cognito.StandardAttributes | [[cdk.support/lookup-entry]] | `:standard-attributes` |
| `userInvitation` | software.amazon.awscdk.services.cognito.UserInvitationConfig | [[cdk.support/lookup-entry]] | `:user-invitation` |
| `userPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-name` |
| `userVerification` | software.amazon.awscdk.services.cognito.UserVerificationConfig | [[cdk.support/lookup-entry]] | `:user-verification` |
"
  [^UserPoolProps$Builder builder id config]
  (when-some [data (account-recovery config id :account-recovery)]
    (. builder accountRecovery data))
  (when-some [data (advanced-security-mode config id :advanced-security-mode)]
    (. builder advancedSecurityMode data))
  (when-some [data (lookup-entry config id :auto-verify)]
    (. builder autoVerify data))
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :custom-sender-kms-key)]
    (. builder customSenderKmsKey data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :device-tracking)]
    (. builder deviceTracking data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :enable-sms-role)]
    (. builder enableSmsRole data))
  (when-some [data (lookup-entry config id :keep-original)]
    (. builder keepOriginal data))
  (when-some [data (lookup-entry config id :lambda-triggers)]
    (. builder lambdaTriggers data))
  (when-some [data (mfa config id :mfa)]
    (. builder mfa data))
  (when-some [data (lookup-entry config id :mfa-message)]
    (. builder mfaMessage data))
  (when-some [data (lookup-entry config id :mfa-second-factor)]
    (. builder mfaSecondFactor data))
  (when-some [data (lookup-entry config id :password-policy)]
    (. builder passwordPolicy data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :self-sign-up-enabled)]
    (. builder selfSignUpEnabled data))
  (when-some [data (lookup-entry config id :sign-in-aliases)]
    (. builder signInAliases data))
  (when-some [data (lookup-entry config id :sign-in-case-sensitive)]
    (. builder signInCaseSensitive data))
  (when-some [data (lookup-entry config id :sms-role)]
    (. builder smsRole data))
  (when-some [data (lookup-entry config id :sms-role-external-id)]
    (. builder smsRoleExternalId data))
  (when-some [data (lookup-entry config id :sns-region)]
    (. builder snsRegion data))
  (when-some [data (lookup-entry config id :standard-attributes)]
    (. builder standardAttributes data))
  (when-some [data (lookup-entry config id :user-invitation)]
    (. builder userInvitation data))
  (when-some [data (lookup-entry config id :user-pool-name)]
    (. builder userPoolName data))
  (when-some [data (lookup-entry config id :user-verification)]
    (. builder userVerification data))
  (.build builder))


(defn user-pool-props-builder
  "Creates a  `UserPoolProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-props-builder> (new UserPoolProps$Builder) id config))


(defn user-pool-resource-server-builder>
  "The user-pool-resource-server-builder> function updates a UserPoolResourceServer$Builder instance using the provided configuration.
  The function takes the UserPoolResourceServer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
| `userPoolResourceServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-resource-server-name` |
"
  [^UserPoolResourceServer$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (when-some [data (lookup-entry config id :user-pool-resource-server-name)]
    (. builder userPoolResourceServerName data))
  (.build builder))


(defn user-pool-resource-server-builder
  "Creates a  `UserPoolResourceServer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-pool-resource-server-builder> (UserPoolResourceServer$Builder/create scope (name id)) id config))


(defn user-pool-resource-server-options-builder>
  "The user-pool-resource-server-options-builder> function updates a UserPoolResourceServerOptions$Builder instance using the provided configuration.
  The function takes the UserPoolResourceServerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPoolResourceServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-resource-server-name` |
"
  [^UserPoolResourceServerOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool-resource-server-name)]
    (. builder userPoolResourceServerName data))
  (.build builder))


(defn user-pool-resource-server-options-builder
  "Creates a  `UserPoolResourceServerOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-resource-server-options-builder> (new UserPoolResourceServerOptions$Builder) id config))


(defn user-pool-resource-server-props-builder>
  "The user-pool-resource-server-props-builder> function updates a UserPoolResourceServerProps$Builder instance using the provided configuration.
  The function takes the UserPoolResourceServerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `scopes` | java.util.List | [[cdk.support/lookup-entry]] | `:scopes` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
| `userPoolResourceServerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-resource-server-name` |
"
  [^UserPoolResourceServerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-some [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (when-some [data (lookup-entry config id :user-pool-resource-server-name)]
    (. builder userPoolResourceServerName data))
  (.build builder))


(defn user-pool-resource-server-props-builder
  "Creates a  `UserPoolResourceServerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-resource-server-props-builder> (new UserPoolResourceServerProps$Builder) id config))


(defn user-pool-ses-options-builder>
  "The user-pool-ses-options-builder> function updates a UserPoolSESOptions$Builder instance using the provided configuration.
  The function takes the UserPoolSESOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `fromEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-email` |
| `fromName` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-name` |
| `replyTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:reply-to` |
| `sesRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ses-region` |
| `sesVerifiedDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:ses-verified-domain` |
"
  [^UserPoolSESOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-set-name)]
    (. builder configurationSetName data))
  (when-some [data (lookup-entry config id :from-email)]
    (. builder fromEmail data))
  (when-some [data (lookup-entry config id :from-name)]
    (. builder fromName data))
  (when-some [data (lookup-entry config id :reply-to)]
    (. builder replyTo data))
  (when-some [data (lookup-entry config id :ses-region)]
    (. builder sesRegion data))
  (when-some [data (lookup-entry config id :ses-verified-domain)]
    (. builder sesVerifiedDomain data))
  (.build builder))


(defn user-pool-ses-options-builder
  "Creates a  `UserPoolSESOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-ses-options-builder> (new UserPoolSESOptions$Builder) id config))


(defn user-pool-triggers-builder>
  "The user-pool-triggers-builder> function updates a UserPoolTriggers$Builder instance using the provided configuration.
  The function takes the UserPoolTriggers$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createAuthChallenge` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:create-auth-challenge` |
| `customEmailSender` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:custom-email-sender` |
| `customMessage` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:custom-message` |
| `customSmsSender` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:custom-sms-sender` |
| `defineAuthChallenge` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:define-auth-challenge` |
| `postAuthentication` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:post-authentication` |
| `postConfirmation` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:post-confirmation` |
| `preAuthentication` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:pre-authentication` |
| `preSignUp` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:pre-sign-up` |
| `preTokenGeneration` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:pre-token-generation` |
| `userMigration` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:user-migration` |
| `verifyAuthChallengeResponse` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:verify-auth-challenge-response` |
"
  [^UserPoolTriggers$Builder builder id config]
  (when-some [data (lookup-entry config id :create-auth-challenge)]
    (. builder createAuthChallenge data))
  (when-some [data (lookup-entry config id :custom-email-sender)]
    (. builder customEmailSender data))
  (when-some [data (lookup-entry config id :custom-message)]
    (. builder customMessage data))
  (when-some [data (lookup-entry config id :custom-sms-sender)]
    (. builder customSmsSender data))
  (when-some [data (lookup-entry config id :define-auth-challenge)]
    (. builder defineAuthChallenge data))
  (when-some [data (lookup-entry config id :post-authentication)]
    (. builder postAuthentication data))
  (when-some [data (lookup-entry config id :post-confirmation)]
    (. builder postConfirmation data))
  (when-some [data (lookup-entry config id :pre-authentication)]
    (. builder preAuthentication data))
  (when-some [data (lookup-entry config id :pre-sign-up)]
    (. builder preSignUp data))
  (when-some [data (lookup-entry config id :pre-token-generation)]
    (. builder preTokenGeneration data))
  (when-some [data (lookup-entry config id :user-migration)]
    (. builder userMigration data))
  (when-some [data (lookup-entry config id :verify-auth-challenge-response)]
    (. builder verifyAuthChallengeResponse data))
  (.build builder))


(defn user-pool-triggers-builder
  "Creates a  `UserPoolTriggers$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-pool-triggers-builder> (new UserPoolTriggers$Builder) id config))


(defn user-verification-config-builder>
  "The user-verification-config-builder> function updates a UserVerificationConfig$Builder instance using the provided configuration.
  The function takes the UserVerificationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-body` |
| `emailStyle` | software.amazon.awscdk.services.cognito.VerificationEmailStyle | [[cdk.api.services.cognito/verification-email-style]] | `:email-style` |
| `emailSubject` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-subject` |
| `smsMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:sms-message` |
"
  [^UserVerificationConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :email-body)]
    (. builder emailBody data))
  (when-some [data (verification-email-style config id :email-style)]
    (. builder emailStyle data))
  (when-some [data (lookup-entry config id :email-subject)]
    (. builder emailSubject data))
  (when-some [data (lookup-entry config id :sms-message)]
    (. builder smsMessage data))
  (.build builder))


(defn user-verification-config-builder
  "Creates a  `UserVerificationConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (user-verification-config-builder> (new UserVerificationConfig$Builder) id config))