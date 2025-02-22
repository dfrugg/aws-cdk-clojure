(ns cdk.api.services.sns
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sns package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sns BetweenCondition$Builder
                                                CfnSubscription$Builder
                                                CfnSubscriptionProps$Builder
                                                CfnTopic$Builder
                                                CfnTopic$LoggingConfigProperty$Builder
                                                CfnTopic$SubscriptionProperty$Builder
                                                CfnTopicInlinePolicy$Builder
                                                CfnTopicInlinePolicyProps$Builder
                                                CfnTopicPolicy$Builder
                                                CfnTopicPolicyProps$Builder
                                                CfnTopicProps$Builder
                                                FilterOrPolicyType
                                                LoggingConfig$Builder
                                                LoggingProtocol
                                                NumericConditions$Builder
                                                StringConditions$Builder
                                                Subscription$Builder
                                                SubscriptionOptions$Builder
                                                SubscriptionProps$Builder
                                                SubscriptionProtocol
                                                Topic$Builder
                                                TopicAttributes$Builder
                                                TopicPolicy$Builder
                                                TopicPolicyProps$Builder
                                                TopicProps$Builder
                                                TopicSubscriptionConfig$Builder
                                                TracingConfig]))


(defn filter-or-policy-type
  "The `filter-or-policy-type` function data interprets values in the provided config data into a 
`FilterOrPolicyType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FilterOrPolicyType` - the value is returned.
* is `:policy` - `FilterOrPolicyType/POLICY` is returned
* is `:filter` - `FilterOrPolicyType/FILTER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FilterOrPolicyType data) data
      (= :policy data) FilterOrPolicyType/POLICY
      (= :filter data) FilterOrPolicyType/FILTER)))


(defn logging-protocol
  "The `logging-protocol` function data interprets values in the provided config data into a 
`LoggingProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoggingProtocol` - the value is returned.
* is `:firehose` - `LoggingProtocol/FIREHOSE` is returned
* is `:sqs` - `LoggingProtocol/SQS` is returned
* is `:http` - `LoggingProtocol/HTTP` is returned
* is `:application` - `LoggingProtocol/APPLICATION` is returned
* is `:lambda` - `LoggingProtocol/LAMBDA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoggingProtocol data) data
      (= :firehose data) LoggingProtocol/FIREHOSE
      (= :sqs data) LoggingProtocol/SQS
      (= :http data) LoggingProtocol/HTTP
      (= :application data) LoggingProtocol/APPLICATION
      (= :lambda data) LoggingProtocol/LAMBDA)))


(defn subscription-protocol
  "The `subscription-protocol` function data interprets values in the provided config data into a 
`SubscriptionProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SubscriptionProtocol` - the value is returned.
* is `:http` - `SubscriptionProtocol/HTTP` is returned
* is `:application` - `SubscriptionProtocol/APPLICATION` is returned
* is `:email-json` - `SubscriptionProtocol/EMAIL_JSON` is returned
* is `:sqs` - `SubscriptionProtocol/SQS` is returned
* is `:sms` - `SubscriptionProtocol/SMS` is returned
* is `:https` - `SubscriptionProtocol/HTTPS` is returned
* is `:lambda` - `SubscriptionProtocol/LAMBDA` is returned
* is `:email` - `SubscriptionProtocol/EMAIL` is returned
* is `:firehose` - `SubscriptionProtocol/FIREHOSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SubscriptionProtocol data) data
      (= :http data) SubscriptionProtocol/HTTP
      (= :application data) SubscriptionProtocol/APPLICATION
      (= :email-json data) SubscriptionProtocol/EMAIL_JSON
      (= :sqs data) SubscriptionProtocol/SQS
      (= :sms data) SubscriptionProtocol/SMS
      (= :https data) SubscriptionProtocol/HTTPS
      (= :lambda data) SubscriptionProtocol/LAMBDA
      (= :email data) SubscriptionProtocol/EMAIL
      (= :firehose data) SubscriptionProtocol/FIREHOSE)))


(defn tracing-config
  "The `tracing-config` function data interprets values in the provided config data into a 
`TracingConfig` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TracingConfig` - the value is returned.
* is `:active` - `TracingConfig/ACTIVE` is returned
* is `:pass-through` - `TracingConfig/PASS_THROUGH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TracingConfig data) data
      (= :active data) TracingConfig/ACTIVE
      (= :pass-through data) TracingConfig/PASS_THROUGH)))


(defn build-between-condition-builder
  "The build-between-condition-builder function updates a BetweenCondition$Builder instance using the provided configuration.
  The function takes the BetweenCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `start` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start` |
| `stop` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stop` |
"
  [^BetweenCondition$Builder builder id config]
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (when-let [data (lookup-entry config id :stop)]
    (. builder stop data))
  (.build builder))


(defn build-cfn-subscription-builder
  "The build-cfn-subscription-builder function updates a CfnSubscription$Builder instance using the provided configuration.
  The function takes the CfnSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delivery-policy` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-policy-scope` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `rawMessageDelivery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `redrivePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:redrive-policy` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `replayPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:replay-policy` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-policy)]
    (. builder deliveryPolicy data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-scope)]
    (. builder filterPolicyScope data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (when-let [data (lookup-entry config id :redrive-policy)]
    (. builder redrivePolicy data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :replay-policy)]
    (. builder replayPolicy data))
  (when-let [data (lookup-entry config id :subscription-role-arn)]
    (. builder subscriptionRoleArn data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn build-cfn-subscription-props-builder
  "The build-cfn-subscription-props-builder function updates a CfnSubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:delivery-policy` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-policy-scope` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `rawMessageDelivery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `redrivePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:redrive-policy` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `replayPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:replay-policy` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-policy)]
    (. builder deliveryPolicy data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-scope)]
    (. builder filterPolicyScope data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (when-let [data (lookup-entry config id :redrive-policy)]
    (. builder redrivePolicy data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :replay-policy)]
    (. builder replayPolicy data))
  (when-let [data (lookup-entry config id :subscription-role-arn)]
    (. builder subscriptionRoleArn data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn build-cfn-topic-builder
  "The build-cfn-topic-builder function updates a CfnTopic$Builder instance using the provided configuration.
  The function takes the CfnTopic$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archivePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:archive-policy` |
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `dataProtectionPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `deliveryStatusLogging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delivery-status-logging` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `fifoTopic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo-topic` |
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |
| `signatureVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signature-version` |
| `subscription` | java.util.List | [[cdk.support/lookup-entry]] | `:subscription` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
| `tracingConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracing-config` |
"
  [^CfnTopic$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-policy)]
    (. builder archivePolicy data))
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :data-protection-policy)]
    (. builder dataProtectionPolicy data))
  (when-let [data (lookup-entry config id :delivery-status-logging)]
    (. builder deliveryStatusLogging data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :fifo-topic)]
    (. builder fifoTopic data))
  (when-let [data (lookup-entry config id :kms-master-key-id)]
    (. builder kmsMasterKeyId data))
  (when-let [data (lookup-entry config id :signature-version)]
    (. builder signatureVersion data))
  (when-let [data (lookup-entry config id :subscription)]
    (. builder subscription data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (when-let [data (lookup-entry config id :tracing-config)]
    (. builder tracingConfig data))
  (.build builder))


(defn build-cfn-topic-inline-policy-builder
  "The build-cfn-topic-inline-policy-builder function updates a CfnTopicInlinePolicy$Builder instance using the provided configuration.
  The function takes the CfnTopicInlinePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnTopicInlinePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn build-cfn-topic-inline-policy-props-builder
  "The build-cfn-topic-inline-policy-props-builder function updates a CfnTopicInlinePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnTopicInlinePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnTopicInlinePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn build-cfn-topic-logging-config-property-builder
  "The build-cfn-topic-logging-config-property-builder function updates a CfnTopic$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTopic$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureFeedbackRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-feedback-role-arn` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `successFeedbackRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-feedback-role-arn` |
| `successFeedbackSampleRate` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-feedback-sample-rate` |
"
  [^CfnTopic$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-feedback-role-arn)]
    (. builder failureFeedbackRoleArn data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :success-feedback-role-arn)]
    (. builder successFeedbackRoleArn data))
  (when-let [data (lookup-entry config id :success-feedback-sample-rate)]
    (. builder successFeedbackSampleRate data))
  (.build builder))


(defn build-cfn-topic-policy-builder
  "The build-cfn-topic-policy-builder function updates a CfnTopicPolicy$Builder instance using the provided configuration.
  The function takes the CfnTopicPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^CfnTopicPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (.build builder))


(defn build-cfn-topic-policy-props-builder
  "The build-cfn-topic-policy-props-builder function updates a CfnTopicPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnTopicPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^CfnTopicPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (.build builder))


(defn build-cfn-topic-props-builder
  "The build-cfn-topic-props-builder function updates a CfnTopicProps$Builder instance using the provided configuration.
  The function takes the CfnTopicProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archivePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:archive-policy` |
| `contentBasedDeduplication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `dataProtectionPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-protection-policy` |
| `deliveryStatusLogging` | java.util.List | [[cdk.support/lookup-entry]] | `:delivery-status-logging` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `fifoTopic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fifo-topic` |
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |
| `signatureVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signature-version` |
| `subscription` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscription` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
| `tracingConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracing-config` |
"
  [^CfnTopicProps$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-policy)]
    (. builder archivePolicy data))
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :data-protection-policy)]
    (. builder dataProtectionPolicy data))
  (when-let [data (lookup-entry config id :delivery-status-logging)]
    (. builder deliveryStatusLogging data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :fifo-topic)]
    (. builder fifoTopic data))
  (when-let [data (lookup-entry config id :kms-master-key-id)]
    (. builder kmsMasterKeyId data))
  (when-let [data (lookup-entry config id :signature-version)]
    (. builder signatureVersion data))
  (when-let [data (lookup-entry config id :subscription)]
    (. builder subscription data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (when-let [data (lookup-entry config id :tracing-config)]
    (. builder tracingConfig data))
  (.build builder))


(defn build-cfn-topic-subscription-property-builder
  "The build-cfn-topic-subscription-property-builder function updates a CfnTopic$SubscriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopic$SubscriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnTopic$SubscriptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn build-logging-config-builder
  "The build-logging-config-builder function updates a LoggingConfig$Builder instance using the provided configuration.
  The function takes the LoggingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureFeedbackRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:failure-feedback-role` |
| `protocol` | software.amazon.awscdk.services.sns.LoggingProtocol | [[cdk.api.services.sns/logging-protocol]] | `:protocol` |
| `successFeedbackRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:success-feedback-role` |
| `successFeedbackSampleRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:success-feedback-sample-rate` |
"
  [^LoggingConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-feedback-role)]
    (. builder failureFeedbackRole data))
  (when-let [data (logging-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :success-feedback-role)]
    (. builder successFeedbackRole data))
  (when-let [data (lookup-entry config id :success-feedback-sample-rate)]
    (. builder successFeedbackSampleRate data))
  (.build builder))


(defn build-numeric-conditions-builder
  "The build-numeric-conditions-builder function updates a NumericConditions$Builder instance using the provided configuration.
  The function takes the NumericConditions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowlist` | java.util.List | [[cdk.support/lookup-entry]] | `:allowlist` |
| `between` | software.amazon.awscdk.services.sns.BetweenCondition | [[cdk.support/lookup-entry]] | `:between` |
| `betweenStrict` | software.amazon.awscdk.services.sns.BetweenCondition | [[cdk.support/lookup-entry]] | `:between-strict` |
| `greaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:greater-than` |
| `greaterThanOrEqualTo` | java.lang.Number | [[cdk.support/lookup-entry]] | `:greater-than-or-equal-to` |
| `lessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:less-than` |
| `lessThanOrEqualTo` | java.lang.Number | [[cdk.support/lookup-entry]] | `:less-than-or-equal-to` |
"
  [^NumericConditions$Builder builder id config]
  (when-let [data (lookup-entry config id :allowlist)]
    (. builder allowlist data))
  (when-let [data (lookup-entry config id :between)]
    (. builder between data))
  (when-let [data (lookup-entry config id :between-strict)]
    (. builder betweenStrict data))
  (when-let [data (lookup-entry config id :greater-than)]
    (. builder greaterThan data))
  (when-let [data (lookup-entry config id :greater-than-or-equal-to)]
    (. builder greaterThanOrEqualTo data))
  (when-let [data (lookup-entry config id :less-than)]
    (. builder lessThan data))
  (when-let [data (lookup-entry config id :less-than-or-equal-to)]
    (. builder lessThanOrEqualTo data))
  (.build builder))


(defn build-string-conditions-builder
  "The build-string-conditions-builder function updates a StringConditions$Builder instance using the provided configuration.
  The function takes the StringConditions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowlist` | java.util.List | [[cdk.support/lookup-entry]] | `:allowlist` |
| `denylist` | java.util.List | [[cdk.support/lookup-entry]] | `:denylist` |
| `matchPrefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:match-prefixes` |
| `matchSuffixes` | java.util.List | [[cdk.support/lookup-entry]] | `:match-suffixes` |
"
  [^StringConditions$Builder builder id config]
  (when-let [data (lookup-entry config id :allowlist)]
    (. builder allowlist data))
  (when-let [data (lookup-entry config id :denylist)]
    (. builder denylist data))
  (when-let [data (lookup-entry config id :match-prefixes)]
    (. builder matchPrefixes data))
  (when-let [data (lookup-entry config id :match-suffixes)]
    (. builder matchSuffixes data))
  (.build builder))


(defn build-subscription-builder
  "The build-subscription-builder function updates a Subscription$Builder instance using the provided configuration.
  The function takes the Subscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^Subscription$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (subscription-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :subscription-role-arn)]
    (. builder subscriptionRoleArn data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn build-subscription-options-builder
  "The build-subscription-options-builder function updates a SubscriptionOptions$Builder instance using the provided configuration.
  The function takes the SubscriptionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |
"
  [^SubscriptionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (subscription-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :subscription-role-arn)]
    (. builder subscriptionRoleArn data))
  (.build builder))


(defn build-subscription-props-builder
  "The build-subscription-props-builder function updates a SubscriptionProps$Builder instance using the provided configuration.
  The function takes the SubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^SubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (subscription-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :subscription-role-arn)]
    (. builder subscriptionRoleArn data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn build-topic-attributes-builder
  "The build-topic-attributes-builder function updates a TopicAttributes$Builder instance using the provided configuration.
  The function takes the TopicAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^TopicAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn build-topic-builder
  "The build-topic-builder function updates a Topic$Builder instance using the provided configuration.
  The function takes the Topic$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `fifo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo` |
| `loggingConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:logging-configs` |
| `masterKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:master-key` |
| `messageRetentionPeriodInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-retention-period-in-days` |
| `signatureVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signature-version` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
| `tracingConfig` | software.amazon.awscdk.services.sns.TracingConfig | [[cdk.api.services.sns/tracing-config]] | `:tracing-config` |
"
  [^Topic$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :fifo)]
    (. builder fifo data))
  (when-let [data (lookup-entry config id :logging-configs)]
    (. builder loggingConfigs data))
  (when-let [data (lookup-entry config id :master-key)]
    (. builder masterKey data))
  (when-let [data (lookup-entry config id :message-retention-period-in-days)]
    (. builder messageRetentionPeriodInDays data))
  (when-let [data (lookup-entry config id :signature-version)]
    (. builder signatureVersion data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (when-let [data (tracing-config config id :tracing-config)]
    (. builder tracingConfig data))
  (.build builder))


(defn build-topic-policy-builder
  "The build-topic-policy-builder function updates a TopicPolicy$Builder instance using the provided configuration.
  The function takes the TopicPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `policyDocument` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^TopicPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (.build builder))


(defn build-topic-policy-props-builder
  "The build-topic-policy-props-builder function updates a TopicPolicyProps$Builder instance using the provided configuration.
  The function takes the TopicPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `policyDocument` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |
"
  [^TopicPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :topics)]
    (. builder topics data))
  (.build builder))


(defn build-topic-props-builder
  "The build-topic-props-builder function updates a TopicProps$Builder instance using the provided configuration.
  The function takes the TopicProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `fifo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fifo` |
| `loggingConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:logging-configs` |
| `masterKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:master-key` |
| `messageRetentionPeriodInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-retention-period-in-days` |
| `signatureVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signature-version` |
| `topicName` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-name` |
| `tracingConfig` | software.amazon.awscdk.services.sns.TracingConfig | [[cdk.api.services.sns/tracing-config]] | `:tracing-config` |
"
  [^TopicProps$Builder builder id config]
  (when-let [data (lookup-entry config id :content-based-deduplication)]
    (. builder contentBasedDeduplication data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :fifo)]
    (. builder fifo data))
  (when-let [data (lookup-entry config id :logging-configs)]
    (. builder loggingConfigs data))
  (when-let [data (lookup-entry config id :master-key)]
    (. builder masterKey data))
  (when-let [data (lookup-entry config id :message-retention-period-in-days)]
    (. builder messageRetentionPeriodInDays data))
  (when-let [data (lookup-entry config id :signature-version)]
    (. builder signatureVersion data))
  (when-let [data (lookup-entry config id :topic-name)]
    (. builder topicName data))
  (when-let [data (tracing-config config id :tracing-config)]
    (. builder tracingConfig data))
  (.build builder))


(defn build-topic-subscription-config-builder
  "The build-topic-subscription-config-builder function updates a TopicSubscriptionConfig$Builder instance using the provided configuration.
  The function takes the TopicSubscriptionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subscriberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-id` |
| `subscriberScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:subscriber-scope` |
| `subscriptionDependency` | software.constructs.IDependable | [[cdk.support/lookup-entry]] | `:subscription-dependency` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |
"
  [^TopicSubscriptionConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (subscription-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :subscriber-id)]
    (. builder subscriberId data))
  (when-let [data (lookup-entry config id :subscriber-scope)]
    (. builder subscriberScope data))
  (when-let [data (lookup-entry config id :subscription-dependency)]
    (. builder subscriptionDependency data))
  (when-let [data (lookup-entry config id :subscription-role-arn)]
    (. builder subscriptionRoleArn data))
  (.build builder))