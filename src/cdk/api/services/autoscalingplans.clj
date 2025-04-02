(ns cdk.api.services.autoscalingplans
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.autoscalingplans package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.autoscalingplans CfnScalingPlan$ApplicationSourceProperty$Builder
                                                             CfnScalingPlan$Builder
                                                             CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder
                                                             CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder
                                                             CfnScalingPlan$MetricDimensionProperty$Builder
                                                             CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder
                                                             CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder
                                                             CfnScalingPlan$ScalingInstructionProperty$Builder
                                                             CfnScalingPlan$TagFilterProperty$Builder
                                                             CfnScalingPlan$TargetTrackingConfigurationProperty$Builder
                                                             CfnScalingPlanProps$Builder]))


(defn cfn-scaling-plan-application-source-property-builder>
  "The cfn-scaling-plan-application-source-property-builder> function updates a CfnScalingPlan$ApplicationSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$ApplicationSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationStackArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-stack-arn` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |
"
  [^CfnScalingPlan$ApplicationSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-formation-stack-arn)]
    (. builder cloudFormationStackArn data))
  (when-some [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn cfn-scaling-plan-application-source-property-builder
  "Creates a  `CfnScalingPlan$ApplicationSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-application-source-property-builder> (new CfnScalingPlan$ApplicationSourceProperty$Builder) id config))


(defn cfn-scaling-plan-builder>
  "The cfn-scaling-plan-builder> function updates a CfnScalingPlan$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-source` |
| `scalingInstructions` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-instructions` |
"
  [^CfnScalingPlan$Builder builder id config]
  (when-some [data (lookup-entry config id :application-source)]
    (. builder applicationSource data))
  (when-some [data (lookup-entry config id :scaling-instructions)]
    (. builder scalingInstructions data))
  (.build builder))


(defn cfn-scaling-plan-builder
  "Creates a  `CfnScalingPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-scaling-plan-builder> (CfnScalingPlan$Builder/create scope (name id)) id config))


(defn cfn-scaling-plan-customized-load-metric-specification-property-builder>
  "The cfn-scaling-plan-customized-load-metric-specification-property-builder> function updates a CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-scaling-plan-customized-load-metric-specification-property-builder
  "Creates a  `CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-customized-load-metric-specification-property-builder> (new CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder) id config))


(defn cfn-scaling-plan-customized-scaling-metric-specification-property-builder>
  "The cfn-scaling-plan-customized-scaling-metric-specification-property-builder> function updates a CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-scaling-plan-customized-scaling-metric-specification-property-builder
  "Creates a  `CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-customized-scaling-metric-specification-property-builder> (new CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder) id config))


(defn cfn-scaling-plan-metric-dimension-property-builder>
  "The cfn-scaling-plan-metric-dimension-property-builder> function updates a CfnScalingPlan$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnScalingPlan$MetricDimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-scaling-plan-metric-dimension-property-builder
  "Creates a  `CfnScalingPlan$MetricDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-metric-dimension-property-builder> (new CfnScalingPlan$MetricDimensionProperty$Builder) id config))


(defn cfn-scaling-plan-predefined-load-metric-specification-property-builder>
  "The cfn-scaling-plan-predefined-load-metric-specification-property-builder> function updates a CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedLoadMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-load-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
"
  [^CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :predefined-load-metric-type)]
    (. builder predefinedLoadMetricType data))
  (when-some [data (lookup-entry config id :resource-label)]
    (. builder resourceLabel data))
  (.build builder))


(defn cfn-scaling-plan-predefined-load-metric-specification-property-builder
  "Creates a  `CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-predefined-load-metric-specification-property-builder> (new CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder) id config))


(defn cfn-scaling-plan-predefined-scaling-metric-specification-property-builder>
  "The cfn-scaling-plan-predefined-scaling-metric-specification-property-builder> function updates a CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedScalingMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-scaling-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |
"
  [^CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :predefined-scaling-metric-type)]
    (. builder predefinedScalingMetricType data))
  (when-some [data (lookup-entry config id :resource-label)]
    (. builder resourceLabel data))
  (.build builder))


(defn cfn-scaling-plan-predefined-scaling-metric-specification-property-builder
  "Creates a  `CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-predefined-scaling-metric-specification-property-builder> (new CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder) id config))


(defn cfn-scaling-plan-props-builder>
  "The cfn-scaling-plan-props-builder> function updates a CfnScalingPlanProps$Builder instance using the provided configuration.
  The function takes the CfnScalingPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-source` |
| `scalingInstructions` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-instructions` |
"
  [^CfnScalingPlanProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-source)]
    (. builder applicationSource data))
  (when-some [data (lookup-entry config id :scaling-instructions)]
    (. builder scalingInstructions data))
  (.build builder))


(defn cfn-scaling-plan-props-builder
  "Creates a  `CfnScalingPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-props-builder> (new CfnScalingPlanProps$Builder) id config))


(defn cfn-scaling-plan-scaling-instruction-property-builder>
  "The cfn-scaling-plan-scaling-instruction-property-builder> function updates a CfnScalingPlan$ScalingInstructionProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$ScalingInstructionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customizedLoadMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-load-metric-specification` |
| `disableDynamicScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-dynamic-scaling` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `predefinedLoadMetricSpecification` | software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan$PredefinedLoadMetricSpecificationProperty | [[cdk.support/lookup-entry]] | `:predefined-load-metric-specification` |
| `predictiveScalingMaxCapacityBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:predictive-scaling-max-capacity-behavior` |
| `predictiveScalingMaxCapacityBuffer` | java.lang.Number | [[cdk.support/lookup-entry]] | `:predictive-scaling-max-capacity-buffer` |
| `predictiveScalingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:predictive-scaling-mode` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `scalableDimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:scalable-dimension` |
| `scalingPolicyUpdateBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-policy-update-behavior` |
| `scheduledActionBufferTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduled-action-buffer-time` |
| `serviceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-namespace` |
| `targetTrackingConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tracking-configurations` |
"
  [^CfnScalingPlan$ScalingInstructionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customized-load-metric-specification)]
    (. builder customizedLoadMetricSpecification data))
  (when-some [data (lookup-entry config id :disable-dynamic-scaling)]
    (. builder disableDynamicScaling data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-some [data (lookup-entry config id :predefined-load-metric-specification)]
    (. builder predefinedLoadMetricSpecification data))
  (when-some [data (lookup-entry config id :predictive-scaling-max-capacity-behavior)]
    (. builder predictiveScalingMaxCapacityBehavior data))
  (when-some [data (lookup-entry config id :predictive-scaling-max-capacity-buffer)]
    (. builder predictiveScalingMaxCapacityBuffer data))
  (when-some [data (lookup-entry config id :predictive-scaling-mode)]
    (. builder predictiveScalingMode data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :scalable-dimension)]
    (. builder scalableDimension data))
  (when-some [data (lookup-entry config id :scaling-policy-update-behavior)]
    (. builder scalingPolicyUpdateBehavior data))
  (when-some [data (lookup-entry config id :scheduled-action-buffer-time)]
    (. builder scheduledActionBufferTime data))
  (when-some [data (lookup-entry config id :service-namespace)]
    (. builder serviceNamespace data))
  (when-some [data (lookup-entry config id :target-tracking-configurations)]
    (. builder targetTrackingConfigurations data))
  (.build builder))


(defn cfn-scaling-plan-scaling-instruction-property-builder
  "Creates a  `CfnScalingPlan$ScalingInstructionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-scaling-instruction-property-builder> (new CfnScalingPlan$ScalingInstructionProperty$Builder) id config))


(defn cfn-scaling-plan-tag-filter-property-builder>
  "The cfn-scaling-plan-tag-filter-property-builder> function updates a CfnScalingPlan$TagFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$TagFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnScalingPlan$TagFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-scaling-plan-tag-filter-property-builder
  "Creates a  `CfnScalingPlan$TagFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-tag-filter-property-builder> (new CfnScalingPlan$TagFilterProperty$Builder) id config))


(defn cfn-scaling-plan-target-tracking-configuration-property-builder>
  "The cfn-scaling-plan-target-tracking-configuration-property-builder> function updates a CfnScalingPlan$TargetTrackingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnScalingPlan$TargetTrackingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customizedScalingMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-scaling-metric-specification` |
| `disableScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `predefinedScalingMetricSpecification` | software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan$PredefinedScalingMetricSpecificationProperty | [[cdk.support/lookup-entry]] | `:predefined-scaling-metric-specification` |
| `scaleInCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^CfnScalingPlan$TargetTrackingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customized-scaling-metric-specification)]
    (. builder customizedScalingMetricSpecification data))
  (when-some [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-some [data (lookup-entry config id :estimated-instance-warmup)]
    (. builder estimatedInstanceWarmup data))
  (when-some [data (lookup-entry config id :predefined-scaling-metric-specification)]
    (. builder predefinedScalingMetricSpecification data))
  (when-some [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-some [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-some [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn cfn-scaling-plan-target-tracking-configuration-property-builder
  "Creates a  `CfnScalingPlan$TargetTrackingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scaling-plan-target-tracking-configuration-property-builder> (new CfnScalingPlan$TargetTrackingConfigurationProperty$Builder) id config))