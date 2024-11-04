(ns cdk.api.services.sns.subscriptions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sns.subscriptions package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.sns :refer [subscription-protocol]])
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


(defn email-subscription-builder
  "The email-subscription-builder function buildes out new instances of 
EmailSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |"
  [stack id config ^java.lang.String email-address]
  (let [builder (EmailSubscription$Builder/create ^java.lang.String email-address)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (.build builder)))


(defn email-subscription-props-builder
  "The email-subscription-props-builder function buildes out new instances of 
EmailSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |"
  [stack id config]
  (let [builder (EmailSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (.build builder)))


(defn lambda-subscription-builder
  "The lambda-subscription-builder function buildes out new instances of 
LambdaSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (LambdaSubscription$Builder/create ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn lambda-subscription-props-builder
  "The lambda-subscription-props-builder function buildes out new instances of 
LambdaSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config]
  (let [builder (LambdaSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn sms-subscription-builder
  "The sms-subscription-builder function buildes out new instances of 
SmsSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config ^java.lang.String phone-number]
  (let [builder (SmsSubscription$Builder/create ^java.lang.String phone-number)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn sms-subscription-props-builder
  "The sms-subscription-props-builder function buildes out new instances of 
SmsSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config]
  (let [builder (SmsSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn sqs-subscription-builder
  "The sqs-subscription-builder function buildes out new instances of 
SqsSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |"
  [stack id config ^software.amazon.awscdk.services.sqs.IQueue queue]
  (let [builder (SqsSubscription$Builder/create ^software.amazon.awscdk.services.sqs.IQueue queue)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (when-let [data (lookup-entry config id :raw-message-delivery)]
      (. builder rawMessageDelivery data))
    (.build builder)))


(defn sqs-subscription-props-builder
  "The sqs-subscription-props-builder function buildes out new instances of 
SqsSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |"
  [stack id config]
  (let [builder (SqsSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (when-let [data (lookup-entry config id :raw-message-delivery)]
      (. builder rawMessageDelivery data))
    (.build builder)))


(defn subscription-props-builder
  "The subscription-props-builder function buildes out new instances of 
SubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |"
  [stack id config]
  (let [builder (SubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :filter-policy)]
      (. builder filterPolicy data))
    (when-let [data (lookup-entry config id :filter-policy-with-message-body)]
      (. builder filterPolicyWithMessageBody data))
    (.build builder)))


(defn url-subscription-builder
  "The url-subscription-builder function buildes out new instances of 
UrlSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |"
  [stack id config ^java.lang.String url]
  (let [builder (UrlSubscription$Builder/create ^java.lang.String url)]
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
    (.build builder)))


(defn url-subscription-props-builder
  "The url-subscription-props-builder function buildes out new instances of 
UrlSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `filterPolicy` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy` |
| `filterPolicyWithMessageBody` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter-policy-with-message-body` |
| `protocol` | software.amazon.awscdk.services.sns.SubscriptionProtocol | [[cdk.api.services.sns/subscription-protocol]] | `:protocol` |
| `rawMessageDelivery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:raw-message-delivery` |"
  [stack id config]
  (let [builder (UrlSubscriptionProps$Builder.)]
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
    (.build builder)))