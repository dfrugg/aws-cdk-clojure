(ns cdk.api.services.mediatailor
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mediatailor package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mediatailor CfnChannel$Builder
                                                        CfnChannel$DashPlaylistSettingsProperty$Builder
                                                        CfnChannel$HlsPlaylistSettingsProperty$Builder
                                                        CfnChannel$LogConfigurationForChannelProperty$Builder
                                                        CfnChannel$RequestOutputItemProperty$Builder
                                                        CfnChannel$SlateSourceProperty$Builder
                                                        CfnChannel$TimeShiftConfigurationProperty$Builder
                                                        CfnChannelPolicy$Builder
                                                        CfnChannelPolicyProps$Builder
                                                        CfnChannelProps$Builder
                                                        CfnLiveSource$Builder
                                                        CfnLiveSource$HttpPackageConfigurationProperty$Builder
                                                        CfnLiveSourceProps$Builder
                                                        CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder
                                                        CfnPlaybackConfiguration$AvailSuppressionProperty$Builder
                                                        CfnPlaybackConfiguration$Builder
                                                        CfnPlaybackConfiguration$BumperProperty$Builder
                                                        CfnPlaybackConfiguration$CdnConfigurationProperty$Builder
                                                        CfnPlaybackConfiguration$DashConfigurationProperty$Builder
                                                        CfnPlaybackConfiguration$HlsConfigurationProperty$Builder
                                                        CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder
                                                        CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder
                                                        CfnPlaybackConfigurationProps$Builder
                                                        CfnSourceLocation$AccessConfigurationProperty$Builder
                                                        CfnSourceLocation$Builder
                                                        CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder
                                                        CfnSourceLocation$HttpConfigurationProperty$Builder
                                                        CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder
                                                        CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder
                                                        CfnSourceLocationProps$Builder
                                                        CfnVodSource$Builder
                                                        CfnVodSource$HttpPackageConfigurationProperty$Builder
                                                        CfnVodSourceProps$Builder]))


(defn build-cfn-channel-builder
  "The build-cfn-channel-builder function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audiences` | java.util.List | [[cdk.support/lookup-entry]] | `:audiences` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `fillerSlate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filler-slate` |
| `logConfiguration` | software.amazon.awscdk.services.mediatailor.CfnChannel$LogConfigurationForChannelProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `playbackMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:playback-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
| `timeShiftConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-shift-configuration` |
"
  [^CfnChannel$Builder builder id config]
  (when-some [data (lookup-entry config id :audiences)]
    (. builder audiences data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :filler-slate)]
    (. builder fillerSlate data))
  (when-some [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :playback-mode)]
    (. builder playbackMode data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-some [data (lookup-entry config id :time-shift-configuration)]
    (. builder timeShiftConfiguration data))
  (.build builder))


(defn cfn-channel-builder
  "Creates a  `CfnChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-channel-builder (CfnChannel$Builder/create scope (name id)) id config))


(defn build-cfn-channel-dash-playlist-settings-property-builder
  "The build-cfn-channel-dash-playlist-settings-property-builder function updates a CfnChannel$DashPlaylistSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DashPlaylistSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `minBufferTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-buffer-time-seconds` |
| `minUpdatePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-update-period-seconds` |
| `suggestedPresentationDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:suggested-presentation-delay-seconds` |
"
  [^CfnChannel$DashPlaylistSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :manifest-window-seconds)]
    (. builder manifestWindowSeconds data))
  (when-some [data (lookup-entry config id :min-buffer-time-seconds)]
    (. builder minBufferTimeSeconds data))
  (when-some [data (lookup-entry config id :min-update-period-seconds)]
    (. builder minUpdatePeriodSeconds data))
  (when-some [data (lookup-entry config id :suggested-presentation-delay-seconds)]
    (. builder suggestedPresentationDelaySeconds data))
  (.build builder))


(defn cfn-channel-dash-playlist-settings-property-builder
  "Creates a  `CfnChannel$DashPlaylistSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-dash-playlist-settings-property-builder (new CfnChannel$DashPlaylistSettingsProperty$Builder) id config))


(defn build-cfn-channel-hls-playlist-settings-property-builder
  "The build-cfn-channel-hls-playlist-settings-property-builder function updates a CfnChannel$HlsPlaylistSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsPlaylistSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkupType` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-markup-type` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
"
  [^CfnChannel$HlsPlaylistSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-markup-type)]
    (. builder adMarkupType data))
  (when-some [data (lookup-entry config id :manifest-window-seconds)]
    (. builder manifestWindowSeconds data))
  (.build builder))


(defn cfn-channel-hls-playlist-settings-property-builder
  "Creates a  `CfnChannel$HlsPlaylistSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-hls-playlist-settings-property-builder (new CfnChannel$HlsPlaylistSettingsProperty$Builder) id config))


(defn build-cfn-channel-log-configuration-for-channel-property-builder
  "The build-cfn-channel-log-configuration-for-channel-property-builder function updates a CfnChannel$LogConfigurationForChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$LogConfigurationForChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:log-types` |
"
  [^CfnChannel$LogConfigurationForChannelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-types)]
    (. builder logTypes data))
  (.build builder))


(defn cfn-channel-log-configuration-for-channel-property-builder
  "Creates a  `CfnChannel$LogConfigurationForChannelProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-log-configuration-for-channel-property-builder (new CfnChannel$LogConfigurationForChannelProperty$Builder) id config))


(defn build-cfn-channel-policy-builder
  "The build-cfn-channel-policy-builder function updates a CfnChannelPolicy$Builder instance using the provided configuration.
  The function takes the CfnChannelPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnChannelPolicy$Builder builder id config]
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
  (build-cfn-channel-policy-builder (CfnChannelPolicy$Builder/create scope (name id)) id config))


(defn build-cfn-channel-policy-props-builder
  "The build-cfn-channel-policy-props-builder function updates a CfnChannelPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnChannelPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnChannelPolicyProps$Builder builder id config]
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
  (build-cfn-channel-policy-props-builder (new CfnChannelPolicyProps$Builder) id config))


(defn build-cfn-channel-props-builder
  "The build-cfn-channel-props-builder function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audiences` | java.util.List | [[cdk.support/lookup-entry]] | `:audiences` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `fillerSlate` | software.amazon.awscdk.services.mediatailor.CfnChannel$SlateSourceProperty | [[cdk.support/lookup-entry]] | `:filler-slate` |
| `logConfiguration` | software.amazon.awscdk.services.mediatailor.CfnChannel$LogConfigurationForChannelProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `playbackMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:playback-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
| `timeShiftConfiguration` | software.amazon.awscdk.services.mediatailor.CfnChannel$TimeShiftConfigurationProperty | [[cdk.support/lookup-entry]] | `:time-shift-configuration` |
"
  [^CfnChannelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :audiences)]
    (. builder audiences data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :filler-slate)]
    (. builder fillerSlate data))
  (when-some [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :playback-mode)]
    (. builder playbackMode data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-some [data (lookup-entry config id :time-shift-configuration)]
    (. builder timeShiftConfiguration data))
  (.build builder))


(defn cfn-channel-props-builder
  "Creates a  `CfnChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-props-builder (new CfnChannelProps$Builder) id config))


(defn build-cfn-channel-request-output-item-property-builder
  "The build-cfn-channel-request-output-item-property-builder function updates a CfnChannel$RequestOutputItemProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RequestOutputItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashPlaylistSettings` | software.amazon.awscdk.services.mediatailor.CfnChannel$DashPlaylistSettingsProperty | [[cdk.support/lookup-entry]] | `:dash-playlist-settings` |
| `hlsPlaylistSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-playlist-settings` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `sourceGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-group` |
"
  [^CfnChannel$RequestOutputItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dash-playlist-settings)]
    (. builder dashPlaylistSettings data))
  (when-some [data (lookup-entry config id :hls-playlist-settings)]
    (. builder hlsPlaylistSettings data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :source-group)]
    (. builder sourceGroup data))
  (.build builder))


(defn cfn-channel-request-output-item-property-builder
  "Creates a  `CfnChannel$RequestOutputItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-request-output-item-property-builder (new CfnChannel$RequestOutputItemProperty$Builder) id config))


(defn build-cfn-channel-slate-source-property-builder
  "The build-cfn-channel-slate-source-property-builder function updates a CfnChannel$SlateSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$SlateSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `vodSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vod-source-name` |
"
  [^CfnChannel$SlateSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :vod-source-name)]
    (. builder vodSourceName data))
  (.build builder))


(defn cfn-channel-slate-source-property-builder
  "Creates a  `CfnChannel$SlateSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-slate-source-property-builder (new CfnChannel$SlateSourceProperty$Builder) id config))


(defn build-cfn-channel-time-shift-configuration-property-builder
  "The build-cfn-channel-time-shift-configuration-property-builder function updates a CfnChannel$TimeShiftConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TimeShiftConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxTimeDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-delay-seconds` |
"
  [^CfnChannel$TimeShiftConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-time-delay-seconds)]
    (. builder maxTimeDelaySeconds data))
  (.build builder))


(defn cfn-channel-time-shift-configuration-property-builder
  "Creates a  `CfnChannel$TimeShiftConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-channel-time-shift-configuration-property-builder (new CfnChannel$TimeShiftConfigurationProperty$Builder) id config))


(defn build-cfn-live-source-builder
  "The build-cfn-live-source-builder function updates a CfnLiveSource$Builder instance using the provided configuration.
  The function takes the CfnLiveSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `liveSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:live-source-name` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLiveSource$Builder builder id config]
  (when-some [data (lookup-entry config id :http-package-configurations)]
    (. builder httpPackageConfigurations data))
  (when-some [data (lookup-entry config id :live-source-name)]
    (. builder liveSourceName data))
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-live-source-builder
  "Creates a  `CfnLiveSource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-live-source-builder (CfnLiveSource$Builder/create scope (name id)) id config))


(defn build-cfn-live-source-http-package-configuration-property-builder
  "The build-cfn-live-source-http-package-configuration-property-builder function updates a CfnLiveSource$HttpPackageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLiveSource$HttpPackageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sourceGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-group` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLiveSource$HttpPackageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :source-group)]
    (. builder sourceGroup data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-live-source-http-package-configuration-property-builder
  "Creates a  `CfnLiveSource$HttpPackageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-live-source-http-package-configuration-property-builder (new CfnLiveSource$HttpPackageConfigurationProperty$Builder) id config))


(defn build-cfn-live-source-props-builder
  "The build-cfn-live-source-props-builder function updates a CfnLiveSourceProps$Builder instance using the provided configuration.
  The function takes the CfnLiveSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `liveSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:live-source-name` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLiveSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :http-package-configurations)]
    (. builder httpPackageConfigurations data))
  (when-some [data (lookup-entry config id :live-source-name)]
    (. builder liveSourceName data))
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-live-source-props-builder
  "Creates a  `CfnLiveSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-live-source-props-builder (new CfnLiveSourceProps$Builder) id config))


(defn build-cfn-playback-configuration-ad-marker-passthrough-property-builder
  "The build-cfn-playback-configuration-ad-marker-passthrough-property-builder function updates a CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-playback-configuration-ad-marker-passthrough-property-builder
  "Creates a  `CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-ad-marker-passthrough-property-builder (new CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder) id config))


(defn build-cfn-playback-configuration-avail-suppression-property-builder
  "The build-cfn-playback-configuration-avail-suppression-property-builder function updates a CfnPlaybackConfiguration$AvailSuppressionProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$AvailSuppressionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fillPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:fill-policy` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPlaybackConfiguration$AvailSuppressionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fill-policy)]
    (. builder fillPolicy data))
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-playback-configuration-avail-suppression-property-builder
  "Creates a  `CfnPlaybackConfiguration$AvailSuppressionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-avail-suppression-property-builder (new CfnPlaybackConfiguration$AvailSuppressionProperty$Builder) id config))


(defn build-cfn-playback-configuration-builder
  "The build-cfn-playback-configuration-builder function updates a CfnPlaybackConfiguration$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDecisionServerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-decision-server-url` |
| `availSuppression` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:avail-suppression` |
| `bumper` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$BumperProperty | [[cdk.support/lookup-entry]] | `:bumper` |
| `cdnConfiguration` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$CdnConfigurationProperty | [[cdk.support/lookup-entry]] | `:cdn-configuration` |
| `configurationAliases` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-aliases` |
| `dashConfiguration` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$DashConfigurationProperty | [[cdk.support/lookup-entry]] | `:dash-configuration` |
| `hlsConfiguration` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$HlsConfigurationProperty | [[cdk.support/lookup-entry]] | `:hls-configuration` |
| `livePreRollConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:live-pre-roll-configuration` |
| `manifestProcessingRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:manifest-processing-rules` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `personalizationThresholdSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:personalization-threshold-seconds` |
| `slateAdUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:slate-ad-url` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transcodeProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:transcode-profile-name` |
| `videoContentSourceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-content-source-url` |
"
  [^CfnPlaybackConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-decision-server-url)]
    (. builder adDecisionServerUrl data))
  (when-some [data (lookup-entry config id :avail-suppression)]
    (. builder availSuppression data))
  (when-some [data (lookup-entry config id :bumper)]
    (. builder bumper data))
  (when-some [data (lookup-entry config id :cdn-configuration)]
    (. builder cdnConfiguration data))
  (when-some [data (lookup-entry config id :configuration-aliases)]
    (. builder configurationAliases data))
  (when-some [data (lookup-entry config id :dash-configuration)]
    (. builder dashConfiguration data))
  (when-some [data (lookup-entry config id :hls-configuration)]
    (. builder hlsConfiguration data))
  (when-some [data (lookup-entry config id :live-pre-roll-configuration)]
    (. builder livePreRollConfiguration data))
  (when-some [data (lookup-entry config id :manifest-processing-rules)]
    (. builder manifestProcessingRules data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :personalization-threshold-seconds)]
    (. builder personalizationThresholdSeconds data))
  (when-some [data (lookup-entry config id :slate-ad-url)]
    (. builder slateAdUrl data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :transcode-profile-name)]
    (. builder transcodeProfileName data))
  (when-some [data (lookup-entry config id :video-content-source-url)]
    (. builder videoContentSourceUrl data))
  (.build builder))


(defn cfn-playback-configuration-builder
  "Creates a  `CfnPlaybackConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-playback-configuration-builder (CfnPlaybackConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-playback-configuration-bumper-property-builder
  "The build-cfn-playback-configuration-bumper-property-builder function updates a CfnPlaybackConfiguration$BumperProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$BumperProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-url` |
| `startUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-url` |
"
  [^CfnPlaybackConfiguration$BumperProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :end-url)]
    (. builder endUrl data))
  (when-some [data (lookup-entry config id :start-url)]
    (. builder startUrl data))
  (.build builder))


(defn cfn-playback-configuration-bumper-property-builder
  "Creates a  `CfnPlaybackConfiguration$BumperProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-bumper-property-builder (new CfnPlaybackConfiguration$BumperProperty$Builder) id config))


(defn build-cfn-playback-configuration-cdn-configuration-property-builder
  "The build-cfn-playback-configuration-cdn-configuration-property-builder function updates a CfnPlaybackConfiguration$CdnConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$CdnConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adSegmentUrlPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-segment-url-prefix` |
| `contentSegmentUrlPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-segment-url-prefix` |
"
  [^CfnPlaybackConfiguration$CdnConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-segment-url-prefix)]
    (. builder adSegmentUrlPrefix data))
  (when-some [data (lookup-entry config id :content-segment-url-prefix)]
    (. builder contentSegmentUrlPrefix data))
  (.build builder))


(defn cfn-playback-configuration-cdn-configuration-property-builder
  "Creates a  `CfnPlaybackConfiguration$CdnConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-cdn-configuration-property-builder (new CfnPlaybackConfiguration$CdnConfigurationProperty$Builder) id config))


(defn build-cfn-playback-configuration-dash-configuration-property-builder
  "The build-cfn-playback-configuration-dash-configuration-property-builder function updates a CfnPlaybackConfiguration$DashConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$DashConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestEndpointPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-endpoint-prefix` |
| `mpdLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:mpd-location` |
| `originManifestType` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-manifest-type` |
"
  [^CfnPlaybackConfiguration$DashConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :manifest-endpoint-prefix)]
    (. builder manifestEndpointPrefix data))
  (when-some [data (lookup-entry config id :mpd-location)]
    (. builder mpdLocation data))
  (when-some [data (lookup-entry config id :origin-manifest-type)]
    (. builder originManifestType data))
  (.build builder))


(defn cfn-playback-configuration-dash-configuration-property-builder
  "Creates a  `CfnPlaybackConfiguration$DashConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-dash-configuration-property-builder (new CfnPlaybackConfiguration$DashConfigurationProperty$Builder) id config))


(defn build-cfn-playback-configuration-hls-configuration-property-builder
  "The build-cfn-playback-configuration-hls-configuration-property-builder function updates a CfnPlaybackConfiguration$HlsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$HlsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestEndpointPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-endpoint-prefix` |
"
  [^CfnPlaybackConfiguration$HlsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :manifest-endpoint-prefix)]
    (. builder manifestEndpointPrefix data))
  (.build builder))


(defn cfn-playback-configuration-hls-configuration-property-builder
  "Creates a  `CfnPlaybackConfiguration$HlsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-hls-configuration-property-builder (new CfnPlaybackConfiguration$HlsConfigurationProperty$Builder) id config))


(defn build-cfn-playback-configuration-live-pre-roll-configuration-property-builder
  "The build-cfn-playback-configuration-live-pre-roll-configuration-property-builder function updates a CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDecisionServerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-decision-server-url` |
| `maxDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duration-seconds` |
"
  [^CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-decision-server-url)]
    (. builder adDecisionServerUrl data))
  (when-some [data (lookup-entry config id :max-duration-seconds)]
    (. builder maxDurationSeconds data))
  (.build builder))


(defn cfn-playback-configuration-live-pre-roll-configuration-property-builder
  "Creates a  `CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-live-pre-roll-configuration-property-builder (new CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder) id config))


(defn build-cfn-playback-configuration-manifest-processing-rules-property-builder
  "The build-cfn-playback-configuration-manifest-processing-rules-property-builder function updates a CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkerPassthrough` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$AdMarkerPassthroughProperty | [[cdk.support/lookup-entry]] | `:ad-marker-passthrough` |
"
  [^CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-marker-passthrough)]
    (. builder adMarkerPassthrough data))
  (.build builder))


(defn cfn-playback-configuration-manifest-processing-rules-property-builder
  "Creates a  `CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-manifest-processing-rules-property-builder (new CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder) id config))


(defn build-cfn-playback-configuration-props-builder
  "The build-cfn-playback-configuration-props-builder function updates a CfnPlaybackConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnPlaybackConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDecisionServerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-decision-server-url` |
| `availSuppression` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:avail-suppression` |
| `bumper` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$BumperProperty | [[cdk.support/lookup-entry]] | `:bumper` |
| `cdnConfiguration` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$CdnConfigurationProperty | [[cdk.support/lookup-entry]] | `:cdn-configuration` |
| `configurationAliases` | java.util.Map | [[cdk.support/lookup-entry]] | `:configuration-aliases` |
| `dashConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dash-configuration` |
| `hlsConfiguration` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$HlsConfigurationProperty | [[cdk.support/lookup-entry]] | `:hls-configuration` |
| `livePreRollConfiguration` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$LivePreRollConfigurationProperty | [[cdk.support/lookup-entry]] | `:live-pre-roll-configuration` |
| `manifestProcessingRules` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$ManifestProcessingRulesProperty | [[cdk.support/lookup-entry]] | `:manifest-processing-rules` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `personalizationThresholdSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:personalization-threshold-seconds` |
| `slateAdUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:slate-ad-url` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transcodeProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:transcode-profile-name` |
| `videoContentSourceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-content-source-url` |
"
  [^CfnPlaybackConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-decision-server-url)]
    (. builder adDecisionServerUrl data))
  (when-some [data (lookup-entry config id :avail-suppression)]
    (. builder availSuppression data))
  (when-some [data (lookup-entry config id :bumper)]
    (. builder bumper data))
  (when-some [data (lookup-entry config id :cdn-configuration)]
    (. builder cdnConfiguration data))
  (when-some [data (lookup-entry config id :configuration-aliases)]
    (. builder configurationAliases data))
  (when-some [data (lookup-entry config id :dash-configuration)]
    (. builder dashConfiguration data))
  (when-some [data (lookup-entry config id :hls-configuration)]
    (. builder hlsConfiguration data))
  (when-some [data (lookup-entry config id :live-pre-roll-configuration)]
    (. builder livePreRollConfiguration data))
  (when-some [data (lookup-entry config id :manifest-processing-rules)]
    (. builder manifestProcessingRules data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :personalization-threshold-seconds)]
    (. builder personalizationThresholdSeconds data))
  (when-some [data (lookup-entry config id :slate-ad-url)]
    (. builder slateAdUrl data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :transcode-profile-name)]
    (. builder transcodeProfileName data))
  (when-some [data (lookup-entry config id :video-content-source-url)]
    (. builder videoContentSourceUrl data))
  (.build builder))


(defn cfn-playback-configuration-props-builder
  "Creates a  `CfnPlaybackConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-playback-configuration-props-builder (new CfnPlaybackConfigurationProps$Builder) id config))


(defn build-cfn-source-location-access-configuration-property-builder
  "The build-cfn-source-location-access-configuration-property-builder function updates a CfnSourceLocation$AccessConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSourceLocation$AccessConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `secretsManagerAccessTokenConfiguration` | software.amazon.awscdk.services.mediatailor.CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty | [[cdk.support/lookup-entry]] | `:secrets-manager-access-token-configuration` |
"
  [^CfnSourceLocation$AccessConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-type)]
    (. builder accessType data))
  (when-some [data (lookup-entry config id :secrets-manager-access-token-configuration)]
    (. builder secretsManagerAccessTokenConfiguration data))
  (.build builder))


(defn cfn-source-location-access-configuration-property-builder
  "Creates a  `CfnSourceLocation$AccessConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-source-location-access-configuration-property-builder (new CfnSourceLocation$AccessConfigurationProperty$Builder) id config))


(defn build-cfn-source-location-builder
  "The build-cfn-source-location-builder function updates a CfnSourceLocation$Builder instance using the provided configuration.
  The function takes the CfnSourceLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-configuration` |
| `defaultSegmentDeliveryConfiguration` | software.amazon.awscdk.services.mediatailor.CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty | [[cdk.support/lookup-entry]] | `:default-segment-delivery-configuration` |
| `httpConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-configuration` |
| `segmentDeliveryConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:segment-delivery-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSourceLocation$Builder builder id config]
  (when-some [data (lookup-entry config id :access-configuration)]
    (. builder accessConfiguration data))
  (when-some [data (lookup-entry config id :default-segment-delivery-configuration)]
    (. builder defaultSegmentDeliveryConfiguration data))
  (when-some [data (lookup-entry config id :http-configuration)]
    (. builder httpConfiguration data))
  (when-some [data (lookup-entry config id :segment-delivery-configurations)]
    (. builder segmentDeliveryConfigurations data))
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-source-location-builder
  "Creates a  `CfnSourceLocation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-source-location-builder (CfnSourceLocation$Builder/create scope (name id)) id config))


(defn build-cfn-source-location-default-segment-delivery-configuration-property-builder
  "The build-cfn-source-location-default-segment-delivery-configuration-property-builder function updates a CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url` |
"
  [^CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-url)]
    (. builder baseUrl data))
  (.build builder))


(defn cfn-source-location-default-segment-delivery-configuration-property-builder
  "Creates a  `CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-source-location-default-segment-delivery-configuration-property-builder (new CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder) id config))


(defn build-cfn-source-location-http-configuration-property-builder
  "The build-cfn-source-location-http-configuration-property-builder function updates a CfnSourceLocation$HttpConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSourceLocation$HttpConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url` |
"
  [^CfnSourceLocation$HttpConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-url)]
    (. builder baseUrl data))
  (.build builder))


(defn cfn-source-location-http-configuration-property-builder
  "Creates a  `CfnSourceLocation$HttpConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-source-location-http-configuration-property-builder (new CfnSourceLocation$HttpConfigurationProperty$Builder) id config))


(defn build-cfn-source-location-props-builder
  "The build-cfn-source-location-props-builder function updates a CfnSourceLocationProps$Builder instance using the provided configuration.
  The function takes the CfnSourceLocationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessConfiguration` | software.amazon.awscdk.services.mediatailor.CfnSourceLocation$AccessConfigurationProperty | [[cdk.support/lookup-entry]] | `:access-configuration` |
| `defaultSegmentDeliveryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-segment-delivery-configuration` |
| `httpConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-configuration` |
| `segmentDeliveryConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:segment-delivery-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSourceLocationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-configuration)]
    (. builder accessConfiguration data))
  (when-some [data (lookup-entry config id :default-segment-delivery-configuration)]
    (. builder defaultSegmentDeliveryConfiguration data))
  (when-some [data (lookup-entry config id :http-configuration)]
    (. builder httpConfiguration data))
  (when-some [data (lookup-entry config id :segment-delivery-configurations)]
    (. builder segmentDeliveryConfigurations data))
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-source-location-props-builder
  "Creates a  `CfnSourceLocationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-source-location-props-builder (new CfnSourceLocationProps$Builder) id config))


(defn build-cfn-source-location-secrets-manager-access-token-configuration-property-builder
  "The build-cfn-source-location-secrets-manager-access-token-configuration-property-builder function updates a CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `secretStringKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string-key` |
"
  [^CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-some [data (lookup-entry config id :secret-string-key)]
    (. builder secretStringKey data))
  (.build builder))


(defn cfn-source-location-secrets-manager-access-token-configuration-property-builder
  "Creates a  `CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-source-location-secrets-manager-access-token-configuration-property-builder (new CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder) id config))


(defn build-cfn-source-location-segment-delivery-configuration-property-builder
  "The build-cfn-source-location-segment-delivery-configuration-property-builder function updates a CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-url)]
    (. builder baseUrl data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-source-location-segment-delivery-configuration-property-builder
  "Creates a  `CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-source-location-segment-delivery-configuration-property-builder (new CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder) id config))


(defn build-cfn-vod-source-builder
  "The build-cfn-vod-source-builder function updates a CfnVodSource$Builder instance using the provided configuration.
  The function takes the CfnVodSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vodSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vod-source-name` |
"
  [^CfnVodSource$Builder builder id config]
  (when-some [data (lookup-entry config id :http-package-configurations)]
    (. builder httpPackageConfigurations data))
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vod-source-name)]
    (. builder vodSourceName data))
  (.build builder))


(defn cfn-vod-source-builder
  "Creates a  `CfnVodSource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-vod-source-builder (CfnVodSource$Builder/create scope (name id)) id config))


(defn build-cfn-vod-source-http-package-configuration-property-builder
  "The build-cfn-vod-source-http-package-configuration-property-builder function updates a CfnVodSource$HttpPackageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVodSource$HttpPackageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sourceGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-group` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnVodSource$HttpPackageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :source-group)]
    (. builder sourceGroup data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-vod-source-http-package-configuration-property-builder
  "Creates a  `CfnVodSource$HttpPackageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-vod-source-http-package-configuration-property-builder (new CfnVodSource$HttpPackageConfigurationProperty$Builder) id config))


(defn build-cfn-vod-source-props-builder
  "The build-cfn-vod-source-props-builder function updates a CfnVodSourceProps$Builder instance using the provided configuration.
  The function takes the CfnVodSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vodSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vod-source-name` |
"
  [^CfnVodSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :http-package-configurations)]
    (. builder httpPackageConfigurations data))
  (when-some [data (lookup-entry config id :source-location-name)]
    (. builder sourceLocationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vod-source-name)]
    (. builder vodSourceName data))
  (.build builder))


(defn cfn-vod-source-props-builder
  "Creates a  `CfnVodSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-vod-source-props-builder (new CfnVodSourceProps$Builder) id config))