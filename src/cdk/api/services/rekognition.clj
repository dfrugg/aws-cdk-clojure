(ns cdk.api.services.rekognition
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rekognition package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.rekognition CfnCollection$Builder
                                                        CfnCollectionProps$Builder
                                                        CfnProject$Builder
                                                        CfnProjectProps$Builder
                                                        CfnStreamProcessor$BoundingBoxProperty$Builder
                                                        CfnStreamProcessor$Builder
                                                        CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder
                                                        CfnStreamProcessor$DataSharingPreferenceProperty$Builder
                                                        CfnStreamProcessor$FaceSearchSettingsProperty$Builder
                                                        CfnStreamProcessor$KinesisDataStreamProperty$Builder
                                                        CfnStreamProcessor$KinesisVideoStreamProperty$Builder
                                                        CfnStreamProcessor$NotificationChannelProperty$Builder
                                                        CfnStreamProcessor$PointProperty$Builder
                                                        CfnStreamProcessor$S3DestinationProperty$Builder
                                                        CfnStreamProcessorProps$Builder]))


(defn build-cfn-collection-builder
  "The build-cfn-collection-builder function updates a CfnCollection$Builder instance using the provided configuration.
  The function takes the CfnCollection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCollection$Builder builder id config]
  (when-some [data (lookup-entry config id :collection-id)]
    (. builder collectionId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-collection-builder
  "Creates a  `CfnCollection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-collection-builder (CfnCollection$Builder/create scope (name id)) id config))


(defn build-cfn-collection-props-builder
  "The build-cfn-collection-props-builder function updates a CfnCollectionProps$Builder instance using the provided configuration.
  The function takes the CfnCollectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCollectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :collection-id)]
    (. builder collectionId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-collection-props-builder
  "Creates a  `CfnCollectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-collection-props-builder (new CfnCollectionProps$Builder) id config))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnProject$Builder builder id config]
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-project-builder
  "Creates a  `CfnProject$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-project-props-builder
  "Creates a  `CfnProjectProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))


(defn build-cfn-stream-processor-bounding-box-property-builder
  "The build-cfn-stream-processor-bounding-box-property-builder function updates a CfnStreamProcessor$BoundingBoxProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$BoundingBoxProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `left` | java.lang.Number | [[cdk.support/lookup-entry]] | `:left` |
| `top` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^CfnStreamProcessor$BoundingBoxProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :height)]
    (. builder height data))
  (when-some [data (lookup-entry config id :left)]
    (. builder left data))
  (when-some [data (lookup-entry config id :top)]
    (. builder top data))
  (when-some [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn cfn-stream-processor-bounding-box-property-builder
  "Creates a  `CfnStreamProcessor$BoundingBoxProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-bounding-box-property-builder (new CfnStreamProcessor$BoundingBoxProperty$Builder) id config))


(defn build-cfn-stream-processor-builder
  "The build-cfn-stream-processor-builder function updates a CfnStreamProcessor$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `boundingBoxRegionsOfInterest` | java.util.List | [[cdk.support/lookup-entry]] | `:bounding-box-regions-of-interest` |
| `connectedHomeSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connected-home-settings` |
| `dataSharingPreference` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$DataSharingPreferenceProperty | [[cdk.support/lookup-entry]] | `:data-sharing-preference` |
| `faceSearchSettings` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$FaceSearchSettingsProperty | [[cdk.support/lookup-entry]] | `:face-search-settings` |
| `kinesisDataStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-data-stream` |
| `kinesisVideoStream` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$KinesisVideoStreamProperty | [[cdk.support/lookup-entry]] | `:kinesis-video-stream` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationChannel` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$NotificationChannelProperty | [[cdk.support/lookup-entry]] | `:notification-channel` |
| `polygonRegionsOfInterest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:polygon-regions-of-interest` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3Destination` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamProcessor$Builder builder id config]
  (when-some [data (lookup-entry config id :bounding-box-regions-of-interest)]
    (. builder boundingBoxRegionsOfInterest data))
  (when-some [data (lookup-entry config id :connected-home-settings)]
    (. builder connectedHomeSettings data))
  (when-some [data (lookup-entry config id :data-sharing-preference)]
    (. builder dataSharingPreference data))
  (when-some [data (lookup-entry config id :face-search-settings)]
    (. builder faceSearchSettings data))
  (when-some [data (lookup-entry config id :kinesis-data-stream)]
    (. builder kinesisDataStream data))
  (when-some [data (lookup-entry config id :kinesis-video-stream)]
    (. builder kinesisVideoStream data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-channel)]
    (. builder notificationChannel data))
  (when-some [data (lookup-entry config id :polygon-regions-of-interest)]
    (. builder polygonRegionsOfInterest data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-destination)]
    (. builder s3Destination data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-processor-builder
  "Creates a  `CfnStreamProcessor$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-stream-processor-builder (CfnStreamProcessor$Builder/create scope (name id)) id config))


(defn build-cfn-stream-processor-connected-home-settings-property-builder
  "The build-cfn-stream-processor-connected-home-settings-property-builder function updates a CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `minConfidence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-confidence` |
"
  [^CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :min-confidence)]
    (. builder minConfidence data))
  (.build builder))


(defn cfn-stream-processor-connected-home-settings-property-builder
  "Creates a  `CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-connected-home-settings-property-builder (new CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder) id config))


(defn build-cfn-stream-processor-data-sharing-preference-property-builder
  "The build-cfn-stream-processor-data-sharing-preference-property-builder function updates a CfnStreamProcessor$DataSharingPreferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$DataSharingPreferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:opt-in` |
"
  [^CfnStreamProcessor$DataSharingPreferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :opt-in)]
    (. builder optIn data))
  (.build builder))


(defn cfn-stream-processor-data-sharing-preference-property-builder
  "Creates a  `CfnStreamProcessor$DataSharingPreferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-data-sharing-preference-property-builder (new CfnStreamProcessor$DataSharingPreferenceProperty$Builder) id config))


(defn build-cfn-stream-processor-face-search-settings-property-builder
  "The build-cfn-stream-processor-face-search-settings-property-builder function updates a CfnStreamProcessor$FaceSearchSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$FaceSearchSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `faceMatchThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:face-match-threshold` |
"
  [^CfnStreamProcessor$FaceSearchSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :collection-id)]
    (. builder collectionId data))
  (when-some [data (lookup-entry config id :face-match-threshold)]
    (. builder faceMatchThreshold data))
  (.build builder))


(defn cfn-stream-processor-face-search-settings-property-builder
  "Creates a  `CfnStreamProcessor$FaceSearchSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-face-search-settings-property-builder (new CfnStreamProcessor$FaceSearchSettingsProperty$Builder) id config))


(defn build-cfn-stream-processor-kinesis-data-stream-property-builder
  "The build-cfn-stream-processor-kinesis-data-stream-property-builder function updates a CfnStreamProcessor$KinesisDataStreamProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$KinesisDataStreamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnStreamProcessor$KinesisDataStreamProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-stream-processor-kinesis-data-stream-property-builder
  "Creates a  `CfnStreamProcessor$KinesisDataStreamProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-kinesis-data-stream-property-builder (new CfnStreamProcessor$KinesisDataStreamProperty$Builder) id config))


(defn build-cfn-stream-processor-kinesis-video-stream-property-builder
  "The build-cfn-stream-processor-kinesis-video-stream-property-builder function updates a CfnStreamProcessor$KinesisVideoStreamProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$KinesisVideoStreamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnStreamProcessor$KinesisVideoStreamProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-stream-processor-kinesis-video-stream-property-builder
  "Creates a  `CfnStreamProcessor$KinesisVideoStreamProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-kinesis-video-stream-property-builder (new CfnStreamProcessor$KinesisVideoStreamProperty$Builder) id config))


(defn build-cfn-stream-processor-notification-channel-property-builder
  "The build-cfn-stream-processor-notification-channel-property-builder function updates a CfnStreamProcessor$NotificationChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$NotificationChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnStreamProcessor$NotificationChannelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-stream-processor-notification-channel-property-builder
  "Creates a  `CfnStreamProcessor$NotificationChannelProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-notification-channel-property-builder (new CfnStreamProcessor$NotificationChannelProperty$Builder) id config))


(defn build-cfn-stream-processor-point-property-builder
  "The build-cfn-stream-processor-point-property-builder function updates a CfnStreamProcessor$PointProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$PointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `x` | java.lang.Number | [[cdk.support/lookup-entry]] | `:x` |
| `y` | java.lang.Number | [[cdk.support/lookup-entry]] | `:y` |
"
  [^CfnStreamProcessor$PointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :x)]
    (. builder x data))
  (when-some [data (lookup-entry config id :y)]
    (. builder y data))
  (.build builder))


(defn cfn-stream-processor-point-property-builder
  "Creates a  `CfnStreamProcessor$PointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-point-property-builder (new CfnStreamProcessor$PointProperty$Builder) id config))


(defn build-cfn-stream-processor-props-builder
  "The build-cfn-stream-processor-props-builder function updates a CfnStreamProcessorProps$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `boundingBoxRegionsOfInterest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bounding-box-regions-of-interest` |
| `connectedHomeSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connected-home-settings` |
| `dataSharingPreference` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$DataSharingPreferenceProperty | [[cdk.support/lookup-entry]] | `:data-sharing-preference` |
| `faceSearchSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:face-search-settings` |
| `kinesisDataStream` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$KinesisDataStreamProperty | [[cdk.support/lookup-entry]] | `:kinesis-data-stream` |
| `kinesisVideoStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-video-stream` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationChannel` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$NotificationChannelProperty | [[cdk.support/lookup-entry]] | `:notification-channel` |
| `polygonRegionsOfInterest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:polygon-regions-of-interest` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `s3Destination` | software.amazon.awscdk.services.rekognition.CfnStreamProcessor$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamProcessorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bounding-box-regions-of-interest)]
    (. builder boundingBoxRegionsOfInterest data))
  (when-some [data (lookup-entry config id :connected-home-settings)]
    (. builder connectedHomeSettings data))
  (when-some [data (lookup-entry config id :data-sharing-preference)]
    (. builder dataSharingPreference data))
  (when-some [data (lookup-entry config id :face-search-settings)]
    (. builder faceSearchSettings data))
  (when-some [data (lookup-entry config id :kinesis-data-stream)]
    (. builder kinesisDataStream data))
  (when-some [data (lookup-entry config id :kinesis-video-stream)]
    (. builder kinesisVideoStream data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-channel)]
    (. builder notificationChannel data))
  (when-some [data (lookup-entry config id :polygon-regions-of-interest)]
    (. builder polygonRegionsOfInterest data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :s3-destination)]
    (. builder s3Destination data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-stream-processor-props-builder
  "Creates a  `CfnStreamProcessorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-props-builder (new CfnStreamProcessorProps$Builder) id config))


(defn build-cfn-stream-processor-s3-destination-property-builder
  "The build-cfn-stream-processor-s3-destination-property-builder function updates a CfnStreamProcessor$S3DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamProcessor$S3DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |
"
  [^CfnStreamProcessor$S3DestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :object-key-prefix)]
    (. builder objectKeyPrefix data))
  (.build builder))


(defn cfn-stream-processor-s3-destination-property-builder
  "Creates a  `CfnStreamProcessor$S3DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-stream-processor-s3-destination-property-builder (new CfnStreamProcessor$S3DestinationProperty$Builder) id config))