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


(defn cfn-job-template-acceleration-settings-property-builder
  "The cfn-job-template-acceleration-settings-property-builder function buildes out new instances of 
CfnJobTemplate$AccelerationSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnJobTemplate$AccelerationSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-job-template-builder
  "The cfn-job-template-builder function buildes out new instances of 
CfnJobTemplate$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnJobTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :acceleration-settings)]
      (. builder accelerationSettings data))
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hop-destinations)]
      (. builder hopDestinations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :settings-json)]
      (. builder settingsJson data))
    (when-let [data (lookup-entry config id :status-update-interval)]
      (. builder statusUpdateInterval data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-job-template-hop-destination-property-builder
  "The cfn-job-template-hop-destination-property-builder function buildes out new instances of 
CfnJobTemplate$HopDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
| `waitMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-minutes` |"
  [stack id config]
  (let [builder (CfnJobTemplate$HopDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :wait-minutes)]
      (. builder waitMinutes data))
    (.build builder)))


(defn cfn-job-template-props-builder
  "The cfn-job-template-props-builder function buildes out new instances of 
CfnJobTemplateProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnJobTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :acceleration-settings)]
      (. builder accelerationSettings data))
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hop-destinations)]
      (. builder hopDestinations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :settings-json)]
      (. builder settingsJson data))
    (when-let [data (lookup-entry config id :status-update-interval)]
      (. builder statusUpdateInterval data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-preset-builder
  "The cfn-preset-builder function buildes out new instances of 
CfnPreset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `settingsJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:settings-json` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPreset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :settings-json)]
      (. builder settingsJson data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-preset-props-builder
  "The cfn-preset-props-builder function buildes out new instances of 
CfnPresetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `settingsJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:settings-json` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPresetProps$Builder.)]
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :settings-json)]
      (. builder settingsJson data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-queue-builder
  "The cfn-queue-builder function buildes out new instances of 
CfnQueue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnQueue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-queue-props-builder
  "The cfn-queue-props-builder function buildes out new instances of 
CfnQueueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnQueueProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))