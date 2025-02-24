(ns cdk.api.services.xray
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.xray package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.xray CfnGroup$Builder
                                                 CfnGroup$InsightsConfigurationProperty$Builder
                                                 CfnGroupProps$Builder
                                                 CfnResourcePolicy$Builder
                                                 CfnResourcePolicyProps$Builder
                                                 CfnSamplingRule$Builder
                                                 CfnSamplingRule$SamplingRuleProperty$Builder
                                                 CfnSamplingRule$SamplingRuleRecordProperty$Builder
                                                 CfnSamplingRule$SamplingRuleUpdateProperty$Builder
                                                 CfnSamplingRuleProps$Builder]))


(defn build-cfn-group-builder
  "The build-cfn-group-builder function updates a CfnGroup$Builder instance using the provided configuration.
  The function takes the CfnGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-expression` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `insightsConfiguration` | software.amazon.awscdk.services.xray.CfnGroup$InsightsConfigurationProperty | [[cdk.support/lookup-entry]] | `:insights-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :filter-expression)]
    (. builder filterExpression data))
  (when-let [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-let [data (lookup-entry config id :insights-configuration)]
    (. builder insightsConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-group-builder (CfnGroup$Builder/create scope (name id)) id config))


(defn build-cfn-group-insights-configuration-property-builder
  "The build-cfn-group-insights-configuration-property-builder function updates a CfnGroup$InsightsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$InsightsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insightsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insights-enabled` |
| `notificationsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notifications-enabled` |
"
  [^CfnGroup$InsightsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :insights-enabled)]
    (. builder insightsEnabled data))
  (when-let [data (lookup-entry config id :notifications-enabled)]
    (. builder notificationsEnabled data))
  (.build builder))


(defn cfn-group-insights-configuration-property-builder
  ""
  [id config]
  (build-cfn-group-insights-configuration-property-builder (new CfnGroup$InsightsConfigurationProperty$Builder) id config))


(defn build-cfn-group-props-builder
  "The build-cfn-group-props-builder function updates a CfnGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-expression` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `insightsConfiguration` | software.amazon.awscdk.services.xray.CfnGroup$InsightsConfigurationProperty | [[cdk.support/lookup-entry]] | `:insights-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :filter-expression)]
    (. builder filterExpression data))
  (when-let [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-let [data (lookup-entry config id :insights-configuration)]
    (. builder insightsConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-props-builder
  ""
  [id config]
  (build-cfn-group-props-builder (new CfnGroupProps$Builder) id config))


(defn build-cfn-resource-policy-builder
  "The build-cfn-resource-policy-builder function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bypassPolicyLockoutCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-check` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :bypass-policy-lockout-check)]
    (. builder bypassPolicyLockoutCheck data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-resource-policy-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-policy-builder (CfnResourcePolicy$Builder/create scope (name id)) id config))


(defn build-cfn-resource-policy-props-builder
  "The build-cfn-resource-policy-props-builder function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bypassPolicyLockoutCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-check` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bypass-policy-lockout-check)]
    (. builder bypassPolicyLockoutCheck data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  ""
  [id config]
  (build-cfn-resource-policy-props-builder (new CfnResourcePolicyProps$Builder) id config))


(defn build-cfn-sampling-rule-builder
  "The build-cfn-sampling-rule-builder function updates a CfnSamplingRule$Builder instance using the provided configuration.
  The function takes the CfnSamplingRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `samplingRule` | software.amazon.awscdk.services.xray.CfnSamplingRule$SamplingRuleProperty | [[cdk.support/lookup-entry]] | `:sampling-rule` |
| `samplingRuleRecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule-record` |
| `samplingRuleUpdate` | software.amazon.awscdk.services.xray.CfnSamplingRule$SamplingRuleUpdateProperty | [[cdk.support/lookup-entry]] | `:sampling-rule-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSamplingRule$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :sampling-rule)]
    (. builder samplingRule data))
  (when-let [data (lookup-entry config id :sampling-rule-record)]
    (. builder samplingRuleRecord data))
  (when-let [data (lookup-entry config id :sampling-rule-update)]
    (. builder samplingRuleUpdate data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-sampling-rule-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-sampling-rule-builder (CfnSamplingRule$Builder/create scope (name id)) id config))


(defn build-cfn-sampling-rule-props-builder
  "The build-cfn-sampling-rule-props-builder function updates a CfnSamplingRuleProps$Builder instance using the provided configuration.
  The function takes the CfnSamplingRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `samplingRule` | software.amazon.awscdk.services.xray.CfnSamplingRule$SamplingRuleProperty | [[cdk.support/lookup-entry]] | `:sampling-rule` |
| `samplingRuleRecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule-record` |
| `samplingRuleUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSamplingRuleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :sampling-rule)]
    (. builder samplingRule data))
  (when-let [data (lookup-entry config id :sampling-rule-record)]
    (. builder samplingRuleRecord data))
  (when-let [data (lookup-entry config id :sampling-rule-update)]
    (. builder samplingRuleUpdate data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-sampling-rule-props-builder
  ""
  [id config]
  (build-cfn-sampling-rule-props-builder (new CfnSamplingRuleProps$Builder) id config))


(defn build-cfn-sampling-rule-sampling-rule-property-builder
  "The build-cfn-sampling-rule-sampling-rule-property-builder function updates a CfnSamplingRule$SamplingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnSamplingRule$SamplingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `fixedRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:fixed-rate` |
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `reservoirSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reservoir-size` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `ruleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-arn` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `serviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-type` |
| `urlPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:url-path` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnSamplingRule$SamplingRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :fixed-rate)]
    (. builder fixedRate data))
  (when-let [data (lookup-entry config id :host)]
    (. builder host data))
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :reservoir-size)]
    (. builder reservoirSize data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :rule-arn)]
    (. builder ruleArn data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-let [data (lookup-entry config id :service-type)]
    (. builder serviceType data))
  (when-let [data (lookup-entry config id :url-path)]
    (. builder urlPath data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-sampling-rule-sampling-rule-property-builder
  ""
  [id config]
  (build-cfn-sampling-rule-sampling-rule-property-builder (new CfnSamplingRule$SamplingRuleProperty$Builder) id config))


(defn build-cfn-sampling-rule-sampling-rule-record-property-builder
  "The build-cfn-sampling-rule-sampling-rule-record-property-builder function updates a CfnSamplingRule$SamplingRuleRecordProperty$Builder instance using the provided configuration.
  The function takes the CfnSamplingRule$SamplingRuleRecordProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-at` |
| `modifiedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:modified-at` |
| `samplingRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule` |
"
  [^CfnSamplingRule$SamplingRuleRecordProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :created-at)]
    (. builder createdAt data))
  (when-let [data (lookup-entry config id :modified-at)]
    (. builder modifiedAt data))
  (when-let [data (lookup-entry config id :sampling-rule)]
    (. builder samplingRule data))
  (.build builder))


(defn cfn-sampling-rule-sampling-rule-record-property-builder
  ""
  [id config]
  (build-cfn-sampling-rule-sampling-rule-record-property-builder (new CfnSamplingRule$SamplingRuleRecordProperty$Builder) id config))


(defn build-cfn-sampling-rule-sampling-rule-update-property-builder
  "The build-cfn-sampling-rule-sampling-rule-update-property-builder function updates a CfnSamplingRule$SamplingRuleUpdateProperty$Builder instance using the provided configuration.
  The function takes the CfnSamplingRule$SamplingRuleUpdateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `fixedRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:fixed-rate` |
| `host` | java.lang.String | [[cdk.support/lookup-entry]] | `:host` |
| `httpMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-method` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `reservoirSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reservoir-size` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `ruleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-arn` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `serviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-type` |
| `urlPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:url-path` |
"
  [^CfnSamplingRule$SamplingRuleUpdateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :fixed-rate)]
    (. builder fixedRate data))
  (when-let [data (lookup-entry config id :host)]
    (. builder host data))
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :reservoir-size)]
    (. builder reservoirSize data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :rule-arn)]
    (. builder ruleArn data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-let [data (lookup-entry config id :service-type)]
    (. builder serviceType data))
  (when-let [data (lookup-entry config id :url-path)]
    (. builder urlPath data))
  (.build builder))


(defn cfn-sampling-rule-sampling-rule-update-property-builder
  ""
  [id config]
  (build-cfn-sampling-rule-sampling-rule-update-property-builder (new CfnSamplingRule$SamplingRuleUpdateProperty$Builder) id config))