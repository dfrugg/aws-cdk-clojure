(ns cdk.api.services.internetmonitor
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.internetmonitor package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.internetmonitor CfnMonitor$Builder
                                                            CfnMonitor$HealthEventsConfigProperty$Builder
                                                            CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder
                                                            CfnMonitor$LocalHealthEventsConfigProperty$Builder
                                                            CfnMonitor$S3ConfigProperty$Builder
                                                            CfnMonitorProps$Builder]))


(defn cfn-monitor-builder
  "The cfn-monitor-builder function buildes out new instances of 
CfnMonitor$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficPercentageToMonitor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-percentage-to-monitor` |"
  [stack id config]
  (let [builder (CfnMonitor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :health-events-config)]
      (. builder healthEventsConfig data))
    (when-let [data (lookup-entry config id :include-linked-accounts)]
      (. builder includeLinkedAccounts data))
    (when-let [data (lookup-entry config id :internet-measurements-log-delivery)]
      (. builder internetMeasurementsLogDelivery data))
    (when-let [data (lookup-entry config id :linked-account-id)]
      (. builder linkedAccountId data))
    (when-let [data (lookup-entry config id :max-city-networks-to-monitor)]
      (. builder maxCityNetworksToMonitor data))
    (when-let [data (lookup-entry config id :monitor-name)]
      (. builder monitorName data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :resources-to-add)]
      (. builder resourcesToAdd data))
    (when-let [data (lookup-entry config id :resources-to-remove)]
      (. builder resourcesToRemove data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :traffic-percentage-to-monitor)]
      (. builder trafficPercentageToMonitor data))
    (.build builder)))


(defn cfn-monitor-health-events-config-property-builder
  "The cfn-monitor-health-events-config-property-builder function buildes out new instances of 
CfnMonitor$HealthEventsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityLocalHealthEventsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:availability-local-health-events-config` |
| `availabilityScoreThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:availability-score-threshold` |
| `performanceLocalHealthEventsConfig` | software.amazon.awscdk.services.internetmonitor.CfnMonitor$LocalHealthEventsConfigProperty | [[cdk.support/lookup-entry]] | `:performance-local-health-events-config` |
| `performanceScoreThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:performance-score-threshold` |"
  [stack id config]
  (let [builder (CfnMonitor$HealthEventsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-local-health-events-config)]
      (. builder availabilityLocalHealthEventsConfig data))
    (when-let [data (lookup-entry config id :availability-score-threshold)]
      (. builder availabilityScoreThreshold data))
    (when-let [data (lookup-entry config id :performance-local-health-events-config)]
      (. builder performanceLocalHealthEventsConfig data))
    (when-let [data (lookup-entry config id :performance-score-threshold)]
      (. builder performanceScoreThreshold data))
    (.build builder)))


(defn cfn-monitor-internet-measurements-log-delivery-property-builder
  "The cfn-monitor-internet-measurements-log-delivery-property-builder function buildes out new instances of 
CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |"
  [stack id config]
  (let [builder (CfnMonitor$InternetMeasurementsLogDeliveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-config)]
      (. builder s3Config data))
    (.build builder)))


(defn cfn-monitor-local-health-events-config-property-builder
  "The cfn-monitor-local-health-events-config-property-builder function buildes out new instances of 
CfnMonitor$LocalHealthEventsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthScoreThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-score-threshold` |
| `minTrafficImpact` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-traffic-impact` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnMonitor$LocalHealthEventsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :health-score-threshold)]
      (. builder healthScoreThreshold data))
    (when-let [data (lookup-entry config id :min-traffic-impact)]
      (. builder minTrafficImpact data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-monitor-props-builder
  "The cfn-monitor-props-builder function buildes out new instances of 
CfnMonitorProps$Builder using the provided configuration.  Each field is set as follows:

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
| `trafficPercentageToMonitor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:traffic-percentage-to-monitor` |"
  [stack id config]
  (let [builder (CfnMonitorProps$Builder.)]
    (when-let [data (lookup-entry config id :health-events-config)]
      (. builder healthEventsConfig data))
    (when-let [data (lookup-entry config id :include-linked-accounts)]
      (. builder includeLinkedAccounts data))
    (when-let [data (lookup-entry config id :internet-measurements-log-delivery)]
      (. builder internetMeasurementsLogDelivery data))
    (when-let [data (lookup-entry config id :linked-account-id)]
      (. builder linkedAccountId data))
    (when-let [data (lookup-entry config id :max-city-networks-to-monitor)]
      (. builder maxCityNetworksToMonitor data))
    (when-let [data (lookup-entry config id :monitor-name)]
      (. builder monitorName data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :resources-to-add)]
      (. builder resourcesToAdd data))
    (when-let [data (lookup-entry config id :resources-to-remove)]
      (. builder resourcesToRemove data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :traffic-percentage-to-monitor)]
      (. builder trafficPercentageToMonitor data))
    (.build builder)))


(defn cfn-monitor-s3-config-property-builder
  "The cfn-monitor-s3-config-property-builder function buildes out new instances of 
CfnMonitor$S3ConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `logDeliveryStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-status` |"
  [stack id config]
  (let [builder (CfnMonitor$S3ConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :log-delivery-status)]
      (. builder logDeliveryStatus data))
    (.build builder)))