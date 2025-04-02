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


(defn cfn-asset-builder>
  "The cfn-asset-builder> function updates a CfnAsset$Builder instance using the provided configuration.
  The function takes the CfnAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressEndpoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-endpoints` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAsset$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-endpoints)]
    (. builder egressEndpoints data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :packaging-group-id)]
    (. builder packagingGroupId data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-some [data (lookup-entry config id :source-role-arn)]
    (. builder sourceRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-asset-builder
  "Creates a  `CfnAsset$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-asset-builder> (CfnAsset$Builder/create scope (name id)) id config))


(defn cfn-asset-egress-endpoint-property-builder>
  "The cfn-asset-egress-endpoint-property-builder> function updates a CfnAsset$EgressEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnAsset$EgressEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packagingConfigurationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-configuration-id` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnAsset$EgressEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :packaging-configuration-id)]
    (. builder packagingConfigurationId data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-asset-egress-endpoint-property-builder
  "Creates a  `CfnAsset$EgressEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-asset-egress-endpoint-property-builder> (new CfnAsset$EgressEndpointProperty$Builder) id config))


(defn cfn-asset-props-builder>
  "The cfn-asset-props-builder> function updates a CfnAssetProps$Builder instance using the provided configuration.
  The function takes the CfnAssetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-endpoints` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-endpoints)]
    (. builder egressEndpoints data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :packaging-group-id)]
    (. builder packagingGroupId data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-some [data (lookup-entry config id :source-role-arn)]
    (. builder sourceRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-asset-props-builder
  "Creates a  `CfnAssetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-asset-props-builder> (new CfnAssetProps$Builder) id config))


(defn cfn-channel-builder>
  "The cfn-channel-builder> function updates a CfnChannel$Builder instance using the provided configuration.
  The function takes the CfnChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `egressAccessLogs` | software.amazon.awscdk.services.mediapackage.CfnChannel$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `hlsIngest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-ingest` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `ingressAccessLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ingress-access-logs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannel$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :egress-access-logs)]
    (. builder egressAccessLogs data))
  (when-some [data (lookup-entry config id :hls-ingest)]
    (. builder hlsIngest data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :ingress-access-logs)]
    (. builder ingressAccessLogs data))
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


(defn cfn-channel-hls-ingest-property-builder>
  "The cfn-channel-hls-ingest-property-builder> function updates a CfnChannel$HlsIngestProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$HlsIngestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingestEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:ingest-endpoints` |
"
  [^CfnChannel$HlsIngestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ingest-endpoints)]
    (. builder ingestEndpoints data))
  (.build builder))


(defn cfn-channel-hls-ingest-property-builder
  "Creates a  `CfnChannel$HlsIngestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-hls-ingest-property-builder> (new CfnChannel$HlsIngestProperty$Builder) id config))


(defn cfn-channel-ingest-endpoint-property-builder>
  "The cfn-channel-ingest-endpoint-property-builder> function updates a CfnChannel$IngestEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$IngestEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnChannel$IngestEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-channel-ingest-endpoint-property-builder
  "Creates a  `CfnChannel$IngestEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-ingest-endpoint-property-builder> (new CfnChannel$IngestEndpointProperty$Builder) id config))


(defn cfn-channel-log-configuration-property-builder>
  "The cfn-channel-log-configuration-property-builder> function updates a CfnChannel$LogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnChannel$LogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
"
  [^CfnChannel$LogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (.build builder))


(defn cfn-channel-log-configuration-property-builder
  "Creates a  `CfnChannel$LogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-channel-log-configuration-property-builder> (new CfnChannel$LogConfigurationProperty$Builder) id config))


(defn cfn-channel-props-builder>
  "The cfn-channel-props-builder> function updates a CfnChannelProps$Builder instance using the provided configuration.
  The function takes the CfnChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `egressAccessLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `hlsIngest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-ingest` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `ingressAccessLogs` | software.amazon.awscdk.services.mediapackage.CfnChannel$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-access-logs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnChannelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :egress-access-logs)]
    (. builder egressAccessLogs data))
  (when-some [data (lookup-entry config id :hls-ingest)]
    (. builder hlsIngest data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :ingress-access-logs)]
    (. builder ingressAccessLogs data))
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


(defn cfn-origin-endpoint-authorization-property-builder>
  "The cfn-origin-endpoint-authorization-property-builder> function updates a CfnOriginEndpoint$AuthorizationProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$AuthorizationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdnIdentifierSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdn-identifier-secret` |
| `secretsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-role-arn` |
"
  [^CfnOriginEndpoint$AuthorizationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cdn-identifier-secret)]
    (. builder cdnIdentifierSecret data))
  (when-some [data (lookup-entry config id :secrets-role-arn)]
    (. builder secretsRoleArn data))
  (.build builder))


(defn cfn-origin-endpoint-authorization-property-builder
  "Creates a  `CfnOriginEndpoint$AuthorizationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-authorization-property-builder> (new CfnOriginEndpoint$AuthorizationProperty$Builder) id config))


(defn cfn-origin-endpoint-builder>
  "The cfn-origin-endpoint-builder> function updates a CfnOriginEndpoint$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `whitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelist` |
"
  [^CfnOriginEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization)]
    (. builder authorization data))
  (when-some [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-some [data (lookup-entry config id :cmaf-package)]
    (. builder cmafPackage data))
  (when-some [data (lookup-entry config id :dash-package)]
    (. builder dashPackage data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hls-package)]
    (. builder hlsPackage data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :mss-package)]
    (. builder mssPackage data))
  (when-some [data (lookup-entry config id :origination)]
    (. builder origination data))
  (when-some [data (lookup-entry config id :startover-window-seconds)]
    (. builder startoverWindowSeconds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :time-delay-seconds)]
    (. builder timeDelaySeconds data))
  (when-some [data (lookup-entry config id :whitelist)]
    (. builder whitelist data))
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


(defn cfn-origin-endpoint-cmaf-encryption-property-builder>
  "The cfn-origin-endpoint-cmaf-encryption-property-builder> function updates a CfnOriginEndpoint$CmafEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$CmafEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnOriginEndpoint$CmafEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :encryption-method)]
    (. builder encryptionMethod data))
  (when-some [data (lookup-entry config id :key-rotation-interval-seconds)]
    (. builder keyRotationIntervalSeconds data))
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-origin-endpoint-cmaf-encryption-property-builder
  "Creates a  `CfnOriginEndpoint$CmafEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-cmaf-encryption-property-builder> (new CfnOriginEndpoint$CmafEncryptionProperty$Builder) id config))


(defn cfn-origin-endpoint-cmaf-package-property-builder>
  "The cfn-origin-endpoint-cmaf-package-property-builder> function updates a CfnOriginEndpoint$CmafPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$CmafPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-prefix` |
| `streamSelection` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$StreamSelectionProperty | [[cdk.support/lookup-entry]] | `:stream-selection` |
"
  [^CfnOriginEndpoint$CmafPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :hls-manifests)]
    (. builder hlsManifests data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :segment-prefix)]
    (. builder segmentPrefix data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (.build builder))


(defn cfn-origin-endpoint-cmaf-package-property-builder
  "Creates a  `CfnOriginEndpoint$CmafPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-cmaf-package-property-builder> (new CfnOriginEndpoint$CmafPackageProperty$Builder) id config))


(defn cfn-origin-endpoint-dash-encryption-property-builder>
  "The cfn-origin-endpoint-dash-encryption-property-builder> function updates a CfnOriginEndpoint$DashEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$DashEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnOriginEndpoint$DashEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-rotation-interval-seconds)]
    (. builder keyRotationIntervalSeconds data))
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-origin-endpoint-dash-encryption-property-builder
  "Creates a  `CfnOriginEndpoint$DashEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-dash-encryption-property-builder> (new CfnOriginEndpoint$DashEncryptionProperty$Builder) id config))


(defn cfn-origin-endpoint-dash-package-property-builder>
  "The cfn-origin-endpoint-dash-package-property-builder> function updates a CfnOriginEndpoint$DashPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$DashPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `utcTimingUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:utc-timing-uri` |
"
  [^CfnOriginEndpoint$DashPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-triggers)]
    (. builder adTriggers data))
  (when-some [data (lookup-entry config id :ads-on-delivery-restrictions)]
    (. builder adsOnDeliveryRestrictions data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :include-iframe-only-stream)]
    (. builder includeIframeOnlyStream data))
  (when-some [data (lookup-entry config id :manifest-layout)]
    (. builder manifestLayout data))
  (when-some [data (lookup-entry config id :manifest-window-seconds)]
    (. builder manifestWindowSeconds data))
  (when-some [data (lookup-entry config id :min-buffer-time-seconds)]
    (. builder minBufferTimeSeconds data))
  (when-some [data (lookup-entry config id :min-update-period-seconds)]
    (. builder minUpdatePeriodSeconds data))
  (when-some [data (lookup-entry config id :period-triggers)]
    (. builder periodTriggers data))
  (when-some [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :segment-template-format)]
    (. builder segmentTemplateFormat data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (when-some [data (lookup-entry config id :suggested-presentation-delay-seconds)]
    (. builder suggestedPresentationDelaySeconds data))
  (when-some [data (lookup-entry config id :utc-timing)]
    (. builder utcTiming data))
  (when-some [data (lookup-entry config id :utc-timing-uri)]
    (. builder utcTimingUri data))
  (.build builder))


(defn cfn-origin-endpoint-dash-package-property-builder
  "Creates a  `CfnOriginEndpoint$DashPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-dash-package-property-builder> (new CfnOriginEndpoint$DashPackageProperty$Builder) id config))


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


(defn cfn-origin-endpoint-hls-encryption-property-builder>
  "The cfn-origin-endpoint-hls-encryption-property-builder> function updates a CfnOriginEndpoint$HlsEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$HlsEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `keyRotationIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:key-rotation-interval-seconds` |
| `repeatExtXKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:repeat-ext-x-key` |
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnOriginEndpoint$HlsEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :encryption-method)]
    (. builder encryptionMethod data))
  (when-some [data (lookup-entry config id :key-rotation-interval-seconds)]
    (. builder keyRotationIntervalSeconds data))
  (when-some [data (lookup-entry config id :repeat-ext-x-key)]
    (. builder repeatExtXKey data))
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-origin-endpoint-hls-encryption-property-builder
  "Creates a  `CfnOriginEndpoint$HlsEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-hls-encryption-property-builder> (new CfnOriginEndpoint$HlsEncryptionProperty$Builder) id config))


(defn cfn-origin-endpoint-hls-manifest-property-builder>
  "The cfn-origin-endpoint-hls-manifest-property-builder> function updates a CfnOriginEndpoint$HlsManifestProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$HlsManifestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOriginEndpoint$HlsManifestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-markers)]
    (. builder adMarkers data))
  (when-some [data (lookup-entry config id :ad-triggers)]
    (. builder adTriggers data))
  (when-some [data (lookup-entry config id :ads-on-delivery-restrictions)]
    (. builder adsOnDeliveryRestrictions data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :include-iframe-only-stream)]
    (. builder includeIframeOnlyStream data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :playlist-type)]
    (. builder playlistType data))
  (when-some [data (lookup-entry config id :playlist-window-seconds)]
    (. builder playlistWindowSeconds data))
  (when-some [data (lookup-entry config id :program-date-time-interval-seconds)]
    (. builder programDateTimeIntervalSeconds data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-origin-endpoint-hls-manifest-property-builder
  "Creates a  `CfnOriginEndpoint$HlsManifestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-hls-manifest-property-builder> (new CfnOriginEndpoint$HlsManifestProperty$Builder) id config))


(defn cfn-origin-endpoint-hls-package-property-builder>
  "The cfn-origin-endpoint-hls-package-property-builder> function updates a CfnOriginEndpoint$HlsPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$HlsPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `useAudioRenditionGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-audio-rendition-group` |
"
  [^CfnOriginEndpoint$HlsPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-markers)]
    (. builder adMarkers data))
  (when-some [data (lookup-entry config id :ad-triggers)]
    (. builder adTriggers data))
  (when-some [data (lookup-entry config id :ads-on-delivery-restrictions)]
    (. builder adsOnDeliveryRestrictions data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :include-dvb-subtitles)]
    (. builder includeDvbSubtitles data))
  (when-some [data (lookup-entry config id :include-iframe-only-stream)]
    (. builder includeIframeOnlyStream data))
  (when-some [data (lookup-entry config id :playlist-type)]
    (. builder playlistType data))
  (when-some [data (lookup-entry config id :playlist-window-seconds)]
    (. builder playlistWindowSeconds data))
  (when-some [data (lookup-entry config id :program-date-time-interval-seconds)]
    (. builder programDateTimeIntervalSeconds data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (when-some [data (lookup-entry config id :use-audio-rendition-group)]
    (. builder useAudioRenditionGroup data))
  (.build builder))


(defn cfn-origin-endpoint-hls-package-property-builder
  "Creates a  `CfnOriginEndpoint$HlsPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-hls-package-property-builder> (new CfnOriginEndpoint$HlsPackageProperty$Builder) id config))


(defn cfn-origin-endpoint-mss-encryption-property-builder>
  "The cfn-origin-endpoint-mss-encryption-property-builder> function updates a CfnOriginEndpoint$MssEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$MssEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnOriginEndpoint$MssEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-origin-endpoint-mss-encryption-property-builder
  "Creates a  `CfnOriginEndpoint$MssEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-mss-encryption-property-builder> (new CfnOriginEndpoint$MssEncryptionProperty$Builder) id config))


(defn cfn-origin-endpoint-mss-package-property-builder>
  "The cfn-origin-endpoint-mss-package-property-builder> function updates a CfnOriginEndpoint$MssPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$MssPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `manifestWindowSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manifest-window-seconds` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |
"
  [^CfnOriginEndpoint$MssPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :manifest-window-seconds)]
    (. builder manifestWindowSeconds data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (.build builder))


(defn cfn-origin-endpoint-mss-package-property-builder
  "Creates a  `CfnOriginEndpoint$MssPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-mss-package-property-builder> (new CfnOriginEndpoint$MssPackageProperty$Builder) id config))


(defn cfn-origin-endpoint-props-builder>
  "The cfn-origin-endpoint-props-builder> function updates a CfnOriginEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `whitelist` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelist` |
"
  [^CfnOriginEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization)]
    (. builder authorization data))
  (when-some [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-some [data (lookup-entry config id :cmaf-package)]
    (. builder cmafPackage data))
  (when-some [data (lookup-entry config id :dash-package)]
    (. builder dashPackage data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hls-package)]
    (. builder hlsPackage data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :mss-package)]
    (. builder mssPackage data))
  (when-some [data (lookup-entry config id :origination)]
    (. builder origination data))
  (when-some [data (lookup-entry config id :startover-window-seconds)]
    (. builder startoverWindowSeconds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :time-delay-seconds)]
    (. builder timeDelaySeconds data))
  (when-some [data (lookup-entry config id :whitelist)]
    (. builder whitelist data))
  (.build builder))


(defn cfn-origin-endpoint-props-builder
  "Creates a  `CfnOriginEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-props-builder> (new CfnOriginEndpointProps$Builder) id config))


(defn cfn-origin-endpoint-speke-key-provider-property-builder>
  "The cfn-origin-endpoint-speke-key-provider-property-builder> function updates a CfnOriginEndpoint$SpekeKeyProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$SpekeKeyProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `encryptionContractConfiguration` | software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint$EncryptionContractConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-contract-configuration` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `systemIds` | java.util.List | [[cdk.support/lookup-entry]] | `:system-ids` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOriginEndpoint$SpekeKeyProviderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :encryption-contract-configuration)]
    (. builder encryptionContractConfiguration data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :system-ids)]
    (. builder systemIds data))
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


(defn cfn-origin-endpoint-stream-selection-property-builder>
  "The cfn-origin-endpoint-stream-selection-property-builder> function updates a CfnOriginEndpoint$StreamSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginEndpoint$StreamSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-video-bits-per-second` |
| `minVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-video-bits-per-second` |
| `streamOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-order` |
"
  [^CfnOriginEndpoint$StreamSelectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-video-bits-per-second)]
    (. builder maxVideoBitsPerSecond data))
  (when-some [data (lookup-entry config id :min-video-bits-per-second)]
    (. builder minVideoBitsPerSecond data))
  (when-some [data (lookup-entry config id :stream-order)]
    (. builder streamOrder data))
  (.build builder))


(defn cfn-origin-endpoint-stream-selection-property-builder
  "Creates a  `CfnOriginEndpoint$StreamSelectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-endpoint-stream-selection-property-builder> (new CfnOriginEndpoint$StreamSelectionProperty$Builder) id config))


(defn cfn-packaging-configuration-builder>
  "The cfn-packaging-configuration-builder> function updates a CfnPackagingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmafPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$CmafPackageProperty | [[cdk.support/lookup-entry]] | `:cmaf-package` |
| `dashPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dash-package` |
| `hlsPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$HlsPackageProperty | [[cdk.support/lookup-entry]] | `:hls-package` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `mssPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$MssPackageProperty | [[cdk.support/lookup-entry]] | `:mss-package` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackagingConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :cmaf-package)]
    (. builder cmafPackage data))
  (when-some [data (lookup-entry config id :dash-package)]
    (. builder dashPackage data))
  (when-some [data (lookup-entry config id :hls-package)]
    (. builder hlsPackage data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :mss-package)]
    (. builder mssPackage data))
  (when-some [data (lookup-entry config id :packaging-group-id)]
    (. builder packagingGroupId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-packaging-configuration-builder
  "Creates a  `CfnPackagingConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-packaging-configuration-builder> (CfnPackagingConfiguration$Builder/create scope (name id)) id config))


(defn cfn-packaging-configuration-cmaf-encryption-property-builder>
  "The cfn-packaging-configuration-cmaf-encryption-property-builder> function updates a CfnPackagingConfiguration$CmafEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$CmafEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnPackagingConfiguration$CmafEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-packaging-configuration-cmaf-encryption-property-builder
  "Creates a  `CfnPackagingConfiguration$CmafEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-cmaf-encryption-property-builder> (new CfnPackagingConfiguration$CmafEncryptionProperty$Builder) id config))


(defn cfn-packaging-configuration-cmaf-package-property-builder>
  "The cfn-packaging-configuration-cmaf-package-property-builder> function updates a CfnPackagingConfiguration$CmafPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$CmafPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `includeEncoderConfigurationInSegments` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-encoder-configuration-in-segments` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
"
  [^CfnPackagingConfiguration$CmafPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :hls-manifests)]
    (. builder hlsManifests data))
  (when-some [data (lookup-entry config id :include-encoder-configuration-in-segments)]
    (. builder includeEncoderConfigurationInSegments data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (.build builder))


(defn cfn-packaging-configuration-cmaf-package-property-builder
  "Creates a  `CfnPackagingConfiguration$CmafPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-cmaf-package-property-builder> (new CfnPackagingConfiguration$CmafPackageProperty$Builder) id config))


(defn cfn-packaging-configuration-dash-encryption-property-builder>
  "The cfn-packaging-configuration-dash-encryption-property-builder> function updates a CfnPackagingConfiguration$DashEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$DashEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnPackagingConfiguration$DashEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-packaging-configuration-dash-encryption-property-builder
  "Creates a  `CfnPackagingConfiguration$DashEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-dash-encryption-property-builder> (new CfnPackagingConfiguration$DashEncryptionProperty$Builder) id config))


(defn cfn-packaging-configuration-dash-manifest-property-builder>
  "The cfn-packaging-configuration-dash-manifest-property-builder> function updates a CfnPackagingConfiguration$DashManifestProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$DashManifestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestLayout` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-layout` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `minBufferTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-buffer-time-seconds` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `scteMarkersSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:scte-markers-source` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |
"
  [^CfnPackagingConfiguration$DashManifestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :manifest-layout)]
    (. builder manifestLayout data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :min-buffer-time-seconds)]
    (. builder minBufferTimeSeconds data))
  (when-some [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-some [data (lookup-entry config id :scte-markers-source)]
    (. builder scteMarkersSource data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (.build builder))


(defn cfn-packaging-configuration-dash-manifest-property-builder
  "Creates a  `CfnPackagingConfiguration$DashManifestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-dash-manifest-property-builder> (new CfnPackagingConfiguration$DashManifestProperty$Builder) id config))


(defn cfn-packaging-configuration-dash-package-property-builder>
  "The cfn-packaging-configuration-dash-package-property-builder> function updates a CfnPackagingConfiguration$DashPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$DashPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashManifests` | java.util.List | [[cdk.support/lookup-entry]] | `:dash-manifests` |
| `encryption` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$DashEncryptionProperty | [[cdk.support/lookup-entry]] | `:encryption` |
| `includeEncoderConfigurationInSegments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-encoder-configuration-in-segments` |
| `includeIframeOnlyStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `periodTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:period-triggers` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `segmentTemplateFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-template-format` |
"
  [^CfnPackagingConfiguration$DashPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dash-manifests)]
    (. builder dashManifests data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :include-encoder-configuration-in-segments)]
    (. builder includeEncoderConfigurationInSegments data))
  (when-some [data (lookup-entry config id :include-iframe-only-stream)]
    (. builder includeIframeOnlyStream data))
  (when-some [data (lookup-entry config id :period-triggers)]
    (. builder periodTriggers data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :segment-template-format)]
    (. builder segmentTemplateFormat data))
  (.build builder))


(defn cfn-packaging-configuration-dash-package-property-builder
  "Creates a  `CfnPackagingConfiguration$DashPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-dash-package-property-builder> (new CfnPackagingConfiguration$DashPackageProperty$Builder) id config))


(defn cfn-packaging-configuration-encryption-contract-configuration-property-builder>
  "The cfn-packaging-configuration-encryption-contract-configuration-property-builder> function updates a CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `presetSpeke20Audio` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-audio` |
| `presetSpeke20Video` | java.lang.String | [[cdk.support/lookup-entry]] | `:preset-speke20-video` |
"
  [^CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :preset-speke20-audio)]
    (. builder presetSpeke20Audio data))
  (when-some [data (lookup-entry config id :preset-speke20-video)]
    (. builder presetSpeke20Video data))
  (.build builder))


(defn cfn-packaging-configuration-encryption-contract-configuration-property-builder
  "Creates a  `CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-encryption-contract-configuration-property-builder> (new CfnPackagingConfiguration$EncryptionContractConfigurationProperty$Builder) id config))


(defn cfn-packaging-configuration-hls-encryption-property-builder>
  "The cfn-packaging-configuration-hls-encryption-property-builder> function updates a CfnPackagingConfiguration$HlsEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$HlsEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `encryptionMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-method` |
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnPackagingConfiguration$HlsEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :encryption-method)]
    (. builder encryptionMethod data))
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-packaging-configuration-hls-encryption-property-builder
  "Creates a  `CfnPackagingConfiguration$HlsEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-hls-encryption-property-builder> (new CfnPackagingConfiguration$HlsEncryptionProperty$Builder) id config))


(defn cfn-packaging-configuration-hls-manifest-property-builder>
  "The cfn-packaging-configuration-hls-manifest-property-builder> function updates a CfnPackagingConfiguration$HlsManifestProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$HlsManifestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adMarkers` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-markers` |
| `includeIframeOnlyStream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-iframe-only-stream` |
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `programDateTimeIntervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:program-date-time-interval-seconds` |
| `repeatExtXKey` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:repeat-ext-x-key` |
| `streamSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-selection` |
"
  [^CfnPackagingConfiguration$HlsManifestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-markers)]
    (. builder adMarkers data))
  (when-some [data (lookup-entry config id :include-iframe-only-stream)]
    (. builder includeIframeOnlyStream data))
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :program-date-time-interval-seconds)]
    (. builder programDateTimeIntervalSeconds data))
  (when-some [data (lookup-entry config id :repeat-ext-x-key)]
    (. builder repeatExtXKey data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (.build builder))


(defn cfn-packaging-configuration-hls-manifest-property-builder
  "Creates a  `CfnPackagingConfiguration$HlsManifestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-hls-manifest-property-builder> (new CfnPackagingConfiguration$HlsManifestProperty$Builder) id config))


(defn cfn-packaging-configuration-hls-package-property-builder>
  "The cfn-packaging-configuration-hls-package-property-builder> function updates a CfnPackagingConfiguration$HlsPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$HlsPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$HlsEncryptionProperty | [[cdk.support/lookup-entry]] | `:encryption` |
| `hlsManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hls-manifests` |
| `includeDvbSubtitles` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-dvb-subtitles` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
| `useAudioRenditionGroup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-audio-rendition-group` |
"
  [^CfnPackagingConfiguration$HlsPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :hls-manifests)]
    (. builder hlsManifests data))
  (when-some [data (lookup-entry config id :include-dvb-subtitles)]
    (. builder includeDvbSubtitles data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (when-some [data (lookup-entry config id :use-audio-rendition-group)]
    (. builder useAudioRenditionGroup data))
  (.build builder))


(defn cfn-packaging-configuration-hls-package-property-builder
  "Creates a  `CfnPackagingConfiguration$HlsPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-hls-package-property-builder> (new CfnPackagingConfiguration$HlsPackageProperty$Builder) id config))


(defn cfn-packaging-configuration-mss-encryption-property-builder>
  "The cfn-packaging-configuration-mss-encryption-property-builder> function updates a CfnPackagingConfiguration$MssEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$MssEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spekeKeyProvider` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$SpekeKeyProviderProperty | [[cdk.support/lookup-entry]] | `:speke-key-provider` |
"
  [^CfnPackagingConfiguration$MssEncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :speke-key-provider)]
    (. builder spekeKeyProvider data))
  (.build builder))


(defn cfn-packaging-configuration-mss-encryption-property-builder
  "Creates a  `CfnPackagingConfiguration$MssEncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-mss-encryption-property-builder> (new CfnPackagingConfiguration$MssEncryptionProperty$Builder) id config))


(defn cfn-packaging-configuration-mss-manifest-property-builder>
  "The cfn-packaging-configuration-mss-manifest-property-builder> function updates a CfnPackagingConfiguration$MssManifestProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$MssManifestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifestName` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-name` |
| `streamSelection` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$StreamSelectionProperty | [[cdk.support/lookup-entry]] | `:stream-selection` |
"
  [^CfnPackagingConfiguration$MssManifestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :manifest-name)]
    (. builder manifestName data))
  (when-some [data (lookup-entry config id :stream-selection)]
    (. builder streamSelection data))
  (.build builder))


(defn cfn-packaging-configuration-mss-manifest-property-builder
  "Creates a  `CfnPackagingConfiguration$MssManifestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-mss-manifest-property-builder> (new CfnPackagingConfiguration$MssManifestProperty$Builder) id config))


(defn cfn-packaging-configuration-mss-package-property-builder>
  "The cfn-packaging-configuration-mss-package-property-builder> function updates a CfnPackagingConfiguration$MssPackageProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$MssPackageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `mssManifests` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mss-manifests` |
| `segmentDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-duration-seconds` |
"
  [^CfnPackagingConfiguration$MssPackageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :mss-manifests)]
    (. builder mssManifests data))
  (when-some [data (lookup-entry config id :segment-duration-seconds)]
    (. builder segmentDurationSeconds data))
  (.build builder))


(defn cfn-packaging-configuration-mss-package-property-builder
  "Creates a  `CfnPackagingConfiguration$MssPackageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-mss-package-property-builder> (new CfnPackagingConfiguration$MssPackageProperty$Builder) id config))


(defn cfn-packaging-configuration-props-builder>
  "The cfn-packaging-configuration-props-builder> function updates a CfnPackagingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmafPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cmaf-package` |
| `dashPackage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dash-package` |
| `hlsPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$HlsPackageProperty | [[cdk.support/lookup-entry]] | `:hls-package` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `mssPackage` | software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration$MssPackageProperty | [[cdk.support/lookup-entry]] | `:mss-package` |
| `packagingGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-group-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackagingConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cmaf-package)]
    (. builder cmafPackage data))
  (when-some [data (lookup-entry config id :dash-package)]
    (. builder dashPackage data))
  (when-some [data (lookup-entry config id :hls-package)]
    (. builder hlsPackage data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :mss-package)]
    (. builder mssPackage data))
  (when-some [data (lookup-entry config id :packaging-group-id)]
    (. builder packagingGroupId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-packaging-configuration-props-builder
  "Creates a  `CfnPackagingConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-props-builder> (new CfnPackagingConfigurationProps$Builder) id config))


(defn cfn-packaging-configuration-speke-key-provider-property-builder>
  "The cfn-packaging-configuration-speke-key-provider-property-builder> function updates a CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionContractConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-contract-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `systemIds` | java.util.List | [[cdk.support/lookup-entry]] | `:system-ids` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-contract-configuration)]
    (. builder encryptionContractConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :system-ids)]
    (. builder systemIds data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-packaging-configuration-speke-key-provider-property-builder
  "Creates a  `CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-speke-key-provider-property-builder> (new CfnPackagingConfiguration$SpekeKeyProviderProperty$Builder) id config))


(defn cfn-packaging-configuration-stream-selection-property-builder>
  "The cfn-packaging-configuration-stream-selection-property-builder> function updates a CfnPackagingConfiguration$StreamSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingConfiguration$StreamSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-video-bits-per-second` |
| `minVideoBitsPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-video-bits-per-second` |
| `streamOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-order` |
"
  [^CfnPackagingConfiguration$StreamSelectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-video-bits-per-second)]
    (. builder maxVideoBitsPerSecond data))
  (when-some [data (lookup-entry config id :min-video-bits-per-second)]
    (. builder minVideoBitsPerSecond data))
  (when-some [data (lookup-entry config id :stream-order)]
    (. builder streamOrder data))
  (.build builder))


(defn cfn-packaging-configuration-stream-selection-property-builder
  "Creates a  `CfnPackagingConfiguration$StreamSelectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-configuration-stream-selection-property-builder> (new CfnPackagingConfiguration$StreamSelectionProperty$Builder) id config))


(defn cfn-packaging-group-authorization-property-builder>
  "The cfn-packaging-group-authorization-property-builder> function updates a CfnPackagingGroup$AuthorizationProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingGroup$AuthorizationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cdnIdentifierSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:cdn-identifier-secret` |
| `secretsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secrets-role-arn` |
"
  [^CfnPackagingGroup$AuthorizationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cdn-identifier-secret)]
    (. builder cdnIdentifierSecret data))
  (when-some [data (lookup-entry config id :secrets-role-arn)]
    (. builder secretsRoleArn data))
  (.build builder))


(defn cfn-packaging-group-authorization-property-builder
  "Creates a  `CfnPackagingGroup$AuthorizationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-group-authorization-property-builder> (new CfnPackagingGroup$AuthorizationProperty$Builder) id config))


(defn cfn-packaging-group-builder>
  "The cfn-packaging-group-builder> function updates a CfnPackagingGroup$Builder instance using the provided configuration.
  The function takes the CfnPackagingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.mediapackage.CfnPackagingGroup$AuthorizationProperty | [[cdk.support/lookup-entry]] | `:authorization` |
| `egressAccessLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackagingGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization)]
    (. builder authorization data))
  (when-some [data (lookup-entry config id :egress-access-logs)]
    (. builder egressAccessLogs data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-packaging-group-builder
  "Creates a  `CfnPackagingGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-packaging-group-builder> (CfnPackagingGroup$Builder/create scope (name id)) id config))


(defn cfn-packaging-group-log-configuration-property-builder>
  "The cfn-packaging-group-log-configuration-property-builder> function updates a CfnPackagingGroup$LogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPackagingGroup$LogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
"
  [^CfnPackagingGroup$LogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (.build builder))


(defn cfn-packaging-group-log-configuration-property-builder
  "Creates a  `CfnPackagingGroup$LogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-group-log-configuration-property-builder> (new CfnPackagingGroup$LogConfigurationProperty$Builder) id config))


(defn cfn-packaging-group-props-builder>
  "The cfn-packaging-group-props-builder> function updates a CfnPackagingGroupProps$Builder instance using the provided configuration.
  The function takes the CfnPackagingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorization` | software.amazon.awscdk.services.mediapackage.CfnPackagingGroup$AuthorizationProperty | [[cdk.support/lookup-entry]] | `:authorization` |
| `egressAccessLogs` | software.amazon.awscdk.services.mediapackage.CfnPackagingGroup$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:egress-access-logs` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackagingGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization)]
    (. builder authorization data))
  (when-some [data (lookup-entry config id :egress-access-logs)]
    (. builder egressAccessLogs data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-packaging-group-props-builder
  "Creates a  `CfnPackagingGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-packaging-group-props-builder> (new CfnPackagingGroupProps$Builder) id config))