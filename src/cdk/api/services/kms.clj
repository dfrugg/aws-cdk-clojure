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


(defn alias-attributes-builder>
  "The alias-attributes-builder> function updates a AliasAttributes$Builder instance using the provided configuration.
  The function takes the AliasAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `aliasTargetKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:alias-target-key` |
"
  [^AliasAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (lookup-entry config id :alias-target-key)]
    (. builder aliasTargetKey data))
  (.build builder))


(defn alias-attributes-builder
  "Creates a  `AliasAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (alias-attributes-builder> (new AliasAttributes$Builder) id config))


(defn alias-builder>
  "The alias-builder> function updates a Alias$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :target-key)]
    (. builder targetKey data))
  (.build builder))


(defn alias-builder
  "Creates a  `Alias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (alias-builder> (Alias$Builder/create scope (name id)) id config))


(defn alias-props-builder>
  "The alias-props-builder> function updates a AliasProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :target-key)]
    (. builder targetKey data))
  (.build builder))


(defn alias-props-builder
  "Creates a  `AliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (alias-props-builder> (new AliasProps$Builder) id config))


(defn cfn-alias-builder>
  "The cfn-alias-builder> function updates a CfnAlias$Builder instance using the provided configuration.
  The function takes the CfnAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `targetKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-key-id` |
"
  [^CfnAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (lookup-entry config id :target-key-id)]
    (. builder targetKeyId data))
  (.build builder))


(defn cfn-alias-builder
  "Creates a  `CfnAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-alias-builder> (CfnAlias$Builder/create scope (name id)) id config))


(defn cfn-alias-props-builder>
  "The cfn-alias-props-builder> function updates a CfnAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `targetKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-key-id` |
"
  [^CfnAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (lookup-entry config id :target-key-id)]
    (. builder targetKeyId data))
  (.build builder))


(defn cfn-alias-props-builder
  "Creates a  `CfnAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-alias-props-builder> (new CfnAliasProps$Builder) id config))


(defn cfn-key-builder>
  "The cfn-key-builder> function updates a CfnKey$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bypass-policy-lockout-safety-check)]
    (. builder bypassPolicyLockoutSafetyCheck data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-some [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (when-some [data (lookup-entry config id :multi-region)]
    (. builder multiRegion data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-some [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-some [data (lookup-entry config id :rotation-period-in-days)]
    (. builder rotationPeriodInDays data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-key-builder
  "Creates a  `CfnKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-key-builder> (CfnKey$Builder/create scope (name id)) id config))


(defn cfn-key-props-builder>
  "The cfn-key-props-builder> function updates a CfnKeyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bypass-policy-lockout-safety-check)]
    (. builder bypassPolicyLockoutSafetyCheck data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-some [data (lookup-entry config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (when-some [data (lookup-entry config id :multi-region)]
    (. builder multiRegion data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-some [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-some [data (lookup-entry config id :rotation-period-in-days)]
    (. builder rotationPeriodInDays data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-key-props-builder
  "Creates a  `CfnKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-key-props-builder> (new CfnKeyProps$Builder) id config))


(defn cfn-replica-key-builder>
  "The cfn-replica-key-builder> function updates a CfnReplicaKey$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-some [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-some [data (lookup-entry config id :primary-key-arn)]
    (. builder primaryKeyArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-replica-key-builder
  "Creates a  `CfnReplicaKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-replica-key-builder> (CfnReplicaKey$Builder/create scope (name id)) id config))


(defn cfn-replica-key-props-builder>
  "The cfn-replica-key-props-builder> function updates a CfnReplicaKeyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :key-policy)]
    (. builder keyPolicy data))
  (when-some [data (lookup-entry config id :pending-window-in-days)]
    (. builder pendingWindowInDays data))
  (when-some [data (lookup-entry config id :primary-key-arn)]
    (. builder primaryKeyArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-replica-key-props-builder
  "Creates a  `CfnReplicaKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-replica-key-props-builder> (new CfnReplicaKeyProps$Builder) id config))


(defn key-builder>
  "The key-builder> function updates a Key$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :admins)]
    (. builder admins data))
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (key-spec config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (key-usage config id :key-usage)]
    (. builder keyUsage data))
  (when-some [data (lookup-entry config id :pending-window)]
    (. builder pendingWindow data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :rotation-period)]
    (. builder rotationPeriod data))
  (.build builder))


(defn key-builder
  "Creates a  `Key$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (key-builder> (Key$Builder/create scope (name id)) id config))


(defn key-lookup-options-builder>
  "The key-lookup-options-builder> function updates a KeyLookupOptions$Builder instance using the provided configuration.
  The function takes the KeyLookupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
"
  [^KeyLookupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (.build builder))


(defn key-lookup-options-builder
  "Creates a  `KeyLookupOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (key-lookup-options-builder> (new KeyLookupOptions$Builder) id config))


(defn key-props-builder>
  "The key-props-builder> function updates a KeyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :admins)]
    (. builder admins data))
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enable-key-rotation)]
    (. builder enableKeyRotation data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (key-spec config id :key-spec)]
    (. builder keySpec data))
  (when-some [data (key-usage config id :key-usage)]
    (. builder keyUsage data))
  (when-some [data (lookup-entry config id :pending-window)]
    (. builder pendingWindow data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :rotation-period)]
    (. builder rotationPeriod data))
  (.build builder))


(defn key-props-builder
  "Creates a  `KeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (key-props-builder> (new KeyProps$Builder) id config))