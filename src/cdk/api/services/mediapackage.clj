(ns cdk.api.services.mediapackage
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mediapackage package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mediapackage CfnAsset$Builder
                                                         CfnAsset$EgressEndpointProperty$Builder
                                                         CfnAssetProps$Builder
                                                         CfnChannel$Builder
                                                         CfnChannel$HlsIngestProperty$Builder
                                                         CfnChannel$IngestEndpointProperty$Builder
                                                         CfnChannel$LogConfigurationProperty$Builder
                                                         CfnChannelProps$Builder
                                                         CfnOriginEndpoint$AuthorizationProperty$Builder
                                                         CfnOriginEndpoint$Builder
                                                         CfnOriginEndpoint$CmafEncryptionProperty$Builder
                                                         CfnOriginEndpoint$CmafPackageProperty$Builder
                                                         CfnOriginEndpoint$DashEncryptionProperty$Builder
                                                         CfnOriginEndpoint$DashPackageProperty$Builder
                                                         CfnOriginEndpoint$EncryptionContractConfigurationProperty$Builder
                                                         CfnOriginEndpoint$HlsEncryptionProperty$Builder
                                                         CfnOriginEndpoint$HlsManifestProperty$Builder
                                                         CfnOriginEndpoint$HlsPackageProperty$Builder
                                                         CfnOriginEndpoint$MssEncryptionProperty$Builder
                                                         CfnOriginEndpoint$MssPackageProperty$Builder
                                                         CfnOriginEndpoint$SpekeKeyProviderProperty$Builder
                                                         CfnOriginEndpoint$StreamSelectionProperty$Builder
                                                         CfnOriginEndpointProps$Builder
                                                         CfnPackagingConfiguration$Builder
                                                         CfnPackagingConfiguration$CmafEncryptionProperty$Builder
                                                         CfnPackagingConfiguration$CmafPackageProperty$Builder
                                                         CfnPackagingConfiguration$DashEncryptionProperty$Builder
                                                         CfnPackagingConfiguration$DashManifestProperty$Builder
                                                         CfnPackagingConfiguration$DashPackageProperty$Builder
                                                         CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder
                                                         CfnPackagingConfiguration$HlsEncryptionProperty$Builder
                                                         CfnPackagingConfiguration$HlsManifestProperty$Builder
                                                         CfnPackagingConfiguration$HlsPackageProperty$Builder
                                                         CfnPackagingConfiguration$MssEncryptionProperty$Builder
                                                         CfnPackagingConfiguration$MssManifestProperty$Builder
                                                         CfnPackagingConfiguration$MssPackageProperty$Builder
                                                         CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder
                                                         CfnPackagingConfiguration$StreamSelectionProperty$Builder
                                                         CfnPackagingConfigurationProps$Builder
                                                         CfnPackagingGroup$AuthorizationProperty$Builder
                                                         CfnPackagingGroup$Builder
                                                         CfnPackagingGroup$LogConfigurationProperty$Builder
                                                         CfnPackagingGroupProps$Builder]))


(defn cfn-asset-builder
  "The cfn-asset-builder function buildes out new instances of 
CfnAsset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressEndpoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-endpoints` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAsset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :egress-endpoints)]
      (. builder egressEndpoints data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :packaging-group-id)]
      (. builder packagingGroupId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :source-role-arn)]
      (. builder sourceRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-asset-egress-endpoint-property-builder
  "The cfn-asset-egress-endpoint-property-builder function buildes out new instances of 
CfnAsset$EgressEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packagingConfigurationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-configuration-id` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnAsset$EgressEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :packaging-configuration-id)]
      (. builder packagingConfigurationId data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-asset-props-builder
  "The cfn-asset-props-builder function buildes out new instances of 
CfnAssetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-endpoints` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssetProps$Builder.)]
    (when-let [data (lookup-entry config id :egress-endpoints)]
      (. builder egressEndpoints data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :packaging-group-id)]
      (. builder packagingGroupId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :source-role-arn)]
      (. builder sourceRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-builder
  "The cfn-channel-builder function buildes out new instances of 
CfnChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `egressAccessLogs` | software.amazon.awscdk.services.mediapackage.CfnChannel$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `hlsIngest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-ingest` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `ingressAccessLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ingress-access-logs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :egress-access-logs)]
      (. builder egressAccessLogs data))
    (when-let [data (lookup-entry config id :hls-ingest)]
      (. builder hlsIngest data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :ingress-access-logs)]
      (. builder ingressAccessLogs data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-channel-hls-ingest-property-builder
  "The cfn-channel-hls-ingest-property-builder function buildes out new instances of 
CfnChannel$HlsIngestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingestEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:ingest-endpoints` |"
  [stack id config]
  (let [builder (CfnChannel$HlsIngestProperty$Builder.)]
    (when-let [data (lookup-entry config id :ingest-endpoints)]
      (. builder ingestEndpoints data))
    (.build builder)))


(defn cfn-channel-ingest-endpoint-property-builder
  "The cfn-channel-ingest-endpoint-property-builder function buildes out new instances of 
CfnChannel$IngestEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnChannel$IngestEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-channel-log-configuration-property-builder
  "The cfn-channel-log-configuration-property-builder function buildes out new instances of 
CfnChannel$LogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |"
  [stack id config]
  (let [builder (CfnChannel$LogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (.build builder)))


(defn cfn-channel-props-builder
  "The cfn-channel-props-builder function buildes out new instances of 
CfnChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `egressAccessLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `hlsIngest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-ingest` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `ingressAccessLogs` | software.amazon.awscdk.services.mediapackage.CfnChannel$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-access-logs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :egress-access-logs)]
      (. builder egressAccessLogs data))
    (when-let [data (lookup-entry config id :hls-ingest)]
      (. builder hlsIngest data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :ingress-access-logs)]
      (. builder ingressAccessLogs data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-origin-endpoint-authorization-property-builder
  "The cfn-origin-endpoint-authorization-property-builder function buildes out new instances of 
CfnOriginEndpoint$AuthorizationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdnIdentifierSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdn-identifier-secret` |
| `secretsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-role-arn` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$AuthorizationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cdn-identifier-secret)]
      (. builder cdnIdentifierSecret data))
    (when-let [data (lookup-entry config id :secrets-role-arn)]
      (. builder secretsRoleArn data))
    (.build builder)))


(defn cfn-origin-endpoint-builder
  "The cfn-origin-endpoint-builder function buildes out new instances of 
CfnOriginEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization` |
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `cmafPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cmaf-package` |
| `dashPackage` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$DashPackageProperty | [[cdk.support/lookup-entry]] | `:dash-package` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hlsPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-package` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `mssPackage` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$MssPackageProperty | [[cdk.support/lookup-entry]] | `:mss-package` |
| `origination` | java.lang.String | [[cdk.support/lookup-entry]] | `:origination` |
| `startoverWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:startover-window-seconds` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-delay-seconds` |
| `whitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelist` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorization)]
      (. builder authorization data))
    (when-let [data (lookup-entry config id :channel-id)]
      (. builder channelId data))
    (when-let [data (lookup-entry config id :cmaf-package)]
      (. builder cmafPackage data))
    (when-let [data (lookup-entry config id :dash-package)]
      (. builder dashPackage data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hls-package)]
      (. builder hlsPackage data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :mss-package)]
      (. builder mssPackage data))
    (when-let [data (lookup-entry config id :origination)]
      (. builder origination data))
    (when-let [data (lookup-entry config id :startover-window-seconds)]
      (. builder startoverWindowSeconds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-delay-seconds)]
      (. builder timeDelaySeconds data))
    (when-let [data (lookup-entry config id :whitelist)]
      (. builder whitelist data))
    (.build builder)))


(defn cfn-origin-endpoint-cmaf-encryption-property-builder
  "The cfn-origin-endpoint-cmaf-encryption-property-builder function buildes out new instances of 
CfnOriginEndpoint$CmafEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$CmafEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :encryption-method)]
      (. builder encryptionMethod data))
    (when-let [data (lookup-entry config id :key-rotation-interval-seconds)]
      (. builder keyRotationIntervalSeconds data))
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-origin-endpoint-cmaf-package-property-builder
  "The cfn-origin-endpoint-cmaf-package-property-builder function buildes out new instances of 
CfnOriginEndpoint$CmafPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-prefix` |
| `streamSelection` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$StreamSelectionProperty | [[cdk.support/lookup-entry]] | `:stream-selection` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$CmafPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :hls-manifests)]
      (. builder hlsManifests data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :segment-prefix)]
      (. builder segmentPrefix data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (.build builder)))


(defn cfn-origin-endpoint-dash-encryption-property-builder
  "The cfn-origin-endpoint-dash-encryption-property-builder function buildes out new instances of 
CfnOriginEndpoint$DashEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$DashEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-rotation-interval-seconds)]
      (. builder keyRotationIntervalSeconds data))
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-origin-endpoint-dash-package-property-builder
  "The cfn-origin-endpoint-dash-package-property-builder function buildes out new instances of 
CfnOriginEndpoint$DashPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-triggers` |
| `adsOnDeliveryRestrictions` | java.lang.String | [[cdk.support/lookup-entry]] | `:ads-on-delivery-restrictions` |
| `encryption` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$DashEncryptionProperty | [[cdk.support/lookup-entry]] | `:encryption` |
| `includeIframeOnlyStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `manifestLayout` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-layout` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `minBufferTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-buffer-time-seconds` |
| `minUpdatePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-update-period-seconds` |
| `periodTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:period-triggers` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentTemplateFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-template-format` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |
| `suggestedPresentationDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:suggested-presentation-delay-seconds` |
| `utcTiming` | java.lang.String | [[cdk.support/lookup-entry]] | `:utc-timing` |
| `utcTimingUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:utc-timing-uri` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$DashPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-triggers)]
      (. builder adTriggers data))
    (when-let [data (lookup-entry config id :ads-on-delivery-restrictions)]
      (. builder adsOnDeliveryRestrictions data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :include-iframe-only-stream)]
      (. builder includeIframeOnlyStream data))
    (when-let [data (lookup-entry config id :manifest-layout)]
      (. builder manifestLayout data))
    (when-let [data (lookup-entry config id :manifest-window-seconds)]
      (. builder manifestWindowSeconds data))
    (when-let [data (lookup-entry config id :min-buffer-time-seconds)]
      (. builder minBufferTimeSeconds data))
    (when-let [data (lookup-entry config id :min-update-period-seconds)]
      (. builder minUpdatePeriodSeconds data))
    (when-let [data (lookup-entry config id :period-triggers)]
      (. builder periodTriggers data))
    (when-let [data (lookup-entry config id :profile)]
      (. builder profile data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :segment-template-format)]
      (. builder segmentTemplateFormat data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (when-let [data (lookup-entry config id :suggested-presentation-delay-seconds)]
      (. builder suggestedPresentationDelaySeconds data))
    (when-let [data (lookup-entry config id :utc-timing)]
      (. builder utcTiming data))
    (when-let [data (lookup-entry config id :utc-timing-uri)]
      (. builder utcTimingUri data))
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


(defn cfn-origin-endpoint-hls-encryption-property-builder
  "The cfn-origin-endpoint-hls-encryption-property-builder function buildes out new instances of 
CfnOriginEndpoint$HlsEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `repeatExtXKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:repeat-ext-x-key` |
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$HlsEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :encryption-method)]
      (. builder encryptionMethod data))
    (when-let [data (lookup-entry config id :key-rotation-interval-seconds)]
      (. builder keyRotationIntervalSeconds data))
    (when-let [data (lookup-entry config id :repeat-ext-x-key)]
      (. builder repeatExtXKey data))
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-origin-endpoint-hls-manifest-property-builder
  "The cfn-origin-endpoint-hls-manifest-property-builder function buildes out new instances of 
CfnOriginEndpoint$HlsManifestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkers` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-markers` |
| `adTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-triggers` |
| `adsOnDeliveryRestrictions` | java.lang.String | [[cdk.support/lookup-entry]] | `:ads-on-delivery-restrictions` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `includeIframeOnlyStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `playlistType` | java.lang.String | [[cdk.support/lookup-entry]] | `:playlist-type` |
| `playlistWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:playlist-window-seconds` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$HlsManifestProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-markers)]
      (. builder adMarkers data))
    (when-let [data (lookup-entry config id :ad-triggers)]
      (. builder adTriggers data))
    (when-let [data (lookup-entry config id :ads-on-delivery-restrictions)]
      (. builder adsOnDeliveryRestrictions data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :include-iframe-only-stream)]
      (. builder includeIframeOnlyStream data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :playlist-type)]
      (. builder playlistType data))
    (when-let [data (lookup-entry config id :playlist-window-seconds)]
      (. builder playlistWindowSeconds data))
    (when-let [data (lookup-entry config id :program-date-time-interval-seconds)]
      (. builder programDateTimeIntervalSeconds data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-origin-endpoint-hls-package-property-builder
  "The cfn-origin-endpoint-hls-package-property-builder function buildes out new instances of 
CfnOriginEndpoint$HlsPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkers` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-markers` |
| `adTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:ad-triggers` |
| `adsOnDeliveryRestrictions` | java.lang.String | [[cdk.support/lookup-entry]] | `:ads-on-delivery-restrictions` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `includeDvbSubtitles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-dvb-subtitles` |
| `includeIframeOnlyStream` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `playlistType` | java.lang.String | [[cdk.support/lookup-entry]] | `:playlist-type` |
| `playlistWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:playlist-window-seconds` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `streamSelection` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$StreamSelectionProperty | [[cdk.support/lookup-entry]] | `:stream-selection` |
| `useAudioRenditionGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-audio-rendition-group` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$HlsPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-markers)]
      (. builder adMarkers data))
    (when-let [data (lookup-entry config id :ad-triggers)]
      (. builder adTriggers data))
    (when-let [data (lookup-entry config id :ads-on-delivery-restrictions)]
      (. builder adsOnDeliveryRestrictions data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :include-dvb-subtitles)]
      (. builder includeDvbSubtitles data))
    (when-let [data (lookup-entry config id :include-iframe-only-stream)]
      (. builder includeIframeOnlyStream data))
    (when-let [data (lookup-entry config id :playlist-type)]
      (. builder playlistType data))
    (when-let [data (lookup-entry config id :playlist-window-seconds)]
      (. builder playlistWindowSeconds data))
    (when-let [data (lookup-entry config id :program-date-time-interval-seconds)]
      (. builder programDateTimeIntervalSeconds data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (when-let [data (lookup-entry config id :use-audio-rendition-group)]
      (. builder useAudioRenditionGroup data))
    (.build builder)))


(defn cfn-origin-endpoint-mss-encryption-property-builder
  "The cfn-origin-endpoint-mss-encryption-property-builder function buildes out new instances of 
CfnOriginEndpoint$MssEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$MssEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-origin-endpoint-mss-package-property-builder
  "The cfn-origin-endpoint-mss-package-property-builder function buildes out new instances of 
CfnOriginEndpoint$MssPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$MssPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :manifest-window-seconds)]
      (. builder manifestWindowSeconds data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (.build builder)))


(defn cfn-origin-endpoint-props-builder
  "The cfn-origin-endpoint-props-builder function buildes out new instances of 
CfnOriginEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization` |
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `cmafPackage` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$CmafPackageProperty | [[cdk.support/lookup-entry]] | `:cmaf-package` |
| `dashPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dash-package` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hlsPackage` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$HlsPackageProperty | [[cdk.support/lookup-entry]] | `:hls-package` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `mssPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mss-package` |
| `origination` | java.lang.String | [[cdk.support/lookup-entry]] | `:origination` |
| `startoverWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:startover-window-seconds` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeDelaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-delay-seconds` |
| `whitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelist` |"
  [stack id config]
  (let [builder (CfnOriginEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :authorization)]
      (. builder authorization data))
    (when-let [data (lookup-entry config id :channel-id)]
      (. builder channelId data))
    (when-let [data (lookup-entry config id :cmaf-package)]
      (. builder cmafPackage data))
    (when-let [data (lookup-entry config id :dash-package)]
      (. builder dashPackage data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hls-package)]
      (. builder hlsPackage data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :mss-package)]
      (. builder mssPackage data))
    (when-let [data (lookup-entry config id :origination)]
      (. builder origination data))
    (when-let [data (lookup-entry config id :startover-window-seconds)]
      (. builder startoverWindowSeconds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-delay-seconds)]
      (. builder timeDelaySeconds data))
    (when-let [data (lookup-entry config id :whitelist)]
      (. builder whitelist data))
    (.build builder)))


(defn cfn-origin-endpoint-speke-key-provider-property-builder
  "The cfn-origin-endpoint-speke-key-provider-property-builder function buildes out new instances of 
CfnOriginEndpoint$SpekeKeyProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `encryptionContractConfiguration` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$EncryptionContractConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-contract-configuration` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `systemIds` | java.util.List | [[cdk.support/lookup-entry]] | `:system-ids` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$SpekeKeyProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :encryption-contract-configuration)]
      (. builder encryptionContractConfiguration data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :system-ids)]
      (. builder systemIds data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-origin-endpoint-stream-selection-property-builder
  "The cfn-origin-endpoint-stream-selection-property-builder function buildes out new instances of 
CfnOriginEndpoint$StreamSelectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-video-bits-per-second` |
| `minVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-video-bits-per-second` |
| `streamOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-order` |"
  [stack id config]
  (let [builder (CfnOriginEndpoint$StreamSelectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-video-bits-per-second)]
      (. builder maxVideoBitsPerSecond data))
    (when-let [data (lookup-entry config id :min-video-bits-per-second)]
      (. builder minVideoBitsPerSecond data))
    (when-let [data (lookup-entry config id :stream-order)]
      (. builder streamOrder data))
    (.build builder)))


(defn cfn-packaging-configuration-builder
  "The cfn-packaging-configuration-builder function buildes out new instances of 
CfnPackagingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmafPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$CmafPackageProperty | [[cdk.support/lookup-entry]] | `:cmaf-package` |
| `dashPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dash-package` |
| `hlsPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$HlsPackageProperty | [[cdk.support/lookup-entry]] | `:hls-package` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `mssPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$MssPackageProperty | [[cdk.support/lookup-entry]] | `:mss-package` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cmaf-package)]
      (. builder cmafPackage data))
    (when-let [data (lookup-entry config id :dash-package)]
      (. builder dashPackage data))
    (when-let [data (lookup-entry config id :hls-package)]
      (. builder hlsPackage data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :mss-package)]
      (. builder mssPackage data))
    (when-let [data (lookup-entry config id :packaging-group-id)]
      (. builder packagingGroupId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-packaging-configuration-cmaf-encryption-property-builder
  "The cfn-packaging-configuration-cmaf-encryption-property-builder function buildes out new instances of 
CfnPackagingConfiguration$CmafEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$CmafEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-packaging-configuration-cmaf-package-property-builder
  "The cfn-packaging-configuration-cmaf-package-property-builder function buildes out new instances of 
CfnPackagingConfiguration$CmafPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `includeEncoderConfigurationInSegments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-encoder-configuration-in-segments` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$CmafPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :hls-manifests)]
      (. builder hlsManifests data))
    (when-let [data (lookup-entry config id :include-encoder-configuration-in-segments)]
      (. builder includeEncoderConfigurationInSegments data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (.build builder)))


(defn cfn-packaging-configuration-dash-encryption-property-builder
  "The cfn-packaging-configuration-dash-encryption-property-builder function buildes out new instances of 
CfnPackagingConfiguration$DashEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$DashEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-packaging-configuration-dash-manifest-property-builder
  "The cfn-packaging-configuration-dash-manifest-property-builder function buildes out new instances of 
CfnPackagingConfiguration$DashManifestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestLayout` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-layout` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `minBufferTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-buffer-time-seconds` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `scteMarkersSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte-markers-source` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$DashManifestProperty$Builder.)]
    (when-let [data (lookup-entry config id :manifest-layout)]
      (. builder manifestLayout data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :min-buffer-time-seconds)]
      (. builder minBufferTimeSeconds data))
    (when-let [data (lookup-entry config id :profile)]
      (. builder profile data))
    (when-let [data (lookup-entry config id :scte-markers-source)]
      (. builder scteMarkersSource data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (.build builder)))


(defn cfn-packaging-configuration-dash-package-property-builder
  "The cfn-packaging-configuration-dash-package-property-builder function buildes out new instances of 
CfnPackagingConfiguration$DashPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:dash-manifests` |
| `encryption` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$DashEncryptionProperty | [[cdk.support/lookup-entry]] | `:encryption` |
| `includeEncoderConfigurationInSegments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-encoder-configuration-in-segments` |
| `includeIframeOnlyStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `periodTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:period-triggers` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentTemplateFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-template-format` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$DashPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :dash-manifests)]
      (. builder dashManifests data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :include-encoder-configuration-in-segments)]
      (. builder includeEncoderConfigurationInSegments data))
    (when-let [data (lookup-entry config id :include-iframe-only-stream)]
      (. builder includeIframeOnlyStream data))
    (when-let [data (lookup-entry config id :period-triggers)]
      (. builder periodTriggers data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :segment-template-format)]
      (. builder segmentTemplateFormat data))
    (.build builder)))


(defn cfn-packaging-configuration-encryption-contract-configuration-property-builder
  "The cfn-packaging-configuration-encryption-contract-configuration-property-builder function buildes out new instances of 
CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `presetSpeke20Audio` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-audio` |
| `presetSpeke20Video` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-video` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :preset-speke20-audio)]
      (. builder presetSpeke20Audio data))
    (when-let [data (lookup-entry config id :preset-speke20-video)]
      (. builder presetSpeke20Video data))
    (.build builder)))


(defn cfn-packaging-configuration-hls-encryption-property-builder
  "The cfn-packaging-configuration-hls-encryption-property-builder function buildes out new instances of 
CfnPackagingConfiguration$HlsEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$HlsEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :encryption-method)]
      (. builder encryptionMethod data))
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-packaging-configuration-hls-manifest-property-builder
  "The cfn-packaging-configuration-hls-manifest-property-builder function buildes out new instances of 
CfnPackagingConfiguration$HlsManifestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkers` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-markers` |
| `includeIframeOnlyStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `repeatExtXKey` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:repeat-ext-x-key` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$HlsManifestProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-markers)]
      (. builder adMarkers data))
    (when-let [data (lookup-entry config id :include-iframe-only-stream)]
      (. builder includeIframeOnlyStream data))
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :program-date-time-interval-seconds)]
      (. builder programDateTimeIntervalSeconds data))
    (when-let [data (lookup-entry config id :repeat-ext-x-key)]
      (. builder repeatExtXKey data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (.build builder)))


(defn cfn-packaging-configuration-hls-package-property-builder
  "The cfn-packaging-configuration-hls-package-property-builder function buildes out new instances of 
CfnPackagingConfiguration$HlsPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$HlsEncryptionProperty | [[cdk.support/lookup-entry]] | `:encryption` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `includeDvbSubtitles` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-dvb-subtitles` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `useAudioRenditionGroup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-audio-rendition-group` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$HlsPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :hls-manifests)]
      (. builder hlsManifests data))
    (when-let [data (lookup-entry config id :include-dvb-subtitles)]
      (. builder includeDvbSubtitles data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (when-let [data (lookup-entry config id :use-audio-rendition-group)]
      (. builder useAudioRenditionGroup data))
    (.build builder)))


(defn cfn-packaging-configuration-mss-encryption-property-builder
  "The cfn-packaging-configuration-mss-encryption-property-builder function buildes out new instances of 
CfnPackagingConfiguration$MssEncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$MssEncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :speke-key-provider)]
      (. builder spekeKeyProvider data))
    (.build builder)))


(defn cfn-packaging-configuration-mss-manifest-property-builder
  "The cfn-packaging-configuration-mss-manifest-property-builder function buildes out new instances of 
CfnPackagingConfiguration$MssManifestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `streamSelection` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$StreamSelectionProperty | [[cdk.support/lookup-entry]] | `:stream-selection` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$MssManifestProperty$Builder.)]
    (when-let [data (lookup-entry config id :manifest-name)]
      (. builder manifestName data))
    (when-let [data (lookup-entry config id :stream-selection)]
      (. builder streamSelection data))
    (.build builder)))


(defn cfn-packaging-configuration-mss-package-property-builder
  "The cfn-packaging-configuration-mss-package-property-builder function buildes out new instances of 
CfnPackagingConfiguration$MssPackageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `mssManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mss-manifests` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$MssPackageProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :mss-manifests)]
      (. builder mssManifests data))
    (when-let [data (lookup-entry config id :segment-duration-seconds)]
      (. builder segmentDurationSeconds data))
    (.build builder)))


(defn cfn-packaging-configuration-props-builder
  "The cfn-packaging-configuration-props-builder function buildes out new instances of 
CfnPackagingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmafPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cmaf-package` |
| `dashPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dash-package` |
| `hlsPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$HlsPackageProperty | [[cdk.support/lookup-entry]] | `:hls-package` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `mssPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$MssPackageProperty | [[cdk.support/lookup-entry]] | `:mss-package` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackagingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :cmaf-package)]
      (. builder cmafPackage data))
    (when-let [data (lookup-entry config id :dash-package)]
      (. builder dashPackage data))
    (when-let [data (lookup-entry config id :hls-package)]
      (. builder hlsPackage data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :mss-package)]
      (. builder mssPackage data))
    (when-let [data (lookup-entry config id :packaging-group-id)]
      (. builder packagingGroupId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-packaging-configuration-speke-key-provider-property-builder
  "The cfn-packaging-configuration-speke-key-provider-property-builder function buildes out new instances of 
CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionContractConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-contract-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `systemIds` | java.util.List | [[cdk.support/lookup-entry]] | `:system-ids` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-contract-configuration)]
      (. builder encryptionContractConfiguration data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :system-ids)]
      (. builder systemIds data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-packaging-configuration-stream-selection-property-builder
  "The cfn-packaging-configuration-stream-selection-property-builder function buildes out new instances of 
CfnPackagingConfiguration$StreamSelectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-video-bits-per-second` |
| `minVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-video-bits-per-second` |
| `streamOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-order` |"
  [stack id config]
  (let [builder (CfnPackagingConfiguration$StreamSelectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-video-bits-per-second)]
      (. builder maxVideoBitsPerSecond data))
    (when-let [data (lookup-entry config id :min-video-bits-per-second)]
      (. builder minVideoBitsPerSecond data))
    (when-let [data (lookup-entry config id :stream-order)]
      (. builder streamOrder data))
    (.build builder)))


(defn cfn-packaging-group-authorization-property-builder
  "The cfn-packaging-group-authorization-property-builder function buildes out new instances of 
CfnPackagingGroup$AuthorizationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdnIdentifierSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdn-identifier-secret` |
| `secretsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-role-arn` |"
  [stack id config]
  (let [builder (CfnPackagingGroup$AuthorizationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cdn-identifier-secret)]
      (. builder cdnIdentifierSecret data))
    (when-let [data (lookup-entry config id :secrets-role-arn)]
      (. builder secretsRoleArn data))
    (.build builder)))


(defn cfn-packaging-group-builder
  "The cfn-packaging-group-builder function buildes out new instances of 
CfnPackagingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.mediapackage.CfnPackagingGroup$AuthorizationProperty | [[cdk.support/lookup-entry]] | `:authorization` |
| `egressAccessLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackagingGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorization)]
      (. builder authorization data))
    (when-let [data (lookup-entry config id :egress-access-logs)]
      (. builder egressAccessLogs data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-packaging-group-log-configuration-property-builder
  "The cfn-packaging-group-log-configuration-property-builder function buildes out new instances of 
CfnPackagingGroup$LogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |"
  [stack id config]
  (let [builder (CfnPackagingGroup$LogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (.build builder)))


(defn cfn-packaging-group-props-builder
  "The cfn-packaging-group-props-builder function buildes out new instances of 
CfnPackagingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.mediapackage.CfnPackagingGroup$AuthorizationProperty | [[cdk.support/lookup-entry]] | `:authorization` |
| `egressAccessLogs` | software.amazon.awscdk.services.mediapackage.CfnPackagingGroup$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackagingGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :authorization)]
      (. builder authorization data))
    (when-let [data (lookup-entry config id :egress-access-logs)]
      (. builder egressAccessLogs data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))