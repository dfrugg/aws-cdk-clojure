(ns cdk.api.services.paymentcryptography
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.paymentcryptography package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.paymentcryptography CfnAlias$Builder
                                                                CfnAliasProps$Builder
                                                                CfnKey$Builder
                                                                CfnKey$KeyAttributesProperty$Builder
                                                                CfnKey$KeyModesOfUseProperty$Builder
                                                                CfnKeyProps$Builder]))


(defn build-cfn-alias-builder
  "The build-cfn-alias-builder function updates a CfnAlias$Builder instance using the provided configuration.
  The function takes the CfnAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
"
  [^CfnAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (.build builder))


(defn cfn-alias-builder
  "Creates a  `CfnAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-alias-builder (CfnAlias$Builder/create scope (name id)) id config))


(defn build-cfn-alias-props-builder
  "The build-cfn-alias-props-builder function updates a CfnAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
"
  [^CfnAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (.build builder))


(defn cfn-alias-props-builder
  "Creates a  `CfnAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alias-props-builder (new CfnAliasProps$Builder) id config))


(defn build-cfn-key-builder
  "The build-cfn-key-builder function updates a CfnKey$Builder instance using the provided configuration.
  The function takes the CfnKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable` |
| `keyAttributes` | software.amazon.awscdk.services.paymentcryptography.CfnKey$KeyAttributesProperty | [[cdk.support/lookup-entry]] | `:key-attributes` |
| `keyCheckValueAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-check-value-algorithm` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKey$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :exportable)]
    (. builder exportable data))
  (when-some [data (lookup-entry config id :key-attributes)]
    (. builder keyAttributes data))
  (when-some [data (lookup-entry config id :key-check-value-algorithm)]
    (. builder keyCheckValueAlgorithm data))
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
  (build-cfn-key-builder (CfnKey$Builder/create scope (name id)) id config))


(defn build-cfn-key-key-attributes-property-builder
  "The build-cfn-key-key-attributes-property-builder function updates a CfnKey$KeyAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnKey$KeyAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `keyClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-class` |
| `keyModesOfUse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-modes-of-use` |
| `keyUsage` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-usage` |
"
  [^CfnKey$KeyAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-algorithm)]
    (. builder keyAlgorithm data))
  (when-some [data (lookup-entry config id :key-class)]
    (. builder keyClass data))
  (when-some [data (lookup-entry config id :key-modes-of-use)]
    (. builder keyModesOfUse data))
  (when-some [data (lookup-entry config id :key-usage)]
    (. builder keyUsage data))
  (.build builder))


(defn cfn-key-key-attributes-property-builder
  "Creates a  `CfnKey$KeyAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-key-key-attributes-property-builder (new CfnKey$KeyAttributesProperty$Builder) id config))


(defn build-cfn-key-key-modes-of-use-property-builder
  "The build-cfn-key-key-modes-of-use-property-builder function updates a CfnKey$KeyModesOfUseProperty$Builder instance using the provided configuration.
  The function takes the CfnKey$KeyModesOfUseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decrypt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:decrypt` |
| `deriveKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:derive-key` |
| `encrypt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypt` |
| `generate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:generate` |
| `noRestrictions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-restrictions` |
| `sign` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sign` |
| `unwrap` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:unwrap` |
| `verify` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verify` |
| `wrap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:wrap` |
"
  [^CfnKey$KeyModesOfUseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :decrypt)]
    (. builder decrypt data))
  (when-some [data (lookup-entry config id :derive-key)]
    (. builder deriveKey data))
  (when-some [data (lookup-entry config id :encrypt)]
    (. builder encrypt data))
  (when-some [data (lookup-entry config id :generate)]
    (. builder generate data))
  (when-some [data (lookup-entry config id :no-restrictions)]
    (. builder noRestrictions data))
  (when-some [data (lookup-entry config id :sign)]
    (. builder sign data))
  (when-some [data (lookup-entry config id :unwrap)]
    (. builder unwrap data))
  (when-some [data (lookup-entry config id :verify)]
    (. builder verify data))
  (when-some [data (lookup-entry config id :wrap)]
    (. builder wrap data))
  (.build builder))


(defn cfn-key-key-modes-of-use-property-builder
  "Creates a  `CfnKey$KeyModesOfUseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-key-key-modes-of-use-property-builder (new CfnKey$KeyModesOfUseProperty$Builder) id config))


(defn build-cfn-key-props-builder
  "The build-cfn-key-props-builder function updates a CfnKeyProps$Builder instance using the provided configuration.
  The function takes the CfnKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable` |
| `keyAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-attributes` |
| `keyCheckValueAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-check-value-algorithm` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :exportable)]
    (. builder exportable data))
  (when-some [data (lookup-entry config id :key-attributes)]
    (. builder keyAttributes data))
  (when-some [data (lookup-entry config id :key-check-value-algorithm)]
    (. builder keyCheckValueAlgorithm data))
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
  (build-cfn-key-props-builder (new CfnKeyProps$Builder) id config))