(ns cdk.api.services.iotfleetwise
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotfleetwise package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotfleetwise CfnCampaign$Builder
                                                         CfnCampaign$CollectionSchemeProperty$Builder
                                                         CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder
                                                         CfnCampaign$DataDestinationConfigProperty$Builder
                                                         CfnCampaign$S3ConfigProperty$Builder
                                                         CfnCampaign$SignalInformationProperty$Builder
                                                         CfnCampaign$TimeBasedCollectionSchemeProperty$Builder
                                                         CfnCampaign$TimestreamConfigProperty$Builder
                                                         CfnCampaignProps$Builder
                                                         CfnDecoderManifest$Builder
                                                         CfnDecoderManifest$CanInterfaceProperty$Builder
                                                         CfnDecoderManifest$CanNetworkInterfaceProperty$Builder
                                                         CfnDecoderManifest$CanSignalDecoderProperty$Builder
                                                         CfnDecoderManifest$CanSignalProperty$Builder
                                                         CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder
                                                         CfnDecoderManifest$ObdInterfaceProperty$Builder
                                                         CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder
                                                         CfnDecoderManifest$ObdSignalDecoderProperty$Builder
                                                         CfnDecoderManifest$ObdSignalProperty$Builder
                                                         CfnDecoderManifest$SignalDecodersItemsProperty$Builder
                                                         CfnDecoderManifestProps$Builder
                                                         CfnFleet$Builder
                                                         CfnFleetProps$Builder
                                                         CfnModelManifest$Builder
                                                         CfnModelManifestProps$Builder
                                                         CfnSignalCatalog$ActuatorProperty$Builder
                                                         CfnSignalCatalog$AttributeProperty$Builder
                                                         CfnSignalCatalog$BranchProperty$Builder
                                                         CfnSignalCatalog$Builder
                                                         CfnSignalCatalog$NodeCountsProperty$Builder
                                                         CfnSignalCatalog$NodeProperty$Builder
                                                         CfnSignalCatalog$SensorProperty$Builder
                                                         CfnSignalCatalogProps$Builder
                                                         CfnVehicle$Builder
                                                         CfnVehicleProps$Builder]))


(defn build-cfn-campaign-builder
  "The build-cfn-campaign-builder function updates a CfnCampaign$Builder instance using the provided configuration.
  The function takes the CfnCampaign$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `collectionScheme` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$CollectionSchemeProperty | [[cdk.support/lookup-entry]] | `:collection-scheme` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `dataDestinationConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-destination-configs` |
| `dataExtraDimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:data-extra-dimensions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `diagnosticsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:diagnostics-mode` |
| `expiryTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:expiry-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `postTriggerCollectionDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:post-trigger-collection-duration` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `signalsToCollect` | java.util.List | [[cdk.support/lookup-entry]] | `:signals-to-collect` |
| `spoolingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:spooling-mode` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnCampaign$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :collection-scheme)]
    (. builder collectionScheme data))
  (when-some [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-some [data (lookup-entry config id :data-destination-configs)]
    (. builder dataDestinationConfigs data))
  (when-some [data (lookup-entry config id :data-extra-dimensions)]
    (. builder dataExtraDimensions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :diagnostics-mode)]
    (. builder diagnosticsMode data))
  (when-some [data (lookup-entry config id :expiry-time)]
    (. builder expiryTime data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :post-trigger-collection-duration)]
    (. builder postTriggerCollectionDuration data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :signal-catalog-arn)]
    (. builder signalCatalogArn data))
  (when-some [data (lookup-entry config id :signals-to-collect)]
    (. builder signalsToCollect data))
  (when-some [data (lookup-entry config id :spooling-mode)]
    (. builder spoolingMode data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-campaign-builder
  "Creates a  `CfnCampaign$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-campaign-builder (CfnCampaign$Builder/create scope (name id)) id config))


(defn build-cfn-campaign-collection-scheme-property-builder
  "The build-cfn-campaign-collection-scheme-property-builder function updates a CfnCampaign$CollectionSchemeProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CollectionSchemeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionBasedCollectionScheme` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$ConditionBasedCollectionSchemeProperty | [[cdk.support/lookup-entry]] | `:condition-based-collection-scheme` |
| `timeBasedCollectionScheme` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$TimeBasedCollectionSchemeProperty | [[cdk.support/lookup-entry]] | `:time-based-collection-scheme` |
"
  [^CfnCampaign$CollectionSchemeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :condition-based-collection-scheme)]
    (. builder conditionBasedCollectionScheme data))
  (when-some [data (lookup-entry config id :time-based-collection-scheme)]
    (. builder timeBasedCollectionScheme data))
  (.build builder))


(defn cfn-campaign-collection-scheme-property-builder
  "Creates a  `CfnCampaign$CollectionSchemeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-collection-scheme-property-builder (new CfnCampaign$CollectionSchemeProperty$Builder) id config))


(defn build-cfn-campaign-condition-based-collection-scheme-property-builder
  "The build-cfn-campaign-condition-based-collection-scheme-property-builder function updates a CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionLanguageVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:condition-language-version` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `minimumTriggerIntervalMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-trigger-interval-ms` |
| `triggerMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-mode` |
"
  [^CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :condition-language-version)]
    (. builder conditionLanguageVersion data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :minimum-trigger-interval-ms)]
    (. builder minimumTriggerIntervalMs data))
  (when-some [data (lookup-entry config id :trigger-mode)]
    (. builder triggerMode data))
  (.build builder))


(defn cfn-campaign-condition-based-collection-scheme-property-builder
  "Creates a  `CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-condition-based-collection-scheme-property-builder (new CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder) id config))


(defn build-cfn-campaign-data-destination-config-property-builder
  "The build-cfn-campaign-data-destination-config-property-builder function updates a CfnCampaign$DataDestinationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$DataDestinationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `timestreamConfig` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$TimestreamConfigProperty | [[cdk.support/lookup-entry]] | `:timestream-config` |
"
  [^CfnCampaign$DataDestinationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-config)]
    (. builder s3Config data))
  (when-some [data (lookup-entry config id :timestream-config)]
    (. builder timestreamConfig data))
  (.build builder))


(defn cfn-campaign-data-destination-config-property-builder
  "Creates a  `CfnCampaign$DataDestinationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-data-destination-config-property-builder (new CfnCampaign$DataDestinationConfigProperty$Builder) id config))


(defn build-cfn-campaign-props-builder
  "The build-cfn-campaign-props-builder function updates a CfnCampaignProps$Builder instance using the provided configuration.
  The function takes the CfnCampaignProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `collectionScheme` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:collection-scheme` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `dataDestinationConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-destination-configs` |
| `dataExtraDimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:data-extra-dimensions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `diagnosticsMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:diagnostics-mode` |
| `expiryTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:expiry-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `postTriggerCollectionDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:post-trigger-collection-duration` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `signalsToCollect` | java.util.List | [[cdk.support/lookup-entry]] | `:signals-to-collect` |
| `spoolingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:spooling-mode` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnCampaignProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :collection-scheme)]
    (. builder collectionScheme data))
  (when-some [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-some [data (lookup-entry config id :data-destination-configs)]
    (. builder dataDestinationConfigs data))
  (when-some [data (lookup-entry config id :data-extra-dimensions)]
    (. builder dataExtraDimensions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :diagnostics-mode)]
    (. builder diagnosticsMode data))
  (when-some [data (lookup-entry config id :expiry-time)]
    (. builder expiryTime data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :post-trigger-collection-duration)]
    (. builder postTriggerCollectionDuration data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :signal-catalog-arn)]
    (. builder signalCatalogArn data))
  (when-some [data (lookup-entry config id :signals-to-collect)]
    (. builder signalsToCollect data))
  (when-some [data (lookup-entry config id :spooling-mode)]
    (. builder spoolingMode data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-campaign-props-builder
  "Creates a  `CfnCampaignProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-props-builder (new CfnCampaignProps$Builder) id config))


(defn build-cfn-campaign-s3-config-property-builder
  "The build-cfn-campaign-s3-config-property-builder function updates a CfnCampaign$S3ConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$S3ConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `storageCompressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-compression-format` |
"
  [^CfnCampaign$S3ConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :data-format)]
    (. builder dataFormat data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :storage-compression-format)]
    (. builder storageCompressionFormat data))
  (.build builder))


(defn cfn-campaign-s3-config-property-builder
  "Creates a  `CfnCampaign$S3ConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-s3-config-property-builder (new CfnCampaign$S3ConfigProperty$Builder) id config))


(defn build-cfn-campaign-signal-information-property-builder
  "The build-cfn-campaign-signal-information-property-builder function updates a CfnCampaign$SignalInformationProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$SignalInformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxSampleCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-sample-count` |
| `minimumSamplingIntervalMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-sampling-interval-ms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnCampaign$SignalInformationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-sample-count)]
    (. builder maxSampleCount data))
  (when-some [data (lookup-entry config id :minimum-sampling-interval-ms)]
    (. builder minimumSamplingIntervalMs data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-campaign-signal-information-property-builder
  "Creates a  `CfnCampaign$SignalInformationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-signal-information-property-builder (new CfnCampaign$SignalInformationProperty$Builder) id config))


(defn build-cfn-campaign-time-based-collection-scheme-property-builder
  "The build-cfn-campaign-time-based-collection-scheme-property-builder function updates a CfnCampaign$TimeBasedCollectionSchemeProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$TimeBasedCollectionSchemeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `periodMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period-ms` |
"
  [^CfnCampaign$TimeBasedCollectionSchemeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :period-ms)]
    (. builder periodMs data))
  (.build builder))


(defn cfn-campaign-time-based-collection-scheme-property-builder
  "Creates a  `CfnCampaign$TimeBasedCollectionSchemeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-time-based-collection-scheme-property-builder (new CfnCampaign$TimeBasedCollectionSchemeProperty$Builder) id config))


(defn build-cfn-campaign-timestream-config-property-builder
  "The build-cfn-campaign-timestream-config-property-builder function updates a CfnCampaign$TimestreamConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$TimestreamConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `timestreamTableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestream-table-arn` |
"
  [^CfnCampaign$TimestreamConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :timestream-table-arn)]
    (. builder timestreamTableArn data))
  (.build builder))


(defn cfn-campaign-timestream-config-property-builder
  "Creates a  `CfnCampaign$TimestreamConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-timestream-config-property-builder (new CfnCampaign$TimestreamConfigProperty$Builder) id config))


(defn build-cfn-decoder-manifest-builder
  "The build-cfn-decoder-manifest-builder function updates a CfnDecoderManifest$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkInterfaces` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `signalDecoders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:signal-decoders` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDecoderManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :model-manifest-arn)]
    (. builder modelManifestArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-interfaces)]
    (. builder networkInterfaces data))
  (when-some [data (lookup-entry config id :signal-decoders)]
    (. builder signalDecoders data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-decoder-manifest-builder
  "Creates a  `CfnDecoderManifest$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-decoder-manifest-builder (CfnDecoderManifest$Builder/create scope (name id)) id config))


(defn build-cfn-decoder-manifest-can-interface-property-builder
  "The build-cfn-decoder-manifest-can-interface-property-builder function updates a CfnDecoderManifest$CanInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$CanInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-name` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |
"
  [^CfnDecoderManifest$CanInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :protocol-name)]
    (. builder protocolName data))
  (when-some [data (lookup-entry config id :protocol-version)]
    (. builder protocolVersion data))
  (.build builder))


(defn cfn-decoder-manifest-can-interface-property-builder
  "Creates a  `CfnDecoderManifest$CanInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-can-interface-property-builder (new CfnDecoderManifest$CanInterfaceProperty$Builder) id config))


(defn build-cfn-decoder-manifest-can-network-interface-property-builder
  "The build-cfn-decoder-manifest-can-network-interface-property-builder function updates a CfnDecoderManifest$CanNetworkInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$CanNetworkInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canInterface` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-interface` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDecoderManifest$CanNetworkInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :can-interface)]
    (. builder canInterface data))
  (when-some [data (lookup-entry config id :interface-id)]
    (. builder interfaceId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-decoder-manifest-can-network-interface-property-builder
  "Creates a  `CfnDecoderManifest$CanNetworkInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-can-network-interface-property-builder (new CfnDecoderManifest$CanNetworkInterfaceProperty$Builder) id config))


(defn build-cfn-decoder-manifest-can-signal-decoder-property-builder
  "The build-cfn-decoder-manifest-can-signal-decoder-property-builder function updates a CfnDecoderManifest$CanSignalDecoderProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$CanSignalDecoderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canSignal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-signal` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDecoderManifest$CanSignalDecoderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :can-signal)]
    (. builder canSignal data))
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (when-some [data (lookup-entry config id :interface-id)]
    (. builder interfaceId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-decoder-manifest-can-signal-decoder-property-builder
  "Creates a  `CfnDecoderManifest$CanSignalDecoderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-can-signal-decoder-property-builder (new CfnDecoderManifest$CanSignalDecoderProperty$Builder) id config))


(defn build-cfn-decoder-manifest-can-signal-property-builder
  "The build-cfn-decoder-manifest-can-signal-property-builder function updates a CfnDecoderManifest$CanSignalProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$CanSignalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `factor` | java.lang.String | [[cdk.support/lookup-entry]] | `:factor` |
| `isBigEndian` | java.lang.String | [[cdk.support/lookup-entry]] | `:is-big-endian` |
| `isSigned` | java.lang.String | [[cdk.support/lookup-entry]] | `:is-signed` |
| `length` | java.lang.String | [[cdk.support/lookup-entry]] | `:length` |
| `messageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `offset` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset` |
| `startBit` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-bit` |
"
  [^CfnDecoderManifest$CanSignalProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :factor)]
    (. builder factor data))
  (when-some [data (lookup-entry config id :is-big-endian)]
    (. builder isBigEndian data))
  (when-some [data (lookup-entry config id :is-signed)]
    (. builder isSigned data))
  (when-some [data (lookup-entry config id :length)]
    (. builder length data))
  (when-some [data (lookup-entry config id :message-id)]
    (. builder messageId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :offset)]
    (. builder offset data))
  (when-some [data (lookup-entry config id :start-bit)]
    (. builder startBit data))
  (.build builder))


(defn cfn-decoder-manifest-can-signal-property-builder
  "Creates a  `CfnDecoderManifest$CanSignalProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-can-signal-property-builder (new CfnDecoderManifest$CanSignalProperty$Builder) id config))


(defn build-cfn-decoder-manifest-network-interfaces-items-property-builder
  "The build-cfn-decoder-manifest-network-interfaces-items-property-builder function updates a CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canInterface` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-interface` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdInterface` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdInterfaceProperty | [[cdk.support/lookup-entry]] | `:obd-interface` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :can-interface)]
    (. builder canInterface data))
  (when-some [data (lookup-entry config id :interface-id)]
    (. builder interfaceId data))
  (when-some [data (lookup-entry config id :obd-interface)]
    (. builder obdInterface data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-decoder-manifest-network-interfaces-items-property-builder
  "Creates a  `CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-network-interfaces-items-property-builder (new CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder) id config))


(defn build-cfn-decoder-manifest-obd-interface-property-builder
  "The build-cfn-decoder-manifest-obd-interface-property-builder function updates a CfnDecoderManifest$ObdInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$ObdInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dtcRequestIntervalSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:dtc-request-interval-seconds` |
| `hasTransmissionEcu` | java.lang.String | [[cdk.support/lookup-entry]] | `:has-transmission-ecu` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `obdStandard` | java.lang.String | [[cdk.support/lookup-entry]] | `:obd-standard` |
| `pidRequestIntervalSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid-request-interval-seconds` |
| `requestMessageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-message-id` |
| `useExtendedIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:use-extended-ids` |
"
  [^CfnDecoderManifest$ObdInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dtc-request-interval-seconds)]
    (. builder dtcRequestIntervalSeconds data))
  (when-some [data (lookup-entry config id :has-transmission-ecu)]
    (. builder hasTransmissionEcu data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :obd-standard)]
    (. builder obdStandard data))
  (when-some [data (lookup-entry config id :pid-request-interval-seconds)]
    (. builder pidRequestIntervalSeconds data))
  (when-some [data (lookup-entry config id :request-message-id)]
    (. builder requestMessageId data))
  (when-some [data (lookup-entry config id :use-extended-ids)]
    (. builder useExtendedIds data))
  (.build builder))


(defn cfn-decoder-manifest-obd-interface-property-builder
  "Creates a  `CfnDecoderManifest$ObdInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-obd-interface-property-builder (new CfnDecoderManifest$ObdInterfaceProperty$Builder) id config))


(defn build-cfn-decoder-manifest-obd-network-interface-property-builder
  "The build-cfn-decoder-manifest-obd-network-interface-property-builder function updates a CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdInterface` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdInterfaceProperty | [[cdk.support/lookup-entry]] | `:obd-interface` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interface-id)]
    (. builder interfaceId data))
  (when-some [data (lookup-entry config id :obd-interface)]
    (. builder obdInterface data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-decoder-manifest-obd-network-interface-property-builder
  "Creates a  `CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-obd-network-interface-property-builder (new CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder) id config))


(defn build-cfn-decoder-manifest-obd-signal-decoder-property-builder
  "The build-cfn-decoder-manifest-obd-signal-decoder-property-builder function updates a CfnDecoderManifest$ObdSignalDecoderProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$ObdSignalDecoderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdSignal` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdSignalProperty | [[cdk.support/lookup-entry]] | `:obd-signal` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDecoderManifest$ObdSignalDecoderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (when-some [data (lookup-entry config id :interface-id)]
    (. builder interfaceId data))
  (when-some [data (lookup-entry config id :obd-signal)]
    (. builder obdSignal data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-decoder-manifest-obd-signal-decoder-property-builder
  "Creates a  `CfnDecoderManifest$ObdSignalDecoderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-obd-signal-decoder-property-builder (new CfnDecoderManifest$ObdSignalDecoderProperty$Builder) id config))


(defn build-cfn-decoder-manifest-obd-signal-property-builder
  "The build-cfn-decoder-manifest-obd-signal-property-builder function updates a CfnDecoderManifest$ObdSignalProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$ObdSignalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bitMaskLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:bit-mask-length` |
| `bitRightShift` | java.lang.String | [[cdk.support/lookup-entry]] | `:bit-right-shift` |
| `byteLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:byte-length` |
| `offset` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset` |
| `pid` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid` |
| `pidResponseLength` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid-response-length` |
| `scaling` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling` |
| `serviceMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-mode` |
| `startByte` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-byte` |
"
  [^CfnDecoderManifest$ObdSignalProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bit-mask-length)]
    (. builder bitMaskLength data))
  (when-some [data (lookup-entry config id :bit-right-shift)]
    (. builder bitRightShift data))
  (when-some [data (lookup-entry config id :byte-length)]
    (. builder byteLength data))
  (when-some [data (lookup-entry config id :offset)]
    (. builder offset data))
  (when-some [data (lookup-entry config id :pid)]
    (. builder pid data))
  (when-some [data (lookup-entry config id :pid-response-length)]
    (. builder pidResponseLength data))
  (when-some [data (lookup-entry config id :scaling)]
    (. builder scaling data))
  (when-some [data (lookup-entry config id :service-mode)]
    (. builder serviceMode data))
  (when-some [data (lookup-entry config id :start-byte)]
    (. builder startByte data))
  (.build builder))


(defn cfn-decoder-manifest-obd-signal-property-builder
  "Creates a  `CfnDecoderManifest$ObdSignalProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-obd-signal-property-builder (new CfnDecoderManifest$ObdSignalProperty$Builder) id config))


(defn build-cfn-decoder-manifest-props-builder
  "The build-cfn-decoder-manifest-props-builder function updates a CfnDecoderManifestProps$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifestProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `signalDecoders` | java.util.List | [[cdk.support/lookup-entry]] | `:signal-decoders` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDecoderManifestProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :model-manifest-arn)]
    (. builder modelManifestArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-interfaces)]
    (. builder networkInterfaces data))
  (when-some [data (lookup-entry config id :signal-decoders)]
    (. builder signalDecoders data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-decoder-manifest-props-builder
  "Creates a  `CfnDecoderManifestProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-props-builder (new CfnDecoderManifestProps$Builder) id config))


(defn build-cfn-decoder-manifest-signal-decoders-items-property-builder
  "The build-cfn-decoder-manifest-signal-decoders-items-property-builder function updates a CfnDecoderManifest$SignalDecodersItemsProperty$Builder instance using the provided configuration.
  The function takes the CfnDecoderManifest$SignalDecodersItemsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canSignal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-signal` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdSignal` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdSignalProperty | [[cdk.support/lookup-entry]] | `:obd-signal` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDecoderManifest$SignalDecodersItemsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :can-signal)]
    (. builder canSignal data))
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (when-some [data (lookup-entry config id :interface-id)]
    (. builder interfaceId data))
  (when-some [data (lookup-entry config id :obd-signal)]
    (. builder obdSignal data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-decoder-manifest-signal-decoders-items-property-builder
  "Creates a  `CfnDecoderManifest$SignalDecodersItemsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-decoder-manifest-signal-decoders-items-property-builder (new CfnDecoderManifest$SignalDecodersItemsProperty$Builder) id config))


(defn build-cfn-fleet-builder
  "The build-cfn-fleet-builder function updates a CfnFleet$Builder instance using the provided configuration.
  The function takes the CfnFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFleet$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :signal-catalog-arn)]
    (. builder signalCatalogArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fleet-builder
  "Creates a  `CfnFleet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-fleet-builder (CfnFleet$Builder/create scope (name id)) id config))


(defn build-cfn-fleet-props-builder
  "The build-cfn-fleet-props-builder function updates a CfnFleetProps$Builder instance using the provided configuration.
  The function takes the CfnFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFleetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :signal-catalog-arn)]
    (. builder signalCatalogArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fleet-props-builder
  "Creates a  `CfnFleetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-fleet-props-builder (new CfnFleetProps$Builder) id config))


(defn build-cfn-model-manifest-builder
  "The build-cfn-model-manifest-builder function updates a CfnModelManifest$Builder instance using the provided configuration.
  The function takes the CfnModelManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodes` | java.util.List | [[cdk.support/lookup-entry]] | `:nodes` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :nodes)]
    (. builder nodes data))
  (when-some [data (lookup-entry config id :signal-catalog-arn)]
    (. builder signalCatalogArn data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-manifest-builder
  "Creates a  `CfnModelManifest$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-model-manifest-builder (CfnModelManifest$Builder/create scope (name id)) id config))


(defn build-cfn-model-manifest-props-builder
  "The build-cfn-model-manifest-props-builder function updates a CfnModelManifestProps$Builder instance using the provided configuration.
  The function takes the CfnModelManifestProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodes` | java.util.List | [[cdk.support/lookup-entry]] | `:nodes` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelManifestProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :nodes)]
    (. builder nodes data))
  (when-some [data (lookup-entry config id :signal-catalog-arn)]
    (. builder signalCatalogArn data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-manifest-props-builder
  "Creates a  `CfnModelManifestProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-model-manifest-props-builder (new CfnModelManifestProps$Builder) id config))


(defn build-cfn-signal-catalog-actuator-property-builder
  "The build-cfn-signal-catalog-actuator-property-builder function updates a CfnSignalCatalog$ActuatorProperty$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$ActuatorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `assignedValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:assigned-value` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnSignalCatalog$ActuatorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-some [data (lookup-entry config id :assigned-value)]
    (. builder assignedValue data))
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-signal-catalog-actuator-property-builder
  "Creates a  `CfnSignalCatalog$ActuatorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-actuator-property-builder (new CfnSignalCatalog$ActuatorProperty$Builder) id config))


(defn build-cfn-signal-catalog-attribute-property-builder
  "The build-cfn-signal-catalog-attribute-property-builder function updates a CfnSignalCatalog$AttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$AttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `assignedValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:assigned-value` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnSignalCatalog$AttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-some [data (lookup-entry config id :assigned-value)]
    (. builder assignedValue data))
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-signal-catalog-attribute-property-builder
  "Creates a  `CfnSignalCatalog$AttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-attribute-property-builder (new CfnSignalCatalog$AttributeProperty$Builder) id config))


(defn build-cfn-signal-catalog-branch-property-builder
  "The build-cfn-signal-catalog-branch-property-builder function updates a CfnSignalCatalog$BranchProperty$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$BranchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
"
  [^CfnSignalCatalog$BranchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (.build builder))


(defn cfn-signal-catalog-branch-property-builder
  "Creates a  `CfnSignalCatalog$BranchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-branch-property-builder (new CfnSignalCatalog$BranchProperty$Builder) id config))


(defn build-cfn-signal-catalog-builder
  "The build-cfn-signal-catalog-builder function updates a CfnSignalCatalog$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodeCounts` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$NodeCountsProperty | [[cdk.support/lookup-entry]] | `:node-counts` |
| `nodes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nodes` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSignalCatalog$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :node-counts)]
    (. builder nodeCounts data))
  (when-some [data (lookup-entry config id :nodes)]
    (. builder nodes data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-signal-catalog-builder
  "Creates a  `CfnSignalCatalog$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-signal-catalog-builder (CfnSignalCatalog$Builder/create scope (name id)) id config))


(defn build-cfn-signal-catalog-node-counts-property-builder
  "The build-cfn-signal-catalog-node-counts-property-builder function updates a CfnSignalCatalog$NodeCountsProperty$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$NodeCountsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `totalActuators` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-actuators` |
| `totalAttributes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-attributes` |
| `totalBranches` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-branches` |
| `totalNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-nodes` |
| `totalSensors` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-sensors` |
"
  [^CfnSignalCatalog$NodeCountsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :total-actuators)]
    (. builder totalActuators data))
  (when-some [data (lookup-entry config id :total-attributes)]
    (. builder totalAttributes data))
  (when-some [data (lookup-entry config id :total-branches)]
    (. builder totalBranches data))
  (when-some [data (lookup-entry config id :total-nodes)]
    (. builder totalNodes data))
  (when-some [data (lookup-entry config id :total-sensors)]
    (. builder totalSensors data))
  (.build builder))


(defn cfn-signal-catalog-node-counts-property-builder
  "Creates a  `CfnSignalCatalog$NodeCountsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-node-counts-property-builder (new CfnSignalCatalog$NodeCountsProperty$Builder) id config))


(defn build-cfn-signal-catalog-node-property-builder
  "The build-cfn-signal-catalog-node-property-builder function updates a CfnSignalCatalog$NodeProperty$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$NodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actuator` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$ActuatorProperty | [[cdk.support/lookup-entry]] | `:actuator` |
| `attribute` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$AttributeProperty | [[cdk.support/lookup-entry]] | `:attribute` |
| `branch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:branch` |
| `sensor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sensor` |
"
  [^CfnSignalCatalog$NodeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :actuator)]
    (. builder actuator data))
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-some [data (lookup-entry config id :sensor)]
    (. builder sensor data))
  (.build builder))


(defn cfn-signal-catalog-node-property-builder
  "Creates a  `CfnSignalCatalog$NodeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-node-property-builder (new CfnSignalCatalog$NodeProperty$Builder) id config))


(defn build-cfn-signal-catalog-props-builder
  "The build-cfn-signal-catalog-props-builder function updates a CfnSignalCatalogProps$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalogProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodeCounts` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$NodeCountsProperty | [[cdk.support/lookup-entry]] | `:node-counts` |
| `nodes` | java.util.List | [[cdk.support/lookup-entry]] | `:nodes` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSignalCatalogProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :node-counts)]
    (. builder nodeCounts data))
  (when-some [data (lookup-entry config id :nodes)]
    (. builder nodes data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-signal-catalog-props-builder
  "Creates a  `CfnSignalCatalogProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-props-builder (new CfnSignalCatalogProps$Builder) id config))


(defn build-cfn-signal-catalog-sensor-property-builder
  "The build-cfn-signal-catalog-sensor-property-builder function updates a CfnSignalCatalog$SensorProperty$Builder instance using the provided configuration.
  The function takes the CfnSignalCatalog$SensorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnSignalCatalog$SensorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fully-qualified-name)]
    (. builder fullyQualifiedName data))
  (when-some [data (lookup-entry config id :max)]
    (. builder max data))
  (when-some [data (lookup-entry config id :min)]
    (. builder min data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-signal-catalog-sensor-property-builder
  "Creates a  `CfnSignalCatalog$SensorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-signal-catalog-sensor-property-builder (new CfnSignalCatalog$SensorProperty$Builder) id config))


(defn build-cfn-vehicle-builder
  "The build-cfn-vehicle-builder function updates a CfnVehicle$Builder instance using the provided configuration.
  The function takes the CfnVehicle$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-behavior` |
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
| `decoderManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:decoder-manifest-arn` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVehicle$Builder builder id config]
  (when-some [data (lookup-entry config id :association-behavior)]
    (. builder associationBehavior data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :decoder-manifest-arn)]
    (. builder decoderManifestArn data))
  (when-some [data (lookup-entry config id :model-manifest-arn)]
    (. builder modelManifestArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-vehicle-builder
  "Creates a  `CfnVehicle$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-vehicle-builder (CfnVehicle$Builder/create scope (name id)) id config))


(defn build-cfn-vehicle-props-builder
  "The build-cfn-vehicle-props-builder function updates a CfnVehicleProps$Builder instance using the provided configuration.
  The function takes the CfnVehicleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-behavior` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `decoderManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:decoder-manifest-arn` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVehicleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :association-behavior)]
    (. builder associationBehavior data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :decoder-manifest-arn)]
    (. builder decoderManifestArn data))
  (when-some [data (lookup-entry config id :model-manifest-arn)]
    (. builder modelManifestArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-vehicle-props-builder
  "Creates a  `CfnVehicleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-vehicle-props-builder (new CfnVehicleProps$Builder) id config))