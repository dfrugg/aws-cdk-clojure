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


(defn build-add-header-action-config-builder
  "The build-add-header-action-config-builder function updates a AddHeaderActionConfig$Builder instance using the provided configuration.
  The function takes the AddHeaderActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `headerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-value` |
"
  [^AddHeaderActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (when-let [data (lookup-entry config id :header-value)]
    (. builder headerValue data))
  (.build builder))


(defn add-header-action-config-builder
  ""
  [id config]
  (build-add-header-action-config-builder (new AddHeaderActionConfig$Builder) id config))


(defn build-allow-list-receipt-filter-builder
  "The build-allow-list-receipt-filter-builder function updates a AllowListReceiptFilter$Builder instance using the provided configuration.
  The function takes the AllowListReceiptFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ips` | java.util.List | [[cdk.support/lookup-entry]] | `:ips` |
"
  [^AllowListReceiptFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :ips)]
    (. builder ips data))
  (.build builder))


(defn allow-list-receipt-filter-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-allow-list-receipt-filter-builder (AllowListReceiptFilter$Builder/create scope (name id)) id config))


(defn build-allow-list-receipt-filter-props-builder
  "The build-allow-list-receipt-filter-props-builder function updates a AllowListReceiptFilterProps$Builder instance using the provided configuration.
  The function takes the AllowListReceiptFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ips` | java.util.List | [[cdk.support/lookup-entry]] | `:ips` |
"
  [^AllowListReceiptFilterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :ips)]
    (. builder ips data))
  (.build builder))


(defn allow-list-receipt-filter-props-builder
  ""
  [id config]
  (build-allow-list-receipt-filter-props-builder (new AllowListReceiptFilterProps$Builder) id config))


(defn build-bounce-action-config-builder
  "The build-bounce-action-config-builder function updates a BounceActionConfig$Builder instance using the provided configuration.
  The function takes the BounceActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^BounceActionConfig$Builder builder id config]
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
  (.build builder))


(defn bounce-action-config-builder
  ""
  [id config]
  (build-bounce-action-config-builder (new BounceActionConfig$Builder) id config))


(defn build-byo-dkim-options-builder
  "The build-byo-dkim-options-builder function updates a ByoDkimOptions$Builder instance using the provided configuration.
  The function takes the ByoDkimOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `privateKey` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:private-key` |
| `publicKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key` |
| `selector` | java.lang.String | [[cdk.support/lookup-entry]] | `:selector` |
"
  [^ByoDkimOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-let [data (lookup-entry config id :public-key)]
    (. builder publicKey data))
  (when-let [data (lookup-entry config id :selector)]
    (. builder selector data))
  (.build builder))


(defn byo-dkim-options-builder
  ""
  [id config]
  (build-byo-dkim-options-builder (new ByoDkimOptions$Builder) id config))


(defn build-cfn-configuration-set-builder
  "The build-cfn-configuration-set-builder function updates a CfnConfigurationSet$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$DeliveryOptionsProperty | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$ReputationOptionsProperty | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sending-options` |
| `suppressionOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$SuppressionOptionsProperty | [[cdk.support/lookup-entry]] | `:suppression-options` |
| `trackingOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$TrackingOptionsProperty | [[cdk.support/lookup-entry]] | `:tracking-options` |
| `vdmOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vdm-options` |
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
  (when-let [data (lookup-entry config id :suppression-options)]
    (. builder suppressionOptions data))
  (when-let [data (lookup-entry config id :tracking-options)]
    (. builder trackingOptions data))
  (when-let [data (lookup-entry config id :vdm-options)]
    (. builder vdmOptions data))
  (.build builder))


(defn cfn-configuration-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-configuration-set-builder (CfnConfigurationSet$Builder/create scope (name id)) id config))


(defn build-cfn-configuration-set-dashboard-options-property-builder
  "The build-cfn-configuration-set-dashboard-options-property-builder function updates a CfnConfigurationSet$DashboardOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$DashboardOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.String | [[cdk.support/lookup-entry]] | `:engagement-metrics` |
"
  [^CfnConfigurationSet$DashboardOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :engagement-metrics)]
    (. builder engagementMetrics data))
  (.build builder))


(defn cfn-configuration-set-dashboard-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-dashboard-options-property-builder (new CfnConfigurationSet$DashboardOptionsProperty$Builder) id config))


(defn build-cfn-configuration-set-delivery-options-property-builder
  "The build-cfn-configuration-set-delivery-options-property-builder function updates a CfnConfigurationSet$DeliveryOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$DeliveryOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sendingPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sending-pool-name` |
| `tlsPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy` |
"
  [^CfnConfigurationSet$DeliveryOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sending-pool-name)]
    (. builder sendingPoolName data))
  (when-let [data (lookup-entry config id :tls-policy)]
    (. builder tlsPolicy data))
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
| `eventDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-destination` |
"
  [^CfnConfigurationSetEventDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-set-name)]
    (. builder configurationSetName data))
  (when-let [data (lookup-entry config id :event-destination)]
    (. builder eventDestination data))
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
| `cloudWatchDestination` | software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination$CloudWatchDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `kinesisFirehoseDestination` | software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination$KinesisFirehoseDestinationProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-destination` |
| `matchingEventTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-event-types` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
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
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
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


(defn build-cfn-configuration-set-event-destination-props-builder
  "The build-cfn-configuration-set-event-destination-props-builder function updates a CfnConfigurationSetEventDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetEventDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `eventDestination` | software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination$EventDestinationProperty | [[cdk.support/lookup-entry]] | `:event-destination` |
"
  [^CfnConfigurationSetEventDestinationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-set-name)]
    (. builder configurationSetName data))
  (when-let [data (lookup-entry config id :event-destination)]
    (. builder eventDestination data))
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


(defn build-cfn-configuration-set-guardian-options-property-builder
  "The build-cfn-configuration-set-guardian-options-property-builder function updates a CfnConfigurationSet$GuardianOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$GuardianOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optimizedSharedDelivery` | java.lang.String | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |
"
  [^CfnConfigurationSet$GuardianOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :optimized-shared-delivery)]
    (. builder optimizedSharedDelivery data))
  (.build builder))


(defn cfn-configuration-set-guardian-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-guardian-options-property-builder (new CfnConfigurationSet$GuardianOptionsProperty$Builder) id config))


(defn build-cfn-configuration-set-props-builder
  "The build-cfn-configuration-set-props-builder function updates a CfnConfigurationSetProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$DeliveryOptionsProperty | [[cdk.support/lookup-entry]] | `:delivery-options` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reputationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reputation-options` |
| `sendingOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$SendingOptionsProperty | [[cdk.support/lookup-entry]] | `:sending-options` |
| `suppressionOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:suppression-options` |
| `trackingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracking-options` |
| `vdmOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$VdmOptionsProperty | [[cdk.support/lookup-entry]] | `:vdm-options` |
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
  (when-let [data (lookup-entry config id :suppression-options)]
    (. builder suppressionOptions data))
  (when-let [data (lookup-entry config id :tracking-options)]
    (. builder trackingOptions data))
  (when-let [data (lookup-entry config id :vdm-options)]
    (. builder vdmOptions data))
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
| `reputationMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reputation-metrics-enabled` |
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
| `sendingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sending-enabled` |
"
  [^CfnConfigurationSet$SendingOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sending-enabled)]
    (. builder sendingEnabled data))
  (.build builder))


(defn cfn-configuration-set-sending-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-sending-options-property-builder (new CfnConfigurationSet$SendingOptionsProperty$Builder) id config))


(defn build-cfn-configuration-set-suppression-options-property-builder
  "The build-cfn-configuration-set-suppression-options-property-builder function updates a CfnConfigurationSet$SuppressionOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$SuppressionOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suppressedReasons` | java.util.List | [[cdk.support/lookup-entry]] | `:suppressed-reasons` |
"
  [^CfnConfigurationSet$SuppressionOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :suppressed-reasons)]
    (. builder suppressedReasons data))
  (.build builder))


(defn cfn-configuration-set-suppression-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-suppression-options-property-builder (new CfnConfigurationSet$SuppressionOptionsProperty$Builder) id config))


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


(defn build-cfn-configuration-set-vdm-options-property-builder
  "The build-cfn-configuration-set-vdm-options-property-builder function updates a CfnConfigurationSet$VdmOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationSet$VdmOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dashboard-options` |
| `guardianOptions` | software.amazon.awscdk.services.ses.CfnConfigurationSet$GuardianOptionsProperty | [[cdk.support/lookup-entry]] | `:guardian-options` |
"
  [^CfnConfigurationSet$VdmOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dashboard-options)]
    (. builder dashboardOptions data))
  (when-let [data (lookup-entry config id :guardian-options)]
    (. builder guardianOptions data))
  (.build builder))


(defn cfn-configuration-set-vdm-options-property-builder
  ""
  [id config]
  (build-cfn-configuration-set-vdm-options-property-builder (new CfnConfigurationSet$VdmOptionsProperty$Builder) id config))


(defn build-cfn-contact-list-builder
  "The build-cfn-contact-list-builder function updates a CfnContactList$Builder instance using the provided configuration.
  The function takes the CfnContactList$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-list-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^CfnContactList$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-list-name)]
    (. builder contactListName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (.build builder))


(defn cfn-contact-list-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-contact-list-builder (CfnContactList$Builder/create scope (name id)) id config))


(defn build-cfn-contact-list-props-builder
  "The build-cfn-contact-list-props-builder function updates a CfnContactListProps$Builder instance using the provided configuration.
  The function takes the CfnContactListProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-list-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^CfnContactListProps$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-list-name)]
    (. builder contactListName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (.build builder))


(defn cfn-contact-list-props-builder
  ""
  [id config]
  (build-cfn-contact-list-props-builder (new CfnContactListProps$Builder) id config))


(defn build-cfn-contact-list-topic-property-builder
  "The build-cfn-contact-list-topic-property-builder function updates a CfnContactList$TopicProperty$Builder instance using the provided configuration.
  The function takes the CfnContactList$TopicProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubscriptionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-subscription-status` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
"
  [^CfnContactList$TopicProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-subscription-status)]
    (. builder defaultSubscriptionStatus data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (.build builder))


(defn cfn-contact-list-topic-property-builder
  ""
  [id config]
  (build-cfn-contact-list-topic-property-builder (new CfnContactList$TopicProperty$Builder) id config))


(defn build-cfn-dedicated-ip-pool-builder
  "The build-cfn-dedicated-ip-pool-builder function updates a CfnDedicatedIpPool$Builder instance using the provided configuration.
  The function takes the CfnDedicatedIpPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `poolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pool-name` |
| `scalingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-mode` |
"
  [^CfnDedicatedIpPool$Builder builder id config]
  (when-let [data (lookup-entry config id :pool-name)]
    (. builder poolName data))
  (when-let [data (lookup-entry config id :scaling-mode)]
    (. builder scalingMode data))
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
| `scalingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-mode` |
"
  [^CfnDedicatedIpPoolProps$Builder builder id config]
  (when-let [data (lookup-entry config id :pool-name)]
    (. builder poolName data))
  (when-let [data (lookup-entry config id :scaling-mode)]
    (. builder scalingMode data))
  (.build builder))


(defn cfn-dedicated-ip-pool-props-builder
  ""
  [id config]
  (build-cfn-dedicated-ip-pool-props-builder (new CfnDedicatedIpPoolProps$Builder) id config))


(defn build-cfn-email-identity-builder
  "The build-cfn-email-identity-builder function updates a CfnEmailIdentity$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-set-attributes` |
| `dkimAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$DkimAttributesProperty | [[cdk.support/lookup-entry]] | `:dkim-attributes` |
| `dkimSigningAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dkim-signing-attributes` |
| `emailIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-identity` |
| `feedbackAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:feedback-attributes` |
| `mailFromAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |
"
  [^CfnEmailIdentity$Builder builder id config]
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
  (.build builder))


(defn cfn-email-identity-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-email-identity-builder (CfnEmailIdentity$Builder/create scope (name id)) id config))


(defn build-cfn-email-identity-configuration-set-attributes-property-builder
  "The build-cfn-email-identity-configuration-set-attributes-property-builder function updates a CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
"
  [^CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-set-name)]
    (. builder configurationSetName data))
  (.build builder))


(defn cfn-email-identity-configuration-set-attributes-property-builder
  ""
  [id config]
  (build-cfn-email-identity-configuration-set-attributes-property-builder (new CfnEmailIdentity$ConfigurationSetAttributesProperty$Builder) id config))


(defn build-cfn-email-identity-dkim-attributes-property-builder
  "The build-cfn-email-identity-dkim-attributes-property-builder function updates a CfnEmailIdentity$DkimAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentity$DkimAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:signing-enabled` |
"
  [^CfnEmailIdentity$DkimAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :signing-enabled)]
    (. builder signingEnabled data))
  (.build builder))


(defn cfn-email-identity-dkim-attributes-property-builder
  ""
  [id config]
  (build-cfn-email-identity-dkim-attributes-property-builder (new CfnEmailIdentity$DkimAttributesProperty$Builder) id config))


(defn build-cfn-email-identity-dkim-signing-attributes-property-builder
  "The build-cfn-email-identity-dkim-signing-attributes-property-builder function updates a CfnEmailIdentity$DkimSigningAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentity$DkimSigningAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainSigningPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-private-key` |
| `domainSigningSelector` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-selector` |
| `nextSigningKeyLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:next-signing-key-length` |
"
  [^CfnEmailIdentity$DkimSigningAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-signing-private-key)]
    (. builder domainSigningPrivateKey data))
  (when-let [data (lookup-entry config id :domain-signing-selector)]
    (. builder domainSigningSelector data))
  (when-let [data (lookup-entry config id :next-signing-key-length)]
    (. builder nextSigningKeyLength data))
  (.build builder))


(defn cfn-email-identity-dkim-signing-attributes-property-builder
  ""
  [id config]
  (build-cfn-email-identity-dkim-signing-attributes-property-builder (new CfnEmailIdentity$DkimSigningAttributesProperty$Builder) id config))


(defn build-cfn-email-identity-feedback-attributes-property-builder
  "The build-cfn-email-identity-feedback-attributes-property-builder function updates a CfnEmailIdentity$FeedbackAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentity$FeedbackAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailForwardingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:email-forwarding-enabled` |
"
  [^CfnEmailIdentity$FeedbackAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :email-forwarding-enabled)]
    (. builder emailForwardingEnabled data))
  (.build builder))


(defn cfn-email-identity-feedback-attributes-property-builder
  ""
  [id config]
  (build-cfn-email-identity-feedback-attributes-property-builder (new CfnEmailIdentity$FeedbackAttributesProperty$Builder) id config))


(defn build-cfn-email-identity-mail-from-attributes-property-builder
  "The build-cfn-email-identity-mail-from-attributes-property-builder function updates a CfnEmailIdentity$MailFromAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentity$MailFromAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviorOnMxFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |
"
  [^CfnEmailIdentity$MailFromAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :behavior-on-mx-failure)]
    (. builder behaviorOnMxFailure data))
  (when-let [data (lookup-entry config id :mail-from-domain)]
    (. builder mailFromDomain data))
  (.build builder))


(defn cfn-email-identity-mail-from-attributes-property-builder
  ""
  [id config]
  (build-cfn-email-identity-mail-from-attributes-property-builder (new CfnEmailIdentity$MailFromAttributesProperty$Builder) id config))


(defn build-cfn-email-identity-props-builder
  "The build-cfn-email-identity-props-builder function updates a CfnEmailIdentityProps$Builder instance using the provided configuration.
  The function takes the CfnEmailIdentityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$ConfigurationSetAttributesProperty | [[cdk.support/lookup-entry]] | `:configuration-set-attributes` |
| `dkimAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dkim-attributes` |
| `dkimSigningAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dkim-signing-attributes` |
| `emailIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-identity` |
| `feedbackAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$FeedbackAttributesProperty | [[cdk.support/lookup-entry]] | `:feedback-attributes` |
| `mailFromAttributes` | software.amazon.awscdk.services.ses.CfnEmailIdentity$MailFromAttributesProperty | [[cdk.support/lookup-entry]] | `:mail-from-attributes` |
"
  [^CfnEmailIdentityProps$Builder builder id config]
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
  (.build builder))


(defn cfn-email-identity-props-builder
  ""
  [id config]
  (build-cfn-email-identity-props-builder (new CfnEmailIdentityProps$Builder) id config))


(defn build-cfn-receipt-filter-builder
  "The build-cfn-receipt-filter-builder function updates a CfnReceiptFilter$Builder instance using the provided configuration.
  The function takes the CfnReceiptFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | software.amazon.awscdk.services.ses.CfnReceiptFilter$FilterProperty | [[cdk.support/lookup-entry]] | `:filter` |
"
  [^CfnReceiptFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (.build builder))


(defn cfn-receipt-filter-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-receipt-filter-builder (CfnReceiptFilter$Builder/create scope (name id)) id config))


(defn build-cfn-receipt-filter-filter-property-builder
  "The build-cfn-receipt-filter-filter-property-builder function updates a CfnReceiptFilter$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptFilter$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipFilter` | software.amazon.awscdk.services.ses.CfnReceiptFilter$IpFilterProperty | [[cdk.support/lookup-entry]] | `:ip-filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnReceiptFilter$FilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip-filter)]
    (. builder ipFilter data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-receipt-filter-filter-property-builder
  ""
  [id config]
  (build-cfn-receipt-filter-filter-property-builder (new CfnReceiptFilter$FilterProperty$Builder) id config))


(defn build-cfn-receipt-filter-ip-filter-property-builder
  "The build-cfn-receipt-filter-ip-filter-property-builder function updates a CfnReceiptFilter$IpFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptFilter$IpFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnReceiptFilter$IpFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cidr)]
    (. builder cidr data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-receipt-filter-ip-filter-property-builder
  ""
  [id config]
  (build-cfn-receipt-filter-ip-filter-property-builder (new CfnReceiptFilter$IpFilterProperty$Builder) id config))


(defn build-cfn-receipt-filter-props-builder
  "The build-cfn-receipt-filter-props-builder function updates a CfnReceiptFilterProps$Builder instance using the provided configuration.
  The function takes the CfnReceiptFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
"
  [^CfnReceiptFilterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (.build builder))


(defn cfn-receipt-filter-props-builder
  ""
  [id config]
  (build-cfn-receipt-filter-props-builder (new CfnReceiptFilterProps$Builder) id config))


(defn build-cfn-receipt-rule-action-property-builder
  "The build-cfn-receipt-rule-action-property-builder function updates a CfnReceiptRule$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addHeaderAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$AddHeaderActionProperty | [[cdk.support/lookup-entry]] | `:add-header-action` |
| `bounceAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$BounceActionProperty | [[cdk.support/lookup-entry]] | `:bounce-action` |
| `lambdaAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$LambdaActionProperty | [[cdk.support/lookup-entry]] | `:lambda-action` |
| `s3Action` | software.amazon.awscdk.services.ses.CfnReceiptRule$S3ActionProperty | [[cdk.support/lookup-entry]] | `:s3-action` |
| `snsAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns-action` |
| `stopAction` | software.amazon.awscdk.services.ses.CfnReceiptRule$StopActionProperty | [[cdk.support/lookup-entry]] | `:stop-action` |
| `workmailAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workmail-action` |
"
  [^CfnReceiptRule$ActionProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-receipt-rule-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-action-property-builder (new CfnReceiptRule$ActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-add-header-action-property-builder
  "The build-cfn-receipt-rule-add-header-action-property-builder function updates a CfnReceiptRule$AddHeaderActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$AddHeaderActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `headerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-value` |
"
  [^CfnReceiptRule$AddHeaderActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (when-let [data (lookup-entry config id :header-value)]
    (. builder headerValue data))
  (.build builder))


(defn cfn-receipt-rule-add-header-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-add-header-action-property-builder (new CfnReceiptRule$AddHeaderActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-bounce-action-property-builder
  "The build-cfn-receipt-rule-bounce-action-property-builder function updates a CfnReceiptRule$BounceActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$BounceActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnReceiptRule$BounceActionProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-receipt-rule-bounce-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-bounce-action-property-builder (new CfnReceiptRule$BounceActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-builder
  "The build-cfn-receipt-rule-builder function updates a CfnReceiptRule$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `after` | java.lang.String | [[cdk.support/lookup-entry]] | `:after` |
| `rule` | software.amazon.awscdk.services.ses.CfnReceiptRule$RuleProperty | [[cdk.support/lookup-entry]] | `:rule` |
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |
"
  [^CfnReceiptRule$Builder builder id config]
  (when-let [data (lookup-entry config id :after)]
    (. builder after data))
  (when-let [data (lookup-entry config id :rule)]
    (. builder rule data))
  (when-let [data (lookup-entry config id :rule-set-name)]
    (. builder ruleSetName data))
  (.build builder))


(defn cfn-receipt-rule-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-receipt-rule-builder (CfnReceiptRule$Builder/create scope (name id)) id config))


(defn build-cfn-receipt-rule-lambda-action-property-builder
  "The build-cfn-receipt-rule-lambda-action-property-builder function updates a CfnReceiptRule$LambdaActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$LambdaActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnReceiptRule$LambdaActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-let [data (lookup-entry config id :invocation-type)]
    (. builder invocationType data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-receipt-rule-lambda-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-lambda-action-property-builder (new CfnReceiptRule$LambdaActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-props-builder
  "The build-cfn-receipt-rule-props-builder function updates a CfnReceiptRuleProps$Builder instance using the provided configuration.
  The function takes the CfnReceiptRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `after` | java.lang.String | [[cdk.support/lookup-entry]] | `:after` |
| `rule` | software.amazon.awscdk.services.ses.CfnReceiptRule$RuleProperty | [[cdk.support/lookup-entry]] | `:rule` |
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |
"
  [^CfnReceiptRuleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :after)]
    (. builder after data))
  (when-let [data (lookup-entry config id :rule)]
    (. builder rule data))
  (when-let [data (lookup-entry config id :rule-set-name)]
    (. builder ruleSetName data))
  (.build builder))


(defn cfn-receipt-rule-props-builder
  ""
  [id config]
  (build-cfn-receipt-rule-props-builder (new CfnReceiptRuleProps$Builder) id config))


(defn build-cfn-receipt-rule-rule-property-builder
  "The build-cfn-receipt-rule-rule-property-builder function updates a CfnReceiptRule$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy` |
"
  [^CfnReceiptRule$RuleProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-receipt-rule-rule-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-rule-property-builder (new CfnReceiptRule$RuleProperty$Builder) id config))


(defn build-cfn-receipt-rule-s3-action-property-builder
  "The build-cfn-receipt-rule-s3-action-property-builder function updates a CfnReceiptRule$S3ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$S3ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnReceiptRule$S3ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-receipt-rule-s3-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-s3-action-property-builder (new CfnReceiptRule$S3ActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-set-builder
  "The build-cfn-receipt-rule-set-builder function updates a CfnReceiptRuleSet$Builder instance using the provided configuration.
  The function takes the CfnReceiptRuleSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |
"
  [^CfnReceiptRuleSet$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-set-name)]
    (. builder ruleSetName data))
  (.build builder))


(defn cfn-receipt-rule-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-receipt-rule-set-builder (CfnReceiptRuleSet$Builder/create scope (name id)) id config))


(defn build-cfn-receipt-rule-set-props-builder
  "The build-cfn-receipt-rule-set-props-builder function updates a CfnReceiptRuleSetProps$Builder instance using the provided configuration.
  The function takes the CfnReceiptRuleSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |
"
  [^CfnReceiptRuleSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-set-name)]
    (. builder ruleSetName data))
  (.build builder))


(defn cfn-receipt-rule-set-props-builder
  ""
  [id config]
  (build-cfn-receipt-rule-set-props-builder (new CfnReceiptRuleSetProps$Builder) id config))


(defn build-cfn-receipt-rule-sns-action-property-builder
  "The build-cfn-receipt-rule-sns-action-property-builder function updates a CfnReceiptRule$SNSActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$SNSActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnReceiptRule$SNSActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :encoding)]
    (. builder encoding data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-receipt-rule-sns-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-sns-action-property-builder (new CfnReceiptRule$SNSActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-stop-action-property-builder
  "The build-cfn-receipt-rule-stop-action-property-builder function updates a CfnReceiptRule$StopActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$StopActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnReceiptRule$StopActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-receipt-rule-stop-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-stop-action-property-builder (new CfnReceiptRule$StopActionProperty$Builder) id config))


(defn build-cfn-receipt-rule-workmail-action-property-builder
  "The build-cfn-receipt-rule-workmail-action-property-builder function updates a CfnReceiptRule$WorkmailActionProperty$Builder instance using the provided configuration.
  The function takes the CfnReceiptRule$WorkmailActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnReceiptRule$WorkmailActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :organization-arn)]
    (. builder organizationArn data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-receipt-rule-workmail-action-property-builder
  ""
  [id config]
  (build-cfn-receipt-rule-workmail-action-property-builder (new CfnReceiptRule$WorkmailActionProperty$Builder) id config))


(defn build-cfn-template-builder
  "The build-cfn-template-builder function updates a CfnTemplate$Builder instance using the provided configuration.
  The function takes the CfnTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `template` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template` |
"
  [^CfnTemplate$Builder builder id config]
  (when-let [data (lookup-entry config id :template)]
    (. builder template data))
  (.build builder))


(defn cfn-template-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-template-builder (CfnTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-template-props-builder
  "The build-cfn-template-props-builder function updates a CfnTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `template` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template` |
"
  [^CfnTemplateProps$Builder builder id config]
  (when-let [data (lookup-entry config id :template)]
    (. builder template data))
  (.build builder))


(defn cfn-template-props-builder
  ""
  [id config]
  (build-cfn-template-props-builder (new CfnTemplateProps$Builder) id config))


(defn build-cfn-template-template-property-builder
  "The build-cfn-template-template-property-builder function updates a CfnTemplate$TemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnTemplate$TemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `htmlPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-part` |
| `subjectPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject-part` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `textPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-part` |
"
  [^CfnTemplate$TemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :html-part)]
    (. builder htmlPart data))
  (when-let [data (lookup-entry config id :subject-part)]
    (. builder subjectPart data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-let [data (lookup-entry config id :text-part)]
    (. builder textPart data))
  (.build builder))


(defn cfn-template-template-property-builder
  ""
  [id config]
  (build-cfn-template-template-property-builder (new CfnTemplate$TemplateProperty$Builder) id config))


(defn build-cfn-vdm-attributes-builder
  "The build-cfn-vdm-attributes-builder function updates a CfnVdmAttributes$Builder instance using the provided configuration.
  The function takes the CfnVdmAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardAttributes` | software.amazon.awscdk.services.ses.CfnVdmAttributes$DashboardAttributesProperty | [[cdk.support/lookup-entry]] | `:dashboard-attributes` |
| `guardianAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:guardian-attributes` |
"
  [^CfnVdmAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :dashboard-attributes)]
    (. builder dashboardAttributes data))
  (when-let [data (lookup-entry config id :guardian-attributes)]
    (. builder guardianAttributes data))
  (.build builder))


(defn cfn-vdm-attributes-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-vdm-attributes-builder (CfnVdmAttributes$Builder/create scope (name id)) id config))


(defn build-cfn-vdm-attributes-dashboard-attributes-property-builder
  "The build-cfn-vdm-attributes-dashboard-attributes-property-builder function updates a CfnVdmAttributes$DashboardAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnVdmAttributes$DashboardAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.String | [[cdk.support/lookup-entry]] | `:engagement-metrics` |
"
  [^CfnVdmAttributes$DashboardAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :engagement-metrics)]
    (. builder engagementMetrics data))
  (.build builder))


(defn cfn-vdm-attributes-dashboard-attributes-property-builder
  ""
  [id config]
  (build-cfn-vdm-attributes-dashboard-attributes-property-builder (new CfnVdmAttributes$DashboardAttributesProperty$Builder) id config))


(defn build-cfn-vdm-attributes-guardian-attributes-property-builder
  "The build-cfn-vdm-attributes-guardian-attributes-property-builder function updates a CfnVdmAttributes$GuardianAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnVdmAttributes$GuardianAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optimizedSharedDelivery` | java.lang.String | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |
"
  [^CfnVdmAttributes$GuardianAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :optimized-shared-delivery)]
    (. builder optimizedSharedDelivery data))
  (.build builder))


(defn cfn-vdm-attributes-guardian-attributes-property-builder
  ""
  [id config]
  (build-cfn-vdm-attributes-guardian-attributes-property-builder (new CfnVdmAttributes$GuardianAttributesProperty$Builder) id config))


(defn build-cfn-vdm-attributes-props-builder
  "The build-cfn-vdm-attributes-props-builder function updates a CfnVdmAttributesProps$Builder instance using the provided configuration.
  The function takes the CfnVdmAttributesProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardAttributes` | software.amazon.awscdk.services.ses.CfnVdmAttributes$DashboardAttributesProperty | [[cdk.support/lookup-entry]] | `:dashboard-attributes` |
| `guardianAttributes` | software.amazon.awscdk.services.ses.CfnVdmAttributes$GuardianAttributesProperty | [[cdk.support/lookup-entry]] | `:guardian-attributes` |
"
  [^CfnVdmAttributesProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dashboard-attributes)]
    (. builder dashboardAttributes data))
  (when-let [data (lookup-entry config id :guardian-attributes)]
    (. builder guardianAttributes data))
  (.build builder))


(defn cfn-vdm-attributes-props-builder
  ""
  [id config]
  (build-cfn-vdm-attributes-props-builder (new CfnVdmAttributesProps$Builder) id config))


(defn build-cloud-watch-dimension-builder
  "The build-cloud-watch-dimension-builder function updates a CloudWatchDimension$Builder instance using the provided configuration.
  The function takes the CloudWatchDimension$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.services.ses.CloudWatchDimensionSource | [[cdk.api.services.ses/cloud-watch-dimension-source]] | `:source` |
"
  [^CloudWatchDimension$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (cloud-watch-dimension-source config id :source)]
    (. builder source data))
  (.build builder))


(defn cloud-watch-dimension-builder
  ""
  [id config]
  (build-cloud-watch-dimension-builder (new CloudWatchDimension$Builder) id config))


(defn build-configuration-set-builder
  "The build-configuration-set-builder function updates a ConfigurationSet$Builder instance using the provided configuration.
  The function takes the ConfigurationSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `customTrackingRedirectDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-tracking-redirect-domain` |
| `dedicatedIpPool` | software.amazon.awscdk.services.ses.IDedicatedIpPool | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool` |
| `reputationMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reputation-metrics` |
| `sendingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sending-enabled` |
| `suppressionReasons` | software.amazon.awscdk.services.ses.SuppressionReasons | [[cdk.api.services.ses/suppression-reasons]] | `:suppression-reasons` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy | [[cdk.api.services.ses/configuration-set-tls-policy]] | `:tls-policy` |
"
  [^ConfigurationSet$Builder builder id config]
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
  (.build builder))


(defn configuration-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-configuration-set-builder (ConfigurationSet$Builder/create scope (name id)) id config))


(defn build-configuration-set-event-destination-builder
  "The build-configuration-set-event-destination-builder function updates a ConfigurationSetEventDestination$Builder instance using the provided configuration.
  The function takes the ConfigurationSetEventDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `configurationSetEventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-event-destination-name` |
| `destination` | software.amazon.awscdk.services.ses.EventDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^ConfigurationSetEventDestination$Builder builder id config]
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
  (.build builder))


(defn configuration-set-event-destination-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-configuration-set-event-destination-builder (ConfigurationSetEventDestination$Builder/create scope (name id)) id config))


(defn build-configuration-set-event-destination-options-builder
  "The build-configuration-set-event-destination-options-builder function updates a ConfigurationSetEventDestinationOptions$Builder instance using the provided configuration.
  The function takes the ConfigurationSetEventDestinationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetEventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-event-destination-name` |
| `destination` | software.amazon.awscdk.services.ses.EventDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^ConfigurationSetEventDestinationOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration-set-event-destination-name)]
    (. builder configurationSetEventDestinationName data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (.build builder))


(defn configuration-set-event-destination-options-builder
  ""
  [id config]
  (build-configuration-set-event-destination-options-builder (new ConfigurationSetEventDestinationOptions$Builder) id config))


(defn build-configuration-set-event-destination-props-builder
  "The build-configuration-set-event-destination-props-builder function updates a ConfigurationSetEventDestinationProps$Builder instance using the provided configuration.
  The function takes the ConfigurationSetEventDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `configurationSetEventDestinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-event-destination-name` |
| `destination` | software.amazon.awscdk.services.ses.EventDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
"
  [^ConfigurationSetEventDestinationProps$Builder builder id config]
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
  (.build builder))


(defn configuration-set-event-destination-props-builder
  ""
  [id config]
  (build-configuration-set-event-destination-props-builder (new ConfigurationSetEventDestinationProps$Builder) id config))


(defn build-configuration-set-props-builder
  "The build-configuration-set-props-builder function updates a ConfigurationSetProps$Builder instance using the provided configuration.
  The function takes the ConfigurationSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set-name` |
| `customTrackingRedirectDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-tracking-redirect-domain` |
| `dedicatedIpPool` | software.amazon.awscdk.services.ses.IDedicatedIpPool | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool` |
| `reputationMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reputation-metrics` |
| `sendingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sending-enabled` |
| `suppressionReasons` | software.amazon.awscdk.services.ses.SuppressionReasons | [[cdk.api.services.ses/suppression-reasons]] | `:suppression-reasons` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy | [[cdk.api.services.ses/configuration-set-tls-policy]] | `:tls-policy` |
"
  [^ConfigurationSetProps$Builder builder id config]
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
  (.build builder))


(defn configuration-set-props-builder
  ""
  [id config]
  (build-configuration-set-props-builder (new ConfigurationSetProps$Builder) id config))


(defn build-dedicated-ip-pool-builder
  "The build-dedicated-ip-pool-builder function updates a DedicatedIpPool$Builder instance using the provided configuration.
  The function takes the DedicatedIpPool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dedicatedIpPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool-name` |
| `scalingMode` | software.amazon.awscdk.services.ses.ScalingMode | [[cdk.api.services.ses/scaling-mode]] | `:scaling-mode` |
"
  [^DedicatedIpPool$Builder builder id config]
  (when-let [data (lookup-entry config id :dedicated-ip-pool-name)]
    (. builder dedicatedIpPoolName data))
  (when-let [data (scaling-mode config id :scaling-mode)]
    (. builder scalingMode data))
  (.build builder))


(defn dedicated-ip-pool-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-dedicated-ip-pool-builder (DedicatedIpPool$Builder/create scope (name id)) id config))


(defn build-dedicated-ip-pool-props-builder
  "The build-dedicated-ip-pool-props-builder function updates a DedicatedIpPoolProps$Builder instance using the provided configuration.
  The function takes the DedicatedIpPoolProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dedicatedIpPoolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedicated-ip-pool-name` |
| `scalingMode` | software.amazon.awscdk.services.ses.ScalingMode | [[cdk.api.services.ses/scaling-mode]] | `:scaling-mode` |
"
  [^DedicatedIpPoolProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dedicated-ip-pool-name)]
    (. builder dedicatedIpPoolName data))
  (when-let [data (scaling-mode config id :scaling-mode)]
    (. builder scalingMode data))
  (.build builder))


(defn dedicated-ip-pool-props-builder
  ""
  [id config]
  (build-dedicated-ip-pool-props-builder (new DedicatedIpPoolProps$Builder) id config))


(defn build-dkim-identity-config-builder
  "The build-dkim-identity-config-builder function updates a DkimIdentityConfig$Builder instance using the provided configuration.
  The function takes the DkimIdentityConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainSigningPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-private-key` |
| `domainSigningSelector` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-signing-selector` |
| `nextSigningKeyLength` | software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength | [[cdk.api.services.ses/easy-dkim-signing-key-length]] | `:next-signing-key-length` |
"
  [^DkimIdentityConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-signing-private-key)]
    (. builder domainSigningPrivateKey data))
  (when-let [data (lookup-entry config id :domain-signing-selector)]
    (. builder domainSigningSelector data))
  (when-let [data (easy-dkim-signing-key-length config id :next-signing-key-length)]
    (. builder nextSigningKeyLength data))
  (.build builder))


(defn dkim-identity-config-builder
  ""
  [id config]
  (build-dkim-identity-config-builder (new DkimIdentityConfig$Builder) id config))


(defn build-dkim-record-builder
  "The build-dkim-record-builder function updates a DkimRecord$Builder instance using the provided configuration.
  The function takes the DkimRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^DkimRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn dkim-record-builder
  ""
  [id config]
  (build-dkim-record-builder (new DkimRecord$Builder) id config))


(defn build-drop-spam-receipt-rule-builder
  "The build-drop-spam-receipt-rule-builder function updates a DropSpamReceiptRule$Builder instance using the provided configuration.
  The function takes the DropSpamReceiptRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |
"
  [^DropSpamReceiptRule$Builder builder id config]
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
  (.build builder))


(defn drop-spam-receipt-rule-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-drop-spam-receipt-rule-builder (DropSpamReceiptRule$Builder/create scope (name id)) id config))


(defn build-drop-spam-receipt-rule-props-builder
  "The build-drop-spam-receipt-rule-props-builder function updates a DropSpamReceiptRuleProps$Builder instance using the provided configuration.
  The function takes the DropSpamReceiptRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |
"
  [^DropSpamReceiptRuleProps$Builder builder id config]
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
  (.build builder))


(defn drop-spam-receipt-rule-props-builder
  ""
  [id config]
  (build-drop-spam-receipt-rule-props-builder (new DropSpamReceiptRuleProps$Builder) id config))


(defn build-email-identity-builder
  "The build-email-identity-builder function updates a EmailIdentity$Builder instance using the provided configuration.
  The function takes the EmailIdentity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `dkimIdentity` | software.amazon.awscdk.services.ses.DkimIdentity | [[cdk.support/lookup-entry]] | `:dkim-identity` |
| `dkimSigning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing` |
| `feedbackForwarding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:feedback-forwarding` |
| `identity` | software.amazon.awscdk.services.ses.Identity | [[cdk.support/lookup-entry]] | `:identity` |
| `mailFromBehaviorOnMxFailure` | software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure | [[cdk.api.services.ses/mail-from-behavior-on-mx-failure]] | `:mail-from-behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |
"
  [^EmailIdentity$Builder builder id config]
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
  (.build builder))


(defn email-identity-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-email-identity-builder (EmailIdentity$Builder/create scope (name id)) id config))


(defn build-email-identity-props-builder
  "The build-email-identity-props-builder function updates a EmailIdentityProps$Builder instance using the provided configuration.
  The function takes the EmailIdentityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationSet` | software.amazon.awscdk.services.ses.IConfigurationSet | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `dkimIdentity` | software.amazon.awscdk.services.ses.DkimIdentity | [[cdk.support/lookup-entry]] | `:dkim-identity` |
| `dkimSigning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dkim-signing` |
| `feedbackForwarding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:feedback-forwarding` |
| `identity` | software.amazon.awscdk.services.ses.Identity | [[cdk.support/lookup-entry]] | `:identity` |
| `mailFromBehaviorOnMxFailure` | software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure | [[cdk.api.services.ses/mail-from-behavior-on-mx-failure]] | `:mail-from-behavior-on-mx-failure` |
| `mailFromDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:mail-from-domain` |
"
  [^EmailIdentityProps$Builder builder id config]
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
  (.build builder))


(defn email-identity-props-builder
  ""
  [id config]
  (build-email-identity-props-builder (new EmailIdentityProps$Builder) id config))


(defn build-lambda-action-config-builder
  "The build-lambda-action-config-builder function updates a LambdaActionConfig$Builder instance using the provided configuration.
  The function takes the LambdaActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `invocationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-type` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^LambdaActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-let [data (lookup-entry config id :invocation-type)]
    (. builder invocationType data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn lambda-action-config-builder
  ""
  [id config]
  (build-lambda-action-config-builder (new LambdaActionConfig$Builder) id config))


(defn build-receipt-filter-builder
  "The build-receipt-filter-builder function updates a ReceiptFilter$Builder instance using the provided configuration.
  The function takes the ReceiptFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `policy` | software.amazon.awscdk.services.ses.ReceiptFilterPolicy | [[cdk.api.services.ses/receipt-filter-policy]] | `:policy` |
| `receiptFilterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-filter-name` |
"
  [^ReceiptFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-let [data (receipt-filter-policy config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :receipt-filter-name)]
    (. builder receiptFilterName data))
  (.build builder))


(defn receipt-filter-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-receipt-filter-builder (ReceiptFilter$Builder/create scope (name id)) id config))


(defn build-receipt-filter-props-builder
  "The build-receipt-filter-props-builder function updates a ReceiptFilterProps$Builder instance using the provided configuration.
  The function takes the ReceiptFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `policy` | software.amazon.awscdk.services.ses.ReceiptFilterPolicy | [[cdk.api.services.ses/receipt-filter-policy]] | `:policy` |
| `receiptFilterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-filter-name` |
"
  [^ReceiptFilterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-let [data (receipt-filter-policy config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :receipt-filter-name)]
    (. builder receiptFilterName data))
  (.build builder))


(defn receipt-filter-props-builder
  ""
  [id config]
  (build-receipt-filter-props-builder (new ReceiptFilterProps$Builder) id config))


(defn build-receipt-rule-action-config-builder
  "The build-receipt-rule-action-config-builder function updates a ReceiptRuleActionConfig$Builder instance using the provided configuration.
  The function takes the ReceiptRuleActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addHeaderAction` | software.amazon.awscdk.services.ses.AddHeaderActionConfig | [[cdk.support/lookup-entry]] | `:add-header-action` |
| `bounceAction` | software.amazon.awscdk.services.ses.BounceActionConfig | [[cdk.support/lookup-entry]] | `:bounce-action` |
| `lambdaAction` | software.amazon.awscdk.services.ses.LambdaActionConfig | [[cdk.support/lookup-entry]] | `:lambda-action` |
| `s3Action` | software.amazon.awscdk.services.ses.S3ActionConfig | [[cdk.support/lookup-entry]] | `:s3-action` |
| `snsAction` | software.amazon.awscdk.services.ses.SNSActionConfig | [[cdk.support/lookup-entry]] | `:sns-action` |
| `stopAction` | software.amazon.awscdk.services.ses.StopActionConfig | [[cdk.support/lookup-entry]] | `:stop-action` |
| `workmailAction` | software.amazon.awscdk.services.ses.WorkmailActionConfig | [[cdk.support/lookup-entry]] | `:workmail-action` |
"
  [^ReceiptRuleActionConfig$Builder builder id config]
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
  (.build builder))


(defn receipt-rule-action-config-builder
  ""
  [id config]
  (build-receipt-rule-action-config-builder (new ReceiptRuleActionConfig$Builder) id config))


(defn build-receipt-rule-builder
  "The build-receipt-rule-builder function updates a ReceiptRule$Builder instance using the provided configuration.
  The function takes the ReceiptRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |
"
  [^ReceiptRule$Builder builder id config]
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
  (.build builder))


(defn receipt-rule-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-receipt-rule-builder (ReceiptRule$Builder/create scope (name id)) id config))


(defn build-receipt-rule-options-builder
  "The build-receipt-rule-options-builder function updates a ReceiptRuleOptions$Builder instance using the provided configuration.
  The function takes the ReceiptRuleOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |
"
  [^ReceiptRuleOptions$Builder builder id config]
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
  (.build builder))


(defn receipt-rule-options-builder
  ""
  [id config]
  (build-receipt-rule-options-builder (new ReceiptRuleOptions$Builder) id config))


(defn build-receipt-rule-props-builder
  "The build-receipt-rule-props-builder function updates a ReceiptRuleProps$Builder instance using the provided configuration.
  The function takes the ReceiptRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `after` | software.amazon.awscdk.services.ses.IReceiptRule | [[cdk.support/lookup-entry]] | `:after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `receiptRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-name` |
| `recipients` | java.util.List | [[cdk.support/lookup-entry]] | `:recipients` |
| `ruleSet` | software.amazon.awscdk.services.ses.IReceiptRuleSet | [[cdk.support/lookup-entry]] | `:rule-set` |
| `scanEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-enabled` |
| `tlsPolicy` | software.amazon.awscdk.services.ses.TlsPolicy | [[cdk.api.services.ses/tls-policy]] | `:tls-policy` |
"
  [^ReceiptRuleProps$Builder builder id config]
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
  (.build builder))


(defn receipt-rule-props-builder
  ""
  [id config]
  (build-receipt-rule-props-builder (new ReceiptRuleProps$Builder) id config))


(defn build-receipt-rule-set-builder
  "The build-receipt-rule-set-builder function updates a ReceiptRuleSet$Builder instance using the provided configuration.
  The function takes the ReceiptRuleSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dropSpam` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:drop-spam` |
| `receiptRuleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-set-name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^ReceiptRuleSet$Builder builder id config]
  (when-let [data (lookup-entry config id :drop-spam)]
    (. builder dropSpam data))
  (when-let [data (lookup-entry config id :receipt-rule-set-name)]
    (. builder receiptRuleSetName data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn receipt-rule-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-receipt-rule-set-builder (ReceiptRuleSet$Builder/create scope (name id)) id config))


(defn build-receipt-rule-set-props-builder
  "The build-receipt-rule-set-props-builder function updates a ReceiptRuleSetProps$Builder instance using the provided configuration.
  The function takes the ReceiptRuleSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dropSpam` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:drop-spam` |
| `receiptRuleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:receipt-rule-set-name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^ReceiptRuleSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :drop-spam)]
    (. builder dropSpam data))
  (when-let [data (lookup-entry config id :receipt-rule-set-name)]
    (. builder receiptRuleSetName data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn receipt-rule-set-props-builder
  ""
  [id config]
  (build-receipt-rule-set-props-builder (new ReceiptRuleSetProps$Builder) id config))


(defn build-s3-action-config-builder
  "The build-s3-action-config-builder function updates a S3ActionConfig$Builder instance using the provided configuration.
  The function takes the S3ActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^S3ActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn s3-action-config-builder
  ""
  [id config]
  (build-s3-action-config-builder (new S3ActionConfig$Builder) id config))


(defn build-sns-action-config-builder
  "The build-sns-action-config-builder function updates a SNSActionConfig$Builder instance using the provided configuration.
  The function takes the SNSActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^SNSActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :encoding)]
    (. builder encoding data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn sns-action-config-builder
  ""
  [id config]
  (build-sns-action-config-builder (new SNSActionConfig$Builder) id config))


(defn build-stop-action-config-builder
  "The build-stop-action-config-builder function updates a StopActionConfig$Builder instance using the provided configuration.
  The function takes the StopActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^StopActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn stop-action-config-builder
  ""
  [id config]
  (build-stop-action-config-builder (new StopActionConfig$Builder) id config))


(defn build-vdm-attributes-builder
  "The build-vdm-attributes-builder function updates a VdmAttributes$Builder instance using the provided configuration.
  The function takes the VdmAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:engagement-metrics` |
| `optimizedSharedDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |
"
  [^VdmAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :engagement-metrics)]
    (. builder engagementMetrics data))
  (when-let [data (lookup-entry config id :optimized-shared-delivery)]
    (. builder optimizedSharedDelivery data))
  (.build builder))


(defn vdm-attributes-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-vdm-attributes-builder (VdmAttributes$Builder/create scope (name id)) id config))


(defn build-vdm-attributes-props-builder
  "The build-vdm-attributes-props-builder function updates a VdmAttributesProps$Builder instance using the provided configuration.
  The function takes the VdmAttributesProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engagementMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:engagement-metrics` |
| `optimizedSharedDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optimized-shared-delivery` |
"
  [^VdmAttributesProps$Builder builder id config]
  (when-let [data (lookup-entry config id :engagement-metrics)]
    (. builder engagementMetrics data))
  (when-let [data (lookup-entry config id :optimized-shared-delivery)]
    (. builder optimizedSharedDelivery data))
  (.build builder))


(defn vdm-attributes-props-builder
  ""
  [id config]
  (build-vdm-attributes-props-builder (new VdmAttributesProps$Builder) id config))


(defn build-workmail-action-config-builder
  "The build-workmail-action-config-builder function updates a WorkmailActionConfig$Builder instance using the provided configuration.
  The function takes the WorkmailActionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^WorkmailActionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :organization-arn)]
    (. builder organizationArn data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn workmail-action-config-builder
  ""
  [id config]
  (build-workmail-action-config-builder (new WorkmailActionConfig$Builder) id config))