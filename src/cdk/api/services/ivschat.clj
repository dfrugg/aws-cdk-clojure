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


(defn cfn-logging-configuration-builder
  "The cfn-logging-configuration-builder function buildes out new instances of 
CfnLoggingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-configuration)]
      (. builder destinationConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-logging-configuration-cloud-watch-logs-destination-configuration-property-builder
  "The cfn-logging-configuration-cloud-watch-logs-destination-configuration-property-builder function buildes out new instances of 
CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (.build builder)))


(defn cfn-logging-configuration-destination-configuration-property-builder
  "The cfn-logging-configuration-destination-configuration-property-builder function buildes out new instances of 
CfnLoggingConfiguration$DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$CloudWatchLogsDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `firehose` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `s3` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs)]
      (. builder cloudWatchLogs data))
    (when-let [data (lookup-entry config id :firehose)]
      (. builder firehose data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-logging-configuration-firehose-destination-configuration-property-builder
  "The cfn-logging-configuration-firehose-destination-configuration-property-builder function buildes out new instances of 
CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$FirehoseDestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-name)]
      (. builder deliveryStreamName data))
    (.build builder)))


(defn cfn-logging-configuration-props-builder
  "The cfn-logging-configuration-props-builder function buildes out new instances of 
CfnLoggingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration$DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLoggingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-configuration)]
      (. builder destinationConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-logging-configuration-s3-destination-configuration-property-builder
  "The cfn-logging-configuration-s3-destination-configuration-property-builder function buildes out new instances of 
CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$S3DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (.build builder)))


(defn cfn-room-builder
  "The cfn-room-builder function buildes out new instances of 
CfnRoom$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggingConfigurationIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:logging-configuration-identifiers` |
| `maximumMessageLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-length` |
| `maximumMessageRatePerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-rate-per-second` |
| `messageReviewHandler` | software.amazon.awscdk.services.ivschat.CfnRoom$MessageReviewHandlerProperty | [[cdk.support/lookup-entry]] | `:message-review-handler` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoom$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-room-message-review-handler-property-builder
  "The cfn-room-message-review-handler-property-builder function buildes out new instances of 
CfnRoom$MessageReviewHandlerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackResult` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-result` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnRoom$MessageReviewHandlerProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-result)]
      (. builder fallbackResult data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-room-props-builder
  "The cfn-room-props-builder function buildes out new instances of 
CfnRoomProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggingConfigurationIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:logging-configuration-identifiers` |
| `maximumMessageLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-length` |
| `maximumMessageRatePerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-message-rate-per-second` |
| `messageReviewHandler` | software.amazon.awscdk.services.ivschat.CfnRoom$MessageReviewHandlerProperty | [[cdk.support/lookup-entry]] | `:message-review-handler` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoomProps$Builder.)]
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
    (.build builder)))