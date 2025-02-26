(ns cdk.api.services.arczonalshift
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.arczonalshift package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.arczonalshift CfnZonalAutoshiftConfiguration$Builder
                                                          CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder
                                                          CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder
                                                          CfnZonalAutoshiftConfigurationProps$Builder]))


(defn build-cfn-zonal-autoshift-configuration-builder
  "The build-cfn-zonal-autoshift-configuration-builder function updates a CfnZonalAutoshiftConfiguration$Builder instance using the provided configuration.
  The function takes the CfnZonalAutoshiftConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `practiceRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:practice-run-configuration` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `zonalAutoshiftStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:zonal-autoshift-status` |
"
  [^CfnZonalAutoshiftConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :practice-run-configuration)]
    (. builder practiceRunConfiguration data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (when-some [data (lookup-entry config id :zonal-autoshift-status)]
    (. builder zonalAutoshiftStatus data))
  (.build builder))


(defn cfn-zonal-autoshift-configuration-builder
  "Creates a  `CfnZonalAutoshiftConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-zonal-autoshift-configuration-builder (CfnZonalAutoshiftConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-zonal-autoshift-configuration-control-condition-property-builder
  "The build-cfn-zonal-autoshift-configuration-control-condition-property-builder function updates a CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-identifier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-identifier)]
    (. builder alarmIdentifier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-zonal-autoshift-configuration-control-condition-property-builder
  "Creates a  `CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-zonal-autoshift-configuration-control-condition-property-builder (new CfnZonalAutoshiftConfiguration$ControlConditionProperty$Builder) id config))


(defn build-cfn-zonal-autoshift-configuration-practice-run-configuration-property-builder
  "The build-cfn-zonal-autoshift-configuration-practice-run-configuration-property-builder function updates a CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockedDates` | java.util.List | [[cdk.support/lookup-entry]] | `:blocked-dates` |
| `blockedWindows` | java.util.List | [[cdk.support/lookup-entry]] | `:blocked-windows` |
| `blockingAlarms` | java.util.List | [[cdk.support/lookup-entry]] | `:blocking-alarms` |
| `outcomeAlarms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outcome-alarms` |
"
  [^CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :blocked-dates)]
    (. builder blockedDates data))
  (when-some [data (lookup-entry config id :blocked-windows)]
    (. builder blockedWindows data))
  (when-some [data (lookup-entry config id :blocking-alarms)]
    (. builder blockingAlarms data))
  (when-some [data (lookup-entry config id :outcome-alarms)]
    (. builder outcomeAlarms data))
  (.build builder))


(defn cfn-zonal-autoshift-configuration-practice-run-configuration-property-builder
  "Creates a  `CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-zonal-autoshift-configuration-practice-run-configuration-property-builder (new CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty$Builder) id config))


(defn build-cfn-zonal-autoshift-configuration-props-builder
  "The build-cfn-zonal-autoshift-configuration-props-builder function updates a CfnZonalAutoshiftConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnZonalAutoshiftConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `practiceRunConfiguration` | software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration$PracticeRunConfigurationProperty | [[cdk.support/lookup-entry]] | `:practice-run-configuration` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `zonalAutoshiftStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:zonal-autoshift-status` |
"
  [^CfnZonalAutoshiftConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :practice-run-configuration)]
    (. builder practiceRunConfiguration data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (when-some [data (lookup-entry config id :zonal-autoshift-status)]
    (. builder zonalAutoshiftStatus data))
  (.build builder))


(defn cfn-zonal-autoshift-configuration-props-builder
  "Creates a  `CfnZonalAutoshiftConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-zonal-autoshift-configuration-props-builder (new CfnZonalAutoshiftConfigurationProps$Builder) id config))