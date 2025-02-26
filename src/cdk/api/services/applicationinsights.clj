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


(defn build-cfn-application-alarm-metric-property-builder
  "The build-cfn-application-alarm-metric-property-builder function updates a CfnApplication$AlarmMetricProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$AlarmMetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmMetricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-metric-name` |
"
  [^CfnApplication$AlarmMetricProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-metric-name)]
    (. builder alarmMetricName data))
  (.build builder))


(defn cfn-application-alarm-metric-property-builder
  "Creates a  `CfnApplication$AlarmMetricProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-alarm-metric-property-builder (new CfnApplication$AlarmMetricProperty$Builder) id config))


(defn build-cfn-application-alarm-property-builder
  "The build-cfn-application-alarm-property-builder function updates a CfnApplication$AlarmProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$AlarmProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
"
  [^CfnApplication$AlarmProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :severity)]
    (. builder severity data))
  (.build builder))


(defn cfn-application-alarm-property-builder
  "Creates a  `CfnApplication$AlarmProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-alarm-property-builder (new CfnApplication$AlarmProperty$Builder) id config))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :attach-missing-permission)]
    (. builder attachMissingPermission data))
  (when-some [data (lookup-entry config id :auto-configuration-enabled)]
    (. builder autoConfigurationEnabled data))
  (when-some [data (lookup-entry config id :component-monitoring-settings)]
    (. builder componentMonitoringSettings data))
  (when-some [data (lookup-entry config id :custom-components)]
    (. builder customComponents data))
  (when-some [data (lookup-entry config id :cwe-monitor-enabled)]
    (. builder cweMonitorEnabled data))
  (when-some [data (lookup-entry config id :grouping-type)]
    (. builder groupingType data))
  (when-some [data (lookup-entry config id :log-pattern-sets)]
    (. builder logPatternSets data))
  (when-some [data (lookup-entry config id :ops-center-enabled)]
    (. builder opsCenterEnabled data))
  (when-some [data (lookup-entry config id :ops-item-sns-topic-arn)]
    (. builder opsItemSnsTopicArn data))
  (when-some [data (lookup-entry config id :resource-group-name)]
    (. builder resourceGroupName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-component-configuration-property-builder
  "The build-cfn-application-component-configuration-property-builder function updates a CfnApplication$ComponentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ComponentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationDetails` | software.amazon.awscdk.services.applicationinsights.CfnApplication$ConfigurationDetailsProperty | [[cdk.support/lookup-entry]] | `:configuration-details` |
| `subComponentTypeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sub-component-type-configurations` |
"
  [^CfnApplication$ComponentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-details)]
    (. builder configurationDetails data))
  (when-some [data (lookup-entry config id :sub-component-type-configurations)]
    (. builder subComponentTypeConfigurations data))
  (.build builder))


(defn cfn-application-component-configuration-property-builder
  "Creates a  `CfnApplication$ComponentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-component-configuration-property-builder (new CfnApplication$ComponentConfigurationProperty$Builder) id config))


(defn build-cfn-application-component-monitoring-setting-property-builder
  "The build-cfn-application-component-monitoring-setting-property-builder function updates a CfnApplication$ComponentMonitoringSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ComponentMonitoringSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `componentConfigurationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-configuration-mode` |
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `customComponentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-component-configuration` |
| `defaultOverwriteComponentConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-overwrite-component-configuration` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
"
  [^CfnApplication$ComponentMonitoringSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-arn)]
    (. builder componentArn data))
  (when-some [data (lookup-entry config id :component-configuration-mode)]
    (. builder componentConfigurationMode data))
  (when-some [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-some [data (lookup-entry config id :custom-component-configuration)]
    (. builder customComponentConfiguration data))
  (when-some [data (lookup-entry config id :default-overwrite-component-configuration)]
    (. builder defaultOverwriteComponentConfiguration data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (.build builder))


(defn cfn-application-component-monitoring-setting-property-builder
  "Creates a  `CfnApplication$ComponentMonitoringSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-component-monitoring-setting-property-builder (new CfnApplication$ComponentMonitoringSettingProperty$Builder) id config))


(defn build-cfn-application-configuration-details-property-builder
  "The build-cfn-application-configuration-details-property-builder function updates a CfnApplication$ConfigurationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ConfigurationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-metrics` |
| `alarms` | java.util.List | [[cdk.support/lookup-entry]] | `:alarms` |
| `haClusterPrometheusExporter` | software.amazon.awscdk.services.applicationinsights.CfnApplication$HAClusterPrometheusExporterProperty | [[cdk.support/lookup-entry]] | `:ha-cluster-prometheus-exporter` |
| `hanaPrometheusExporter` | software.amazon.awscdk.services.applicationinsights.CfnApplication$HANAPrometheusExporterProperty | [[cdk.support/lookup-entry]] | `:hana-prometheus-exporter` |
| `jmxPrometheusExporter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jmx-prometheus-exporter` |
| `logs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logs` |
| `windowsEvents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:windows-events` |
"
  [^CfnApplication$ConfigurationDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-metrics)]
    (. builder alarmMetrics data))
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :ha-cluster-prometheus-exporter)]
    (. builder haClusterPrometheusExporter data))
  (when-some [data (lookup-entry config id :hana-prometheus-exporter)]
    (. builder hanaPrometheusExporter data))
  (when-some [data (lookup-entry config id :jmx-prometheus-exporter)]
    (. builder jmxPrometheusExporter data))
  (when-some [data (lookup-entry config id :logs)]
    (. builder logs data))
  (when-some [data (lookup-entry config id :windows-events)]
    (. builder windowsEvents data))
  (.build builder))


(defn cfn-application-configuration-details-property-builder
  "Creates a  `CfnApplication$ConfigurationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-configuration-details-property-builder (new CfnApplication$ConfigurationDetailsProperty$Builder) id config))


(defn build-cfn-application-custom-component-property-builder
  "The build-cfn-application-custom-component-property-builder function updates a CfnApplication$CustomComponentProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CustomComponentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `resourceList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-list` |
"
  [^CfnApplication$CustomComponentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-some [data (lookup-entry config id :resource-list)]
    (. builder resourceList data))
  (.build builder))


(defn cfn-application-custom-component-property-builder
  "Creates a  `CfnApplication$CustomComponentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-custom-component-property-builder (new CfnApplication$CustomComponentProperty$Builder) id config))


(defn build-cfn-application-ha-cluster-prometheus-exporter-property-builder
  "The build-cfn-application-ha-cluster-prometheus-exporter-property-builder function updates a CfnApplication$HAClusterPrometheusExporterProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$HAClusterPrometheusExporterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prometheusPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:prometheus-port` |
"
  [^CfnApplication$HAClusterPrometheusExporterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :prometheus-port)]
    (. builder prometheusPort data))
  (.build builder))


(defn cfn-application-ha-cluster-prometheus-exporter-property-builder
  "Creates a  `CfnApplication$HAClusterPrometheusExporterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-ha-cluster-prometheus-exporter-property-builder (new CfnApplication$HAClusterPrometheusExporterProperty$Builder) id config))


(defn build-cfn-application-hana-prometheus-exporter-property-builder
  "The build-cfn-application-hana-prometheus-exporter-property-builder function updates a CfnApplication$HANAPrometheusExporterProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$HANAPrometheusExporterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agreeToInstallHanadbClient` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:agree-to-install-hanadb-client` |
| `hanaPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:hana-port` |
| `hanaSecretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hana-secret-name` |
| `hanasid` | java.lang.String | [[cdk.support/lookup-entry]] | `:hanasid` |
| `prometheusPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:prometheus-port` |
"
  [^CfnApplication$HANAPrometheusExporterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :agree-to-install-hanadb-client)]
    (. builder agreeToInstallHanadbClient data))
  (when-some [data (lookup-entry config id :hana-port)]
    (. builder hanaPort data))
  (when-some [data (lookup-entry config id :hana-secret-name)]
    (. builder hanaSecretName data))
  (when-some [data (lookup-entry config id :hanasid)]
    (. builder hanasid data))
  (when-some [data (lookup-entry config id :prometheus-port)]
    (. builder prometheusPort data))
  (.build builder))


(defn cfn-application-hana-prometheus-exporter-property-builder
  "Creates a  `CfnApplication$HANAPrometheusExporterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-hana-prometheus-exporter-property-builder (new CfnApplication$HANAPrometheusExporterProperty$Builder) id config))


(defn build-cfn-application-jmx-prometheus-exporter-property-builder
  "The build-cfn-application-jmx-prometheus-exporter-property-builder function updates a CfnApplication$JMXPrometheusExporterProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$JMXPrometheusExporterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-port` |
| `jmxurl` | java.lang.String | [[cdk.support/lookup-entry]] | `:jmxurl` |
| `prometheusPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:prometheus-port` |
"
  [^CfnApplication$JMXPrometheusExporterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :host-port)]
    (. builder hostPort data))
  (when-some [data (lookup-entry config id :jmxurl)]
    (. builder jmxurl data))
  (when-some [data (lookup-entry config id :prometheus-port)]
    (. builder prometheusPort data))
  (.build builder))


(defn cfn-application-jmx-prometheus-exporter-property-builder
  "Creates a  `CfnApplication$JMXPrometheusExporterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-jmx-prometheus-exporter-property-builder (new CfnApplication$JMXPrometheusExporterProperty$Builder) id config))


(defn build-cfn-application-log-pattern-property-builder
  "The build-cfn-application-log-pattern-property-builder function updates a CfnApplication$LogPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$LogPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `patternName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-name` |
| `rank` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rank` |
"
  [^CfnApplication$LogPatternProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-some [data (lookup-entry config id :pattern-name)]
    (. builder patternName data))
  (when-some [data (lookup-entry config id :rank)]
    (. builder rank data))
  (.build builder))


(defn cfn-application-log-pattern-property-builder
  "Creates a  `CfnApplication$LogPatternProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-log-pattern-property-builder (new CfnApplication$LogPatternProperty$Builder) id config))


(defn build-cfn-application-log-pattern-set-property-builder
  "The build-cfn-application-log-pattern-set-property-builder function updates a CfnApplication$LogPatternSetProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$LogPatternSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:log-patterns` |
| `patternSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-set-name` |
"
  [^CfnApplication$LogPatternSetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-patterns)]
    (. builder logPatterns data))
  (when-some [data (lookup-entry config id :pattern-set-name)]
    (. builder patternSetName data))
  (.build builder))


(defn cfn-application-log-pattern-set-property-builder
  "Creates a  `CfnApplication$LogPatternSetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-log-pattern-set-property-builder (new CfnApplication$LogPatternSetProperty$Builder) id config))


(defn build-cfn-application-log-property-builder
  "The build-cfn-application-log-property-builder function updates a CfnApplication$LogProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$LogProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-path` |
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
| `patternSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-set` |
"
  [^CfnApplication$LogProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encoding)]
    (. builder encoding data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-path)]
    (. builder logPath data))
  (when-some [data (lookup-entry config id :log-type)]
    (. builder logType data))
  (when-some [data (lookup-entry config id :pattern-set)]
    (. builder patternSet data))
  (.build builder))


(defn cfn-application-log-property-builder
  "Creates a  `CfnApplication$LogProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-log-property-builder (new CfnApplication$LogProperty$Builder) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attach-missing-permission)]
    (. builder attachMissingPermission data))
  (when-some [data (lookup-entry config id :auto-configuration-enabled)]
    (. builder autoConfigurationEnabled data))
  (when-some [data (lookup-entry config id :component-monitoring-settings)]
    (. builder componentMonitoringSettings data))
  (when-some [data (lookup-entry config id :custom-components)]
    (. builder customComponents data))
  (when-some [data (lookup-entry config id :cwe-monitor-enabled)]
    (. builder cweMonitorEnabled data))
  (when-some [data (lookup-entry config id :grouping-type)]
    (. builder groupingType data))
  (when-some [data (lookup-entry config id :log-pattern-sets)]
    (. builder logPatternSets data))
  (when-some [data (lookup-entry config id :ops-center-enabled)]
    (. builder opsCenterEnabled data))
  (when-some [data (lookup-entry config id :ops-item-sns-topic-arn)]
    (. builder opsItemSnsTopicArn data))
  (when-some [data (lookup-entry config id :resource-group-name)]
    (. builder resourceGroupName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))


(defn build-cfn-application-sub-component-configuration-details-property-builder
  "The build-cfn-application-sub-component-configuration-details-property-builder function updates a CfnApplication$SubComponentConfigurationDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$SubComponentConfigurationDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-metrics` |
| `logs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logs` |
| `windowsEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:windows-events` |
"
  [^CfnApplication$SubComponentConfigurationDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-metrics)]
    (. builder alarmMetrics data))
  (when-some [data (lookup-entry config id :logs)]
    (. builder logs data))
  (when-some [data (lookup-entry config id :windows-events)]
    (. builder windowsEvents data))
  (.build builder))


(defn cfn-application-sub-component-configuration-details-property-builder
  "Creates a  `CfnApplication$SubComponentConfigurationDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-sub-component-configuration-details-property-builder (new CfnApplication$SubComponentConfigurationDetailsProperty$Builder) id config))


(defn build-cfn-application-sub-component-type-configuration-property-builder
  "The build-cfn-application-sub-component-type-configuration-property-builder function updates a CfnApplication$SubComponentTypeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$SubComponentTypeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subComponentConfigurationDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sub-component-configuration-details` |
| `subComponentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sub-component-type` |
"
  [^CfnApplication$SubComponentTypeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sub-component-configuration-details)]
    (. builder subComponentConfigurationDetails data))
  (when-some [data (lookup-entry config id :sub-component-type)]
    (. builder subComponentType data))
  (.build builder))


(defn cfn-application-sub-component-type-configuration-property-builder
  "Creates a  `CfnApplication$SubComponentTypeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-sub-component-type-configuration-property-builder (new CfnApplication$SubComponentTypeConfigurationProperty$Builder) id config))


(defn build-cfn-application-windows-event-property-builder
  "The build-cfn-application-windows-event-property-builder function updates a CfnApplication$WindowsEventProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$WindowsEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventLevels` | java.util.List | [[cdk.support/lookup-entry]] | `:event-levels` |
| `eventName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `patternSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern-set` |
"
  [^CfnApplication$WindowsEventProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-levels)]
    (. builder eventLevels data))
  (when-some [data (lookup-entry config id :event-name)]
    (. builder eventName data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :pattern-set)]
    (. builder patternSet data))
  (.build builder))


(defn cfn-application-windows-event-property-builder
  "Creates a  `CfnApplication$WindowsEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-windows-event-property-builder (new CfnApplication$WindowsEventProperty$Builder) id config))