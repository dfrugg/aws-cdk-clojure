(ns cdk.api.alexa.ask
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.alexa.ask package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.alexa.ask CfnSkill$AuthenticationConfigurationProperty$Builder
                                             CfnSkill$Builder
                                             CfnSkill$OverridesProperty$Builder
                                             CfnSkill$SkillPackageProperty$Builder
                                             CfnSkillProps$Builder]))


(defn build-cfn-skill-authentication-configuration-property-builder
  "The build-cfn-skill-authentication-configuration-property-builder function updates a CfnSkill$AuthenticationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSkill$AuthenticationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `refreshToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:refresh-token` |
"
  [^CfnSkill$AuthenticationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-let [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-let [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn build-cfn-skill-builder
  "The build-cfn-skill-builder function updates a CfnSkill$Builder instance using the provided configuration.
  The function takes the CfnSkill$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.alexa.ask.CfnSkill$AuthenticationConfigurationProperty | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `skillPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:skill-package` |
| `vendorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-id` |
"
  [^CfnSkill$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-let [data (lookup-entry config id :skill-package)]
    (. builder skillPackage data))
  (when-let [data (lookup-entry config id :vendor-id)]
    (. builder vendorId data))
  (.build builder))


(defn build-cfn-skill-overrides-property-builder
  "The build-cfn-skill-overrides-property-builder function updates a CfnSkill$OverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnSkill$OverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |
"
  [^CfnSkill$OverridesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (.build builder))


(defn build-cfn-skill-props-builder
  "The build-cfn-skill-props-builder function updates a CfnSkillProps$Builder instance using the provided configuration.
  The function takes the CfnSkillProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `skillPackage` | software.amazon.awscdk.alexa.ask.CfnSkill$SkillPackageProperty | [[cdk.support/lookup-entry]] | `:skill-package` |
| `vendorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-id` |
"
  [^CfnSkillProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-let [data (lookup-entry config id :skill-package)]
    (. builder skillPackage data))
  (when-let [data (lookup-entry config id :vendor-id)]
    (. builder vendorId data))
  (.build builder))


(defn build-cfn-skill-skill-package-property-builder
  "The build-cfn-skill-skill-package-property-builder function updates a CfnSkill$SkillPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnSkill$SkillPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overrides` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3BucketRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-role` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
"
  [^CfnSkill$SkillPackageProperty$Builder builder id config]
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
  (.build builder))