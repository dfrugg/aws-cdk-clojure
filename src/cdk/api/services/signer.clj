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


(defn cfn-profile-permission-builder
  "The cfn-profile-permission-builder function buildes out new instances of 
CfnProfilePermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `profileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-name` |
| `profileVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-version` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (CfnProfilePermission$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-profile-permission-props-builder
  "The cfn-profile-permission-props-builder function buildes out new instances of 
CfnProfilePermissionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `profileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-name` |
| `profileVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-version` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (CfnProfilePermissionProps$Builder.)]
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
    (.build builder)))


(defn cfn-signing-profile-builder
  "The cfn-signing-profile-builder function buildes out new instances of 
CfnSigningProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformId` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-id` |
| `signatureValidityPeriod` | software.amazon.awscdk.services.signer.CfnSigningProfile$SignatureValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:signature-validity-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSigningProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :platform-id)]
      (. builder platformId data))
    (when-let [data (lookup-entry config id :signature-validity-period)]
      (. builder signatureValidityPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-signing-profile-props-builder
  "The cfn-signing-profile-props-builder function buildes out new instances of 
CfnSigningProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformId` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-id` |
| `signatureValidityPeriod` | software.amazon.awscdk.services.signer.CfnSigningProfile$SignatureValidityPeriodProperty | [[cdk.support/lookup-entry]] | `:signature-validity-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSigningProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :platform-id)]
      (. builder platformId data))
    (when-let [data (lookup-entry config id :signature-validity-period)]
      (. builder signatureValidityPeriod data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-signing-profile-signature-validity-period-property-builder
  "The cfn-signing-profile-signature-validity-period-property-builder function buildes out new instances of 
CfnSigningProfile$SignatureValidityPeriodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnSigningProfile$SignatureValidityPeriodProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn signing-profile-attributes-builder
  "The signing-profile-attributes-builder function buildes out new instances of 
SigningProfileAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-name` |
| `signingProfileVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-version` |"
  [stack id config]
  (let [builder (SigningProfileAttributes$Builder.)]
    (when-let [data (lookup-entry config id :signing-profile-name)]
      (. builder signingProfileName data))
    (when-let [data (lookup-entry config id :signing-profile-version)]
      (. builder signingProfileVersion data))
    (.build builder)))


(defn signing-profile-builder
  "The signing-profile-builder function buildes out new instances of 
SigningProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platform` | software.amazon.awscdk.services.signer.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `signatureValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:signature-validity` |
| `signingProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-name` |"
  [stack id config]
  (let [builder (SigningProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :signature-validity)]
      (. builder signatureValidity data))
    (when-let [data (lookup-entry config id :signing-profile-name)]
      (. builder signingProfileName data))
    (.build builder)))


(defn signing-profile-props-builder
  "The signing-profile-props-builder function buildes out new instances of 
SigningProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platform` | software.amazon.awscdk.services.signer.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `signatureValidity` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:signature-validity` |
| `signingProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-profile-name` |"
  [stack id config]
  (let [builder (SigningProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :signature-validity)]
      (. builder signatureValidity data))
    (when-let [data (lookup-entry config id :signing-profile-name)]
      (. builder signingProfileName data))
    (.build builder)))