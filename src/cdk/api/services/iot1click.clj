(ns cdk.api.services.iot1click
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iot1click package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iot1click CfnDevice$Builder
                                                      CfnDeviceProps$Builder
                                                      CfnPlacement$Builder
                                                      CfnPlacementProps$Builder
                                                      CfnProject$Builder
                                                      CfnProject$DeviceTemplateProperty$Builder
                                                      CfnProject$PlacementTemplateProperty$Builder
                                                      CfnProjectProps$Builder]))


(defn cfn-device-builder
  "The cfn-device-builder function buildes out new instances of 
CfnDevice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnDevice$Builder/create stack id)]
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-device-props-builder
  "The cfn-device-props-builder function buildes out new instances of 
CfnDeviceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnDeviceProps$Builder.)]
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-placement-builder
  "The cfn-placement-builder function buildes out new instances of 
CfnPlacement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedDevices` | java.lang.Object | [[cdk.support/lookup-entry]] | `:associated-devices` |
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `placementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-name` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnPlacement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associated-devices)]
      (. builder associatedDevices data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :placement-name)]
      (. builder placementName data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))


(defn cfn-placement-props-builder
  "The cfn-placement-props-builder function buildes out new instances of 
CfnPlacementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedDevices` | java.lang.Object | [[cdk.support/lookup-entry]] | `:associated-devices` |
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `placementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-name` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnPlacementProps$Builder.)]
    (when-let [data (lookup-entry config id :associated-devices)]
      (. builder associatedDevices data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :placement-name)]
      (. builder placementName data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `placementTemplate` | software.amazon.awscdk.services.iot1click.CfnProject$PlacementTemplateProperty | [[cdk.support/lookup-entry]] | `:placement-template` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :placement-template)]
      (. builder placementTemplate data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))


(defn cfn-project-device-template-property-builder
  "The cfn-project-device-template-property-builder function buildes out new instances of 
CfnProject$DeviceTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `callbackOverrides` | java.lang.Object | [[cdk.support/lookup-entry]] | `:callback-overrides` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |"
  [stack id config]
  (let [builder (CfnProject$DeviceTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :callback-overrides)]
      (. builder callbackOverrides data))
    (when-let [data (lookup-entry config id :device-type)]
      (. builder deviceType data))
    (.build builder)))


(defn cfn-project-placement-template-property-builder
  "The cfn-project-placement-template-property-builder function buildes out new instances of 
CfnProject$PlacementTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-attributes` |
| `deviceTemplates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:device-templates` |"
  [stack id config]
  (let [builder (CfnProject$PlacementTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-attributes)]
      (. builder defaultAttributes data))
    (when-let [data (lookup-entry config id :device-templates)]
      (. builder deviceTemplates data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `placementTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-template` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :placement-template)]
      (. builder placementTemplate data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))