(ns cdk.api.services.elasticbeanstalk
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticbeanstalk package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticbeanstalk CfnApplication$ApplicationResourceLifecycleConfigProperty$Builder
                                                             CfnApplication$ApplicationVersionLifecycleConfigProperty$Builder
                                                             CfnApplication$Builder
                                                             CfnApplication$MaxAgeRuleProperty$Builder
                                                             CfnApplication$MaxCountRuleProperty$Builder
                                                             CfnApplicationProps$Builder
                                                             CfnApplicationVersion$Builder
                                                             CfnApplicationVersion$SourceBundleProperty$Builder
                                                             CfnApplicationVersionProps$Builder
                                                             CfnConfigurationTemplate$Builder
                                                             CfnConfigurationTemplate$ConfigurationOptionSettingProperty$Builder
                                                             CfnConfigurationTemplate$SourceConfigurationProperty$Builder
                                                             CfnConfigurationTemplateProps$Builder
                                                             CfnEnvironment$Builder
                                                             CfnEnvironment$OptionSettingProperty$Builder
                                                             CfnEnvironment$TierProperty$Builder
                                                             CfnEnvironmentProps$Builder]))


(defn build-cfn-application-application-resource-lifecycle-config-property-builder
  "The build-cfn-application-application-resource-lifecycle-config-property-builder function updates a CfnApplication$ApplicationResourceLifecycleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationResourceLifecycleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `versionLifecycleConfig` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$ApplicationVersionLifecycleConfigProperty | [[cdk.support/lookup-entry]] | `:version-lifecycle-config` |
"
  [^CfnApplication$ApplicationResourceLifecycleConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-let [data (lookup-entry config id :version-lifecycle-config)]
    (. builder versionLifecycleConfig data))
  (.build builder))


(defn build-cfn-application-application-version-lifecycle-config-property-builder
  "The build-cfn-application-application-version-lifecycle-config-property-builder function updates a CfnApplication$ApplicationVersionLifecycleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationVersionLifecycleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxAgeRule` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$MaxAgeRuleProperty | [[cdk.support/lookup-entry]] | `:max-age-rule` |
| `maxCountRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:max-count-rule` |
"
  [^CfnApplication$ApplicationVersionLifecycleConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-age-rule)]
    (. builder maxAgeRule data))
  (when-let [data (lookup-entry config id :max-count-rule)]
    (. builder maxCountRule data))
  (.build builder))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `resourceLifecycleConfig` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$ApplicationResourceLifecycleConfigProperty | [[cdk.support/lookup-entry]] | `:resource-lifecycle-config` |
"
  [^CfnApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :resource-lifecycle-config)]
    (. builder resourceLifecycleConfig data))
  (.build builder))


(defn build-cfn-application-max-age-rule-property-builder
  "The build-cfn-application-max-age-rule-property-builder function updates a CfnApplication$MaxAgeRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MaxAgeRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteSourceFromS3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-source-from-s3` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxAgeInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age-in-days` |
"
  [^CfnApplication$MaxAgeRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delete-source-from-s3)]
    (. builder deleteSourceFromS3 data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :max-age-in-days)]
    (. builder maxAgeInDays data))
  (.build builder))


(defn build-cfn-application-max-count-rule-property-builder
  "The build-cfn-application-max-count-rule-property-builder function updates a CfnApplication$MaxCountRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MaxCountRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteSourceFromS3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-source-from-s3` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-count` |
"
  [^CfnApplication$MaxCountRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delete-source-from-s3)]
    (. builder deleteSourceFromS3 data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :max-count)]
    (. builder maxCount data))
  (.build builder))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `resourceLifecycleConfig` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$ApplicationResourceLifecycleConfigProperty | [[cdk.support/lookup-entry]] | `:resource-lifecycle-config` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :resource-lifecycle-config)]
    (. builder resourceLifecycleConfig data))
  (.build builder))


(defn build-cfn-application-version-builder
  "The build-cfn-application-version-builder function updates a CfnApplicationVersion$Builder instance using the provided configuration.
  The function takes the CfnApplicationVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceBundle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-bundle` |
"
  [^CfnApplicationVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :source-bundle)]
    (. builder sourceBundle data))
  (.build builder))


(defn build-cfn-application-version-props-builder
  "The build-cfn-application-version-props-builder function updates a CfnApplicationVersionProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceBundle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-bundle` |
"
  [^CfnApplicationVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :source-bundle)]
    (. builder sourceBundle data))
  (.build builder))


(defn build-cfn-application-version-source-bundle-property-builder
  "The build-cfn-application-version-source-bundle-property-builder function updates a CfnApplicationVersion$SourceBundleProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationVersion$SourceBundleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnApplicationVersion$SourceBundleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn build-cfn-configuration-template-builder
  "The build-cfn-configuration-template-builder function updates a CfnConfigurationTemplate$Builder instance using the provided configuration.
  The function takes the CfnConfigurationTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `optionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-settings` |
| `platformArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-arn` |
| `solutionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:solution-stack-name` |
| `sourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-configuration` |
"
  [^CfnConfigurationTemplate$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-id)]
    (. builder environmentId data))
  (when-let [data (lookup-entry config id :option-settings)]
    (. builder optionSettings data))
  (when-let [data (lookup-entry config id :platform-arn)]
    (. builder platformArn data))
  (when-let [data (lookup-entry config id :solution-stack-name)]
    (. builder solutionStackName data))
  (when-let [data (lookup-entry config id :source-configuration)]
    (. builder sourceConfiguration data))
  (.build builder))


(defn build-cfn-configuration-template-configuration-option-setting-property-builder
  "The build-cfn-configuration-template-configuration-option-setting-property-builder function updates a CfnConfigurationTemplate$ConfigurationOptionSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationTemplate$ConfigurationOptionSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `optionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-name` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnConfigurationTemplate$ConfigurationOptionSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :option-name)]
    (. builder optionName data))
  (when-let [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-configuration-template-props-builder
  "The build-cfn-configuration-template-props-builder function updates a CfnConfigurationTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `optionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-settings` |
| `platformArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-arn` |
| `solutionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:solution-stack-name` |
| `sourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-configuration` |
"
  [^CfnConfigurationTemplateProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-id)]
    (. builder environmentId data))
  (when-let [data (lookup-entry config id :option-settings)]
    (. builder optionSettings data))
  (when-let [data (lookup-entry config id :platform-arn)]
    (. builder platformArn data))
  (when-let [data (lookup-entry config id :solution-stack-name)]
    (. builder solutionStackName data))
  (when-let [data (lookup-entry config id :source-configuration)]
    (. builder sourceConfiguration data))
  (.build builder))


(defn build-cfn-configuration-template-source-configuration-property-builder
  "The build-cfn-configuration-template-source-configuration-property-builder function updates a CfnConfigurationTemplate$SourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationTemplate$SourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnConfigurationTemplate$SourceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (.build builder))


(defn build-cfn-environment-builder
  "The build-cfn-environment-builder function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cnamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:cname-prefix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `operationsRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:operations-role` |
| `optionSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:option-settings` |
| `platformArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-arn` |
| `solutionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:solution-stack-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `tier` | software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment$TierProperty | [[cdk.support/lookup-entry]] | `:tier` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^CfnEnvironment$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :cname-prefix)]
    (. builder cnamePrefix data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :operations-role)]
    (. builder operationsRole data))
  (when-let [data (lookup-entry config id :option-settings)]
    (. builder optionSettings data))
  (when-let [data (lookup-entry config id :platform-arn)]
    (. builder platformArn data))
  (when-let [data (lookup-entry config id :solution-stack-name)]
    (. builder solutionStackName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-let [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-let [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn build-cfn-environment-option-setting-property-builder
  "The build-cfn-environment-option-setting-property-builder function updates a CfnEnvironment$OptionSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$OptionSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `optionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-name` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEnvironment$OptionSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :option-name)]
    (. builder optionName data))
  (when-let [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-environment-props-builder
  "The build-cfn-environment-props-builder function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `cnamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:cname-prefix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `operationsRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:operations-role` |
| `optionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-settings` |
| `platformArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-arn` |
| `solutionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:solution-stack-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `tier` | software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment$TierProperty | [[cdk.support/lookup-entry]] | `:tier` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^CfnEnvironmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :cname-prefix)]
    (. builder cnamePrefix data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :operations-role)]
    (. builder operationsRole data))
  (when-let [data (lookup-entry config id :option-settings)]
    (. builder optionSettings data))
  (when-let [data (lookup-entry config id :platform-arn)]
    (. builder platformArn data))
  (when-let [data (lookup-entry config id :solution-stack-name)]
    (. builder solutionStackName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-let [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-let [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn build-cfn-environment-tier-property-builder
  "The build-cfn-environment-tier-property-builder function updates a CfnEnvironment$TierProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$TierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnEnvironment$TierProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))