(ns cdk.api.services.kinesisvideo
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesisvideo package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesisvideo CfnSignalingChannel$Builder
                                                         CfnSignalingChannelProps$Builder
                                                         CfnStream$Builder
                                                         CfnStreamProps$Builder]))


(defn build-cfn-signaling-channel-builder
  "The build-cfn-signaling-channel-builder function updates a CfnSignalingChannel$Builder instance using the provided configuration.
  The function takes the CfnSignalingChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageTtlSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-ttl-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSignalingChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :message-ttl-seconds)]
    (. builder messageTtlSeconds data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-signaling-channel-props-builder
  "The build-cfn-signaling-channel-props-builder function updates a CfnSignalingChannelProps$Builder instance using the provided configuration.
  The function takes the CfnSignalingChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageTtlSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-ttl-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSignalingChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :message-ttl-seconds)]
    (. builder messageTtlSeconds data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-stream-builder
  "The build-cfn-stream-builder function updates a CfnStream$Builder instance using the provided configuration.
  The function takes the CfnStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataRetentionInHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-retention-in-hours` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `mediaType` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStream$Builder builder id config]
  (when-let [data (lookup-entry config id :data-retention-in-hours)]
    (. builder dataRetentionInHours data))
  (when-let [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :media-type)]
    (. builder mediaType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-stream-props-builder
  "The build-cfn-stream-props-builder function updates a CfnStreamProps$Builder instance using the provided configuration.
  The function takes the CfnStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataRetentionInHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-retention-in-hours` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `mediaType` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-retention-in-hours)]
    (. builder dataRetentionInHours data))
  (when-let [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :media-type)]
    (. builder mediaType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))