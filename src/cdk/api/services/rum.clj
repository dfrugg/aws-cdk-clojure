(ns cdk.api.services.rum
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rum package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.rum CfnAppMonitor$AppMonitorConfigurationProperty$Builder
                                                CfnAppMonitor$Builder
                                                CfnAppMonitor$CustomEventsProperty$Builder
                                                CfnAppMonitor$MetricDefinitionProperty$Builder
                                                CfnAppMonitor$MetricDestinationProperty$Builder
                                                CfnAppMonitorProps$Builder]))


(defn cfn-app-monitor-app-monitor-configuration-property-builder>
  "The cfn-app-monitor-app-monitor-configuration-property-builder> function updates a CfnAppMonitor$AppMonitorConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAppMonitor$AppMonitorConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCookies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-cookies` |
| `enableXRay` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-x-ray` |
| `excludedPages` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-pages` |
| `favoritePages` | java.util.List | [[cdk.support/lookup-entry]] | `:favorite-pages` |
| `guestRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:guest-role-arn` |
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `includedPages` | java.util.List | [[cdk.support/lookup-entry]] | `:included-pages` |
| `metricDestinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-destinations` |
| `sessionSampleRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-sample-rate` |
| `telemetries` | java.util.List | [[cdk.support/lookup-entry]] | `:telemetries` |
"
  [^CfnAppMonitor$AppMonitorConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-cookies)]
    (. builder allowCookies data))
  (when-some [data (lookup-entry config id :enable-x-ray)]
    (. builder enableXRay data))
  (when-some [data (lookup-entry config id :excluded-pages)]
    (. builder excludedPages data))
  (when-some [data (lookup-entry config id :favorite-pages)]
    (. builder favoritePages data))
  (when-some [data (lookup-entry config id :guest-role-arn)]
    (. builder guestRoleArn data))
  (when-some [data (lookup-entry config id :identity-pool-id)]
    (. builder identityPoolId data))
  (when-some [data (lookup-entry config id :included-pages)]
    (. builder includedPages data))
  (when-some [data (lookup-entry config id :metric-destinations)]
    (. builder metricDestinations data))
  (when-some [data (lookup-entry config id :session-sample-rate)]
    (. builder sessionSampleRate data))
  (when-some [data (lookup-entry config id :telemetries)]
    (. builder telemetries data))
  (.build builder))


(defn cfn-app-monitor-app-monitor-configuration-property-builder
  "Creates a  `CfnAppMonitor$AppMonitorConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-monitor-app-monitor-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-monitor-app-monitor-configuration-property-builder> (new CfnAppMonitor$AppMonitorConfigurationProperty$Builder) id config))


(defn cfn-app-monitor-builder>
  "The cfn-app-monitor-builder> function updates a CfnAppMonitor$Builder instance using the provided configuration.
  The function takes the CfnAppMonitor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appMonitorConfiguration` | software.amazon.awscdk.services.rum.CfnAppMonitor$AppMonitorConfigurationProperty | [[cdk.support/lookup-entry]] | `:app-monitor-configuration` |
| `customEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-events` |
| `cwLogEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cw-log-enabled` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppMonitor$Builder builder id config]
  (when-some [data (lookup-entry config id :app-monitor-configuration)]
    (. builder appMonitorConfiguration data))
  (when-some [data (lookup-entry config id :custom-events)]
    (. builder customEvents data))
  (when-some [data (lookup-entry config id :cw-log-enabled)]
    (. builder cwLogEnabled data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-app-monitor-builder
  "Creates a  `CfnAppMonitor$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-app-monitor-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-app-monitor-builder> (CfnAppMonitor$Builder/create scope (name id)) id config))


(defn cfn-app-monitor-custom-events-property-builder>
  "The cfn-app-monitor-custom-events-property-builder> function updates a CfnAppMonitor$CustomEventsProperty$Builder instance using the provided configuration.
  The function takes the CfnAppMonitor$CustomEventsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnAppMonitor$CustomEventsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-app-monitor-custom-events-property-builder
  "Creates a  `CfnAppMonitor$CustomEventsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-monitor-custom-events-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-monitor-custom-events-property-builder> (new CfnAppMonitor$CustomEventsProperty$Builder) id config))


(defn cfn-app-monitor-metric-definition-property-builder>
  "The cfn-app-monitor-metric-definition-property-builder> function updates a CfnAppMonitor$MetricDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnAppMonitor$MetricDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionKeys` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimension-keys` |
| `eventPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `unitLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-label` |
| `valueKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-key` |
"
  [^CfnAppMonitor$MetricDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimension-keys)]
    (. builder dimensionKeys data))
  (when-some [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :unit-label)]
    (. builder unitLabel data))
  (when-some [data (lookup-entry config id :value-key)]
    (. builder valueKey data))
  (.build builder))


(defn cfn-app-monitor-metric-definition-property-builder
  "Creates a  `CfnAppMonitor$MetricDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-monitor-metric-definition-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-monitor-metric-definition-property-builder> (new CfnAppMonitor$MetricDefinitionProperty$Builder) id config))


(defn cfn-app-monitor-metric-destination-property-builder>
  "The cfn-app-monitor-metric-destination-property-builder> function updates a CfnAppMonitor$MetricDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnAppMonitor$MetricDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `metricDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-definitions` |
"
  [^CfnAppMonitor$MetricDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :metric-definitions)]
    (. builder metricDefinitions data))
  (.build builder))


(defn cfn-app-monitor-metric-destination-property-builder
  "Creates a  `CfnAppMonitor$MetricDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-monitor-metric-destination-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-monitor-metric-destination-property-builder> (new CfnAppMonitor$MetricDestinationProperty$Builder) id config))


(defn cfn-app-monitor-props-builder>
  "The cfn-app-monitor-props-builder> function updates a CfnAppMonitorProps$Builder instance using the provided configuration.
  The function takes the CfnAppMonitorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appMonitorConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-monitor-configuration` |
| `customEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-events` |
| `cwLogEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cw-log-enabled` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppMonitorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :app-monitor-configuration)]
    (. builder appMonitorConfiguration data))
  (when-some [data (lookup-entry config id :custom-events)]
    (. builder customEvents data))
  (when-some [data (lookup-entry config id :cw-log-enabled)]
    (. builder cwLogEnabled data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-app-monitor-props-builder
  "Creates a  `CfnAppMonitorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-monitor-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-monitor-props-builder> (new CfnAppMonitorProps$Builder) id config))