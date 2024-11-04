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


(defn cfn-group-builder
  "The cfn-group-builder function buildes out new instances of 
CfnGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-expression` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `insightsConfiguration` | software.amazon.awscdk.services.xray.CfnGroup$InsightsConfigurationProperty | [[cdk.support/lookup-entry]] | `:insights-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :filter-expression)]
      (. builder filterExpression data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :insights-configuration)]
      (. builder insightsConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-group-insights-configuration-property-builder
  "The cfn-group-insights-configuration-property-builder function buildes out new instances of 
CfnGroup$InsightsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insightsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insights-enabled` |
| `notificationsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notifications-enabled` |"
  [stack id config]
  (let [builder (CfnGroup$InsightsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :insights-enabled)]
      (. builder insightsEnabled data))
    (when-let [data (lookup-entry config id :notifications-enabled)]
      (. builder notificationsEnabled data))
    (.build builder)))


(defn cfn-group-props-builder
  "The cfn-group-props-builder function buildes out new instances of 
CfnGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-expression` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `insightsConfiguration` | software.amazon.awscdk.services.xray.CfnGroup$InsightsConfigurationProperty | [[cdk.support/lookup-entry]] | `:insights-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :filter-expression)]
      (. builder filterExpression data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :insights-configuration)]
      (. builder insightsConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bypassPolicyLockoutCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-check` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bypass-policy-lockout-check)]
      (. builder bypassPolicyLockoutCheck data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bypassPolicyLockoutCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bypass-policy-lockout-check` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :bypass-policy-lockout-check)]
      (. builder bypassPolicyLockoutCheck data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-sampling-rule-builder
  "The cfn-sampling-rule-builder function buildes out new instances of 
CfnSamplingRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `samplingRule` | software.amazon.awscdk.services.xray.CfnSamplingRule$SamplingRuleProperty | [[cdk.support/lookup-entry]] | `:sampling-rule` |
| `samplingRuleRecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule-record` |
| `samplingRuleUpdate` | software.amazon.awscdk.services.xray.CfnSamplingRule$SamplingRuleUpdateProperty | [[cdk.support/lookup-entry]] | `:sampling-rule-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSamplingRule$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-sampling-rule-props-builder
  "The cfn-sampling-rule-props-builder function buildes out new instances of 
CfnSamplingRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `samplingRule` | software.amazon.awscdk.services.xray.CfnSamplingRule$SamplingRuleProperty | [[cdk.support/lookup-entry]] | `:sampling-rule` |
| `samplingRuleRecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule-record` |
| `samplingRuleUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSamplingRuleProps$Builder.)]
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
    (.build builder)))


(defn cfn-sampling-rule-sampling-rule-property-builder
  "The cfn-sampling-rule-sampling-rule-property-builder function buildes out new instances of 
CfnSamplingRule$SamplingRuleProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnSamplingRule$SamplingRuleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-sampling-rule-sampling-rule-record-property-builder
  "The cfn-sampling-rule-sampling-rule-record-property-builder function buildes out new instances of 
CfnSamplingRule$SamplingRuleRecordProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-at` |
| `modifiedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:modified-at` |
| `samplingRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sampling-rule` |"
  [stack id config]
  (let [builder (CfnSamplingRule$SamplingRuleRecordProperty$Builder.)]
    (when-let [data (lookup-entry config id :created-at)]
      (. builder createdAt data))
    (when-let [data (lookup-entry config id :modified-at)]
      (. builder modifiedAt data))
    (when-let [data (lookup-entry config id :sampling-rule)]
      (. builder samplingRule data))
    (.build builder)))


(defn cfn-sampling-rule-sampling-rule-update-property-builder
  "The cfn-sampling-rule-sampling-rule-update-property-builder function buildes out new instances of 
CfnSamplingRule$SamplingRuleUpdateProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `urlPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:url-path` |"
  [stack id config]
  (let [builder (CfnSamplingRule$SamplingRuleUpdateProperty$Builder.)]
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
    (.build builder)))