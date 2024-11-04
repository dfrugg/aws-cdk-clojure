(ns cdk.api.services.pinpointemail
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.pinpointemail package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.pinpointemail CfnConfigurationSet$Builder
                                                          CfnConfigurationSet$DeliveryOptionsProperty$Builder
                                                          CfnConfigurationSet$ReputationOptionsProperty$Builder
                                                          CfnConfigurationSet$SendingOptionsProperty$Builder
                                                          CfnConfigurationSet$TrackingOptionsProperty$Builder
                                                          CfnConfigurationSetEventDestination$Builder
                                                          CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder
                                                          CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder
                                                          CfnConfigurationSetEventDestination$EventDestinationProperty$Builder
                                                          CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder
                                                          CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder
                                                          CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder
                                                          CfnConfigurationSetEventDestinationProps$Builder
                                                          CfnConfigurationSetProps$Builder
                                                          CfnDedicatedIpPool$Builder
                                                          CfnDedicatedIpPoolProps$Builder
                                                          CfnIdentity$Builder
                                                          CfnIdentity$MailFromAttributesProperty$Builder
                                                          CfnIdentityProps$Builder]))


(defn cfn-configuration-set-builder
  "The cfn-configuration-set-builder function buildes out new instances of 
CfnConfigurationSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$SendingOptionsProperty | [[cdk.support/lookup-entry]] | `:sending-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$TrackingOptionsProperty | [[cdk.support/lookup-entry]] | `:tracking-options` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delivery-options)]
      (. builder deliveryOptions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reputation-options)]
      (. builder reputationOptions data))
    (when-let [data (lookup-entry config id :sending-options)]
      (. builder sendingOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracking-options)]
      (. builder trackingOptions data))
    (.build builder)))


(defn cfn-configuration-set-delivery-options-property-builder
  "The cfn-configuration-set-delivery-options-property-builder function buildes out new instances of 
CfnConfigurationSet$DeliveryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sendingPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sending-pool-name` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$DeliveryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :sending-pool-name)]
      (. builder sendingPoolName data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-builder
  "The cfn-configuration-set-event-destination-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$EventDestinationProperty | [[cdk.support/lookup-entry]] | `:event-destination` |
| `eventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-destination-name` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (when-let [data (lookup-entry config id :event-destination)]
      (. builder eventDestination data))
    (when-let [data (lookup-entry config id :event-destination-name)]
      (. builder eventDestinationName data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-cloud-watch-destination-property-builder
  "The cfn-configuration-set-event-destination-cloud-watch-destination-property-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:dimension-configurations` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-configurations)]
      (. builder dimensionConfigurations data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-dimension-configuration-property-builder
  "The cfn-configuration-set-event-destination-dimension-configuration-property-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultDimensionValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-dimension-value` |
| `dimensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-name` |
| `dimensionValueSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-value-source` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-dimension-value)]
      (. builder defaultDimensionValue data))
    (when-let [data (lookup-entry config id :dimension-name)]
      (. builder dimensionName data))
    (when-let [data (lookup-entry config id :dimension-value-source)]
      (. builder dimensionValueSource data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-event-destination-property-builder
  "The cfn-configuration-set-event-destination-event-destination-property-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$EventDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$CloudWatchDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `kinesisFirehoseDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-destination` |
| `matchingEventTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-event-types` |
| `pinpointDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$PinpointDestinationProperty | [[cdk.support/lookup-entry]] | `:pinpoint-destination` |
| `snsDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns-destination` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$EventDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-destination)]
      (. builder cloudWatchDestination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :kinesis-firehose-destination)]
      (. builder kinesisFirehoseDestination data))
    (when-let [data (lookup-entry config id :matching-event-types)]
      (. builder matchingEventTypes data))
    (when-let [data (lookup-entry config id :pinpoint-destination)]
      (. builder pinpointDestination data))
    (when-let [data (lookup-entry config id :sns-destination)]
      (. builder snsDestination data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-kinesis-firehose-destination-property-builder
  "The cfn-configuration-set-event-destination-kinesis-firehose-destination-property-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-arn` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-arn)]
      (. builder deliveryStreamArn data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-pinpoint-destination-property-builder
  "The cfn-configuration-set-event-destination-pinpoint-destination-property-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-arn)]
      (. builder applicationArn data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-props-builder
  "The cfn-configuration-set-event-destination-props-builder function buildes out new instances of 
CfnConfigurationSetEventDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$EventDestinationProperty | [[cdk.support/lookup-entry]] | `:event-destination` |
| `eventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-destination-name` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (when-let [data (lookup-entry config id :event-destination)]
      (. builder eventDestination data))
    (when-let [data (lookup-entry config id :event-destination-name)]
      (. builder eventDestinationName data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-sns-destination-property-builder
  "The cfn-configuration-set-event-destination-sns-destination-property-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-configuration-set-props-builder
  "The cfn-configuration-set-props-builder function buildes out new instances of 
CfnConfigurationSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$DeliveryOptionsProperty | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$ReputationOptionsProperty | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$SendingOptionsProperty | [[cdk.support/lookup-entry]] | `:sending-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$TrackingOptionsProperty | [[cdk.support/lookup-entry]] | `:tracking-options` |"
  [stack id config]
  (let [builder (CfnConfigurationSetProps$Builder.)]
    (when-let [data (lookup-entry config id :delivery-options)]
      (. builder deliveryOptions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reputation-options)]
      (. builder reputationOptions data))
    (when-let [data (lookup-entry config id :sending-options)]
      (. builder sendingOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracking-options)]
      (. builder trackingOptions data))
    (.build builder)))


(defn cfn-configuration-set-reputation-options-property-builder
  "The cfn-configuration-set-reputation-options-property-builder function buildes out new instances of 
CfnConfigurationSet$ReputationOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reputationMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reputation-metrics-enabled` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$ReputationOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :reputation-metrics-enabled)]
      (. builder reputationMetricsEnabled data))
    (.build builder)))


(defn cfn-configuration-set-sending-options-property-builder
  "The cfn-configuration-set-sending-options-property-builder function buildes out new instances of 
CfnConfigurationSet$SendingOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sendingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sending-enabled` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$SendingOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :sending-enabled)]
      (. builder sendingEnabled data))
    (.build builder)))


(defn cfn-configuration-set-tracking-options-property-builder
  "The cfn-configuration-set-tracking-options-property-builder function buildes out new instances of 
CfnConfigurationSet$TrackingOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRedirectDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-redirect-domain` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$TrackingOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-redirect-domain)]
      (. builder customRedirectDomain data))
    (.build builder)))


(defn cfn-dedicated-ip-pool-builder
  "The cfn-dedicated-ip-pool-builder function buildes out new instances of 
CfnDedicatedIpPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDedicatedIpPool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :pool-name)]
      (. builder poolName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dedicated-ip-pool-props-builder
  "The cfn-dedicated-ip-pool-props-builder function buildes out new instances of 
CfnDedicatedIpPoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDedicatedIpPoolProps$Builder.)]
    (when-let [data (lookup-entry config id :pool-name)]
      (. builder poolName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-identity-builder
  "The cfn-identity-builder function buildes out new instances of 
CfnIdentity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dkimSigningEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing-enabled` |
| `feedbackForwardingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:feedback-forwarding-enabled` |
| `mailFromAttributes` | software.amazon.awscdk.services.pinpointemail.CfnIdentity$MailFromAttributesProperty | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIdentity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dkim-signing-enabled)]
      (. builder dkimSigningEnabled data))
    (when-let [data (lookup-entry config id :feedback-forwarding-enabled)]
      (. builder feedbackForwardingEnabled data))
    (when-let [data (lookup-entry config id :mail-from-attributes)]
      (. builder mailFromAttributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-identity-mail-from-attributes-property-builder
  "The cfn-identity-mail-from-attributes-property-builder function buildes out new instances of 
CfnIdentity$MailFromAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviorOnMxFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |"
  [stack id config]
  (let [builder (CfnIdentity$MailFromAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :behavior-on-mx-failure)]
      (. builder behaviorOnMxFailure data))
    (when-let [data (lookup-entry config id :mail-from-domain)]
      (. builder mailFromDomain data))
    (.build builder)))


(defn cfn-identity-props-builder
  "The cfn-identity-props-builder function buildes out new instances of 
CfnIdentityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dkimSigningEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing-enabled` |
| `feedbackForwardingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:feedback-forwarding-enabled` |
| `mailFromAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIdentityProps$Builder.)]
    (when-let [data (lookup-entry config id :dkim-signing-enabled)]
      (. builder dkimSigningEnabled data))
    (when-let [data (lookup-entry config id :feedback-forwarding-enabled)]
      (. builder feedbackForwardingEnabled data))
    (when-let [data (lookup-entry config id :mail-from-attributes)]
      (. builder mailFromAttributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))