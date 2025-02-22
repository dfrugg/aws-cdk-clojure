(ns cdk.api.services.signer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.signer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.signer CfnProfilePermission$Builder
                                                   CfnProfilePermissionProps$Builder
                                                   CfnSigningProfile$Builder
                                                   CfnSigningProfile$SignatureValidityPeriodProperty$Builder
                                                   CfnSigningProfileProps$Builder
                                                   SigningProfile$Builder
                                                   SigningProfileAttributes$Builder
                                                   SigningProfileProps$Builder]))


(defn build-cfn-profile-permission-builder
  "The build-cfn-profile-permission-builder function updates a CfnProfilePermission$Builder instance using the provided configuration.
  The function takes the CfnProfilePermission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `profileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-name` |
| `profileVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-version` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^CfnProfilePermission$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :profile-name)]
    (. builder profileName data))
  (when-let [data (lookup-entry config id :profile-version)]
    (. builder profileVersion data))
  (when-let [data (lookup-entry config id :statement-id)]
    (. builder statementId data))
  (.build builder))


(defn build-cfn-profile-permission-props-builder
  "The build-cfn-profile-permission-props-builder function updates a CfnProfilePermissionProps$Builder instance using the provided configuration.
  The function takes the CfnProfilePermissionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `profileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-name` |
| `profileVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-version` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^CfnProfilePermissionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :profile-name)]
    (. builder profileName data))
  (when-let [data (lookup-entry config id :profile-version)]
    (. builder profileVersion data))
  (when-let [data (lookup-entry config id :statement-id)]
    (. builder statementId data))
  (.build builder))


(defn build-cfn-signing-profile-builder
  "The build-cfn-signing-profile-builder function updates a CfnSigningProfile$Builder instance using the provided configuration.
  The function takes the CfnSigningProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformId` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-id` |
| `signatureValidityPeriod` | software.amazon.awscdk.services.signer.CfnSigningProfile$SignatureValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:signature-validity-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSigningProfile$Builder builder id config]
  (when-let [data (lookup-entry config id :platform-id)]
    (. builder platformId data))
  (when-let [data (lookup-entry config id :signature-validity-period)]
    (. builder signatureValidityPeriod data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-signing-profile-props-builder
  "The build-cfn-signing-profile-props-builder function updates a CfnSigningProfileProps$Builder instance using the provided configuration.
  The function takes the CfnSigningProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformId` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-id` |
| `signatureValidityPeriod` | software.amazon.awscdk.services.signer.CfnSigningProfile$SignatureValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:signature-validity-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSigningProfileProps$Builder builder id config]
  (when-let [data (lookup-entry config id :platform-id)]
    (. builder platformId data))
  (when-let [data (lookup-entry config id :signature-validity-period)]
    (. builder signatureValidityPeriod data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-signing-profile-signature-validity-period-property-builder
  "The build-cfn-signing-profile-signature-validity-period-property-builder function updates a CfnSigningProfile$SignatureValidityPeriodProperty$Builder instance using the provided configuration.
  The function takes the CfnSigningProfile$SignatureValidityPeriodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnSigningProfile$SignatureValidityPeriodProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-signing-profile-attributes-builder
  "The build-signing-profile-attributes-builder function updates a SigningProfileAttributes$Builder instance using the provided configuration.
  The function takes the SigningProfileAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-name` |
| `signingProfileVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-version` |
"
  [^SigningProfileAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :signing-profile-name)]
    (. builder signingProfileName data))
  (when-let [data (lookup-entry config id :signing-profile-version)]
    (. builder signingProfileVersion data))
  (.build builder))


(defn build-signing-profile-builder
  "The build-signing-profile-builder function updates a SigningProfile$Builder instance using the provided configuration.
  The function takes the SigningProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platform` | software.amazon.awscdk.services.signer.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `signatureValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:signature-validity` |
| `signingProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-name` |
"
  [^SigningProfile$Builder builder id config]
  (when-let [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-let [data (lookup-entry config id :signature-validity)]
    (. builder signatureValidity data))
  (when-let [data (lookup-entry config id :signing-profile-name)]
    (. builder signingProfileName data))
  (.build builder))


(defn build-signing-profile-props-builder
  "The build-signing-profile-props-builder function updates a SigningProfileProps$Builder instance using the provided configuration.
  The function takes the SigningProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platform` | software.amazon.awscdk.services.signer.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `signatureValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:signature-validity` |
| `signingProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-name` |
"
  [^SigningProfileProps$Builder builder id config]
  (when-let [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-let [data (lookup-entry config id :signature-validity)]
    (. builder signatureValidity data))
  (when-let [data (lookup-entry config id :signing-profile-name)]
    (. builder signingProfileName data))
  (.build builder))