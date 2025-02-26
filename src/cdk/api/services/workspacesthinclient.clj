(ns cdk.api.services.workspacesthinclient
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.workspacesthinclient package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.workspacesthinclient CfnEnvironment$Builder
                                                                 CfnEnvironment$MaintenanceWindowProperty$Builder
                                                                 CfnEnvironmentProps$Builder]))


(defn build-cfn-environment-builder
  "The build-cfn-environment-builder function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredSoftwareSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-software-set-id` |
| `desktopArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:desktop-arn` |
| `desktopEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:desktop-endpoint` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `maintenanceWindow` | software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment$MaintenanceWindowProperty | [[cdk.support/lookup-entry]] | `:maintenance-window` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `softwareSetUpdateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:software-set-update-mode` |
| `softwareSetUpdateSchedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:software-set-update-schedule` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :desired-software-set-id)]
    (. builder desiredSoftwareSetId data))
  (when-some [data (lookup-entry config id :desktop-arn)]
    (. builder desktopArn data))
  (when-some [data (lookup-entry config id :desktop-endpoint)]
    (. builder desktopEndpoint data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :maintenance-window)]
    (. builder maintenanceWindow data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :software-set-update-mode)]
    (. builder softwareSetUpdateMode data))
  (when-some [data (lookup-entry config id :software-set-update-schedule)]
    (. builder softwareSetUpdateSchedule data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-builder
  "Creates a  `CfnEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-builder (CfnEnvironment$Builder/create scope (name id)) id config))


(defn build-cfn-environment-maintenance-window-property-builder
  "The build-cfn-environment-maintenance-window-property-builder function updates a CfnEnvironment$MaintenanceWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$MaintenanceWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyTimeOf` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-time-of` |
| `daysOfTheWeek` | java.util.List | [[cdk.support/lookup-entry]] | `:days-of-the-week` |
| `endTimeHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-time-hour` |
| `endTimeMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-time-minute` |
| `startTimeHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-time-hour` |
| `startTimeMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-time-minute` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnEnvironment$MaintenanceWindowProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-time-of)]
    (. builder applyTimeOf data))
  (when-some [data (lookup-entry config id :days-of-the-week)]
    (. builder daysOfTheWeek data))
  (when-some [data (lookup-entry config id :end-time-hour)]
    (. builder endTimeHour data))
  (when-some [data (lookup-entry config id :end-time-minute)]
    (. builder endTimeMinute data))
  (when-some [data (lookup-entry config id :start-time-hour)]
    (. builder startTimeHour data))
  (when-some [data (lookup-entry config id :start-time-minute)]
    (. builder startTimeMinute data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-environment-maintenance-window-property-builder
  "Creates a  `CfnEnvironment$MaintenanceWindowProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-environment-maintenance-window-property-builder (new CfnEnvironment$MaintenanceWindowProperty$Builder) id config))


(defn build-cfn-environment-props-builder
  "The build-cfn-environment-props-builder function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredSoftwareSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-software-set-id` |
| `desktopArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:desktop-arn` |
| `desktopEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:desktop-endpoint` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `maintenanceWindow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-window` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `softwareSetUpdateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:software-set-update-mode` |
| `softwareSetUpdateSchedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:software-set-update-schedule` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :desired-software-set-id)]
    (. builder desiredSoftwareSetId data))
  (when-some [data (lookup-entry config id :desktop-arn)]
    (. builder desktopArn data))
  (when-some [data (lookup-entry config id :desktop-endpoint)]
    (. builder desktopEndpoint data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :maintenance-window)]
    (. builder maintenanceWindow data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :software-set-update-mode)]
    (. builder softwareSetUpdateMode data))
  (when-some [data (lookup-entry config id :software-set-update-schedule)]
    (. builder softwareSetUpdateSchedule data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-props-builder
  "Creates a  `CfnEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-environment-props-builder (new CfnEnvironmentProps$Builder) id config))