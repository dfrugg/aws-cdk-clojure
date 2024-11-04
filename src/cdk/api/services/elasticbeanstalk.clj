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


(defn cfn-application-application-resource-lifecycle-config-property-builder
  "The cfn-application-application-resource-lifecycle-config-property-builder function buildes out new instances of 
CfnApplication$ApplicationResourceLifecycleConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `versionLifecycleConfig` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$ApplicationVersionLifecycleConfigProperty | [[cdk.support/lookup-entry]] | `:version-lifecycle-config` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationResourceLifecycleConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :version-lifecycle-config)]
      (. builder versionLifecycleConfig data))
    (.build builder)))


(defn cfn-application-application-version-lifecycle-config-property-builder
  "The cfn-application-application-version-lifecycle-config-property-builder function buildes out new instances of 
CfnApplication$ApplicationVersionLifecycleConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxAgeRule` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$MaxAgeRuleProperty | [[cdk.support/lookup-entry]] | `:max-age-rule` |
| `maxCountRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:max-count-rule` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationVersionLifecycleConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-age-rule)]
      (. builder maxAgeRule data))
    (when-let [data (lookup-entry config id :max-count-rule)]
      (. builder maxCountRule data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `resourceLifecycleConfig` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$ApplicationResourceLifecycleConfigProperty | [[cdk.support/lookup-entry]] | `:resource-lifecycle-config` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :resource-lifecycle-config)]
      (. builder resourceLifecycleConfig data))
    (.build builder)))


(defn cfn-application-max-age-rule-property-builder
  "The cfn-application-max-age-rule-property-builder function buildes out new instances of 
CfnApplication$MaxAgeRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteSourceFromS3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-source-from-s3` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxAgeInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age-in-days` |"
  [stack id config]
  (let [builder (CfnApplication$MaxAgeRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-source-from-s3)]
      (. builder deleteSourceFromS3 data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :max-age-in-days)]
      (. builder maxAgeInDays data))
    (.build builder)))


(defn cfn-application-max-count-rule-property-builder
  "The cfn-application-max-count-rule-property-builder function buildes out new instances of 
CfnApplication$MaxCountRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteSourceFromS3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-source-from-s3` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-count` |"
  [stack id config]
  (let [builder (CfnApplication$MaxCountRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-source-from-s3)]
      (. builder deleteSourceFromS3 data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :max-count)]
      (. builder maxCount data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `resourceLifecycleConfig` | software.amazon.awscdk.services.elasticbeanstalk.CfnApplication$ApplicationResourceLifecycleConfigProperty | [[cdk.support/lookup-entry]] | `:resource-lifecycle-config` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :resource-lifecycle-config)]
      (. builder resourceLifecycleConfig data))
    (.build builder)))


(defn cfn-application-version-builder
  "The cfn-application-version-builder function buildes out new instances of 
CfnApplicationVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceBundle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-bundle` |"
  [stack id config]
  (let [builder (CfnApplicationVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :source-bundle)]
      (. builder sourceBundle data))
    (.build builder)))


(defn cfn-application-version-props-builder
  "The cfn-application-version-props-builder function buildes out new instances of 
CfnApplicationVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceBundle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-bundle` |"
  [stack id config]
  (let [builder (CfnApplicationVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :source-bundle)]
      (. builder sourceBundle data))
    (.build builder)))


(defn cfn-application-version-source-bundle-property-builder
  "The cfn-application-version-source-bundle-property-builder function buildes out new instances of 
CfnApplicationVersion$SourceBundleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnApplicationVersion$SourceBundleProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-configuration-template-builder
  "The cfn-configuration-template-builder function buildes out new instances of 
CfnConfigurationTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `optionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-settings` |
| `platformArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-arn` |
| `solutionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:solution-stack-name` |
| `sourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-configuration` |"
  [stack id config]
  (let [builder (CfnConfigurationTemplate$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-configuration-template-configuration-option-setting-property-builder
  "The cfn-configuration-template-configuration-option-setting-property-builder function buildes out new instances of 
CfnConfigurationTemplate$ConfigurationOptionSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `optionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-name` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnConfigurationTemplate$ConfigurationOptionSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :option-name)]
      (. builder optionName data))
    (when-let [data (lookup-entry config id :resource-name)]
      (. builder resourceName data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-configuration-template-props-builder
  "The cfn-configuration-template-props-builder function buildes out new instances of 
CfnConfigurationTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `optionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-settings` |
| `platformArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-arn` |
| `solutionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:solution-stack-name` |
| `sourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-configuration` |"
  [stack id config]
  (let [builder (CfnConfigurationTemplateProps$Builder.)]
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
    (.build builder)))


(defn cfn-configuration-template-source-configuration-property-builder
  "The cfn-configuration-template-source-configuration-property-builder function buildes out new instances of 
CfnConfigurationTemplate$SourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnConfigurationTemplate$SourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-environment-builder
  "The cfn-environment-builder function buildes out new instances of 
CfnEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (CfnEnvironment$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-environment-option-setting-property-builder
  "The cfn-environment-option-setting-property-builder function buildes out new instances of 
CfnEnvironment$OptionSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `optionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-name` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEnvironment$OptionSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :option-name)]
      (. builder optionName data))
    (when-let [data (lookup-entry config id :resource-name)]
      (. builder resourceName data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-environment-props-builder
  "The cfn-environment-props-builder function buildes out new instances of 
CfnEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (CfnEnvironmentProps$Builder.)]
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
    (.build builder)))


(defn cfn-environment-tier-property-builder
  "The cfn-environment-tier-property-builder function buildes out new instances of 
CfnEnvironment$TierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnEnvironment$TierProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))