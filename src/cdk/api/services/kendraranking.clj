(ns cdk.api.services.kendraranking
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kendraranking package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kendraranking CfnExecutionPlan$Builder
                                                          CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder
                                                          CfnExecutionPlanProps$Builder]))


(defn build-cfn-execution-plan-builder
  "The build-cfn-execution-plan-builder function updates a CfnExecutionPlan$Builder instance using the provided configuration.
  The function takes the CfnExecutionPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityUnits` | software.amazon.awscdk.services.kendraranking.CfnExecutionPlan$CapacityUnitsConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-units` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExecutionPlan$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-units)]
    (. builder capacityUnits data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-execution-plan-capacity-units-configuration-property-builder
  "The build-cfn-execution-plan-capacity-units-configuration-property-builder function updates a CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rescoreCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rescore-capacity-units` |
"
  [^CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rescore-capacity-units)]
    (. builder rescoreCapacityUnits data))
  (.build builder))


(defn build-cfn-execution-plan-props-builder
  "The build-cfn-execution-plan-props-builder function updates a CfnExecutionPlanProps$Builder instance using the provided configuration.
  The function takes the CfnExecutionPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityUnits` | software.amazon.awscdk.services.kendraranking.CfnExecutionPlan$CapacityUnitsConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-units` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExecutionPlanProps$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-units)]
    (. builder capacityUnits data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))