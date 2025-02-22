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


(defn build-cfn-channel-builder
  "The build-cfn-channel-builder function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorized` |
| `insecureIngest` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:insecure-ingest` |
| `latencyMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:latency-mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `preset` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset` |
| `recordingConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-configuration-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnChannel$Builder builder id config]
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
  (.build builder))


(defn build-cfn-channel-props-builder
  "The build-cfn-channel-props-builder function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorized` |
| `insecureIngest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insecure-ingest` |
| `latencyMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:latency-mode` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `preset` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset` |
| `recordingConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-configuration-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnChannelProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-encoder-configuration-builder
  "The build-cfn-encoder-configuration-builder function updates a CfnEncoderConfiguration$Builder instance using the provided configuration.
  The function takes the CfnEncoderConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `video` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video` |
"
  [^CfnEncoderConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :video)]
    (. builder video data))
  (.build builder))


(defn build-cfn-encoder-configuration-props-builder
  "The build-cfn-encoder-configuration-props-builder function updates a CfnEncoderConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnEncoderConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `video` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video` |
"
  [^CfnEncoderConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :video)]
    (. builder video data))
  (.build builder))


(defn build-cfn-encoder-configuration-video-property-builder
  "The build-cfn-encoder-configuration-video-property-builder function updates a CfnEncoderConfiguration$VideoProperty$Builder instance using the provided configuration.
  The function takes the CfnEncoderConfiguration$VideoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `framerate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^CfnEncoderConfiguration$VideoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :framerate)]
    (. builder framerate data))
  (when-let [data (lookup-entry config id :height)]
    (. builder height data))
  (when-let [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn build-cfn-playback-key-pair-builder
  "The build-cfn-playback-key-pair-builder function updates a CfnPlaybackKeyPair$Builder instance using the provided configuration.
  The function takes the CfnPlaybackKeyPair$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPlaybackKeyPair$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :public-key-material)]
    (. builder publicKeyMaterial data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-playback-key-pair-props-builder
  "The build-cfn-playback-key-pair-props-builder function updates a CfnPlaybackKeyPairProps$Builder instance using the provided configuration.
  The function takes the CfnPlaybackKeyPairProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPlaybackKeyPairProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :public-key-material)]
    (. builder publicKeyMaterial data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-playback-restriction-policy-builder
  "The build-cfn-playback-restriction-policy-builder function updates a CfnPlaybackRestrictionPolicy$Builder instance using the provided configuration.
  The function takes the CfnPlaybackRestrictionPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedCountries` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-countries` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `enableStrictOriginEnforcement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-strict-origin-enforcement` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPlaybackRestrictionPolicy$Builder builder id config]
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
  (.build builder))


(defn build-cfn-playback-restriction-policy-props-builder
  "The build-cfn-playback-restriction-policy-props-builder function updates a CfnPlaybackRestrictionPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnPlaybackRestrictionPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedCountries` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-countries` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `enableStrictOriginEnforcement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-strict-origin-enforcement` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPlaybackRestrictionPolicyProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-recording-configuration-builder
  "The build-cfn-recording-configuration-builder function updates a CfnRecordingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingReconnectWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recording-reconnect-window-seconds` |
| `renditionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbnailConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:thumbnail-configuration` |
"
  [^CfnRecordingConfiguration$Builder builder id config]
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
  (.build builder))


(defn build-cfn-recording-configuration-destination-configuration-property-builder
  "The build-cfn-recording-configuration-destination-configuration-property-builder function updates a CfnRecordingConfiguration$DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.ivs.CfnRecordingConfiguration$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnRecordingConfiguration$DestinationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn build-cfn-recording-configuration-props-builder
  "The build-cfn-recording-configuration-props-builder function updates a CfnRecordingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recordingReconnectWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recording-reconnect-window-seconds` |
| `renditionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendition-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbnailConfiguration` | software.amazon.awscdk.services.ivs.CfnRecordingConfiguration$ThumbnailConfigurationProperty | [[cdk.support/lookup-entry]] | `:thumbnail-configuration` |
"
  [^CfnRecordingConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-recording-configuration-rendition-configuration-property-builder
  "The build-cfn-recording-configuration-rendition-configuration-property-builder function updates a CfnRecordingConfiguration$RenditionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$RenditionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `renditionSelection` | java.lang.String | [[cdk.support/lookup-entry]] | `:rendition-selection` |
| `renditions` | java.util.List | [[cdk.support/lookup-entry]] | `:renditions` |
"
  [^CfnRecordingConfiguration$RenditionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rendition-selection)]
    (. builder renditionSelection data))
  (when-let [data (lookup-entry config id :renditions)]
    (. builder renditions data))
  (.build builder))


(defn build-cfn-recording-configuration-s3-destination-configuration-property-builder
  "The build-cfn-recording-configuration-s3-destination-configuration-property-builder function updates a CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
"
  [^CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (.build builder))


(defn build-cfn-recording-configuration-thumbnail-configuration-property-builder
  "The build-cfn-recording-configuration-thumbnail-configuration-property-builder function updates a CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recordingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:recording-mode` |
| `resolution` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution` |
| `storage` | java.util.List | [[cdk.support/lookup-entry]] | `:storage` |
| `targetIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-interval-seconds` |
"
  [^CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :recording-mode)]
    (. builder recordingMode data))
  (when-let [data (lookup-entry config id :resolution)]
    (. builder resolution data))
  (when-let [data (lookup-entry config id :storage)]
    (. builder storage data))
  (when-let [data (lookup-entry config id :target-interval-seconds)]
    (. builder targetIntervalSeconds data))
  (.build builder))


(defn build-cfn-stage-builder
  "The build-cfn-stage-builder function updates a CfnStage$Builder instance using the provided configuration.
  The function takes the CfnStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStage$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-stage-props-builder
  "The build-cfn-stage-props-builder function updates a CfnStageProps$Builder instance using the provided configuration.
  The function takes the CfnStageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-configuration-builder
  "The build-cfn-storage-configuration-builder function updates a CfnStorageConfiguration$Builder instance using the provided configuration.
  The function takes the CfnStorageConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3` | software.amazon.awscdk.services.ivs.CfnStorageConfiguration$S3StorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-configuration-props-builder
  "The build-cfn-storage-configuration-props-builder function updates a CfnStorageConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnStorageConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-configuration-s3-storage-configuration-property-builder
  "The build-cfn-storage-configuration-s3-storage-configuration-property-builder function updates a CfnStorageConfiguration$S3StorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageConfiguration$S3StorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
"
  [^CfnStorageConfiguration$S3StorageConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (.build builder))


(defn build-cfn-stream-key-builder
  "The build-cfn-stream-key-builder function updates a CfnStreamKey$Builder instance using the provided configuration.
  The function takes the CfnStreamKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamKey$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-arn)]
    (. builder channelArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-stream-key-props-builder
  "The build-cfn-stream-key-props-builder function updates a CfnStreamKeyProps$Builder instance using the provided configuration.
  The function takes the CfnStreamKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-arn)]
    (. builder channelArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))