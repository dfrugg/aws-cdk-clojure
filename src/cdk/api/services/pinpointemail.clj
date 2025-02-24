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


(defn build-cfn-configuration-set-builder
  "The build-cfn-configuration-set-builder function updates a CfnConfigurationSet$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$SendingOptionsProperty | [[cdk.support/lookup-entry]] | `:sending-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$TrackingOptionsProperty | [[cdk.support/lookup-entry]] | `:tracking-options` |
"
  [^CfnConfigurationSet$Builder builder id config]
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
  (.build builder))


(defn cfn-configuration-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-configuration-set-builder (CfnConfigurationSet$Builder/create scope (name id)) id config))


(defn build-cfn-configuration-set-delivery-options-property-builder
  "The build-cfn-configuration-set-delivery-options-property-builder function updates a CfnConfigurationSet$DeliveryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$DeliveryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sendingPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sending-pool-name` |
"
  [^CfnConfigurationSet$DeliveryOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sending-pool-name)]
    (. builder sendingPoolName data))
  (.build builder))


(defn cfn-configuration-set-delivery-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-delivery-options-property-builder (new CfnConfigurationSet$DeliveryOptionsProperty$Builder) id config))


(defn build-cfn-configuration-set-event-destination-builder
  "The build-cfn-configuration-set-event-destination-builder function updates a CfnConfigurationSetEventDestination$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$EventDestinationProperty | [[cdk.support/lookup-entry]] | `:event-destination` |
| `eventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-destination-name` |
"
  [^CfnConfigurationSetEventDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-set-name)]
    (. builder configurationSetName data))
  (when-let [data (lookup-entry config id :event-destination)]
    (. builder eventDestination data))
  (when-let [data (lookup-entry config id :event-destination-name)]
    (. builder eventDestinationName data))
  (.build builder))


(defn cfn-configuration-set-event-destination-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-configuration-set-event-destination-builder (CfnConfigurationSetEventDestination$Builder/create scope (name id)) id config))


(defn build-cfn-configuration-set-event-destination-cloud-watch-destination-property-builder
  "The build-cfn-configuration-set-event-destination-cloud-watch-destination-property-builder function updates a CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:dimension-configurations` |
"
  [^CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimension-configurations)]
    (. builder dimensionConfigurations data))
  (.build builder))


(defn cfn-configuration-set-event-destination-cloud-watch-destination-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-cloud-watch-destination-property-builder (new CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder) id config))


(defn build-cfn-configuration-set-event-destination-dimension-configuration-property-builder
  "The build-cfn-configuration-set-event-destination-dimension-configuration-property-builder function updates a CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultDimensionValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-dimension-value` |
| `dimensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-name` |
| `dimensionValueSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-value-source` |
"
  [^CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-dimension-value)]
    (. builder defaultDimensionValue data))
  (when-let [data (lookup-entry config id :dimension-name)]
    (. builder dimensionName data))
  (when-let [data (lookup-entry config id :dimension-value-source)]
    (. builder dimensionValueSource data))
  (.build builder))


(defn cfn-configuration-set-event-destination-dimension-configuration-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-dimension-configuration-property-builder (new CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder) id config))


(defn build-cfn-configuration-set-event-destination-event-destination-property-builder
  "The build-cfn-configuration-set-event-destination-event-destination-property-builder function updates a CfnConfigurationSetEventDestination$EventDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$EventDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$CloudWatchDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `kinesisFirehoseDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-destination` |
| `matchingEventTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-event-types` |
| `pinpointDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$PinpointDestinationProperty | [[cdk.support/lookup-entry]] | `:pinpoint-destination` |
| `snsDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns-destination` |
"
  [^CfnConfigurationSetEventDestination$EventDestinationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-configuration-set-event-destination-event-destination-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-event-destination-property-builder (new CfnConfigurationSetEventDestination$EventDestinationProperty$Builder) id config))


(defn build-cfn-configuration-set-event-destination-kinesis-firehose-destination-property-builder
  "The build-cfn-configuration-set-event-destination-kinesis-firehose-destination-property-builder function updates a CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-arn` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
"
  [^CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream-arn)]
    (. builder deliveryStreamArn data))
  (when-let [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (.build builder))


(defn cfn-configuration-set-event-destination-kinesis-firehose-destination-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-kinesis-firehose-destination-property-builder (new CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder) id config))


(defn build-cfn-configuration-set-event-destination-pinpoint-destination-property-builder
  "The build-cfn-configuration-set-event-destination-pinpoint-destination-property-builder function updates a CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
"
  [^CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (.build builder))


(defn cfn-configuration-set-event-destination-pinpoint-destination-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-pinpoint-destination-property-builder (new CfnConfigurationSetEventDestination$PinpointDestinationProperty$Builder) id config))


(defn build-cfn-configuration-set-event-destination-props-builder
  "The build-cfn-configuration-set-event-destination-props-builder function updates a CfnConfigurationSetEventDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination$EventDestinationProperty | [[cdk.support/lookup-entry]] | `:event-destination` |
| `eventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-destination-name` |
"
  [^CfnConfigurationSetEventDestinationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-set-name)]
    (. builder configurationSetName data))
  (when-let [data (lookup-entry config id :event-destination)]
    (. builder eventDestination data))
  (when-let [data (lookup-entry config id :event-destination-name)]
    (. builder eventDestinationName data))
  (.build builder))


(defn cfn-configuration-set-event-destination-props-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-props-builder (new CfnConfigurationSetEventDestinationProps$Builder) id config))


(defn build-cfn-configuration-set-event-destination-sns-destination-property-builder
  "The build-cfn-configuration-set-event-destination-sns-destination-property-builder function updates a CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-configuration-set-event-destination-sns-destination-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-event-destination-sns-destination-property-builder (new CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder) id config))


(defn build-cfn-configuration-set-props-builder
  "The build-cfn-configuration-set-props-builder function updates a CfnConfigurationSetProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$DeliveryOptionsProperty | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$ReputationOptionsProperty | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$SendingOptionsProperty | [[cdk.support/lookup-entry]] | `:sending-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackingOptions` | software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet$TrackingOptionsProperty | [[cdk.support/lookup-entry]] | `:tracking-options` |
"
  [^CfnConfigurationSetProps$Builder builder id config]
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
  (.build builder))


(defn cfn-configuration-set-props-builder
  ""
  [id config]
  (build-cfn-configuration-set-props-builder (new CfnConfigurationSetProps$Builder) id config))


(defn build-cfn-configuration-set-reputation-options-property-builder
  "The build-cfn-configuration-set-reputation-options-property-builder function updates a CfnConfigurationSet$ReputationOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$ReputationOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reputationMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reputation-metrics-enabled` |
"
  [^CfnConfigurationSet$ReputationOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :reputation-metrics-enabled)]
    (. builder reputationMetricsEnabled data))
  (.build builder))


(defn cfn-configuration-set-reputation-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-reputation-options-property-builder (new CfnConfigurationSet$ReputationOptionsProperty$Builder) id config))


(defn build-cfn-configuration-set-sending-options-property-builder
  "The build-cfn-configuration-set-sending-options-property-builder function updates a CfnConfigurationSet$SendingOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$SendingOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sendingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sending-enabled` |
"
  [^CfnConfigurationSet$SendingOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sending-enabled)]
    (. builder sendingEnabled data))
  (.build builder))


(defn cfn-configuration-set-sending-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-sending-options-property-builder (new CfnConfigurationSet$SendingOptionsProperty$Builder) id config))


(defn build-cfn-configuration-set-tracking-options-property-builder
  "The build-cfn-configuration-set-tracking-options-property-builder function updates a CfnConfigurationSet$TrackingOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$TrackingOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRedirectDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-redirect-domain` |
"
  [^CfnConfigurationSet$TrackingOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-redirect-domain)]
    (. builder customRedirectDomain data))
  (.build builder))


(defn cfn-configuration-set-tracking-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-tracking-options-property-builder (new CfnConfigurationSet$TrackingOptionsProperty$Builder) id config))


(defn build-cfn-dedicated-ip-pool-builder
  "The build-cfn-dedicated-ip-pool-builder function updates a CfnDedicatedIpPool$Builder instance using the provided configuration.
  The function takes the CfnDedicatedIpPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDedicatedIpPool$Builder builder id config]
  (when-let [data (lookup-entry config id :pool-name)]
    (. builder poolName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-dedicated-ip-pool-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-dedicated-ip-pool-builder (CfnDedicatedIpPool$Builder/create scope (name id)) id config))


(defn build-cfn-dedicated-ip-pool-props-builder
  "The build-cfn-dedicated-ip-pool-props-builder function updates a CfnDedicatedIpPoolProps$Builder instance using the provided configuration.
  The function takes the CfnDedicatedIpPoolProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDedicatedIpPoolProps$Builder builder id config]
  (when-let [data (lookup-entry config id :pool-name)]
    (. builder poolName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-dedicated-ip-pool-props-builder
  ""
  [id config]
  (build-cfn-dedicated-ip-pool-props-builder (new CfnDedicatedIpPoolProps$Builder) id config))


(defn build-cfn-identity-builder
  "The build-cfn-identity-builder function updates a CfnIdentity$Builder instance using the provided configuration.
  The function takes the CfnIdentity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dkimSigningEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing-enabled` |
| `feedbackForwardingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:feedback-forwarding-enabled` |
| `mailFromAttributes` | software.amazon.awscdk.services.pinpointemail.CfnIdentity$MailFromAttributesProperty | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIdentity$Builder builder id config]
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
  (.build builder))


(defn cfn-identity-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-identity-builder (CfnIdentity$Builder/create scope (name id)) id config))


(defn build-cfn-identity-mail-from-attributes-property-builder
  "The build-cfn-identity-mail-from-attributes-property-builder function updates a CfnIdentity$MailFromAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentity$MailFromAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviorOnMxFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |
"
  [^CfnIdentity$MailFromAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :behavior-on-mx-failure)]
    (. builder behaviorOnMxFailure data))
  (when-let [data (lookup-entry config id :mail-from-domain)]
    (. builder mailFromDomain data))
  (.build builder))


(defn cfn-identity-mail-from-attributes-property-builder
  ""
  [id config]
  (build-cfn-identity-mail-from-attributes-property-builder (new CfnIdentity$MailFromAttributesProperty$Builder) id config))


(defn build-cfn-identity-props-builder
  "The build-cfn-identity-props-builder function updates a CfnIdentityProps$Builder instance using the provided configuration.
  The function takes the CfnIdentityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dkimSigningEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing-enabled` |
| `feedbackForwardingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:feedback-forwarding-enabled` |
| `mailFromAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIdentityProps$Builder builder id config]
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
  (.build builder))


(defn cfn-identity-props-builder
  ""
  [id config]
  (build-cfn-identity-props-builder (new CfnIdentityProps$Builder) id config))