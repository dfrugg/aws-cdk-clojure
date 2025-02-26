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


(defn build-cfn-device-builder
  "The build-cfn-device-builder function updates a CfnDevice$Builder instance using the provided configuration.
  The function takes the CfnDevice$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnDevice$Builder builder id config]
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-device-builder
  "Creates a  `CfnDevice$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-device-builder (CfnDevice$Builder/create scope (name id)) id config))


(defn build-cfn-device-props-builder
  "The build-cfn-device-props-builder function updates a CfnDeviceProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnDeviceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-device-props-builder
  "Creates a  `CfnDeviceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-props-builder (new CfnDeviceProps$Builder) id config))


(defn build-cfn-placement-builder
  "The build-cfn-placement-builder function updates a CfnPlacement$Builder instance using the provided configuration.
  The function takes the CfnPlacement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedDevices` | java.lang.Object | [[cdk.support/lookup-entry]] | `:associated-devices` |
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `placementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-name` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnPlacement$Builder builder id config]
  (when-let [data (lookup-entry config id :associated-devices)]
    (. builder associatedDevices data))
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :placement-name)]
    (. builder placementName data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-placement-builder
  "Creates a  `CfnPlacement$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-placement-builder (CfnPlacement$Builder/create scope (name id)) id config))


(defn build-cfn-placement-props-builder
  "The build-cfn-placement-props-builder function updates a CfnPlacementProps$Builder instance using the provided configuration.
  The function takes the CfnPlacementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedDevices` | java.lang.Object | [[cdk.support/lookup-entry]] | `:associated-devices` |
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `placementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-name` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnPlacementProps$Builder builder id config]
  (when-let [data (lookup-entry config id :associated-devices)]
    (. builder associatedDevices data))
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :placement-name)]
    (. builder placementName data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-placement-props-builder
  "Creates a  `CfnPlacementProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-placement-props-builder (new CfnPlacementProps$Builder) id config))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `placementTemplate` | software.amazon.awscdk.services.iot1click.CfnProject$PlacementTemplateProperty | [[cdk.support/lookup-entry]] | `:placement-template` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnProject$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :placement-template)]
    (. builder placementTemplate data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-project-builder
  "Creates a  `CfnProject$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-device-template-property-builder
  "The build-cfn-project-device-template-property-builder function updates a CfnProject$DeviceTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$DeviceTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `callbackOverrides` | java.lang.Object | [[cdk.support/lookup-entry]] | `:callback-overrides` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |
"
  [^CfnProject$DeviceTemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :callback-overrides)]
    (. builder callbackOverrides data))
  (when-let [data (lookup-entry config id :device-type)]
    (. builder deviceType data))
  (.build builder))


(defn cfn-project-device-template-property-builder
  "Creates a  `CfnProject$DeviceTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-project-device-template-property-builder (new CfnProject$DeviceTemplateProperty$Builder) id config))


(defn build-cfn-project-placement-template-property-builder
  "The build-cfn-project-placement-template-property-builder function updates a CfnProject$PlacementTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$PlacementTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:default-attributes` |
| `deviceTemplates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:device-templates` |
"
  [^CfnProject$PlacementTemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-attributes)]
    (. builder defaultAttributes data))
  (when-let [data (lookup-entry config id :device-templates)]
    (. builder deviceTemplates data))
  (.build builder))


(defn cfn-project-placement-template-property-builder
  "Creates a  `CfnProject$PlacementTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-project-placement-template-property-builder (new CfnProject$PlacementTemplateProperty$Builder) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `placementTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-template` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :placement-template)]
    (. builder placementTemplate data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-project-props-builder
  "Creates a  `CfnProjectProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))