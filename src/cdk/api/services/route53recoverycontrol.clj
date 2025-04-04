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


(defn cfn-cluster-builder>
  "The cfn-cluster-builder> function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-builder
  "Creates a  `CfnCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-builder> (CfnCluster$Builder/create scope (name id)) id config))


(defn cfn-cluster-cluster-endpoint-property-builder>
  "The cfn-cluster-cluster-endpoint-property-builder> function updates a CfnCluster$ClusterEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ClusterEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnCluster$ClusterEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-cluster-cluster-endpoint-property-builder
  "Creates a  `CfnCluster$ClusterEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-cluster-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-cluster-endpoint-property-builder> (new CfnCluster$ClusterEndpointProperty$Builder) id config))


(defn cfn-cluster-props-builder>
  "The cfn-cluster-props-builder> function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-props-builder
  "Creates a  `CfnClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-props-builder> (new CfnClusterProps$Builder) id config))


(defn cfn-control-panel-builder>
  "The cfn-control-panel-builder> function updates a CfnControlPanel$Builder instance using the provided configuration.
  The function takes the CfnControlPanel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnControlPanel$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-control-panel-builder
  "Creates a  `CfnControlPanel$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-control-panel-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-control-panel-builder> (CfnControlPanel$Builder/create scope (name id)) id config))


(defn cfn-control-panel-props-builder>
  "The cfn-control-panel-props-builder> function updates a CfnControlPanelProps$Builder instance using the provided configuration.
  The function takes the CfnControlPanelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnControlPanelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-control-panel-props-builder
  "Creates a  `CfnControlPanelProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-control-panel-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-control-panel-props-builder> (new CfnControlPanelProps$Builder) id config))


(defn cfn-routing-control-builder>
  "The cfn-routing-control-builder> function updates a CfnRoutingControl$Builder instance using the provided configuration.
  The function takes the CfnRoutingControl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRoutingControl$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :control-panel-arn)]
    (. builder controlPanelArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-routing-control-builder
  "Creates a  `CfnRoutingControl$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-routing-control-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-routing-control-builder> (CfnRoutingControl$Builder/create scope (name id)) id config))


(defn cfn-routing-control-props-builder>
  "The cfn-routing-control-props-builder> function updates a CfnRoutingControlProps$Builder instance using the provided configuration.
  The function takes the CfnRoutingControlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRoutingControlProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :control-panel-arn)]
    (. builder controlPanelArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-routing-control-props-builder
  "Creates a  `CfnRoutingControlProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-routing-control-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-routing-control-props-builder> (new CfnRoutingControlProps$Builder) id config))


(defn cfn-safety-rule-assertion-rule-property-builder>
  "The cfn-safety-rule-assertion-rule-property-builder> function updates a CfnSafetyRule$AssertionRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnSafetyRule$AssertionRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertedControls` | java.util.List | [[cdk.support/lookup-entry]] | `:asserted-controls` |
| `waitPeriodMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-period-ms` |
"
  [^CfnSafetyRule$AssertionRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :asserted-controls)]
    (. builder assertedControls data))
  (when-some [data (lookup-entry config id :wait-period-ms)]
    (. builder waitPeriodMs data))
  (.build builder))


(defn cfn-safety-rule-assertion-rule-property-builder
  "Creates a  `CfnSafetyRule$AssertionRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-safety-rule-assertion-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-safety-rule-assertion-rule-property-builder> (new CfnSafetyRule$AssertionRuleProperty$Builder) id config))


(defn cfn-safety-rule-builder>
  "The cfn-safety-rule-builder> function updates a CfnSafetyRule$Builder instance using the provided configuration.
  The function takes the CfnSafetyRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertionRule` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$AssertionRuleProperty | [[cdk.support/lookup-entry]] | `:assertion-rule` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `gatingRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gating-rule` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleConfig` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$RuleConfigProperty | [[cdk.support/lookup-entry]] | `:rule-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSafetyRule$Builder builder id config]
  (when-some [data (lookup-entry config id :assertion-rule)]
    (. builder assertionRule data))
  (when-some [data (lookup-entry config id :control-panel-arn)]
    (. builder controlPanelArn data))
  (when-some [data (lookup-entry config id :gating-rule)]
    (. builder gatingRule data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rule-config)]
    (. builder ruleConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-safety-rule-builder
  "Creates a  `CfnSafetyRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-safety-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-safety-rule-builder> (CfnSafetyRule$Builder/create scope (name id)) id config))


(defn cfn-safety-rule-gating-rule-property-builder>
  "The cfn-safety-rule-gating-rule-property-builder> function updates a CfnSafetyRule$GatingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnSafetyRule$GatingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatingControls` | java.util.List | [[cdk.support/lookup-entry]] | `:gating-controls` |
| `targetControls` | java.util.List | [[cdk.support/lookup-entry]] | `:target-controls` |
| `waitPeriodMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-period-ms` |
"
  [^CfnSafetyRule$GatingRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :gating-controls)]
    (. builder gatingControls data))
  (when-some [data (lookup-entry config id :target-controls)]
    (. builder targetControls data))
  (when-some [data (lookup-entry config id :wait-period-ms)]
    (. builder waitPeriodMs data))
  (.build builder))


(defn cfn-safety-rule-gating-rule-property-builder
  "Creates a  `CfnSafetyRule$GatingRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-safety-rule-gating-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-safety-rule-gating-rule-property-builder> (new CfnSafetyRule$GatingRuleProperty$Builder) id config))


(defn cfn-safety-rule-props-builder>
  "The cfn-safety-rule-props-builder> function updates a CfnSafetyRuleProps$Builder instance using the provided configuration.
  The function takes the CfnSafetyRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertionRule` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$AssertionRuleProperty | [[cdk.support/lookup-entry]] | `:assertion-rule` |
| `controlPanelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-panel-arn` |
| `gatingRule` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$GatingRuleProperty | [[cdk.support/lookup-entry]] | `:gating-rule` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleConfig` | software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule$RuleConfigProperty | [[cdk.support/lookup-entry]] | `:rule-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSafetyRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assertion-rule)]
    (. builder assertionRule data))
  (when-some [data (lookup-entry config id :control-panel-arn)]
    (. builder controlPanelArn data))
  (when-some [data (lookup-entry config id :gating-rule)]
    (. builder gatingRule data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rule-config)]
    (. builder ruleConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-safety-rule-props-builder
  "Creates a  `CfnSafetyRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-safety-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-safety-rule-props-builder> (new CfnSafetyRuleProps$Builder) id config))


(defn cfn-safety-rule-rule-config-property-builder>
  "The cfn-safety-rule-rule-config-property-builder> function updates a CfnSafetyRule$RuleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSafetyRule$RuleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inverted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inverted` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSafetyRule$RuleConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :inverted)]
    (. builder inverted data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-safety-rule-rule-config-property-builder
  "Creates a  `CfnSafetyRule$RuleConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-safety-rule-rule-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-safety-rule-rule-config-property-builder> (new CfnSafetyRule$RuleConfigProperty$Builder) id config))