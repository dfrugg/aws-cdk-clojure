(ns cdk.api.services.iotwireless
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotwireless package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotwireless CfnDestination$Builder
                                                        CfnDestinationProps$Builder
                                                        CfnDeviceProfile$Builder
                                                        CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder
                                                        CfnDeviceProfileProps$Builder
                                                        CfnFuotaTask$Builder
                                                        CfnFuotaTask$LoRaWANProperty$Builder
                                                        CfnFuotaTaskProps$Builder
                                                        CfnMulticastGroup$Builder
                                                        CfnMulticastGroup$LoRaWANProperty$Builder
                                                        CfnMulticastGroupProps$Builder
                                                        CfnNetworkAnalyzerConfiguration$Builder
                                                        CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder
                                                        CfnNetworkAnalyzerConfigurationProps$Builder
                                                        CfnPartnerAccount$Builder
                                                        CfnPartnerAccount$SidewalkAccountInfoProperty$Builder
                                                        CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder
                                                        CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder
                                                        CfnPartnerAccountProps$Builder
                                                        CfnServiceProfile$Builder
                                                        CfnServiceProfile$LoRaWANServiceProfileProperty$Builder
                                                        CfnServiceProfileProps$Builder
                                                        CfnTaskDefinition$Builder
                                                        CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder
                                                        CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder
                                                        CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder
                                                        CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder
                                                        CfnTaskDefinitionProps$Builder
                                                        CfnWirelessDevice$AbpV10xProperty$Builder
                                                        CfnWirelessDevice$AbpV11Property$Builder
                                                        CfnWirelessDevice$Builder
                                                        CfnWirelessDevice$LoRaWANDeviceProperty$Builder
                                                        CfnWirelessDevice$OtaaV10xProperty$Builder
                                                        CfnWirelessDevice$OtaaV11Property$Builder
                                                        CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder
                                                        CfnWirelessDevice$SessionKeysAbpV11Property$Builder
                                                        CfnWirelessDeviceImportTask$Builder
                                                        CfnWirelessDeviceImportTask$SidewalkProperty$Builder
                                                        CfnWirelessDeviceImportTaskProps$Builder
                                                        CfnWirelessDeviceProps$Builder
                                                        CfnWirelessGateway$Builder
                                                        CfnWirelessGateway$LoRaWANGatewayProperty$Builder
                                                        CfnWirelessGatewayProps$Builder]))


(defn cfn-destination-builder
  "The cfn-destination-builder function buildes out new instances of 
CfnDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `expressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :expression-type)]
      (. builder expressionType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-destination-props-builder
  "The cfn-destination-props-builder function buildes out new instances of 
CfnDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `expressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :expression-type)]
      (. builder expressionType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-profile-builder
  "The cfn-device-profile-builder function buildes out new instances of 
CfnDeviceProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnDeviceProfile$LoRaWANDeviceProfileProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-profile-lo-ra-wan-device-profile-property-builder
  "The cfn-device-profile-lo-ra-wan-device-profile-property-builder function buildes out new instances of 
CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classBTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:class-b-timeout` |
| `classCTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:class-c-timeout` |
| `factoryPresetFreqsList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:factory-preset-freqs-list` |
| `macVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:mac-version` |
| `maxDutyCycle` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-duty-cycle` |
| `maxEirp` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-eirp` |
| `pingSlotDr` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ping-slot-dr` |
| `pingSlotFreq` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ping-slot-freq` |
| `pingSlotPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ping-slot-period` |
| `regParamsRevision` | java.lang.String | [[cdk.support/lookup-entry]] | `:reg-params-revision` |
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |
| `rxDataRate2` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rx-data-rate2` |
| `rxDelay1` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rx-delay1` |
| `rxDrOffset1` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rx-dr-offset1` |
| `rxFreq2` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rx-freq2` |
| `supports32BitFCnt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:supports32-bit-f-cnt` |
| `supportsClassB` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:supports-class-b` |
| `supportsClassC` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:supports-class-c` |
| `supportsJoin` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:supports-join` |"
  [stack id config]
  (let [builder (CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder.)]
    (when-let [data (lookup-entry config id :class-b-timeout)]
      (. builder classBTimeout data))
    (when-let [data (lookup-entry config id :class-c-timeout)]
      (. builder classCTimeout data))
    (when-let [data (lookup-entry config id :factory-preset-freqs-list)]
      (. builder factoryPresetFreqsList data))
    (when-let [data (lookup-entry config id :mac-version)]
      (. builder macVersion data))
    (when-let [data (lookup-entry config id :max-duty-cycle)]
      (. builder maxDutyCycle data))
    (when-let [data (lookup-entry config id :max-eirp)]
      (. builder maxEirp data))
    (when-let [data (lookup-entry config id :ping-slot-dr)]
      (. builder pingSlotDr data))
    (when-let [data (lookup-entry config id :ping-slot-freq)]
      (. builder pingSlotFreq data))
    (when-let [data (lookup-entry config id :ping-slot-period)]
      (. builder pingSlotPeriod data))
    (when-let [data (lookup-entry config id :reg-params-revision)]
      (. builder regParamsRevision data))
    (when-let [data (lookup-entry config id :rf-region)]
      (. builder rfRegion data))
    (when-let [data (lookup-entry config id :rx-data-rate2)]
      (. builder rxDataRate2 data))
    (when-let [data (lookup-entry config id :rx-delay1)]
      (. builder rxDelay1 data))
    (when-let [data (lookup-entry config id :rx-dr-offset1)]
      (. builder rxDrOffset1 data))
    (when-let [data (lookup-entry config id :rx-freq2)]
      (. builder rxFreq2 data))
    (when-let [data (lookup-entry config id :supports32-bit-f-cnt)]
      (. builder supports32BitFCnt data))
    (when-let [data (lookup-entry config id :supports-class-b)]
      (. builder supportsClassB data))
    (when-let [data (lookup-entry config id :supports-class-c)]
      (. builder supportsClassC data))
    (when-let [data (lookup-entry config id :supports-join)]
      (. builder supportsJoin data))
    (.build builder)))


(defn cfn-device-profile-props-builder
  "The cfn-device-profile-props-builder function buildes out new instances of 
CfnDeviceProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fuota-task-builder
  "The cfn-fuota-task-builder function buildes out new instances of 
CfnFuotaTask$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateMulticastGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-multicast-group` |
| `associateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-wireless-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disassociateMulticastGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-multicast-group` |
| `disassociateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-wireless-device` |
| `firmwareUpdateImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:firmware-update-image` |
| `firmwareUpdateRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:firmware-update-role` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnFuotaTask$LoRaWANProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFuotaTask$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associate-multicast-group)]
      (. builder associateMulticastGroup data))
    (when-let [data (lookup-entry config id :associate-wireless-device)]
      (. builder associateWirelessDevice data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disassociate-multicast-group)]
      (. builder disassociateMulticastGroup data))
    (when-let [data (lookup-entry config id :disassociate-wireless-device)]
      (. builder disassociateWirelessDevice data))
    (when-let [data (lookup-entry config id :firmware-update-image)]
      (. builder firmwareUpdateImage data))
    (when-let [data (lookup-entry config id :firmware-update-role)]
      (. builder firmwareUpdateRole data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fuota-task-lo-ra-wan-property-builder
  "The cfn-fuota-task-lo-ra-wan-property-builder function buildes out new instances of 
CfnFuotaTask$LoRaWANProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnFuotaTask$LoRaWANProperty$Builder.)]
    (when-let [data (lookup-entry config id :rf-region)]
      (. builder rfRegion data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-fuota-task-props-builder
  "The cfn-fuota-task-props-builder function buildes out new instances of 
CfnFuotaTaskProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateMulticastGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-multicast-group` |
| `associateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-wireless-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disassociateMulticastGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-multicast-group` |
| `disassociateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-wireless-device` |
| `firmwareUpdateImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:firmware-update-image` |
| `firmwareUpdateRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:firmware-update-role` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnFuotaTask$LoRaWANProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFuotaTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :associate-multicast-group)]
      (. builder associateMulticastGroup data))
    (when-let [data (lookup-entry config id :associate-wireless-device)]
      (. builder associateWirelessDevice data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disassociate-multicast-group)]
      (. builder disassociateMulticastGroup data))
    (when-let [data (lookup-entry config id :disassociate-wireless-device)]
      (. builder disassociateWirelessDevice data))
    (when-let [data (lookup-entry config id :firmware-update-image)]
      (. builder firmwareUpdateImage data))
    (when-let [data (lookup-entry config id :firmware-update-role)]
      (. builder firmwareUpdateRole data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-multicast-group-builder
  "The cfn-multicast-group-builder function buildes out new instances of 
CfnMulticastGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-wireless-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disassociateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-wireless-device` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnMulticastGroup$LoRaWANProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMulticastGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associate-wireless-device)]
      (. builder associateWirelessDevice data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disassociate-wireless-device)]
      (. builder disassociateWirelessDevice data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-multicast-group-lo-ra-wan-property-builder
  "The cfn-multicast-group-lo-ra-wan-property-builder function buildes out new instances of 
CfnMulticastGroup$LoRaWANProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dlClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:dl-class` |
| `numberOfDevicesInGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-devices-in-group` |
| `numberOfDevicesRequested` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-devices-requested` |
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |"
  [stack id config]
  (let [builder (CfnMulticastGroup$LoRaWANProperty$Builder.)]
    (when-let [data (lookup-entry config id :dl-class)]
      (. builder dlClass data))
    (when-let [data (lookup-entry config id :number-of-devices-in-group)]
      (. builder numberOfDevicesInGroup data))
    (when-let [data (lookup-entry config id :number-of-devices-requested)]
      (. builder numberOfDevicesRequested data))
    (when-let [data (lookup-entry config id :rf-region)]
      (. builder rfRegion data))
    (.build builder)))


(defn cfn-multicast-group-props-builder
  "The cfn-multicast-group-props-builder function buildes out new instances of 
CfnMulticastGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-wireless-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disassociateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-wireless-device` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnMulticastGroup$LoRaWANProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMulticastGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :associate-wireless-device)]
      (. builder associateWirelessDevice data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disassociate-wireless-device)]
      (. builder disassociateWirelessDevice data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-analyzer-configuration-builder
  "The cfn-network-analyzer-configuration-builder function buildes out new instances of 
CfnNetworkAnalyzerConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceContent` | java.lang.Object | [[cdk.support/lookup-entry]] | `:trace-content` |
| `wirelessDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-devices` |
| `wirelessGateways` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-gateways` |"
  [stack id config]
  (let [builder (CfnNetworkAnalyzerConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trace-content)]
      (. builder traceContent data))
    (when-let [data (lookup-entry config id :wireless-devices)]
      (. builder wirelessDevices data))
    (when-let [data (lookup-entry config id :wireless-gateways)]
      (. builder wirelessGateways data))
    (.build builder)))


(defn cfn-network-analyzer-configuration-props-builder
  "The cfn-network-analyzer-configuration-props-builder function buildes out new instances of 
CfnNetworkAnalyzerConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceContent` | java.lang.Object | [[cdk.support/lookup-entry]] | `:trace-content` |
| `wirelessDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-devices` |
| `wirelessGateways` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-gateways` |"
  [stack id config]
  (let [builder (CfnNetworkAnalyzerConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trace-content)]
      (. builder traceContent data))
    (when-let [data (lookup-entry config id :wireless-devices)]
      (. builder wirelessDevices data))
    (when-let [data (lookup-entry config id :wireless-gateways)]
      (. builder wirelessGateways data))
    (.build builder)))


(defn cfn-network-analyzer-configuration-trace-content-property-builder
  "The cfn-network-analyzer-configuration-trace-content-property-builder function buildes out new instances of 
CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `wirelessDeviceFrameInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:wireless-device-frame-info` |"
  [stack id config]
  (let [builder (CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (when-let [data (lookup-entry config id :wireless-device-frame-info)]
      (. builder wirelessDeviceFrameInfo data))
    (.build builder)))


(defn cfn-partner-account-builder
  "The cfn-partner-account-builder function buildes out new instances of 
CfnPartnerAccount$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountLinked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:account-linked` |
| `partnerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-account-id` |
| `partnerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-type` |
| `sidewalk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `sidewalkResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk-response` |
| `sidewalkUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPartnerAccount$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-linked)]
      (. builder accountLinked data))
    (when-let [data (lookup-entry config id :partner-account-id)]
      (. builder partnerAccountId data))
    (when-let [data (lookup-entry config id :partner-type)]
      (. builder partnerType data))
    (when-let [data (lookup-entry config id :sidewalk)]
      (. builder sidewalk data))
    (when-let [data (lookup-entry config id :sidewalk-response)]
      (. builder sidewalkResponse data))
    (when-let [data (lookup-entry config id :sidewalk-update)]
      (. builder sidewalkUpdate data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-partner-account-props-builder
  "The cfn-partner-account-props-builder function buildes out new instances of 
CfnPartnerAccountProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountLinked` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-linked` |
| `partnerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-account-id` |
| `partnerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-type` |
| `sidewalk` | software.amazon.awscdk.services.iotwireless.CfnPartnerAccount$SidewalkAccountInfoProperty | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `sidewalkResponse` | software.amazon.awscdk.services.iotwireless.CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty | [[cdk.support/lookup-entry]] | `:sidewalk-response` |
| `sidewalkUpdate` | software.amazon.awscdk.services.iotwireless.CfnPartnerAccount$SidewalkUpdateAccountProperty | [[cdk.support/lookup-entry]] | `:sidewalk-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPartnerAccountProps$Builder.)]
    (when-let [data (lookup-entry config id :account-linked)]
      (. builder accountLinked data))
    (when-let [data (lookup-entry config id :partner-account-id)]
      (. builder partnerAccountId data))
    (when-let [data (lookup-entry config id :partner-type)]
      (. builder partnerType data))
    (when-let [data (lookup-entry config id :sidewalk)]
      (. builder sidewalk data))
    (when-let [data (lookup-entry config id :sidewalk-response)]
      (. builder sidewalkResponse data))
    (when-let [data (lookup-entry config id :sidewalk-update)]
      (. builder sidewalkUpdate data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-partner-account-sidewalk-account-info-property-builder
  "The cfn-partner-account-sidewalk-account-info-property-builder function buildes out new instances of 
CfnPartnerAccount$SidewalkAccountInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appServerPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-server-private-key` |"
  [stack id config]
  (let [builder (CfnPartnerAccount$SidewalkAccountInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-server-private-key)]
      (. builder appServerPrivateKey data))
    (.build builder)))


(defn cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder
  "The cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder function buildes out new instances of 
CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonId` | java.lang.String | [[cdk.support/lookup-entry]] | `:amazon-id` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `fingerprint` | java.lang.String | [[cdk.support/lookup-entry]] | `:fingerprint` |"
  [stack id config]
  (let [builder (CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder.)]
    (when-let [data (lookup-entry config id :amazon-id)]
      (. builder amazonId data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :fingerprint)]
      (. builder fingerprint data))
    (.build builder)))


(defn cfn-partner-account-sidewalk-update-account-property-builder
  "The cfn-partner-account-sidewalk-update-account-property-builder function buildes out new instances of 
CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appServerPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-server-private-key` |"
  [stack id config]
  (let [builder (CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-server-private-key)]
      (. builder appServerPrivateKey data))
    (.build builder)))


(defn cfn-service-profile-builder
  "The cfn-service-profile-builder function buildes out new instances of 
CfnServiceProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnServiceProfile$LoRaWANServiceProfileProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-profile-lo-ra-wan-service-profile-property-builder
  "The cfn-service-profile-lo-ra-wan-service-profile-property-builder function buildes out new instances of 
CfnServiceProfile$LoRaWANServiceProfileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGwMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-gw-metadata` |
| `channelMask` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-mask` |
| `devStatusReqFreq` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dev-status-req-freq` |
| `dlBucketSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dl-bucket-size` |
| `dlRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dl-rate` |
| `dlRatePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:dl-rate-policy` |
| `drMax` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dr-max` |
| `drMin` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dr-min` |
| `hrAllowed` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hr-allowed` |
| `minGwDiversity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-gw-diversity` |
| `nwkGeoLoc` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:nwk-geo-loc` |
| `prAllowed` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pr-allowed` |
| `raAllowed` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ra-allowed` |
| `reportDevStatusBattery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-dev-status-battery` |
| `reportDevStatusMargin` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:report-dev-status-margin` |
| `targetPer` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-per` |
| `ulBucketSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ul-bucket-size` |
| `ulRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ul-rate` |
| `ulRatePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ul-rate-policy` |"
  [stack id config]
  (let [builder (CfnServiceProfile$LoRaWANServiceProfileProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-gw-metadata)]
      (. builder addGwMetadata data))
    (when-let [data (lookup-entry config id :channel-mask)]
      (. builder channelMask data))
    (when-let [data (lookup-entry config id :dev-status-req-freq)]
      (. builder devStatusReqFreq data))
    (when-let [data (lookup-entry config id :dl-bucket-size)]
      (. builder dlBucketSize data))
    (when-let [data (lookup-entry config id :dl-rate)]
      (. builder dlRate data))
    (when-let [data (lookup-entry config id :dl-rate-policy)]
      (. builder dlRatePolicy data))
    (when-let [data (lookup-entry config id :dr-max)]
      (. builder drMax data))
    (when-let [data (lookup-entry config id :dr-min)]
      (. builder drMin data))
    (when-let [data (lookup-entry config id :hr-allowed)]
      (. builder hrAllowed data))
    (when-let [data (lookup-entry config id :min-gw-diversity)]
      (. builder minGwDiversity data))
    (when-let [data (lookup-entry config id :nwk-geo-loc)]
      (. builder nwkGeoLoc data))
    (when-let [data (lookup-entry config id :pr-allowed)]
      (. builder prAllowed data))
    (when-let [data (lookup-entry config id :ra-allowed)]
      (. builder raAllowed data))
    (when-let [data (lookup-entry config id :report-dev-status-battery)]
      (. builder reportDevStatusBattery data))
    (when-let [data (lookup-entry config id :report-dev-status-margin)]
      (. builder reportDevStatusMargin data))
    (when-let [data (lookup-entry config id :target-per)]
      (. builder targetPer data))
    (when-let [data (lookup-entry config id :ul-bucket-size)]
      (. builder ulBucketSize data))
    (when-let [data (lookup-entry config id :ul-rate)]
      (. builder ulRate data))
    (when-let [data (lookup-entry config id :ul-rate-policy)]
      (. builder ulRatePolicy data))
    (.build builder)))


(defn cfn-service-profile-props-builder
  "The cfn-service-profile-props-builder function buildes out new instances of 
CfnServiceProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnServiceProfile$LoRaWANServiceProfileProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-task-definition-builder
  "The cfn-task-definition-builder function buildes out new instances of 
CfnTaskDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoCreateTasks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-create-tasks` |
| `loRaWanUpdateGatewayTaskEntry` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan-update-gateway-task-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-type` |
| `update` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-create-tasks)]
      (. builder autoCreateTasks data))
    (when-let [data (lookup-entry config id :lo-ra-wan-update-gateway-task-entry)]
      (. builder loRaWanUpdateGatewayTaskEntry data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition-type)]
      (. builder taskDefinitionType data))
    (when-let [data (lookup-entry config id :update)]
      (. builder update data))
    (.build builder)))


(defn cfn-task-definition-lo-ra-wan-gateway-version-property-builder
  "The cfn-task-definition-lo-ra-wan-gateway-version-property-builder function buildes out new instances of 
CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `packageVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-version` |
| `station` | java.lang.String | [[cdk.support/lookup-entry]] | `:station` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :model)]
      (. builder model data))
    (when-let [data (lookup-entry config id :package-version)]
      (. builder packageVersion data))
    (when-let [data (lookup-entry config id :station)]
      (. builder station data))
    (.build builder)))


(defn cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder
  "The cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder function buildes out new instances of 
CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:current-version` |
| `sigKeyCrc` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sig-key-crc` |
| `updateSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-signature` |
| `updateVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:update-version` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder.)]
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :sig-key-crc)]
      (. builder sigKeyCrc data))
    (when-let [data (lookup-entry config id :update-signature)]
      (. builder updateSignature data))
    (when-let [data (lookup-entry config id :update-version)]
      (. builder updateVersion data))
    (.build builder)))


(defn cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder
  "The cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder function buildes out new instances of 
CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:current-version` |
| `updateVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:update-version` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :update-version)]
      (. builder updateVersion data))
    (.build builder)))


(defn cfn-task-definition-props-builder
  "The cfn-task-definition-props-builder function buildes out new instances of 
CfnTaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoCreateTasks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-create-tasks` |
| `loRaWanUpdateGatewayTaskEntry` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan-update-gateway-task-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-type` |
| `update` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update` |"
  [stack id config]
  (let [builder (CfnTaskDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-create-tasks)]
      (. builder autoCreateTasks data))
    (when-let [data (lookup-entry config id :lo-ra-wan-update-gateway-task-entry)]
      (. builder loRaWanUpdateGatewayTaskEntry data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition-type)]
      (. builder taskDefinitionType data))
    (when-let [data (lookup-entry config id :update)]
      (. builder update data))
    (.build builder)))


(defn cfn-task-definition-update-wireless-gateway-task-create-property-builder
  "The cfn-task-definition-update-wireless-gateway-task-create-property-builder function buildes out new instances of 
CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `updateDataRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-data-role` |
| `updateDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-data-source` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder.)]
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :update-data-role)]
      (. builder updateDataRole data))
    (when-let [data (lookup-entry config id :update-data-source)]
      (. builder updateDataSource data))
    (.build builder)))


(defn cfn-wireless-device-abp-v10x-property-builder
  "The cfn-wireless-device-abp-v10x-property-builder function buildes out new instances of 
CfnWirelessDevice$AbpV10xProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devAddr` | java.lang.String | [[cdk.support/lookup-entry]] | `:dev-addr` |
| `sessionKeys` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$SessionKeysAbpV10xProperty | [[cdk.support/lookup-entry]] | `:session-keys` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$AbpV10xProperty$Builder.)]
    (when-let [data (lookup-entry config id :dev-addr)]
      (. builder devAddr data))
    (when-let [data (lookup-entry config id :session-keys)]
      (. builder sessionKeys data))
    (.build builder)))


(defn cfn-wireless-device-abp-v11-property-builder
  "The cfn-wireless-device-abp-v11-property-builder function buildes out new instances of 
CfnWirelessDevice$AbpV11Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devAddr` | java.lang.String | [[cdk.support/lookup-entry]] | `:dev-addr` |
| `sessionKeys` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$SessionKeysAbpV11Property | [[cdk.support/lookup-entry]] | `:session-keys` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$AbpV11Property$Builder.)]
    (when-let [data (lookup-entry config id :dev-addr)]
      (. builder devAddr data))
    (when-let [data (lookup-entry config id :session-keys)]
      (. builder sessionKeys data))
    (.build builder)))


(defn cfn-wireless-device-builder
  "The cfn-wireless-device-builder function buildes out new instances of 
CfnWirelessDevice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `lastUplinkReceivedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-uplink-received-at` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$LoRaWANDeviceProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `positioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:positioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :last-uplink-received-at)]
      (. builder lastUplinkReceivedAt data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :positioning)]
      (. builder positioning data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-wireless-device-import-task-builder
  "The cfn-wireless-device-import-task-builder function buildes out new instances of 
CfnWirelessDeviceImportTask$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `sidewalk` | software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask$SidewalkProperty | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWirelessDeviceImportTask$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :sidewalk)]
      (. builder sidewalk data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-wireless-device-import-task-props-builder
  "The cfn-wireless-device-import-task-props-builder function buildes out new instances of 
CfnWirelessDeviceImportTaskProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `sidewalk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWirelessDeviceImportTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :sidewalk)]
      (. builder sidewalk data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-wireless-device-import-task-sidewalk-property-builder
  "The cfn-wireless-device-import-task-sidewalk-property-builder function buildes out new instances of 
CfnWirelessDeviceImportTask$SidewalkProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceCreationFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-creation-file` |
| `deviceCreationFileList` | java.util.List | [[cdk.support/lookup-entry]] | `:device-creation-file-list` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `sidewalkManufacturingSn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sidewalk-manufacturing-sn` |"
  [stack id config]
  (let [builder (CfnWirelessDeviceImportTask$SidewalkProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-creation-file)]
      (. builder deviceCreationFile data))
    (when-let [data (lookup-entry config id :device-creation-file-list)]
      (. builder deviceCreationFileList data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :sidewalk-manufacturing-sn)]
      (. builder sidewalkManufacturingSn data))
    (.build builder)))


(defn cfn-wireless-device-lo-ra-wan-device-property-builder
  "The cfn-wireless-device-lo-ra-wan-device-property-builder function buildes out new instances of 
CfnWirelessDevice$LoRaWANDeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abpV10X` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abp-v10-x` |
| `abpV11` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abp-v11` |
| `devEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:dev-eui` |
| `deviceProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-profile-id` |
| `otaaV10X` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$OtaaV10xProperty | [[cdk.support/lookup-entry]] | `:otaa-v10-x` |
| `otaaV11` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:otaa-v11` |
| `serviceProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-profile-id` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$LoRaWANDeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :abp-v10-x)]
      (. builder abpV10X data))
    (when-let [data (lookup-entry config id :abp-v11)]
      (. builder abpV11 data))
    (when-let [data (lookup-entry config id :dev-eui)]
      (. builder devEui data))
    (when-let [data (lookup-entry config id :device-profile-id)]
      (. builder deviceProfileId data))
    (when-let [data (lookup-entry config id :otaa-v10-x)]
      (. builder otaaV10X data))
    (when-let [data (lookup-entry config id :otaa-v11)]
      (. builder otaaV11 data))
    (when-let [data (lookup-entry config id :service-profile-id)]
      (. builder serviceProfileId data))
    (.build builder)))


(defn cfn-wireless-device-otaa-v10x-property-builder
  "The cfn-wireless-device-otaa-v10x-property-builder function buildes out new instances of 
CfnWirelessDevice$OtaaV10xProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-eui` |
| `appKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-key` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$OtaaV10xProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-eui)]
      (. builder appEui data))
    (when-let [data (lookup-entry config id :app-key)]
      (. builder appKey data))
    (.build builder)))


(defn cfn-wireless-device-otaa-v11-property-builder
  "The cfn-wireless-device-otaa-v11-property-builder function buildes out new instances of 
CfnWirelessDevice$OtaaV11Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-key` |
| `joinEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:join-eui` |
| `nwkKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:nwk-key` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$OtaaV11Property$Builder.)]
    (when-let [data (lookup-entry config id :app-key)]
      (. builder appKey data))
    (when-let [data (lookup-entry config id :join-eui)]
      (. builder joinEui data))
    (when-let [data (lookup-entry config id :nwk-key)]
      (. builder nwkKey data))
    (.build builder)))


(defn cfn-wireless-device-props-builder
  "The cfn-wireless-device-props-builder function buildes out new instances of 
CfnWirelessDeviceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `lastUplinkReceivedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-uplink-received-at` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$LoRaWANDeviceProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `positioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:positioning` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnWirelessDeviceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-name)]
      (. builder destinationName data))
    (when-let [data (lookup-entry config id :last-uplink-received-at)]
      (. builder lastUplinkReceivedAt data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :positioning)]
      (. builder positioning data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-wireless-device-session-keys-abp-v10x-property-builder
  "The cfn-wireless-device-session-keys-abp-v10x-property-builder function buildes out new instances of 
CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-s-key` |
| `nwkSKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:nwk-s-key` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-s-key)]
      (. builder appSKey data))
    (when-let [data (lookup-entry config id :nwk-s-key)]
      (. builder nwkSKey data))
    (.build builder)))


(defn cfn-wireless-device-session-keys-abp-v11-property-builder
  "The cfn-wireless-device-session-keys-abp-v11-property-builder function buildes out new instances of 
CfnWirelessDevice$SessionKeysAbpV11Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-s-key` |
| `fNwkSIntKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:f-nwk-s-int-key` |
| `nwkSEncKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:nwk-s-enc-key` |
| `sNwkSIntKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s-nwk-s-int-key` |"
  [stack id config]
  (let [builder (CfnWirelessDevice$SessionKeysAbpV11Property$Builder.)]
    (when-let [data (lookup-entry config id :app-s-key)]
      (. builder appSKey data))
    (when-let [data (lookup-entry config id :f-nwk-s-int-key)]
      (. builder fNwkSIntKey data))
    (when-let [data (lookup-entry config id :nwk-s-enc-key)]
      (. builder nwkSEncKey data))
    (when-let [data (lookup-entry config id :s-nwk-s-int-key)]
      (. builder sNwkSIntKey data))
    (.build builder)))


(defn cfn-wireless-gateway-builder
  "The cfn-wireless-gateway-builder function buildes out new instances of 
CfnWirelessGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lastUplinkReceivedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-uplink-received-at` |
| `loRaWan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnWirelessGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :last-uplink-received-at)]
      (. builder lastUplinkReceivedAt data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-wireless-gateway-lo-ra-wan-gateway-property-builder
  "The cfn-wireless-gateway-lo-ra-wan-gateway-property-builder function buildes out new instances of 
CfnWirelessGateway$LoRaWANGatewayProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-eui` |
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |"
  [stack id config]
  (let [builder (CfnWirelessGateway$LoRaWANGatewayProperty$Builder.)]
    (when-let [data (lookup-entry config id :gateway-eui)]
      (. builder gatewayEui data))
    (when-let [data (lookup-entry config id :rf-region)]
      (. builder rfRegion data))
    (.build builder)))


(defn cfn-wireless-gateway-props-builder
  "The cfn-wireless-gateway-props-builder function buildes out new instances of 
CfnWirelessGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lastUplinkReceivedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-uplink-received-at` |
| `loRaWan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnWirelessGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :last-uplink-received-at)]
      (. builder lastUplinkReceivedAt data))
    (when-let [data (lookup-entry config id :lo-ra-wan)]
      (. builder loRaWan data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))