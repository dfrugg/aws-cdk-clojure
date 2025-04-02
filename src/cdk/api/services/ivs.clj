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


(defn cfn-channel-builder>
  "The cfn-channel-builder> function updates a CfnChannel$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :authorized)]
    (. builder authorized data))
  (when-some [data (lookup-entry config id :insecure-ingest)]
    (. builder insecureIngest data))
  (when-some [data (lookup-entry config id :latency-mode)]
    (. builder latencyMode data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :preset)]
    (. builder preset data))
  (when-some [data (lookup-entry config id :recording-configuration-arn)]
    (. builder recordingConfigurationArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-channel-builder
  "Creates a  `CfnChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-channel-builder> (CfnChannel$Builder/create scope (name id)) id config))


(defn cfn-channel-props-builder>
  "The cfn-channel-props-builder> function updates a CfnChannelProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :authorized)]
    (. builder authorized data))
  (when-some [data (lookup-entry config id :insecure-ingest)]
    (. builder insecureIngest data))
  (when-some [data (lookup-entry config id :latency-mode)]
    (. builder latencyMode data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :preset)]
    (. builder preset data))
  (when-some [data (lookup-entry config id :recording-configuration-arn)]
    (. builder recordingConfigurationArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-channel-props-builder
  "Creates a  `CfnChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-props-builder> (new CfnChannelProps$Builder) id config))


(defn cfn-encoder-configuration-builder>
  "The cfn-encoder-configuration-builder> function updates a CfnEncoderConfiguration$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :video)]
    (. builder video data))
  (.build builder))


(defn cfn-encoder-configuration-builder
  "Creates a  `CfnEncoderConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-encoder-configuration-builder> (CfnEncoderConfiguration$Builder/create scope (name id)) id config))


(defn cfn-encoder-configuration-props-builder>
  "The cfn-encoder-configuration-props-builder> function updates a CfnEncoderConfigurationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :video)]
    (. builder video data))
  (.build builder))


(defn cfn-encoder-configuration-props-builder
  "Creates a  `CfnEncoderConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-encoder-configuration-props-builder> (new CfnEncoderConfigurationProps$Builder) id config))


(defn cfn-encoder-configuration-video-property-builder>
  "The cfn-encoder-configuration-video-property-builder> function updates a CfnEncoderConfiguration$VideoProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-some [data (lookup-entry config id :framerate)]
    (. builder framerate data))
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn cfn-encoder-configuration-video-property-builder
  "Creates a  `CfnEncoderConfiguration$VideoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-encoder-configuration-video-property-builder> (new CfnEncoderConfiguration$VideoProperty$Builder) id config))


(defn cfn-playback-key-pair-builder>
  "The cfn-playback-key-pair-builder> function updates a CfnPlaybackKeyPair$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :public-key-material)]
    (. builder publicKeyMaterial data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-playback-key-pair-builder
  "Creates a  `CfnPlaybackKeyPair$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-playback-key-pair-builder> (CfnPlaybackKeyPair$Builder/create scope (name id)) id config))


(defn cfn-playback-key-pair-props-builder>
  "The cfn-playback-key-pair-props-builder> function updates a CfnPlaybackKeyPairProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :public-key-material)]
    (. builder publicKeyMaterial data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-playback-key-pair-props-builder
  "Creates a  `CfnPlaybackKeyPairProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-playback-key-pair-props-builder> (new CfnPlaybackKeyPairProps$Builder) id config))


(defn cfn-playback-restriction-policy-builder>
  "The cfn-playback-restriction-policy-builder> function updates a CfnPlaybackRestrictionPolicy$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :allowed-countries)]
    (. builder allowedCountries data))
  (when-some [data (lookup-entry config id :allowed-origins)]
    (. builder allowedOrigins data))
  (when-some [data (lookup-entry config id :enable-strict-origin-enforcement)]
    (. builder enableStrictOriginEnforcement data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-playback-restriction-policy-builder
  "Creates a  `CfnPlaybackRestrictionPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-playback-restriction-policy-builder> (CfnPlaybackRestrictionPolicy$Builder/create scope (name id)) id config))


(defn cfn-playback-restriction-policy-props-builder>
  "The cfn-playback-restriction-policy-props-builder> function updates a CfnPlaybackRestrictionPolicyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :allowed-countries)]
    (. builder allowedCountries data))
  (when-some [data (lookup-entry config id :allowed-origins)]
    (. builder allowedOrigins data))
  (when-some [data (lookup-entry config id :enable-strict-origin-enforcement)]
    (. builder enableStrictOriginEnforcement data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-playback-restriction-policy-props-builder
  "Creates a  `CfnPlaybackRestrictionPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-playback-restriction-policy-props-builder> (new CfnPlaybackRestrictionPolicyProps$Builder) id config))


(defn cfn-recording-configuration-builder>
  "The cfn-recording-configuration-builder> function updates a CfnRecordingConfiguration$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :destination-configuration)]
    (. builder destinationConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :recording-reconnect-window-seconds)]
    (. builder recordingReconnectWindowSeconds data))
  (when-some [data (lookup-entry config id :rendition-configuration)]
    (. builder renditionConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thumbnail-configuration)]
    (. builder thumbnailConfiguration data))
  (.build builder))


(defn cfn-recording-configuration-builder
  "Creates a  `CfnRecordingConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-recording-configuration-builder> (CfnRecordingConfiguration$Builder/create scope (name id)) id config))


(defn cfn-recording-configuration-destination-configuration-property-builder>
  "The cfn-recording-configuration-destination-configuration-property-builder> function updates a CfnRecordingConfiguration$DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.ivs.CfnRecordingConfiguration$S3DestinationConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnRecordingConfiguration$DestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-recording-configuration-destination-configuration-property-builder
  "Creates a  `CfnRecordingConfiguration$DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-recording-configuration-destination-configuration-property-builder> (new CfnRecordingConfiguration$DestinationConfigurationProperty$Builder) id config))


(defn cfn-recording-configuration-props-builder>
  "The cfn-recording-configuration-props-builder> function updates a CfnRecordingConfigurationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :destination-configuration)]
    (. builder destinationConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :recording-reconnect-window-seconds)]
    (. builder recordingReconnectWindowSeconds data))
  (when-some [data (lookup-entry config id :rendition-configuration)]
    (. builder renditionConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thumbnail-configuration)]
    (. builder thumbnailConfiguration data))
  (.build builder))


(defn cfn-recording-configuration-props-builder
  "Creates a  `CfnRecordingConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-recording-configuration-props-builder> (new CfnRecordingConfigurationProps$Builder) id config))


(defn cfn-recording-configuration-rendition-configuration-property-builder>
  "The cfn-recording-configuration-rendition-configuration-property-builder> function updates a CfnRecordingConfiguration$RenditionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$RenditionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `renditionSelection` | java.lang.String | [[cdk.support/lookup-entry]] | `:rendition-selection` |
| `renditions` | java.util.List | [[cdk.support/lookup-entry]] | `:renditions` |
"
  [^CfnRecordingConfiguration$RenditionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rendition-selection)]
    (. builder renditionSelection data))
  (when-some [data (lookup-entry config id :renditions)]
    (. builder renditions data))
  (.build builder))


(defn cfn-recording-configuration-rendition-configuration-property-builder
  "Creates a  `CfnRecordingConfiguration$RenditionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-recording-configuration-rendition-configuration-property-builder> (new CfnRecordingConfiguration$RenditionConfigurationProperty$Builder) id config))


(defn cfn-recording-configuration-s3-destination-configuration-property-builder>
  "The cfn-recording-configuration-s3-destination-configuration-property-builder> function updates a CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
"
  [^CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (.build builder))


(defn cfn-recording-configuration-s3-destination-configuration-property-builder
  "Creates a  `CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-recording-configuration-s3-destination-configuration-property-builder> (new CfnRecordingConfiguration$S3DestinationConfigurationProperty$Builder) id config))


(defn cfn-recording-configuration-thumbnail-configuration-property-builder>
  "The cfn-recording-configuration-thumbnail-configuration-property-builder> function updates a CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :recording-mode)]
    (. builder recordingMode data))
  (when-some [data (lookup-entry config id :resolution)]
    (. builder resolution data))
  (when-some [data (lookup-entry config id :storage)]
    (. builder storage data))
  (when-some [data (lookup-entry config id :target-interval-seconds)]
    (. builder targetIntervalSeconds data))
  (.build builder))


(defn cfn-recording-configuration-thumbnail-configuration-property-builder
  "Creates a  `CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-recording-configuration-thumbnail-configuration-property-builder> (new CfnRecordingConfiguration$ThumbnailConfigurationProperty$Builder) id config))


(defn cfn-stage-builder>
  "The cfn-stage-builder> function updates a CfnStage$Builder instance using the provided configuration.
  The function takes the CfnStage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStage$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stage-builder
  "Creates a  `CfnStage$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stage-builder> (CfnStage$Builder/create scope (name id)) id config))


(defn cfn-stage-props-builder>
  "The cfn-stage-props-builder> function updates a CfnStageProps$Builder instance using the provided configuration.
  The function takes the CfnStageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stage-props-builder
  "Creates a  `CfnStageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-stage-props-builder> (new CfnStageProps$Builder) id config))


(defn cfn-storage-configuration-builder>
  "The cfn-storage-configuration-builder> function updates a CfnStorageConfiguration$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-storage-configuration-builder
  "Creates a  `CfnStorageConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-storage-configuration-builder> (CfnStorageConfiguration$Builder/create scope (name id)) id config))


(defn cfn-storage-configuration-props-builder>
  "The cfn-storage-configuration-props-builder> function updates a CfnStorageConfigurationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-storage-configuration-props-builder
  "Creates a  `CfnStorageConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-storage-configuration-props-builder> (new CfnStorageConfigurationProps$Builder) id config))


(defn cfn-storage-configuration-s3-storage-configuration-property-builder>
  "The cfn-storage-configuration-s3-storage-configuration-property-builder> function updates a CfnStorageConfiguration$S3StorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageConfiguration$S3StorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
"
  [^CfnStorageConfiguration$S3StorageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (.build builder))


(defn cfn-storage-configuration-s3-storage-configuration-property-builder
  "Creates a  `CfnStorageConfiguration$S3StorageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-storage-configuration-s3-storage-configuration-property-builder> (new CfnStorageConfiguration$S3StorageConfigurationProperty$Builder) id config))


(defn cfn-stream-key-builder>
  "The cfn-stream-key-builder> function updates a CfnStreamKey$Builder instance using the provided configuration.
  The function takes the CfnStreamKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamKey$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-arn)]
    (. builder channelArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-key-builder
  "Creates a  `CfnStreamKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stream-key-builder> (CfnStreamKey$Builder/create scope (name id)) id config))


(defn cfn-stream-key-props-builder>
  "The cfn-stream-key-props-builder> function updates a CfnStreamKeyProps$Builder instance using the provided configuration.
  The function takes the CfnStreamKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-arn)]
    (. builder channelArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-key-props-builder
  "Creates a  `CfnStreamKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-stream-key-props-builder> (new CfnStreamKeyProps$Builder) id config))