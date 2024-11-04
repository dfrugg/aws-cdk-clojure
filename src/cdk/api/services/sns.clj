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


(defn between-condition-builder
  "The between-condition-builder function buildes out new instances of 
BetweenCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `start` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start` |
| `stop` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stop` |"
  [stack id config]
  (let [builder (BetweenCondition$Builder.)]
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :stop)]
      (. builder stop data))
    (.build builder)))


(defn cfn-subscription-builder
  "The cfn-subscription-builder function buildes out new instances of 
CfnSubscription$Builder using the provided configuration.  Each field is set as follows:

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
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnSubscription$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-subscription-props-builder
  "The cfn-subscription-props-builder function buildes out new instances of 
CfnSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnSubscriptionProps$Builder.)]
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
    (.build builder)))


(defn cfn-topic-builder
  "The cfn-topic-builder function buildes out new instances of 
CfnTopic$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracing-config` |"
  [stack id config]
  (let [builder (CfnTopic$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-topic-inline-policy-builder
  "The cfn-topic-inline-policy-builder function buildes out new instances of 
CfnTopicInlinePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnTopicInlinePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-topic-inline-policy-props-builder
  "The cfn-topic-inline-policy-props-builder function buildes out new instances of 
CfnTopicInlinePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnTopicInlinePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-topic-logging-config-property-builder
  "The cfn-topic-logging-config-property-builder function buildes out new instances of 
CfnTopic$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureFeedbackRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-feedback-role-arn` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `successFeedbackRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-feedback-role-arn` |
| `successFeedbackSampleRate` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-feedback-sample-rate` |"
  [stack id config]
  (let [builder (CfnTopic$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-feedback-role-arn)]
      (. builder failureFeedbackRoleArn data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :success-feedback-role-arn)]
      (. builder successFeedbackRoleArn data))
    (when-let [data (lookup-entry config id :success-feedback-sample-rate)]
      (. builder successFeedbackSampleRate data))
    (.build builder)))


(defn cfn-topic-policy-builder
  "The cfn-topic-policy-builder function buildes out new instances of 
CfnTopicPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (CfnTopicPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn cfn-topic-policy-props-builder
  "The cfn-topic-policy-props-builder function buildes out new instances of 
CfnTopicPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (CfnTopicPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn cfn-topic-props-builder
  "The cfn-topic-props-builder function buildes out new instances of 
CfnTopicProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracing-config` |"
  [stack id config]
  (let [builder (CfnTopicProps$Builder.)]
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
    (.build builder)))


(defn cfn-topic-subscription-property-builder
  "The cfn-topic-subscription-property-builder function buildes out new instances of 
CfnTopic$SubscriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnTopic$SubscriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn logging-config-builder
  "The logging-config-builder function buildes out new instances of 
LoggingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureFeedbackRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:failure-feedback-role` |
| `protocol` | software.amazon.awscdk.services.sns.LoggingProtocol | [[cdk.api.services.sns/logging-protocol]] | `:protocol` |
| `successFeedbackRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:success-feedback-role` |
| `successFeedbackSampleRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:success-feedback-sample-rate` |"
  [stack id config]
  (let [builder (LoggingConfig$Builder.)]
    (when-let [data (lookup-entry config id :failure-feedback-role)]
      (. builder failureFeedbackRole data))
    (when-let [data (logging-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :success-feedback-role)]
      (. builder successFeedbackRole data))
    (when-let [data (lookup-entry config id :success-feedback-sample-rate)]
      (. builder successFeedbackSampleRate data))
    (.build builder)))


(defn numeric-conditions-builder
  "The numeric-conditions-builder function buildes out new instances of 
NumericConditions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowlist` | java.util.List | [[cdk.support/lookup-entry]] | `:allowlist` |
| `between` | software.amazon.awscdk.services.sns.BetweenCondition | [[cdk.support/lookup-entry]] | `:between` |
| `betweenStrict` | software.amazon.awscdk.services.sns.BetweenCondition | [[cdk.support/lookup-entry]] | `:between-strict` |
| `greaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:greater-than` |
| `greaterThanOrEqualTo` | java.lang.Number | [[cdk.support/lookup-entry]] | `:greater-than-or-equal-to` |
| `lessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:less-than` |
| `lessThanOrEqualTo` | java.lang.Number | [[cdk.support/lookup-entry]] | `:less-than-or-equal-to` |"
  [stack id config]
  (let [builder (NumericConditions$Builder.)]
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
    (.build builder)))


(defn string-conditions-builder
  "The string-conditions-builder function buildes out new instances of 
StringConditions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowlist` | java.util.List | [[cdk.support/lookup-entry]] | `:allowlist` |
| `denylist` | java.util.List | [[cdk.support/lookup-entry]] | `:denylist` |
| `matchPrefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:match-prefixes` |
| `matchSuffixes` | java.util.List | [[cdk.support/lookup-entry]] | `:match-suffixes` |"
  [stack id config]
  (let [builder (StringConditions$Builder.)]
    (when-let [data (lookup-entry config id :allowlist)]
      (. builder allowlist data))
    (when-let [data (lookup-entry config id :denylist)]
      (. builder denylist data))
    (when-let [data (lookup-entry config id :match-prefixes)]
      (. builder matchPrefixes data))
    (when-let [data (lookup-entry config id :match-suffixes)]
      (. builder matchSuffixes data))
    (.build builder)))


(defn subscription-builder
  "The subscription-builder function buildes out new instances of 
Subscription$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (Subscription$Builder/create stack id)]
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
    (.build builder)))


(defn subscription-options-builder
  "The subscription-options-builder function buildes out new instances of 
SubscriptionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |"
  [stack id config]
  (let [builder (SubscriptionOptions$Builder.)]
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
    (.build builder)))


(defn subscription-props-builder
  "The subscription-props-builder function buildes out new instances of 
SubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (SubscriptionProps$Builder.)]
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
    (.build builder)))


(defn topic-attributes-builder
  "The topic-attributes-builder function buildes out new instances of 
TopicAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentBasedDeduplication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:content-based-deduplication` |
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (TopicAttributes$Builder.)]
    (when-let [data (lookup-entry config id :content-based-deduplication)]
      (. builder contentBasedDeduplication data))
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn topic-builder
  "The topic-builder function buildes out new instances of 
Topic$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingConfig` | software.amazon.awscdk.services.sns.TracingConfig | [[cdk.api.services.sns/tracing-config]] | `:tracing-config` |"
  [stack id config]
  (let [builder (Topic$Builder/create stack id)]
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
    (.build builder)))


(defn topic-policy-builder
  "The topic-policy-builder function buildes out new instances of 
TopicPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `policyDocument` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (TopicPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enforce-ssl)]
      (. builder enforceSsl data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn topic-policy-props-builder
  "The topic-policy-props-builder function buildes out new instances of 
TopicPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `policyDocument` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:policy-document` |
| `topics` | java.util.List | [[cdk.support/lookup-entry]] | `:topics` |"
  [stack id config]
  (let [builder (TopicPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :enforce-ssl)]
      (. builder enforceSsl data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :topics)]
      (. builder topics data))
    (.build builder)))


(defn topic-props-builder
  "The topic-props-builder function buildes out new instances of 
TopicProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tracingConfig` | software.amazon.awscdk.services.sns.TracingConfig | [[cdk.api.services.sns/tracing-config]] | `:tracing-config` |"
  [stack id config]
  (let [builder (TopicProps$Builder.)]
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
    (.build builder)))


(defn topic-subscription-config-builder
  "The topic-subscription-config-builder function buildes out new instances of 
TopicSubscriptionConfig$Builder using the provided configuration.  Each field is set as follows:

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
| `subscriptionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-role-arn` |"
  [stack id config]
  (let [builder (TopicSubscriptionConfig$Builder.)]
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
    (.build builder)))