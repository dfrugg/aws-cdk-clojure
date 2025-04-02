(ns cdk.api.alexa.ask
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.alexa.ask package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.alexa.ask CfnSkill$AuthenticationConfigurationProperty$Builder
                                             CfnSkill$Builder
                                             CfnSkill$OverridesProperty$Builder
                                             CfnSkill$SkillPackageProperty$Builder
                                             CfnSkillProps$Builder]))


(defn cfn-skill-authentication-configuration-property-builder>
  "The cfn-skill-authentication-configuration-property-builder> function updates a CfnSkill$AuthenticationConfigurationProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-some [data (lookup-entry config id :refresh-token)]
    (. builder refreshToken data))
  (.build builder))


(defn cfn-skill-authentication-configuration-property-builder
  "Creates a  `CfnSkill$AuthenticationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-skill-authentication-configuration-property-builder> (new CfnSkill$AuthenticationConfigurationProperty$Builder) id config))


(defn cfn-skill-builder>
  "The cfn-skill-builder> function updates a CfnSkill$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-some [data (lookup-entry config id :skill-package)]
    (. builder skillPackage data))
  (when-some [data (lookup-entry config id :vendor-id)]
    (. builder vendorId data))
  (.build builder))


(defn cfn-skill-builder
  "Creates a  `CfnSkill$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-skill-builder> (CfnSkill$Builder/create scope (name id)) id config))


(defn cfn-skill-overrides-property-builder>
  "The cfn-skill-overrides-property-builder> function updates a CfnSkill$OverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnSkill$OverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |
"
  [^CfnSkill$OverridesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (.build builder))


(defn cfn-skill-overrides-property-builder
  "Creates a  `CfnSkill$OverridesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-skill-overrides-property-builder> (new CfnSkill$OverridesProperty$Builder) id config))


(defn cfn-skill-props-builder>
  "The cfn-skill-props-builder> function updates a CfnSkillProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-some [data (lookup-entry config id :skill-package)]
    (. builder skillPackage data))
  (when-some [data (lookup-entry config id :vendor-id)]
    (. builder vendorId data))
  (.build builder))


(defn cfn-skill-props-builder
  "Creates a  `CfnSkillProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-skill-props-builder> (new CfnSkillProps$Builder) id config))


(defn cfn-skill-skill-package-property-builder>
  "The cfn-skill-skill-package-property-builder> function updates a CfnSkill$SkillPackageProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-some [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-some [data (lookup-entry config id :s3-bucket-role)]
    (. builder s3BucketRole data))
  (when-some [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (when-some [data (lookup-entry config id :s3-object-version)]
    (. builder s3ObjectVersion data))
  (.build builder))


(defn cfn-skill-skill-package-property-builder
  "Creates a  `CfnSkill$SkillPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-skill-skill-package-property-builder> (new CfnSkill$SkillPackageProperty$Builder) id config))