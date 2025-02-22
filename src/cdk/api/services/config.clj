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


(defn build-access-keys-rotated-builder
  "The build-access-keys-rotated-builder function updates a AccessKeysRotated$Builder instance using the provided configuration.
  The function takes the AccessKeysRotated$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^AccessKeysRotated$Builder builder id config]
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
  (.build builder))


(defn build-access-keys-rotated-props-builder
  "The build-access-keys-rotated-props-builder function updates a AccessKeysRotatedProps$Builder instance using the provided configuration.
  The function takes the AccessKeysRotatedProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-age` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^AccessKeysRotatedProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-aggregation-authorization-builder
  "The build-cfn-aggregation-authorization-builder function updates a CfnAggregationAuthorization$Builder instance using the provided configuration.
  The function takes the CfnAggregationAuthorization$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-account-id` |
| `authorizedAwsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-aws-region` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAggregationAuthorization$Builder builder id config]
  (when-let [data (lookup-entry config id :authorized-account-id)]
    (. builder authorizedAccountId data))
  (when-let [data (lookup-entry config id :authorized-aws-region)]
    (. builder authorizedAwsRegion data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-aggregation-authorization-props-builder
  "The build-cfn-aggregation-authorization-props-builder function updates a CfnAggregationAuthorizationProps$Builder instance using the provided configuration.
  The function takes the CfnAggregationAuthorizationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-account-id` |
| `authorizedAwsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorized-aws-region` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAggregationAuthorizationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorized-account-id)]
    (. builder authorizedAccountId data))
  (when-let [data (lookup-entry config id :authorized-aws-region)]
    (. builder authorizedAwsRegion data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-config-rule-builder
  "The build-cfn-config-rule-builder function updates a CfnConfigRule$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compliance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compliance` |
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `evaluationModes` | java.util.List | [[cdk.support/lookup-entry]] | `:evaluation-modes` |
| `inputParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `scope` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnConfigRule$Builder builder id config]
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
  (.build builder))


(defn build-cfn-config-rule-compliance-property-builder
  "The build-cfn-config-rule-compliance-property-builder function updates a CfnConfigRule$ComplianceProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$ComplianceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnConfigRule$ComplianceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-config-rule-custom-policy-details-property-builder
  "The build-cfn-config-rule-custom-policy-details-property-builder function updates a CfnConfigRule$CustomPolicyDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$CustomPolicyDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableDebugLogDelivery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-debug-log-delivery` |
| `policyRuntime` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-runtime` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |
"
  [^CfnConfigRule$CustomPolicyDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-debug-log-delivery)]
    (. builder enableDebugLogDelivery data))
  (when-let [data (lookup-entry config id :policy-runtime)]
    (. builder policyRuntime data))
  (when-let [data (lookup-entry config id :policy-text)]
    (. builder policyText data))
  (.build builder))


(defn build-cfn-config-rule-evaluation-mode-configuration-property-builder
  "The build-cfn-config-rule-evaluation-mode-configuration-property-builder function updates a CfnConfigRule$EvaluationModeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$EvaluationModeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnConfigRule$EvaluationModeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn build-cfn-config-rule-props-builder
  "The build-cfn-config-rule-props-builder function updates a CfnConfigRuleProps$Builder instance using the provided configuration.
  The function takes the CfnConfigRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compliance` | software.amazon.awscdk.services.config.CfnConfigRule$ComplianceProperty | [[cdk.support/lookup-entry]] | `:compliance` |
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `evaluationModes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:evaluation-modes` |
| `inputParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `scope` | software.amazon.awscdk.services.config.CfnConfigRule$ScopeProperty | [[cdk.support/lookup-entry]] | `:scope` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnConfigRuleProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-config-rule-scope-property-builder
  "The build-cfn-config-rule-scope-property-builder function updates a CfnConfigRule$ScopeProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$ScopeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `complianceResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:compliance-resource-id` |
| `complianceResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-resource-types` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value` |
"
  [^CfnConfigRule$ScopeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :compliance-resource-id)]
    (. builder complianceResourceId data))
  (when-let [data (lookup-entry config id :compliance-resource-types)]
    (. builder complianceResourceTypes data))
  (when-let [data (lookup-entry config id :tag-key)]
    (. builder tagKey data))
  (when-let [data (lookup-entry config id :tag-value)]
    (. builder tagValue data))
  (.build builder))


(defn build-cfn-config-rule-source-detail-property-builder
  "The build-cfn-config-rule-source-detail-property-builder function updates a CfnConfigRule$SourceDetailProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$SourceDetailProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `messageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-type` |
"
  [^CfnConfigRule$SourceDetailProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-source)]
    (. builder eventSource data))
  (when-let [data (lookup-entry config id :maximum-execution-frequency)]
    (. builder maximumExecutionFrequency data))
  (when-let [data (lookup-entry config id :message-type)]
    (. builder messageType data))
  (.build builder))


(defn build-cfn-config-rule-source-property-builder
  "The build-cfn-config-rule-source-property-builder function updates a CfnConfigRule$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigRule$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPolicyDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-policy-details` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `sourceDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:source-details` |
| `sourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-identifier` |
"
  [^CfnConfigRule$SourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-policy-details)]
    (. builder customPolicyDetails data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :source-details)]
    (. builder sourceDetails data))
  (when-let [data (lookup-entry config id :source-identifier)]
    (. builder sourceIdentifier data))
  (.build builder))


(defn build-cfn-configuration-aggregator-account-aggregation-source-property-builder
  "The build-cfn-configuration-aggregator-account-aggregation-source-property-builder function updates a CfnConfigurationAggregator$AccountAggregationSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAggregator$AccountAggregationSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:account-ids` |
| `allAwsRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:all-aws-regions` |
| `awsRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-regions` |
"
  [^CfnConfigurationAggregator$AccountAggregationSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-ids)]
    (. builder accountIds data))
  (when-let [data (lookup-entry config id :all-aws-regions)]
    (. builder allAwsRegions data))
  (when-let [data (lookup-entry config id :aws-regions)]
    (. builder awsRegions data))
  (.build builder))


(defn build-cfn-configuration-aggregator-builder
  "The build-cfn-configuration-aggregator-builder function updates a CfnConfigurationAggregator$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAggregator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAggregationSources` | java.util.List | [[cdk.support/lookup-entry]] | `:account-aggregation-sources` |
| `configurationAggregatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-aggregator-name` |
| `organizationAggregationSource` | software.amazon.awscdk.services.config.CfnConfigurationAggregator$OrganizationAggregationSourceProperty | [[cdk.support/lookup-entry]] | `:organization-aggregation-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfigurationAggregator$Builder builder id config]
  (when-let [data (lookup-entry config id :account-aggregation-sources)]
    (. builder accountAggregationSources data))
  (when-let [data (lookup-entry config id :configuration-aggregator-name)]
    (. builder configurationAggregatorName data))
  (when-let [data (lookup-entry config id :organization-aggregation-source)]
    (. builder organizationAggregationSource data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-configuration-aggregator-organization-aggregation-source-property-builder
  "The build-cfn-configuration-aggregator-organization-aggregation-source-property-builder function updates a CfnConfigurationAggregator$OrganizationAggregationSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAggregator$OrganizationAggregationSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allAwsRegions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:all-aws-regions` |
| `awsRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-regions` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnConfigurationAggregator$OrganizationAggregationSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all-aws-regions)]
    (. builder allAwsRegions data))
  (when-let [data (lookup-entry config id :aws-regions)]
    (. builder awsRegions data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-configuration-aggregator-props-builder
  "The build-cfn-configuration-aggregator-props-builder function updates a CfnConfigurationAggregatorProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAggregatorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAggregationSources` | java.util.List | [[cdk.support/lookup-entry]] | `:account-aggregation-sources` |
| `configurationAggregatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-aggregator-name` |
| `organizationAggregationSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-aggregation-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfigurationAggregatorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :account-aggregation-sources)]
    (. builder accountAggregationSources data))
  (when-let [data (lookup-entry config id :configuration-aggregator-name)]
    (. builder configurationAggregatorName data))
  (when-let [data (lookup-entry config id :organization-aggregation-source)]
    (. builder organizationAggregationSource data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-configuration-recorder-builder
  "The build-cfn-configuration-recorder-builder function updates a CfnConfigurationRecorder$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorder$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-group` |
| `recordingMode` | software.amazon.awscdk.services.config.CfnConfigurationRecorder$RecordingModeProperty | [[cdk.support/lookup-entry]] | `:recording-mode` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnConfigurationRecorder$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :recording-group)]
    (. builder recordingGroup data))
  (when-let [data (lookup-entry config id :recording-mode)]
    (. builder recordingMode data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-configuration-recorder-exclusion-by-resource-types-property-builder
  "The build-cfn-configuration-recorder-exclusion-by-resource-types-property-builder function updates a CfnConfigurationRecorder$ExclusionByResourceTypesProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorder$ExclusionByResourceTypesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
"
  [^CfnConfigurationRecorder$ExclusionByResourceTypesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-types)]
    (. builder resourceTypes data))
  (.build builder))


(defn build-cfn-configuration-recorder-props-builder
  "The build-cfn-configuration-recorder-props-builder function updates a CfnConfigurationRecorderProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingGroup` | software.amazon.awscdk.services.config.CfnConfigurationRecorder$RecordingGroupProperty | [[cdk.support/lookup-entry]] | `:recording-group` |
| `recordingMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-mode` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnConfigurationRecorderProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :recording-group)]
    (. builder recordingGroup data))
  (when-let [data (lookup-entry config id :recording-mode)]
    (. builder recordingMode data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-configuration-recorder-recording-group-property-builder
  "The build-cfn-configuration-recorder-recording-group-property-builder function updates a CfnConfigurationRecorder$RecordingGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorder$RecordingGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allSupported` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:all-supported` |
| `exclusionByResourceTypes` | software.amazon.awscdk.services.config.CfnConfigurationRecorder$ExclusionByResourceTypesProperty | [[cdk.support/lookup-entry]] | `:exclusion-by-resource-types` |
| `includeGlobalResourceTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-global-resource-types` |
| `recordingStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-strategy` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
"
  [^CfnConfigurationRecorder$RecordingGroupProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-configuration-recorder-recording-mode-override-property-builder
  "The build-cfn-configuration-recorder-recording-mode-override-property-builder function updates a CfnConfigurationRecorder$RecordingModeOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorder$RecordingModeOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `recordingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-frequency` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
"
  [^CfnConfigurationRecorder$RecordingModeOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :recording-frequency)]
    (. builder recordingFrequency data))
  (when-let [data (lookup-entry config id :resource-types)]
    (. builder resourceTypes data))
  (.build builder))


(defn build-cfn-configuration-recorder-recording-mode-property-builder
  "The build-cfn-configuration-recorder-recording-mode-property-builder function updates a CfnConfigurationRecorder$RecordingModeProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorder$RecordingModeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-frequency` |
| `recordingModeOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recording-mode-overrides` |
"
  [^CfnConfigurationRecorder$RecordingModeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :recording-frequency)]
    (. builder recordingFrequency data))
  (when-let [data (lookup-entry config id :recording-mode-overrides)]
    (. builder recordingModeOverrides data))
  (.build builder))


(defn build-cfn-configuration-recorder-recording-strategy-property-builder
  "The build-cfn-configuration-recorder-recording-strategy-property-builder function updates a CfnConfigurationRecorder$RecordingStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationRecorder$RecordingStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `useOnly` | java.lang.String | [[cdk.support/lookup-entry]] | `:use-only` |
"
  [^CfnConfigurationRecorder$RecordingStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :use-only)]
    (. builder useOnly data))
  (.build builder))


(defn build-cfn-conformance-pack-builder
  "The build-cfn-conformance-pack-builder function updates a CfnConformancePack$Builder instance using the provided configuration.
  The function takes the CfnConformancePack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `conformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:conformance-pack-name` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
| `templateSsmDocumentDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template-ssm-document-details` |
"
  [^CfnConformancePack$Builder builder id config]
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
  (.build builder))


(defn build-cfn-conformance-pack-conformance-pack-input-parameter-property-builder
  "The build-cfn-conformance-pack-conformance-pack-input-parameter-property-builder function updates a CfnConformancePack$ConformancePackInputParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnConformancePack$ConformancePackInputParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnConformancePack$ConformancePackInputParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-let [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn build-cfn-conformance-pack-props-builder
  "The build-cfn-conformance-pack-props-builder function updates a CfnConformancePackProps$Builder instance using the provided configuration.
  The function takes the CfnConformancePackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `conformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:conformance-pack-name` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
| `templateSsmDocumentDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template-ssm-document-details` |
"
  [^CfnConformancePackProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-conformance-pack-template-ssm-document-details-property-builder
  "The build-cfn-conformance-pack-template-ssm-document-details-property-builder function updates a CfnConformancePack$TemplateSSMDocumentDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnConformancePack$TemplateSSMDocumentDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-name` |
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |
"
  [^CfnConformancePack$TemplateSSMDocumentDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-name)]
    (. builder documentName data))
  (when-let [data (lookup-entry config id :document-version)]
    (. builder documentVersion data))
  (.build builder))


(defn build-cfn-delivery-channel-builder
  "The build-cfn-delivery-channel-builder function updates a CfnDeliveryChannel$Builder instance using the provided configuration.
  The function takes the CfnDeliveryChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSnapshotDeliveryProperties` | software.amazon.awscdk.services.config.CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty | [[cdk.support/lookup-entry]] | `:config-snapshot-delivery-properties` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `s3KmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-arn` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnDeliveryChannel$Builder builder id config]
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
  (.build builder))


(defn build-cfn-delivery-channel-config-snapshot-delivery-properties-property-builder
  "The build-cfn-delivery-channel-config-snapshot-delivery-properties-property-builder function updates a CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-frequency` |
"
  [^CfnDeliveryChannel$ConfigSnapshotDeliveryPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-frequency)]
    (. builder deliveryFrequency data))
  (.build builder))


(defn build-cfn-delivery-channel-props-builder
  "The build-cfn-delivery-channel-props-builder function updates a CfnDeliveryChannelProps$Builder instance using the provided configuration.
  The function takes the CfnDeliveryChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSnapshotDeliveryProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-snapshot-delivery-properties` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
| `s3KmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-arn` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnDeliveryChannelProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-config-rule-builder
  "The build-cfn-organization-config-rule-builder function updates a CfnOrganizationConfigRule$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConfigRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConfigRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-config-rule-name` |
| `organizationCustomPolicyRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-custom-policy-rule-metadata` |
| `organizationCustomRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-custom-rule-metadata` |
| `organizationManagedRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-managed-rule-metadata` |
"
  [^CfnOrganizationConfigRule$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-config-rule-organization-custom-policy-rule-metadata-property-builder
  "The build-cfn-organization-config-rule-organization-custom-policy-rule-metadata-property-builder function updates a CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tagValueScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value-scope` |
"
  [^CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-config-rule-organization-custom-rule-metadata-property-builder
  "The build-cfn-organization-config-rule-organization-custom-rule-metadata-property-builder function updates a CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tagValueScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value-scope` |
"
  [^CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-config-rule-organization-managed-rule-metadata-property-builder
  "The build-cfn-organization-config-rule-organization-managed-rule-metadata-property-builder function updates a CfnOrganizationConfigRule$OrganizationManagedRuleMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConfigRule$OrganizationManagedRuleMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-execution-frequency` |
| `resourceIdScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id-scope` |
| `resourceTypesScope` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types-scope` |
| `ruleIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-identifier` |
| `tagKeyScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key-scope` |
| `tagValueScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-value-scope` |
"
  [^CfnOrganizationConfigRule$OrganizationManagedRuleMetadataProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-config-rule-props-builder
  "The build-cfn-organization-config-rule-props-builder function updates a CfnOrganizationConfigRuleProps$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConfigRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConfigRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-config-rule-name` |
| `organizationCustomPolicyRuleMetadata` | software.amazon.awscdk.services.config.CfnOrganizationConfigRule$OrganizationCustomPolicyRuleMetadataProperty | [[cdk.support/lookup-entry]] | `:organization-custom-policy-rule-metadata` |
| `organizationCustomRuleMetadata` | software.amazon.awscdk.services.config.CfnOrganizationConfigRule$OrganizationCustomRuleMetadataProperty | [[cdk.support/lookup-entry]] | `:organization-custom-rule-metadata` |
| `organizationManagedRuleMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:organization-managed-rule-metadata` |
"
  [^CfnOrganizationConfigRuleProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-conformance-pack-builder
  "The build-cfn-organization-conformance-pack-builder function updates a CfnOrganizationConformancePack$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConformancePack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-conformance-pack-name` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
"
  [^CfnOrganizationConformancePack$Builder builder id config]
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
  (.build builder))


(defn build-cfn-organization-conformance-pack-conformance-pack-input-parameter-property-builder
  "The build-cfn-organization-conformance-pack-conformance-pack-input-parameter-property-builder function updates a CfnOrganizationConformancePack$ConformancePackInputParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConformancePack$ConformancePackInputParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnOrganizationConformancePack$ConformancePackInputParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-let [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn build-cfn-organization-conformance-pack-props-builder
  "The build-cfn-organization-conformance-pack-props-builder function updates a CfnOrganizationConformancePackProps$Builder instance using the provided configuration.
  The function takes the CfnOrganizationConformancePackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conformancePackInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:conformance-pack-input-parameters` |
| `deliveryS3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-bucket` |
| `deliveryS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-s3-key-prefix` |
| `excludedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-accounts` |
| `organizationConformancePackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-conformance-pack-name` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-s3-uri` |
"
  [^CfnOrganizationConformancePackProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-remediation-configuration-builder
  "The build-cfn-remediation-configuration-builder function updates a CfnRemediationConfiguration$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targetVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-version` |
"
  [^CfnRemediationConfiguration$Builder builder id config]
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
  (.build builder))


(defn build-cfn-remediation-configuration-execution-controls-property-builder
  "The build-cfn-remediation-configuration-execution-controls-property-builder function updates a CfnRemediationConfiguration$ExecutionControlsProperty$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfiguration$ExecutionControlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ssmControls` | software.amazon.awscdk.services.config.CfnRemediationConfiguration$SsmControlsProperty | [[cdk.support/lookup-entry]] | `:ssm-controls` |
"
  [^CfnRemediationConfiguration$ExecutionControlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ssm-controls)]
    (. builder ssmControls data))
  (.build builder))


(defn build-cfn-remediation-configuration-props-builder
  "The build-cfn-remediation-configuration-props-builder function updates a CfnRemediationConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targetVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-version` |
"
  [^CfnRemediationConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-remediation-configuration-remediation-parameter-value-property-builder
  "The build-cfn-remediation-configuration-remediation-parameter-value-property-builder function updates a CfnRemediationConfiguration$RemediationParameterValueProperty$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfiguration$RemediationParameterValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-value` |
| `staticValue` | software.amazon.awscdk.services.config.CfnRemediationConfiguration$StaticValueProperty | [[cdk.support/lookup-entry]] | `:static-value` |
"
  [^CfnRemediationConfiguration$RemediationParameterValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-value)]
    (. builder resourceValue data))
  (when-let [data (lookup-entry config id :static-value)]
    (. builder staticValue data))
  (.build builder))


(defn build-cfn-remediation-configuration-resource-value-property-builder
  "The build-cfn-remediation-configuration-resource-value-property-builder function updates a CfnRemediationConfiguration$ResourceValueProperty$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfiguration$ResourceValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRemediationConfiguration$ResourceValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-remediation-configuration-ssm-controls-property-builder
  "The build-cfn-remediation-configuration-ssm-controls-property-builder function updates a CfnRemediationConfiguration$SsmControlsProperty$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfiguration$SsmControlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `concurrentExecutionRatePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-execution-rate-percentage` |
| `errorPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-percentage` |
"
  [^CfnRemediationConfiguration$SsmControlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :concurrent-execution-rate-percentage)]
    (. builder concurrentExecutionRatePercentage data))
  (when-let [data (lookup-entry config id :error-percentage)]
    (. builder errorPercentage data))
  (.build builder))


(defn build-cfn-remediation-configuration-static-value-property-builder
  "The build-cfn-remediation-configuration-static-value-property-builder function updates a CfnRemediationConfiguration$StaticValueProperty$Builder instance using the provided configuration.
  The function takes the CfnRemediationConfiguration$StaticValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnRemediationConfiguration$StaticValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-stored-query-builder
  "The build-cfn-stored-query-builder function updates a CfnStoredQuery$Builder instance using the provided configuration.
  The function takes the CfnStoredQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-description` |
| `queryExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-expression` |
| `queryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStoredQuery$Builder builder id config]
  (when-let [data (lookup-entry config id :query-description)]
    (. builder queryDescription data))
  (when-let [data (lookup-entry config id :query-expression)]
    (. builder queryExpression data))
  (when-let [data (lookup-entry config id :query-name)]
    (. builder queryName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-stored-query-props-builder
  "The build-cfn-stored-query-props-builder function updates a CfnStoredQueryProps$Builder instance using the provided configuration.
  The function takes the CfnStoredQueryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-description` |
| `queryExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-expression` |
| `queryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStoredQueryProps$Builder builder id config]
  (when-let [data (lookup-entry config id :query-description)]
    (. builder queryDescription data))
  (when-let [data (lookup-entry config id :query-expression)]
    (. builder queryExpression data))
  (when-let [data (lookup-entry config id :query-name)]
    (. builder queryName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cloud-formation-stack-drift-detection-check-builder
  "The build-cloud-formation-stack-drift-detection-check-builder function updates a CloudFormationStackDriftDetectionCheck$Builder instance using the provided configuration.
  The function takes the CloudFormationStackDriftDetectionCheck$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ownStackOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:own-stack-only` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^CloudFormationStackDriftDetectionCheck$Builder builder id config]
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
  (.build builder))


(defn build-cloud-formation-stack-drift-detection-check-props-builder
  "The build-cloud-formation-stack-drift-detection-check-props-builder function updates a CloudFormationStackDriftDetectionCheckProps$Builder instance using the provided configuration.
  The function takes the CloudFormationStackDriftDetectionCheckProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ownStackOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:own-stack-only` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^CloudFormationStackDriftDetectionCheckProps$Builder builder id config]
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
  (.build builder))


(defn build-cloud-formation-stack-notification-check-builder
  "The build-cloud-formation-stack-notification-check-builder function updates a CloudFormationStackNotificationCheck$Builder instance using the provided configuration.
  The function takes the CloudFormationStackNotificationCheck$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^CloudFormationStackNotificationCheck$Builder builder id config]
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
  (.build builder))


(defn build-cloud-formation-stack-notification-check-props-builder
  "The build-cloud-formation-stack-notification-check-props-builder function updates a CloudFormationStackNotificationCheckProps$Builder instance using the provided configuration.
  The function takes the CloudFormationStackNotificationCheckProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^CloudFormationStackNotificationCheckProps$Builder builder id config]
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
  (.build builder))


(defn build-custom-policy-builder
  "The build-custom-policy-builder function updates a CustomPolicy$Builder instance using the provided configuration.
  The function takes the CustomPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableDebugLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-debug-log` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^CustomPolicy$Builder builder id config]
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
  (.build builder))


(defn build-custom-policy-props-builder
  "The build-custom-policy-props-builder function updates a CustomPolicyProps$Builder instance using the provided configuration.
  The function takes the CustomPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableDebugLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-debug-log` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `policyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-text` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^CustomPolicyProps$Builder builder id config]
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
  (.build builder))


(defn build-custom-rule-builder
  "The build-custom-rule-builder function updates a CustomRule$Builder instance using the provided configuration.
  The function takes the CustomRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `configurationChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configuration-changes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `periodic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:periodic` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^CustomRule$Builder builder id config]
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
  (.build builder))


(defn build-custom-rule-props-builder
  "The build-custom-rule-props-builder function updates a CustomRuleProps$Builder instance using the provided configuration.
  The function takes the CustomRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `configurationChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configuration-changes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `periodic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:periodic` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^CustomRuleProps$Builder builder id config]
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
  (.build builder))


(defn build-managed-rule-builder
  "The build-managed-rule-builder function updates a ManagedRule$Builder instance using the provided configuration.
  The function takes the ManagedRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^ManagedRule$Builder builder id config]
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
  (.build builder))


(defn build-managed-rule-props-builder
  "The build-managed-rule-props-builder function updates a ManagedRuleProps$Builder instance using the provided configuration.
  The function takes the ManagedRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^ManagedRuleProps$Builder builder id config]
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
  (.build builder))


(defn build-rule-props-builder
  "The build-rule-props-builder function updates a RuleProps$Builder instance using the provided configuration.
  The function takes the RuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-rule-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:input-parameters` |
| `maximumExecutionFrequency` | software.amazon.awscdk.services.config.MaximumExecutionFrequency | [[cdk.api.services.config/maximum-execution-frequency]] | `:maximum-execution-frequency` |
| `ruleScope` | software.amazon.awscdk.services.config.RuleScope | [[cdk.support/lookup-entry]] | `:rule-scope` |
"
  [^RuleProps$Builder builder id config]
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
  (.build builder))