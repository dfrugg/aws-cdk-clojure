(ns cdk.api.alexa.ask
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.alexa.ask package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.alexa.ask CfnSkill$AuthenticationConfigurationProperty$Builder
                                             CfnSkill$Builder
                                             CfnSkill$OverridesProperty$Builder
                                             CfnSkill$SkillPackageProperty$Builder
                                             CfnSkillProps$Builder]))


(defn cfn-skill-authentication-configuration-property-builder
  "The cfn-skill-authentication-configuration-property-builder function buildes out new instances of 
CfnSkill$AuthenticationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |"
  [stack id config]
  (let [builder (CfnSkill$AuthenticationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :refresh-token)]
      (. builder refreshToken data))
    (.build builder)))


(defn cfn-skill-builder
  "The cfn-skill-builder function buildes out new instances of 
CfnSkill$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.alexa.ask.CfnSkill$AuthenticationConfigurationProperty | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `skillPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:skill-package` |
| `vendorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-id` |"
  [stack id config]
  (let [builder (CfnSkill$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication-configuration)]
      (. builder authenticationConfiguration data))
    (when-let [data (lookup-entry config id :skill-package)]
      (. builder skillPackage data))
    (when-let [data (lookup-entry config id :vendor-id)]
      (. builder vendorId data))
    (.build builder)))


(defn cfn-skill-overrides-property-builder
  "The cfn-skill-overrides-property-builder function buildes out new instances of 
CfnSkill$OverridesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |"
  [stack id config]
  (let [builder (CfnSkill$OverridesProperty$Builder.)]
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (.build builder)))


(defn cfn-skill-props-builder
  "The cfn-skill-props-builder function buildes out new instances of 
CfnSkillProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `skillPackage` | software.amazon.awscdk.alexa.ask.CfnSkill$SkillPackageProperty | [[cdk.support/lookup-entry]] | `:skill-package` |
| `vendorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-id` |"
  [stack id config]
  (let [builder (CfnSkillProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication-configuration)]
      (. builder authenticationConfiguration data))
    (when-let [data (lookup-entry config id :skill-package)]
      (. builder skillPackage data))
    (when-let [data (lookup-entry config id :vendor-id)]
      (. builder vendorId data))
    (.build builder)))


(defn cfn-skill-skill-package-property-builder
  "The cfn-skill-skill-package-property-builder function buildes out new instances of 
CfnSkill$SkillPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overrides` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3BucketRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-role` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |"
  [stack id config]
  (let [builder (CfnSkill$SkillPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :overrides)]
      (. builder overrides data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-bucket-role)]
      (. builder s3BucketRole data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (when-let [data (lookup-entry config id :s3-object-version)]
      (. builder s3ObjectVersion data))
    (.build builder)))