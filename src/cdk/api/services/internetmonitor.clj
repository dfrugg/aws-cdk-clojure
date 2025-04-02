(ns cdk.api.services.internetmonitor
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.internetmonitor package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.internetmonitor CfnMonitor$Builder
                                                            CfnMonitor$HealthEventsConfigProperty$Builder
                                                            CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder
                                                            CfnMonitor$LocalHealthEventsConfigProperty$Builder
                                                            CfnMonitor$S3ConfigProperty$Builder
                                                            CfnMonitorProps$Builder]))


(defn cfn-monitor-builder>
  "The cfn-monitor-builder> function updates a CfnMonitor$Builder instance using the provided configuration.
  The function takes the CfnMonitor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthEventsConfig` | software.amazon.awscdk.services.internetmonitor.CfnMonitor$HealthEventsConfigProperty | [[cdk.support/lookup-entry]] | `:health-events-config` |
| `includeLinkedAccounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-linked-accounts` |
| `internetMeasurementsLogDelivery` | software.amazon.awscdk.services.internetmonitor.CfnMonitor$InternetMeasurementsLogDeliveryProperty | [[cdk.support/lookup-entry]] | `:internet-measurements-log-delivery` |
| `linkedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:linked-account-id` |
| `maxCityNetworksToMonitor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-city-networks-to-monitor` |
| `monitorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-name` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `resourcesToAdd` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-to-add` |
| `resourcesToRemove` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-to-remove` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trafficPercentageToMonitor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-percentage-to-monitor` |
"
  [^CfnMonitor$Builder builder id config]
  (when-some [data (lookup-entry config id :health-events-config)]
    (. builder healthEventsConfig data))
  (when-some [data (lookup-entry config id :include-linked-accounts)]
    (. builder includeLinkedAccounts data))
  (when-some [data (lookup-entry config id :internet-measurements-log-delivery)]
    (. builder internetMeasurementsLogDelivery data))
  (when-some [data (lookup-entry config id :linked-account-id)]
    (. builder linkedAccountId data))
  (when-some [data (lookup-entry config id :max-city-networks-to-monitor)]
    (. builder maxCityNetworksToMonitor data))
  (when-some [data (lookup-entry config id :monitor-name)]
    (. builder monitorName data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :resources-to-add)]
    (. builder resourcesToAdd data))
  (when-some [data (lookup-entry config id :resources-to-remove)]
    (. builder resourcesToRemove data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :traffic-percentage-to-monitor)]
    (. builder trafficPercentageToMonitor data))
  (.build builder))


(defn cfn-monitor-builder
  "Creates a  `CfnMonitor$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-monitor-builder> (CfnMonitor$Builder/create scope (name id)) id config))


(defn cfn-monitor-health-events-config-property-builder>
  "The cfn-monitor-health-events-config-property-builder> function updates a CfnMonitor$HealthEventsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitor$HealthEventsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityLocalHealthEventsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:availability-local-health-events-config` |
| `availabilityScoreThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:availability-score-threshold` |
| `performanceLocalHealthEventsConfig` | software.amazon.awscdk.services.internetmonitor.CfnMonitor$LocalHealthEventsConfigProperty | [[cdk.support/lookup-entry]] | `:performance-local-health-events-config` |
| `performanceScoreThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:performance-score-threshold` |
"
  [^CfnMonitor$HealthEventsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-local-health-events-config)]
    (. builder availabilityLocalHealthEventsConfig data))
  (when-some [data (lookup-entry config id :availability-score-threshold)]
    (. builder availabilityScoreThreshold data))
  (when-some [data (lookup-entry config id :performance-local-health-events-config)]
    (. builder performanceLocalHealthEventsConfig data))
  (when-some [data (lookup-entry config id :performance-score-threshold)]
    (. builder performanceScoreThreshold data))
  (.build builder))


(defn cfn-monitor-health-events-config-property-builder
  "Creates a  `CfnMonitor$HealthEventsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitor-health-events-config-property-builder> (new CfnMonitor$HealthEventsConfigProperty$Builder) id config))


(defn cfn-monitor-internet-measurements-log-delivery-property-builder>
  "The cfn-monitor-internet-measurements-log-delivery-property-builder> function updates a CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
"
  [^CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-config)]
    (. builder s3Config data))
  (.build builder))


(defn cfn-monitor-internet-measurements-log-delivery-property-builder
  "Creates a  `CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitor-internet-measurements-log-delivery-property-builder> (new CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder) id config))


(defn cfn-monitor-local-health-events-config-property-builder>
  "The cfn-monitor-local-health-events-config-property-builder> function updates a CfnMonitor$LocalHealthEventsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitor$LocalHealthEventsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthScoreThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-score-threshold` |
| `minTrafficImpact` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-traffic-impact` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnMonitor$LocalHealthEventsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :health-score-threshold)]
    (. builder healthScoreThreshold data))
  (when-some [data (lookup-entry config id :min-traffic-impact)]
    (. builder minTrafficImpact data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-monitor-local-health-events-config-property-builder
  "Creates a  `CfnMonitor$LocalHealthEventsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitor-local-health-events-config-property-builder> (new CfnMonitor$LocalHealthEventsConfigProperty$Builder) id config))


(defn cfn-monitor-props-builder>
  "The cfn-monitor-props-builder> function updates a CfnMonitorProps$Builder instance using the provided configuration.
  The function takes the CfnMonitorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthEventsConfig` | software.amazon.awscdk.services.internetmonitor.CfnMonitor$HealthEventsConfigProperty | [[cdk.support/lookup-entry]] | `:health-events-config` |
| `includeLinkedAccounts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-linked-accounts` |
| `internetMeasurementsLogDelivery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:internet-measurements-log-delivery` |
| `linkedAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:linked-account-id` |
| `maxCityNetworksToMonitor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-city-networks-to-monitor` |
| `monitorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitor-name` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `resourcesToAdd` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-to-add` |
| `resourcesToRemove` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-to-remove` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trafficPercentageToMonitor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-percentage-to-monitor` |
"
  [^CfnMonitorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :health-events-config)]
    (. builder healthEventsConfig data))
  (when-some [data (lookup-entry config id :include-linked-accounts)]
    (. builder includeLinkedAccounts data))
  (when-some [data (lookup-entry config id :internet-measurements-log-delivery)]
    (. builder internetMeasurementsLogDelivery data))
  (when-some [data (lookup-entry config id :linked-account-id)]
    (. builder linkedAccountId data))
  (when-some [data (lookup-entry config id :max-city-networks-to-monitor)]
    (. builder maxCityNetworksToMonitor data))
  (when-some [data (lookup-entry config id :monitor-name)]
    (. builder monitorName data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :resources-to-add)]
    (. builder resourcesToAdd data))
  (when-some [data (lookup-entry config id :resources-to-remove)]
    (. builder resourcesToRemove data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :traffic-percentage-to-monitor)]
    (. builder trafficPercentageToMonitor data))
  (.build builder))


(defn cfn-monitor-props-builder
  "Creates a  `CfnMonitorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitor-props-builder> (new CfnMonitorProps$Builder) id config))


(defn cfn-monitor-s3-config-property-builder>
  "The cfn-monitor-s3-config-property-builder> function updates a CfnMonitor$S3ConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitor$S3ConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `logDeliveryStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-status` |
"
  [^CfnMonitor$S3ConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :log-delivery-status)]
    (. builder logDeliveryStatus data))
  (.build builder))


(defn cfn-monitor-s3-config-property-builder
  "Creates a  `CfnMonitor$S3ConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitor-s3-config-property-builder> (new CfnMonitor$S3ConfigProperty$Builder) id config))