(ns cdk.api.services.ses
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ses package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ses AddHeaderActionConfig$Builder
                                                AllowListReceiptFilter$Builder
                                                AllowListReceiptFilterProps$Builder
                                                BounceActionConfig$Builder
                                                ByoDkimOptions$Builder
                                                CfnConfigurationSet$Builder
                                                CfnConfigurationSet$DashboardOptionsProperty$Builder
                                                CfnConfigurationSet$DeliveryOptionsProperty$Builder
                                                CfnConfigurationSet$GuardianOptionsProperty$Builder
                                                CfnConfigurationSet$ReputationOptionsProperty$Builder
                                                CfnConfigurationSet$SendingOptionsProperty$Builder
                                                CfnConfigurationSet$SuppressionOptionsProperty$Builder
                                                CfnConfigurationSet$TrackingOptionsProperty$Builder
                                                CfnConfigurationSet$VdmOptionsProperty$Builder
                                                CfnConfigurationSetEventDestination$Builder
                                                CfnConfigurationSetEventDestination$CloudWatchDestinationProperty$Builder
                                                CfnConfigurationSetEventDestination$DimensionConfigurationProperty$Builder
                                                CfnConfigurationSetEventDestination$EventDestinationProperty$Builder
                                                CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty$Builder
                                                CfnConfigurationSetEventDestination$SnsDestinationProperty$Builder
                                                CfnConfigurationSetEventDestinationProps$Builder
                                                CfnConfigurationSetProps$Builder
                                                CfnContactList$Builder
                                                CfnContactList$TopicProperty$Builder
                                                CfnContactListProps$Builder
                                                CfnDedicatedIpPool$Builder
                                                CfnDedicatedIpPoolProps$Builder
                                                CfnEmailIdentity$Builder
                                                CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder
                                                CfnEmailIdentity$DkimAttributesProperty$Builder
                                                CfnEmailIdentity$DkimSigningAttributesProperty$Builder
                                                CfnEmailIdentity$FeedbackAttributesProperty$Builder
                                                CfnEmailIdentity$MailFromAttributesProperty$Builder
                                                CfnEmailIdentityProps$Builder
                                                CfnReceiptFilter$Builder
                                                CfnReceiptFilter$FilterProperty$Builder
                                                CfnReceiptFilter$IpFilterProperty$Builder
                                                CfnReceiptFilterProps$Builder
                                                CfnReceiptRule$ActionProperty$Builder
                                                CfnReceiptRule$AddHeaderActionProperty$Builder
                                                CfnReceiptRule$BounceActionProperty$Builder
                                                CfnReceiptRule$Builder
                                                CfnReceiptRule$LambdaActionProperty$Builder
                                                CfnReceiptRule$RuleProperty$Builder
                                                CfnReceiptRule$S3ActionProperty$Builder
                                                CfnReceiptRule$SNSActionProperty$Builder
                                                CfnReceiptRule$StopActionProperty$Builder
                                                CfnReceiptRule$WorkmailActionProperty$Builder
                                                CfnReceiptRuleProps$Builder
                                                CfnReceiptRuleSet$Builder
                                                CfnReceiptRuleSetProps$Builder
                                                CfnTemplate$Builder
                                                CfnTemplate$TemplateProperty$Builder
                                                CfnTemplateProps$Builder
                                                CfnVdmAttributes$Builder
                                                CfnVdmAttributes$DashboardAttributesProperty$Builder
                                                CfnVdmAttributes$GuardianAttributesProperty$Builder
                                                CfnVdmAttributesProps$Builder
                                                CloudWatchDimension$Builder
                                                CloudWatchDimensionSource
                                                ConfigurationSet$Builder
                                                ConfigurationSetEventDestination$Builder
                                                ConfigurationSetEventDestinationOptions$Builder
                                                ConfigurationSetEventDestinationProps$Builder
                                                ConfigurationSetProps$Builder
                                                ConfigurationSetTlsPolicy
                                                DedicatedIpPool$Builder
                                                DedicatedIpPoolProps$Builder
                                                DkimIdentityConfig$Builder
                                                DkimRecord$Builder
                                                DropSpamReceiptRule$Builder
                                                DropSpamReceiptRuleProps$Builder
                                                EasyDkimSigningKeyLength
                                                EmailIdentity$Builder
                                                EmailIdentityProps$Builder
                                                EmailSendingEvent
                                                LambdaActionConfig$Builder
                                                MailFromBehaviorOnMxFailure
                                                ReceiptFilter$Builder
                                                ReceiptFilterPolicy
                                                ReceiptFilterProps$Builder
                                                ReceiptRule$Builder
                                                ReceiptRuleActionConfig$Builder
                                                ReceiptRuleOptions$Builder
                                                ReceiptRuleProps$Builder
                                                ReceiptRuleSet$Builder
                                                ReceiptRuleSetProps$Builder
                                                S3ActionConfig$Builder
                                                SNSActionConfig$Builder
                                                ScalingMode
                                                StopActionConfig$Builder
                                                SuppressionReasons
                                                TlsPolicy
                                                VdmAttributes$Builder
                                                VdmAttributesProps$Builder
                                                WorkmailActionConfig$Builder]))


(defn cloud-watch-dimension-source
  "The `cloud-watch-dimension-source` function data interprets values in the provided config data into a 
`CloudWatchDimensionSource` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CloudWatchDimensionSource` - the value is returned.
* is `:message-tag` - `CloudWatchDimensionSource/MESSAGE_TAG` is returned
* is `:email-header` - `CloudWatchDimensionSource/EMAIL_HEADER` is returned
* is `:link-tag` - `CloudWatchDimensionSource/LINK_TAG` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CloudWatchDimensionSource data) data
      (= :message-tag data) CloudWatchDimensionSource/MESSAGE_TAG
      (= :email-header data) CloudWatchDimensionSource/EMAIL_HEADER
      (= :link-tag data) CloudWatchDimensionSource/LINK_TAG)))


(defn configuration-set-tls-policy
  "The `configuration-set-tls-policy` function data interprets values in the provided config data into a 
`ConfigurationSetTlsPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ConfigurationSetTlsPolicy` - the value is returned.
* is `:optional` - `ConfigurationSetTlsPolicy/OPTIONAL` is returned
* is `:require` - `ConfigurationSetTlsPolicy/REQUIRE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ConfigurationSetTlsPolicy data) data
      (= :optional data) ConfigurationSetTlsPolicy/OPTIONAL
      (= :require data) ConfigurationSetTlsPolicy/REQUIRE)))


(defn easy-dkim-signing-key-length
  "The `easy-dkim-signing-key-length` function data interprets values in the provided config data into a 
`EasyDkimSigningKeyLength` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EasyDkimSigningKeyLength` - the value is returned.
* is `:rsa-2048-bit` - `EasyDkimSigningKeyLength/RSA_2048_BIT` is returned
* is `:rsa-1024-bit` - `EasyDkimSigningKeyLength/RSA_1024_BIT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EasyDkimSigningKeyLength data) data
      (= :rsa-2048-bit data) EasyDkimSigningKeyLength/RSA_2048_BIT
      (= :rsa-1024-bit data) EasyDkimSigningKeyLength/RSA_1024_BIT)))


(defn email-sending-event
  "The `email-sending-event` function data interprets values in the provided config data into a 
`EmailSendingEvent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmailSendingEvent` - the value is returned.
* is `:send` - `EmailSendingEvent/SEND` is returned
* is `:open` - `EmailSendingEvent/OPEN` is returned
* is `:complaint` - `EmailSendingEvent/COMPLAINT` is returned
* is `:reject` - `EmailSendingEvent/REJECT` is returned
* is `:subscription` - `EmailSendingEvent/SUBSCRIPTION` is returned
* is `:delivery` - `EmailSendingEvent/DELIVERY` is returned
* is `:delivery-delay` - `EmailSendingEvent/DELIVERY_DELAY` is returned
* is `:click` - `EmailSendingEvent/CLICK` is returned
* is `:bounce` - `EmailSendingEvent/BOUNCE` is returned
* is `:rendering-failure` - `EmailSendingEvent/RENDERING_FAILURE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmailSendingEvent data) data
      (= :send data) EmailSendingEvent/SEND
      (= :open data) EmailSendingEvent/OPEN
      (= :complaint data) EmailSendingEvent/COMPLAINT
      (= :reject data) EmailSendingEvent/REJECT
      (= :subscription data) EmailSendingEvent/SUBSCRIPTION
      (= :delivery data) EmailSendingEvent/DELIVERY
      (= :delivery-delay data) EmailSendingEvent/DELIVERY_DELAY
      (= :click data) EmailSendingEvent/CLICK
      (= :bounce data) EmailSendingEvent/BOUNCE
      (= :rendering-failure data) EmailSendingEvent/RENDERING_FAILURE)))


(defn mail-from-behavior-on-mx-failure
  "The `mail-from-behavior-on-mx-failure` function data interprets values in the provided config data into a 
`MailFromBehaviorOnMxFailure` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MailFromBehaviorOnMxFailure` - the value is returned.
* is `:use-default-value` - `MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE` is returned
* is `:reject-message` - `MailFromBehaviorOnMxFailure/REJECT_MESSAGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MailFromBehaviorOnMxFailure data) data
      (= :use-default-value data) MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE
      (= :reject-message data) MailFromBehaviorOnMxFailure/REJECT_MESSAGE)))


(defn receipt-filter-policy
  "The `receipt-filter-policy` function data interprets values in the provided config data into a 
`ReceiptFilterPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ReceiptFilterPolicy` - the value is returned.
* is `:allow` - `ReceiptFilterPolicy/ALLOW` is returned
* is `:block` - `ReceiptFilterPolicy/BLOCK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ReceiptFilterPolicy data) data
      (= :allow data) ReceiptFilterPolicy/ALLOW
      (= :block data) ReceiptFilterPolicy/BLOCK)))


(defn scaling-mode
  "The `scaling-mode` function data interprets values in the provided config data into a 
`ScalingMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ScalingMode` - the value is returned.
* is `:standard` - `ScalingMode/STANDARD` is returned
* is `:managed` - `ScalingMode/MANAGED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ScalingMode data) data
      (= :standard data) ScalingMode/STANDARD
      (= :managed data) ScalingMode/MANAGED)))


(defn suppression-reasons
  "The `suppression-reasons` function data interprets values in the provided config data into a 
`SuppressionReasons` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SuppressionReasons` - the value is returned.
* is `:bounces-only` - `SuppressionReasons/BOUNCES_ONLY` is returned
* is `:bounces-and-complaints` - `SuppressionReasons/BOUNCES_AND_COMPLAINTS` is returned
* is `:complaints-only` - `SuppressionReasons/COMPLAINTS_ONLY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SuppressionReasons data) data
      (= :bounces-only data) SuppressionReasons/BOUNCES_ONLY
      (= :bounces-and-complaints data) SuppressionReasons/BOUNCES_AND_COMPLAINTS
      (= :complaints-only data) SuppressionReasons/COMPLAINTS_ONLY)))


(defn tls-policy
  "The `tls-policy` function data interprets values in the provided config data into a 
`TlsPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TlsPolicy` - the value is returned.
* is `:require` - `TlsPolicy/REQUIRE` is returned
* is `:optional` - `TlsPolicy/OPTIONAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TlsPolicy data) data
      (= :require data) TlsPolicy/REQUIRE
      (= :optional data) TlsPolicy/OPTIONAL)))


(defn add-header-action-config-builder
  "The add-header-action-config-builder function buildes out new instances of 
AddHeaderActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `headerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-value` |"
  [stack id config]
  (let [builder (AddHeaderActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (when-let [data (lookup-entry config id :header-value)]
      (. builder headerValue data))
    (.build builder)))


(defn allow-list-receipt-filter-builder
  "The allow-list-receipt-filter-builder function buildes out new instances of 
AllowListReceiptFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ips` | java.util.List | [[cdk.support/lookup-entry]] | `:ips` |"
  [stack id config]
  (let [builder (AllowListReceiptFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ips)]
      (. builder ips data))
    (.build builder)))


(defn allow-list-receipt-filter-props-builder
  "The allow-list-receipt-filter-props-builder function buildes out new instances of 
AllowListReceiptFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ips` | java.util.List | [[cdk.support/lookup-entry]] | `:ips` |"
  [stack id config]
  (let [builder (AllowListReceiptFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :ips)]
      (. builder ips data))
    (.build builder)))


(defn bounce-action-config-builder
  "The bounce-action-config-builder function buildes out new instances of 
BounceActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (BounceActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :sender)]
      (. builder sender data))
    (when-let [data (lookup-entry config id :smtp-reply-code)]
      (. builder smtpReplyCode data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn byo-dkim-options-builder
  "The byo-dkim-options-builder function buildes out new instances of 
ByoDkimOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `privateKey` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:private-key` |
| `publicKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key` |
| `selector` | java.lang.String | [[cdk.support/lookup-entry]] | `:selector` |"
  [stack id config]
  (let [builder (ByoDkimOptions$Builder.)]
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :public-key)]
      (. builder publicKey data))
    (when-let [data (lookup-entry config id :selector)]
      (. builder selector data))
    (.build builder)))


(defn cfn-configuration-set-builder
  "The cfn-configuration-set-builder function buildes out new instances of 
CfnConfigurationSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$DeliveryOptionsProperty | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$ReputationOptionsProperty | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sending-options` |
| `suppressionOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$SuppressionOptionsProperty | [[cdk.support/lookup-entry]] | `:suppression-options` |
| `trackingOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$TrackingOptionsProperty | [[cdk.support/lookup-entry]] | `:tracking-options` |
| `vdmOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vdm-options` |"
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
    (when-let [data (lookup-entry config id :suppression-options)]
      (. builder suppressionOptions data))
    (when-let [data (lookup-entry config id :tracking-options)]
      (. builder trackingOptions data))
    (when-let [data (lookup-entry config id :vdm-options)]
      (. builder vdmOptions data))
    (.build builder)))


(defn cfn-configuration-set-dashboard-options-property-builder
  "The cfn-configuration-set-dashboard-options-property-builder function buildes out new instances of 
CfnConfigurationSet$DashboardOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.String | [[cdk.support/lookup-entry]] | `:engagement-metrics` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$DashboardOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :engagement-metrics)]
      (. builder engagementMetrics data))
    (.build builder)))


(defn cfn-configuration-set-delivery-options-property-builder
  "The cfn-configuration-set-delivery-options-property-builder function buildes out new instances of 
CfnConfigurationSet$DeliveryOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sendingPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sending-pool-name` |
| `tlsPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$DeliveryOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :sending-pool-name)]
      (. builder sendingPoolName data))
    (when-let [data (lookup-entry config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn cfn-configuration-set-event-destination-builder
  "The cfn-configuration-set-event-destination-builder function buildes out new instances of 
CfnConfigurationSetEventDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-destination` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (when-let [data (lookup-entry config id :event-destination)]
      (. builder eventDestination data))
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
| `cloudWatchDestination` | software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination$CloudWatchDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `kinesisFirehoseDestination` | software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-destination` |
| `matchingEventTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-event-types` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
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
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
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


(defn cfn-configuration-set-event-destination-props-builder
  "The cfn-configuration-set-event-destination-props-builder function buildes out new instances of 
CfnConfigurationSetEventDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination$EventDestinationProperty | [[cdk.support/lookup-entry]] | `:event-destination` |"
  [stack id config]
  (let [builder (CfnConfigurationSetEventDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (when-let [data (lookup-entry config id :event-destination)]
      (. builder eventDestination data))
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


(defn cfn-configuration-set-guardian-options-property-builder
  "The cfn-configuration-set-guardian-options-property-builder function buildes out new instances of 
CfnConfigurationSet$GuardianOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optimizedSharedDelivery` | java.lang.String | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$GuardianOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :optimized-shared-delivery)]
      (. builder optimizedSharedDelivery data))
    (.build builder)))


(defn cfn-configuration-set-props-builder
  "The cfn-configuration-set-props-builder function buildes out new instances of 
CfnConfigurationSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$DeliveryOptionsProperty | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$SendingOptionsProperty | [[cdk.support/lookup-entry]] | `:sending-options` |
| `suppressionOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:suppression-options` |
| `trackingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracking-options` |
| `vdmOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$VdmOptionsProperty | [[cdk.support/lookup-entry]] | `:vdm-options` |"
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
    (when-let [data (lookup-entry config id :suppression-options)]
      (. builder suppressionOptions data))
    (when-let [data (lookup-entry config id :tracking-options)]
      (. builder trackingOptions data))
    (when-let [data (lookup-entry config id :vdm-options)]
      (. builder vdmOptions data))
    (.build builder)))


(defn cfn-configuration-set-reputation-options-property-builder
  "The cfn-configuration-set-reputation-options-property-builder function buildes out new instances of 
CfnConfigurationSet$ReputationOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reputationMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reputation-metrics-enabled` |"
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
| `sendingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sending-enabled` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$SendingOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :sending-enabled)]
      (. builder sendingEnabled data))
    (.build builder)))


(defn cfn-configuration-set-suppression-options-property-builder
  "The cfn-configuration-set-suppression-options-property-builder function buildes out new instances of 
CfnConfigurationSet$SuppressionOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suppressedReasons` | java.util.List | [[cdk.support/lookup-entry]] | `:suppressed-reasons` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$SuppressionOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :suppressed-reasons)]
      (. builder suppressedReasons data))
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


(defn cfn-configuration-set-vdm-options-property-builder
  "The cfn-configuration-set-vdm-options-property-builder function buildes out new instances of 
CfnConfigurationSet$VdmOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dashboard-options` |
| `guardianOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$GuardianOptionsProperty | [[cdk.support/lookup-entry]] | `:guardian-options` |"
  [stack id config]
  (let [builder (CfnConfigurationSet$VdmOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :dashboard-options)]
      (. builder dashboardOptions data))
    (when-let [data (lookup-entry config id :guardian-options)]
      (. builder guardianOptions data))
    (.build builder)))


(defn cfn-contact-list-builder
  "The cfn-contact-list-builder function buildes out new instances of 
CfnContactList$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-list-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (CfnContactList$Builder/create stack id)]
    (when-let [data (lookup-entry config id :contact-list-name)]
      (. builder contactListName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn cfn-contact-list-props-builder
  "The cfn-contact-list-props-builder function buildes out new instances of 
CfnContactListProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-list-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (CfnContactListProps$Builder.)]
    (when-let [data (lookup-entry config id :contact-list-name)]
      (. builder contactListName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn cfn-contact-list-topic-property-builder
  "The cfn-contact-list-topic-property-builder function buildes out new instances of 
CfnContactList$TopicProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubscriptionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-subscription-status` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |"
  [stack id config]
  (let [builder (CfnContactList$TopicProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-subscription-status)]
      (. builder defaultSubscriptionStatus data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :topic-name)]
      (. builder topicName data))
    (.build builder)))


(defn cfn-dedicated-ip-pool-builder
  "The cfn-dedicated-ip-pool-builder function buildes out new instances of 
CfnDedicatedIpPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `scalingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-mode` |"
  [stack id config]
  (let [builder (CfnDedicatedIpPool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :pool-name)]
      (. builder poolName data))
    (when-let [data (lookup-entry config id :scaling-mode)]
      (. builder scalingMode data))
    (.build builder)))


(defn cfn-dedicated-ip-pool-props-builder
  "The cfn-dedicated-ip-pool-props-builder function buildes out new instances of 
CfnDedicatedIpPoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `scalingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-mode` |"
  [stack id config]
  (let [builder (CfnDedicatedIpPoolProps$Builder.)]
    (when-let [data (lookup-entry config id :pool-name)]
      (. builder poolName data))
    (when-let [data (lookup-entry config id :scaling-mode)]
      (. builder scalingMode data))
    (.build builder)))


(defn cfn-email-identity-builder
  "The cfn-email-identity-builder function buildes out new instances of 
CfnEmailIdentity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-set-attributes` |
| `dkimAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$DkimAttributesProperty | [[cdk.support/lookup-entry]] | `:dkim-attributes` |
| `dkimSigningAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dkim-signing-attributes` |
| `emailIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-identity` |
| `feedbackAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:feedback-attributes` |
| `mailFromAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |"
  [stack id config]
  (let [builder (CfnEmailIdentity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration-set-attributes)]
      (. builder configurationSetAttributes data))
    (when-let [data (lookup-entry config id :dkim-attributes)]
      (. builder dkimAttributes data))
    (when-let [data (lookup-entry config id :dkim-signing-attributes)]
      (. builder dkimSigningAttributes data))
    (when-let [data (lookup-entry config id :email-identity)]
      (. builder emailIdentity data))
    (when-let [data (lookup-entry config id :feedback-attributes)]
      (. builder feedbackAttributes data))
    (when-let [data (lookup-entry config id :mail-from-attributes)]
      (. builder mailFromAttributes data))
    (.build builder)))


(defn cfn-email-identity-configuration-set-attributes-property-builder
  "The cfn-email-identity-configuration-set-attributes-property-builder function buildes out new instances of 
CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |"
  [stack id config]
  (let [builder (CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (.build builder)))


(defn cfn-email-identity-dkim-attributes-property-builder
  "The cfn-email-identity-dkim-attributes-property-builder function buildes out new instances of 
CfnEmailIdentity$DkimAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:signing-enabled` |"
  [stack id config]
  (let [builder (CfnEmailIdentity$DkimAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :signing-enabled)]
      (. builder signingEnabled data))
    (.build builder)))


(defn cfn-email-identity-dkim-signing-attributes-property-builder
  "The cfn-email-identity-dkim-signing-attributes-property-builder function buildes out new instances of 
CfnEmailIdentity$DkimSigningAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainSigningPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-private-key` |
| `domainSigningSelector` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-selector` |
| `nextSigningKeyLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:next-signing-key-length` |"
  [stack id config]
  (let [builder (CfnEmailIdentity$DkimSigningAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-signing-private-key)]
      (. builder domainSigningPrivateKey data))
    (when-let [data (lookup-entry config id :domain-signing-selector)]
      (. builder domainSigningSelector data))
    (when-let [data (lookup-entry config id :next-signing-key-length)]
      (. builder nextSigningKeyLength data))
    (.build builder)))


(defn cfn-email-identity-feedback-attributes-property-builder
  "The cfn-email-identity-feedback-attributes-property-builder function buildes out new instances of 
CfnEmailIdentity$FeedbackAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailForwardingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email-forwarding-enabled` |"
  [stack id config]
  (let [builder (CfnEmailIdentity$FeedbackAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :email-forwarding-enabled)]
      (. builder emailForwardingEnabled data))
    (.build builder)))


(defn cfn-email-identity-mail-from-attributes-property-builder
  "The cfn-email-identity-mail-from-attributes-property-builder function buildes out new instances of 
CfnEmailIdentity$MailFromAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviorOnMxFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |"
  [stack id config]
  (let [builder (CfnEmailIdentity$MailFromAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :behavior-on-mx-failure)]
      (. builder behaviorOnMxFailure data))
    (when-let [data (lookup-entry config id :mail-from-domain)]
      (. builder mailFromDomain data))
    (.build builder)))


(defn cfn-email-identity-props-builder
  "The cfn-email-identity-props-builder function buildes out new instances of 
CfnEmailIdentityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$ConfigurationSetAttributesProperty | [[cdk.support/lookup-entry]] | `:configuration-set-attributes` |
| `dkimAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dkim-attributes` |
| `dkimSigningAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dkim-signing-attributes` |
| `emailIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-identity` |
| `feedbackAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$FeedbackAttributesProperty | [[cdk.support/lookup-entry]] | `:feedback-attributes` |
| `mailFromAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$MailFromAttributesProperty | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |"
  [stack id config]
  (let [builder (CfnEmailIdentityProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set-attributes)]
      (. builder configurationSetAttributes data))
    (when-let [data (lookup-entry config id :dkim-attributes)]
      (. builder dkimAttributes data))
    (when-let [data (lookup-entry config id :dkim-signing-attributes)]
      (. builder dkimSigningAttributes data))
    (when-let [data (lookup-entry config id :email-identity)]
      (. builder emailIdentity data))
    (when-let [data (lookup-entry config id :feedback-attributes)]
      (. builder feedbackAttributes data))
    (when-let [data (lookup-entry config id :mail-from-attributes)]
      (. builder mailFromAttributes data))
    (.build builder)))


(defn cfn-receipt-filter-builder
  "The cfn-receipt-filter-builder function buildes out new instances of 
CfnReceiptFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | software.amazon.awscdk.services.ses.CfnReceiptFilter$FilterProperty | [[cdk.support/lookup-entry]] | `:filter` |"
  [stack id config]
  (let [builder (CfnReceiptFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (.build builder)))


(defn cfn-receipt-filter-filter-property-builder
  "The cfn-receipt-filter-filter-property-builder function buildes out new instances of 
CfnReceiptFilter$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipFilter` | software.amazon.awscdk.services.ses.CfnReceiptFilter$IpFilterProperty | [[cdk.support/lookup-entry]] | `:ip-filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnReceiptFilter$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-filter)]
      (. builder ipFilter data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-receipt-filter-ip-filter-property-builder
  "The cfn-receipt-filter-ip-filter-property-builder function buildes out new instances of 
CfnReceiptFilter$IpFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnReceiptFilter$IpFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-receipt-filter-props-builder
  "The cfn-receipt-filter-props-builder function buildes out new instances of 
CfnReceiptFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |"
  [stack id config]
  (let [builder (CfnReceiptFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (.build builder)))


(defn cfn-receipt-rule-action-property-builder
  "The cfn-receipt-rule-action-property-builder function buildes out new instances of 
CfnReceiptRule$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addHeaderAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$AddHeaderActionProperty | [[cdk.support/lookup-entry]] | `:add-header-action` |
| `bounceAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$BounceActionProperty | [[cdk.support/lookup-entry]] | `:bounce-action` |
| `lambdaAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$LambdaActionProperty | [[cdk.support/lookup-entry]] | `:lambda-action` |
| `s3Action` | software.amazon.awscdk.services.ses.CfnReceiptRule$S3ActionProperty | [[cdk.support/lookup-entry]] | `:s3-action` |
| `snsAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns-action` |
| `stopAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$StopActionProperty | [[cdk.support/lookup-entry]] | `:stop-action` |
| `workmailAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workmail-action` |"
  [stack id config]
  (let [builder (CfnReceiptRule$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-header-action)]
      (. builder addHeaderAction data))
    (when-let [data (lookup-entry config id :bounce-action)]
      (. builder bounceAction data))
    (when-let [data (lookup-entry config id :lambda-action)]
      (. builder lambdaAction data))
    (when-let [data (lookup-entry config id :s3-action)]
      (. builder s3Action data))
    (when-let [data (lookup-entry config id :sns-action)]
      (. builder snsAction data))
    (when-let [data (lookup-entry config id :stop-action)]
      (. builder stopAction data))
    (when-let [data (lookup-entry config id :workmail-action)]
      (. builder workmailAction data))
    (.build builder)))


(defn cfn-receipt-rule-add-header-action-property-builder
  "The cfn-receipt-rule-add-header-action-property-builder function buildes out new instances of 
CfnReceiptRule$AddHeaderActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `headerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-value` |"
  [stack id config]
  (let [builder (CfnReceiptRule$AddHeaderActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (when-let [data (lookup-entry config id :header-value)]
      (. builder headerValue data))
    (.build builder)))


(defn cfn-receipt-rule-bounce-action-property-builder
  "The cfn-receipt-rule-bounce-action-property-builder function buildes out new instances of 
CfnReceiptRule$BounceActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnReceiptRule$BounceActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :sender)]
      (. builder sender data))
    (when-let [data (lookup-entry config id :smtp-reply-code)]
      (. builder smtpReplyCode data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-receipt-rule-builder
  "The cfn-receipt-rule-builder function buildes out new instances of 
CfnReceiptRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `after` | java.lang.String | [[cdk.support/lookup-entry]] | `:after` |
| `rule` | software.amazon.awscdk.services.ses.CfnReceiptRule$RuleProperty | [[cdk.support/lookup-entry]] | `:rule` |
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |"
  [stack id config]
  (let [builder (CfnReceiptRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :rule)]
      (. builder rule data))
    (when-let [data (lookup-entry config id :rule-set-name)]
      (. builder ruleSetName data))
    (.build builder)))


(defn cfn-receipt-rule-lambda-action-property-builder
  "The cfn-receipt-rule-lambda-action-property-builder function buildes out new instances of 
CfnReceiptRule$LambdaActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnReceiptRule$LambdaActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-receipt-rule-props-builder
  "The cfn-receipt-rule-props-builder function buildes out new instances of 
CfnReceiptRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `after` | java.lang.String | [[cdk.support/lookup-entry]] | `:after` |
| `rule` | software.amazon.awscdk.services.ses.CfnReceiptRule$RuleProperty | [[cdk.support/lookup-entry]] | `:rule` |
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |"
  [stack id config]
  (let [builder (CfnReceiptRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :rule)]
      (. builder rule data))
    (when-let [data (lookup-entry config id :rule-set-name)]
      (. builder ruleSetName data))
    (.build builder)))


(defn cfn-receipt-rule-rule-property-builder
  "The cfn-receipt-rule-rule-property-builder function buildes out new instances of 
CfnReceiptRule$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy` |"
  [stack id config]
  (let [builder (CfnReceiptRule$RuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recipients)]
      (. builder recipients data))
    (when-let [data (lookup-entry config id :scan-enabled)]
      (. builder scanEnabled data))
    (when-let [data (lookup-entry config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn cfn-receipt-rule-s3-action-property-builder
  "The cfn-receipt-rule-s3-action-property-builder function buildes out new instances of 
CfnReceiptRule$S3ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnReceiptRule$S3ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-receipt-rule-set-builder
  "The cfn-receipt-rule-set-builder function buildes out new instances of 
CfnReceiptRuleSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |"
  [stack id config]
  (let [builder (CfnReceiptRuleSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :rule-set-name)]
      (. builder ruleSetName data))
    (.build builder)))


(defn cfn-receipt-rule-set-props-builder
  "The cfn-receipt-rule-set-props-builder function buildes out new instances of 
CfnReceiptRuleSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |"
  [stack id config]
  (let [builder (CfnReceiptRuleSetProps$Builder.)]
    (when-let [data (lookup-entry config id :rule-set-name)]
      (. builder ruleSetName data))
    (.build builder)))


(defn cfn-receipt-rule-sns-action-property-builder
  "The cfn-receipt-rule-sns-action-property-builder function buildes out new instances of 
CfnReceiptRule$SNSActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnReceiptRule$SNSActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :encoding)]
      (. builder encoding data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-receipt-rule-stop-action-property-builder
  "The cfn-receipt-rule-stop-action-property-builder function buildes out new instances of 
CfnReceiptRule$StopActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnReceiptRule$StopActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-receipt-rule-workmail-action-property-builder
  "The cfn-receipt-rule-workmail-action-property-builder function buildes out new instances of 
CfnReceiptRule$WorkmailActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnReceiptRule$WorkmailActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :organization-arn)]
      (. builder organizationArn data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-template-builder
  "The cfn-template-builder function buildes out new instances of 
CfnTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `template` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template` |"
  [stack id config]
  (let [builder (CfnTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (.build builder)))


(defn cfn-template-props-builder
  "The cfn-template-props-builder function buildes out new instances of 
CfnTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `template` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template` |"
  [stack id config]
  (let [builder (CfnTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (.build builder)))


(defn cfn-template-template-property-builder
  "The cfn-template-template-property-builder function buildes out new instances of 
CfnTemplate$TemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `htmlPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-part` |
| `subjectPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject-part` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `textPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-part` |"
  [stack id config]
  (let [builder (CfnTemplate$TemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :html-part)]
      (. builder htmlPart data))
    (when-let [data (lookup-entry config id :subject-part)]
      (. builder subjectPart data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (when-let [data (lookup-entry config id :text-part)]
      (. builder textPart data))
    (.build builder)))


(defn cfn-vdm-attributes-builder
  "The cfn-vdm-attributes-builder function buildes out new instances of 
CfnVdmAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardAttributes` | software.amazon.awscdk.services.ses.CfnVdmAttributes$DashboardAttributesProperty | [[cdk.support/lookup-entry]] | `:dashboard-attributes` |
| `guardianAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:guardian-attributes` |"
  [stack id config]
  (let [builder (CfnVdmAttributes$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dashboard-attributes)]
      (. builder dashboardAttributes data))
    (when-let [data (lookup-entry config id :guardian-attributes)]
      (. builder guardianAttributes data))
    (.build builder)))


(defn cfn-vdm-attributes-dashboard-attributes-property-builder
  "The cfn-vdm-attributes-dashboard-attributes-property-builder function buildes out new instances of 
CfnVdmAttributes$DashboardAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.String | [[cdk.support/lookup-entry]] | `:engagement-metrics` |"
  [stack id config]
  (let [builder (CfnVdmAttributes$DashboardAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :engagement-metrics)]
      (. builder engagementMetrics data))
    (.build builder)))


(defn cfn-vdm-attributes-guardian-attributes-property-builder
  "The cfn-vdm-attributes-guardian-attributes-property-builder function buildes out new instances of 
CfnVdmAttributes$GuardianAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optimizedSharedDelivery` | java.lang.String | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |"
  [stack id config]
  (let [builder (CfnVdmAttributes$GuardianAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :optimized-shared-delivery)]
      (. builder optimizedSharedDelivery data))
    (.build builder)))


(defn cfn-vdm-attributes-props-builder
  "The cfn-vdm-attributes-props-builder function buildes out new instances of 
CfnVdmAttributesProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardAttributes` | software.amazon.awscdk.services.ses.CfnVdmAttributes$DashboardAttributesProperty | [[cdk.support/lookup-entry]] | `:dashboard-attributes` |
| `guardianAttributes` | software.amazon.awscdk.services.ses.CfnVdmAttributes$GuardianAttributesProperty | [[cdk.support/lookup-entry]] | `:guardian-attributes` |"
  [stack id config]
  (let [builder (CfnVdmAttributesProps$Builder.)]
    (when-let [data (lookup-entry config id :dashboard-attributes)]
      (. builder dashboardAttributes data))
    (when-let [data (lookup-entry config id :guardian-attributes)]
      (. builder guardianAttributes data))
    (.build builder)))


(defn cloud-watch-dimension-builder
  "The cloud-watch-dimension-builder function buildes out new instances of 
CloudWatchDimension$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.services.ses.CloudWatchDimensionSource | [[cdk.api.services.ses/cloud-watch-dimension-source]] | `:source` |"
  [stack id config]
  (let [builder (CloudWatchDimension$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (cloud-watch-dimension-source config id :source)]
      (. builder source data))
    (.build builder)))


(defn configuration-set-builder
  "The configuration-set-builder function buildes out new instances of 
ConfigurationSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `customTrackingRedirectDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-tracking-redirect-domain` |
| `dedicatedIpPool` | software.amazon.awscdk.services.ses.IDedicatedIpPool | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool` |
| `reputationMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reputation-metrics` |
| `sendingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sending-enabled` |
| `suppressionReasons` | software.amazon.awscdk.services.ses.SuppressionReasons | [[cdk.api.services.ses/suppression-reasons]] | `:suppression-reasons` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy | [[cdk.api.services.ses/configuration-set-tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (ConfigurationSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (when-let [data (lookup-entry config id :custom-tracking-redirect-domain)]
      (. builder customTrackingRedirectDomain data))
    (when-let [data (lookup-entry config id :dedicated-ip-pool)]
      (. builder dedicatedIpPool data))
    (when-let [data (lookup-entry config id :reputation-metrics)]
      (. builder reputationMetrics data))
    (when-let [data (lookup-entry config id :sending-enabled)]
      (. builder sendingEnabled data))
    (when-let [data (suppression-reasons config id :suppression-reasons)]
      (. builder suppressionReasons data))
    (when-let [data (configuration-set-tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn configuration-set-event-destination-builder
  "The configuration-set-event-destination-builder function buildes out new instances of 
ConfigurationSetEventDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `configurationSetEventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-event-destination-name` |
| `destination` | software.amazon.awscdk.services.ses.EventDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (ConfigurationSetEventDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration-set)]
      (. builder configurationSet data))
    (when-let [data (lookup-entry config id :configuration-set-event-destination-name)]
      (. builder configurationSetEventDestinationName data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn configuration-set-event-destination-options-builder
  "The configuration-set-event-destination-options-builder function buildes out new instances of 
ConfigurationSetEventDestinationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetEventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-event-destination-name` |
| `destination` | software.amazon.awscdk.services.ses.EventDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (ConfigurationSetEventDestinationOptions$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set-event-destination-name)]
      (. builder configurationSetEventDestinationName data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn configuration-set-event-destination-props-builder
  "The configuration-set-event-destination-props-builder function buildes out new instances of 
ConfigurationSetEventDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `configurationSetEventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-event-destination-name` |
| `destination` | software.amazon.awscdk.services.ses.EventDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |"
  [stack id config]
  (let [builder (ConfigurationSetEventDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set)]
      (. builder configurationSet data))
    (when-let [data (lookup-entry config id :configuration-set-event-destination-name)]
      (. builder configurationSetEventDestinationName data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (.build builder)))


(defn configuration-set-props-builder
  "The configuration-set-props-builder function buildes out new instances of 
ConfigurationSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `customTrackingRedirectDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-tracking-redirect-domain` |
| `dedicatedIpPool` | software.amazon.awscdk.services.ses.IDedicatedIpPool | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool` |
| `reputationMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reputation-metrics` |
| `sendingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sending-enabled` |
| `suppressionReasons` | software.amazon.awscdk.services.ses.SuppressionReasons | [[cdk.api.services.ses/suppression-reasons]] | `:suppression-reasons` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy | [[cdk.api.services.ses/configuration-set-tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (ConfigurationSetProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set-name)]
      (. builder configurationSetName data))
    (when-let [data (lookup-entry config id :custom-tracking-redirect-domain)]
      (. builder customTrackingRedirectDomain data))
    (when-let [data (lookup-entry config id :dedicated-ip-pool)]
      (. builder dedicatedIpPool data))
    (when-let [data (lookup-entry config id :reputation-metrics)]
      (. builder reputationMetrics data))
    (when-let [data (lookup-entry config id :sending-enabled)]
      (. builder sendingEnabled data))
    (when-let [data (suppression-reasons config id :suppression-reasons)]
      (. builder suppressionReasons data))
    (when-let [data (configuration-set-tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn dedicated-ip-pool-builder
  "The dedicated-ip-pool-builder function buildes out new instances of 
DedicatedIpPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dedicatedIpPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool-name` |
| `scalingMode` | software.amazon.awscdk.services.ses.ScalingMode | [[cdk.api.services.ses/scaling-mode]] | `:scaling-mode` |"
  [stack id config]
  (let [builder (DedicatedIpPool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dedicated-ip-pool-name)]
      (. builder dedicatedIpPoolName data))
    (when-let [data (scaling-mode config id :scaling-mode)]
      (. builder scalingMode data))
    (.build builder)))


(defn dedicated-ip-pool-props-builder
  "The dedicated-ip-pool-props-builder function buildes out new instances of 
DedicatedIpPoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dedicatedIpPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool-name` |
| `scalingMode` | software.amazon.awscdk.services.ses.ScalingMode | [[cdk.api.services.ses/scaling-mode]] | `:scaling-mode` |"
  [stack id config]
  (let [builder (DedicatedIpPoolProps$Builder.)]
    (when-let [data (lookup-entry config id :dedicated-ip-pool-name)]
      (. builder dedicatedIpPoolName data))
    (when-let [data (scaling-mode config id :scaling-mode)]
      (. builder scalingMode data))
    (.build builder)))


(defn dkim-identity-config-builder
  "The dkim-identity-config-builder function buildes out new instances of 
DkimIdentityConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainSigningPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-private-key` |
| `domainSigningSelector` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-selector` |
| `nextSigningKeyLength` | software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength | [[cdk.api.services.ses/easy-dkim-signing-key-length]] | `:next-signing-key-length` |"
  [stack id config]
  (let [builder (DkimIdentityConfig$Builder.)]
    (when-let [data (lookup-entry config id :domain-signing-private-key)]
      (. builder domainSigningPrivateKey data))
    (when-let [data (lookup-entry config id :domain-signing-selector)]
      (. builder domainSigningSelector data))
    (when-let [data (easy-dkim-signing-key-length config id :next-signing-key-length)]
      (. builder nextSigningKeyLength data))
    (.build builder)))


(defn dkim-record-builder
  "The dkim-record-builder function buildes out new instances of 
DkimRecord$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (DkimRecord$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn drop-spam-receipt-rule-builder
  "The drop-spam-receipt-rule-builder function buildes out new instances of 
DropSpamReceiptRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (DropSpamReceiptRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :receipt-rule-name)]
      (. builder receiptRuleName data))
    (when-let [data (lookup-entry config id :recipients)]
      (. builder recipients data))
    (when-let [data (lookup-entry config id :rule-set)]
      (. builder ruleSet data))
    (when-let [data (lookup-entry config id :scan-enabled)]
      (. builder scanEnabled data))
    (when-let [data (tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn drop-spam-receipt-rule-props-builder
  "The drop-spam-receipt-rule-props-builder function buildes out new instances of 
DropSpamReceiptRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (DropSpamReceiptRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :receipt-rule-name)]
      (. builder receiptRuleName data))
    (when-let [data (lookup-entry config id :recipients)]
      (. builder recipients data))
    (when-let [data (lookup-entry config id :rule-set)]
      (. builder ruleSet data))
    (when-let [data (lookup-entry config id :scan-enabled)]
      (. builder scanEnabled data))
    (when-let [data (tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn email-identity-builder
  "The email-identity-builder function buildes out new instances of 
EmailIdentity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `dkimIdentity` | software.amazon.awscdk.services.ses.DkimIdentity | [[cdk.support/lookup-entry]] | `:dkim-identity` |
| `dkimSigning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing` |
| `feedbackForwarding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:feedback-forwarding` |
| `identity` | software.amazon.awscdk.services.ses.Identity | [[cdk.support/lookup-entry]] | `:identity` |
| `mailFromBehaviorOnMxFailure` | software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure | [[cdk.api.services.ses/mail-from-behavior-on-mx-failure]] | `:mail-from-behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |"
  [stack id config]
  (let [builder (EmailIdentity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration-set)]
      (. builder configurationSet data))
    (when-let [data (lookup-entry config id :dkim-identity)]
      (. builder dkimIdentity data))
    (when-let [data (lookup-entry config id :dkim-signing)]
      (. builder dkimSigning data))
    (when-let [data (lookup-entry config id :feedback-forwarding)]
      (. builder feedbackForwarding data))
    (when-let [data (lookup-entry config id :identity)]
      (. builder identity data))
    (when-let [data (mail-from-behavior-on-mx-failure config id :mail-from-behavior-on-mx-failure)]
      (. builder mailFromBehaviorOnMxFailure data))
    (when-let [data (lookup-entry config id :mail-from-domain)]
      (. builder mailFromDomain data))
    (.build builder)))


(defn email-identity-props-builder
  "The email-identity-props-builder function buildes out new instances of 
EmailIdentityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `dkimIdentity` | software.amazon.awscdk.services.ses.DkimIdentity | [[cdk.support/lookup-entry]] | `:dkim-identity` |
| `dkimSigning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing` |
| `feedbackForwarding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:feedback-forwarding` |
| `identity` | software.amazon.awscdk.services.ses.Identity | [[cdk.support/lookup-entry]] | `:identity` |
| `mailFromBehaviorOnMxFailure` | software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure | [[cdk.api.services.ses/mail-from-behavior-on-mx-failure]] | `:mail-from-behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |"
  [stack id config]
  (let [builder (EmailIdentityProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration-set)]
      (. builder configurationSet data))
    (when-let [data (lookup-entry config id :dkim-identity)]
      (. builder dkimIdentity data))
    (when-let [data (lookup-entry config id :dkim-signing)]
      (. builder dkimSigning data))
    (when-let [data (lookup-entry config id :feedback-forwarding)]
      (. builder feedbackForwarding data))
    (when-let [data (lookup-entry config id :identity)]
      (. builder identity data))
    (when-let [data (mail-from-behavior-on-mx-failure config id :mail-from-behavior-on-mx-failure)]
      (. builder mailFromBehaviorOnMxFailure data))
    (when-let [data (lookup-entry config id :mail-from-domain)]
      (. builder mailFromDomain data))
    (.build builder)))


(defn lambda-action-config-builder
  "The lambda-action-config-builder function buildes out new instances of 
LambdaActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (LambdaActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn receipt-filter-builder
  "The receipt-filter-builder function buildes out new instances of 
ReceiptFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `policy` | software.amazon.awscdk.services.ses.ReceiptFilterPolicy | [[cdk.api.services.ses/receipt-filter-policy]] | `:policy` |
| `receiptFilterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-filter-name` |"
  [stack id config]
  (let [builder (ReceiptFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (receipt-filter-policy config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :receipt-filter-name)]
      (. builder receiptFilterName data))
    (.build builder)))


(defn receipt-filter-props-builder
  "The receipt-filter-props-builder function buildes out new instances of 
ReceiptFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `policy` | software.amazon.awscdk.services.ses.ReceiptFilterPolicy | [[cdk.api.services.ses/receipt-filter-policy]] | `:policy` |
| `receiptFilterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-filter-name` |"
  [stack id config]
  (let [builder (ReceiptFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (receipt-filter-policy config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :receipt-filter-name)]
      (. builder receiptFilterName data))
    (.build builder)))


(defn receipt-rule-action-config-builder
  "The receipt-rule-action-config-builder function buildes out new instances of 
ReceiptRuleActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addHeaderAction` | software.amazon.awscdk.services.ses.AddHeaderActionConfig | [[cdk.support/lookup-entry]] | `:add-header-action` |
| `bounceAction` | software.amazon.awscdk.services.ses.BounceActionConfig | [[cdk.support/lookup-entry]] | `:bounce-action` |
| `lambdaAction` | software.amazon.awscdk.services.ses.LambdaActionConfig | [[cdk.support/lookup-entry]] | `:lambda-action` |
| `s3Action` | software.amazon.awscdk.services.ses.S3ActionConfig | [[cdk.support/lookup-entry]] | `:s3-action` |
| `snsAction` | software.amazon.awscdk.services.ses.SNSActionConfig | [[cdk.support/lookup-entry]] | `:sns-action` |
| `stopAction` | software.amazon.awscdk.services.ses.StopActionConfig | [[cdk.support/lookup-entry]] | `:stop-action` |
| `workmailAction` | software.amazon.awscdk.services.ses.WorkmailActionConfig | [[cdk.support/lookup-entry]] | `:workmail-action` |"
  [stack id config]
  (let [builder (ReceiptRuleActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :add-header-action)]
      (. builder addHeaderAction data))
    (when-let [data (lookup-entry config id :bounce-action)]
      (. builder bounceAction data))
    (when-let [data (lookup-entry config id :lambda-action)]
      (. builder lambdaAction data))
    (when-let [data (lookup-entry config id :s3-action)]
      (. builder s3Action data))
    (when-let [data (lookup-entry config id :sns-action)]
      (. builder snsAction data))
    (when-let [data (lookup-entry config id :stop-action)]
      (. builder stopAction data))
    (when-let [data (lookup-entry config id :workmail-action)]
      (. builder workmailAction data))
    (.build builder)))


(defn receipt-rule-builder
  "The receipt-rule-builder function buildes out new instances of 
ReceiptRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (ReceiptRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :receipt-rule-name)]
      (. builder receiptRuleName data))
    (when-let [data (lookup-entry config id :recipients)]
      (. builder recipients data))
    (when-let [data (lookup-entry config id :rule-set)]
      (. builder ruleSet data))
    (when-let [data (lookup-entry config id :scan-enabled)]
      (. builder scanEnabled data))
    (when-let [data (tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn receipt-rule-options-builder
  "The receipt-rule-options-builder function buildes out new instances of 
ReceiptRuleOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (ReceiptRuleOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :receipt-rule-name)]
      (. builder receiptRuleName data))
    (when-let [data (lookup-entry config id :recipients)]
      (. builder recipients data))
    (when-let [data (lookup-entry config id :scan-enabled)]
      (. builder scanEnabled data))
    (when-let [data (tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn receipt-rule-props-builder
  "The receipt-rule-props-builder function buildes out new instances of 
ReceiptRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |"
  [stack id config]
  (let [builder (ReceiptRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :after)]
      (. builder after data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :receipt-rule-name)]
      (. builder receiptRuleName data))
    (when-let [data (lookup-entry config id :recipients)]
      (. builder recipients data))
    (when-let [data (lookup-entry config id :rule-set)]
      (. builder ruleSet data))
    (when-let [data (lookup-entry config id :scan-enabled)]
      (. builder scanEnabled data))
    (when-let [data (tls-policy config id :tls-policy)]
      (. builder tlsPolicy data))
    (.build builder)))


(defn receipt-rule-set-builder
  "The receipt-rule-set-builder function buildes out new instances of 
ReceiptRuleSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dropSpam` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:drop-spam` |
| `receiptRuleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-set-name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (ReceiptRuleSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :drop-spam)]
      (. builder dropSpam data))
    (when-let [data (lookup-entry config id :receipt-rule-set-name)]
      (. builder receiptRuleSetName data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn receipt-rule-set-props-builder
  "The receipt-rule-set-props-builder function buildes out new instances of 
ReceiptRuleSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dropSpam` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:drop-spam` |
| `receiptRuleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-set-name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (ReceiptRuleSetProps$Builder.)]
    (when-let [data (lookup-entry config id :drop-spam)]
      (. builder dropSpam data))
    (when-let [data (lookup-entry config id :receipt-rule-set-name)]
      (. builder receiptRuleSetName data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn s3-action-config-builder
  "The s3-action-config-builder function buildes out new instances of 
S3ActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (S3ActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn sns-action-config-builder
  "The sns-action-config-builder function buildes out new instances of 
SNSActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (SNSActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :encoding)]
      (. builder encoding data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn stop-action-config-builder
  "The stop-action-config-builder function buildes out new instances of 
StopActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (StopActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn vdm-attributes-builder
  "The vdm-attributes-builder function buildes out new instances of 
VdmAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:engagement-metrics` |
| `optimizedSharedDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |"
  [stack id config]
  (let [builder (VdmAttributes$Builder/create stack id)]
    (when-let [data (lookup-entry config id :engagement-metrics)]
      (. builder engagementMetrics data))
    (when-let [data (lookup-entry config id :optimized-shared-delivery)]
      (. builder optimizedSharedDelivery data))
    (.build builder)))


(defn vdm-attributes-props-builder
  "The vdm-attributes-props-builder function buildes out new instances of 
VdmAttributesProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:engagement-metrics` |
| `optimizedSharedDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |"
  [stack id config]
  (let [builder (VdmAttributesProps$Builder.)]
    (when-let [data (lookup-entry config id :engagement-metrics)]
      (. builder engagementMetrics data))
    (when-let [data (lookup-entry config id :optimized-shared-delivery)]
      (. builder optimizedSharedDelivery data))
    (.build builder)))


(defn workmail-action-config-builder
  "The workmail-action-config-builder function buildes out new instances of 
WorkmailActionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (WorkmailActionConfig$Builder.)]
    (when-let [data (lookup-entry config id :organization-arn)]
      (. builder organizationArn data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))