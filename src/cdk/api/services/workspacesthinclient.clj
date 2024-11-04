(ns cdk.api.services.workspacesthinclient
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.workspacesthinclient package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.workspacesthinclient CfnEnvironment$Builder
                                                                 CfnEnvironment$MaintenanceWindowProperty$Builder
                                                                 CfnEnvironmentProps$Builder]))


(defn cfn-environment-builder
  "The cfn-environment-builder function buildes out new instances of 
CfnEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :desired-software-set-id)]
      (. builder desiredSoftwareSetId data))
    (when-let [data (lookup-entry config id :desktop-arn)]
      (. builder desktopArn data))
    (when-let [data (lookup-entry config id :desktop-endpoint)]
      (. builder desktopEndpoint data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :maintenance-window)]
      (. builder maintenanceWindow data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :software-set-update-mode)]
      (. builder softwareSetUpdateMode data))
    (when-let [data (lookup-entry config id :software-set-update-schedule)]
      (. builder softwareSetUpdateSchedule data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-maintenance-window-property-builder
  "The cfn-environment-maintenance-window-property-builder function buildes out new instances of 
CfnEnvironment$MaintenanceWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyTimeOf` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-time-of` |
| `daysOfTheWeek` | java.util.List | [[cdk.support/lookup-entry]] | `:days-of-the-week` |
| `endTimeHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-time-hour` |
| `endTimeMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-time-minute` |
| `startTimeHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-time-hour` |
| `startTimeMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-time-minute` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnEnvironment$MaintenanceWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :apply-time-of)]
      (. builder applyTimeOf data))
    (when-let [data (lookup-entry config id :days-of-the-week)]
      (. builder daysOfTheWeek data))
    (when-let [data (lookup-entry config id :end-time-hour)]
      (. builder endTimeHour data))
    (when-let [data (lookup-entry config id :end-time-minute)]
      (. builder endTimeMinute data))
    (when-let [data (lookup-entry config id :start-time-hour)]
      (. builder startTimeHour data))
    (when-let [data (lookup-entry config id :start-time-minute)]
      (. builder startTimeMinute data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-environment-props-builder
  "The cfn-environment-props-builder function buildes out new instances of 
CfnEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :desired-software-set-id)]
      (. builder desiredSoftwareSetId data))
    (when-let [data (lookup-entry config id :desktop-arn)]
      (. builder desktopArn data))
    (when-let [data (lookup-entry config id :desktop-endpoint)]
      (. builder desktopEndpoint data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :maintenance-window)]
      (. builder maintenanceWindow data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :software-set-update-mode)]
      (. builder softwareSetUpdateMode data))
    (when-let [data (lookup-entry config id :software-set-update-schedule)]
      (. builder softwareSetUpdateSchedule data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))