(ns cdk.api.services.kms
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kms package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kms Alias$Builder
                                                AliasAttributes$Builder
                                                AliasProps$Builder
                                                CfnAlias$Builder
                                                CfnAliasProps$Builder
                                                CfnKey$Builder
                                                CfnKeyProps$Builder
                                                CfnReplicaKey$Builder
                                                CfnReplicaKeyProps$Builder
                                                Key$Builder
                                                KeyLookupOptions$Builder
                                                KeyProps$Builder
                                                KeySpec
                                                KeyUsage]))


(defn key-spec
  "The `key-spec` function data interprets values in the provided config data into a 
`KeySpec` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `KeySpec` - the value is returned.
* is `:hmac-512` - `KeySpec/HMAC_512` is returned
* is `:ecc-nist-p384` - `KeySpec/ECC_NIST_P384` is returned
* is `:rsa-3072` - `KeySpec/RSA_3072` is returned
* is `:hmac-384` - `KeySpec/HMAC_384` is returned
* is `:sm2` - `KeySpec/SM2` is returned
* is `:rsa-2048` - `KeySpec/RSA_2048` is returned
* is `:hmac-256` - `KeySpec/HMAC_256` is returned
* is `:ecc-secg-p256k1` - `KeySpec/ECC_SECG_P256K1` is returned
* is `:rsa-4096` - `KeySpec/RSA_4096` is returned
* is `:hmac-224` - `KeySpec/HMAC_224` is returned
* is `:ecc-nist-p521` - `KeySpec/ECC_NIST_P521` is returned
* is `:ecc-nist-p256` - `KeySpec/ECC_NIST_P256` is returned
* is `:symmetric-default` - `KeySpec/SYMMETRIC_DEFAULT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? KeySpec data) data
      (= :hmac-512 data) KeySpec/HMAC_512
      (= :ecc-nist-p384 data) KeySpec/ECC_NIST_P384
      (= :rsa-3072 data) KeySpec/RSA_3072
      (= :hmac-384 data) KeySpec/HMAC_384
      (= :sm2 data) KeySpec/SM2
      (= :rsa-2048 data) KeySpec/RSA_2048
      (= :hmac-256 data) KeySpec/HMAC_256
      (= :ecc-secg-p256k1 data) KeySpec/ECC_SECG_P256K1
      (= :rsa-4096 data) KeySpec/RSA_4096
      (= :hmac-224 data) KeySpec/HMAC_224
      (= :ecc-nist-p521 data) KeySpec/ECC_NIST_P521
      (= :ecc-nist-p256 data) KeySpec/ECC_NIST_P256
      (= :symmetric-default data) KeySpec/SYMMETRIC_DEFAULT)))


(defn key-usage
  "The `key-usage` function data interprets values in the provided config data into a 
`KeyUsage` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `KeyUsage` - the value is returned.
* is `:encrypt-decrypt` - `KeyUsage/ENCRYPT_DECRYPT` is returned
* is `:generate-verify-mac` - `KeyUsage/GENERATE_VERIFY_MAC` is returned
* is `:sign-verify` - `KeyUsage/SIGN_VERIFY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? KeyUsage data) data
      (= :encrypt-decrypt data) KeyUsage/ENCRYPT_DECRYPT
      (= :generate-verify-mac data) KeyUsage/GENERATE_VERIFY_MAC
      (= :sign-verify data) KeyUsage/SIGN_VERIFY)))


(defn build-alias-attributes-builder
  "The build-alias-attributes-builder function updates a AliasAttributes$Builder instance using the provided configuration.
  The function takes the AliasAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `aliasTargetKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:alias-target-key` |
"
  [^AliasAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (lookup-entry config id :alias-target-key)]
    (. builder aliasTargetKey data))
  (.build builder))


(defn build-alias-builder
  "The build-alias-builder function updates a Alias$Builder instance using the provided configuration.
  The function takes the Alias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `targetKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:target-key` |
"
  [^Alias$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :target-key)]
    (. builder targetKey data))
  (.build builder))


(defn build-alias-props-builder
  "The build-alias-props-builder function updates a AliasProps$Builder instance using the provided configuration.
  The function takes the AliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `targetKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:target-key` |
"
  [^AliasProps$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :target-key)]
    (. builder targetKey data))
  (.build builder))


(defn build-cfn-alias-builder
  "The build-cfn-alias-builder function updates a CfnAlias$Builder instance using the provided configuration.
  The function takes the CfnAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `targetKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-key-id` |
"
  [^CfnAlias$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (lookup-entry config id :target-key-id)]
    (. builder targetKeyId data))
  (.build builder))


(defn build-cfn-alias-props-builder
  "The build-cfn-alias-props-builder function updates a CfnAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `targetKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-key-id` |
"
  [^CfnAliasProps$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-let [data (lookup-entry config id :target-key-id)]
    (. builder targetKeyId data))
  (.build builder))


(defn build-cfn-key-builder
  "The build-cfn-key-builder function updates a CfnKey$Builder instance using the provided configuration.
  The function takes the CfnKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bypassPolicyLockoutSafetyCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-safety-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `keyPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:key-policy` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `keyUsage` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-usage` |
| `multiRegion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-region` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |
| `pendingWindowInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pending-window-in-days` |
| `rotationPeriodInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rotation-period-in-days` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKey$Builder builder id config]
  (when-let [data (lookup-entry config id :bypass-policy-lockout-safety-check)]
    (. builder bypassPolicyLockoutSafetyCheck data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-let [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-let [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (when-let [data (lookup-entry config id :multi-region)]
    (. builder multiRegion data))
  (when-let [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-let [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-let [data (lookup-entry config id :rotation-period-in-days)]
    (. builder rotationPeriodInDays data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-key-props-builder
  "The build-cfn-key-props-builder function updates a CfnKeyProps$Builder instance using the provided configuration.
  The function takes the CfnKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bypassPolicyLockoutSafetyCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-safety-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `keyPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:key-policy` |
| `keySpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-spec` |
| `keyUsage` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-usage` |
| `multiRegion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-region` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |
| `pendingWindowInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pending-window-in-days` |
| `rotationPeriodInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rotation-period-in-days` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bypass-policy-lockout-safety-check)]
    (. builder bypassPolicyLockoutSafetyCheck data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-let [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-let [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (when-let [data (lookup-entry config id :multi-region)]
    (. builder multiRegion data))
  (when-let [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-let [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-let [data (lookup-entry config id :rotation-period-in-days)]
    (. builder rotationPeriodInDays data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-replica-key-builder
  "The build-cfn-replica-key-builder function updates a CfnReplicaKey$Builder instance using the provided configuration.
  The function takes the CfnReplicaKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `keyPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:key-policy` |
| `pendingWindowInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pending-window-in-days` |
| `primaryKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-key-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReplicaKey$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-let [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-let [data (lookup-entry config id :primary-key-arn)]
    (. builder primaryKeyArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-replica-key-props-builder
  "The build-cfn-replica-key-props-builder function updates a CfnReplicaKeyProps$Builder instance using the provided configuration.
  The function takes the CfnReplicaKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `keyPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:key-policy` |
| `pendingWindowInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pending-window-in-days` |
| `primaryKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-key-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReplicaKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-let [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-let [data (lookup-entry config id :primary-key-arn)]
    (. builder primaryKeyArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-key-builder
  "The build-key-builder function updates a Key$Builder instance using the provided configuration.
  The function takes the Key$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admins` | java.util.List | [[cdk.support/lookup-entry]] | `:admins` |
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `keySpec` | software.amazon.awscdk.services.kms.KeySpec | [[cdk.api.services.kms/key-spec]] | `:key-spec` |
| `keyUsage` | software.amazon.awscdk.services.kms.KeyUsage | [[cdk.api.services.kms/key-usage]] | `:key-usage` |
| `pendingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:pending-window` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `rotationPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:rotation-period` |
"
  [^Key$Builder builder id config]
  (when-let [data (lookup-entry config id :admins)]
    (. builder admins data))
  (when-let [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (key-spec config id :key-spec)]
    (. builder keySpec data))
  (when-let [data (key-usage config id :key-usage)]
    (. builder keyUsage data))
  (when-let [data (lookup-entry config id :pending-window)]
    (. builder pendingWindow data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :rotation-period)]
    (. builder rotationPeriod data))
  (.build builder))


(defn build-key-lookup-options-builder
  "The build-key-lookup-options-builder function updates a KeyLookupOptions$Builder instance using the provided configuration.
  The function takes the KeyLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
"
  [^KeyLookupOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (.build builder))


(defn build-key-props-builder
  "The build-key-props-builder function updates a KeyProps$Builder instance using the provided configuration.
  The function takes the KeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admins` | java.util.List | [[cdk.support/lookup-entry]] | `:admins` |
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableKeyRotation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-key-rotation` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `keySpec` | software.amazon.awscdk.services.kms.KeySpec | [[cdk.api.services.kms/key-spec]] | `:key-spec` |
| `keyUsage` | software.amazon.awscdk.services.kms.KeyUsage | [[cdk.api.services.kms/key-usage]] | `:key-usage` |
| `pendingWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:pending-window` |
| `policy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `rotationPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:rotation-period` |
"
  [^KeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :admins)]
    (. builder admins data))
  (when-let [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (key-spec config id :key-spec)]
    (. builder keySpec data))
  (when-let [data (key-usage config id :key-usage)]
    (. builder keyUsage data))
  (when-let [data (lookup-entry config id :pending-window)]
    (. builder pendingWindow data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :rotation-period)]
    (. builder rotationPeriod data))
  (.build builder))