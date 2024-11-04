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


(defn cfn-log-anomaly-detection-integration-builder
  "The cfn-log-anomaly-detection-integration-builder function buildes out new instances of 
CfnLogAnomalyDetectionIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnLogAnomalyDetectionIntegration$Builder/create stack id)]
    (.build builder)))


(defn cfn-log-anomaly-detection-integration-props-builder
  "The cfn-log-anomaly-detection-integration-props-builder function buildes out new instances of 
CfnLogAnomalyDetectionIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnLogAnomalyDetectionIntegrationProps$Builder.)]
    (.build builder)))


(defn cfn-notification-channel-builder
  "The cfn-notification-channel-builder function buildes out new instances of 
CfnNotificationChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |"
  [stack id config]
  (let [builder (CfnNotificationChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config)]
      (. builder config data))
    (.build builder)))


(defn cfn-notification-channel-notification-channel-config-property-builder
  "The cfn-notification-channel-notification-channel-config-property-builder function buildes out new instances of 
CfnNotificationChannel$NotificationChannelConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |"
  [stack id config]
  (let [builder (CfnNotificationChannel$NotificationChannelConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :sns)]
      (. builder sns data))
    (.build builder)))


(defn cfn-notification-channel-notification-filter-config-property-builder
  "The cfn-notification-channel-notification-filter-config-property-builder function buildes out new instances of 
CfnNotificationChannel$NotificationFilterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:message-types` |
| `severities` | java.util.List | [[cdk.support/lookup-entry]] | `:severities` |"
  [stack id config]
  (let [builder (CfnNotificationChannel$NotificationFilterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :message-types)]
      (. builder messageTypes data))
    (when-let [data (lookup-entry config id :severities)]
      (. builder severities data))
    (.build builder)))


(defn cfn-notification-channel-props-builder
  "The cfn-notification-channel-props-builder function buildes out new instances of 
CfnNotificationChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |"
  [stack id config]
  (let [builder (CfnNotificationChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :config)]
      (. builder config data))
    (.build builder)))


(defn cfn-notification-channel-sns-channel-config-property-builder
  "The cfn-notification-channel-sns-channel-config-property-builder function buildes out new instances of 
CfnNotificationChannel$SnsChannelConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnNotificationChannel$SnsChannelConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-resource-collection-builder
  "The cfn-resource-collection-builder function buildes out new instances of 
CfnResourceCollection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceCollectionFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-collection-filter` |"
  [stack id config]
  (let [builder (CfnResourceCollection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-collection-filter)]
      (. builder resourceCollectionFilter data))
    (.build builder)))


(defn cfn-resource-collection-cloud-formation-collection-filter-property-builder
  "The cfn-resource-collection-cloud-formation-collection-filter-property-builder function buildes out new instances of 
CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackNames` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-names` |"
  [stack id config]
  (let [builder (CfnResourceCollection$CloudFormationCollectionFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :stack-names)]
      (. builder stackNames data))
    (.build builder)))


(defn cfn-resource-collection-props-builder
  "The cfn-resource-collection-props-builder function buildes out new instances of 
CfnResourceCollectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceCollectionFilter` | software.amazon.awscdk.services.devopsguru.CfnResourceCollection$ResourceCollectionFilterProperty | [[cdk.support/lookup-entry]] | `:resource-collection-filter` |"
  [stack id config]
  (let [builder (CfnResourceCollectionProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-collection-filter)]
      (. builder resourceCollectionFilter data))
    (.build builder)))


(defn cfn-resource-collection-resource-collection-filter-property-builder
  "The cfn-resource-collection-resource-collection-filter-property-builder function buildes out new instances of 
CfnResourceCollection$ResourceCollectionFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormation` | software.amazon.awscdk.services.devopsguru.CfnResourceCollection$CloudFormationCollectionFilterProperty | [[cdk.support/lookup-entry]] | `:cloud-formation` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceCollection$ResourceCollectionFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-formation)]
      (. builder cloudFormation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-collection-tag-collection-property-builder
  "The cfn-resource-collection-tag-collection-property-builder function buildes out new instances of 
CfnResourceCollection$TagCollectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appBoundaryKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-boundary-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |"
  [stack id config]
  (let [builder (CfnResourceCollection$TagCollectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-boundary-key)]
      (. builder appBoundaryKey data))
    (when-let [data (lookup-entry config id :tag-values)]
      (. builder tagValues data))
    (.build builder)))