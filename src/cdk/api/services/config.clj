(ns cdk.api.services.config
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.config package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.config AccessKeysRotated$Builder
                                                   AccessKeysRotatedProps$Builder
                                                   CfnAggregationAuthorization$Builder
                                                   CfnAggregationAuthorizationProps$Builder
                                                   CfnConfigRule$Builder
                                                   CfnConfigRule$ComplianceProperty$Builder
                                                   CfnConfigRule$CustomPolicyDetailsProperty$Builder
                                                   CfnConfigRule$EvaluationModeConfigurationProperty$Builder
                                                   CfnConfigRule$ScopeProperty$Builder
                                                   CfnConfigRule$SourceDetailProperty$Builder
                                                   CfnConfigRule$SourceProperty$Builder
                                                   CfnConfigRuleProps$Builder
                                                   CfnConfigurationAggregator$AccountAggregationSourceProperty$Builder
                                                   CfnConfigurationAggregator$Builder
                                                   CfnConfigurationAggregator$OrganizationAggregationSourceProperty$Builder
                                                   CfnConfigurationAggregatorProps$Builder
                                                   CfnConfigurationRecorder$Builder
                                                   CfnConfigurationRecorder$ExclusionByResourceTypesProperty$Builder
                                                   CfnConfigurationRecorder$RecordingGroupProperty$Builder
                                                   CfnConfigurationRecorder$RecordingModeOverrideProperty$Builder
                                                   CfnConfigurationRecorder$RecordingModeProperty$Builder
                                                   CfnConfigurationRecorder$RecordingStrategyProperty$Builder
                                                   CfnConfigurationRecorderProps$Builder
                                                   CfnConformancePack$Builder
                                                   CfnConformancePack$ConformancePackInputParameterProperty$Builder
                                                   CfnConformancePack$TemplateSSMDocumentDetailsProperty$Builder
                                                   CfnConformancePackProps$Builder
                                                   CfnDeliveryChannel$Builder
                                                   CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty$Builder
                                                   CfnDeliveryChannelProps$Builder
                                                   CfnOrganizationConfigRule$Builder
                                                   CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty$Builder
                                                   CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty$Builder
                                                   CfnOrganizationConfigRule$OrganizationManagedRuleMetadataProperty$Builder
                                                   CfnOrganizationConfigRuleProps$Builder
                                                   CfnOrganizationConformancePack$Builder
                                                   CfnOrganizationConformancePack$ConformancePackInputParameterProperty$Builder
                                                   CfnOrganizationConformancePackProps$Builder
                                                   CfnRemediationConfiguration$Builder
                                                   CfnRemediationConfiguration$ExecutionControlsProperty$Builder
                                                   CfnRemediationConfiguration$RemediationParameterValueProperty$Builder
                                                   CfnRemediationConfiguration$ResourceValueProperty$Builder
                                                   CfnRemediationConfiguration$SsmControlsProperty$Builder
                                                   CfnRemediationConfiguration$StaticValueProperty$Builder
                                                   CfnRemediationConfigurationProps$Builder
                                                   CfnStoredQuery$Builder
                                                   CfnStoredQueryProps$Builder
                                                   CloudFormationStackDriftDetectionCheck$Builder
                                                   CloudFormationStackDriftDetectionCheckProps$Builder
                                                   CloudFormationStackNotificationCheck$Builder
                                                   CloudFormationStackNotificationCheckProps$Builder
                                                   CustomPolicy$Builder
                                                   CustomPolicyProps$Builder
                                                   CustomRule$Builder
                                                   CustomRuleProps$Builder
                                                   ManagedRule$Builder
                                                   ManagedRuleProps$Builder
                                                   MaximumExecutionFrequency
                                                   RuleProps$Builder]))


(defn maximum-execution-frequency
  "The `maximum-execution-frequency` function data interprets values in the provided config data into a 
`MaximumExecutionFrequency` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MaximumExecutionFrequency` - the value is returned.
* is `:twelve-hours` - `MaximumExecutionFrequency/TWELVE_HOURS` is returned
* is `:twenty-four-hours` - `MaximumExecutionFrequency/TWENTY_FOUR_HOURS` is returned
* is `:one-hour` - `MaximumExecutionFrequency/ONE_HOUR` is returned
* is `:three-hours` - `MaximumExecutionFrequency/THREE_HOURS` is returned
* is `:six-hours` - `MaximumExecutionFrequency/SIX_HOURS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MaximumExecutionFrequency data) data
      (= :twelve-hours data) MaximumExecutionFrequency/TWELVE_HOURS
      (= :twenty-four-hours data) MaximumExecutionFrequency/TWENTY_FOUR_HOURS
      (= :one-hour data) MaximumExecutionFrequency/ONE_HOUR
      (= :three-hours data) MaximumExecutionFrequency/THREE_HOURS
      (= :six-hours data) MaximumExecutionFrequency/SIX_HOURS)))


(defn access-keys-rotated-builder
  "The access-keys-rotated-builder function buildes out new instances of 
AccessKeysRotated$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (AccessKeysRotated$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :max-age)]
      (. builder maxAge data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn access-keys-rotated-props-builder
  "The access-keys-rotated-props-builder function buildes out new instances of 
AccessKeysRotatedProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (AccessKeysRotatedProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :max-age)]
      (. builder maxAge data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn cfn-aggregation-authorization-builder
  "The cfn-aggregation-authorization-builder function buildes out new instances of 
CfnAggregationAuthorization$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-account-id` |
| `authorizedAwsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-aws-region` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAggregationAuthorization$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorized-account-id)]
      (. builder authorizedAccountId data))
    (when-let [data (lookup-entry config id :authorized-aws-region)]
      (. builder authorizedAwsRegion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-aggregation-authorization-props-builder
  "The cfn-aggregation-authorization-props-builder function buildes out new instances of 
CfnAggregationAuthorizationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-account-id` |
| `authorizedAwsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-aws-region` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAggregationAuthorizationProps$Builder.)]
    (when-let [data (lookup-entry config id :authorized-account-id)]
      (. builder authorizedAccountId data))
    (when-let [data (lookup-entry config id :authorized-aws-region)]
      (. builder authorizedAwsRegion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-config-rule-builder
  "The cfn-config-rule-builder function buildes out new instances of 
CfnConfigRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compliance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compliance` |
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `evaluationModes` | java.util.List | [[cdk.support/lookup-entry]] | `:evaluation-modes` |
| `inputParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `scope` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnConfigRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compliance)]
      (. builder compliance data))
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :evaluation-modes)]
      (. builder evaluationModes data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-config-rule-compliance-property-builder
  "The cfn-config-rule-compliance-property-builder function buildes out new instances of 
CfnConfigRule$ComplianceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnConfigRule$ComplianceProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-config-rule-custom-policy-details-property-builder
  "The cfn-config-rule-custom-policy-details-property-builder function buildes out new instances of 
CfnConfigRule$CustomPolicyDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableDebugLogDelivery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-debug-log-delivery` |
| `policyRuntime` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-runtime` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |"
  [stack id config]
  (let [builder (CfnConfigRule$CustomPolicyDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-debug-log-delivery)]
      (. builder enableDebugLogDelivery data))
    (when-let [data (lookup-entry config id :policy-runtime)]
      (. builder policyRuntime data))
    (when-let [data (lookup-entry config id :policy-text)]
      (. builder policyText data))
    (.build builder)))


(defn cfn-config-rule-evaluation-mode-configuration-property-builder
  "The cfn-config-rule-evaluation-mode-configuration-property-builder function buildes out new instances of 
CfnConfigRule$EvaluationModeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnConfigRule$EvaluationModeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-config-rule-props-builder
  "The cfn-config-rule-props-builder function buildes out new instances of 
CfnConfigRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compliance` | software.amazon.awscdk.services.config.CfnConfigRule$ComplianceProperty | [[cdk.support/lookup-entry]] | `:compliance` |
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `evaluationModes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:evaluation-modes` |
| `inputParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `scope` | software.amazon.awscdk.services.config.CfnConfigRule$ScopeProperty | [[cdk.support/lookup-entry]] | `:scope` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnConfigRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :compliance)]
      (. builder compliance data))
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :evaluation-modes)]
      (. builder evaluationModes data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-config-rule-scope-property-builder
  "The cfn-config-rule-scope-property-builder function buildes out new instances of 
CfnConfigRule$ScopeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `complianceResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:compliance-resource-id` |
| `complianceResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-resource-types` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value` |"
  [stack id config]
  (let [builder (CfnConfigRule$ScopeProperty$Builder.)]
    (when-let [data (lookup-entry config id :compliance-resource-id)]
      (. builder complianceResourceId data))
    (when-let [data (lookup-entry config id :compliance-resource-types)]
      (. builder complianceResourceTypes data))
    (when-let [data (lookup-entry config id :tag-key)]
      (. builder tagKey data))
    (when-let [data (lookup-entry config id :tag-value)]
      (. builder tagValue data))
    (.build builder)))


(defn cfn-config-rule-source-detail-property-builder
  "The cfn-config-rule-source-detail-property-builder function buildes out new instances of 
CfnConfigRule$SourceDetailProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `messageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-type` |"
  [stack id config]
  (let [builder (CfnConfigRule$SourceDetailProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-source)]
      (. builder eventSource data))
    (when-let [data (lookup-entry config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :message-type)]
      (. builder messageType data))
    (.build builder)))


(defn cfn-config-rule-source-property-builder
  "The cfn-config-rule-source-property-builder function buildes out new instances of 
CfnConfigRule$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPolicyDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-policy-details` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `sourceDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:source-details` |
| `sourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-identifier` |"
  [stack id config]
  (let [builder (CfnConfigRule$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-policy-details)]
      (. builder customPolicyDetails data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :source-details)]
      (. builder sourceDetails data))
    (when-let [data (lookup-entry config id :source-identifier)]
      (. builder sourceIdentifier data))
    (.build builder)))


(defn cfn-configuration-aggregator-account-aggregation-source-property-builder
  "The cfn-configuration-aggregator-account-aggregation-source-property-builder function buildes out new instances of 
CfnConfigurationAggregator$AccountAggregationSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:account-ids` |
| `allAwsRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:all-aws-regions` |
| `awsRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-regions` |"
  [stack id config]
  (let [builder (CfnConfigurationAggregator$AccountAggregationSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-ids)]
      (. builder accountIds data))
    (when-let [data (lookup-entry config id :all-aws-regions)]
      (. builder allAwsRegions data))
    (when-let [data (lookup-entry config id :aws-regions)]
      (. builder awsRegions data))
    (.build builder)))


(defn cfn-configuration-aggregator-builder
  "The cfn-configuration-aggregator-builder function buildes out new instances of 
CfnConfigurationAggregator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAggregationSources` | java.util.List | [[cdk.support/lookup-entry]] | `:account-aggregation-sources` |
| `configurationAggregatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-aggregator-name` |
| `organizationAggregationSource` | software.amazon.awscdk.services.config.CfnConfigurationAggregator$OrganizationAggregationSourceProperty | [[cdk.support/lookup-entry]] | `:organization-aggregation-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfigurationAggregator$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-aggregation-sources)]
      (. builder accountAggregationSources data))
    (when-let [data (lookup-entry config id :configuration-aggregator-name)]
      (. builder configurationAggregatorName data))
    (when-let [data (lookup-entry config id :organization-aggregation-source)]
      (. builder organizationAggregationSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configuration-aggregator-organization-aggregation-source-property-builder
  "The cfn-configuration-aggregator-organization-aggregation-source-property-builder function buildes out new instances of 
CfnConfigurationAggregator$OrganizationAggregationSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allAwsRegions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:all-aws-regions` |
| `awsRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-regions` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnConfigurationAggregator$OrganizationAggregationSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :all-aws-regions)]
      (. builder allAwsRegions data))
    (when-let [data (lookup-entry config id :aws-regions)]
      (. builder awsRegions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-configuration-aggregator-props-builder
  "The cfn-configuration-aggregator-props-builder function buildes out new instances of 
CfnConfigurationAggregatorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAggregationSources` | java.util.List | [[cdk.support/lookup-entry]] | `:account-aggregation-sources` |
| `configurationAggregatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-aggregator-name` |
| `organizationAggregationSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-aggregation-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfigurationAggregatorProps$Builder.)]
    (when-let [data (lookup-entry config id :account-aggregation-sources)]
      (. builder accountAggregationSources data))
    (when-let [data (lookup-entry config id :configuration-aggregator-name)]
      (. builder configurationAggregatorName data))
    (when-let [data (lookup-entry config id :organization-aggregation-source)]
      (. builder organizationAggregationSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configuration-recorder-builder
  "The cfn-configuration-recorder-builder function buildes out new instances of 
CfnConfigurationRecorder$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-group` |
| `recordingMode` | software.amazon.awscdk.services.config.CfnConfigurationRecorder$RecordingModeProperty | [[cdk.support/lookup-entry]] | `:recording-mode` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorder$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recording-group)]
      (. builder recordingGroup data))
    (when-let [data (lookup-entry config id :recording-mode)]
      (. builder recordingMode data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-configuration-recorder-exclusion-by-resource-types-property-builder
  "The cfn-configuration-recorder-exclusion-by-resource-types-property-builder function buildes out new instances of 
CfnConfigurationRecorder$ExclusionByResourceTypesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorder$ExclusionByResourceTypesProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (.build builder)))


(defn cfn-configuration-recorder-props-builder
  "The cfn-configuration-recorder-props-builder function buildes out new instances of 
CfnConfigurationRecorderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingGroup` | software.amazon.awscdk.services.config.CfnConfigurationRecorder$RecordingGroupProperty | [[cdk.support/lookup-entry]] | `:recording-group` |
| `recordingMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-mode` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorderProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recording-group)]
      (. builder recordingGroup data))
    (when-let [data (lookup-entry config id :recording-mode)]
      (. builder recordingMode data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-configuration-recorder-recording-group-property-builder
  "The cfn-configuration-recorder-recording-group-property-builder function buildes out new instances of 
CfnConfigurationRecorder$RecordingGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allSupported` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:all-supported` |
| `exclusionByResourceTypes` | software.amazon.awscdk.services.config.CfnConfigurationRecorder$ExclusionByResourceTypesProperty | [[cdk.support/lookup-entry]] | `:exclusion-by-resource-types` |
| `includeGlobalResourceTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-global-resource-types` |
| `recordingStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-strategy` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorder$RecordingGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :all-supported)]
      (. builder allSupported data))
    (when-let [data (lookup-entry config id :exclusion-by-resource-types)]
      (. builder exclusionByResourceTypes data))
    (when-let [data (lookup-entry config id :include-global-resource-types)]
      (. builder includeGlobalResourceTypes data))
    (when-let [data (lookup-entry config id :recording-strategy)]
      (. builder recordingStrategy data))
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (.build builder)))


(defn cfn-configuration-recorder-recording-mode-override-property-builder
  "The cfn-configuration-recorder-recording-mode-override-property-builder function buildes out new instances of 
CfnConfigurationRecorder$RecordingModeOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `recordingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-frequency` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorder$RecordingModeOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :recording-frequency)]
      (. builder recordingFrequency data))
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (.build builder)))


(defn cfn-configuration-recorder-recording-mode-property-builder
  "The cfn-configuration-recorder-recording-mode-property-builder function buildes out new instances of 
CfnConfigurationRecorder$RecordingModeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-frequency` |
| `recordingModeOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-mode-overrides` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorder$RecordingModeProperty$Builder.)]
    (when-let [data (lookup-entry config id :recording-frequency)]
      (. builder recordingFrequency data))
    (when-let [data (lookup-entry config id :recording-mode-overrides)]
      (. builder recordingModeOverrides data))
    (.build builder)))


(defn cfn-configuration-recorder-recording-strategy-property-builder
  "The cfn-configuration-recorder-recording-strategy-property-builder function buildes out new instances of 
CfnConfigurationRecorder$RecordingStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `useOnly` | java.lang.String | [[cdk.support/lookup-entry]] | `:use-only` |"
  [stack id config]
  (let [builder (CfnConfigurationRecorder$RecordingStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :use-only)]
      (. builder useOnly data))
    (.build builder)))


(defn cfn-conformance-pack-builder
  "The cfn-conformance-pack-builder function buildes out new instances of 
CfnConformancePack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `conformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:conformance-pack-name` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
| `templateSsmDocumentDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template-ssm-document-details` |"
  [stack id config]
  (let [builder (CfnConformancePack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :conformance-pack-input-parameters)]
      (. builder conformancePackInputParameters data))
    (when-let [data (lookup-entry config id :conformance-pack-name)]
      (. builder conformancePackName data))
    (when-let [data (lookup-entry config id :delivery-s3-bucket)]
      (. builder deliveryS3Bucket data))
    (when-let [data (lookup-entry config id :delivery-s3-key-prefix)]
      (. builder deliveryS3KeyPrefix data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-s3-uri)]
      (. builder templateS3Uri data))
    (when-let [data (lookup-entry config id :template-ssm-document-details)]
      (. builder templateSsmDocumentDetails data))
    (.build builder)))


(defn cfn-conformance-pack-conformance-pack-input-parameter-property-builder
  "The cfn-conformance-pack-conformance-pack-input-parameter-property-builder function buildes out new instances of 
CfnConformancePack$ConformancePackInputParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnConformancePack$ConformancePackInputParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-conformance-pack-props-builder
  "The cfn-conformance-pack-props-builder function buildes out new instances of 
CfnConformancePackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `conformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:conformance-pack-name` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
| `templateSsmDocumentDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template-ssm-document-details` |"
  [stack id config]
  (let [builder (CfnConformancePackProps$Builder.)]
    (when-let [data (lookup-entry config id :conformance-pack-input-parameters)]
      (. builder conformancePackInputParameters data))
    (when-let [data (lookup-entry config id :conformance-pack-name)]
      (. builder conformancePackName data))
    (when-let [data (lookup-entry config id :delivery-s3-bucket)]
      (. builder deliveryS3Bucket data))
    (when-let [data (lookup-entry config id :delivery-s3-key-prefix)]
      (. builder deliveryS3KeyPrefix data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-s3-uri)]
      (. builder templateS3Uri data))
    (when-let [data (lookup-entry config id :template-ssm-document-details)]
      (. builder templateSsmDocumentDetails data))
    (.build builder)))


(defn cfn-conformance-pack-template-ssm-document-details-property-builder
  "The cfn-conformance-pack-template-ssm-document-details-property-builder function buildes out new instances of 
CfnConformancePack$TemplateSSMDocumentDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-name` |
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |"
  [stack id config]
  (let [builder (CfnConformancePack$TemplateSSMDocumentDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :document-name)]
      (. builder documentName data))
    (when-let [data (lookup-entry config id :document-version)]
      (. builder documentVersion data))
    (.build builder)))


(defn cfn-delivery-channel-builder
  "The cfn-delivery-channel-builder function buildes out new instances of 
CfnDeliveryChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSnapshotDeliveryProperties` | software.amazon.awscdk.services.config.CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty | [[cdk.support/lookup-entry]] | `:config-snapshot-delivery-properties` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `s3KmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-arn` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnDeliveryChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-snapshot-delivery-properties)]
      (. builder configSnapshotDeliveryProperties data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (when-let [data (lookup-entry config id :s3-kms-key-arn)]
      (. builder s3KmsKeyArn data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-delivery-channel-config-snapshot-delivery-properties-property-builder
  "The cfn-delivery-channel-config-snapshot-delivery-properties-property-builder function buildes out new instances of 
CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-frequency` |"
  [stack id config]
  (let [builder (CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-frequency)]
      (. builder deliveryFrequency data))
    (.build builder)))


(defn cfn-delivery-channel-props-builder
  "The cfn-delivery-channel-props-builder function buildes out new instances of 
CfnDeliveryChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSnapshotDeliveryProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-snapshot-delivery-properties` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `s3KmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-arn` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnDeliveryChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :config-snapshot-delivery-properties)]
      (. builder configSnapshotDeliveryProperties data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (when-let [data (lookup-entry config id :s3-kms-key-arn)]
      (. builder s3KmsKeyArn data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-organization-config-rule-builder
  "The cfn-organization-config-rule-builder function buildes out new instances of 
CfnOrganizationConfigRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConfigRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-config-rule-name` |
| `organizationCustomPolicyRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-custom-policy-rule-metadata` |
| `organizationCustomRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-custom-rule-metadata` |
| `organizationManagedRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-managed-rule-metadata` |"
  [stack id config]
  (let [builder (CfnOrganizationConfigRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :excluded-accounts)]
      (. builder excludedAccounts data))
    (when-let [data (lookup-entry config id :organization-config-rule-name)]
      (. builder organizationConfigRuleName data))
    (when-let [data (lookup-entry config id :organization-custom-policy-rule-metadata)]
      (. builder organizationCustomPolicyRuleMetadata data))
    (when-let [data (lookup-entry config id :organization-custom-rule-metadata)]
      (. builder organizationCustomRuleMetadata data))
    (when-let [data (lookup-entry config id :organization-managed-rule-metadata)]
      (. builder organizationManagedRuleMetadata data))
    (.build builder)))


(defn cfn-organization-config-rule-organization-custom-policy-rule-metadata-property-builder
  "The cfn-organization-config-rule-organization-custom-policy-rule-metadata-property-builder function buildes out new instances of 
CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `debugLogDeliveryAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:debug-log-delivery-accounts` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `organizationConfigRuleTriggerTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:organization-config-rule-trigger-types` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |
| `resourceIdScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id-scope` |
| `resourceTypesScope` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types-scope` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `tagKeyScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key-scope` |
| `tagValueScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value-scope` |"
  [stack id config]
  (let [builder (CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :debug-log-delivery-accounts)]
      (. builder debugLogDeliveryAccounts data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :organization-config-rule-trigger-types)]
      (. builder organizationConfigRuleTriggerTypes data))
    (when-let [data (lookup-entry config id :policy-text)]
      (. builder policyText data))
    (when-let [data (lookup-entry config id :resource-id-scope)]
      (. builder resourceIdScope data))
    (when-let [data (lookup-entry config id :resource-types-scope)]
      (. builder resourceTypesScope data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :tag-key-scope)]
      (. builder tagKeyScope data))
    (when-let [data (lookup-entry config id :tag-value-scope)]
      (. builder tagValueScope data))
    (.build builder)))


(defn cfn-organization-config-rule-organization-custom-rule-metadata-property-builder
  "The cfn-organization-config-rule-organization-custom-rule-metadata-property-builder function buildes out new instances of 
CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `organizationConfigRuleTriggerTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:organization-config-rule-trigger-types` |
| `resourceIdScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id-scope` |
| `resourceTypesScope` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types-scope` |
| `tagKeyScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key-scope` |
| `tagValueScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value-scope` |"
  [stack id config]
  (let [builder (CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :lambda-function-arn)]
      (. builder lambdaFunctionArn data))
    (when-let [data (lookup-entry config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :organization-config-rule-trigger-types)]
      (. builder organizationConfigRuleTriggerTypes data))
    (when-let [data (lookup-entry config id :resource-id-scope)]
      (. builder resourceIdScope data))
    (when-let [data (lookup-entry config id :resource-types-scope)]
      (. builder resourceTypesScope data))
    (when-let [data (lookup-entry config id :tag-key-scope)]
      (. builder tagKeyScope data))
    (when-let [data (lookup-entry config id :tag-value-scope)]
      (. builder tagValueScope data))
    (.build builder)))


(defn cfn-organization-config-rule-organization-managed-rule-metadata-property-builder
  "The cfn-organization-config-rule-organization-managed-rule-metadata-property-builder function buildes out new instances of 
CfnOrganizationConfigRule$OrganizationManagedRuleMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `resourceIdScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id-scope` |
| `resourceTypesScope` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types-scope` |
| `ruleIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-identifier` |
| `tagKeyScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key-scope` |
| `tagValueScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value-scope` |"
  [stack id config]
  (let [builder (CfnOrganizationConfigRule$OrganizationManagedRuleMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :resource-id-scope)]
      (. builder resourceIdScope data))
    (when-let [data (lookup-entry config id :resource-types-scope)]
      (. builder resourceTypesScope data))
    (when-let [data (lookup-entry config id :rule-identifier)]
      (. builder ruleIdentifier data))
    (when-let [data (lookup-entry config id :tag-key-scope)]
      (. builder tagKeyScope data))
    (when-let [data (lookup-entry config id :tag-value-scope)]
      (. builder tagValueScope data))
    (.build builder)))


(defn cfn-organization-config-rule-props-builder
  "The cfn-organization-config-rule-props-builder function buildes out new instances of 
CfnOrganizationConfigRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConfigRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-config-rule-name` |
| `organizationCustomPolicyRuleMetadata` | software.amazon.awscdk.services.config.CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty | [[cdk.support/lookup-entry]] | `:organization-custom-policy-rule-metadata` |
| `organizationCustomRuleMetadata` | software.amazon.awscdk.services.config.CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty | [[cdk.support/lookup-entry]] | `:organization-custom-rule-metadata` |
| `organizationManagedRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-managed-rule-metadata` |"
  [stack id config]
  (let [builder (CfnOrganizationConfigRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :excluded-accounts)]
      (. builder excludedAccounts data))
    (when-let [data (lookup-entry config id :organization-config-rule-name)]
      (. builder organizationConfigRuleName data))
    (when-let [data (lookup-entry config id :organization-custom-policy-rule-metadata)]
      (. builder organizationCustomPolicyRuleMetadata data))
    (when-let [data (lookup-entry config id :organization-custom-rule-metadata)]
      (. builder organizationCustomRuleMetadata data))
    (when-let [data (lookup-entry config id :organization-managed-rule-metadata)]
      (. builder organizationManagedRuleMetadata data))
    (.build builder)))


(defn cfn-organization-conformance-pack-builder
  "The cfn-organization-conformance-pack-builder function buildes out new instances of 
CfnOrganizationConformancePack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-conformance-pack-name` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |"
  [stack id config]
  (let [builder (CfnOrganizationConformancePack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :conformance-pack-input-parameters)]
      (. builder conformancePackInputParameters data))
    (when-let [data (lookup-entry config id :delivery-s3-bucket)]
      (. builder deliveryS3Bucket data))
    (when-let [data (lookup-entry config id :delivery-s3-key-prefix)]
      (. builder deliveryS3KeyPrefix data))
    (when-let [data (lookup-entry config id :excluded-accounts)]
      (. builder excludedAccounts data))
    (when-let [data (lookup-entry config id :organization-conformance-pack-name)]
      (. builder organizationConformancePackName data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-s3-uri)]
      (. builder templateS3Uri data))
    (.build builder)))


(defn cfn-organization-conformance-pack-conformance-pack-input-parameter-property-builder
  "The cfn-organization-conformance-pack-conformance-pack-input-parameter-property-builder function buildes out new instances of 
CfnOrganizationConformancePack$ConformancePackInputParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnOrganizationConformancePack$ConformancePackInputParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-organization-conformance-pack-props-builder
  "The cfn-organization-conformance-pack-props-builder function buildes out new instances of 
CfnOrganizationConformancePackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-conformance-pack-name` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |"
  [stack id config]
  (let [builder (CfnOrganizationConformancePackProps$Builder.)]
    (when-let [data (lookup-entry config id :conformance-pack-input-parameters)]
      (. builder conformancePackInputParameters data))
    (when-let [data (lookup-entry config id :delivery-s3-bucket)]
      (. builder deliveryS3Bucket data))
    (when-let [data (lookup-entry config id :delivery-s3-key-prefix)]
      (. builder deliveryS3KeyPrefix data))
    (when-let [data (lookup-entry config id :excluded-accounts)]
      (. builder excludedAccounts data))
    (when-let [data (lookup-entry config id :organization-conformance-pack-name)]
      (. builder organizationConformancePackName data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-s3-uri)]
      (. builder templateS3Uri data))
    (.build builder)))


(defn cfn-remediation-configuration-builder
  "The cfn-remediation-configuration-builder function buildes out new instances of 
CfnRemediationConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automatic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:automatic` |
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `executionControls` | software.amazon.awscdk.services.config.CfnRemediationConfiguration$ExecutionControlsProperty | [[cdk.support/lookup-entry]] | `:execution-controls` |
| `maximumAutomaticAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-automatic-attempts` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `retryAttemptSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempt-seconds` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
| `targetVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-version` |"
  [stack id config]
  (let [builder (CfnRemediationConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :automatic)]
      (. builder automatic data))
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :execution-controls)]
      (. builder executionControls data))
    (when-let [data (lookup-entry config id :maximum-automatic-attempts)]
      (. builder maximumAutomaticAttempts data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :retry-attempt-seconds)]
      (. builder retryAttemptSeconds data))
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :target-version)]
      (. builder targetVersion data))
    (.build builder)))


(defn cfn-remediation-configuration-execution-controls-property-builder
  "The cfn-remediation-configuration-execution-controls-property-builder function buildes out new instances of 
CfnRemediationConfiguration$ExecutionControlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ssmControls` | software.amazon.awscdk.services.config.CfnRemediationConfiguration$SsmControlsProperty | [[cdk.support/lookup-entry]] | `:ssm-controls` |"
  [stack id config]
  (let [builder (CfnRemediationConfiguration$ExecutionControlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ssm-controls)]
      (. builder ssmControls data))
    (.build builder)))


(defn cfn-remediation-configuration-props-builder
  "The cfn-remediation-configuration-props-builder function buildes out new instances of 
CfnRemediationConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automatic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic` |
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `executionControls` | software.amazon.awscdk.services.config.CfnRemediationConfiguration$ExecutionControlsProperty | [[cdk.support/lookup-entry]] | `:execution-controls` |
| `maximumAutomaticAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-automatic-attempts` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `retryAttemptSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempt-seconds` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
| `targetVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-version` |"
  [stack id config]
  (let [builder (CfnRemediationConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :automatic)]
      (. builder automatic data))
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :execution-controls)]
      (. builder executionControls data))
    (when-let [data (lookup-entry config id :maximum-automatic-attempts)]
      (. builder maximumAutomaticAttempts data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :retry-attempt-seconds)]
      (. builder retryAttemptSeconds data))
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (when-let [data (lookup-entry config id :target-version)]
      (. builder targetVersion data))
    (.build builder)))


(defn cfn-remediation-configuration-remediation-parameter-value-property-builder
  "The cfn-remediation-configuration-remediation-parameter-value-property-builder function buildes out new instances of 
CfnRemediationConfiguration$RemediationParameterValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-value` |
| `staticValue` | software.amazon.awscdk.services.config.CfnRemediationConfiguration$StaticValueProperty | [[cdk.support/lookup-entry]] | `:static-value` |"
  [stack id config]
  (let [builder (CfnRemediationConfiguration$RemediationParameterValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-value)]
      (. builder resourceValue data))
    (when-let [data (lookup-entry config id :static-value)]
      (. builder staticValue data))
    (.build builder)))


(defn cfn-remediation-configuration-resource-value-property-builder
  "The cfn-remediation-configuration-resource-value-property-builder function buildes out new instances of 
CfnRemediationConfiguration$ResourceValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRemediationConfiguration$ResourceValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-remediation-configuration-ssm-controls-property-builder
  "The cfn-remediation-configuration-ssm-controls-property-builder function buildes out new instances of 
CfnRemediationConfiguration$SsmControlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `concurrentExecutionRatePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-execution-rate-percentage` |
| `errorPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-percentage` |"
  [stack id config]
  (let [builder (CfnRemediationConfiguration$SsmControlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :concurrent-execution-rate-percentage)]
      (. builder concurrentExecutionRatePercentage data))
    (when-let [data (lookup-entry config id :error-percentage)]
      (. builder errorPercentage data))
    (.build builder)))


(defn cfn-remediation-configuration-static-value-property-builder
  "The cfn-remediation-configuration-static-value-property-builder function buildes out new instances of 
CfnRemediationConfiguration$StaticValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnRemediationConfiguration$StaticValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-stored-query-builder
  "The cfn-stored-query-builder function buildes out new instances of 
CfnStoredQuery$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-description` |
| `queryExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-expression` |
| `queryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStoredQuery$Builder/create stack id)]
    (when-let [data (lookup-entry config id :query-description)]
      (. builder queryDescription data))
    (when-let [data (lookup-entry config id :query-expression)]
      (. builder queryExpression data))
    (when-let [data (lookup-entry config id :query-name)]
      (. builder queryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stored-query-props-builder
  "The cfn-stored-query-props-builder function buildes out new instances of 
CfnStoredQueryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-description` |
| `queryExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-expression` |
| `queryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStoredQueryProps$Builder.)]
    (when-let [data (lookup-entry config id :query-description)]
      (. builder queryDescription data))
    (when-let [data (lookup-entry config id :query-expression)]
      (. builder queryExpression data))
    (when-let [data (lookup-entry config id :query-name)]
      (. builder queryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cloud-formation-stack-drift-detection-check-builder
  "The cloud-formation-stack-drift-detection-check-builder function buildes out new instances of 
CloudFormationStackDriftDetectionCheck$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ownStackOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:own-stack-only` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (CloudFormationStackDriftDetectionCheck$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :own-stack-only)]
      (. builder ownStackOnly data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn cloud-formation-stack-drift-detection-check-props-builder
  "The cloud-formation-stack-drift-detection-check-props-builder function buildes out new instances of 
CloudFormationStackDriftDetectionCheckProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ownStackOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:own-stack-only` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (CloudFormationStackDriftDetectionCheckProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :own-stack-only)]
      (. builder ownStackOnly data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn cloud-formation-stack-notification-check-builder
  "The cloud-formation-stack-notification-check-builder function buildes out new instances of 
CloudFormationStackNotificationCheck$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (CloudFormationStackNotificationCheck$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn cloud-formation-stack-notification-check-props-builder
  "The cloud-formation-stack-notification-check-props-builder function buildes out new instances of 
CloudFormationStackNotificationCheckProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (CloudFormationStackNotificationCheckProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn custom-policy-builder
  "The custom-policy-builder function buildes out new instances of 
CustomPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableDebugLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-debug-log` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (CustomPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-debug-log)]
      (. builder enableDebugLog data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :policy-text)]
      (. builder policyText data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn custom-policy-props-builder
  "The custom-policy-props-builder function buildes out new instances of 
CustomPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableDebugLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-debug-log` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (CustomPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-debug-log)]
      (. builder enableDebugLog data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :policy-text)]
      (. builder policyText data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn custom-rule-builder
  "The custom-rule-builder function buildes out new instances of 
CustomRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `configurationChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configuration-changes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `periodic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:periodic` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (CustomRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :configuration-changes)]
      (. builder configurationChanges data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :periodic)]
      (. builder periodic data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn custom-rule-props-builder
  "The custom-rule-props-builder function buildes out new instances of 
CustomRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `configurationChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configuration-changes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `periodic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:periodic` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (CustomRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :configuration-changes)]
      (. builder configurationChanges data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :periodic)]
      (. builder periodic data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn managed-rule-builder
  "The managed-rule-builder function buildes out new instances of 
ManagedRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (ManagedRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn managed-rule-props-builder
  "The managed-rule-props-builder function buildes out new instances of 
ManagedRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (ManagedRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))


(defn rule-props-builder
  "The rule-props-builder function buildes out new instances of 
RuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |"
  [stack id config]
  (let [builder (RuleProps$Builder.)]
    (when-let [data (lookup-entry config id :config-rule-name)]
      (. builder configRuleName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-parameters)]
      (. builder inputParameters data))
    (when-let [data (maximum-execution-frequency config id :maximum-execution-frequency)]
      (. builder maximumExecutionFrequency data))
    (when-let [data (lookup-entry config id :rule-scope)]
      (. builder ruleScope data))
    (.build builder)))