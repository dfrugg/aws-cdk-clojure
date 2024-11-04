(ns cdk.api.services.arczonalshift
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.arczonalshift package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.arczonalshift CfnZonalAutoshiftConfiguration$Builder
                                                          CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder
                                                          CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder
                                                          CfnZonalAutoshiftConfigurationProps$Builder]))


(defn cfn-zonal-autoshift-configuration-builder
  "The cfn-zonal-autoshift-configuration-builder function buildes out new instances of 
CfnZonalAutoshiftConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `practiceRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:practice-run-configuration` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `zonalAutoshiftStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:zonal-autoshift-status` |"
  [stack id config]
  (let [builder (CfnZonalAutoshiftConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :practice-run-configuration)]
      (. builder practiceRunConfiguration data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :zonal-autoshift-status)]
      (. builder zonalAutoshiftStatus data))
    (.build builder)))


(defn cfn-zonal-autoshift-configuration-control-condition-property-builder
  "The cfn-zonal-autoshift-configuration-control-condition-property-builder function buildes out new instances of 
CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-identifier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-identifier)]
      (. builder alarmIdentifier data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-zonal-autoshift-configuration-practice-run-configuration-property-builder
  "The cfn-zonal-autoshift-configuration-practice-run-configuration-property-builder function buildes out new instances of 
CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockedDates` | java.util.List | [[cdk.support/lookup-entry]] | `:blocked-dates` |
| `blockedWindows` | java.util.List | [[cdk.support/lookup-entry]] | `:blocked-windows` |
| `blockingAlarms` | java.util.List | [[cdk.support/lookup-entry]] | `:blocking-alarms` |
| `outcomeAlarms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outcome-alarms` |"
  [stack id config]
  (let [builder (CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :blocked-dates)]
      (. builder blockedDates data))
    (when-let [data (lookup-entry config id :blocked-windows)]
      (. builder blockedWindows data))
    (when-let [data (lookup-entry config id :blocking-alarms)]
      (. builder blockingAlarms data))
    (when-let [data (lookup-entry config id :outcome-alarms)]
      (. builder outcomeAlarms data))
    (.build builder)))


(defn cfn-zonal-autoshift-configuration-props-builder
  "The cfn-zonal-autoshift-configuration-props-builder function buildes out new instances of 
CfnZonalAutoshiftConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `practiceRunConfiguration` | software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty | [[cdk.support/lookup-entry]] | `:practice-run-configuration` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `zonalAutoshiftStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:zonal-autoshift-status` |"
  [stack id config]
  (let [builder (CfnZonalAutoshiftConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :practice-run-configuration)]
      (. builder practiceRunConfiguration data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :zonal-autoshift-status)]
      (. builder zonalAutoshiftStatus data))
    (.build builder)))