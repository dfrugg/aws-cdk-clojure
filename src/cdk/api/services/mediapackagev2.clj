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


(defn cfn-channel-builder>
  "The cfn-channel-builder> function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannel$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
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


(defn cfn-channel-group-builder>
  "The cfn-channel-group-builder> function updates a CfnChannelGroup$Builder instance using the provided configuration.
  The function takes the CfnChannelGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannelGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-channel-group-builder
  "Creates a  `CfnChannelGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-channel-group-builder> (CfnChannelGroup$Builder/create scope (name id)) id config))


(defn cfn-channel-group-props-builder>
  "The cfn-channel-group-props-builder> function updates a CfnChannelGroupProps$Builder instance using the provided configuration.
  The function takes the CfnChannelGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannelGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-channel-group-props-builder
  "Creates a  `CfnChannelGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-group-props-builder> (new CfnChannelGroupProps$Builder) id config))


(defn cfn-channel-ingest-endpoint-property-builder>
  "The cfn-channel-ingest-endpoint-property-builder> function updates a CfnChannel$IngestEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$IngestEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnChannel$IngestEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-channel-ingest-endpoint-property-builder
  "Creates a  `CfnChannel$IngestEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-ingest-endpoint-property-builder> (new CfnChannel$IngestEndpointProperty$Builder) id config))


(defn cfn-channel-policy-builder>
  "The cfn-channel-policy-builder> function updates a CfnChannelPolicy$Builder instance using the provided configuration.
  The function takes the CfnChannelPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnChannelPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-channel-policy-builder
  "Creates a  `CfnChannelPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-channel-policy-builder> (CfnChannelPolicy$Builder/create scope (name id)) id config))


(defn cfn-channel-policy-props-builder>
  "The cfn-channel-policy-props-builder> function updates a CfnChannelPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnChannelPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnChannelPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-channel-policy-props-builder
  "Creates a  `CfnChannelPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-policy-props-builder> (new CfnChannelPolicyProps$Builder) id config))


(defn cfn-channel-props-builder>
  "The cfn-channel-props-builder> function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-channel-props-builder
  "Creates a  `CfnChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-props-builder> (new CfnChannelProps$Builder) id config))


(defn cfn-origin-endpoint-builder>
  "The cfn-origin-endpoint-builder> function updates a CfnOriginEndpoint$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOriginEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :container-type)]
    (. builder containerType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hls-manifests)]
    (. builder hlsManifests data))
  (when-some [data (lookup-entry config id :low-latency-hls-manifests)]
    (. builder lowLatencyHlsManifests data))
  (when-some [data (lookup-entry config id :origin-endpoint-name)]
    (. builder originEndpointName data))
  (when-some [data (lookup-entry config id :segment)]
    (. builder segment data))
  (when-some [data (lookup-entry config id :startover-window-seconds)]
    (. builder startoverWindowSeconds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-origin-endpoint-builder
  "Creates a  `CfnOriginEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-origin-endpoint-builder> (CfnOriginEndpoint$Builder/create scope (name id)) id config))


(defn cfn-origin-endpoint-encryption-contract-configuration-property-builder>
  "The cfn-origin-endpoint-encryption-contract-configuration-property-builder> function updates a CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `presetSpeke20Audio` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-audio` |
| `presetSpeke20Video` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-video` |
"
  [^CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :preset-speke20-audio)]
    (. builder presetSpeke20Audio data))
  (when-some [data (lookup-entry config id :preset-speke20-video)]
    (. builder presetSpeke20Video data))
  (.build builder))


(defn cfn-origin-endpoint-encryption-contract-configuration-property-builder
  "Creates a  `CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-encryption-contract-configuration-property-builder> (new CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder) id config))


(defn cfn-origin-endpoint-encryption-method-property-builder>
  "The cfn-origin-endpoint-encryption-method-property-builder> function updates a CfnOriginEndpoint$EncryptionMethodProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$EncryptionMethodProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmafEncryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmaf-encryption-method` |
| `tsEncryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:ts-encryption-method` |
"
  [^CfnOriginEndpoint$EncryptionMethodProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cmaf-encryption-method)]
    (. builder cmafEncryptionMethod data))
  (when-some [data (lookup-entry config id :ts-encryption-method)]
    (. builder tsEncryptionMethod data))
  (.build builder))


(defn cfn-origin-endpoint-encryption-method-property-builder
  "Creates a  `CfnOriginEndpoint$EncryptionMethodProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-encryption-method-property-builder> (new CfnOriginEndpoint$EncryptionMethodProperty$Builder) id config))


(defn cfn-origin-endpoint-encryption-property-builder>
  "The cfn-origin-endpoint-encryption-property-builder> function updates a CfnOriginEndpoint$EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnOriginEndpoint$EncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :encryption-method)]
    (. builder encryptionMethod data))
  (when-some [data (lookup-entry config id :key-rotation-interval-seconds)]
    (. builder keyRotationIntervalSeconds data))
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-origin-endpoint-encryption-property-builder
  "Creates a  `CfnOriginEndpoint$EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-encryption-property-builder> (new CfnOriginEndpoint$EncryptionProperty$Builder) id config))


(defn cfn-origin-endpoint-filter-configuration-property-builder>
  "The cfn-origin-endpoint-filter-configuration-property-builder> function updates a CfnOriginEndpoint$FilterConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$FilterConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `manifestFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-filter` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
| `timeDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-delay-seconds` |
"
  [^CfnOriginEndpoint$FilterConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :end)]
    (. builder end data))
  (when-some [data (lookup-entry config id :manifest-filter)]
    (. builder manifestFilter data))
  (when-some [data (lookup-entry config id :start)]
    (. builder start data))
  (when-some [data (lookup-entry config id :time-delay-seconds)]
    (. builder timeDelaySeconds data))
  (.build builder))


(defn cfn-origin-endpoint-filter-configuration-property-builder
  "Creates a  `CfnOriginEndpoint$FilterConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-filter-configuration-property-builder> (new CfnOriginEndpoint$FilterConfigurationProperty$Builder) id config))


(defn cfn-origin-endpoint-hls-manifest-configuration-property-builder>
  "The cfn-origin-endpoint-hls-manifest-configuration-property-builder> function updates a CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childManifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-manifest-name` |
| `filterConfiguration` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$FilterConfigurationProperty | [[cdk.support/lookup-entry]] | `:filter-configuration` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `scteHls` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$ScteHlsProperty | [[cdk.support/lookup-entry]] | `:scte-hls` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :child-manifest-name)]
    (. builder childManifestName data))
  (when-some [data (lookup-entry config id :filter-configuration)]
    (. builder filterConfiguration data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :manifest-window-seconds)]
    (. builder manifestWindowSeconds data))
  (when-some [data (lookup-entry config id :program-date-time-interval-seconds)]
    (. builder programDateTimeIntervalSeconds data))
  (when-some [data (lookup-entry config id :scte-hls)]
    (. builder scteHls data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-origin-endpoint-hls-manifest-configuration-property-builder
  "Creates a  `CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-hls-manifest-configuration-property-builder> (new CfnOriginEndpoint$HlsManifestConfigurationProperty$Builder) id config))


(defn cfn-origin-endpoint-low-latency-hls-manifest-configuration-property-builder>
  "The cfn-origin-endpoint-low-latency-hls-manifest-configuration-property-builder> function updates a CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childManifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-manifest-name` |
| `filterConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-configuration` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `scteHls` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$ScteHlsProperty | [[cdk.support/lookup-entry]] | `:scte-hls` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :child-manifest-name)]
    (. builder childManifestName data))
  (when-some [data (lookup-entry config id :filter-configuration)]
    (. builder filterConfiguration data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :manifest-window-seconds)]
    (. builder manifestWindowSeconds data))
  (when-some [data (lookup-entry config id :program-date-time-interval-seconds)]
    (. builder programDateTimeIntervalSeconds data))
  (when-some [data (lookup-entry config id :scte-hls)]
    (. builder scteHls data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-origin-endpoint-low-latency-hls-manifest-configuration-property-builder
  "Creates a  `CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-low-latency-hls-manifest-configuration-property-builder> (new CfnOriginEndpoint$LowLatencyHlsManifestConfigurationProperty$Builder) id config))


(defn cfn-origin-endpoint-policy-builder>
  "The cfn-origin-endpoint-policy-builder> function updates a CfnOriginEndpointPolicy$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpointPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `originEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-endpoint-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnOriginEndpointPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :origin-endpoint-name)]
    (. builder originEndpointName data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-origin-endpoint-policy-builder
  "Creates a  `CfnOriginEndpointPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-origin-endpoint-policy-builder> (CfnOriginEndpointPolicy$Builder/create scope (name id)) id config))


(defn cfn-origin-endpoint-policy-props-builder>
  "The cfn-origin-endpoint-policy-props-builder> function updates a CfnOriginEndpointPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpointPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-group-name` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `originEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-endpoint-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnOriginEndpointPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :origin-endpoint-name)]
    (. builder originEndpointName data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-origin-endpoint-policy-props-builder
  "Creates a  `CfnOriginEndpointPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-policy-props-builder> (new CfnOriginEndpointPolicyProps$Builder) id config))


(defn cfn-origin-endpoint-props-builder>
  "The cfn-origin-endpoint-props-builder> function updates a CfnOriginEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOriginEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-group-name)]
    (. builder channelGroupName data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :container-type)]
    (. builder containerType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hls-manifests)]
    (. builder hlsManifests data))
  (when-some [data (lookup-entry config id :low-latency-hls-manifests)]
    (. builder lowLatencyHlsManifests data))
  (when-some [data (lookup-entry config id :origin-endpoint-name)]
    (. builder originEndpointName data))
  (when-some [data (lookup-entry config id :segment)]
    (. builder segment data))
  (when-some [data (lookup-entry config id :startover-window-seconds)]
    (. builder startoverWindowSeconds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-origin-endpoint-props-builder
  "Creates a  `CfnOriginEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-props-builder> (new CfnOriginEndpointProps$Builder) id config))


(defn cfn-origin-endpoint-scte-hls-property-builder>
  "The cfn-origin-endpoint-scte-hls-property-builder> function updates a CfnOriginEndpoint$ScteHlsProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$ScteHlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkerHls` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-marker-hls` |
"
  [^CfnOriginEndpoint$ScteHlsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-marker-hls)]
    (. builder adMarkerHls data))
  (.build builder))


(defn cfn-origin-endpoint-scte-hls-property-builder
  "Creates a  `CfnOriginEndpoint$ScteHlsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-scte-hls-property-builder> (new CfnOriginEndpoint$ScteHlsProperty$Builder) id config))


(defn cfn-origin-endpoint-scte-property-builder>
  "The cfn-origin-endpoint-scte-property-builder> function updates a CfnOriginEndpoint$ScteProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$ScteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scteFilter` | java.util.List | [[cdk.support/lookup-entry]] | `:scte-filter` |
"
  [^CfnOriginEndpoint$ScteProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :scte-filter)]
    (. builder scteFilter data))
  (.build builder))


(defn cfn-origin-endpoint-scte-property-builder
  "Creates a  `CfnOriginEndpoint$ScteProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-scte-property-builder> (new CfnOriginEndpoint$ScteProperty$Builder) id config))


(defn cfn-origin-endpoint-segment-property-builder>
  "The cfn-origin-endpoint-segment-property-builder> function updates a CfnOriginEndpoint$SegmentProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$SegmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `includeIframeOnlyStreams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-streams` |
| `scte` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$ScteProperty | [[cdk.support/lookup-entry]] | `:scte` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tsIncludeDvbSubtitles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ts-include-dvb-subtitles` |
| `tsUseAudioRenditionGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ts-use-audio-rendition-group` |
"
  [^CfnOriginEndpoint$SegmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :include-iframe-only-streams)]
    (. builder includeIframeOnlyStreams data))
  (when-some [data (lookup-entry config id :scte)]
    (. builder scte data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :segment-name)]
    (. builder segmentName data))
  (when-some [data (lookup-entry config id :ts-include-dvb-subtitles)]
    (. builder tsIncludeDvbSubtitles data))
  (when-some [data (lookup-entry config id :ts-use-audio-rendition-group)]
    (. builder tsUseAudioRenditionGroup data))
  (.build builder))


(defn cfn-origin-endpoint-segment-property-builder
  "Creates a  `CfnOriginEndpoint$SegmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-segment-property-builder> (new CfnOriginEndpoint$SegmentProperty$Builder) id config))


(defn cfn-origin-endpoint-speke-key-provider-property-builder>
  "The cfn-origin-endpoint-speke-key-provider-property-builder> function updates a CfnOriginEndpoint$SpekeKeyProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$SpekeKeyProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `drmSystems` | java.util.List | [[cdk.support/lookup-entry]] | `:drm-systems` |
| `encryptionContractConfiguration` | software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint$EncryptionContractConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-contract-configuration` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOriginEndpoint$SpekeKeyProviderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :drm-systems)]
    (. builder drmSystems data))
  (when-some [data (lookup-entry config id :encryption-contract-configuration)]
    (. builder encryptionContractConfiguration data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-origin-endpoint-speke-key-provider-property-builder
  "Creates a  `CfnOriginEndpoint$SpekeKeyProviderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-speke-key-provider-property-builder> (new CfnOriginEndpoint$SpekeKeyProviderProperty$Builder) id config))