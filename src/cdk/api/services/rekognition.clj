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


(defn cfn-collection-builder
  "The cfn-collection-builder function buildes out new instances of 
CfnCollection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCollection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :collection-id)]
      (. builder collectionId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-collection-props-builder
  "The cfn-collection-props-builder function buildes out new instances of 
CfnCollectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCollectionProps$Builder.)]
    (when-let [data (lookup-entry config id :collection-id)]
      (. builder collectionId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))


(defn cfn-stream-processor-bounding-box-property-builder
  "The cfn-stream-processor-bounding-box-property-builder function buildes out new instances of 
CfnStreamProcessor$BoundingBoxProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `left` | java.lang.Number | [[cdk.support/lookup-entry]] | `:left` |
| `top` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$BoundingBoxProperty$Builder.)]
    (when-let [data (lookup-entry config id :height)]
      (. builder height data))
    (when-let [data (lookup-entry config id :left)]
      (. builder left data))
    (when-let [data (lookup-entry config id :top)]
      (. builder top data))
    (when-let [data (lookup-entry config id :width)]
      (. builder width data))
    (.build builder)))


(defn cfn-stream-processor-builder
  "The cfn-stream-processor-builder function buildes out new instances of 
CfnStreamProcessor$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bounding-box-regions-of-interest)]
      (. builder boundingBoxRegionsOfInterest data))
    (when-let [data (lookup-entry config id :connected-home-settings)]
      (. builder connectedHomeSettings data))
    (when-let [data (lookup-entry config id :data-sharing-preference)]
      (. builder dataSharingPreference data))
    (when-let [data (lookup-entry config id :face-search-settings)]
      (. builder faceSearchSettings data))
    (when-let [data (lookup-entry config id :kinesis-data-stream)]
      (. builder kinesisDataStream data))
    (when-let [data (lookup-entry config id :kinesis-video-stream)]
      (. builder kinesisVideoStream data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-channel)]
      (. builder notificationChannel data))
    (when-let [data (lookup-entry config id :polygon-regions-of-interest)]
      (. builder polygonRegionsOfInterest data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-destination)]
      (. builder s3Destination data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-processor-connected-home-settings-property-builder
  "The cfn-stream-processor-connected-home-settings-property-builder function buildes out new instances of 
CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `minConfidence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-confidence` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$ConnectedHomeSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :min-confidence)]
      (. builder minConfidence data))
    (.build builder)))


(defn cfn-stream-processor-data-sharing-preference-property-builder
  "The cfn-stream-processor-data-sharing-preference-property-builder function buildes out new instances of 
CfnStreamProcessor$DataSharingPreferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:opt-in` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$DataSharingPreferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :opt-in)]
      (. builder optIn data))
    (.build builder)))


(defn cfn-stream-processor-face-search-settings-property-builder
  "The cfn-stream-processor-face-search-settings-property-builder function buildes out new instances of 
CfnStreamProcessor$FaceSearchSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `faceMatchThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:face-match-threshold` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$FaceSearchSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :collection-id)]
      (. builder collectionId data))
    (when-let [data (lookup-entry config id :face-match-threshold)]
      (. builder faceMatchThreshold data))
    (.build builder)))


(defn cfn-stream-processor-kinesis-data-stream-property-builder
  "The cfn-stream-processor-kinesis-data-stream-property-builder function buildes out new instances of 
CfnStreamProcessor$KinesisDataStreamProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$KinesisDataStreamProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-stream-processor-kinesis-video-stream-property-builder
  "The cfn-stream-processor-kinesis-video-stream-property-builder function buildes out new instances of 
CfnStreamProcessor$KinesisVideoStreamProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$KinesisVideoStreamProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-stream-processor-notification-channel-property-builder
  "The cfn-stream-processor-notification-channel-property-builder function buildes out new instances of 
CfnStreamProcessor$NotificationChannelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$NotificationChannelProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-stream-processor-point-property-builder
  "The cfn-stream-processor-point-property-builder function buildes out new instances of 
CfnStreamProcessor$PointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `x` | java.lang.Number | [[cdk.support/lookup-entry]] | `:x` |
| `y` | java.lang.Number | [[cdk.support/lookup-entry]] | `:y` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$PointProperty$Builder.)]
    (when-let [data (lookup-entry config id :x)]
      (. builder x data))
    (when-let [data (lookup-entry config id :y)]
      (. builder y data))
    (.build builder)))


(defn cfn-stream-processor-props-builder
  "The cfn-stream-processor-props-builder function buildes out new instances of 
CfnStreamProcessorProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamProcessorProps$Builder.)]
    (when-let [data (lookup-entry config id :bounding-box-regions-of-interest)]
      (. builder boundingBoxRegionsOfInterest data))
    (when-let [data (lookup-entry config id :connected-home-settings)]
      (. builder connectedHomeSettings data))
    (when-let [data (lookup-entry config id :data-sharing-preference)]
      (. builder dataSharingPreference data))
    (when-let [data (lookup-entry config id :face-search-settings)]
      (. builder faceSearchSettings data))
    (when-let [data (lookup-entry config id :kinesis-data-stream)]
      (. builder kinesisDataStream data))
    (when-let [data (lookup-entry config id :kinesis-video-stream)]
      (. builder kinesisVideoStream data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-channel)]
      (. builder notificationChannel data))
    (when-let [data (lookup-entry config id :polygon-regions-of-interest)]
      (. builder polygonRegionsOfInterest data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :s3-destination)]
      (. builder s3Destination data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-stream-processor-s3-destination-property-builder
  "The cfn-stream-processor-s3-destination-property-builder function buildes out new instances of 
CfnStreamProcessor$S3DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key-prefix` |"
  [stack id config]
  (let [builder (CfnStreamProcessor$S3DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :object-key-prefix)]
      (. builder objectKeyPrefix data))
    (.build builder)))