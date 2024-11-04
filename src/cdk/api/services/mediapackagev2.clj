(ns cdk.api.services.mediapackagev2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mediapackagev2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mediapackagev2 CfnChannel$Builder
                                                           CfnChannel$IngestEndpointProperty$Builder
                                                           CfnChannelGroup$Builder
                                                           CfnChannelGroupProps$Builder
                                                           CfnChannelPolicy$Builder
                                                           CfnChannelPolicyProps$Builder
                                                           CfnChannelProps$Builder
                                                           CfnOriginEndpoint$Builder
                                                           CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder
                                                           CfnOriginEndpoint$EncryptionMethodProperty$Builder
                                                           CfnOriginEndpoint$EncryptionProperty$Builder
                                                           CfnOriginEndpoint$FilterConfigurationProperty$Builder
                                                           CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder
                                                           CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder
                                                           CfnOriginEndpoint$ScteHlsProperty$Builder
                                                           CfnOriginEndpoint$ScteProperty$Builder
                                                           CfnOriginEndpoint$SegmentProperty$Builder
                                                           CfnOriginEndpoint$SpekeKeyProviderProperty$Builder
                                                           CfnOriginEndpointPolicy$Builder
                                                           CfnOriginEndpointPolicyProps$Builder
                                                           CfnOriginEndpointProps$Builder]))


(defn cfn-channel-builder
  "The cfn-channel-builder function buildes out new instances of 
CfnChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-group-builder
  "The cfn-channel-group-builder function buildes out new instances of 
CfnChannelGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannelGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-group-props-builder
  "The cfn-channel-group-props-builder function buildes out new instances of 
CfnChannelGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannelGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-ingest-endpoint-property-builder
  "The cfn-channel-ingest-endpoint-property-builder function buildes out new instances of 
CfnChannel$IngestEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnChannel$IngestEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-channel-policy-builder
  "The cfn-channel-policy-builder function buildes out new instances of 
CfnChannelPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnChannelPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-channel-policy-props-builder
  "The cfn-channel-policy-props-builder function buildes out new instances of 
CfnChannelPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnChannelPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-channel-props-builder
  "The cfn-channel-props-builder function buildes out new instances of 
CfnChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-origin-endpoint-builder
  "The cfn-origin-endpoint-builder function buildes out new instances of 
CfnOriginEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `containerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `lowLatencyHlsManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:low-latency-hls-manifests` |
| `originEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-endpoint-name` |
| `segment` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$SegmentProperty | [[cdk.support/lookup-entry]] | `:segment` |
| `startoverWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:startover-window-seconds` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :container-type)]
      (. builder containerType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hls-manifests)]
      (. builder hlsManifests data))
    (when-let [data (lookup-entry config id :low-latency-hls-manifests)]
      (. builder lowLatencyHlsManifests data))
    (when-let [data (lookup-entry config id :origin-endpoint-name)]
      (. builder originEndpointName data))
    (when-let [data (lookup-entry config id :segment)]
      (. builder segment data))
    (when-let [data (lookup-entry config id :startover-window-seconds)]
      (. builder startoverWindowSeconds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-origin-endpoint-encryption-contract-configuration-property-builder
  "The cfn-origin-endpoint-encryption-contract-configuration-property-builder function buildes out new instances of 
CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `presetSpeke20Audio` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-audio` |
| `presetSpeke20Video` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-video` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :preset-speke20-audio)]
      (. builder presetSpeke20Audio data))
    (when-let [data (lookup-entry config id :preset-speke20-video)]
      (. builder presetSpeke20Video data))
    (.build builder)))


(defn cfn-origin-endpoint-encryption-method-property-builder
  "The cfn-origin-endpoint-encryption-method-property-builder function buildes out new instances of 
CfnOriginEndpoint$EncryptionMethodProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmafEncryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmaf-encryption-method` |
| `tsEncryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:ts-encryption-method` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$EncryptionMethodProperty$Builder.)]
    (when-let [data (lookup-entry config id :cmaf-encryption-method)]
      (. builder cmafEncryptionMethod data))
    (when-let [data (lookup-entry config id :ts-encryption-method)]
      (. builder tsEncryptionMethod data))
    (.build builder)))


(defn cfn-origin-endpoint-encryption-property-builder
  "The cfn-origin-endpoint-encryption-property-builder function buildes out new instances of 
CfnOriginEndpoint$EncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$EncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :encryption-method)]
      (. builder encryptionMethod data))
    (when-let [data (lookup-entry config id :key-rotation-interval-seconds)]
      (. builder keyRotationIntervalSeconds data))
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-origin-endpoint-filter-configuration-property-builder
  "The cfn-origin-endpoint-filter-configuration-property-builder function buildes out new instances of 
CfnOriginEndpoint$FilterConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `manifestFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-filter` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `timeDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-delay-seconds` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$FilterConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :manifest-filter)]
      (. builder manifestFilter data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (when-let [data (lookup-entry config id :time-delay-seconds)]
      (. builder timeDelaySeconds data))
    (.build builder)))


(defn cfn-origin-endpoint-hls-manifest-configuration-property-builder
  "The cfn-origin-endpoint-hls-manifest-configuration-property-builder function buildes out new instances of 
CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childManifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-manifest-name` |
| `filterConfiguration` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$FilterConfigurationProperty | [[cdk.support/lookup-entry]] | `:filter-configuration` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `scteHls` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$ScteHlsProperty | [[cdk.support/lookup-entry]] | `:scte-hls` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :child-manifest-name)]
      (. builder childManifestName data))
    (when-let [data (lookup-entry config id :filter-configuration)]
      (. builder filterConfiguration data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :manifest-window-seconds)]
      (. builder manifestWindowSeconds data))
    (when-let [data (lookup-entry config id :program-date-time-interval-seconds)]
      (. builder programDateTimeIntervalSeconds data))
    (when-let [data (lookup-entry config id :scte-hls)]
      (. builder scteHls data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-origin-endpoint-low-latency-hls-manifest-configuration-property-builder
  "The cfn-origin-endpoint-low-latency-hls-manifest-configuration-property-builder function buildes out new instances of 
CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childManifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-manifest-name` |
| `filterConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-configuration` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `scteHls` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$ScteHlsProperty | [[cdk.support/lookup-entry]] | `:scte-hls` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :child-manifest-name)]
      (. builder childManifestName data))
    (when-let [data (lookup-entry config id :filter-configuration)]
      (. builder filterConfiguration data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :manifest-window-seconds)]
      (. builder manifestWindowSeconds data))
    (when-let [data (lookup-entry config id :program-date-time-interval-seconds)]
      (. builder programDateTimeIntervalSeconds data))
    (when-let [data (lookup-entry config id :scte-hls)]
      (. builder scteHls data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-origin-endpoint-policy-builder
  "The cfn-origin-endpoint-policy-builder function buildes out new instances of 
CfnOriginEndpointPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `originEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-endpoint-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnOriginEndpointPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :origin-endpoint-name)]
      (. builder originEndpointName data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-origin-endpoint-policy-props-builder
  "The cfn-origin-endpoint-policy-props-builder function buildes out new instances of 
CfnOriginEndpointPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `originEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-endpoint-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnOriginEndpointPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :origin-endpoint-name)]
      (. builder originEndpointName data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-origin-endpoint-props-builder
  "The cfn-origin-endpoint-props-builder function buildes out new instances of 
CfnOriginEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `containerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hlsManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `lowLatencyHlsManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:low-latency-hls-manifests` |
| `originEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-endpoint-name` |
| `segment` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$SegmentProperty | [[cdk.support/lookup-entry]] | `:segment` |
| `startoverWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:startover-window-seconds` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOriginEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-group-name)]
      (. builder channelGroupName data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :container-type)]
      (. builder containerType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hls-manifests)]
      (. builder hlsManifests data))
    (when-let [data (lookup-entry config id :low-latency-hls-manifests)]
      (. builder lowLatencyHlsManifests data))
    (when-let [data (lookup-entry config id :origin-endpoint-name)]
      (. builder originEndpointName data))
    (when-let [data (lookup-entry config id :segment)]
      (. builder segment data))
    (when-let [data (lookup-entry config id :startover-window-seconds)]
      (. builder startoverWindowSeconds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-origin-endpoint-scte-hls-property-builder
  "The cfn-origin-endpoint-scte-hls-property-builder function buildes out new instances of 
CfnOriginEndpoint$ScteHlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkerHls` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-marker-hls` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$ScteHlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-marker-hls)]
      (. builder adMarkerHls data))
    (.build builder)))


(defn cfn-origin-endpoint-scte-property-builder
  "The cfn-origin-endpoint-scte-property-builder function buildes out new instances of 
CfnOriginEndpoint$ScteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scteFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:scte-filter` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$ScteProperty$Builder.)]
    (when-let [data (lookup-entry config id :scte-filter)]
      (. builder scteFilter data))
    (.build builder)))


(defn cfn-origin-endpoint-segment-property-builder
  "The cfn-origin-endpoint-segment-property-builder function buildes out new instances of 
CfnOriginEndpoint$SegmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `includeIframeOnlyStreams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-streams` |
| `scte` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$ScteProperty | [[cdk.support/lookup-entry]] | `:scte` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tsIncludeDvbSubtitles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ts-include-dvb-subtitles` |
| `tsUseAudioRenditionGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ts-use-audio-rendition-group` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$SegmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :include-iframe-only-streams)]
      (. builder includeIframeOnlyStreams data))
    (when-let [data (lookup-entry config id :scte)]
      (. builder scte data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :segment-name)]
      (. builder segmentName data))
    (when-let [data (lookup-entry config id :ts-include-dvb-subtitles)]
      (. builder tsIncludeDvbSubtitles data))
    (when-let [data (lookup-entry config id :ts-use-audio-rendition-group)]
      (. builder tsUseAudioRenditionGroup data))
    (.build builder)))


(defn cfn-origin-endpoint-speke-key-provider-property-builder
  "The cfn-origin-endpoint-speke-key-provider-property-builder function buildes out new instances of 
CfnOriginEndpoint$SpekeKeyProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `drmSystems` | java.util.List | [[cdk.support/lookup-entry]] | `:drm-systems` |
| `encryptionContractConfiguration` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$EncryptionContractConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-contract-configuration` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$SpekeKeyProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :drm-systems)]
      (. builder drmSystems data))
    (when-let [data (lookup-entry config id :encryption-contract-configuration)]
      (. builder encryptionContractConfiguration data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))