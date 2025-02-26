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


(defn build-add-header-builder
  "The build-add-header-builder function updates a AddHeader$Builder instance using the provided configuration.
  The function takes the AddHeader$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^AddHeader$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn add-header-builder
  "Creates a  `AddHeader$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-add-header-builder (AddHeader$Builder/create) id config))


(defn build-add-header-props-builder
  "The build-add-header-props-builder function updates a AddHeaderProps$Builder instance using the provided configuration.
  The function takes the AddHeaderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^AddHeaderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn add-header-props-builder
  "Creates a  `AddHeaderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-add-header-props-builder (new AddHeaderProps$Builder) id config))


(defn build-bounce-builder
  "The build-bounce-builder function updates a Bounce$Builder instance using the provided configuration.
  The function takes the Bounce$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `template` | software.amazon.awscdk.services.ses.actions.BounceTemplate | [[cdk.support/lookup-entry]] | `:template` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^Bounce$Builder builder id config]
  (when-some [data (lookup-entry config id :sender)]
    (. builder sender data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn bounce-builder
  "Creates a  `Bounce$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bounce-builder (Bounce$Builder/create) id config))


(defn build-bounce-props-builder
  "The build-bounce-props-builder function updates a BounceProps$Builder instance using the provided configuration.
  The function takes the BounceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sender` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender` |
| `template` | software.amazon.awscdk.services.ses.actions.BounceTemplate | [[cdk.support/lookup-entry]] | `:template` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^BounceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :sender)]
    (. builder sender data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn bounce-props-builder
  "Creates a  `BounceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bounce-props-builder (new BounceProps$Builder) id config))


(defn build-bounce-template-builder
  "The build-bounce-template-builder function updates a BounceTemplate$Builder instance using the provided configuration.
  The function takes the BounceTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^BounceTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :smtp-reply-code)]
    (. builder smtpReplyCode data))
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn bounce-template-builder
  "Creates a  `BounceTemplate$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bounce-template-builder (BounceTemplate$Builder/create) id config))


(defn build-bounce-template-props-builder
  "The build-bounce-template-props-builder function updates a BounceTemplateProps$Builder instance using the provided configuration.
  The function takes the BounceTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `smtpReplyCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:smtp-reply-code` |
| `statusCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^BounceTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :smtp-reply-code)]
    (. builder smtpReplyCode data))
  (when-some [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn bounce-template-props-builder
  "Creates a  `BounceTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bounce-template-props-builder (new BounceTemplateProps$Builder) id config))


(defn build-lambda-builder
  "The build-lambda-builder function updates a Lambda$Builder instance using the provided configuration.
  The function takes the Lambda$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invocationType` | software.amazon.awscdk.services.ses.actions.LambdaInvocationType | [[cdk.api.services.ses.actions/lambda-invocation-type]] | `:invocation-type` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^Lambda$Builder builder id config]
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (when-some [data (lambda-invocation-type config id :invocation-type)]
    (. builder invocationType data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn lambda-builder
  "Creates a  `Lambda$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lambda-builder (Lambda$Builder/create) id config))


(defn build-lambda-props-builder
  "The build-lambda-props-builder function updates a LambdaProps$Builder instance using the provided configuration.
  The function takes the LambdaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:function` |
| `invocationType` | software.amazon.awscdk.services.ses.actions.LambdaInvocationType | [[cdk.api.services.ses.actions/lambda-invocation-type]] | `:invocation-type` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^LambdaProps$Builder builder id config]
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (when-some [data (lambda-invocation-type config id :invocation-type)]
    (. builder invocationType data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn lambda-props-builder
  "Creates a  `LambdaProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lambda-props-builder (new LambdaProps$Builder) id config))


(defn build-s3-builder
  "The build-s3-builder function updates a S3$Builder instance using the provided configuration.
  The function takes the S3$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^S3$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn s3-builder
  "Creates a  `S3$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-builder (S3$Builder/create) id config))


(defn build-s3-props-builder
  "The build-s3-props-builder function updates a S3Props$Builder instance using the provided configuration.
  The function takes the S3Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^S3Props$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn s3-props-builder
  "Creates a  `S3Props$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-props-builder (new S3Props$Builder) id config))


(defn build-sns-builder
  "The build-sns-builder function updates a Sns$Builder instance using the provided configuration.
  The function takes the Sns$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | software.amazon.awscdk.services.ses.actions.EmailEncoding | [[cdk.api.services.ses.actions/email-encoding]] | `:encoding` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^Sns$Builder builder id config]
  (when-some [data (email-encoding config id :encoding)]
    (. builder encoding data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn sns-builder
  "Creates a  `Sns$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sns-builder (Sns$Builder/create) id config))


(defn build-sns-props-builder
  "The build-sns-props-builder function updates a SnsProps$Builder instance using the provided configuration.
  The function takes the SnsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encoding` | software.amazon.awscdk.services.ses.actions.EmailEncoding | [[cdk.api.services.ses.actions/email-encoding]] | `:encoding` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^SnsProps$Builder builder id config]
  (when-some [data (email-encoding config id :encoding)]
    (. builder encoding data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn sns-props-builder
  "Creates a  `SnsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sns-props-builder (new SnsProps$Builder) id config))


(defn build-stop-builder
  "The build-stop-builder function updates a Stop$Builder instance using the provided configuration.
  The function takes the Stop$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^Stop$Builder builder id config]
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn stop-builder
  "Creates a  `Stop$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-stop-builder (Stop$Builder/create) id config))


(defn build-stop-props-builder
  "The build-stop-props-builder function updates a StopProps$Builder instance using the provided configuration.
  The function takes the StopProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^StopProps$Builder builder id config]
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn stop-props-builder
  "Creates a  `StopProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-stop-props-builder (new StopProps$Builder) id config))


(defn build-work-mail-builder
  "The build-work-mail-builder function updates a WorkMail$Builder instance using the provided configuration.
  The function takes the WorkMail$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^WorkMail$Builder builder id config]
  (when-some [data (lookup-entry config id :organization-arn)]
    (. builder organizationArn data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn work-mail-builder
  "Creates a  `WorkMail$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-work-mail-builder (WorkMail$Builder/create) id config))


(defn build-work-mail-props-builder
  "The build-work-mail-props-builder function updates a WorkMailProps$Builder instance using the provided configuration.
  The function takes the WorkMailProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-arn` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^WorkMailProps$Builder builder id config]
  (when-some [data (lookup-entry config id :organization-arn)]
    (. builder organizationArn data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn work-mail-props-builder
  "Creates a  `WorkMailProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-work-mail-props-builder (new WorkMailProps$Builder) id config))