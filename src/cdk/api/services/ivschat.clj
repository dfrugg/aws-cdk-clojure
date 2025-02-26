(ns cdk.api.services.ivschat
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ivschat package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ivschat CfnLoggingConfiguration$Builder
                                                    CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder
                                                    CfnLoggingConfiguration$DestinationConfigurationProperty$Builder
                                                    CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder
                                                    CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder
                                                    CfnLoggingConfigurationProps$Builder
                                                    CfnRoom$Builder
                                                    CfnRoom$MessageReviewHandlerProperty$Builder
                                                    CfnRoomProps$Builder]))


(defn build-cfn-logging-configuration-builder
  "The build-cfn-logging-configuration-builder function updates a CfnLoggingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLoggingConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-configuration)]
    (. builder destinationConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-logging-configuration-builder
  "Creates a  `CfnLoggingConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-logging-configuration-builder (CfnLoggingConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-logging-configuration-cloud-watch-logs-destination-configuration-property-builder
  "The build-cfn-logging-configuration-cloud-watch-logs-destination-configuration-property-builder function updates a CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
"
  [^CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (.build builder))


(defn cfn-logging-configuration-cloud-watch-logs-destination-configuration-property-builder
  "Creates a  `CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logging-configuration-cloud-watch-logs-destination-configuration-property-builder (new CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder) id config))


(defn build-cfn-logging-configuration-destination-configuration-property-builder
  "The build-cfn-logging-configuration-destination-configuration-property-builder function updates a CfnLoggingConfiguration$DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `firehose` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `s3` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnLoggingConfiguration$DestinationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs)]
    (. builder cloudWatchLogs data))
  (when-let [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-logging-configuration-destination-configuration-property-builder
  "Creates a  `CfnLoggingConfiguration$DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logging-configuration-destination-configuration-property-builder (new CfnLoggingConfiguration$DestinationConfigurationProperty$Builder) id config))


(defn build-cfn-logging-configuration-firehose-destination-configuration-property-builder
  "The build-cfn-logging-configuration-firehose-destination-configuration-property-builder function updates a CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
"
  [^CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (.build builder))


(defn cfn-logging-configuration-firehose-destination-configuration-property-builder
  "Creates a  `CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logging-configuration-firehose-destination-configuration-property-builder (new CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder) id config))


(defn build-cfn-logging-configuration-props-builder
  "The build-cfn-logging-configuration-props-builder function updates a CfnLoggingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLoggingConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-configuration)]
    (. builder destinationConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-logging-configuration-props-builder
  "Creates a  `CfnLoggingConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logging-configuration-props-builder (new CfnLoggingConfigurationProps$Builder) id config))


(defn build-cfn-logging-configuration-s3-destination-configuration-property-builder
  "The build-cfn-logging-configuration-s3-destination-configuration-property-builder function updates a CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
"
  [^CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (.build builder))


(defn cfn-logging-configuration-s3-destination-configuration-property-builder
  "Creates a  `CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logging-configuration-s3-destination-configuration-property-builder (new CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder) id config))


(defn build-cfn-room-builder
  "The build-cfn-room-builder function updates a CfnRoom$Builder instance using the provided configuration.
  The function takes the CfnRoom$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggingConfigurationIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:logging-configuration-identifiers` |
| `maximumMessageLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-length` |
| `maximumMessageRatePerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-rate-per-second` |
| `messageReviewHandler` | software.amazon.awscdk.services.ivschat.CfnRoom$MessageReviewHandlerProperty | [[cdk.support/lookup-entry]] | `:message-review-handler` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoom$Builder builder id config]
  (when-let [data (lookup-entry config id :logging-configuration-identifiers)]
    (. builder loggingConfigurationIdentifiers data))
  (when-let [data (lookup-entry config id :maximum-message-length)]
    (. builder maximumMessageLength data))
  (when-let [data (lookup-entry config id :maximum-message-rate-per-second)]
    (. builder maximumMessageRatePerSecond data))
  (when-let [data (lookup-entry config id :message-review-handler)]
    (. builder messageReviewHandler data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-room-builder
  "Creates a  `CfnRoom$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-room-builder (CfnRoom$Builder/create scope (name id)) id config))


(defn build-cfn-room-message-review-handler-property-builder
  "The build-cfn-room-message-review-handler-property-builder function updates a CfnRoom$MessageReviewHandlerProperty$Builder instance using the provided configuration.
  The function takes the CfnRoom$MessageReviewHandlerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackResult` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-result` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnRoom$MessageReviewHandlerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-result)]
    (. builder fallbackResult data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-room-message-review-handler-property-builder
  "Creates a  `CfnRoom$MessageReviewHandlerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-room-message-review-handler-property-builder (new CfnRoom$MessageReviewHandlerProperty$Builder) id config))


(defn build-cfn-room-props-builder
  "The build-cfn-room-props-builder function updates a CfnRoomProps$Builder instance using the provided configuration.
  The function takes the CfnRoomProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggingConfigurationIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:logging-configuration-identifiers` |
| `maximumMessageLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-length` |
| `maximumMessageRatePerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-rate-per-second` |
| `messageReviewHandler` | software.amazon.awscdk.services.ivschat.CfnRoom$MessageReviewHandlerProperty | [[cdk.support/lookup-entry]] | `:message-review-handler` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoomProps$Builder builder id config]
  (when-let [data (lookup-entry config id :logging-configuration-identifiers)]
    (. builder loggingConfigurationIdentifiers data))
  (when-let [data (lookup-entry config id :maximum-message-length)]
    (. builder maximumMessageLength data))
  (when-let [data (lookup-entry config id :maximum-message-rate-per-second)]
    (. builder maximumMessageRatePerSecond data))
  (when-let [data (lookup-entry config id :message-review-handler)]
    (. builder messageReviewHandler data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-room-props-builder
  "Creates a  `CfnRoomProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-room-props-builder (new CfnRoomProps$Builder) id config))