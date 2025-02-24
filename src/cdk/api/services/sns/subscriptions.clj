(ns cdk.api.services.sns.subscriptions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sns.subscriptions package. "
  (:require [cdk.api.services.sns :refer [subscription-protocol]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sns.subscriptions EmailSubscription$Builder
                                                              EmailSubscriptionProps$Builder
                                                              LambdaSubscription$Builder
                                                              LambdaSubscriptionProps$Builder
                                                              SmsSubscription$Builder
                                                              SmsSubscriptionProps$Builder
                                                              SqsSubscription$Builder
                                                              SqsSubscriptionProps$Builder
                                                              SubscriptionProps$Builder
                                                              UrlSubscription$Builder
                                                              UrlSubscriptionProps$Builder]))


(defn build-email-subscription-builder
  "The build-email-subscription-builder function updates a EmailSubscription$Builder instance using the provided configuration.
  The function takes the EmailSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |
"
  [^EmailSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (.build builder))


(defn build-email-subscription-props-builder
  "The build-email-subscription-props-builder function updates a EmailSubscriptionProps$Builder instance using the provided configuration.
  The function takes the EmailSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |
"
  [^EmailSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (.build builder))


(defn email-subscription-props-builder
  ""
  [id config]
  (build-email-subscription-props-builder (new EmailSubscriptionProps$Builder) id config))


(defn build-lambda-subscription-builder
  "The build-lambda-subscription-builder function updates a LambdaSubscription$Builder instance using the provided configuration.
  The function takes the LambdaSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^LambdaSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn build-lambda-subscription-props-builder
  "The build-lambda-subscription-props-builder function updates a LambdaSubscriptionProps$Builder instance using the provided configuration.
  The function takes the LambdaSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^LambdaSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn lambda-subscription-props-builder
  ""
  [id config]
  (build-lambda-subscription-props-builder (new LambdaSubscriptionProps$Builder) id config))


(defn build-sms-subscription-builder
  "The build-sms-subscription-builder function updates a SmsSubscription$Builder instance using the provided configuration.
  The function takes the SmsSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^SmsSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn build-sms-subscription-props-builder
  "The build-sms-subscription-props-builder function updates a SmsSubscriptionProps$Builder instance using the provided configuration.
  The function takes the SmsSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^SmsSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn sms-subscription-props-builder
  ""
  [id config]
  (build-sms-subscription-props-builder (new SmsSubscriptionProps$Builder) id config))


(defn build-sqs-subscription-builder
  "The build-sqs-subscription-builder function updates a SqsSubscription$Builder instance using the provided configuration.
  The function takes the SqsSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
"
  [^SqsSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (.build builder))


(defn build-sqs-subscription-props-builder
  "The build-sqs-subscription-props-builder function updates a SqsSubscriptionProps$Builder instance using the provided configuration.
  The function takes the SqsSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
"
  [^SqsSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (.build builder))


(defn sqs-subscription-props-builder
  ""
  [id config]
  (build-sqs-subscription-props-builder (new SqsSubscriptionProps$Builder) id config))


(defn build-subscription-props-builder
  "The build-subscription-props-builder function updates a SubscriptionProps$Builder instance using the provided configuration.
  The function takes the SubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
"
  [^SubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (.build builder))


(defn subscription-props-builder
  ""
  [id config]
  (build-subscription-props-builder (new SubscriptionProps$Builder) id config))


(defn build-url-subscription-builder
  "The build-url-subscription-builder function updates a UrlSubscription$Builder instance using the provided configuration.
  The function takes the UrlSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
"
  [^UrlSubscription$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (subscription-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (.build builder))


(defn build-url-subscription-props-builder
  "The build-url-subscription-props-builder function updates a UrlSubscriptionProps$Builder instance using the provided configuration.
  The function takes the UrlSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |
"
  [^UrlSubscriptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :dead-letter-queue)]
    (. builder deadLetterQueue data))
  (when-let [data (lookup-entry config id :filter-policy)]
    (. builder filterPolicy data))
  (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
    (. builder filterPolicyWithMessageBody data))
  (when-let [data (subscription-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :raw-message-delivery)]
    (. builder rawMessageDelivery data))
  (.build builder))


(defn url-subscription-props-builder
  ""
  [id config]
  (build-url-subscription-props-builder (new UrlSubscriptionProps$Builder) id config))