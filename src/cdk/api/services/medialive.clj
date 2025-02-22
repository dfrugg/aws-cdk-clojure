(ns cdk.api.services.medialive
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.medialive package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.medialive CfnChannel$AacSettingsProperty$Builder
                                                      CfnChannel$Ac3SettingsProperty$Builder
                                                      CfnChannel$AncillarySourceSettingsProperty$Builder
                                                      CfnChannel$ArchiveCdnSettingsProperty$Builder
                                                      CfnChannel$ArchiveContainerSettingsProperty$Builder
                                                      CfnChannel$ArchiveGroupSettingsProperty$Builder
                                                      CfnChannel$ArchiveOutputSettingsProperty$Builder
                                                      CfnChannel$ArchiveS3SettingsProperty$Builder
                                                      CfnChannel$AribDestinationSettingsProperty$Builder
                                                      CfnChannel$AribSourceSettingsProperty$Builder
                                                      CfnChannel$AudioChannelMappingProperty$Builder
                                                      CfnChannel$AudioCodecSettingsProperty$Builder
                                                      CfnChannel$AudioDescriptionProperty$Builder
                                                      CfnChannel$AudioDolbyEDecodeProperty$Builder
                                                      CfnChannel$AudioHlsRenditionSelectionProperty$Builder
                                                      CfnChannel$AudioLanguageSelectionProperty$Builder
                                                      CfnChannel$AudioNormalizationSettingsProperty$Builder
                                                      CfnChannel$AudioOnlyHlsSettingsProperty$Builder
                                                      CfnChannel$AudioPidSelectionProperty$Builder
                                                      CfnChannel$AudioSelectorProperty$Builder
                                                      CfnChannel$AudioSelectorSettingsProperty$Builder
                                                      CfnChannel$AudioSilenceFailoverSettingsProperty$Builder
                                                      CfnChannel$AudioTrackProperty$Builder
                                                      CfnChannel$AudioTrackSelectionProperty$Builder
                                                      CfnChannel$AudioWatermarkSettingsProperty$Builder
                                                      CfnChannel$AutomaticInputFailoverSettingsProperty$Builder
                                                      CfnChannel$AvailBlankingProperty$Builder
                                                      CfnChannel$AvailConfigurationProperty$Builder
                                                      CfnChannel$AvailSettingsProperty$Builder
                                                      CfnChannel$BlackoutSlateProperty$Builder
                                                      CfnChannel$Builder
                                                      CfnChannel$BurnInDestinationSettingsProperty$Builder
                                                      CfnChannel$CaptionDescriptionProperty$Builder
                                                      CfnChannel$CaptionDestinationSettingsProperty$Builder
                                                      CfnChannel$CaptionLanguageMappingProperty$Builder
                                                      CfnChannel$CaptionRectangleProperty$Builder
                                                      CfnChannel$CaptionSelectorProperty$Builder
                                                      CfnChannel$CaptionSelectorSettingsProperty$Builder
                                                      CfnChannel$CdiInputSpecificationProperty$Builder
                                                      CfnChannel$CmafIngestGroupSettingsProperty$Builder
                                                      CfnChannel$CmafIngestOutputSettingsProperty$Builder
                                                      CfnChannel$ColorCorrectionProperty$Builder
                                                      CfnChannel$ColorCorrectionSettingsProperty$Builder
                                                      CfnChannel$ColorSpacePassthroughSettingsProperty$Builder
                                                      CfnChannel$DolbyVision81SettingsProperty$Builder
                                                      CfnChannel$DvbNitSettingsProperty$Builder
                                                      CfnChannel$DvbSdtSettingsProperty$Builder
                                                      CfnChannel$DvbSubDestinationSettingsProperty$Builder
                                                      CfnChannel$DvbSubSourceSettingsProperty$Builder
                                                      CfnChannel$DvbTdtSettingsProperty$Builder
                                                      CfnChannel$Eac3AtmosSettingsProperty$Builder
                                                      CfnChannel$Eac3SettingsProperty$Builder
                                                      CfnChannel$EbuTtDDestinationSettingsProperty$Builder
                                                      CfnChannel$EmbeddedDestinationSettingsProperty$Builder
                                                      CfnChannel$EmbeddedPlusScte20DestinationSettingsProperty$Builder
                                                      CfnChannel$EmbeddedSourceSettingsProperty$Builder
                                                      CfnChannel$EncoderSettingsProperty$Builder
                                                      CfnChannel$EpochLockingSettingsProperty$Builder
                                                      CfnChannel$EsamProperty$Builder
                                                      CfnChannel$FailoverConditionProperty$Builder
                                                      CfnChannel$FailoverConditionSettingsProperty$Builder
                                                      CfnChannel$FeatureActivationsProperty$Builder
                                                      CfnChannel$FecOutputSettingsProperty$Builder
                                                      CfnChannel$Fmp4HlsSettingsProperty$Builder
                                                      CfnChannel$FrameCaptureCdnSettingsProperty$Builder
                                                      CfnChannel$FrameCaptureGroupSettingsProperty$Builder
                                                      CfnChannel$FrameCaptureHlsSettingsProperty$Builder
                                                      CfnChannel$FrameCaptureOutputSettingsProperty$Builder
                                                      CfnChannel$FrameCaptureS3SettingsProperty$Builder
                                                      CfnChannel$FrameCaptureSettingsProperty$Builder
                                                      CfnChannel$GlobalConfigurationProperty$Builder
                                                      CfnChannel$H264ColorSpaceSettingsProperty$Builder
                                                      CfnChannel$H264FilterSettingsProperty$Builder
                                                      CfnChannel$H264SettingsProperty$Builder
                                                      CfnChannel$H265ColorSpaceSettingsProperty$Builder
                                                      CfnChannel$H265FilterSettingsProperty$Builder
                                                      CfnChannel$H265SettingsProperty$Builder
                                                      CfnChannel$Hdr10SettingsProperty$Builder
                                                      CfnChannel$HlsAkamaiSettingsProperty$Builder
                                                      CfnChannel$HlsBasicPutSettingsProperty$Builder
                                                      CfnChannel$HlsCdnSettingsProperty$Builder
                                                      CfnChannel$HlsGroupSettingsProperty$Builder
                                                      CfnChannel$HlsInputSettingsProperty$Builder
                                                      CfnChannel$HlsMediaStoreSettingsProperty$Builder
                                                      CfnChannel$HlsOutputSettingsProperty$Builder
                                                      CfnChannel$HlsS3SettingsProperty$Builder
                                                      CfnChannel$HlsSettingsProperty$Builder
                                                      CfnChannel$HlsWebdavSettingsProperty$Builder
                                                      CfnChannel$HtmlMotionGraphicsSettingsProperty$Builder
                                                      CfnChannel$InputAttachmentProperty$Builder
                                                      CfnChannel$InputChannelLevelProperty$Builder
                                                      CfnChannel$InputLocationProperty$Builder
                                                      CfnChannel$InputLossBehaviorProperty$Builder
                                                      CfnChannel$InputLossFailoverSettingsProperty$Builder
                                                      CfnChannel$InputSettingsProperty$Builder
                                                      CfnChannel$InputSpecificationProperty$Builder
                                                      CfnChannel$KeyProviderSettingsProperty$Builder
                                                      CfnChannel$M2tsSettingsProperty$Builder
                                                      CfnChannel$M3u8SettingsProperty$Builder
                                                      CfnChannel$MaintenanceCreateSettingsProperty$Builder
                                                      CfnChannel$MaintenanceUpdateSettingsProperty$Builder
                                                      CfnChannel$MediaPackageGroupSettingsProperty$Builder
                                                      CfnChannel$MediaPackageOutputDestinationSettingsProperty$Builder
                                                      CfnChannel$MediaPackageOutputSettingsProperty$Builder
                                                      CfnChannel$MotionGraphicsConfigurationProperty$Builder
                                                      CfnChannel$MotionGraphicsSettingsProperty$Builder
                                                      CfnChannel$Mp2SettingsProperty$Builder
                                                      CfnChannel$Mpeg2FilterSettingsProperty$Builder
                                                      CfnChannel$Mpeg2SettingsProperty$Builder
                                                      CfnChannel$MsSmoothGroupSettingsProperty$Builder
                                                      CfnChannel$MsSmoothOutputSettingsProperty$Builder
                                                      CfnChannel$MultiplexGroupSettingsProperty$Builder
                                                      CfnChannel$MultiplexOutputSettingsProperty$Builder
                                                      CfnChannel$MultiplexProgramChannelDestinationSettingsProperty$Builder
                                                      CfnChannel$NetworkInputSettingsProperty$Builder
                                                      CfnChannel$NielsenCBETProperty$Builder
                                                      CfnChannel$NielsenConfigurationProperty$Builder
                                                      CfnChannel$NielsenNaesIiNwProperty$Builder
                                                      CfnChannel$NielsenWatermarksSettingsProperty$Builder
                                                      CfnChannel$OutputDestinationProperty$Builder
                                                      CfnChannel$OutputDestinationSettingsProperty$Builder
                                                      CfnChannel$OutputGroupProperty$Builder
                                                      CfnChannel$OutputGroupSettingsProperty$Builder
                                                      CfnChannel$OutputLocationRefProperty$Builder
                                                      CfnChannel$OutputLockingSettingsProperty$Builder
                                                      CfnChannel$OutputProperty$Builder
                                                      CfnChannel$OutputSettingsProperty$Builder
                                                      CfnChannel$PassThroughSettingsProperty$Builder
                                                      CfnChannel$RawSettingsProperty$Builder
                                                      CfnChannel$Rec601SettingsProperty$Builder
                                                      CfnChannel$Rec709SettingsProperty$Builder
                                                      CfnChannel$RemixSettingsProperty$Builder
                                                      CfnChannel$RtmpCaptionInfoDestinationSettingsProperty$Builder
                                                      CfnChannel$RtmpGroupSettingsProperty$Builder
                                                      CfnChannel$RtmpOutputSettingsProperty$Builder
                                                      CfnChannel$Scte20PlusEmbeddedDestinationSettingsProperty$Builder
                                                      CfnChannel$Scte20SourceSettingsProperty$Builder
                                                      CfnChannel$Scte27DestinationSettingsProperty$Builder
                                                      CfnChannel$Scte27SourceSettingsProperty$Builder
                                                      CfnChannel$Scte35SpliceInsertProperty$Builder
                                                      CfnChannel$Scte35TimeSignalAposProperty$Builder
                                                      CfnChannel$SmpteTtDestinationSettingsProperty$Builder
                                                      CfnChannel$StandardHlsSettingsProperty$Builder
                                                      CfnChannel$StaticKeySettingsProperty$Builder
                                                      CfnChannel$TeletextDestinationSettingsProperty$Builder
                                                      CfnChannel$TeletextSourceSettingsProperty$Builder
                                                      CfnChannel$TemporalFilterSettingsProperty$Builder
                                                      CfnChannel$ThumbnailConfigurationProperty$Builder
                                                      CfnChannel$TimecodeBurninSettingsProperty$Builder
                                                      CfnChannel$TimecodeConfigProperty$Builder
                                                      CfnChannel$TtmlDestinationSettingsProperty$Builder
                                                      CfnChannel$UdpContainerSettingsProperty$Builder
                                                      CfnChannel$UdpGroupSettingsProperty$Builder
                                                      CfnChannel$UdpOutputSettingsProperty$Builder
                                                      CfnChannel$VideoBlackFailoverSettingsProperty$Builder
                                                      CfnChannel$VideoCodecSettingsProperty$Builder
                                                      CfnChannel$VideoDescriptionProperty$Builder
                                                      CfnChannel$VideoSelectorColorSpaceSettingsProperty$Builder
                                                      CfnChannel$VideoSelectorPidProperty$Builder
                                                      CfnChannel$VideoSelectorProgramIdProperty$Builder
                                                      CfnChannel$VideoSelectorProperty$Builder
                                                      CfnChannel$VideoSelectorSettingsProperty$Builder
                                                      CfnChannel$VpcOutputSettingsProperty$Builder
                                                      CfnChannel$WavSettingsProperty$Builder
                                                      CfnChannel$WebvttDestinationSettingsProperty$Builder
                                                      CfnChannelProps$Builder
                                                      CfnInput$Builder
                                                      CfnInput$InputDestinationRequestProperty$Builder
                                                      CfnInput$InputDeviceRequestProperty$Builder
                                                      CfnInput$InputDeviceSettingsProperty$Builder
                                                      CfnInput$InputSourceRequestProperty$Builder
                                                      CfnInput$InputVpcRequestProperty$Builder
                                                      CfnInput$MediaConnectFlowRequestProperty$Builder
                                                      CfnInputProps$Builder
                                                      CfnInputSecurityGroup$Builder
                                                      CfnInputSecurityGroup$InputWhitelistRuleCidrProperty$Builder
                                                      CfnInputSecurityGroupProps$Builder
                                                      CfnMultiplex$Builder
                                                      CfnMultiplex$MultiplexMediaConnectOutputDestinationSettingsProperty$Builder
                                                      CfnMultiplex$MultiplexOutputDestinationProperty$Builder
                                                      CfnMultiplex$MultiplexSettingsProperty$Builder
                                                      CfnMultiplexProps$Builder
                                                      CfnMultiplexprogram$Builder
                                                      CfnMultiplexprogram$MultiplexProgramPacketIdentifiersMapProperty$Builder
                                                      CfnMultiplexprogram$MultiplexProgramPipelineDetailProperty$Builder
                                                      CfnMultiplexprogram$MultiplexProgramServiceDescriptorProperty$Builder
                                                      CfnMultiplexprogram$MultiplexProgramSettingsProperty$Builder
                                                      CfnMultiplexprogram$MultiplexStatmuxVideoSettingsProperty$Builder
                                                      CfnMultiplexprogram$MultiplexVideoSettingsProperty$Builder
                                                      CfnMultiplexprogramProps$Builder]))


(defn build-cfn-channel-aac-settings-property-builder
  "The build-cfn-channel-aac-settings-property-builder function updates a CfnChannel$AacSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AacSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `codingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:coding-mode` |
| `inputType` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-type` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `rateControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rate-control-mode` |
| `rawFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:raw-format` |
| `sampleRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sample-rate` |
| `spec` | java.lang.String | [[cdk.support/lookup-entry]] | `:spec` |
| `vbrQuality` | java.lang.String | [[cdk.support/lookup-entry]] | `:vbr-quality` |
"
  [^CfnChannel$AacSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :coding-mode)]
    (. builder codingMode data))
  (when-let [data (lookup-entry config id :input-type)]
    (. builder inputType data))
  (when-let [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-let [data (lookup-entry config id :rate-control-mode)]
    (. builder rateControlMode data))
  (when-let [data (lookup-entry config id :raw-format)]
    (. builder rawFormat data))
  (when-let [data (lookup-entry config id :sample-rate)]
    (. builder sampleRate data))
  (when-let [data (lookup-entry config id :spec)]
    (. builder spec data))
  (when-let [data (lookup-entry config id :vbr-quality)]
    (. builder vbrQuality data))
  (.build builder))


(defn build-cfn-channel-ac3-settings-property-builder
  "The build-cfn-channel-ac3-settings-property-builder function updates a CfnChannel$Ac3SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Ac3SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attenuationControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:attenuation-control` |
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `bitstreamMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:bitstream-mode` |
| `codingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:coding-mode` |
| `dialnorm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialnorm` |
| `drcProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:drc-profile` |
| `lfeFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:lfe-filter` |
| `metadataControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-control` |
"
  [^CfnChannel$Ac3SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attenuation-control)]
    (. builder attenuationControl data))
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :bitstream-mode)]
    (. builder bitstreamMode data))
  (when-let [data (lookup-entry config id :coding-mode)]
    (. builder codingMode data))
  (when-let [data (lookup-entry config id :dialnorm)]
    (. builder dialnorm data))
  (when-let [data (lookup-entry config id :drc-profile)]
    (. builder drcProfile data))
  (when-let [data (lookup-entry config id :lfe-filter)]
    (. builder lfeFilter data))
  (when-let [data (lookup-entry config id :metadata-control)]
    (. builder metadataControl data))
  (.build builder))


(defn build-cfn-channel-ancillary-source-settings-property-builder
  "The build-cfn-channel-ancillary-source-settings-property-builder function updates a CfnChannel$AncillarySourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AncillarySourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceAncillaryChannelNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source-ancillary-channel-number` |
"
  [^CfnChannel$AncillarySourceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source-ancillary-channel-number)]
    (. builder sourceAncillaryChannelNumber data))
  (.build builder))


(defn build-cfn-channel-archive-cdn-settings-property-builder
  "The build-cfn-channel-archive-cdn-settings-property-builder function updates a CfnChannel$ArchiveCdnSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ArchiveCdnSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveS3Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:archive-s3-settings` |
"
  [^CfnChannel$ArchiveCdnSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-s3-settings)]
    (. builder archiveS3Settings data))
  (.build builder))


(defn build-cfn-channel-archive-container-settings-property-builder
  "The build-cfn-channel-archive-container-settings-property-builder function updates a CfnChannel$ArchiveContainerSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ArchiveContainerSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `m2TsSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:m2-ts-settings` |
| `rawSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:raw-settings` |
"
  [^CfnChannel$ArchiveContainerSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :m2-ts-settings)]
    (. builder m2TsSettings data))
  (when-let [data (lookup-entry config id :raw-settings)]
    (. builder rawSettings data))
  (.build builder))


(defn build-cfn-channel-archive-group-settings-property-builder
  "The build-cfn-channel-archive-group-settings-property-builder function updates a CfnChannel$ArchiveGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ArchiveGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveCdnSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:archive-cdn-settings` |
| `destination` | software.amazon.awscdk.services.medialive.CfnChannel$OutputLocationRefProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `rolloverInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rollover-interval` |
"
  [^CfnChannel$ArchiveGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-cdn-settings)]
    (. builder archiveCdnSettings data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :rollover-interval)]
    (. builder rolloverInterval data))
  (.build builder))


(defn build-cfn-channel-archive-output-settings-property-builder
  "The build-cfn-channel-archive-output-settings-property-builder function updates a CfnChannel$ArchiveOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ArchiveOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-settings` |
| `extension` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension` |
| `nameModifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-modifier` |
"
  [^CfnChannel$ArchiveOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-settings)]
    (. builder containerSettings data))
  (when-let [data (lookup-entry config id :extension)]
    (. builder extension data))
  (when-let [data (lookup-entry config id :name-modifier)]
    (. builder nameModifier data))
  (.build builder))


(defn build-cfn-channel-archive-s3-settings-property-builder
  "The build-cfn-channel-archive-s3-settings-property-builder function updates a CfnChannel$ArchiveS3SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ArchiveS3SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cannedAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:canned-acl` |
"
  [^CfnChannel$ArchiveS3SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :canned-acl)]
    (. builder cannedAcl data))
  (.build builder))


(defn build-cfn-channel-arib-destination-settings-property-builder
  "The build-cfn-channel-arib-destination-settings-property-builder function updates a CfnChannel$AribDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AribDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$AribDestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-arib-source-settings-property-builder
  "The build-cfn-channel-arib-source-settings-property-builder function updates a CfnChannel$AribSourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AribSourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$AribSourceSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-audio-channel-mapping-property-builder
  "The build-cfn-channel-audio-channel-mapping-property-builder function updates a CfnChannel$AudioChannelMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioChannelMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputChannelLevels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-channel-levels` |
| `outputChannel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:output-channel` |
"
  [^CfnChannel$AudioChannelMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-channel-levels)]
    (. builder inputChannelLevels data))
  (when-let [data (lookup-entry config id :output-channel)]
    (. builder outputChannel data))
  (.build builder))


(defn build-cfn-channel-audio-codec-settings-property-builder
  "The build-cfn-channel-audio-codec-settings-property-builder function updates a CfnChannel$AudioCodecSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioCodecSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aacSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aac-settings` |
| `ac3Settings` | software.amazon.awscdk.services.medialive.CfnChannel$Ac3SettingsProperty | [[cdk.support/lookup-entry]] | `:ac3-settings` |
| `eac3AtmosSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eac3-atmos-settings` |
| `eac3Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eac3-settings` |
| `mp2Settings` | software.amazon.awscdk.services.medialive.CfnChannel$Mp2SettingsProperty | [[cdk.support/lookup-entry]] | `:mp2-settings` |
| `passThroughSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pass-through-settings` |
| `wavSettings` | software.amazon.awscdk.services.medialive.CfnChannel$WavSettingsProperty | [[cdk.support/lookup-entry]] | `:wav-settings` |
"
  [^CfnChannel$AudioCodecSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aac-settings)]
    (. builder aacSettings data))
  (when-let [data (lookup-entry config id :ac3-settings)]
    (. builder ac3Settings data))
  (when-let [data (lookup-entry config id :eac3-atmos-settings)]
    (. builder eac3AtmosSettings data))
  (when-let [data (lookup-entry config id :eac3-settings)]
    (. builder eac3Settings data))
  (when-let [data (lookup-entry config id :mp2-settings)]
    (. builder mp2Settings data))
  (when-let [data (lookup-entry config id :pass-through-settings)]
    (. builder passThroughSettings data))
  (when-let [data (lookup-entry config id :wav-settings)]
    (. builder wavSettings data))
  (.build builder))


(defn build-cfn-channel-audio-description-property-builder
  "The build-cfn-channel-audio-description-property-builder function updates a CfnChannel$AudioDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioDashRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:audio-dash-roles` |
| `audioNormalizationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-normalization-settings` |
| `audioSelectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-selector-name` |
| `audioType` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-type` |
| `audioTypeControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-type-control` |
| `audioWatermarkingSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-watermarking-settings` |
| `codecSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:codec-settings` |
| `dvbDashAccessibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:dvb-dash-accessibility` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `languageCodeControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code-control` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `remixSettings` | software.amazon.awscdk.services.medialive.CfnChannel$RemixSettingsProperty | [[cdk.support/lookup-entry]] | `:remix-settings` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^CfnChannel$AudioDescriptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-dash-roles)]
    (. builder audioDashRoles data))
  (when-let [data (lookup-entry config id :audio-normalization-settings)]
    (. builder audioNormalizationSettings data))
  (when-let [data (lookup-entry config id :audio-selector-name)]
    (. builder audioSelectorName data))
  (when-let [data (lookup-entry config id :audio-type)]
    (. builder audioType data))
  (when-let [data (lookup-entry config id :audio-type-control)]
    (. builder audioTypeControl data))
  (when-let [data (lookup-entry config id :audio-watermarking-settings)]
    (. builder audioWatermarkingSettings data))
  (when-let [data (lookup-entry config id :codec-settings)]
    (. builder codecSettings data))
  (when-let [data (lookup-entry config id :dvb-dash-accessibility)]
    (. builder dvbDashAccessibility data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :language-code-control)]
    (. builder languageCodeControl data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :remix-settings)]
    (. builder remixSettings data))
  (when-let [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn build-cfn-channel-audio-dolby-e-decode-property-builder
  "The build-cfn-channel-audio-dolby-e-decode-property-builder function updates a CfnChannel$AudioDolbyEDecodeProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioDolbyEDecodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `programSelection` | java.lang.String | [[cdk.support/lookup-entry]] | `:program-selection` |
"
  [^CfnChannel$AudioDolbyEDecodeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :program-selection)]
    (. builder programSelection data))
  (.build builder))


(defn build-cfn-channel-audio-hls-rendition-selection-property-builder
  "The build-cfn-channel-audio-hls-rendition-selection-property-builder function updates a CfnChannel$AudioHlsRenditionSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioHlsRenditionSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnChannel$AudioHlsRenditionSelectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-channel-audio-language-selection-property-builder
  "The build-cfn-channel-audio-language-selection-property-builder function updates a CfnChannel$AudioLanguageSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioLanguageSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `languageSelectionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-selection-policy` |
"
  [^CfnChannel$AudioLanguageSelectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :language-selection-policy)]
    (. builder languageSelectionPolicy data))
  (.build builder))


(defn build-cfn-channel-audio-normalization-settings-property-builder
  "The build-cfn-channel-audio-normalization-settings-property-builder function updates a CfnChannel$AudioNormalizationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioNormalizationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `algorithmControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-control` |
| `targetLkfs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-lkfs` |
"
  [^CfnChannel$AudioNormalizationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-let [data (lookup-entry config id :algorithm-control)]
    (. builder algorithmControl data))
  (when-let [data (lookup-entry config id :target-lkfs)]
    (. builder targetLkfs data))
  (.build builder))


(defn build-cfn-channel-audio-only-hls-settings-property-builder
  "The build-cfn-channel-audio-only-hls-settings-property-builder function updates a CfnChannel$AudioOnlyHlsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioOnlyHlsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-group-id` |
| `audioOnlyImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-only-image` |
| `audioTrackType` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-track-type` |
| `segmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-type` |
"
  [^CfnChannel$AudioOnlyHlsSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-group-id)]
    (. builder audioGroupId data))
  (when-let [data (lookup-entry config id :audio-only-image)]
    (. builder audioOnlyImage data))
  (when-let [data (lookup-entry config id :audio-track-type)]
    (. builder audioTrackType data))
  (when-let [data (lookup-entry config id :segment-type)]
    (. builder segmentType data))
  (.build builder))


(defn build-cfn-channel-audio-pid-selection-property-builder
  "The build-cfn-channel-audio-pid-selection-property-builder function updates a CfnChannel$AudioPidSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioPidSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pid` |
"
  [^CfnChannel$AudioPidSelectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pid)]
    (. builder pid data))
  (.build builder))


(defn build-cfn-channel-audio-selector-property-builder
  "The build-cfn-channel-audio-selector-property-builder function updates a CfnChannel$AudioSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `selectorSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:selector-settings` |
"
  [^CfnChannel$AudioSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :selector-settings)]
    (. builder selectorSettings data))
  (.build builder))


(defn build-cfn-channel-audio-selector-settings-property-builder
  "The build-cfn-channel-audio-selector-settings-property-builder function updates a CfnChannel$AudioSelectorSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioSelectorSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioHlsRenditionSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-hls-rendition-selection` |
| `audioLanguageSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-language-selection` |
| `audioPidSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-pid-selection` |
| `audioTrackSelection` | software.amazon.awscdk.services.medialive.CfnChannel$AudioTrackSelectionProperty | [[cdk.support/lookup-entry]] | `:audio-track-selection` |
"
  [^CfnChannel$AudioSelectorSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-hls-rendition-selection)]
    (. builder audioHlsRenditionSelection data))
  (when-let [data (lookup-entry config id :audio-language-selection)]
    (. builder audioLanguageSelection data))
  (when-let [data (lookup-entry config id :audio-pid-selection)]
    (. builder audioPidSelection data))
  (when-let [data (lookup-entry config id :audio-track-selection)]
    (. builder audioTrackSelection data))
  (.build builder))


(defn build-cfn-channel-audio-silence-failover-settings-property-builder
  "The build-cfn-channel-audio-silence-failover-settings-property-builder function updates a CfnChannel$AudioSilenceFailoverSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioSilenceFailoverSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioSelectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-selector-name` |
| `audioSilenceThresholdMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:audio-silence-threshold-msec` |
"
  [^CfnChannel$AudioSilenceFailoverSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-selector-name)]
    (. builder audioSelectorName data))
  (when-let [data (lookup-entry config id :audio-silence-threshold-msec)]
    (. builder audioSilenceThresholdMsec data))
  (.build builder))


(defn build-cfn-channel-audio-track-property-builder
  "The build-cfn-channel-audio-track-property-builder function updates a CfnChannel$AudioTrackProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioTrackProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `track` | java.lang.Number | [[cdk.support/lookup-entry]] | `:track` |
"
  [^CfnChannel$AudioTrackProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :track)]
    (. builder track data))
  (.build builder))


(defn build-cfn-channel-audio-track-selection-property-builder
  "The build-cfn-channel-audio-track-selection-property-builder function updates a CfnChannel$AudioTrackSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioTrackSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dolbyEDecode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dolby-e-decode` |
| `tracks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tracks` |
"
  [^CfnChannel$AudioTrackSelectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dolby-e-decode)]
    (. builder dolbyEDecode data))
  (when-let [data (lookup-entry config id :tracks)]
    (. builder tracks data))
  (.build builder))


(defn build-cfn-channel-audio-watermark-settings-property-builder
  "The build-cfn-channel-audio-watermark-settings-property-builder function updates a CfnChannel$AudioWatermarkSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AudioWatermarkSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nielsenWatermarksSettings` | software.amazon.awscdk.services.medialive.CfnChannel$NielsenWatermarksSettingsProperty | [[cdk.support/lookup-entry]] | `:nielsen-watermarks-settings` |
"
  [^CfnChannel$AudioWatermarkSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :nielsen-watermarks-settings)]
    (. builder nielsenWatermarksSettings data))
  (.build builder))


(defn build-cfn-channel-automatic-input-failover-settings-property-builder
  "The build-cfn-channel-automatic-input-failover-settings-property-builder function updates a CfnChannel$AutomaticInputFailoverSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AutomaticInputFailoverSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorClearTimeMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-clear-time-msec` |
| `failoverConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failover-conditions` |
| `inputPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-preference` |
| `secondaryInputId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secondary-input-id` |
"
  [^CfnChannel$AutomaticInputFailoverSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :error-clear-time-msec)]
    (. builder errorClearTimeMsec data))
  (when-let [data (lookup-entry config id :failover-conditions)]
    (. builder failoverConditions data))
  (when-let [data (lookup-entry config id :input-preference)]
    (. builder inputPreference data))
  (when-let [data (lookup-entry config id :secondary-input-id)]
    (. builder secondaryInputId data))
  (.build builder))


(defn build-cfn-channel-avail-blanking-property-builder
  "The build-cfn-channel-avail-blanking-property-builder function updates a CfnChannel$AvailBlankingProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AvailBlankingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availBlankingImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:avail-blanking-image` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnChannel$AvailBlankingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :avail-blanking-image)]
    (. builder availBlankingImage data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn build-cfn-channel-avail-configuration-property-builder
  "The build-cfn-channel-avail-configuration-property-builder function updates a CfnChannel$AvailConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AvailConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availSettings` | software.amazon.awscdk.services.medialive.CfnChannel$AvailSettingsProperty | [[cdk.support/lookup-entry]] | `:avail-settings` |
| `scte35SegmentationScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-segmentation-scope` |
"
  [^CfnChannel$AvailConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :avail-settings)]
    (. builder availSettings data))
  (when-let [data (lookup-entry config id :scte35-segmentation-scope)]
    (. builder scte35SegmentationScope data))
  (.build builder))


(defn build-cfn-channel-avail-settings-property-builder
  "The build-cfn-channel-avail-settings-property-builder function updates a CfnChannel$AvailSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$AvailSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `esam` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:esam` |
| `scte35SpliceInsert` | software.amazon.awscdk.services.medialive.CfnChannel$Scte35SpliceInsertProperty | [[cdk.support/lookup-entry]] | `:scte35-splice-insert` |
| `scte35TimeSignalApos` | software.amazon.awscdk.services.medialive.CfnChannel$Scte35TimeSignalAposProperty | [[cdk.support/lookup-entry]] | `:scte35-time-signal-apos` |
"
  [^CfnChannel$AvailSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :esam)]
    (. builder esam data))
  (when-let [data (lookup-entry config id :scte35-splice-insert)]
    (. builder scte35SpliceInsert data))
  (when-let [data (lookup-entry config id :scte35-time-signal-apos)]
    (. builder scte35TimeSignalApos data))
  (.build builder))


(defn build-cfn-channel-blackout-slate-property-builder
  "The build-cfn-channel-blackout-slate-property-builder function updates a CfnChannel$BlackoutSlateProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$BlackoutSlateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blackoutSlateImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blackout-slate-image` |
| `networkEndBlackout` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-end-blackout` |
| `networkEndBlackoutImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-end-blackout-image` |
| `networkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-id` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnChannel$BlackoutSlateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :blackout-slate-image)]
    (. builder blackoutSlateImage data))
  (when-let [data (lookup-entry config id :network-end-blackout)]
    (. builder networkEndBlackout data))
  (when-let [data (lookup-entry config id :network-end-blackout-image)]
    (. builder networkEndBlackoutImage data))
  (when-let [data (lookup-entry config id :network-id)]
    (. builder networkId data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn build-cfn-channel-builder
  "The build-cfn-channel-builder function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdiInputSpecification` | software.amazon.awscdk.services.medialive.CfnChannel$CdiInputSpecificationProperty | [[cdk.support/lookup-entry]] | `:cdi-input-specification` |
| `channelClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-class` |
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `encoderSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encoder-settings` |
| `inputAttachments` | java.util.List | [[cdk.support/lookup-entry]] | `:input-attachments` |
| `inputSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-specification` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `maintenance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | software.amazon.awscdk.services.medialive.CfnChannel$VpcOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :cdi-input-specification)]
    (. builder cdiInputSpecification data))
  (when-let [data (lookup-entry config id :channel-class)]
    (. builder channelClass data))
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :encoder-settings)]
    (. builder encoderSettings data))
  (when-let [data (lookup-entry config id :input-attachments)]
    (. builder inputAttachments data))
  (when-let [data (lookup-entry config id :input-specification)]
    (. builder inputSpecification data))
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :maintenance)]
    (. builder maintenance data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn build-cfn-channel-burn-in-destination-settings-property-builder
  "The build-cfn-channel-burn-in-destination-settings-property-builder function updates a CfnChannel$BurnInDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$BurnInDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `backgroundOpacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:background-opacity` |
| `font` | software.amazon.awscdk.services.medialive.CfnChannel$InputLocationProperty | [[cdk.support/lookup-entry]] | `:font` |
| `fontColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:font-color` |
| `fontOpacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:font-opacity` |
| `fontResolution` | java.lang.Number | [[cdk.support/lookup-entry]] | `:font-resolution` |
| `fontSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:font-size` |
| `outlineColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:outline-color` |
| `outlineSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:outline-size` |
| `shadowColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:shadow-color` |
| `shadowOpacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shadow-opacity` |
| `shadowXOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shadow-x-offset` |
| `shadowYOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shadow-y-offset` |
| `teletextGridControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:teletext-grid-control` |
| `xPosition` | java.lang.Number | [[cdk.support/lookup-entry]] | `:x-position` |
| `yPosition` | java.lang.Number | [[cdk.support/lookup-entry]] | `:y-position` |
"
  [^CfnChannel$BurnInDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alignment)]
    (. builder alignment data))
  (when-let [data (lookup-entry config id :background-color)]
    (. builder backgroundColor data))
  (when-let [data (lookup-entry config id :background-opacity)]
    (. builder backgroundOpacity data))
  (when-let [data (lookup-entry config id :font)]
    (. builder font data))
  (when-let [data (lookup-entry config id :font-color)]
    (. builder fontColor data))
  (when-let [data (lookup-entry config id :font-opacity)]
    (. builder fontOpacity data))
  (when-let [data (lookup-entry config id :font-resolution)]
    (. builder fontResolution data))
  (when-let [data (lookup-entry config id :font-size)]
    (. builder fontSize data))
  (when-let [data (lookup-entry config id :outline-color)]
    (. builder outlineColor data))
  (when-let [data (lookup-entry config id :outline-size)]
    (. builder outlineSize data))
  (when-let [data (lookup-entry config id :shadow-color)]
    (. builder shadowColor data))
  (when-let [data (lookup-entry config id :shadow-opacity)]
    (. builder shadowOpacity data))
  (when-let [data (lookup-entry config id :shadow-x-offset)]
    (. builder shadowXOffset data))
  (when-let [data (lookup-entry config id :shadow-y-offset)]
    (. builder shadowYOffset data))
  (when-let [data (lookup-entry config id :teletext-grid-control)]
    (. builder teletextGridControl data))
  (when-let [data (lookup-entry config id :x-position)]
    (. builder xPosition data))
  (when-let [data (lookup-entry config id :y-position)]
    (. builder yPosition data))
  (.build builder))


(defn build-cfn-channel-caption-description-property-builder
  "The build-cfn-channel-caption-description-property-builder function updates a CfnChannel$CaptionDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CaptionDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:accessibility` |
| `captionDashRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:caption-dash-roles` |
| `captionSelectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:caption-selector-name` |
| `destinationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-settings` |
| `dvbDashAccessibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:dvb-dash-accessibility` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `languageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnChannel$CaptionDescriptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :accessibility)]
    (. builder accessibility data))
  (when-let [data (lookup-entry config id :caption-dash-roles)]
    (. builder captionDashRoles data))
  (when-let [data (lookup-entry config id :caption-selector-name)]
    (. builder captionSelectorName data))
  (when-let [data (lookup-entry config id :destination-settings)]
    (. builder destinationSettings data))
  (when-let [data (lookup-entry config id :dvb-dash-accessibility)]
    (. builder dvbDashAccessibility data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :language-description)]
    (. builder languageDescription data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-channel-caption-destination-settings-property-builder
  "The build-cfn-channel-caption-destination-settings-property-builder function updates a CfnChannel$CaptionDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CaptionDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aribDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$AribDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:arib-destination-settings` |
| `burnInDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$BurnInDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:burn-in-destination-settings` |
| `dvbSubDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$DvbSubDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:dvb-sub-destination-settings` |
| `ebuTtDDestinationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebu-tt-d-destination-settings` |
| `embeddedDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$EmbeddedDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:embedded-destination-settings` |
| `embeddedPlusScte20DestinationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:embedded-plus-scte20-destination-settings` |
| `rtmpCaptionInfoDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$RtmpCaptionInfoDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:rtmp-caption-info-destination-settings` |
| `scte20PlusEmbeddedDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$Scte20PlusEmbeddedDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:scte20-plus-embedded-destination-settings` |
| `scte27DestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$Scte27DestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:scte27-destination-settings` |
| `smpteTtDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$SmpteTtDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:smpte-tt-destination-settings` |
| `teletextDestinationSettings` | software.amazon.awscdk.services.medialive.CfnChannel$TeletextDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:teletext-destination-settings` |
| `ttmlDestinationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ttml-destination-settings` |
| `webvttDestinationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:webvtt-destination-settings` |
"
  [^CfnChannel$CaptionDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arib-destination-settings)]
    (. builder aribDestinationSettings data))
  (when-let [data (lookup-entry config id :burn-in-destination-settings)]
    (. builder burnInDestinationSettings data))
  (when-let [data (lookup-entry config id :dvb-sub-destination-settings)]
    (. builder dvbSubDestinationSettings data))
  (when-let [data (lookup-entry config id :ebu-tt-d-destination-settings)]
    (. builder ebuTtDDestinationSettings data))
  (when-let [data (lookup-entry config id :embedded-destination-settings)]
    (. builder embeddedDestinationSettings data))
  (when-let [data (lookup-entry config id :embedded-plus-scte20-destination-settings)]
    (. builder embeddedPlusScte20DestinationSettings data))
  (when-let [data (lookup-entry config id :rtmp-caption-info-destination-settings)]
    (. builder rtmpCaptionInfoDestinationSettings data))
  (when-let [data (lookup-entry config id :scte20-plus-embedded-destination-settings)]
    (. builder scte20PlusEmbeddedDestinationSettings data))
  (when-let [data (lookup-entry config id :scte27-destination-settings)]
    (. builder scte27DestinationSettings data))
  (when-let [data (lookup-entry config id :smpte-tt-destination-settings)]
    (. builder smpteTtDestinationSettings data))
  (when-let [data (lookup-entry config id :teletext-destination-settings)]
    (. builder teletextDestinationSettings data))
  (when-let [data (lookup-entry config id :ttml-destination-settings)]
    (. builder ttmlDestinationSettings data))
  (when-let [data (lookup-entry config id :webvtt-destination-settings)]
    (. builder webvttDestinationSettings data))
  (.build builder))


(defn build-cfn-channel-caption-language-mapping-property-builder
  "The build-cfn-channel-caption-language-mapping-property-builder function updates a CfnChannel$CaptionLanguageMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CaptionLanguageMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captionChannel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:caption-channel` |
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `languageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-description` |
"
  [^CfnChannel$CaptionLanguageMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :caption-channel)]
    (. builder captionChannel data))
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :language-description)]
    (. builder languageDescription data))
  (.build builder))


(defn build-cfn-channel-caption-rectangle-property-builder
  "The build-cfn-channel-caption-rectangle-property-builder function updates a CfnChannel$CaptionRectangleProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CaptionRectangleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `leftOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:left-offset` |
| `topOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top-offset` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^CfnChannel$CaptionRectangleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :height)]
    (. builder height data))
  (when-let [data (lookup-entry config id :left-offset)]
    (. builder leftOffset data))
  (when-let [data (lookup-entry config id :top-offset)]
    (. builder topOffset data))
  (when-let [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn build-cfn-channel-caption-selector-property-builder
  "The build-cfn-channel-caption-selector-property-builder function updates a CfnChannel$CaptionSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CaptionSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `languageCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:language-code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `selectorSettings` | software.amazon.awscdk.services.medialive.CfnChannel$CaptionSelectorSettingsProperty | [[cdk.support/lookup-entry]] | `:selector-settings` |
"
  [^CfnChannel$CaptionSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :language-code)]
    (. builder languageCode data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :selector-settings)]
    (. builder selectorSettings data))
  (.build builder))


(defn build-cfn-channel-caption-selector-settings-property-builder
  "The build-cfn-channel-caption-selector-settings-property-builder function updates a CfnChannel$CaptionSelectorSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CaptionSelectorSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ancillarySourceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ancillary-source-settings` |
| `aribSourceSettings` | software.amazon.awscdk.services.medialive.CfnChannel$AribSourceSettingsProperty | [[cdk.support/lookup-entry]] | `:arib-source-settings` |
| `dvbSubSourceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dvb-sub-source-settings` |
| `embeddedSourceSettings` | software.amazon.awscdk.services.medialive.CfnChannel$EmbeddedSourceSettingsProperty | [[cdk.support/lookup-entry]] | `:embedded-source-settings` |
| `scte20SourceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scte20-source-settings` |
| `scte27SourceSettings` | software.amazon.awscdk.services.medialive.CfnChannel$Scte27SourceSettingsProperty | [[cdk.support/lookup-entry]] | `:scte27-source-settings` |
| `teletextSourceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:teletext-source-settings` |
"
  [^CfnChannel$CaptionSelectorSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ancillary-source-settings)]
    (. builder ancillarySourceSettings data))
  (when-let [data (lookup-entry config id :arib-source-settings)]
    (. builder aribSourceSettings data))
  (when-let [data (lookup-entry config id :dvb-sub-source-settings)]
    (. builder dvbSubSourceSettings data))
  (when-let [data (lookup-entry config id :embedded-source-settings)]
    (. builder embeddedSourceSettings data))
  (when-let [data (lookup-entry config id :scte20-source-settings)]
    (. builder scte20SourceSettings data))
  (when-let [data (lookup-entry config id :scte27-source-settings)]
    (. builder scte27SourceSettings data))
  (when-let [data (lookup-entry config id :teletext-source-settings)]
    (. builder teletextSourceSettings data))
  (.build builder))


(defn build-cfn-channel-cdi-input-specification-property-builder
  "The build-cfn-channel-cdi-input-specification-property-builder function updates a CfnChannel$CdiInputSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CdiInputSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolution` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution` |
"
  [^CfnChannel$CdiInputSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resolution)]
    (. builder resolution data))
  (.build builder))


(defn build-cfn-channel-cmaf-ingest-group-settings-property-builder
  "The build-cfn-channel-cmaf-ingest-group-settings-property-builder function updates a CfnChannel$CmafIngestGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CmafIngestGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `nielsenId3Behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:nielsen-id3-behavior` |
| `scte35Type` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-type` |
| `segmentLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-length` |
| `segmentLengthUnits` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-length-units` |
| `sendDelayMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:send-delay-ms` |
"
  [^CfnChannel$CmafIngestGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :nielsen-id3-behavior)]
    (. builder nielsenId3Behavior data))
  (when-let [data (lookup-entry config id :scte35-type)]
    (. builder scte35Type data))
  (when-let [data (lookup-entry config id :segment-length)]
    (. builder segmentLength data))
  (when-let [data (lookup-entry config id :segment-length-units)]
    (. builder segmentLengthUnits data))
  (when-let [data (lookup-entry config id :send-delay-ms)]
    (. builder sendDelayMs data))
  (.build builder))


(defn build-cfn-channel-cmaf-ingest-output-settings-property-builder
  "The build-cfn-channel-cmaf-ingest-output-settings-property-builder function updates a CfnChannel$CmafIngestOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$CmafIngestOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nameModifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-modifier` |
"
  [^CfnChannel$CmafIngestOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name-modifier)]
    (. builder nameModifier data))
  (.build builder))


(defn build-cfn-channel-color-correction-property-builder
  "The build-cfn-channel-color-correction-property-builder function updates a CfnChannel$ColorCorrectionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ColorCorrectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputColorSpace` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-color-space` |
| `outputColorSpace` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-color-space` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnChannel$ColorCorrectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-color-space)]
    (. builder inputColorSpace data))
  (when-let [data (lookup-entry config id :output-color-space)]
    (. builder outputColorSpace data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn build-cfn-channel-color-correction-settings-property-builder
  "The build-cfn-channel-color-correction-settings-property-builder function updates a CfnChannel$ColorCorrectionSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ColorCorrectionSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `globalColorCorrections` | java.util.List | [[cdk.support/lookup-entry]] | `:global-color-corrections` |
"
  [^CfnChannel$ColorCorrectionSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :global-color-corrections)]
    (. builder globalColorCorrections data))
  (.build builder))


(defn build-cfn-channel-color-space-passthrough-settings-property-builder
  "The build-cfn-channel-color-space-passthrough-settings-property-builder function updates a CfnChannel$ColorSpacePassthroughSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ColorSpacePassthroughSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$ColorSpacePassthroughSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-dolby-vision81-settings-property-builder
  "The build-cfn-channel-dolby-vision81-settings-property-builder function updates a CfnChannel$DolbyVision81SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DolbyVision81SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$DolbyVision81SettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-dvb-nit-settings-property-builder
  "The build-cfn-channel-dvb-nit-settings-property-builder function updates a CfnChannel$DvbNitSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DvbNitSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:network-id` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `repInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rep-interval` |
"
  [^CfnChannel$DvbNitSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :network-id)]
    (. builder networkId data))
  (when-let [data (lookup-entry config id :network-name)]
    (. builder networkName data))
  (when-let [data (lookup-entry config id :rep-interval)]
    (. builder repInterval data))
  (.build builder))


(defn build-cfn-channel-dvb-sdt-settings-property-builder
  "The build-cfn-channel-dvb-sdt-settings-property-builder function updates a CfnChannel$DvbSdtSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DvbSdtSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outputSdt` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-sdt` |
| `repInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rep-interval` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `serviceProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-provider-name` |
"
  [^CfnChannel$DvbSdtSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :output-sdt)]
    (. builder outputSdt data))
  (when-let [data (lookup-entry config id :rep-interval)]
    (. builder repInterval data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-let [data (lookup-entry config id :service-provider-name)]
    (. builder serviceProviderName data))
  (.build builder))


(defn build-cfn-channel-dvb-sub-destination-settings-property-builder
  "The build-cfn-channel-dvb-sub-destination-settings-property-builder function updates a CfnChannel$DvbSubDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DvbSubDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `backgroundOpacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:background-opacity` |
| `font` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:font` |
| `fontColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:font-color` |
| `fontOpacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:font-opacity` |
| `fontResolution` | java.lang.Number | [[cdk.support/lookup-entry]] | `:font-resolution` |
| `fontSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:font-size` |
| `outlineColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:outline-color` |
| `outlineSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:outline-size` |
| `shadowColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:shadow-color` |
| `shadowOpacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shadow-opacity` |
| `shadowXOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shadow-x-offset` |
| `shadowYOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shadow-y-offset` |
| `teletextGridControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:teletext-grid-control` |
| `xPosition` | java.lang.Number | [[cdk.support/lookup-entry]] | `:x-position` |
| `yPosition` | java.lang.Number | [[cdk.support/lookup-entry]] | `:y-position` |
"
  [^CfnChannel$DvbSubDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alignment)]
    (. builder alignment data))
  (when-let [data (lookup-entry config id :background-color)]
    (. builder backgroundColor data))
  (when-let [data (lookup-entry config id :background-opacity)]
    (. builder backgroundOpacity data))
  (when-let [data (lookup-entry config id :font)]
    (. builder font data))
  (when-let [data (lookup-entry config id :font-color)]
    (. builder fontColor data))
  (when-let [data (lookup-entry config id :font-opacity)]
    (. builder fontOpacity data))
  (when-let [data (lookup-entry config id :font-resolution)]
    (. builder fontResolution data))
  (when-let [data (lookup-entry config id :font-size)]
    (. builder fontSize data))
  (when-let [data (lookup-entry config id :outline-color)]
    (. builder outlineColor data))
  (when-let [data (lookup-entry config id :outline-size)]
    (. builder outlineSize data))
  (when-let [data (lookup-entry config id :shadow-color)]
    (. builder shadowColor data))
  (when-let [data (lookup-entry config id :shadow-opacity)]
    (. builder shadowOpacity data))
  (when-let [data (lookup-entry config id :shadow-x-offset)]
    (. builder shadowXOffset data))
  (when-let [data (lookup-entry config id :shadow-y-offset)]
    (. builder shadowYOffset data))
  (when-let [data (lookup-entry config id :teletext-grid-control)]
    (. builder teletextGridControl data))
  (when-let [data (lookup-entry config id :x-position)]
    (. builder xPosition data))
  (when-let [data (lookup-entry config id :y-position)]
    (. builder yPosition data))
  (.build builder))


(defn build-cfn-channel-dvb-sub-source-settings-property-builder
  "The build-cfn-channel-dvb-sub-source-settings-property-builder function updates a CfnChannel$DvbSubSourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DvbSubSourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ocrLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:ocr-language` |
| `pid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pid` |
"
  [^CfnChannel$DvbSubSourceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ocr-language)]
    (. builder ocrLanguage data))
  (when-let [data (lookup-entry config id :pid)]
    (. builder pid data))
  (.build builder))


(defn build-cfn-channel-dvb-tdt-settings-property-builder
  "The build-cfn-channel-dvb-tdt-settings-property-builder function updates a CfnChannel$DvbTdtSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$DvbTdtSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rep-interval` |
"
  [^CfnChannel$DvbTdtSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rep-interval)]
    (. builder repInterval data))
  (.build builder))


(defn build-cfn-channel-eac3-atmos-settings-property-builder
  "The build-cfn-channel-eac3-atmos-settings-property-builder function updates a CfnChannel$Eac3AtmosSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Eac3AtmosSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `codingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:coding-mode` |
| `dialnorm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialnorm` |
| `drcLine` | java.lang.String | [[cdk.support/lookup-entry]] | `:drc-line` |
| `drcRf` | java.lang.String | [[cdk.support/lookup-entry]] | `:drc-rf` |
| `heightTrim` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height-trim` |
| `surroundTrim` | java.lang.Number | [[cdk.support/lookup-entry]] | `:surround-trim` |
"
  [^CfnChannel$Eac3AtmosSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :coding-mode)]
    (. builder codingMode data))
  (when-let [data (lookup-entry config id :dialnorm)]
    (. builder dialnorm data))
  (when-let [data (lookup-entry config id :drc-line)]
    (. builder drcLine data))
  (when-let [data (lookup-entry config id :drc-rf)]
    (. builder drcRf data))
  (when-let [data (lookup-entry config id :height-trim)]
    (. builder heightTrim data))
  (when-let [data (lookup-entry config id :surround-trim)]
    (. builder surroundTrim data))
  (.build builder))


(defn build-cfn-channel-eac3-settings-property-builder
  "The build-cfn-channel-eac3-settings-property-builder function updates a CfnChannel$Eac3SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Eac3SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attenuationControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:attenuation-control` |
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `bitstreamMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:bitstream-mode` |
| `codingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:coding-mode` |
| `dcFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:dc-filter` |
| `dialnorm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialnorm` |
| `drcLine` | java.lang.String | [[cdk.support/lookup-entry]] | `:drc-line` |
| `drcRf` | java.lang.String | [[cdk.support/lookup-entry]] | `:drc-rf` |
| `lfeControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:lfe-control` |
| `lfeFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:lfe-filter` |
| `loRoCenterMixLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lo-ro-center-mix-level` |
| `loRoSurroundMixLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lo-ro-surround-mix-level` |
| `ltRtCenterMixLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lt-rt-center-mix-level` |
| `ltRtSurroundMixLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lt-rt-surround-mix-level` |
| `metadataControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-control` |
| `passthroughControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:passthrough-control` |
| `phaseControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:phase-control` |
| `stereoDownmix` | java.lang.String | [[cdk.support/lookup-entry]] | `:stereo-downmix` |
| `surroundExMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:surround-ex-mode` |
| `surroundMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:surround-mode` |
"
  [^CfnChannel$Eac3SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attenuation-control)]
    (. builder attenuationControl data))
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :bitstream-mode)]
    (. builder bitstreamMode data))
  (when-let [data (lookup-entry config id :coding-mode)]
    (. builder codingMode data))
  (when-let [data (lookup-entry config id :dc-filter)]
    (. builder dcFilter data))
  (when-let [data (lookup-entry config id :dialnorm)]
    (. builder dialnorm data))
  (when-let [data (lookup-entry config id :drc-line)]
    (. builder drcLine data))
  (when-let [data (lookup-entry config id :drc-rf)]
    (. builder drcRf data))
  (when-let [data (lookup-entry config id :lfe-control)]
    (. builder lfeControl data))
  (when-let [data (lookup-entry config id :lfe-filter)]
    (. builder lfeFilter data))
  (when-let [data (lookup-entry config id :lo-ro-center-mix-level)]
    (. builder loRoCenterMixLevel data))
  (when-let [data (lookup-entry config id :lo-ro-surround-mix-level)]
    (. builder loRoSurroundMixLevel data))
  (when-let [data (lookup-entry config id :lt-rt-center-mix-level)]
    (. builder ltRtCenterMixLevel data))
  (when-let [data (lookup-entry config id :lt-rt-surround-mix-level)]
    (. builder ltRtSurroundMixLevel data))
  (when-let [data (lookup-entry config id :metadata-control)]
    (. builder metadataControl data))
  (when-let [data (lookup-entry config id :passthrough-control)]
    (. builder passthroughControl data))
  (when-let [data (lookup-entry config id :phase-control)]
    (. builder phaseControl data))
  (when-let [data (lookup-entry config id :stereo-downmix)]
    (. builder stereoDownmix data))
  (when-let [data (lookup-entry config id :surround-ex-mode)]
    (. builder surroundExMode data))
  (when-let [data (lookup-entry config id :surround-mode)]
    (. builder surroundMode data))
  (.build builder))


(defn build-cfn-channel-ebu-tt-d-destination-settings-property-builder
  "The build-cfn-channel-ebu-tt-d-destination-settings-property-builder function updates a CfnChannel$EbuTtDDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EbuTtDDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyrightHolder` | java.lang.String | [[cdk.support/lookup-entry]] | `:copyright-holder` |
| `fillLineGap` | java.lang.String | [[cdk.support/lookup-entry]] | `:fill-line-gap` |
| `fontFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:font-family` |
| `styleControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:style-control` |
"
  [^CfnChannel$EbuTtDDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :copyright-holder)]
    (. builder copyrightHolder data))
  (when-let [data (lookup-entry config id :fill-line-gap)]
    (. builder fillLineGap data))
  (when-let [data (lookup-entry config id :font-family)]
    (. builder fontFamily data))
  (when-let [data (lookup-entry config id :style-control)]
    (. builder styleControl data))
  (.build builder))


(defn build-cfn-channel-embedded-destination-settings-property-builder
  "The build-cfn-channel-embedded-destination-settings-property-builder function updates a CfnChannel$EmbeddedDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EmbeddedDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$EmbeddedDestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-embedded-plus-scte20-destination-settings-property-builder
  "The build-cfn-channel-embedded-plus-scte20-destination-settings-property-builder function updates a CfnChannel$EmbeddedPlusScte20DestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EmbeddedPlusScte20DestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$EmbeddedPlusScte20DestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-embedded-source-settings-property-builder
  "The build-cfn-channel-embedded-source-settings-property-builder function updates a CfnChannel$EmbeddedSourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EmbeddedSourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `convert608To708` | java.lang.String | [[cdk.support/lookup-entry]] | `:convert608-to708` |
| `scte20Detection` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte20-detection` |
| `source608ChannelNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source608-channel-number` |
| `source608TrackNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source608-track-number` |
"
  [^CfnChannel$EmbeddedSourceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :convert608-to708)]
    (. builder convert608To708 data))
  (when-let [data (lookup-entry config id :scte20-detection)]
    (. builder scte20Detection data))
  (when-let [data (lookup-entry config id :source608-channel-number)]
    (. builder source608ChannelNumber data))
  (when-let [data (lookup-entry config id :source608-track-number)]
    (. builder source608TrackNumber data))
  (.build builder))


(defn build-cfn-channel-encoder-settings-property-builder
  "The build-cfn-channel-encoder-settings-property-builder function updates a CfnChannel$EncoderSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EncoderSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioDescriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-descriptions` |
| `availBlanking` | software.amazon.awscdk.services.medialive.CfnChannel$AvailBlankingProperty | [[cdk.support/lookup-entry]] | `:avail-blanking` |
| `availConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:avail-configuration` |
| `blackoutSlate` | software.amazon.awscdk.services.medialive.CfnChannel$BlackoutSlateProperty | [[cdk.support/lookup-entry]] | `:blackout-slate` |
| `captionDescriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:caption-descriptions` |
| `colorCorrectionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:color-correction-settings` |
| `featureActivations` | software.amazon.awscdk.services.medialive.CfnChannel$FeatureActivationsProperty | [[cdk.support/lookup-entry]] | `:feature-activations` |
| `globalConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:global-configuration` |
| `motionGraphicsConfiguration` | software.amazon.awscdk.services.medialive.CfnChannel$MotionGraphicsConfigurationProperty | [[cdk.support/lookup-entry]] | `:motion-graphics-configuration` |
| `nielsenConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nielsen-configuration` |
| `outputGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:output-groups` |
| `thumbnailConfiguration` | software.amazon.awscdk.services.medialive.CfnChannel$ThumbnailConfigurationProperty | [[cdk.support/lookup-entry]] | `:thumbnail-configuration` |
| `timecodeConfig` | software.amazon.awscdk.services.medialive.CfnChannel$TimecodeConfigProperty | [[cdk.support/lookup-entry]] | `:timecode-config` |
| `videoDescriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video-descriptions` |
"
  [^CfnChannel$EncoderSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-descriptions)]
    (. builder audioDescriptions data))
  (when-let [data (lookup-entry config id :avail-blanking)]
    (. builder availBlanking data))
  (when-let [data (lookup-entry config id :avail-configuration)]
    (. builder availConfiguration data))
  (when-let [data (lookup-entry config id :blackout-slate)]
    (. builder blackoutSlate data))
  (when-let [data (lookup-entry config id :caption-descriptions)]
    (. builder captionDescriptions data))
  (when-let [data (lookup-entry config id :color-correction-settings)]
    (. builder colorCorrectionSettings data))
  (when-let [data (lookup-entry config id :feature-activations)]
    (. builder featureActivations data))
  (when-let [data (lookup-entry config id :global-configuration)]
    (. builder globalConfiguration data))
  (when-let [data (lookup-entry config id :motion-graphics-configuration)]
    (. builder motionGraphicsConfiguration data))
  (when-let [data (lookup-entry config id :nielsen-configuration)]
    (. builder nielsenConfiguration data))
  (when-let [data (lookup-entry config id :output-groups)]
    (. builder outputGroups data))
  (when-let [data (lookup-entry config id :thumbnail-configuration)]
    (. builder thumbnailConfiguration data))
  (when-let [data (lookup-entry config id :timecode-config)]
    (. builder timecodeConfig data))
  (when-let [data (lookup-entry config id :video-descriptions)]
    (. builder videoDescriptions data))
  (.build builder))


(defn build-cfn-channel-epoch-locking-settings-property-builder
  "The build-cfn-channel-epoch-locking-settings-property-builder function updates a CfnChannel$EpochLockingSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EpochLockingSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customEpoch` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-epoch` |
| `jamSyncTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:jam-sync-time` |
"
  [^CfnChannel$EpochLockingSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-epoch)]
    (. builder customEpoch data))
  (when-let [data (lookup-entry config id :jam-sync-time)]
    (. builder jamSyncTime data))
  (.build builder))


(defn build-cfn-channel-esam-property-builder
  "The build-cfn-channel-esam-property-builder function updates a CfnChannel$EsamProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$EsamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acquisitionPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:acquisition-point-id` |
| `adAvailOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ad-avail-offset` |
| `passwordParam` | java.lang.String | [[cdk.support/lookup-entry]] | `:password-param` |
| `poisEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:pois-endpoint` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
| `zoneIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-identity` |
"
  [^CfnChannel$EsamProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acquisition-point-id)]
    (. builder acquisitionPointId data))
  (when-let [data (lookup-entry config id :ad-avail-offset)]
    (. builder adAvailOffset data))
  (when-let [data (lookup-entry config id :password-param)]
    (. builder passwordParam data))
  (when-let [data (lookup-entry config id :pois-endpoint)]
    (. builder poisEndpoint data))
  (when-let [data (lookup-entry config id :username)]
    (. builder username data))
  (when-let [data (lookup-entry config id :zone-identity)]
    (. builder zoneIdentity data))
  (.build builder))


(defn build-cfn-channel-failover-condition-property-builder
  "The build-cfn-channel-failover-condition-property-builder function updates a CfnChannel$FailoverConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FailoverConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverConditionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failover-condition-settings` |
"
  [^CfnChannel$FailoverConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failover-condition-settings)]
    (. builder failoverConditionSettings data))
  (.build builder))


(defn build-cfn-channel-failover-condition-settings-property-builder
  "The build-cfn-channel-failover-condition-settings-property-builder function updates a CfnChannel$FailoverConditionSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FailoverConditionSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioSilenceSettings` | software.amazon.awscdk.services.medialive.CfnChannel$AudioSilenceFailoverSettingsProperty | [[cdk.support/lookup-entry]] | `:audio-silence-settings` |
| `inputLossSettings` | software.amazon.awscdk.services.medialive.CfnChannel$InputLossFailoverSettingsProperty | [[cdk.support/lookup-entry]] | `:input-loss-settings` |
| `videoBlackSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video-black-settings` |
"
  [^CfnChannel$FailoverConditionSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-silence-settings)]
    (. builder audioSilenceSettings data))
  (when-let [data (lookup-entry config id :input-loss-settings)]
    (. builder inputLossSettings data))
  (when-let [data (lookup-entry config id :video-black-settings)]
    (. builder videoBlackSettings data))
  (.build builder))


(defn build-cfn-channel-feature-activations-property-builder
  "The build-cfn-channel-feature-activations-property-builder function updates a CfnChannel$FeatureActivationsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FeatureActivationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputPrepareScheduleActions` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-prepare-schedule-actions` |
| `outputStaticImageOverlayScheduleActions` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-static-image-overlay-schedule-actions` |
"
  [^CfnChannel$FeatureActivationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-prepare-schedule-actions)]
    (. builder inputPrepareScheduleActions data))
  (when-let [data (lookup-entry config id :output-static-image-overlay-schedule-actions)]
    (. builder outputStaticImageOverlayScheduleActions data))
  (.build builder))


(defn build-cfn-channel-fec-output-settings-property-builder
  "The build-cfn-channel-fec-output-settings-property-builder function updates a CfnChannel$FecOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FecOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:column-depth` |
| `includeFec` | java.lang.String | [[cdk.support/lookup-entry]] | `:include-fec` |
| `rowLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:row-length` |
"
  [^CfnChannel$FecOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :column-depth)]
    (. builder columnDepth data))
  (when-let [data (lookup-entry config id :include-fec)]
    (. builder includeFec data))
  (when-let [data (lookup-entry config id :row-length)]
    (. builder rowLength data))
  (.build builder))


(defn build-cfn-channel-fmp4-hls-settings-property-builder
  "The build-cfn-channel-fmp4-hls-settings-property-builder function updates a CfnChannel$Fmp4HlsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Fmp4HlsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioRenditionSets` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-rendition-sets` |
| `nielsenId3Behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:nielsen-id3-behavior` |
| `timedMetadataBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-behavior` |
"
  [^CfnChannel$Fmp4HlsSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-rendition-sets)]
    (. builder audioRenditionSets data))
  (when-let [data (lookup-entry config id :nielsen-id3-behavior)]
    (. builder nielsenId3Behavior data))
  (when-let [data (lookup-entry config id :timed-metadata-behavior)]
    (. builder timedMetadataBehavior data))
  (.build builder))


(defn build-cfn-channel-frame-capture-cdn-settings-property-builder
  "The build-cfn-channel-frame-capture-cdn-settings-property-builder function updates a CfnChannel$FrameCaptureCdnSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FrameCaptureCdnSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameCaptureS3Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:frame-capture-s3-settings` |
"
  [^CfnChannel$FrameCaptureCdnSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :frame-capture-s3-settings)]
    (. builder frameCaptureS3Settings data))
  (.build builder))


(defn build-cfn-channel-frame-capture-group-settings-property-builder
  "The build-cfn-channel-frame-capture-group-settings-property-builder function updates a CfnChannel$FrameCaptureGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FrameCaptureGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.medialive.CfnChannel$OutputLocationRefProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `frameCaptureCdnSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:frame-capture-cdn-settings` |
"
  [^CfnChannel$FrameCaptureGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :frame-capture-cdn-settings)]
    (. builder frameCaptureCdnSettings data))
  (.build builder))


(defn build-cfn-channel-frame-capture-hls-settings-property-builder
  "The build-cfn-channel-frame-capture-hls-settings-property-builder function updates a CfnChannel$FrameCaptureHlsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FrameCaptureHlsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$FrameCaptureHlsSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-frame-capture-output-settings-property-builder
  "The build-cfn-channel-frame-capture-output-settings-property-builder function updates a CfnChannel$FrameCaptureOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FrameCaptureOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nameModifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-modifier` |
"
  [^CfnChannel$FrameCaptureOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name-modifier)]
    (. builder nameModifier data))
  (.build builder))


(defn build-cfn-channel-frame-capture-s3-settings-property-builder
  "The build-cfn-channel-frame-capture-s3-settings-property-builder function updates a CfnChannel$FrameCaptureS3SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FrameCaptureS3SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cannedAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:canned-acl` |
"
  [^CfnChannel$FrameCaptureS3SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :canned-acl)]
    (. builder cannedAcl data))
  (.build builder))


(defn build-cfn-channel-frame-capture-settings-property-builder
  "The build-cfn-channel-frame-capture-settings-property-builder function updates a CfnChannel$FrameCaptureSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$FrameCaptureSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capture-interval` |
| `captureIntervalUnits` | java.lang.String | [[cdk.support/lookup-entry]] | `:capture-interval-units` |
| `timecodeBurninSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timecode-burnin-settings` |
"
  [^CfnChannel$FrameCaptureSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :capture-interval)]
    (. builder captureInterval data))
  (when-let [data (lookup-entry config id :capture-interval-units)]
    (. builder captureIntervalUnits data))
  (when-let [data (lookup-entry config id :timecode-burnin-settings)]
    (. builder timecodeBurninSettings data))
  (.build builder))


(defn build-cfn-channel-global-configuration-property-builder
  "The build-cfn-channel-global-configuration-property-builder function updates a CfnChannel$GlobalConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$GlobalConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialAudioGain` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-audio-gain` |
| `inputEndAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-end-action` |
| `inputLossBehavior` | software.amazon.awscdk.services.medialive.CfnChannel$InputLossBehaviorProperty | [[cdk.support/lookup-entry]] | `:input-loss-behavior` |
| `outputLockingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-locking-mode` |
| `outputLockingSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-locking-settings` |
| `outputTimingSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-timing-source` |
| `supportLowFramerateInputs` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-low-framerate-inputs` |
"
  [^CfnChannel$GlobalConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :initial-audio-gain)]
    (. builder initialAudioGain data))
  (when-let [data (lookup-entry config id :input-end-action)]
    (. builder inputEndAction data))
  (when-let [data (lookup-entry config id :input-loss-behavior)]
    (. builder inputLossBehavior data))
  (when-let [data (lookup-entry config id :output-locking-mode)]
    (. builder outputLockingMode data))
  (when-let [data (lookup-entry config id :output-locking-settings)]
    (. builder outputLockingSettings data))
  (when-let [data (lookup-entry config id :output-timing-source)]
    (. builder outputTimingSource data))
  (when-let [data (lookup-entry config id :support-low-framerate-inputs)]
    (. builder supportLowFramerateInputs data))
  (.build builder))


(defn build-cfn-channel-h264-color-space-settings-property-builder
  "The build-cfn-channel-h264-color-space-settings-property-builder function updates a CfnChannel$H264ColorSpaceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$H264ColorSpaceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `colorSpacePassthroughSettings` | software.amazon.awscdk.services.medialive.CfnChannel$ColorSpacePassthroughSettingsProperty | [[cdk.support/lookup-entry]] | `:color-space-passthrough-settings` |
| `rec601Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rec601-settings` |
| `rec709Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rec709-settings` |
"
  [^CfnChannel$H264ColorSpaceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :color-space-passthrough-settings)]
    (. builder colorSpacePassthroughSettings data))
  (when-let [data (lookup-entry config id :rec601-settings)]
    (. builder rec601Settings data))
  (when-let [data (lookup-entry config id :rec709-settings)]
    (. builder rec709Settings data))
  (.build builder))


(defn build-cfn-channel-h264-filter-settings-property-builder
  "The build-cfn-channel-h264-filter-settings-property-builder function updates a CfnChannel$H264FilterSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$H264FilterSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `temporalFilterSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:temporal-filter-settings` |
"
  [^CfnChannel$H264FilterSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :temporal-filter-settings)]
    (. builder temporalFilterSettings data))
  (.build builder))


(defn build-cfn-channel-h264-settings-property-builder
  "The build-cfn-channel-h264-settings-property-builder function updates a CfnChannel$H264SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$H264SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adaptiveQuantization` | java.lang.String | [[cdk.support/lookup-entry]] | `:adaptive-quantization` |
| `afdSignaling` | java.lang.String | [[cdk.support/lookup-entry]] | `:afd-signaling` |
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `bufFillPct` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buf-fill-pct` |
| `bufSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buf-size` |
| `colorMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:color-metadata` |
| `colorSpaceSettings` | software.amazon.awscdk.services.medialive.CfnChannel$H264ColorSpaceSettingsProperty | [[cdk.support/lookup-entry]] | `:color-space-settings` |
| `entropyEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:entropy-encoding` |
| `filterSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-settings` |
| `fixedAfd` | java.lang.String | [[cdk.support/lookup-entry]] | `:fixed-afd` |
| `flickerAq` | java.lang.String | [[cdk.support/lookup-entry]] | `:flicker-aq` |
| `forceFieldPictures` | java.lang.String | [[cdk.support/lookup-entry]] | `:force-field-pictures` |
| `framerateControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:framerate-control` |
| `framerateDenominator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate-denominator` |
| `framerateNumerator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate-numerator` |
| `gopBReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:gop-b-reference` |
| `gopClosedCadence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-closed-cadence` |
| `gopNumBFrames` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-num-b-frames` |
| `gopSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-size` |
| `gopSizeUnits` | java.lang.String | [[cdk.support/lookup-entry]] | `:gop-size-units` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `lookAheadRateControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:look-ahead-rate-control` |
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `minIInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-i-interval` |
| `numRefFrames` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-ref-frames` |
| `parControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:par-control` |
| `parDenominator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:par-denominator` |
| `parNumerator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:par-numerator` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `qualityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality-level` |
| `qvbrQualityLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:qvbr-quality-level` |
| `rateControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rate-control-mode` |
| `scanType` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-type` |
| `sceneChangeDetect` | java.lang.String | [[cdk.support/lookup-entry]] | `:scene-change-detect` |
| `slices` | java.lang.Number | [[cdk.support/lookup-entry]] | `:slices` |
| `softness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:softness` |
| `spatialAq` | java.lang.String | [[cdk.support/lookup-entry]] | `:spatial-aq` |
| `subgopLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:subgop-length` |
| `syntax` | java.lang.String | [[cdk.support/lookup-entry]] | `:syntax` |
| `temporalAq` | java.lang.String | [[cdk.support/lookup-entry]] | `:temporal-aq` |
| `timecodeBurninSettings` | software.amazon.awscdk.services.medialive.CfnChannel$TimecodeBurninSettingsProperty | [[cdk.support/lookup-entry]] | `:timecode-burnin-settings` |
| `timecodeInsertion` | java.lang.String | [[cdk.support/lookup-entry]] | `:timecode-insertion` |
"
  [^CfnChannel$H264SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :adaptive-quantization)]
    (. builder adaptiveQuantization data))
  (when-let [data (lookup-entry config id :afd-signaling)]
    (. builder afdSignaling data))
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :buf-fill-pct)]
    (. builder bufFillPct data))
  (when-let [data (lookup-entry config id :buf-size)]
    (. builder bufSize data))
  (when-let [data (lookup-entry config id :color-metadata)]
    (. builder colorMetadata data))
  (when-let [data (lookup-entry config id :color-space-settings)]
    (. builder colorSpaceSettings data))
  (when-let [data (lookup-entry config id :entropy-encoding)]
    (. builder entropyEncoding data))
  (when-let [data (lookup-entry config id :filter-settings)]
    (. builder filterSettings data))
  (when-let [data (lookup-entry config id :fixed-afd)]
    (. builder fixedAfd data))
  (when-let [data (lookup-entry config id :flicker-aq)]
    (. builder flickerAq data))
  (when-let [data (lookup-entry config id :force-field-pictures)]
    (. builder forceFieldPictures data))
  (when-let [data (lookup-entry config id :framerate-control)]
    (. builder framerateControl data))
  (when-let [data (lookup-entry config id :framerate-denominator)]
    (. builder framerateDenominator data))
  (when-let [data (lookup-entry config id :framerate-numerator)]
    (. builder framerateNumerator data))
  (when-let [data (lookup-entry config id :gop-b-reference)]
    (. builder gopBReference data))
  (when-let [data (lookup-entry config id :gop-closed-cadence)]
    (. builder gopClosedCadence data))
  (when-let [data (lookup-entry config id :gop-num-b-frames)]
    (. builder gopNumBFrames data))
  (when-let [data (lookup-entry config id :gop-size)]
    (. builder gopSize data))
  (when-let [data (lookup-entry config id :gop-size-units)]
    (. builder gopSizeUnits data))
  (when-let [data (lookup-entry config id :level)]
    (. builder level data))
  (when-let [data (lookup-entry config id :look-ahead-rate-control)]
    (. builder lookAheadRateControl data))
  (when-let [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (when-let [data (lookup-entry config id :min-i-interval)]
    (. builder minIInterval data))
  (when-let [data (lookup-entry config id :num-ref-frames)]
    (. builder numRefFrames data))
  (when-let [data (lookup-entry config id :par-control)]
    (. builder parControl data))
  (when-let [data (lookup-entry config id :par-denominator)]
    (. builder parDenominator data))
  (when-let [data (lookup-entry config id :par-numerator)]
    (. builder parNumerator data))
  (when-let [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-let [data (lookup-entry config id :quality-level)]
    (. builder qualityLevel data))
  (when-let [data (lookup-entry config id :qvbr-quality-level)]
    (. builder qvbrQualityLevel data))
  (when-let [data (lookup-entry config id :rate-control-mode)]
    (. builder rateControlMode data))
  (when-let [data (lookup-entry config id :scan-type)]
    (. builder scanType data))
  (when-let [data (lookup-entry config id :scene-change-detect)]
    (. builder sceneChangeDetect data))
  (when-let [data (lookup-entry config id :slices)]
    (. builder slices data))
  (when-let [data (lookup-entry config id :softness)]
    (. builder softness data))
  (when-let [data (lookup-entry config id :spatial-aq)]
    (. builder spatialAq data))
  (when-let [data (lookup-entry config id :subgop-length)]
    (. builder subgopLength data))
  (when-let [data (lookup-entry config id :syntax)]
    (. builder syntax data))
  (when-let [data (lookup-entry config id :temporal-aq)]
    (. builder temporalAq data))
  (when-let [data (lookup-entry config id :timecode-burnin-settings)]
    (. builder timecodeBurninSettings data))
  (when-let [data (lookup-entry config id :timecode-insertion)]
    (. builder timecodeInsertion data))
  (.build builder))


(defn build-cfn-channel-h265-color-space-settings-property-builder
  "The build-cfn-channel-h265-color-space-settings-property-builder function updates a CfnChannel$H265ColorSpaceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$H265ColorSpaceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `colorSpacePassthroughSettings` | software.amazon.awscdk.services.medialive.CfnChannel$ColorSpacePassthroughSettingsProperty | [[cdk.support/lookup-entry]] | `:color-space-passthrough-settings` |
| `dolbyVision81Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dolby-vision81-settings` |
| `hdr10Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hdr10-settings` |
| `rec601Settings` | software.amazon.awscdk.services.medialive.CfnChannel$Rec601SettingsProperty | [[cdk.support/lookup-entry]] | `:rec601-settings` |
| `rec709Settings` | software.amazon.awscdk.services.medialive.CfnChannel$Rec709SettingsProperty | [[cdk.support/lookup-entry]] | `:rec709-settings` |
"
  [^CfnChannel$H265ColorSpaceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :color-space-passthrough-settings)]
    (. builder colorSpacePassthroughSettings data))
  (when-let [data (lookup-entry config id :dolby-vision81-settings)]
    (. builder dolbyVision81Settings data))
  (when-let [data (lookup-entry config id :hdr10-settings)]
    (. builder hdr10Settings data))
  (when-let [data (lookup-entry config id :rec601-settings)]
    (. builder rec601Settings data))
  (when-let [data (lookup-entry config id :rec709-settings)]
    (. builder rec709Settings data))
  (.build builder))


(defn build-cfn-channel-h265-filter-settings-property-builder
  "The build-cfn-channel-h265-filter-settings-property-builder function updates a CfnChannel$H265FilterSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$H265FilterSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `temporalFilterSettings` | software.amazon.awscdk.services.medialive.CfnChannel$TemporalFilterSettingsProperty | [[cdk.support/lookup-entry]] | `:temporal-filter-settings` |
"
  [^CfnChannel$H265FilterSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :temporal-filter-settings)]
    (. builder temporalFilterSettings data))
  (.build builder))


(defn build-cfn-channel-h265-settings-property-builder
  "The build-cfn-channel-h265-settings-property-builder function updates a CfnChannel$H265SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$H265SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adaptiveQuantization` | java.lang.String | [[cdk.support/lookup-entry]] | `:adaptive-quantization` |
| `afdSignaling` | java.lang.String | [[cdk.support/lookup-entry]] | `:afd-signaling` |
| `alternativeTransferFunction` | java.lang.String | [[cdk.support/lookup-entry]] | `:alternative-transfer-function` |
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `bufSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buf-size` |
| `colorMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:color-metadata` |
| `colorSpaceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:color-space-settings` |
| `filterSettings` | software.amazon.awscdk.services.medialive.CfnChannel$H265FilterSettingsProperty | [[cdk.support/lookup-entry]] | `:filter-settings` |
| `fixedAfd` | java.lang.String | [[cdk.support/lookup-entry]] | `:fixed-afd` |
| `flickerAq` | java.lang.String | [[cdk.support/lookup-entry]] | `:flicker-aq` |
| `framerateDenominator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate-denominator` |
| `framerateNumerator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate-numerator` |
| `gopClosedCadence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-closed-cadence` |
| `gopSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-size` |
| `gopSizeUnits` | java.lang.String | [[cdk.support/lookup-entry]] | `:gop-size-units` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `lookAheadRateControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:look-ahead-rate-control` |
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `minIInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-i-interval` |
| `mvOverPictureBoundaries` | java.lang.String | [[cdk.support/lookup-entry]] | `:mv-over-picture-boundaries` |
| `mvTemporalPredictor` | java.lang.String | [[cdk.support/lookup-entry]] | `:mv-temporal-predictor` |
| `parDenominator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:par-denominator` |
| `parNumerator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:par-numerator` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `qvbrQualityLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:qvbr-quality-level` |
| `rateControlMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rate-control-mode` |
| `scanType` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-type` |
| `sceneChangeDetect` | java.lang.String | [[cdk.support/lookup-entry]] | `:scene-change-detect` |
| `slices` | java.lang.Number | [[cdk.support/lookup-entry]] | `:slices` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
| `tileHeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tile-height` |
| `tilePadding` | java.lang.String | [[cdk.support/lookup-entry]] | `:tile-padding` |
| `tileWidth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tile-width` |
| `timecodeBurninSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timecode-burnin-settings` |
| `timecodeInsertion` | java.lang.String | [[cdk.support/lookup-entry]] | `:timecode-insertion` |
| `treeblockSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:treeblock-size` |
"
  [^CfnChannel$H265SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :adaptive-quantization)]
    (. builder adaptiveQuantization data))
  (when-let [data (lookup-entry config id :afd-signaling)]
    (. builder afdSignaling data))
  (when-let [data (lookup-entry config id :alternative-transfer-function)]
    (. builder alternativeTransferFunction data))
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :buf-size)]
    (. builder bufSize data))
  (when-let [data (lookup-entry config id :color-metadata)]
    (. builder colorMetadata data))
  (when-let [data (lookup-entry config id :color-space-settings)]
    (. builder colorSpaceSettings data))
  (when-let [data (lookup-entry config id :filter-settings)]
    (. builder filterSettings data))
  (when-let [data (lookup-entry config id :fixed-afd)]
    (. builder fixedAfd data))
  (when-let [data (lookup-entry config id :flicker-aq)]
    (. builder flickerAq data))
  (when-let [data (lookup-entry config id :framerate-denominator)]
    (. builder framerateDenominator data))
  (when-let [data (lookup-entry config id :framerate-numerator)]
    (. builder framerateNumerator data))
  (when-let [data (lookup-entry config id :gop-closed-cadence)]
    (. builder gopClosedCadence data))
  (when-let [data (lookup-entry config id :gop-size)]
    (. builder gopSize data))
  (when-let [data (lookup-entry config id :gop-size-units)]
    (. builder gopSizeUnits data))
  (when-let [data (lookup-entry config id :level)]
    (. builder level data))
  (when-let [data (lookup-entry config id :look-ahead-rate-control)]
    (. builder lookAheadRateControl data))
  (when-let [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (when-let [data (lookup-entry config id :min-i-interval)]
    (. builder minIInterval data))
  (when-let [data (lookup-entry config id :mv-over-picture-boundaries)]
    (. builder mvOverPictureBoundaries data))
  (when-let [data (lookup-entry config id :mv-temporal-predictor)]
    (. builder mvTemporalPredictor data))
  (when-let [data (lookup-entry config id :par-denominator)]
    (. builder parDenominator data))
  (when-let [data (lookup-entry config id :par-numerator)]
    (. builder parNumerator data))
  (when-let [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-let [data (lookup-entry config id :qvbr-quality-level)]
    (. builder qvbrQualityLevel data))
  (when-let [data (lookup-entry config id :rate-control-mode)]
    (. builder rateControlMode data))
  (when-let [data (lookup-entry config id :scan-type)]
    (. builder scanType data))
  (when-let [data (lookup-entry config id :scene-change-detect)]
    (. builder sceneChangeDetect data))
  (when-let [data (lookup-entry config id :slices)]
    (. builder slices data))
  (when-let [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-let [data (lookup-entry config id :tile-height)]
    (. builder tileHeight data))
  (when-let [data (lookup-entry config id :tile-padding)]
    (. builder tilePadding data))
  (when-let [data (lookup-entry config id :tile-width)]
    (. builder tileWidth data))
  (when-let [data (lookup-entry config id :timecode-burnin-settings)]
    (. builder timecodeBurninSettings data))
  (when-let [data (lookup-entry config id :timecode-insertion)]
    (. builder timecodeInsertion data))
  (when-let [data (lookup-entry config id :treeblock-size)]
    (. builder treeblockSize data))
  (.build builder))


(defn build-cfn-channel-hdr10-settings-property-builder
  "The build-cfn-channel-hdr10-settings-property-builder function updates a CfnChannel$Hdr10SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Hdr10SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCll` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-cll` |
| `maxFall` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-fall` |
"
  [^CfnChannel$Hdr10SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-cll)]
    (. builder maxCll data))
  (when-let [data (lookup-entry config id :max-fall)]
    (. builder maxFall data))
  (.build builder))


(defn build-cfn-channel-hls-akamai-settings-property-builder
  "The build-cfn-channel-hls-akamai-settings-property-builder function updates a CfnChannel$HlsAkamaiSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsAkamaiSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionRetryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-retry-interval` |
| `filecacheDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:filecache-duration` |
| `httpTransferMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-transfer-mode` |
| `numRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-retries` |
| `restartDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:restart-delay` |
| `salt` | java.lang.String | [[cdk.support/lookup-entry]] | `:salt` |
| `token` | java.lang.String | [[cdk.support/lookup-entry]] | `:token` |
"
  [^CfnChannel$HlsAkamaiSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-retry-interval)]
    (. builder connectionRetryInterval data))
  (when-let [data (lookup-entry config id :filecache-duration)]
    (. builder filecacheDuration data))
  (when-let [data (lookup-entry config id :http-transfer-mode)]
    (. builder httpTransferMode data))
  (when-let [data (lookup-entry config id :num-retries)]
    (. builder numRetries data))
  (when-let [data (lookup-entry config id :restart-delay)]
    (. builder restartDelay data))
  (when-let [data (lookup-entry config id :salt)]
    (. builder salt data))
  (when-let [data (lookup-entry config id :token)]
    (. builder token data))
  (.build builder))


(defn build-cfn-channel-hls-basic-put-settings-property-builder
  "The build-cfn-channel-hls-basic-put-settings-property-builder function updates a CfnChannel$HlsBasicPutSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsBasicPutSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionRetryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-retry-interval` |
| `filecacheDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:filecache-duration` |
| `numRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-retries` |
| `restartDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:restart-delay` |
"
  [^CfnChannel$HlsBasicPutSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-retry-interval)]
    (. builder connectionRetryInterval data))
  (when-let [data (lookup-entry config id :filecache-duration)]
    (. builder filecacheDuration data))
  (when-let [data (lookup-entry config id :num-retries)]
    (. builder numRetries data))
  (when-let [data (lookup-entry config id :restart-delay)]
    (. builder restartDelay data))
  (.build builder))


(defn build-cfn-channel-hls-cdn-settings-property-builder
  "The build-cfn-channel-hls-cdn-settings-property-builder function updates a CfnChannel$HlsCdnSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsCdnSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hlsAkamaiSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-akamai-settings` |
| `hlsBasicPutSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-basic-put-settings` |
| `hlsMediaStoreSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-media-store-settings` |
| `hlsS3Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-s3-settings` |
| `hlsWebdavSettings` | software.amazon.awscdk.services.medialive.CfnChannel$HlsWebdavSettingsProperty | [[cdk.support/lookup-entry]] | `:hls-webdav-settings` |
"
  [^CfnChannel$HlsCdnSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hls-akamai-settings)]
    (. builder hlsAkamaiSettings data))
  (when-let [data (lookup-entry config id :hls-basic-put-settings)]
    (. builder hlsBasicPutSettings data))
  (when-let [data (lookup-entry config id :hls-media-store-settings)]
    (. builder hlsMediaStoreSettings data))
  (when-let [data (lookup-entry config id :hls-s3-settings)]
    (. builder hlsS3Settings data))
  (when-let [data (lookup-entry config id :hls-webdav-settings)]
    (. builder hlsWebdavSettings data))
  (.build builder))


(defn build-cfn-channel-hls-group-settings-property-builder
  "The build-cfn-channel-hls-group-settings-property-builder function updates a CfnChannel$HlsGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkers` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-markers` |
| `baseUrlContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url-content` |
| `baseUrlContent1` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url-content1` |
| `baseUrlManifest` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url-manifest` |
| `baseUrlManifest1` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-url-manifest1` |
| `captionLanguageMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:caption-language-mappings` |
| `captionLanguageSetting` | java.lang.String | [[cdk.support/lookup-entry]] | `:caption-language-setting` |
| `clientCache` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-cache` |
| `codecSpecification` | java.lang.String | [[cdk.support/lookup-entry]] | `:codec-specification` |
| `constantIv` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-iv` |
| `destination` | software.amazon.awscdk.services.medialive.CfnChannel$OutputLocationRefProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `directoryStructure` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-structure` |
| `discontinuityTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:discontinuity-tags` |
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `hlsCdnSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-cdn-settings` |
| `hlsId3SegmentTagging` | java.lang.String | [[cdk.support/lookup-entry]] | `:hls-id3-segment-tagging` |
| `iFrameOnlyPlaylists` | java.lang.String | [[cdk.support/lookup-entry]] | `:i-frame-only-playlists` |
| `incompleteSegmentBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:incomplete-segment-behavior` |
| `indexNSegments` | java.lang.Number | [[cdk.support/lookup-entry]] | `:index-n-segments` |
| `inputLossAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-loss-action` |
| `ivInManifest` | java.lang.String | [[cdk.support/lookup-entry]] | `:iv-in-manifest` |
| `ivSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:iv-source` |
| `keepSegments` | java.lang.Number | [[cdk.support/lookup-entry]] | `:keep-segments` |
| `keyFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-format` |
| `keyFormatVersions` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-format-versions` |
| `keyProviderSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-provider-settings` |
| `manifestCompression` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-compression` |
| `manifestDurationFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-duration-format` |
| `minSegmentLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-segment-length` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `outputSelection` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-selection` |
| `programDateTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:program-date-time` |
| `programDateTimeClock` | java.lang.String | [[cdk.support/lookup-entry]] | `:program-date-time-clock` |
| `programDateTimePeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-period` |
| `redundantManifest` | java.lang.String | [[cdk.support/lookup-entry]] | `:redundant-manifest` |
| `segmentLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-length` |
| `segmentationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:segmentation-mode` |
| `segmentsPerSubdirectory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segments-per-subdirectory` |
| `streamInfResolution` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-inf-resolution` |
| `timedMetadataId3Frame` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-id3-frame` |
| `timedMetadataId3Period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timed-metadata-id3-period` |
| `timestampDeltaMilliseconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timestamp-delta-milliseconds` |
| `tsFileMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ts-file-mode` |
"
  [^CfnChannel$HlsGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ad-markers)]
    (. builder adMarkers data))
  (when-let [data (lookup-entry config id :base-url-content)]
    (. builder baseUrlContent data))
  (when-let [data (lookup-entry config id :base-url-content1)]
    (. builder baseUrlContent1 data))
  (when-let [data (lookup-entry config id :base-url-manifest)]
    (. builder baseUrlManifest data))
  (when-let [data (lookup-entry config id :base-url-manifest1)]
    (. builder baseUrlManifest1 data))
  (when-let [data (lookup-entry config id :caption-language-mappings)]
    (. builder captionLanguageMappings data))
  (when-let [data (lookup-entry config id :caption-language-setting)]
    (. builder captionLanguageSetting data))
  (when-let [data (lookup-entry config id :client-cache)]
    (. builder clientCache data))
  (when-let [data (lookup-entry config id :codec-specification)]
    (. builder codecSpecification data))
  (when-let [data (lookup-entry config id :constant-iv)]
    (. builder constantIv data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :directory-structure)]
    (. builder directoryStructure data))
  (when-let [data (lookup-entry config id :discontinuity-tags)]
    (. builder discontinuityTags data))
  (when-let [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (when-let [data (lookup-entry config id :hls-cdn-settings)]
    (. builder hlsCdnSettings data))
  (when-let [data (lookup-entry config id :hls-id3-segment-tagging)]
    (. builder hlsId3SegmentTagging data))
  (when-let [data (lookup-entry config id :i-frame-only-playlists)]
    (. builder iFrameOnlyPlaylists data))
  (when-let [data (lookup-entry config id :incomplete-segment-behavior)]
    (. builder incompleteSegmentBehavior data))
  (when-let [data (lookup-entry config id :index-n-segments)]
    (. builder indexNSegments data))
  (when-let [data (lookup-entry config id :input-loss-action)]
    (. builder inputLossAction data))
  (when-let [data (lookup-entry config id :iv-in-manifest)]
    (. builder ivInManifest data))
  (when-let [data (lookup-entry config id :iv-source)]
    (. builder ivSource data))
  (when-let [data (lookup-entry config id :keep-segments)]
    (. builder keepSegments data))
  (when-let [data (lookup-entry config id :key-format)]
    (. builder keyFormat data))
  (when-let [data (lookup-entry config id :key-format-versions)]
    (. builder keyFormatVersions data))
  (when-let [data (lookup-entry config id :key-provider-settings)]
    (. builder keyProviderSettings data))
  (when-let [data (lookup-entry config id :manifest-compression)]
    (. builder manifestCompression data))
  (when-let [data (lookup-entry config id :manifest-duration-format)]
    (. builder manifestDurationFormat data))
  (when-let [data (lookup-entry config id :min-segment-length)]
    (. builder minSegmentLength data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :output-selection)]
    (. builder outputSelection data))
  (when-let [data (lookup-entry config id :program-date-time)]
    (. builder programDateTime data))
  (when-let [data (lookup-entry config id :program-date-time-clock)]
    (. builder programDateTimeClock data))
  (when-let [data (lookup-entry config id :program-date-time-period)]
    (. builder programDateTimePeriod data))
  (when-let [data (lookup-entry config id :redundant-manifest)]
    (. builder redundantManifest data))
  (when-let [data (lookup-entry config id :segment-length)]
    (. builder segmentLength data))
  (when-let [data (lookup-entry config id :segmentation-mode)]
    (. builder segmentationMode data))
  (when-let [data (lookup-entry config id :segments-per-subdirectory)]
    (. builder segmentsPerSubdirectory data))
  (when-let [data (lookup-entry config id :stream-inf-resolution)]
    (. builder streamInfResolution data))
  (when-let [data (lookup-entry config id :timed-metadata-id3-frame)]
    (. builder timedMetadataId3Frame data))
  (when-let [data (lookup-entry config id :timed-metadata-id3-period)]
    (. builder timedMetadataId3Period data))
  (when-let [data (lookup-entry config id :timestamp-delta-milliseconds)]
    (. builder timestampDeltaMilliseconds data))
  (when-let [data (lookup-entry config id :ts-file-mode)]
    (. builder tsFileMode data))
  (.build builder))


(defn build-cfn-channel-hls-input-settings-property-builder
  "The build-cfn-channel-hls-input-settings-property-builder function updates a CfnChannel$HlsInputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsInputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `bufferSegments` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buffer-segments` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `retryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-interval` |
| `scte35Source` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-source` |
"
  [^CfnChannel$HlsInputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bandwidth)]
    (. builder bandwidth data))
  (when-let [data (lookup-entry config id :buffer-segments)]
    (. builder bufferSegments data))
  (when-let [data (lookup-entry config id :retries)]
    (. builder retries data))
  (when-let [data (lookup-entry config id :retry-interval)]
    (. builder retryInterval data))
  (when-let [data (lookup-entry config id :scte35-source)]
    (. builder scte35Source data))
  (.build builder))


(defn build-cfn-channel-hls-media-store-settings-property-builder
  "The build-cfn-channel-hls-media-store-settings-property-builder function updates a CfnChannel$HlsMediaStoreSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsMediaStoreSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionRetryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-retry-interval` |
| `filecacheDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:filecache-duration` |
| `mediaStoreStorageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-store-storage-class` |
| `numRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-retries` |
| `restartDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:restart-delay` |
"
  [^CfnChannel$HlsMediaStoreSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-retry-interval)]
    (. builder connectionRetryInterval data))
  (when-let [data (lookup-entry config id :filecache-duration)]
    (. builder filecacheDuration data))
  (when-let [data (lookup-entry config id :media-store-storage-class)]
    (. builder mediaStoreStorageClass data))
  (when-let [data (lookup-entry config id :num-retries)]
    (. builder numRetries data))
  (when-let [data (lookup-entry config id :restart-delay)]
    (. builder restartDelay data))
  (.build builder))


(defn build-cfn-channel-hls-output-settings-property-builder
  "The build-cfn-channel-hls-output-settings-property-builder function updates a CfnChannel$HlsOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `h265PackagingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:h265-packaging-type` |
| `hlsSettings` | software.amazon.awscdk.services.medialive.CfnChannel$HlsSettingsProperty | [[cdk.support/lookup-entry]] | `:hls-settings` |
| `nameModifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-modifier` |
| `segmentModifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-modifier` |
"
  [^CfnChannel$HlsOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :h265-packaging-type)]
    (. builder h265PackagingType data))
  (when-let [data (lookup-entry config id :hls-settings)]
    (. builder hlsSettings data))
  (when-let [data (lookup-entry config id :name-modifier)]
    (. builder nameModifier data))
  (when-let [data (lookup-entry config id :segment-modifier)]
    (. builder segmentModifier data))
  (.build builder))


(defn build-cfn-channel-hls-s3-settings-property-builder
  "The build-cfn-channel-hls-s3-settings-property-builder function updates a CfnChannel$HlsS3SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsS3SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cannedAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:canned-acl` |
"
  [^CfnChannel$HlsS3SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :canned-acl)]
    (. builder cannedAcl data))
  (.build builder))


(defn build-cfn-channel-hls-settings-property-builder
  "The build-cfn-channel-hls-settings-property-builder function updates a CfnChannel$HlsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioOnlyHlsSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-only-hls-settings` |
| `fmp4HlsSettings` | software.amazon.awscdk.services.medialive.CfnChannel$Fmp4HlsSettingsProperty | [[cdk.support/lookup-entry]] | `:fmp4-hls-settings` |
| `frameCaptureHlsSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:frame-capture-hls-settings` |
| `standardHlsSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:standard-hls-settings` |
"
  [^CfnChannel$HlsSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-only-hls-settings)]
    (. builder audioOnlyHlsSettings data))
  (when-let [data (lookup-entry config id :fmp4-hls-settings)]
    (. builder fmp4HlsSettings data))
  (when-let [data (lookup-entry config id :frame-capture-hls-settings)]
    (. builder frameCaptureHlsSettings data))
  (when-let [data (lookup-entry config id :standard-hls-settings)]
    (. builder standardHlsSettings data))
  (.build builder))


(defn build-cfn-channel-hls-webdav-settings-property-builder
  "The build-cfn-channel-hls-webdav-settings-property-builder function updates a CfnChannel$HlsWebdavSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsWebdavSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionRetryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-retry-interval` |
| `filecacheDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:filecache-duration` |
| `httpTransferMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-transfer-mode` |
| `numRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-retries` |
| `restartDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:restart-delay` |
"
  [^CfnChannel$HlsWebdavSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-retry-interval)]
    (. builder connectionRetryInterval data))
  (when-let [data (lookup-entry config id :filecache-duration)]
    (. builder filecacheDuration data))
  (when-let [data (lookup-entry config id :http-transfer-mode)]
    (. builder httpTransferMode data))
  (when-let [data (lookup-entry config id :num-retries)]
    (. builder numRetries data))
  (when-let [data (lookup-entry config id :restart-delay)]
    (. builder restartDelay data))
  (.build builder))


(defn build-cfn-channel-html-motion-graphics-settings-property-builder
  "The build-cfn-channel-html-motion-graphics-settings-property-builder function updates a CfnChannel$HtmlMotionGraphicsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HtmlMotionGraphicsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$HtmlMotionGraphicsSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-input-attachment-property-builder
  "The build-cfn-channel-input-attachment-property-builder function updates a CfnChannel$InputAttachmentProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputAttachmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticInputFailoverSettings` | software.amazon.awscdk.services.medialive.CfnChannel$AutomaticInputFailoverSettingsProperty | [[cdk.support/lookup-entry]] | `:automatic-input-failover-settings` |
| `inputAttachmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-attachment-name` |
| `inputId` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-id` |
| `inputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-settings` |
"
  [^CfnChannel$InputAttachmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :automatic-input-failover-settings)]
    (. builder automaticInputFailoverSettings data))
  (when-let [data (lookup-entry config id :input-attachment-name)]
    (. builder inputAttachmentName data))
  (when-let [data (lookup-entry config id :input-id)]
    (. builder inputId data))
  (when-let [data (lookup-entry config id :input-settings)]
    (. builder inputSettings data))
  (.build builder))


(defn build-cfn-channel-input-channel-level-property-builder
  "The build-cfn-channel-input-channel-level-property-builder function updates a CfnChannel$InputChannelLevelProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputChannelLevelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gain` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gain` |
| `inputChannel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:input-channel` |
"
  [^CfnChannel$InputChannelLevelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :gain)]
    (. builder gain data))
  (when-let [data (lookup-entry config id :input-channel)]
    (. builder inputChannel data))
  (.build builder))


(defn build-cfn-channel-input-location-property-builder
  "The build-cfn-channel-input-location-property-builder function updates a CfnChannel$InputLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordParam` | java.lang.String | [[cdk.support/lookup-entry]] | `:password-param` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnChannel$InputLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :password-param)]
    (. builder passwordParam data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (when-let [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn build-cfn-channel-input-loss-behavior-property-builder
  "The build-cfn-channel-input-loss-behavior-property-builder function updates a CfnChannel$InputLossBehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputLossBehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blackFrameMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:black-frame-msec` |
| `inputLossImageColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-loss-image-color` |
| `inputLossImageSlate` | software.amazon.awscdk.services.medialive.CfnChannel$InputLocationProperty | [[cdk.support/lookup-entry]] | `:input-loss-image-slate` |
| `inputLossImageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-loss-image-type` |
| `repeatFrameMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:repeat-frame-msec` |
"
  [^CfnChannel$InputLossBehaviorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :black-frame-msec)]
    (. builder blackFrameMsec data))
  (when-let [data (lookup-entry config id :input-loss-image-color)]
    (. builder inputLossImageColor data))
  (when-let [data (lookup-entry config id :input-loss-image-slate)]
    (. builder inputLossImageSlate data))
  (when-let [data (lookup-entry config id :input-loss-image-type)]
    (. builder inputLossImageType data))
  (when-let [data (lookup-entry config id :repeat-frame-msec)]
    (. builder repeatFrameMsec data))
  (.build builder))


(defn build-cfn-channel-input-loss-failover-settings-property-builder
  "The build-cfn-channel-input-loss-failover-settings-property-builder function updates a CfnChannel$InputLossFailoverSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputLossFailoverSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLossThresholdMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:input-loss-threshold-msec` |
"
  [^CfnChannel$InputLossFailoverSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-loss-threshold-msec)]
    (. builder inputLossThresholdMsec data))
  (.build builder))


(defn build-cfn-channel-input-settings-property-builder
  "The build-cfn-channel-input-settings-property-builder function updates a CfnChannel$InputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-selectors` |
| `captionSelectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:caption-selectors` |
| `deblockFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:deblock-filter` |
| `denoiseFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:denoise-filter` |
| `filterStrength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:filter-strength` |
| `inputFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-filter` |
| `networkInputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-input-settings` |
| `scte35Pid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scte35-pid` |
| `smpte2038DataPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:smpte2038-data-preference` |
| `sourceEndBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-end-behavior` |
| `videoSelector` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:video-selector` |
"
  [^CfnChannel$InputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-selectors)]
    (. builder audioSelectors data))
  (when-let [data (lookup-entry config id :caption-selectors)]
    (. builder captionSelectors data))
  (when-let [data (lookup-entry config id :deblock-filter)]
    (. builder deblockFilter data))
  (when-let [data (lookup-entry config id :denoise-filter)]
    (. builder denoiseFilter data))
  (when-let [data (lookup-entry config id :filter-strength)]
    (. builder filterStrength data))
  (when-let [data (lookup-entry config id :input-filter)]
    (. builder inputFilter data))
  (when-let [data (lookup-entry config id :network-input-settings)]
    (. builder networkInputSettings data))
  (when-let [data (lookup-entry config id :scte35-pid)]
    (. builder scte35Pid data))
  (when-let [data (lookup-entry config id :smpte2038-data-preference)]
    (. builder smpte2038DataPreference data))
  (when-let [data (lookup-entry config id :source-end-behavior)]
    (. builder sourceEndBehavior data))
  (when-let [data (lookup-entry config id :video-selector)]
    (. builder videoSelector data))
  (.build builder))


(defn build-cfn-channel-input-specification-property-builder
  "The build-cfn-channel-input-specification-property-builder function updates a CfnChannel$InputSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$InputSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codec` | java.lang.String | [[cdk.support/lookup-entry]] | `:codec` |
| `maximumBitrate` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-bitrate` |
| `resolution` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution` |
"
  [^CfnChannel$InputSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :codec)]
    (. builder codec data))
  (when-let [data (lookup-entry config id :maximum-bitrate)]
    (. builder maximumBitrate data))
  (when-let [data (lookup-entry config id :resolution)]
    (. builder resolution data))
  (.build builder))


(defn build-cfn-channel-key-provider-settings-property-builder
  "The build-cfn-channel-key-provider-settings-property-builder function updates a CfnChannel$KeyProviderSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$KeyProviderSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `staticKeySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:static-key-settings` |
"
  [^CfnChannel$KeyProviderSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :static-key-settings)]
    (. builder staticKeySettings data))
  (.build builder))


(defn build-cfn-channel-m2ts-settings-property-builder
  "The build-cfn-channel-m2ts-settings-property-builder function updates a CfnChannel$M2tsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$M2tsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `absentInputAudioBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:absent-input-audio-behavior` |
| `arib` | java.lang.String | [[cdk.support/lookup-entry]] | `:arib` |
| `aribCaptionsPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:arib-captions-pid` |
| `aribCaptionsPidControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:arib-captions-pid-control` |
| `audioBufferModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-buffer-model` |
| `audioFramesPerPes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:audio-frames-per-pes` |
| `audioPids` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-pids` |
| `audioStreamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-stream-type` |
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `bufferModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:buffer-model` |
| `ccDescriptor` | java.lang.String | [[cdk.support/lookup-entry]] | `:cc-descriptor` |
| `dvbNitSettings` | software.amazon.awscdk.services.medialive.CfnChannel$DvbNitSettingsProperty | [[cdk.support/lookup-entry]] | `:dvb-nit-settings` |
| `dvbSdtSettings` | software.amazon.awscdk.services.medialive.CfnChannel$DvbSdtSettingsProperty | [[cdk.support/lookup-entry]] | `:dvb-sdt-settings` |
| `dvbSubPids` | java.lang.String | [[cdk.support/lookup-entry]] | `:dvb-sub-pids` |
| `dvbTdtSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dvb-tdt-settings` |
| `dvbTeletextPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:dvb-teletext-pid` |
| `ebif` | java.lang.String | [[cdk.support/lookup-entry]] | `:ebif` |
| `ebpAudioInterval` | java.lang.String | [[cdk.support/lookup-entry]] | `:ebp-audio-interval` |
| `ebpLookaheadMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebp-lookahead-ms` |
| `ebpPlacement` | java.lang.String | [[cdk.support/lookup-entry]] | `:ebp-placement` |
| `ecmPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecm-pid` |
| `esRateInPes` | java.lang.String | [[cdk.support/lookup-entry]] | `:es-rate-in-pes` |
| `etvPlatformPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:etv-platform-pid` |
| `etvSignalPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:etv-signal-pid` |
| `fragmentTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:fragment-time` |
| `klv` | java.lang.String | [[cdk.support/lookup-entry]] | `:klv` |
| `klvDataPids` | java.lang.String | [[cdk.support/lookup-entry]] | `:klv-data-pids` |
| `nielsenId3Behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:nielsen-id3-behavior` |
| `nullPacketBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:null-packet-bitrate` |
| `patInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pat-interval` |
| `pcrControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:pcr-control` |
| `pcrPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pcr-period` |
| `pcrPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:pcr-pid` |
| `pmtInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pmt-interval` |
| `pmtPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:pmt-pid` |
| `programNum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-num` |
| `rateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rate-mode` |
| `scte27Pids` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte27-pids` |
| `scte35Control` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-control` |
| `scte35Pid` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-pid` |
| `scte35PrerollPullupMilliseconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scte35-preroll-pullup-milliseconds` |
| `segmentationMarkers` | java.lang.String | [[cdk.support/lookup-entry]] | `:segmentation-markers` |
| `segmentationStyle` | java.lang.String | [[cdk.support/lookup-entry]] | `:segmentation-style` |
| `segmentationTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segmentation-time` |
| `timedMetadataBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-behavior` |
| `timedMetadataPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-pid` |
| `transportStreamId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transport-stream-id` |
| `videoPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-pid` |
"
  [^CfnChannel$M2tsSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :absent-input-audio-behavior)]
    (. builder absentInputAudioBehavior data))
  (when-let [data (lookup-entry config id :arib)]
    (. builder arib data))
  (when-let [data (lookup-entry config id :arib-captions-pid)]
    (. builder aribCaptionsPid data))
  (when-let [data (lookup-entry config id :arib-captions-pid-control)]
    (. builder aribCaptionsPidControl data))
  (when-let [data (lookup-entry config id :audio-buffer-model)]
    (. builder audioBufferModel data))
  (when-let [data (lookup-entry config id :audio-frames-per-pes)]
    (. builder audioFramesPerPes data))
  (when-let [data (lookup-entry config id :audio-pids)]
    (. builder audioPids data))
  (when-let [data (lookup-entry config id :audio-stream-type)]
    (. builder audioStreamType data))
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :buffer-model)]
    (. builder bufferModel data))
  (when-let [data (lookup-entry config id :cc-descriptor)]
    (. builder ccDescriptor data))
  (when-let [data (lookup-entry config id :dvb-nit-settings)]
    (. builder dvbNitSettings data))
  (when-let [data (lookup-entry config id :dvb-sdt-settings)]
    (. builder dvbSdtSettings data))
  (when-let [data (lookup-entry config id :dvb-sub-pids)]
    (. builder dvbSubPids data))
  (when-let [data (lookup-entry config id :dvb-tdt-settings)]
    (. builder dvbTdtSettings data))
  (when-let [data (lookup-entry config id :dvb-teletext-pid)]
    (. builder dvbTeletextPid data))
  (when-let [data (lookup-entry config id :ebif)]
    (. builder ebif data))
  (when-let [data (lookup-entry config id :ebp-audio-interval)]
    (. builder ebpAudioInterval data))
  (when-let [data (lookup-entry config id :ebp-lookahead-ms)]
    (. builder ebpLookaheadMs data))
  (when-let [data (lookup-entry config id :ebp-placement)]
    (. builder ebpPlacement data))
  (when-let [data (lookup-entry config id :ecm-pid)]
    (. builder ecmPid data))
  (when-let [data (lookup-entry config id :es-rate-in-pes)]
    (. builder esRateInPes data))
  (when-let [data (lookup-entry config id :etv-platform-pid)]
    (. builder etvPlatformPid data))
  (when-let [data (lookup-entry config id :etv-signal-pid)]
    (. builder etvSignalPid data))
  (when-let [data (lookup-entry config id :fragment-time)]
    (. builder fragmentTime data))
  (when-let [data (lookup-entry config id :klv)]
    (. builder klv data))
  (when-let [data (lookup-entry config id :klv-data-pids)]
    (. builder klvDataPids data))
  (when-let [data (lookup-entry config id :nielsen-id3-behavior)]
    (. builder nielsenId3Behavior data))
  (when-let [data (lookup-entry config id :null-packet-bitrate)]
    (. builder nullPacketBitrate data))
  (when-let [data (lookup-entry config id :pat-interval)]
    (. builder patInterval data))
  (when-let [data (lookup-entry config id :pcr-control)]
    (. builder pcrControl data))
  (when-let [data (lookup-entry config id :pcr-period)]
    (. builder pcrPeriod data))
  (when-let [data (lookup-entry config id :pcr-pid)]
    (. builder pcrPid data))
  (when-let [data (lookup-entry config id :pmt-interval)]
    (. builder pmtInterval data))
  (when-let [data (lookup-entry config id :pmt-pid)]
    (. builder pmtPid data))
  (when-let [data (lookup-entry config id :program-num)]
    (. builder programNum data))
  (when-let [data (lookup-entry config id :rate-mode)]
    (. builder rateMode data))
  (when-let [data (lookup-entry config id :scte27-pids)]
    (. builder scte27Pids data))
  (when-let [data (lookup-entry config id :scte35-control)]
    (. builder scte35Control data))
  (when-let [data (lookup-entry config id :scte35-pid)]
    (. builder scte35Pid data))
  (when-let [data (lookup-entry config id :scte35-preroll-pullup-milliseconds)]
    (. builder scte35PrerollPullupMilliseconds data))
  (when-let [data (lookup-entry config id :segmentation-markers)]
    (. builder segmentationMarkers data))
  (when-let [data (lookup-entry config id :segmentation-style)]
    (. builder segmentationStyle data))
  (when-let [data (lookup-entry config id :segmentation-time)]
    (. builder segmentationTime data))
  (when-let [data (lookup-entry config id :timed-metadata-behavior)]
    (. builder timedMetadataBehavior data))
  (when-let [data (lookup-entry config id :timed-metadata-pid)]
    (. builder timedMetadataPid data))
  (when-let [data (lookup-entry config id :transport-stream-id)]
    (. builder transportStreamId data))
  (when-let [data (lookup-entry config id :video-pid)]
    (. builder videoPid data))
  (.build builder))


(defn build-cfn-channel-m3u8-settings-property-builder
  "The build-cfn-channel-m3u8-settings-property-builder function updates a CfnChannel$M3u8SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$M3u8SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioFramesPerPes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:audio-frames-per-pes` |
| `audioPids` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-pids` |
| `ecmPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecm-pid` |
| `klvBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:klv-behavior` |
| `klvDataPids` | java.lang.String | [[cdk.support/lookup-entry]] | `:klv-data-pids` |
| `nielsenId3Behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:nielsen-id3-behavior` |
| `patInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pat-interval` |
| `pcrControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:pcr-control` |
| `pcrPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pcr-period` |
| `pcrPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:pcr-pid` |
| `pmtInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pmt-interval` |
| `pmtPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:pmt-pid` |
| `programNum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-num` |
| `scte35Behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-behavior` |
| `scte35Pid` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte35-pid` |
| `timedMetadataBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-behavior` |
| `timedMetadataPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-pid` |
| `transportStreamId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transport-stream-id` |
| `videoPid` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-pid` |
"
  [^CfnChannel$M3u8SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-frames-per-pes)]
    (. builder audioFramesPerPes data))
  (when-let [data (lookup-entry config id :audio-pids)]
    (. builder audioPids data))
  (when-let [data (lookup-entry config id :ecm-pid)]
    (. builder ecmPid data))
  (when-let [data (lookup-entry config id :klv-behavior)]
    (. builder klvBehavior data))
  (when-let [data (lookup-entry config id :klv-data-pids)]
    (. builder klvDataPids data))
  (when-let [data (lookup-entry config id :nielsen-id3-behavior)]
    (. builder nielsenId3Behavior data))
  (when-let [data (lookup-entry config id :pat-interval)]
    (. builder patInterval data))
  (when-let [data (lookup-entry config id :pcr-control)]
    (. builder pcrControl data))
  (when-let [data (lookup-entry config id :pcr-period)]
    (. builder pcrPeriod data))
  (when-let [data (lookup-entry config id :pcr-pid)]
    (. builder pcrPid data))
  (when-let [data (lookup-entry config id :pmt-interval)]
    (. builder pmtInterval data))
  (when-let [data (lookup-entry config id :pmt-pid)]
    (. builder pmtPid data))
  (when-let [data (lookup-entry config id :program-num)]
    (. builder programNum data))
  (when-let [data (lookup-entry config id :scte35-behavior)]
    (. builder scte35Behavior data))
  (when-let [data (lookup-entry config id :scte35-pid)]
    (. builder scte35Pid data))
  (when-let [data (lookup-entry config id :timed-metadata-behavior)]
    (. builder timedMetadataBehavior data))
  (when-let [data (lookup-entry config id :timed-metadata-pid)]
    (. builder timedMetadataPid data))
  (when-let [data (lookup-entry config id :transport-stream-id)]
    (. builder transportStreamId data))
  (when-let [data (lookup-entry config id :video-pid)]
    (. builder videoPid data))
  (.build builder))


(defn build-cfn-channel-maintenance-create-settings-property-builder
  "The build-cfn-channel-maintenance-create-settings-property-builder function updates a CfnChannel$MaintenanceCreateSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MaintenanceCreateSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maintenanceDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-day` |
| `maintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-start-time` |
"
  [^CfnChannel$MaintenanceCreateSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maintenance-day)]
    (. builder maintenanceDay data))
  (when-let [data (lookup-entry config id :maintenance-start-time)]
    (. builder maintenanceStartTime data))
  (.build builder))


(defn build-cfn-channel-maintenance-update-settings-property-builder
  "The build-cfn-channel-maintenance-update-settings-property-builder function updates a CfnChannel$MaintenanceUpdateSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MaintenanceUpdateSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maintenanceDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-day` |
| `maintenanceScheduledDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-scheduled-date` |
| `maintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-start-time` |
"
  [^CfnChannel$MaintenanceUpdateSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maintenance-day)]
    (. builder maintenanceDay data))
  (when-let [data (lookup-entry config id :maintenance-scheduled-date)]
    (. builder maintenanceScheduledDate data))
  (when-let [data (lookup-entry config id :maintenance-start-time)]
    (. builder maintenanceStartTime data))
  (.build builder))


(defn build-cfn-channel-media-package-group-settings-property-builder
  "The build-cfn-channel-media-package-group-settings-property-builder function updates a CfnChannel$MediaPackageGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MediaPackageGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^CfnChannel$MediaPackageGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn build-cfn-channel-media-package-output-destination-settings-property-builder
  "The build-cfn-channel-media-package-output-destination-settings-property-builder function updates a CfnChannel$MediaPackageOutputDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MediaPackageOutputDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
"
  [^CfnChannel$MediaPackageOutputDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (.build builder))


(defn build-cfn-channel-media-package-output-settings-property-builder
  "The build-cfn-channel-media-package-output-settings-property-builder function updates a CfnChannel$MediaPackageOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MediaPackageOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$MediaPackageOutputSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-motion-graphics-configuration-property-builder
  "The build-cfn-channel-motion-graphics-configuration-property-builder function updates a CfnChannel$MotionGraphicsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MotionGraphicsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `motionGraphicsInsertion` | java.lang.String | [[cdk.support/lookup-entry]] | `:motion-graphics-insertion` |
| `motionGraphicsSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:motion-graphics-settings` |
"
  [^CfnChannel$MotionGraphicsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :motion-graphics-insertion)]
    (. builder motionGraphicsInsertion data))
  (when-let [data (lookup-entry config id :motion-graphics-settings)]
    (. builder motionGraphicsSettings data))
  (.build builder))


(defn build-cfn-channel-motion-graphics-settings-property-builder
  "The build-cfn-channel-motion-graphics-settings-property-builder function updates a CfnChannel$MotionGraphicsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MotionGraphicsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `htmlMotionGraphicsSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:html-motion-graphics-settings` |
"
  [^CfnChannel$MotionGraphicsSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :html-motion-graphics-settings)]
    (. builder htmlMotionGraphicsSettings data))
  (.build builder))


(defn build-cfn-channel-mp2-settings-property-builder
  "The build-cfn-channel-mp2-settings-property-builder function updates a CfnChannel$Mp2SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Mp2SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bitrate` |
| `codingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:coding-mode` |
| `sampleRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sample-rate` |
"
  [^CfnChannel$Mp2SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bitrate)]
    (. builder bitrate data))
  (when-let [data (lookup-entry config id :coding-mode)]
    (. builder codingMode data))
  (when-let [data (lookup-entry config id :sample-rate)]
    (. builder sampleRate data))
  (.build builder))


(defn build-cfn-channel-mpeg2-filter-settings-property-builder
  "The build-cfn-channel-mpeg2-filter-settings-property-builder function updates a CfnChannel$Mpeg2FilterSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Mpeg2FilterSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `temporalFilterSettings` | software.amazon.awscdk.services.medialive.CfnChannel$TemporalFilterSettingsProperty | [[cdk.support/lookup-entry]] | `:temporal-filter-settings` |
"
  [^CfnChannel$Mpeg2FilterSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :temporal-filter-settings)]
    (. builder temporalFilterSettings data))
  (.build builder))


(defn build-cfn-channel-mpeg2-settings-property-builder
  "The build-cfn-channel-mpeg2-settings-property-builder function updates a CfnChannel$Mpeg2SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Mpeg2SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adaptiveQuantization` | java.lang.String | [[cdk.support/lookup-entry]] | `:adaptive-quantization` |
| `afdSignaling` | java.lang.String | [[cdk.support/lookup-entry]] | `:afd-signaling` |
| `colorMetadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:color-metadata` |
| `colorSpace` | java.lang.String | [[cdk.support/lookup-entry]] | `:color-space` |
| `displayAspectRatio` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-aspect-ratio` |
| `filterSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-settings` |
| `fixedAfd` | java.lang.String | [[cdk.support/lookup-entry]] | `:fixed-afd` |
| `framerateDenominator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate-denominator` |
| `framerateNumerator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:framerate-numerator` |
| `gopClosedCadence` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-closed-cadence` |
| `gopNumBFrames` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-num-b-frames` |
| `gopSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gop-size` |
| `gopSizeUnits` | java.lang.String | [[cdk.support/lookup-entry]] | `:gop-size-units` |
| `scanType` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-type` |
| `subgopLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:subgop-length` |
| `timecodeBurninSettings` | software.amazon.awscdk.services.medialive.CfnChannel$TimecodeBurninSettingsProperty | [[cdk.support/lookup-entry]] | `:timecode-burnin-settings` |
| `timecodeInsertion` | java.lang.String | [[cdk.support/lookup-entry]] | `:timecode-insertion` |
"
  [^CfnChannel$Mpeg2SettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :adaptive-quantization)]
    (. builder adaptiveQuantization data))
  (when-let [data (lookup-entry config id :afd-signaling)]
    (. builder afdSignaling data))
  (when-let [data (lookup-entry config id :color-metadata)]
    (. builder colorMetadata data))
  (when-let [data (lookup-entry config id :color-space)]
    (. builder colorSpace data))
  (when-let [data (lookup-entry config id :display-aspect-ratio)]
    (. builder displayAspectRatio data))
  (when-let [data (lookup-entry config id :filter-settings)]
    (. builder filterSettings data))
  (when-let [data (lookup-entry config id :fixed-afd)]
    (. builder fixedAfd data))
  (when-let [data (lookup-entry config id :framerate-denominator)]
    (. builder framerateDenominator data))
  (when-let [data (lookup-entry config id :framerate-numerator)]
    (. builder framerateNumerator data))
  (when-let [data (lookup-entry config id :gop-closed-cadence)]
    (. builder gopClosedCadence data))
  (when-let [data (lookup-entry config id :gop-num-b-frames)]
    (. builder gopNumBFrames data))
  (when-let [data (lookup-entry config id :gop-size)]
    (. builder gopSize data))
  (when-let [data (lookup-entry config id :gop-size-units)]
    (. builder gopSizeUnits data))
  (when-let [data (lookup-entry config id :scan-type)]
    (. builder scanType data))
  (when-let [data (lookup-entry config id :subgop-length)]
    (. builder subgopLength data))
  (when-let [data (lookup-entry config id :timecode-burnin-settings)]
    (. builder timecodeBurninSettings data))
  (when-let [data (lookup-entry config id :timecode-insertion)]
    (. builder timecodeInsertion data))
  (.build builder))


(defn build-cfn-channel-ms-smooth-group-settings-property-builder
  "The build-cfn-channel-ms-smooth-group-settings-property-builder function updates a CfnChannel$MsSmoothGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MsSmoothGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acquisitionPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:acquisition-point-id` |
| `audioOnlyTimecodeControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-only-timecode-control` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `connectionRetryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-retry-interval` |
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `eventId` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-id` |
| `eventIdMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-id-mode` |
| `eventStopBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-stop-behavior` |
| `filecacheDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:filecache-duration` |
| `fragmentLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:fragment-length` |
| `inputLossAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-loss-action` |
| `numRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-retries` |
| `restartDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:restart-delay` |
| `segmentationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:segmentation-mode` |
| `sendDelayMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:send-delay-ms` |
| `sparseTrackType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sparse-track-type` |
| `streamManifestBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-manifest-behavior` |
| `timestampOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-offset` |
| `timestampOffsetMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-offset-mode` |
"
  [^CfnChannel$MsSmoothGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acquisition-point-id)]
    (. builder acquisitionPointId data))
  (when-let [data (lookup-entry config id :audio-only-timecode-control)]
    (. builder audioOnlyTimecodeControl data))
  (when-let [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-let [data (lookup-entry config id :connection-retry-interval)]
    (. builder connectionRetryInterval data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :event-id)]
    (. builder eventId data))
  (when-let [data (lookup-entry config id :event-id-mode)]
    (. builder eventIdMode data))
  (when-let [data (lookup-entry config id :event-stop-behavior)]
    (. builder eventStopBehavior data))
  (when-let [data (lookup-entry config id :filecache-duration)]
    (. builder filecacheDuration data))
  (when-let [data (lookup-entry config id :fragment-length)]
    (. builder fragmentLength data))
  (when-let [data (lookup-entry config id :input-loss-action)]
    (. builder inputLossAction data))
  (when-let [data (lookup-entry config id :num-retries)]
    (. builder numRetries data))
  (when-let [data (lookup-entry config id :restart-delay)]
    (. builder restartDelay data))
  (when-let [data (lookup-entry config id :segmentation-mode)]
    (. builder segmentationMode data))
  (when-let [data (lookup-entry config id :send-delay-ms)]
    (. builder sendDelayMs data))
  (when-let [data (lookup-entry config id :sparse-track-type)]
    (. builder sparseTrackType data))
  (when-let [data (lookup-entry config id :stream-manifest-behavior)]
    (. builder streamManifestBehavior data))
  (when-let [data (lookup-entry config id :timestamp-offset)]
    (. builder timestampOffset data))
  (when-let [data (lookup-entry config id :timestamp-offset-mode)]
    (. builder timestampOffsetMode data))
  (.build builder))


(defn build-cfn-channel-ms-smooth-output-settings-property-builder
  "The build-cfn-channel-ms-smooth-output-settings-property-builder function updates a CfnChannel$MsSmoothOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MsSmoothOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `h265PackagingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:h265-packaging-type` |
| `nameModifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:name-modifier` |
"
  [^CfnChannel$MsSmoothOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :h265-packaging-type)]
    (. builder h265PackagingType data))
  (when-let [data (lookup-entry config id :name-modifier)]
    (. builder nameModifier data))
  (.build builder))


(defn build-cfn-channel-multiplex-group-settings-property-builder
  "The build-cfn-channel-multiplex-group-settings-property-builder function updates a CfnChannel$MultiplexGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MultiplexGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$MultiplexGroupSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-multiplex-output-settings-property-builder
  "The build-cfn-channel-multiplex-output-settings-property-builder function updates a CfnChannel$MultiplexOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MultiplexOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
"
  [^CfnChannel$MultiplexOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (.build builder))


(defn build-cfn-channel-multiplex-program-channel-destination-settings-property-builder
  "The build-cfn-channel-multiplex-program-channel-destination-settings-property-builder function updates a CfnChannel$MultiplexProgramChannelDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$MultiplexProgramChannelDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multiplexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiplex-id` |
| `programName` | java.lang.String | [[cdk.support/lookup-entry]] | `:program-name` |
"
  [^CfnChannel$MultiplexProgramChannelDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :multiplex-id)]
    (. builder multiplexId data))
  (when-let [data (lookup-entry config id :program-name)]
    (. builder programName data))
  (.build builder))


(defn build-cfn-channel-network-input-settings-property-builder
  "The build-cfn-channel-network-input-settings-property-builder function updates a CfnChannel$NetworkInputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$NetworkInputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hlsInputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-input-settings` |
| `serverValidation` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-validation` |
"
  [^CfnChannel$NetworkInputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hls-input-settings)]
    (. builder hlsInputSettings data))
  (when-let [data (lookup-entry config id :server-validation)]
    (. builder serverValidation data))
  (.build builder))


(defn build-cfn-channel-nielsen-cbet-property-builder
  "The build-cfn-channel-nielsen-cbet-property-builder function updates a CfnChannel$NielsenCBETProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$NielsenCBETProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cbetCheckDigitString` | java.lang.String | [[cdk.support/lookup-entry]] | `:cbet-check-digit-string` |
| `cbetStepaside` | java.lang.String | [[cdk.support/lookup-entry]] | `:cbet-stepaside` |
| `csid` | java.lang.String | [[cdk.support/lookup-entry]] | `:csid` |
"
  [^CfnChannel$NielsenCBETProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cbet-check-digit-string)]
    (. builder cbetCheckDigitString data))
  (when-let [data (lookup-entry config id :cbet-stepaside)]
    (. builder cbetStepaside data))
  (when-let [data (lookup-entry config id :csid)]
    (. builder csid data))
  (.build builder))


(defn build-cfn-channel-nielsen-configuration-property-builder
  "The build-cfn-channel-nielsen-configuration-property-builder function updates a CfnChannel$NielsenConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$NielsenConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributor-id` |
| `nielsenPcmToId3Tagging` | java.lang.String | [[cdk.support/lookup-entry]] | `:nielsen-pcm-to-id3-tagging` |
"
  [^CfnChannel$NielsenConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :distributor-id)]
    (. builder distributorId data))
  (when-let [data (lookup-entry config id :nielsen-pcm-to-id3-tagging)]
    (. builder nielsenPcmToId3Tagging data))
  (.build builder))


(defn build-cfn-channel-nielsen-naes-ii-nw-property-builder
  "The build-cfn-channel-nielsen-naes-ii-nw-property-builder function updates a CfnChannel$NielsenNaesIiNwProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$NielsenNaesIiNwProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `checkDigitString` | java.lang.String | [[cdk.support/lookup-entry]] | `:check-digit-string` |
| `sid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sid` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
"
  [^CfnChannel$NielsenNaesIiNwProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :check-digit-string)]
    (. builder checkDigitString data))
  (when-let [data (lookup-entry config id :sid)]
    (. builder sid data))
  (when-let [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (.build builder))


(defn build-cfn-channel-nielsen-watermarks-settings-property-builder
  "The build-cfn-channel-nielsen-watermarks-settings-property-builder function updates a CfnChannel$NielsenWatermarksSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$NielsenWatermarksSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nielsenCbetSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nielsen-cbet-settings` |
| `nielsenDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:nielsen-distribution-type` |
| `nielsenNaesIiNwSettings` | software.amazon.awscdk.services.medialive.CfnChannel$NielsenNaesIiNwProperty | [[cdk.support/lookup-entry]] | `:nielsen-naes-ii-nw-settings` |
"
  [^CfnChannel$NielsenWatermarksSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :nielsen-cbet-settings)]
    (. builder nielsenCbetSettings data))
  (when-let [data (lookup-entry config id :nielsen-distribution-type)]
    (. builder nielsenDistributionType data))
  (when-let [data (lookup-entry config id :nielsen-naes-ii-nw-settings)]
    (. builder nielsenNaesIiNwSettings data))
  (.build builder))


(defn build-cfn-channel-output-destination-property-builder
  "The build-cfn-channel-output-destination-property-builder function updates a CfnChannel$OutputDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `mediaPackageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-package-settings` |
| `multiplexSettings` | software.amazon.awscdk.services.medialive.CfnChannel$MultiplexProgramChannelDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:multiplex-settings` |
| `settings` | java.util.List | [[cdk.support/lookup-entry]] | `:settings` |
"
  [^CfnChannel$OutputDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :media-package-settings)]
    (. builder mediaPackageSettings data))
  (when-let [data (lookup-entry config id :multiplex-settings)]
    (. builder multiplexSettings data))
  (when-let [data (lookup-entry config id :settings)]
    (. builder settings data))
  (.build builder))


(defn build-cfn-channel-output-destination-settings-property-builder
  "The build-cfn-channel-output-destination-settings-property-builder function updates a CfnChannel$OutputDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordParam` | java.lang.String | [[cdk.support/lookup-entry]] | `:password-param` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnChannel$OutputDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :password-param)]
    (. builder passwordParam data))
  (when-let [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (when-let [data (lookup-entry config id :url)]
    (. builder url data))
  (when-let [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn build-cfn-channel-output-group-property-builder
  "The build-cfn-channel-output-group-property-builder function updates a CfnChannel$OutputGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputGroupSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-group-settings` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
"
  [^CfnChannel$OutputGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :output-group-settings)]
    (. builder outputGroupSettings data))
  (when-let [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (.build builder))


(defn build-cfn-channel-output-group-settings-property-builder
  "The build-cfn-channel-output-group-settings-property-builder function updates a CfnChannel$OutputGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveGroupSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:archive-group-settings` |
| `cmafIngestGroupSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cmaf-ingest-group-settings` |
| `frameCaptureGroupSettings` | software.amazon.awscdk.services.medialive.CfnChannel$FrameCaptureGroupSettingsProperty | [[cdk.support/lookup-entry]] | `:frame-capture-group-settings` |
| `hlsGroupSettings` | software.amazon.awscdk.services.medialive.CfnChannel$HlsGroupSettingsProperty | [[cdk.support/lookup-entry]] | `:hls-group-settings` |
| `mediaPackageGroupSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-package-group-settings` |
| `msSmoothGroupSettings` | software.amazon.awscdk.services.medialive.CfnChannel$MsSmoothGroupSettingsProperty | [[cdk.support/lookup-entry]] | `:ms-smooth-group-settings` |
| `multiplexGroupSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multiplex-group-settings` |
| `rtmpGroupSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rtmp-group-settings` |
| `udpGroupSettings` | software.amazon.awscdk.services.medialive.CfnChannel$UdpGroupSettingsProperty | [[cdk.support/lookup-entry]] | `:udp-group-settings` |
"
  [^CfnChannel$OutputGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-group-settings)]
    (. builder archiveGroupSettings data))
  (when-let [data (lookup-entry config id :cmaf-ingest-group-settings)]
    (. builder cmafIngestGroupSettings data))
  (when-let [data (lookup-entry config id :frame-capture-group-settings)]
    (. builder frameCaptureGroupSettings data))
  (when-let [data (lookup-entry config id :hls-group-settings)]
    (. builder hlsGroupSettings data))
  (when-let [data (lookup-entry config id :media-package-group-settings)]
    (. builder mediaPackageGroupSettings data))
  (when-let [data (lookup-entry config id :ms-smooth-group-settings)]
    (. builder msSmoothGroupSettings data))
  (when-let [data (lookup-entry config id :multiplex-group-settings)]
    (. builder multiplexGroupSettings data))
  (when-let [data (lookup-entry config id :rtmp-group-settings)]
    (. builder rtmpGroupSettings data))
  (when-let [data (lookup-entry config id :udp-group-settings)]
    (. builder udpGroupSettings data))
  (.build builder))


(defn build-cfn-channel-output-location-ref-property-builder
  "The build-cfn-channel-output-location-ref-property-builder function updates a CfnChannel$OutputLocationRefProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputLocationRefProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationRefId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ref-id` |
"
  [^CfnChannel$OutputLocationRefProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-ref-id)]
    (. builder destinationRefId data))
  (.build builder))


(defn build-cfn-channel-output-locking-settings-property-builder
  "The build-cfn-channel-output-locking-settings-property-builder function updates a CfnChannel$OutputLockingSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputLockingSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `epochLockingSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:epoch-locking-settings` |
| `pipelineLockingSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pipeline-locking-settings` |
"
  [^CfnChannel$OutputLockingSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :epoch-locking-settings)]
    (. builder epochLockingSettings data))
  (when-let [data (lookup-entry config id :pipeline-locking-settings)]
    (. builder pipelineLockingSettings data))
  (.build builder))


(defn build-cfn-channel-output-property-builder
  "The build-cfn-channel-output-property-builder function updates a CfnChannel$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioDescriptionNames` | java.util.List | [[cdk.support/lookup-entry]] | `:audio-description-names` |
| `captionDescriptionNames` | java.util.List | [[cdk.support/lookup-entry]] | `:caption-description-names` |
| `outputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-name` |
| `outputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-settings` |
| `videoDescriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-description-name` |
"
  [^CfnChannel$OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-description-names)]
    (. builder audioDescriptionNames data))
  (when-let [data (lookup-entry config id :caption-description-names)]
    (. builder captionDescriptionNames data))
  (when-let [data (lookup-entry config id :output-name)]
    (. builder outputName data))
  (when-let [data (lookup-entry config id :output-settings)]
    (. builder outputSettings data))
  (when-let [data (lookup-entry config id :video-description-name)]
    (. builder videoDescriptionName data))
  (.build builder))


(defn build-cfn-channel-output-settings-property-builder
  "The build-cfn-channel-output-settings-property-builder function updates a CfnChannel$OutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$OutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveOutputSettings` | software.amazon.awscdk.services.medialive.CfnChannel$ArchiveOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:archive-output-settings` |
| `cmafIngestOutputSettings` | software.amazon.awscdk.services.medialive.CfnChannel$CmafIngestOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:cmaf-ingest-output-settings` |
| `frameCaptureOutputSettings` | software.amazon.awscdk.services.medialive.CfnChannel$FrameCaptureOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:frame-capture-output-settings` |
| `hlsOutputSettings` | software.amazon.awscdk.services.medialive.CfnChannel$HlsOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:hls-output-settings` |
| `mediaPackageOutputSettings` | software.amazon.awscdk.services.medialive.CfnChannel$MediaPackageOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:media-package-output-settings` |
| `msSmoothOutputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ms-smooth-output-settings` |
| `multiplexOutputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multiplex-output-settings` |
| `rtmpOutputSettings` | software.amazon.awscdk.services.medialive.CfnChannel$RtmpOutputSettingsProperty | [[cdk.support/lookup-entry]] | `:rtmp-output-settings` |
| `udpOutputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:udp-output-settings` |
"
  [^CfnChannel$OutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-output-settings)]
    (. builder archiveOutputSettings data))
  (when-let [data (lookup-entry config id :cmaf-ingest-output-settings)]
    (. builder cmafIngestOutputSettings data))
  (when-let [data (lookup-entry config id :frame-capture-output-settings)]
    (. builder frameCaptureOutputSettings data))
  (when-let [data (lookup-entry config id :hls-output-settings)]
    (. builder hlsOutputSettings data))
  (when-let [data (lookup-entry config id :media-package-output-settings)]
    (. builder mediaPackageOutputSettings data))
  (when-let [data (lookup-entry config id :ms-smooth-output-settings)]
    (. builder msSmoothOutputSettings data))
  (when-let [data (lookup-entry config id :multiplex-output-settings)]
    (. builder multiplexOutputSettings data))
  (when-let [data (lookup-entry config id :rtmp-output-settings)]
    (. builder rtmpOutputSettings data))
  (when-let [data (lookup-entry config id :udp-output-settings)]
    (. builder udpOutputSettings data))
  (.build builder))


(defn build-cfn-channel-pass-through-settings-property-builder
  "The build-cfn-channel-pass-through-settings-property-builder function updates a CfnChannel$PassThroughSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$PassThroughSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$PassThroughSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-props-builder
  "The build-cfn-channel-props-builder function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdiInputSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cdi-input-specification` |
| `channelClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-class` |
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `encoderSettings` | software.amazon.awscdk.services.medialive.CfnChannel$EncoderSettingsProperty | [[cdk.support/lookup-entry]] | `:encoder-settings` |
| `inputAttachments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-attachments` |
| `inputSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-specification` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `maintenance` | software.amazon.awscdk.services.medialive.CfnChannel$MaintenanceCreateSettingsProperty | [[cdk.support/lookup-entry]] | `:maintenance` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cdi-input-specification)]
    (. builder cdiInputSpecification data))
  (when-let [data (lookup-entry config id :channel-class)]
    (. builder channelClass data))
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :encoder-settings)]
    (. builder encoderSettings data))
  (when-let [data (lookup-entry config id :input-attachments)]
    (. builder inputAttachments data))
  (when-let [data (lookup-entry config id :input-specification)]
    (. builder inputSpecification data))
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :maintenance)]
    (. builder maintenance data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn build-cfn-channel-raw-settings-property-builder
  "The build-cfn-channel-raw-settings-property-builder function updates a CfnChannel$RawSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RawSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$RawSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-rec601-settings-property-builder
  "The build-cfn-channel-rec601-settings-property-builder function updates a CfnChannel$Rec601SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Rec601SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$Rec601SettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-rec709-settings-property-builder
  "The build-cfn-channel-rec709-settings-property-builder function updates a CfnChannel$Rec709SettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Rec709SettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$Rec709SettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-remix-settings-property-builder
  "The build-cfn-channel-remix-settings-property-builder function updates a CfnChannel$RemixSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RemixSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-mappings` |
| `channelsIn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:channels-in` |
| `channelsOut` | java.lang.Number | [[cdk.support/lookup-entry]] | `:channels-out` |
"
  [^CfnChannel$RemixSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-mappings)]
    (. builder channelMappings data))
  (when-let [data (lookup-entry config id :channels-in)]
    (. builder channelsIn data))
  (when-let [data (lookup-entry config id :channels-out)]
    (. builder channelsOut data))
  (.build builder))


(defn build-cfn-channel-rtmp-caption-info-destination-settings-property-builder
  "The build-cfn-channel-rtmp-caption-info-destination-settings-property-builder function updates a CfnChannel$RtmpCaptionInfoDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RtmpCaptionInfoDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$RtmpCaptionInfoDestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-rtmp-group-settings-property-builder
  "The build-cfn-channel-rtmp-group-settings-property-builder function updates a CfnChannel$RtmpGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RtmpGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkers` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-markers` |
| `authenticationScheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-scheme` |
| `cacheFullBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-full-behavior` |
| `cacheLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cache-length` |
| `captionData` | java.lang.String | [[cdk.support/lookup-entry]] | `:caption-data` |
| `includeFillerNalUnits` | java.lang.String | [[cdk.support/lookup-entry]] | `:include-filler-nal-units` |
| `inputLossAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-loss-action` |
| `restartDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:restart-delay` |
"
  [^CfnChannel$RtmpGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ad-markers)]
    (. builder adMarkers data))
  (when-let [data (lookup-entry config id :authentication-scheme)]
    (. builder authenticationScheme data))
  (when-let [data (lookup-entry config id :cache-full-behavior)]
    (. builder cacheFullBehavior data))
  (when-let [data (lookup-entry config id :cache-length)]
    (. builder cacheLength data))
  (when-let [data (lookup-entry config id :caption-data)]
    (. builder captionData data))
  (when-let [data (lookup-entry config id :include-filler-nal-units)]
    (. builder includeFillerNalUnits data))
  (when-let [data (lookup-entry config id :input-loss-action)]
    (. builder inputLossAction data))
  (when-let [data (lookup-entry config id :restart-delay)]
    (. builder restartDelay data))
  (.build builder))


(defn build-cfn-channel-rtmp-output-settings-property-builder
  "The build-cfn-channel-rtmp-output-settings-property-builder function updates a CfnChannel$RtmpOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$RtmpOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `connectionRetryInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-retry-interval` |
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `numRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-retries` |
"
  [^CfnChannel$RtmpOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-let [data (lookup-entry config id :connection-retry-interval)]
    (. builder connectionRetryInterval data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :num-retries)]
    (. builder numRetries data))
  (.build builder))


(defn build-cfn-channel-scte20-plus-embedded-destination-settings-property-builder
  "The build-cfn-channel-scte20-plus-embedded-destination-settings-property-builder function updates a CfnChannel$Scte20PlusEmbeddedDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Scte20PlusEmbeddedDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$Scte20PlusEmbeddedDestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-scte20-source-settings-property-builder
  "The build-cfn-channel-scte20-source-settings-property-builder function updates a CfnChannel$Scte20SourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Scte20SourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `convert608To708` | java.lang.String | [[cdk.support/lookup-entry]] | `:convert608-to708` |
| `source608ChannelNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source608-channel-number` |
"
  [^CfnChannel$Scte20SourceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :convert608-to708)]
    (. builder convert608To708 data))
  (when-let [data (lookup-entry config id :source608-channel-number)]
    (. builder source608ChannelNumber data))
  (.build builder))


(defn build-cfn-channel-scte27-destination-settings-property-builder
  "The build-cfn-channel-scte27-destination-settings-property-builder function updates a CfnChannel$Scte27DestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Scte27DestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$Scte27DestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-scte27-source-settings-property-builder
  "The build-cfn-channel-scte27-source-settings-property-builder function updates a CfnChannel$Scte27SourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Scte27SourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ocrLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:ocr-language` |
| `pid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pid` |
"
  [^CfnChannel$Scte27SourceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ocr-language)]
    (. builder ocrLanguage data))
  (when-let [data (lookup-entry config id :pid)]
    (. builder pid data))
  (.build builder))


(defn build-cfn-channel-scte35-splice-insert-property-builder
  "The build-cfn-channel-scte35-splice-insert-property-builder function updates a CfnChannel$Scte35SpliceInsertProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Scte35SpliceInsertProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adAvailOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ad-avail-offset` |
| `noRegionalBlackoutFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-regional-blackout-flag` |
| `webDeliveryAllowedFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-delivery-allowed-flag` |
"
  [^CfnChannel$Scte35SpliceInsertProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ad-avail-offset)]
    (. builder adAvailOffset data))
  (when-let [data (lookup-entry config id :no-regional-blackout-flag)]
    (. builder noRegionalBlackoutFlag data))
  (when-let [data (lookup-entry config id :web-delivery-allowed-flag)]
    (. builder webDeliveryAllowedFlag data))
  (.build builder))


(defn build-cfn-channel-scte35-time-signal-apos-property-builder
  "The build-cfn-channel-scte35-time-signal-apos-property-builder function updates a CfnChannel$Scte35TimeSignalAposProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$Scte35TimeSignalAposProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adAvailOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ad-avail-offset` |
| `noRegionalBlackoutFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-regional-blackout-flag` |
| `webDeliveryAllowedFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-delivery-allowed-flag` |
"
  [^CfnChannel$Scte35TimeSignalAposProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ad-avail-offset)]
    (. builder adAvailOffset data))
  (when-let [data (lookup-entry config id :no-regional-blackout-flag)]
    (. builder noRegionalBlackoutFlag data))
  (when-let [data (lookup-entry config id :web-delivery-allowed-flag)]
    (. builder webDeliveryAllowedFlag data))
  (.build builder))


(defn build-cfn-channel-smpte-tt-destination-settings-property-builder
  "The build-cfn-channel-smpte-tt-destination-settings-property-builder function updates a CfnChannel$SmpteTtDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$SmpteTtDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$SmpteTtDestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-standard-hls-settings-property-builder
  "The build-cfn-channel-standard-hls-settings-property-builder function updates a CfnChannel$StandardHlsSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$StandardHlsSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioRenditionSets` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-rendition-sets` |
| `m3U8Settings` | software.amazon.awscdk.services.medialive.CfnChannel$M3u8SettingsProperty | [[cdk.support/lookup-entry]] | `:m3-u8-settings` |
"
  [^CfnChannel$StandardHlsSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-rendition-sets)]
    (. builder audioRenditionSets data))
  (when-let [data (lookup-entry config id :m3-u8-settings)]
    (. builder m3U8Settings data))
  (.build builder))


(defn build-cfn-channel-static-key-settings-property-builder
  "The build-cfn-channel-static-key-settings-property-builder function updates a CfnChannel$StaticKeySettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$StaticKeySettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyProviderServer` | software.amazon.awscdk.services.medialive.CfnChannel$InputLocationProperty | [[cdk.support/lookup-entry]] | `:key-provider-server` |
| `staticKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:static-key-value` |
"
  [^CfnChannel$StaticKeySettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key-provider-server)]
    (. builder keyProviderServer data))
  (when-let [data (lookup-entry config id :static-key-value)]
    (. builder staticKeyValue data))
  (.build builder))


(defn build-cfn-channel-teletext-destination-settings-property-builder
  "The build-cfn-channel-teletext-destination-settings-property-builder function updates a CfnChannel$TeletextDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TeletextDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnChannel$TeletextDestinationSettingsProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-channel-teletext-source-settings-property-builder
  "The build-cfn-channel-teletext-source-settings-property-builder function updates a CfnChannel$TeletextSourceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TeletextSourceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outputRectangle` | software.amazon.awscdk.services.medialive.CfnChannel$CaptionRectangleProperty | [[cdk.support/lookup-entry]] | `:output-rectangle` |
| `pageNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:page-number` |
"
  [^CfnChannel$TeletextSourceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :output-rectangle)]
    (. builder outputRectangle data))
  (when-let [data (lookup-entry config id :page-number)]
    (. builder pageNumber data))
  (.build builder))


(defn build-cfn-channel-temporal-filter-settings-property-builder
  "The build-cfn-channel-temporal-filter-settings-property-builder function updates a CfnChannel$TemporalFilterSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TemporalFilterSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `postFilterSharpening` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-filter-sharpening` |
| `strength` | java.lang.String | [[cdk.support/lookup-entry]] | `:strength` |
"
  [^CfnChannel$TemporalFilterSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :post-filter-sharpening)]
    (. builder postFilterSharpening data))
  (when-let [data (lookup-entry config id :strength)]
    (. builder strength data))
  (.build builder))


(defn build-cfn-channel-thumbnail-configuration-property-builder
  "The build-cfn-channel-thumbnail-configuration-property-builder function updates a CfnChannel$ThumbnailConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$ThumbnailConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnChannel$ThumbnailConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn build-cfn-channel-timecode-burnin-settings-property-builder
  "The build-cfn-channel-timecode-burnin-settings-property-builder function updates a CfnChannel$TimecodeBurninSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TimecodeBurninSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fontSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:font-size` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnChannel$TimecodeBurninSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :font-size)]
    (. builder fontSize data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn build-cfn-channel-timecode-config-property-builder
  "The build-cfn-channel-timecode-config-property-builder function updates a CfnChannel$TimecodeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TimecodeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `syncThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sync-threshold` |
"
  [^CfnChannel$TimecodeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :sync-threshold)]
    (. builder syncThreshold data))
  (.build builder))


(defn build-cfn-channel-ttml-destination-settings-property-builder
  "The build-cfn-channel-ttml-destination-settings-property-builder function updates a CfnChannel$TtmlDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$TtmlDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `styleControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:style-control` |
"
  [^CfnChannel$TtmlDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :style-control)]
    (. builder styleControl data))
  (.build builder))


(defn build-cfn-channel-udp-container-settings-property-builder
  "The build-cfn-channel-udp-container-settings-property-builder function updates a CfnChannel$UdpContainerSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$UdpContainerSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `m2TsSettings` | software.amazon.awscdk.services.medialive.CfnChannel$M2tsSettingsProperty | [[cdk.support/lookup-entry]] | `:m2-ts-settings` |
"
  [^CfnChannel$UdpContainerSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :m2-ts-settings)]
    (. builder m2TsSettings data))
  (.build builder))


(defn build-cfn-channel-udp-group-settings-property-builder
  "The build-cfn-channel-udp-group-settings-property-builder function updates a CfnChannel$UdpGroupSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$UdpGroupSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputLossAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-loss-action` |
| `timedMetadataId3Frame` | java.lang.String | [[cdk.support/lookup-entry]] | `:timed-metadata-id3-frame` |
| `timedMetadataId3Period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timed-metadata-id3-period` |
"
  [^CfnChannel$UdpGroupSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :input-loss-action)]
    (. builder inputLossAction data))
  (when-let [data (lookup-entry config id :timed-metadata-id3-frame)]
    (. builder timedMetadataId3Frame data))
  (when-let [data (lookup-entry config id :timed-metadata-id3-period)]
    (. builder timedMetadataId3Period data))
  (.build builder))


(defn build-cfn-channel-udp-output-settings-property-builder
  "The build-cfn-channel-udp-output-settings-property-builder function updates a CfnChannel$UdpOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$UdpOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buffer-msec` |
| `containerSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-settings` |
| `destination` | software.amazon.awscdk.services.medialive.CfnChannel$OutputLocationRefProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `fecOutputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fec-output-settings` |
"
  [^CfnChannel$UdpOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :buffer-msec)]
    (. builder bufferMsec data))
  (when-let [data (lookup-entry config id :container-settings)]
    (. builder containerSettings data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :fec-output-settings)]
    (. builder fecOutputSettings data))
  (.build builder))


(defn build-cfn-channel-video-black-failover-settings-property-builder
  "The build-cfn-channel-video-black-failover-settings-property-builder function updates a CfnChannel$VideoBlackFailoverSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoBlackFailoverSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blackDetectThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:black-detect-threshold` |
| `videoBlackThresholdMsec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:video-black-threshold-msec` |
"
  [^CfnChannel$VideoBlackFailoverSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :black-detect-threshold)]
    (. builder blackDetectThreshold data))
  (when-let [data (lookup-entry config id :video-black-threshold-msec)]
    (. builder videoBlackThresholdMsec data))
  (.build builder))


(defn build-cfn-channel-video-codec-settings-property-builder
  "The build-cfn-channel-video-codec-settings-property-builder function updates a CfnChannel$VideoCodecSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoCodecSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameCaptureSettings` | software.amazon.awscdk.services.medialive.CfnChannel$FrameCaptureSettingsProperty | [[cdk.support/lookup-entry]] | `:frame-capture-settings` |
| `h264Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:h264-settings` |
| `h265Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:h265-settings` |
| `mpeg2Settings` | software.amazon.awscdk.services.medialive.CfnChannel$Mpeg2SettingsProperty | [[cdk.support/lookup-entry]] | `:mpeg2-settings` |
"
  [^CfnChannel$VideoCodecSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :frame-capture-settings)]
    (. builder frameCaptureSettings data))
  (when-let [data (lookup-entry config id :h264-settings)]
    (. builder h264Settings data))
  (when-let [data (lookup-entry config id :h265-settings)]
    (. builder h265Settings data))
  (when-let [data (lookup-entry config id :mpeg2-settings)]
    (. builder mpeg2Settings data))
  (.build builder))


(defn build-cfn-channel-video-description-property-builder
  "The build-cfn-channel-video-description-property-builder function updates a CfnChannel$VideoDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codecSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:codec-settings` |
| `height` | java.lang.Number | [[cdk.support/lookup-entry]] | `:height` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `respondToAfd` | java.lang.String | [[cdk.support/lookup-entry]] | `:respond-to-afd` |
| `scalingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-behavior` |
| `sharpness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sharpness` |
| `width` | java.lang.Number | [[cdk.support/lookup-entry]] | `:width` |
"
  [^CfnChannel$VideoDescriptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :codec-settings)]
    (. builder codecSettings data))
  (when-let [data (lookup-entry config id :height)]
    (. builder height data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :respond-to-afd)]
    (. builder respondToAfd data))
  (when-let [data (lookup-entry config id :scaling-behavior)]
    (. builder scalingBehavior data))
  (when-let [data (lookup-entry config id :sharpness)]
    (. builder sharpness data))
  (when-let [data (lookup-entry config id :width)]
    (. builder width data))
  (.build builder))


(defn build-cfn-channel-video-selector-color-space-settings-property-builder
  "The build-cfn-channel-video-selector-color-space-settings-property-builder function updates a CfnChannel$VideoSelectorColorSpaceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoSelectorColorSpaceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hdr10Settings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hdr10-settings` |
"
  [^CfnChannel$VideoSelectorColorSpaceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hdr10-settings)]
    (. builder hdr10Settings data))
  (.build builder))


(defn build-cfn-channel-video-selector-pid-property-builder
  "The build-cfn-channel-video-selector-pid-property-builder function updates a CfnChannel$VideoSelectorPidProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoSelectorPidProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pid` |
"
  [^CfnChannel$VideoSelectorPidProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pid)]
    (. builder pid data))
  (.build builder))


(defn build-cfn-channel-video-selector-program-id-property-builder
  "The build-cfn-channel-video-selector-program-id-property-builder function updates a CfnChannel$VideoSelectorProgramIdProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoSelectorProgramIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `programId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-id` |
"
  [^CfnChannel$VideoSelectorProgramIdProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :program-id)]
    (. builder programId data))
  (.build builder))


(defn build-cfn-channel-video-selector-property-builder
  "The build-cfn-channel-video-selector-property-builder function updates a CfnChannel$VideoSelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoSelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `colorSpace` | java.lang.String | [[cdk.support/lookup-entry]] | `:color-space` |
| `colorSpaceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:color-space-settings` |
| `colorSpaceUsage` | java.lang.String | [[cdk.support/lookup-entry]] | `:color-space-usage` |
| `selectorSettings` | software.amazon.awscdk.services.medialive.CfnChannel$VideoSelectorSettingsProperty | [[cdk.support/lookup-entry]] | `:selector-settings` |
"
  [^CfnChannel$VideoSelectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :color-space)]
    (. builder colorSpace data))
  (when-let [data (lookup-entry config id :color-space-settings)]
    (. builder colorSpaceSettings data))
  (when-let [data (lookup-entry config id :color-space-usage)]
    (. builder colorSpaceUsage data))
  (when-let [data (lookup-entry config id :selector-settings)]
    (. builder selectorSettings data))
  (.build builder))


(defn build-cfn-channel-video-selector-settings-property-builder
  "The build-cfn-channel-video-selector-settings-property-builder function updates a CfnChannel$VideoSelectorSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VideoSelectorSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `videoSelectorPid` | software.amazon.awscdk.services.medialive.CfnChannel$VideoSelectorPidProperty | [[cdk.support/lookup-entry]] | `:video-selector-pid` |
| `videoSelectorProgramId` | software.amazon.awscdk.services.medialive.CfnChannel$VideoSelectorProgramIdProperty | [[cdk.support/lookup-entry]] | `:video-selector-program-id` |
"
  [^CfnChannel$VideoSelectorSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :video-selector-pid)]
    (. builder videoSelectorPid data))
  (when-let [data (lookup-entry config id :video-selector-program-id)]
    (. builder videoSelectorProgramId data))
  (.build builder))


(defn build-cfn-channel-vpc-output-settings-property-builder
  "The build-cfn-channel-vpc-output-settings-property-builder function updates a CfnChannel$VpcOutputSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$VpcOutputSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicAddressAllocationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:public-address-allocation-ids` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnChannel$VpcOutputSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :public-address-allocation-ids)]
    (. builder publicAddressAllocationIds data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn build-cfn-channel-wav-settings-property-builder
  "The build-cfn-channel-wav-settings-property-builder function updates a CfnChannel$WavSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$WavSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bit-depth` |
| `codingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:coding-mode` |
| `sampleRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sample-rate` |
"
  [^CfnChannel$WavSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bit-depth)]
    (. builder bitDepth data))
  (when-let [data (lookup-entry config id :coding-mode)]
    (. builder codingMode data))
  (when-let [data (lookup-entry config id :sample-rate)]
    (. builder sampleRate data))
  (.build builder))


(defn build-cfn-channel-webvtt-destination-settings-property-builder
  "The build-cfn-channel-webvtt-destination-settings-property-builder function updates a CfnChannel$WebvttDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$WebvttDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `styleControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:style-control` |
"
  [^CfnChannel$WebvttDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :style-control)]
    (. builder styleControl data))
  (.build builder))


(defn build-cfn-input-builder
  "The build-cfn-input-builder function updates a CfnInput$Builder instance using the provided configuration.
  The function takes the CfnInput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `inputDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:input-devices` |
| `inputSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:input-security-groups` |
| `mediaConnectFlows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-connect-flows` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnInput$Builder builder id config]
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :input-devices)]
    (. builder inputDevices data))
  (when-let [data (lookup-entry config id :input-security-groups)]
    (. builder inputSecurityGroups data))
  (when-let [data (lookup-entry config id :media-connect-flows)]
    (. builder mediaConnectFlows data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn build-cfn-input-input-destination-request-property-builder
  "The build-cfn-input-input-destination-request-property-builder function updates a CfnInput$InputDestinationRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$InputDestinationRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^CfnInput$InputDestinationRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn build-cfn-input-input-device-request-property-builder
  "The build-cfn-input-input-device-request-property-builder function updates a CfnInput$InputDeviceRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$InputDeviceRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnInput$InputDeviceRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn build-cfn-input-input-device-settings-property-builder
  "The build-cfn-input-input-device-settings-property-builder function updates a CfnInput$InputDeviceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$InputDeviceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnInput$InputDeviceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn build-cfn-input-input-source-request-property-builder
  "The build-cfn-input-input-source-request-property-builder function updates a CfnInput$InputSourceRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$InputSourceRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordParam` | java.lang.String | [[cdk.support/lookup-entry]] | `:password-param` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnInput$InputSourceRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :password-param)]
    (. builder passwordParam data))
  (when-let [data (lookup-entry config id :url)]
    (. builder url data))
  (when-let [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn build-cfn-input-input-vpc-request-property-builder
  "The build-cfn-input-input-vpc-request-property-builder function updates a CfnInput$InputVpcRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$InputVpcRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnInput$InputVpcRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn build-cfn-input-media-connect-flow-request-property-builder
  "The build-cfn-input-media-connect-flow-request-property-builder function updates a CfnInput$MediaConnectFlowRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnInput$MediaConnectFlowRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
"
  [^CfnInput$MediaConnectFlowRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (.build builder))


(defn build-cfn-input-props-builder
  "The build-cfn-input-props-builder function updates a CfnInputProps$Builder instance using the provided configuration.
  The function takes the CfnInputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `inputDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:input-devices` |
| `inputSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:input-security-groups` |
| `mediaConnectFlows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-connect-flows` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpc` | software.amazon.awscdk.services.medialive.CfnInput$InputVpcRequestProperty | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnInputProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :input-devices)]
    (. builder inputDevices data))
  (when-let [data (lookup-entry config id :input-security-groups)]
    (. builder inputSecurityGroups data))
  (when-let [data (lookup-entry config id :media-connect-flows)]
    (. builder mediaConnectFlows data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn build-cfn-input-security-group-builder
  "The build-cfn-input-security-group-builder function updates a CfnInputSecurityGroup$Builder instance using the provided configuration.
  The function takes the CfnInputSecurityGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `whitelistRules` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelist-rules` |
"
  [^CfnInputSecurityGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :whitelist-rules)]
    (. builder whitelistRules data))
  (.build builder))


(defn build-cfn-input-security-group-input-whitelist-rule-cidr-property-builder
  "The build-cfn-input-security-group-input-whitelist-rule-cidr-property-builder function updates a CfnInputSecurityGroup$InputWhitelistRuleCidrProperty$Builder instance using the provided configuration.
  The function takes the CfnInputSecurityGroup$InputWhitelistRuleCidrProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
"
  [^CfnInputSecurityGroup$InputWhitelistRuleCidrProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cidr)]
    (. builder cidr data))
  (.build builder))


(defn build-cfn-input-security-group-props-builder
  "The build-cfn-input-security-group-props-builder function updates a CfnInputSecurityGroupProps$Builder instance using the provided configuration.
  The function takes the CfnInputSecurityGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `whitelistRules` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelist-rules` |
"
  [^CfnInputSecurityGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :whitelist-rules)]
    (. builder whitelistRules data))
  (.build builder))


(defn build-cfn-multiplex-builder
  "The build-cfn-multiplex-builder function updates a CfnMultiplex$Builder instance using the provided configuration.
  The function takes the CfnMultiplex$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `multiplexSettings` | software.amazon.awscdk.services.medialive.CfnMultiplex$MultiplexSettingsProperty | [[cdk.support/lookup-entry]] | `:multiplex-settings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMultiplex$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :multiplex-settings)]
    (. builder multiplexSettings data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-multiplex-multiplex-media-connect-output-destination-settings-property-builder
  "The build-cfn-multiplex-multiplex-media-connect-output-destination-settings-property-builder function updates a CfnMultiplex$MultiplexMediaConnectOutputDestinationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplex$MultiplexMediaConnectOutputDestinationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entitlementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-arn` |
"
  [^CfnMultiplex$MultiplexMediaConnectOutputDestinationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :entitlement-arn)]
    (. builder entitlementArn data))
  (.build builder))


(defn build-cfn-multiplex-multiplex-output-destination-property-builder
  "The build-cfn-multiplex-multiplex-output-destination-property-builder function updates a CfnMultiplex$MultiplexOutputDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplex$MultiplexOutputDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multiplexMediaConnectOutputDestinationSettings` | software.amazon.awscdk.services.medialive.CfnMultiplex$MultiplexMediaConnectOutputDestinationSettingsProperty | [[cdk.support/lookup-entry]] | `:multiplex-media-connect-output-destination-settings` |
"
  [^CfnMultiplex$MultiplexOutputDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :multiplex-media-connect-output-destination-settings)]
    (. builder multiplexMediaConnectOutputDestinationSettings data))
  (.build builder))


(defn build-cfn-multiplex-multiplex-settings-property-builder
  "The build-cfn-multiplex-multiplex-settings-property-builder function updates a CfnMultiplex$MultiplexSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplex$MultiplexSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumVideoBufferDelayMilliseconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-video-buffer-delay-milliseconds` |
| `transportStreamBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transport-stream-bitrate` |
| `transportStreamId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transport-stream-id` |
| `transportStreamReservedBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transport-stream-reserved-bitrate` |
"
  [^CfnMultiplex$MultiplexSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-video-buffer-delay-milliseconds)]
    (. builder maximumVideoBufferDelayMilliseconds data))
  (when-let [data (lookup-entry config id :transport-stream-bitrate)]
    (. builder transportStreamBitrate data))
  (when-let [data (lookup-entry config id :transport-stream-id)]
    (. builder transportStreamId data))
  (when-let [data (lookup-entry config id :transport-stream-reserved-bitrate)]
    (. builder transportStreamReservedBitrate data))
  (.build builder))


(defn build-cfn-multiplex-props-builder
  "The build-cfn-multiplex-props-builder function updates a CfnMultiplexProps$Builder instance using the provided configuration.
  The function takes the CfnMultiplexProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `multiplexSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multiplex-settings` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMultiplexProps$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :multiplex-settings)]
    (. builder multiplexSettings data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-multiplexprogram-builder
  "The build-cfn-multiplexprogram-builder function updates a CfnMultiplexprogram$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `multiplexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiplex-id` |
| `multiplexProgramSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multiplex-program-settings` |
| `packetIdentifiersMap` | software.amazon.awscdk.services.medialive.CfnMultiplexprogram$MultiplexProgramPacketIdentifiersMapProperty | [[cdk.support/lookup-entry]] | `:packet-identifiers-map` |
| `pipelineDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-details` |
| `preferredChannelPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-channel-pipeline` |
| `programName` | java.lang.String | [[cdk.support/lookup-entry]] | `:program-name` |
"
  [^CfnMultiplexprogram$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :multiplex-id)]
    (. builder multiplexId data))
  (when-let [data (lookup-entry config id :multiplex-program-settings)]
    (. builder multiplexProgramSettings data))
  (when-let [data (lookup-entry config id :packet-identifiers-map)]
    (. builder packetIdentifiersMap data))
  (when-let [data (lookup-entry config id :pipeline-details)]
    (. builder pipelineDetails data))
  (when-let [data (lookup-entry config id :preferred-channel-pipeline)]
    (. builder preferredChannelPipeline data))
  (when-let [data (lookup-entry config id :program-name)]
    (. builder programName data))
  (.build builder))


(defn build-cfn-multiplexprogram-multiplex-program-packet-identifiers-map-property-builder
  "The build-cfn-multiplexprogram-multiplex-program-packet-identifiers-map-property-builder function updates a CfnMultiplexprogram$MultiplexProgramPacketIdentifiersMapProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$MultiplexProgramPacketIdentifiersMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioPids` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-pids` |
| `dvbSubPids` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dvb-sub-pids` |
| `dvbTeletextPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dvb-teletext-pid` |
| `etvPlatformPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:etv-platform-pid` |
| `etvSignalPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:etv-signal-pid` |
| `klvDataPids` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:klv-data-pids` |
| `pcrPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pcr-pid` |
| `pmtPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:pmt-pid` |
| `privateMetadataPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:private-metadata-pid` |
| `scte27Pids` | java.util.List | [[cdk.support/lookup-entry]] | `:scte27-pids` |
| `scte35Pid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scte35-pid` |
| `timedMetadataPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timed-metadata-pid` |
| `videoPid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:video-pid` |
"
  [^CfnMultiplexprogram$MultiplexProgramPacketIdentifiersMapProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-pids)]
    (. builder audioPids data))
  (when-let [data (lookup-entry config id :dvb-sub-pids)]
    (. builder dvbSubPids data))
  (when-let [data (lookup-entry config id :dvb-teletext-pid)]
    (. builder dvbTeletextPid data))
  (when-let [data (lookup-entry config id :etv-platform-pid)]
    (. builder etvPlatformPid data))
  (when-let [data (lookup-entry config id :etv-signal-pid)]
    (. builder etvSignalPid data))
  (when-let [data (lookup-entry config id :klv-data-pids)]
    (. builder klvDataPids data))
  (when-let [data (lookup-entry config id :pcr-pid)]
    (. builder pcrPid data))
  (when-let [data (lookup-entry config id :pmt-pid)]
    (. builder pmtPid data))
  (when-let [data (lookup-entry config id :private-metadata-pid)]
    (. builder privateMetadataPid data))
  (when-let [data (lookup-entry config id :scte27-pids)]
    (. builder scte27Pids data))
  (when-let [data (lookup-entry config id :scte35-pid)]
    (. builder scte35Pid data))
  (when-let [data (lookup-entry config id :timed-metadata-pid)]
    (. builder timedMetadataPid data))
  (when-let [data (lookup-entry config id :video-pid)]
    (. builder videoPid data))
  (.build builder))


(defn build-cfn-multiplexprogram-multiplex-program-pipeline-detail-property-builder
  "The build-cfn-multiplexprogram-multiplex-program-pipeline-detail-property-builder function updates a CfnMultiplexprogram$MultiplexProgramPipelineDetailProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$MultiplexProgramPipelineDetailProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeChannelPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-channel-pipeline` |
| `pipelineId` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-id` |
"
  [^CfnMultiplexprogram$MultiplexProgramPipelineDetailProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active-channel-pipeline)]
    (. builder activeChannelPipeline data))
  (when-let [data (lookup-entry config id :pipeline-id)]
    (. builder pipelineId data))
  (.build builder))


(defn build-cfn-multiplexprogram-multiplex-program-service-descriptor-property-builder
  "The build-cfn-multiplexprogram-multiplex-program-service-descriptor-property-builder function updates a CfnMultiplexprogram$MultiplexProgramServiceDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$MultiplexProgramServiceDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^CfnMultiplexprogram$MultiplexProgramServiceDescriptorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn build-cfn-multiplexprogram-multiplex-program-settings-property-builder
  "The build-cfn-multiplexprogram-multiplex-program-settings-property-builder function updates a CfnMultiplexprogram$MultiplexProgramSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$MultiplexProgramSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredChannelPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-channel-pipeline` |
| `programNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-number` |
| `serviceDescriptor` | software.amazon.awscdk.services.medialive.CfnMultiplexprogram$MultiplexProgramServiceDescriptorProperty | [[cdk.support/lookup-entry]] | `:service-descriptor` |
| `videoSettings` | software.amazon.awscdk.services.medialive.CfnMultiplexprogram$MultiplexVideoSettingsProperty | [[cdk.support/lookup-entry]] | `:video-settings` |
"
  [^CfnMultiplexprogram$MultiplexProgramSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :preferred-channel-pipeline)]
    (. builder preferredChannelPipeline data))
  (when-let [data (lookup-entry config id :program-number)]
    (. builder programNumber data))
  (when-let [data (lookup-entry config id :service-descriptor)]
    (. builder serviceDescriptor data))
  (when-let [data (lookup-entry config id :video-settings)]
    (. builder videoSettings data))
  (.build builder))


(defn build-cfn-multiplexprogram-multiplex-statmux-video-settings-property-builder
  "The build-cfn-multiplexprogram-multiplex-statmux-video-settings-property-builder function updates a CfnMultiplexprogram$MultiplexStatmuxVideoSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$MultiplexStatmuxVideoSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-bitrate` |
| `minimumBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-bitrate` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^CfnMultiplexprogram$MultiplexStatmuxVideoSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-bitrate)]
    (. builder maximumBitrate data))
  (when-let [data (lookup-entry config id :minimum-bitrate)]
    (. builder minimumBitrate data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn build-cfn-multiplexprogram-multiplex-video-settings-property-builder
  "The build-cfn-multiplexprogram-multiplex-video-settings-property-builder function updates a CfnMultiplexprogram$MultiplexVideoSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogram$MultiplexVideoSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:constant-bitrate` |
| `statmuxSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statmux-settings` |
"
  [^CfnMultiplexprogram$MultiplexVideoSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constant-bitrate)]
    (. builder constantBitrate data))
  (when-let [data (lookup-entry config id :statmux-settings)]
    (. builder statmuxSettings data))
  (.build builder))


(defn build-cfn-multiplexprogram-props-builder
  "The build-cfn-multiplexprogram-props-builder function updates a CfnMultiplexprogramProps$Builder instance using the provided configuration.
  The function takes the CfnMultiplexprogramProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `multiplexId` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiplex-id` |
| `multiplexProgramSettings` | software.amazon.awscdk.services.medialive.CfnMultiplexprogram$MultiplexProgramSettingsProperty | [[cdk.support/lookup-entry]] | `:multiplex-program-settings` |
| `packetIdentifiersMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:packet-identifiers-map` |
| `pipelineDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-details` |
| `preferredChannelPipeline` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-channel-pipeline` |
| `programName` | java.lang.String | [[cdk.support/lookup-entry]] | `:program-name` |
"
  [^CfnMultiplexprogramProps$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :multiplex-id)]
    (. builder multiplexId data))
  (when-let [data (lookup-entry config id :multiplex-program-settings)]
    (. builder multiplexProgramSettings data))
  (when-let [data (lookup-entry config id :packet-identifiers-map)]
    (. builder packetIdentifiersMap data))
  (when-let [data (lookup-entry config id :pipeline-details)]
    (. builder pipelineDetails data))
  (when-let [data (lookup-entry config id :preferred-channel-pipeline)]
    (. builder preferredChannelPipeline data))
  (when-let [data (lookup-entry config id :program-name)]
    (. builder programName data))
  (.build builder))