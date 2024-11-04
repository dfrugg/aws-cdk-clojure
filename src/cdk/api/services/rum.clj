(ns cdk.api.services.rum
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rum package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.rum CfnAppMonitor$AppMonitorConfigurationProperty$Builder
                                                CfnAppMonitor$Builder
                                                CfnAppMonitor$CustomEventsProperty$Builder
                                                CfnAppMonitor$MetricDefinitionProperty$Builder
                                                CfnAppMonitor$MetricDestinationProperty$Builder
                                                CfnAppMonitorProps$Builder]))


(defn cfn-app-monitor-app-monitor-configuration-property-builder
  "The cfn-app-monitor-app-monitor-configuration-property-builder function buildes out new instances of 
CfnAppMonitor$AppMonitorConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `telemetries` | java.util.List | [[cdk.support/lookup-entry]] | `:telemetries` |"
  [stack id config]
  (let [builder (CfnAppMonitor$AppMonitorConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-cookies)]
      (. builder allowCookies data))
    (when-let [data (lookup-entry config id :enable-x-ray)]
      (. builder enableXRay data))
    (when-let [data (lookup-entry config id :excluded-pages)]
      (. builder excludedPages data))
    (when-let [data (lookup-entry config id :favorite-pages)]
      (. builder favoritePages data))
    (when-let [data (lookup-entry config id :guest-role-arn)]
      (. builder guestRoleArn data))
    (when-let [data (lookup-entry config id :identity-pool-id)]
      (. builder identityPoolId data))
    (when-let [data (lookup-entry config id :included-pages)]
      (. builder includedPages data))
    (when-let [data (lookup-entry config id :metric-destinations)]
      (. builder metricDestinations data))
    (when-let [data (lookup-entry config id :session-sample-rate)]
      (. builder sessionSampleRate data))
    (when-let [data (lookup-entry config id :telemetries)]
      (. builder telemetries data))
    (.build builder)))


(defn cfn-app-monitor-builder
  "The cfn-app-monitor-builder function buildes out new instances of 
CfnAppMonitor$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appMonitorConfiguration` | software.amazon.awscdk.services.rum.CfnAppMonitor$AppMonitorConfigurationProperty | [[cdk.support/lookup-entry]] | `:app-monitor-configuration` |
| `customEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-events` |
| `cwLogEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cw-log-enabled` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppMonitor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :app-monitor-configuration)]
      (. builder appMonitorConfiguration data))
    (when-let [data (lookup-entry config id :custom-events)]
      (. builder customEvents data))
    (when-let [data (lookup-entry config id :cw-log-enabled)]
      (. builder cwLogEnabled data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-monitor-custom-events-property-builder
  "The cfn-app-monitor-custom-events-property-builder function buildes out new instances of 
CfnAppMonitor$CustomEventsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnAppMonitor$CustomEventsProperty$Builder.)]
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-app-monitor-metric-definition-property-builder
  "The cfn-app-monitor-metric-definition-property-builder function buildes out new instances of 
CfnAppMonitor$MetricDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionKeys` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimension-keys` |
| `eventPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `unitLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-label` |
| `valueKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-key` |"
  [stack id config]
  (let [builder (CfnAppMonitor$MetricDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-keys)]
      (. builder dimensionKeys data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :unit-label)]
      (. builder unitLabel data))
    (when-let [data (lookup-entry config id :value-key)]
      (. builder valueKey data))
    (.build builder)))


(defn cfn-app-monitor-metric-destination-property-builder
  "The cfn-app-monitor-metric-destination-property-builder function buildes out new instances of 
CfnAppMonitor$MetricDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `metricDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-definitions` |"
  [stack id config]
  (let [builder (CfnAppMonitor$MetricDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :metric-definitions)]
      (. builder metricDefinitions data))
    (.build builder)))


(defn cfn-app-monitor-props-builder
  "The cfn-app-monitor-props-builder function buildes out new instances of 
CfnAppMonitorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appMonitorConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-monitor-configuration` |
| `customEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-events` |
| `cwLogEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cw-log-enabled` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppMonitorProps$Builder.)]
    (when-let [data (lookup-entry config id :app-monitor-configuration)]
      (. builder appMonitorConfiguration data))
    (when-let [data (lookup-entry config id :custom-events)]
      (. builder customEvents data))
    (when-let [data (lookup-entry config id :cw-log-enabled)]
      (. builder cwLogEnabled data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))