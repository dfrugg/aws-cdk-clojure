(ns cdk.api.services.kendraranking
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kendraranking package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kendraranking CfnExecutionPlan$Builder
                                                          CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder
                                                          CfnExecutionPlanProps$Builder]))


(defn cfn-execution-plan-builder
  "The cfn-execution-plan-builder function buildes out new instances of 
CfnExecutionPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityUnits` | software.amazon.awscdk.services.kendraranking.CfnExecutionPlan$CapacityUnitsConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-units` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExecutionPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-units)]
      (. builder capacityUnits data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-execution-plan-capacity-units-configuration-property-builder
  "The cfn-execution-plan-capacity-units-configuration-property-builder function buildes out new instances of 
CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rescoreCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rescore-capacity-units` |"
  [stack id config]
  (let [builder (CfnExecutionPlan$CapacityUnitsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :rescore-capacity-units)]
      (. builder rescoreCapacityUnits data))
    (.build builder)))


(defn cfn-execution-plan-props-builder
  "The cfn-execution-plan-props-builder function buildes out new instances of 
CfnExecutionPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityUnits` | software.amazon.awscdk.services.kendraranking.CfnExecutionPlan$CapacityUnitsConfigurationProperty | [[cdk.support/lookup-entry]] | `:capacity-units` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExecutionPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-units)]
      (. builder capacityUnits data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))