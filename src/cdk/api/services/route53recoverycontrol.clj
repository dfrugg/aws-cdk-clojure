(ns cdk.api.services.route53recoverycontrol
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53recoverycontrol package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53recoverycontrol CfnCluster$Builder
                                                                   CfnCluster$ClusterEndpointProperty$Builder
                                                                   CfnClusterProps$Builder
                                                                   CfnControlPanel$Builder
                                                                   CfnControlPanelProps$Builder
                                                                   CfnRoutingControl$Builder
                                                                   CfnRoutingControlProps$Builder
                                                                   CfnSafetyRule$AssertionRuleProperty$Builder
                                                                   CfnSafetyRule$Builder
                                                                   CfnSafetyRule$GatingRuleProperty$Builder
                                                                   CfnSafetyRule$RuleConfigProperty$Builder
                                                                   CfnSafetyRuleProps$Builder]))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-cluster-endpoint-property-builder
  "The cfn-cluster-cluster-endpoint-property-builder function buildes out new instances of 
CfnCluster$ClusterEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnCluster$ClusterEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-control-panel-builder
  "The cfn-control-panel-builder function buildes out new instances of 
CfnControlPanel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnControlPanel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-control-panel-props-builder
  "The cfn-control-panel-props-builder function buildes out new instances of 
CfnControlPanelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnControlPanelProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-routing-control-builder
  "The cfn-routing-control-builder function buildes out new instances of 
CfnRoutingControl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRoutingControl$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :control-panel-arn)]
      (. builder controlPanelArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-routing-control-props-builder
  "The cfn-routing-control-props-builder function buildes out new instances of 
CfnRoutingControlProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRoutingControlProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :control-panel-arn)]
      (. builder controlPanelArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-safety-rule-assertion-rule-property-builder
  "The cfn-safety-rule-assertion-rule-property-builder function buildes out new instances of 
CfnSafetyRule$AssertionRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertedControls` | java.util.List | [[cdk.support/lookup-entry]] | `:asserted-controls` |
| `waitPeriodMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-period-ms` |"
  [stack id config]
  (let [builder (CfnSafetyRule$AssertionRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :asserted-controls)]
      (. builder assertedControls data))
    (when-let [data (lookup-entry config id :wait-period-ms)]
      (. builder waitPeriodMs data))
    (.build builder)))


(defn cfn-safety-rule-builder
  "The cfn-safety-rule-builder function buildes out new instances of 
CfnSafetyRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertionRule` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$AssertionRuleProperty | [[cdk.support/lookup-entry]] | `:assertion-rule` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `gatingRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gating-rule` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleConfig` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$RuleConfigProperty | [[cdk.support/lookup-entry]] | `:rule-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSafetyRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assertion-rule)]
      (. builder assertionRule data))
    (when-let [data (lookup-entry config id :control-panel-arn)]
      (. builder controlPanelArn data))
    (when-let [data (lookup-entry config id :gating-rule)]
      (. builder gatingRule data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rule-config)]
      (. builder ruleConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-safety-rule-gating-rule-property-builder
  "The cfn-safety-rule-gating-rule-property-builder function buildes out new instances of 
CfnSafetyRule$GatingRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatingControls` | java.util.List | [[cdk.support/lookup-entry]] | `:gating-controls` |
| `targetControls` | java.util.List | [[cdk.support/lookup-entry]] | `:target-controls` |
| `waitPeriodMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-period-ms` |"
  [stack id config]
  (let [builder (CfnSafetyRule$GatingRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :gating-controls)]
      (. builder gatingControls data))
    (when-let [data (lookup-entry config id :target-controls)]
      (. builder targetControls data))
    (when-let [data (lookup-entry config id :wait-period-ms)]
      (. builder waitPeriodMs data))
    (.build builder)))


(defn cfn-safety-rule-props-builder
  "The cfn-safety-rule-props-builder function buildes out new instances of 
CfnSafetyRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertionRule` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$AssertionRuleProperty | [[cdk.support/lookup-entry]] | `:assertion-rule` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `gatingRule` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$GatingRuleProperty | [[cdk.support/lookup-entry]] | `:gating-rule` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleConfig` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$RuleConfigProperty | [[cdk.support/lookup-entry]] | `:rule-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSafetyRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :assertion-rule)]
      (. builder assertionRule data))
    (when-let [data (lookup-entry config id :control-panel-arn)]
      (. builder controlPanelArn data))
    (when-let [data (lookup-entry config id :gating-rule)]
      (. builder gatingRule data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rule-config)]
      (. builder ruleConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-safety-rule-rule-config-property-builder
  "The cfn-safety-rule-rule-config-property-builder function buildes out new instances of 
CfnSafetyRule$RuleConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inverted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inverted` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSafetyRule$RuleConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :inverted)]
      (. builder inverted data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))