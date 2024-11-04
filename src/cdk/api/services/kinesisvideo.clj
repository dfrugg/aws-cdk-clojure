(ns cdk.api.services.kinesisvideo
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesisvideo package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kinesisvideo CfnSignalingChannel$Builder
                                                         CfnSignalingChannelProps$Builder
                                                         CfnStream$Builder
                                                         CfnStreamProps$Builder]))


(defn cfn-signaling-channel-builder
  "The cfn-signaling-channel-builder function buildes out new instances of 
CfnSignalingChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageTtlSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-ttl-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSignalingChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :message-ttl-seconds)]
      (. builder messageTtlSeconds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-signaling-channel-props-builder
  "The cfn-signaling-channel-props-builder function buildes out new instances of 
CfnSignalingChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageTtlSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:message-ttl-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSignalingChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :message-ttl-seconds)]
      (. builder messageTtlSeconds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-stream-builder
  "The cfn-stream-builder function buildes out new instances of 
CfnStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataRetentionInHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-retention-in-hours` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `mediaType` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStream$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-stream-props-builder
  "The cfn-stream-props-builder function buildes out new instances of 
CfnStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataRetentionInHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-retention-in-hours` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `mediaType` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamProps$Builder.)]
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
    (.build builder)))