(ns cdk.api.services.mediaconvert
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mediaconvert package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mediaconvert CfnJobTemplate$AccelerationSettingsProperty$Builder
                                                         CfnJobTemplate$Builder
                                                         CfnJobTemplate$HopDestinationProperty$Builder
                                                         CfnJobTemplateProps$Builder
                                                         CfnPreset$Builder
                                                         CfnPresetProps$Builder
                                                         CfnQueue$Builder
                                                         CfnQueueProps$Builder]))


(defn cfn-job-template-acceleration-settings-property-builder>
  "The cfn-job-template-acceleration-settings-property-builder> function updates a CfnJobTemplate$AccelerationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$AccelerationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnJobTemplate$AccelerationSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-job-template-acceleration-settings-property-builder
  "Creates a  `CfnJobTemplate$AccelerationSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-job-template-acceleration-settings-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-job-template-acceleration-settings-property-builder> (new CfnJobTemplate$AccelerationSettingsProperty$Builder) id config))


(defn cfn-job-template-builder>
  "The cfn-job-template-builder> function updates a CfnJobTemplate$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerationSettings` | software.amazon.awscdk.services.mediaconvert.CfnJobTemplate$AccelerationSettingsProperty | [[cdk.support/lookup-entry]] | `:acceleration-settings` |
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hopDestinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hop-destinations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
| `settingsJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:settings-json` |
| `statusUpdateInterval` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-update-interval` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnJobTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :acceleration-settings)]
    (. builder accelerationSettings data))
  (when-some [data (lookup-entry config id :category)]
    (. builder category data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hop-destinations)]
    (. builder hopDestinations data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :settings-json)]
    (. builder settingsJson data))
  (when-some [data (lookup-entry config id :status-update-interval)]
    (. builder statusUpdateInterval data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-job-template-builder
  "Creates a  `CfnJobTemplate$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-job-template-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-job-template-builder> (CfnJobTemplate$Builder/create scope (name id)) id config))


(defn cfn-job-template-hop-destination-property-builder>
  "The cfn-job-template-hop-destination-property-builder> function updates a CfnJobTemplate$HopDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$HopDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
| `waitMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-minutes` |
"
  [^CfnJobTemplate$HopDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :wait-minutes)]
    (. builder waitMinutes data))
  (.build builder))


(defn cfn-job-template-hop-destination-property-builder
  "Creates a  `CfnJobTemplate$HopDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-job-template-hop-destination-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-job-template-hop-destination-property-builder> (new CfnJobTemplate$HopDestinationProperty$Builder) id config))


(defn cfn-job-template-props-builder>
  "The cfn-job-template-props-builder> function updates a CfnJobTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnJobTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acceleration-settings` |
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hopDestinations` | java.util.List | [[cdk.support/lookup-entry]] | `:hop-destinations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
| `settingsJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:settings-json` |
| `statusUpdateInterval` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-update-interval` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnJobTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :acceleration-settings)]
    (. builder accelerationSettings data))
  (when-some [data (lookup-entry config id :category)]
    (. builder category data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hop-destinations)]
    (. builder hopDestinations data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :settings-json)]
    (. builder settingsJson data))
  (when-some [data (lookup-entry config id :status-update-interval)]
    (. builder statusUpdateInterval data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-job-template-props-builder
  "Creates a  `CfnJobTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-job-template-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-job-template-props-builder> (new CfnJobTemplateProps$Builder) id config))


(defn cfn-preset-builder>
  "The cfn-preset-builder> function updates a CfnPreset$Builder instance using the provided configuration.
  The function takes the CfnPreset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `settingsJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:settings-json` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPreset$Builder builder id config]
  (when-some [data (lookup-entry config id :category)]
    (. builder category data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :settings-json)]
    (. builder settingsJson data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-preset-builder
  "Creates a  `CfnPreset$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-preset-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-preset-builder> (CfnPreset$Builder/create scope (name id)) id config))


(defn cfn-preset-props-builder>
  "The cfn-preset-props-builder> function updates a CfnPresetProps$Builder instance using the provided configuration.
  The function takes the CfnPresetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `settingsJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:settings-json` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPresetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :category)]
    (. builder category data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :settings-json)]
    (. builder settingsJson data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-preset-props-builder
  "Creates a  `CfnPresetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-preset-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-preset-props-builder> (new CfnPresetProps$Builder) id config))


(defn cfn-queue-builder>
  "The cfn-queue-builder> function updates a CfnQueue$Builder instance using the provided configuration.
  The function takes the CfnQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnQueue$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-queue-builder
  "Creates a  `CfnQueue$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-queue-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-queue-builder> (CfnQueue$Builder/create scope (name id)) id config))


(defn cfn-queue-props-builder>
  "The cfn-queue-props-builder> function updates a CfnQueueProps$Builder instance using the provided configuration.
  The function takes the CfnQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnQueueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-queue-props-builder
  "Creates a  `CfnQueueProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-queue-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-queue-props-builder> (new CfnQueueProps$Builder) id config))