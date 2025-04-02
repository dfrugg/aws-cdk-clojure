(ns cdk.api.services.kendraranking
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kendraranking package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kendraranking CfnExecutionPlan$Builder
                                                          CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder
                                                          CfnExecutionPlanProps$Builder]))


(defn cfn-execution-plan-builder>
  "The cfn-execution-plan-builder> function updates a CfnExecutionPlan$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :capacity-units)]
    (. builder capacityUnits data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-execution-plan-builder
  "Creates a  `CfnExecutionPlan$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-execution-plan-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-execution-plan-builder> (CfnExecutionPlan$Builder/create scope (name id)) id config))


(defn cfn-execution-plan-capacity-units-configuration-property-builder>
  "The cfn-execution-plan-capacity-units-configuration-property-builder> function updates a CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rescoreCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rescore-capacity-units` |
"
  [^CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rescore-capacity-units)]
    (. builder rescoreCapacityUnits data))
  (.build builder))


(defn cfn-execution-plan-capacity-units-configuration-property-builder
  "Creates a  `CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-execution-plan-capacity-units-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-execution-plan-capacity-units-configuration-property-builder> (new CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder) id config))


(defn cfn-execution-plan-props-builder>
  "The cfn-execution-plan-props-builder> function updates a CfnExecutionPlanProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :capacity-units)]
    (. builder capacityUnits data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-execution-plan-props-builder
  "Creates a  `CfnExecutionPlanProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-execution-plan-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-execution-plan-props-builder> (new CfnExecutionPlanProps$Builder) id config))