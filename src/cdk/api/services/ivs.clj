(ns cdk.api.services.ivs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ivs package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ivs CfnChannel$Builder
                                                CfnChannelProps$Builder
                                                CfnEncoderConfiguration$Builder
                                                CfnEncoderConfiguration$VideoProperty$Builder
                                                CfnEncoderConfigurationProps$Builder
                                                CfnPlaybackKeyPair$Builder
                                                CfnPlaybackKeyPairProps$Builder
                                                CfnPlaybackRestrictionPolicy$Builder
                                                CfnPlaybackRestrictionPolicyProps$Builder
                                                CfnRecordingConfiguration$Builder
                                                CfnRecordingConfiguration$DestinationConfigurationProperty$Builder
                                                CfnRecordingConfiguration$RenditionConfigurationProperty$Builder
                                                CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder
                                                CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder
                                                CfnRecordingConfigurationProps$Builder
                                                CfnStage$Builder
                                                CfnStageProps$Builder
                                                CfnStorageConfiguration$Builder
                                                CfnStorageConfiguration$S3StorageConfigurationProperty$Builder
                                                CfnStorageConfigurationProps$Builder
                                                CfnStreamKey$Builder
                                                CfnStreamKeyProps$Builder]))


(defn cfn-channel-builder
  "The cfn-channel-builder function buildes out new instances of 
CfnChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorized` |
| `insecureIngest` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:insecure-ingest` |
| `latencyMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:latency-mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `preset` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset` |
| `recordingConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-configuration-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorized)]
      (. builder authorized data))
    (when-let [data (lookup-entry config id :insecure-ingest)]
      (. builder insecureIngest data))
    (when-let [data (lookup-entry config id :latency-mode)]
      (. builder latencyMode data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :preset)]
      (. builder preset data))
    (when-let [data (lookup-entry config id :recording-configuration-arn)]
      (. builder recordingConfigurationArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-channel-props-builder
  "The cfn-channel-props-builder function buildes out new instances of 
CfnChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorized` |
| `insecureIngest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insecure-ingest` |
| `latencyMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:latency-mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `preset` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset` |
| `recordingConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-configuration-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :authorized)]
      (. builder authorized data))
    (when-let [data (lookup-entry config id :insecure-ingest)]
      (. builder insecureIngest data))
    (when-let [data (lookup-entry config id :latency-mode)]
      (. builder latencyMode data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :preset)]
      (. builder preset data))
    (when-let [data (lookup-entry config id :recording-configuration-arn)]
      (. builder recordingConfigurationArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-encoder-configuration-builder
  "The cfn-encoder-configuration-builder function buildes out new instances of 
CfnEncoderConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `video` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video` |"
  [stack id config]
  (let [builder (CfnEncoderConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :video)]
      (. builder video data))
    (.build builder)))


(defn cfn-encoder-configuration-props-builder
  "The cfn-encoder-configuration-props-builder function buildes out new instances of 
CfnEncoderConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `video` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video` |"
  [stack id config]
  (let [builder (CfnEncoderConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :video)]
      (. builder video data))
    (.build builder)))


(defn cfn-encoder-configuration-video-property-builder
  "The cfn-encoder-configuration-video-property-builder function buildes out new instances of 
CfnEncoderConfiguration$VideoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `framerate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (CfnEncoderConfiguration$VideoProperty$Builder.)]
    (when-let [data (lookup-entry config id :bitrate)]
      (. builder bitrate data))
    (when-let [data (lookup-entry config id :framerate)]
      (. builder framerate data))
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn cfn-playback-key-pair-builder
  "The cfn-playback-key-pair-builder function buildes out new instances of 
CfnPlaybackKeyPair$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlaybackKeyPair$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :public-key-material)]
      (. builder publicKeyMaterial data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-playback-key-pair-props-builder
  "The cfn-playback-key-pair-props-builder function buildes out new instances of 
CfnPlaybackKeyPairProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlaybackKeyPairProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :public-key-material)]
      (. builder publicKeyMaterial data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-playback-restriction-policy-builder
  "The cfn-playback-restriction-policy-builder function buildes out new instances of 
CfnPlaybackRestrictionPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedCountries` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-countries` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `enableStrictOriginEnforcement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-strict-origin-enforcement` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlaybackRestrictionPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-countries)]
      (. builder allowedCountries data))
    (when-let [data (lookup-entry config id :allowed-origins)]
      (. builder allowedOrigins data))
    (when-let [data (lookup-entry config id :enable-strict-origin-enforcement)]
      (. builder enableStrictOriginEnforcement data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-playback-restriction-policy-props-builder
  "The cfn-playback-restriction-policy-props-builder function buildes out new instances of 
CfnPlaybackRestrictionPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedCountries` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-countries` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `enableStrictOriginEnforcement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-strict-origin-enforcement` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlaybackRestrictionPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-countries)]
      (. builder allowedCountries data))
    (when-let [data (lookup-entry config id :allowed-origins)]
      (. builder allowedOrigins data))
    (when-let [data (lookup-entry config id :enable-strict-origin-enforcement)]
      (. builder enableStrictOriginEnforcement data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-recording-configuration-builder
  "The cfn-recording-configuration-builder function buildes out new instances of 
CfnRecordingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingReconnectWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recording-reconnect-window-seconds` |
| `renditionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbnailConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:thumbnail-configuration` |"
  [stack id config]
  (let [builder (CfnRecordingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-configuration)]
      (. builder destinationConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recording-reconnect-window-seconds)]
      (. builder recordingReconnectWindowSeconds data))
    (when-let [data (lookup-entry config id :rendition-configuration)]
      (. builder renditionConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thumbnail-configuration)]
      (. builder thumbnailConfiguration data))
    (.build builder)))


(defn cfn-recording-configuration-destination-configuration-property-builder
  "The cfn-recording-configuration-destination-configuration-property-builder function buildes out new instances of 
CfnRecordingConfiguration$DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.ivs.CfnRecordingConfiguration$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnRecordingConfiguration$DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-recording-configuration-props-builder
  "The cfn-recording-configuration-props-builder function buildes out new instances of 
CfnRecordingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingReconnectWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recording-reconnect-window-seconds` |
| `renditionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbnailConfiguration` | software.amazon.awscdk.services.ivs.CfnRecordingConfiguration$ThumbnailConfigurationProperty | [[cdk.support/lookup-entry]] | `:thumbnail-configuration` |"
  [stack id config]
  (let [builder (CfnRecordingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-configuration)]
      (. builder destinationConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recording-reconnect-window-seconds)]
      (. builder recordingReconnectWindowSeconds data))
    (when-let [data (lookup-entry config id :rendition-configuration)]
      (. builder renditionConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thumbnail-configuration)]
      (. builder thumbnailConfiguration data))
    (.build builder)))


(defn cfn-recording-configuration-rendition-configuration-property-builder
  "The cfn-recording-configuration-rendition-configuration-property-builder function buildes out new instances of 
CfnRecordingConfiguration$RenditionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `renditionSelection` | java.lang.String | [[cdk.support/lookup-entry]] | `:rendition-selection` |
| `renditions` | java.util.List | [[cdk.support/lookup-entry]] | `:renditions` |"
  [stack id config]
  (let [builder (CfnRecordingConfiguration$RenditionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :rendition-selection)]
      (. builder renditionSelection data))
    (when-let [data (lookup-entry config id :renditions)]
      (. builder renditions data))
    (.build builder)))


(defn cfn-recording-configuration-s3-destination-configuration-property-builder
  "The cfn-recording-configuration-s3-destination-configuration-property-builder function buildes out new instances of 
CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |"
  [stack id config]
  (let [builder (CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (.build builder)))


(defn cfn-recording-configuration-thumbnail-configuration-property-builder
  "The cfn-recording-configuration-thumbnail-configuration-property-builder function buildes out new instances of 
CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-mode` |
| `resolution` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution` |
| `storage` | java.util.List | [[cdk.support/lookup-entry]] | `:storage` |
| `targetIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-interval-seconds` |"
  [stack id config]
  (let [builder (CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :recording-mode)]
      (. builder recordingMode data))
    (when-let [data (lookup-entry config id :resolution)]
      (. builder resolution data))
    (when-let [data (lookup-entry config id :storage)]
      (. builder storage data))
    (when-let [data (lookup-entry config id :target-interval-seconds)]
      (. builder targetIntervalSeconds data))
    (.build builder)))


(defn cfn-stage-builder
  "The cfn-stage-builder function buildes out new instances of 
CfnStage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stage-props-builder
  "The cfn-stage-props-builder function buildes out new instances of 
CfnStageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStageProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-storage-configuration-builder
  "The cfn-storage-configuration-builder function buildes out new instances of 
CfnStorageConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3` | software.amazon.awscdk.services.ivs.CfnStorageConfiguration$S3StorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStorageConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-storage-configuration-props-builder
  "The cfn-storage-configuration-props-builder function buildes out new instances of 
CfnStorageConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStorageConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-storage-configuration-s3-storage-configuration-property-builder
  "The cfn-storage-configuration-s3-storage-configuration-property-builder function buildes out new instances of 
CfnStorageConfiguration$S3StorageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |"
  [stack id config]
  (let [builder (CfnStorageConfiguration$S3StorageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (.build builder)))


(defn cfn-stream-key-builder
  "The cfn-stream-key-builder function buildes out new instances of 
CfnStreamKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-arn)]
      (. builder channelArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-key-props-builder
  "The cfn-stream-key-props-builder function buildes out new instances of 
CfnStreamKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-arn)]
      (. builder channelArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))