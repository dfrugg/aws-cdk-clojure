(ns cdk.api.services.applicationinsights
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.applicationinsights package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.applicationinsights CfnApplication$AlarmMetricProperty$Builder
                                                                CfnApplication$AlarmProperty$Builder
                                                                CfnApplication$Builder
                                                                CfnApplication$ComponentConfigurationProperty$Builder
                                                                CfnApplication$ComponentMonitoringSettingProperty$Builder
                                                                CfnApplication$ConfigurationDetailsProperty$Builder
                                                                CfnApplication$CustomComponentProperty$Builder
                                                                CfnApplication$HAClusterPrometheusExporterProperty$Builder
                                                                CfnApplication$HANAPrometheusExporterProperty$Builder
                                                                CfnApplication$JMXPrometheusExporterProperty$Builder
                                                                CfnApplication$LogPatternProperty$Builder
                                                                CfnApplication$LogPatternSetProperty$Builder
                                                                CfnApplication$LogProperty$Builder
                                                                CfnApplication$SubComponentConfigurationDetailsProperty$Builder
                                                                CfnApplication$SubComponentTypeConfigurationProperty$Builder
                                                                CfnApplication$WindowsEventProperty$Builder
                                                                CfnApplicationProps$Builder]))


(defn cfn-application-alarm-metric-property-builder
  "The cfn-application-alarm-metric-property-builder function buildes out new instances of 
CfnApplication$AlarmMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmMetricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-metric-name` |"
  [stack id config]
  (let [builder (CfnApplication$AlarmMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-metric-name)]
      (. builder alarmMetricName data))
    (.build builder)))


(defn cfn-application-alarm-property-builder
  "The cfn-application-alarm-property-builder function buildes out new instances of 
CfnApplication$AlarmProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |"
  [stack id config]
  (let [builder (CfnApplication$AlarmProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :severity)]
      (. builder severity data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachMissingPermission` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attach-missing-permission` |
| `autoConfigurationEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-configuration-enabled` |
| `componentMonitoringSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:component-monitoring-settings` |
| `customComponents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-components` |
| `cweMonitorEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cwe-monitor-enabled` |
| `groupingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:grouping-type` |
| `logPatternSets` | java.util.List | [[cdk.support/lookup-entry]] | `:log-pattern-sets` |
| `opsCenterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ops-center-enabled` |
| `opsItemSnsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ops-item-sns-topic-arn` |
| `resourceGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attach-missing-permission)]
      (. builder attachMissingPermission data))
    (when-let [data (lookup-entry config id :auto-configuration-enabled)]
      (. builder autoConfigurationEnabled data))
    (when-let [data (lookup-entry config id :component-monitoring-settings)]
      (. builder componentMonitoringSettings data))
    (when-let [data (lookup-entry config id :custom-components)]
      (. builder customComponents data))
    (when-let [data (lookup-entry config id :cwe-monitor-enabled)]
      (. builder cweMonitorEnabled data))
    (when-let [data (lookup-entry config id :grouping-type)]
      (. builder groupingType data))
    (when-let [data (lookup-entry config id :log-pattern-sets)]
      (. builder logPatternSets data))
    (when-let [data (lookup-entry config id :ops-center-enabled)]
      (. builder opsCenterEnabled data))
    (when-let [data (lookup-entry config id :ops-item-sns-topic-arn)]
      (. builder opsItemSnsTopicArn data))
    (when-let [data (lookup-entry config id :resource-group-name)]
      (. builder resourceGroupName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-component-configuration-property-builder
  "The cfn-application-component-configuration-property-builder function buildes out new instances of 
CfnApplication$ComponentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationDetails` | software.amazon.awscdk.services.applicationinsights.CfnApplication$ConfigurationDetailsProperty | [[cdk.support/lookup-entry]] | `:configuration-details` |
| `subComponentTypeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sub-component-type-configurations` |"
  [stack id config]
  (let [builder (CfnApplication$ComponentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :configuration-details)]
      (. builder configurationDetails data))
    (when-let [data (lookup-entry config id :sub-component-type-configurations)]
      (. builder subComponentTypeConfigurations data))
    (.build builder)))


(defn cfn-application-component-monitoring-setting-property-builder
  "The cfn-application-component-monitoring-setting-property-builder function buildes out new instances of 
CfnApplication$ComponentMonitoringSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `componentConfigurationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-configuration-mode` |
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `customComponentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-component-configuration` |
| `defaultOverwriteComponentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-overwrite-component-configuration` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |"
  [stack id config]
  (let [builder (CfnApplication$ComponentMonitoringSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-arn)]
      (. builder componentArn data))
    (when-let [data (lookup-entry config id :component-configuration-mode)]
      (. builder componentConfigurationMode data))
    (when-let [data (lookup-entry config id :component-name)]
      (. builder componentName data))
    (when-let [data (lookup-entry config id :custom-component-configuration)]
      (. builder customComponentConfiguration data))
    (when-let [data (lookup-entry config id :default-overwrite-component-configuration)]
      (. builder defaultOverwriteComponentConfiguration data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (.build builder)))


(defn cfn-application-configuration-details-property-builder
  "The cfn-application-configuration-details-property-builder function buildes out new instances of 
CfnApplication$ConfigurationDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-metrics` |
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `haClusterPrometheusExporter` | software.amazon.awscdk.services.applicationinsights.CfnApplication$HAClusterPrometheusExporterProperty | [[cdk.support/lookup-entry]] | `:ha-cluster-prometheus-exporter` |
| `hanaPrometheusExporter` | software.amazon.awscdk.services.applicationinsights.CfnApplication$HANAPrometheusExporterProperty | [[cdk.support/lookup-entry]] | `:hana-prometheus-exporter` |
| `jmxPrometheusExporter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jmx-prometheus-exporter` |
| `logs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logs` |
| `windowsEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:windows-events` |"
  [stack id config]
  (let [builder (CfnApplication$ConfigurationDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-metrics)]
      (. builder alarmMetrics data))
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :ha-cluster-prometheus-exporter)]
      (. builder haClusterPrometheusExporter data))
    (when-let [data (lookup-entry config id :hana-prometheus-exporter)]
      (. builder hanaPrometheusExporter data))
    (when-let [data (lookup-entry config id :jmx-prometheus-exporter)]
      (. builder jmxPrometheusExporter data))
    (when-let [data (lookup-entry config id :logs)]
      (. builder logs data))
    (when-let [data (lookup-entry config id :windows-events)]
      (. builder windowsEvents data))
    (.build builder)))


(defn cfn-application-custom-component-property-builder
  "The cfn-application-custom-component-property-builder function buildes out new instances of 
CfnApplication$CustomComponentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `resourceList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-list` |"
  [stack id config]
  (let [builder (CfnApplication$CustomComponentProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-name)]
      (. builder componentName data))
    (when-let [data (lookup-entry config id :resource-list)]
      (. builder resourceList data))
    (.build builder)))


(defn cfn-application-ha-cluster-prometheus-exporter-property-builder
  "The cfn-application-ha-cluster-prometheus-exporter-property-builder function buildes out new instances of 
CfnApplication$HAClusterPrometheusExporterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prometheusPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:prometheus-port` |"
  [stack id config]
  (let [builder (CfnApplication$HAClusterPrometheusExporterProperty$Builder.)]
    (when-let [data (lookup-entry config id :prometheus-port)]
      (. builder prometheusPort data))
    (.build builder)))


(defn cfn-application-hana-prometheus-exporter-property-builder
  "The cfn-application-hana-prometheus-exporter-property-builder function buildes out new instances of 
CfnApplication$HANAPrometheusExporterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agreeToInstallHanadbClient` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:agree-to-install-hanadb-client` |
| `hanaPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:hana-port` |
| `hanaSecretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hana-secret-name` |
| `hanasid` | java.lang.String | [[cdk.support/lookup-entry]] | `:hanasid` |
| `prometheusPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:prometheus-port` |"
  [stack id config]
  (let [builder (CfnApplication$HANAPrometheusExporterProperty$Builder.)]
    (when-let [data (lookup-entry config id :agree-to-install-hanadb-client)]
      (. builder agreeToInstallHanadbClient data))
    (when-let [data (lookup-entry config id :hana-port)]
      (. builder hanaPort data))
    (when-let [data (lookup-entry config id :hana-secret-name)]
      (. builder hanaSecretName data))
    (when-let [data (lookup-entry config id :hanasid)]
      (. builder hanasid data))
    (when-let [data (lookup-entry config id :prometheus-port)]
      (. builder prometheusPort data))
    (.build builder)))


(defn cfn-application-jmx-prometheus-exporter-property-builder
  "The cfn-application-jmx-prometheus-exporter-property-builder function buildes out new instances of 
CfnApplication$JMXPrometheusExporterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-port` |
| `jmxurl` | java.lang.String | [[cdk.support/lookup-entry]] | `:jmxurl` |
| `prometheusPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:prometheus-port` |"
  [stack id config]
  (let [builder (CfnApplication$JMXPrometheusExporterProperty$Builder.)]
    (when-let [data (lookup-entry config id :host-port)]
      (. builder hostPort data))
    (when-let [data (lookup-entry config id :jmxurl)]
      (. builder jmxurl data))
    (when-let [data (lookup-entry config id :prometheus-port)]
      (. builder prometheusPort data))
    (.build builder)))


(defn cfn-application-log-pattern-property-builder
  "The cfn-application-log-pattern-property-builder function buildes out new instances of 
CfnApplication$LogPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `patternName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-name` |
| `rank` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rank` |"
  [stack id config]
  (let [builder (CfnApplication$LogPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :pattern-name)]
      (. builder patternName data))
    (when-let [data (lookup-entry config id :rank)]
      (. builder rank data))
    (.build builder)))


(defn cfn-application-log-pattern-set-property-builder
  "The cfn-application-log-pattern-set-property-builder function buildes out new instances of 
CfnApplication$LogPatternSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:log-patterns` |
| `patternSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-set-name` |"
  [stack id config]
  (let [builder (CfnApplication$LogPatternSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-patterns)]
      (. builder logPatterns data))
    (when-let [data (lookup-entry config id :pattern-set-name)]
      (. builder patternSetName data))
    (.build builder)))


(defn cfn-application-log-property-builder
  "The cfn-application-log-property-builder function buildes out new instances of 
CfnApplication$LogProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-path` |
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
| `patternSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-set` |"
  [stack id config]
  (let [builder (CfnApplication$LogProperty$Builder.)]
    (when-let [data (lookup-entry config id :encoding)]
      (. builder encoding data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-path)]
      (. builder logPath data))
    (when-let [data (lookup-entry config id :log-type)]
      (. builder logType data))
    (when-let [data (lookup-entry config id :pattern-set)]
      (. builder patternSet data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachMissingPermission` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attach-missing-permission` |
| `autoConfigurationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-configuration-enabled` |
| `componentMonitoringSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:component-monitoring-settings` |
| `customComponents` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-components` |
| `cweMonitorEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cwe-monitor-enabled` |
| `groupingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:grouping-type` |
| `logPatternSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-pattern-sets` |
| `opsCenterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ops-center-enabled` |
| `opsItemSnsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ops-item-sns-topic-arn` |
| `resourceGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :attach-missing-permission)]
      (. builder attachMissingPermission data))
    (when-let [data (lookup-entry config id :auto-configuration-enabled)]
      (. builder autoConfigurationEnabled data))
    (when-let [data (lookup-entry config id :component-monitoring-settings)]
      (. builder componentMonitoringSettings data))
    (when-let [data (lookup-entry config id :custom-components)]
      (. builder customComponents data))
    (when-let [data (lookup-entry config id :cwe-monitor-enabled)]
      (. builder cweMonitorEnabled data))
    (when-let [data (lookup-entry config id :grouping-type)]
      (. builder groupingType data))
    (when-let [data (lookup-entry config id :log-pattern-sets)]
      (. builder logPatternSets data))
    (when-let [data (lookup-entry config id :ops-center-enabled)]
      (. builder opsCenterEnabled data))
    (when-let [data (lookup-entry config id :ops-item-sns-topic-arn)]
      (. builder opsItemSnsTopicArn data))
    (when-let [data (lookup-entry config id :resource-group-name)]
      (. builder resourceGroupName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-sub-component-configuration-details-property-builder
  "The cfn-application-sub-component-configuration-details-property-builder function buildes out new instances of 
CfnApplication$SubComponentConfigurationDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-metrics` |
| `logs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logs` |
| `windowsEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:windows-events` |"
  [stack id config]
  (let [builder (CfnApplication$SubComponentConfigurationDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-metrics)]
      (. builder alarmMetrics data))
    (when-let [data (lookup-entry config id :logs)]
      (. builder logs data))
    (when-let [data (lookup-entry config id :windows-events)]
      (. builder windowsEvents data))
    (.build builder)))


(defn cfn-application-sub-component-type-configuration-property-builder
  "The cfn-application-sub-component-type-configuration-property-builder function buildes out new instances of 
CfnApplication$SubComponentTypeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subComponentConfigurationDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sub-component-configuration-details` |
| `subComponentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sub-component-type` |"
  [stack id config]
  (let [builder (CfnApplication$SubComponentTypeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sub-component-configuration-details)]
      (. builder subComponentConfigurationDetails data))
    (when-let [data (lookup-entry config id :sub-component-type)]
      (. builder subComponentType data))
    (.build builder)))


(defn cfn-application-windows-event-property-builder
  "The cfn-application-windows-event-property-builder function buildes out new instances of 
CfnApplication$WindowsEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventLevels` | java.util.List | [[cdk.support/lookup-entry]] | `:event-levels` |
| `eventName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `patternSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-set` |"
  [stack id config]
  (let [builder (CfnApplication$WindowsEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-levels)]
      (. builder eventLevels data))
    (when-let [data (lookup-entry config id :event-name)]
      (. builder eventName data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :pattern-set)]
      (. builder patternSet data))
    (.build builder)))