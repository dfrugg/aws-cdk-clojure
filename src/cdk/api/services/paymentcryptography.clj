(ns cdk.api.services.paymentcryptography
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.paymentcryptography package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.paymentcryptography CfnAlias$Builder
                                                                CfnAliasProps$Builder
                                                                CfnKey$Builder
                                                                CfnKey$KeyAttributesProperty$Builder
                                                                CfnKey$KeyModesOfUseProperty$Builder
                                                                CfnKeyProps$Builder]))


(defn cfn-alias-builder
  "The cfn-alias-builder function buildes out new instances of 
CfnAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |"
  [stack id config]
  (let [builder (CfnAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alias-name)]
      (. builder aliasName data))
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (.build builder)))


(defn cfn-alias-props-builder
  "The cfn-alias-props-builder function buildes out new instances of 
CfnAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |"
  [stack id config]
  (let [builder (CfnAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :alias-name)]
      (. builder aliasName data))
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (.build builder)))


(defn cfn-key-builder
  "The cfn-key-builder function buildes out new instances of 
CfnKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable` |
| `keyAttributes` | software.amazon.awscdk.services.paymentcryptography.CfnKey$KeyAttributesProperty | [[cdk.support/lookup-entry]] | `:key-attributes` |
| `keyCheckValueAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-check-value-algorithm` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :exportable)]
      (. builder exportable data))
    (when-let [data (lookup-entry config id :key-attributes)]
      (. builder keyAttributes data))
    (when-let [data (lookup-entry config id :key-check-value-algorithm)]
      (. builder keyCheckValueAlgorithm data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-key-key-attributes-property-builder
  "The cfn-key-key-attributes-property-builder function buildes out new instances of 
CfnKey$KeyAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-algorithm` |
| `keyClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-class` |
| `keyModesOfUse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-modes-of-use` |
| `keyUsage` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-usage` |"
  [stack id config]
  (let [builder (CfnKey$KeyAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-algorithm)]
      (. builder keyAlgorithm data))
    (when-let [data (lookup-entry config id :key-class)]
      (. builder keyClass data))
    (when-let [data (lookup-entry config id :key-modes-of-use)]
      (. builder keyModesOfUse data))
    (when-let [data (lookup-entry config id :key-usage)]
      (. builder keyUsage data))
    (.build builder)))


(defn cfn-key-key-modes-of-use-property-builder
  "The cfn-key-key-modes-of-use-property-builder function buildes out new instances of 
CfnKey$KeyModesOfUseProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `wrap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:wrap` |"
  [stack id config]
  (let [builder (CfnKey$KeyModesOfUseProperty$Builder.)]
    (when-let [data (lookup-entry config id :decrypt)]
      (. builder decrypt data))
    (when-let [data (lookup-entry config id :derive-key)]
      (. builder deriveKey data))
    (when-let [data (lookup-entry config id :encrypt)]
      (. builder encrypt data))
    (when-let [data (lookup-entry config id :generate)]
      (. builder generate data))
    (when-let [data (lookup-entry config id :no-restrictions)]
      (. builder noRestrictions data))
    (when-let [data (lookup-entry config id :sign)]
      (. builder sign data))
    (when-let [data (lookup-entry config id :unwrap)]
      (. builder unwrap data))
    (when-let [data (lookup-entry config id :verify)]
      (. builder verify data))
    (when-let [data (lookup-entry config id :wrap)]
      (. builder wrap data))
    (.build builder)))


(defn cfn-key-props-builder
  "The cfn-key-props-builder function buildes out new instances of 
CfnKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `exportable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exportable` |
| `keyAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-attributes` |
| `keyCheckValueAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-check-value-algorithm` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :exportable)]
      (. builder exportable data))
    (when-let [data (lookup-entry config id :key-attributes)]
      (. builder keyAttributes data))
    (when-let [data (lookup-entry config id :key-check-value-algorithm)]
      (. builder keyCheckValueAlgorithm data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))