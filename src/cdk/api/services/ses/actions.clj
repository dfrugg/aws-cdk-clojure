(ns cdk.api.services.ses.actions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ses.actions package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ses.actions AddHeader$Builder
                                                        AddHeaderProps$Builder
                                                        Bounce$Builder
                                                        BounceProps$Builder
                                                        BounceTemplate$Builder
                                                        BounceTemplateProps$Builder
                                                        EmailEncoding
                                                        Lambda$Builder
                                                        LambdaInvocationType
                                                        LambdaProps$Builder
                                                        S3$Builder
                                                        S3Props$Builder
                                                        Sns$Builder
                                                        SnsProps$Builder
                                                        Stop$Builder
                                                        StopProps$Builder
                                                        WorkMail$Builder
                                                        WorkMailProps$Builder]))


(defn email-encoding
  "The `email-encoding` function data interprets values in the provided config data into a 
`EmailEncoding` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmailEncoding` - the value is returned.
* is `:base64` - `EmailEncoding/BASE64` is returned
* is `:utf8` - `EmailEncoding/UTF8` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmailEncoding data) data
      (= :base64 data) EmailEncoding/BASE64
      (= :utf8 data) EmailEncoding/UTF8)))


(defn lambda-invocation-type
  "The `lambda-invocation-type` function data interprets values in the provided config data into a 
`LambdaInvocationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LambdaInvocationType` - the value is returned.
* is `:event` - `LambdaInvocationType/EVENT` is returned
* is `:request-response` - `LambdaInvocationType/REQUEST_RESPONSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LambdaInvocationType data) data
      (= :event data) LambdaInvocationType/EVENT
      (= :request-response data) LambdaInvocationType/REQUEST_RESPONSE)))


(defn add-header-builder
  "The add-header-builder function buildes out new instances of 
AddHeader$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (AddHeader$Builder/create)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn add-header-props-builder
  "The add-header-props-builder function buildes out new instances of 
AddHeaderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (AddHeaderProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn bounce-builder
  "The bounce-builder function buildes out new instances of 
Bounce$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `template` | software.amazon.awscdk.services.ses.actions.BounceTemplate | [[cdk.support/lookup-entry]] | `:template` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (Bounce$Builder/create)]
    (when-let [data (lookup-entry config id :sender)]
      (. builder sender data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn bounce-props-builder
  "The bounce-props-builder function buildes out new instances of 
BounceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `template` | software.amazon.awscdk.services.ses.actions.BounceTemplate | [[cdk.support/lookup-entry]] | `:template` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (BounceProps$Builder.)]
    (when-let [data (lookup-entry config id :sender)]
      (. builder sender data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn bounce-template-builder
  "The bounce-template-builder function buildes out new instances of 
BounceTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (BounceTemplate$Builder/create)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :smtp-reply-code)]
      (. builder smtpReplyCode data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn bounce-template-props-builder
  "The bounce-template-props-builder function buildes out new instances of 
BounceTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (BounceTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :smtp-reply-code)]
      (. builder smtpReplyCode data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn lambda-builder
  "The lambda-builder function buildes out new instances of 
Lambda$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invocationType` | software.amazon.awscdk.services.ses.actions.LambdaInvocationType | [[cdk.api.services.ses.actions/lambda-invocation-type]] | `:invocation-type` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (Lambda$Builder/create)]
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (lambda-invocation-type config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn lambda-props-builder
  "The lambda-props-builder function buildes out new instances of 
LambdaProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invocationType` | software.amazon.awscdk.services.ses.actions.LambdaInvocationType | [[cdk.api.services.ses.actions/lambda-invocation-type]] | `:invocation-type` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (LambdaProps$Builder.)]
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (lambda-invocation-type config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn s3-builder
  "The s3-builder function buildes out new instances of 
S3$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (S3$Builder/create)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn s3-props-builder
  "The s3-props-builder function buildes out new instances of 
S3Props$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (S3Props$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn sns-builder
  "The sns-builder function buildes out new instances of 
Sns$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | software.amazon.awscdk.services.ses.actions.EmailEncoding | [[cdk.api.services.ses.actions/email-encoding]] | `:encoding` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (Sns$Builder/create)]
    (when-let [data (email-encoding config id :encoding)]
      (. builder encoding data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn sns-props-builder
  "The sns-props-builder function buildes out new instances of 
SnsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | software.amazon.awscdk.services.ses.actions.EmailEncoding | [[cdk.api.services.ses.actions/email-encoding]] | `:encoding` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (SnsProps$Builder.)]
    (when-let [data (email-encoding config id :encoding)]
      (. builder encoding data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn stop-builder
  "The stop-builder function buildes out new instances of 
Stop$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (Stop$Builder/create)]
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn stop-props-builder
  "The stop-props-builder function buildes out new instances of 
StopProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (StopProps$Builder.)]
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn work-mail-builder
  "The work-mail-builder function buildes out new instances of 
WorkMail$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (WorkMail$Builder/create)]
    (when-let [data (lookup-entry config id :organization-arn)]
      (. builder organizationArn data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn work-mail-props-builder
  "The work-mail-props-builder function buildes out new instances of 
WorkMailProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (WorkMailProps$Builder.)]
    (when-let [data (lookup-entry config id :organization-arn)]
      (. builder organizationArn data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))