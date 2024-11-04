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


(defn cfn-campaign-builder
  "The cfn-campaign-builder function buildes out new instances of 
CfnCampaign$Builder using the provided configuration.  Each field is set as follows:

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
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnCampaign$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :collection-scheme)]
      (. builder collectionScheme data))
    (when-let [data (lookup-entry config id :compression)]
      (. builder compression data))
    (when-let [data (lookup-entry config id :data-destination-configs)]
      (. builder dataDestinationConfigs data))
    (when-let [data (lookup-entry config id :data-extra-dimensions)]
      (. builder dataExtraDimensions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :diagnostics-mode)]
      (. builder diagnosticsMode data))
    (when-let [data (lookup-entry config id :expiry-time)]
      (. builder expiryTime data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :post-trigger-collection-duration)]
      (. builder postTriggerCollectionDuration data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :signal-catalog-arn)]
      (. builder signalCatalogArn data))
    (when-let [data (lookup-entry config id :signals-to-collect)]
      (. builder signalsToCollect data))
    (when-let [data (lookup-entry config id :spooling-mode)]
      (. builder spoolingMode data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-campaign-collection-scheme-property-builder
  "The cfn-campaign-collection-scheme-property-builder function buildes out new instances of 
CfnCampaign$CollectionSchemeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionBasedCollectionScheme` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$ConditionBasedCollectionSchemeProperty | [[cdk.support/lookup-entry]] | `:condition-based-collection-scheme` |
| `timeBasedCollectionScheme` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$TimeBasedCollectionSchemeProperty | [[cdk.support/lookup-entry]] | `:time-based-collection-scheme` |"
  [stack id config]
  (let [builder (CfnCampaign$CollectionSchemeProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition-based-collection-scheme)]
      (. builder conditionBasedCollectionScheme data))
    (when-let [data (lookup-entry config id :time-based-collection-scheme)]
      (. builder timeBasedCollectionScheme data))
    (.build builder)))


(defn cfn-campaign-condition-based-collection-scheme-property-builder
  "The cfn-campaign-condition-based-collection-scheme-property-builder function buildes out new instances of 
CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionLanguageVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:condition-language-version` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `minimumTriggerIntervalMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-trigger-interval-ms` |
| `triggerMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:trigger-mode` |"
  [stack id config]
  (let [builder (CfnCampaign$ConditionBasedCollectionSchemeProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition-language-version)]
      (. builder conditionLanguageVersion data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :minimum-trigger-interval-ms)]
      (. builder minimumTriggerIntervalMs data))
    (when-let [data (lookup-entry config id :trigger-mode)]
      (. builder triggerMode data))
    (.build builder)))


(defn cfn-campaign-data-destination-config-property-builder
  "The cfn-campaign-data-destination-config-property-builder function buildes out new instances of 
CfnCampaign$DataDestinationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `timestreamConfig` | software.amazon.awscdk.services.iotfleetwise.CfnCampaign$TimestreamConfigProperty | [[cdk.support/lookup-entry]] | `:timestream-config` |"
  [stack id config]
  (let [builder (CfnCampaign$DataDestinationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-config)]
      (. builder s3Config data))
    (when-let [data (lookup-entry config id :timestream-config)]
      (. builder timestreamConfig data))
    (.build builder)))


(defn cfn-campaign-props-builder
  "The cfn-campaign-props-builder function buildes out new instances of 
CfnCampaignProps$Builder using the provided configuration.  Each field is set as follows:

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
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnCampaignProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :collection-scheme)]
      (. builder collectionScheme data))
    (when-let [data (lookup-entry config id :compression)]
      (. builder compression data))
    (when-let [data (lookup-entry config id :data-destination-configs)]
      (. builder dataDestinationConfigs data))
    (when-let [data (lookup-entry config id :data-extra-dimensions)]
      (. builder dataExtraDimensions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :diagnostics-mode)]
      (. builder diagnosticsMode data))
    (when-let [data (lookup-entry config id :expiry-time)]
      (. builder expiryTime data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :post-trigger-collection-duration)]
      (. builder postTriggerCollectionDuration data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :signal-catalog-arn)]
      (. builder signalCatalogArn data))
    (when-let [data (lookup-entry config id :signals-to-collect)]
      (. builder signalsToCollect data))
    (when-let [data (lookup-entry config id :spooling-mode)]
      (. builder spoolingMode data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-campaign-s3-config-property-builder
  "The cfn-campaign-s3-config-property-builder function buildes out new instances of 
CfnCampaign$S3ConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `dataFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-format` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `storageCompressionFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-compression-format` |"
  [stack id config]
  (let [builder (CfnCampaign$S3ConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :data-format)]
      (. builder dataFormat data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :storage-compression-format)]
      (. builder storageCompressionFormat data))
    (.build builder)))


(defn cfn-campaign-signal-information-property-builder
  "The cfn-campaign-signal-information-property-builder function buildes out new instances of 
CfnCampaign$SignalInformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxSampleCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-sample-count` |
| `minimumSamplingIntervalMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-sampling-interval-ms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnCampaign$SignalInformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-sample-count)]
      (. builder maxSampleCount data))
    (when-let [data (lookup-entry config id :minimum-sampling-interval-ms)]
      (. builder minimumSamplingIntervalMs data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-campaign-time-based-collection-scheme-property-builder
  "The cfn-campaign-time-based-collection-scheme-property-builder function buildes out new instances of 
CfnCampaign$TimeBasedCollectionSchemeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `periodMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period-ms` |"
  [stack id config]
  (let [builder (CfnCampaign$TimeBasedCollectionSchemeProperty$Builder.)]
    (when-let [data (lookup-entry config id :period-ms)]
      (. builder periodMs data))
    (.build builder)))


(defn cfn-campaign-timestream-config-property-builder
  "The cfn-campaign-timestream-config-property-builder function buildes out new instances of 
CfnCampaign$TimestreamConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `timestreamTableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestream-table-arn` |"
  [stack id config]
  (let [builder (CfnCampaign$TimestreamConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :timestream-table-arn)]
      (. builder timestreamTableArn data))
    (.build builder)))


(defn cfn-decoder-manifest-builder
  "The cfn-decoder-manifest-builder function buildes out new instances of 
CfnDecoderManifest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkInterfaces` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `signalDecoders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:signal-decoders` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :model-manifest-arn)]
      (. builder modelManifestArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :signal-decoders)]
      (. builder signalDecoders data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-decoder-manifest-can-interface-property-builder
  "The cfn-decoder-manifest-can-interface-property-builder function buildes out new instances of 
CfnDecoderManifest$CanInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocolName` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-name` |
| `protocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-version` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$CanInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :protocol-name)]
      (. builder protocolName data))
    (when-let [data (lookup-entry config id :protocol-version)]
      (. builder protocolVersion data))
    (.build builder)))


(defn cfn-decoder-manifest-can-network-interface-property-builder
  "The cfn-decoder-manifest-can-network-interface-property-builder function buildes out new instances of 
CfnDecoderManifest$CanNetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canInterface` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-interface` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$CanNetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :can-interface)]
      (. builder canInterface data))
    (when-let [data (lookup-entry config id :interface-id)]
      (. builder interfaceId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-decoder-manifest-can-signal-decoder-property-builder
  "The cfn-decoder-manifest-can-signal-decoder-property-builder function buildes out new instances of 
CfnDecoderManifest$CanSignalDecoderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canSignal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-signal` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$CanSignalDecoderProperty$Builder.)]
    (when-let [data (lookup-entry config id :can-signal)]
      (. builder canSignal data))
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (when-let [data (lookup-entry config id :interface-id)]
      (. builder interfaceId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-decoder-manifest-can-signal-property-builder
  "The cfn-decoder-manifest-can-signal-property-builder function buildes out new instances of 
CfnDecoderManifest$CanSignalProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `factor` | java.lang.String | [[cdk.support/lookup-entry]] | `:factor` |
| `isBigEndian` | java.lang.String | [[cdk.support/lookup-entry]] | `:is-big-endian` |
| `isSigned` | java.lang.String | [[cdk.support/lookup-entry]] | `:is-signed` |
| `length` | java.lang.String | [[cdk.support/lookup-entry]] | `:length` |
| `messageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `offset` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset` |
| `startBit` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-bit` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$CanSignalProperty$Builder.)]
    (when-let [data (lookup-entry config id :factor)]
      (. builder factor data))
    (when-let [data (lookup-entry config id :is-big-endian)]
      (. builder isBigEndian data))
    (when-let [data (lookup-entry config id :is-signed)]
      (. builder isSigned data))
    (when-let [data (lookup-entry config id :length)]
      (. builder length data))
    (when-let [data (lookup-entry config id :message-id)]
      (. builder messageId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :offset)]
      (. builder offset data))
    (when-let [data (lookup-entry config id :start-bit)]
      (. builder startBit data))
    (.build builder)))


(defn cfn-decoder-manifest-network-interfaces-items-property-builder
  "The cfn-decoder-manifest-network-interfaces-items-property-builder function buildes out new instances of 
CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canInterface` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-interface` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdInterface` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdInterfaceProperty | [[cdk.support/lookup-entry]] | `:obd-interface` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$NetworkInterfacesItemsProperty$Builder.)]
    (when-let [data (lookup-entry config id :can-interface)]
      (. builder canInterface data))
    (when-let [data (lookup-entry config id :interface-id)]
      (. builder interfaceId data))
    (when-let [data (lookup-entry config id :obd-interface)]
      (. builder obdInterface data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-decoder-manifest-obd-interface-property-builder
  "The cfn-decoder-manifest-obd-interface-property-builder function buildes out new instances of 
CfnDecoderManifest$ObdInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dtcRequestIntervalSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:dtc-request-interval-seconds` |
| `hasTransmissionEcu` | java.lang.String | [[cdk.support/lookup-entry]] | `:has-transmission-ecu` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `obdStandard` | java.lang.String | [[cdk.support/lookup-entry]] | `:obd-standard` |
| `pidRequestIntervalSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid-request-interval-seconds` |
| `requestMessageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-message-id` |
| `useExtendedIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:use-extended-ids` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$ObdInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :dtc-request-interval-seconds)]
      (. builder dtcRequestIntervalSeconds data))
    (when-let [data (lookup-entry config id :has-transmission-ecu)]
      (. builder hasTransmissionEcu data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :obd-standard)]
      (. builder obdStandard data))
    (when-let [data (lookup-entry config id :pid-request-interval-seconds)]
      (. builder pidRequestIntervalSeconds data))
    (when-let [data (lookup-entry config id :request-message-id)]
      (. builder requestMessageId data))
    (when-let [data (lookup-entry config id :use-extended-ids)]
      (. builder useExtendedIds data))
    (.build builder)))


(defn cfn-decoder-manifest-obd-network-interface-property-builder
  "The cfn-decoder-manifest-obd-network-interface-property-builder function buildes out new instances of 
CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdInterface` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdInterfaceProperty | [[cdk.support/lookup-entry]] | `:obd-interface` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$ObdNetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :interface-id)]
      (. builder interfaceId data))
    (when-let [data (lookup-entry config id :obd-interface)]
      (. builder obdInterface data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-decoder-manifest-obd-signal-decoder-property-builder
  "The cfn-decoder-manifest-obd-signal-decoder-property-builder function buildes out new instances of 
CfnDecoderManifest$ObdSignalDecoderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdSignal` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdSignalProperty | [[cdk.support/lookup-entry]] | `:obd-signal` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$ObdSignalDecoderProperty$Builder.)]
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (when-let [data (lookup-entry config id :interface-id)]
      (. builder interfaceId data))
    (when-let [data (lookup-entry config id :obd-signal)]
      (. builder obdSignal data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-decoder-manifest-obd-signal-property-builder
  "The cfn-decoder-manifest-obd-signal-property-builder function buildes out new instances of 
CfnDecoderManifest$ObdSignalProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `startByte` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-byte` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$ObdSignalProperty$Builder.)]
    (when-let [data (lookup-entry config id :bit-mask-length)]
      (. builder bitMaskLength data))
    (when-let [data (lookup-entry config id :bit-right-shift)]
      (. builder bitRightShift data))
    (when-let [data (lookup-entry config id :byte-length)]
      (. builder byteLength data))
    (when-let [data (lookup-entry config id :offset)]
      (. builder offset data))
    (when-let [data (lookup-entry config id :pid)]
      (. builder pid data))
    (when-let [data (lookup-entry config id :pid-response-length)]
      (. builder pidResponseLength data))
    (when-let [data (lookup-entry config id :scaling)]
      (. builder scaling data))
    (when-let [data (lookup-entry config id :service-mode)]
      (. builder serviceMode data))
    (when-let [data (lookup-entry config id :start-byte)]
      (. builder startByte data))
    (.build builder)))


(defn cfn-decoder-manifest-props-builder
  "The cfn-decoder-manifest-props-builder function buildes out new instances of 
CfnDecoderManifestProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `signalDecoders` | java.util.List | [[cdk.support/lookup-entry]] | `:signal-decoders` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDecoderManifestProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :model-manifest-arn)]
      (. builder modelManifestArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :signal-decoders)]
      (. builder signalDecoders data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-decoder-manifest-signal-decoders-items-property-builder
  "The cfn-decoder-manifest-signal-decoders-items-property-builder function buildes out new instances of 
CfnDecoderManifest$SignalDecodersItemsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canSignal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:can-signal` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `interfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-id` |
| `obdSignal` | software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest$ObdSignalProperty | [[cdk.support/lookup-entry]] | `:obd-signal` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDecoderManifest$SignalDecodersItemsProperty$Builder.)]
    (when-let [data (lookup-entry config id :can-signal)]
      (. builder canSignal data))
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (when-let [data (lookup-entry config id :interface-id)]
      (. builder interfaceId data))
    (when-let [data (lookup-entry config id :obd-signal)]
      (. builder obdSignal data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-fleet-builder
  "The cfn-fleet-builder function buildes out new instances of 
CfnFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :signal-catalog-arn)]
      (. builder signalCatalogArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fleet-props-builder
  "The cfn-fleet-props-builder function buildes out new instances of 
CfnFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :signal-catalog-arn)]
      (. builder signalCatalogArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-model-manifest-builder
  "The cfn-model-manifest-builder function buildes out new instances of 
CfnModelManifest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodes` | java.util.List | [[cdk.support/lookup-entry]] | `:nodes` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelManifest$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :nodes)]
      (. builder nodes data))
    (when-let [data (lookup-entry config id :signal-catalog-arn)]
      (. builder signalCatalogArn data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-model-manifest-props-builder
  "The cfn-model-manifest-props-builder function buildes out new instances of 
CfnModelManifestProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodes` | java.util.List | [[cdk.support/lookup-entry]] | `:nodes` |
| `signalCatalogArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:signal-catalog-arn` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelManifestProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :nodes)]
      (. builder nodes data))
    (when-let [data (lookup-entry config id :signal-catalog-arn)]
      (. builder signalCatalogArn data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-signal-catalog-actuator-property-builder
  "The cfn-signal-catalog-actuator-property-builder function buildes out new instances of 
CfnSignalCatalog$ActuatorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `assignedValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:assigned-value` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$ActuatorProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-values)]
      (. builder allowedValues data))
    (when-let [data (lookup-entry config id :assigned-value)]
      (. builder assignedValue data))
    (when-let [data (lookup-entry config id :data-type)]
      (. builder dataType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-signal-catalog-attribute-property-builder
  "The cfn-signal-catalog-attribute-property-builder function buildes out new instances of 
CfnSignalCatalog$AttributeProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$AttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-values)]
      (. builder allowedValues data))
    (when-let [data (lookup-entry config id :assigned-value)]
      (. builder assignedValue data))
    (when-let [data (lookup-entry config id :data-type)]
      (. builder dataType data))
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-signal-catalog-branch-property-builder
  "The cfn-signal-catalog-branch-property-builder function buildes out new instances of 
CfnSignalCatalog$BranchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$BranchProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (.build builder)))


(defn cfn-signal-catalog-builder
  "The cfn-signal-catalog-builder function buildes out new instances of 
CfnSignalCatalog$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodeCounts` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$NodeCountsProperty | [[cdk.support/lookup-entry]] | `:node-counts` |
| `nodes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nodes` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :node-counts)]
      (. builder nodeCounts data))
    (when-let [data (lookup-entry config id :nodes)]
      (. builder nodes data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-signal-catalog-node-counts-property-builder
  "The cfn-signal-catalog-node-counts-property-builder function buildes out new instances of 
CfnSignalCatalog$NodeCountsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `totalActuators` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-actuators` |
| `totalAttributes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-attributes` |
| `totalBranches` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-branches` |
| `totalNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-nodes` |
| `totalSensors` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-sensors` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$NodeCountsProperty$Builder.)]
    (when-let [data (lookup-entry config id :total-actuators)]
      (. builder totalActuators data))
    (when-let [data (lookup-entry config id :total-attributes)]
      (. builder totalAttributes data))
    (when-let [data (lookup-entry config id :total-branches)]
      (. builder totalBranches data))
    (when-let [data (lookup-entry config id :total-nodes)]
      (. builder totalNodes data))
    (when-let [data (lookup-entry config id :total-sensors)]
      (. builder totalSensors data))
    (.build builder)))


(defn cfn-signal-catalog-node-property-builder
  "The cfn-signal-catalog-node-property-builder function buildes out new instances of 
CfnSignalCatalog$NodeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actuator` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$ActuatorProperty | [[cdk.support/lookup-entry]] | `:actuator` |
| `attribute` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$AttributeProperty | [[cdk.support/lookup-entry]] | `:attribute` |
| `branch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:branch` |
| `sensor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sensor` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$NodeProperty$Builder.)]
    (when-let [data (lookup-entry config id :actuator)]
      (. builder actuator data))
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :sensor)]
      (. builder sensor data))
    (.build builder)))


(defn cfn-signal-catalog-props-builder
  "The cfn-signal-catalog-props-builder function buildes out new instances of 
CfnSignalCatalogProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nodeCounts` | software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog$NodeCountsProperty | [[cdk.support/lookup-entry]] | `:node-counts` |
| `nodes` | java.util.List | [[cdk.support/lookup-entry]] | `:nodes` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSignalCatalogProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :node-counts)]
      (. builder nodeCounts data))
    (when-let [data (lookup-entry config id :nodes)]
      (. builder nodes data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-signal-catalog-sensor-property-builder
  "The cfn-signal-catalog-sensor-property-builder function buildes out new instances of 
CfnSignalCatalog$SensorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fullyQualifiedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-name` |
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnSignalCatalog$SensorProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-values)]
      (. builder allowedValues data))
    (when-let [data (lookup-entry config id :data-type)]
      (. builder dataType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fully-qualified-name)]
      (. builder fullyQualifiedName data))
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-vehicle-builder
  "The cfn-vehicle-builder function buildes out new instances of 
CfnVehicle$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-behavior` |
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
| `decoderManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:decoder-manifest-arn` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVehicle$Builder/create stack id)]
    (when-let [data (lookup-entry config id :association-behavior)]
      (. builder associationBehavior data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :decoder-manifest-arn)]
      (. builder decoderManifestArn data))
    (when-let [data (lookup-entry config id :model-manifest-arn)]
      (. builder modelManifestArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-vehicle-props-builder
  "The cfn-vehicle-props-builder function buildes out new instances of 
CfnVehicleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-behavior` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `decoderManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:decoder-manifest-arn` |
| `modelManifestArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-manifest-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVehicleProps$Builder.)]
    (when-let [data (lookup-entry config id :association-behavior)]
      (. builder associationBehavior data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :decoder-manifest-arn)]
      (. builder decoderManifestArn data))
    (when-let [data (lookup-entry config id :model-manifest-arn)]
      (. builder modelManifestArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))