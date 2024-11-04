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


(defn cfn-channel-builder
  "The cfn-channel-builder function buildes out new instances of 
CfnChannel$Builder using the provided configuration.  Each field is set as follows:

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
| `timeShiftConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-shift-configuration` |"
  [stack id config]
  (let [builder (CfnChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :audiences)]
      (. builder audiences data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :filler-slate)]
      (. builder fillerSlate data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :playback-mode)]
      (. builder playbackMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (when-let [data (lookup-entry config id :time-shift-configuration)]
      (. builder timeShiftConfiguration data))
    (.build builder)))


(defn cfn-channel-dash-playlist-settings-property-builder
  "The cfn-channel-dash-playlist-settings-property-builder function buildes out new instances of 
CfnChannel$DashPlaylistSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `minBufferTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-buffer-time-seconds` |
| `minUpdatePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-update-period-seconds` |
| `suggestedPresentationDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:suggested-presentation-delay-seconds` |"
  [stack id config]
  (let [builder (CfnChannel$DashPlaylistSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :manifest-window-seconds)]
      (. builder manifestWindowSeconds data))
    (when-let [data (lookup-entry config id :min-buffer-time-seconds)]
      (. builder minBufferTimeSeconds data))
    (when-let [data (lookup-entry config id :min-update-period-seconds)]
      (. builder minUpdatePeriodSeconds data))
    (when-let [data (lookup-entry config id :suggested-presentation-delay-seconds)]
      (. builder suggestedPresentationDelaySeconds data))
    (.build builder)))


(defn cfn-channel-hls-playlist-settings-property-builder
  "The cfn-channel-hls-playlist-settings-property-builder function buildes out new instances of 
CfnChannel$HlsPlaylistSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkupType` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-markup-type` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |"
  [stack id config]
  (let [builder (CfnChannel$HlsPlaylistSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-markup-type)]
      (. builder adMarkupType data))
    (when-let [data (lookup-entry config id :manifest-window-seconds)]
      (. builder manifestWindowSeconds data))
    (.build builder)))


(defn cfn-channel-log-configuration-for-channel-property-builder
  "The cfn-channel-log-configuration-for-channel-property-builder function buildes out new instances of 
CfnChannel$LogConfigurationForChannelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:log-types` |"
  [stack id config]
  (let [builder (CfnChannel$LogConfigurationForChannelProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-types)]
      (. builder logTypes data))
    (.build builder)))


(defn cfn-channel-policy-builder
  "The cfn-channel-policy-builder function buildes out new instances of 
CfnChannelPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnChannelPolicy$Builder/create stack id)]
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
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnChannelPolicyProps$Builder.)]
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
| `audiences` | java.util.List | [[cdk.support/lookup-entry]] | `:audiences` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `fillerSlate` | software.amazon.awscdk.services.mediatailor.CfnChannel$SlateSourceProperty | [[cdk.support/lookup-entry]] | `:filler-slate` |
| `logConfiguration` | software.amazon.awscdk.services.mediatailor.CfnChannel$LogConfigurationForChannelProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `playbackMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:playback-mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
| `timeShiftConfiguration` | software.amazon.awscdk.services.mediatailor.CfnChannel$TimeShiftConfigurationProperty | [[cdk.support/lookup-entry]] | `:time-shift-configuration` |"
  [stack id config]
  (let [builder (CfnChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :audiences)]
      (. builder audiences data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :filler-slate)]
      (. builder fillerSlate data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :playback-mode)]
      (. builder playbackMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (when-let [data (lookup-entry config id :time-shift-configuration)]
      (. builder timeShiftConfiguration data))
    (.build builder)))


(defn cfn-channel-request-output-item-property-builder
  "The cfn-channel-request-output-item-property-builder function buildes out new instances of 
CfnChannel$RequestOutputItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashPlaylistSettings` | software.amazon.awscdk.services.mediatailor.CfnChannel$DashPlaylistSettingsProperty | [[cdk.support/lookup-entry]] | `:dash-playlist-settings` |
| `hlsPlaylistSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-playlist-settings` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `sourceGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-group` |"
  [stack id config]
  (let [builder (CfnChannel$RequestOutputItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :dash-playlist-settings)]
      (. builder dashPlaylistSettings data))
    (when-let [data (lookup-entry config id :hls-playlist-settings)]
      (. builder hlsPlaylistSettings data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :source-group)]
      (. builder sourceGroup data))
    (.build builder)))


(defn cfn-channel-slate-source-property-builder
  "The cfn-channel-slate-source-property-builder function buildes out new instances of 
CfnChannel$SlateSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `vodSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vod-source-name` |"
  [stack id config]
  (let [builder (CfnChannel$SlateSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :vod-source-name)]
      (. builder vodSourceName data))
    (.build builder)))


(defn cfn-channel-time-shift-configuration-property-builder
  "The cfn-channel-time-shift-configuration-property-builder function buildes out new instances of 
CfnChannel$TimeShiftConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxTimeDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-delay-seconds` |"
  [stack id config]
  (let [builder (CfnChannel$TimeShiftConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-time-delay-seconds)]
      (. builder maxTimeDelaySeconds data))
    (.build builder)))


(defn cfn-live-source-builder
  "The cfn-live-source-builder function buildes out new instances of 
CfnLiveSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `liveSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:live-source-name` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLiveSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :http-package-configurations)]
      (. builder httpPackageConfigurations data))
    (when-let [data (lookup-entry config id :live-source-name)]
      (. builder liveSourceName data))
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-live-source-http-package-configuration-property-builder
  "The cfn-live-source-http-package-configuration-property-builder function buildes out new instances of 
CfnLiveSource$HttpPackageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sourceGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-group` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLiveSource$HttpPackageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :source-group)]
      (. builder sourceGroup data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-live-source-props-builder
  "The cfn-live-source-props-builder function buildes out new instances of 
CfnLiveSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `liveSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:live-source-name` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLiveSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :http-package-configurations)]
      (. builder httpPackageConfigurations data))
    (when-let [data (lookup-entry config id :live-source-name)]
      (. builder liveSourceName data))
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-playback-configuration-ad-marker-passthrough-property-builder
  "The cfn-playback-configuration-ad-marker-passthrough-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$AdMarkerPassthroughProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-playback-configuration-avail-suppression-property-builder
  "The cfn-playback-configuration-avail-suppression-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$AvailSuppressionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fillPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:fill-policy` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$AvailSuppressionProperty$Builder.)]
    (when-let [data (lookup-entry config id :fill-policy)]
      (. builder fillPolicy data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-playback-configuration-builder
  "The cfn-playback-configuration-builder function buildes out new instances of 
CfnPlaybackConfiguration$Builder using the provided configuration.  Each field is set as follows:

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
| `videoContentSourceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-content-source-url` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ad-decision-server-url)]
      (. builder adDecisionServerUrl data))
    (when-let [data (lookup-entry config id :avail-suppression)]
      (. builder availSuppression data))
    (when-let [data (lookup-entry config id :bumper)]
      (. builder bumper data))
    (when-let [data (lookup-entry config id :cdn-configuration)]
      (. builder cdnConfiguration data))
    (when-let [data (lookup-entry config id :configuration-aliases)]
      (. builder configurationAliases data))
    (when-let [data (lookup-entry config id :dash-configuration)]
      (. builder dashConfiguration data))
    (when-let [data (lookup-entry config id :hls-configuration)]
      (. builder hlsConfiguration data))
    (when-let [data (lookup-entry config id :live-pre-roll-configuration)]
      (. builder livePreRollConfiguration data))
    (when-let [data (lookup-entry config id :manifest-processing-rules)]
      (. builder manifestProcessingRules data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :personalization-threshold-seconds)]
      (. builder personalizationThresholdSeconds data))
    (when-let [data (lookup-entry config id :slate-ad-url)]
      (. builder slateAdUrl data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transcode-profile-name)]
      (. builder transcodeProfileName data))
    (when-let [data (lookup-entry config id :video-content-source-url)]
      (. builder videoContentSourceUrl data))
    (.build builder)))


(defn cfn-playback-configuration-bumper-property-builder
  "The cfn-playback-configuration-bumper-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$BumperProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-url` |
| `startUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-url` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$BumperProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-url)]
      (. builder endUrl data))
    (when-let [data (lookup-entry config id :start-url)]
      (. builder startUrl data))
    (.build builder)))


(defn cfn-playback-configuration-cdn-configuration-property-builder
  "The cfn-playback-configuration-cdn-configuration-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$CdnConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adSegmentUrlPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-segment-url-prefix` |
| `contentSegmentUrlPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-segment-url-prefix` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$CdnConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-segment-url-prefix)]
      (. builder adSegmentUrlPrefix data))
    (when-let [data (lookup-entry config id :content-segment-url-prefix)]
      (. builder contentSegmentUrlPrefix data))
    (.build builder)))


(defn cfn-playback-configuration-dash-configuration-property-builder
  "The cfn-playback-configuration-dash-configuration-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$DashConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestEndpointPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-endpoint-prefix` |
| `mpdLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:mpd-location` |
| `originManifestType` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-manifest-type` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$DashConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :manifest-endpoint-prefix)]
      (. builder manifestEndpointPrefix data))
    (when-let [data (lookup-entry config id :mpd-location)]
      (. builder mpdLocation data))
    (when-let [data (lookup-entry config id :origin-manifest-type)]
      (. builder originManifestType data))
    (.build builder)))


(defn cfn-playback-configuration-hls-configuration-property-builder
  "The cfn-playback-configuration-hls-configuration-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$HlsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestEndpointPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-endpoint-prefix` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$HlsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :manifest-endpoint-prefix)]
      (. builder manifestEndpointPrefix data))
    (.build builder)))


(defn cfn-playback-configuration-live-pre-roll-configuration-property-builder
  "The cfn-playback-configuration-live-pre-roll-configuration-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDecisionServerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-decision-server-url` |
| `maxDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duration-seconds` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$LivePreRollConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-decision-server-url)]
      (. builder adDecisionServerUrl data))
    (when-let [data (lookup-entry config id :max-duration-seconds)]
      (. builder maxDurationSeconds data))
    (.build builder)))


(defn cfn-playback-configuration-manifest-processing-rules-property-builder
  "The cfn-playback-configuration-manifest-processing-rules-property-builder function buildes out new instances of 
CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkerPassthrough` | software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration$AdMarkerPassthroughProperty | [[cdk.support/lookup-entry]] | `:ad-marker-passthrough` |"
  [stack id config]
  (let [builder (CfnPlaybackConfiguration$ManifestProcessingRulesProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-marker-passthrough)]
      (. builder adMarkerPassthrough data))
    (.build builder)))


(defn cfn-playback-configuration-props-builder
  "The cfn-playback-configuration-props-builder function buildes out new instances of 
CfnPlaybackConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

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
| `videoContentSourceUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-content-source-url` |"
  [stack id config]
  (let [builder (CfnPlaybackConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :ad-decision-server-url)]
      (. builder adDecisionServerUrl data))
    (when-let [data (lookup-entry config id :avail-suppression)]
      (. builder availSuppression data))
    (when-let [data (lookup-entry config id :bumper)]
      (. builder bumper data))
    (when-let [data (lookup-entry config id :cdn-configuration)]
      (. builder cdnConfiguration data))
    (when-let [data (lookup-entry config id :configuration-aliases)]
      (. builder configurationAliases data))
    (when-let [data (lookup-entry config id :dash-configuration)]
      (. builder dashConfiguration data))
    (when-let [data (lookup-entry config id :hls-configuration)]
      (. builder hlsConfiguration data))
    (when-let [data (lookup-entry config id :live-pre-roll-configuration)]
      (. builder livePreRollConfiguration data))
    (when-let [data (lookup-entry config id :manifest-processing-rules)]
      (. builder manifestProcessingRules data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :personalization-threshold-seconds)]
      (. builder personalizationThresholdSeconds data))
    (when-let [data (lookup-entry config id :slate-ad-url)]
      (. builder slateAdUrl data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transcode-profile-name)]
      (. builder transcodeProfileName data))
    (when-let [data (lookup-entry config id :video-content-source-url)]
      (. builder videoContentSourceUrl data))
    (.build builder)))


(defn cfn-source-location-access-configuration-property-builder
  "The cfn-source-location-access-configuration-property-builder function buildes out new instances of 
CfnSourceLocation$AccessConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `secretsManagerAccessTokenConfiguration` | software.amazon.awscdk.services.mediatailor.CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty | [[cdk.support/lookup-entry]] | `:secrets-manager-access-token-configuration` |"
  [stack id config]
  (let [builder (CfnSourceLocation$AccessConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-type)]
      (. builder accessType data))
    (when-let [data (lookup-entry config id :secrets-manager-access-token-configuration)]
      (. builder secretsManagerAccessTokenConfiguration data))
    (.build builder)))


(defn cfn-source-location-builder
  "The cfn-source-location-builder function buildes out new instances of 
CfnSourceLocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-configuration` |
| `defaultSegmentDeliveryConfiguration` | software.amazon.awscdk.services.mediatailor.CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty | [[cdk.support/lookup-entry]] | `:default-segment-delivery-configuration` |
| `httpConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-configuration` |
| `segmentDeliveryConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:segment-delivery-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSourceLocation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-configuration)]
      (. builder accessConfiguration data))
    (when-let [data (lookup-entry config id :default-segment-delivery-configuration)]
      (. builder defaultSegmentDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :http-configuration)]
      (. builder httpConfiguration data))
    (when-let [data (lookup-entry config id :segment-delivery-configurations)]
      (. builder segmentDeliveryConfigurations data))
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-source-location-default-segment-delivery-configuration-property-builder
  "The cfn-source-location-default-segment-delivery-configuration-property-builder function buildes out new instances of 
CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url` |"
  [stack id config]
  (let [builder (CfnSourceLocation$DefaultSegmentDeliveryConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-url)]
      (. builder baseUrl data))
    (.build builder)))


(defn cfn-source-location-http-configuration-property-builder
  "The cfn-source-location-http-configuration-property-builder function buildes out new instances of 
CfnSourceLocation$HttpConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url` |"
  [stack id config]
  (let [builder (CfnSourceLocation$HttpConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-url)]
      (. builder baseUrl data))
    (.build builder)))


(defn cfn-source-location-props-builder
  "The cfn-source-location-props-builder function buildes out new instances of 
CfnSourceLocationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessConfiguration` | software.amazon.awscdk.services.mediatailor.CfnSourceLocation$AccessConfigurationProperty | [[cdk.support/lookup-entry]] | `:access-configuration` |
| `defaultSegmentDeliveryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-segment-delivery-configuration` |
| `httpConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-configuration` |
| `segmentDeliveryConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:segment-delivery-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSourceLocationProps$Builder.)]
    (when-let [data (lookup-entry config id :access-configuration)]
      (. builder accessConfiguration data))
    (when-let [data (lookup-entry config id :default-segment-delivery-configuration)]
      (. builder defaultSegmentDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :http-configuration)]
      (. builder httpConfiguration data))
    (when-let [data (lookup-entry config id :segment-delivery-configurations)]
      (. builder segmentDeliveryConfigurations data))
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-source-location-secrets-manager-access-token-configuration-property-builder
  "The cfn-source-location-secrets-manager-access-token-configuration-property-builder function buildes out new instances of 
CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `secretStringKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string-key` |"
  [stack id config]
  (let [builder (CfnSourceLocation$SecretsManagerAccessTokenConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (when-let [data (lookup-entry config id :secret-string-key)]
      (. builder secretStringKey data))
    (.build builder)))


(defn cfn-source-location-segment-delivery-configuration-property-builder
  "The cfn-source-location-segment-delivery-configuration-property-builder function buildes out new instances of 
CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSourceLocation$SegmentDeliveryConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-url)]
      (. builder baseUrl data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-vod-source-builder
  "The cfn-vod-source-builder function buildes out new instances of 
CfnVodSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vodSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vod-source-name` |"
  [stack id config]
  (let [builder (CfnVodSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :http-package-configurations)]
      (. builder httpPackageConfigurations data))
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vod-source-name)]
      (. builder vodSourceName data))
    (.build builder)))


(defn cfn-vod-source-http-package-configuration-property-builder
  "The cfn-vod-source-http-package-configuration-property-builder function buildes out new instances of 
CfnVodSource$HttpPackageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sourceGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-group` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnVodSource$HttpPackageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :source-group)]
      (. builder sourceGroup data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-vod-source-props-builder
  "The cfn-vod-source-props-builder function buildes out new instances of 
CfnVodSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPackageConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:http-package-configurations` |
| `sourceLocationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vodSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vod-source-name` |"
  [stack id config]
  (let [builder (CfnVodSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :http-package-configurations)]
      (. builder httpPackageConfigurations data))
    (when-let [data (lookup-entry config id :source-location-name)]
      (. builder sourceLocationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vod-source-name)]
      (. builder vodSourceName data))
    (.build builder)))