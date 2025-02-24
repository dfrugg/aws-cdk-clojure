(ns cdk.api.services.devopsguru
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.devopsguru package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.devopsguru CfnLogAnomalyDetectionIntegration$Builder
                                                       CfnLogAnomalyDetectionIntegrationProps$Builder
                                                       CfnNotificationChannel$Builder
                                                       CfnNotificationChannel$NotificationChannelConfigProperty$Builder
                                                       CfnNotificationChannel$NotificationFilterConfigProperty$Builder
                                                       CfnNotificationChannel$SnsChannelConfigProperty$Builder
                                                       CfnNotificationChannelProps$Builder
                                                       CfnResourceCollection$Builder
                                                       CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder
                                                       CfnResourceCollection$ResourceCollectionFilterProperty$Builder
                                                       CfnResourceCollection$TagCollectionProperty$Builder
                                                       CfnResourceCollectionProps$Builder]))


(defn build-cfn-log-anomaly-detection-integration-builder
  "The build-cfn-log-anomaly-detection-integration-builder function updates a CfnLogAnomalyDetectionIntegration$Builder instance using the provided configuration.
  The function takes the CfnLogAnomalyDetectionIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnLogAnomalyDetectionIntegration$Builder builder id config]
  (.build builder))


(defn cfn-log-anomaly-detection-integration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-log-anomaly-detection-integration-builder (CfnLogAnomalyDetectionIntegration$Builder/create scope (name id)) id config))


(defn build-cfn-log-anomaly-detection-integration-props-builder
  "The build-cfn-log-anomaly-detection-integration-props-builder function updates a CfnLogAnomalyDetectionIntegrationProps$Builder instance using the provided configuration.
  The function takes the CfnLogAnomalyDetectionIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnLogAnomalyDetectionIntegrationProps$Builder builder id config]
  (.build builder))


(defn cfn-log-anomaly-detection-integration-props-builder
  ""
  [id config]
  (build-cfn-log-anomaly-detection-integration-props-builder (new CfnLogAnomalyDetectionIntegrationProps$Builder) id config))


(defn build-cfn-notification-channel-builder
  "The build-cfn-notification-channel-builder function updates a CfnNotificationChannel$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
"
  [^CfnNotificationChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :config)]
    (. builder config data))
  (.build builder))


(defn cfn-notification-channel-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-notification-channel-builder (CfnNotificationChannel$Builder/create scope (name id)) id config))


(defn build-cfn-notification-channel-notification-channel-config-property-builder
  "The build-cfn-notification-channel-notification-channel-config-property-builder function updates a CfnNotificationChannel$NotificationChannelConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannel$NotificationChannelConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |
"
  [^CfnNotificationChannel$NotificationChannelConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-let [data (lookup-entry config id :sns)]
    (. builder sns data))
  (.build builder))


(defn cfn-notification-channel-notification-channel-config-property-builder
  ""
  [id config]
  (build-cfn-notification-channel-notification-channel-config-property-builder (new CfnNotificationChannel$NotificationChannelConfigProperty$Builder) id config))


(defn build-cfn-notification-channel-notification-filter-config-property-builder
  "The build-cfn-notification-channel-notification-filter-config-property-builder function updates a CfnNotificationChannel$NotificationFilterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannel$NotificationFilterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:message-types` |
| `severities` | java.util.List | [[cdk.support/lookup-entry]] | `:severities` |
"
  [^CfnNotificationChannel$NotificationFilterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :message-types)]
    (. builder messageTypes data))
  (when-let [data (lookup-entry config id :severities)]
    (. builder severities data))
  (.build builder))


(defn cfn-notification-channel-notification-filter-config-property-builder
  ""
  [id config]
  (build-cfn-notification-channel-notification-filter-config-property-builder (new CfnNotificationChannel$NotificationFilterConfigProperty$Builder) id config))


(defn build-cfn-notification-channel-props-builder
  "The build-cfn-notification-channel-props-builder function updates a CfnNotificationChannelProps$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
"
  [^CfnNotificationChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :config)]
    (. builder config data))
  (.build builder))


(defn cfn-notification-channel-props-builder
  ""
  [id config]
  (build-cfn-notification-channel-props-builder (new CfnNotificationChannelProps$Builder) id config))


(defn build-cfn-notification-channel-sns-channel-config-property-builder
  "The build-cfn-notification-channel-sns-channel-config-property-builder function updates a CfnNotificationChannel$SnsChannelConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannel$SnsChannelConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnNotificationChannel$SnsChannelConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-notification-channel-sns-channel-config-property-builder
  ""
  [id config]
  (build-cfn-notification-channel-sns-channel-config-property-builder (new CfnNotificationChannel$SnsChannelConfigProperty$Builder) id config))


(defn build-cfn-resource-collection-builder
  "The build-cfn-resource-collection-builder function updates a CfnResourceCollection$Builder instance using the provided configuration.
  The function takes the CfnResourceCollection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceCollectionFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-collection-filter` |
"
  [^CfnResourceCollection$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-collection-filter)]
    (. builder resourceCollectionFilter data))
  (.build builder))


(defn cfn-resource-collection-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-collection-builder (CfnResourceCollection$Builder/create scope (name id)) id config))


(defn build-cfn-resource-collection-cloud-formation-collection-filter-property-builder
  "The build-cfn-resource-collection-cloud-formation-collection-filter-property-builder function updates a CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackNames` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-names` |
"
  [^CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :stack-names)]
    (. builder stackNames data))
  (.build builder))


(defn cfn-resource-collection-cloud-formation-collection-filter-property-builder
  ""
  [id config]
  (build-cfn-resource-collection-cloud-formation-collection-filter-property-builder (new CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder) id config))


(defn build-cfn-resource-collection-props-builder
  "The build-cfn-resource-collection-props-builder function updates a CfnResourceCollectionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceCollectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceCollectionFilter` | software.amazon.awscdk.services.devopsguru.CfnResourceCollection$ResourceCollectionFilterProperty | [[cdk.support/lookup-entry]] | `:resource-collection-filter` |
"
  [^CfnResourceCollectionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-collection-filter)]
    (. builder resourceCollectionFilter data))
  (.build builder))


(defn cfn-resource-collection-props-builder
  ""
  [id config]
  (build-cfn-resource-collection-props-builder (new CfnResourceCollectionProps$Builder) id config))


(defn build-cfn-resource-collection-resource-collection-filter-property-builder
  "The build-cfn-resource-collection-resource-collection-filter-property-builder function updates a CfnResourceCollection$ResourceCollectionFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceCollection$ResourceCollectionFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormation` | software.amazon.awscdk.services.devopsguru.CfnResourceCollection$CloudFormationCollectionFilterProperty | [[cdk.support/lookup-entry]] | `:cloud-formation` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceCollection$ResourceCollectionFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-formation)]
    (. builder cloudFormation data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-collection-resource-collection-filter-property-builder
  ""
  [id config]
  (build-cfn-resource-collection-resource-collection-filter-property-builder (new CfnResourceCollection$ResourceCollectionFilterProperty$Builder) id config))


(defn build-cfn-resource-collection-tag-collection-property-builder
  "The build-cfn-resource-collection-tag-collection-property-builder function updates a CfnResourceCollection$TagCollectionProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceCollection$TagCollectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appBoundaryKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-boundary-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |
"
  [^CfnResourceCollection$TagCollectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-boundary-key)]
    (. builder appBoundaryKey data))
  (when-let [data (lookup-entry config id :tag-values)]
    (. builder tagValues data))
  (.build builder))


(defn cfn-resource-collection-tag-collection-property-builder
  ""
  [id config]
  (build-cfn-resource-collection-tag-collection-property-builder (new CfnResourceCollection$TagCollectionProperty$Builder) id config))