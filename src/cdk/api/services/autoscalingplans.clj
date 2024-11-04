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


(defn cfn-scaling-plan-application-source-property-builder
  "The cfn-scaling-plan-application-source-property-builder function buildes out new instances of 
CfnScalingPlan$ApplicationSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationStackArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-stack-arn` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |"
  [stack id config]
  (let [builder (CfnScalingPlan$ApplicationSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-formation-stack-arn)]
      (. builder cloudFormationStackArn data))
    (when-let [data (lookup-entry config id :tag-filters)]
      (. builder tagFilters data))
    (.build builder)))


(defn cfn-scaling-plan-builder
  "The cfn-scaling-plan-builder function buildes out new instances of 
CfnScalingPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-source` |
| `scalingInstructions` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-instructions` |"
  [stack id config]
  (let [builder (CfnScalingPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-source)]
      (. builder applicationSource data))
    (when-let [data (lookup-entry config id :scaling-instructions)]
      (. builder scalingInstructions data))
    (.build builder)))


(defn cfn-scaling-plan-customized-load-metric-specification-property-builder
  "The cfn-scaling-plan-customized-load-metric-specification-property-builder function buildes out new instances of 
CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnScalingPlan$CustomizedLoadMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-scaling-plan-customized-scaling-metric-specification-property-builder
  "The cfn-scaling-plan-customized-scaling-metric-specification-property-builder function buildes out new instances of 
CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnScalingPlan$CustomizedScalingMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-scaling-plan-metric-dimension-property-builder
  "The cfn-scaling-plan-metric-dimension-property-builder function buildes out new instances of 
CfnScalingPlan$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnScalingPlan$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-scaling-plan-predefined-load-metric-specification-property-builder
  "The cfn-scaling-plan-predefined-load-metric-specification-property-builder function buildes out new instances of 
CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedLoadMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-load-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |"
  [stack id config]
  (let [builder (CfnScalingPlan$PredefinedLoadMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :predefined-load-metric-type)]
      (. builder predefinedLoadMetricType data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (.build builder)))


(defn cfn-scaling-plan-predefined-scaling-metric-specification-property-builder
  "The cfn-scaling-plan-predefined-scaling-metric-specification-property-builder function buildes out new instances of 
CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `predefinedScalingMetricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:predefined-scaling-metric-type` |
| `resourceLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-label` |"
  [stack id config]
  (let [builder (CfnScalingPlan$PredefinedScalingMetricSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :predefined-scaling-metric-type)]
      (. builder predefinedScalingMetricType data))
    (when-let [data (lookup-entry config id :resource-label)]
      (. builder resourceLabel data))
    (.build builder)))


(defn cfn-scaling-plan-props-builder
  "The cfn-scaling-plan-props-builder function buildes out new instances of 
CfnScalingPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-source` |
| `scalingInstructions` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-instructions` |"
  [stack id config]
  (let [builder (CfnScalingPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :application-source)]
      (. builder applicationSource data))
    (when-let [data (lookup-entry config id :scaling-instructions)]
      (. builder scalingInstructions data))
    (.build builder)))


(defn cfn-scaling-plan-scaling-instruction-property-builder
  "The cfn-scaling-plan-scaling-instruction-property-builder function buildes out new instances of 
CfnScalingPlan$ScalingInstructionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `targetTrackingConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tracking-configurations` |"
  [stack id config]
  (let [builder (CfnScalingPlan$ScalingInstructionProperty$Builder.)]
    (when-let [data (lookup-entry config id :customized-load-metric-specification)]
      (. builder customizedLoadMetricSpecification data))
    (when-let [data (lookup-entry config id :disable-dynamic-scaling)]
      (. builder disableDynamicScaling data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :predefined-load-metric-specification)]
      (. builder predefinedLoadMetricSpecification data))
    (when-let [data (lookup-entry config id :predictive-scaling-max-capacity-behavior)]
      (. builder predictiveScalingMaxCapacityBehavior data))
    (when-let [data (lookup-entry config id :predictive-scaling-max-capacity-buffer)]
      (. builder predictiveScalingMaxCapacityBuffer data))
    (when-let [data (lookup-entry config id :predictive-scaling-mode)]
      (. builder predictiveScalingMode data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :scalable-dimension)]
      (. builder scalableDimension data))
    (when-let [data (lookup-entry config id :scaling-policy-update-behavior)]
      (. builder scalingPolicyUpdateBehavior data))
    (when-let [data (lookup-entry config id :scheduled-action-buffer-time)]
      (. builder scheduledActionBufferTime data))
    (when-let [data (lookup-entry config id :service-namespace)]
      (. builder serviceNamespace data))
    (when-let [data (lookup-entry config id :target-tracking-configurations)]
      (. builder targetTrackingConfigurations data))
    (.build builder)))


(defn cfn-scaling-plan-tag-filter-property-builder
  "The cfn-scaling-plan-tag-filter-property-builder function buildes out new instances of 
CfnScalingPlan$TagFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnScalingPlan$TagFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-scaling-plan-target-tracking-configuration-property-builder
  "The cfn-scaling-plan-target-tracking-configuration-property-builder function buildes out new instances of 
CfnScalingPlan$TargetTrackingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customizedScalingMetricSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customized-scaling-metric-specification` |
| `disableScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `estimatedInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `predefinedScalingMetricSpecification` | software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan$PredefinedScalingMetricSpecificationProperty | [[cdk.support/lookup-entry]] | `:predefined-scaling-metric-specification` |
| `scaleInCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnScalingPlan$TargetTrackingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customized-scaling-metric-specification)]
      (. builder customizedScalingMetricSpecification data))
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :predefined-scaling-metric-specification)]
      (. builder predefinedScalingMetricSpecification data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))